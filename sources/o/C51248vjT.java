package o;

import androidx.recyclerview.widget.GridLayoutManager;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.ProfitInfoItemData;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51248vjT extends AbstractC59533zio<C51245vjQ, C51244vjP> {
    public final C43316rmw copydefault = new C43316rmw();

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C51244vjP onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.iqMDAV, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C51244vjP(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51244vjP c51244vjP, @NotNull C51245vjQ c51245vjQ) {
        Intrinsics.checkNotNullParameter(c51244vjP, "");
        Intrinsics.checkNotNullParameter(c51245vjQ, "");
        c51244vjP.OLrzqt().setLayoutManager(new GridLayoutManager(c51244vjP.itemView.getContext(), 2));
        c51244vjP.OLrzqt().setAdapter(this.copydefault);
        this.copydefault.register(ProfitInfoItemData.class, new C51249vjU());
        C33064mpR.OLrzqt(this.copydefault, (java.util.List<? extends java.lang.Object>) c51245vjQ.OLrzqt());
    }
}
