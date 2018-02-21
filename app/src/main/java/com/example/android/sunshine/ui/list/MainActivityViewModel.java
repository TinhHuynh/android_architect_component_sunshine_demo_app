package com.example.android.sunshine.ui.list;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.sunshine.data.SunshineRepository;
import com.example.android.sunshine.data.database.ListViewWeatherEntry;
import com.example.android.sunshine.data.database.WeatherEntry;

import java.util.List;

/**
 * Created by TINH HUYNH on 2/20/2018.
 */

public class MainActivityViewModel extends ViewModel {

    private LiveData<List<ListViewWeatherEntry>> mWeathers;
    private SunshineRepository mRepository;

    public MainActivityViewModel(SunshineRepository repository) {
        mRepository = repository;
        mWeathers = mRepository.getCurrentWeatherForecasts();
    }

    public LiveData<List<ListViewWeatherEntry>> getWeathers() {
        return mWeathers;
    }

}
