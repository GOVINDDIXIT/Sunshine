//package com.example.android.sunshine.ui.detail;
//
//import android.arch.lifecycle.ViewModel;
//import android.arch.lifecycle.ViewModelProvider;
//
///**
// * Factory method that allows us to create a ViewModel with a constructor that takes a
// * {@link SunshineRepository} and an ID for the current {@link WeatherEntry}
// */
//public class DetailViewModelFactory extends ViewModelProvider.NewInstanceFactory {
//
//    private final SunshineRepository mRepository;
//
//    public DetailViewModelFactory(SunshineRepository repository) {
//        this.mRepository = repository;
//    }
//
//    @Override
//    public <T extends ViewModel> T create(Class<T> modelClass) {
//        //noinspection unchecked
//        return (T) new DetailActivityViewModel(mRepository);
//    }
//}
