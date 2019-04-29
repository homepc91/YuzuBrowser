/*
 * Copyright (C) 2017 Hazuki
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jp.hazuki.yuzubrowser.legacy.adblock

import java.io.Serializable

data class AdBlock(var id: Int, var match: String, var isEnable: Boolean, var count: Int, val time: Long) : Serializable {

    constructor(match: String) : this(-1, match, true, 0, 0)

    override fun equals(other: Any?): Boolean = this === other || other is AdBlock && id == other.id
}