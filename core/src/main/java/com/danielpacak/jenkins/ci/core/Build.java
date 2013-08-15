/*
 * #%L
 * Jenkins Java API
 * %%
 * Copyright (C) 2013 Daniel Pacak
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.danielpacak.jenkins.ci.core;

import java.io.Serializable;

/**
 * Build model class.
 * 
 * @since 1.0.0
 */
public class Build implements Serializable {

	private static final long serialVersionUID = 5391287361325427962L;

	private Long number;

	private Status status;

	public static enum Status {
		SUCCESS, PENDING, FAILED
	}

	public Long getNumber() {
		return number;
	}

	/**
	 * @param number
	 * @return this build
	 */
	public Build setNumber(Long number) {
		this.number = number;
		return this;
	}

	public Status getStatus() {
		return status;
	}

	/**
	 * @param status
	 * @return this build
	 */
	public Build setStatus(Status status) {
		this.status = status;
		return this;
	}

}
