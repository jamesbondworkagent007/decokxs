package com.okinc.market_widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.reflect.Field;
import o.C33052mpF;
import o.C6777aVl;

/* JADX INFO: loaded from: classes23.dex */
public class FlingBehavior extends AppBarLayout.Behavior {
    public String OLrzqt;
    public boolean copydefault;

    public FlingBehavior() {
        this.OLrzqt = "FlingBehavior";
        this.copydefault = false;
    }

    public FlingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OLrzqt = "FlingBehavior";
        this.copydefault = false;
    }

    /* JADX DEBUG: Method merged with bridge method: onNestedPreScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V */
    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        if (this.copydefault) {
            if (i3 == 1 && getTopAndBottomOffset() > (-EZpvd(coordinatorLayout.getContext()))) {
                ViewCompat.stopNestedScroll(view, i3);
            }
        } else if (i3 == 1 && getTopAndBottomOffset() == 0) {
            ViewCompat.stopNestedScroll(view, i3);
        }
        super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
    }

    public int EZpvd(Context context) {
        return C33052mpF.EZpvd(212.0f, context);
    }

    /* JADX DEBUG: Method merged with bridge method: onInterceptTouchEvent(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z */
    @Override // com.google.android.material.appbar.AppBarLayout.Behavior, com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            try {
                Object objCopydefault = copydefault(this, "scroller");
                if (objCopydefault != null && (objCopydefault instanceof OverScroller)) {
                    ((OverScroller) objCopydefault).abortAnimation();
                }
            } catch (Exception e) {
                C6777aVl.copydefault(e);
            }
        }
        return super.onInterceptTouchEvent(coordinatorLayout, appBarLayout, motionEvent);
    }

    public final Object copydefault(Object obj, String str) {
        try {
            Field declaredField = obj.getClass().getSuperclass().getSuperclass().getSuperclass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Exception e) {
            Log.getStackTraceString(e);
            return null;
        }
    }
}
