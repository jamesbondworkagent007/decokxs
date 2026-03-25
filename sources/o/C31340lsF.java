package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.web3pay.lib.core.model.OrderStatus;
import com.okinc.business.web3pay.lib.core.model.OrderSubStatus;
import com.okinc.business.web3pay.lib.core.model.OrderType;
import com.okinc.business.web3pay.lib.core.model.ProductCode;
import com.okinc.business.web3pay.lib.core.model.ReceiverType;
import com.okinc.business.web3pay.lib.core.model.SACardOrderExtInfo;
import com.okinc.business.web3pay.lib.core.model.SaCardAuthLimit;
import com.okinc.business.web3pay.lib.core.model.UserFundStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lsF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31340lsF {
    public final SaCardAuthLimit AEQbTJ;
    public final long AYXKKw;
    public final java.lang.String AhwBna;
    public final OrderType AkhnZx;
    public final java.lang.Integer AuCTel;
    public final UserFundStatus AuCTelauCTel;
    public final ProductCode DbNXlk;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final SACardOrderExtInfo OLrzqt;
    public final C31336lsB copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String ejfBZ;
    public final java.lang.String fARcdN;
    public final java.lang.String fIwbmz;
    public final java.lang.String fJNWhG;
    public final OrderStatus fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final java.lang.String getFieldNames;
    public final java.lang.String getNewProxyInstance;
    public final java.lang.String hDKMBd;
    public final ReceiverType isConnected;
    public final java.lang.String iwGUEr;
    public final int uzCIH;
    public final java.lang.String valueOf;
    public final OrderSubStatus values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31340lsF copydefault(@NotNull java.lang.String str, OrderType orderType, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, java.lang.String str10, OrderStatus orderStatus, long j, ReceiverType receiverType, OrderSubStatus orderSubStatus, @NotNull java.lang.String str11, ProductCode productCode, java.lang.String str12, C31336lsB c31336lsB, SaCardAuthLimit saCardAuthLimit, SACardOrderExtInfo sACardOrderExtInfo, java.lang.String str13, java.lang.Integer num, java.lang.String str14, UserFundStatus userFundStatus) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new C31340lsF(str, orderType, str2, i, str3, str4, str5, str6, str7, str8, str9, str10, orderStatus, j, receiverType, orderSubStatus, str11, productCode, str12, c31336lsB, saCardAuthLimit, sACardOrderExtInfo, str13, num, str14, userFundStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31340lsF)) {
            return false;
        }
        C31340lsF c31340lsF = (C31340lsF) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c31340lsF.djBIcL) && this.AkhnZx == c31340lsF.AkhnZx && Intrinsics.EZpvd((java.lang.Object) this.hDKMBd, (java.lang.Object) c31340lsF.hDKMBd) && this.uzCIH == c31340lsF.uzCIH && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c31340lsF.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) c31340lsF.fJNWhG) && Intrinsics.EZpvd((java.lang.Object) this.getNewProxyInstance, (java.lang.Object) c31340lsF.getNewProxyInstance) && Intrinsics.EZpvd((java.lang.Object) this.iwGUEr, (java.lang.Object) c31340lsF.iwGUEr) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c31340lsF.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c31340lsF.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) c31340lsF.fARcdN) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c31340lsF.EZpvd) && this.fetchVPNInfo == c31340lsF.fetchVPNInfo && this.AYXKKw == c31340lsF.AYXKKw && this.isConnected == c31340lsF.isConnected && this.values == c31340lsF.values && Intrinsics.EZpvd((java.lang.Object) this.getFieldNames, (java.lang.Object) c31340lsF.getFieldNames) && this.DbNXlk == c31340lsF.DbNXlk && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c31340lsF.gEmmrt) && Intrinsics.EZpvd(this.copydefault, c31340lsF.copydefault) && this.AEQbTJ == c31340lsF.AEQbTJ && Intrinsics.EZpvd(this.OLrzqt, c31340lsF.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.ejfBZ, (java.lang.Object) c31340lsF.ejfBZ) && Intrinsics.EZpvd(this.AuCTel, c31340lsF.AuCTel) && Intrinsics.EZpvd((java.lang.Object) this.fIwbmz, (java.lang.Object) c31340lsF.fIwbmz) && this.AuCTelauCTel == c31340lsF.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode;
        int i;
        int iHashCode2 = this.djBIcL.hashCode();
        OrderType orderType = this.AkhnZx;
        int iHashCode3 = orderType == null ? 0 : orderType.hashCode();
        int iHashCode4 = this.hDKMBd.hashCode();
        int iHashCode5 = java.lang.Integer.hashCode(this.uzCIH);
        int iHashCode6 = this.KWHzl.hashCode();
        int iHashCode7 = this.fJNWhG.hashCode();
        int iHashCode8 = this.getNewProxyInstance.hashCode();
        java.lang.String str = this.iwGUEr;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        int iHashCode10 = this.valueOf.hashCode();
        int iHashCode11 = this.AhwBna.hashCode();
        int iHashCode12 = this.fARcdN.hashCode();
        java.lang.String str2 = this.EZpvd;
        int iHashCode13 = str2 == null ? 0 : str2.hashCode();
        OrderStatus orderStatus = this.fetchVPNInfo;
        if (orderStatus == null) {
            i = iHashCode4;
            iHashCode = 0;
        } else {
            iHashCode = orderStatus.hashCode();
            i = iHashCode4;
        }
        int iHashCode14 = java.lang.Long.hashCode(this.AYXKKw);
        ReceiverType receiverType = this.isConnected;
        int iHashCode15 = receiverType == null ? 0 : receiverType.hashCode();
        OrderSubStatus orderSubStatus = this.values;
        int iHashCode16 = orderSubStatus == null ? 0 : orderSubStatus.hashCode();
        int iHashCode17 = this.getFieldNames.hashCode();
        ProductCode productCode = this.DbNXlk;
        int iHashCode18 = productCode == null ? 0 : productCode.hashCode();
        java.lang.String str3 = this.gEmmrt;
        int iHashCode19 = str3 == null ? 0 : str3.hashCode();
        C31336lsB c31336lsB = this.copydefault;
        int iHashCode20 = c31336lsB == null ? 0 : c31336lsB.hashCode();
        SaCardAuthLimit saCardAuthLimit = this.AEQbTJ;
        int iHashCode21 = saCardAuthLimit == null ? 0 : saCardAuthLimit.hashCode();
        SACardOrderExtInfo sACardOrderExtInfo = this.OLrzqt;
        int iHashCode22 = sACardOrderExtInfo == null ? 0 : sACardOrderExtInfo.hashCode();
        java.lang.String str4 = this.ejfBZ;
        int iHashCode23 = str4 == null ? 0 : str4.hashCode();
        java.lang.Integer num = this.AuCTel;
        int iHashCode24 = num == null ? 0 : num.hashCode();
        java.lang.String str5 = this.fIwbmz;
        int iHashCode25 = str5 == null ? 0 : str5.hashCode();
        UserFundStatus userFundStatus = this.AuCTelauCTel;
        return (((((((((((((((((((((((((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + i) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + (userFundStatus == null ? 0 : userFundStatus.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TransactionOrder(orderId=" + this.djBIcL + ", orderType=" + this.AkhnZx + ", tokenSymbol=" + this.hDKMBd + ", tokenDecimal=" + this.uzCIH + ", chainIndex=" + this.KWHzl + ", tokenAddress=" + this.fJNWhG + ", tokenAmount=" + this.getNewProxyInstance + ", tokenLogo=" + this.iwGUEr + ", currencyAmount=" + this.valueOf + ", from=" + this.AhwBna + ", to=" + this.fARcdN + ", areaCode=" + this.EZpvd + ", status=" + this.fetchVPNInfo + ", createTime=" + this.AYXKKw + ", receiverType=" + this.isConnected + ", subStatus=" + this.values + ", tokenCoinTypeNo=" + this.getFieldNames + ", productCode=" + this.DbNXlk + ", merchantId=" + this.gEmmrt + ", convertInfo=" + this.copydefault + ", authorizeType=" + this.AEQbTJ + ", cardOrderExtInfo=" + this.OLrzqt + ", toTokenAmount=" + this.ejfBZ + ", toTokenDecimal=" + this.AuCTel + ", toTokenSymbol=" + this.fIwbmz + ", userFundStatus=" + this.AuCTelauCTel + ")";
    }

    public C31340lsF(@NotNull java.lang.String str, OrderType orderType, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, java.lang.String str10, OrderStatus orderStatus, long j, ReceiverType receiverType, OrderSubStatus orderSubStatus, @NotNull java.lang.String str11, ProductCode productCode, java.lang.String str12, C31336lsB c31336lsB, SaCardAuthLimit saCardAuthLimit, SACardOrderExtInfo sACardOrderExtInfo, java.lang.String str13, java.lang.Integer num, java.lang.String str14, UserFundStatus userFundStatus) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.djBIcL = str;
        this.AkhnZx = orderType;
        this.hDKMBd = str2;
        this.uzCIH = i;
        this.KWHzl = str3;
        this.fJNWhG = str4;
        this.getNewProxyInstance = str5;
        this.iwGUEr = str6;
        this.valueOf = str7;
        this.AhwBna = str8;
        this.fARcdN = str9;
        this.EZpvd = str10;
        this.fetchVPNInfo = orderStatus;
        this.AYXKKw = j;
        this.isConnected = receiverType;
        this.values = orderSubStatus;
        this.getFieldNames = str11;
        this.DbNXlk = productCode;
        this.gEmmrt = str12;
        this.copydefault = c31336lsB;
        this.AEQbTJ = saCardAuthLimit;
        this.OLrzqt = sACardOrderExtInfo;
        this.ejfBZ = str13;
        this.AuCTel = num;
        this.fIwbmz = str14;
        this.AuCTelauCTel = userFundStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006d: CONSTRUCTOR 
  (r31v0 java.lang.String)
  (r32v0 com.okinc.business.web3pay.lib.core.model.OrderType)
  (r33v0 java.lang.String)
  (r34v0 int)
  (r35v0 java.lang.String)
  (r36v0 java.lang.String)
  (r37v0 java.lang.String)
  (r38v0 java.lang.String)
  (r39v0 java.lang.String)
  (r40v0 java.lang.String)
  (r41v0 java.lang.String)
  (r42v0 java.lang.String)
  (r43v0 com.okinc.business.web3pay.lib.core.model.OrderStatus)
  (r44v0 long)
  (r46v0 com.okinc.business.web3pay.lib.core.model.ReceiverType)
  (r47v0 com.okinc.business.web3pay.lib.core.model.OrderSubStatus)
  (r48v0 java.lang.String)
  (wrap:com.okinc.business.web3pay.lib.core.model.ProductCode:?: TERNARY null = ((wrap:int:0x0002: ARITH (r58v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.lib.core.model.ProductCode) : (r49v0 com.okinc.business.web3pay.lib.core.model.ProductCode))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r58v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (r51v0 o.lsB)
  (r52v0 com.okinc.business.web3pay.lib.core.model.SaCardAuthLimit)
  (r53v0 com.okinc.business.web3pay.lib.core.model.SACardOrderExtInfo)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r58v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0024: ARITH (r58v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r55v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r58v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:com.okinc.business.web3pay.lib.core.model.UserFundStatus:?: TERNARY null = ((wrap:int:0x003a: ARITH (r58v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.lib.core.model.UserFundStatus) : (r57v0 com.okinc.business.web3pay.lib.core.model.UserFundStatus))
 A[MD:(java.lang.String, com.okinc.business.web3pay.lib.core.model.OrderType, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.web3pay.lib.core.model.OrderStatus, long, com.okinc.business.web3pay.lib.core.model.ReceiverType, com.okinc.business.web3pay.lib.core.model.OrderSubStatus, java.lang.String, com.okinc.business.web3pay.lib.core.model.ProductCode, java.lang.String, o.lsB, com.okinc.business.web3pay.lib.core.model.SaCardAuthLimit, com.okinc.business.web3pay.lib.core.model.SACardOrderExtInfo, java.lang.String, java.lang.Integer, java.lang.String, com.okinc.business.web3pay.lib.core.model.UserFundStatus):void (m)] (LINE:12) call: o.lsF.<init>(java.lang.String, com.okinc.business.web3pay.lib.core.model.OrderType, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.web3pay.lib.core.model.OrderStatus, long, com.okinc.business.web3pay.lib.core.model.ReceiverType, com.okinc.business.web3pay.lib.core.model.OrderSubStatus, java.lang.String, com.okinc.business.web3pay.lib.core.model.ProductCode, java.lang.String, o.lsB, com.okinc.business.web3pay.lib.core.model.SaCardAuthLimit, com.okinc.business.web3pay.lib.core.model.SACardOrderExtInfo, java.lang.String, java.lang.Integer, java.lang.String, com.okinc.business.web3pay.lib.core.model.UserFundStatus):void type: THIS */
    public /* synthetic */ C31340lsF(java.lang.String str, OrderType orderType, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, OrderStatus orderStatus, long j, ReceiverType receiverType, OrderSubStatus orderSubStatus, java.lang.String str11, ProductCode productCode, java.lang.String str12, C31336lsB c31336lsB, SaCardAuthLimit saCardAuthLimit, SACardOrderExtInfo sACardOrderExtInfo, java.lang.String str13, java.lang.Integer num, java.lang.String str14, UserFundStatus userFundStatus, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, orderType, str2, i, str3, str4, str5, str6, str7, str8, str9, str10, orderStatus, j, receiverType, orderSubStatus, str11, (i2 & 131072) != 0 ? null : productCode, (i2 & 262144) != 0 ? null : str12, c31336lsB, saCardAuthLimit, sACardOrderExtInfo, (i2 & 4194304) != 0 ? null : str13, (i2 & 8388608) != 0 ? null : num, (i2 & 16777216) != 0 ? null : str14, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : userFundStatus);
    }
}
