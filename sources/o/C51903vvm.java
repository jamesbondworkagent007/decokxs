package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.SignalBotSubsInfoBean;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vvm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C51903vvm extends AbstractC59533zio<SignalBotSubsInfoBean, Activity> {
    public static final ActionBar Companion = new ActionBar(null);
    public final yHO<SignalBotSubsInfoBean, java.lang.String, java.lang.Integer, Unit> EZpvd;
    public final boolean OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHO<? super com.okinc.unify_trade.biz.SignalBotSubsInfoBean, ? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C51903vvm(boolean z, yHO<? super SignalBotSubsInfoBean, ? super java.lang.String, ? super java.lang.Integer, Unit> yho) {
        this.OLrzqt = z;
        this.EZpvd = yho;
    }

    /* JADX INFO: renamed from: o.vvm$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vvm.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C48452uRy c48452uRyOLrzqt = C48452uRy.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c48452uRyOLrzqt, "");
        return new Activity(c48452uRyOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull SignalBotSubsInfoBean signalBotSubsInfoBean) {
        int fallDownColor$default;
        xMR xmr;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(signalBotSubsInfoBean, "");
        C48452uRy c48452uRyEZpvd = activity.EZpvd();
        c48452uRyEZpvd.valueOf.setText(signalBotSubsInfoBean.getSignalChanName());
        c48452uRyEZpvd.djBIcL.setText(C33069mpW.copydefault(C55688xof.Application.ruDxL, C56423yEv.EZpvd(C56390yDp.OLrzqt("dayRange", pTB.formatLocalized$default("30", null, 1, null)))));
        android.widget.TextView textView = c48452uRyEZpvd.gEmmrt;
        xMR xmr2 = xMR.copydefault;
        java.lang.String annualizedRate = signalBotSubsInfoBean.getAnnualizedRate();
        textView.setText(xMR.formatPercentWithSymbol$default(xmr2, annualizedRate == null ? "" : annualizedRate, 0, 0, null, 14, null));
        if (C33129mqd.AEQbTJ(signalBotSubsInfoBean.getAnnualizedRate(), 0)) {
            fallDownColor$default = C33512mxp.getRiseUpColor$default(C33512mxp.AEQbTJ, 0.0f, 1, null);
        } else {
            fallDownColor$default = C33129mqd.gEmmrt(signalBotSubsInfoBean.getAnnualizedRate(), 0) ? C33512mxp.getFallDownColor$default(C33512mxp.AEQbTJ, 0.0f, 1, null) : C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn);
        }
        textView.setTextColor(fallDownColor$default);
        C52794wYp c52794wYp = c48452uRyEZpvd.AEQbTJ;
        if (this.OLrzqt) {
            Intrinsics.copydefault(c52794wYp);
            c52794wYp.setVisibility(8);
            xmr = xmr2;
        } else {
            Intrinsics.copydefault(c52794wYp);
            c52794wYp.setVisibility(0);
            c52794wYp.setText(C33070mpX.AYXKKw(signalBotSubsInfoBean.isSubscribed() ? C55688xof.Application.createSocket : C55688xof.Application.OmYuqg));
            xmr = xmr2;
            c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this, signalBotSubsInfoBean, activity));
        }
        ConstraintLayout root = c48452uRyEZpvd.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, this, signalBotSubsInfoBean, activity));
        android.widget.TextView textView2 = c48452uRyEZpvd.AkhnZx;
        java.lang.String followerWinRate = signalBotSubsInfoBean.getFollowerWinRate();
        textView2.setText(xMR.formatPercent$default(xmr, followerWinRate == null ? "" : followerWinRate, 0, null, 6, null));
        android.widget.TextView textView3 = c48452uRyEZpvd.KWHzl;
        java.lang.String totalFollowerCount = signalBotSubsInfoBean.getTotalFollowerCount();
        if (totalFollowerCount == null) {
            totalFollowerCount = "";
        }
        textView3.setText(xmr.copydefault(totalFollowerCount));
        int iDpInt$default = C55298xhM.dpInt$default(14.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(textView3.getContext(), C52761wXj.TaskDescription.vLaW);
        if (drawable != null) {
            drawable.setBounds(0, 0, iDpInt$default, iDpInt$default);
            drawable.setTint(ContextCompat.getColor(textView3.getContext(), C52761wXj.Activity.QwvEab));
        } else {
            drawable = null;
        }
        textView3.setCompoundDrawablesRelative(drawable, null, null, null);
        android.widget.TextView textView4 = c48452uRyEZpvd.AYXKKw;
        java.lang.String ccy = signalBotSubsInfoBean.getCcy();
        java.lang.String str = ccy == null ? "" : ccy;
        java.lang.String totalFollowerAssets = signalBotSubsInfoBean.getTotalFollowerAssets();
        textView4.setText(C56033xvF.fmtBotValueToFixedBySymbol$default(str, totalFollowerAssets == null ? "" : totalFollowerAssets, null, true, 2, 4, null));
        c48452uRyEZpvd.copydefault.setSubscriptionState(this.OLrzqt, signalBotSubsInfoBean);
    }

    /* JADX INFO: renamed from: o.vvm$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public final C48452uRy KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C48452uRy EZpvd() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C48452uRy c48452uRy) {
            super(c48452uRy.getRoot());
            Intrinsics.checkNotNullParameter(c48452uRy, "");
            this.KWHzl = c48452uRy;
        }
    }

    /* JADX INFO: renamed from: o.vvm$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ SignalBotSubsInfoBean AEQbTJ;
        public final /* synthetic */ C51903vvm EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ Activity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C51903vvm c51903vvm, SignalBotSubsInfoBean signalBotSubsInfoBean, Activity activity) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c51903vvm;
            this.AEQbTJ = signalBotSubsInfoBean;
            this.copydefault = activity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                yHO yho = this.EZpvd.EZpvd;
                if (yho != null) {
                    SignalBotSubsInfoBean signalBotSubsInfoBean = this.AEQbTJ;
                    yho.invoke(signalBotSubsInfoBean, signalBotSubsInfoBean.isSubscribed() ? "use" : "subscribe", java.lang.Integer.valueOf(this.copydefault.getBindingAdapterPosition()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.vvm$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ SignalBotSubsInfoBean AEQbTJ;
        public final /* synthetic */ C51903vvm EZpvd;
        public final /* synthetic */ Activity KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C51903vvm c51903vvm, SignalBotSubsInfoBean signalBotSubsInfoBean, Activity activity) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = c51903vvm;
            this.AEQbTJ = signalBotSubsInfoBean;
            this.KWHzl = activity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                yHO yho = this.EZpvd.EZpvd;
                if (yho != null) {
                    yho.invoke(this.AEQbTJ, "details", java.lang.Integer.valueOf(this.KWHzl.getBindingAdapterPosition()));
                }
            }
        }
    }
}
