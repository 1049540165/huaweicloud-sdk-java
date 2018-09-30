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
package com.huawei.openstack4j.openstack.storage.block.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.huawei.openstack4j.model.storage.block.VolumeBackupCreate;
import com.huawei.openstack4j.model.storage.block.builder.VolumeBackupCreateBuilder;

@JsonRootName("backup")
public class CinderVolumeBackupCreate implements VolumeBackupCreate {
	private static final long serialVersionUID = 1L;

	private String name;
	private String description;
	private String container;
	@JsonProperty("volume_id")
	private String volumeId;
	@JsonProperty("incremental")
	private boolean incremental;
	@JsonProperty("force")
	private boolean force;
	@JsonProperty("snapshot_id")
	private String snapshotId;


	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getVolumeId() {
		return volumeId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isIncremental() {
		return incremental;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isForce() {
		return force;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getSnapshotId() {
		return snapshotId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getContainer() {
		return container;
	}

	public static VolumeBackupCreateConcreteBuilder builder() {
		return new VolumeBackupCreateConcreteBuilder();
	}

	@Override
	public VolumeBackupCreateBuilder toBuilder() {
		return new VolumeBackupCreateConcreteBuilder(this);
	}

	public static class VolumeBackupCreateConcreteBuilder implements VolumeBackupCreateBuilder {

		private CinderVolumeBackupCreate model;

		public VolumeBackupCreateConcreteBuilder() {
			this.model = new CinderVolumeBackupCreate();
		}

		public VolumeBackupCreateConcreteBuilder(CinderVolumeBackupCreate model) {
			this.model = model;
		}

		@Override
		public VolumeBackupCreate build() {
			return model;
		}

		@Override
		public VolumeBackupCreateBuilder from(VolumeBackupCreate in) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public VolumeBackupCreateBuilder name(String name) {
			model.name = name;
			return this;
		}

		@Override
		public VolumeBackupCreateBuilder description(String description) {
			model.description = description;
			return this;
		}

		@Override
		public VolumeBackupCreateBuilder volumeId(String volumeId) {
			model.volumeId = volumeId;
			return this;
		}

		@Override
		public VolumeBackupCreateBuilder container(String container) {
			model.container = container;
			return this;
		}

		@Override
		public VolumeBackupCreateBuilder incremental(boolean incremental) {
			model.incremental = incremental;
			return this;
		}

		@Override
		public VolumeBackupCreateBuilder force(boolean force) {
			model.force = force;
			return this;
		}

		@Override
		public VolumeBackupCreateBuilder snapshotId(String snapshotId) {
			model.snapshotId = snapshotId;
			return this;
		}
	}

}
