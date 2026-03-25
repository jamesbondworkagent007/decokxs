package o;

import com.okinc.tradingbot.impl.strategy.itembinder.TacticsRemindData;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wOB extends AbstractC59533zio<TacticsRemindData, wNZ> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public wNZ onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.gwwzsY, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new wNZ(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull wNZ wnz, @NotNull TacticsRemindData tacticsRemindData) {
        Intrinsics.checkNotNullParameter(wnz, "");
        Intrinsics.checkNotNullParameter(tacticsRemindData, "");
        wnz.AEQbTJ().setText(tacticsRemindData.AEQbTJ());
        wnz.OLrzqt().setVisibility(tacticsRemindData.EZpvd() ? 0 : 8);
    }
}
