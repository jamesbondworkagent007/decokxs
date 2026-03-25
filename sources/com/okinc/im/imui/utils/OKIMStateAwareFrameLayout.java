package com.okinc.im.imui.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import com.okinc.im.imui.utils.OKIMStateAwareFrameLayout;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import o.C56390yDp;
import o.C56424yEw;
import o.C56444yFp;
import o.C59467zhb;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class OKIMStateAwareFrameLayout extends ConstraintLayout {
    public final ViewTreeObserver.OnGlobalFocusChangeListener AEQbTJ;
    public Map<View, Boolean> KWHzl;
    public boolean OLrzqt;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.Error.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OKIMStateAwareFrameLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OKIMStateAwareFrameLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.dUDNAs int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:14) call: com.okinc.im.imui.utils.OKIMStateAwareFrameLayout.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ OKIMStateAwareFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.dUDNAs : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKIMStateAwareFrameLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: o.ozL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(android.view.View view, android.view.View view2) {
                OKIMStateAwareFrameLayout.KWHzl(this.AEQbTJ, view, view2);
            }
        };
        this.KWHzl = C56424yEw.KWHzl();
        setAddStatesFromChildren(true);
        setBackgroundByState();
        EZpvd();
    }

    public static final void KWHzl(OKIMStateAwareFrameLayout oKIMStateAwareFrameLayout, View view, View view2) {
        oKIMStateAwareFrameLayout.setBackgroundByState();
    }

    public final void EZpvd() {
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalFocusChangeListener(this.AEQbTJ);
        }
        if (ViewCompat.isAttachedToWindow(this)) {
            if (!ViewCompat.isAttachedToWindow(this)) {
                ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
                if (viewTreeObserver2 != null) {
                    viewTreeObserver2.removeOnGlobalFocusChangeListener(this.AEQbTJ);
                    return;
                }
                return;
            }
            addOnAttachStateChangeListener(new ActionBar(this, this));
            return;
        }
        addOnAttachStateChangeListener(new StateListAnimator(this, this));
    }

    public final void setBackgroundByState() {
        State state;
        if (this.OLrzqt) {
            state = State.Error;
        } else if (isEnabled()) {
            state = hasFocus() ? State.Focused : State.Default;
        } else {
            state = State.Disabled;
        }
        EZpvd(state);
    }

    private final void EZpvd(State state) {
        setBackgroundResource(TaskDescription.KWHzl[state.ordinal()] == 1 ? C35399nuc.ActionBar.fIwbmz : C35399nuc.ActionBar.ejfBZ);
    }

    public final void setError(boolean z) {
        this.OLrzqt = z;
        setBackgroundByState();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        boolean zBooleanValue;
        if (isEnabled() == z) {
            return;
        }
        if (!z) {
            this.KWHzl = C56424yEw.OLrzqt(C59467zhb.fetchVPNInfo(ViewGroupKt.getDescendants(this), new Function1() { // from class: o.ozJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OKIMStateAwareFrameLayout.KWHzl(this.EZpvd, (android.view.View) obj);
                }
            }));
        }
        for (View view : ViewGroupKt.getDescendants(this)) {
            if (z) {
                Boolean bool = this.KWHzl.get(view);
                zBooleanValue = bool != null ? bool.booleanValue() : true;
            } else {
                zBooleanValue = false;
            }
            view.setEnabled(zBooleanValue);
        }
        super.setEnabled(z);
    }

    public static final Pair KWHzl(OKIMStateAwareFrameLayout oKIMStateAwareFrameLayout, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return C56390yDp.OLrzqt(view, Boolean.valueOf(oKIMStateAwareFrameLayout.isEnabled()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this.AEQbTJ);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State Default = new State("Default", 0);
        public static final State Focused = new State("Focused", 1);
        public static final State Disabled = new State("Disabled", 2);
        public static final State Error = new State("Error", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ State[] $values() {
            return new State[]{Default, Focused, Disabled, Error};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<State> getEntries() {
            return $ENTRIES;
        }

        private State(String str, int i) {
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(stateArr$values);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public static final class StateListAnimator implements View.OnAttachStateChangeListener {
        public final /* synthetic */ OKIMStateAwareFrameLayout AEQbTJ;
        public final /* synthetic */ View EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public StateListAnimator(View view, OKIMStateAwareFrameLayout oKIMStateAwareFrameLayout) {
            this.EZpvd = view;
            this.AEQbTJ = oKIMStateAwareFrameLayout;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd.removeOnAttachStateChangeListener(this);
            if (!ViewCompat.isAttachedToWindow(view)) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalFocusChangeListener(this.AEQbTJ.AEQbTJ);
                    return;
                }
                return;
            }
            view.addOnAttachStateChangeListener(new ActionBar(view, this.AEQbTJ));
        }
    }

    public static final class ActionBar implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ OKIMStateAwareFrameLayout copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public ActionBar(View view, OKIMStateAwareFrameLayout oKIMStateAwareFrameLayout) {
            this.AEQbTJ = view;
            this.copydefault = oKIMStateAwareFrameLayout;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.AEQbTJ.removeOnAttachStateChangeListener(this);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalFocusChangeListener(this.copydefault.AEQbTJ);
            }
        }
    }
}
