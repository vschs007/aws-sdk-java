/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devicefarm.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devicefarm.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RemoteAccessSessionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RemoteAccessSessionMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<java.util.Date> CREATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("created").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> RESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("result").build();
    private static final MarshallingInfo<String> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("message").build();
    private static final MarshallingInfo<java.util.Date> STARTED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("started").build();
    private static final MarshallingInfo<java.util.Date> STOPPED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stopped").build();
    private static final MarshallingInfo<StructuredPojo> DEVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("device").build();
    private static final MarshallingInfo<String> BILLINGMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("billingMethod").build();
    private static final MarshallingInfo<StructuredPojo> DEVICEMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deviceMinutes").build();
    private static final MarshallingInfo<String> ENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("endpoint").build();

    private static final RemoteAccessSessionMarshaller instance = new RemoteAccessSessionMarshaller();

    public static RemoteAccessSessionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RemoteAccessSession remoteAccessSession, ProtocolMarshaller protocolMarshaller) {

        if (remoteAccessSession == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(remoteAccessSession.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getName(), NAME_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getCreated(), CREATED_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getResult(), RESULT_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getMessage(), MESSAGE_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getStarted(), STARTED_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getStopped(), STOPPED_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getDevice(), DEVICE_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getBillingMethod(), BILLINGMETHOD_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getDeviceMinutes(), DEVICEMINUTES_BINDING);
            protocolMarshaller.marshall(remoteAccessSession.getEndpoint(), ENDPOINT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
