package com.twelvet.server.system.service;

import com.twelvet.api.system.domain.SysDept;
import com.twelvet.api.system.domain.vo.TreeSelect;

import java.util.List;
import java.util.Set;

/**
 * @author twelvet
 * @WebSite twelvet.cn
 * @Description: 部门管理 服务层
 */
public interface ISysDeptService {

	/**
	 * 查询部门管理数据
	 * @param dept 部门信息
	 * @return 部门信息集合
	 */
	List<SysDept> selectDeptList(SysDept dept);

	/**
	 * 构建前端所需要树结构
	 * @param depts 部门列表
	 * @return 树结构列表
	 */
	List<SysDept> buildDeptTree(List<SysDept> depts);

	/**
	 * 构建前端所需要下拉树结构
	 * @param depts 部门列表
	 * @return 下拉树结构列表
	 */
	List<TreeSelect> buildDeptTreeSelect(List<SysDept> depts);

	/**
	 * 根据角色ID查询部门树信息
	 * @param roleId 角色ID
	 * @return 选中部门列表
	 */
	List<Integer> selectDeptListByRoleId(Long roleId);

	/**
	 * 根据部门ID查询信息
	 * @param deptId 部门ID
	 * @return 部门信息
	 */
	SysDept selectDeptById(Long deptId);

	/**
	 * 根据ID查询所有子部门（正常状态）
	 * @param deptId 部门ID
	 * @return 子部门数
	 */
	int selectNormalChildrenDeptById(Long deptId);

	/**
	 * 是否存在部门子节点
	 * @param deptId 部门ID
	 * @return 结果
	 */
	boolean hasChildByDeptId(Long deptId);

	/**
	 * 查询部门是否存在用户
	 * @param deptId 部门ID
	 * @return 结果 true 存在 false 不存在
	 */
	boolean checkDeptExistUser(Long deptId);

	/**
	 * 校验部门名称是否唯一
	 * @param dept 部门信息
	 * @return 结果
	 */
	String checkDeptNameUnique(SysDept dept);

	/**
	 * 校验部门是否有数据权限
	 * @param deptId 部门id
	 */
	void checkDeptDataScope(Long deptId);

	/**
	 * 新增保存部门信息
	 * @param dept 部门信息
	 * @return 结果
	 */
	int insertDept(SysDept dept);

	/**
	 * 修改保存部门信息
	 * @param dept 部门信息
	 * @return 结果
	 */
	int updateDept(SysDept dept);

	/**
	 * 删除部门管理信息
	 * @param deptId 部门ID
	 * @return 结果
	 */
	int deleteDeptById(Long deptId);

	/**
	 * 获取当前用户持有的权限列表
	 * @param sysDept SysDept
	 * @return Set<Long>
	 */
	Set<Long> selectDeptIdListByUser(SysDept sysDept);

}
