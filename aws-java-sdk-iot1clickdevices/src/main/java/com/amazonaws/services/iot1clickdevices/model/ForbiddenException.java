/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.iot1clickdevices.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ForbiddenException extends com.amazonaws.services.iot1clickdevices.model.AWSIoT1ClickDevicesException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * 403
     * </p>
     */
    private String code;

    /**
     * Constructs a new ForbiddenException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ForbiddenException(String message) {
        super(message);
    }

    /**
     * <p>
     * 403
     * </p>
     * 
     * @param code
     *        403
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * 403
     * </p>
     * 
     * @return 403
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * 403
     * </p>
     * 
     * @param code
     *        403
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ForbiddenException withCode(String code) {
        setCode(code);
        return this;
    }

}
