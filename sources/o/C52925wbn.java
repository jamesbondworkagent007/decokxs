package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter.SmartArbiStopConfirmPresenter;
import com.okinc.unify_trade.biz.ArbitrageInfoResponse;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.CostVo;
import com.okinc.unify_trade.biz.EstimatedClosePnlVo;
import com.okinc.unify_trade.biz.GainVo;
import com.okinc.unify_trade.biz.PlaceOrderCondition;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.SmartArbitrageVo;
import com.okinc.unify_trade.biz.StrategyStopReq;
import com.okinc.unify_trade.biz.StrategyStopResponse;
import com.okinc.unify_trade.bot.data.SmartArbProfitsInfo;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C52946wcH;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wbn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52925wbn extends AbstractC49945uyC<uYB, SmartArbiStopConfirmPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public Function0<Unit> AkhnZx;
    public java.lang.String DbNXlk;
    public java.lang.String fetchVPNInfo;
    public java.lang.String valueOf;
    public java.lang.String values;
    public final int AhwBna = C48033uCm.Activity.RckOJh;
    public final boolean KWHzl = true;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.wbw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52925wbn.AYXKKw(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.wbt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52925wbn.values(this.copydefault);
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.wbx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C52925wbn.djBIcL(this.AEQbTJ));
        }
    });
    public boolean djBIcL = true;
    public java.lang.String gEmmrt = "";

    /* JADX INFO: renamed from: o.wbn$Dialog */
    public static final /* synthetic */ class Dialog implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    public static final void KWHzl(android.view.View view) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.wbn$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wbn.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ void show$default(TaskDescription taskDescription, androidx.fragment.app.FragmentManager fragmentManager, TacticsData tacticsData, java.lang.String str, boolean z, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                z = false;
            }
            taskDescription.EZpvd(fragmentManager, tacticsData, str, z, function0);
        }

        public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull TacticsData tacticsData, java.lang.String str, boolean z, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(tacticsData, "");
            Intrinsics.checkNotNullParameter(function0, "");
            C52925wbn c52925wbn = new C52925wbn();
            c52925wbn.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("DATA_PARAM", tacticsData), C56390yDp.OLrzqt("STOP_TYPE_PARAM", str), C56390yDp.OLrzqt("is_earn_params", java.lang.Boolean.valueOf(z))));
            c52925wbn.AkhnZx = function0;
            java.lang.String simpleName = C52925wbn.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            C49662usl.EZpvd(c52925wbn, fragmentManager, simpleName);
        }
    }

    public static final TacticsData AYXKKw(C52925wbn c52925wbn) {
        TacticsData tacticsData;
        android.os.Bundle arguments = c52925wbn.getArguments();
        return (arguments == null || (tacticsData = (TacticsData) arguments.getParcelable("DATA_PARAM")) == null) ? new TacticsData(null, null, null, null, null, null, false, null, null, 0, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, 3, null) : tacticsData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TacticsData fIwbmz() {
        return (TacticsData) this.OLrzqt.getValue();
    }

    public static final java.lang.String values(C52925wbn c52925wbn) {
        android.os.Bundle arguments = c52925wbn.getArguments();
        if (arguments != null) {
            return arguments.getString("STOP_TYPE_PARAM");
        }
        return null;
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final java.lang.String isConnected() {
        return (java.lang.String) this.AYXKKw.getValue();
    }

    public static final boolean djBIcL(C52925wbn c52925wbn) {
        android.os.Bundle arguments = c52925wbn.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("is_earn_params");
        }
        return false;
    }

    public final boolean fJNWhG() {
        return ((java.lang.Boolean) this.AEQbTJ.getValue()).booleanValue();
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AuCTel();
        fARcdN();
        getNewProxyInstance();
        iwGUEr();
        copydefault();
    }

    private final void iwGUEr() {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.setFragmentResultListener("modify_spread_ratio_total_amount", this, new FragmentResultListener() { // from class: o.wbB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C52925wbn.OLrzqt(this.EZpvd, str, bundle);
            }
        });
    }

    public static final void OLrzqt(C52925wbn c52925wbn, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c52925wbn.djBIcL = false;
        c52925wbn.valueOf = bundle.getString("spread_ratio_params");
        c52925wbn.DbNXlk = bundle.getString("unit_amt_params");
        c52925wbn.gEmmrt = bundle.getString("unit_params");
        C55258xgZ c55258xgZ = c52925wbn.values().AEQbTJ;
        xMR xmr = xMR.copydefault;
        java.lang.String str2 = c52925wbn.valueOf;
        c55258xgZ.setTextValue("≥" + xmr.EZpvd(str2 != null ? str2 : "", 3, 0, RoundingMode.FLOOR) + " | " + c52925wbn.DbNXlk + " " + c52925wbn.gEmmrt);
        c52925wbn.copydefault();
    }

    private final void AuCTel() {
        this.gEmmrt = C56033xvF.AEQbTJ(fIwbmz().getInstType(), fIwbmz().getInstId());
        this.djBIcL = true;
    }

    private final void fARcdN() {
        ProfitDetailResponse stakingProfit;
        uYB uybValues = values();
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) isConnected(), (java.lang.Object) OrderDetailListItem.SLIP_OUT);
        android.widget.LinearLayout linearLayout = uybValues.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(zEZpvd ? 8 : 0);
        android.view.View view = uybValues.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(zEZpvd ? 8 : 0);
        vKO vko = uybValues.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(vko, "");
        init$default(this, vko, C48033uCm.Fragment.gGNlxh, 0, 0, 6, null);
        vKO vko2 = uybValues.AhwBna;
        Intrinsics.checkNotNullExpressionValue(vko2, "");
        init$default(this, vko2, C48033uCm.Fragment.DztXDE, 0, 0, 6, null);
        vKO vko3 = uybValues.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(vko3, "");
        init$default(this, vko3, C48033uCm.Fragment.DcMfJKsuEgdN, 0, 0, 6, null);
        vKO vko4 = uybValues.valueOf;
        Intrinsics.checkNotNullExpressionValue(vko4, "");
        init$default(this, vko4, C48033uCm.Fragment.fbC, 0, 0, 6, null);
        vKO vko5 = uybValues.djBIcL;
        Intrinsics.checkNotNullExpressionValue(vko5, "");
        init$default(this, vko5, C48033uCm.Fragment.RcvFxC, 0, 0, 6, null);
        vKO vko6 = uybValues.KWHzl;
        Intrinsics.checkNotNullExpressionValue(vko6, "");
        init$default(this, vko6, C48033uCm.Fragment.iWlNch, 0, 0, 6, null);
        C53021wdd c53021wdd = uybValues.gEmmrt;
        boolean zIsSmartArbitrageWithStaking = fIwbmz().isSmartArbitrageWithStaking();
        SmartArbProfitsInfo smartArbProfitsInfo = fIwbmz().getSmartArbProfitsInfo();
        java.lang.String ccy = (smartArbProfitsInfo == null || (stakingProfit = smartArbProfitsInfo.getStakingProfit()) == null) ? null : stakingProfit.getCcy();
        pDZ pdz = pDZ.KWHzl;
        java.lang.String instFamily = fIwbmz().getInstFamily();
        if (instFamily == null) {
            instFamily = "";
        }
        c53021wdd.AEQbTJ(zIsSmartArbitrageWithStaking, ccy + "/" + pdz.EZpvd(instFamily));
        vKO vko7 = uybValues.values;
        Intrinsics.checkNotNullExpressionValue(vko7, "");
        OLrzqt(vko7, C48033uCm.Fragment.DsL, C52761wXj.LoaderManager.gHZMYf, C52761wXj.LoaderManager.zLjUOn);
        android.widget.LinearLayout linearLayout2 = uybValues.EZpvd;
        linearLayout2.setOnClickListener(new StateListAnimator(linearLayout2, 1000L, this));
        C55258xgZ c55258xgZ = uybValues.AEQbTJ;
        c55258xgZ.setOnClickListener(new Activity(c55258xgZ, 1000L, this));
    }

    public static /* synthetic */ void init$default(C52925wbn c52925wbn, vKO vko, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i2 = C52761wXj.LoaderManager.zuBGHE;
        }
        if ((i4 & 4) != 0) {
            i3 = C52761wXj.LoaderManager.gHZMYf;
        }
        c52925wbn.OLrzqt(vko, i, i2, i3);
    }

    public final void OLrzqt(vKO vko, @androidx.annotation.StringRes int i, @androidx.annotation.StyleRes int i2, @androidx.annotation.StyleRes int i3) {
        C55258xgZ c55258xgZOLrzqt = vko.OLrzqt();
        c55258xgZOLrzqt.setTextAppearance(i2);
        c55258xgZOLrzqt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        vko.setTitle(C33070mpX.AYXKKw(i));
        android.widget.TextView textViewEZpvd = vko.EZpvd();
        textViewEZpvd.setTextAppearance(i3);
        textViewEZpvd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        vko.setValue("--");
    }

    /* JADX INFO: renamed from: o.wbn$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C52925wbn KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C52925wbn c52925wbn) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = c52925wbn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.wbn$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C52925wbn copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C52925wbn c52925wbn) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c52925wbn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.ejfBZ();
            }
        }
    }

    /* JADX INFO: renamed from: o.wbn$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C52925wbn AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C52925wbn c52925wbn) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = c52925wbn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String str;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                SmartArbiStopConfirmPresenter smartArbiStopConfirmPresenterOLrzqt = this.AEQbTJ.OLrzqt();
                java.lang.String algoId = this.AEQbTJ.fIwbmz().getAlgoId();
                java.lang.String strIsConnected = this.AEQbTJ.isConnected();
                java.lang.String str2 = this.AEQbTJ.valueOf;
                smartArbiStopConfirmPresenterOLrzqt.AEQbTJ(new StrategyStopReq(algoId, (java.lang.String) null, (java.lang.String) null, strIsConnected, (str2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2) || (str = this.AEQbTJ.DbNXlk) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) ? null : new PlaceOrderCondition(this.AEQbTJ.valueOf, this.AEQbTJ.DbNXlk), (java.lang.String) null, 38, (DefaultConstructorMarker) null));
            }
        }
    }

    /* JADX INFO: renamed from: o.wbn$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C52925wbn EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C52925wbn c52925wbn) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c52925wbn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.ejfBZ();
            }
        }
    }

    public final void ejfBZ() {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        C52946wcH.StateListAnimator stateListAnimator = C52946wcH.Companion;
        java.lang.String instFamily = fIwbmz().getInstFamily();
        java.lang.String str = instFamily == null ? "" : instFamily;
        java.lang.String totalAmt = fIwbmz().getTotalAmt();
        java.lang.String str2 = totalAmt == null ? "" : totalAmt;
        java.lang.String str3 = this.gEmmrt;
        stateListAnimator.copydefault(EopTrackEvent.CLOSE, str, "simpleFundingFee", str2, str3 == null ? "" : str3, false, this.valueOf, fIwbmz().getAlgoId(), this.DbNXlk, this.values, this.fetchVPNInfo).show(supportFragmentManager, C52946wcH.class.getSimpleName());
    }

    public final void copydefault() {
        OLrzqt().KWHzl(this.valueOf, isConnected());
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097 A[PHI: r9
  0x0097: PHI (r9v49 java.lang.String) = (r9v46 java.lang.String), (r9v51 java.lang.String) binds: [B:63:0x00af, B:52:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(ArbitrageInfoResponse arbitrageInfoResponse) {
        java.lang.String str;
        java.lang.String strEZpvd;
        java.lang.String downToMax$default;
        EstimatedClosePnlVo estimatedClosePnl;
        EstimatedClosePnlVo estimatedClosePnl2;
        CostVo estimatedCloseCost;
        SmartArbitrageVo smartArbitrage;
        EstimatedClosePnlVo estimatedClosePnl3;
        EstimatedClosePnlVo estimatedClosePnl4;
        GainVo estimatedCloseGain;
        EstimatedClosePnlVo estimatedClosePnl5;
        GainVo estimatedCloseGain2;
        BotVo bot;
        EstimatedClosePnlVo estimatedClosePnl6;
        GainVo estimatedCloseGain3;
        java.lang.String spreadRatio;
        java.lang.String unitAmt;
        java.lang.String totalPnl = null;
        if (this.djBIcL) {
            this.valueOf = arbitrageInfoResponse != null ? arbitrageInfoResponse.getSpreadRatio() : null;
            this.DbNXlk = arbitrageInfoResponse != null ? arbitrageInfoResponse.getUnitAmt() : null;
        }
        this.values = arbitrageInfoResponse != null ? arbitrageInfoResponse.getUserExpectSpreadRatio() : null;
        this.fetchVPNInfo = arbitrageInfoResponse != null ? arbitrageInfoResponse.getUserExpectUnitAmt() : null;
        uYB uybValues = values();
        C55258xgZ c55258xgZ = uybValues.AEQbTJ;
        str = "";
        if (this.djBIcL) {
            xMR xmr = xMR.copydefault;
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) (arbitrageInfoResponse != null ? arbitrageInfoResponse.getUserExpectSpreadRatio() : null))) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) (arbitrageInfoResponse != null ? arbitrageInfoResponse.getSpreadRatio() : null))) {
                    spreadRatio = arbitrageInfoResponse != null ? arbitrageInfoResponse.getSpreadRatio() : null;
                    if (spreadRatio == null) {
                    }
                } else {
                    spreadRatio = "--";
                }
                strEZpvd = xmr.EZpvd(spreadRatio, 3, 0, RoundingMode.FLOOR);
                if (C33129mqd.OLrzqt((java.lang.CharSequence) (arbitrageInfoResponse == null ? arbitrageInfoResponse.getUserExpectUnitAmt() : null))) {
                }
            } else {
                spreadRatio = arbitrageInfoResponse != null ? arbitrageInfoResponse.getUserExpectSpreadRatio() : null;
                if (spreadRatio == null) {
                    spreadRatio = "";
                }
                strEZpvd = xmr.EZpvd(spreadRatio, 3, 0, RoundingMode.FLOOR);
                if (C33129mqd.OLrzqt((java.lang.CharSequence) (arbitrageInfoResponse == null ? arbitrageInfoResponse.getUserExpectUnitAmt() : null))) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) (arbitrageInfoResponse != null ? arbitrageInfoResponse.getUnitAmt() : null))) {
                        unitAmt = arbitrageInfoResponse != null ? arbitrageInfoResponse.getUnitAmt() : null;
                        if (unitAmt != null) {
                        }
                    } else {
                        str = "--";
                    }
                    downToMax$default = xMR.formatDownToMax$default(xmr, str, 0, 2, null);
                } else {
                    unitAmt = arbitrageInfoResponse != null ? arbitrageInfoResponse.getUserExpectUnitAmt() : null;
                    if (unitAmt != null) {
                        str = unitAmt;
                    }
                    downToMax$default = xMR.formatDownToMax$default(xmr, str, 0, 2, null);
                }
            }
        } else {
            xMR xmr2 = xMR.copydefault;
            java.lang.String str2 = this.valueOf;
            if (str2 == null) {
                str2 = "";
            }
            strEZpvd = xmr2.EZpvd(str2, 3, 0, RoundingMode.FLOOR);
            java.lang.String str3 = this.DbNXlk;
            downToMax$default = xMR.formatDownToMax$default(xmr2, str3 != null ? str3 : "", 0, 2, null);
        }
        c55258xgZ.setTextValue("≥" + strEZpvd + " | " + downToMax$default + " " + this.gEmmrt);
        vKO vko = uybValues.OLrzqt;
        java.lang.String arbAmt = (arbitrageInfoResponse == null || (estimatedClosePnl6 = arbitrageInfoResponse.getEstimatedClosePnl()) == null || (estimatedCloseGain3 = estimatedClosePnl6.getEstimatedCloseGain()) == null) ? null : estimatedCloseGain3.getArbAmt();
        vko.EZpvd().setTextColor(C56033xvF.OLrzqt((java.lang.Object) arbAmt));
        DisplaySign displaySign = DisplaySign.EXCEPT_ZERO;
        vko.setValue(OLrzqt(arbAmt, displaySign));
        vKO vko2 = uybValues.AhwBna;
        Intrinsics.copydefault(vko2);
        vko2.setVisibility((fIwbmz().isSmartArbitrageWithStaking() || ((bot = fIwbmz().getBot()) != null && bot.isAutoStaking())) ? 0 : 8);
        java.lang.String stakingAmt = (arbitrageInfoResponse == null || (estimatedClosePnl5 = arbitrageInfoResponse.getEstimatedClosePnl()) == null || (estimatedCloseGain2 = estimatedClosePnl5.getEstimatedCloseGain()) == null) ? null : estimatedCloseGain2.getStakingAmt();
        vko2.EZpvd().setTextColor(C56033xvF.OLrzqt((java.lang.Object) stakingAmt));
        vko2.setValue(OLrzqt(stakingAmt, displaySign));
        vKO vko3 = uybValues.KWHzl;
        Intrinsics.copydefault(vko3);
        vko3.setVisibility(fJNWhG() ? 0 : 8);
        java.lang.String autoLendAmt = (arbitrageInfoResponse == null || (estimatedClosePnl4 = arbitrageInfoResponse.getEstimatedClosePnl()) == null || (estimatedCloseGain = estimatedClosePnl4.getEstimatedCloseGain()) == null) ? null : estimatedCloseGain.getAutoLendAmt();
        vko3.EZpvd().setTextColor(C56033xvF.OLrzqt((java.lang.Object) autoLendAmt));
        vko3.EZpvd(false, new View.OnClickListener() { // from class: o.wbu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52925wbn.KWHzl(view);
            }
        });
        vko3.setValue(OLrzqt(autoLendAmt, displaySign));
        vKO vko4 = uybValues.AYXKKw;
        java.lang.String interestAmt = (arbitrageInfoResponse == null || (estimatedClosePnl3 = arbitrageInfoResponse.getEstimatedClosePnl()) == null) ? null : estimatedClosePnl3.getInterestAmt();
        Intrinsics.copydefault(vko4);
        vko4.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) interestAmt) ? 0 : 8);
        vko4.setValue(OLrzqt(interestAmt, displaySign));
        vKO vko5 = uybValues.valueOf;
        BotVo bot2 = fIwbmz().getBot();
        CostVo openCost = (bot2 == null || (smartArbitrage = bot2.getSmartArbitrage()) == null) ? null : smartArbitrage.getOpenCost();
        java.lang.String strAddS$default = C33129mqd.addS$default(C33129mqd.addS$default(openCost != null ? openCost.getSpreadAmt() : null, openCost != null ? openCost.getSpotFeeAmt() : null, null, null, null, 14, null), openCost != null ? openCost.getSwapFeeAmt() : null, null, null, null, 14, null);
        vko5.EZpvd().setTextColor(C56033xvF.OLrzqt((java.lang.Object) strAddS$default));
        Intrinsics.copydefault(vko5);
        vko5.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) strAddS$default) ? 0 : 8);
        vko5.setValue(OLrzqt(strAddS$default, displaySign));
        vKO vko6 = uybValues.djBIcL;
        java.lang.String realizedClosePnl = arbitrageInfoResponse != null ? arbitrageInfoResponse.getRealizedClosePnl() : null;
        vko6.EZpvd().setTextColor(C56033xvF.OLrzqt((java.lang.Object) realizedClosePnl));
        Intrinsics.copydefault(vko6);
        vko6.setVisibility(C33129mqd.AhwBna(realizedClosePnl, 0) ? 0 : 8);
        vko6.setValue(OLrzqt(realizedClosePnl, displaySign));
        C53021wdd c53021wdd = uybValues.gEmmrt;
        if (arbitrageInfoResponse != null && (estimatedClosePnl2 = arbitrageInfoResponse.getEstimatedClosePnl()) != null && (estimatedCloseCost = estimatedClosePnl2.getEstimatedCloseCost()) != null) {
            android.widget.TextView textViewEZpvd = c53021wdd.EZpvd();
            textViewEZpvd.setText(getFormatedAmount$default(this, estimatedCloseCost.getTotalCostAmt(), null, 2, null));
            textViewEZpvd.setTextColor(C56033xvF.OLrzqt((java.lang.Object) estimatedCloseCost.getTotalCostAmt()));
            android.widget.TextView textViewAEQbTJ = c53021wdd.AEQbTJ();
            textViewAEQbTJ.setText(getFormatedAmount$default(this, estimatedCloseCost.getSpreadAmt(), null, 2, null));
            textViewAEQbTJ.setTextColor(C56033xvF.OLrzqt((java.lang.Object) estimatedCloseCost.getSpreadAmt()));
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) isConnected(), (java.lang.Object) OrderDetailListItem.SLIP_OUT);
            c53021wdd.copydefault().setText(getFormatedAmount$default(this, zEZpvd ? "0" : estimatedCloseCost.getSpotFeeAmt(), null, 2, null));
            c53021wdd.KWHzl().setText(getFormatedAmount$default(this, estimatedCloseCost.getSwapFeeAmt(), null, 2, null));
            c53021wdd.OLrzqt().setText(getFormatedAmount$default(this, zEZpvd ? "0" : estimatedCloseCost.getUnstakingFeeAmt(), null, 2, null));
        }
        vKO vko7 = uybValues.values;
        if (arbitrageInfoResponse != null && (estimatedClosePnl = arbitrageInfoResponse.getEstimatedClosePnl()) != null) {
            totalPnl = estimatedClosePnl.getTotalPnl();
        }
        vko7.EZpvd().setTextColor(C56033xvF.OLrzqt((java.lang.Object) totalPnl));
        vko7.setValue(OLrzqt(totalPnl, displaySign));
    }

    public static /* synthetic */ java.lang.String getFormatedAmount$default(C52925wbn c52925wbn, java.lang.String str, DisplaySign displaySign, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        return c52925wbn.OLrzqt(str, displaySign);
    }

    public final java.lang.String OLrzqt(java.lang.String str, DisplaySign displaySign) {
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "--";
        }
        return xMR.formatFloorToMax$default(xMR.copydefault, str, 0, null, displaySign, 6, null) + " " + this.gEmmrt;
    }

    private final void getNewProxyInstance() {
        C56111xwe<ArbitrageInfoResponse> c56111xweCopydefault = OLrzqt().copydefault();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweCopydefault.observe(viewLifecycleOwner, new Dialog(new Function1() { // from class: o.wbq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52925wbn.copydefault(this.KWHzl, (ArbitrageInfoResponse) obj);
            }
        }));
        TradeLiveData<java.util.List<StrategyStopResponse>> tradeLiveDataAEQbTJ = OLrzqt().AEQbTJ();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataAEQbTJ.observe(viewLifecycleOwner2, new Dialog(new Function1() { // from class: o.wbs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52925wbn.KWHzl(this.KWHzl, (java.util.List) obj);
            }
        }));
        OLrzqt().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new Dialog(new Function1() { // from class: o.wbv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52925wbn.EZpvd(this.KWHzl, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit copydefault(C52925wbn c52925wbn, ArbitrageInfoResponse arbitrageInfoResponse) {
        Intrinsics.checkNotNullParameter(arbitrageInfoResponse, "");
        c52925wbn.EZpvd();
        c52925wbn.copydefault(arbitrageInfoResponse);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C52925wbn c52925wbn, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        Function0<Unit> function0 = c52925wbn.AkhnZx;
        if (function0 == null) {
            Intrinsics.gEmmrt("");
            function0 = null;
        }
        function0.invoke();
        c52925wbn.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C52925wbn c52925wbn, androidx.core.util.Pair pair) {
        java.lang.String message;
        if (Intrinsics.EZpvd(pair.first, (java.lang.Object) c52925wbn.OLrzqt().KWHzl().bB_()) && (message = ((java.lang.Exception) pair.second).getMessage()) != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        android.widget.TextView textViewAYXKKw = wxq.AYXKKw();
        textViewAYXKKw.setText(C55688xof.Application.readTypedObject);
        textViewAYXKKw.setTextSize(20.0f);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(14);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        wyf.setSecondaryText(C33070mpX.AYXKKw(C55688xof.Application.onConfigurationChanged));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(259);
            c52794wYpCopydefault.setOnClickListener(new Application(c52794wYpCopydefault, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
            c52794wYpAEQbTJ.setOnClickListener(new ActionBar(c52794wYpAEQbTJ, 1000L, this));
        }
    }
}
