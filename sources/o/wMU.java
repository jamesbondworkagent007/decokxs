package o;

import android.text.TextUtils;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class wMU extends AbstractC59533zio<TacticsInsideItemData, wMV> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public wMV onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.OmJATG, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new wMV(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull wMV wmv, @NotNull TacticsInsideItemData tacticsInsideItemData) {
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl2;
        C55320xhi c55320xhiKWHzl3;
        C55320xhi c55320xhiKWHzl4;
        C55320xhi c55320xhiKWHzl5;
        C55320xhi c55320xhiKWHzl6;
        Intrinsics.checkNotNullParameter(wmv, "");
        Intrinsics.checkNotNullParameter(tacticsInsideItemData, "");
        C55312xha c55312xhaValueOf2 = wmv.KWHzl().valueOf();
        if (c55312xhaValueOf2 != null && (c55320xhiKWHzl6 = c55312xhaValueOf2.KWHzl()) != null) {
            c55320xhiKWHzl6.setText(tacticsInsideItemData.getTitle());
        }
        C55312xha c55312xhaValueOf3 = wmv.copydefault().valueOf();
        if (c55312xhaValueOf3 != null && (c55320xhiKWHzl5 = c55312xhaValueOf3.KWHzl()) != null) {
            c55320xhiKWHzl5.setText(tacticsInsideItemData.getText());
        }
        C55312xha c55312xhaValueOf4 = wmv.KWHzl().valueOf();
        if (c55312xhaValueOf4 != null && (c55320xhiKWHzl4 = c55312xhaValueOf4.KWHzl()) != null) {
            c55320xhiKWHzl4.setMaxLines(2);
        }
        C55312xha c55312xhaValueOf5 = wmv.KWHzl().valueOf();
        if (c55312xhaValueOf5 != null && (c55320xhiKWHzl3 = c55312xhaValueOf5.KWHzl()) != null) {
            c55320xhiKWHzl3.setEllipsize(TextUtils.TruncateAt.END);
        }
        if (tacticsInsideItemData.getTextStyle() != 0 && (c55312xhaValueOf = wmv.copydefault().valueOf()) != null && (c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl2.setTextAppearance(tacticsInsideItemData.getTextStyle());
        }
        int tvColor = tacticsInsideItemData.getTvColor() != 0 ? tacticsInsideItemData.getTvColor() : C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn);
        C55312xha c55312xhaValueOf6 = wmv.copydefault().valueOf();
        if (c55312xhaValueOf6 == null || (c55320xhiKWHzl = c55312xhaValueOf6.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setTextColor(tvColor);
    }
}
