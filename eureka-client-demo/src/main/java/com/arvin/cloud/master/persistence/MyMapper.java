package com.arvin.cloud.master.persistence;

import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.rowbounds.SelectByExampleRowBoundsMapper;
import tk.mybatis.mapper.common.rowbounds.SelectRowBoundsMapper;

import java.util.List;
import java.util.Map;

/**
 * @Author: arvin
 * @Date: 2019/3/26
 * @Version 1.0
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T>, SelectRowBoundsMapper<T>,
        SelectByExampleRowBoundsMapper<T>, ConditionMapper<T> {

	public List<Map<String, Object>> selectBySQL1(String sql);

	public List<Map<String, Object>> selectBySQL(String sql);

	public List<Map<String, Object>> selectTableInfo(String tableName);

}
