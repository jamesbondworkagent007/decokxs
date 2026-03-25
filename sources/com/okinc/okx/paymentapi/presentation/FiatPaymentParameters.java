package com.okinc.okx.paymentapi.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class FiatPaymentParameters implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FiatPaymentParameters> CREATOR = new Creator();
    private final String cryptoAmount;
    private final String cryptoCurrency;
    private final String fiatAmount;
    private final String fiatCurrency;
    private final FiatTradeType fiatTradeType;

    public static final class Creator implements Parcelable.Creator<FiatPaymentParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatPaymentParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FiatPaymentParameters(FiatTradeType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatPaymentParameters[] newArray(int i) {
            return new FiatPaymentParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FiatPaymentParameters() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FiatPaymentParameters copy$default(FiatPaymentParameters fiatPaymentParameters, FiatTradeType fiatTradeType, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            fiatTradeType = fiatPaymentParameters.fiatTradeType;
        }
        if ((i & 2) != 0) {
            str = fiatPaymentParameters.fiatCurrency;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = fiatPaymentParameters.cryptoCurrency;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = fiatPaymentParameters.fiatAmount;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = fiatPaymentParameters.cryptoAmount;
        }
        return fiatPaymentParameters.copy(fiatTradeType, str5, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FiatTradeType component1() {
        return this.fiatTradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fiatCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.cryptoCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fiatAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.cryptoAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FiatPaymentParameters copy(@NotNull FiatTradeType fiatTradeType, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(fiatTradeType, "");
        return new FiatPaymentParameters(fiatTradeType, str, str2, str3, str4);
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
        if (!(obj instanceof FiatPaymentParameters)) {
            return false;
        }
        FiatPaymentParameters fiatPaymentParameters = (FiatPaymentParameters) obj;
        return this.fiatTradeType == fiatPaymentParameters.fiatTradeType && Intrinsics.EZpvd((Object) this.fiatCurrency, (Object) fiatPaymentParameters.fiatCurrency) && Intrinsics.EZpvd((Object) this.cryptoCurrency, (Object) fiatPaymentParameters.cryptoCurrency) && Intrinsics.EZpvd((Object) this.fiatAmount, (Object) fiatPaymentParameters.fiatAmount) && Intrinsics.EZpvd((Object) this.cryptoAmount, (Object) fiatPaymentParameters.cryptoAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCryptoAmount() {
        return this.cryptoAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCryptoCurrency() {
        return this.cryptoCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFiatAmount() {
        return this.fiatAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FiatTradeType getFiatTradeType() {
        return this.fiatTradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.fiatTradeType.hashCode();
        String str = this.fiatCurrency;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.cryptoCurrency;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.fiatAmount;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.cryptoAmount;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FiatPaymentParameters(fiatTradeType=" + this.fiatTradeType + ", fiatCurrency=" + this.fiatCurrency + ", cryptoCurrency=" + this.cryptoCurrency + ", fiatAmount=" + this.fiatAmount + ", cryptoAmount=" + this.cryptoAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.fiatTradeType.writeToParcel(parcel, i);
        parcel.writeString(this.fiatCurrency);
        parcel.writeString(this.cryptoCurrency);
        parcel.writeString(this.fiatAmount);
        parcel.writeString(this.cryptoAmount);
    }

    public FiatPaymentParameters(@NotNull FiatTradeType fiatTradeType, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(fiatTradeType, "");
        this.fiatTradeType = fiatTradeType;
        this.fiatCurrency = str;
        this.cryptoCurrency = str2;
        this.fiatAmount = str3;
        this.cryptoAmount = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:com.okinc.okx.paymentapi.presentation.FiatTradeType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.okx.paymentapi.presentation.FiatTradeType:0x0004: SGET  A[WRAPPED] (LINE:43) com.okinc.okx.paymentapi.presentation.FiatTradeType.BUY com.okinc.okx.paymentapi.presentation.FiatTradeType) : (r4v0 com.okinc.okx.paymentapi.presentation.FiatTradeType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (null java.lang.String))
 A[MD:(com.okinc.okx.paymentapi.presentation.FiatTradeType, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:42) call: com.okinc.okx.paymentapi.presentation.FiatPaymentParameters.<init>(com.okinc.okx.paymentapi.presentation.FiatTradeType, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FiatPaymentParameters(FiatTradeType fiatTradeType, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FiatTradeType.BUY : fiatTradeType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) == 0 ? str4 : null);
    }
}
