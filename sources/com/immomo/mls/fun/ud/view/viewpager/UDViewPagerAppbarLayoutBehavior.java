package com.immomo.mls.fun.ud.view.viewpager;

import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes14.dex */
public class UDViewPagerAppbarLayoutBehavior extends AppBarLayout.Behavior {
    public Application AEQbTJ;
    public boolean OLrzqt;
    public boolean gEmmrt;
    public boolean AhwBna = false;
    public int copydefault = 0;
    public int EZpvd = 0;
    public boolean KWHzl = false;

    public interface Application {
        void AEQbTJ(int i, int i2, int i3);

        void AEQbTJ(int i, boolean z);

        void copydefault(int i);

        void copydefault(int i, int i2, int i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
        this.AhwBna = z;
    }

    public void KWHzl(Application application) {
        StateListAnimator.EZpvd("UDViewPagerAppbarLayoutBehavior", "setNestedScrollListener: " + application);
        this.AEQbTJ = application;
    }

    /* JADX DEBUG: Method merged with bridge method: onInterceptTouchEvent(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z */
    @Override // com.google.android.material.appbar.AppBarLayout.Behavior, com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, MotionEvent motionEvent) {
        this.gEmmrt = this.OLrzqt;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 3) {
            OLrzqt(appBarLayout);
        }
        return super.onInterceptTouchEvent(coordinatorLayout, appBarLayout, motionEvent);
    }

    public final Field OLrzqt() throws NoSuchFieldException {
        Class<? super Object> superclass;
        Class<? super Object> superclass2 = getClass().getSuperclass();
        if (superclass2 != null) {
            try {
                try {
                    superclass = superclass2.getSuperclass();
                } catch (Exception unused) {
                }
            } catch (NoSuchFieldException unused2) {
                Class<? super Object> superclass3 = superclass2.getSuperclass().getSuperclass();
                if (superclass3 != null) {
                    return superclass3.getDeclaredField("flingRunnable");
                }
                return null;
            }
        } else {
            superclass = null;
        }
        if (superclass != null) {
            return superclass.getDeclaredField("mFlingRunnable");
        }
        return null;
    }

    public final Field copydefault() throws NoSuchFieldException {
        Class<? super Object> superclass;
        Class<? super Object> superclass2 = getClass().getSuperclass();
        if (superclass2 != null) {
            try {
                try {
                    superclass = superclass2.getSuperclass();
                } catch (Exception unused) {
                }
            } catch (NoSuchFieldException unused2) {
                Class<? super Object> superclass3 = superclass2.getSuperclass().getSuperclass();
                if (superclass3 != null) {
                    return superclass3.getDeclaredField("scroller");
                }
                return null;
            }
        } else {
            superclass = null;
        }
        if (superclass != null) {
            return superclass.getDeclaredField("mScroller");
        }
        return null;
    }

    public final void OLrzqt(View view) {
        try {
            Field fieldOLrzqt = OLrzqt();
            Field fieldCopydefault = copydefault();
            if (fieldOLrzqt != null) {
                fieldOLrzqt.setAccessible(true);
            }
            if (fieldCopydefault != null) {
                fieldCopydefault.setAccessible(true);
            }
            Runnable runnable = fieldOLrzqt != null ? (Runnable) fieldOLrzqt.get(this) : null;
            OverScroller overScroller = fieldCopydefault != null ? (OverScroller) fieldCopydefault.get(this) : null;
            if (runnable != null) {
                StateListAnimator.EZpvd("UDViewPagerAppbarLayoutBehavior", "stop flingRunnable fling");
                view.removeCallbacks(runnable);
                fieldOLrzqt.set(this, null);
            }
            if (overScroller == null || overScroller.isFinished()) {
                return;
            }
            StateListAnimator.EZpvd("UDViewPagerAppbarLayoutBehavior", "stop overScroller fling");
            overScroller.abortAnimation();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onStartNestedScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z */
    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        Application application;
        StateListAnimator.EZpvd("UDViewPagerAppbarLayoutBehavior", "onStartNestedScroll");
        OLrzqt(appBarLayout);
        boolean zOnStartNestedScroll = super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i, i2);
        if (zOnStartNestedScroll && (application = this.AEQbTJ) != null) {
            application.copydefault(i2);
        }
        return zOnStartNestedScroll;
    }

    /* JADX DEBUG: Method merged with bridge method: onNestedPreScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V */
    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        StateListAnimator.EZpvd("UDViewPagerAppbarLayoutBehavior", "onNestedPreScroll:" + appBarLayout.getTotalScrollRange() + " ,dx:" + i + " ,dy:" + i2 + " ,type:" + i3);
        if (i3 == 1) {
            this.OLrzqt = true;
        }
        if (this.gEmmrt) {
            return;
        }
        super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        Application application = this.AEQbTJ;
        if (application != null) {
            application.copydefault(i, i2, i3);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onNestedScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;IIIII)V */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
        StateListAnimator.EZpvd("UDViewPagerAppbarLayoutBehavior", "onNestedScroll: target:" + view.getClass() + " ," + appBarLayout.getTotalScrollRange() + " ,dxConsumed:" + i + " ,dyConsumed:" + i2 + " ,type:" + i5);
        if (this.gEmmrt) {
            return;
        }
        super.onNestedScroll(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5);
    }

    /* JADX DEBUG: Method merged with bridge method: onStopNestedScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;I)V */
    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        StateListAnimator.EZpvd("UDViewPagerAppbarLayoutBehavior", "onStopNestedScroll, target: " + view.getClass().getSimpleName() + ", type:" + i);
        super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i);
        this.OLrzqt = false;
        this.gEmmrt = false;
        Application application = this.AEQbTJ;
        if (application != null) {
            application.AEQbTJ(i, this.KWHzl);
        }
        this.KWHzl = false;
    }

    /* JADX DEBUG: Method merged with bridge method: onTouchEvent(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z */
    @Override // com.google.android.material.appbar.AppBarLayout.Behavior, com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull MotionEvent motionEvent) {
        if (this.AhwBna && ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && appBarLayout.getChildCount() > 0)) {
            this.EZpvd = appBarLayout.getHeight();
            this.copydefault = appBarLayout.getChildAt(0).getMinimumHeight();
        }
        return super.onTouchEvent(coordinatorLayout, appBarLayout, motionEvent);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.Behavior, com.google.android.material.appbar.ViewOffsetBehavior
    public boolean setTopAndBottomOffset(int i) {
        int i2;
        int i3;
        StateListAnimator.EZpvd("UDViewPagerAppbarLayoutBehavior", "setTopAndBottomOffset useOffsetLimit=====" + this.AhwBna + "   offset====" + i + "   headerHeight===" + this.EZpvd + "   headerMiniHeight====" + this.copydefault);
        Application application = this.AEQbTJ;
        if (application != null) {
            application.AEQbTJ(i, this.EZpvd, this.copydefault);
        }
        if (!this.AhwBna || (i2 = this.EZpvd) <= 0 || (i3 = this.copydefault) <= 0 || (i <= 0 && i >= (-(i2 - i3)))) {
            return super.setTopAndBottomOffset(i);
        }
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: onNestedFling(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FFZ)Z */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean onNestedFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, float f, float f2, boolean z) {
        this.KWHzl = true;
        return super.onNestedFling(coordinatorLayout, appBarLayout, view, f, f2, z);
    }

    /* JADX DEBUG: Method merged with bridge method: onNestedPreFling(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FF)Z */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, float f, float f2) {
        this.KWHzl = true;
        return super.onNestedPreFling(coordinatorLayout, appBarLayout, view, f, f2);
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static class StateListAnimator {
        public static void EZpvd(String str, String str2) {
        }

        private StateListAnimator() {
        }
    }
}
