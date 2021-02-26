package com.example.myfirstapp

import androidx.lifecycle.Lifecycle
import androidx.test.core.app.launchActivity
import androidx.test.core.app.ActivityScenario.launch

//import org.junit.Assert.*

import androidx.test.runner.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.runner.RunWith
import org.junit.Test


@RunWith(AndroidJUnit4::class)

class DisplayMessageActivityTest {

    @Test
    fun onCreate() {
        // val scenario = launchActivity<DisplayMessageActivity>()
        val activityScenario = launch(MainActivity::class.java)
        val state1 = activityScenario.state
        assertEquals("State should be RESUMED", Lifecycle.State.RESUMED, state1)
        activityScenario.moveToState(Lifecycle.State.CREATED)
        val state2 = activityScenario.state
        assertEquals("State should be CREATED", Lifecycle.State.CREATED, state2)
    }
}