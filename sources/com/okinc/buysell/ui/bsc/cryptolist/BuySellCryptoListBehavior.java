package com.okinc.buysell.ui.bsc.cryptolist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class BuySellCryptoListBehavior extends CoordinatorLayout.Behavior<RecyclerView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuySellCryptoListBehavior(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
    }

    /* JADX DEBUG: Method merged with bridge method: layoutDependsOn(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean layoutDependsOn(@NotNull CoordinatorLayout coordinatorLayout, @NotNull RecyclerView recyclerView, @NotNull View view) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(view, "");
        return view.getId() == C31351lsQ.Application.DWgRXt;
    }

    /* JADX DEBUG: Method merged with bridge method: onDependentViewChanged(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public boolean onDependentViewChanged(@NotNull CoordinatorLayout coordinatorLayout, @NotNull RecyclerView recyclerView, @NotNull View view) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(view, "");
        float height = view.getHeight() + view.getTranslationY();
        if (height < 0.0f) {
            height = 0.0f;
        }
        recyclerView.setY(height);
        view.setAlpha(1 + (view.getTranslationY() / (view.getHeight() * 0.85f)));
        return true;
    }
}
