package o;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.CoinTipsData;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.ProfitAutoReinvestParam;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.SmartEarnRequestParam;
import com.okinc.unify_trade.biz.bot.TpSLTriggerItem;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.GridStopTriggerType;
import com.okinc.unify_trade.bot.data.LabelData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vTl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50574vTl extends AbstractC50583vTu {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public C55887xsS AYXKKw;
    public boolean EZpvd;
    public boolean KWHzl;
    public GridReq copydefault;
    public java.lang.String AEQbTJ = "";
    public java.lang.String gEmmrt = "";
    public java.lang.String valueOf = "";
    public AutoVipProfitInfo djBIcL = new AutoVipProfitInfo((java.util.List) null, (java.util.List) null, (java.lang.String) null, false, false, 31, (DefaultConstructorMarker) null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49393unh
    public java.lang.String djBIcL() {
        return "GridOrderConfirmDFragment";
    }

    /* JADX INFO: renamed from: o.vTl$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vTl.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C50574vTl copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull StrategyBaseReq strategyBaseReq, @NotNull GridReq gridReq, boolean z, boolean z2, AutoVipProfitInfo autoVipProfitInfo) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(strategyBaseReq, "");
            Intrinsics.checkNotNullParameter(gridReq, "");
            C50574vTl c50574vTl = new C50574vTl();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("showTip", z);
            bundle.putString("instId", str);
            bundle.putString("instType", str2);
            bundle.putParcelable("baseReq", strategyBaseReq);
            bundle.putParcelable("gridReq", gridReq);
            bundle.putString("ordType", strategyBaseReq.getOrdType());
            bundle.putString("gridTitle", C33070mpX.AYXKKw(Intrinsics.EZpvd((java.lang.Object) strategyBaseReq.getOrdType(), (java.lang.Object) "moon_grid") ? C55688xof.Application.onRemoveQueueItemAt : C55688xof.Application.ComponentActivity22));
            bundle.putBoolean("hideAdvanceSet", z2);
            bundle.putParcelable("vipProfit", autoVipProfitInfo);
            c50574vTl.setArguments(bundle);
            return c50574vTl;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        GridReq gridReq;
        AutoVipProfitInfo autoVipProfitInfo;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("instId")) == null) {
            string = "";
        }
        this.AEQbTJ = string;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("instType")) == null) {
            string2 = "";
        }
        this.gEmmrt = string2;
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 == null || (string3 = arguments3.getString("ordType")) == null) {
            string3 = "";
        }
        this.valueOf = string3;
        android.os.Bundle arguments4 = getArguments();
        if (arguments4 == null || (gridReq = (GridReq) arguments4.getParcelable("gridReq")) == null) {
            gridReq = new GridReq((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TpSlTriggerParamReqResp) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.Boolean) null, (TrailingConfig) null, (TrailingConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnRequestParam) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (ProfitAutoReinvestParam) null, -1, 15, (DefaultConstructorMarker) null);
        }
        this.copydefault = gridReq;
        android.os.Bundle arguments5 = getArguments();
        boolean z = false;
        this.KWHzl = arguments5 != null ? arguments5.getBoolean("hideAdvanceSet") : false;
        android.os.Bundle arguments6 = getArguments();
        if (arguments6 == null || (autoVipProfitInfo = (AutoVipProfitInfo) arguments6.getParcelable("vipProfit")) == null) {
            autoVipProfitInfo = new AutoVipProfitInfo((java.util.List) null, (java.util.List) null, (java.lang.String) null, false, false, 31, (DefaultConstructorMarker) null);
        }
        this.djBIcL = autoVipProfitInfo;
        android.os.Bundle arguments7 = getArguments();
        GridReq gridReq2 = null;
        if (arguments7 != null && arguments7.getBoolean("showTip")) {
            GridReq gridReq3 = this.copydefault;
            if (gridReq3 == null) {
                Intrinsics.gEmmrt("");
                gridReq3 = null;
            }
            if (gridReq3.getTpslTriggerParamReq() == null) {
                z = true;
            } else {
                GridReq gridReq4 = this.copydefault;
                if (gridReq4 == null) {
                    Intrinsics.gEmmrt("");
                    gridReq4 = null;
                }
                TpSlTriggerParamReqResp tpslTriggerParamReq = gridReq4.getTpslTriggerParamReq();
                java.util.ArrayList<TpSLTriggerItem> triggers = tpslTriggerParamReq != null ? tpslTriggerParamReq.getTriggers() : null;
                if (triggers == null || triggers.isEmpty()) {
                }
            }
        }
        this.EZpvd = z;
        C55887xsS c55887xsS = new C55887xsS(this.gEmmrt, this.AEQbTJ);
        GridReq gridReq5 = this.copydefault;
        if (gridReq5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            gridReq2 = gridReq5;
        }
        c55887xsS.gEmmrt(gridReq2.getTradeQuoteCcy());
        this.AYXKKw = c55887xsS;
    }

    @Override // o.AbstractC50583vTu, o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String upperCase;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        wYK wyk = DbNXlk().copydefault;
        Intrinsics.checkNotNullExpressionValue(wyk, "");
        wyk.setVisibility(8);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("gridTitle")) == null) {
            string = "";
        }
        C55887xsS c55887xsS = this.AYXKKw;
        GridReq gridReq = null;
        if (c55887xsS == null) {
            Intrinsics.gEmmrt("");
            c55887xsS = null;
        }
        java.lang.String strOLrzqt = c55887xsS.OLrzqt();
        if (strOLrzqt != null) {
            upperCase = strOLrzqt.toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
        } else {
            upperCase = null;
        }
        C55887xsS c55887xsS2 = this.AYXKKw;
        if (c55887xsS2 == null) {
            Intrinsics.gEmmrt("");
            c55887xsS2 = null;
        }
        djBIcL(upperCase + "/" + c55887xsS2.fetchVPNInfo());
        AhwBna(string);
        GridReq gridReq2 = this.copydefault;
        if (gridReq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            gridReq = gridReq2;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) gridReq.getProfitSharingRatio())) {
            hDKMBd();
        }
        AEQbTJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void AEQbTJ() {
        kotlin.Pair pairOLrzqt;
        GridReq gridReq = this.copydefault;
        GridReq gridReq2 = null;
        if (gridReq == null) {
            Intrinsics.gEmmrt("");
            gridReq = null;
        }
        TrailingConfig trailingUpConfig = gridReq.getTrailingUpConfig();
        if (trailingUpConfig == null || !trailingUpConfig.getEnabled()) {
            GridReq gridReq3 = this.copydefault;
            if (gridReq3 == null) {
                Intrinsics.gEmmrt("");
                gridReq3 = null;
            }
            TrailingConfig trailingUpConfig2 = gridReq3.getTrailingUpConfig();
            if (trailingUpConfig2 == null || !trailingUpConfig2.getEnabled()) {
                GridReq gridReq4 = this.copydefault;
                if (gridReq4 == null) {
                    Intrinsics.gEmmrt("");
                    gridReq4 = null;
                }
                TrailingConfig trailingDownConfig = gridReq4.getTrailingDownConfig();
                if (trailingDownConfig == null || !trailingDownConfig.getEnabled()) {
                    pairOLrzqt = C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C33070mpX.AYXKKw(C55688xof.Application.StyleableRes));
                } else {
                    GridReq gridReq5 = this.copydefault;
                    if (gridReq5 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        gridReq2 = gridReq5;
                    }
                    TrailingConfig trailingUpConfig3 = gridReq2.getTrailingUpConfig();
                    if (trailingUpConfig3 == null || !trailingUpConfig3.getEnabled()) {
                        pairOLrzqt = C56390yDp.OLrzqt(java.lang.Boolean.TRUE, C33070mpX.AYXKKw(C55688xof.Application.Size));
                    }
                }
            } else {
                GridReq gridReq6 = this.copydefault;
                if (gridReq6 == null) {
                    Intrinsics.gEmmrt("");
                    gridReq6 = null;
                }
                TrailingConfig trailingDownConfig2 = gridReq6.getTrailingDownConfig();
                if (trailingDownConfig2 == null || !trailingDownConfig2.getEnabled()) {
                    pairOLrzqt = C56390yDp.OLrzqt(java.lang.Boolean.TRUE, C33070mpX.AYXKKw(C55688xof.Application.StringDef));
                }
            }
        } else {
            GridReq gridReq7 = this.copydefault;
            if (gridReq7 == null) {
                Intrinsics.gEmmrt("");
                gridReq7 = null;
            }
            TrailingConfig trailingDownConfig3 = gridReq7.getTrailingDownConfig();
            if (trailingDownConfig3 != null && trailingDownConfig3.getEnabled()) {
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Boolean.TRUE, C33070mpX.AYXKKw(C55688xof.Application.max));
            }
        }
        C55251xgS c55251xgS = DbNXlk().getFieldNames;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(((java.lang.Boolean) pairOLrzqt.getFirst()).booleanValue() ? 0 : 8);
        DbNXlk().getFieldNames.setText((java.lang.CharSequence) pairOLrzqt.getSecond());
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024f  */
    @Override // o.AbstractC50583vTu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<java.lang.Object> EZpvd() {
        TacticsInsideItemData tacticsInsideItemData;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String tradeSymbol;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String instType;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo2;
        C54536xML c54536xMLDjBIcL3;
        C54536xML c54536xMLFetchVPNInfo3;
        java.lang.String string;
        GridReq gridReq;
        TpSlTriggerParam tpSlTriggerParam;
        kotlin.Pair pairOLrzqt;
        GridReq gridReq2;
        kotlin.Pair pairOLrzqt2;
        GridReq gridReq3;
        GridReq gridReq4;
        GridReq gridReq5;
        C54536xML c54536xMLDjBIcL4;
        C54536xML c54536xMLFetchVPNInfo4;
        java.lang.String safeString$default;
        C54536xML c54536xMLDjBIcL5;
        C54536xML c54536xMLFetchVPNInfo5;
        C55887xsS c55887xsS;
        C54571xNh c54571xNhCreateAmtConvert$default;
        C54536xML c54536xMLDjBIcL6;
        C54536xML c54536xMLFetchVPNInfo6;
        C54536xML c54536xMLDjBIcL7;
        C54536xML c54536xMLFetchVPNInfo7;
        C54536xML c54536xMLDjBIcL8;
        C54536xML c54536xMLFetchVPNInfo8;
        java.lang.String safeString$default2;
        C54536xML c54536xMLDjBIcL9;
        C54536xML c54536xMLFetchVPNInfo9;
        java.lang.String safeString$default3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        values("tp_last_state");
        GridReq gridReq6 = this.copydefault;
        java.lang.String str3 = "";
        if (gridReq6 == null) {
            Intrinsics.gEmmrt("");
            gridReq6 = null;
        }
        java.lang.String minPx = gridReq6.getMinPx();
        GridReq gridReq7 = this.copydefault;
        if (gridReq7 == null) {
            Intrinsics.gEmmrt("");
            gridReq7 = null;
        }
        EZpvd(minPx, gridReq7.getMaxPx());
        if (Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) "grid")) {
            arrayList.add(new LabelData(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompat1), 6.0f, 10.0f, 0, 0, 0, 56, (DefaultConstructorMarker) null));
        }
        C55887xsS c55887xsS2 = this.AYXKKw;
        if (c55887xsS2 == null) {
            Intrinsics.gEmmrt("");
            c55887xsS2 = null;
        }
        java.lang.String strCopydefault = c55887xsS2.copydefault("grid");
        C55887xsS c55887xsS3 = this.AYXKKw;
        if (c55887xsS3 == null) {
            Intrinsics.gEmmrt("");
            c55887xsS3 = null;
        }
        xMS xmsCopydefault = c55887xsS3.copydefault();
        C55887xsS c55887xsS4 = this.AYXKKw;
        if (c55887xsS4 == null) {
            Intrinsics.gEmmrt("");
            c55887xsS4 = null;
        }
        java.lang.String strKWHzl = c55887xsS4.KWHzl("grid");
        if (strKWHzl == null || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl))) {
            tacticsInsideItemData = null;
        } else {
            tacticsInsideItemData = new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
            tacticsInsideItemData.setTitle(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhenfullyDrawnReporter1));
            tacticsInsideItemData.setText(strKWHzl);
        }
        java.lang.String string2 = getString(C55688xof.Application.setPlaybackState);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        if (xmsCopydefault == null) {
            str = "";
        } else {
            GridReq gridReq8 = this.copydefault;
            if (gridReq8 == null) {
                Intrinsics.gEmmrt("");
                gridReq8 = null;
            }
            C54536xML c54536xMLKWHzl = xmsCopydefault.KWHzl(gridReq8.getMinPx());
            if (c54536xMLKWHzl != null && (c54536xMLDjBIcL9 = c54536xMLKWHzl.djBIcL()) != null && (c54536xMLFetchVPNInfo9 = c54536xMLDjBIcL9.fetchVPNInfo()) != null && (safeString$default3 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo9, false, 1, null)) != null) {
                str = safeString$default3;
            }
        }
        arrayList.add(new TacticsInsideItemData(string2, str, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        java.lang.String string3 = getString(C55688xof.Application.setDisplayShowCustomEnabled);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        if (xmsCopydefault == null) {
            str2 = "";
        } else {
            GridReq gridReq9 = this.copydefault;
            if (gridReq9 == null) {
                Intrinsics.gEmmrt("");
                gridReq9 = null;
            }
            C54536xML c54536xMLKWHzl2 = xmsCopydefault.KWHzl(gridReq9.getMaxPx());
            if (c54536xMLKWHzl2 != null && (c54536xMLDjBIcL8 = c54536xMLKWHzl2.djBIcL()) != null && (c54536xMLFetchVPNInfo8 = c54536xMLDjBIcL8.fetchVPNInfo()) != null && (safeString$default2 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo8, false, 1, null)) != null) {
                str2 = safeString$default2;
            }
        }
        arrayList.add(new TacticsInsideItemData(string3, str2, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        java.lang.String string4 = getString(C55688xof.Application.getCallerInput);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        xMR xmr = xMR.copydefault;
        GridReq gridReq10 = this.copydefault;
        if (gridReq10 == null) {
            Intrinsics.gEmmrt("");
            gridReq10 = null;
        }
        arrayList.add(new TacticsInsideItemData(string4, xmr.copydefault(gridReq10.getGridNum()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        TacticsInsideItemData tacticsInsideItemData2 = new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
        tacticsInsideItemData2.setTitle(getString(C55688xof.Application.LocalActivityResultRegistryOwnerLocalComposition1));
        GridReq gridReq11 = this.copydefault;
        if (gridReq11 == null) {
            Intrinsics.gEmmrt("");
            gridReq11 = null;
        }
        java.lang.String quoteSz = gridReq11.getQuoteSz();
        if (quoteSz == null || quoteSz.length() == 0) {
            GridReq gridReq12 = this.copydefault;
            if (gridReq12 == null) {
                Intrinsics.gEmmrt("");
                gridReq12 = null;
            }
            java.lang.String quoteSz2 = gridReq12.getQuoteSz();
            if (quoteSz2 == null || quoteSz2.length() == 0) {
                GridReq gridReq13 = this.copydefault;
                if (gridReq13 == null) {
                    Intrinsics.gEmmrt("");
                    gridReq13 = null;
                }
                java.lang.String baseSz = gridReq13.getBaseSz();
                if (baseSz == null || baseSz.length() == 0) {
                    GridReq gridReq14 = this.copydefault;
                    if (gridReq14 == null) {
                        Intrinsics.gEmmrt("");
                        gridReq14 = null;
                    }
                    java.lang.String sourceCcySz = gridReq14.getSourceCcySz();
                    if (sourceCcySz != null && sourceCcySz.length() != 0) {
                        GridReq gridReq15 = this.copydefault;
                        if (gridReq15 == null) {
                            Intrinsics.gEmmrt("");
                            gridReq15 = null;
                        }
                        java.lang.String sourceCcy = gridReq15.getSourceCcy();
                        if (sourceCcy != null && sourceCcy.length() != 0 && AEQbTJ(this)) {
                            C55887xsS c55887xsS5 = this.AYXKKw;
                            if (c55887xsS5 == null) {
                                Intrinsics.gEmmrt("");
                                c55887xsS5 = null;
                            }
                            BizInstrument bizInstrumentAhwBna = c55887xsS5.AhwBna();
                            if (bizInstrumentAhwBna == null || (tradeSymbol = bizInstrumentAhwBna.getTradeSymbol()) == null) {
                                tradeSymbol = "BTC";
                            }
                            GridReq gridReq16 = this.copydefault;
                            if (gridReq16 == null) {
                                Intrinsics.gEmmrt("");
                                gridReq16 = null;
                            }
                            C54571xNh c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, tradeSymbol + "-" + gridReq16.getSourceCcy(), (bizInstrumentAhwBna == null || (instType = bizInstrumentAhwBna.getInstType()) == null) ? "" : instType, null, true, null, 20, null);
                            if (c54571xNhCreateAmtConvertor$default == null) {
                                java.lang.String safeString$default4 = "";
                                tacticsInsideItemData2.setText(safeString$default4);
                            } else {
                                GridReq gridReq17 = this.copydefault;
                                if (gridReq17 == null) {
                                    Intrinsics.gEmmrt("");
                                    gridReq17 = null;
                                }
                                java.lang.String sourceCcySz2 = gridReq17.getSourceCcySz();
                                if (sourceCcySz2 == null) {
                                    sourceCcySz2 = "";
                                }
                                C54536xML c54536xMLAYXKKw = c54571xNhCreateAmtConvertor$default.AYXKKw(sourceCcySz2);
                                if (c54536xMLAYXKKw == null || (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) == null || (safeString$default4 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) == null) {
                                }
                                tacticsInsideItemData2.setText(safeString$default4);
                            }
                        }
                    }
                } else {
                    C55887xsS c55887xsS6 = this.AYXKKw;
                    if (c55887xsS6 == null) {
                        Intrinsics.gEmmrt("");
                        c55887xsS6 = null;
                    }
                    C54571xNh c54571xNhCreateAmtConvert$default2 = C55887xsS.createAmtConvert$default(c55887xsS6, null, false, 3, null);
                    if (c54571xNhCreateAmtConvert$default2 == null) {
                        java.lang.String safeString$default5 = "";
                        tacticsInsideItemData2.setText(safeString$default5);
                    } else {
                        GridReq gridReq18 = this.copydefault;
                        if (gridReq18 == null) {
                            Intrinsics.gEmmrt("");
                            gridReq18 = null;
                        }
                        java.lang.String baseSz2 = gridReq18.getBaseSz();
                        if (baseSz2 == null) {
                            baseSz2 = "";
                        }
                        C54536xML c54536xMLAYXKKw2 = c54571xNhCreateAmtConvert$default2.AYXKKw(baseSz2);
                        if (c54536xMLAYXKKw2 == null || (c54536xMLDjBIcL2 = c54536xMLAYXKKw2.djBIcL()) == null || (c54536xMLFetchVPNInfo2 = c54536xMLDjBIcL2.fetchVPNInfo()) == null || (safeString$default5 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo2, false, 1, null)) == null) {
                        }
                        tacticsInsideItemData2.setText(safeString$default5);
                    }
                }
            } else {
                C55887xsS c55887xsS7 = this.AYXKKw;
                if (c55887xsS7 == null) {
                    Intrinsics.gEmmrt("");
                    c55887xsS7 = null;
                }
                C54571xNh c54571xNhEZpvd = c55887xsS7.EZpvd(strCopydefault);
                if (c54571xNhEZpvd == null) {
                    java.lang.String safeString$default6 = "";
                    tacticsInsideItemData2.setText(safeString$default6);
                } else {
                    GridReq gridReq19 = this.copydefault;
                    if (gridReq19 == null) {
                        Intrinsics.gEmmrt("");
                        gridReq19 = null;
                    }
                    java.lang.String quoteSz3 = gridReq19.getQuoteSz();
                    if (quoteSz3 == null) {
                        quoteSz3 = "";
                    }
                    C54536xML c54536xMLAYXKKw3 = c54571xNhEZpvd.AYXKKw(quoteSz3);
                    if (c54536xMLAYXKKw3 == null || (c54536xMLDjBIcL3 = c54536xMLAYXKKw3.djBIcL()) == null || (c54536xMLFetchVPNInfo3 = c54536xMLDjBIcL3.fetchVPNInfo()) == null || (safeString$default6 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo3, false, 1, null)) == null) {
                    }
                    tacticsInsideItemData2.setText(safeString$default6);
                }
            }
        } else {
            GridReq gridReq20 = this.copydefault;
            if (gridReq20 == null) {
                Intrinsics.gEmmrt("");
                gridReq20 = null;
            }
            java.lang.String baseSz3 = gridReq20.getBaseSz();
            if (baseSz3 != null && baseSz3.length() != 0) {
                C55887xsS c55887xsS8 = this.AYXKKw;
                if (c55887xsS8 == null) {
                    Intrinsics.gEmmrt("");
                    c55887xsS8 = null;
                }
                C54571xNh c54571xNhEZpvd2 = c55887xsS8.EZpvd(strCopydefault);
                if (c54571xNhEZpvd2 == null) {
                    java.lang.String safeString$default7 = "";
                    c55887xsS = this.AYXKKw;
                    if (c55887xsS == null) {
                        Intrinsics.gEmmrt("");
                        c55887xsS = null;
                    }
                    c54571xNhCreateAmtConvert$default = C55887xsS.createAmtConvert$default(c55887xsS, null, false, 3, null);
                    if (c54571xNhCreateAmtConvert$default == null) {
                        java.lang.String safeString$default8 = "";
                        tacticsInsideItemData2.setText(safeString$default7 + " + " + safeString$default8);
                    } else {
                        GridReq gridReq21 = this.copydefault;
                        if (gridReq21 == null) {
                            Intrinsics.gEmmrt("");
                            gridReq21 = null;
                        }
                        java.lang.String baseSz4 = gridReq21.getBaseSz();
                        if (baseSz4 == null) {
                            baseSz4 = "";
                        }
                        C54536xML c54536xMLAYXKKw4 = c54571xNhCreateAmtConvert$default.AYXKKw(baseSz4);
                        if (c54536xMLAYXKKw4 == null || (c54536xMLDjBIcL6 = c54536xMLAYXKKw4.djBIcL()) == null || (c54536xMLFetchVPNInfo6 = c54536xMLDjBIcL6.fetchVPNInfo()) == null || (safeString$default8 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo6, false, 1, null)) == null) {
                        }
                        tacticsInsideItemData2.setText(safeString$default7 + " + " + safeString$default8);
                    }
                } else {
                    GridReq gridReq22 = this.copydefault;
                    if (gridReq22 == null) {
                        Intrinsics.gEmmrt("");
                        gridReq22 = null;
                    }
                    java.lang.String quoteSz4 = gridReq22.getQuoteSz();
                    if (quoteSz4 == null) {
                        quoteSz4 = "";
                    }
                    C54536xML c54536xMLAYXKKw5 = c54571xNhEZpvd2.AYXKKw(quoteSz4);
                    if (c54536xMLAYXKKw5 == null || (c54536xMLDjBIcL7 = c54536xMLAYXKKw5.djBIcL()) == null || (c54536xMLFetchVPNInfo7 = c54536xMLDjBIcL7.fetchVPNInfo()) == null || (safeString$default7 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo7, false, 1, null)) == null) {
                    }
                    c55887xsS = this.AYXKKw;
                    if (c55887xsS == null) {
                    }
                    c54571xNhCreateAmtConvert$default = C55887xsS.createAmtConvert$default(c55887xsS, null, false, 3, null);
                    if (c54571xNhCreateAmtConvert$default == null) {
                    }
                }
            }
        }
        arrayList.add(tacticsInsideItemData2);
        if (this.KWHzl && tacticsInsideItemData != null) {
            arrayList.add(tacticsInsideItemData);
        }
        InterfaceC55881xsM interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault();
        if (interfaceC55881xsMCopydefault != null) {
            C55887xsS c55887xsS9 = this.AYXKKw;
            if (c55887xsS9 == null) {
                Intrinsics.gEmmrt("");
                c55887xsS9 = null;
            }
            if (interfaceC55881xsMCopydefault.OLrzqt(c55887xsS9.ejfBZ(), "grid")) {
                GridReq gridReq23 = this.copydefault;
                if (gridReq23 == null) {
                    Intrinsics.gEmmrt("");
                    gridReq23 = null;
                }
                java.lang.String profitSharingRatio = gridReq23.getProfitSharingRatio();
                java.lang.String str4 = C33129mqd.OLrzqt((java.lang.CharSequence) profitSharingRatio) ? profitSharingRatio : null;
                if (str4 != null) {
                    arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityExternalSyntheticLambda2), xMR.formatPercent$default(xmr, str4, 0, null, 4, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                }
            }
        }
        if (C33129mqd.KWHzl((java.util.Collection) this.djBIcL.getAutoStake()) || C33129mqd.KWHzl((java.util.Collection) this.djBIcL.getAutoEarn())) {
            C54149wys.AEQbTJ.AEQbTJ(arrayList, this.djBIcL);
        }
        if (!this.KWHzl) {
            xMS xmsAEQbTJ = C54797xVr.copydefault.AEQbTJ(this.AEQbTJ, this.gEmmrt);
            if (Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) "grid")) {
                arrayList.add(new LabelData(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompat3), 18.0f, 10.0f, 0, 0, 0, 56, (DefaultConstructorMarker) null));
                if (tacticsInsideItemData != null) {
                    arrayList.add(tacticsInsideItemData);
                }
                GridReq gridReq24 = this.copydefault;
                if (gridReq24 == null) {
                    Intrinsics.gEmmrt("");
                    gridReq24 = null;
                }
                java.lang.String safeString$default9 = "--";
                if (gridReq24.getTrailingUpConfig() == null) {
                    pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.setRepeatMode), C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi23));
                    arrayList.add(new TacticsInsideItemData((java.lang.String) pairOLrzqt.getFirst(), (java.lang.String) pairOLrzqt.getSecond(), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    gridReq2 = this.copydefault;
                    if (gridReq2 == null) {
                        Intrinsics.gEmmrt("");
                        gridReq2 = null;
                    }
                    if (gridReq2.getTrailingDownConfig() == null) {
                        pairOLrzqt2 = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.setShuffleMode), C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi23));
                        arrayList.add(new TacticsInsideItemData((java.lang.String) pairOLrzqt2.getFirst(), (java.lang.String) pairOLrzqt2.getSecond(), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        java.lang.String string5 = getString(C55688xof.Application.sendMediaButton);
                        Intrinsics.checkNotNullExpressionValue(string5, "");
                        gridReq3 = this.copydefault;
                        if (gridReq3 == null) {
                            Intrinsics.gEmmrt("");
                            gridReq3 = null;
                        }
                        arrayList.add(new TacticsInsideItemData(string5, EZpvd(gridReq3.getSignParams()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        java.lang.String string6 = getString(C55688xof.Application.setShuffleModeEnabledRemoved);
                        Intrinsics.checkNotNullExpressionValue(string6, "");
                        gridReq4 = this.copydefault;
                        if (gridReq4 == null) {
                            Intrinsics.gEmmrt("");
                            gridReq4 = null;
                        }
                        arrayList.add(new TacticsInsideItemData(string6, copydefault(gridReq4.getSignParams()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        java.lang.String string7 = getString(C55688xof.Application.ActivityResultContractsPickContact);
                        Intrinsics.checkNotNullExpressionValue(string7, "");
                        gridReq5 = this.copydefault;
                        if (gridReq5 == null) {
                            Intrinsics.gEmmrt("");
                            gridReq5 = null;
                        }
                        AdvancedTriggerSign advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.wlaJM(gridReq5.getSignParams());
                        arrayList.add(new TacticsInsideItemData(string7, !Intrinsics.EZpvd((java.lang.Object) (advancedTriggerSign == null ? advancedTriggerSign.getStopType() : null), (java.lang.Object) "1") ? C33070mpX.AYXKKw(C55688xof.Application.binderDied) : C33070mpX.AYXKKw(C55688xof.Application.unregisterCallback), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    } else {
                        GridReq gridReq25 = this.copydefault;
                        if (gridReq25 == null) {
                            Intrinsics.gEmmrt("");
                            gridReq25 = null;
                        }
                        TrailingConfig trailingDownConfig = gridReq25.getTrailingDownConfig();
                        if (trailingDownConfig == null || trailingDownConfig.getEnabled()) {
                            GridReq gridReq26 = this.copydefault;
                            if (gridReq26 == null) {
                                Intrinsics.gEmmrt("");
                                gridReq26 = null;
                            }
                            TrailingConfig trailingDownConfig2 = gridReq26.getTrailingDownConfig();
                            java.lang.String stopPx = trailingDownConfig2 != null ? trailingDownConfig2.getStopPx() : null;
                            if (C33129mqd.OLrzqt((java.lang.CharSequence) stopPx)) {
                                if (xmsAEQbTJ != null) {
                                    Intrinsics.copydefault((java.lang.Object) stopPx);
                                    C54536xML c54536xMLKWHzl3 = xmsAEQbTJ.KWHzl(stopPx);
                                    if (c54536xMLKWHzl3 != null && (c54536xMLDjBIcL4 = c54536xMLKWHzl3.djBIcL()) != null && (c54536xMLFetchVPNInfo4 = c54536xMLDjBIcL4.fetchVPNInfo()) != null) {
                                        safeString$default9 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo4, false, 1, null);
                                        if (safeString$default9 == null) {
                                        }
                                    }
                                    safeString$default9 = "";
                                }
                            }
                            pairOLrzqt2 = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi23CallbackProxy), safeString$default9);
                        }
                        arrayList.add(new TacticsInsideItemData((java.lang.String) pairOLrzqt2.getFirst(), (java.lang.String) pairOLrzqt2.getSecond(), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        java.lang.String string52 = getString(C55688xof.Application.sendMediaButton);
                        Intrinsics.checkNotNullExpressionValue(string52, "");
                        gridReq3 = this.copydefault;
                        if (gridReq3 == null) {
                        }
                        arrayList.add(new TacticsInsideItemData(string52, EZpvd(gridReq3.getSignParams()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        java.lang.String string62 = getString(C55688xof.Application.setShuffleModeEnabledRemoved);
                        Intrinsics.checkNotNullExpressionValue(string62, "");
                        gridReq4 = this.copydefault;
                        if (gridReq4 == null) {
                        }
                        arrayList.add(new TacticsInsideItemData(string62, copydefault(gridReq4.getSignParams()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        java.lang.String string72 = getString(C55688xof.Application.ActivityResultContractsPickContact);
                        Intrinsics.checkNotNullExpressionValue(string72, "");
                        gridReq5 = this.copydefault;
                        if (gridReq5 == null) {
                        }
                        AdvancedTriggerSign advancedTriggerSign2 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.wlaJM(gridReq5.getSignParams());
                        arrayList.add(new TacticsInsideItemData(string72, !Intrinsics.EZpvd((java.lang.Object) (advancedTriggerSign2 == null ? advancedTriggerSign2.getStopType() : null), (java.lang.Object) "1") ? C33070mpX.AYXKKw(C55688xof.Application.binderDied) : C33070mpX.AYXKKw(C55688xof.Application.unregisterCallback), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    }
                } else {
                    GridReq gridReq27 = this.copydefault;
                    if (gridReq27 == null) {
                        Intrinsics.gEmmrt("");
                        gridReq27 = null;
                    }
                    TrailingConfig trailingUpConfig = gridReq27.getTrailingUpConfig();
                    if (trailingUpConfig == null || trailingUpConfig.getEnabled()) {
                        GridReq gridReq28 = this.copydefault;
                        if (gridReq28 == null) {
                            Intrinsics.gEmmrt("");
                            gridReq28 = null;
                        }
                        TrailingConfig trailingUpConfig2 = gridReq28.getTrailingUpConfig();
                        java.lang.String stopPx2 = trailingUpConfig2 != null ? trailingUpConfig2.getStopPx() : null;
                        if (!C33129mqd.OLrzqt((java.lang.CharSequence) stopPx2)) {
                            safeString$default = "--";
                        } else if (xmsAEQbTJ != null) {
                            Intrinsics.copydefault((java.lang.Object) stopPx2);
                            C54536xML c54536xMLKWHzl4 = xmsAEQbTJ.KWHzl(stopPx2);
                            if (c54536xMLKWHzl4 == null || (c54536xMLDjBIcL5 = c54536xMLKWHzl4.djBIcL()) == null || (c54536xMLFetchVPNInfo5 = c54536xMLDjBIcL5.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo5, false, 1, null)) == null) {
                                safeString$default = "";
                            }
                        }
                        pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi24), safeString$default);
                    }
                    arrayList.add(new TacticsInsideItemData((java.lang.String) pairOLrzqt.getFirst(), (java.lang.String) pairOLrzqt.getSecond(), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    gridReq2 = this.copydefault;
                    if (gridReq2 == null) {
                    }
                    if (gridReq2.getTrailingDownConfig() == null) {
                    }
                }
            }
            if (Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) "grid") && !this.EZpvd) {
                java.lang.String str5 = this.gEmmrt;
                java.lang.String str6 = this.AEQbTJ;
                GridReq gridReq29 = this.copydefault;
                if (gridReq29 == null) {
                    Intrinsics.gEmmrt("");
                    gridReq29 = null;
                }
                java.lang.String sourceCcy2 = gridReq29.getSourceCcy();
                GridReq gridReq30 = this.copydefault;
                if (gridReq30 == null) {
                    Intrinsics.gEmmrt("");
                    gridReq30 = null;
                }
                C55850xri c55850xri = new C55850xri(str5, str6, sourceCcy2, gridReq30.getTradeQuoteCcy());
                GridReq gridReq31 = this.copydefault;
                if (gridReq31 == null) {
                    Intrinsics.gEmmrt("");
                    gridReq31 = null;
                }
                TpSlTriggerParamReqResp tpslTriggerParamReq = gridReq31.getTpslTriggerParamReq();
                if (tpslTriggerParamReq == null || (tpSlTriggerParam = C55765xqC.OLrzqt(tpslTriggerParamReq)) == null) {
                    tpSlTriggerParam = new TpSlTriggerParam((java.lang.String) null, (java.lang.String) null, (TpSLTriggerItem) null, (TpSLTriggerItem) null, 15, (DefaultConstructorMarker) null);
                }
                if (tpSlTriggerParam.getTp().getValue() != null) {
                    java.lang.String strFetchVPNInfo = c55850xri.fetchVPNInfo(tpSlTriggerParam);
                    arrayList.add(new TacticsInsideItemData(strFetchVPNInfo == null ? "" : strFetchVPNInfo, c55850xri.values(tpSlTriggerParam), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                }
                if (tpSlTriggerParam.getSl().getValue() != null) {
                    java.lang.String strIsConnected = c55850xri.isConnected(tpSlTriggerParam);
                    arrayList.add(new TacticsInsideItemData(strIsConnected == null ? "" : strIsConnected, c55850xri.valueOf(tpSlTriggerParam), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                }
                if (tpSlTriggerParam.getDelaySeconds() != null) {
                    arrayList.add(new TacticsInsideItemData(c55850xri.copydefault(), c55850xri.djBIcL(tpSlTriggerParam), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) tpSlTriggerParam.getTp().getValue()) || C33129mqd.OLrzqt((java.lang.CharSequence) tpSlTriggerParam.getSl().getValue())) {
                    java.lang.String strGEmmrt = c55850xri.gEmmrt();
                    java.lang.String strDbNXlk = c55850xri.DbNXlk(tpSlTriggerParam);
                    arrayList.add(new TacticsInsideItemData(strGEmmrt, strDbNXlk == null ? "" : strDbNXlk, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                }
            }
            java.lang.String string8 = getString(C55688xof.Application.removeOnMenuVisibilityListener);
            Intrinsics.checkNotNullExpressionValue(string8, "");
            GridReq gridReq32 = this.copydefault;
            if (gridReq32 == null) {
                Intrinsics.gEmmrt("");
                gridReq = null;
            } else {
                gridReq = gridReq32;
            }
            java.lang.String runType = gridReq.getRunType();
            java.lang.String string9 = (!Intrinsics.EZpvd((java.lang.Object) runType, (java.lang.Object) "1") && Intrinsics.EZpvd((java.lang.Object) runType, (java.lang.Object) "2")) ? getString(C55688xof.Application.setQueue) : getString(C55688xof.Application.setPlaybackToRemote);
            java.lang.String str7 = string9;
            Intrinsics.copydefault((java.lang.Object) str7);
            arrayList.add(new TacticsInsideItemData(string8, str7, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        }
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("gridTitle")) != null) {
            str3 = string;
        }
        arrayList.add(new CoinTipsData(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.dispatchMenuVisibilityChanged), C56423yEv.EZpvd(C56390yDp.OLrzqt("name", str3))), (java.lang.String) null, 11.0f, false, 10, (DefaultConstructorMarker) null));
        return arrayList;
    }

    public static final boolean AEQbTJ(C50574vTl c50574vTl) {
        C55887xsS c55887xsS = c50574vTl.AYXKKw;
        if (c55887xsS == null) {
            Intrinsics.gEmmrt("");
            c55887xsS = null;
        }
        BizInstrument bizInstrumentAhwBna = c55887xsS.AhwBna();
        GridReq gridReq = c50574vTl.copydefault;
        if (gridReq == null) {
            Intrinsics.gEmmrt("");
            gridReq = null;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) gridReq.getSourceCcy(), (java.lang.Object) (bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getQuoteSymbol() : null))) {
            GridReq gridReq2 = c50574vTl.copydefault;
            if (gridReq2 == null) {
                Intrinsics.gEmmrt("");
                gridReq2 = null;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) gridReq2.getSourceCcy(), (java.lang.Object) (bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getTradeSymbol() : null))) {
                return true;
            }
        }
        return false;
    }

    @Override // o.AbstractC50583vTu
    public void OLrzqt() {
        if (iwGUEr()) {
            kotlin.Pair<java.lang.Boolean, java.lang.String> pairFJNWhG = fJNWhG();
            kotlin.Pair<java.lang.Boolean, java.lang.String> pairFARcdN = fARcdN();
            if (pairFJNWhG.getFirst().booleanValue() && pairFARcdN.getFirst().booleanValue()) {
                GridReq gridReq = null;
                if (C33129mqd.OLrzqt((java.lang.CharSequence) pairFJNWhG.getSecond())) {
                    GridReq gridReq2 = this.copydefault;
                    if (gridReq2 == null) {
                        Intrinsics.gEmmrt("");
                        gridReq2 = null;
                    }
                    gridReq2.setTpTriggerPx(pairFJNWhG.getSecond());
                    C32866mlf.onEvent$default("BotPlaceOrder_Confirmation_TPSLInputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.vTm
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C50574vTl.OLrzqt(this.AEQbTJ, (EventParamsList) obj);
                        }
                    }, 1, (java.lang.Object) null);
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) pairFARcdN.getSecond())) {
                    GridReq gridReq3 = this.copydefault;
                    if (gridReq3 == null) {
                        Intrinsics.gEmmrt("");
                        gridReq3 = null;
                    }
                    gridReq3.setSlTriggerPx(pairFARcdN.getSecond());
                    C32866mlf.onEvent$default("BotPlaceOrder_Confirmation_TPSLInputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.vTk
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C50574vTl.AEQbTJ(this.OLrzqt, (EventParamsList) obj);
                        }
                    }, 1, (java.lang.Object) null);
                }
                GridReq gridReq4 = this.copydefault;
                if (gridReq4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    gridReq = gridReq4;
                }
                C56028xvA.OLrzqt("make_order", C56423yEv.EZpvd(C56390yDp.OLrzqt("gridReq", C33129mqd.gEmmrt(gridReq))));
                dismissAllowingStateLoss();
                getParentFragmentManager().setFragmentResult("bot_order", new android.os.Bundle());
            }
        }
    }

    public static final Unit OLrzqt(C50574vTl c50574vTl, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", c50574vTl.valueOf, false, 4, null);
        EventParamsList.put$default(eventParamsList, "input_box", "tp", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C50574vTl c50574vTl, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", c50574vTl.valueOf, false, 4, null);
        EventParamsList.put$default(eventParamsList, "input_box", "sl", false, 4, null);
        return Unit.INSTANCE;
    }

    private final java.lang.String EZpvd(java.util.ArrayList<AdvancedTriggerSign> arrayList) {
        java.lang.String botPrice$default;
        java.lang.String triggerPx;
        AdvancedTriggerSign advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (Intrinsics.EZpvd((java.lang.Object) (advancedTriggerSign != null ? advancedTriggerSign.getIndicator() : null), (java.lang.Object) GridStartTriggerType.PRICE.getMode())) {
            AdvancedTriggerSign advancedTriggerSign2 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (advancedTriggerSign2 != null ? advancedTriggerSign2.getTriggerPx() : null))) {
                java.lang.String str = this.gEmmrt;
                java.lang.String str2 = this.AEQbTJ;
                AdvancedTriggerSign advancedTriggerSign3 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
                if (advancedTriggerSign3 == null || (triggerPx = advancedTriggerSign3.getTriggerPx()) == null) {
                    triggerPx = "";
                }
                botPrice$default = C56033xvF.getBotPrice$default(str, str2, triggerPx, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
            } else {
                botPrice$default = "--";
            }
            GridStartTriggerType.Application application = GridStartTriggerType.Companion;
            AdvancedTriggerSign advancedTriggerSign4 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
            return application.copydefault(advancedTriggerSign4 != null ? advancedTriggerSign4.getIndicator() : null) + " | " + botPrice$default;
        }
        GridStartTriggerType.Application application2 = GridStartTriggerType.Companion;
        AdvancedTriggerSign advancedTriggerSign5 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        return application2.copydefault(advancedTriggerSign5 != null ? advancedTriggerSign5.getIndicator() : null);
    }

    private final java.lang.String copydefault(java.util.ArrayList<AdvancedTriggerSign> arrayList) {
        java.lang.String botPrice$default;
        java.lang.String triggerPx;
        AdvancedTriggerSign advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.wlaJM(arrayList);
        if (Intrinsics.EZpvd((java.lang.Object) (advancedTriggerSign != null ? advancedTriggerSign.getIndicator() : null), (java.lang.Object) GridStopTriggerType.PRICE.getMode())) {
            AdvancedTriggerSign advancedTriggerSign2 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.wlaJM(arrayList);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (advancedTriggerSign2 != null ? advancedTriggerSign2.getTriggerPx() : null))) {
                java.lang.String str = this.gEmmrt;
                java.lang.String str2 = this.AEQbTJ;
                AdvancedTriggerSign advancedTriggerSign3 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.wlaJM(arrayList);
                if (advancedTriggerSign3 == null || (triggerPx = advancedTriggerSign3.getTriggerPx()) == null) {
                    triggerPx = "";
                }
                botPrice$default = C56033xvF.getBotPrice$default(str, str2, triggerPx, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
            } else {
                botPrice$default = "--";
            }
            GridStopTriggerType.StateListAnimator stateListAnimator = GridStopTriggerType.Companion;
            AdvancedTriggerSign advancedTriggerSign4 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.wlaJM(arrayList);
            return stateListAnimator.EZpvd(advancedTriggerSign4 != null ? advancedTriggerSign4.getIndicator() : null) + " | " + botPrice$default;
        }
        GridStopTriggerType.StateListAnimator stateListAnimator2 = GridStopTriggerType.Companion;
        AdvancedTriggerSign advancedTriggerSign5 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.wlaJM(arrayList);
        return stateListAnimator2.EZpvd(advancedTriggerSign5 != null ? advancedTriggerSign5.getIndicator() : null);
    }
}
