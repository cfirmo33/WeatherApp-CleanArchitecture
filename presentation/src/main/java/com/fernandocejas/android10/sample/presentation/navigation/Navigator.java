/**
 * Copyright (C) 2015 Fernando Cejas Open Source Project
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
package com.fernandocejas.android10.sample.presentation.navigation;

import android.content.Context;
import android.content.Intent;
import com.fernandocejas.android10.sample.presentation.ui.citylist.CityListActivity;
import com.fernandocejas.android10.sample.presentation.ui.weather.WeatherActivity;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Class used to navigate through the application.
 */
@Singleton public class Navigator {

  @Inject public Navigator() {
  }

  public void navigateToCityList(Context context) {
    if (context != null) {
      Intent intentToLaunch = CityListActivity.getCallingIntent(context);
      context.startActivity(intentToLaunch);
    }
  }

  /**
   * Goes to the weather screen.
   *
   * @param context A Context needed to open the destiny activity.
   */
  public void navigateToWeather(Context context, String cityId) {
    if (context != null) {
      Intent intentToLaunch = WeatherActivity.getCallingIntent(context, cityId);
      context.startActivity(intentToLaunch);
    }
  }
}
