/**
 *
 * Copyright 2018-2025 Bharath Vishal G.
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
 *
 **/

package com.roottools.rootchecker.application

import android.app.Application
import android.util.Log
import com.google.android.material.color.DynamicColors
import com.roottools.rootchecker.ConstantsUtilities.RootUtilities

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        //For dynamic theming on Android 12 and above
        try {
            if (RootUtilities.isOSSandAbove) {
                DynamicColors.applyToActivitiesIfAvailable(this)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
