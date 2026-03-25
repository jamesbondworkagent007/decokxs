package com.okinc.tradeuilib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes24.dex */
public class FlingBehavior extends AppBarLayout.Behavior {
    public boolean EZpvd;
    public boolean copydefault;

    public FlingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX DEBUG: Method merged with bridge method: onInterceptTouchEvent(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z */
    @Override // com.google.android.material.appbar.AppBarLayout.Behavior, com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, MotionEvent motionEvent) {
        this.EZpvd = this.copydefault;
        if (motionEvent.getActionMasked() == 0) {
            OLrzqt(appBarLayout);
        }
        return super.onInterceptTouchEvent(coordinatorLayout, appBarLayout, motionEvent);
    }

    private Field KWHzl() throws NoSuchFieldException {
        Class<? super Object> superclass;
        Class<? super Object> superclass2 = getClass().getSuperclass();
        if (superclass2 != null) {
            try {
                superclass = superclass2.getSuperclass();
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
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

    private Field copydefault() throws NoSuchFieldException {
        Class<? super Object> superclass;
        Class<? super Object> superclass2 = getClass().getSuperclass();
        if (superclass2 != null) {
            try {
                superclass = superclass2.getSuperclass();
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
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

    private void OLrzqt(AppBarLayout appBarLayout) {
        try {
            Field fieldKWHzl = KWHzl();
            Field fieldCopydefault = copydefault();
            if (fieldKWHzl != null) {
                fieldKWHzl.setAccessible(true);
            }
            if (fieldCopydefault != null) {
                fieldCopydefault.setAccessible(true);
            }
            Runnable runnable = fieldKWHzl != null ? (Runnable) fieldKWHzl.get(this) : null;
            OverScroller overScroller = (OverScroller) fieldCopydefault.get(this);
            if (runnable != null) {
                appBarLayout.removeCallbacks(runnable);
                fieldKWHzl.set(this, null);
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

    /* JADX DEBUG: Method merged with bridge method: onStartNestedScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z */
    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        OLrzqt(appBarLayout);
        return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i, i2);
    }

    /* JADX DEBUG: Method merged with bridge method: onNestedPreScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V */
    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            this.copydefault = true;
        }
        if (this.EZpvd) {
            return;
        }
        super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
    }

    /* JADX DEBUG: Method merged with bridge method: onNestedScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;IIIII)V */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
        if (this.EZpvd) {
            return;
        }
        super.onNestedScroll(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5);
    }

    /* JADX DEBUG: Method merged with bridge method: onStopNestedScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;I)V */
    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i);
        this.copydefault = false;
        this.EZpvd = false;
    }
}
