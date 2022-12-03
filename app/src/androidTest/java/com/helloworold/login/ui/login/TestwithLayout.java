package com.helloworold.login.ui.login;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.assertion.ViewAssertions.selectedDescendantsMatch;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import com.helloworold.login.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestwithLayout {
    @Rule
    public ActivityScenarioRule<LoginActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(LoginActivity.class);

    @Test
    public void changeText_sameActivity() {
        // container
        // username
        // password
        // login

        //locate the element
        //perform action on the element
        //assert verify the element state
        onView(withId(R.id.username))
                .check(matches(isDisplayed()));
        onView(withId(R.id.username))
                .perform(typeText("tufyal"));

        onView(withId(R.id.password))
                .check(matches(isDisplayed()));
        onView(withId(R.id.password))
                .perform(typeText("asdffgh"));

        closeSoftKeyboard();

        onView(withId(R.id.login))
                .check(matches(isDisplayed()));
        onView(withId(R.id.login))
                .check(matches(withText("Sign in or register")));


        onView(withId(R.id.login)).perform(click());

    }
}
