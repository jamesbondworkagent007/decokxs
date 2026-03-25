package o;

import com.okinc.business.web3pay.lib.core.model.ConvertFailedType;
import com.okinc.business.web3pay.lib.core.model.ConvertStage;
import com.okinc.business.web3pay.lib.core.model.OrderStatus;
import com.okinc.business.web3pay.lib.core.model.OrderSubStatus;
import com.okinc.business.web3pay.lib.core.model.OrderType;
import com.okinc.business.web3pay.lib.core.model.ProductCode;
import com.okinc.business.web3pay.lib.core.model.ReceiverType;
import com.okinc.business.web3pay.lib.core.model.SACardOrderExtInfo;
import com.okinc.business.web3pay.lib.core.model.SaCardAuthLimit;
import com.okinc.business.web3pay.lib.core.network.ws.TxStatusSubResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lsE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31339lsE {
    public final java.lang.Integer AEQbTJ;
    public final java.lang.Long AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String AkhnZx;
    public final ProductCode AuCTel;
    public final java.lang.String AuCTelauCTel;
    public final java.lang.String AubY;
    public final TxStatusSubResponse.MsgType DbNXlk;
    public final SACardOrderExtInfo EZpvd;
    public final java.lang.String KWHzl;
    public final SaCardAuthLimit OLrzqt;
    public final java.lang.String copydefault;
    public final java.util.List<ConvertStage> djBIcL;
    public final ReceiverType ejfBZ;
    public final OrderStatus fARcdN;
    public final java.lang.String fIwbmz;
    public final OrderSubStatus fJNWhG;
    public final OrderType fetchVPNInfo;
    public final ConvertFailedType gEmmrt;
    public final java.lang.String gHZMYf;
    public final java.lang.String getFieldNames;
    public final java.lang.String getNewProxyInstance;
    public final long hDKMBd;
    public final java.lang.String isConnected;
    public final java.lang.String iwGUEr;
    public final java.lang.String uzCIH;
    public final C31336lsB valueOf;
    public final java.lang.String values;
    public final java.lang.Integer wlaJM;
    public final java.lang.String zLjUOn;
    public final java.lang.String zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31339lsE EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, OrderStatus orderStatus, java.lang.Integer num, @NotNull java.lang.String str3, @NotNull java.lang.String str4, long j, OrderType orderType, ProductCode productCode, java.lang.String str5, java.util.List<ConvertStage> list, ConvertFailedType convertFailedType, java.lang.String str6, @NotNull TxStatusSubResponse.MsgType msgType, java.lang.String str7, java.lang.Integer num2, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.Long l, ReceiverType receiverType, java.lang.String str15, OrderSubStatus orderSubStatus, java.lang.String str16, C31336lsB c31336lsB, SaCardAuthLimit saCardAuthLimit, SACardOrderExtInfo sACardOrderExtInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(msgType, "");
        return new C31339lsE(str, str2, orderStatus, num, str3, str4, j, orderType, productCode, str5, list, convertFailedType, str6, msgType, str7, num2, str8, str9, str10, str11, str12, str13, str14, l, receiverType, str15, orderSubStatus, str16, c31336lsB, saCardAuthLimit, sACardOrderExtInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31339lsE)) {
            return false;
        }
        C31339lsE c31339lsE = (C31339lsE) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) c31339lsE.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.fIwbmz, (java.lang.Object) c31339lsE.fIwbmz) && this.fARcdN == c31339lsE.fARcdN && Intrinsics.EZpvd(this.AEQbTJ, c31339lsE.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.gHZMYf, (java.lang.Object) c31339lsE.gHZMYf) && Intrinsics.EZpvd((java.lang.Object) this.AuCTelauCTel, (java.lang.Object) c31339lsE.AuCTelauCTel) && this.hDKMBd == c31339lsE.hDKMBd && this.fetchVPNInfo == c31339lsE.fetchVPNInfo && this.AuCTel == c31339lsE.AuCTel && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) c31339lsE.values) && Intrinsics.EZpvd(this.djBIcL, c31339lsE.djBIcL) && this.gEmmrt == c31339lsE.gEmmrt && Intrinsics.EZpvd((java.lang.Object) this.uzCIH, (java.lang.Object) c31339lsE.uzCIH) && this.DbNXlk == c31339lsE.DbNXlk && Intrinsics.EZpvd((java.lang.Object) this.AubY, (java.lang.Object) c31339lsE.AubY) && Intrinsics.EZpvd(this.wlaJM, c31339lsE.wlaJM) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c31339lsE.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.getFieldNames, (java.lang.Object) c31339lsE.getFieldNames) && Intrinsics.EZpvd((java.lang.Object) this.getNewProxyInstance, (java.lang.Object) c31339lsE.getNewProxyInstance) && Intrinsics.EZpvd((java.lang.Object) this.zsXlph, (java.lang.Object) c31339lsE.zsXlph) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c31339lsE.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c31339lsE.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.iwGUEr, (java.lang.Object) c31339lsE.iwGUEr) && Intrinsics.EZpvd(this.AYXKKw, c31339lsE.AYXKKw) && this.ejfBZ == c31339lsE.ejfBZ && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c31339lsE.copydefault) && this.fJNWhG == c31339lsE.fJNWhG && Intrinsics.EZpvd((java.lang.Object) this.zLjUOn, (java.lang.Object) c31339lsE.zLjUOn) && Intrinsics.EZpvd(this.valueOf, c31339lsE.valueOf) && this.OLrzqt == c31339lsE.OLrzqt && Intrinsics.EZpvd(this.EZpvd, c31339lsE.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.isConnected.hashCode();
        int iHashCode2 = this.fIwbmz.hashCode();
        OrderStatus orderStatus = this.fARcdN;
        int iHashCode3 = orderStatus == null ? 0 : orderStatus.hashCode();
        java.lang.Integer num = this.AEQbTJ;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        int iHashCode5 = this.gHZMYf.hashCode();
        int iHashCode6 = this.AuCTelauCTel.hashCode();
        int iHashCode7 = java.lang.Long.hashCode(this.hDKMBd);
        OrderType orderType = this.fetchVPNInfo;
        int iHashCode8 = orderType == null ? 0 : orderType.hashCode();
        ProductCode productCode = this.AuCTel;
        int iHashCode9 = productCode == null ? 0 : productCode.hashCode();
        java.lang.String str = this.values;
        int iHashCode10 = str == null ? 0 : str.hashCode();
        java.util.List<ConvertStage> list = this.djBIcL;
        int iHashCode11 = list == null ? 0 : list.hashCode();
        ConvertFailedType convertFailedType = this.gEmmrt;
        int iHashCode12 = convertFailedType == null ? 0 : convertFailedType.hashCode();
        java.lang.String str2 = this.uzCIH;
        int iHashCode13 = str2 == null ? 0 : str2.hashCode();
        int iHashCode14 = this.DbNXlk.hashCode();
        java.lang.String str3 = this.AubY;
        int iHashCode15 = str3 == null ? 0 : str3.hashCode();
        java.lang.Integer num2 = this.wlaJM;
        int iHashCode16 = num2 == null ? 0 : num2.hashCode();
        java.lang.String str4 = this.KWHzl;
        int iHashCode17 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.getFieldNames;
        int iHashCode18 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.getNewProxyInstance;
        int iHashCode19 = str6 == null ? 0 : str6.hashCode();
        java.lang.String str7 = this.zsXlph;
        int iHashCode20 = str7 == null ? 0 : str7.hashCode();
        java.lang.String str8 = this.AhwBna;
        int iHashCode21 = str8 == null ? 0 : str8.hashCode();
        java.lang.String str9 = this.AkhnZx;
        int iHashCode22 = str9 == null ? 0 : str9.hashCode();
        java.lang.String str10 = this.iwGUEr;
        int iHashCode23 = str10 == null ? 0 : str10.hashCode();
        java.lang.Long l = this.AYXKKw;
        int iHashCode24 = l == null ? 0 : l.hashCode();
        ReceiverType receiverType = this.ejfBZ;
        int iHashCode25 = receiverType == null ? 0 : receiverType.hashCode();
        java.lang.String str11 = this.copydefault;
        int iHashCode26 = str11 == null ? 0 : str11.hashCode();
        OrderSubStatus orderSubStatus = this.fJNWhG;
        int iHashCode27 = orderSubStatus == null ? 0 : orderSubStatus.hashCode();
        java.lang.String str12 = this.zLjUOn;
        int iHashCode28 = str12 == null ? 0 : str12.hashCode();
        C31336lsB c31336lsB = this.valueOf;
        int iHashCode29 = c31336lsB == null ? 0 : c31336lsB.hashCode();
        SaCardAuthLimit saCardAuthLimit = this.OLrzqt;
        int iHashCode30 = saCardAuthLimit == null ? 0 : saCardAuthLimit.hashCode();
        SACardOrderExtInfo sACardOrderExtInfo = this.EZpvd;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + (sACardOrderExtInfo == null ? 0 : sACardOrderExtInfo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TransactionStatus(orderId=" + this.isConnected + ", parentOrderId=" + this.fIwbmz + ", status=" + this.fARcdN + ", code=" + this.AEQbTJ + ", uopHash=" + this.gHZMYf + ", txHash=" + this.AuCTelauCTel + ", timeToCancel=" + this.hDKMBd + ", orderType=" + this.fetchVPNInfo + ", productCode=" + this.AuCTel + ", merchantId=" + this.values + ", convertStages=" + this.djBIcL + ", failedType=" + this.gEmmrt + ", toTokenAmount=" + this.uzCIH + ", msgType=" + this.DbNXlk + ", tokenSymbol=" + this.AubY + ", tokenDecimal=" + this.wlaJM + ", chainIndex=" + this.KWHzl + ", tokenAddress=" + this.getFieldNames + ", tokenAmount=" + this.getNewProxyInstance + ", tokenLogo=" + this.zsXlph + ", currencyAmount=" + this.AhwBna + ", from=" + this.AkhnZx + ", to=" + this.iwGUEr + ", createTime=" + this.AYXKKw + ", receiverType=" + this.ejfBZ + ", areaCode=" + this.copydefault + ", subStatus=" + this.fJNWhG + ", tokenCoinTypeNo=" + this.zLjUOn + ", convertInfo=" + this.valueOf + ", authorizeType=" + this.OLrzqt + ", cardOrderExtInfo=" + this.EZpvd + ")";
    }

    public C31339lsE(@NotNull java.lang.String str, @NotNull java.lang.String str2, OrderStatus orderStatus, java.lang.Integer num, @NotNull java.lang.String str3, @NotNull java.lang.String str4, long j, OrderType orderType, ProductCode productCode, java.lang.String str5, java.util.List<ConvertStage> list, ConvertFailedType convertFailedType, java.lang.String str6, @NotNull TxStatusSubResponse.MsgType msgType, java.lang.String str7, java.lang.Integer num2, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.Long l, ReceiverType receiverType, java.lang.String str15, OrderSubStatus orderSubStatus, java.lang.String str16, C31336lsB c31336lsB, SaCardAuthLimit saCardAuthLimit, SACardOrderExtInfo sACardOrderExtInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(msgType, "");
        this.isConnected = str;
        this.fIwbmz = str2;
        this.fARcdN = orderStatus;
        this.AEQbTJ = num;
        this.gHZMYf = str3;
        this.AuCTelauCTel = str4;
        this.hDKMBd = j;
        this.fetchVPNInfo = orderType;
        this.AuCTel = productCode;
        this.values = str5;
        this.djBIcL = list;
        this.gEmmrt = convertFailedType;
        this.uzCIH = str6;
        this.DbNXlk = msgType;
        this.AubY = str7;
        this.wlaJM = num2;
        this.KWHzl = str8;
        this.getFieldNames = str9;
        this.getNewProxyInstance = str10;
        this.zsXlph = str11;
        this.AhwBna = str12;
        this.AkhnZx = str13;
        this.iwGUEr = str14;
        this.AYXKKw = l;
        this.ejfBZ = receiverType;
        this.copydefault = str15;
        this.fJNWhG = orderSubStatus;
        this.zLjUOn = str16;
        this.valueOf = c31336lsB;
        this.OLrzqt = saCardAuthLimit;
        this.EZpvd = sACardOrderExtInfo;
    }
}
