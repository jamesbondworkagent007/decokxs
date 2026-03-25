package o;

import com.okinc.business.web3pay.lib.core.model.ConvertExt;
import com.okinc.business.web3pay.lib.core.model.FromToType;
import com.okinc.business.web3pay.lib.core.model.GasPayType;
import com.okinc.business.web3pay.lib.core.model.OrderStatus;
import com.okinc.business.web3pay.lib.core.model.OrderType;
import com.okinc.business.web3pay.lib.core.model.ProductCode;
import com.okinc.business.web3pay.lib.core.model.SACardOrderExtInfo;
import com.okinc.business.web3pay.lib.core.model.SaCardAuthLimit;
import com.okinc.business.web3pay.lib.features.paytransaction.model.ExternalFeeInfo;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.C2BExt;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.RedPacketInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lsC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31337lsC {
    public final SaCardAuthLimit AEQbTJ;
    public final long AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.Integer AkhnZx;
    public final GasPayType AuCTel;
    public final java.lang.String AuCTelauCTel;
    public final OrderStatus AubY;
    public final FromToType AwvSrB;
    public final int AxsJAY;
    public final java.lang.String DbNXlk;
    public final C2BExt EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String ORxRYg;
    public final java.lang.String OcIXYQ;
    public final java.lang.String QKVWgx;
    public final java.lang.String QOLQEE;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String ejfBZ;
    public final java.lang.String fARcdN;
    public final java.lang.String fIwbmz;
    public final FromToType fJNWhG;
    public final ExternalFeeInfo fetchVPNInfo;
    public final SACardOrderExtInfo gEmmrt;
    public final java.lang.String gHZMYf;
    public final java.lang.String getFieldNames;
    public final java.lang.String getNewProxyInstance;
    public final java.lang.String hDKMBd;
    public final int isConnected;
    public final OrderType iwGUEr;
    public final java.lang.String sSMYrx;
    public final java.lang.String uzCIH;
    public final ConvertExt valueOf;
    public final RedPacketInfo values;
    public final java.lang.String wlaJM;
    public final ProductCode zLjUOn;
    public final long zsXlph;
    public final java.lang.String zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31337lsC EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, OrderType orderType, @NotNull java.lang.String str5, FromToType fromToType, @NotNull java.lang.String str6, java.lang.String str7, FromToType fromToType2, @NotNull java.lang.String str8, int i, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, java.lang.String str12, @NotNull java.lang.String str13, int i2, @NotNull java.lang.String str14, @NotNull java.lang.String str15, OrderStatus orderStatus, java.lang.String str16, java.lang.Integer num, java.lang.String str17, long j, long j2, GasPayType gasPayType, @NotNull java.lang.String str18, @NotNull java.lang.String str19, java.lang.String str20, java.lang.String str21, RedPacketInfo redPacketInfo, ConvertExt convertExt, C2BExt c2BExt, java.lang.String str22, ProductCode productCode, SaCardAuthLimit saCardAuthLimit, SACardOrderExtInfo sACardOrderExtInfo, ExternalFeeInfo externalFeeInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        return new C31337lsC(str, str2, str3, str4, orderType, str5, fromToType, str6, str7, fromToType2, str8, i, str9, str10, str11, str12, str13, i2, str14, str15, orderStatus, str16, num, str17, j, j2, gasPayType, str18, str19, str20, str21, redPacketInfo, convertExt, c2BExt, str22, productCode, saCardAuthLimit, sACardOrderExtInfo, externalFeeInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31337lsC)) {
            return false;
        }
        C31337lsC c31337lsC = (C31337lsC) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.hDKMBd, (java.lang.Object) c31337lsC.hDKMBd) && Intrinsics.EZpvd((java.lang.Object) this.AuCTelauCTel, (java.lang.Object) c31337lsC.AuCTelauCTel) && Intrinsics.EZpvd((java.lang.Object) this.QOLQEE, (java.lang.Object) c31337lsC.QOLQEE) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c31337lsC.djBIcL) && this.iwGUEr == c31337lsC.iwGUEr && Intrinsics.EZpvd((java.lang.Object) this.fIwbmz, (java.lang.Object) c31337lsC.fIwbmz) && this.fJNWhG == c31337lsC.fJNWhG && Intrinsics.EZpvd((java.lang.Object) this.wlaJM, (java.lang.Object) c31337lsC.wlaJM) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c31337lsC.copydefault) && this.AwvSrB == c31337lsC.AwvSrB && Intrinsics.EZpvd((java.lang.Object) this.gHZMYf, (java.lang.Object) c31337lsC.gHZMYf) && this.AxsJAY == c31337lsC.AxsJAY && Intrinsics.EZpvd((java.lang.Object) this.QKVWgx, (java.lang.Object) c31337lsC.QKVWgx) && Intrinsics.EZpvd((java.lang.Object) this.zuBGHE, (java.lang.Object) c31337lsC.zuBGHE) && Intrinsics.EZpvd((java.lang.Object) this.OcIXYQ, (java.lang.Object) c31337lsC.OcIXYQ) && Intrinsics.EZpvd((java.lang.Object) this.sSMYrx, (java.lang.Object) c31337lsC.sSMYrx) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) c31337lsC.DbNXlk) && this.isConnected == c31337lsC.isConnected && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) c31337lsC.fARcdN) && Intrinsics.EZpvd((java.lang.Object) this.ejfBZ, (java.lang.Object) c31337lsC.ejfBZ) && this.AubY == c31337lsC.AubY && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c31337lsC.AhwBna) && Intrinsics.EZpvd(this.AkhnZx, c31337lsC.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.ORxRYg, (java.lang.Object) c31337lsC.ORxRYg) && this.AYXKKw == c31337lsC.AYXKKw && this.zsXlph == c31337lsC.zsXlph && this.AuCTel == c31337lsC.AuCTel && Intrinsics.EZpvd((java.lang.Object) this.getNewProxyInstance, (java.lang.Object) c31337lsC.getNewProxyInstance) && Intrinsics.EZpvd((java.lang.Object) this.uzCIH, (java.lang.Object) c31337lsC.uzCIH) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c31337lsC.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c31337lsC.OLrzqt) && Intrinsics.EZpvd(this.values, c31337lsC.values) && Intrinsics.EZpvd(this.valueOf, c31337lsC.valueOf) && Intrinsics.EZpvd(this.EZpvd, c31337lsC.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.getFieldNames, (java.lang.Object) c31337lsC.getFieldNames) && this.zLjUOn == c31337lsC.zLjUOn && this.AEQbTJ == c31337lsC.AEQbTJ && Intrinsics.EZpvd(this.gEmmrt, c31337lsC.gEmmrt) && Intrinsics.EZpvd(this.fetchVPNInfo, c31337lsC.fetchVPNInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode;
        int i;
        int i2;
        int iHashCode2 = this.hDKMBd.hashCode();
        int iHashCode3 = this.AuCTelauCTel.hashCode();
        int iHashCode4 = this.QOLQEE.hashCode();
        int iHashCode5 = this.djBIcL.hashCode();
        OrderType orderType = this.iwGUEr;
        int iHashCode6 = orderType == null ? 0 : orderType.hashCode();
        int iHashCode7 = this.fIwbmz.hashCode();
        FromToType fromToType = this.fJNWhG;
        int iHashCode8 = fromToType == null ? 0 : fromToType.hashCode();
        int iHashCode9 = this.wlaJM.hashCode();
        java.lang.String str = this.copydefault;
        int iHashCode10 = str == null ? 0 : str.hashCode();
        FromToType fromToType2 = this.AwvSrB;
        int iHashCode11 = fromToType2 == null ? 0 : fromToType2.hashCode();
        int iHashCode12 = this.gHZMYf.hashCode();
        int iHashCode13 = java.lang.Integer.hashCode(this.AxsJAY);
        int iHashCode14 = this.QKVWgx.hashCode();
        int iHashCode15 = this.zuBGHE.hashCode();
        int iHashCode16 = this.OcIXYQ.hashCode();
        java.lang.String str2 = this.sSMYrx;
        int iHashCode17 = str2 == null ? 0 : str2.hashCode();
        int iHashCode18 = this.DbNXlk.hashCode();
        int iHashCode19 = java.lang.Integer.hashCode(this.isConnected);
        int iHashCode20 = this.fARcdN.hashCode();
        int iHashCode21 = this.ejfBZ.hashCode();
        OrderStatus orderStatus = this.AubY;
        int iHashCode22 = orderStatus == null ? 0 : orderStatus.hashCode();
        java.lang.String str3 = this.AhwBna;
        int iHashCode23 = str3 == null ? 0 : str3.hashCode();
        java.lang.Integer num = this.AkhnZx;
        int iHashCode24 = num == null ? 0 : num.hashCode();
        java.lang.String str4 = this.ORxRYg;
        if (str4 == null) {
            i = iHashCode14;
            i2 = iHashCode15;
            iHashCode = 0;
        } else {
            iHashCode = str4.hashCode();
            i = iHashCode14;
            i2 = iHashCode15;
        }
        int iHashCode25 = java.lang.Long.hashCode(this.AYXKKw);
        int iHashCode26 = java.lang.Long.hashCode(this.zsXlph);
        GasPayType gasPayType = this.AuCTel;
        int iHashCode27 = gasPayType == null ? 0 : gasPayType.hashCode();
        int iHashCode28 = this.getNewProxyInstance.hashCode();
        int iHashCode29 = this.uzCIH.hashCode();
        java.lang.String str5 = this.KWHzl;
        int iHashCode30 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.OLrzqt;
        int iHashCode31 = str6 == null ? 0 : str6.hashCode();
        RedPacketInfo redPacketInfo = this.values;
        int iHashCode32 = redPacketInfo == null ? 0 : redPacketInfo.hashCode();
        ConvertExt convertExt = this.valueOf;
        int iHashCode33 = convertExt == null ? 0 : convertExt.hashCode();
        C2BExt c2BExt = this.EZpvd;
        int iHashCode34 = c2BExt == null ? 0 : c2BExt.hashCode();
        java.lang.String str7 = this.getFieldNames;
        int iHashCode35 = str7 == null ? 0 : str7.hashCode();
        ProductCode productCode = this.zLjUOn;
        int iHashCode36 = productCode == null ? 0 : productCode.hashCode();
        SaCardAuthLimit saCardAuthLimit = this.AEQbTJ;
        int iHashCode37 = saCardAuthLimit == null ? 0 : saCardAuthLimit.hashCode();
        SACardOrderExtInfo sACardOrderExtInfo = this.gEmmrt;
        int iHashCode38 = sACardOrderExtInfo == null ? 0 : sACardOrderExtInfo.hashCode();
        ExternalFeeInfo externalFeeInfo = this.fetchVPNInfo;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + i) * 31) + i2) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + (externalFeeInfo == null ? 0 : externalFeeInfo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OrderDetail(orderId=" + this.hDKMBd + ", parentOrderId=" + this.AuCTelauCTel + ", uopHash=" + this.QOLQEE + ", chainIndex=" + this.djBIcL + ", orderType=" + this.iwGUEr + ", from=" + this.fIwbmz + ", fromType=" + this.fJNWhG + ", to=" + this.wlaJM + ", areaCode=" + this.copydefault + ", toType=" + this.AwvSrB + ", tokenAmount=" + this.gHZMYf + ", tokenDecimal=" + this.AxsJAY + ", usdAmount=" + this.QKVWgx + ", tokenLogo=" + this.zuBGHE + ", tokenSymbol=" + this.OcIXYQ + ", tokenAddress=" + this.sSMYrx + ", feeTokenAmount=" + this.DbNXlk + ", feeTokenDecimal=" + this.isConnected + ", feeTokenSymbol=" + this.fARcdN + ", feeUsd=" + this.ejfBZ + ", status=" + this.AubY + ", errMsg=" + this.AhwBna + ", failedType=" + this.AkhnZx + ", transferComment=" + this.ORxRYg + ", createTime=" + this.AYXKKw + ", timeToCancel=" + this.zsXlph + ", gasPayType=" + this.AuCTel + ", networkName=" + this.getNewProxyInstance + ", networkLogo=" + this.uzCIH + ", activationFeeTokenAmount=" + this.KWHzl + ", activationFeeUsdAmount=" + this.OLrzqt + ", extInfo=" + this.values + ", convertExtInfo=" + this.valueOf + ", c2bExtInfo=" + this.EZpvd + ", merchantId=" + this.getFieldNames + ", productCode=" + this.zLjUOn + ", authorizeType=" + this.AEQbTJ + ", cardOrderExtInfo=" + this.gEmmrt + ", externalFeeInfo=" + this.fetchVPNInfo + ")";
    }

    public C31337lsC(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, OrderType orderType, @NotNull java.lang.String str5, FromToType fromToType, @NotNull java.lang.String str6, java.lang.String str7, FromToType fromToType2, @NotNull java.lang.String str8, int i, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, java.lang.String str12, @NotNull java.lang.String str13, int i2, @NotNull java.lang.String str14, @NotNull java.lang.String str15, OrderStatus orderStatus, java.lang.String str16, java.lang.Integer num, java.lang.String str17, long j, long j2, GasPayType gasPayType, @NotNull java.lang.String str18, @NotNull java.lang.String str19, java.lang.String str20, java.lang.String str21, RedPacketInfo redPacketInfo, ConvertExt convertExt, C2BExt c2BExt, java.lang.String str22, ProductCode productCode, SaCardAuthLimit saCardAuthLimit, SACardOrderExtInfo sACardOrderExtInfo, ExternalFeeInfo externalFeeInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        this.hDKMBd = str;
        this.AuCTelauCTel = str2;
        this.QOLQEE = str3;
        this.djBIcL = str4;
        this.iwGUEr = orderType;
        this.fIwbmz = str5;
        this.fJNWhG = fromToType;
        this.wlaJM = str6;
        this.copydefault = str7;
        this.AwvSrB = fromToType2;
        this.gHZMYf = str8;
        this.AxsJAY = i;
        this.QKVWgx = str9;
        this.zuBGHE = str10;
        this.OcIXYQ = str11;
        this.sSMYrx = str12;
        this.DbNXlk = str13;
        this.isConnected = i2;
        this.fARcdN = str14;
        this.ejfBZ = str15;
        this.AubY = orderStatus;
        this.AhwBna = str16;
        this.AkhnZx = num;
        this.ORxRYg = str17;
        this.AYXKKw = j;
        this.zsXlph = j2;
        this.AuCTel = gasPayType;
        this.getNewProxyInstance = str18;
        this.uzCIH = str19;
        this.KWHzl = str20;
        this.OLrzqt = str21;
        this.values = redPacketInfo;
        this.valueOf = convertExt;
        this.EZpvd = c2BExt;
        this.getFieldNames = str22;
        this.zLjUOn = productCode;
        this.AEQbTJ = saCardAuthLimit;
        this.gEmmrt = sACardOrderExtInfo;
        this.fetchVPNInfo = externalFeeInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a2: CONSTRUCTOR 
  (r45v0 java.lang.String)
  (r46v0 java.lang.String)
  (r47v0 java.lang.String)
  (r48v0 java.lang.String)
  (r49v0 com.okinc.business.web3pay.lib.core.model.OrderType)
  (r50v0 java.lang.String)
  (r51v0 com.okinc.business.web3pay.lib.core.model.FromToType)
  (r52v0 java.lang.String)
  (r53v0 java.lang.String)
  (r54v0 com.okinc.business.web3pay.lib.core.model.FromToType)
  (r55v0 java.lang.String)
  (r56v0 int)
  (r57v0 java.lang.String)
  (r58v0 java.lang.String)
  (r59v0 java.lang.String)
  (r60v0 java.lang.String)
  (r61v0 java.lang.String)
  (r62v0 int)
  (r63v0 java.lang.String)
  (r64v0 java.lang.String)
  (r65v0 com.okinc.business.web3pay.lib.core.model.OrderStatus)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r86v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r66v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000e: ARITH (r86v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r67v0 java.lang.Integer))
  (r68v0 java.lang.String)
  (r69v0 long)
  (r71v0 long)
  (r73v0 com.okinc.business.web3pay.lib.core.model.GasPayType)
  (r74v0 java.lang.String)
  (r75v0 java.lang.String)
  (r76v0 java.lang.String)
  (r77v0 java.lang.String)
  (wrap:com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.RedPacketInfo:?: TERNARY null = ((wrap:int:0x001e: ARITH (r86v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.RedPacketInfo) : (r78v0 com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.RedPacketInfo))
  (wrap:com.okinc.business.web3pay.lib.core.model.ConvertExt:?: TERNARY null = ((wrap:int:0x0027: ARITH (r87v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.lib.core.model.ConvertExt) : (r79v0 com.okinc.business.web3pay.lib.core.model.ConvertExt))
  (wrap:com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.C2BExt:?: TERNARY null = ((wrap:int:0x0030: ARITH (r87v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.C2BExt) : (r80v0 com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.C2BExt))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r87v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r81v0 java.lang.String))
  (wrap:com.okinc.business.web3pay.lib.core.model.ProductCode:?: TERNARY null = ((wrap:int:0x0042: ARITH (r87v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.lib.core.model.ProductCode) : (r82v0 com.okinc.business.web3pay.lib.core.model.ProductCode))
  (wrap:com.okinc.business.web3pay.lib.core.model.SaCardAuthLimit:?: TERNARY null = ((wrap:int:0x004b: ARITH (r87v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.lib.core.model.SaCardAuthLimit) : (r83v0 com.okinc.business.web3pay.lib.core.model.SaCardAuthLimit))
  (wrap:com.okinc.business.web3pay.lib.core.model.SACardOrderExtInfo:?: TERNARY null = ((wrap:int:0x0054: ARITH (r87v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.lib.core.model.SACardOrderExtInfo) : (r84v0 com.okinc.business.web3pay.lib.core.model.SACardOrderExtInfo))
  (wrap:com.okinc.business.web3pay.lib.features.paytransaction.model.ExternalFeeInfo:?: TERNARY null = ((wrap:int:0x005d: ARITH (r87v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.lib.features.paytransaction.model.ExternalFeeInfo) : (r85v0 com.okinc.business.web3pay.lib.features.paytransaction.model.ExternalFeeInfo))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.web3pay.lib.core.model.OrderType, java.lang.String, com.okinc.business.web3pay.lib.core.model.FromToType, java.lang.String, java.lang.String, com.okinc.business.web3pay.lib.core.model.FromToType, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, com.okinc.business.web3pay.lib.core.model.OrderStatus, java.lang.String, java.lang.Integer, java.lang.String, long, long, com.okinc.business.web3pay.lib.core.model.GasPayType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.RedPacketInfo, com.okinc.business.web3pay.lib.core.model.ConvertExt, com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.C2BExt, java.lang.String, com.okinc.business.web3pay.lib.core.model.ProductCode, com.okinc.business.web3pay.lib.core.model.SaCardAuthLimit, com.okinc.business.web3pay.lib.core.model.SACardOrderExtInfo, com.okinc.business.web3pay.lib.features.paytransaction.model.ExternalFeeInfo):void (m)] (LINE:15) call: o.lsC.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.web3pay.lib.core.model.OrderType, java.lang.String, com.okinc.business.web3pay.lib.core.model.FromToType, java.lang.String, java.lang.String, com.okinc.business.web3pay.lib.core.model.FromToType, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, com.okinc.business.web3pay.lib.core.model.OrderStatus, java.lang.String, java.lang.Integer, java.lang.String, long, long, com.okinc.business.web3pay.lib.core.model.GasPayType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.RedPacketInfo, com.okinc.business.web3pay.lib.core.model.ConvertExt, com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.C2BExt, java.lang.String, com.okinc.business.web3pay.lib.core.model.ProductCode, com.okinc.business.web3pay.lib.core.model.SaCardAuthLimit, com.okinc.business.web3pay.lib.core.model.SACardOrderExtInfo, com.okinc.business.web3pay.lib.features.paytransaction.model.ExternalFeeInfo):void type: THIS */
    public /* synthetic */ C31337lsC(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, OrderType orderType, java.lang.String str5, FromToType fromToType, java.lang.String str6, java.lang.String str7, FromToType fromToType2, java.lang.String str8, int i, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, int i2, java.lang.String str14, java.lang.String str15, OrderStatus orderStatus, java.lang.String str16, java.lang.Integer num, java.lang.String str17, long j, long j2, GasPayType gasPayType, java.lang.String str18, java.lang.String str19, java.lang.String str20, java.lang.String str21, RedPacketInfo redPacketInfo, ConvertExt convertExt, C2BExt c2BExt, java.lang.String str22, ProductCode productCode, SaCardAuthLimit saCardAuthLimit, SACardOrderExtInfo sACardOrderExtInfo, ExternalFeeInfo externalFeeInfo, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, orderType, str5, fromToType, str6, str7, fromToType2, str8, i, str9, str10, str11, str12, str13, i2, str14, str15, orderStatus, (i3 & 2097152) != 0 ? null : str16, (i3 & 4194304) != 0 ? 0 : num, str17, j, j2, gasPayType, str18, str19, str20, str21, (i3 & Integer.MIN_VALUE) != 0 ? null : redPacketInfo, (i4 & 1) != 0 ? null : convertExt, (i4 & 2) != 0 ? null : c2BExt, (i4 & 4) != 0 ? null : str22, (i4 & 8) != 0 ? null : productCode, (i4 & 16) != 0 ? null : saCardAuthLimit, (i4 & 32) != 0 ? null : sACardOrderExtInfo, (i4 & 64) != 0 ? null : externalFeeInfo);
    }
}
