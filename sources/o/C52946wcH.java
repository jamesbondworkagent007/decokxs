package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter.BotGridOpenPositionConditionPresenter;
import com.okinc.unify_trade.biz.ArbInvestDetailsBean;
import com.okinc.unify_trade.biz.PlaceOrderCondition;
import com.okinc.unify_trade.biz.StrategyResponse;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C48033uCm;
import o.C52761wXj;
import o.C52906wbU;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wcH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52946wcH extends AbstractC49945uyC<uVN, BotGridOpenPositionConditionPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public java.lang.String AEQbTJ;
    public final uBH AYXKKw;
    public final uBH AkhnZx;
    public java.lang.String AuCTel;
    public java.lang.Boolean DbNXlk;
    public final Function2<C47988uAv, java.lang.Boolean, Unit> OLrzqt;
    public final Function2<C47988uAv, java.lang.String, Unit> copydefault;
    public java.lang.String fetchVPNInfo;
    public final java.lang.Runnable getFieldNames;
    public java.lang.String getNewProxyInstance;
    public java.lang.String hDKMBd;
    public java.lang.String isConnected;
    public kotlin.Pair<java.lang.Boolean, java.lang.String> iwGUEr;
    public final Function1<java.lang.String, Unit> uzCIH;
    public java.lang.Boolean valueOf;
    public java.lang.String values;
    public java.lang.String AhwBna = "";
    public java.lang.String djBIcL = "";
    public java.lang.String fIwbmz = "";
    public java.lang.String fJNWhG = "";
    public java.lang.Boolean gEmmrt = java.lang.Boolean.FALSE;

    /* JADX INFO: renamed from: o.wcH$PendingIntent */
    public static final /* synthetic */ class PendingIntent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Function1 function1) {
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

    private final void iwGUEr() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return C48033uCm.Activity.gCZUJG;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public static final /* synthetic */ uVN AhwBna(C52946wcH c52946wcH) {
        return c52946wcH.values();
    }

    public C52946wcH() {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.DbNXlk = bool;
        this.valueOf = bool;
        this.OLrzqt = new Function2() { // from class: o.wcG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52946wcH.copydefault(this.OLrzqt, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        };
        this.copydefault = new Function2() { // from class: o.wcF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52946wcH.copydefault(this.EZpvd, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.uzCIH = new Function1() { // from class: o.wcN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52946wcH.EZpvd(this.EZpvd, (java.lang.String) obj);
            }
        };
        this.AkhnZx = new uBH(new Function0() { // from class: o.wcM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52946wcH.DbNXlk(this.OLrzqt);
            }
        });
        this.AYXKKw = new uBH(new Function0() { // from class: o.wcL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52946wcH.AkhnZx(this.OLrzqt);
            }
        });
        this.iwGUEr = new kotlin.Pair<>(bool, "");
        this.getFieldNames = new java.lang.Runnable() { // from class: o.wcK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C52946wcH.isConnected(this.OLrzqt);
            }
        };
    }

    /* JADX INFO: renamed from: o.wcH$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wcH.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C52946wcH newInstance$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, int i, java.lang.Object obj) {
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
            if ((i & 16) != 0) {
                str5 = "";
            }
            if ((i & 32) != 0) {
                z = false;
            }
            if ((i & 64) != 0) {
                str6 = null;
            }
            if ((i & 128) != 0) {
                str7 = null;
            }
            if ((i & 256) != 0) {
                str8 = null;
            }
            if ((i & 512) != 0) {
                str9 = null;
            }
            if ((i & 1024) != 0) {
                str10 = null;
            }
            return stateListAnimator.copydefault(str, str2, str3, str4, str5, z, str6, str7, str8, str9, str10);
        }

        public final C52946wcH copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("query_scene_params", str);
            bundle.putString("inst_family_params", str2);
            bundle.putString("arb_type_params", str3);
            bundle.putString("total_amt_params", str4);
            bundle.putString("unit_params", str5);
            bundle.putBoolean("from_order_path_params", z);
            bundle.putString("spread_ratio_params", str6);
            bundle.putString("algoId_params", str7);
            bundle.putString("unit_amt_params", str8);
            bundle.putString("user_expect_spread_ratio_params", str9);
            bundle.putString("expected_unit_amt_params", str10);
            C52946wcH c52946wcH = new C52946wcH();
            c52946wcH.setArguments(bundle);
            return c52946wcH;
        }
    }

    @Override // o.AbstractC49945uyC, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        this.isConnected = arguments != null ? arguments.getString("query_scene_params") : null;
        android.os.Bundle arguments2 = getArguments();
        this.AhwBna = arguments2 != null ? arguments2.getString("inst_family_params") : null;
        android.os.Bundle arguments3 = getArguments();
        this.djBIcL = arguments3 != null ? arguments3.getString("arb_type_params") : null;
        android.os.Bundle arguments4 = getArguments();
        this.fIwbmz = arguments4 != null ? arguments4.getString("total_amt_params") : null;
        android.os.Bundle arguments5 = getArguments();
        this.fJNWhG = arguments5 != null ? arguments5.getString("unit_params") : null;
        android.os.Bundle arguments6 = getArguments();
        this.gEmmrt = arguments6 != null ? java.lang.Boolean.valueOf(arguments6.getBoolean("from_order_path_params")) : null;
        android.os.Bundle arguments7 = getArguments();
        this.values = arguments7 != null ? arguments7.getString("spread_ratio_params") : null;
        android.os.Bundle arguments8 = getArguments();
        this.AEQbTJ = arguments8 != null ? arguments8.getString("algoId_params") : null;
        android.os.Bundle arguments9 = getArguments();
        this.AuCTel = arguments9 != null ? arguments9.getString("unit_amt_params") : null;
        android.os.Bundle arguments10 = getArguments();
        this.getNewProxyInstance = arguments10 != null ? arguments10.getString("user_expect_spread_ratio_params") : null;
        android.os.Bundle arguments11 = getArguments();
        this.hDKMBd = arguments11 != null ? arguments11.getString("expected_unit_amt_params") : null;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        uzCIH();
        iwGUEr();
        zsXlph();
        fIwbmz();
    }

    public final void fIwbmz() {
        fARcdN();
    }

    private final void fARcdN() {
        BotGridOpenPositionConditionPresenter botGridOpenPositionConditionPresenterOLrzqt = OLrzqt();
        java.lang.String str = this.AhwBna;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = this.djBIcL;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = this.fIwbmz;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String strAkhnZx = values().AhwBna.AkhnZx();
        java.lang.String str4 = this.AEQbTJ;
        java.lang.String str5 = this.isConnected;
        java.lang.String str6 = this.fJNWhG;
        if (str6 == null) {
            str6 = "";
        }
        java.lang.Boolean bool = this.gEmmrt;
        botGridOpenPositionConditionPresenterOLrzqt.AEQbTJ(str, str2, str3, strAkhnZx, str4, str5, str6, bool != null ? bool.booleanValue() : false);
    }

    /* JADX INFO: renamed from: o.wcH$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C52946wcH copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C52946wcH c52946wcH) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = c52946wcH;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C52906wbU.ActionBar actionBar = C52906wbU.Companion;
                java.lang.String str = this.copydefault.isConnected;
                if (str == null) {
                    str = "";
                }
                androidx.fragment.app.FragmentManager childFragmentManager = this.copydefault.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                actionBar.EZpvd(str, childFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.wcH$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C52946wcH EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C52946wcH c52946wcH) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c52946wcH;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.AuCTel();
            }
        }
    }

    /* JADX INFO: renamed from: o.wcH$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C52946wcH EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C52946wcH c52946wcH) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c52946wcH;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (this.EZpvd.AubY()) {
                    if (Intrinsics.EZpvd(this.EZpvd.gEmmrt, java.lang.Boolean.TRUE)) {
                        BotGridOpenPositionConditionPresenter botGridOpenPositionConditionPresenterOLrzqt = this.EZpvd.OLrzqt();
                        java.lang.String str = this.EZpvd.AEQbTJ;
                        java.lang.String str2 = this.EZpvd.isConnected;
                        PlaceOrderCondition placeOrderCondition = new PlaceOrderCondition((java.lang.String) null, (java.lang.String) null, 3, (DefaultConstructorMarker) null);
                        placeOrderCondition.setSpreadRatio(C33129mqd.divS$default(C52946wcH.AhwBna(this.EZpvd).AhwBna.AkhnZx(), 100, null, null, null, 14, null));
                        placeOrderCondition.setUnitAmt(C52946wcH.AhwBna(this.EZpvd).EZpvd.AkhnZx());
                        Unit unit = Unit.INSTANCE;
                        botGridOpenPositionConditionPresenterOLrzqt.KWHzl(str, str2, placeOrderCondition);
                        return;
                    }
                    androidx.fragment.app.FragmentManager parentFragmentManager = this.EZpvd.getParentFragmentManager();
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("spread_ratio_params", C33129mqd.divS$default(C52946wcH.AhwBna(this.EZpvd).AhwBna.AkhnZx(), 100, null, null, null, 14, null));
                    bundle.putString("unit_amt_params", C52946wcH.AhwBna(this.EZpvd).EZpvd.AkhnZx());
                    bundle.putString("unit_params", this.EZpvd.fJNWhG);
                    Unit unit2 = Unit.INSTANCE;
                    parentFragmentManager.setFragmentResult("modify_spread_ratio_total_amount", bundle);
                    this.EZpvd.AuCTel();
                    return;
                }
                uVN uvnAhwBna = C52946wcH.AhwBna(this.EZpvd);
                C49967uyY c49967uyY = C49967uyY.EZpvd;
                C47988uAv c47988uAv = uvnAhwBna.AhwBna;
                Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
                c49967uyY.KWHzl(c47988uAv, C48033uCm.Application.fvQaOB, yDY.gEmmrt(uvnAhwBna.AhwBna, uvnAhwBna.EZpvd));
            }
        }
    }

    private final void zsXlph() {
        C56111xwe<kotlin.Pair<ArbInvestDetailsBean, java.lang.Boolean>> c56111xweCopydefault = OLrzqt().copydefault();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweCopydefault.observe(viewLifecycleOwner, new PendingIntent(new Function1() { // from class: o.wcO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52946wcH.EZpvd(this.AEQbTJ, (kotlin.Pair) obj);
            }
        }));
        C56111xwe<StrategyResponse> c56111xweOLrzqt = OLrzqt().OLrzqt();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56111xweOLrzqt.observe(viewLifecycleOwner2, new PendingIntent(new Function1() { // from class: o.wcQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52946wcH.copydefault(this.copydefault, (StrategyResponse) obj);
            }
        }));
        OLrzqt().getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.wcP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52946wcH.AEQbTJ(this.EZpvd, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit EZpvd(C52946wcH c52946wcH, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        c52946wcH.OLrzqt((ArbInvestDetailsBean) pair.getFirst());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C52946wcH c52946wcH, StrategyResponse strategyResponse) {
        Intrinsics.checkNotNullParameter(strategyResponse, "");
        C55328xhq.showWithLoading$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C55688xof.Application.ActionBarOnMenuVisibilityListener), null, 0, null, 0, 0, 58, null);
        c52946wcH.AuCTel();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: F */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C52946wcH c52946wcH, androidx.core.util.Pair pair) {
        java.lang.String str = (java.lang.String) pair.first;
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c52946wcH.OLrzqt().KWHzl().bB_())) {
            Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c52946wcH.OLrzqt().AEQbTJ().bB_());
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(ArbInvestDetailsBean arbInvestDetailsBean) {
        java.lang.String iCUPercent$default;
        java.lang.String minUnitAmt;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String strMulS$default;
        uVN uvnValues = values();
        android.widget.TextView textView = uvnValues.gEmmrt;
        java.lang.String str3 = "--";
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (arbInvestDetailsBean != null ? arbInvestDetailsBean.getMarketSpreadRatio() : null))) {
            iCUPercent$default = pTB.formatICUPercent$default(C33129mqd.EZpvd(arbInvestDetailsBean != null ? arbInvestDetailsBean.getMarketSpreadRatio() : null), RoundingMode.HALF_UP, C38307pTy.Companion.KWHzl(0, 3), null, java.lang.Double.valueOf(100.0d), null, 20, null);
        } else {
            iCUPercent$default = "--";
        }
        textView.setText(iCUPercent$default);
        this.fetchVPNInfo = arbInvestDetailsBean != null ? arbInvestDetailsBean.getMarketSpreadRatio() : null;
        vKO vko = uvnValues.fetchVPNInfo;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (arbInvestDetailsBean != null ? arbInvestDetailsBean.getUnitAmt() : null))) {
            str3 = pTB.formatICUPercent$default(C33129mqd.EZpvd(arbInvestDetailsBean != null ? arbInvestDetailsBean.getUnitAmt() : null), RoundingMode.DOWN, C38307pTy.Companion.AEQbTJ(3), null, java.lang.Double.valueOf(100.0d), null, 20, null) + " " + (arbInvestDetailsBean != null ? arbInvestDetailsBean.getUnit() : null);
        }
        vko.setValue(str3);
        C47988uAv c47988uAv = uvnValues.AhwBna;
        java.lang.Boolean bool = this.DbNXlk;
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        java.lang.String unitAmt = "";
        if (Intrinsics.EZpvd(bool, bool2)) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (arbInvestDetailsBean != null ? arbInvestDetailsBean.getUserExpectSpreadRatio() : null))) {
                strMulS$default = C33129mqd.mulS$default(arbInvestDetailsBean != null ? arbInvestDetailsBean.getUserExpectSpreadRatio() : null, 100, null, null, null, 14, null);
            } else {
                if (!C33129mqd.OLrzqt((java.lang.CharSequence) (arbInvestDetailsBean != null ? arbInvestDetailsBean.getSpreadRatio() : null))) {
                    str2 = "";
                    C47988uAv.setInputContent$default(c47988uAv, str2, false, false, 6, null);
                    this.DbNXlk = java.lang.Boolean.FALSE;
                } else {
                    strMulS$default = C33129mqd.mulS$default(arbInvestDetailsBean != null ? arbInvestDetailsBean.getSpreadRatio() : null, 100, null, null, null, 14, null);
                }
            }
            str2 = strMulS$default;
            C47988uAv.setInputContent$default(c47988uAv, str2, false, false, 6, null);
            this.DbNXlk = java.lang.Boolean.FALSE;
        }
        C47988uAv c47988uAv2 = uvnValues.EZpvd;
        if (arbInvestDetailsBean != null && arbInvestDetailsBean.getMinUnitAmt() != null) {
            C47988uAv.setInputLabel$default(c47988uAv2, "≥" + arbInvestDetailsBean.getMinUnitAmt(), null, 2, null);
        }
        if (Intrinsics.EZpvd(this.valueOf, bool2)) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (arbInvestDetailsBean != null ? arbInvestDetailsBean.getUserExpectUnitAmt() : null))) {
                if (arbInvestDetailsBean != null) {
                    unitAmt = arbInvestDetailsBean.getUserExpectUnitAmt();
                    str = unitAmt;
                }
                str = null;
            } else {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) (arbInvestDetailsBean != null ? arbInvestDetailsBean.getUnitAmt() : null))) {
                    if (arbInvestDetailsBean != null) {
                        unitAmt = arbInvestDetailsBean.getUnitAmt();
                    }
                    str = null;
                }
                str = unitAmt;
            }
            C47988uAv.setInputContent$default(c47988uAv2, str, false, false, 6, null);
            this.valueOf = java.lang.Boolean.FALSE;
        }
        if (arbInvestDetailsBean == null || (minUnitAmt = arbInvestDetailsBean.getMinUnitAmt()) == null) {
            minUnitAmt = "50";
        }
        KWHzl(minUnitAmt);
        OLrzqt(arbInvestDetailsBean != null ? arbInvestDetailsBean.getMarketSpreadRatio() : null, values().EZpvd.AkhnZx());
    }

    public static /* synthetic */ void refreshPrompt$default(C52946wcH c52946wcH, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        c52946wcH.OLrzqt(str, str2);
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2) {
        android.text.SpannableStringBuilder spannableStringBuilderCopydefault;
        android.text.SpannableStringBuilder spannableStringBuilderCopydefault2;
        java.lang.String str3 = str;
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) ejfBZ())) {
            LinearLayoutCompat linearLayoutCompat = values().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(8);
            return;
        }
        LinearLayoutCompat linearLayoutCompat2 = values().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
        linearLayoutCompat2.setVisibility(0);
        java.lang.String strAkhnZx = values().AhwBna.AkhnZx();
        java.lang.String strDivS$default = C33129mqd.divS$default(strAkhnZx, 100, null, null, null, 14, null);
        if (C33129mqd.valueOf(strDivS$default, str3)) {
            values().copydefault.setText(hDKMBd() ? C33070mpX.AYXKKw(C48033uCm.Fragment.Dfv) : C33070mpX.AYXKKw(C48033uCm.Fragment.jh));
            values().copydefault.setTextColor(C56033xvF.OLrzqt((java.lang.Object) 1));
            kotlin.Pair[] pairArr = new kotlin.Pair[4];
            pairArr[0] = C56390yDp.OLrzqt("spreadLimit", copydefault(C33129mqd.OLrzqt((java.lang.CharSequence) strAkhnZx) ? pTB.formatICUPercent$default(C33129mqd.EZpvd(strDivS$default), RoundingMode.DOWN, C38307pTy.Companion.KWHzl(0, 3), null, java.lang.Double.valueOf(100.0d), null, 20, null) : "--"));
            pairArr[1] = C56390yDp.OLrzqt("currSpread", copydefault(pTB.formatICUPercent$default(C33129mqd.EZpvd(str), RoundingMode.DOWN, C38307pTy.Companion.KWHzl(0, 3), null, java.lang.Double.valueOf(100.0d), null, 20, null)));
            pairArr[2] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, copydefault(str2 == null ? "" : str2));
            java.lang.String str4 = this.fJNWhG;
            if (str4 == null) {
                str4 = "";
            }
            pairArr[3] = C56390yDp.OLrzqt("ccy", copydefault(str4));
            java.util.Map mapGEmmrt = C56424yEw.gEmmrt(pairArr);
            if (hDKMBd()) {
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                spannableStringBuilderCopydefault2 = C33069mpW.copydefault(contextRequireContext, C48033uCm.Fragment.GCXiNH, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) mapGEmmrt);
            } else {
                android.content.Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                spannableStringBuilderCopydefault2 = C33069mpW.copydefault(contextRequireContext2, C48033uCm.Fragment.sendBehavioSecData, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) mapGEmmrt);
            }
            android.widget.TextView textView = values().OLrzqt;
            textView.setText(AEQbTJ(spannableStringBuilderCopydefault2));
            textView.setTextAppearance(C32113mPz.Dialog.fIwbmz);
            return;
        }
        if (C33129mqd.AEQbTJ(strDivS$default, str3)) {
            values().copydefault.setText(hDKMBd() ? C33070mpX.AYXKKw(C48033uCm.Fragment.GGlJim) : C33070mpX.AYXKKw(C48033uCm.Fragment.sCB));
            values().copydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq));
            kotlin.Pair[] pairArr2 = new kotlin.Pair[4];
            pairArr2[0] = C56390yDp.OLrzqt("spreadLimit", copydefault(C33129mqd.OLrzqt((java.lang.CharSequence) strAkhnZx) ? xMR.copydefault.EZpvd(strDivS$default, 3, 0, RoundingMode.DOWN) : "--"));
            xMR xmr = xMR.copydefault;
            if (str3 == null) {
                str3 = "";
            }
            pairArr2[1] = C56390yDp.OLrzqt("currSpread", copydefault(xmr.EZpvd(str3, 3, 0, RoundingMode.DOWN)));
            pairArr2[2] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, copydefault(str2 == null ? "" : str2));
            java.lang.String str5 = this.fJNWhG;
            if (str5 == null) {
                str5 = "";
            }
            pairArr2[3] = C56390yDp.OLrzqt("ccy", copydefault(str5));
            java.util.Map mapGEmmrt2 = C56424yEw.gEmmrt(pairArr2);
            if (hDKMBd()) {
                android.content.Context contextRequireContext3 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                spannableStringBuilderCopydefault = C33069mpW.copydefault(contextRequireContext3, C48033uCm.Fragment.DRGLNw, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) mapGEmmrt2);
            } else {
                android.content.Context contextRequireContext4 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
                spannableStringBuilderCopydefault = C33069mpW.copydefault(contextRequireContext4, C48033uCm.Fragment.DcMfJKDcMfJK, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) mapGEmmrt2);
            }
            android.widget.TextView textView2 = values().OLrzqt;
            textView2.setText(AEQbTJ(spannableStringBuilderCopydefault));
            textView2.setTextAppearance(C32113mPz.Dialog.fIwbmz);
        }
    }

    public final android.text.SpannableString copydefault(java.lang.String str) {
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), 0, spannableString.length(), 17);
        spannableString.setSpan(new android.text.style.StyleSpan(0), 0, spannableString.length(), 17);
        return spannableString;
    }

    public final android.text.SpannableString AEQbTJ(java.lang.CharSequence charSequence) {
        android.text.SpannableString spannableString = new android.text.SpannableString(charSequence);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)), 0, spannableString.length(), 17);
        return spannableString;
    }

    public static final Unit copydefault(C52946wcH c52946wcH, C47988uAv c47988uAv, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (Intrinsics.EZpvd(c47988uAv, c52946wcH.values().AhwBna)) {
            c52946wcH.AEQbTJ(z);
        } else {
            Intrinsics.EZpvd(c47988uAv, c52946wcH.values().EZpvd);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C52946wcH c52946wcH, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (Intrinsics.EZpvd(c47988uAv, c52946wcH.values().AhwBna)) {
            c52946wcH.values().AhwBna.copydefault();
            c52946wcH.fIwbmz();
        } else {
            Intrinsics.EZpvd(c47988uAv, c52946wcH.values().EZpvd);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C52946wcH c52946wcH, java.lang.String str) {
        c52946wcH.OLrzqt(c52946wcH.fetchVPNInfo, str);
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(C52946wcH c52946wcH) {
        c52946wcH.DbNXlk = java.lang.Boolean.FALSE;
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(C52946wcH c52946wcH) {
        c52946wcH.valueOf = java.lang.Boolean.FALSE;
        c52946wcH.AuCTelauCTel();
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(boolean z) {
        if (z) {
            return;
        }
        java.lang.String strEjfBZ = ejfBZ();
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEjfBZ)) {
            values().AhwBna.setInputErrorMsg(strEjfBZ);
        }
    }

    public final java.lang.String ejfBZ() {
        java.lang.String strAkhnZx = values().AhwBna.AkhnZx();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) "-10") || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) "10") || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
            return "";
        }
        return C33129mqd.gEmmrt(strAkhnZx, "-10") ? C33069mpW.copydefault(this, C48033uCm.Fragment.zDGrpR, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("minSpread", "-10%"))) : C33129mqd.AEQbTJ(strAkhnZx, "10") ? C33069mpW.copydefault(this, C48033uCm.Fragment.FQMcgEfQMcgE, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("maxSpread", "10%"))) : "";
    }

    private final void AuCTelauCTel() {
        checkAmtIsValid$default(this, null, 1, null);
        OLrzqt(this.fetchVPNInfo, values().EZpvd.AkhnZx());
    }

    public static final void isConnected(C52946wcH c52946wcH) {
        if (c52946wcH.iwGUEr.getFirst().booleanValue()) {
            c52946wcH.values().EZpvd.copydefault();
        } else {
            c52946wcH.values().EZpvd.setInputErrorMsg(c52946wcH.iwGUEr.getSecond());
        }
    }

    public static /* synthetic */ boolean checkAmtIsValid$default(C52946wcH c52946wcH, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "50";
        }
        return c52946wcH.KWHzl(str);
    }

    public final boolean KWHzl(java.lang.String str) {
        this.iwGUEr = OLrzqt(str);
        C47988uAv c47988uAv = values().EZpvd;
        c47988uAv.removeCallbacks(this.getFieldNames);
        c47988uAv.postDelayed(this.getFieldNames, 500L);
        return this.iwGUEr.getFirst().booleanValue();
    }

    public static /* synthetic */ kotlin.Pair getCheckResult$default(C52946wcH c52946wcH, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "50";
        }
        return c52946wcH.OLrzqt(str);
    }

    public final kotlin.Pair<java.lang.Boolean, java.lang.String> OLrzqt(java.lang.String str) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) values().EZpvd.AkhnZx()) && C33129mqd.gEmmrt(values().EZpvd.AkhnZx(), str)) {
            return new kotlin.Pair<>(java.lang.Boolean.FALSE, C33069mpW.copydefault(C48033uCm.Fragment.Dap, C56423yEv.EZpvd(C56390yDp.OLrzqt("minSpread", xMR.copydefault.copydefault(str)))));
        }
        return new kotlin.Pair<>(java.lang.Boolean.TRUE, "");
    }

    private final void uzCIH() {
        copydefault();
        getFieldNames();
        isConnected();
        fJNWhG();
        getNewProxyInstance();
    }

    public final void copydefault() {
        if (hDKMBd()) {
            uVN uvnValues = values();
            uvnValues.valueOf.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.QnnRaN));
            uvnValues.AYXKKw.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.fdt));
        } else {
            uVN uvnValues2 = values();
            uvnValues2.valueOf.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.sbu));
            uvnValues2.AYXKKw.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.Hx));
        }
    }

    private final void getNewProxyInstance() {
        C55258xgZ c55258xgZ = values().valueOf;
        c55258xgZ.setOnClickListener(new Activity(c55258xgZ, 1000L, this));
    }

    public final void fJNWhG() {
        final uVN uvnValues = values();
        uvnValues.fetchVPNInfo.EZpvd().setTextAppearance(C32113mPz.Dialog.AuCTelauCTel);
        uvnValues.fetchVPNInfo.EZpvd().setTextColor(ContextCompat.getColor(uvnValues.fetchVPNInfo.getContext(), C52761wXj.Activity.gLWkOL));
        uvnValues.fetchVPNInfo.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.sVvuFk));
        uvnValues.fetchVPNInfo.setValue("--");
        uvnValues.fetchVPNInfo.EZpvd(true, new View.OnClickListener() { // from class: o.wcJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52946wcH.OLrzqt(this.OLrzqt, uvnValues, view);
            }
        });
    }

    public static final void OLrzqt(C52946wcH c52946wcH, uVN uvn, android.view.View view) {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.RckOJh);
        android.content.Context contextRequireContext = c52946wcH.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(uvn.fetchVPNInfo.KWHzl());
        viewOnClickListenerC54939xaY.EZpvd(strAYXKKw);
        java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C55688xof.Application.QWSkGZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.wcI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C52946wcH.OLrzqt(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.uyR.setWindowSoftInput$default(androidx.fragment.app.Fragment, android.view.View, java.lang.Integer, android.view.View, int, int, java.lang.Object):void */
    private final void getFieldNames() {
        uVN uvnValues = values();
        C49960uyR.setWindowSoftInput$default(this, uvnValues.AhwBna, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), uvnValues.AhwBna, 0, 8, (java.lang.Object) null);
        C49960uyR.setWindowSoftInput$default(this, uvnValues.EZpvd, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), uvnValues.EZpvd, 0, 8, (java.lang.Object) null);
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final void isConnected() {
        java.lang.String str;
        java.lang.String strMulS$default;
        KWHzl("-10", "10");
        C47988uAv c47988uAv = values().AhwBna;
        c47988uAv.djBIcL().setAllowShowNegative(true);
        c47988uAv.djBIcL().setAllowEditNegative(true);
        c47988uAv.djBIcL().setAcceptKeyListener(new ActionBar());
        c47988uAv.setInputUnit("%");
        c47988uAv.setMaxDecimal(3);
        c47988uAv.setOnFocusChangeCallback(this.OLrzqt);
        c47988uAv.setOnTextChangeCallback(this.copydefault);
        c47988uAv.KWHzl(this.AkhnZx);
        java.lang.String str2 = "";
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.values) || C33129mqd.OLrzqt((java.lang.CharSequence) this.getNewProxyInstance)) {
            this.DbNXlk = java.lang.Boolean.TRUE;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) this.getNewProxyInstance)) {
                strMulS$default = C33129mqd.mulS$default(this.getNewProxyInstance, 100, null, null, null, 14, null);
            } else if (!C33129mqd.OLrzqt((java.lang.CharSequence) this.values)) {
                str = "";
                C47988uAv.setInputContent$default(c47988uAv, str, false, false, 6, null);
            } else {
                strMulS$default = C33129mqd.mulS$default(this.values, 100, null, null, null, 14, null);
            }
            str = strMulS$default;
            C47988uAv.setInputContent$default(c47988uAv, str, false, false, 6, null);
        }
        C47988uAv c47988uAv2 = values().EZpvd;
        java.lang.String str3 = this.fJNWhG;
        if (str3 == null) {
            str3 = "";
        }
        c47988uAv2.setInputUnit(str3);
        c47988uAv2.setMaxDecimal(0);
        c47988uAv2.setMaxValue("99999999");
        c47988uAv2.setOnFocusChangeCallback(this.OLrzqt);
        c47988uAv2.setOnTextChangeCallback(this.copydefault);
        c47988uAv2.setOnMaxValueTriggerCallback(this.uzCIH);
        c47988uAv2.KWHzl(this.AYXKKw);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.hDKMBd) || C33129mqd.OLrzqt((java.lang.CharSequence) this.AuCTel)) {
            this.valueOf = java.lang.Boolean.TRUE;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) this.hDKMBd)) {
                str2 = this.hDKMBd;
            } else if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AuCTel)) {
                str2 = this.AuCTel;
            }
            C47988uAv.setInputContent$default(c47988uAv2, str2, false, false, 6, null);
        }
    }

    /* JADX INFO: renamed from: o.wcH$ActionBar */
    public static final class ActionBar extends android.text.method.NumberKeyListener {
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
    public final void AuCTel() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    private final boolean hDKMBd() {
        return Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) "open");
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(1);
        if (hDKMBd()) {
            wxq.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.OrsvgJ));
        } else {
            wxq.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.DcMfJKDIADVb));
        }
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
        wyf.setOnClickListener(new TaskDescription(wyf, 1000L, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean AubY() {
        if (values().AhwBna.AkhnZx().length() == 0) {
            values().AhwBna.zsXlph();
            return false;
        }
        if (values().EZpvd.AkhnZx().length() == 0) {
            values().EZpvd.zsXlph();
            return false;
        }
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) ejfBZ())) {
            values().AhwBna.zsXlph();
            return false;
        }
        if (checkAmtIsValid$default(this, null, 1, null)) {
            return true;
        }
        values().EZpvd.zsXlph();
        return false;
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2) {
        if (C33129mqd.valueOf(str, str2)) {
            xMR xmr = xMR.copydefault;
            C47988uAv.setInputLabel$default(values().AhwBna, xmr.copydefault(str) + " - " + xmr.KWHzl(str2, 0), null, 2, null);
        }
    }
}
