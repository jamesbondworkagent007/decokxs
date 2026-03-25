package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC47221tlu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SignalMultiCoinPairSelectItemData implements Parcelable, InterfaceC47221tlu {
    public static final Parcelable.Creator<SignalMultiCoinPairSelectItemData> CREATOR = new Creator();
    public final String AEQbTJ;
    public double AYXKKw;
    public String AhwBna;
    public final boolean EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final boolean copydefault;
    public double djBIcL;
    public final String gEmmrt;
    public final String isConnected;
    public String valueOf;

    public static final class Creator implements Parcelable.Creator<SignalMultiCoinPairSelectItemData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalMultiCoinPairSelectItemData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignalMultiCoinPairSelectItemData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readDouble());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalMultiCoinPairSelectItemData[] newArray(int i) {
            return new SignalMultiCoinPairSelectItemData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalMultiCoinPairSelectItemData EZpvd(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, boolean z2, String str6, double d, String str7, double d2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new SignalMultiCoinPairSelectItemData(str, str2, str3, str4, str5, z, z2, str6, d, str7, d2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.KWHzl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalMultiCoinPairSelectItemData)) {
            return false;
        }
        SignalMultiCoinPairSelectItemData signalMultiCoinPairSelectItemData = (SignalMultiCoinPairSelectItemData) obj;
        return Intrinsics.EZpvd((Object) this.gEmmrt, (Object) signalMultiCoinPairSelectItemData.gEmmrt) && Intrinsics.EZpvd((Object) this.isConnected, (Object) signalMultiCoinPairSelectItemData.isConnected) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) signalMultiCoinPairSelectItemData.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) signalMultiCoinPairSelectItemData.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) signalMultiCoinPairSelectItemData.OLrzqt) && this.copydefault == signalMultiCoinPairSelectItemData.copydefault && this.EZpvd == signalMultiCoinPairSelectItemData.EZpvd && Intrinsics.EZpvd((Object) this.valueOf, (Object) signalMultiCoinPairSelectItemData.valueOf) && Double.compare(this.AYXKKw, signalMultiCoinPairSelectItemData.AYXKKw) == 0 && Intrinsics.EZpvd((Object) this.AhwBna, (Object) signalMultiCoinPairSelectItemData.AhwBna) && Double.compare(this.djBIcL, signalMultiCoinPairSelectItemData.djBIcL) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public String getPrimary() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public double getPrimarySimilarity() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public String getSecondary() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public double getSecondarySimilarity() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gEmmrt.hashCode();
        String str = this.isConnected;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        int iHashCode4 = this.KWHzl.hashCode();
        int iHashCode5 = this.OLrzqt.hashCode();
        int iHashCode6 = Boolean.hashCode(this.copydefault);
        int iHashCode7 = Boolean.hashCode(this.EZpvd);
        String str2 = this.valueOf;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        int iHashCode9 = Double.hashCode(this.AYXKKw);
        String str3 = this.AhwBna;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Double.hashCode(this.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public void setPrimarySimilarity(double d) {
        this.AYXKKw = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public void setSecondarySimilarity(double d) {
        this.djBIcL = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalMultiCoinPairSelectItemData(title=" + this.gEmmrt + ", titleUrl=" + this.isConnected + ", instId=" + this.AEQbTJ + ", instType=" + this.KWHzl + ", maxLever=" + this.OLrzqt + ", isRightCheck=" + this.copydefault + ", isRightEnable=" + this.EZpvd + ", primary=" + this.valueOf + ", primarySimilarity=" + this.AYXKKw + ", secondary=" + this.AhwBna + ", secondarySimilarity=" + this.djBIcL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.isConnected);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.OLrzqt);
        parcel.writeInt(this.copydefault ? 1 : 0);
        parcel.writeInt(this.EZpvd ? 1 : 0);
        parcel.writeString(this.valueOf);
        parcel.writeDouble(this.AYXKKw);
        parcel.writeString(this.AhwBna);
        parcel.writeDouble(this.djBIcL);
    }

    public SignalMultiCoinPairSelectItemData(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, boolean z2, String str6, double d, String str7, double d2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.gEmmrt = str;
        this.isConnected = str2;
        this.AEQbTJ = str3;
        this.KWHzl = str4;
        this.OLrzqt = str5;
        this.copydefault = z;
        this.EZpvd = z2;
        this.valueOf = str6;
        this.AYXKKw = d;
        this.AhwBna = str7;
        this.djBIcL = d2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006a: CONSTRUCTOR 
  (r14v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r27v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0022: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002a: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r20v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (r14v0 java.lang.String) : (r21v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x003a: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r22v0 double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (r14v0 java.lang.String) : (r24v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x004c: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r25v0 double) : (wrap:double:0x003c: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, double, java.lang.String, double):void (m)] (LINE:719) call: com.okinc.unify_trade.bot.data.SignalMultiCoinPairSelectItemData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, double, java.lang.String, double):void type: THIS */
    public /* synthetic */ SignalMultiCoinPairSelectItemData(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6, double d, String str7, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? false : z, (i & 64) != 0 ? true : z2, (i & 128) != 0 ? str : str6, (i & 256) != 0 ? 0.0d : d, (i & 512) != 0 ? str : str7, (i & 1024) == 0 ? d2 : AudioStats.AUDIO_AMPLITUDE_NONE);
    }
}
