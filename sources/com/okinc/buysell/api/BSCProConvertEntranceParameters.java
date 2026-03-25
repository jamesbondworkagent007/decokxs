package com.okinc.buysell.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class BSCProConvertEntranceParameters implements Parcelable {
    public static final Parcelable.Creator<BSCProConvertEntranceParameters> CREATOR = new Creator();
    public final String AEQbTJ;
    public final int AYXKKw;
    public final int EZpvd;
    public final int KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String gEmmrt;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<BSCProConvertEntranceParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BSCProConvertEntranceParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BSCProConvertEntranceParameters(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BSCProConvertEntranceParameters[] newArray(int i) {
            return new BSCProConvertEntranceParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BSCProConvertEntranceParameters() {
        this(0, 0, null, 0, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BSCProConvertEntranceParameters copy$default(BSCProConvertEntranceParameters bSCProConvertEntranceParameters, int i, int i2, String str, int i3, String str2, String str3, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bSCProConvertEntranceParameters.KWHzl;
        }
        if ((i4 & 2) != 0) {
            i2 = bSCProConvertEntranceParameters.AYXKKw;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            str = bSCProConvertEntranceParameters.OLrzqt;
        }
        String str5 = str;
        if ((i4 & 8) != 0) {
            i3 = bSCProConvertEntranceParameters.EZpvd;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            str2 = bSCProConvertEntranceParameters.AEQbTJ;
        }
        String str6 = str2;
        if ((i4 & 32) != 0) {
            str3 = bSCProConvertEntranceParameters.copydefault;
        }
        String str7 = str3;
        if ((i4 & 64) != 0) {
            str4 = bSCProConvertEntranceParameters.gEmmrt;
        }
        return bSCProConvertEntranceParameters.OLrzqt(i, i5, str5, i6, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BSCProConvertEntranceParameters OLrzqt(int i, int i2, @NotNull String str, int i3, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new BSCProConvertEntranceParameters(i, i2, str, i3, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.OLrzqt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BSCProConvertEntranceParameters)) {
            return false;
        }
        BSCProConvertEntranceParameters bSCProConvertEntranceParameters = (BSCProConvertEntranceParameters) obj;
        return this.KWHzl == bSCProConvertEntranceParameters.KWHzl && this.AYXKKw == bSCProConvertEntranceParameters.AYXKKw && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) bSCProConvertEntranceParameters.OLrzqt) && this.EZpvd == bSCProConvertEntranceParameters.EZpvd && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) bSCProConvertEntranceParameters.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) bSCProConvertEntranceParameters.copydefault) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) bSCProConvertEntranceParameters.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((Integer.hashCode(this.KWHzl) * 31) + Integer.hashCode(this.AYXKKw)) * 31) + this.OLrzqt.hashCode()) * 31) + Integer.hashCode(this.EZpvd)) * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.gEmmrt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BSCProConvertEntranceParameters(fromCurrencyId=" + this.KWHzl + ", toCurrencyId=" + this.AYXKKw + ", source=" + this.OLrzqt + ", position=" + this.EZpvd + ", action=" + this.AEQbTJ + ", fromCurrency=" + this.copydefault + ", toCurrency=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.KWHzl);
        parcel.writeInt(this.AYXKKw);
        parcel.writeString(this.OLrzqt);
        parcel.writeInt(this.EZpvd);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.gEmmrt);
    }

    public BSCProConvertEntranceParameters(int i, int i2, @NotNull String str, int i3, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.KWHzl = i;
        this.AYXKKw = i2;
        this.OLrzqt = str;
        this.EZpvd = i3;
        this.AEQbTJ = str2;
        this.copydefault = str3;
        this.gEmmrt = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r6v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r7v0 int) : (-1 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:int:0x001c: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
 A[MD:(int, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:234) call: com.okinc.buysell.api.BSCProConvertEntranceParameters.<init>(int, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BSCProConvertEntranceParameters(int i, int i2, String str, int i3, String str2, String str3, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) == 0 ? i2 : -1, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? "" : str2, (i4 & 32) != 0 ? "" : str3, (i4 & 64) != 0 ? "" : str4);
    }
}
