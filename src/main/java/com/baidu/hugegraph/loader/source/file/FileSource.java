/*
 * Copyright 2017 HugeGraph Authors
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.baidu.hugegraph.loader.source.file;

import java.util.List;

import com.baidu.hugegraph.loader.source.InputSource;
import com.baidu.hugegraph.loader.source.SourceType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FileSource implements InputSource {

    private static final String DEFAULT_CHARSET = "UTF-8";

    @JsonProperty("path")
    private String path;
    @JsonProperty("format")
    private FileFormat format;
    @JsonProperty("header")
    private List<String> header;
    @JsonProperty("delimiter")
    private String delimiter;
    @JsonProperty("charset")
    private String charset = DEFAULT_CHARSET;

    public FileSource() {
    }

    @Override
    public SourceType type() {
        return SourceType.FILE;
    }

    public String path() {
        return this.path;
    }

    public FileFormat format() {
        return this.format;
    }

    public List<String> header() {
        return this.header;
    }

    public String delimiter() {
        return this.delimiter;
    }

    public String charset() {
        return this.charset;
    }
}
