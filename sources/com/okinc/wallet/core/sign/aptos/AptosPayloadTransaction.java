package com.okinc.wallet.core.sign.aptos;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class AptosPayloadTransaction {
    private String abi;
    private String amount;
    private String chainId;
    private String expirationTimestampSecs;
    private String from;
    private String gasUnitPrice;
    private Boolean isRawType;
    private String maxGasAmount;
    private String payload;
    private String publicKey;
    private String sequenceNumber;
    private String to;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.abi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component12() {
        return this.isRawType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.sequenceNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.maxGasAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.gasUnitPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.expirationTimestampSecs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AptosPayloadTransaction copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, String str11, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new AptosPayloadTransaction(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AptosPayloadTransaction)) {
            return false;
        }
        AptosPayloadTransaction aptosPayloadTransaction = (AptosPayloadTransaction) obj;
        return Intrinsics.EZpvd((Object) this.from, (Object) aptosPayloadTransaction.from) && Intrinsics.EZpvd((Object) this.to, (Object) aptosPayloadTransaction.to) && Intrinsics.EZpvd((Object) this.amount, (Object) aptosPayloadTransaction.amount) && Intrinsics.EZpvd((Object) this.sequenceNumber, (Object) aptosPayloadTransaction.sequenceNumber) && Intrinsics.EZpvd((Object) this.maxGasAmount, (Object) aptosPayloadTransaction.maxGasAmount) && Intrinsics.EZpvd((Object) this.gasUnitPrice, (Object) aptosPayloadTransaction.gasUnitPrice) && Intrinsics.EZpvd((Object) this.expirationTimestampSecs, (Object) aptosPayloadTransaction.expirationTimestampSecs) && Intrinsics.EZpvd((Object) this.chainId, (Object) aptosPayloadTransaction.chainId) && Intrinsics.EZpvd((Object) this.payload, (Object) aptosPayloadTransaction.payload) && Intrinsics.EZpvd((Object) this.abi, (Object) aptosPayloadTransaction.abi) && Intrinsics.EZpvd((Object) this.publicKey, (Object) aptosPayloadTransaction.publicKey) && Intrinsics.EZpvd(this.isRawType, aptosPayloadTransaction.isRawType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAbi() {
        return this.abi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpirationTimestampSecs() {
        return this.expirationTimestampSecs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasUnitPrice() {
        return this.gasUnitPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxGasAmount() {
        return this.maxGasAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayload() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSequenceNumber() {
        return this.sequenceNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.from.hashCode();
        int iHashCode2 = this.to.hashCode();
        int iHashCode3 = this.amount.hashCode();
        int iHashCode4 = this.sequenceNumber.hashCode();
        int iHashCode5 = this.maxGasAmount.hashCode();
        int iHashCode6 = this.gasUnitPrice.hashCode();
        String str = this.expirationTimestampSecs;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        int iHashCode8 = this.chainId.hashCode();
        int iHashCode9 = this.payload.hashCode();
        int iHashCode10 = this.abi.hashCode();
        String str2 = this.publicKey;
        int iHashCode11 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.isRawType;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isRawType() {
        return this.isRawType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAbi(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.abi = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpirationTimestampSecs(String str) {
        this.expirationTimestampSecs = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasUnitPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gasUnitPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxGasAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxGasAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayload(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.payload = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPublicKey(String str) {
        this.publicKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRawType(Boolean bool) {
        this.isRawType = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSequenceNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sequenceNumber = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.to = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AptosPayloadTransaction(from=" + this.from + ", to=" + this.to + ", amount=" + this.amount + ", sequenceNumber=" + this.sequenceNumber + ", maxGasAmount=" + this.maxGasAmount + ", gasUnitPrice=" + this.gasUnitPrice + ", expirationTimestampSecs=" + this.expirationTimestampSecs + ", chainId=" + this.chainId + ", payload=" + this.payload + ", abi=" + this.abi + ", publicKey=" + this.publicKey + ", isRawType=" + this.isRawType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.aptos.AptosPayloadTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AptosPayloadTransaction> serializer() {
            return AptosPayloadTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AptosPayloadTransaction(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1023, AptosPayloadTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.from = str;
        this.to = str2;
        this.amount = str3;
        this.sequenceNumber = str4;
        this.maxGasAmount = str5;
        this.gasUnitPrice = str6;
        this.expirationTimestampSecs = str7;
        this.chainId = str8;
        this.payload = str9;
        this.abi = str10;
        if ((i & 1024) == 0) {
            this.publicKey = null;
        } else {
            this.publicKey = str11;
        }
        if ((i & 2048) == 0) {
            this.isRawType = null;
        } else {
            this.isRawType = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(AptosPayloadTransaction aptosPayloadTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, aptosPayloadTransaction.from);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, aptosPayloadTransaction.to);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, aptosPayloadTransaction.amount);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, aptosPayloadTransaction.sequenceNumber);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, aptosPayloadTransaction.maxGasAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, aptosPayloadTransaction.gasUnitPrice);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, aptosPayloadTransaction.expirationTimestampSecs);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, aptosPayloadTransaction.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, aptosPayloadTransaction.payload);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, aptosPayloadTransaction.abi);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || aptosPayloadTransaction.publicKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, aptosPayloadTransaction.publicKey);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && aptosPayloadTransaction.isRawType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, aptosPayloadTransaction.isRawType);
    }

    public AptosPayloadTransaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, String str11, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.from = str;
        this.to = str2;
        this.amount = str3;
        this.sequenceNumber = str4;
        this.maxGasAmount = str5;
        this.gasUnitPrice = str6;
        this.expirationTimestampSecs = str7;
        this.chainId = str8;
        this.payload = str9;
        this.abi = str10;
        this.publicKey = str11;
        this.isRawType = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r29v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r28v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:29) call: com.okinc.wallet.core.sign.aptos.AptosPayloadTransaction.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ AptosPayloadTransaction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : bool);
    }
}
