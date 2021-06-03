package com.example.rxkotlin

import android.annotation.SuppressLint
import android.graphics.Movie
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.os.Bundle
import android.util.Log
import androidx.annotation.MainThread
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.*
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers
import java.lang.reflect.TypeVariable
import java.util.*
import java.util.concurrent.Callable
import java.util.concurrent.TimeUnit


class MainActivity : AppCompatActivity() {
    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Observable.fromArray(1, 2, 3)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<Int> {
                override fun onSubscribe(d: Disposable) {
                    //xem dang ki dc chua
                }

                override fun onNext(t: Int) {
                    //data
                }

                override fun onError(e: Throwable) {
                    // bao loi
                }

                override fun onComplete() {
                    //hoan thanh xong lam gi
                }
            })

        //just
        Observable.fromArray(1, 2, 3)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<Int> {
                override fun onSubscribe(d: Disposable) {
                    //xem dang ki dc chua
                }

                override fun onNext(t: Int) {
                    //data
                }

                override fun onError(e: Throwable) {
                    // bao loi
                }

                override fun onComplete() {
                    //hoan thanh xong lam gi
                }
            })

        //defer
        var person = Person("thanh", 26)
        val personObservable = Observable.defer {
            Observable.just(person)
        }
        person = Person("123", 25)
        personObservable.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<Person> {
                override fun onSubscribe(d: Disposable) {
                    TODO("Not yet implemented")
                }

                override fun onNext(t: Person) {
                    TODO("Not yet implemented")
                }

                override fun onError(e: Throwable) {
                    TODO("Not yet implemented")
                }

                override fun onComplete() {
                    TODO("Not yet implemented")
                }

            })

        //interval
        Observable.interval(1, 3, TimeUnit.SECONDS)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<Long>{
                override fun onSubscribe(d: Disposable) {
                    TODO("Not yet implemented")
                }

                override fun onNext(t: Long) {
                    TODO("Not yet implemented")
                }

                override fun onError(e: Throwable) {
                    TODO("Not yet implemented")
                }

                override fun onComplete() {
                    TODO("Not yet implemented")
                }

            })


    }
}