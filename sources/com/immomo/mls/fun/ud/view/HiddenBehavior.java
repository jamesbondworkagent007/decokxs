package com.immomo.mls.fun.ud.view;

import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C7343ahz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class HiddenBehavior extends CoordinatorLayout.Behavior<FrameLayout> {
    /* JADX DEBUG: Method merged with bridge method: layoutDependsOn(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean layoutDependsOn(@NotNull CoordinatorLayout coordinatorLayout, @NotNull FrameLayout frameLayout, @NotNull View view) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "");
        Intrinsics.checkNotNullParameter(frameLayout, "");
        Intrinsics.checkNotNullParameter(view, "");
        return view instanceof FrameLayout;
    }

    /* JADX DEBUG: Method merged with bridge method: onDependentViewChanged(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean onDependentViewChanged(@NotNull CoordinatorLayout coordinatorLayout, @NotNull FrameLayout frameLayout, @NotNull View view) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "");
        Intrinsics.checkNotNullParameter(frameLayout, "");
        Intrinsics.checkNotNullParameter(view, "");
        AEQbTJ(frameLayout);
        return false;
    }

    public final void AEQbTJ(View view) {
        int measuredHeight = view.getMeasuredHeight();
        float y = view.getY();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[1];
        View viewFindViewById = view.getRootView().findViewById(C7343ahz.TaskDescription.OLrzqt);
        if (viewFindViewById != null) {
            int measuredHeight2 = viewFindViewById.getMeasuredHeight();
            viewFindViewById.getLocationInWindow(new int[2]);
            view.setY(y - ((((i - r2[1]) - measuredHeight2) + measuredHeight2) + measuredHeight));
            Unit unit = Unit.INSTANCE;
        }
    }
}
