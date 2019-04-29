package org.activiti.app.rest.processmgmt;

import org.activiti.app.model.common.ResultListDataRepresentation;
import org.activiti.app.service.processmgmt.ProcessMgntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nana
 * @date 2019/4/25 16:25
 */
@RestController
public class ProcessMgmtResource {
    @Autowired
    private ProcessMgntService processMgntService;
    @RequestMapping(value="/rest/processmgmt/process",method=RequestMethod.GET)
    public ResultListDataRepresentation getProcess(){
       return processMgntService.getProcessList();
    }

}
