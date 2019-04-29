package org.activiti.app.dao.processmgmt;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.github.pagehelper.Page;
import org.activiti.app.model.processmgmt.ActReProcdef;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * activiti-已部署的流程定义(ActReProcdef)表数据库访问层
 *
 * @author nana
 * @since 2019-04-26 19:16:15
 */
public interface ActReProcdefMapper extends BaseMapper<ActReProcdef> {

    /**
     * 通过ID查询单条数据
     *
     * @param id_ 主键
     * @return 实例对象
     */
    ActReProcdef queryById(String id_);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ActReProcdef> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param actReProcdef 实例对象
     * @return 对象列表
     */
    List<ActReProcdef> queryAll(ActReProcdef actReProcdef);

    /**
     * 分页条件查询
     *
     * @param actReProcdef 实例对象
     * @return 查询结果
     */
    Page<ActReProcdef> selectByConditionPage(ActReProcdef actReProcdef);

    /**
     * column in查询
     *
     * @param paramList 参数列表
     * @param inColumn  in 作用列
     * @return 对象列表
     */
    List<ActReProcdef> selectColumnIn(@Param("paramList") List<String> paramList, @Param("inColumn") String inColumn);

//    /**
//     * 新增数据
//     *
//     * @param actReProcdef 实例对象
//     * @return 影响行数
//     */
//    int insert(ActReProcdef actReProcdef);

    /**
     * 批量新增数据
     *
     * @param actReProcdefList 实例对象
     * @return 影响行数
     */
    int insertBatch(@Param("actReProcdefList") List<ActReProcdef> actReProcdefList);

    /**
     * 修改数据
     *
     * @param actReProcdef 实例对象
     * @return 影响行数
     */
    int update(ActReProcdef actReProcdef);

    /**
     * 批量修改数据
     *
     * @param idList       主键列表
     * @param actReProcdef 实例对象
     * @return 影响行数
     */
    int updateBatch(@Param("idList") List<String> idList, @Param("actReProcdef") ActReProcdef actReProcdef);

    /**
     * 通过主键删除数据
     *
     * @param id_ 主键
     * @return 影响行数
     */
    int deleteById(String id_);

    /**
     * 通过主键批量删除数据
     *
     * @param id_List 主键列表
     * @return 影响行数
     */
    int deleteByIdBatch(@Param("id_List") List<String> id_List);

}