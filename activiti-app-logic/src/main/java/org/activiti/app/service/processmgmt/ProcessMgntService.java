package org.activiti.app.service.processmgmt;

import org.activiti.app.model.common.ResultListDataRepresentation;
import org.activiti.app.model.processmgmt.ActReProcdef;

import java.util.List;

/**
 * @author nana
 * @date 2019/4/26 12:03
 */
public interface ProcessMgntService {
    /**
     * 获取流程信息列表
     * @return 流程分页信息列表
     */
    ResultListDataRepresentation getProcessList();
}
