package o;

import com.okinc.business.dex.tee.domain.model.NumLimitData;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.PreCheckBean;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedApproveState;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kQi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28139kQi {
    public final DexMultiTokenInfoBean AEQbTJ;
    public final NumLimitData AYXKKw;
    public final long AhwBna;
    public final AdvancedOrderType AkhnZx;
    public final DexMultiTokenInfoBean AuCTel;
    public final java.lang.Throwable DbNXlk;
    public final AbstractC30503lcQ EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final AdvancedApproveState copydefault;
    public final int djBIcL;
    public final AdvancedTradeType ejfBZ;
    public final C30808liD fARcdN;
    public final java.lang.String fIwbmz;
    public final int fetchVPNInfo;
    public final TokenPairRateQuote gEmmrt;
    public final PreCheckBean isConnected;
    public final AdvancedLimitBy valueOf;
    public final V6BaseQuoteResponse values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NumLimitData AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AkhnZx() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AuCTel() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedOrderType DbNXlk() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedApproveState EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC30503lcQ KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28139kQi copydefault(@NotNull AdvancedTradeType advancedTradeType, @NotNull AdvancedOrderType advancedOrderType, java.lang.String str, @NotNull AbstractC30503lcQ abstractC30503lcQ, NumLimitData numLimitData, @NotNull AdvancedApproveState advancedApproveState, C30808liD c30808liD, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, PreCheckBean preCheckBean, V6BaseQuoteResponse v6BaseQuoteResponse, TokenPairRateQuote tokenPairRateQuote, java.lang.Throwable th, @NotNull AdvancedLimitBy advancedLimitBy, java.lang.String str2, int i, int i2, java.lang.String str3, long j) {
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        Intrinsics.checkNotNullParameter(advancedOrderType, "");
        Intrinsics.checkNotNullParameter(abstractC30503lcQ, "");
        Intrinsics.checkNotNullParameter(advancedApproveState, "");
        Intrinsics.checkNotNullParameter(advancedLimitBy, "");
        return new C28139kQi(advancedTradeType, advancedOrderType, str, abstractC30503lcQ, numLimitData, advancedApproveState, c30808liD, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, preCheckBean, v6BaseQuoteResponse, tokenPairRateQuote, th, advancedLimitBy, str2, i, i2, str3, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenPairRateQuote djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28139kQi)) {
            return false;
        }
        C28139kQi c28139kQi = (C28139kQi) obj;
        return this.ejfBZ == c28139kQi.ejfBZ && this.AkhnZx == c28139kQi.AkhnZx && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c28139kQi.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c28139kQi.EZpvd) && Intrinsics.EZpvd(this.AYXKKw, c28139kQi.AYXKKw) && this.copydefault == c28139kQi.copydefault && Intrinsics.EZpvd(this.fARcdN, c28139kQi.fARcdN) && Intrinsics.EZpvd(this.AEQbTJ, c28139kQi.AEQbTJ) && Intrinsics.EZpvd(this.AuCTel, c28139kQi.AuCTel) && Intrinsics.EZpvd(this.isConnected, c28139kQi.isConnected) && Intrinsics.EZpvd(this.values, c28139kQi.values) && Intrinsics.EZpvd(this.gEmmrt, c28139kQi.gEmmrt) && Intrinsics.EZpvd(this.DbNXlk, c28139kQi.DbNXlk) && this.valueOf == c28139kQi.valueOf && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c28139kQi.KWHzl) && this.djBIcL == c28139kQi.djBIcL && this.fetchVPNInfo == c28139kQi.fetchVPNInfo && Intrinsics.EZpvd((java.lang.Object) this.fIwbmz, (java.lang.Object) c28139kQi.fIwbmz) && this.AhwBna == c28139kQi.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedTradeType fARcdN() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C30808liD fIwbmz() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean fJNWhG() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreCheckBean fetchVPNInfo() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedLimitBy gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.ejfBZ.hashCode();
        int iHashCode2 = this.AkhnZx.hashCode();
        java.lang.String str = this.OLrzqt;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = this.EZpvd.hashCode();
        NumLimitData numLimitData = this.AYXKKw;
        int iHashCode5 = numLimitData == null ? 0 : numLimitData.hashCode();
        int iHashCode6 = this.copydefault.hashCode();
        C30808liD c30808liD = this.fARcdN;
        int iHashCode7 = c30808liD == null ? 0 : c30808liD.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.AEQbTJ;
        int iHashCode8 = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.AuCTel;
        int iHashCode9 = dexMultiTokenInfoBean2 == null ? 0 : dexMultiTokenInfoBean2.hashCode();
        PreCheckBean preCheckBean = this.isConnected;
        int iHashCode10 = preCheckBean == null ? 0 : preCheckBean.hashCode();
        V6BaseQuoteResponse v6BaseQuoteResponse = this.values;
        int iHashCode11 = v6BaseQuoteResponse == null ? 0 : v6BaseQuoteResponse.hashCode();
        TokenPairRateQuote tokenPairRateQuote = this.gEmmrt;
        int iHashCode12 = tokenPairRateQuote == null ? 0 : tokenPairRateQuote.hashCode();
        java.lang.Throwable th = this.DbNXlk;
        int iHashCode13 = th == null ? 0 : th.hashCode();
        int iHashCode14 = this.valueOf.hashCode();
        java.lang.String str2 = this.KWHzl;
        int iHashCode15 = str2 == null ? 0 : str2.hashCode();
        int iHashCode16 = java.lang.Integer.hashCode(this.djBIcL);
        int iHashCode17 = java.lang.Integer.hashCode(this.fetchVPNInfo);
        java.lang.String str3 = this.fIwbmz;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + java.lang.Long.hashCode(this.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6BaseQuoteResponse isConnected() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AdvancedReminderParams(tradeType=" + this.ejfBZ + ", orderType=" + this.AkhnZx + ", chainId=" + this.OLrzqt + ", autoSellState=" + this.EZpvd + ", orderCountData=" + this.AYXKKw + ", approveState=" + this.copydefault + ", settingModel=" + this.fARcdN + ", fromToken=" + this.AEQbTJ + ", toToken=" + this.AuCTel + ", preCheckBean=" + this.isConnected + ", quote=" + this.values + ", limitQuote=" + this.gEmmrt + ", quoteError=" + this.DbNXlk + ", limitOrderBy=" + this.valueOf + ", circulatingSupply=" + this.KWHzl + ", liquidities=" + this.djBIcL + ", selectedLiquidities=" + this.fetchVPNInfo + ", tradeAmount=" + this.fIwbmz + ", orderExpireTimestamp=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Throwable values() {
        return this.DbNXlk;
    }

    public C28139kQi(@NotNull AdvancedTradeType advancedTradeType, @NotNull AdvancedOrderType advancedOrderType, java.lang.String str, @NotNull AbstractC30503lcQ abstractC30503lcQ, NumLimitData numLimitData, @NotNull AdvancedApproveState advancedApproveState, C30808liD c30808liD, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, PreCheckBean preCheckBean, V6BaseQuoteResponse v6BaseQuoteResponse, TokenPairRateQuote tokenPairRateQuote, java.lang.Throwable th, @NotNull AdvancedLimitBy advancedLimitBy, java.lang.String str2, int i, int i2, java.lang.String str3, long j) {
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        Intrinsics.checkNotNullParameter(advancedOrderType, "");
        Intrinsics.checkNotNullParameter(abstractC30503lcQ, "");
        Intrinsics.checkNotNullParameter(advancedApproveState, "");
        Intrinsics.checkNotNullParameter(advancedLimitBy, "");
        this.ejfBZ = advancedTradeType;
        this.AkhnZx = advancedOrderType;
        this.OLrzqt = str;
        this.EZpvd = abstractC30503lcQ;
        this.AYXKKw = numLimitData;
        this.copydefault = advancedApproveState;
        this.fARcdN = c30808liD;
        this.AEQbTJ = dexMultiTokenInfoBean;
        this.AuCTel = dexMultiTokenInfoBean2;
        this.isConnected = preCheckBean;
        this.values = v6BaseQuoteResponse;
        this.gEmmrt = tokenPairRateQuote;
        this.DbNXlk = th;
        this.valueOf = advancedLimitBy;
        this.KWHzl = str2;
        this.djBIcL = i;
        this.fetchVPNInfo = i2;
        this.fIwbmz = str3;
        this.AhwBna = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (r24v0 com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType)
  (r25v0 com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType)
  (r26v0 java.lang.String)
  (r27v0 o.lcQ)
  (r28v0 com.okinc.business.dex.tee.domain.model.NumLimitData)
  (r29v0 com.okinc.business.trade.features.home.ui.cefi.common.AdvancedApproveState)
  (r30v0 o.liD)
  (r31v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean)
  (r32v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean)
  (r33v0 com.okinc.business.dexlogic.bean.PreCheckBean)
  (r34v0 com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse)
  (r35v0 com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote)
  (r36v0 java.lang.Throwable)
  (r37v0 com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy)
  (r38v0 java.lang.String)
  (r39v0 int)
  (r40v0 int)
  (r41v0 java.lang.String)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r44v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000e: ARITH (wrap:long:0x0006: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:41)) + (604800000 long) A[WRAPPED] (LINE:41)) : (r42v0 long))
 A[MD:(com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType, com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType, java.lang.String, o.lcQ, com.okinc.business.dex.tee.domain.model.NumLimitData, com.okinc.business.trade.features.home.ui.cefi.common.AdvancedApproveState, o.liD, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.PreCheckBean, com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse, com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote, java.lang.Throwable, com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy, java.lang.String, int, int, java.lang.String, long):void (m)] (LINE:16) call: o.kQi.<init>(com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType, com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType, java.lang.String, o.lcQ, com.okinc.business.dex.tee.domain.model.NumLimitData, com.okinc.business.trade.features.home.ui.cefi.common.AdvancedApproveState, o.liD, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.PreCheckBean, com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse, com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote, java.lang.Throwable, com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy, java.lang.String, int, int, java.lang.String, long):void type: THIS */
    public /* synthetic */ C28139kQi(AdvancedTradeType advancedTradeType, AdvancedOrderType advancedOrderType, java.lang.String str, AbstractC30503lcQ abstractC30503lcQ, NumLimitData numLimitData, AdvancedApproveState advancedApproveState, C30808liD c30808liD, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, PreCheckBean preCheckBean, V6BaseQuoteResponse v6BaseQuoteResponse, TokenPairRateQuote tokenPairRateQuote, java.lang.Throwable th, AdvancedLimitBy advancedLimitBy, java.lang.String str2, int i, int i2, java.lang.String str3, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(advancedTradeType, advancedOrderType, str, abstractC30503lcQ, numLimitData, advancedApproveState, c30808liD, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, preCheckBean, v6BaseQuoteResponse, tokenPairRateQuote, th, advancedLimitBy, str2, i, i2, str3, (i3 & 262144) != 0 ? java.lang.System.currentTimeMillis() + 604800000 : j);
    }
}
