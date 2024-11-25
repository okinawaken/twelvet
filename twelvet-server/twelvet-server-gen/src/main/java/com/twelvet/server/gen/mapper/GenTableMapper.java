package com.twelvet.server.gen.mapper;

import com.twelvet.api.gen.domain.GenTable;
import com.twelvet.api.gen.domain.GenTableColumn;

import java.util.List;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 代码生成业务表 数据层
 */
public interface GenTableMapper {

	/**
	 * 查询业务列表
	 * @param genTable 业务信息
	 * @return 业务集合
	 */
	List<GenTable> selectGenTableList(GenTable genTable);

	/**
	 * 查询所有表信息
	 * @return 表信息集合
	 */
	List<GenTable> selectGenTableAll();

	/**
	 * 查询表ID业务信息
	 * @param id 业务ID
	 * @return 业务信息
	 */
	GenTable selectGenTableById(Long id);

	/**
	 * 查询表名称业务信息
	 * @param tableName 表名称
	 * @return 业务信息
	 */
	GenTable selectGenTableByName(String tableName);

	/**
	 * 新增业务
	 * @param genTable 业务信息
	 * @return 结果
	 */
	int insertGenTable(GenTable genTable);

	/**
	 * 修改业务
	 * @param genTable 业务信息
	 * @return 结果
	 */
	int updateGenTable(GenTable genTable);

	/**
	 * 批量删除业务
	 * @param ids 需要删除的数据ID
	 * @return 结果
	 */
	int deleteGenTableByIds(Long[] ids);

}
