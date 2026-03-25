package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradingbot.impl.order.strategy.contractgrid.presenter.ContractGridSlippageControlPresenter;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.ClosePositionVo;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.ContractGridVo;
import com.okinc.unify_trade.biz.InitOrderingVo;
import com.okinc.unify_trade.biz.SlippageControl;
import com.okinc.unify_trade.biz.SpotGridEditParamRep;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vJp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50308vJp extends AbstractC49945uyC<uVK, ContractGridSlippageControlPresenter> {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public final uBH AhwBna;
    public java.lang.Boolean KWHzl = java.lang.Boolean.FALSE;
    public java.lang.String copydefault;
    public java.lang.Boolean djBIcL;
    public final java.lang.Runnable fetchVPNInfo;
    public java.lang.String gEmmrt;
    public java.lang.String isConnected;
    public TacticsData valueOf;
    public kotlin.Pair<java.lang.Boolean, java.lang.String> values;

    /* JADX INFO: renamed from: o.vJp$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return C48033uCm.Activity.gGNlxh;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public static final /* synthetic */ uVK OLrzqt(C50308vJp c50308vJp) {
        return c50308vJp.values();
    }

    public C50308vJp() {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.djBIcL = bool;
        this.copydefault = "";
        this.gEmmrt = "";
        this.AhwBna = new uBH(new Function0() { // from class: o.vJw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50308vJp.AhwBna(this.KWHzl);
            }
        });
        this.values = new kotlin.Pair<>(bool, "");
        this.fetchVPNInfo = new java.lang.Runnable() { // from class: o.vJu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C50308vJp.valueOf(this.KWHzl);
            }
        };
    }

    /* JADX INFO: renamed from: o.vJp$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vJp.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C50308vJp AEQbTJ(boolean z, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, java.lang.String str7, android.os.Parcelable parcelable, ContractGridReq contractGridReq, android.os.Parcelable parcelable2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("from_order_path_params", z);
            bundle.putString("algoId_params", str2);
            bundle.putString("user_expect_slippage_ratio_params", str7);
            bundle.putString("query_scene_params", str);
            bundle.putString("bot_inst_id", str3);
            bundle.putString("bot_inst_type", str4);
            bundle.putString("direction_params", str5);
            bundle.putString("state_params", str6);
            bundle.putParcelable("bot_config", parcelable);
            bundle.putParcelable("bot_grid_req", contractGridReq);
            bundle.putParcelable("tactics_data_params", parcelable2);
            C50308vJp c50308vJp = new C50308vJp();
            c50308vJp.setArguments(bundle);
            return c50308vJp;
        }
    }

    @Override // o.AbstractC49945uyC, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        OLrzqt().copydefault(getArguments());
        android.os.Bundle arguments = getArguments();
        this.valueOf = arguments != null ? (TacticsData) arguments.getParcelable("tactics_data_params") : null;
        android.os.Bundle arguments2 = getArguments();
        this.AYXKKw = arguments2 != null ? arguments2.getString("query_scene_params") : null;
        android.os.Bundle arguments3 = getArguments();
        this.KWHzl = arguments3 != null ? java.lang.Boolean.valueOf(arguments3.getBoolean("from_order_path_params")) : null;
        android.os.Bundle arguments4 = getArguments();
        this.AEQbTJ = arguments4 != null ? arguments4.getString("algoId_params") : null;
        android.os.Bundle arguments5 = getArguments();
        this.isConnected = arguments5 != null ? arguments5.getString("user_expect_slippage_ratio_params") : null;
        android.os.Bundle arguments6 = getArguments();
        this.copydefault = arguments6 != null ? arguments6.getString("direction_params") : null;
        android.os.Bundle arguments7 = getArguments();
        this.gEmmrt = arguments7 != null ? arguments7.getString("state_params") : null;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        OLrzqt().EZpvd(getArguments());
        OLrzqt().AhwBna();
        getNewProxyInstance();
        wlaJM();
        OLrzqt().AEQbTJ();
        ejfBZ();
    }

    private final void wlaJM() {
        TradeLiveData<StrategyConfigInfo> tradeLiveDataKWHzl = OLrzqt().KWHzl();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataKWHzl.observe(viewLifecycleOwner, new ActionBar(new Function1() { // from class: o.vJs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50308vJp.AEQbTJ(this.OLrzqt, (StrategyConfigInfo) obj);
            }
        }));
        C56111xwe<SpotGridEditParamRep> c56111xweValueOf = OLrzqt().valueOf();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56111xweValueOf.observe(viewLifecycleOwner2, new ActionBar(new Function1() { // from class: o.vJq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50308vJp.AEQbTJ(this.KWHzl, (SpotGridEditParamRep) obj);
            }
        }));
        TradeLiveData<xMJ.Application> tradeLiveDataAYXKKw = OLrzqt().AYXKKw();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataAYXKKw.observe(viewLifecycleOwner3, new ActionBar(new Function1() { // from class: o.vJr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50308vJp.OLrzqt(this.EZpvd, (xMJ.Application) obj);
            }
        }));
        C56111xwe<StrategyResponse> c56111xweDjBIcL = OLrzqt().djBIcL();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c56111xweDjBIcL.observe(viewLifecycleOwner4, new ActionBar(new Function1() { // from class: o.vJo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50308vJp.AEQbTJ(this.EZpvd, (StrategyResponse) obj);
            }
        }));
        OLrzqt().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.vJv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50308vJp.KWHzl(this.OLrzqt, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(C50308vJp c50308vJp, StrategyConfigInfo strategyConfigInfo) {
        SlippageControl slippageControl;
        SlippageControl slippageControl2;
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        c50308vJp.OLrzqt().AEQbTJ(strategyConfigInfo);
        StrategyConfigInfo strategyConfigInfoCopydefault = c50308vJp.OLrzqt().copydefault();
        java.lang.String maxSlippage = null;
        java.lang.String minSlippage = (strategyConfigInfoCopydefault == null || (slippageControl2 = strategyConfigInfoCopydefault.getSlippageControl()) == null) ? null : slippageControl2.getMinSlippage();
        if (minSlippage == null) {
            minSlippage = "";
        }
        StrategyConfigInfo strategyConfigInfoCopydefault2 = c50308vJp.OLrzqt().copydefault();
        if (strategyConfigInfoCopydefault2 != null && (slippageControl = strategyConfigInfoCopydefault2.getSlippageControl()) != null) {
            maxSlippage = slippageControl.getMaxSlippage();
        }
        c50308vJp.KWHzl(minSlippage, maxSlippage != null ? maxSlippage : "");
        c50308vJp.ejfBZ();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C50308vJp c50308vJp, SpotGridEditParamRep spotGridEditParamRep) {
        Intrinsics.checkNotNullParameter(spotGridEditParamRep, "");
        C55328xhq.showWithLoading$default(C33605mzc.AEQbTJ(), C33070mpX.AYXKKw(C55688xof.Application.ActionBarOnMenuVisibilityListener), null, 0, null, 0, 0, 58, null);
        c50308vJp.fIwbmz();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C50308vJp c50308vJp, xMJ.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        uVK uvkValues = c50308vJp.values();
        if (!c50308vJp.fJNWhG()) {
            uvkValues.OLrzqt.setContent(c50308vJp.OLrzqt().OLrzqt());
        } else {
            uvkValues.DbNXlk.setText(c50308vJp.OLrzqt().OLrzqt());
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C50308vJp c50308vJp, StrategyResponse strategyResponse) {
        Intrinsics.checkNotNullParameter(strategyResponse, "");
        C55328xhq.showWithLoading$default(C33605mzc.AEQbTJ(), C33070mpX.AYXKKw(C55688xof.Application.onCaptioningEnabledChanged), null, 0, null, 0, 0, 58, null);
        c50308vJp.fIwbmz();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vJp$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C50308vJp KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C50308vJp c50308vJp) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c50308vJp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.fIwbmz();
            }
        }
    }

    /* JADX INFO: renamed from: o.vJp$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C50308vJp EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C50308vJp c50308vJp) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = c50308vJp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C53573wnz c53573wnz = C50308vJp.OLrzqt(this.EZpvd).AkhnZx;
                Intrinsics.checkNotNullExpressionValue(c53573wnz, "");
                if (c53573wnz.getVisibility() != 0 || C50308vJp.OLrzqt(this.EZpvd).AkhnZx.copydefault()) {
                    if (this.EZpvd.getFieldNames()) {
                        if (this.EZpvd.fJNWhG()) {
                            this.EZpvd.OLrzqt().AEQbTJ(this.EZpvd.AEQbTJ, this.EZpvd.AuCTel() ? "open" : EopTrackEvent.CLOSE, C33129mqd.divS$default(C50308vJp.OLrzqt(this.EZpvd).AEQbTJ.AEQbTJ().AkhnZx(), 100, null, null, null, 14, null));
                            return;
                        }
                        androidx.fragment.app.FragmentManager parentFragmentManager = this.EZpvd.getParentFragmentManager();
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putString("slippage_ratio_params", C33129mqd.divS$default(C50308vJp.OLrzqt(this.EZpvd).AEQbTJ.AEQbTJ().AkhnZx(), 100, null, null, null, 14, null));
                        Unit unit = Unit.INSTANCE;
                        parentFragmentManager.setFragmentResult("slippage_control_settings", bundle);
                        this.EZpvd.fIwbmz();
                        return;
                    }
                    uVK uvkOLrzqt = C50308vJp.OLrzqt(this.EZpvd);
                    C49967uyY.EZpvd.KWHzl(uvkOLrzqt.AEQbTJ.AEQbTJ(), C48033uCm.Application.fvQaOB, C56402yEa.EZpvd(uvkOLrzqt.AEQbTJ.AEQbTJ()));
                    return;
                }
                androidx.fragment.app.FragmentManager parentFragmentManager2 = this.EZpvd.getParentFragmentManager();
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("slippage_ratio_params", "");
                Unit unit2 = Unit.INSTANCE;
                parentFragmentManager2.setFragmentResult("slippage_control_settings", bundle2);
                this.EZpvd.fIwbmz();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C50308vJp c50308vJp, androidx.core.util.Pair pair) {
        java.lang.String message;
        if (Intrinsics.EZpvd(pair.first, (java.lang.Object) c50308vJp.OLrzqt().gEmmrt().bB_()) && (message = ((java.lang.Exception) pair.second).getMessage()) != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.String getSingleGridAmt$default(C50308vJp c50308vJp, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        return c50308vJp.KWHzl(str, str2, str3, str4);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3)) {
            return "--";
        }
        return C56033xvF.getBotAmount$default(str, str2, str3, str4, false, null, 48, null) + " " + C56033xvF.getBotAmountUnit$default(str, str2, str4, null, 8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ejfBZ() {
        SlippageControl slippageControl;
        java.util.List<java.lang.String> closeSlippageOptions;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String direction;
        java.lang.String strEZpvd;
        uVK uvkValues = values();
        StrategyConfigInfo strategyConfigInfoCopydefault = OLrzqt().copydefault();
        if (strategyConfigInfoCopydefault == null || (slippageControl = strategyConfigInfoCopydefault.getSlippageControl()) == null) {
            return;
        }
        if (iwGUEr()) {
            closeSlippageOptions = slippageControl.getOpenSlippageOptions();
        } else {
            closeSlippageOptions = slippageControl.getCloseSlippageOptions();
        }
        C50351vLe c50351vLe = uvkValues.AEQbTJ;
        if (closeSlippageOptions == null || (str = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(closeSlippageOptions, 0)) == null) {
            str = "0.000";
        }
        if (closeSlippageOptions == null || (str2 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(closeSlippageOptions, 1)) == null) {
            str2 = "0.000";
        }
        if (closeSlippageOptions == null || (str3 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(closeSlippageOptions, 2)) == null) {
            str3 = "0.000";
        }
        if (closeSlippageOptions == null || (str4 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(closeSlippageOptions, 3)) == null) {
            str4 = "0.000";
        }
        if (closeSlippageOptions == null || (str5 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(closeSlippageOptions, 4)) == null) {
            str5 = "0.000";
        }
        c50351vLe.setRecommendValue(str, str2, str3, str4, str5);
        java.lang.String askSlippage = null;
        if (!fJNWhG()) {
            direction = iwGUEr() ? OLrzqt().EZpvd().getDirection() : this.copydefault;
        } else {
            TacticsData tacticsData = this.valueOf;
            direction = tacticsData != null ? tacticsData.getDirection() : null;
        }
        if (direction == null) {
            askSlippage = "";
        } else {
            int iHashCode = direction.hashCode();
            if (iHashCode != 3327612) {
                if (iHashCode != 109413500) {
                    if (iHashCode == 1844321735 && direction.equals("neutral")) {
                        java.lang.String bidSlippage = slippageControl.getBidSlippage();
                        if (bidSlippage != null) {
                            askSlippage = C33129mqd.EZpvd(bidSlippage, slippageControl.getAskSlippage());
                        }
                    }
                } else if (direction.equals("short")) {
                    askSlippage = iwGUEr() ? slippageControl.getBidSlippage() : slippageControl.getAskSlippage();
                }
            } else if (direction.equals("long")) {
                askSlippage = iwGUEr() ? slippageControl.getAskSlippage() : slippageControl.getBidSlippage();
            }
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.isConnected)) {
            C47988uAv.setInputContent$default(uvkValues.AEQbTJ.AEQbTJ(), C33129mqd.mulS$default(this.isConnected, 100, null, null, null, 14, null), false, false, 6, null);
        } else if (C33129mqd.OLrzqt((java.lang.CharSequence) askSlippage)) {
            C47988uAv.setInputContent$default(uvkValues.AEQbTJ.AEQbTJ(), C33129mqd.mulS$default(askSlippage, 100, null, null, null, 14, null), false, false, 6, null);
        }
        if (fJNWhG()) {
            return;
        }
        android.widget.TextView textView = uvkValues.gEmmrt;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) askSlippage)) {
            strEZpvd = xMR.copydefault.EZpvd(askSlippage != null ? askSlippage : "", 4, 0, RoundingMode.HALF_UP);
        } else {
            strEZpvd = "--";
        }
        textView.setText(strEZpvd);
    }

    public static final Unit AhwBna(C50308vJp c50308vJp) {
        c50308vJp.djBIcL = java.lang.Boolean.FALSE;
        c50308vJp.copydefault();
        return Unit.INSTANCE;
    }

    public final boolean copydefault() {
        this.values = uzCIH();
        C47988uAv c47988uAvAEQbTJ = values().AEQbTJ.AEQbTJ();
        c47988uAvAEQbTJ.removeCallbacks(this.fetchVPNInfo);
        c47988uAvAEQbTJ.postDelayed(this.fetchVPNInfo, 500L);
        return this.values.getFirst().booleanValue();
    }

    public static final void valueOf(C50308vJp c50308vJp) {
        if (c50308vJp.values.getFirst().booleanValue()) {
            c50308vJp.values().AEQbTJ.AEQbTJ().copydefault();
        } else {
            c50308vJp.values().AEQbTJ.AEQbTJ().setInputErrorMsg(c50308vJp.values.getSecond());
        }
    }

    private final kotlin.Pair<java.lang.Boolean, java.lang.String> uzCIH() {
        java.lang.String strFARcdN = fARcdN();
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strFARcdN)) {
            return new kotlin.Pair<>(java.lang.Boolean.FALSE, strFARcdN);
        }
        return new kotlin.Pair<>(java.lang.Boolean.TRUE, "");
    }

    public final java.lang.String fARcdN() {
        java.lang.String minSlippage;
        java.lang.String maxSlippage;
        SlippageControl slippageControl;
        SlippageControl slippageControl2;
        java.lang.String strAkhnZx = values().AEQbTJ.AEQbTJ().AkhnZx();
        StrategyConfigInfo strategyConfigInfoCopydefault = OLrzqt().copydefault();
        if (strategyConfigInfoCopydefault == null || (slippageControl2 = strategyConfigInfoCopydefault.getSlippageControl()) == null || (minSlippage = slippageControl2.getMinSlippage()) == null) {
            minSlippage = "0.0001";
        }
        java.lang.String strMulS$default = C33129mqd.mulS$default(minSlippage, 100, null, null, null, 14, null);
        StrategyConfigInfo strategyConfigInfoCopydefault2 = OLrzqt().copydefault();
        if (strategyConfigInfoCopydefault2 == null || (slippageControl = strategyConfigInfoCopydefault2.getSlippageControl()) == null || (maxSlippage = slippageControl.getMaxSlippage()) == null) {
            maxSlippage = "4";
        }
        java.lang.String strMulS$default2 = C33129mqd.mulS$default(maxSlippage, 100, null, null, null, 14, null);
        if (strMulS$default == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strMulS$default) || strMulS$default2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strMulS$default2) || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
            return "";
        }
        if (!C33129mqd.AEQbTJ(strAkhnZx, strMulS$default2) && !C33129mqd.gEmmrt(strAkhnZx, strMulS$default)) {
            return "";
        }
        return C33069mpW.copydefault(this, C48033uCm.Fragment.zLAIeZ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("min", strMulS$default + "%"), C56390yDp.OLrzqt("max", strMulS$default2 + "%")));
    }

    private final void getNewProxyInstance() {
        BotVo bot;
        ContractGridVo contractGrid;
        ClosePositionVo closePosition;
        java.lang.String str;
        BotVo bot2;
        ContractGridVo contractGrid2;
        InitOrderingVo initOrdering;
        hDKMBd();
        isConnected();
        final uVK uvkValues = values();
        boolean zFJNWhG = fJNWhG();
        C53573wnz c53573wnz = uvkValues.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(c53573wnz, "");
        boolean z = !zFJNWhG;
        c53573wnz.setVisibility(z ? 0 : 8);
        android.widget.TextView textView = uvkValues.values;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        OKReminder oKReminder = uvkValues.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(oKReminder, "");
        oKReminder.setVisibility(zFJNWhG ? 0 : 8);
        C55258xgZ c55258xgZ = uvkValues.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
        c55258xgZ.setVisibility(zFJNWhG ? 0 : 8);
        android.widget.TextView textView2 = uvkValues.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(zFJNWhG ? 0 : 8);
        C55258xgZ c55258xgZ2 = uvkValues.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c55258xgZ2, "");
        c55258xgZ2.setVisibility(zFJNWhG ? 0 : 8);
        android.widget.TextView textView3 = uvkValues.isConnected;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(zFJNWhG ? 0 : 8);
        C55258xgZ c55258xgZ3 = uvkValues.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55258xgZ3, "");
        c55258xgZ3.setVisibility(zFJNWhG ? 0 : 8);
        android.widget.TextView textView4 = uvkValues.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        textView4.setVisibility(zFJNWhG ? 0 : 8);
        uvkValues.AkhnZx.KWHzl().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        C53573wnz c53573wnz2 = uvkValues.AkhnZx;
        int i = C52761wXj.LoaderManager.gHZMYf;
        c53573wnz2.setTextAppearance(i, i);
        if (zFJNWhG) {
            java.lang.String strAEQbTJ = C56033xvF.AEQbTJ(OLrzqt().fvQaOB().djBIcL(), OLrzqt().fvQaOB().gEmmrt());
            if (AuCTel()) {
                uvkValues.valueOf.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.zlvcHA));
                uvkValues.OLrzqt.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.keyboardTargetTextChanged));
                uvkValues.djBIcL.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.getLabel));
                uvkValues.AhwBna.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.zqTOFw));
                uvkValues.AYXKKw.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.sTzBva));
                OKReminder oKReminder2 = uvkValues.ejfBZ;
                oKReminder2.setMessage(C33070mpX.AYXKKw(C48033uCm.Fragment.zYHWMc));
                oKReminder2.setCloseIconVisibility(false);
                oKReminder2.setStyle(0);
                TacticsData tacticsData = this.valueOf;
                if (tacticsData != null && (bot2 = tacticsData.getBot()) != null && (contractGrid2 = bot2.getContractGrid()) != null && (initOrdering = contractGrid2.getInitOrdering()) != null) {
                    uvkValues.gEmmrt.setText(getSingleGridAmt$default(this, OLrzqt().fvQaOB().djBIcL(), OLrzqt().fvQaOB().gEmmrt(), initOrdering.getInitOpenPosFilled(), null, 8, null));
                    uvkValues.OLrzqt.setContent(C56033xvF.getBotPrice$default(OLrzqt().fvQaOB().djBIcL(), OLrzqt().fvQaOB().gEmmrt(), initOrdering.getInitOpenAvgPrice(), false, false, null, null, 120, null) + " " + strAEQbTJ);
                    uvkValues.fetchVPNInfo.setText(getSingleGridAmt$default(this, OLrzqt().fvQaOB().djBIcL(), OLrzqt().fvQaOB().gEmmrt(), initOrdering.getInitOpenPosRemaining(), null, 8, null));
                    android.widget.TextView textView5 = uvkValues.isConnected;
                    int i2 = C48033uCm.Fragment.isInitInProgress;
                    java.lang.String initOpenPosTime = initOrdering.getInitOpenPosTime();
                    str = C33129mqd.OLrzqt((java.lang.CharSequence) initOpenPosTime) ? initOpenPosTime : null;
                    if (str == null) {
                        str = "--";
                    }
                    textView5.setText(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("second", str))));
                }
                uvkValues.DbNXlk.setText("--");
                return;
            }
            uvkValues.valueOf.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.DGUQLIOvDItG));
            uvkValues.OLrzqt.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.zhUgOk));
            uvkValues.djBIcL.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.DGUQLIDGUQLI));
            uvkValues.AhwBna.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.zOIQXb));
            uvkValues.AYXKKw.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.sTzBva));
            OKReminder oKReminder3 = uvkValues.ejfBZ;
            oKReminder3.setMessage(C33070mpX.AYXKKw(C48033uCm.Fragment.zYHWMc));
            oKReminder3.setCloseIconVisibility(false);
            oKReminder3.setStyle(0);
            TacticsData tacticsData2 = this.valueOf;
            if (tacticsData2 != null && (bot = tacticsData2.getBot()) != null && (contractGrid = bot.getContractGrid()) != null && (closePosition = contractGrid.getClosePosition()) != null) {
                uvkValues.gEmmrt.setText(getSingleGridAmt$default(this, OLrzqt().fvQaOB().djBIcL(), OLrzqt().fvQaOB().gEmmrt(), closePosition.getClosePosFilled(), null, 8, null));
                uvkValues.OLrzqt.setContent(C56033xvF.getBotPrice$default(OLrzqt().fvQaOB().djBIcL(), OLrzqt().fvQaOB().gEmmrt(), closePosition.getClosePosAvgPrice(), false, false, null, null, 120, null) + " " + strAEQbTJ);
                uvkValues.fetchVPNInfo.setText(getSingleGridAmt$default(this, OLrzqt().fvQaOB().djBIcL(), OLrzqt().fvQaOB().gEmmrt(), closePosition.getClosePosRemaining(), null, 8, null));
                android.widget.TextView textView6 = uvkValues.isConnected;
                int i3 = C48033uCm.Fragment.isInitInProgress;
                java.lang.String closePosTime = closePosition.getClosePosTime();
                str = C33129mqd.OLrzqt((java.lang.CharSequence) closePosTime) ? closePosTime : null;
                if (str == null) {
                    str = "--";
                }
                textView6.setText(C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt("second", str))));
            }
            uvkValues.DbNXlk.setText("--");
            return;
        }
        uvkValues.valueOf.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.Th));
        uvkValues.gEmmrt.setText("--");
        uvkValues.OLrzqt.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.sTzBva));
        uvkValues.OLrzqt.setContent("--");
        uvkValues.AkhnZx.setSwitchChecked(true);
        uvkValues.AkhnZx.setOnSwitchChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vJx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z2) {
                C50308vJp.OLrzqt(uvkValues, compoundButton, z2);
            }
        });
    }

    public static final void OLrzqt(uVK uvk, android.widget.CompoundButton compoundButton, boolean z) {
        C50351vLe c50351vLe = uvk.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c50351vLe, "");
        c50351vLe.setVisibility(z ? 0 : 8);
        C55258xgZ c55258xgZ = uvk.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
        c55258xgZ.setVisibility(z ? 0 : 8);
        android.widget.TextView textView = uvk.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        C53560wnm c53560wnm = uvk.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c53560wnm, "");
        c53560wnm.setVisibility(z ? 0 : 8);
    }

    private final void hDKMBd() {
        uVK uvkValues = values();
        C47988uAv c47988uAvAEQbTJ = uvkValues.AEQbTJ.AEQbTJ();
        int i = C48033uCm.Application.fvQaOB;
        C49960uyR.setWindowSoftInput$default(this, c47988uAvAEQbTJ, java.lang.Integer.valueOf(i), uvkValues.AEQbTJ.AEQbTJ(), 0, 8, (java.lang.Object) null);
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final void isConnected() {
        SlippageControl slippageControl;
        SlippageControl slippageControl2;
        StrategyConfigInfo strategyConfigInfoCopydefault = OLrzqt().copydefault();
        java.lang.String maxSlippage = null;
        java.lang.String minSlippage = (strategyConfigInfoCopydefault == null || (slippageControl2 = strategyConfigInfoCopydefault.getSlippageControl()) == null) ? null : slippageControl2.getMinSlippage();
        if (minSlippage == null) {
            minSlippage = "";
        }
        StrategyConfigInfo strategyConfigInfoCopydefault2 = OLrzqt().copydefault();
        if (strategyConfigInfoCopydefault2 != null && (slippageControl = strategyConfigInfoCopydefault2.getSlippageControl()) != null) {
            maxSlippage = slippageControl.getMaxSlippage();
        }
        KWHzl(minSlippage, maxSlippage != null ? maxSlippage : "");
        C47988uAv c47988uAvAEQbTJ = values().AEQbTJ.AEQbTJ();
        c47988uAvAEQbTJ.sSMYrx();
        c47988uAvAEQbTJ.djBIcL().setAllowShowNegative(true);
        c47988uAvAEQbTJ.djBIcL().setAllowEditNegative(true);
        c47988uAvAEQbTJ.djBIcL().setAcceptKeyListener(new TaskDescription());
        c47988uAvAEQbTJ.setInputUnit("%");
        c47988uAvAEQbTJ.setMaxDecimal(4);
        c47988uAvAEQbTJ.KWHzl(this.AhwBna);
    }

    /* JADX INFO: renamed from: o.vJp$TaskDescription */
    public static final class TaskDescription extends android.text.method.NumberKeyListener {
        @Override // android.text.method.KeyListener
        public int getInputType() {
            return 8194;
        }

        @Override // android.text.method.NumberKeyListener
        public char[] getAcceptedChars() {
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.Character chValueOf = java.lang.Character.valueOf(C38303pTu.EZpvd(locale).charAt(0));
            java.util.Locale locale2 = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            return CollectionsKt___CollectionsKt.values(yDY.AhwBna('-', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', chValueOf, java.lang.Character.valueOf(C38303pTu.AEQbTJ(locale2).charAt(0))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fIwbmz() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    private final boolean iwGUEr() {
        return Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) "open");
    }

    public final boolean fJNWhG() {
        return Intrinsics.EZpvd(this.KWHzl, java.lang.Boolean.TRUE);
    }

    public final boolean AuCTel() {
        return Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) "starting");
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.DTeKQX));
        wxq.setDividerVisibility(false);
        wxq.setCloseVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
        wxq.AEQbTJ().setVisibility(8);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        wyf.setOnClickListener(new StateListAnimator(wyf, 1000L, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getFieldNames() {
        if (values().AEQbTJ.AEQbTJ().AkhnZx().length() == 0) {
            values().AEQbTJ.AEQbTJ().zsXlph();
            return false;
        }
        if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) fARcdN()))) {
            return true;
        }
        values().AEQbTJ.AEQbTJ().zsXlph();
        return false;
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2) {
        if (C33129mqd.valueOf(str, str2)) {
            xMR xmr = xMR.copydefault;
            java.lang.String str3 = " " + xmr.copydefault(C33129mqd.mulS$default(str, 100, null, null, null, 14, null)) + "-" + xmr.KWHzl(C33129mqd.mulS$default(str2, 100, null, null, null, 14, null), 0);
            C47988uAv.setInputLabel$default(values().AEQbTJ.AEQbTJ(), C33070mpX.AYXKKw(C48033uCm.Fragment.DcMfJK) + str3, null, 2, null);
        }
    }
}
