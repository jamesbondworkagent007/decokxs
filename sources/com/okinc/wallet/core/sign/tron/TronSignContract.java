package com.okinc.wallet.core.sign.tron;

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
public final class TronSignContract {
    private String contractAddress;
    private String expiration;
    private String feeLimit;
    private String from;
    private String method;
    private String permission_id;
    private String prvKey;
    private String ref_block_bytes;
    private String ref_block_hash;
    private String ref_block_number;
    private String timestamp;
    private String to;
    private String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.prvKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.permission_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.ref_block_hash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.feeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.ref_block_number;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.ref_block_bytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TronSignContract copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, String str7, String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        return new TronSignContract(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TronSignContract)) {
            return false;
        }
        TronSignContract tronSignContract = (TronSignContract) obj;
        return Intrinsics.EZpvd((Object) this.prvKey, (Object) tronSignContract.prvKey) && Intrinsics.EZpvd((Object) this.from, (Object) tronSignContract.from) && Intrinsics.EZpvd((Object) this.to, (Object) tronSignContract.to) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) tronSignContract.contractAddress) && Intrinsics.EZpvd((Object) this.method, (Object) tronSignContract.method) && Intrinsics.EZpvd((Object) this.value, (Object) tronSignContract.value) && Intrinsics.EZpvd((Object) this.feeLimit, (Object) tronSignContract.feeLimit) && Intrinsics.EZpvd((Object) this.ref_block_number, (Object) tronSignContract.ref_block_number) && Intrinsics.EZpvd((Object) this.ref_block_bytes, (Object) tronSignContract.ref_block_bytes) && Intrinsics.EZpvd((Object) this.permission_id, (Object) tronSignContract.permission_id) && Intrinsics.EZpvd((Object) this.ref_block_hash, (Object) tronSignContract.ref_block_hash) && Intrinsics.EZpvd((Object) this.timestamp, (Object) tronSignContract.timestamp) && Intrinsics.EZpvd((Object) this.expiration, (Object) tronSignContract.expiration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpiration() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeLimit() {
        return this.feeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPermission_id() {
        return this.permission_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrvKey() {
        return this.prvKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRef_block_bytes() {
        return this.ref_block_bytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRef_block_hash() {
        return this.ref_block_hash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRef_block_number() {
        return this.ref_block_number;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.prvKey.hashCode();
        int iHashCode2 = this.from.hashCode();
        int iHashCode3 = this.to.hashCode();
        int iHashCode4 = this.contractAddress.hashCode();
        int iHashCode5 = this.method.hashCode();
        String str = this.value;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.feeLimit;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.ref_block_number;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.ref_block_bytes.hashCode()) * 31) + this.permission_id.hashCode()) * 31) + this.ref_block_hash.hashCode()) * 31) + this.timestamp.hashCode()) * 31) + this.expiration.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpiration(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.expiration = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeLimit(String str) {
        this.feeLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMethod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.method = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPermission_id(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.permission_id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrvKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.prvKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRef_block_bytes(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ref_block_bytes = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRef_block_hash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ref_block_hash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRef_block_number(String str) {
        this.ref_block_number = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimestamp(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.timestamp = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.to = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TronSignContract(prvKey=" + this.prvKey + ", from=" + this.from + ", to=" + this.to + ", contractAddress=" + this.contractAddress + ", method=" + this.method + ", value=" + this.value + ", feeLimit=" + this.feeLimit + ", ref_block_number=" + this.ref_block_number + ", ref_block_bytes=" + this.ref_block_bytes + ", permission_id=" + this.permission_id + ", ref_block_hash=" + this.ref_block_hash + ", timestamp=" + this.timestamp + ", expiration=" + this.expiration + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.tron.TronSignContract.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TronSignContract> serializer() {
            return TronSignContract$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TronSignContract(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        if (8191 != (i & 8191)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8191, TronSignContract$$serializer.INSTANCE.getDescriptor());
        }
        this.prvKey = str;
        this.from = str2;
        this.to = str3;
        this.contractAddress = str4;
        this.method = str5;
        this.value = str6;
        this.feeLimit = str7;
        this.ref_block_number = str8;
        this.ref_block_bytes = str9;
        this.permission_id = str10;
        this.ref_block_hash = str11;
        this.timestamp = str12;
        this.expiration = str13;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(TronSignContract tronSignContract, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tronSignContract.prvKey);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tronSignContract.from);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tronSignContract.to);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, tronSignContract.contractAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, tronSignContract.method);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, tronSignContract.value);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, tronSignContract.feeLimit);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, tronSignContract.ref_block_number);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, tronSignContract.ref_block_bytes);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, tronSignContract.permission_id);
        compositeEncoder.encodeStringElement(serialDescriptor, 10, tronSignContract.ref_block_hash);
        compositeEncoder.encodeStringElement(serialDescriptor, 11, tronSignContract.timestamp);
        compositeEncoder.encodeStringElement(serialDescriptor, 12, tronSignContract.expiration);
    }

    public TronSignContract(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, String str7, String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        this.prvKey = str;
        this.from = str2;
        this.to = str3;
        this.contractAddress = str4;
        this.method = str5;
        this.value = str6;
        this.feeLimit = str7;
        this.ref_block_number = str8;
        this.ref_block_bytes = str9;
        this.permission_id = str10;
        this.ref_block_hash = str11;
        this.timestamp = str12;
        this.expiration = str13;
    }
}
