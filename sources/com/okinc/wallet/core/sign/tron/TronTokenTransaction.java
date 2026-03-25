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
public final class TronTokenTransaction extends BaseTronTransaction {
    private String asset;
    private String contractAddress;
    private String expiration;
    private String fee;
    private String feelimit;
    private String from;
    private String permission_id;
    private String ref_block_bytes;
    private String ref_block_hash;
    private String ref_block_number;
    private String timestamp;
    private String to;
    private String trc;
    private String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.asset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.feelimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.trc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ref_block_bytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.permission_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ref_block_hash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.ref_block_number;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TronTokenTransaction copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, String str10, String str11, String str12, String str13, @NotNull String str14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str14, "");
        return new TronTokenTransaction(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TronTokenTransaction)) {
            return false;
        }
        TronTokenTransaction tronTokenTransaction = (TronTokenTransaction) obj;
        return Intrinsics.EZpvd((Object) this.from, (Object) tronTokenTransaction.from) && Intrinsics.EZpvd((Object) this.to, (Object) tronTokenTransaction.to) && Intrinsics.EZpvd((Object) this.value, (Object) tronTokenTransaction.value) && Intrinsics.EZpvd((Object) this.ref_block_bytes, (Object) tronTokenTransaction.ref_block_bytes) && Intrinsics.EZpvd((Object) this.permission_id, (Object) tronTokenTransaction.permission_id) && Intrinsics.EZpvd((Object) this.ref_block_hash, (Object) tronTokenTransaction.ref_block_hash) && Intrinsics.EZpvd((Object) this.ref_block_number, (Object) tronTokenTransaction.ref_block_number) && Intrinsics.EZpvd((Object) this.timestamp, (Object) tronTokenTransaction.timestamp) && Intrinsics.EZpvd((Object) this.expiration, (Object) tronTokenTransaction.expiration) && Intrinsics.EZpvd((Object) this.fee, (Object) tronTokenTransaction.fee) && Intrinsics.EZpvd((Object) this.asset, (Object) tronTokenTransaction.asset) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) tronTokenTransaction.contractAddress) && Intrinsics.EZpvd((Object) this.feelimit, (Object) tronTokenTransaction.feelimit) && Intrinsics.EZpvd((Object) this.trc, (Object) tronTokenTransaction.trc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAsset() {
        return this.asset;
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
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeelimit() {
        return this.feelimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPermission_id() {
        return this.permission_id;
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
    public final String getTrc() {
        return this.trc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.from.hashCode();
        int iHashCode2 = this.to.hashCode();
        int iHashCode3 = this.value.hashCode();
        int iHashCode4 = this.ref_block_bytes.hashCode();
        int iHashCode5 = this.permission_id.hashCode();
        int iHashCode6 = this.ref_block_hash.hashCode();
        int iHashCode7 = this.ref_block_number.hashCode();
        int iHashCode8 = this.timestamp.hashCode();
        int iHashCode9 = this.expiration.hashCode();
        String str = this.fee;
        int iHashCode10 = str == null ? 0 : str.hashCode();
        String str2 = this.asset;
        int iHashCode11 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.contractAddress;
        int iHashCode12 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.feelimit;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + this.trc.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAsset(String str) {
        this.asset = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractAddress(String str) {
        this.contractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpiration(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.expiration = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(String str) {
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeelimit(String str) {
        this.feelimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPermission_id(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.permission_id = str;
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
    public final void setRef_block_number(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
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
    public final void setTrc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.trc = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TronTokenTransaction(from=" + this.from + ", to=" + this.to + ", value=" + this.value + ", ref_block_bytes=" + this.ref_block_bytes + ", permission_id=" + this.permission_id + ", ref_block_hash=" + this.ref_block_hash + ", ref_block_number=" + this.ref_block_number + ", timestamp=" + this.timestamp + ", expiration=" + this.expiration + ", fee=" + this.fee + ", asset=" + this.asset + ", contractAddress=" + this.contractAddress + ", feelimit=" + this.feelimit + ", trc=" + this.trc + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.tron.TronTokenTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TronTokenTransaction> serializer() {
            return TronTokenTransaction$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TronTokenTransaction(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (16383 != (i & 16383)) {
            PluginExceptionsKt.throwMissingFieldException(i, 16383, TronTokenTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.from = str;
        this.to = str2;
        this.value = str3;
        this.ref_block_bytes = str4;
        this.permission_id = str5;
        this.ref_block_hash = str6;
        this.ref_block_number = str7;
        this.timestamp = str8;
        this.expiration = str9;
        this.fee = str10;
        this.asset = str11;
        this.contractAddress = str12;
        this.feelimit = str13;
        this.trc = str14;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(TronTokenTransaction tronTokenTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BaseTronTransaction.write$Self(tronTokenTransaction, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tronTokenTransaction.from);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tronTokenTransaction.to);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tronTokenTransaction.value);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, tronTokenTransaction.ref_block_bytes);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, tronTokenTransaction.permission_id);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, tronTokenTransaction.ref_block_hash);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, tronTokenTransaction.ref_block_number);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, tronTokenTransaction.timestamp);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, tronTokenTransaction.expiration);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, tronTokenTransaction.fee);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, tronTokenTransaction.asset);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, tronTokenTransaction.contractAddress);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, tronTokenTransaction.feelimit);
        compositeEncoder.encodeStringElement(serialDescriptor, 13, tronTokenTransaction.trc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TronTokenTransaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, String str10, String str11, String str12, String str13, @NotNull String str14) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str14, "");
        this.from = str;
        this.to = str2;
        this.value = str3;
        this.ref_block_bytes = str4;
        this.permission_id = str5;
        this.ref_block_hash = str6;
        this.ref_block_number = str7;
        this.timestamp = str8;
        this.expiration = str9;
        this.fee = str10;
        this.asset = str11;
        this.contractAddress = str12;
        this.feelimit = str13;
        this.trc = str14;
    }
}
