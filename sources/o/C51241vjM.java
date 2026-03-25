package o;

import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.PriceRangeItemInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51241vjM extends AbstractC59533zio<PriceRangeItemInfo, C51239vjK> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C51239vjK onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC48477uSw abstractC48477uSwKWHzl = AbstractC48477uSw.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC48477uSwKWHzl, "");
        return new C51239vjK(abstractC48477uSwKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51239vjK c51239vjK, @NotNull PriceRangeItemInfo priceRangeItemInfo) {
        Intrinsics.checkNotNullParameter(c51239vjK, "");
        Intrinsics.checkNotNullParameter(priceRangeItemInfo, "");
        c51239vjK.OLrzqt().copydefault.setTextValue(priceRangeItemInfo.OLrzqt());
        c51239vjK.OLrzqt().EZpvd.setTextValue(C56046xvS.AEQbTJ.EZpvd(priceRangeItemInfo.KWHzl(), priceRangeItemInfo.EZpvd()) + " " + priceRangeItemInfo.AEQbTJ());
    }
}
