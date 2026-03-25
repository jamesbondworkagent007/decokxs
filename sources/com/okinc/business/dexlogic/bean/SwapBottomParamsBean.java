package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class SwapBottomParamsBean implements Parcelable {
    public static final Parcelable.Creator<SwapBottomParamsBean> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public final boolean AYXKKw;
    public final boolean AhwBna;
    public final String AkhnZx;
    public final String DbNXlk;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final boolean djBIcL;
    public final String fIwbmz;
    public final int fetchVPNInfo;
    public final boolean gEmmrt;
    public final String isConnected;
    public final boolean valueOf;
    public final String values;

    public static final class Creator implements Parcelable.Creator<SwapBottomParamsBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SwapBottomParamsBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SwapBottomParamsBean(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SwapBottomParamsBean[] newArray(int i) {
            return new SwapBottomParamsBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapBottomParamsBean KWHzl(boolean z, boolean z2, @NotNull String str, boolean z3, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z5, int i, boolean z6, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new SwapBottomParamsBean(z, z2, str, z3, str2, str3, str4, z4, str5, str6, str7, str8, z5, i, z6, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.copydefault;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwapBottomParamsBean)) {
            return false;
        }
        SwapBottomParamsBean swapBottomParamsBean = (SwapBottomParamsBean) obj;
        return this.AhwBna == swapBottomParamsBean.AhwBna && this.AYXKKw == swapBottomParamsBean.AYXKKw && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) swapBottomParamsBean.AkhnZx) && this.djBIcL == swapBottomParamsBean.djBIcL && Intrinsics.EZpvd((Object) this.values, (Object) swapBottomParamsBean.values) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) swapBottomParamsBean.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) swapBottomParamsBean.copydefault) && this.gEmmrt == swapBottomParamsBean.gEmmrt && Intrinsics.EZpvd((Object) this.KWHzl, (Object) swapBottomParamsBean.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) swapBottomParamsBean.EZpvd) && Intrinsics.EZpvd((Object) this.fIwbmz, (Object) swapBottomParamsBean.fIwbmz) && Intrinsics.EZpvd((Object) this.isConnected, (Object) swapBottomParamsBean.isConnected) && this.AEQbTJ == swapBottomParamsBean.AEQbTJ && this.fetchVPNInfo == swapBottomParamsBean.fetchVPNInfo && this.valueOf == swapBottomParamsBean.valueOf && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) swapBottomParamsBean.DbNXlk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.AhwBna);
        int iHashCode2 = Boolean.hashCode(this.AYXKKw);
        int iHashCode3 = this.AkhnZx.hashCode();
        int iHashCode4 = Boolean.hashCode(this.djBIcL);
        int iHashCode5 = this.values.hashCode();
        int iHashCode6 = this.OLrzqt.hashCode();
        int iHashCode7 = this.copydefault.hashCode();
        int iHashCode8 = Boolean.hashCode(this.gEmmrt);
        int iHashCode9 = this.KWHzl.hashCode();
        int iHashCode10 = this.EZpvd.hashCode();
        int iHashCode11 = this.fIwbmz.hashCode();
        int iHashCode12 = this.isConnected.hashCode();
        int iHashCode13 = Boolean.hashCode(this.AEQbTJ);
        int iHashCode14 = Integer.hashCode(this.fetchVPNInfo);
        int iHashCode15 = Boolean.hashCode(this.valueOf);
        String str = this.DbNXlk;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SwapBottomParamsBean(isFromSwap=" + this.AhwBna + ", isSimpleMode=" + this.AYXKKw + ", liquidDec=" + this.AkhnZx + ", isSupportDexSle=" + this.djBIcL + ", sourceType=" + this.values + ", chainId=" + this.OLrzqt + ", chainName=" + this.copydefault + ", isBlinkShareSupported=" + this.gEmmrt + ", fromTokenSymbol=" + this.KWHzl + ", fromTokenAddress=" + this.EZpvd + ", toTokenSymbol=" + this.fIwbmz + ", toTokenAddress=" + this.isConnected + ", isAAWallet=" + this.AEQbTJ + ", pendingOrderCount=" + this.fetchVPNInfo + ", isHideDexSle=" + this.valueOf + ", tabName=" + this.DbNXlk + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.AhwBna ? 1 : 0);
        parcel.writeInt(this.AYXKKw ? 1 : 0);
        parcel.writeString(this.AkhnZx);
        parcel.writeInt(this.djBIcL ? 1 : 0);
        parcel.writeString(this.values);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.copydefault);
        parcel.writeInt(this.gEmmrt ? 1 : 0);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.fIwbmz);
        parcel.writeString(this.isConnected);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        parcel.writeInt(this.fetchVPNInfo);
        parcel.writeInt(this.valueOf ? 1 : 0);
        parcel.writeString(this.DbNXlk);
    }

    public SwapBottomParamsBean(boolean z, boolean z2, @NotNull String str, boolean z3, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z5, int i, boolean z6, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.AhwBna = z;
        this.AYXKKw = z2;
        this.AkhnZx = str;
        this.djBIcL = z3;
        this.values = str2;
        this.OLrzqt = str3;
        this.copydefault = str4;
        this.gEmmrt = z4;
        this.KWHzl = str5;
        this.EZpvd = str6;
        this.fIwbmz = str7;
        this.isConnected = str8;
        this.AEQbTJ = z5;
        this.fetchVPNInfo = i;
        this.valueOf = z6;
        this.DbNXlk = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007e: CONSTRUCTOR 
  (r21v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r37v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("--") : (r23v0 java.lang.String))
  (r24v0 boolean)
  (r25v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r37v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r37v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0027: ARITH (r37v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r28v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r37v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r37v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r37v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r37v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004f: ARITH (r37v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r33v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0058: ARITH (r37v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r34v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0061: ARITH (r37v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r35v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006d: ARITH (r37v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
 A[MD:(boolean, boolean, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, boolean, java.lang.String):void (m)] (LINE:2525) call: com.okinc.business.dexlogic.bean.SwapBottomParamsBean.<init>(boolean, boolean, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ SwapBottomParamsBean(boolean z, boolean z2, String str, boolean z3, String str2, String str3, String str4, boolean z4, String str5, String str6, String str7, String str8, boolean z5, int i, boolean z6, String str9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? "--" : str, z3, str2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? "" : str4, (i2 & 128) != 0 ? false : z4, (i2 & 256) != 0 ? "" : str5, (i2 & 512) != 0 ? "" : str6, (i2 & 1024) != 0 ? "" : str7, (i2 & 2048) != 0 ? "" : str8, (i2 & 4096) != 0 ? false : z5, (i2 & 8192) != 0 ? 0 : i, (i2 & 16384) != 0 ? false : z6, (i2 & 32768) != 0 ? null : str9);
    }
}
