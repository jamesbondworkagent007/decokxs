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
public final class TronTransaction extends BaseTronTransaction {
    private String expiration;
    private String fee;
    private String from;
    private String permission_id;
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
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.fee;
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
    public final TronTransaction copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new TronTransaction(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TronTransaction)) {
            return false;
        }
        TronTransaction tronTransaction = (TronTransaction) obj;
        return Intrinsics.EZpvd((Object) this.from, (Object) tronTransaction.from) && Intrinsics.EZpvd((Object) this.to, (Object) tronTransaction.to) && Intrinsics.EZpvd((Object) this.value, (Object) tronTransaction.value) && Intrinsics.EZpvd((Object) this.ref_block_bytes, (Object) tronTransaction.ref_block_bytes) && Intrinsics.EZpvd((Object) this.permission_id, (Object) tronTransaction.permission_id) && Intrinsics.EZpvd((Object) this.ref_block_hash, (Object) tronTransaction.ref_block_hash) && Intrinsics.EZpvd((Object) this.ref_block_number, (Object) tronTransaction.ref_block_number) && Intrinsics.EZpvd((Object) this.timestamp, (Object) tronTransaction.timestamp) && Intrinsics.EZpvd((Object) this.expiration, (Object) tronTransaction.expiration) && Intrinsics.EZpvd((Object) this.fee, (Object) tronTransaction.fee);
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
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str == null ? 0 : str.hashCode());
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
    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TronTransaction(from=" + this.from + ", to=" + this.to + ", value=" + this.value + ", ref_block_bytes=" + this.ref_block_bytes + ", permission_id=" + this.permission_id + ", ref_block_hash=" + this.ref_block_hash + ", ref_block_number=" + this.ref_block_number + ", timestamp=" + this.timestamp + ", expiration=" + this.expiration + ", fee=" + this.fee + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.tron.TronTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TronTransaction> serializer() {
            return TronTransaction$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TronTransaction(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1023, TronTransaction$$serializer.INSTANCE.getDescriptor());
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
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(TronTransaction tronTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BaseTronTransaction.write$Self(tronTransaction, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tronTransaction.from);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tronTransaction.to);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tronTransaction.value);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, tronTransaction.ref_block_bytes);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, tronTransaction.permission_id);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, tronTransaction.ref_block_hash);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, tronTransaction.ref_block_number);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, tronTransaction.timestamp);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, tronTransaction.expiration);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, tronTransaction.fee);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TronTransaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, String str10) {
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
    }
}
