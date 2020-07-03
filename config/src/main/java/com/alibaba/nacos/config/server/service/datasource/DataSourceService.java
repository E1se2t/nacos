/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.nacos.config.server.service.datasource;

import java.io.IOException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * datasource interface
 *
 * @author Nacos
 */
public interface DataSourceService {
    
    /**
     * Initialize the relevant resource information
     *
     * @throws Exception
     */
    void init() throws Exception;
    
    /**
     * reload
     *
     * @throws IOException exception
     */
    void reload() throws IOException;
    
    /**
     * check master db
     *
     * @return is master
     */
    boolean checkMasterWritable();
    
    /**
     * get jdbc template
     *
     * @return JdbcTemplate
     */
    JdbcTemplate getJdbcTemplate();
    
    /**
     * get transaction template
     *
     * @return TransactionTemplate
     */
    TransactionTemplate getTransactionTemplate();
    
    /**
     * get current db url
     *
     * @return
     */
    String getCurrentDBUrl();
    
    /**
     * get heath
     *
     * @return heath info
     */
    String getHealth();
    
}