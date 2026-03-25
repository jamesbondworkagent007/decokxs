package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.unify_trade.account.AccountModeChangeEvent;
import com.okinc.unify_trade.biz.AccountTradeConfig;
import com.okinc.unify_trade.biz.StableCoin;
import com.okinc.unify_trade.biz.TradeCollateralCoinConfig;
import com.okinc.unify_trade.biz.TradeInfo;
import com.okinc.unify_trade.biz.UserTradeConfigInfo;
import com.okinc.unify_trade.constants.KLineConfigType;
import com.okinc.unify_trade.constants.TradePanelType;
import com.okinc.unify_trade.exception.BizSystemException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xOp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54606xOp extends xNW implements xOX {
    public UserTradeConfigInfo AEQbTJ;
    public final xBB AhwBna;
    public TradeInfo EZpvd;
    public TradeCollateralCoinConfig KWHzl;
    public final boolean OLrzqt;
    public final C54271xCf copydefault;

    /* JADX INFO: renamed from: o.xOp$StateListAnimator */
    /* JADX INFO: loaded from: classes17.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradePanelType.values().length];
            try {
                iArr[TradePanelType.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TradePanelType.RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[KLineConfigType.values().length];
            try {
                iArr2[KLineConfigType.CLOSE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[KLineConfigType.TOP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[KLineConfigType.BOTTOM.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            EZpvd = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C54606xOp() {
        this(false, 1, null);
    }

    @Override // o.xNW
    public boolean AhwBna() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xNW
    public java.lang.String EZpvd() {
        return "TradeConfigInfoProvider";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(UserTradeConfigInfo userTradeConfigInfo) {
        if (userTradeConfigInfo != null) {
            this.AEQbTJ = userTradeConfigInfo;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(TradeInfo tradeInfo) {
        if (tradeInfo != null) {
            this.EZpvd = tradeInfo;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeInfo QUSxYX() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xNW
    public boolean bE_() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserTradeConfigInfo dNCPSb() {
        return this.AEQbTJ;
    }

    public C54606xOp(boolean z) {
        this.OLrzqt = z;
        this.AhwBna = new xBB();
        this.copydefault = new C54271xCf();
        this.AEQbTJ = new UserTradeConfigInfo("2", "2", "long_short_mode", true, false, false, "0", false, "automatic", "automatic", 0, (java.util.List) null, "3", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, (java.util.List) null, (java.lang.String) null, false, false, "USDC", (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 2130701472, (DefaultConstructorMarker) null);
        this.EZpvd = new TradeInfo("0", (java.lang.String) null, "0", "1", "0", (java.lang.String) null, (java.lang.String) null, "0", "1", KLineConfigType.TOP.getValue(), "1", "0", "", "", TradePanelType.LEFT.getValue(), "", (java.util.List) null, (java.lang.String) null, yDY.AhwBna(), (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.String) null, (java.lang.Integer) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 264437858, (DefaultConstructorMarker) null);
        this.KWHzl = new TradeCollateralCoinConfig("0", "0", new java.util.ArrayList(), "all");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:48) call: o.xOp.<init>(boolean):void type: THIS */
    public /* synthetic */ C54606xOp(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    @Override // o.xNW
    public void gEmmrt() {
        final xKL<java.util.ArrayList<AccountTradeConfig>> xklZuBGHE = zuBGHE();
        xklZuBGHE.AYXKKw();
        xklZuBGHE.KWHzl(new Function1() { // from class: o.xOn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54606xOp.copydefault(this.AEQbTJ, xklZuBGHE, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xklZuBGHE, 0L, 1, null);
    }

    public static final Unit copydefault(C54606xOp c54606xOp, xKL xkl, ResponseData responseData) {
        java.util.ArrayList arrayList;
        AccountTradeConfig accountTradeConfig;
        AccountTradeConfig accountTradeConfig2;
        AccountTradeConfig accountTradeConfig3;
        AccountTradeConfig accountTradeConfig4;
        AccountTradeConfig accountTradeConfig5;
        Intrinsics.checkNotNullParameter(responseData, "");
        java.lang.String strFJNWhG = c54606xOp.fJNWhG();
        java.lang.String strEZpvd = c54606xOp.EZpvd();
        boolean z = responseData.getCode() == 0 && responseData.getData() != null;
        java.lang.String msg = (responseData.getCode() != 0 || responseData.getData() == null) ? responseData.getMsg() : "";
        pUU.KWHzl(strFJNWhG, "task " + strEZpvd + " loadHttp tradeInfoAndConfig:" + z + ";" + msg + "; costTime: " + (java.lang.System.currentTimeMillis() - c54606xOp.AuCTel()));
        if (responseData.getCode() == 0 && responseData.getData() != null && (arrayList = (java.util.ArrayList) responseData.getData()) != null && (!arrayList.isEmpty())) {
            java.lang.String strFJNWhG2 = c54606xOp.fJNWhG();
            java.lang.String strEZpvd2 = c54606xOp.EZpvd();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) responseData.getData();
            pUU.KWHzl(strFJNWhG2, "task " + strEZpvd2 + " userTradeConfigInfo:" + ((arrayList2 == null || (accountTradeConfig5 = (AccountTradeConfig) arrayList2.get(0)) == null) ? null : accountTradeConfig5.getAccountConfig()));
            java.lang.String strFJNWhG3 = c54606xOp.fJNWhG();
            java.lang.String strEZpvd3 = c54606xOp.EZpvd();
            java.util.ArrayList arrayList3 = (java.util.ArrayList) responseData.getData();
            pUU.KWHzl(strFJNWhG3, "task " + strEZpvd3 + " tradeInfo:" + ((arrayList3 == null || (accountTradeConfig4 = (AccountTradeConfig) arrayList3.get(0)) == null) ? null : accountTradeConfig4.getTradeConfig()));
            java.util.ArrayList arrayList4 = (java.util.ArrayList) responseData.getData();
            UserTradeConfigInfo accountConfig = (arrayList4 == null || (accountTradeConfig3 = (AccountTradeConfig) arrayList4.get(0)) == null) ? null : accountTradeConfig3.getAccountConfig();
            java.util.ArrayList arrayList5 = (java.util.ArrayList) responseData.getData();
            TradeInfo tradeConfig = (arrayList5 == null || (accountTradeConfig2 = (AccountTradeConfig) arrayList5.get(0)) == null) ? null : accountTradeConfig2.getTradeConfig();
            java.util.ArrayList arrayList6 = (java.util.ArrayList) responseData.getData();
            c54606xOp.EZpvd(accountConfig, tradeConfig, (arrayList6 == null || (accountTradeConfig = (AccountTradeConfig) arrayList6.get(0)) == null) ? null : accountTradeConfig.getCollateralCoinConfig());
            xNW.notifyResult$default(c54606xOp, true, null, 2, null);
        } else {
            java.lang.Exception value = xkl.AhwBna().getValue();
            BizSystemException bizSystemException = value instanceof BizSystemException ? (BizSystemException) value : null;
            if (bizSystemException != null) {
                C6777aVl.Companion.EZpvd(bizSystemException);
            }
            c54606xOp.AEQbTJ(c54606xOp.bE_(), c54606xOp.AEQbTJ(xkl.AhwBna().getValue()));
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(UserTradeConfigInfo userTradeConfigInfo, TradeInfo tradeInfo, TradeCollateralCoinConfig tradeCollateralCoinConfig) {
        java.lang.String acctLv = userTradeConfigInfo != null ? userTradeConfigInfo.getAcctLv() : null;
        UserTradeConfigInfo userTradeConfigInfo2 = this.AEQbTJ;
        if (!Intrinsics.EZpvd((java.lang.Object) acctLv, (java.lang.Object) (userTradeConfigInfo2 != null ? userTradeConfigInfo2.getAcctLv() : null))) {
            UserTradeConfigInfo userTradeConfigInfo3 = this.AEQbTJ;
            RxBus.AEQbTJ(new AccountModeChangeEvent(userTradeConfigInfo3 != null ? userTradeConfigInfo3.getAcctLv() : null, userTradeConfigInfo != null ? userTradeConfigInfo.getAcctLv() : null));
        }
        this.AEQbTJ = userTradeConfigInfo;
        this.EZpvd = tradeInfo;
        this.KWHzl = tradeCollateralCoinConfig;
    }

    @Override // o.xNW
    public java.util.List<xKK> djBIcL() {
        return yDY.copydefault(this.AhwBna, this.copydefault);
    }

    @Override // o.xOX
    public boolean QbewEr() {
        TradeInfo tradeInfo = this.EZpvd;
        return C33129mqd.OLrzqt((java.lang.Object) (tradeInfo != null ? tradeInfo.getConfirm() : null), (java.lang.Object) 1);
    }

    @Override // o.xOX
    public void AEQbTJ(boolean z) {
        TradeInfo tradeInfoCopy;
        TradeInfo tradeInfo = this.EZpvd;
        if (tradeInfo != null) {
            tradeInfoCopy = tradeInfo.copy((268435447 & 1) != 0 ? tradeInfo.invertTradeUnit : null, (268435447 & 2) != 0 ? tradeInfo.inverseFuturesUnit : null, (268435447 & 4) != 0 ? tradeInfo.linearTradeUnit : null, (268435447 & 8) != 0 ? tradeInfo.confirm : z ? "1" : "0", (268435447 & 16) != 0 ? tradeInfo.depthCountConfirm : null, (268435447 & 32) != 0 ? tradeInfo.kLineWithPriceConfig : null, (268435447 & 64) != 0 ? tradeInfo.ccy : null, (268435447 & 128) != 0 ? tradeInfo.greekUnit : null, (268435447 & 256) != 0 ? tradeInfo.kLineConfig : null, (268435447 & 512) != 0 ? tradeInfo.manualKLineConfig : null, (268435447 & 1024) != 0 ? tradeInfo.mktCloseConfirm : null, (268435447 & 2048) != 0 ? tradeInfo.liqPxSwitch : null, (268435447 & 4096) != 0 ? tradeInfo.uplPriceType : null, (268435447 & 8192) != 0 ? tradeInfo.reversePosEnable : null, (268435447 & 16384) != 0 ? tradeInfo.placeLayoutConfig : null, (268435447 & 32768) != 0 ? tradeInfo.reversePosConfirm : null, (268435447 & 65536) != 0 ? tradeInfo.tabCustomConfig : null, (268435447 & 131072) != 0 ? tradeInfo.stableCoin : null, (268435447 & 262144) != 0 ? tradeInfo.supportedStableCoin : null, (268435447 & 524288) != 0 ? tradeInfo.hostingShow : null, (268435447 & 1048576) != 0 ? tradeInfo.hostingStatus : null, (268435447 & 2097152) != 0 ? tradeInfo.curPosHostingShow : null, (268435447 & 4194304) != 0 ? tradeInfo.spotAverageConfig : null, (268435447 & 8388608) != 0 ? tradeInfo.scaleOrderNum : null, (268435447 & 16777216) != 0 ? tradeInfo.enableUseNewPotential : false, (268435447 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tradeInfo.chasePriceConfirm : null, (268435447 & 67108864) != 0 ? tradeInfo.simpleBorrowAgreementConfirm : null, (268435447 & 134217728) != 0 ? tradeInfo.realizedPnlSwitch : null);
        } else {
            tradeInfoCopy = null;
        }
        this.EZpvd = tradeInfoCopy;
    }

    @Override // o.xOX
    public java.lang.String ORxRYg() {
        UserTradeConfigInfo userTradeConfigInfo = this.AEQbTJ;
        if (userTradeConfigInfo != null) {
            return userTradeConfigInfo.getLiquidationGear();
        }
        return null;
    }

    @Override // o.xOX
    public java.lang.String AubY() {
        TradeInfo tradeInfo = this.EZpvd;
        if (tradeInfo != null) {
            return tradeInfo.getUplPriceType();
        }
        return null;
    }

    @Override // o.xOX
    public boolean uzCIH() {
        TradeInfo tradeInfo = this.EZpvd;
        return C33129mqd.OLrzqt((java.lang.Object) (tradeInfo != null ? tradeInfo.getMktCloseConfirm() : null), (java.lang.Object) 1);
    }

    @Override // o.xOX
    public void KWHzl(boolean z) {
        TradeInfo tradeInfoCopy;
        TradeInfo tradeInfo = this.EZpvd;
        if (tradeInfo != null) {
            tradeInfoCopy = tradeInfo.copy((268435447 & 1) != 0 ? tradeInfo.invertTradeUnit : null, (268435447 & 2) != 0 ? tradeInfo.inverseFuturesUnit : null, (268435447 & 4) != 0 ? tradeInfo.linearTradeUnit : null, (268435447 & 8) != 0 ? tradeInfo.confirm : null, (268435447 & 16) != 0 ? tradeInfo.depthCountConfirm : null, (268435447 & 32) != 0 ? tradeInfo.kLineWithPriceConfig : null, (268435447 & 64) != 0 ? tradeInfo.ccy : null, (268435447 & 128) != 0 ? tradeInfo.greekUnit : null, (268435447 & 256) != 0 ? tradeInfo.kLineConfig : null, (268435447 & 512) != 0 ? tradeInfo.manualKLineConfig : null, (268435447 & 1024) != 0 ? tradeInfo.mktCloseConfirm : z ? "1" : "0", (268435447 & 2048) != 0 ? tradeInfo.liqPxSwitch : null, (268435447 & 4096) != 0 ? tradeInfo.uplPriceType : null, (268435447 & 8192) != 0 ? tradeInfo.reversePosEnable : null, (268435447 & 16384) != 0 ? tradeInfo.placeLayoutConfig : null, (268435447 & 32768) != 0 ? tradeInfo.reversePosConfirm : null, (268435447 & 65536) != 0 ? tradeInfo.tabCustomConfig : null, (268435447 & 131072) != 0 ? tradeInfo.stableCoin : null, (268435447 & 262144) != 0 ? tradeInfo.supportedStableCoin : null, (268435447 & 524288) != 0 ? tradeInfo.hostingShow : null, (268435447 & 1048576) != 0 ? tradeInfo.hostingStatus : null, (268435447 & 2097152) != 0 ? tradeInfo.curPosHostingShow : null, (268435447 & 4194304) != 0 ? tradeInfo.spotAverageConfig : null, (268435447 & 8388608) != 0 ? tradeInfo.scaleOrderNum : null, (268435447 & 16777216) != 0 ? tradeInfo.enableUseNewPotential : false, (268435447 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tradeInfo.chasePriceConfirm : null, (268435447 & 67108864) != 0 ? tradeInfo.simpleBorrowAgreementConfirm : null, (268435447 & 134217728) != 0 ? tradeInfo.realizedPnlSwitch : null);
        } else {
            tradeInfoCopy = null;
        }
        this.EZpvd = tradeInfoCopy;
    }

    @Override // o.xOX
    public void copydefault(boolean z) {
        TradeInfo tradeInfoCopy;
        TradeInfo tradeInfo = this.EZpvd;
        if (tradeInfo != null) {
            tradeInfoCopy = tradeInfo.copy((268435447 & 1) != 0 ? tradeInfo.invertTradeUnit : null, (268435447 & 2) != 0 ? tradeInfo.inverseFuturesUnit : null, (268435447 & 4) != 0 ? tradeInfo.linearTradeUnit : null, (268435447 & 8) != 0 ? tradeInfo.confirm : null, (268435447 & 16) != 0 ? tradeInfo.depthCountConfirm : null, (268435447 & 32) != 0 ? tradeInfo.kLineWithPriceConfig : null, (268435447 & 64) != 0 ? tradeInfo.ccy : null, (268435447 & 128) != 0 ? tradeInfo.greekUnit : null, (268435447 & 256) != 0 ? tradeInfo.kLineConfig : z ? "1" : "0", (268435447 & 512) != 0 ? tradeInfo.manualKLineConfig : null, (268435447 & 1024) != 0 ? tradeInfo.mktCloseConfirm : null, (268435447 & 2048) != 0 ? tradeInfo.liqPxSwitch : null, (268435447 & 4096) != 0 ? tradeInfo.uplPriceType : null, (268435447 & 8192) != 0 ? tradeInfo.reversePosEnable : null, (268435447 & 16384) != 0 ? tradeInfo.placeLayoutConfig : null, (268435447 & 32768) != 0 ? tradeInfo.reversePosConfirm : null, (268435447 & 65536) != 0 ? tradeInfo.tabCustomConfig : null, (268435447 & 131072) != 0 ? tradeInfo.stableCoin : null, (268435447 & 262144) != 0 ? tradeInfo.supportedStableCoin : null, (268435447 & 524288) != 0 ? tradeInfo.hostingShow : null, (268435447 & 1048576) != 0 ? tradeInfo.hostingStatus : null, (268435447 & 2097152) != 0 ? tradeInfo.curPosHostingShow : null, (268435447 & 4194304) != 0 ? tradeInfo.spotAverageConfig : null, (268435447 & 8388608) != 0 ? tradeInfo.scaleOrderNum : null, (268435447 & 16777216) != 0 ? tradeInfo.enableUseNewPotential : false, (268435447 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tradeInfo.chasePriceConfirm : null, (268435447 & 67108864) != 0 ? tradeInfo.simpleBorrowAgreementConfirm : null, (268435447 & 134217728) != 0 ? tradeInfo.realizedPnlSwitch : null);
        } else {
            tradeInfoCopy = null;
        }
        this.EZpvd = tradeInfoCopy;
    }

    @Override // o.xOX
    public KLineConfigType DTwDnp() {
        TradeInfo tradeInfo = this.EZpvd;
        java.lang.String manualKLineConfig = tradeInfo != null ? tradeInfo.getManualKLineConfig() : null;
        KLineConfigType kLineConfigType = KLineConfigType.CLOSE;
        if (Intrinsics.EZpvd((java.lang.Object) manualKLineConfig, (java.lang.Object) kLineConfigType.getValue())) {
            return kLineConfigType;
        }
        KLineConfigType kLineConfigType2 = KLineConfigType.TOP;
        if (Intrinsics.EZpvd((java.lang.Object) manualKLineConfig, (java.lang.Object) kLineConfigType2.getValue())) {
            return kLineConfigType2;
        }
        KLineConfigType kLineConfigType3 = KLineConfigType.BOTTOM;
        return Intrinsics.EZpvd((java.lang.Object) manualKLineConfig, (java.lang.Object) kLineConfigType3.getValue()) ? kLineConfigType3 : kLineConfigType2;
    }

    @Override // o.xOX
    public void KWHzl(@NotNull KLineConfigType kLineConfigType) {
        java.lang.String value;
        TradeInfo tradeInfoCopy;
        Intrinsics.checkNotNullParameter(kLineConfigType, "");
        int i = StateListAnimator.EZpvd[kLineConfigType.ordinal()];
        if (i == 1) {
            value = KLineConfigType.CLOSE.getValue();
        } else if (i == 2) {
            value = KLineConfigType.TOP.getValue();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            value = KLineConfigType.BOTTOM.getValue();
        }
        java.lang.String str = value;
        TradeInfo tradeInfo = this.EZpvd;
        if (tradeInfo != null) {
            tradeInfoCopy = tradeInfo.copy((268435447 & 1) != 0 ? tradeInfo.invertTradeUnit : null, (268435447 & 2) != 0 ? tradeInfo.inverseFuturesUnit : null, (268435447 & 4) != 0 ? tradeInfo.linearTradeUnit : null, (268435447 & 8) != 0 ? tradeInfo.confirm : null, (268435447 & 16) != 0 ? tradeInfo.depthCountConfirm : null, (268435447 & 32) != 0 ? tradeInfo.kLineWithPriceConfig : null, (268435447 & 64) != 0 ? tradeInfo.ccy : null, (268435447 & 128) != 0 ? tradeInfo.greekUnit : null, (268435447 & 256) != 0 ? tradeInfo.kLineConfig : null, (268435447 & 512) != 0 ? tradeInfo.manualKLineConfig : str, (268435447 & 1024) != 0 ? tradeInfo.mktCloseConfirm : null, (268435447 & 2048) != 0 ? tradeInfo.liqPxSwitch : null, (268435447 & 4096) != 0 ? tradeInfo.uplPriceType : null, (268435447 & 8192) != 0 ? tradeInfo.reversePosEnable : null, (268435447 & 16384) != 0 ? tradeInfo.placeLayoutConfig : null, (268435447 & 32768) != 0 ? tradeInfo.reversePosConfirm : null, (268435447 & 65536) != 0 ? tradeInfo.tabCustomConfig : null, (268435447 & 131072) != 0 ? tradeInfo.stableCoin : null, (268435447 & 262144) != 0 ? tradeInfo.supportedStableCoin : null, (268435447 & 524288) != 0 ? tradeInfo.hostingShow : null, (268435447 & 1048576) != 0 ? tradeInfo.hostingStatus : null, (268435447 & 2097152) != 0 ? tradeInfo.curPosHostingShow : null, (268435447 & 4194304) != 0 ? tradeInfo.spotAverageConfig : null, (268435447 & 8388608) != 0 ? tradeInfo.scaleOrderNum : null, (268435447 & 16777216) != 0 ? tradeInfo.enableUseNewPotential : false, (268435447 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tradeInfo.chasePriceConfirm : null, (268435447 & 67108864) != 0 ? tradeInfo.simpleBorrowAgreementConfirm : null, (268435447 & 134217728) != 0 ? tradeInfo.realizedPnlSwitch : null);
        } else {
            tradeInfoCopy = null;
        }
        this.EZpvd = tradeInfoCopy;
    }

    @Override // o.xOX
    public boolean AxsJAY() {
        TradeInfo tradeInfo = this.EZpvd;
        return C33129mqd.OLrzqt((java.lang.Object) (tradeInfo != null ? tradeInfo.getDepthCountConfirm() : null), (java.lang.Object) 1);
    }

    @Override // o.xOX
    public boolean gHZMYf() {
        UserTradeConfigInfo userTradeConfigInfo = this.AEQbTJ;
        if (userTradeConfigInfo != null) {
            return userTradeConfigInfo.getAutoLoan();
        }
        return false;
    }

    @Override // o.xOX
    public void OLrzqt(boolean z) {
        UserTradeConfigInfo userTradeConfigInfoCopy;
        UserTradeConfigInfo userTradeConfigInfo = this.AEQbTJ;
        if (userTradeConfigInfo != null) {
            userTradeConfigInfoCopy = userTradeConfigInfo.copy((2147483639 & 1) != 0 ? userTradeConfigInfo.acctLv : null, (2147483639 & 2) != 0 ? userTradeConfigInfo.maxLevel : null, (2147483639 & 4) != 0 ? userTradeConfigInfo.posMode : null, (2147483639 & 8) != 0 ? userTradeConfigInfo.autoLoan : z, (2147483639 & 16) != 0 ? userTradeConfigInfo.exist : false, (2147483639 & 32) != 0 ? userTradeConfigInfo.opQuote : false, (2147483639 & 64) != 0 ? userTradeConfigInfo.opAuth : null, (2147483639 & 128) != 0 ? userTradeConfigInfo.vipLoan : false, (2147483639 & 256) != 0 ? userTradeConfigInfo.ctIsoMode : null, (2147483639 & 512) != 0 ? userTradeConfigInfo.mgnIsoMode : null, (2147483639 & 1024) != 0 ? userTradeConfigInfo.roleType : 0, (2147483639 & 2048) != 0 ? userTradeConfigInfo.traderInsts : null, (2147483639 & 4096) != 0 ? userTradeConfigInfo.liquidationGear : null, (2147483639 & 8192) != 0 ? userTradeConfigInfo.firstTradeTime : null, (2147483639 & 16384) != 0 ? userTradeConfigInfo.orderNotice : null, (2147483639 & 32768) != 0 ? userTradeConfigInfo.limitOrderNotice : null, (2147483639 & 65536) != 0 ? userTradeConfigInfo.reduceOnlyNotice : null, (2147483639 & 131072) != 0 ? userTradeConfigInfo.marketOrderNotice : null, (2147483639 & 262144) != 0 ? userTradeConfigInfo.spotFeeCoinType : null, (2147483639 & 524288) != 0 ? userTradeConfigInfo.spotRoleType : 0, (2147483639 & 1048576) != 0 ? userTradeConfigInfo.spotTraderInsts : null, (2147483639 & 2097152) != 0 ? userTradeConfigInfo.acctStpMode : null, (2147483639 & 4194304) != 0 ? userTradeConfigInfo.enableSpotBorrow : false, (2147483639 & 8388608) != 0 ? userTradeConfigInfo.enableTradeBorrowModeAutoRepay : false, (2147483639 & 16777216) != 0 ? userTradeConfigInfo.usdLinearSettleCcy : null, (2147483639 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? userTradeConfigInfo.usdLinearSettleCcyList : null, (2147483639 & 67108864) != 0 ? userTradeConfigInfo.stgyType : null, (2147483639 & 134217728) != 0 ? userTradeConfigInfo.bonusCcy : null, (2147483639 & 268435456) != 0 ? userTradeConfigInfo.bonus : null, (2147483639 & 536870912) != 0 ? userTradeConfigInfo.rateType : null, (2147483639 & 1073741824) != 0 ? userTradeConfigInfo.equityPerpDisclosure : null);
        } else {
            userTradeConfigInfoCopy = null;
        }
        this.AEQbTJ = userTradeConfigInfoCopy;
    }

    @Override // o.xOX
    public java.lang.String QOLQEE() {
        UserTradeConfigInfo userTradeConfigInfo = this.AEQbTJ;
        java.lang.String ctIsoMode = userTradeConfigInfo != null ? userTradeConfigInfo.getCtIsoMode() : null;
        return ctIsoMode == null ? "" : ctIsoMode;
    }

    @Override // o.xOX
    public java.lang.String RJOkX() {
        UserTradeConfigInfo userTradeConfigInfo = this.AEQbTJ;
        java.lang.String mgnIsoMode = userTradeConfigInfo != null ? userTradeConfigInfo.getMgnIsoMode() : null;
        return mgnIsoMode == null ? "" : mgnIsoMode;
    }

    @Override // o.xOX
    public java.lang.String wlaJM() {
        java.lang.String acctLv;
        UserTradeConfigInfo userTradeConfigInfo = this.AEQbTJ;
        return (userTradeConfigInfo == null || (acctLv = userTradeConfigInfo.getAcctLv()) == null) ? "1" : acctLv;
    }

    @Override // o.xOX
    public java.lang.String iwGUEr() {
        java.lang.String linearTradeUnit;
        TradeInfo tradeInfo = this.EZpvd;
        return (tradeInfo == null || (linearTradeUnit = tradeInfo.getLinearTradeUnit()) == null) ? "0" : linearTradeUnit;
    }

    @Override // o.xOX
    public java.lang.String OLrzqt() {
        java.lang.String inverseFuturesUnit;
        TradeInfo tradeInfo = this.EZpvd;
        return (tradeInfo == null || (inverseFuturesUnit = tradeInfo.getInverseFuturesUnit()) == null) ? "0" : inverseFuturesUnit;
    }

    @Override // o.xOX
    public java.lang.String getFieldNames() {
        java.lang.String invertTradeUnit;
        TradeInfo tradeInfo = this.EZpvd;
        return (tradeInfo == null || (invertTradeUnit = tradeInfo.getInvertTradeUnit()) == null) ? "0" : invertTradeUnit;
    }

    @Override // o.xOX
    public java.lang.String AuCTelauCTel() {
        java.lang.String posMode;
        UserTradeConfigInfo userTradeConfigInfo = this.AEQbTJ;
        return (userTradeConfigInfo == null || (posMode = userTradeConfigInfo.getPosMode()) == null) ? "long_short_mode" : posMode;
    }

    @Override // o.xOX
    public java.lang.String zsXlph() {
        TradeInfo tradeInfo = this.EZpvd;
        java.lang.String stableCoin = tradeInfo != null ? tradeInfo.getStableCoin() : null;
        if (stableCoin == null) {
            stableCoin = "";
        }
        pUU.KWHzl(fJNWhG(), "fetchStableCoinMode: " + stableCoin);
        return stableCoin;
    }

    @Override // o.xOX
    public java.lang.String zLjUOn() {
        java.lang.Object next;
        TradeInfo tradeInfo = this.EZpvd;
        java.lang.String displayName = null;
        java.lang.String stableCoin = tradeInfo != null ? tradeInfo.getStableCoin() : null;
        TradeInfo tradeInfo2 = this.EZpvd;
        java.util.List<StableCoin> supportedStableCoin = tradeInfo2 != null ? tradeInfo2.getSupportedStableCoin() : null;
        pUU.KWHzl(fJNWhG(), "stableCoin: " + stableCoin);
        if (supportedStableCoin != null) {
            java.util.Iterator<T> it = supportedStableCoin.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((StableCoin) next).getCoinSymbol(), (java.lang.Object) stableCoin)) {
                    break;
                }
            }
            StableCoin stableCoin2 = (StableCoin) next;
            if (stableCoin2 != null) {
                displayName = stableCoin2.getDisplayName();
            }
        }
        pUU.KWHzl(fJNWhG(), "displayStableName found in supportedStableCoin: " + displayName);
        if (displayName != null) {
            return displayName;
        }
        if (stableCoin == null) {
            stableCoin = "";
        }
        pUU.KWHzl(fJNWhG(), "displayStableName not found, returning stableCoin: " + stableCoin);
        return stableCoin;
    }

    @Override // o.xOX
    public java.util.List<StableCoin> QVAiDq() {
        java.util.List<StableCoin> supportedStableCoin;
        TradeInfo tradeInfo = this.EZpvd;
        return (tradeInfo == null || (supportedStableCoin = tradeInfo.getSupportedStableCoin()) == null) ? yDY.AhwBna() : supportedStableCoin;
    }

    public java.lang.String RcXXUw() {
        java.lang.String str;
        java.lang.String str2 = "USDC";
        if (!djSkpj().contains("USDC") && (str = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(djSkpj())) != null && str.length() != 0 && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            str2 = str;
        }
        UserTradeConfigInfo userTradeConfigInfo = this.AEQbTJ;
        java.lang.String usdLinearSettleCcy = userTradeConfigInfo != null ? userTradeConfigInfo.getUsdLinearSettleCcy() : null;
        return (usdLinearSettleCcy == null || usdLinearSettleCcy.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) usdLinearSettleCcy)) ? str2 : usdLinearSettleCcy;
    }

    public java.util.List<java.lang.String> djSkpj() {
        java.util.List<java.lang.String> usdLinearSettleCcyList;
        UserTradeConfigInfo userTradeConfigInfo = this.AEQbTJ;
        return (userTradeConfigInfo == null || (usdLinearSettleCcyList = userTradeConfigInfo.getUsdLinearSettleCcyList()) == null) ? yDY.AhwBna() : usdLinearSettleCcyList;
    }

    @Override // o.xOX
    public java.lang.String AEQbTJ() {
        TradeInfo tradeInfo = this.EZpvd;
        java.lang.String greekUnit = tradeInfo != null ? tradeInfo.getGreekUnit() : null;
        return greekUnit == null ? "" : greekUnit;
    }

    @Override // o.xOX
    public int QfsBiF() {
        UserTradeConfigInfo userTradeConfigInfo = this.AEQbTJ;
        if (userTradeConfigInfo != null) {
            return userTradeConfigInfo.getSpotRoleType();
        }
        return 0;
    }

    @Override // o.xOX
    public int AwvSrB() {
        java.lang.Integer curPosHostingShow;
        TradeInfo tradeInfo = this.EZpvd;
        if (tradeInfo == null || (curPosHostingShow = tradeInfo.getCurPosHostingShow()) == null) {
            return 1;
        }
        return curPosHostingShow.intValue();
    }

    @Override // o.xOX
    public int OcIXYQ() {
        java.lang.Integer hostingStatus;
        TradeInfo tradeInfo = this.EZpvd;
        if (tradeInfo == null || (hostingStatus = tradeInfo.getHostingStatus()) == null) {
            return 0;
        }
        return hostingStatus.intValue();
    }

    @Override // o.xOX
    public int QKVWgx() {
        java.lang.Integer hostingShow;
        TradeInfo tradeInfo = this.EZpvd;
        if (tradeInfo == null || (hostingShow = tradeInfo.getHostingShow()) == null) {
            return 1;
        }
        return hostingShow.intValue();
    }

    @Override // o.xOX
    public java.lang.String sSMYrx() {
        java.lang.String spotAverageConfig;
        TradeInfo tradeInfo = this.EZpvd;
        return (tradeInfo == null || (spotAverageConfig = tradeInfo.getSpotAverageConfig()) == null) ? "0" : spotAverageConfig;
    }

    @Override // o.xOX
    public boolean copydefault() {
        UserTradeConfigInfo userTradeConfigInfo = this.AEQbTJ;
        return userTradeConfigInfo != null && userTradeConfigInfo.getEnableSpotBorrow();
    }

    @Override // o.xOX
    public boolean UeEOUB() {
        TradeInfo tradeInfo = this.EZpvd;
        return Intrinsics.EZpvd((java.lang.Object) (tradeInfo != null ? tradeInfo.getSimpleBorrowAgreementConfirm() : null), (java.lang.Object) "1");
    }

    @Override // o.xOX
    public void r_(@NotNull java.lang.String str) {
        TradeInfo tradeInfoCopy;
        Intrinsics.checkNotNullParameter(str, "");
        TradeInfo tradeInfo = this.EZpvd;
        if (tradeInfo != null) {
            tradeInfoCopy = tradeInfo.copy((268435447 & 1) != 0 ? tradeInfo.invertTradeUnit : null, (268435447 & 2) != 0 ? tradeInfo.inverseFuturesUnit : null, (268435447 & 4) != 0 ? tradeInfo.linearTradeUnit : null, (268435447 & 8) != 0 ? tradeInfo.confirm : null, (268435447 & 16) != 0 ? tradeInfo.depthCountConfirm : null, (268435447 & 32) != 0 ? tradeInfo.kLineWithPriceConfig : null, (268435447 & 64) != 0 ? tradeInfo.ccy : null, (268435447 & 128) != 0 ? tradeInfo.greekUnit : null, (268435447 & 256) != 0 ? tradeInfo.kLineConfig : null, (268435447 & 512) != 0 ? tradeInfo.manualKLineConfig : null, (268435447 & 1024) != 0 ? tradeInfo.mktCloseConfirm : null, (268435447 & 2048) != 0 ? tradeInfo.liqPxSwitch : null, (268435447 & 4096) != 0 ? tradeInfo.uplPriceType : null, (268435447 & 8192) != 0 ? tradeInfo.reversePosEnable : null, (268435447 & 16384) != 0 ? tradeInfo.placeLayoutConfig : null, (268435447 & 32768) != 0 ? tradeInfo.reversePosConfirm : null, (268435447 & 65536) != 0 ? tradeInfo.tabCustomConfig : null, (268435447 & 131072) != 0 ? tradeInfo.stableCoin : null, (268435447 & 262144) != 0 ? tradeInfo.supportedStableCoin : null, (268435447 & 524288) != 0 ? tradeInfo.hostingShow : null, (268435447 & 1048576) != 0 ? tradeInfo.hostingStatus : null, (268435447 & 2097152) != 0 ? tradeInfo.curPosHostingShow : null, (268435447 & 4194304) != 0 ? tradeInfo.spotAverageConfig : null, (268435447 & 8388608) != 0 ? tradeInfo.scaleOrderNum : null, (268435447 & 16777216) != 0 ? tradeInfo.enableUseNewPotential : false, (268435447 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tradeInfo.chasePriceConfirm : null, (268435447 & 67108864) != 0 ? tradeInfo.simpleBorrowAgreementConfirm : str, (268435447 & 134217728) != 0 ? tradeInfo.realizedPnlSwitch : null);
        } else {
            tradeInfoCopy = null;
        }
        this.EZpvd = tradeInfoCopy;
    }

    public final xKL<java.util.ArrayList<AccountTradeConfig>> zuBGHE() {
        return hDKMBd() ? this.copydefault : this.AhwBna;
    }
}
