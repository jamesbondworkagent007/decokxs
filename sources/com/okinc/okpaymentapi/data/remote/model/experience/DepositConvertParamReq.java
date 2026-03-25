package com.okinc.okpaymentapi.data.remote.model.experience;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class DepositConvertParamReq implements Parcelable {
    private String convertBaseAmount;
    private String convertBaseCurrency;
    private String convertPrice;
    private String slippageTolerance;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DepositConvertParamReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DepositConvertParamReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositConvertParamReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DepositConvertParamReq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositConvertParamReq[] newArray(int i) {
            return new DepositConvertParamReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DepositConvertParamReq() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DepositConvertParamReq copy$default(DepositConvertParamReq depositConvertParamReq, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = depositConvertParamReq.slippageTolerance;
        }
        if ((i & 2) != 0) {
            str2 = depositConvertParamReq.convertPrice;
        }
        if ((i & 4) != 0) {
            str3 = depositConvertParamReq.convertBaseCurrency;
        }
        if ((i & 8) != 0) {
            str4 = depositConvertParamReq.convertBaseAmount;
        }
        return depositConvertParamReq.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.slippageTolerance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.convertPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.convertBaseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.convertBaseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DepositConvertParamReq copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new DepositConvertParamReq(str, str2, str3, str4);
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
        if (!(obj instanceof DepositConvertParamReq)) {
            return false;
        }
        DepositConvertParamReq depositConvertParamReq = (DepositConvertParamReq) obj;
        return Intrinsics.EZpvd((Object) this.slippageTolerance, (Object) depositConvertParamReq.slippageTolerance) && Intrinsics.EZpvd((Object) this.convertPrice, (Object) depositConvertParamReq.convertPrice) && Intrinsics.EZpvd((Object) this.convertBaseCurrency, (Object) depositConvertParamReq.convertBaseCurrency) && Intrinsics.EZpvd((Object) this.convertBaseAmount, (Object) depositConvertParamReq.convertBaseAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConvertBaseAmount() {
        return this.convertBaseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConvertBaseCurrency() {
        return this.convertBaseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConvertPrice() {
        return this.convertPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippageTolerance() {
        return this.slippageTolerance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.slippageTolerance.hashCode() * 31) + this.convertPrice.hashCode()) * 31) + this.convertBaseCurrency.hashCode()) * 31) + this.convertBaseAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertBaseAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.convertBaseAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertBaseCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.convertBaseCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.convertPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippageTolerance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slippageTolerance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DepositConvertParamReq(slippageTolerance=" + this.slippageTolerance + ", convertPrice=" + this.convertPrice + ", convertBaseCurrency=" + this.convertBaseCurrency + ", convertBaseAmount=" + this.convertBaseAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.slippageTolerance);
        parcel.writeString(this.convertPrice);
        parcel.writeString(this.convertBaseCurrency);
        parcel.writeString(this.convertBaseAmount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.DepositConvertParamReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DepositConvertParamReq> serializer() {
            return DepositConvertParamReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DepositConvertParamReq(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.slippageTolerance = "";
        } else {
            this.slippageTolerance = str;
        }
        if ((i & 2) == 0) {
            this.convertPrice = "";
        } else {
            this.convertPrice = str2;
        }
        if ((i & 4) == 0) {
            this.convertBaseCurrency = "";
        } else {
            this.convertBaseCurrency = str3;
        }
        if ((i & 8) == 0) {
            this.convertBaseAmount = "";
        } else {
            this.convertBaseAmount = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(DepositConvertParamReq depositConvertParamReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) depositConvertParamReq.slippageTolerance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, depositConvertParamReq.slippageTolerance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) depositConvertParamReq.convertPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, depositConvertParamReq.convertPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) depositConvertParamReq.convertBaseCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, depositConvertParamReq.convertBaseCurrency);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) depositConvertParamReq.convertBaseAmount, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, depositConvertParamReq.convertBaseAmount);
    }

    public DepositConvertParamReq(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.slippageTolerance = str;
        this.convertPrice = str2;
        this.convertBaseCurrency = str3;
        this.convertBaseAmount = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:106) call: com.okinc.okpaymentapi.data.remote.model.experience.DepositConvertParamReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DepositConvertParamReq(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
