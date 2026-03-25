package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ProConvertEntranceParameters implements Parcelable {
    public static final Parcelable.Creator<ProConvertEntranceParameters> CREATOR = new Creator();
    public final String AEQbTJ;
    public final int EZpvd;
    public final String KWHzl;
    public final int OLrzqt;
    public final String copydefault;
    public final int djBIcL;
    public final String gEmmrt;

    public static final class Creator implements Parcelable.Creator<ProConvertEntranceParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProConvertEntranceParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ProConvertEntranceParameters(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProConvertEntranceParameters[] newArray(int i) {
            return new ProConvertEntranceParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProConvertEntranceParameters() {
        this(0, 0, null, 0, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ProConvertEntranceParameters copy$default(ProConvertEntranceParameters proConvertEntranceParameters, int i, int i2, String str, int i3, String str2, String str3, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = proConvertEntranceParameters.EZpvd;
        }
        if ((i4 & 2) != 0) {
            i2 = proConvertEntranceParameters.djBIcL;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            str = proConvertEntranceParameters.AEQbTJ;
        }
        String str5 = str;
        if ((i4 & 8) != 0) {
            i3 = proConvertEntranceParameters.OLrzqt;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            str2 = proConvertEntranceParameters.KWHzl;
        }
        String str6 = str2;
        if ((i4 & 32) != 0) {
            str3 = proConvertEntranceParameters.copydefault;
        }
        String str7 = str3;
        if ((i4 & 64) != 0) {
            str4 = proConvertEntranceParameters.gEmmrt;
        }
        return proConvertEntranceParameters.AEQbTJ(i, i5, str5, i6, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProConvertEntranceParameters AEQbTJ(int i, int i2, @NotNull String str, int i3, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new ProConvertEntranceParameters(i, i2, str, i3, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.EZpvd;
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
        if (!(obj instanceof ProConvertEntranceParameters)) {
            return false;
        }
        ProConvertEntranceParameters proConvertEntranceParameters = (ProConvertEntranceParameters) obj;
        return this.EZpvd == proConvertEntranceParameters.EZpvd && this.djBIcL == proConvertEntranceParameters.djBIcL && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) proConvertEntranceParameters.AEQbTJ) && this.OLrzqt == proConvertEntranceParameters.OLrzqt && Intrinsics.EZpvd((Object) this.KWHzl, (Object) proConvertEntranceParameters.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) proConvertEntranceParameters.copydefault) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) proConvertEntranceParameters.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((Integer.hashCode(this.EZpvd) * 31) + Integer.hashCode(this.djBIcL)) * 31) + this.AEQbTJ.hashCode()) * 31) + Integer.hashCode(this.OLrzqt)) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.gEmmrt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProConvertEntranceParameters(fromCurrencyId=" + this.EZpvd + ", toCurrencyId=" + this.djBIcL + ", source=" + this.AEQbTJ + ", position=" + this.OLrzqt + ", action=" + this.KWHzl + ", fromCurrency=" + this.copydefault + ", toCurrency=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.EZpvd);
        parcel.writeInt(this.djBIcL);
        parcel.writeString(this.AEQbTJ);
        parcel.writeInt(this.OLrzqt);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.gEmmrt);
    }

    public ProConvertEntranceParameters(int i, int i2, @NotNull String str, int i3, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.EZpvd = i;
        this.djBIcL = i2;
        this.AEQbTJ = str;
        this.OLrzqt = i3;
        this.KWHzl = str2;
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
 A[MD:(int, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:765) call: com.okinc.okx.paymentapi.service.ProConvertEntranceParameters.<init>(int, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ProConvertEntranceParameters(int i, int i2, String str, int i3, String str2, String str3, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) == 0 ? i2 : -1, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? "" : str2, (i4 & 32) != 0 ? "" : str3, (i4 & 64) != 0 ? "" : str4);
    }
}
