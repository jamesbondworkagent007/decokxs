package com.okinc.core.widget.recycler;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import o.C55296xhK;

/* JADX INFO: loaded from: classes8.dex */
public abstract class MaoRefreshView extends LinearLayout {
    public State AhwBna;
    public int gEmmrt;

    public enum State {
        IDLE,
        PULL,
        PULL_TO_REFRESH,
        REFRESHING,
        COMPLETED
    }

    public abstract View AhwBna();

    public abstract void djBIcL();

    public abstract void gEmmrt();

    public abstract void valueOf();

    public MaoRefreshView(Context context) {
        this(context, null);
    }

    public MaoRefreshView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaoRefreshView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AhwBna = State.IDLE;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        C55296xhK.AEQbTJ(layoutParams, 0, 0, 0, 0);
        setLayoutParams(layoutParams);
        setPaddingRelative(0, 0, 0, 0);
        addView(AhwBna(), new LinearLayout.LayoutParams(-1, -2));
        setGravity(80);
        measure(-2, -2);
        this.gEmmrt = getMeasuredHeight();
        OLrzqt(0);
    }

    /* JADX INFO: renamed from: com.okinc.core.widget.recycler.MaoRefreshView$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] AEQbTJ;

        static {
            int[] iArr = new int[State.values().length];
            AEQbTJ = iArr;
            try {
                iArr[State.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[State.PULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AEQbTJ[State.PULL_TO_REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AEQbTJ[State.REFRESHING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AEQbTJ[State.COMPLETED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AEQbTJ(State state) {
        if (state == this.AhwBna) {
            return;
        }
        this.AhwBna = state;
        int i = AnonymousClass1.AEQbTJ[state.ordinal()];
        if (i == 1) {
            KWHzl(0);
            return;
        }
        if (i == 2) {
            valueOf();
            return;
        }
        if (i == 3) {
            gEmmrt();
        } else if (i == 4) {
            djBIcL();
        } else {
            if (i != 5) {
                return;
            }
            fetchVPNInfo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OLrzqt(int i) {
        if (i < 0) {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i;
        setLayoutParams(layoutParams);
    }

    private int EZpvd() {
        return getLayoutParams().height;
    }

    public final void KWHzl(int i) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(EZpvd(), i);
        valueAnimatorOfInt.setDuration(300L).start();
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.okinc.core.widget.recycler.MaoRefreshView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                MaoRefreshView.this.OLrzqt(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        valueAnimatorOfInt.start();
    }

    public final void fetchVPNInfo() {
        new Handler().postDelayed(new Runnable() { // from class: com.okinc.core.widget.recycler.MaoRefreshView.3
            @Override // java.lang.Runnable
            public void run() {
                MaoRefreshView.this.AEQbTJ(State.IDLE);
            }
        }, 1000L);
    }

    public boolean copydefault(float f) {
        State state;
        if (f > 0.0f) {
            int iEZpvd = EZpvd();
            State state2 = this.AhwBna;
            if ((state2 != State.REFRESHING && state2 != State.COMPLETED) || f >= this.gEmmrt) {
                OLrzqt((int) f);
            }
            State state3 = this.AhwBna;
            State state4 = State.IDLE;
            if (state3 == state4) {
                AEQbTJ(State.PULL);
            } else {
                State state5 = State.PULL;
                if (state3 == state5 && EZpvd() >= this.gEmmrt) {
                    AEQbTJ(State.PULL_TO_REFRESH);
                } else if (this.AhwBna == State.PULL_TO_REFRESH && EZpvd() < this.gEmmrt) {
                    AEQbTJ(state5);
                }
            }
            if (iEZpvd > f && ((state = this.AhwBna) == state4 || state == State.PULL)) {
                return true;
            }
        }
        return false;
    }

    public boolean values() {
        State state = this.AhwBna;
        State state2 = State.IDLE;
        if (state == state2) {
            return false;
        }
        if (state == State.PULL_TO_REFRESH) {
            AEQbTJ(State.REFRESHING);
            KWHzl(this.gEmmrt);
            return true;
        }
        if (state == State.PULL) {
            AEQbTJ(state2);
        } else {
            KWHzl(this.gEmmrt);
        }
        return false;
    }

    public boolean DbNXlk() {
        State state = this.AhwBna;
        if (state != State.REFRESHING && state != State.COMPLETED) {
            return false;
        }
        AEQbTJ(State.COMPLETED);
        return true;
    }
}
