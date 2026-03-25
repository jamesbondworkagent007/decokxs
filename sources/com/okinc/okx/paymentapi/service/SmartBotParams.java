package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class SmartBotParams implements Parcelable {
    public static final Parcelable.Creator<SmartBotParams> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final TradeType djBIcL;
    public final String gEmmrt;

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<SmartBotParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartBotParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SmartBotParams(parcel.readString(), parcel.readString(), parcel.readString(), TradeType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartBotParams[] newArray(int i) {
            return new SmartBotParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartBotParams KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull TradeType tradeType, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new SmartBotParams(str, str2, str3, tradeType, str4, str5, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.EZpvd;
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartBotParams)) {
            return false;
        }
        SmartBotParams smartBotParams = (SmartBotParams) obj;
        return Intrinsics.EZpvd((Object) this.AYXKKw, (Object) smartBotParams.AYXKKw) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) smartBotParams.gEmmrt) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) smartBotParams.OLrzqt) && this.djBIcL == smartBotParams.djBIcL && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) smartBotParams.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) smartBotParams.EZpvd) && Intrinsics.EZpvd((Object) this.copydefault, (Object) smartBotParams.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) smartBotParams.KWHzl) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) smartBotParams.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeType gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.AYXKKw.hashCode() * 31) + this.gEmmrt.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AhwBna.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartBotParams(fromPage=" + this.AYXKKw + ", orderId=" + this.gEmmrt + ", amount=" + this.OLrzqt + ", tradeType=" + this.djBIcL + ", currency=" + this.AEQbTJ + ", depositPlatformCode=" + this.EZpvd + ", errorCode=" + this.copydefault + ", flow=" + this.KWHzl + ", status=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.OLrzqt);
        this.djBIcL.writeToParcel(parcel, i);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AhwBna);
    }

    public SmartBotParams(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull TradeType tradeType, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.AYXKKw = str;
        this.gEmmrt = str2;
        this.OLrzqt = str3;
        this.djBIcL = tradeType;
        this.AEQbTJ = str4;
        this.EZpvd = str5;
        this.copydefault = str6;
        this.KWHzl = str7;
        this.AhwBna = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.TradeType:?: TERNARY null = ((wrap:int:0x001a: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0020: SGET  A[WRAPPED] (LINE:780) com.okinc.okpaymentapi.data.remote.model.management.TradeType.BUY com.okinc.okpaymentapi.data.remote.model.management.TradeType) : (r17v0 com.okinc.okpaymentapi.data.remote.model.management.TradeType))
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.TradeType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:776) call: com.okinc.okx.paymentapi.service.SmartBotParams.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.TradeType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SmartBotParams(String str, String str2, String str3, TradeType tradeType, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? TradeType.BUY : tradeType, str4, str5, str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8);
    }
}
