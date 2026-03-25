package o;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.unify_trade.biz.SpotGridEditParamReq;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.grid.mapper.GridProfitAmtDisplay;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xsx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55918xsx implements InterfaceC54501xKt<TacticsData, C55917xsw> {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final SpotGridEditParamReq AEQbTJ;
    public java.lang.String EZpvd;
    public final GridProfitAmtDisplay KWHzl;
    public java.lang.String OLrzqt;

    public C55918xsx(SpotGridEditParamReq spotGridEditParamReq, GridProfitAmtDisplay gridProfitAmtDisplay) {
        this.AEQbTJ = spotGridEditParamReq;
        this.KWHzl = gridProfitAmtDisplay;
        this.OLrzqt = "";
        this.EZpvd = "";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.unify_trade.biz.SpotGridEditParamReq)
  (wrap:com.okinc.unify_trade.bot.grid.mapper.GridProfitAmtDisplay:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.bot.grid.mapper.GridProfitAmtDisplay) : (r2v0 com.okinc.unify_trade.bot.grid.mapper.GridProfitAmtDisplay))
 A[MD:(com.okinc.unify_trade.biz.SpotGridEditParamReq, com.okinc.unify_trade.bot.grid.mapper.GridProfitAmtDisplay):void (m)] (LINE:40) call: o.xsx.<init>(com.okinc.unify_trade.biz.SpotGridEditParamReq, com.okinc.unify_trade.bot.grid.mapper.GridProfitAmtDisplay):void type: THIS */
    public /* synthetic */ C55918xsx(SpotGridEditParamReq spotGridEditParamReq, GridProfitAmtDisplay gridProfitAmtDisplay, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(spotGridEditParamReq, (i & 2) != 0 ? null : gridProfitAmtDisplay);
    }

    /* JADX INFO: renamed from: o.xsx$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xsx.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
            C56068xvo c56068xvo = C56068xvo.copydefault;
            if (str == null) {
                str = "";
            }
            java.lang.String strFmtPnlPercent$default = C56068xvo.fmtPnlPercent$default(c56068xvo, str, false, 2, null);
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String strFmtPnlPercent$default2 = C56068xvo.fmtPnlPercent$default(c56068xvo, str2, false, 2, null);
            if (Intrinsics.EZpvd((java.lang.Object) strFmtPnlPercent$default, (java.lang.Object) strFmtPnlPercent$default2)) {
                return strFmtPnlPercent$default;
            }
            return strFmtPnlPercent$default + " - " + strFmtPnlPercent$default2;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C55917xsw KWHzl(@NotNull TacticsData tacticsData) {
        java.lang.String gridNum;
        java.lang.String topupAmount;
        java.lang.String stopPx;
        java.lang.String stopPx2;
        Intrinsics.checkNotNullParameter(tacticsData, "");
        this.OLrzqt = tacticsData.getInstId();
        this.EZpvd = tacticsData.getInstType();
        TrailingConfig trailingUpConfig = tacticsData.getTrailingUpConfig();
        boolean z = trailingUpConfig != null && trailingUpConfig.getEnabled();
        TrailingConfig trailingDownConfig = tacticsData.getTrailingDownConfig();
        boolean z2 = trailingDownConfig != null && trailingDownConfig.getEnabled();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.newPercentageRating), null, null, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), 0, 0, 0, C52761wXj.LoaderManager.UlJrfe, null, null, null, null, null, null, null, null, null, 130934, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompat), copydefault(tacticsData.getMinPx(), tacticsData.getMaxPx()), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ensureClassLoader);
        xMR xmr = xMR.copydefault;
        arrayList.add(new TacticsInsideItemData(strAYXKKw, xmr.copydefault(tacticsData.getGridNum()), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
        Application application = Companion;
        java.lang.String strCopydefault = application.copydefault(tacticsData.getPerMinProfitRate(), tacticsData.getPerMaxProfitRate());
        java.lang.String str = this.OLrzqt;
        java.lang.String str2 = this.EZpvd;
        GridProfitAmtDisplay gridProfitAmtDisplay = this.KWHzl;
        java.lang.String strAEQbTJ = gridProfitAmtDisplay != null ? gridProfitAmtDisplay.AEQbTJ() : null;
        GridProfitAmtDisplay gridProfitAmtDisplay2 = this.KWHzl;
        java.lang.String strKWHzl = gridProfitAmtDisplay2 != null ? gridProfitAmtDisplay2.KWHzl() : null;
        GridProfitAmtDisplay gridProfitAmtDisplay3 = this.KWHzl;
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setQueueTitle), C56033xvF.copydefault(str, str2, strCopydefault, strAEQbTJ, strKWHzl, gridProfitAmtDisplay3 != null ? gridProfitAmtDisplay3.EZpvd() : null, (256 & 64) != 0 ? "--" : "--", (256 & 128) != 0 ? true : true, (256 & 256) != 0 ? 0 : 0), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
        java.lang.String direction = tacticsData.getDirection();
        int iHashCode = direction.hashCode();
        if (iHashCode != 3327612) {
            if (iHashCode != 109413500) {
                if (iHashCode == 1844321735 && direction.equals("neutral")) {
                    java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.FullyDrawnReporterExternalSyntheticLambda0);
                    C56068xvo c56068xvo = C56068xvo.copydefault;
                    java.lang.String instType = tacticsData.getInstType();
                    java.lang.String instId = tacticsData.getInstId();
                    java.lang.String longLiqPx = tacticsData.getLongLiqPx();
                    arrayList.add(new TacticsInsideItemData(strAYXKKw2, C56068xvo.getForcedClosePrice$default(c56068xvo, instType, instId, longLiqPx == null ? "" : longLiqPx, tacticsData.getDirection(), true, false, 32, null), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
                    java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.removeReporter);
                    java.lang.String instType2 = tacticsData.getInstType();
                    java.lang.String instId2 = tacticsData.getInstId();
                    java.lang.String shortLiqPx = tacticsData.getShortLiqPx();
                    arrayList.add(new TacticsInsideItemData(strAYXKKw3, C56068xvo.getForcedClosePrice$default(c56068xvo, instType2, instId2, shortLiqPx == null ? "" : shortLiqPx, tacticsData.getDirection(), true, false, 32, null), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
                }
            } else if (direction.equals("short")) {
                java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2StubProxy);
                C56068xvo c56068xvo2 = C56068xvo.copydefault;
                java.lang.String instType3 = tacticsData.getInstType();
                java.lang.String instId3 = tacticsData.getInstId();
                java.lang.String shortLiqPx2 = tacticsData.getShortLiqPx();
                arrayList.add(new TacticsInsideItemData(strAYXKKw4, C56068xvo.getForcedClosePrice$default(c56068xvo2, instType3, instId3, shortLiqPx2 == null ? "" : shortLiqPx2, tacticsData.getDirection(), true, false, 32, null), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
            }
        } else if (direction.equals("long")) {
            java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2StubProxy);
            C56068xvo c56068xvo3 = C56068xvo.copydefault;
            java.lang.String instType4 = tacticsData.getInstType();
            java.lang.String instId4 = tacticsData.getInstId();
            java.lang.String longLiqPx2 = tacticsData.getLongLiqPx();
            arrayList.add(new TacticsInsideItemData(strAYXKKw5, C56068xvo.getForcedClosePrice$default(c56068xvo3, instType4, instId4, longLiqPx2 == null ? "" : longLiqPx2, tacticsData.getDirection(), true, false, 32, null), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
        }
        if (z) {
            java.lang.String strAYXKKw6 = C33070mpX.AYXKKw(C55688xof.Application.RequiresPermission);
            java.lang.String str3 = this.EZpvd;
            java.lang.String str4 = this.OLrzqt;
            TrailingConfig trailingUpConfig2 = tacticsData.getTrailingUpConfig();
            arrayList.add(new TacticsInsideItemData(strAYXKKw6, C56033xvF.getBotPrice$default(str3, str4, (trailingUpConfig2 == null || (stopPx2 = trailingUpConfig2.getStopPx()) == null) ? "" : stopPx2, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
        }
        if (z2) {
            java.lang.String strAYXKKw7 = C33070mpX.AYXKKw(C55688xof.Application.level);
            java.lang.String str5 = this.EZpvd;
            java.lang.String str6 = this.OLrzqt;
            TrailingConfig trailingDownConfig2 = tacticsData.getTrailingDownConfig();
            arrayList.add(new TacticsInsideItemData(strAYXKKw7, C56033xvF.getBotPrice$default(str5, str6, (trailingDownConfig2 == null || (stopPx = trailingDownConfig2.getStopPx()) == null) ? "" : stopPx, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ParceledListSliceAdapterApi21), null, null, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), 0, 0, 0, C52761wXj.LoaderManager.UlJrfe, null, null, null, null, null, null, null, null, null, 130934, null));
        java.lang.String strAYXKKw8 = C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompat);
        SpotGridEditParamReq spotGridEditParamReq = this.AEQbTJ;
        java.lang.String minPx = spotGridEditParamReq != null ? spotGridEditParamReq.getMinPx() : null;
        SpotGridEditParamReq spotGridEditParamReq2 = this.AEQbTJ;
        arrayList2.add(new TacticsInsideItemData(strAYXKKw8, copydefault(minPx, spotGridEditParamReq2 != null ? spotGridEditParamReq2.getMaxPx() : null), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
        java.lang.String strAYXKKw9 = C33070mpX.AYXKKw(C55688xof.Application.ensureClassLoader);
        SpotGridEditParamReq spotGridEditParamReq3 = this.AEQbTJ;
        if (spotGridEditParamReq3 == null || (gridNum = spotGridEditParamReq3.getGridNum()) == null) {
            gridNum = "0";
        }
        arrayList2.add(new TacticsInsideItemData(strAYXKKw9, xmr.copydefault(gridNum), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
        SpotGridEditParamReq spotGridEditParamReq4 = this.AEQbTJ;
        java.lang.String perMinProfitRate = spotGridEditParamReq4 != null ? spotGridEditParamReq4.getPerMinProfitRate() : null;
        SpotGridEditParamReq spotGridEditParamReq5 = this.AEQbTJ;
        java.lang.String strCopydefault2 = application.copydefault(perMinProfitRate, spotGridEditParamReq5 != null ? spotGridEditParamReq5.getPerMaxProfitRate() : null);
        java.lang.String str7 = this.OLrzqt;
        java.lang.String str8 = this.EZpvd;
        GridProfitAmtDisplay gridProfitAmtDisplay4 = this.KWHzl;
        java.lang.String strOLrzqt = gridProfitAmtDisplay4 != null ? gridProfitAmtDisplay4.OLrzqt() : null;
        GridProfitAmtDisplay gridProfitAmtDisplay5 = this.KWHzl;
        java.lang.String strCopydefault3 = gridProfitAmtDisplay5 != null ? gridProfitAmtDisplay5.copydefault() : null;
        GridProfitAmtDisplay gridProfitAmtDisplay6 = this.KWHzl;
        arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setQueueTitle), C56033xvF.copydefault(str7, str8, strCopydefault2, strOLrzqt, strCopydefault3, gridProfitAmtDisplay6 != null ? gridProfitAmtDisplay6.EZpvd() : null, (256 & 64) != 0 ? "--" : "--", (256 & 128) != 0 ? true : true, (256 & 256) != 0 ? 0 : 0), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
        java.lang.String direction2 = tacticsData.getDirection();
        int iHashCode2 = direction2.hashCode();
        if (iHashCode2 != 3327612) {
            if (iHashCode2 != 109413500) {
                if (iHashCode2 == 1844321735 && direction2.equals("neutral")) {
                    java.lang.String strAYXKKw10 = C33070mpX.AYXKKw(C55688xof.Application.FullyDrawnReporterExternalSyntheticLambda0);
                    C56068xvo c56068xvo4 = C56068xvo.copydefault;
                    java.lang.String instType5 = tacticsData.getInstType();
                    java.lang.String instId5 = tacticsData.getInstId();
                    SpotGridEditParamReq spotGridEditParamReq6 = this.AEQbTJ;
                    java.lang.String longLiqPx3 = spotGridEditParamReq6 != null ? spotGridEditParamReq6.getLongLiqPx() : null;
                    arrayList2.add(new TacticsInsideItemData(strAYXKKw10, C56068xvo.getForcedClosePrice$default(c56068xvo4, instType5, instId5, longLiqPx3 == null ? "" : longLiqPx3, tacticsData.getDirection(), true, false, 32, null), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
                    java.lang.String strAYXKKw11 = C33070mpX.AYXKKw(C55688xof.Application.removeReporter);
                    java.lang.String instType6 = tacticsData.getInstType();
                    java.lang.String instId6 = tacticsData.getInstId();
                    SpotGridEditParamReq spotGridEditParamReq7 = this.AEQbTJ;
                    java.lang.String shortLiqPx3 = spotGridEditParamReq7 != null ? spotGridEditParamReq7.getShortLiqPx() : null;
                    arrayList2.add(new TacticsInsideItemData(strAYXKKw11, C56068xvo.getForcedClosePrice$default(c56068xvo4, instType6, instId6, shortLiqPx3 == null ? "" : shortLiqPx3, tacticsData.getDirection(), true, false, 32, null), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
                }
            } else if (direction2.equals("short")) {
                java.lang.String strAYXKKw12 = C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2StubProxy);
                C56068xvo c56068xvo5 = C56068xvo.copydefault;
                java.lang.String instType7 = tacticsData.getInstType();
                java.lang.String instId7 = tacticsData.getInstId();
                SpotGridEditParamReq spotGridEditParamReq8 = this.AEQbTJ;
                java.lang.String shortLiqPx4 = spotGridEditParamReq8 != null ? spotGridEditParamReq8.getShortLiqPx() : null;
                arrayList2.add(new TacticsInsideItemData(strAYXKKw12, C56068xvo.getForcedClosePrice$default(c56068xvo5, instType7, instId7, shortLiqPx4 == null ? "" : shortLiqPx4, tacticsData.getDirection(), true, false, 32, null), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
            }
        } else if (direction2.equals("long")) {
            java.lang.String strAYXKKw13 = C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2StubProxy);
            C56068xvo c56068xvo6 = C56068xvo.copydefault;
            java.lang.String instType8 = tacticsData.getInstType();
            java.lang.String instId8 = tacticsData.getInstId();
            SpotGridEditParamReq spotGridEditParamReq9 = this.AEQbTJ;
            java.lang.String longLiqPx4 = spotGridEditParamReq9 != null ? spotGridEditParamReq9.getLongLiqPx() : null;
            arrayList2.add(new TacticsInsideItemData(strAYXKKw13, C56068xvo.getForcedClosePrice$default(c56068xvo6, instType8, instId8, longLiqPx4 == null ? "" : longLiqPx4, tacticsData.getDirection(), true, false, 32, null), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
        }
        SpotGridEditParamReq spotGridEditParamReq10 = this.AEQbTJ;
        if (C33129mqd.AEQbTJ(spotGridEditParamReq10 != null ? spotGridEditParamReq10.getTopupAmount() : null, "0")) {
            java.lang.String strAYXKKw14 = C33070mpX.AYXKKw(C55688xof.Application.RatingCompat);
            java.lang.String str9 = this.EZpvd;
            java.lang.String str10 = this.OLrzqt;
            SpotGridEditParamReq spotGridEditParamReq11 = this.AEQbTJ;
            arrayList2.add(new TacticsInsideItemData(strAYXKKw14, C56033xvF.getBotPrice$default(str9, str10, (spotGridEditParamReq11 == null || (topupAmount = spotGridEditParamReq11.getTopupAmount()) == null) ? "" : topupAmount, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
        }
        if (z) {
            arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setRepeatMode), C33070mpX.AYXKKw(C55688xof.Application.onMediaButtonEvent), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
        }
        if (z2) {
            arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setShuffleMode), C33070mpX.AYXKKw(C55688xof.Application.onMediaButtonEvent), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
        }
        return new C55917xsw(arrayList, arrayList2);
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = this.EZpvd;
        java.lang.String str4 = this.OLrzqt;
        java.lang.String str5 = str == null ? "" : str;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return C56033xvF.getBotPrice$default(str3, str4, str5, false, false, roundingMode, null, 88, null) + " - " + C56033xvF.getBotPrice$default(this.EZpvd, this.OLrzqt, str2 == null ? "" : str2, true, false, roundingMode, null, 80, null);
    }
}
