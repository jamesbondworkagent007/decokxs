package com.immomo.mls.fun.ui.custom;

import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes22.dex */
public abstract class AppBarStateChangeListener implements AppBarLayout.OnOffsetChangedListener {
    private State mCurrentState = State.IDLE;

    public enum State {
        EXPANDED,
        COLLAPSED,
        IDLE
    }

    public abstract void onStateChanged(AppBarLayout appBarLayout, State state);

    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        if (i == 0) {
            State state = this.mCurrentState;
            State state2 = State.EXPANDED;
            if (state != state2) {
                onStateChanged(appBarLayout, state2);
            }
            this.mCurrentState = state2;
            return;
        }
        if (Math.abs(i) >= appBarLayout.getTotalScrollRange()) {
            State state3 = this.mCurrentState;
            State state4 = State.COLLAPSED;
            if (state3 != state4) {
                onStateChanged(appBarLayout, state4);
            }
            this.mCurrentState = state4;
            return;
        }
        State state5 = this.mCurrentState;
        State state6 = State.IDLE;
        if (state5 != state6) {
            onStateChanged(appBarLayout, state6);
        }
        this.mCurrentState = state6;
    }
}
