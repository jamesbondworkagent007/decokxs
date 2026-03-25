package com.okinc.business.market.features.address_tracker_sa.ui.tracker.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class TrendTraderUIModel implements kMU, Parcelable {
    public static final Parcelable.Creator<TrendTraderUIModel> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final long AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final int djBIcL;
    public final int gEmmrt;
    public final String isConnected;
    public final String valueOf;
    public final String values;

    public static final class Creator implements Parcelable.Creator<TrendTraderUIModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrendTraderUIModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TrendTraderUIModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrendTraderUIModel[] newArray(int i) {
            return new TrendTraderUIModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrendTraderUIModel() {
        this(null, null, null, 0, 0L, null, null, null, null, 0, null, null, 4095, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrendTraderUIModel AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, long j, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i2, @NotNull String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new TrendTraderUIModel(str, str2, str3, i, j, str4, str5, str6, str7, i2, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.OLrzqt;
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
    public final int djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendTraderUIModel)) {
            return false;
        }
        TrendTraderUIModel trendTraderUIModel = (TrendTraderUIModel) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) trendTraderUIModel.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) trendTraderUIModel.EZpvd) && Intrinsics.EZpvd((Object) this.copydefault, (Object) trendTraderUIModel.copydefault) && this.djBIcL == trendTraderUIModel.djBIcL && this.AhwBna == trendTraderUIModel.AhwBna && Intrinsics.EZpvd((Object) this.values, (Object) trendTraderUIModel.values) && Intrinsics.EZpvd((Object) this.isConnected, (Object) trendTraderUIModel.isConnected) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) trendTraderUIModel.AYXKKw) && Intrinsics.EZpvd((Object) this.valueOf, (Object) trendTraderUIModel.valueOf) && this.gEmmrt == trendTraderUIModel.gEmmrt && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) trendTraderUIModel.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) trendTraderUIModel.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        int iHashCode4 = Integer.hashCode(this.djBIcL);
        int iHashCode5 = Long.hashCode(this.AhwBna);
        int iHashCode6 = this.values.hashCode();
        int iHashCode7 = this.isConnected.hashCode();
        int iHashCode8 = this.AYXKKw.hashCode();
        int iHashCode9 = this.valueOf.hashCode();
        int iHashCode10 = Integer.hashCode(this.gEmmrt);
        int iHashCode11 = this.OLrzqt.hashCode();
        String str = this.KWHzl;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrendTraderUIModel(address=" + this.AEQbTJ + ", displayName=" + this.EZpvd + ", avatarUrl=" + this.copydefault + ", lastTradeType=" + this.djBIcL + ", lastTradeTime=" + this.AhwBna + ", positionAmount=" + this.values + ", positionAmountWithoutSymbol=" + this.isConnected + ", pnlAmount=" + this.AYXKKw + ", pnlAmountWithoutSymbol=" + this.valueOf + ", pnlDirection=" + this.gEmmrt + ", emoji=" + this.OLrzqt + ", addressDisplayColorHex=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.copydefault);
        parcel.writeInt(this.djBIcL);
        parcel.writeLong(this.AhwBna);
        parcel.writeString(this.values);
        parcel.writeString(this.isConnected);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.valueOf);
        parcel.writeInt(this.gEmmrt);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.KWHzl);
    }

    @Override // o.kMU
    public Object getChangePayload(@NotNull kMU kmu) {
        return kMU.TaskDescription.EZpvd(this, kmu);
    }

    public TrendTraderUIModel(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, long j, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i2, @NotNull String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.AEQbTJ = str;
        this.EZpvd = str2;
        this.copydefault = str3;
        this.djBIcL = i;
        this.AhwBna = j;
        this.values = str4;
        this.isConnected = str5;
        this.AYXKKw = str6;
        this.valueOf = str7;
        this.gEmmrt = i2;
        this.OLrzqt = str8;
        this.KWHzl = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001b: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r18v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0024: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r19v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004d: ARITH (r28v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r25v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r26v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String):void (m)] (LINE:64) call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrendTraderUIModel.<init>(java.lang.String, java.lang.String, java.lang.String, int, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TrendTraderUIModel(String str, String str2, String str3, int i, long j, String str4, String str5, String str6, String str7, int i2, String str8, String str9, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0L : j, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? "" : str5, (i3 & 128) != 0 ? "" : str6, (i3 & 256) != 0 ? "" : str7, (i3 & 512) == 0 ? i2 : 0, (i3 & 1024) == 0 ? str8 : "", (i3 & 2048) != 0 ? null : str9);
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        Intrinsics.checkNotNullParameter(kmu, "");
        if (kmu instanceof TrendTraderUIModel) {
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) ((TrendTraderUIModel) kmu).AEQbTJ);
        }
        return false;
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        Intrinsics.checkNotNullParameter(kmu, "");
        if (kmu instanceof TrendTraderUIModel) {
            return Intrinsics.EZpvd(this, kmu);
        }
        return false;
    }
}
