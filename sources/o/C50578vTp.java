package o;

import androidx.core.os.BundleKt;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.tradeuilib.order.strategy.StrategyTradePresenter;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcdOrderReq;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.OrderCategory;
import com.okinc.unify_trade.biz.RecurringOrderData;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SmartArbitrageReq;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyMoveOrderReq;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.IceBergAggressiveType;
import com.okinc.unify_trade.bot.data.LabelData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C49511upt;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vTp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50578vTp extends AbstractC50583vTu {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public StrategyTradePresenter AEQbTJ;
    public java.lang.String EZpvd = "";
    public java.lang.String copydefault = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49393unh
    public java.lang.String djBIcL() {
        return "IcebergOrderConfirmDFragment";
    }

    /* JADX INFO: renamed from: o.vTp$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vTp.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C50578vTp AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull StrategyBaseReq strategyBaseReq, @NotNull IceBergReq iceBergReq) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(strategyBaseReq, "");
            Intrinsics.checkNotNullParameter(iceBergReq, "");
            C50578vTp c50578vTp = new C50578vTp();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("instId", str);
            bundle.putString("instType", str2);
            bundle.putParcelable("baseReq", strategyBaseReq);
            bundle.putParcelable("iceBergReq", iceBergReq);
            c50578vTp.setArguments(bundle);
            return c50578vTp;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ViewModelProvider.Factory defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
        StrategyTradePresenter strategyTradePresenter = (StrategyTradePresenter) new ViewModelProvider(this, defaultViewModelProviderFactory).get(StrategyTradePresenter.class);
        this.AEQbTJ = strategyTradePresenter;
        if (strategyTradePresenter == null) {
            Intrinsics.gEmmrt("");
            strategyTradePresenter = null;
        }
        strategyTradePresenter.KWHzl(new Function2() { // from class: o.vTr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C50578vTp.copydefault((java.lang.String) obj, (java.lang.String) obj2);
            }
        });
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C53685wqE.copydefault.copydefault().copydefault(str, str2);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC50583vTu, o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String string2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        java.lang.String string3 = getString(C55688xof.Application.ComponentActivity1);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        C54799xVt c54799xVt = C54799xVt.AEQbTJ;
        android.os.Bundle arguments = getArguments();
        java.lang.String str = (arguments == null || (string2 = arguments.getString("instId")) == null) ? "" : string2;
        android.os.Bundle arguments2 = getArguments();
        djBIcL(C54799xVt.getTitleByIdAndType$default(c54799xVt, str, (arguments2 == null || (string = arguments2.getString("instType")) == null) ? "" : string, false, false, 12, null));
        AhwBna(string3);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x044a  */
    @Override // o.AbstractC50583vTu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<java.lang.Object> EZpvd() {
        java.lang.String string;
        java.lang.String string2;
        StrategyBaseReq strategyBaseReq;
        IceBergReq iceBergReq;
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
        xOR xorCopydefault;
        java.util.List<OrderCategory> listAEQbTJ;
        java.lang.String safeString$default4;
        C54536xML c54536xMLAYXKKw3;
        C54536xML c54536xMLDjBIcL5;
        C54536xML c54536xMLFetchVPNInfo5;
        java.lang.String strCopydefault;
        java.lang.String safeString$default5;
        IceBergAggressiveType iceBergAggressiveType;
        java.lang.String strAYXKKw;
        C54536xML c54536xMLKWHzl2;
        C54536xML c54536xMLDjBIcL6;
        C54536xML c54536xMLFetchVPNInfo6;
        java.lang.String safeString$default6;
        java.lang.String string3;
        C54536xML c54536xMLAYXKKw4;
        C54536xML c54536xMLDjBIcL7;
        C54536xML c54536xMLFetchVPNInfo7;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.Bundle arguments = getArguments();
        java.lang.String str = "";
        if (arguments == null || (string = arguments.getString("instId")) == null) {
            string = "";
        }
        this.EZpvd = string;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("instType")) == null) {
            string2 = "";
        }
        this.copydefault = string2;
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 == null || (strategyBaseReq = (StrategyBaseReq) arguments3.getParcelable("baseReq")) == null) {
            return yDY.AhwBna();
        }
        android.os.Bundle arguments4 = getArguments();
        if (arguments4 == null || (iceBergReq = (IceBergReq) arguments4.getParcelable("iceBergReq")) == null) {
            return yDY.AhwBna();
        }
        C55887xsS c55887xsS = new C55887xsS(this.copydefault, this.EZpvd);
        c55887xsS.gEmmrt(iceBergReq.getTradeQuoteCcy());
        java.lang.String str2 = this.copydefault;
        java.lang.String side = strategyBaseReq.getSide();
        if (side == null) {
            side = "";
        }
        java.lang.String posSide = strategyBaseReq.getPosSide();
        if (posSide == null) {
            posSide = "";
        }
        kotlin.Pair<java.lang.String, java.lang.Boolean> pairAYXKKw = C56033xvF.AYXKKw(str2, side, posSide);
        int iAEQbTJ = C56033xvF.AEQbTJ(pairAYXKKw.getSecond().booleanValue());
        copydefault(pairAYXKKw.getFirst(), 0);
        KWHzl(iAEQbTJ);
        StrategyTradePresenter strategyTradePresenter = this.AEQbTJ;
        if (strategyTradePresenter == null) {
            Intrinsics.gEmmrt("");
            strategyTradePresenter = null;
        }
        java.lang.String str3 = this.copydefault;
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) strategyBaseReq.getSide(), (java.lang.Object) "buy");
        java.lang.String leftLevel = iceBergReq.getLeftLevel();
        if (leftLevel == null) {
            leftLevel = "";
        }
        java.lang.String rightLevel = iceBergReq.getRightLevel();
        if (rightLevel == null) {
            rightLevel = "";
        }
        java.lang.String strAEQbTJ = strategyTradePresenter.AEQbTJ(str3, zEZpvd, leftLevel, rightLevel);
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)) {
            gEmmrt("");
        } else {
            gEmmrt(C56033xvF.getBotLever$default(strAEQbTJ, false, 2, null));
        }
        AEQbTJ(iAEQbTJ);
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null || (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) == null || (listAEQbTJ = xorCopydefault.AEQbTJ()) == null) {
            TacticsInsideItemData tacticsInsideItemData = new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
            tacticsInsideItemData.setTitle(getString(C55688xof.Application.HJWChPRGtXKCRGtXKC));
            java.lang.String pxSpread = iceBergReq.getPxSpread();
            if (pxSpread != null && pxSpread.length() != 0) {
                xMS xmsAEQbTJ = C54797xVr.copydefault.AEQbTJ(this.EZpvd, this.copydefault);
                if (xmsAEQbTJ == null) {
                    java.lang.String safeString$default7 = "";
                    tacticsInsideItemData.setText(safeString$default7);
                    tacticsInsideItemData.setTitle(getString(C55688xof.Application.HJWChPRGtXKCRGtXKC));
                } else {
                    java.lang.String pxSpread2 = iceBergReq.getPxSpread();
                    if (pxSpread2 == null) {
                        pxSpread2 = "";
                    }
                    C54536xML c54536xMLKWHzl3 = xmsAEQbTJ.KWHzl(pxSpread2);
                    if (c54536xMLKWHzl3 == null || (c54536xMLDjBIcL4 = c54536xMLKWHzl3.djBIcL()) == null || (c54536xMLFetchVPNInfo4 = c54536xMLDjBIcL4.fetchVPNInfo()) == null || (safeString$default7 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo4, false, 1, null)) == null) {
                    }
                    tacticsInsideItemData.setText(safeString$default7);
                    tacticsInsideItemData.setTitle(getString(C55688xof.Application.HJWChPRGtXKCRGtXKC));
                }
            } else {
                java.lang.String pxVar = iceBergReq.getPxVar();
                if (pxVar != null && pxVar.length() != 0) {
                    xMR xmr = xMR.copydefault;
                    java.lang.String pxVar2 = iceBergReq.getPxVar();
                    tacticsInsideItemData.setText(xMR.formatPercent$default(xmr, pxVar2 == null ? "" : pxVar2, 0, null, 6, null));
                }
            }
            arrayList.add(tacticsInsideItemData);
            TacticsInsideItemData tacticsInsideItemData2 = new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
            tacticsInsideItemData2.setTitle(getString(C55688xof.Application.HJWChPURsaBn));
            xMS xmsAEQbTJ2 = C54797xVr.copydefault.AEQbTJ(this.EZpvd, this.copydefault);
            if (xmsAEQbTJ2 == null || (c54536xMLKWHzl = xmsAEQbTJ2.KWHzl(iceBergReq.getPxLimit())) == null || (c54536xMLDjBIcL3 = c54536xMLKWHzl.djBIcL()) == null || (c54536xMLFetchVPNInfo3 = c54536xMLDjBIcL3.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo3, false, 1, null)) == null) {
                safeString$default = "";
            }
            tacticsInsideItemData2.setText(safeString$default);
            arrayList.add(tacticsInsideItemData2);
            TacticsInsideItemData tacticsInsideItemData3 = new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
            tacticsInsideItemData3.setTitle(getString(C55688xof.Application.RSmiaq));
            C54571xNh c54571xNhCreateAmtConvert$default = C55887xsS.createAmtConvert$default(c55887xsS, null, false, 3, null);
            if (c54571xNhCreateAmtConvert$default == null || (c54536xMLAYXKKw2 = c54571xNhCreateAmtConvert$default.AYXKKw(iceBergReq.getSzLimit())) == null || (c54536xMLDjBIcL2 = c54536xMLAYXKKw2.djBIcL()) == null || (c54536xMLFetchVPNInfo2 = c54536xMLDjBIcL2.fetchVPNInfo()) == null || (safeString$default2 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo2, false, 1, null)) == null) {
                safeString$default2 = "";
            }
            tacticsInsideItemData3.setText(safeString$default2);
            arrayList.add(tacticsInsideItemData3);
            TacticsInsideItemData tacticsInsideItemData4 = new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
            tacticsInsideItemData4.setTitle(getString(C55688xof.Application.ComponentActivityKt));
            C54571xNh c54571xNhCreateAmtConvert$default2 = C55887xsS.createAmtConvert$default(c55887xsS, null, false, 3, null);
            if (c54571xNhCreateAmtConvert$default2 != null && (c54536xMLAYXKKw = c54571xNhCreateAmtConvert$default2.AYXKKw(iceBergReq.getSz())) != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null && (safeString$default3 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) != null) {
                str = safeString$default3;
            }
            tacticsInsideItemData4.setText(str);
            arrayList.add(tacticsInsideItemData4);
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                arrayList2.add(((OrderCategory) it.next()).getStrategyType());
            }
            if (arrayList2.contains("smart_iceberg")) {
                arrayList.add(new LabelData(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompat1), 5.0f, 5.0f, 0, 0, 0, 56, (DefaultConstructorMarker) null));
                TacticsInsideItemData tacticsInsideItemData5 = new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
                tacticsInsideItemData5.setTitle(getString(C55688xof.Application.setButtonPanelLayoutHint));
                if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) iceBergReq.getSzLimit())) {
                    safeString$default4 = "--";
                } else {
                    C54571xNh c54571xNhCreateAmtConvert$default3 = C55887xsS.createAmtConvert$default(c55887xsS, null, false, 3, null);
                    if (c54571xNhCreateAmtConvert$default3 == null || (c54536xMLAYXKKw3 = c54571xNhCreateAmtConvert$default3.AYXKKw(iceBergReq.getSzLimit())) == null || (c54536xMLDjBIcL5 = c54536xMLAYXKKw3.djBIcL()) == null || (c54536xMLFetchVPNInfo5 = c54536xMLDjBIcL5.fetchVPNInfo()) == null || (safeString$default4 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo5, false, 1, null)) == null) {
                        safeString$default4 = "";
                    }
                }
                tacticsInsideItemData5.setText(safeString$default4);
                arrayList.add(tacticsInsideItemData5);
                TacticsInsideItemData tacticsInsideItemData6 = new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
                tacticsInsideItemData6.setTitle(getString(C55688xof.Application.setCustomTitle));
                java.lang.String lmtOrderNumber = iceBergReq.getLmtOrderNumber();
                if (lmtOrderNumber == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) lmtOrderNumber)) {
                    strCopydefault = "--";
                } else {
                    xMR xmr2 = xMR.copydefault;
                    java.lang.String lmtOrderNumber2 = iceBergReq.getLmtOrderNumber();
                    if (lmtOrderNumber2 == null) {
                        lmtOrderNumber2 = "";
                    }
                    strCopydefault = xmr2.copydefault(lmtOrderNumber2);
                }
                tacticsInsideItemData6.setText(strCopydefault);
                arrayList.add(tacticsInsideItemData6);
                TacticsInsideItemData tacticsInsideItemData7 = new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
                tacticsInsideItemData7.setTitle(getString(C55688xof.Application.setButton));
                C54571xNh c54571xNhCreateAmtConvert$default4 = C55887xsS.createAmtConvert$default(c55887xsS, null, false, 3, null);
                if (c54571xNhCreateAmtConvert$default4 == null || (c54536xMLAYXKKw4 = c54571xNhCreateAmtConvert$default4.AYXKKw(iceBergReq.getSz())) == null || (c54536xMLDjBIcL7 = c54536xMLAYXKKw4.djBIcL()) == null || (c54536xMLFetchVPNInfo7 = c54536xMLDjBIcL7.fetchVPNInfo()) == null || (safeString$default5 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo7, false, 1, null)) == null) {
                    safeString$default5 = "";
                }
                tacticsInsideItemData7.setText(safeString$default5);
                arrayList.add(tacticsInsideItemData7);
                arrayList.add(new LabelData(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompat3), 16.0f, 5.0f, 0, 0, 0, 56, (DefaultConstructorMarker) null));
                java.lang.String strKWHzl = c55887xsS.KWHzl("smart_iceberg");
                if (strKWHzl != null) {
                    if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl)) {
                        TacticsInsideItemData tacticsInsideItemData8 = new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
                        if (pairAYXKKw.getSecond().booleanValue()) {
                            string3 = getString(C48033uCm.Fragment.DDjgSw);
                            Intrinsics.copydefault((java.lang.Object) string3);
                        } else {
                            string3 = getString(C49511upt.Activity.djSkpj);
                            Intrinsics.copydefault((java.lang.Object) string3);
                        }
                        tacticsInsideItemData8.setTitle(string3);
                        tacticsInsideItemData8.setText(strKWHzl);
                        arrayList.add(tacticsInsideItemData8);
                    }
                    Unit unit = Unit.INSTANCE;
                }
                TacticsInsideItemData tacticsInsideItemData9 = new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
                tacticsInsideItemData9.setTitle(getString(C55688xof.Application.AlertController2));
                IceBergAggressiveType[] iceBergAggressiveTypeArrValues = IceBergAggressiveType.values();
                int length = iceBergAggressiveTypeArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        iceBergAggressiveType = null;
                        break;
                    }
                    iceBergAggressiveType = iceBergAggressiveTypeArrValues[i];
                    if (Intrinsics.EZpvd((java.lang.Object) iceBergAggressiveType.getMode(), (java.lang.Object) iceBergReq.getAggressiveness())) {
                        break;
                    }
                    i++;
                }
                if (iceBergAggressiveType == null || (strAYXKKw = C33070mpX.AYXKKw(iceBergAggressiveType.getDesc())) == null) {
                    strAYXKKw = "--";
                }
                tacticsInsideItemData9.setText(strAYXKKw);
                arrayList.add(tacticsInsideItemData9);
                TacticsInsideItemData tacticsInsideItemData10 = new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
                tacticsInsideItemData10.setTitle(getString(C55688xof.Application.AlertController1));
                if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) iceBergReq.getPxLimit())) {
                    str = "--";
                } else {
                    xMS xmsAEQbTJ3 = C54797xVr.copydefault.AEQbTJ(this.EZpvd, this.copydefault);
                    if (xmsAEQbTJ3 != null && (c54536xMLKWHzl2 = xmsAEQbTJ3.KWHzl(iceBergReq.getPxLimit())) != null && (c54536xMLDjBIcL6 = c54536xMLKWHzl2.djBIcL()) != null && (c54536xMLFetchVPNInfo6 = c54536xMLDjBIcL6.fetchVPNInfo()) != null && (safeString$default6 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo6, false, 1, null)) != null) {
                        str = safeString$default6;
                    }
                }
                tacticsInsideItemData10.setText(str);
                arrayList.add(tacticsInsideItemData10);
                TacticsInsideItemData tacticsInsideItemData11 = new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
                tacticsInsideItemData11.setTitle(getString(C55688xof.Application.sendMediaButton));
                tacticsInsideItemData11.setText(AEQbTJ(iceBergReq.getTriggerParams()));
                arrayList.add(tacticsInsideItemData11);
            }
        }
        return arrayList;
    }

    private final java.lang.String AEQbTJ(java.util.ArrayList<AdvancedTriggerSign> arrayList) {
        AdvancedTriggerSign advancedTriggerSign;
        java.lang.String str;
        java.lang.String triggerPx;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String safeString$default;
        AdvancedTriggerSign advancedTriggerSign2;
        if (Intrinsics.EZpvd((java.lang.Object) ((arrayList == null || (advancedTriggerSign2 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(arrayList)) == null) ? null : advancedTriggerSign2.getTriggerStrategy()), (java.lang.Object) GridStartTriggerType.PRICE.getMode())) {
            AdvancedTriggerSign advancedTriggerSign3 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (advancedTriggerSign3 != null ? advancedTriggerSign3.getTriggerPx() : null))) {
                xMS xmsAEQbTJ = C54797xVr.copydefault.AEQbTJ(this.EZpvd, this.copydefault);
                str = "";
                if (xmsAEQbTJ != null) {
                    AdvancedTriggerSign advancedTriggerSign4 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
                    if (advancedTriggerSign4 == null || (triggerPx = advancedTriggerSign4.getTriggerPx()) == null) {
                        triggerPx = "";
                    }
                    C54536xML c54536xMLKWHzl = xmsAEQbTJ.KWHzl(triggerPx);
                    if (c54536xMLKWHzl != null && (c54536xMLDjBIcL = c54536xMLKWHzl.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) != null) {
                        str = safeString$default;
                    }
                }
            } else {
                str = "--";
            }
            GridStartTriggerType.Application application = GridStartTriggerType.Companion;
            AdvancedTriggerSign advancedTriggerSign5 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
            return application.copydefault(advancedTriggerSign5 != null ? advancedTriggerSign5.getTriggerStrategy() : null) + " | " + str;
        }
        GridStartTriggerType.Application application2 = GridStartTriggerType.Companion;
        if (arrayList != null && (advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(arrayList)) != null) {
            triggerStrategy = advancedTriggerSign.getTriggerStrategy();
        }
        return application2.copydefault(triggerStrategy);
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
        strategyReqGroup.setIceBergReq(arguments2 != null ? (IceBergReq) arguments2.getParcelable("iceBergReq") : null);
        C56028xvA.OLrzqt("make_order", C56423yEv.EZpvd(C56390yDp.OLrzqt("reqGroup", C33129mqd.gEmmrt(strategyReqGroup))));
        getParentFragmentManager().setFragmentResult("bot_order", BundleKt.bundleOf(C56390yDp.OLrzqt("bot_order_data", strategyReqGroup)));
    }
}
