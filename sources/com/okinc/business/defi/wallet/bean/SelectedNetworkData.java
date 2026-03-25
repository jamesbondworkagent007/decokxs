package com.okinc.business.defi.wallet.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class SelectedNetworkData implements Parcelable {
    public static final Parcelable.Creator<SelectedNetworkData> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public final long AYXKKw;
    public final int AhwBna;
    public final String AkhnZx;
    public final String AuCTel;
    public final String DbNXlk;
    public final String EZpvd;
    public final String KWHzl;
    public final int OLrzqt;
    public final long copydefault;
    public final boolean djBIcL;
    public final String fetchVPNInfo;
    public final boolean gEmmrt;
    public boolean isConnected;
    public final boolean valueOf;
    public final boolean values;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<SelectedNetworkData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectedNetworkData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SelectedNetworkData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectedNetworkData[] newArray(int i) {
            return new SelectedNetworkData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelectedNetworkData copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, long j2, boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, boolean z5, boolean z6, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new SelectedNetworkData(str, str2, str3, str4, j, j2, z, z2, z3, i, z4, i2, z5, z6, str5, str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedNetworkData)) {
            return false;
        }
        SelectedNetworkData selectedNetworkData = (SelectedNetworkData) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) selectedNetworkData.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) selectedNetworkData.EZpvd) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) selectedNetworkData.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) selectedNetworkData.DbNXlk) && this.copydefault == selectedNetworkData.copydefault && this.AYXKKw == selectedNetworkData.AYXKKw && this.values == selectedNetworkData.values && this.djBIcL == selectedNetworkData.djBIcL && this.isConnected == selectedNetworkData.isConnected && this.OLrzqt == selectedNetworkData.OLrzqt && this.gEmmrt == selectedNetworkData.gEmmrt && this.AhwBna == selectedNetworkData.AhwBna && this.valueOf == selectedNetworkData.valueOf && this.AEQbTJ == selectedNetworkData.AEQbTJ && Intrinsics.EZpvd((Object) this.AuCTel, (Object) selectedNetworkData.AuCTel) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) selectedNetworkData.AkhnZx);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.DbNXlk.hashCode()) * 31) + Long.hashCode(this.copydefault)) * 31) + Long.hashCode(this.AYXKKw)) * 31) + Boolean.hashCode(this.values)) * 31) + Boolean.hashCode(this.djBIcL)) * 31) + Boolean.hashCode(this.isConnected)) * 31) + Integer.hashCode(this.OLrzqt)) * 31) + Boolean.hashCode(this.gEmmrt)) * 31) + Integer.hashCode(this.AhwBna)) * 31) + Boolean.hashCode(this.valueOf)) * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + this.AuCTel.hashCode()) * 31) + this.AkhnZx.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SelectedNetworkData(coinUrl=" + this.KWHzl + ", chainName=" + this.EZpvd + ", symbol=" + this.fetchVPNInfo + ", originAsset=" + this.DbNXlk + ", chainId=" + this.copydefault + ", generalChainId=" + this.AYXKKw + ", isSupport=" + this.values + ", isAll=" + this.djBIcL + ", isSelect=" + this.isConnected + ", coinIcon=" + this.OLrzqt + ", isHotNetwork=" + this.gEmmrt + ", hotNetworkRank=" + this.AhwBna + ", isCustomNetwork=" + this.valueOf + ", createFromUser=" + this.AEQbTJ + ", walletId=" + this.AuCTel + ", rpcUrl=" + this.AkhnZx + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeString(this.DbNXlk);
        parcel.writeLong(this.copydefault);
        parcel.writeLong(this.AYXKKw);
        parcel.writeInt(this.values ? 1 : 0);
        parcel.writeInt(this.djBIcL ? 1 : 0);
        parcel.writeInt(this.isConnected ? 1 : 0);
        parcel.writeInt(this.OLrzqt);
        parcel.writeInt(this.gEmmrt ? 1 : 0);
        parcel.writeInt(this.AhwBna);
        parcel.writeInt(this.valueOf ? 1 : 0);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        parcel.writeString(this.AuCTel);
        parcel.writeString(this.AkhnZx);
    }

    public SelectedNetworkData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, long j2, boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, boolean z5, boolean z6, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.KWHzl = str;
        this.EZpvd = str2;
        this.fetchVPNInfo = str3;
        this.DbNXlk = str4;
        this.copydefault = j;
        this.AYXKKw = j2;
        this.values = z;
        this.djBIcL = z2;
        this.isConnected = z3;
        this.OLrzqt = i;
        this.gEmmrt = z4;
        this.AhwBna = i2;
        this.valueOf = z5;
        this.AEQbTJ = z6;
        this.AuCTel = str5;
        this.AkhnZx = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0076: CONSTRUCTOR 
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r42v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (Long.MIN_VALUE long) : (r28v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r42v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (Long.MIN_VALUE long) : (r30v0 long))
  (r32v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r42v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r33v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r42v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0025: ARITH (r42v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002b: SGET  A[WRAPPED] o.wXj.TaskDescription.createSocket int) : (r35v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0030: ARITH (r42v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r36v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0039: ARITH (r42v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r37v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0042: ARITH (r42v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r38v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004b: ARITH (r42v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r39v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r42v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r42v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, boolean, boolean, boolean, int, boolean, int, boolean, boolean, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.defi.wallet.bean.SelectedNetworkData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, boolean, boolean, boolean, int, boolean, int, boolean, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SelectedNetworkData(String str, String str2, String str3, String str4, long j, long j2, boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, boolean z5, boolean z6, String str5, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i3 & 16) != 0 ? Long.MIN_VALUE : j, (i3 & 32) != 0 ? Long.MIN_VALUE : j2, z, (i3 & 128) != 0 ? false : z2, (i3 & 256) != 0 ? false : z3, (i3 & 512) != 0 ? C52761wXj.TaskDescription.createSocket : i, (i3 & 1024) != 0 ? false : z4, (i3 & 2048) != 0 ? 0 : i2, (i3 & 4096) != 0 ? false : z5, (i3 & 8192) != 0 ? false : z6, (i3 & 16384) != 0 ? "" : str5, (i3 & 32768) != 0 ? "" : str6);
    }
}
