/*******************************************************************************
 * 	Copyright 2017 HuaWei Tld                                     
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
package com.huawei.openstack4j.openstack.loadbalance.domain;

import com.huawei.openstack4j.model.loadbalance.Certificate;
import com.huawei.openstack4j.model.loadbalance.CertificateUpdate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class ELBCertificateUpdate implements CertificateUpdate {

	private static final long serialVersionUID = -4953327488993502029L;

	private String name;

	private String description;
	
	public static ELBCertificateUpdate fromCertificate(Certificate cert) {
		return ELBCertificateUpdate.builder()
					.name(cert.getName())
					.description(cert.getDescription())
					.build();
	}
}
