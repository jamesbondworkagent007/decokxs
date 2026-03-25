package o;

import androidx.core.os.BundleKt;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.tradeuilib.order.strategy.StrategyTradePresenter;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcdOrderReq;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.RecurringOrderData;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SmartArbitrageReq;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyMoveOrderReq;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C49511upt;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vTy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50587vTy extends AbstractC50583vTu {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public StrategyTradePresenter copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49393unh
    public java.lang.String djBIcL() {
        return "TwapOrderConfirmDFragment";
    }

    /* JADX INFO: renamed from: o.vTy$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vTy.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C50587vTy copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull StrategyBaseReq strategyBaseReq, @NotNull TwapReq twapReq) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(strategyBaseReq, "");
            Intrinsics.checkNotNullParameter(twapReq, "");
            C50587vTy c50587vTy = new C50587vTy();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("instId", str);
            bundle.putString("instType", str2);
            bundle.putParcelable("baseReq", strategyBaseReq);
            bundle.putParcelable("twapReq", twapReq);
            c50587vTy.setArguments(bundle);
            return c50587vTy;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ViewModelProvider.Factory defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
        this.copydefault = (StrategyTradePresenter) new ViewModelProvider(this, defaultViewModelProviderFactory).get(StrategyTradePresenter.class);
    }

    @Override // o.AbstractC50583vTu, o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String string2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        java.lang.String string3 = getString(C55688xof.Application.ComponentActivityNonConfigurationInstances);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        C54799xVt c54799xVt = C54799xVt.AEQbTJ;
        android.os.Bundle arguments = getArguments();
        java.lang.String str = (arguments == null || (string2 = arguments.getString("instId")) == null) ? "" : string2;
        android.os.Bundle arguments2 = getArguments();
        djBIcL(C54799xVt.getTitleByIdAndType$default(c54799xVt, str, (arguments2 == null || (string = arguments2.getString("instType")) == null) ? "" : string, false, false, 12, null));
        AhwBna(string3);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0127  */
    @Override // o.AbstractC50583vTu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<TacticsInsideItemData> EZpvd() {
        java.lang.String string;
        java.lang.String string2;
        StrategyBaseReq strategyBaseReq;
        TwapReq twapReq;
        java.lang.String safeString$default;
        java.lang.String safeString$default2;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String safeString$default3;
        C54536xML c54536xMLAYXKKw2;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo2;
        C54536xML c54536xMLKWHzl;
        C54536xML c54536xMLDjBIcL3;
        C54536xML c54536xMLFetchVPNInfo3;
        C54536xML c54536xMLDjBIcL4;
        C54536xML c54536xMLFetchVPNInfo4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.Bundle arguments = getArguments();
        java.lang.String str = "";
        if (arguments == null || (string = arguments.getString("instId")) == null) {
            string = "";
        }
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("instType")) == null) {
            string2 = "";
        }
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 == null || (strategyBaseReq = (StrategyBaseReq) arguments3.getParcelable("baseReq")) == null) {
            return yDY.AhwBna();
        }
        android.os.Bundle arguments4 = getArguments();
        if (arguments4 == null || (twapReq = (TwapReq) arguments4.getParcelable("twapReq")) == null) {
            return yDY.AhwBna();
        }
        C55887xsS c55887xsS = new C55887xsS(string2, string);
        c55887xsS.gEmmrt(twapReq.getTradeQuoteCcy());
        java.lang.String side = strategyBaseReq.getSide();
        if (side == null) {
            side = "";
        }
        java.lang.String posSide = strategyBaseReq.getPosSide();
        if (posSide == null) {
            posSide = "";
        }
        kotlin.Pair<java.lang.String, java.lang.Boolean> pairAYXKKw = C56033xvF.AYXKKw(string2, side, posSide);
        int iAEQbTJ = C56033xvF.AEQbTJ(pairAYXKKw.getSecond().booleanValue());
        copydefault(pairAYXKKw.getFirst(), 0);
        KWHzl(iAEQbTJ);
        StrategyTradePresenter strategyTradePresenter = this.copydefault;
        if (strategyTradePresenter == null) {
            Intrinsics.gEmmrt("");
            strategyTradePresenter = null;
        }
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) strategyBaseReq.getSide(), (java.lang.Object) "buy");
        java.lang.String leftLevel = twapReq.getLeftLevel();
        if (leftLevel == null) {
            leftLevel = "";
        }
        java.lang.String rightLevel = twapReq.getRightLevel();
        if (rightLevel == null) {
            rightLevel = "";
        }
        java.lang.String strAEQbTJ = strategyTradePresenter.AEQbTJ(string2, zEZpvd, leftLevel, rightLevel);
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)) {
            gEmmrt("");
        } else {
            gEmmrt(C56033xvF.getBotLever$default(strAEQbTJ, false, 2, null));
        }
        AEQbTJ(iAEQbTJ);
        TacticsInsideItemData tacticsInsideItemData = new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
        tacticsInsideItemData.setTitle(getString(C55688xof.Application.ikIEnW));
        java.lang.String pxSpread = twapReq.getPxSpread();
        if (pxSpread != null && pxSpread.length() != 0) {
            xMS xmsAEQbTJ = C54797xVr.copydefault.AEQbTJ(string, string2);
            if (xmsAEQbTJ == null) {
                java.lang.String safeString$default4 = "";
                tacticsInsideItemData.setText(safeString$default4);
                tacticsInsideItemData.setTitle(getString(C55688xof.Application.ikIEnW));
            } else {
                java.lang.String pxSpread2 = twapReq.getPxSpread();
                if (pxSpread2 == null) {
                    pxSpread2 = "";
                }
                C54536xML c54536xMLKWHzl2 = xmsAEQbTJ.KWHzl(pxSpread2);
                if (c54536xMLKWHzl2 == null || (c54536xMLDjBIcL4 = c54536xMLKWHzl2.djBIcL()) == null || (c54536xMLFetchVPNInfo4 = c54536xMLDjBIcL4.fetchVPNInfo()) == null || (safeString$default4 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo4, false, 1, null)) == null) {
                }
                tacticsInsideItemData.setText(safeString$default4);
                tacticsInsideItemData.setTitle(getString(C55688xof.Application.ikIEnW));
            }
        } else {
            java.lang.String pxVar = twapReq.getPxVar();
            if (pxVar != null && pxVar.length() != 0) {
                xMR xmr = xMR.copydefault;
                tacticsInsideItemData.setText(xMR.formatICUPercent$default(xmr, xmr.OLrzqt((java.lang.Object) twapReq.getPxVar()), null, C38307pTy.Companion.copydefault(0), null, java.lang.Double.valueOf(100.0d), null, 42, null));
            }
        }
        arrayList.add(tacticsInsideItemData);
        TacticsInsideItemData tacticsInsideItemData2 = new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
        tacticsInsideItemData2.setTitle(getString(C55688xof.Application.HJWChPRGtXKCDKRTZD));
        xMS xmsAEQbTJ2 = C54797xVr.copydefault.AEQbTJ(string, string2);
        if (xmsAEQbTJ2 == null || (c54536xMLKWHzl = xmsAEQbTJ2.KWHzl(twapReq.getPxLimit())) == null || (c54536xMLDjBIcL3 = c54536xMLKWHzl.djBIcL()) == null || (c54536xMLFetchVPNInfo3 = c54536xMLDjBIcL3.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo3, false, 1, null)) == null) {
            safeString$default = "";
        }
        tacticsInsideItemData2.setText(safeString$default);
        arrayList.add(tacticsInsideItemData2);
        TacticsInsideItemData tacticsInsideItemData3 = new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
        tacticsInsideItemData3.setTitle(getString(C55688xof.Application.LocalOnBackPressedDispatcherOwnerLocalOnBackPressedDispatcherOwner1));
        tacticsInsideItemData3.setText(twapReq.getTimeInterval() + " " + C33070mpX.AYXKKw(C55688xof.Application.XmlRes));
        arrayList.add(tacticsInsideItemData3);
        TacticsInsideItemData tacticsInsideItemData4 = new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
        tacticsInsideItemData4.setTitle(getString(C55688xof.Application.RSmiaq));
        C54571xNh c54571xNhCreateAmtConvert$default = C55887xsS.createAmtConvert$default(c55887xsS, null, false, 3, null);
        if (c54571xNhCreateAmtConvert$default == null || (c54536xMLAYXKKw2 = c54571xNhCreateAmtConvert$default.AYXKKw(twapReq.getSzLimit())) == null || (c54536xMLDjBIcL2 = c54536xMLAYXKKw2.djBIcL()) == null || (c54536xMLFetchVPNInfo2 = c54536xMLDjBIcL2.fetchVPNInfo()) == null || (safeString$default2 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo2, false, 1, null)) == null) {
            safeString$default2 = "";
        }
        tacticsInsideItemData4.setText(safeString$default2);
        arrayList.add(tacticsInsideItemData4);
        TacticsInsideItemData tacticsInsideItemData5 = new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
        tacticsInsideItemData5.setTitle(getString(C55688xof.Application.ComponentActivityKt));
        C54571xNh c54571xNhCreateAmtConvert$default2 = C55887xsS.createAmtConvert$default(c55887xsS, null, false, 3, null);
        if (c54571xNhCreateAmtConvert$default2 != null && (c54536xMLAYXKKw = c54571xNhCreateAmtConvert$default2.AYXKKw(twapReq.getSz())) != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null && (safeString$default3 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) != null) {
            str = safeString$default3;
        }
        tacticsInsideItemData5.setText(str);
        arrayList.add(tacticsInsideItemData5);
        if (c55887xsS.AuCTel()) {
            TacticsInsideItemData tacticsInsideItemData6 = new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
            tacticsInsideItemData6.setTitle(C33070mpX.AYXKKw(C49511upt.Activity.dNCPSb));
            tacticsInsideItemData6.setText(c55887xsS.copydefault("twap"));
            arrayList.add(tacticsInsideItemData6);
        }
        return arrayList;
    }

    @Override // o.AbstractC50583vTu
    public void OLrzqt() {
        StrategyBaseReq strategyBaseReq;
        dismissAllowingStateLoss();
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (strategyBaseReq = (StrategyBaseReq) arguments.getParcelable("baseReq")) == null) {
            return;
        }
        StrategyReqGroup strategyReqGroup = new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, (GridReq) null, (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, (AutoVipProfitInfo) null, (DcaOrderReq) null, (AiOrderReq) null, 32766, (DefaultConstructorMarker) null);
        android.os.Bundle arguments2 = getArguments();
        strategyReqGroup.setTwapReq(arguments2 != null ? (TwapReq) arguments2.getParcelable("twapReq") : null);
        C56028xvA.OLrzqt("make_order", C56424yEw.gEmmrt(C56390yDp.OLrzqt("baseReq", C33129mqd.gEmmrt(strategyReqGroup.getBaseReq())), C56390yDp.OLrzqt("twapReq", C33129mqd.gEmmrt(strategyReqGroup.getTwapReq()))));
        getParentFragmentManager().setFragmentResult("bot_order", BundleKt.bundleOf(C56390yDp.OLrzqt("bot_order_data", strategyReqGroup)));
    }
}
