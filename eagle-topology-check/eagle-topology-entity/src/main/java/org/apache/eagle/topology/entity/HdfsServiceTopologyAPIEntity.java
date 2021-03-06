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
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.apache.eagle.topology.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.apache.eagle.log.entity.meta.*;
import org.apache.eagle.topology.TopologyConstants;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Table("hadoop_topology")
@ColumnFamily("f")
@Prefix("hdfsservicestatus")
@Service(TopologyConstants.HDFS_INSTANCE_SERVICE_NAME)
@TimeSeries(false)
@Tags( {TopologyConstants.SITE_TAG, TopologyConstants.HOSTNAME_TAG, TopologyConstants.RACK_TAG, TopologyConstants.ROLE_TAG})
public class HdfsServiceTopologyAPIEntity extends TopologyBaseAPIEntity {
    @Column("a")
    private String status;
    @Column("b")
    private String configuredCapacityTB;
    @Column("c")
    private String usedCapacityTB;
    @Column("d")
    private String numBlocks;
    @Column("e")
    private String numFailedVolumes;
    @Column("f")
    private long writtenTxidDiff;
    @Column("g")
    private long lastUpdateTime;
    @Column("h")
    private String version;

    public long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        valueChanged("lastUpdateTime");
    }

    public String getNumFailedVolumes() {
        return numFailedVolumes;
    }

    public void setNumFailedVolumes(String numFailedVolumes) {
        this.numFailedVolumes = numFailedVolumes;
        valueChanged("numFailedVolumes");
    }

    public String getNumBlocks() {
        return numBlocks;
    }

    public void setNumBlocks(String numBlocks) {
        this.numBlocks = numBlocks;
        valueChanged("numBlocks");
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        valueChanged("status");
    }

    public String getConfiguredCapacityTB() {
        return configuredCapacityTB;
    }

    public void setConfiguredCapacityTB(String configuredCapacityTB) {
        this.configuredCapacityTB = configuredCapacityTB;
        valueChanged("configuredCapacityTB");
    }

    public String getUsedCapacityTB() {
        return usedCapacityTB;
    }

    public void setUsedCapacityTB(String usedCapacityTB) {
        this.usedCapacityTB = usedCapacityTB;
        valueChanged("usedCapacityTB");
    }

    public long getWrittenTxidDiff() {
        return writtenTxidDiff;
    }

    public void setWrittenTxidDiff(long writtenTxidDiff) {
        this.writtenTxidDiff = writtenTxidDiff;
        valueChanged("writtenTxidDiff");
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
        valueChanged("version");
    }


}

