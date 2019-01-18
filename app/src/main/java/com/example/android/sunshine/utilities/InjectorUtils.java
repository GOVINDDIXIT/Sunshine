package com.example.android.sunshine.utilities;

/**
 * Provides static methods to inject the various classes needed for Sunshine
 */
public class InjectorUtils {

//    public static SunshineRepository provideRepository(Context context) {
//        SunshineDatabase database = SunshineDatabase.getInstance(context.getApplicationContext());
//        AppExecutors executors = AppExecutors.getInstance();
//        WeatherNetworkDataSource networkDataSource =
//                WeatherNetworkDataSource.getInstance(context.getApplicationContext(), executors);
//        return SunshineRepository.getInstance(database.weatherDao(), networkDataSource, executors);
//    }
//
//    public static WeatherNetworkDataSource provideNetworkDataSource(Context context) {
//        AppExecutors executors = AppExecutors.getInstance();
//        return WeatherNetworkDataSource.getInstance(context.getApplicationContext(), executors);
//    }
//
//    public static DetailViewModelFactory provideDetailViewModelFactory(Context context, Date date) {
//        SunshineRepository repository = provideRepository(context.getApplicationContext());
//        return new DetailViewModelFactory(repository, date);
//    }
//
//    public static MainViewModelFactory provideMainActivityViewModelFactory(Context context) {
//        SunshineRepository repository = provideRepository(context.getApplicationContext());
//        return new MainViewModelFactory(repository);
//    }

}