package com.okinc.tradingbot.impl.strategy.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.DrawableRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class SignalTypeData implements Parcelable {
    public static final Parcelable.Creator<SignalTypeData> CREATOR = new Creator();
    public final int AEQbTJ;
    public final String EZpvd;
    public final String OLrzqt;
    public final String copydefault;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<SignalTypeData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalTypeData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignalTypeData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalTypeData[] newArray(int i) {
            return new SignalTypeData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalTypeData() {
        this(null, null, null, 0, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignalTypeData copy$default(SignalTypeData signalTypeData, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = signalTypeData.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            str2 = signalTypeData.copydefault;
        }
        if ((i2 & 4) != 0) {
            str3 = signalTypeData.EZpvd;
        }
        if ((i2 & 8) != 0) {
            i = signalTypeData.AEQbTJ;
        }
        return signalTypeData.copydefault(str, str2, str3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.AEQbTJ;
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
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalTypeData copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @DrawableRes int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SignalTypeData(str, str2, str3, i);
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
        if (!(obj instanceof SignalTypeData)) {
            return false;
        }
        SignalTypeData signalTypeData = (SignalTypeData) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) signalTypeData.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) signalTypeData.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) signalTypeData.EZpvd) && this.AEQbTJ == signalTypeData.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + Integer.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalTypeData(subsType=" + this.OLrzqt + ", subsTitle=" + this.copydefault + ", subsDesc=" + this.EZpvd + ", subsIconRes=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.EZpvd);
        parcel.writeInt(this.AEQbTJ);
    }

    public SignalTypeData(@NotNull String str, @NotNull String str2, @NotNull String str3, @DrawableRes int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.OLrzqt = str;
        this.copydefault = str2;
        this.EZpvd = str3;
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r5v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:55) call: com.okinc.tradingbot.impl.strategy.bean.SignalTypeData.<init>(java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ SignalTypeData(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? -1 : i);
    }
}
