package com.example.modulea.rest;

import com.example.common.bean.CommonMessage;
import com.example.common.context.ContextData;
import com.example.modulea.service.ModuleAService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/modulea")
public class ModuleAResource {

    private final ContextData contextData;
    private final ModuleAService moduleAService;

    public ModuleAResource(final ContextData contextData, final ModuleAService moduleAService) {
        this.contextData = contextData;
        this.moduleAService = moduleAService;
    }

    @GetMapping
    public CommonMessage getExample(){
        log.info("Inside ModuleAResource. userName={}", contextData.getUserName());
        return moduleAService.makeWebRequest();
    }
}
