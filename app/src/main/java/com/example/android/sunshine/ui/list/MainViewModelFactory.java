package com.example.android.sunshine.ui.list;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.example.android.sunshine.data.SunshineRepository;

/**
 * Created by TINH HUYNH on 2/20/2018.
 */

public class MainViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private SunshineRepository mRepository;

    public MainViewModelFactory(SunshineRepository repository) {
        mRepository = repository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        //noinspection unchecked
        return (T) new MainActivityViewModel(mRepository);
    }
}
