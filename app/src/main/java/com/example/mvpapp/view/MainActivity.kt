package com.example.mvpapp.view

import com.example.mvpapp.R
import com.example.mvpapp.model.DatabaseManager
import com.example.mvpapp.presenter.MainPresenter
import com.example.mvpapp.presenter.MainPresenterImpl
import java.awt.Button

class MainActivity : AppCompatActivity(), MainView {

    private lateinit var mPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPresenter = MainPresenterImpl(DatabaseManager(), this)

        findViewById<Button>(R.id.get_username).setOnClickListener {
            mPresenter.requestUsername()
        }
    }

    override fun setUsername(username: String) {
        findViewById<TextView>(R.id.username).text = username
    }

    override fun showResult() {
        TODO("Not yet implemented")
    }
}