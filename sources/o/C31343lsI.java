package o;

import com.okinc.business.web3pay.lib.core.model.OrderStatus;
import com.okinc.business.web3pay.lib.core.model.OrderType;
import com.okinc.business.web3pay.lib.core.model.ReceiverType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lsI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31343lsI {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.String DbNXlk;
    public final java.lang.String EZpvd;
    public final long KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final ReceiverType djBIcL;
    public final int fetchVPNInfo;
    public final OrderType gEmmrt;
    public final OrderStatus valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31343lsI EZpvd(@NotNull java.lang.String str, OrderType orderType, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, @NotNull java.lang.String str5, int i, @NotNull java.lang.String str6, ReceiverType receiverType, @NotNull java.lang.String str7, @NotNull java.lang.String str8, java.lang.String str9, OrderStatus orderStatus, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new C31343lsI(str, orderType, str2, str3, str4, str5, i, str6, receiverType, str7, str8, str9, orderStatus, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31343lsI)) {
            return false;
        }
        C31343lsI c31343lsI = (C31343lsI) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c31343lsI.AhwBna) && this.gEmmrt == c31343lsI.gEmmrt && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c31343lsI.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) c31343lsI.values) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c31343lsI.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) c31343lsI.DbNXlk) && this.fetchVPNInfo == c31343lsI.fetchVPNInfo && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c31343lsI.OLrzqt) && this.djBIcL == c31343lsI.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c31343lsI.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c31343lsI.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c31343lsI.copydefault) && this.valueOf == c31343lsI.valueOf && this.KWHzl == c31343lsI.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AhwBna.hashCode();
        OrderType orderType = this.gEmmrt;
        int iHashCode2 = orderType == null ? 0 : orderType.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        int iHashCode4 = this.values.hashCode();
        java.lang.String str = this.AkhnZx;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.DbNXlk.hashCode();
        int iHashCode7 = java.lang.Integer.hashCode(this.fetchVPNInfo);
        int iHashCode8 = this.OLrzqt.hashCode();
        ReceiverType receiverType = this.djBIcL;
        int iHashCode9 = receiverType == null ? 0 : receiverType.hashCode();
        int iHashCode10 = this.EZpvd.hashCode();
        int iHashCode11 = this.AYXKKw.hashCode();
        java.lang.String str2 = this.copydefault;
        int iHashCode12 = str2 == null ? 0 : str2.hashCode();
        OrderStatus orderStatus = this.valueOf;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (orderStatus != null ? orderStatus.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PayOrder(orderId=" + this.AhwBna + ", orderType=" + this.gEmmrt + ", chainIndex=" + this.AEQbTJ + ", tokenSymbol=" + this.values + ", tokenAddress=" + this.AkhnZx + ", tokenAmount=" + this.DbNXlk + ", tokenDecimal=" + this.fetchVPNInfo + ", currencyAmount=" + this.OLrzqt + ", receiverType=" + this.djBIcL + ", from=" + this.EZpvd + ", to=" + this.AYXKKw + ", areaCode=" + this.copydefault + ", status=" + this.valueOf + ", createTime=" + this.KWHzl + ")";
    }

    public C31343lsI(@NotNull java.lang.String str, OrderType orderType, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, @NotNull java.lang.String str5, int i, @NotNull java.lang.String str6, ReceiverType receiverType, @NotNull java.lang.String str7, @NotNull java.lang.String str8, java.lang.String str9, OrderStatus orderStatus, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.AhwBna = str;
        this.gEmmrt = orderType;
        this.AEQbTJ = str2;
        this.values = str3;
        this.AkhnZx = str4;
        this.DbNXlk = str5;
        this.fetchVPNInfo = i;
        this.OLrzqt = str6;
        this.djBIcL = receiverType;
        this.EZpvd = str7;
        this.AYXKKw = str8;
        this.copydefault = str9;
        this.valueOf = orderStatus;
        this.KWHzl = j;
    }
}
