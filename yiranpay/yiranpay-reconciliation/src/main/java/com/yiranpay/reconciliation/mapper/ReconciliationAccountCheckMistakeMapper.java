package com.yiranpay.reconciliation.mapper;

import java.util.List;

import com.yiranpay.reconciliation.domain.ReconciliationAccountCheckMistake;	

/**
 * 对账差错 数据层
 * 
 * @author yiran
 * @date 2019-09-20
 */
public interface ReconciliationAccountCheckMistakeMapper 
{
	/**
     * 查询对账差错信息
     * 
     * @param id 对账差错ID
     * @return 对账差错信息
     */
	public ReconciliationAccountCheckMistake selectReconciliationAccountCheckMistakeById(Integer id);
	
	/**
     * 查询对账差错列表
     * 
     * @param reconciliationAccountCheckMistake 对账差错信息
     * @return 对账差错集合
     */
	public List<ReconciliationAccountCheckMistake> selectReconciliationAccountCheckMistakeList(ReconciliationAccountCheckMistake reconciliationAccountCheckMistake);
	
	/**
     * 新增对账差错
     * 
     * @param reconciliationAccountCheckMistake 对账差错信息
     * @return 结果
     */
	public int insertReconciliationAccountCheckMistake(ReconciliationAccountCheckMistake reconciliationAccountCheckMistake);
	
	/**
     * 修改对账差错
     * 
     * @param reconciliationAccountCheckMistake 对账差错信息
     * @return 结果
     */
	public int updateReconciliationAccountCheckMistake(ReconciliationAccountCheckMistake reconciliationAccountCheckMistake);
	
	/**
     * 删除对账差错
     * 
     * @param id 对账差错ID
     * @return 结果
     */
	public int deleteReconciliationAccountCheckMistakeById(Integer id);
	
	/**
     * 批量删除对账差错
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteReconciliationAccountCheckMistakeByIds(String[] ids);
	
}