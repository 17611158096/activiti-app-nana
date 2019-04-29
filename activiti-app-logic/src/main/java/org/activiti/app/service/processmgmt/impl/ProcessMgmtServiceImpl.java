package org.activiti.app.service.processmgmt.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import org.activiti.app.dao.processmgmt.ActReProcdefMapper;
import org.activiti.app.model.common.ResultListDataRepresentation;
import org.activiti.app.model.processmgmt.ActReProcdef;
import org.activiti.app.service.processmgmt.ProcessMgntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author nana
 * @date 2019/4/26 12:03
 */
@Service
public class ProcessMgmtServiceImpl implements ProcessMgntService {
    @Autowired
    private ActReProcdefMapper procdefMapper;

    /**
     * 获取流程信息列表
     *
     * @return 流程信息列表
     */
    @Override
    public ResultListDataRepresentation getProcessList() {
        EntityWrapper<ActReProcdef> wrapper = new EntityWrapper<>();
        wrapper.orderBy("id_", false);
        Page<ActReProcdef> page = new Page<>(1, 2);
        List<ActReProcdef> resultList=procdefMapper.selectPage(page, wrapper);
        ResultListDataRepresentation result=ResultListDataRepresentation.TransformPageList(resultList, page);
        return result;
    }
}
