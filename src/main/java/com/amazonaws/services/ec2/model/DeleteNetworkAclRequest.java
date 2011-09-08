/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#deleteNetworkAcl(DeleteNetworkAclRequest) DeleteNetworkAcl operation}.
 * <p>
 * Deletes a network ACL from a VPC. The ACL must not have any subnets
 * associated with it. You can't delete the default network ACL. For more
 * information about network ACLs, go to Network ACLs in the Amazon
 * Virtual Private Cloud User Guide.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#deleteNetworkAcl(DeleteNetworkAclRequest)
 */
public class DeleteNetworkAclRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the network ACL to be deleted.
     */
    private String networkAclId;

    /**
     * The ID of the network ACL to be deleted.
     *
     * @return The ID of the network ACL to be deleted.
     */
    public String getNetworkAclId() {
        return networkAclId;
    }
    
    /**
     * The ID of the network ACL to be deleted.
     *
     * @param networkAclId The ID of the network ACL to be deleted.
     */
    public void setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
    }
    
    /**
     * The ID of the network ACL to be deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkAclId The ID of the network ACL to be deleted.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteNetworkAclRequest withNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("NetworkAclId: " + networkAclId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    