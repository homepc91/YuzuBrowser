/*
 * Copyright (C) 2017-2019 Hazuki
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

package jp.hazuki.yuzubrowser.ui.extensions

import android.content.Context
import androidx.annotation.AttrRes
import androidx.annotation.ColorInt


@ColorInt
fun Context.getColorFromAttrRes(@AttrRes attrRes: Int, @ColorInt defaultValue: Int): Int {
    val a = obtainStyledAttributes(intArrayOf(attrRes))
    val result = a.getColor(0, defaultValue)
    a.recycle()
    return result
}

fun Context.getFloatFromAttrRes(@AttrRes attrRes: Int, defaultValue: Float): Float {
    val a = obtainStyledAttributes(intArrayOf(attrRes))
    val result = a.getFloat(0, defaultValue)
    a.recycle()
    return result
}