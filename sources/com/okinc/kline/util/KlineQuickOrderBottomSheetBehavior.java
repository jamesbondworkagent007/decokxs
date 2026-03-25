package com.okinc.kline.util;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.okinc.kline.util.KlineQuickOrderBottomSheetBehavior;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C55302xhQ;
import o.C56444yFp;
import o.C56548yJl;
import o.InterfaceC56445yFq;
import o.pFO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class KlineQuickOrderBottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public int AEQbTJ;
    public final ViewDragHelper.Callback AYXKKw;
    public ViewDragHelper AhwBna;
    public States AkhnZx;
    public WeakReference<View> AuCTel;
    public int DbNXlk;
    public int EZpvd;
    public States KWHzl;
    public boolean OLrzqt;
    public ActionBar copydefault;
    public int djBIcL;
    public int fetchVPNInfo;
    public int gEmmrt;
    public VelocityTracker isConnected;
    public int valueOf;
    public int values;

    public interface ActionBar {
        void AEQbTJ(@NotNull States states);

        void OLrzqt(int i);
    }

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[States.values().length];
            try {
                iArr[States.STATE_EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[States.STATE_HALF_EXPANDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[States.STATE_COLLAPSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[States.STATE_DRAGGING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[States.STATE_SETTLING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActionBar AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.valueOf = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(ActionBar actionBar) {
        this.copydefault = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(int i) {
        this.gEmmrt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final States copydefault() {
        return this.KWHzl;
    }

    public KlineQuickOrderBottomSheetBehavior(int i) {
        this.djBIcL = i;
        States states = States.STATE_COLLAPSED;
        this.KWHzl = states;
        this.AEQbTJ = -1;
        this.OLrzqt = true;
        copydefault(states);
        this.AYXKKw = new TaskDescription(this);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class States {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ States[] $VALUES;
        private final int value;
        public static final States STATE_DRAGGING = new States("STATE_DRAGGING", 0, 1);
        public static final States STATE_SETTLING = new States("STATE_SETTLING", 1, 2);
        public static final States STATE_EXPANDED = new States("STATE_EXPANDED", 2, 3);
        public static final States STATE_HALF_EXPANDED = new States("STATE_HALF_EXPANDED", 3, 4);
        public static final States STATE_COLLAPSED = new States("STATE_COLLAPSED", 4, 5);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ States[] $values() {
            return new States[]{STATE_DRAGGING, STATE_SETTLING, STATE_EXPANDED, STATE_HALF_EXPANDED, STATE_COLLAPSED};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<States> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        private States(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            States[] statesArr$values = $values();
            $VALUES = statesArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(statesArr$values);
        }

        public static States valueOf(String str) {
            return (States) Enum.valueOf(States.class, str);
        }

        public static States[] values() {
            return (States[]) $VALUES.clone();
        }
    }

    public final void AEQbTJ(@NotNull final States states) {
        final View view;
        Intrinsics.checkNotNullParameter(states, "");
        if (this.KWHzl == states) {
            return;
        }
        this.AkhnZx = states;
        WeakReference<View> weakReference = this.AuCTel;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        if (view.getParent() != null && view.getParent().isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(new Runnable() { // from class: o.pEO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    KlineQuickOrderBottomSheetBehavior.copydefault(this.copydefault, view, states);
                }
            });
        } else {
            OLrzqt(view, states);
        }
    }

    public static final void copydefault(KlineQuickOrderBottomSheetBehavior klineQuickOrderBottomSheetBehavior, View view, States states) {
        klineQuickOrderBottomSheetBehavior.OLrzqt(view, states);
    }

    public final void copydefault(States states) {
        if (this.KWHzl != states) {
            this.KWHzl = states;
            ActionBar actionBar = this.copydefault;
            if (actionBar != null) {
                actionBar.AEQbTJ(states);
            }
        }
        if (states == States.STATE_SETTLING || states == States.STATE_DRAGGING) {
            return;
        }
        this.AkhnZx = states;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NotNull CoordinatorLayout coordinatorLayout, @NotNull V v, int i) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "");
        Intrinsics.checkNotNullParameter(v, "");
        this.AuCTel = new WeakReference<>(v);
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i);
        if (this.values == 0) {
            pFO pfo = pFO.OLrzqt;
            Context context = coordinatorLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (pfo.EZpvd(context)) {
                Context context2 = coordinatorLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                this.values = C55302xhQ.copydefault(context2);
            }
        }
        Context context3 = coordinatorLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        this.DbNXlk = (C55302xhQ.AEQbTJ(context3) - this.values) - this.EZpvd;
        int i2 = Activity.AEQbTJ[copydefault().ordinal()];
        if (i2 == 1) {
            ViewCompat.offsetTopAndBottom(v, this.DbNXlk - this.gEmmrt);
        } else if (i2 == 2) {
            ViewCompat.offsetTopAndBottom(v, this.DbNXlk - this.valueOf);
        } else if (i2 == 3) {
            ViewCompat.offsetTopAndBottom(v, this.DbNXlk - this.djBIcL);
        } else {
            if (i2 != 4 && i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            ViewCompat.offsetTopAndBottom(v, top - v.getTop());
        }
        if (this.AhwBna == null) {
            this.AhwBna = ViewDragHelper.create(coordinatorLayout, this.AYXKKw);
        }
        return true;
    }

    public static final class TaskDescription extends ViewDragHelper.Callback {
        public final /* synthetic */ KlineQuickOrderBottomSheetBehavior<V> KWHzl;

        public TaskDescription(KlineQuickOrderBottomSheetBehavior<V> klineQuickOrderBottomSheetBehavior) {
            this.KWHzl = klineQuickOrderBottomSheetBehavior;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            Intrinsics.checkNotNullParameter(view, "");
            if (this.KWHzl.copydefault() == States.STATE_COLLAPSED || this.KWHzl.copydefault() == States.STATE_DRAGGING) {
                return false;
            }
            ViewDragHelper viewDragHelper = this.KWHzl.AhwBna;
            if (viewDragHelper == null) {
                Intrinsics.gEmmrt("");
                viewDragHelper = null;
            }
            if (viewDragHelper.getViewDragState() == 2) {
                return true;
            }
            if (this.KWHzl.AuCTel == null) {
                return false;
            }
            WeakReference weakReference = this.KWHzl.AuCTel;
            return Intrinsics.EZpvd(weakReference != null ? (View) weakReference.get() : null, view);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewVerticalDragRange(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return this.KWHzl.DbNXlk - this.KWHzl.OLrzqt();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i, int i2) {
            Intrinsics.checkNotNullParameter(view, "");
            return C56548yJl.EZpvd(i, this.KWHzl.DbNXlk - this.KWHzl.KWHzl(), this.KWHzl.DbNXlk - this.KWHzl.OLrzqt());
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            Intrinsics.checkNotNullParameter(view, "");
            return view.getLeft();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            if (i == 1) {
                this.KWHzl.copydefault(States.STATE_DRAGGING);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            Intrinsics.checkNotNullParameter(view, "");
            ActionBar actionBarAEQbTJ = this.KWHzl.AEQbTJ();
            if (actionBarAEQbTJ != null) {
                actionBarAEQbTJ.OLrzqt(i2);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f, float f2) {
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl.OLrzqt(view, f2);
        }
    }

    public final void OLrzqt(View view, float f) {
        States states;
        States states2;
        States states3;
        int i = this.DbNXlk;
        int i2 = i - this.djBIcL;
        int i3 = i - this.valueOf;
        int top = view.getTop();
        if (f < 0.0f) {
            if (top > i3) {
                states3 = States.STATE_HALF_EXPANDED;
            } else {
                states3 = States.STATE_EXPANDED;
            }
            this.AkhnZx = states3;
        } else if (f > 0.0f) {
            if (Math.abs(top - i3) < Math.abs(top - i2)) {
                states2 = States.STATE_HALF_EXPANDED;
            } else {
                states2 = States.STATE_COLLAPSED;
            }
            this.AkhnZx = states2;
        } else {
            if (top < i3) {
                if (top < Math.abs(top - i2)) {
                    states = States.STATE_EXPANDED;
                } else {
                    states = States.STATE_HALF_EXPANDED;
                }
            } else if (Math.abs(top - i3) < Math.abs(top - i2)) {
                states = States.STATE_HALF_EXPANDED;
            } else {
                states = States.STATE_COLLAPSED;
            }
            this.AkhnZx = states;
        }
        States states4 = this.AkhnZx;
        if (states4 != null) {
            OLrzqt(view, states4);
        }
    }

    public final void OLrzqt(View view, States states) {
        int i = this.DbNXlk;
        int i2 = i - this.djBIcL;
        int i3 = this.gEmmrt;
        int i4 = this.valueOf;
        int i5 = Activity.AEQbTJ[states.ordinal()];
        if (i5 == 1) {
            i2 = i - i3;
        } else if (i5 == 2) {
            i2 = i - i4;
        } else if (i5 != 3) {
            throw new IllegalArgumentException("Invalid state: " + states);
        }
        ViewDragHelper viewDragHelper = this.AhwBna;
        if (viewDragHelper == null) {
            Intrinsics.gEmmrt("");
            viewDragHelper = null;
        }
        if (viewDragHelper.smoothSlideViewTo(view, view.getLeft(), i2)) {
            copydefault(States.STATE_SETTLING);
            ViewCompat.postOnAnimation(view, new StateListAnimator(this, view, states));
        } else {
            copydefault(states);
        }
    }

    public final class StateListAnimator implements Runnable {
        public final View AEQbTJ;
        public final States EZpvd;
        public final /* synthetic */ KlineQuickOrderBottomSheetBehavior<V> KWHzl;

        public StateListAnimator(@NotNull KlineQuickOrderBottomSheetBehavior klineQuickOrderBottomSheetBehavior, @NotNull View view, States states) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(states, "");
            this.KWHzl = klineQuickOrderBottomSheetBehavior;
            this.AEQbTJ = view;
            this.EZpvd = states;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewDragHelper viewDragHelper = this.KWHzl.AhwBna;
            if (viewDragHelper == null) {
                Intrinsics.gEmmrt("");
                viewDragHelper = null;
            }
            if (!viewDragHelper.continueSettling(true)) {
                this.KWHzl.copydefault(this.EZpvd);
            } else {
                this.AEQbTJ.postOnAnimation(this);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@NotNull CoordinatorLayout coordinatorLayout, @NotNull V v, @NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "");
        Intrinsics.checkNotNullParameter(v, "");
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && copydefault() == States.STATE_DRAGGING) {
            return true;
        }
        ViewDragHelper viewDragHelper = this.AhwBna;
        ViewDragHelper viewDragHelper2 = null;
        if (viewDragHelper != null) {
            if (viewDragHelper == null) {
                Intrinsics.gEmmrt("");
                viewDragHelper = null;
            }
            viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            AYXKKw();
        }
        if (this.isConnected == null) {
            this.isConnected = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.isConnected;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (this.AhwBna != null && this.OLrzqt && actionMasked == 2 && AEQbTJ(this.fetchVPNInfo, (int) motionEvent.getY())) {
            ViewDragHelper viewDragHelper3 = this.AhwBna;
            if (viewDragHelper3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                viewDragHelper2 = viewDragHelper3;
            }
            viewDragHelper2.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return this.OLrzqt;
    }

    public final void AYXKKw() {
        this.AEQbTJ = -1;
        VelocityTracker velocityTracker = this.isConnected;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.isConnected = null;
    }

    public final boolean AEQbTJ(int i, int i2) {
        int iAbs = Math.abs(i - i2);
        ViewDragHelper viewDragHelper = this.AhwBna;
        if (viewDragHelper == null) {
            Intrinsics.gEmmrt("");
            viewDragHelper = null;
        }
        return iAbs >= viewDragHelper.getTouchSlop();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NotNull CoordinatorLayout coordinatorLayout, @NotNull V v, @NotNull MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        Intrinsics.checkNotNullParameter(coordinatorLayout, "");
        Intrinsics.checkNotNullParameter(v, "");
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (!v.isShown()) {
            this.OLrzqt = false;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            AYXKKw();
        }
        if (this.isConnected == null) {
            this.isConnected = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.isConnected;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (actionMasked == 0) {
            this.AEQbTJ = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.fetchVPNInfo = (int) motionEvent.getY();
            this.OLrzqt = this.AEQbTJ != -1 || coordinatorLayout.isPointInChildBounds(v, (int) motionEvent.getX(), this.fetchVPNInfo);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.AEQbTJ = -1;
            if (!this.OLrzqt) {
                this.OLrzqt = true;
                return false;
            }
        }
        if (!this.OLrzqt || (viewDragHelper = this.AhwBna) == null) {
            return false;
        }
        if (viewDragHelper == null) {
            Intrinsics.gEmmrt("");
            viewDragHelper = null;
        }
        return viewDragHelper.shouldInterceptTouchEvent(motionEvent);
    }

    public final void djBIcL() {
        final View view;
        final States states = this.AkhnZx;
        if (states == null) {
            states = this.KWHzl;
        }
        WeakReference<View> weakReference = this.AuCTel;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        if (states == States.STATE_EXPANDED || states == States.STATE_HALF_EXPANDED) {
            if (view.getParent() != null && view.getParent().isLayoutRequested() && view.isAttachedToWindow()) {
                view.post(new Runnable() { // from class: o.pEK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        KlineQuickOrderBottomSheetBehavior.AEQbTJ(this.AEQbTJ, view, states);
                    }
                });
            } else {
                OLrzqt(view, states);
            }
        }
    }

    public static final void AEQbTJ(KlineQuickOrderBottomSheetBehavior klineQuickOrderBottomSheetBehavior, View view, States states) {
        klineQuickOrderBottomSheetBehavior.OLrzqt(view, states);
    }
}
