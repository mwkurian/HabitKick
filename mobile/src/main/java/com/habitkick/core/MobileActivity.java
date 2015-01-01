package com.habitkick.core;

import android.graphics.drawable.StateListDrawable;
import android.view.View;

import com.habitkick.R;
import com.habitkick.shared.core.HabitKickActivity;

public abstract class MobileActivity extends HabitKickActivity {
    @Override
    protected void onThemeChange(int appColor, float hue) {
        // none for now
    }

    @Override
    public View getBackgroundView() {
        return findViewById(R.id.bg);
    }
}