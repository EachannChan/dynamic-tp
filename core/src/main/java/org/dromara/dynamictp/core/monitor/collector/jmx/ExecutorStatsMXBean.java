/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dromara.dynamictp.core.monitor.collector.jmx;

import org.dromara.dynamictp.common.entity.ExecutorStats;

import javax.management.MXBean;

/**
 * ExecutorStatsMXBean related
 *
 * @author <a href = "mailto:kamtohung@gmail.com">KamTo Hung</a>
 */
@MXBean
public interface ExecutorStatsMXBean {

    /**
     * get executor stats
     *
     * @return thread pool stats
     */
    ExecutorStats getExecutorStats();

    /**
     * set executor stats
     *
     * @param executorStats thread pool stats
     */
    void setExecutorStats(ExecutorStats executorStats);

}