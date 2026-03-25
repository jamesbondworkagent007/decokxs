package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.CoinTipsData;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.GridStopTriggerType;
import com.okinc.unify_trade.bot.data.LabelData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vTg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50569vTg extends AbstractC50583vTu {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public StrategyBaseReq AEQbTJ;
    public ContractGridReq EZpvd;
    public boolean KWHzl;
    public C55887xsS copydefault;
    public java.lang.String AhwBna = "";
    public java.lang.String gEmmrt = "";
    public AutoVipProfitInfo valueOf = new AutoVipProfitInfo((java.util.List) null, (java.util.List) null, (java.lang.String) null, false, false, 31, (DefaultConstructorMarker) null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull C55887xsS c55887xsS) {
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        this.copydefault = c55887xsS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49393unh
    public java.lang.String djBIcL() {
        return "ContractGridOrderConfirmDFragment";
    }

    /* JADX INFO: renamed from: o.vTg$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vTg.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C50569vTg newInstance$default(Activity activity, java.lang.String str, java.lang.String str2, StrategyBaseReq strategyBaseReq, ContractGridReq contractGridReq, boolean z, AutoVipProfitInfo autoVipProfitInfo, int i, java.lang.Object obj) {
            if ((i & 16) != 0) {
                z = false;
            }
            boolean z2 = z;
            if ((i & 32) != 0) {
                autoVipProfitInfo = null;
            }
            return activity.AEQbTJ(str, str2, strategyBaseReq, contractGridReq, z2, autoVipProfitInfo);
        }

        public final C50569vTg AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull StrategyBaseReq strategyBaseReq, @NotNull ContractGridReq contractGridReq, boolean z, AutoVipProfitInfo autoVipProfitInfo) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(strategyBaseReq, "");
            Intrinsics.checkNotNullParameter(contractGridReq, "");
            android.os.Bundle bundle = new android.os.Bundle();
            C50569vTg c50569vTg = new C50569vTg();
            bundle.putParcelable("contractGridReq", contractGridReq);
            bundle.putParcelable("baseReq", strategyBaseReq);
            bundle.putString("instType", str2);
            bundle.putString("instId", str);
            bundle.putBoolean("hideAdvanceSet", z);
            bundle.putParcelable("vipProfit", autoVipProfitInfo);
            c50569vTg.setArguments(bundle);
            return c50569vTg;
        }
    }

    public final C55887xsS copydefault() {
        C55887xsS c55887xsS = this.copydefault;
        if (c55887xsS != null) {
            return c55887xsS;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractC50583vTu, o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        AutoVipProfitInfo autoVipProfitInfo;
        java.lang.String string2;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        this.EZpvd = arguments != null ? (ContractGridReq) arguments.getParcelable("contractGridReq") : null;
        android.os.Bundle arguments2 = getArguments();
        this.AEQbTJ = arguments2 != null ? (StrategyBaseReq) arguments2.getParcelable("baseReq") : null;
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 == null || (string = arguments3.getString("instType")) == null) {
            string = "";
        }
        this.AhwBna = string;
        android.os.Bundle arguments4 = getArguments();
        if (arguments4 != null && (string2 = arguments4.getString("instId")) != null) {
            str = string2;
        }
        this.gEmmrt = str;
        android.os.Bundle arguments5 = getArguments();
        this.KWHzl = arguments5 != null ? arguments5.getBoolean("hideAdvanceSet") : false;
        android.os.Bundle arguments6 = getArguments();
        if (arguments6 == null || (autoVipProfitInfo = (AutoVipProfitInfo) arguments6.getParcelable("vipProfit")) == null) {
            autoVipProfitInfo = new AutoVipProfitInfo((java.util.List) null, (java.util.List) null, (java.lang.String) null, false, false, 31, (DefaultConstructorMarker) null);
        }
        this.valueOf = autoVipProfitInfo;
        copydefault(new C55887xsS(this.AhwBna, this.gEmmrt));
        super.onViewCreated(view, bundle);
        zsXlph();
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [121=4] */
    private final void zsXlph() {
        wYK wyk = DbNXlk().copydefault;
        java.lang.String string = "";
        Intrinsics.checkNotNullExpressionValue(wyk, "");
        wyk.setVisibility(8);
        djBIcL(C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, this.gEmmrt, this.AhwBna, false, false, 8, null));
        java.lang.String string2 = getString(C55688xof.Application.onContextAvailable);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        AhwBna(string2);
        ContractGridReq contractGridReq = this.EZpvd;
        java.lang.String direction = contractGridReq != null ? contractGridReq.getDirection() : null;
        if (direction != null) {
            int iHashCode = direction.hashCode();
            if (iHashCode != 3327612) {
                if (iHashCode != 109413500) {
                    if (iHashCode == 1844321735 && direction.equals("neutral")) {
                        OLrzqt(6);
                        AEQbTJ(6);
                        string = getString(C55688xof.Application.IResultReceiverStubProxy);
                    }
                } else if (direction.equals("short")) {
                    OLrzqt(13);
                    AEQbTJ(13);
                    string = getString(C55688xof.Application.IResultReceiver_Parcel);
                }
            } else if (direction.equals("long")) {
                OLrzqt(14);
                AEQbTJ(14);
                string = getString(C55688xof.Application.IResultReceiver2);
            }
        }
        Intrinsics.copydefault((java.lang.Object) string);
        copydefault(string);
        ContractGridReq contractGridReq2 = this.EZpvd;
        gEmmrt(C56033xvF.getBotLever$default(contractGridReq2 != null ? contractGridReq2.getLever() : null, false, 2, null));
        ContractGridReq contractGridReq3 = this.EZpvd;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (contractGridReq3 != null ? contractGridReq3.getProfitSharingRatio() : null))) {
            hDKMBd();
        }
        DbNXlk(C33070mpX.AYXKKw(C55688xof.Application.requestFocus));
        AYXKKw(C33070mpX.AYXKKw(C55688xof.Application.setBackgroundDrawable));
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    @Override // o.AbstractC50583vTu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<java.lang.Object> EZpvd() {
        boolean z;
        java.lang.String minPx;
        java.lang.String maxPx;
        java.lang.String direction;
        AbstractC54531xLw abstractC54531xLwAEQbTJ;
        java.lang.String str;
        java.lang.String extraMarginSz;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String safeString$default;
        java.lang.String actualMarginSz;
        C54536xML c54536xMLFetchVPNInfo2;
        java.lang.String strAYXKKw;
        java.lang.String tpTriggerPx;
        java.lang.String tpRatio;
        java.lang.String slTriggerPx;
        java.lang.String slRatio;
        java.util.ArrayList<AdvancedTriggerSign> signParams;
        AdvancedTriggerSign advancedTriggerSign;
        java.lang.String sz;
        C54536xML c54536xMLFetchVPNInfo3;
        java.lang.String safeString$default2;
        java.lang.String gridNum;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ContractGridReq contractGridReq = this.EZpvd;
        java.lang.String tpTriggerPx2 = contractGridReq != null ? contractGridReq.getTpTriggerPx() : null;
        if (tpTriggerPx2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tpTriggerPx2)) {
            ContractGridReq contractGridReq2 = this.EZpvd;
            java.lang.String slTriggerPx2 = contractGridReq2 != null ? contractGridReq2.getSlTriggerPx() : null;
            if (slTriggerPx2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) slTriggerPx2)) {
                ContractGridReq contractGridReq3 = this.EZpvd;
                java.lang.String tpRatio2 = contractGridReq3 != null ? contractGridReq3.getTpRatio() : null;
                if (tpRatio2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tpRatio2)) {
                    ContractGridReq contractGridReq4 = this.EZpvd;
                    java.lang.String slRatio2 = contractGridReq4 != null ? contractGridReq4.getSlRatio() : null;
                    z = slRatio2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) slRatio2);
                }
            }
        }
        values("tp_last_state");
        ContractGridReq contractGridReq5 = this.EZpvd;
        if (contractGridReq5 == null || (minPx = contractGridReq5.getMinPx()) == null) {
            minPx = "";
        }
        ContractGridReq contractGridReq6 = this.EZpvd;
        if (contractGridReq6 == null || (maxPx = contractGridReq6.getMaxPx()) == null) {
            maxPx = "";
        }
        EZpvd(minPx, maxPx);
        ContractGridReq contractGridReq7 = this.EZpvd;
        if (contractGridReq7 == null || (direction = contractGridReq7.getDirection()) == null) {
            direction = "";
        }
        KWHzl(direction);
        arrayList.add(new LabelData(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompat1), 6.0f, 10.0f, 0, 0, 0, 56, (DefaultConstructorMarker) null));
        java.lang.String string = getString(C55688xof.Application.setPlaybackState);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String str2 = this.AhwBna;
        java.lang.String str3 = this.gEmmrt;
        ContractGridReq contractGridReq8 = this.EZpvd;
        java.lang.String minPx2 = contractGridReq8 != null ? contractGridReq8.getMinPx() : null;
        java.lang.String str4 = minPx2 == null ? "" : minPx2;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        arrayList.add(new TacticsInsideItemData(string, C56033xvF.getBotPrice$default(str2, str3, str4, true, false, roundingMode, null, 80, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        java.lang.String string2 = getString(C55688xof.Application.setDisplayShowCustomEnabled);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String str5 = this.AhwBna;
        java.lang.String str6 = this.gEmmrt;
        ContractGridReq contractGridReq9 = this.EZpvd;
        java.lang.String maxPx2 = contractGridReq9 != null ? contractGridReq9.getMaxPx() : null;
        arrayList.add(new TacticsInsideItemData(string2, C56033xvF.getBotPrice$default(str5, str6, maxPx2 == null ? "" : maxPx2, true, false, roundingMode, null, 80, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        java.lang.String string3 = getString(C55688xof.Application.getCallerInput);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        ContractGridReq contractGridReq10 = this.EZpvd;
        arrayList.add(new TacticsInsideItemData(string3, (contractGridReq10 == null || (gridNum = contractGridReq10.getGridNum()) == null) ? "" : gridNum, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        ContractGridReq contractGridReq11 = this.EZpvd;
        java.lang.String str7 = "--";
        if (contractGridReq11 != null && Intrinsics.EZpvd(contractGridReq11.getAutoReserve(), java.lang.Boolean.TRUE)) {
            TacticsInsideItemData tacticsInsideItemData = new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
            tacticsInsideItemData.setTitle(getString(C55688xof.Application.IResultReceiver2Default));
            AbstractC54531xLw abstractC54531xLwAEQbTJ2 = copydefault().AEQbTJ();
            if (abstractC54531xLwAEQbTJ2 != null) {
                java.lang.String strValueOf = copydefault().valueOf();
                if (strValueOf == null) {
                    strValueOf = "";
                }
                xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwAEQbTJ2, strValueOf, null, 2, null);
                if (xmvCreateSizeConverterWithIndex$default != null) {
                    ContractGridReq contractGridReq12 = this.EZpvd;
                    if (contractGridReq12 == null || (sz = contractGridReq12.getSz()) == null) {
                        sz = "";
                    }
                    C54536xML c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(sz);
                    if (c54536xMLCopydefault != null && (c54536xMLFetchVPNInfo3 = c54536xMLCopydefault.fetchVPNInfo()) != null && (safeString$default2 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo3, false, 1, null)) != null) {
                        str7 = safeString$default2;
                    }
                }
            }
            tacticsInsideItemData.setText(str7);
            arrayList.add(tacticsInsideItemData);
        } else {
            TacticsInsideItemData tacticsInsideItemData2 = new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
            tacticsInsideItemData2.setTitle(getString(C48033uCm.Fragment.zzQwtT));
            AbstractC54531xLw abstractC54531xLwAEQbTJ3 = copydefault().AEQbTJ();
            if (abstractC54531xLwAEQbTJ3 == null) {
                java.lang.String safeString$default3 = "--";
                tacticsInsideItemData2.setText(safeString$default3);
                arrayList.add(tacticsInsideItemData2);
                java.lang.String string4 = getString(C55688xof.Application.DXd);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                abstractC54531xLwAEQbTJ = copydefault().AEQbTJ();
                if (abstractC54531xLwAEQbTJ == null) {
                    str = "--";
                    arrayList.add(new TacticsInsideItemData(string4, str, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                } else {
                    java.lang.String strValueOf2 = copydefault().valueOf();
                    if (strValueOf2 == null) {
                        strValueOf2 = "";
                    }
                    xMV xmvCreateSizeConverterWithIndex$default2 = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwAEQbTJ, strValueOf2, null, 2, null);
                    if (xmvCreateSizeConverterWithIndex$default2 != null) {
                        ContractGridReq contractGridReq13 = this.EZpvd;
                        if (contractGridReq13 == null || (extraMarginSz = contractGridReq13.getExtraMarginSz()) == null) {
                            extraMarginSz = "";
                        }
                        C54536xML c54536xMLCopydefault2 = xmvCreateSizeConverterWithIndex$default2.copydefault(extraMarginSz);
                        if (c54536xMLCopydefault2 != null && (c54536xMLFetchVPNInfo = c54536xMLCopydefault2.fetchVPNInfo()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) != null) {
                            str = safeString$default;
                        }
                        arrayList.add(new TacticsInsideItemData(string4, str, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    }
                }
            } else {
                java.lang.String strValueOf3 = copydefault().valueOf();
                if (strValueOf3 == null) {
                    strValueOf3 = "";
                }
                xMV xmvCreateSizeConverterWithIndex$default3 = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwAEQbTJ3, strValueOf3, null, 2, null);
                if (xmvCreateSizeConverterWithIndex$default3 != null) {
                    ContractGridReq contractGridReq14 = this.EZpvd;
                    if (contractGridReq14 == null || (actualMarginSz = contractGridReq14.getActualMarginSz()) == null) {
                        actualMarginSz = "";
                    }
                    C54536xML c54536xMLCopydefault3 = xmvCreateSizeConverterWithIndex$default3.copydefault(actualMarginSz);
                    if (c54536xMLCopydefault3 == null || (c54536xMLFetchVPNInfo2 = c54536xMLCopydefault3.fetchVPNInfo()) == null || (safeString$default3 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo2, false, 1, null)) == null) {
                    }
                    tacticsInsideItemData2.setText(safeString$default3);
                    arrayList.add(tacticsInsideItemData2);
                    java.lang.String string42 = getString(C55688xof.Application.DXd);
                    Intrinsics.checkNotNullExpressionValue(string42, "");
                    abstractC54531xLwAEQbTJ = copydefault().AEQbTJ();
                    if (abstractC54531xLwAEQbTJ == null) {
                    }
                }
            }
        }
        InterfaceC55881xsM interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault();
        if (interfaceC55881xsMCopydefault != null && interfaceC55881xsMCopydefault.OLrzqt(copydefault().ejfBZ(), "contract_grid")) {
            ContractGridReq contractGridReq15 = this.EZpvd;
            java.lang.String profitSharingRatio = contractGridReq15 != null ? contractGridReq15.getProfitSharingRatio() : null;
            java.lang.String str8 = C33129mqd.OLrzqt((java.lang.CharSequence) profitSharingRatio) ? profitSharingRatio : null;
            if (str8 != null) {
                arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityExternalSyntheticLambda2), xMR.formatPercent$default(xMR.copydefault, str8, 0, null, 4, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            }
        }
        if (C33129mqd.KWHzl((java.util.Collection) this.valueOf.getAutoStake()) || C33129mqd.KWHzl((java.util.Collection) this.valueOf.getAutoEarn())) {
            C54149wys.AEQbTJ.AEQbTJ(arrayList, this.valueOf);
        }
        if (!this.KWHzl) {
            arrayList.add(new LabelData(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompat3), 18.0f, 10.0f, 0, 0, 0, 56, (DefaultConstructorMarker) null));
            ContractGridReq contractGridReq16 = this.EZpvd;
            java.lang.String openPosSlippage = contractGridReq16 != null ? contractGridReq16.getOpenPosSlippage() : null;
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) openPosSlippage) || !C33129mqd.AEQbTJ(openPosSlippage, "0")) {
                openPosSlippage = null;
            }
            if (openPosSlippage != null) {
                java.lang.String strEZpvd = xMR.copydefault.EZpvd(openPosSlippage, 4, 0, RoundingMode.FLOOR);
                java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C48033uCm.Fragment.QOeQqh);
                ContractGridReq contractGridReq17 = this.EZpvd;
                if (contractGridReq17 != null && Intrinsics.EZpvd(contractGridReq17.getOpenPosSlippageDefault(), java.lang.Boolean.TRUE)) {
                    strEZpvd = C33069mpW.copydefault(C48033uCm.Fragment.DzOuPm, C56423yEv.EZpvd(C56390yDp.OLrzqt("slippagePct", strEZpvd)));
                }
                arrayList.add(new TacticsInsideItemData(strAYXKKw2, strEZpvd, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            }
            java.lang.String string5 = getString(C55688xof.Application.sendMediaButton);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            ContractGridReq contractGridReq18 = this.EZpvd;
            arrayList.add(new TacticsInsideItemData(string5, AEQbTJ(contractGridReq18 != null ? contractGridReq18.getSignParams() : null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            ContractGridReq contractGridReq19 = this.EZpvd;
            if (!Intrinsics.EZpvd((java.lang.Object) (contractGridReq19 != null ? contractGridReq19.getDirection() : null), (java.lang.Object) "neutral")) {
                TacticsInsideItemData tacticsInsideItemData3 = new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
                tacticsInsideItemData3.setTitle(getString(C55688xof.Application.onCreatePanelMenu));
                ContractGridReq contractGridReq20 = this.EZpvd;
                java.lang.String string6 = getString((contractGridReq20 == null || !Intrinsics.EZpvd(contractGridReq20.getBasePos(), java.lang.Boolean.TRUE)) ? C55688xof.Application.isSessionReady : C55688xof.Application.registerCallback);
                Intrinsics.checkNotNullExpressionValue(string6, "");
                tacticsInsideItemData3.setText(string6);
                arrayList.add(tacticsInsideItemData3);
            }
            java.lang.String string7 = getString(C55688xof.Application.setShuffleModeEnabledRemoved);
            Intrinsics.checkNotNullExpressionValue(string7, "");
            ContractGridReq contractGridReq21 = this.EZpvd;
            arrayList.add(new TacticsInsideItemData(string7, copydefault(contractGridReq21 != null ? contractGridReq21.getSignParams() : null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            java.lang.String string8 = getString(C55688xof.Application.isEnabled);
            Intrinsics.checkNotNullExpressionValue(string8, "");
            ContractGridReq contractGridReq22 = this.EZpvd;
            if (Intrinsics.EZpvd((java.lang.Object) ((contractGridReq22 == null || (signParams = contractGridReq22.getSignParams()) == null || (advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.wlaJM(signParams)) == null) ? null : advancedTriggerSign.getStopType()), (java.lang.Object) "1")) {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.getSessionActivity);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatCallback);
            }
            arrayList.add(new TacticsInsideItemData(string8, strAYXKKw, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            if (!z) {
                java.lang.String str9 = this.AhwBna;
                java.lang.String str10 = this.gEmmrt;
                ContractGridReq contractGridReq23 = this.EZpvd;
                if (contractGridReq23 == null || (tpTriggerPx = contractGridReq23.getTpTriggerPx()) == null) {
                    tpTriggerPx = "";
                }
                ContractGridReq contractGridReq24 = this.EZpvd;
                if (contractGridReq24 == null || (tpRatio = contractGridReq24.getTpRatio()) == null) {
                    tpRatio = "";
                }
                kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = C56037xvJ.OLrzqt(str9, str10, tpTriggerPx, tpRatio);
                java.lang.String str11 = this.AhwBna;
                java.lang.String str12 = this.gEmmrt;
                ContractGridReq contractGridReq25 = this.EZpvd;
                if (contractGridReq25 == null || (slTriggerPx = contractGridReq25.getSlTriggerPx()) == null) {
                    slTriggerPx = "";
                }
                ContractGridReq contractGridReq26 = this.EZpvd;
                if (contractGridReq26 == null || (slRatio = contractGridReq26.getSlRatio()) == null) {
                    slRatio = "";
                }
                kotlin.Pair<java.lang.String, java.lang.String> pairKWHzl = C56037xvJ.KWHzl(str11, str12, slTriggerPx, slRatio);
                arrayList.add(new TacticsInsideItemData(pairOLrzqt.getFirst(), pairOLrzqt.getSecond(), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                arrayList.add(new TacticsInsideItemData(pairKWHzl.getFirst(), pairKWHzl.getSecond(), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            }
            java.lang.String string9 = getString(C55688xof.Application.removeOnMenuVisibilityListener);
            Intrinsics.checkNotNullExpressionValue(string9, "");
            ContractGridReq contractGridReq27 = this.EZpvd;
            java.lang.String runType = contractGridReq27 != null ? contractGridReq27.getRunType() : null;
            java.lang.String string10 = (!Intrinsics.EZpvd((java.lang.Object) runType, (java.lang.Object) "1") && Intrinsics.EZpvd((java.lang.Object) runType, (java.lang.Object) "2")) ? getString(C55688xof.Application.setQueue) : getString(C55688xof.Application.setPlaybackToRemote);
            java.lang.String str13 = string10;
            Intrinsics.copydefault((java.lang.Object) str13);
            arrayList.add(new TacticsInsideItemData(string9, str13, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        }
        java.lang.String string11 = getString(C55688xof.Application.onContextAvailable);
        Intrinsics.checkNotNullExpressionValue(string11, "");
        arrayList.add(new CoinTipsData(C33069mpW.copydefault(this, C55688xof.Application.dispatchMenuVisibilityChanged, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("name", string11))), (java.lang.String) null, 11.0f, false, 10, (DefaultConstructorMarker) null));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean KWHzl() {
        java.lang.String strValueOf;
        java.lang.String strValueOf2;
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) AuCTel())) {
            return true;
        }
        AbstractC54531xLw abstractC54531xLwAEQbTJ = copydefault().AEQbTJ();
        if (abstractC54531xLwAEQbTJ == null) {
            strValueOf = null;
        } else {
            java.lang.String strValueOf3 = copydefault().valueOf();
            if (strValueOf3 == null) {
                strValueOf3 = "";
            }
            xMS xmsGEmmrt = abstractC54531xLwAEQbTJ.gEmmrt(strValueOf3);
            if (xmsGEmmrt != null) {
                strValueOf = xmsGEmmrt.valueOf(AuCTel());
            }
        }
        AbstractC54531xLw abstractC54531xLwAEQbTJ2 = copydefault().AEQbTJ();
        if (abstractC54531xLwAEQbTJ2 == null) {
            strValueOf2 = null;
        } else {
            java.lang.String strValueOf4 = copydefault().valueOf();
            xMS xmsGEmmrt2 = abstractC54531xLwAEQbTJ2.gEmmrt(strValueOf4 != null ? strValueOf4 : "");
            if (xmsGEmmrt2 != null) {
                strValueOf2 = xmsGEmmrt2.valueOf(fIwbmz());
            }
        }
        ContractGridReq contractGridReq = this.EZpvd;
        java.lang.String direction = contractGridReq != null ? contractGridReq.getDirection() : null;
        if (Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "long") || Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "neutral")) {
            if (fetchVPNInfo() == 0 && getNewProxyInstance() && C33129mqd.OLrzqt((java.lang.CharSequence) fIwbmz()) && C33129mqd.gEmmrt(strValueOf, strValueOf2)) {
                fetchVPNInfo(C33070mpX.AYXKKw(C55688xof.Application.setHideOffset));
                return false;
            }
            ContractGridReq contractGridReq2 = this.EZpvd;
            if (C33129mqd.gEmmrt(strValueOf, contractGridReq2 != null ? contractGridReq2.getMaxPx() : null)) {
                fetchVPNInfo(C33070mpX.AYXKKw(C55688xof.Application.getDrawerToggleDelegate));
                return false;
            }
            xMJ.Application value = C54782xVc.AEQbTJ.AhwBna().getValue();
            if (C33129mqd.gEmmrt(strValueOf, value != null ? value.AYXKKw() : null)) {
                fetchVPNInfo(C33070mpX.AYXKKw(C55688xof.Application.addQueueItemAt));
                return false;
            }
            AkhnZx();
            return true;
        }
        if (fetchVPNInfo() == 0 && getNewProxyInstance() && C33129mqd.OLrzqt((java.lang.CharSequence) fIwbmz()) && C33129mqd.AEQbTJ(strValueOf, strValueOf2)) {
            fetchVPNInfo(C33070mpX.AYXKKw(C55688xof.Application.setRating));
            return false;
        }
        ContractGridReq contractGridReq3 = this.EZpvd;
        if (C33129mqd.AEQbTJ(strValueOf, contractGridReq3 != null ? contractGridReq3.getMinPx() : null)) {
            fetchVPNInfo(C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatTransportControlsApi23));
            return false;
        }
        xMJ.Application value2 = C54782xVc.AEQbTJ.AhwBna().getValue();
        if (C33129mqd.AEQbTJ(strValueOf, value2 != null ? value2.AYXKKw() : null)) {
            fetchVPNInfo(C33070mpX.AYXKKw(C55688xof.Application.onNewIntent));
            return false;
        }
        AkhnZx();
        return true;
    }

    /* JADX DEBUG: Possible override for method o.vTu.AEQbTJ()V */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AEQbTJ() {
        java.lang.String strValueOf;
        java.lang.String strValueOf2;
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) fIwbmz())) {
            return true;
        }
        AbstractC54531xLw abstractC54531xLwAEQbTJ = copydefault().AEQbTJ();
        if (abstractC54531xLwAEQbTJ == null) {
            strValueOf = null;
        } else {
            java.lang.String strValueOf3 = copydefault().valueOf();
            if (strValueOf3 == null) {
                strValueOf3 = "";
            }
            xMS xmsGEmmrt = abstractC54531xLwAEQbTJ.gEmmrt(strValueOf3);
            if (xmsGEmmrt != null) {
                strValueOf = xmsGEmmrt.valueOf(AuCTel());
            }
        }
        AbstractC54531xLw abstractC54531xLwAEQbTJ2 = copydefault().AEQbTJ();
        if (abstractC54531xLwAEQbTJ2 == null) {
            strValueOf2 = null;
        } else {
            java.lang.String strValueOf4 = copydefault().valueOf();
            xMS xmsGEmmrt2 = abstractC54531xLwAEQbTJ2.gEmmrt(strValueOf4 != null ? strValueOf4 : "");
            if (xmsGEmmrt2 != null) {
                strValueOf2 = xmsGEmmrt2.valueOf(fIwbmz());
            }
        }
        ContractGridReq contractGridReq = this.EZpvd;
        java.lang.String direction = contractGridReq != null ? contractGridReq.getDirection() : null;
        if (Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "long") || Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "neutral")) {
            if (ejfBZ() == 0 && getFieldNames() && C33129mqd.OLrzqt((java.lang.CharSequence) AuCTel()) && C33129mqd.AEQbTJ(strValueOf2, strValueOf)) {
                valueOf(C33070mpX.AYXKKw(C55688xof.Application.setHomeAsUpIndicator));
                return false;
            }
            ContractGridReq contractGridReq2 = this.EZpvd;
            if (C33129mqd.AEQbTJ(strValueOf2, contractGridReq2 != null ? contractGridReq2.getMinPx() : null)) {
                valueOf(C33070mpX.AYXKKw(C55688xof.Application.skipToQueueItem));
                return false;
            }
            xMJ.Application value = C54782xVc.AEQbTJ.AhwBna().getValue();
            if (C33129mqd.AEQbTJ(strValueOf2, value != null ? value.AYXKKw() : null)) {
                valueOf(C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatTransportControlsApi21));
                return false;
            }
            isConnected();
            return true;
        }
        if (ejfBZ() == 0 && getFieldNames() && C33129mqd.OLrzqt((java.lang.CharSequence) AuCTel()) && C33129mqd.gEmmrt(strValueOf2, strValueOf)) {
            valueOf(C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
            return false;
        }
        ContractGridReq contractGridReq3 = this.EZpvd;
        if (C33129mqd.gEmmrt(strValueOf2, contractGridReq3 != null ? contractGridReq3.getMaxPx() : null)) {
            valueOf(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatMediaSessionImpl));
            return false;
        }
        xMJ.Application value2 = C54782xVc.AEQbTJ.AhwBna().getValue();
        if (C33129mqd.gEmmrt(strValueOf2, value2 != null ? value2.AYXKKw() : null)) {
            valueOf(C33070mpX.AYXKKw(C55688xof.Application.onPictureInPictureModeChanged));
            return false;
        }
        isConnected();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090  */
    @Override // o.AbstractC50583vTu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt() {
        java.lang.String strValueOf;
        java.lang.String strValueOf2;
        AbstractC54531xLw abstractC54531xLwAEQbTJ;
        AbstractC54531xLw abstractC54531xLwAEQbTJ2;
        if (iwGUEr()) {
            if (ejfBZ() == 0 && getFieldNames() && !KWHzl()) {
                return;
            }
            if (fetchVPNInfo() == 0 && getNewProxyInstance() && !AEQbTJ()) {
                return;
            }
            if (AuCTel().length() != 0 && (abstractC54531xLwAEQbTJ2 = copydefault().AEQbTJ()) != null) {
                java.lang.String strValueOf3 = copydefault().valueOf();
                if (strValueOf3 == null) {
                    strValueOf3 = "";
                }
                xMS xmsGEmmrt = abstractC54531xLwAEQbTJ2.gEmmrt(strValueOf3);
                strValueOf = xmsGEmmrt != null ? xmsGEmmrt.valueOf(AuCTel()) : null;
            }
            if (fIwbmz().length() != 0 && (abstractC54531xLwAEQbTJ = copydefault().AEQbTJ()) != null) {
                java.lang.String strValueOf4 = copydefault().valueOf();
                xMS xmsGEmmrt2 = abstractC54531xLwAEQbTJ.gEmmrt(strValueOf4 != null ? strValueOf4 : "");
                strValueOf2 = xmsGEmmrt2 != null ? xmsGEmmrt2.valueOf(fIwbmz()) : null;
            }
            ContractGridReq contractGridReq = this.EZpvd;
            if (contractGridReq != null) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) strValueOf2)) {
                    contractGridReq.setSlTriggerPx(strValueOf2);
                    C32866mlf.onEvent$default("BotPlaceOrder_Confirmation_TPSLInputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.vTe
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C50569vTg.KWHzl(this.AEQbTJ, (EventParamsList) obj);
                        }
                    }, 1, (java.lang.Object) null);
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) strValueOf)) {
                    contractGridReq.setTpTriggerPx(strValueOf);
                    C32866mlf.onEvent$default("BotPlaceOrder_Confirmation_TPSLInputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.vTh
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C50569vTg.AEQbTJ(this.OLrzqt, (EventParamsList) obj);
                        }
                    }, 1, (java.lang.Object) null);
                }
                StrategyBaseReq strategyBaseReq = this.AEQbTJ;
                if (strategyBaseReq == null) {
                    return;
                }
                C56028xvA.OLrzqt("make_order", C56424yEw.gEmmrt(C56390yDp.OLrzqt("baseReq", C33129mqd.gEmmrt(strategyBaseReq)), C56390yDp.OLrzqt("contractGridReq", C33129mqd.gEmmrt(this.EZpvd))));
                dismissAllowingStateLoss();
                getParentFragmentManager().setFragmentResult("bot_order", new android.os.Bundle());
            }
        }
    }

    public static final Unit KWHzl(C50569vTg c50569vTg, EventParamsList eventParamsList) {
        java.lang.String ordType;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        StrategyBaseReq strategyBaseReq = c50569vTg.AEQbTJ;
        EventParamsList.put$default(eventParamsList, "bot_type", (strategyBaseReq == null || (ordType = strategyBaseReq.getOrdType()) == null) ? "" : ordType, false, 4, null);
        EventParamsList.put$default(eventParamsList, "input_box", "sl", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C50569vTg c50569vTg, EventParamsList eventParamsList) {
        java.lang.String ordType;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        StrategyBaseReq strategyBaseReq = c50569vTg.AEQbTJ;
        EventParamsList.put$default(eventParamsList, "bot_type", (strategyBaseReq == null || (ordType = strategyBaseReq.getOrdType()) == null) ? "" : ordType, false, 4, null);
        EventParamsList.put$default(eventParamsList, "input_box", "tp", false, 4, null);
        return Unit.INSTANCE;
    }

    public final java.lang.String AEQbTJ(java.util.ArrayList<AdvancedTriggerSign> arrayList) {
        AdvancedTriggerSign advancedTriggerSign;
        java.lang.String botPrice$default;
        java.lang.String triggerPx;
        java.lang.String triggerPx2;
        AdvancedTriggerSign advancedTriggerSign2;
        if (Intrinsics.EZpvd((java.lang.Object) ((arrayList == null || (advancedTriggerSign2 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(arrayList)) == null) ? null : advancedTriggerSign2.getIndicator()), (java.lang.Object) GridStartTriggerType.PRICE.getMode())) {
            AdvancedTriggerSign advancedTriggerSign3 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
            if (advancedTriggerSign3 == null || (triggerPx = advancedTriggerSign3.getTriggerPx()) == null || !C33129mqd.OLrzqt((java.lang.CharSequence) triggerPx)) {
                botPrice$default = "--";
            } else {
                java.lang.String str = this.AhwBna;
                java.lang.String str2 = this.gEmmrt;
                AdvancedTriggerSign advancedTriggerSign4 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
                if (advancedTriggerSign4 == null || (triggerPx2 = advancedTriggerSign4.getTriggerPx()) == null) {
                    triggerPx2 = "";
                }
                botPrice$default = C56033xvF.getBotPrice$default(str, str2, triggerPx2, true, false, RoundingMode.HALF_UP, null, 80, null);
            }
            GridStartTriggerType.Application application = GridStartTriggerType.Companion;
            AdvancedTriggerSign advancedTriggerSign5 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
            return application.copydefault(advancedTriggerSign5 != null ? advancedTriggerSign5.getIndicator() : null) + " | " + botPrice$default;
        }
        GridStartTriggerType.Application application2 = GridStartTriggerType.Companion;
        if (arrayList != null && (advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(arrayList)) != null) {
            indicator = advancedTriggerSign.getIndicator();
        }
        return application2.copydefault(indicator);
    }

    public final java.lang.String copydefault(java.util.ArrayList<AdvancedTriggerSign> arrayList) {
        AdvancedTriggerSign advancedTriggerSign;
        java.lang.String botPrice$default;
        java.lang.String triggerPx;
        AdvancedTriggerSign advancedTriggerSign2;
        if (Intrinsics.EZpvd((java.lang.Object) ((arrayList == null || (advancedTriggerSign2 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.wlaJM(arrayList)) == null) ? null : advancedTriggerSign2.getIndicator()), (java.lang.Object) GridStopTriggerType.PRICE.getMode())) {
            AdvancedTriggerSign advancedTriggerSign3 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.wlaJM(arrayList);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (advancedTriggerSign3 != null ? advancedTriggerSign3.getTriggerPx() : null))) {
                java.lang.String str = this.AhwBna;
                java.lang.String str2 = this.gEmmrt;
                AdvancedTriggerSign advancedTriggerSign4 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.wlaJM(arrayList);
                if (advancedTriggerSign4 == null || (triggerPx = advancedTriggerSign4.getTriggerPx()) == null) {
                    triggerPx = "";
                }
                botPrice$default = C56033xvF.getBotPrice$default(str, str2, triggerPx, true, false, RoundingMode.HALF_UP, null, 80, null);
            } else {
                botPrice$default = "--";
            }
            GridStopTriggerType.StateListAnimator stateListAnimator = GridStopTriggerType.Companion;
            AdvancedTriggerSign advancedTriggerSign5 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.wlaJM(arrayList);
            return stateListAnimator.EZpvd(advancedTriggerSign5 != null ? advancedTriggerSign5.getIndicator() : null) + " | " + botPrice$default;
        }
        GridStopTriggerType.StateListAnimator stateListAnimator2 = GridStopTriggerType.Companion;
        if (arrayList != null && (advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.wlaJM(arrayList)) != null) {
            indicator = advancedTriggerSign.getIndicator();
        }
        return stateListAnimator2.EZpvd(indicator);
    }
}
