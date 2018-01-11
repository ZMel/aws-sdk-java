/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeEndpointResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEndpointResultJsonUnmarshaller implements Unmarshaller<DescribeEndpointResult, JsonUnmarshallerContext> {

    public DescribeEndpointResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeEndpointResult describeEndpointResult = new DescribeEndpointResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeEndpointResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("EndpointName", targetDepth)) {
                    context.nextToken();
                    describeEndpointResult.setEndpointName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointArn", targetDepth)) {
                    context.nextToken();
                    describeEndpointResult.setEndpointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointConfigName", targetDepth)) {
                    context.nextToken();
                    describeEndpointResult.setEndpointConfigName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProductionVariants", targetDepth)) {
                    context.nextToken();
                    describeEndpointResult.setProductionVariants(new ListUnmarshaller<ProductionVariantSummary>(ProductionVariantSummaryJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("EndpointStatus", targetDepth)) {
                    context.nextToken();
                    describeEndpointResult.setEndpointStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    describeEndpointResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeEndpointResult.setCreationTime(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describeEndpointResult.setLastModifiedTime(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeEndpointResult;
    }

    private static DescribeEndpointResultJsonUnmarshaller instance;

    public static DescribeEndpointResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeEndpointResultJsonUnmarshaller();
        return instance;
    }
}