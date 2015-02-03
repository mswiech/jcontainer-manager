/*
 * Copyright 2015 Red Hat Inc. and/or its affiliates and other contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.qa.jcontainer.eap;

import org.jboss.qa.jcontainer.jboss.JBossConfiguration;

public class EapConfiguration extends JBossConfiguration {
	public EapConfiguration(Builder<?> builder) {
		super(builder);
	}

	public static Builder<?> builder() {
		return new Builder2();
	}

	public abstract static class Builder<T extends Builder<T>> extends JBossConfiguration.Builder<T> {

		public Builder() {
			managementPort = 9999;
		}

		public EapConfiguration build() {
			return new EapConfiguration(this);
		}
	}

	private static class Builder2 extends Builder<Builder2> {
		@Override
		protected Builder2 self() {
			return this;
		}
	}
}