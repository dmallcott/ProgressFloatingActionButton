/*
 * Copyright (C) 2016 Daniel Mallcott
 *
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
 */

package com.dmallcott.progressfloatingactionbutton.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;

import com.dmallcott.progressfloatingactionbutton.R;

public class ThemeUtils {

    /**
     * Obtains the current theme's primary color.
     * Will default to Color.BLUE.
     *
     * @param context
     *            The current context
     * @return current theme's primary color
     */
    public static int getThemePrimaryColor(final Context context) {
        TypedValue typedValue = new TypedValue();
        TypedArray a = context.obtainStyledAttributes(
                typedValue.data,
                new int[] { R.attr.colorPrimary}
        );
        int color = a.getColor(0, Color.BLUE);
        a.recycle();

        return color;
    }

    /**
     * Obtains the current theme's secondary color.
     * Will default to Color.CYAN.
     *
     * @param context
     *            The current context
     * @return current theme's secondary color
     */
    public static int getThemeAccentColor(final Context context) {
        TypedValue typedValue = new TypedValue();
        TypedArray a = context.obtainStyledAttributes(
                typedValue.data,
                new int[] { R.attr.colorAccent}
        );
        int color = a.getColor(0, Color.CYAN);
        a.recycle();

        return color;
    }
}
