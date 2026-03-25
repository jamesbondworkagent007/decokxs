package o;

import android.view.View;
import com.bumptech.glide.Glide;
import com.okinc.unify_trade.bot.data.BotParamItemData;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C48033uCm;
import o.C55688xof;
import o.wUE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51263vji extends AbstractC59533zio<BotParamItemData, C51266vjl> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C51266vjl onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.RgLUBD, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C51266vjl(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ce  */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(@NotNull C51266vjl c51266vjl, @NotNull BotParamItemData botParamItemData) {
        int iCopydefault;
        C55318xhg c55318xhgEZpvd;
        C55320xhi c55320xhiKWHzl;
        C55318xhg c55318xhgEZpvd2;
        C55320xhi c55320xhiKWHzl2;
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl3;
        C55318xhg c55318xhgEZpvd3;
        C55320xhi c55320xhiKWHzl4;
        C55320xhi c55320xhiKWHzl5;
        C55312xha c55312xhaValueOf2;
        C55320xhi c55320xhiKWHzl6;
        C55320xhi c55320xhiKWHzl7;
        Intrinsics.checkNotNullParameter(c51266vjl, "");
        Intrinsics.checkNotNullParameter(botParamItemData, "");
        C55312xha c55312xhaValueOf3 = c51266vjl.KWHzl().valueOf();
        if (c55312xhaValueOf3 != null && (c55320xhiKWHzl7 = c55312xhaValueOf3.KWHzl()) != null) {
            c55320xhiKWHzl7.setText(botParamItemData.getTitle());
        }
        if (C33129mqd.AhwBna(java.lang.Integer.valueOf(botParamItemData.getTitleTextStyle()), 0) && (c55312xhaValueOf2 = c51266vjl.KWHzl().valueOf()) != null && (c55320xhiKWHzl6 = c55312xhaValueOf2.KWHzl()) != null) {
            c55320xhiKWHzl6.setTextAppearance(botParamItemData.getTitleTextStyle());
        }
        if (C33129mqd.AhwBna(java.lang.Integer.valueOf(botParamItemData.getTitleTextColor()), 0)) {
            iCopydefault = botParamItemData.getTitleTextColor();
        } else {
            iCopydefault = botParamItemData.isHeadLine() ? C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn) : C33070mpX.copydefault(C32113mPz.ActionBar.iwGUEr);
        }
        C55312xha c55312xhaValueOf4 = c51266vjl.KWHzl().valueOf();
        if (c55312xhaValueOf4 != null && (c55320xhiKWHzl5 = c55312xhaValueOf4.KWHzl()) != null) {
            c55320xhiKWHzl5.setTextColor(iCopydefault);
        }
        C55312xha c55312xhaValueOf5 = c51266vjl.KWHzl().valueOf();
        if (c55312xhaValueOf5 != null && (c55320xhiKWHzl4 = c55312xhaValueOf5.KWHzl()) != null) {
            c55320xhiKWHzl4.setTypeface(C55051xce.OLrzqt.valueOf());
        }
        if (botParamItemData.getDoubtMsg().length() > 0) {
            C55312xha c55312xhaValueOf6 = c51266vjl.KWHzl().valueOf();
            if (c55312xhaValueOf6 != null && (c55318xhgEZpvd3 = c55312xhaValueOf6.EZpvd()) != null) {
                c55318xhgEZpvd3.setVisibility(0);
            }
            C55258xgZ c55258xgZKWHzl = c51266vjl.KWHzl();
            c55258xgZKWHzl.setOnClickListener(new StateListAnimator(c55258xgZKWHzl, 1000L, c51266vjl, botParamItemData));
        } else {
            C55312xha c55312xhaValueOf7 = c51266vjl.KWHzl().valueOf();
            if (c55312xhaValueOf7 != null && (c55318xhgEZpvd = c55312xhaValueOf7.EZpvd()) != null) {
                c55318xhgEZpvd.setVisibility(8);
            }
        }
        if (C33129mqd.AhwBna(java.lang.Integer.valueOf(botParamItemData.getTextStyle()), 0) && (c55312xhaValueOf = c51266vjl.AEQbTJ().valueOf()) != null && (c55320xhiKWHzl3 = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl3.setTextAppearance(botParamItemData.getTextStyle());
        }
        c51266vjl.AEQbTJ().setTextColor(botParamItemData.getTextColor());
        C55312xha c55312xhaValueOf8 = c51266vjl.AEQbTJ().valueOf();
        if (c55312xhaValueOf8 != null && (c55320xhiKWHzl2 = c55312xhaValueOf8.KWHzl()) != null) {
            c55320xhiKWHzl2.setText(botParamItemData.getText());
        }
        C55312xha c55312xhaValueOf9 = c51266vjl.AEQbTJ().valueOf();
        if (c55312xhaValueOf9 != null && (c55318xhgEZpvd2 = c55312xhaValueOf9.EZpvd()) != null) {
            c55318xhgEZpvd2.setVisibility(botParamItemData.getRightDoubtMsg().length() > 0 ? 0 : 8);
        }
        C55312xha c55312xhaValueOf10 = c51266vjl.AEQbTJ().valueOf();
        if (c55312xhaValueOf10 != null && (c55320xhiKWHzl = c55312xhaValueOf10.KWHzl()) != null) {
            c55320xhiKWHzl.setGravity(botParamItemData.getRightDoubtMsg().length() > 0 ? 8388611 : 8388613);
        }
        if (botParamItemData.getRightDoubtMsg().length() > 0) {
            C55258xgZ c55258xgZAEQbTJ = c51266vjl.AEQbTJ();
            c55258xgZAEQbTJ.setOnClickListener(new TaskDescription(c55258xgZAEQbTJ, 1000L, c51266vjl, botParamItemData));
        }
        java.lang.Integer rightImageRes = botParamItemData.getRightImageRes();
        if (rightImageRes != null) {
            int iIntValue = rightImageRes.intValue();
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(c51266vjl.itemView.getContext());
            Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
            if (C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, java.lang.Integer.valueOf(iIntValue), "lfit", 72, 72).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(c51266vjl.itemView.getContext())).EZpvd(c51266vjl.EZpvd()) == null) {
                wUE.OLrzqt.KWHzl(c51266vjl.EZpvd(), wUE.Application.m8784constructorimpl$default(botParamItemData.getRightImage(), null, 2, null));
                Unit unit = Unit.INSTANCE;
            }
        }
        c51266vjl.copydefault().setVisibility(botParamItemData.getShowAvatar() ? 0 : 8);
        android.widget.FrameLayout frameLayoutCopydefault = c51266vjl.copydefault();
        java.lang.Integer rightImageBg = botParamItemData.getRightImageBg();
        frameLayoutCopydefault.setBackground(rightImageBg != null ? C33070mpX.KWHzl(rightImageBg.intValue()) : null);
    }

    /* JADX INFO: renamed from: o.vji$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.vji$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.vji$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ BotParamItemData KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C51266vjl copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C51266vjl c51266vjl, BotParamItemData botParamItemData) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = c51266vjl;
            this.KWHzl = botParamItemData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context context = this.copydefault.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.EZpvd(this.KWHzl.getDoubtMsg());
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), (View.OnClickListener) new Application(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.vji$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C51266vjl OLrzqt;
        public final /* synthetic */ BotParamItemData copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C51266vjl c51266vjl, BotParamItemData botParamItemData) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = c51266vjl;
            this.copydefault = botParamItemData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.content.Context context = this.OLrzqt.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.EZpvd(this.copydefault.getRightDoubtMsg());
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), (View.OnClickListener) new ActionBar(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }
}
