package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.os.BundleCompat;
import androidx.core.widget.TextViewCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelStoreOwner;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter.SmartArbiPreviewPositionPresenter;
import com.okinc.unify_trade.biz.ArbInvestDetailsItems;
import com.okinc.unify_trade.biz.ArbitrageInfoResponse;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.CostVo;
import com.okinc.unify_trade.biz.EstimatedClosePnlVo;
import com.okinc.unify_trade.biz.EstimatedStakingVo;
import com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.wUX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wbe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52916wbe extends AbstractC48165uHj<uQH, SmartArbiPreviewPositionPresenter> implements ViewModelStoreOwner {
    public java.lang.Boolean AhwBna;
    public java.lang.String AkhnZx;
    public ArbitrageInfoResponse DbNXlk;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public java.lang.Float djBIcL;
    public java.lang.String fetchVPNInfo;
    public java.lang.Boolean gEmmrt;
    public java.lang.Boolean valueOf;
    public java.lang.String values;
    public final int AYXKKw = C48033uCm.Activity.fsSxsn;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.wbj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52916wbe.KWHzl(this.KWHzl);
        }
    });
    public java.lang.String isConnected = "USDT";

    /* JADX INFO: renamed from: o.wbe$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AYXKKw;
    }

    @Override // o.AbstractC48165uHj, o.AbstractC54505xKx, o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC48165uHj, o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
    }

    public C52916wbe() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.AhwBna = bool;
        this.valueOf = bool;
        this.gEmmrt = bool;
        this.djBIcL = java.lang.Float.valueOf(1.0f);
    }

    private final C53518wmx AYXKKw() {
        return (C53518wmx) this.AEQbTJ.getValue();
    }

    public static final C53518wmx KWHzl(C52916wbe c52916wbe) {
        android.content.Context contextRequireContext = c52916wbe.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C53518wmx(contextRequireContext, null, 0, 6, null);
    }

    /* JADX DEBUG: Method merged with bridge method: gEmmrt()Landroid/view/View; */
    /* JADX DEBUG: Possible override for method o.uHj.AEQbTJ()V */
    @Override // o.AbstractC48165uHj
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C53518wmx gEmmrt() {
        return AYXKKw();
    }

    public final boolean valueOf() {
        return Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) "open");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl() {
        SmartArbiPreviewPositionPresenter smartArbiPreviewPositionPresenter = (SmartArbiPreviewPositionPresenter) dxcTrN();
        java.lang.String str = this.EZpvd;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = this.AkhnZx;
        if (str2 == null) {
            str2 = "";
        }
        smartArbiPreviewPositionPresenter.copydefault(str, str2, this.values, this.copydefault, this.fetchVPNInfo, this.djBIcL, Intrinsics.EZpvd(this.AhwBna, java.lang.Boolean.TRUE) ? SubArbitrageType4Remote.STAKE : SubArbitrageType4Remote.EMPTY);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC48165uHj, o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        ((uQH) gGvvIC()).values.AEQbTJ(this.OLrzqt);
    }

    @Override // o.AbstractC54505xKx, o.AbstractC56129xww, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        ArbitrageInfoResponse arbitrageInfoResponse;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        this.OLrzqt = arguments != null ? arguments.getString("bot_inst_id") : null;
        android.os.Bundle arguments2 = getArguments();
        this.KWHzl = arguments2 != null ? arguments2.getString("bot_inst_type") : null;
        android.os.Bundle arguments3 = getArguments();
        this.EZpvd = arguments3 != null ? arguments3.getString("inst_family_params") : null;
        android.os.Bundle arguments4 = getArguments();
        this.copydefault = arguments4 != null ? arguments4.getString("algoId") : null;
        android.os.Bundle arguments5 = getArguments();
        this.isConnected = arguments5 != null ? arguments5.getString("unit_params") : null;
        android.os.Bundle arguments6 = getArguments();
        this.AkhnZx = arguments6 != null ? arguments6.getString("total_amt_params") : null;
        android.os.Bundle arguments7 = getArguments();
        this.fetchVPNInfo = arguments7 != null ? arguments7.getString("query_scene_params") : null;
        android.os.Bundle arguments8 = getArguments();
        this.valueOf = arguments8 != null ? java.lang.Boolean.valueOf(arguments8.getBoolean("is_leverage_selected_params")) : null;
        android.os.Bundle arguments9 = getArguments();
        this.gEmmrt = arguments9 != null ? java.lang.Boolean.valueOf(arguments9.getBoolean("is_leverage_params")) : null;
        android.os.Bundle arguments10 = getArguments();
        this.djBIcL = arguments10 != null ? java.lang.Float.valueOf(arguments10.getFloat("leverage_principal_params")) : null;
        android.os.Bundle arguments11 = getArguments();
        this.values = arguments11 != null ? arguments11.getString("spread_ratio_params") : null;
        android.os.Bundle arguments12 = getArguments();
        this.AhwBna = arguments12 != null ? java.lang.Boolean.valueOf(arguments12.getBoolean("is_staking_params")) : null;
        android.os.Bundle arguments13 = getArguments();
        if (arguments13 == null || (arbitrageInfoResponse = (ArbitrageInfoResponse) BundleCompat.getParcelable(arguments13, "multi_min_amount_item_params", ArbitrageInfoResponse.class)) == null) {
            arbitrageInfoResponse = new ArbitrageInfoResponse((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (ArbitrageTotalPnlInfo) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (EstimatedStakingVo) null, (EstimatedStakingVo) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (CostVo) null, (EstimatedClosePnlVo) null, (CostVo) null, (CostVo) null, (java.lang.String) null, (java.lang.String) null, false, 16777215, (DefaultConstructorMarker) null);
        }
        this.DbNXlk = arbitrageInfoResponse;
        if (valueOf()) {
            KWHzl();
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        copydefault();
        djBIcL();
    }

    public static /* synthetic */ java.lang.String getFormatedAmount$default(C52916wbe c52916wbe, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return c52916wbe.copydefault(str, i);
    }

    public final java.lang.String copydefault(java.lang.String str, int i) {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            return "--";
        }
        xMR xmr = xMR.copydefault;
        if (str == null) {
            str = "";
        }
        return xMR.formatFloorToMax$default(xmr, str, i, null, null, 12, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault() {
        java.lang.String str;
        java.lang.String amt;
        java.lang.String amt2;
        boolean z;
        boolean z2;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.util.List<ArbInvestDetailsItems> arbItems;
        java.lang.Object next;
        java.util.List<ArbInvestDetailsItems> arbItems2;
        java.lang.Object next2;
        java.lang.String enlargedAmt;
        java.lang.String interestDebt;
        uQH uqh = (uQH) gGvvIC();
        if (valueOf()) {
            uqh.valueOf.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.fTEjYi));
        } else {
            uqh.valueOf.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.OgHfcT));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AkhnZx)) {
            str = this.AkhnZx;
            if (str == null) {
                str = "";
            }
        } else {
            str = "10000";
        }
        android.widget.TextView textView = uqh.fetchVPNInfo;
        xMR xmr = xMR.copydefault;
        textView.setText(xmr.copydefault(str) + " " + this.isConnected);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AkhnZx)) {
            android.widget.TextView textView2 = uqh.djBIcL;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
        } else {
            android.widget.TextView textView3 = uqh.djBIcL;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(0);
            uqh.djBIcL.setText(C33069mpW.copydefault(this, C48033uCm.Fragment.finishInit, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, xmr.copydefault(str) + " " + this.isConnected))));
        }
        LinearLayoutCompat linearLayoutCompat = uqh.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(Intrinsics.EZpvd(valueOf() ? this.valueOf : this.gEmmrt, java.lang.Boolean.TRUE) ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat2 = uqh.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
        linearLayoutCompat2.setVisibility(Intrinsics.EZpvd(valueOf() ? this.valueOf : this.gEmmrt, java.lang.Boolean.TRUE) ? 0 : 8);
        if (valueOf()) {
            java.lang.Boolean bool = this.valueOf;
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            if (Intrinsics.EZpvd(bool, bool2)) {
                android.widget.TextView textView4 = uqh.KWHzl;
                if (Intrinsics.EZpvd(this.gEmmrt, bool2)) {
                    ArbitrageInfoResponse arbitrageInfoResponse = this.DbNXlk;
                    enlargedAmt = arbitrageInfoResponse != null ? arbitrageInfoResponse.getEnlargedAmt() : null;
                } else {
                    enlargedAmt = "";
                }
                textView4.setText(getFormatedAmount$default(this, enlargedAmt, 0, 2, null) + " " + this.isConnected);
                android.widget.TextView textView5 = uqh.copydefault;
                if (Intrinsics.EZpvd(this.gEmmrt, bool2)) {
                    ArbitrageInfoResponse arbitrageInfoResponse2 = this.DbNXlk;
                    interestDebt = arbitrageInfoResponse2 != null ? arbitrageInfoResponse2.getInterestDebt() : null;
                } else {
                    interestDebt = "";
                }
                textView5.setText(getFormatedAmount$default(this, interestDebt, 0, 2, null) + " " + this.isConnected);
            }
        } else if (Intrinsics.EZpvd(this.gEmmrt, java.lang.Boolean.TRUE)) {
            android.widget.TextView textView6 = uqh.KWHzl;
            ArbitrageInfoResponse arbitrageInfoResponse3 = this.DbNXlk;
            textView6.setText(getFormatedAmount$default(this, arbitrageInfoResponse3 != null ? arbitrageInfoResponse3.getEnlargedAmt() : null, 0, 2, null) + " " + this.isConnected);
            android.widget.TextView textView7 = uqh.copydefault;
            ArbitrageInfoResponse arbitrageInfoResponse4 = this.DbNXlk;
            textView7.setText(getFormatedAmount$default(this, arbitrageInfoResponse4 != null ? arbitrageInfoResponse4.getInterestDebt() : null, 0, 2, null) + " " + this.isConnected);
        }
        ArbitrageInfoResponse arbitrageInfoResponse5 = this.DbNXlk;
        if (arbitrageInfoResponse5 == null || (arbItems2 = arbitrageInfoResponse5.getArbItems()) == null) {
            amt = null;
        } else {
            java.util.Iterator<T> it = arbItems2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it.next();
                    if (!Intrinsics.EZpvd((java.lang.Object) ((ArbInvestDetailsItems) next2).getInstType(), (java.lang.Object) "SWAP")) {
                        break;
                    }
                }
            }
            ArbInvestDetailsItems arbInvestDetailsItems = (ArbInvestDetailsItems) next2;
            if (arbInvestDetailsItems != null) {
                amt = arbInvestDetailsItems.getAmt();
            }
        }
        java.lang.String formatedAmount$default = getFormatedAmount$default(this, amt, 0, 2, null);
        ArbitrageInfoResponse arbitrageInfoResponse6 = this.DbNXlk;
        if (arbitrageInfoResponse6 == null || (arbItems = arbitrageInfoResponse6.getArbItems()) == null) {
            amt2 = null;
        } else {
            java.util.Iterator<T> it2 = arbItems.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((ArbInvestDetailsItems) next).getInstType(), (java.lang.Object) "SWAP")) {
                        break;
                    }
                }
            }
            ArbInvestDetailsItems arbInvestDetailsItems2 = (ArbInvestDetailsItems) next;
            if (arbInvestDetailsItems2 != null) {
                amt2 = arbInvestDetailsItems2.getAmt();
            }
        }
        java.lang.String formatedAmount$default2 = getFormatedAmount$default(this, amt2, 0, 2, null);
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ);
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        int iAEQbTJ = c33512mxp.AEQbTJ(iCopydefault, 0.5f);
        TextViewCompat.setCompoundDrawableTintList(uqh.ejfBZ, android.content.res.ColorStateList.valueOf(iCopydefault));
        TextViewCompat.setCompoundDrawableTintList(uqh.AYXKKw, android.content.res.ColorStateList.valueOf(iAEQbTJ));
        uqh.fIwbmz.setText(formatedAmount$default + " " + this.isConnected);
        uqh.hDKMBd.setText(formatedAmount$default2 + " " + this.isConnected);
        int iCopydefault2 = C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ);
        uqh.AEQbTJ.OLrzqt(yDY.gEmmrt(new wUX.ActionBar(C33129mqd.EZpvd(amt), iCopydefault2), new wUX.ActionBar(C33129mqd.EZpvd(amt2), c33512mxp.AEQbTJ(iCopydefault2, 0.5f))));
        LinearLayoutCompat linearLayoutCompat3 = uqh.fARcdN;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "");
        java.lang.Boolean bool3 = this.AhwBna;
        java.lang.Boolean bool4 = java.lang.Boolean.TRUE;
        linearLayoutCompat3.setVisibility(Intrinsics.EZpvd(bool3, bool4) ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat4 = uqh.AuCTel;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat4, "");
        linearLayoutCompat4.setVisibility(Intrinsics.EZpvd(this.AhwBna, bool4) ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat5 = uqh.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat5, "");
        linearLayoutCompat5.setVisibility(Intrinsics.EZpvd(this.AhwBna, bool4) ? 0 : 8);
        android.view.View view = uqh.wlaJM;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(Intrinsics.EZpvd(this.AhwBna, bool4) ? 0 : 8);
        if (Intrinsics.EZpvd(this.AhwBna, bool4)) {
            ArbitrageInfoResponse arbitrageInfoResponse7 = this.DbNXlk;
            EstimatedStakingVo estimatedAutoStaking = arbitrageInfoResponse7 != null ? arbitrageInfoResponse7.getEstimatedAutoStaking() : null;
            java.lang.String stakeBaseCcy = estimatedAutoStaking != null ? estimatedAutoStaking.getStakeBaseCcy() : null;
            if (stakeBaseCcy == null) {
                stakeBaseCcy = "";
            }
            java.lang.String strCopydefault = copydefault(estimatedAutoStaking != null ? estimatedAutoStaking.getStakingTotalUsdtAmt() : null, 2);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (estimatedAutoStaking != null ? estimatedAutoStaking.getStakingTotalBaseAmt() : null))) {
                if (C33129mqd.AhwBna(estimatedAutoStaking != null ? estimatedAutoStaking.getStakingTotalBaseAmt() : null, "0")) {
                    z = true;
                }
            } else {
                z = false;
            }
            ArbitrageInfoResponse arbitrageInfoResponse8 = this.DbNXlk;
            EstimatedStakingVo estimatedStaking = arbitrageInfoResponse8 != null ? arbitrageInfoResponse8.getEstimatedStaking() : null;
            java.lang.String stakeBaseCcy2 = estimatedStaking != null ? estimatedStaking.getStakeBaseCcy() : null;
            if (stakeBaseCcy2 == null) {
                stakeBaseCcy2 = "";
            }
            java.lang.String strCopydefault2 = copydefault(estimatedStaking != null ? estimatedStaking.getStakingTotalUsdtAmt() : null, 2);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (estimatedStaking != null ? estimatedStaking.getStakingTotalBaseAmt() : null))) {
                if (C33129mqd.AhwBna(estimatedStaking != null ? estimatedStaking.getStakingTotalBaseAmt() : null, "0")) {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            if (valueOf()) {
                uqh.iwGUEr.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.fTEjYi) + " " + stakeBaseCcy);
                android.widget.TextView textView8 = uqh.getNewProxyInstance;
                java.lang.String strCopydefault3 = copydefault(estimatedAutoStaking != null ? estimatedAutoStaking.getStakingTotalBaseAmt() : null, 4);
                if (z) {
                    str4 = "\n(≈" + strCopydefault + " " + this.isConnected + ")";
                } else {
                    str4 = "";
                }
                textView8.setText(strCopydefault3 + " " + stakeBaseCcy + str4);
                uqh.uzCIH.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.fTEjYi) + " " + stakeBaseCcy2);
                android.widget.TextView textView9 = uqh.getFieldNames;
                java.lang.String strCopydefault4 = copydefault(estimatedStaking != null ? estimatedStaking.getStakingTotalBaseAmt() : null, 4);
                if (z2) {
                    str5 = "\n(≈" + strCopydefault2 + " " + this.isConnected + ")";
                } else {
                    str5 = "";
                }
                textView9.setText(strCopydefault4 + " " + stakeBaseCcy2 + str5);
            } else {
                uqh.iwGUEr.setText(C33069mpW.copydefault(C48033uCm.Fragment.ORWKdN, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, stakeBaseCcy))));
                android.widget.TextView textView10 = uqh.getNewProxyInstance;
                java.lang.String strCopydefault5 = copydefault(estimatedAutoStaking != null ? estimatedAutoStaking.getStakingTotalBaseAmt() : null, 4);
                if (z) {
                    str2 = "\n(≈" + strCopydefault + " " + this.isConnected + ")";
                } else {
                    str2 = "";
                }
                textView10.setText(strCopydefault5 + " " + stakeBaseCcy + str2);
                uqh.uzCIH.setText(C33069mpW.copydefault(C48033uCm.Fragment.ORWKdN, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, stakeBaseCcy2))));
                android.widget.TextView textView11 = uqh.getFieldNames;
                java.lang.String strCopydefault6 = copydefault(estimatedStaking != null ? estimatedStaking.getStakingTotalBaseAmt() : null, 4);
                if (z2) {
                    str3 = "\n(≈" + strCopydefault2 + " " + this.isConnected + ")";
                } else {
                    str3 = "";
                }
                textView11.setText(strCopydefault6 + " " + stakeBaseCcy2 + str3);
            }
            android.widget.TextView textView12 = uqh.AuCTelauCTel;
            int i = C48033uCm.Fragment.gbIfDn;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = C56390yDp.OLrzqt("crypto1", stakeBaseCcy);
            pairArr[1] = C56390yDp.OLrzqt("crypto2", java.lang.String.valueOf(estimatedStaking != null ? estimatedStaking.getStakeBaseCcy() : null));
            textView12.setText(C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void djBIcL() {
        C56111xwe<kotlin.Pair<ArbitrageInfoResponse, java.lang.Boolean>> c56111xweCopydefault = ((SmartArbiPreviewPositionPresenter) dxcTrN()).copydefault();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweCopydefault.observe(viewLifecycleOwner, new ActionBar(new Function1() { // from class: o.wbi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52916wbe.AEQbTJ(this.copydefault, (kotlin.Pair) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = ((SmartArbiPreviewPositionPresenter) dxcTrN()).OLrzqt().AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner2, new ActionBar(new Function1() { // from class: o.wbk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52916wbe.KWHzl(this.AEQbTJ, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(C52916wbe c52916wbe, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        c52916wbe.dismissLoading();
        c52916wbe.DbNXlk = (ArbitrageInfoResponse) pair.getFirst();
        c52916wbe.copydefault();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c52916wbe, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C52916wbe c52916wbe, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c52916wbe, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }
}
