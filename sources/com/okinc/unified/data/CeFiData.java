package com.okinc.unified.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.kline.api.bean.MarketCoinInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class CeFiData implements Parcelable {
    public final String AEQbTJ;
    public final String AYXKKw;
    public final boolean AhwBna;
    public final String AkhnZx;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final MarketCoinInfo djBIcL;
    public final boolean gEmmrt;
    public final String isConnected;
    public final String valueOf;
    public static final int EZpvd = MarketCoinInfo.$stable;
    public static final Parcelable.Creator<CeFiData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CeFiData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CeFiData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CeFiData((MarketCoinInfo) parcel.readParcelable(CeFiData.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CeFiData[] newArray(int i) {
            return new CeFiData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeFiData copydefault(MarketCoinInfo marketCoinInfo, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6, String str7, String str8) {
        return new CeFiData(marketCoinInfo, str, str2, str3, str4, str5, z, z2, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.AEQbTJ;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CeFiData)) {
            return false;
        }
        CeFiData ceFiData = (CeFiData) obj;
        return Intrinsics.EZpvd(this.djBIcL, ceFiData.djBIcL) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) ceFiData.KWHzl) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) ceFiData.AYXKKw) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ceFiData.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) ceFiData.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) ceFiData.copydefault) && this.AhwBna == ceFiData.AhwBna && this.gEmmrt == ceFiData.gEmmrt && Intrinsics.EZpvd((Object) this.isConnected, (Object) ceFiData.isConnected) && Intrinsics.EZpvd((Object) this.valueOf, (Object) ceFiData.valueOf) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) ceFiData.AkhnZx);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketCoinInfo gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        MarketCoinInfo marketCoinInfo = this.djBIcL;
        int iHashCode = marketCoinInfo == null ? 0 : marketCoinInfo.hashCode();
        String str = this.KWHzl;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.AYXKKw;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.OLrzqt;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.AEQbTJ;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.copydefault;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        int iHashCode7 = Boolean.hashCode(this.AhwBna);
        int iHashCode8 = Boolean.hashCode(this.gEmmrt);
        String str6 = this.isConnected;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.valueOf;
        int iHashCode10 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.AkhnZx;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CeFiData(marketCoinInfo=" + this.djBIcL + ", instId=" + this.KWHzl + ", instType=" + this.AYXKKw + ", fromPageId=" + this.OLrzqt + ", fromScene=" + this.AEQbTJ + ", firstTab=" + this.copydefault + ", isAllKline=" + this.AhwBna + ", isShowPriceAlert=" + this.gEmmrt + ", refreshWidget=" + this.isConnected + ", isCedefiOnline=" + this.valueOf + ", tag=" + this.AkhnZx + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.djBIcL, i);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.copydefault);
        parcel.writeInt(this.AhwBna ? 1 : 0);
        parcel.writeInt(this.gEmmrt ? 1 : 0);
        parcel.writeString(this.isConnected);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.AkhnZx);
    }

    public CeFiData(MarketCoinInfo marketCoinInfo, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6, String str7, String str8) {
        this.djBIcL = marketCoinInfo;
        this.KWHzl = str;
        this.AYXKKw = str2;
        this.OLrzqt = str3;
        this.AEQbTJ = str4;
        this.copydefault = str5;
        this.AhwBna = z;
        this.gEmmrt = z2;
        this.isConnected = str6;
        this.valueOf = str7;
        this.AkhnZx = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0064: CONSTRUCTOR 
  (r11v0 com.okinc.kline.api.bean.MarketCoinInfo)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r17v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r22v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("0") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
 A[MD:(com.okinc.kline.api.bean.MarketCoinInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.unified.data.CeFiData.<init>(com.okinc.kline.api.bean.MarketCoinInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CeFiData(MarketCoinInfo marketCoinInfo, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(marketCoinInfo, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? true : z, (i & 128) != 0 ? false : z2, (i & 256) == 0 ? str6 : null, (i & 512) != 0 ? "0" : str7, (i & 1024) != 0 ? "" : str8);
    }
}
