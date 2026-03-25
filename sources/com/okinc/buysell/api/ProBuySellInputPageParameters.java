package com.okinc.buysell.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ProBuySellInputPageParameters implements Parcelable {
    public static final Parcelable.Creator<ProBuySellInputPageParameters> CREATOR = new Creator();
    public String AEQbTJ;
    public String AYXKKw;
    public String EZpvd;
    public String KWHzl;
    public String OLrzqt;
    public String copydefault;
    public final String djBIcL;
    public BuySellTradeType gEmmrt;

    public static final class Creator implements Parcelable.Creator<ProBuySellInputPageParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProBuySellInputPageParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ProBuySellInputPageParameters(BuySellTradeType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProBuySellInputPageParameters[] newArray(int i) {
            return new ProBuySellInputPageParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProBuySellInputPageParameters() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProBuySellInputPageParameters copydefault(@NotNull BuySellTradeType buySellTradeType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(buySellTradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new ProBuySellInputPageParameters(buySellTradeType, str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof ProBuySellInputPageParameters)) {
            return false;
        }
        ProBuySellInputPageParameters proBuySellInputPageParameters = (ProBuySellInputPageParameters) obj;
        return this.gEmmrt == proBuySellInputPageParameters.gEmmrt && Intrinsics.EZpvd((Object) this.EZpvd, (Object) proBuySellInputPageParameters.EZpvd) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) proBuySellInputPageParameters.AYXKKw) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) proBuySellInputPageParameters.AEQbTJ) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) proBuySellInputPageParameters.OLrzqt) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) proBuySellInputPageParameters.djBIcL) && Intrinsics.EZpvd((Object) this.copydefault, (Object) proBuySellInputPageParameters.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) proBuySellInputPageParameters.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.gEmmrt.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProBuySellInputPageParameters(tradeType=" + this.gEmmrt + ", quoteAmount=" + this.EZpvd + ", quoteCurrency=" + this.AYXKKw + ", baseAmount=" + this.AEQbTJ + ", baseCurrency=" + this.OLrzqt + ", topUpCurrency=" + this.djBIcL + ", minLimit=" + this.copydefault + ", maxLimit=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.gEmmrt.writeToParcel(parcel, i);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.KWHzl);
    }

    public ProBuySellInputPageParameters(@NotNull BuySellTradeType buySellTradeType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(buySellTradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.gEmmrt = buySellTradeType;
        this.EZpvd = str;
        this.AYXKKw = str2;
        this.AEQbTJ = str3;
        this.OLrzqt = str4;
        this.djBIcL = str5;
        this.copydefault = str6;
        this.KWHzl = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004a: CONSTRUCTOR 
  (wrap:com.okinc.buysell.api.BuySellTradeType:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] (LINE:188) com.okinc.buysell.api.BuySellTradeType.BUY com.okinc.buysell.api.BuySellTradeType) : (r10v0 com.okinc.buysell.api.BuySellTradeType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(com.okinc.buysell.api.BuySellTradeType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:187) call: com.okinc.buysell.api.ProBuySellInputPageParameters.<init>(com.okinc.buysell.api.BuySellTradeType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ProBuySellInputPageParameters(BuySellTradeType buySellTradeType, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuySellTradeType.BUY : buySellTradeType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) == 0 ? str7 : "");
    }
}
