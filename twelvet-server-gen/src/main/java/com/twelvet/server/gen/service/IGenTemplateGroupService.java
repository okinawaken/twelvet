package com.twelvet.server.gen.service;

import java.util.List;

import com.twelvet.api.gen.domain.GenTemplateGroup;
import com.twelvet.api.gen.domain.vo.GenGroupVO;

/**
 * 模板分组关联Service接口
 *
 * @author TwelveT
 * @WebSite twelvet.cn
 */
public interface IGenTemplateGroupService {

	/**
	 * 查询模板分组关联
	 * @param groupId 模板分组关联主键
	 * @return 模板分组关联
	 */
	public GenTemplateGroup selectGenTemplateGroupByGroupId(Long groupId);

	/**
	 * 新增模板分组关联
	 * @param genTemplateGroup 模板分组关联
	 * @return 结果
	 */
	public int insertGenTemplateGroup(GenTemplateGroup genTemplateGroup);

	/**
	 * 修改模板分组关联
	 * @param genTemplateGroup 模板分组关联
	 * @return 结果
	 */
	public int updateGenTemplateGroup(GenTemplateGroup genTemplateGroup);

	/**
	 * 批量删除模板分组关联
	 * @param groupIds 需要删除的模板分组关联主键集合
	 * @return 结果
	 */
	public int deleteGenTemplateGroupByGroupIds(Long[] groupIds);

	/**
	 * 删除模板分组关联信息
	 * @param groupId 模板分组关联主键
	 * @return 结果
	 */
	public int deleteGenTemplateGroupByGroupId(Long groupId);

}
