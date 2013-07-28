package com.luo.dao.base;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.luo.dao.Page;

/** 继承了SqlMapClientDaoSupport，但是要注入sqlMapClient，否则需要在每个子类dao中注入sqlMapClient
 *  子类要通过setter方法注入baseDao,无需继承baseDao
 * @author Administrator
 *
 */
public class BaseDao extends SqlMapClientDaoSupport{
	
	public Long getPrimary(){
     	return  (Long)this.queryForObject("base.getPrimary", null);
	}
	
	public int queryForInt(String statementName, Object parameterObject){
     	return  ((Integer)this.queryForObject(statementName, parameterObject)).intValue();
    }
	
	@SuppressWarnings("unchecked")
	public Object queryForObject(String statementName, Object parameterObject) {
		return getSqlMapClientTemplate().queryForObject(statementName, parameterObject);
	}

	public void saveObject(String statementName, Object parameterObject) {
		getSqlMapClientTemplate().insert(statementName, parameterObject);
	}
	
	public List queryForList(String statementName){
   	 	return getSqlMapClientTemplate().queryForList(statementName);
    }
	public List queryForList(String statementName, Object parameterObject){
   	 	return getSqlMapClientTemplate().queryForList(statementName,parameterObject);
    }
	
	public int delete(String statementName, Object parameterObject) {
		return getSqlMapClientTemplate().delete(statementName,parameterObject);
	}
	public int udpate(String statementName, Object parameterObject) {
		return getSqlMapClientTemplate().update(statementName,parameterObject);
	}

	public QueryResult queryList(String statementName, Object model, Page page) {
		Map map=new HashMap();
		map.put("page",page);
		map.put("model", model);
		List list=queryForList(statementName, map);
		int count=queryForInt(statementName + "_count", map);
		QueryResult result=new QueryResult();
		result.setCount(count);
		result.setList(list);
		return result ;
	}
}
