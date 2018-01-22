package com.tdq.tasks;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tdq.tasks.model.TasksService;
import com.tdq.tasks.model.TasksServiceMockupImpl;

@Configuration
class TasksConfiguration {

    @Bean
    TasksService taskService() {
        return new TasksServiceMockupImpl();
    }
}


