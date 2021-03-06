package com.fernandocejas.android10.sample.presentation.ui.weather;

import com.fernandocejas.android10.sample.presentation.ui.base.BaseLoadDataView;
import com.fernandocejas.android10.sample.presentation.ui.base.BasePresenterContract;
import io.reactivex.Observable;

/**
 * Created by Ruby on 7/29/2017.
 */
public interface WeatherMvpContract {
  interface View extends BaseLoadDataView {
    void renderWeather(WeatherViewModel weatherViewModel);

    void setRefreshing(boolean refreshing);

    Observable<Object> celsiusClick();

    Observable<Object> fahrenheitClick();

    Observable<Object> refresh();
  }

  interface Presenter extends BasePresenterContract {

    void onCelsiusClick();

    void onFahrenheitClick();

    void onRefresh();
  }
}
