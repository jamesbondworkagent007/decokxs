package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.bot.BotRecommendDetailItem;
import com.okinc.unify_trade.biz.bot.FontStyleBean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class vTR extends AbstractC59533zio<BotRecommendDetailItem, ActionBar> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC48499uTr abstractC48499uTrCopydefault = AbstractC48499uTr.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC48499uTrCopydefault, "");
        return new ActionBar(abstractC48499uTrCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, @NotNull BotRecommendDetailItem botRecommendDetailItem) {
        java.lang.Integer color;
        java.lang.Integer fontStyle;
        C55320xhi c55320xhiKWHzl;
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(botRecommendDetailItem, "");
        AbstractC48499uTr abstractC48499uTrEZpvd = actionBar.EZpvd();
        C55312xha c55312xhaValueOf = abstractC48499uTrEZpvd.EZpvd.valueOf();
        if (c55312xhaValueOf != null) {
            c55312xhaValueOf.setShowUnderline(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) botRecommendDetailItem.getDoubt()));
        }
        C55312xha c55312xhaValueOf2 = abstractC48499uTrEZpvd.EZpvd.valueOf();
        if (c55312xhaValueOf2 != null && (c55320xhiKWHzl = c55312xhaValueOf2.KWHzl()) != null) {
            c55320xhiKWHzl.setText(botRecommendDetailItem.getTitle());
        }
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) botRecommendDetailItem.getDoubt())) {
            C55312xha c55312xhaValueOf3 = abstractC48499uTrEZpvd.EZpvd.valueOf();
            if (c55312xhaValueOf3 != null) {
                c55312xhaValueOf3.setOnClickListener(new TaskDescription(c55312xhaValueOf3, 1000L, abstractC48499uTrEZpvd, botRecommendDetailItem));
            }
        } else {
            C55312xha c55312xhaValueOf4 = abstractC48499uTrEZpvd.EZpvd.valueOf();
            if (c55312xhaValueOf4 != null) {
                c55312xhaValueOf4.setOnClickListener(null);
            }
        }
        android.widget.TextView textView = abstractC48499uTrEZpvd.OLrzqt;
        textView.setText(botRecommendDetailItem.getValue());
        FontStyleBean valueFont = botRecommendDetailItem.getValueFont();
        textView.setTextAppearance((valueFont == null || (fontStyle = valueFont.getFontStyle()) == null) ? C32113mPz.Dialog.fIwbmz : fontStyle.intValue());
        FontStyleBean valueFont2 = botRecommendDetailItem.getValueFont();
        textView.setTextColor((valueFont2 == null || (color = valueFont2.getColor()) == null) ? C33070mpX.copydefault(C52761wXj.Activity.DeEinT) : color.intValue());
        int layoutPosition = actionBar.getLayoutPosition() % 2;
        android.view.View root = abstractC48499uTrEZpvd.getRoot();
        android.widget.LinearLayout linearLayout = root instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) root : null;
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginStart(layoutPosition == 1 ? C55298xhM.dpInt$default(12.0f, (android.content.Context) null, 1, (java.lang.Object) null) : 0);
                marginLayoutParams.setMarginEnd(layoutPosition != 1 ? C55298xhM.dpInt$default(12.0f, (android.content.Context) null, 1, (java.lang.Object) null) : 0);
            }
        }
        abstractC48499uTrEZpvd.EZpvd.setGravity(layoutPosition == 1 ? 8388613 : 8388611);
        abstractC48499uTrEZpvd.OLrzqt.setGravity(layoutPosition != 1 ? 8388611 : 8388613);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.copydefault = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.copydefault.dismiss();
        }
    }

    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final AbstractC48499uTr OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC48499uTr EZpvd() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull AbstractC48499uTr abstractC48499uTr) {
            super(abstractC48499uTr.getRoot());
            Intrinsics.checkNotNullParameter(abstractC48499uTr, "");
            this.OLrzqt = abstractC48499uTr;
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ BotRecommendDetailItem AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ AbstractC48499uTr copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, AbstractC48499uTr abstractC48499uTr, BotRecommendDetailItem botRecommendDetailItem) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = abstractC48499uTr;
            this.AEQbTJ = botRecommendDetailItem;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context context = this.copydefault.EZpvd.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.EZpvd(this.AEQbTJ.getDoubt());
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), (View.OnClickListener) new Activity(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }
}
