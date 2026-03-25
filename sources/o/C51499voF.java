package o;

import android.view.View;
import androidx.autofill.HintConstants;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.social_trade_api.data.BusinessLine;
import com.okinc.unify_trade.biz.HomeSignalItemInfo;
import com.okinc.unify_trade.biz.SignalBotSubsInfoBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import o.InterfaceC49317umK;
import o.InterfaceC8104awT;
import o.wUE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.voF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51499voF extends AbstractC59533zio<HomeSignalItemInfo, ActionBar> {
    public final Function1<HomeSignalItemInfo, Unit> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.biz.HomeSignalItemInfo, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C51499voF(@NotNull Function1<? super HomeSignalItemInfo, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, C48033uCm.Activity.HJWChPdIKEqB, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        return new ActionBar((AbstractC50831vba) viewDataBindingInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, @NotNull HomeSignalItemInfo homeSignalItemInfo) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(homeSignalItemInfo, "");
        AbstractC50831vba abstractC50831vbaEZpvd = actionBar.EZpvd();
        wUE wue = wUE.OLrzqt;
        android.widget.ImageView imageView = abstractC50831vbaEZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        java.lang.String avatar = homeSignalItemInfo.getAvatar();
        if (avatar == null) {
            avatar = "";
        }
        wue.KWHzl(imageView, wUE.Application.m8784constructorimpl$default(avatar, null, 2, null));
        android.widget.FrameLayout frameLayout = abstractC50831vbaEZpvd.AEQbTJ;
        frameLayout.setOnClickListener(new Activity(frameLayout, 1000L, this, homeSignalItemInfo));
        abstractC50831vbaEZpvd.fetchVPNInfo.setText(homeSignalItemInfo.getSignalChanName());
        android.widget.TextView textView = abstractC50831vbaEZpvd.isConnected;
        int i = C55688xof.Application.hpmliR;
        java.lang.String username = homeSignalItemInfo.getUsername();
        if (username == null) {
            username = "";
        }
        textView.setText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt(HintConstants.AUTOFILL_HINT_USERNAME, username))));
        C52794wYp c52794wYp = abstractC50831vbaEZpvd.OLrzqt;
        if (homeSignalItemInfo.isSubscribed() || Intrinsics.EZpvd((java.lang.Object) homeSignalItemInfo.getType(), (java.lang.Object) "created")) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.createSocket);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.OmYuqg);
        }
        c52794wYp.setText(strAYXKKw);
        abstractC50831vbaEZpvd.gEmmrt.setText(C33069mpW.copydefault(C55688xof.Application.ruDxL, C56423yEv.EZpvd(C56390yDp.OLrzqt("dayRange", "30"))));
        android.widget.TextView textView2 = abstractC50831vbaEZpvd.djBIcL;
        java.lang.String annualizedRate = homeSignalItemInfo.getAnnualizedRate();
        if (annualizedRate == null) {
            annualizedRate = "";
        }
        textView2.setText(C56033xvF.fmtBotPnlPercent$default(C56033xvF.KWHzl(annualizedRate), true, 0, 4, null));
        android.widget.TextView textView3 = abstractC50831vbaEZpvd.djBIcL;
        java.lang.String annualizedRate2 = homeSignalItemInfo.getAnnualizedRate();
        if (annualizedRate2 == null) {
            annualizedRate2 = "";
        }
        textView3.setTextColor(C56033xvF.OLrzqt((java.lang.Object) C56033xvF.KWHzl(annualizedRate2)));
        android.widget.TextView textView4 = abstractC50831vbaEZpvd.copydefault;
        xMR xmr = xMR.copydefault;
        java.lang.String totalFollowerCount = homeSignalItemInfo.getTotalFollowerCount();
        if (totalFollowerCount == null) {
            totalFollowerCount = "";
        }
        textView4.setText(xmr.copydefault(totalFollowerCount));
        android.widget.TextView textView5 = abstractC50831vbaEZpvd.DbNXlk;
        java.lang.String followerWinRate = homeSignalItemInfo.getFollowerWinRate();
        textView5.setText(xMR.formatPercent$default(xmr, followerWinRate == null ? "" : followerWinRate, 0, null, 6, null));
        java.lang.String totalFollowerAssets = homeSignalItemInfo.getTotalFollowerAssets();
        abstractC50831vbaEZpvd.AhwBna.setText(xmr.OLrzqt(totalFollowerAssets != null ? totalFollowerAssets : "", 2) + " " + homeSignalItemInfo.getCcy());
        abstractC50831vbaEZpvd.values.setSubscriptionState(false, new SignalBotSubsInfoBean((java.lang.String) null, homeSignalItemInfo.getCcy(), (java.lang.String) null, homeSignalItemInfo.isSubscribed(), homeSignalItemInfo.getProfitSharingRatio(), (java.lang.String) null, (java.lang.String) null, homeSignalItemInfo.getSubscriptionFee(), homeSignalItemInfo.getSubscriptionType(), (java.lang.String) null, (java.lang.String) null, homeSignalItemInfo.getUserSubscriptionType(), 1637, (DefaultConstructorMarker) null));
        android.view.View view = actionBar.itemView;
        view.setOnClickListener(new StateListAnimator(view, 1000L, this, homeSignalItemInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(android.content.Context context, java.lang.String str) {
        if (str == null || str.length() == 0) {
            Intrinsics.copydefault(context, "");
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY((android.app.Activity) context);
            viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.fWSAZA));
            viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.QWSkGZ, new View.OnClickListener() { // from class: o.voI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C51499voF.copydefault(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
            return;
        }
        InterfaceC49317umK interfaceC49317umK = (InterfaceC49317umK) C43251rlk.OLrzqt(InterfaceC49317umK.class);
        if (interfaceC49317umK != null) {
            InterfaceC49317umK.Application.navigateToTraderBusinessLinePage$default(interfaceC49317umK, context, str, BusinessLine.Signal, "signal_square", null, 16, null);
        }
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX INFO: renamed from: o.voF$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final AbstractC50831vba KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC50831vba EZpvd() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull AbstractC50831vba abstractC50831vba) {
            super(abstractC50831vba.getRoot());
            Intrinsics.checkNotNullParameter(abstractC50831vba, "");
            this.KWHzl = abstractC50831vba;
        }
    }

    /* JADX INFO: renamed from: o.voF$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C51499voF OLrzqt;
        public final /* synthetic */ HomeSignalItemInfo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C51499voF c51499voF, HomeSignalItemInfo homeSignalItemInfo) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c51499voF;
            this.copydefault = homeSignalItemInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.AEQbTJ;
                C51499voF c51499voF = this.OLrzqt;
                android.content.Context context = frameLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c51499voF.copydefault(context, this.copydefault.getTraderUniqueName());
            }
        }
    }

    /* JADX INFO: renamed from: o.voF$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C51499voF EZpvd;
        public final /* synthetic */ HomeSignalItemInfo KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C51499voF c51499voF, HomeSignalItemInfo homeSignalItemInfo) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c51499voF;
            this.KWHzl = homeSignalItemInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.view.View view2 = this.copydefault;
                if (C55697xoo.OLrzqt.isConnected()) {
                    this.EZpvd.AEQbTJ.invoke(this.KWHzl);
                    return;
                }
                InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
                if (interfaceC8104awT != null) {
                    android.content.Context context = view2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, context, null, 2, null);
                }
            }
        }
    }
}
