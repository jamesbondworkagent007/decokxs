package com.okinc.buysell.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class RecentSearchBehavior extends CoordinatorLayout.Behavior<ConstraintLayout> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: onStartNestedScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean onStartNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull ConstraintLayout constraintLayout, @NotNull View view, @NotNull View view2, int i, int i2) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "");
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        return (i & 2) != 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentSearchBehavior(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
    }

    /* JADX DEBUG: Method merged with bridge method: onNestedPreScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onNestedPreScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull ConstraintLayout constraintLayout, @NotNull View view, int i, int i2, @NotNull int[] iArr, int i3) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "");
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        super.onNestedPreScroll(coordinatorLayout, constraintLayout, view, i, i2, iArr, i3);
        if (constraintLayout.getHeight() + view.getHeight() >= coordinatorLayout.getHeight() && i2 > 0) {
            float translationY = constraintLayout.getTranslationY() - i2;
            if (translationY >= (-constraintLayout.getHeight())) {
                iArr[1] = i2;
                constraintLayout.setTranslationY(translationY);
            } else {
                iArr[1] = constraintLayout.getHeight() + ((int) constraintLayout.getTranslationY());
                constraintLayout.setTranslationY(-constraintLayout.getHeight());
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onNestedScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;IIIII[I)V */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull ConstraintLayout constraintLayout, @NotNull View view, int i, int i2, int i3, int i4, int i5, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "");
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        super.onNestedScroll(coordinatorLayout, constraintLayout, view, i, i2, i3, i4, i5, iArr);
        if (i4 < 0) {
            float translationY = constraintLayout.getTranslationY() - i4;
            if (translationY <= 0.0f) {
                constraintLayout.setTranslationY(translationY);
            } else {
                constraintLayout.setTranslationY(0.0f);
            }
        }
    }
}
