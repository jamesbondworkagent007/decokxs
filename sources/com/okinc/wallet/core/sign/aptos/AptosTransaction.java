package com.okinc.wallet.core.sign.aptos;

import androidx.core.app.FrameMetricsAggregator;
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

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class AptosTransaction {
    private String amount;
    private String chainId;
    private String expirationTimestampSecs;
    private String from;
    private String fungibleAssetMetadataAddress;
    private String gasUnitPrice;
    private String maxGasAmount;
    private String publicKey;
    private String sequenceNumber;
    private String to;
    private String tyArg;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.fungibleAssetMetadataAddress;
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
        return this.tyArg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AptosTransaction copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, String str7, String str8, @NotNull String str9, String str10, String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new AptosTransaction(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AptosTransaction)) {
            return false;
        }
        AptosTransaction aptosTransaction = (AptosTransaction) obj;
        return Intrinsics.EZpvd((Object) this.from, (Object) aptosTransaction.from) && Intrinsics.EZpvd((Object) this.to, (Object) aptosTransaction.to) && Intrinsics.EZpvd((Object) this.amount, (Object) aptosTransaction.amount) && Intrinsics.EZpvd((Object) this.sequenceNumber, (Object) aptosTransaction.sequenceNumber) && Intrinsics.EZpvd((Object) this.maxGasAmount, (Object) aptosTransaction.maxGasAmount) && Intrinsics.EZpvd((Object) this.gasUnitPrice, (Object) aptosTransaction.gasUnitPrice) && Intrinsics.EZpvd((Object) this.expirationTimestampSecs, (Object) aptosTransaction.expirationTimestampSecs) && Intrinsics.EZpvd((Object) this.tyArg, (Object) aptosTransaction.tyArg) && Intrinsics.EZpvd((Object) this.chainId, (Object) aptosTransaction.chainId) && Intrinsics.EZpvd((Object) this.publicKey, (Object) aptosTransaction.publicKey) && Intrinsics.EZpvd((Object) this.fungibleAssetMetadataAddress, (Object) aptosTransaction.fungibleAssetMetadataAddress);
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
    public final String getFungibleAssetMetadataAddress() {
        return this.fungibleAssetMetadataAddress;
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
    public final String getTyArg() {
        return this.tyArg;
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
        String str2 = this.tyArg;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        int iHashCode9 = this.chainId.hashCode();
        String str3 = this.publicKey;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.fungibleAssetMetadataAddress;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str4 != null ? str4.hashCode() : 0);
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
    public final void setFungibleAssetMetadataAddress(String str) {
        this.fungibleAssetMetadataAddress = str;
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
    public final void setPublicKey(String str) {
        this.publicKey = str;
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
    public final void setTyArg(String str) {
        this.tyArg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AptosTransaction(from=" + this.from + ", to=" + this.to + ", amount=" + this.amount + ", sequenceNumber=" + this.sequenceNumber + ", maxGasAmount=" + this.maxGasAmount + ", gasUnitPrice=" + this.gasUnitPrice + ", expirationTimestampSecs=" + this.expirationTimestampSecs + ", tyArg=" + this.tyArg + ", chainId=" + this.chainId + ", publicKey=" + this.publicKey + ", fungibleAssetMetadataAddress=" + this.fungibleAssetMetadataAddress + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.aptos.AptosTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AptosTransaction> serializer() {
            return AptosTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AptosTransaction(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i, FrameMetricsAggregator.EVERY_DURATION, AptosTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.from = str;
        this.to = str2;
        this.amount = str3;
        this.sequenceNumber = str4;
        this.maxGasAmount = str5;
        this.gasUnitPrice = str6;
        this.expirationTimestampSecs = str7;
        this.tyArg = str8;
        this.chainId = str9;
        if ((i & 512) == 0) {
            this.publicKey = null;
        } else {
            this.publicKey = str10;
        }
        if ((i & 1024) == 0) {
            this.fungibleAssetMetadataAddress = null;
        } else {
            this.fungibleAssetMetadataAddress = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(AptosTransaction aptosTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, aptosTransaction.from);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, aptosTransaction.to);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, aptosTransaction.amount);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, aptosTransaction.sequenceNumber);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, aptosTransaction.maxGasAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, aptosTransaction.gasUnitPrice);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, aptosTransaction.expirationTimestampSecs);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, aptosTransaction.tyArg);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, aptosTransaction.chainId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || aptosTransaction.publicKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, aptosTransaction.publicKey);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && aptosTransaction.fungibleAssetMetadataAddress == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, aptosTransaction.fungibleAssetMetadataAddress);
    }

    public AptosTransaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, String str7, String str8, @NotNull String str9, String str10, String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.from = str;
        this.to = str2;
        this.amount = str3;
        this.sequenceNumber = str4;
        this.maxGasAmount = str5;
        this.gasUnitPrice = str6;
        this.expirationTimestampSecs = str7;
        this.tyArg = str8;
        this.chainId = str9;
        this.publicKey = str10;
        this.fungibleAssetMetadataAddress = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.wallet.core.sign.aptos.AptosTransaction.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AptosTransaction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11);
    }
}
