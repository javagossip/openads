package ai.houyi.openads.commons;
/*
 * Copyright 2017 The OpenDSP Project
 *
 * The OpenDSP Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

import java.util.List;
import javax.annotation.Generated;
import java.util.Collections;

/**
 * 列表分页辅助类
 * 
 * @author wangwp
 */
public class PageResult<T> {
	private int pageNo;
	private int pageSize;
	private int total;
	private int pageCount;

	private List<T> dataList;

	@Generated("SparkTools")
	private PageResult(Builder<T> builder) {
		this.pageNo = builder.pageNo;
		this.pageSize = builder.pageSize;
		this.total = builder.total;
		this.pageCount = builder.pageCount;
		this.dataList = builder.dataList;
	}

	public PageResult() {
	}

	public int getPageNo() {
		return pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public int getTotal() {
		return total;
	}

	public int getPageCount() {
		return pageCount;
	}

	public List<T> getDataList() {
		return dataList;
	}

	/**
	 * Creates builder to build {@link PageResult}.
	 * 
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static <T> Builder<T> builder() {
		return new Builder<T>();
	}

	/**
	 * Builder to build {@link PageResult}.
	 */
	@Generated("SparkTools")
	public static final class Builder<T> {
		private int pageNo;
		private int pageSize;
		private int total;
		private int pageCount;
		private List<T> dataList = Collections.emptyList();

		private Builder() {
		}

		public Builder<T> withPageNo(int pageNo) {
			this.pageNo = pageNo;
			return this;
		}

		public Builder<T> withPageSize(int pageSize) {
			this.pageSize = pageSize;
			return this;
		}

		public Builder<T> withTotal(int total) {
			this.total = total;
			return this;
		}

		public Builder<T> withPageCount(int pageCount) {
			this.pageCount = pageCount;
			return this;
		}

		public Builder<T> withDataList(List<T> dataList) {
			this.dataList = dataList;
			return this;
		}

		public PageResult<T> build() {
			return new PageResult<T>(this);
		}
	}
}
