package o;

import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.ProfitInfoItemData;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51249vjU extends AbstractC59533zio<ProfitInfoItemData, C51250vjV> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C51250vjV onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.RqmePg, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C51250vjV(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51250vjV c51250vjV, @NotNull ProfitInfoItemData profitInfoItemData) {
        Intrinsics.checkNotNullParameter(c51250vjV, "");
        Intrinsics.checkNotNullParameter(profitInfoItemData, "");
        c51250vjV.OLrzqt().setText(profitInfoItemData.copydefault());
        c51250vjV.EZpvd().setText(profitInfoItemData.AEQbTJ());
        if (profitInfoItemData.KWHzl() != 0) {
            c51250vjV.EZpvd().setTextColor(profitInfoItemData.KWHzl());
        }
    }
}
