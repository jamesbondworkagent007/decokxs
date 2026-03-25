package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingParam;
import com.okinc.unify_trade.biz.bot.BotCommon;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wOU extends AbstractC59533zio<C52536wPa, Activity> {
    public final Function1<java.lang.String, Unit> KWHzl;
    public final Function1<java.lang.String, Unit> OLrzqt;
    public final yHO<java.lang.String, java.lang.String, java.lang.String, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHO<java.lang.String, java.lang.String, java.lang.String, Unit> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.String, Unit> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.String, Unit> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public wOU(@NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function1<? super java.lang.String, Unit> function12) {
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.copydefault = yho;
        this.OLrzqt = function1;
        this.KWHzl = function12;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull C52536wPa c52536wPa) {
        java.lang.String localized$default;
        java.lang.String totalCycleProfit;
        java.lang.String completedCycles;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(c52536wPa, "");
        StrategyDetailsResponse strategyDetailsResponseOLrzqt = c52536wPa.OLrzqt();
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) (strategyDetailsResponseOLrzqt != null ? strategyDetailsResponseOLrzqt.getOrderType() : null), (java.lang.Object) "contract_dca");
        uNR unrKWHzl = activity.KWHzl();
        android.widget.TextView textView = unrKWHzl.KWHzl;
        if (strategyDetailsResponseOLrzqt == null || (completedCycles = strategyDetailsResponseOLrzqt.getCompletedCycles()) == null || (localized$default = pTB.formatLocalized$default(completedCycles, null, 1, null)) == null) {
            localized$default = "--";
        }
        textView.setText(localized$default);
        android.widget.TextView textView2 = unrKWHzl.AEQbTJ;
        if (zEZpvd) {
            totalCycleProfit = strategyDetailsResponseOLrzqt.getArbitragePnl();
        } else {
            totalCycleProfit = strategyDetailsResponseOLrzqt != null ? strategyDetailsResponseOLrzqt.getTotalCycleProfit() : null;
            if (totalCycleProfit == null) {
                totalCycleProfit = "";
            }
        }
        java.lang.String instId = strategyDetailsResponseOLrzqt != null ? strategyDetailsResponseOLrzqt.getInstId() : null;
        if (instId == null) {
            instId = "";
        }
        java.lang.String instType = strategyDetailsResponseOLrzqt != null ? strategyDetailsResponseOLrzqt.getInstType() : null;
        textView2.setText(C55962xto.EZpvd(totalCycleProfit, instId, instType != null ? instType : ""));
        textView2.setTextColor(C56033xvF.OLrzqt((java.lang.Object) totalCycleProfit));
        if (zEZpvd && !strategyDetailsResponseOLrzqt.isHistory()) {
            AEQbTJ(unrKWHzl, strategyDetailsResponseOLrzqt);
        }
        OLrzqt(unrKWHzl, strategyDetailsResponseOLrzqt, c52536wPa.KWHzl());
        EZpvd(unrKWHzl, strategyDetailsResponseOLrzqt, c52536wPa.KWHzl());
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(uNR unr, StrategyDetailsResponse strategyDetailsResponse, StrategyConfigInfo strategyConfigInfo) {
        boolean z;
        BotVo bot;
        BotCommon common;
        java.lang.String str = null;
        AutoEarnStakingParam autoStaking = (strategyDetailsResponse == null || (bot = strategyDetailsResponse.getBot()) == null || (common = bot.getCommon()) == null) ? null : common.getAutoStaking();
        java.lang.String status = autoStaking != null ? autoStaking.getStatus() : null;
        java.lang.String totalProfit = autoStaking != null ? autoStaking.getTotalProfit() : null;
        if (totalProfit == null) {
            totalProfit = "";
        }
        java.lang.String instId = strategyDetailsResponse != null ? strategyDetailsResponse.getInstId() : null;
        java.lang.String str2 = instId == null ? "" : instId;
        java.lang.String instType = strategyDetailsResponse != null ? strategyDetailsResponse.getInstType() : null;
        java.lang.String str3 = instType == null ? "" : instType;
        java.lang.String investCcy = strategyDetailsResponse != null ? strategyDetailsResponse.getInvestCcy() : null;
        kotlin.Pair pairCopydefault = C55884xsP.copydefault(totalProfit, status, str2, str3, investCcy == null ? "" : investCcy, (64 & 32) != 0, (64 & 64) != 0 ? null : null, (64 & 128) != 0 ? false : false);
        java.lang.String str4 = (java.lang.String) pairCopydefault.component1();
        int iIntValue = ((java.lang.Number) pairCopydefault.component2()).intValue();
        java.lang.String vipLevel = strategyConfigInfo != null ? strategyConfigInfo.getVipLevel() : null;
        if (status == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) status)) {
            if (C33129mqd.KWHzl((java.util.Collection) (strategyConfigInfo != null ? strategyConfigInfo.getAutoStaking() : null))) {
                str = vipLevel;
            }
        } else if (!yDY.gEmmrt("default", "vip_dropout").contains(status)) {
        }
        if (strategyDetailsResponse != null) {
            z = (!strategyDetailsResponse.getShouldShowAutoStake() || autoStaking == null || str4 == null) ? false : true;
        }
        LinearLayoutCompat linearLayoutCompat = unr.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(z ? 0 : 8);
        if (z) {
            C55258xgZ c55258xgZ = unr.fetchVPNInfo;
            c55258xgZ.setOnClickListener(new ActionBar(c55258xgZ, 1000L, this));
            unr.values.setLevel(str);
            android.widget.TextView textView = unr.isConnected;
            textView.setText(str4);
            textView.setTextColor(iIntValue);
            textView.setOnClickListener(new LoaderManager(textView, 1000L, this));
            android.widget.ImageView imageView = unr.gEmmrt;
            imageView.setOnClickListener(new Fragment(imageView, 1000L, this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(uNR unr, StrategyDetailsResponse strategyDetailsResponse, StrategyConfigInfo strategyConfigInfo) {
        boolean z;
        BotVo bot;
        BotCommon common;
        java.lang.String str = null;
        AutoEarnStakingParam autoEarn = (strategyDetailsResponse == null || (bot = strategyDetailsResponse.getBot()) == null || (common = bot.getCommon()) == null) ? null : common.getAutoEarn();
        java.lang.String status = autoEarn != null ? autoEarn.getStatus() : null;
        java.lang.String totalProfit = autoEarn != null ? autoEarn.getTotalProfit() : null;
        if (totalProfit == null) {
            totalProfit = "";
        }
        java.lang.String instId = strategyDetailsResponse != null ? strategyDetailsResponse.getInstId() : null;
        java.lang.String str2 = instId == null ? "" : instId;
        java.lang.String instType = strategyDetailsResponse != null ? strategyDetailsResponse.getInstType() : null;
        java.lang.String str3 = instType == null ? "" : instType;
        java.lang.String investCcy = strategyDetailsResponse != null ? strategyDetailsResponse.getInvestCcy() : null;
        kotlin.Pair pairCopydefault = C55884xsP.copydefault(totalProfit, status, str2, str3, investCcy == null ? "" : investCcy, (64 & 32) != 0, (64 & 64) != 0 ? null : null, (64 & 128) != 0 ? false : false);
        java.lang.String str4 = (java.lang.String) pairCopydefault.component1();
        int iIntValue = ((java.lang.Number) pairCopydefault.component2()).intValue();
        java.lang.String vipLevel = strategyConfigInfo != null ? strategyConfigInfo.getVipLevel() : null;
        if (status == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) status)) {
            if (C33129mqd.KWHzl((java.util.Collection) (strategyConfigInfo != null ? strategyConfigInfo.getAutoEarn() : null))) {
                str = vipLevel;
            }
        } else if (!yDY.gEmmrt("default", "vip_dropout").contains(status)) {
        }
        if (strategyDetailsResponse != null) {
            z = (!strategyDetailsResponse.getShouldShowAutoEarn() || autoEarn == null || str4 == null) ? false : true;
        }
        LinearLayoutCompat linearLayoutCompat = unr.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(z ? 0 : 8);
        if (z) {
            C55258xgZ c55258xgZ = unr.OLrzqt;
            c55258xgZ.setOnClickListener(new StateListAnimator(c55258xgZ, 1000L, this));
            unr.AkhnZx.setLevel(str);
            android.widget.TextView textView = unr.djBIcL;
            textView.setText(str4);
            textView.setTextColor(iIntValue);
            textView.setOnClickListener(new Application(textView, 1000L, this));
            android.widget.ImageView imageView = unr.EZpvd;
            imageView.setOnClickListener(new TaskDescription(imageView, 1000L, this));
        }
    }

    public final void AEQbTJ(uNR unr, StrategyDetailsResponse strategyDetailsResponse) {
        java.lang.String instId = strategyDetailsResponse.getInstId();
        java.lang.String instType = strategyDetailsResponse.getInstType();
        java.lang.String fundingFee = strategyDetailsResponse.getFundingFee();
        LinearLayoutCompat linearLayoutCompat = unr.AhwBna;
        Intrinsics.copydefault(linearLayoutCompat);
        linearLayoutCompat.setVisibility(0);
        linearLayoutCompat.setOnClickListener(new PendingIntent(linearLayoutCompat, 1000L, this, instId, instType, fundingFee));
        android.widget.TextView textView = unr.valueOf;
        textView.setText(C56033xvF.getBotPnl$default(instId, instType, fundingFee, null, true, true, null, false, null, null, null, 1992, null));
        textView.setTextColor(C56033xvF.OLrzqt((java.lang.Object) fundingFee));
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        uNR unrKWHzl = uNR.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(unrKWHzl, "");
        return new Activity(unrKWHzl);
    }

    public static final class Activity extends RecyclerView.ViewHolder {
        public final uNR copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final uNR KWHzl() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull uNR unr) {
            super(unr.getRoot());
            Intrinsics.checkNotNullParameter(unr, "");
            this.copydefault = unr;
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ wOU AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, wOU wou) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = wou;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.copydefault().invoke("auto_education_single_staking");
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ wOU EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, wOU wou) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = wou;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.KWHzl().invoke("auto_education_single_earn");
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ wOU AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, wOU wou) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = wou;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.KWHzl().invoke("auto_education_single_staking");
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ wOU copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, wOU wou) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = wou;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.KWHzl().invoke("auto_education_single_staking");
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ wOU AhwBna;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, wOU wou, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AhwBna = wou;
            this.KWHzl = str;
            this.AEQbTJ = str2;
            this.copydefault = str3;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AhwBna.EZpvd().invoke(this.KWHzl, this.AEQbTJ, this.copydefault);
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ wOU KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, wOU wou) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = wou;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.copydefault().invoke("auto_education_single_earn");
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ wOU AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, wOU wou) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = wou;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.KWHzl().invoke("auto_education_single_earn");
            }
        }
    }
}
