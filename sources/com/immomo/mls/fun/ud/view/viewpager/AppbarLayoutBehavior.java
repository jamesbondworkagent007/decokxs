package com.immomo.mls.fun.ud.view.viewpager;

import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes14.dex */
public class AppbarLayoutBehavior extends AppBarLayout.ScrollingViewBehavior {
    public boolean AEQbTJ;
    public boolean KWHzl;
    public ActionBar copydefault;

    public interface ActionBar {
        void copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(ActionBar actionBar) {
        this.copydefault = actionBar;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        ActionBar actionBar = this.copydefault;
        if (actionBar != null) {
            actionBar.copydefault();
        }
        return super.onDependentViewChanged(coordinatorLayout, view, view2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.KWHzl = this.AEQbTJ;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 3) {
            OLrzqt(view);
        }
        return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
    }

    private Field copydefault() throws NoSuchFieldException {
        Class<? super Object> superclass;
        Class<? super Object> superclass2 = getClass().getSuperclass();
        if (superclass2 != null) {
            try {
                superclass = superclass2.getSuperclass();
            } catch (NoSuchFieldException unused) {
                Class<? super Object> superclass3 = superclass2.getSuperclass().getSuperclass();
                if (superclass3 != null) {
                    return superclass3.getDeclaredField("flingRunnable");
                }
            }
        } else {
            superclass = null;
        }
        if (superclass != null) {
            return superclass.getDeclaredField("mFlingRunnable");
        }
        return null;
    }

    private Field EZpvd() throws NoSuchFieldException {
        Class<? super Object> superclass;
        Class<? super Object> superclass2 = getClass().getSuperclass();
        if (superclass2 != null) {
            try {
                superclass = superclass2.getSuperclass();
            } catch (NoSuchFieldException unused) {
                Class<? super Object> superclass3 = superclass2.getSuperclass().getSuperclass();
                if (superclass3 != null) {
                    return superclass3.getDeclaredField("scroller");
                }
            }
        } else {
            superclass = null;
        }
        if (superclass != null) {
            return superclass.getDeclaredField("mScroller");
        }
        return null;
    }

    private void OLrzqt(View view) {
        try {
            Field fieldCopydefault = copydefault();
            Field fieldEZpvd = EZpvd();
            if (fieldCopydefault != null) {
                fieldCopydefault.setAccessible(true);
            }
            if (fieldEZpvd != null) {
                fieldEZpvd.setAccessible(true);
            }
            Runnable runnable = fieldCopydefault != null ? (Runnable) fieldCopydefault.get(this) : null;
            OverScroller overScroller = (OverScroller) fieldEZpvd.get(this);
            if (runnable != null) {
                Activity.KWHzl("AppbarLayoutBehavior", "存在flingRunnable");
                view.removeCallbacks(runnable);
                fieldCopydefault.set(this, null);
            }
            if (overScroller == null || overScroller.isFinished()) {
                return;
            }
            overScroller.abortAnimation();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        Activity.KWHzl("AppbarLayoutBehavior", "onStartNestedScroll");
        OLrzqt(view);
        return super.onStartNestedScroll(coordinatorLayout, view, view2, view3, i, i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        Activity.KWHzl("AppbarLayoutBehavior", "onNestedPreScroll: ,dx:" + i + " ,dy:" + i2 + " ,type:" + i3);
        if (i3 == 1) {
            this.AEQbTJ = true;
        }
        if (this.KWHzl) {
            return;
        }
        super.onNestedPreScroll(coordinatorLayout, view, view2, i, i2, iArr, i3);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        Activity.KWHzl("AppbarLayoutBehavior", "onNestedScroll: target:" + view2.getClass() + " , ,dxConsumed:" + i + " ,dyConsumed:" + i2 + " ,type:" + i5);
        if (this.KWHzl) {
            return;
        }
        super.onNestedScroll(coordinatorLayout, view, view2, i, i2, i3, i4, i5);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        Activity.KWHzl("AppbarLayoutBehavior", "onStopNestedScroll");
        super.onStopNestedScroll(coordinatorLayout, view, view2, i);
        this.AEQbTJ = false;
        this.KWHzl = false;
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static class Activity {
        public static void KWHzl(String str, String str2) {
        }

        private Activity() {
        }
    }
}
