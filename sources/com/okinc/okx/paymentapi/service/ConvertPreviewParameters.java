package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class ConvertPreviewParameters implements Parcelable {
    public static final Parcelable.Creator<ConvertPreviewParameters> CREATOR = new Creator();
    public String AEQbTJ;
    public String AYXKKw;
    public boolean AhwBna;
    public String AkhnZx;
    public String DbNXlk;
    public String EZpvd;
    public boolean KWHzl;
    public String OLrzqt;
    public String copydefault;
    public String djBIcL;
    public String gEmmrt;
    public String valueOf;
    public String values;

    public static final class Creator implements Parcelable.Creator<ConvertPreviewParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConvertPreviewParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ConvertPreviewParameters(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConvertPreviewParameters[] newArray(int i) {
            return new ConvertPreviewParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertPreviewParameters KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, boolean z, boolean z2, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new ConvertPreviewParameters(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, z, z2, str11);
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
        if (!(obj instanceof ConvertPreviewParameters)) {
            return false;
        }
        ConvertPreviewParameters convertPreviewParameters = (ConvertPreviewParameters) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) convertPreviewParameters.AEQbTJ) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) convertPreviewParameters.gEmmrt) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) convertPreviewParameters.djBIcL) && Intrinsics.EZpvd((Object) this.valueOf, (Object) convertPreviewParameters.valueOf) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) convertPreviewParameters.AYXKKw) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) convertPreviewParameters.DbNXlk) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) convertPreviewParameters.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) convertPreviewParameters.EZpvd) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) convertPreviewParameters.AkhnZx) && Intrinsics.EZpvd((Object) this.copydefault, (Object) convertPreviewParameters.copydefault) && this.KWHzl == convertPreviewParameters.KWHzl && this.AhwBna == convertPreviewParameters.AhwBna && Intrinsics.EZpvd((Object) this.values, (Object) convertPreviewParameters.values);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((this.AEQbTJ.hashCode() * 31) + this.gEmmrt.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.DbNXlk.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + Boolean.hashCode(this.KWHzl)) * 31) + Boolean.hashCode(this.AhwBna)) * 31) + this.values.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConvertPreviewParameters(fromCurrency=" + this.AEQbTJ + ", fromCurrencyIcon=" + this.gEmmrt + ", toCurrency=" + this.djBIcL + ", toCurrencyIcon=" + this.valueOf + ", fromCurrencyId=" + this.AYXKKw + ", toCurrencyId=" + this.DbNXlk + ", convertFromAmount=" + this.OLrzqt + ", convertFromFiatAmount=" + this.EZpvd + ", transferAmounts=" + this.AkhnZx + ", convertSources=" + this.copydefault + ", fromCurrencyFiat=" + this.KWHzl + ", toCurrencyFiat=" + this.AhwBna + ", toTokenEarnRate=" + this.values + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AkhnZx);
        parcel.writeString(this.copydefault);
        parcel.writeInt(this.KWHzl ? 1 : 0);
        parcel.writeInt(this.AhwBna ? 1 : 0);
        parcel.writeString(this.values);
    }

    public ConvertPreviewParameters(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, boolean z, boolean z2, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.AEQbTJ = str;
        this.gEmmrt = str2;
        this.djBIcL = str3;
        this.valueOf = str4;
        this.AYXKKw = str5;
        this.DbNXlk = str6;
        this.OLrzqt = str7;
        this.EZpvd = str8;
        this.AkhnZx = str9;
        this.copydefault = str10;
        this.KWHzl = z;
        this.AhwBna = z2;
        this.values = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (r18v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (r20v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r31v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r31v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (r28v0 boolean)
  (r29v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r31v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String):void (m)] (LINE:950) call: com.okinc.okx.paymentapi.service.ConvertPreviewParameters.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ ConvertPreviewParameters(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, str3, (i & 8) != 0 ? "" : str4, str5, str6, str7, str8, str9, (i & 512) != 0 ? "" : str10, z, z2, (i & 4096) != 0 ? "" : str11);
    }
}
