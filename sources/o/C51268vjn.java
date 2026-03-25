package o;

import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotParamMultiContentData;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51268vjn extends AbstractC59533zio<BotParamMultiContentData, C51267vjm> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C51267vjm onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.hfdhUn, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C51267vjm(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51267vjm c51267vjm, @NotNull BotParamMultiContentData botParamMultiContentData) {
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        Intrinsics.checkNotNullParameter(c51267vjm, "");
        Intrinsics.checkNotNullParameter(botParamMultiContentData, "");
        C55312xha c55312xhaValueOf = c51267vjm.AEQbTJ().valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl2.setText(botParamMultiContentData.AEQbTJ());
        }
        C55312xha c55312xhaValueOf2 = c51267vjm.AEQbTJ().valueOf();
        if (c55312xhaValueOf2 != null && (c55320xhiKWHzl = c55312xhaValueOf2.KWHzl()) != null) {
            c55320xhiKWHzl.setTypeface(C55051xce.OLrzqt.valueOf());
        }
        KWHzl(c51267vjm.KWHzl(), botParamMultiContentData.EZpvd(), botParamMultiContentData.copydefault());
        KWHzl(c51267vjm.EZpvd(), botParamMultiContentData.KWHzl(), botParamMultiContentData.OLrzqt());
    }

    public final void KWHzl(C55258xgZ c55258xgZ, java.lang.String str, int i) {
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        C55320xhi c55320xhiKWHzl3;
        C55312xha c55312xhaValueOf2 = c55258xgZ.valueOf();
        if (c55312xhaValueOf2 != null && (c55320xhiKWHzl3 = c55312xhaValueOf2.KWHzl()) != null) {
            if (str.length() == 0) {
                str = "--";
            }
            c55320xhiKWHzl3.setText(str);
        }
        C55312xha c55312xhaValueOf3 = c55258xgZ.valueOf();
        if (c55312xhaValueOf3 != null && (c55320xhiKWHzl2 = c55312xhaValueOf3.KWHzl()) != null) {
            c55320xhiKWHzl2.setGravity(8388613);
        }
        if (i == 0 || (c55312xhaValueOf = c55258xgZ.valueOf()) == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setTextColor(i);
    }
}
