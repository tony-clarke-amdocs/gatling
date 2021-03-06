/*
 * Copyright 2011-2020 GatlingCorp (https://gatling.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.gatling.commons.util

import io.gatling.BaseSpec

class CollectionsSpec extends BaseSpec {

  "lift" should "return Some if index exists" in {
    Collections.lift((0 until 10).iterator, 9) shouldBe Some(9)
  }

  it should "return None if index doesn't exists" in {
    Collections.lift((0 until 10).iterator, 10) shouldBe None
  }
}
