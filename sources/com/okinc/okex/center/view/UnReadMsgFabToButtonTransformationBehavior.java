package com.okinc.okex.center.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.jvm.internal.Intrinsics;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public class UnReadMsgFabToButtonTransformationBehavior extends CoordinatorLayout.Behavior<TransformableFloatingUnReadMsgActionButton> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: onStartNestedScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public boolean onStartNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull TransformableFloatingUnReadMsgActionButton transformableFloatingUnReadMsgActionButton, @NotNull View view, @NotNull View view2, int i, int i2) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "");
        Intrinsics.checkNotNullParameter(transformableFloatingUnReadMsgActionButton, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        return i == 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnReadMsgFabToButtonTransformationBehavior(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Method merged with bridge method: layoutDependsOn(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean layoutDependsOn(@NotNull CoordinatorLayout coordinatorLayout, @NotNull TransformableFloatingUnReadMsgActionButton transformableFloatingUnReadMsgActionButton, @NotNull View view) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "");
        Intrinsics.checkNotNullParameter(transformableFloatingUnReadMsgActionButton, "");
        Intrinsics.checkNotNullParameter(view, "");
        return view.getId() == C47315tni.TaskDescription.gwTjWJ;
    }

    /* JADX DEBUG: Method merged with bridge method: onNestedScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;IIIII[I)V */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull TransformableFloatingUnReadMsgActionButton transformableFloatingUnReadMsgActionButton, @NotNull View view, int i, int i2, int i3, int i4, int i5, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "");
        Intrinsics.checkNotNullParameter(transformableFloatingUnReadMsgActionButton, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        ViewGroup viewGroup = (ViewGroup) view;
        int bottom = viewGroup.getChildAt(0).getBottom();
        int height = viewGroup.getHeight() + viewGroup.getScrollY();
        if (bottom <= height) {
            transformableFloatingUnReadMsgActionButton.KWHzl(coordinatorLayout);
            return;
        }
        ViewGroup.LayoutParams layoutParams = transformableFloatingUnReadMsgActionButton.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (bottom - ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) * 2) >= height) {
            transformableFloatingUnReadMsgActionButton.EZpvd();
        }
    }
}
