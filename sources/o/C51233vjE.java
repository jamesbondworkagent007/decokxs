package o;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51233vjE extends AbstractC59533zio<C55848xrg, C51231vjC> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C51231vjC onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC50947vdk abstractC50947vdkEZpvd = AbstractC50947vdk.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC50947vdkEZpvd, "");
        return new C51231vjC(abstractC50947vdkEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51231vjC c51231vjC, @NotNull C55848xrg c55848xrg) {
        Intrinsics.checkNotNullParameter(c51231vjC, "");
        Intrinsics.checkNotNullParameter(c55848xrg, "");
        android.view.View root = c51231vjC.OLrzqt().getRoot();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, c55848xrg.KWHzl());
        marginLayoutParams.setMarginStart(c55848xrg.EZpvd());
        marginLayoutParams.setMarginEnd(c55848xrg.EZpvd());
        marginLayoutParams.topMargin = c55848xrg.AEQbTJ();
        marginLayoutParams.bottomMargin = c55848xrg.AEQbTJ();
        root.setLayoutParams(marginLayoutParams);
        root.setBackgroundColor(c55848xrg.OLrzqt());
        android.view.View view = c51231vjC.OLrzqt().EZpvd;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(c55848xrg.copydefault() ? 0 : 8);
    }
}
