/*******************************************************************************
 * 	Copyright 2016 ContainX and OpenStack4j                                          
 * 	                                                                                 
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not      
 * 	use this file except in compliance with the License. You may obtain a copy of    
 * 	the License at                                                                   
 * 	                                                                                 
 * 	    http://www.apache.org/licenses/LICENSE-2.0                                   
 * 	                                                                                 
 * 	Unless required by applicable law or agreed to in writing, software              
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT        
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the         
 * 	License for the specific language governing permissions and limitations under    
 * 	the License.                                                                     
 *******************************************************************************/
package com.huawei.openstack4j.model.gbp.builder;

import com.huawei.openstack4j.common.Buildable.Builder;
import com.huawei.openstack4j.model.gbp.PolicyTarget;
/**
 * A builder which produces a Policy Target object
 * 
 * @author vinod borole
 */
public interface PolicyTargetBuilder extends Builder<PolicyTargetBuilder, PolicyTarget> {
    PolicyTargetBuilder name(String name);
    PolicyTargetBuilder portId(String portId);
    PolicyTargetBuilder policyTargetGroupId(String policyTargetGroupId);
    PolicyTargetBuilder clusterId(String clusterId);
    PolicyTargetBuilder description(String description);
}
 