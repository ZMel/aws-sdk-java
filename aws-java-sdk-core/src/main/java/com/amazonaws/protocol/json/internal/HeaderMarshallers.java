/*
 * Copyright 2011-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.protocol.json.internal;

import com.amazonaws.annotation.SdkInternalApi;

import java.util.Date;

@SdkInternalApi
public class HeaderMarshallers {

    public static final JsonMarshaller<String> STRING = new SimpleHeaderMarshaller<String>(
            ValueToStringConverters.FROM_STRING);

    public static final JsonMarshaller<Integer> INTEGER = new SimpleHeaderMarshaller<Integer>(
            ValueToStringConverters.FROM_INTEGER);

    public static final JsonMarshaller<Long> LONG = new SimpleHeaderMarshaller<Long>(ValueToStringConverters.FROM_LONG);

    public static final JsonMarshaller<Double> DOUBLE = new SimpleHeaderMarshaller<Double>(
            ValueToStringConverters.FROM_DOUBLE);

    public static final JsonMarshaller<Float> FLOAT = new SimpleHeaderMarshaller<Float>(ValueToStringConverters.FROM_FLOAT);

    public static final JsonMarshaller<Boolean> BOOLEAN = new SimpleHeaderMarshaller<Boolean>(
            ValueToStringConverters.FROM_BOOLEAN);

    public static final JsonMarshaller<Date> DATE = new SimpleHeaderMarshaller<Date>(ValueToStringConverters.FROM_DATE);

    private static class SimpleHeaderMarshaller<T> implements JsonMarshaller<T> {

        private final ValueToStringConverters.ValueToString<T> converter;

        private SimpleHeaderMarshaller(ValueToStringConverters.ValueToString<T> converter) {
            this.converter = converter;
        }

        @Override
        public void marshall(T val, JsonMarshallerContext context, String paramName) {
            context.request().addHeader(paramName, converter.convert(val));
        }
    }

}
