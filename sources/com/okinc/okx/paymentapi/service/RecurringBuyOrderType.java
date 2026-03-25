package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.OrderType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class RecurringBuyOrderType implements Parcelable {
    public static final Parcelable.Creator<RecurringBuyOrderType> CREATOR = new Creator();
    public final String AEQbTJ;
    public int AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public String gEmmrt;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<RecurringBuyOrderType> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyOrderType createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RecurringBuyOrderType(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyOrderType[] newArray(int i) {
            return new RecurringBuyOrderType[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecurringBuyOrderType() {
        this(null, 0, null, null, null, null, null, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyOrderType copydefault(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new RecurringBuyOrderType(str, i, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof RecurringBuyOrderType)) {
            return false;
        }
        RecurringBuyOrderType recurringBuyOrderType = (RecurringBuyOrderType) obj;
        return Intrinsics.EZpvd((Object) this.gEmmrt, (Object) recurringBuyOrderType.gEmmrt) && this.AhwBna == recurringBuyOrderType.AhwBna && Intrinsics.EZpvd((Object) this.KWHzl, (Object) recurringBuyOrderType.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) recurringBuyOrderType.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) recurringBuyOrderType.EZpvd) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) recurringBuyOrderType.djBIcL) && Intrinsics.EZpvd((Object) this.copydefault, (Object) recurringBuyOrderType.copydefault) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) recurringBuyOrderType.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.gEmmrt.hashCode() * 31) + Integer.hashCode(this.AhwBna)) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringBuyOrderType(orderType=" + this.gEmmrt + ", frequencyType=" + this.AhwBna + ", frequency=" + this.KWHzl + ", frequencyTxt=" + this.OLrzqt + ", firstOrder=" + this.EZpvd + ", nextOrder=" + this.djBIcL + ", fiatSymbol=" + this.copydefault + ", fiatCurrency=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.gEmmrt);
        parcel.writeInt(this.AhwBna);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.AEQbTJ);
    }

    public RecurringBuyOrderType(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.gEmmrt = str;
        this.AhwBna = i;
        this.KWHzl = str2;
        this.OLrzqt = str3;
        this.EZpvd = str4;
        this.djBIcL = str5;
        this.copydefault = str6;
        this.AEQbTJ = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0050: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: INVOKE 
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.OrderType:0x0006: SGET  A[WRAPPED] (LINE:897) com.okinc.okpaymentapi.data.remote.model.management.OrderType.ONE_TIME com.okinc.okpaymentapi.data.remote.model.management.OrderType)
 VIRTUAL call: com.okinc.okpaymentapi.data.remote.model.management.OrderType.getTxt():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:897)) : (r10v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000e: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("Today") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("-") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:896) call: com.okinc.okx.paymentapi.service.RecurringBuyOrderType.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RecurringBuyOrderType(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? OrderType.ONE_TIME.getTxt() : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "Today" : str4, (i2 & 32) != 0 ? "-" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) == 0 ? str7 : "");
    }
}
