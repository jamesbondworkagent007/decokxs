package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.SignalSortProfitData;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51308vka extends AbstractC59533zio<SignalSortProfitData, C51310vkc> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C51310vkc onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, C48033uCm.Activity.GQzpsZgQzpsZ, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        return new C51310vkc((AbstractC48638uYv) viewDataBindingInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51310vkc c51310vkc, @NotNull SignalSortProfitData signalSortProfitData) {
        Intrinsics.checkNotNullParameter(c51310vkc, "");
        Intrinsics.checkNotNullParameter(signalSortProfitData, "");
        AbstractC48638uYv abstractC48638uYvEZpvd = c51310vkc.EZpvd();
        abstractC48638uYvEZpvd.OLrzqt.setText(signalSortProfitData.OLrzqt());
        abstractC48638uYvEZpvd.copydefault.setText(signalSortProfitData.copydefault());
        abstractC48638uYvEZpvd.AEQbTJ.setText(signalSortProfitData.AEQbTJ());
        abstractC48638uYvEZpvd.AEQbTJ.setTextColor(signalSortProfitData.KWHzl());
    }
}
