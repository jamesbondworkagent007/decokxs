package o;

import android.view.View;
import com.okinc.unify_trade.bot.data.BotParamColorItemData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51261vjg extends AbstractC59533zio<BotParamColorItemData, C51262vjh> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C51262vjh onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.RkASWs, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C51262vjh(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C51262vjh c51262vjh, @NotNull BotParamColorItemData botParamColorItemData) {
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf2;
        C55320xhi c55320xhiKWHzl2;
        C55320xhi c55320xhiKWHzl3;
        android.graphics.Typeface typefaceOLrzqt;
        C55320xhi c55320xhiKWHzl4;
        C55320xhi c55320xhiKWHzl5;
        C55320xhi c55320xhiKWHzl6;
        C55320xhi c55320xhiKWHzl7;
        Intrinsics.checkNotNullParameter(c51262vjh, "");
        Intrinsics.checkNotNullParameter(botParamColorItemData, "");
        C55312xha c55312xhaValueOf3 = c51262vjh.OLrzqt().valueOf();
        if (c55312xhaValueOf3 != null && (c55320xhiKWHzl7 = c55312xhaValueOf3.KWHzl()) != null) {
            c55320xhiKWHzl7.setText(botParamColorItemData.getTitle());
        }
        C55312xha c55312xhaValueOf4 = c51262vjh.OLrzqt().valueOf();
        if (c55312xhaValueOf4 != null && (c55320xhiKWHzl6 = c55312xhaValueOf4.KWHzl()) != null) {
            c55320xhiKWHzl6.setTypeface(C55051xce.OLrzqt.valueOf());
        }
        C55312xha c55312xhaValueOf5 = c51262vjh.OLrzqt().valueOf();
        if (c55312xhaValueOf5 != null) {
            java.lang.String leftDoubtMsg = botParamColorItemData.getLeftDoubtMsg();
            c55312xhaValueOf5.setShowUnderline(leftDoubtMsg != null && (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) leftDoubtMsg) ^ true));
        }
        C55258xgZ c55258xgZOLrzqt = c51262vjh.OLrzqt();
        c55258xgZOLrzqt.setOnClickListener(new StateListAnimator(c55258xgZOLrzqt, 1000L, this, botParamColorItemData));
        C55312xha c55312xhaValueOf6 = c51262vjh.copydefault().valueOf();
        if (c55312xhaValueOf6 != null && (c55320xhiKWHzl5 = c55312xhaValueOf6.KWHzl()) != null) {
            java.lang.String text = botParamColorItemData.getText();
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) text)) {
                text = "--";
            }
            c55320xhiKWHzl5.setText(text);
        }
        C55312xha c55312xhaValueOf7 = c51262vjh.copydefault().valueOf();
        if (c55312xhaValueOf7 != null && (c55320xhiKWHzl4 = c55312xhaValueOf7.KWHzl()) != null) {
            c55320xhiKWHzl4.setGravity(8388613);
        }
        C55312xha c55312xhaValueOf8 = c51262vjh.copydefault().valueOf();
        if (c55312xhaValueOf8 != null && (c55320xhiKWHzl3 = c55312xhaValueOf8.KWHzl()) != null) {
            int rightTextStyle = botParamColorItemData.getRightTextStyle();
            if (rightTextStyle == 1) {
                typefaceOLrzqt = C55051xce.OLrzqt.OLrzqt();
            } else if (rightTextStyle == 2) {
                typefaceOLrzqt = C55051xce.OLrzqt.AEQbTJ();
            } else {
                typefaceOLrzqt = C55051xce.OLrzqt.valueOf();
            }
            c55320xhiKWHzl3.setTypeface(typefaceOLrzqt);
        }
        if (botParamColorItemData.getRightTextColor() != 0 && (c55312xhaValueOf2 = c51262vjh.copydefault().valueOf()) != null && (c55320xhiKWHzl2 = c55312xhaValueOf2.KWHzl()) != null) {
            c55320xhiKWHzl2.setTextColor(botParamColorItemData.getRightTextColor());
        }
        if (!C33129mqd.AEQbTJ(java.lang.Float.valueOf(botParamColorItemData.getRightTextSize()), java.lang.Float.valueOf(0.0f)) || (c55312xhaValueOf = c51262vjh.copydefault().valueOf()) == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setTextSize(2, botParamColorItemData.getRightTextSize());
    }

    public final void AEQbTJ(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (str2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(str);
        viewOnClickListenerC54939xaY.EZpvd(str2);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.fjfviF), new View.OnClickListener() { // from class: o.vjj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51261vjg.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX INFO: renamed from: o.vjg$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C51261vjg EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ BotParamColorItemData OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C51261vjg c51261vjg, BotParamColorItemData botParamColorItemData) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c51261vjg;
            this.OLrzqt = botParamColorItemData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C55258xgZ c55258xgZ = (C55258xgZ) this.KWHzl;
                C51261vjg c51261vjg = this.EZpvd;
                android.content.Context context = c55258xgZ.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c51261vjg.AEQbTJ(context, this.OLrzqt.getLeftDoubtTitle(), this.OLrzqt.getLeftDoubtMsg());
            }
        }
    }
}
