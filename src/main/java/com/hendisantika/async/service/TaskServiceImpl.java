package com.hendisantika.async.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hendisantika on 5/11/17.
 */
public class TaskServiceImpl implements TaskService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String execute() {
        try {
            Thread.sleep(5000);
            logger.info("Slow task executed");
            return "Task finished";
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }
}
