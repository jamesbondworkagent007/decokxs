package o;

import com.okinc.business.web3pay.lib.core.model.OrderStatus;
import com.okinc.business.web3pay.lib.core.model.OrderSubStatus;
import com.okinc.business.web3pay.lib.core.model.OrderType;
import com.okinc.business.web3pay.lib.core.model.ProductCode;
import com.okinc.business.web3pay.lib.core.model.ReceiverType;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.ConvertInfoApiModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lsu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31381lsu implements InterfaceC31382lsv<C31340lsF> {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.String AuCTel;
    public final java.lang.String DbNXlk;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final long OLrzqt;
    public final ConvertInfoApiModel copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String fARcdN;
    public final int fIwbmz;
    public final java.lang.String fJNWhG;
    public final java.lang.Integer fetchVPNInfo;
    public final int gEmmrt;
    public final java.lang.Integer isConnected;
    public final java.lang.String valueOf;
    public final int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31381lsu copydefault(@NotNull java.lang.String str, int i, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, int i2, @NotNull java.lang.String str5, java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, java.lang.String str11, int i3, long j, java.lang.Integer num, java.lang.Integer num2, @NotNull java.lang.String str12, ConvertInfoApiModel convertInfoApiModel) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str12, "");
        return new C31381lsu(str, i, str2, str3, str4, i2, str5, str6, str7, str8, str9, str10, str11, i3, j, num, num2, str12, convertInfoApiModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31381lsu)) {
            return false;
        }
        C31381lsu c31381lsu = (C31381lsu) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c31381lsu.AhwBna) && this.gEmmrt == c31381lsu.gEmmrt && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c31381lsu.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c31381lsu.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) c31381lsu.AuCTel) && this.fIwbmz == c31381lsu.fIwbmz && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c31381lsu.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) c31381lsu.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) c31381lsu.fJNWhG) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c31381lsu.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c31381lsu.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c31381lsu.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c31381lsu.KWHzl) && this.values == c31381lsu.values && this.OLrzqt == c31381lsu.OLrzqt && Intrinsics.EZpvd(this.fetchVPNInfo, c31381lsu.fetchVPNInfo) && Intrinsics.EZpvd(this.isConnected, c31381lsu.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) c31381lsu.fARcdN) && Intrinsics.EZpvd(this.copydefault, c31381lsu.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AhwBna.hashCode();
        int iHashCode2 = java.lang.Integer.hashCode(this.gEmmrt);
        java.lang.String str = this.djBIcL;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.valueOf;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        int iHashCode5 = this.AuCTel.hashCode();
        int iHashCode6 = java.lang.Integer.hashCode(this.fIwbmz);
        int iHashCode7 = this.AEQbTJ.hashCode();
        java.lang.String str3 = this.DbNXlk;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        int iHashCode9 = this.fJNWhG.hashCode();
        int iHashCode10 = this.EZpvd.hashCode();
        int iHashCode11 = this.AYXKKw.hashCode();
        int iHashCode12 = this.AkhnZx.hashCode();
        java.lang.String str4 = this.KWHzl;
        int iHashCode13 = str4 == null ? 0 : str4.hashCode();
        int iHashCode14 = java.lang.Integer.hashCode(this.values);
        int i = iHashCode4;
        int iHashCode15 = java.lang.Long.hashCode(this.OLrzqt);
        java.lang.Integer num = this.fetchVPNInfo;
        int iHashCode16 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.isConnected;
        int iHashCode17 = num2 == null ? 0 : num2.hashCode();
        int iHashCode18 = this.fARcdN.hashCode();
        ConvertInfoApiModel convertInfoApiModel = this.copydefault;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (convertInfoApiModel == null ? 0 : convertInfoApiModel.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TransactionOrderEmbeddedEntity(orderId=" + this.AhwBna + ", orderType=" + this.gEmmrt + ", merchantId=" + this.djBIcL + ", productCode=" + this.valueOf + ", tokenSymbol=" + this.AuCTel + ", tokenDecimal=" + this.fIwbmz + ", chainIndex=" + this.AEQbTJ + ", tokenAddress=" + this.DbNXlk + ", tokenAmount=" + this.fJNWhG + ", currencyAmount=" + this.EZpvd + ", from=" + this.AYXKKw + ", to=" + this.AkhnZx + ", areaCode=" + this.KWHzl + ", status=" + this.values + ", createTime=" + this.OLrzqt + ", receiverType=" + this.fetchVPNInfo + ", subStatus=" + this.isConnected + ", tokenCoinTypeNo=" + this.fARcdN + ", convertInfo=" + this.copydefault + ")";
    }

    public C31381lsu(@NotNull java.lang.String str, int i, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, int i2, @NotNull java.lang.String str5, java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, java.lang.String str11, int i3, long j, java.lang.Integer num, java.lang.Integer num2, @NotNull java.lang.String str12, ConvertInfoApiModel convertInfoApiModel) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.AhwBna = str;
        this.gEmmrt = i;
        this.djBIcL = str2;
        this.valueOf = str3;
        this.AuCTel = str4;
        this.fIwbmz = i2;
        this.AEQbTJ = str5;
        this.DbNXlk = str6;
        this.fJNWhG = str7;
        this.EZpvd = str8;
        this.AYXKKw = str9;
        this.AkhnZx = str10;
        this.KWHzl = str11;
        this.values = i3;
        this.OLrzqt = j;
        this.fetchVPNInfo = num;
        this.isConnected = num2;
        this.fARcdN = str12;
        this.copydefault = convertInfoApiModel;
    }

    /* JADX DEBUG: Method merged with bridge method: toDomainModel()Ljava/lang/Object; */
    @Override // o.InterfaceC31382lsv
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C31340lsF toDomainModel() {
        long j;
        ReceiverType receiverTypeEZpvd;
        java.lang.String strKWHzl = KWHzl();
        OrderType orderTypeOLrzqt = OrderType.Companion.OLrzqt(this.gEmmrt);
        ProductCode productCodeAEQbTJ = ProductCode.Companion.AEQbTJ(this.valueOf);
        java.lang.String str = this.djBIcL;
        java.lang.String str2 = this.AuCTel;
        int i = this.fIwbmz;
        java.lang.String str3 = this.AEQbTJ;
        java.lang.String str4 = this.DbNXlk;
        if (str4 == null) {
            str4 = "";
        }
        java.lang.String str5 = str4;
        java.lang.String str6 = this.fJNWhG;
        java.lang.String str7 = this.EZpvd;
        java.lang.String str8 = this.AYXKKw;
        java.lang.String str9 = this.AkhnZx;
        java.lang.String str10 = this.KWHzl;
        OrderStatus orderStatusEZpvd = OrderStatus.Companion.EZpvd(this.values);
        long j2 = this.OLrzqt;
        java.lang.Integer num = this.fetchVPNInfo;
        if (num == null) {
            j = j2;
            receiverTypeEZpvd = null;
        } else {
            j = j2;
            receiverTypeEZpvd = ReceiverType.Companion.EZpvd(num);
        }
        java.lang.Integer num2 = this.isConnected;
        OrderSubStatus orderSubStatusAEQbTJ = num2 != null ? OrderSubStatus.Companion.AEQbTJ(num2.intValue()) : null;
        java.lang.String str11 = this.fARcdN;
        ConvertInfoApiModel convertInfoApiModel = this.copydefault;
        return new C31340lsF(strKWHzl, orderTypeOLrzqt, str2, i, str3, str5, str6, null, str7, str8, str9, str10, orderStatusEZpvd, j, receiverTypeEZpvd, orderSubStatusAEQbTJ, str11, productCodeAEQbTJ, str, convertInfoApiModel != null ? C31335lsA.OLrzqt(convertInfoApiModel) : null, null, null, null, null, null, null, 62914560, null);
    }
}
