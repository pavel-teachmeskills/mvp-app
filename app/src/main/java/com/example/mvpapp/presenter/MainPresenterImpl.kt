package com.example.mvpapp.presenter

import com.example.mvpapp.model.DatabaseManager
import com.example.mvpapp.view.MainView

class MainPresenterImpl(private val databaseManager: DatabaseManager, private val view: MainView) :
    MainPresenter {
    override fun requestUsername() {
        val username = databaseManager.getUsername()
        view.setUsername(username)
    }

    override fun changeUsername() {
        ///
    }
}