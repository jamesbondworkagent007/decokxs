package com.okinc.wallet.core.sign.evm;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class AccountKaiaTransaction extends BaseAccountTransaction implements Parcelable {
    private Integer chainId;
    private String data;
    private String fee;
    private String from;
    private String gasLimit;
    private String gasPrice;
    private String maxFeePerGas;
    private String maxPriorityFeePerGas;
    private String nonce;
    private String to;
    private String txType;
    private String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AccountKaiaTransaction> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AccountKaiaTransaction> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountKaiaTransaction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AccountKaiaTransaction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountKaiaTransaction[] newArray(int i) {
            return new AccountKaiaTransaction[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.maxPriorityFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component11() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.maxFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountKaiaTransaction copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, String str7, @NotNull String str8, String str9, String str10, Integer num, String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new AccountKaiaTransaction(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, num, str11);
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
        if (!(obj instanceof AccountKaiaTransaction)) {
            return false;
        }
        AccountKaiaTransaction accountKaiaTransaction = (AccountKaiaTransaction) obj;
        return Intrinsics.EZpvd((Object) this.to, (Object) accountKaiaTransaction.to) && Intrinsics.EZpvd((Object) this.from, (Object) accountKaiaTransaction.from) && Intrinsics.EZpvd((Object) this.nonce, (Object) accountKaiaTransaction.nonce) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) accountKaiaTransaction.gasPrice) && Intrinsics.EZpvd((Object) this.gasLimit, (Object) accountKaiaTransaction.gasLimit) && Intrinsics.EZpvd((Object) this.value, (Object) accountKaiaTransaction.value) && Intrinsics.EZpvd((Object) this.fee, (Object) accountKaiaTransaction.fee) && Intrinsics.EZpvd((Object) this.txType, (Object) accountKaiaTransaction.txType) && Intrinsics.EZpvd((Object) this.maxFeePerGas, (Object) accountKaiaTransaction.maxFeePerGas) && Intrinsics.EZpvd((Object) this.maxPriorityFeePerGas, (Object) accountKaiaTransaction.maxPriorityFeePerGas) && Intrinsics.EZpvd(this.chainId, accountKaiaTransaction.chainId) && Intrinsics.EZpvd((Object) this.data, (Object) accountKaiaTransaction.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasLimit() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxFeePerGas() {
        return this.maxFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPriorityFeePerGas() {
        return this.maxPriorityFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxType() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.to.hashCode();
        int iHashCode2 = this.from.hashCode();
        int iHashCode3 = this.nonce.hashCode();
        int iHashCode4 = this.gasPrice.hashCode();
        int iHashCode5 = this.gasLimit.hashCode();
        int iHashCode6 = this.value.hashCode();
        String str = this.fee;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        int iHashCode8 = this.txType.hashCode();
        String str2 = this.maxFeePerGas;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.maxPriorityFeePerGas;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.chainId;
        int iHashCode11 = num == null ? 0 : num.hashCode();
        String str4 = this.data;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(Integer num) {
        this.chainId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(String str) {
        this.data = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(String str) {
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gasPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxFeePerGas(String str) {
        this.maxFeePerGas = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxPriorityFeePerGas(String str) {
        this.maxPriorityFeePerGas = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNonce(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nonce = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.to = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.txType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.to);
        parcel.writeString(this.from);
        parcel.writeString(this.nonce);
        parcel.writeString(this.gasPrice);
        parcel.writeString(this.gasLimit);
        parcel.writeString(this.value);
        parcel.writeString(this.fee);
        parcel.writeString(this.txType);
        parcel.writeString(this.maxFeePerGas);
        parcel.writeString(this.maxPriorityFeePerGas);
        Integer num = this.chainId;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.data);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.evm.AccountKaiaTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountKaiaTransaction> serializer() {
            return AccountKaiaTransaction$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountKaiaTransaction(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (2047 != (i & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2047, AccountKaiaTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.to = str;
        this.from = str2;
        this.nonce = str3;
        this.gasPrice = str4;
        this.gasLimit = str5;
        this.value = str6;
        this.fee = str7;
        this.txType = str8;
        this.maxFeePerGas = str9;
        this.maxPriorityFeePerGas = str10;
        this.chainId = num;
        this.data = (i & 2048) == 0 ? null : str11;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.wallet.core.sign.evm.BaseAccountTransaction.write$Self(com.okinc.wallet.core.sign.evm.BaseAccountTransaction, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(AccountKaiaTransaction accountKaiaTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BaseAccountTransaction.write$Self(accountKaiaTransaction, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, accountKaiaTransaction.to);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, accountKaiaTransaction.from);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, accountKaiaTransaction.nonce);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, accountKaiaTransaction.gasPrice);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, accountKaiaTransaction.gasLimit);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, accountKaiaTransaction.value);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, accountKaiaTransaction.fee);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, accountKaiaTransaction.txType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, accountKaiaTransaction.maxFeePerGas);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, accountKaiaTransaction.maxPriorityFeePerGas);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, accountKaiaTransaction.chainId);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && accountKaiaTransaction.data == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, accountKaiaTransaction.data);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0021: CONSTRUCTOR 
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.Integer)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void (m)] (LINE:69) call: com.okinc.wallet.core.sign.evm.AccountKaiaTransaction.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ AccountKaiaTransaction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, num, (i & 2048) != 0 ? null : str11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountKaiaTransaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, String str7, @NotNull String str8, String str9, String str10, Integer num, String str11) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.to = str;
        this.from = str2;
        this.nonce = str3;
        this.gasPrice = str4;
        this.gasLimit = str5;
        this.value = str6;
        this.fee = str7;
        this.txType = str8;
        this.maxFeePerGas = str9;
        this.maxPriorityFeePerGas = str10;
        this.chainId = num;
        this.data = str11;
    }

    public String toString() {
        return "AccountKaiaTransaction(to='" + this.to + "', nonce='" + this.nonce + "', gasPrice='" + this.gasPrice + "', gasLimit='" + this.gasLimit + "', value='" + this.value + "', fee=" + this.fee + ", txType=" + this.txType + ", maxFeePerGas=" + this.maxFeePerGas + ", maxPriorityFeePerGas=" + this.maxPriorityFeePerGas + ", chainId=" + this.chainId + ", data=" + this.data + ")";
    }
}
