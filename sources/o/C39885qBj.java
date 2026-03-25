package o;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qBj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39885qBj extends qNY {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.qNY, o.AbstractC40510qYn
    /* JADX INFO: renamed from: KWHzl */
    public C42844reA AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42844reA c42844reAAEQbTJ = super.AEQbTJ(layoutInflater, viewGroup);
        android.view.View root = c42844reAAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = C55298xhM.dpInt$default(1, (android.content.Context) null, 1, (java.lang.Object) null);
            root.setLayoutParams(layoutParams);
            return c42844reAAEQbTJ;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
