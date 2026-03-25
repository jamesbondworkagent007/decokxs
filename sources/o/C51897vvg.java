package o;

import android.text.TextUtils;
import com.okinc.unify_trade.bot.market_place.userpage.BotLeadUserOrderHistoryContentShowData;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vvg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C51897vvg extends AbstractC59533zio<BotLeadUserOrderHistoryContentShowData, C51896vvf> {
    public final android.content.Context KWHzl;

    public C51897vvg(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = context;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C51896vvf onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.zhUgOk, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C51896vvf(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51896vvf c51896vvf, @NotNull BotLeadUserOrderHistoryContentShowData botLeadUserOrderHistoryContentShowData) {
        java.lang.Integer contentColor;
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl2;
        C55320xhi c55320xhiKWHzl3;
        C55320xhi c55320xhiKWHzl4;
        C55320xhi c55320xhiKWHzl5;
        C55320xhi c55320xhiKWHzl6;
        Intrinsics.checkNotNullParameter(c51896vvf, "");
        Intrinsics.checkNotNullParameter(botLeadUserOrderHistoryContentShowData, "");
        C55312xha c55312xhaValueOf2 = c51896vvf.AEQbTJ().valueOf();
        if (c55312xhaValueOf2 != null && (c55320xhiKWHzl6 = c55312xhaValueOf2.KWHzl()) != null) {
            c55320xhiKWHzl6.setText(botLeadUserOrderHistoryContentShowData.getContent());
        }
        C55312xha c55312xhaValueOf3 = c51896vvf.EZpvd().valueOf();
        if (c55312xhaValueOf3 != null && (c55320xhiKWHzl5 = c55312xhaValueOf3.KWHzl()) != null) {
            c55320xhiKWHzl5.setText(botLeadUserOrderHistoryContentShowData.getTitle());
        }
        C55312xha c55312xhaValueOf4 = c51896vvf.EZpvd().valueOf();
        if (c55312xhaValueOf4 != null && (c55320xhiKWHzl4 = c55312xhaValueOf4.KWHzl()) != null) {
            c55320xhiKWHzl4.setMaxLines(2);
        }
        C55312xha c55312xhaValueOf5 = c51896vvf.EZpvd().valueOf();
        if (c55312xhaValueOf5 != null && (c55320xhiKWHzl3 = c55312xhaValueOf5.KWHzl()) != null) {
            c55320xhiKWHzl3.setEllipsize(TextUtils.TruncateAt.END);
        }
        C55312xha c55312xhaValueOf6 = c51896vvf.EZpvd().valueOf();
        if (c55312xhaValueOf6 != null) {
            c55312xhaValueOf6.setShowUnderline(false);
        }
        if (botLeadUserOrderHistoryContentShowData.getTextStyle() != 0 && (c55312xhaValueOf = c51896vvf.AEQbTJ().valueOf()) != null && (c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl2.setTextAppearance(this.KWHzl, botLeadUserOrderHistoryContentShowData.getTextStyle());
        }
        java.lang.Integer contentColor2 = botLeadUserOrderHistoryContentShowData.getContentColor();
        if ((contentColor2 != null && contentColor2.intValue() == 0) || (contentColor = botLeadUserOrderHistoryContentShowData.getContentColor()) == null) {
            return;
        }
        int iIntValue = contentColor.intValue();
        C55312xha c55312xhaValueOf7 = c51896vvf.AEQbTJ().valueOf();
        if (c55312xhaValueOf7 == null || (c55320xhiKWHzl = c55312xhaValueOf7.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setTextColor(iIntValue);
    }
}
