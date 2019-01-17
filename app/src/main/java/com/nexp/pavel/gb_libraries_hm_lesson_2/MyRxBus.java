package com.nexp.pavel.gb_libraries_hm_lesson_2;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

public class MyRxBus {
    private PublishSubject<Object> bus = PublishSubject.create();

    public void doSmth(Object object){
        bus.onNext(object);
    }

    public Observable<Object> toObservable(){
        return bus;
    }
}
