package com.okinc.okx.paymentapi.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.Channel$$serializer;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class PaymentMethodParameter implements Parcelable {
    private final String cryptoAmount;
    private final String cryptoCurrency;
    private final int cryptoPrecision;
    private final int currencyScale;
    private final String fiatAmount;
    private final String fiatCurrency;
    private final int inputType;
    private final boolean isFromBSC;
    private final boolean isRecurringFlow;
    private final TradeType tradeType;
    private final Channel userSelectedChannel;
    private final com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod userSelectedPaymentMethod;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PaymentMethodParameter> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, TradeType.Companion.serializer(), null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<PaymentMethodParameter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodParameter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PaymentMethodParameter(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), TradeType.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Channel.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodParameter[] newArray(int i) {
            return new PaymentMethodParameter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fiatCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.isRecurringFlow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Channel component11() {
        return this.userSelectedChannel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod component12() {
        return this.userSelectedPaymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fiatAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.cryptoCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.cryptoAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeType component5() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.inputType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.cryptoPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isFromBSC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.currencyScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentMethodParameter copy(String str, String str2, String str3, String str4, @NotNull TradeType tradeType, int i, int i2, boolean z, int i3, boolean z2, Channel channel, com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        return new PaymentMethodParameter(str, str2, str3, str4, tradeType, i, i2, z, i3, z2, channel, paymentMethod);
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
        if (!(obj instanceof PaymentMethodParameter)) {
            return false;
        }
        PaymentMethodParameter paymentMethodParameter = (PaymentMethodParameter) obj;
        return Intrinsics.EZpvd((Object) this.fiatCurrency, (Object) paymentMethodParameter.fiatCurrency) && Intrinsics.EZpvd((Object) this.fiatAmount, (Object) paymentMethodParameter.fiatAmount) && Intrinsics.EZpvd((Object) this.cryptoCurrency, (Object) paymentMethodParameter.cryptoCurrency) && Intrinsics.EZpvd((Object) this.cryptoAmount, (Object) paymentMethodParameter.cryptoAmount) && this.tradeType == paymentMethodParameter.tradeType && this.inputType == paymentMethodParameter.inputType && this.cryptoPrecision == paymentMethodParameter.cryptoPrecision && this.isFromBSC == paymentMethodParameter.isFromBSC && this.currencyScale == paymentMethodParameter.currencyScale && this.isRecurringFlow == paymentMethodParameter.isRecurringFlow && Intrinsics.EZpvd(this.userSelectedChannel, paymentMethodParameter.userSelectedChannel) && Intrinsics.EZpvd(this.userSelectedPaymentMethod, paymentMethodParameter.userSelectedPaymentMethod);
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
    public final int getCryptoPrecision() {
        return this.cryptoPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyScale() {
        return this.currencyScale;
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
    public final int getInputType() {
        return this.inputType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeType getTradeType() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Channel getUserSelectedChannel() {
        return this.userSelectedChannel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod getUserSelectedPaymentMethod() {
        return this.userSelectedPaymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.fiatCurrency;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.fiatAmount;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.cryptoCurrency;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.cryptoAmount;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        int iHashCode5 = this.tradeType.hashCode();
        int iHashCode6 = Integer.hashCode(this.inputType);
        int iHashCode7 = Integer.hashCode(this.cryptoPrecision);
        int iHashCode8 = Boolean.hashCode(this.isFromBSC);
        int iHashCode9 = Integer.hashCode(this.currencyScale);
        int iHashCode10 = Boolean.hashCode(this.isRecurringFlow);
        Channel channel = this.userSelectedChannel;
        int iHashCode11 = channel == null ? 0 : channel.hashCode();
        com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod paymentMethod = this.userSelectedPaymentMethod;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (paymentMethod != null ? paymentMethod.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFromBSC() {
        return this.isFromBSC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isRecurringFlow() {
        return this.isRecurringFlow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PaymentMethodParameter(fiatCurrency=" + this.fiatCurrency + ", fiatAmount=" + this.fiatAmount + ", cryptoCurrency=" + this.cryptoCurrency + ", cryptoAmount=" + this.cryptoAmount + ", tradeType=" + this.tradeType + ", inputType=" + this.inputType + ", cryptoPrecision=" + this.cryptoPrecision + ", isFromBSC=" + this.isFromBSC + ", currencyScale=" + this.currencyScale + ", isRecurringFlow=" + this.isRecurringFlow + ", userSelectedChannel=" + this.userSelectedChannel + ", userSelectedPaymentMethod=" + this.userSelectedPaymentMethod + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.fiatCurrency);
        parcel.writeString(this.fiatAmount);
        parcel.writeString(this.cryptoCurrency);
        parcel.writeString(this.cryptoAmount);
        this.tradeType.writeToParcel(parcel, i);
        parcel.writeInt(this.inputType);
        parcel.writeInt(this.cryptoPrecision);
        parcel.writeInt(this.isFromBSC ? 1 : 0);
        parcel.writeInt(this.currencyScale);
        parcel.writeInt(this.isRecurringFlow ? 1 : 0);
        Channel channel = this.userSelectedChannel;
        if (channel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channel.writeToParcel(parcel, i);
        }
        com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod paymentMethod = this.userSelectedPaymentMethod;
        if (paymentMethod == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentMethod.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.presentation.PaymentMethodParameter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PaymentMethodParameter> serializer() {
            return PaymentMethodParameter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PaymentMethodParameter(int i, String str, String str2, String str3, String str4, TradeType tradeType, int i2, int i3, boolean z, int i4, boolean z2, Channel channel, com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod paymentMethod, SerializationConstructorMarker serializationConstructorMarker) {
        if (64 != (i & 64)) {
            PluginExceptionsKt.throwMissingFieldException(i, 64, PaymentMethodParameter$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.fiatCurrency = "";
        } else {
            this.fiatCurrency = str;
        }
        if ((i & 2) == 0) {
            this.fiatAmount = "";
        } else {
            this.fiatAmount = str2;
        }
        if ((i & 4) == 0) {
            this.cryptoCurrency = "";
        } else {
            this.cryptoCurrency = str3;
        }
        if ((i & 8) == 0) {
            this.cryptoAmount = "";
        } else {
            this.cryptoAmount = str4;
        }
        if ((i & 16) == 0) {
            this.tradeType = TradeType.BUY;
        } else {
            this.tradeType = tradeType;
        }
        if ((i & 32) == 0) {
            this.inputType = 1;
        } else {
            this.inputType = i2;
        }
        this.cryptoPrecision = i3;
        if ((i & 128) == 0) {
            this.isFromBSC = false;
        } else {
            this.isFromBSC = z;
        }
        if ((i & 256) == 0) {
            this.currencyScale = 0;
        } else {
            this.currencyScale = i4;
        }
        if ((i & 512) == 0) {
            this.isRecurringFlow = false;
        } else {
            this.isRecurringFlow = z2;
        }
        if ((i & 1024) == 0) {
            this.userSelectedChannel = null;
        } else {
            this.userSelectedChannel = channel;
        }
        if ((i & 2048) == 0) {
            this.userSelectedPaymentMethod = null;
        } else {
            this.userSelectedPaymentMethod = paymentMethod;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(PaymentMethodParameter paymentMethodParameter, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) paymentMethodParameter.fiatCurrency, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, paymentMethodParameter.fiatCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) paymentMethodParameter.fiatAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, paymentMethodParameter.fiatAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) paymentMethodParameter.cryptoCurrency, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, paymentMethodParameter.cryptoCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) paymentMethodParameter.cryptoAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, paymentMethodParameter.cryptoAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || paymentMethodParameter.tradeType != TradeType.BUY) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], paymentMethodParameter.tradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || paymentMethodParameter.inputType != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, paymentMethodParameter.inputType);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 6, paymentMethodParameter.cryptoPrecision);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || paymentMethodParameter.isFromBSC) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, paymentMethodParameter.isFromBSC);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || paymentMethodParameter.currencyScale != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, paymentMethodParameter.currencyScale);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || paymentMethodParameter.isRecurringFlow) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, paymentMethodParameter.isRecurringFlow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || paymentMethodParameter.userSelectedChannel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, Channel$$serializer.INSTANCE, paymentMethodParameter.userSelectedChannel);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && paymentMethodParameter.userSelectedPaymentMethod == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod$$serializer.INSTANCE, paymentMethodParameter.userSelectedPaymentMethod);
    }

    public PaymentMethodParameter(String str, String str2, String str3, String str4, @NotNull TradeType tradeType, int i, int i2, boolean z, int i3, boolean z2, Channel channel, com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        this.fiatCurrency = str;
        this.fiatAmount = str2;
        this.cryptoCurrency = str3;
        this.cryptoAmount = str4;
        this.tradeType = tradeType;
        this.inputType = i;
        this.cryptoPrecision = i2;
        this.isFromBSC = z;
        this.currencyScale = i3;
        this.isRecurringFlow = z2;
        this.userSelectedChannel = channel;
        this.userSelectedPaymentMethod = paymentMethod;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0065: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r29v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r29v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.TradeType:?: TERNARY null = ((wrap:int:0x0024: ARITH (r29v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002a: SGET  A[WRAPPED] (LINE:22) com.okinc.okpaymentapi.data.remote.model.management.TradeType.BUY com.okinc.okpaymentapi.data.remote.model.management.TradeType) : (r21v0 com.okinc.okpaymentapi.data.remote.model.management.TradeType))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002e: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r22v0 int))
  (r23v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0037: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r24v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0040: ARITH (r29v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r25v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0048: ARITH (r29v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r26v0 boolean))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.Channel:?: TERNARY null = ((wrap:int:0x0050: ARITH (r29v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.Channel) : (r27v0 com.okinc.okpaymentapi.data.remote.model.management.Channel))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod:?: TERNARY null = ((wrap:int:0x0059: ARITH (r29v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod) : (r28v0 com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.TradeType, int, int, boolean, int, boolean, com.okinc.okpaymentapi.data.remote.model.management.Channel, com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod):void (m)] (LINE:17) call: com.okinc.okx.paymentapi.presentation.PaymentMethodParameter.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.TradeType, int, int, boolean, int, boolean, com.okinc.okpaymentapi.data.remote.model.management.Channel, com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod):void type: THIS */
    public /* synthetic */ PaymentMethodParameter(String str, String str2, String str3, String str4, TradeType tradeType, int i, int i2, boolean z, int i3, boolean z2, Channel channel, com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod paymentMethod, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "" : str4, (i4 & 16) != 0 ? TradeType.BUY : tradeType, (i4 & 32) != 0 ? 1 : i, i2, (i4 & 128) != 0 ? false : z, (i4 & 256) != 0 ? 0 : i3, (i4 & 512) != 0 ? false : z2, (i4 & 1024) != 0 ? null : channel, (i4 & 2048) != 0 ? null : paymentMethod);
    }
}
