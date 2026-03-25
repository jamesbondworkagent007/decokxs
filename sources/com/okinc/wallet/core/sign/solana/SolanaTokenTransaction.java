package com.okinc.wallet.core.sign.solana;

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
public final class SolanaTokenTransaction extends BaseSolanaTransaction {
    private String authPubKey;
    private String blockHash;
    private String computeUnitLimit;
    private String computeUnitPrice;
    private String decimal;
    private String destPubKey;
    private String from;
    private String mintPubKey;
    private String srcPubKey;
    private String toAccountPubKey;
    private String token;
    private boolean token2022;
    private String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.toAccountPubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.token2022;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.computeUnitLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.computeUnitPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.blockHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.decimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.authPubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.srcPubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.destPubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.mintPubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SolanaTokenTransaction copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, @NotNull String str9, String str10, boolean z, String str11, String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new SolanaTokenTransaction(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, z, str11, str12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SolanaTokenTransaction)) {
            return false;
        }
        SolanaTokenTransaction solanaTokenTransaction = (SolanaTokenTransaction) obj;
        return Intrinsics.EZpvd((Object) this.from, (Object) solanaTokenTransaction.from) && Intrinsics.EZpvd((Object) this.value, (Object) solanaTokenTransaction.value) && Intrinsics.EZpvd((Object) this.token, (Object) solanaTokenTransaction.token) && Intrinsics.EZpvd((Object) this.blockHash, (Object) solanaTokenTransaction.blockHash) && Intrinsics.EZpvd((Object) this.decimal, (Object) solanaTokenTransaction.decimal) && Intrinsics.EZpvd((Object) this.authPubKey, (Object) solanaTokenTransaction.authPubKey) && Intrinsics.EZpvd((Object) this.srcPubKey, (Object) solanaTokenTransaction.srcPubKey) && Intrinsics.EZpvd((Object) this.destPubKey, (Object) solanaTokenTransaction.destPubKey) && Intrinsics.EZpvd((Object) this.mintPubKey, (Object) solanaTokenTransaction.mintPubKey) && Intrinsics.EZpvd((Object) this.toAccountPubKey, (Object) solanaTokenTransaction.toAccountPubKey) && this.token2022 == solanaTokenTransaction.token2022 && Intrinsics.EZpvd((Object) this.computeUnitLimit, (Object) solanaTokenTransaction.computeUnitLimit) && Intrinsics.EZpvd((Object) this.computeUnitPrice, (Object) solanaTokenTransaction.computeUnitPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuthPubKey() {
        return this.authPubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBlockHash() {
        return this.blockHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getComputeUnitLimit() {
        return this.computeUnitLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getComputeUnitPrice() {
        return this.computeUnitPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDecimal() {
        return this.decimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDestPubKey() {
        return this.destPubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMintPubKey() {
        return this.mintPubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSrcPubKey() {
        return this.srcPubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAccountPubKey() {
        return this.toAccountPubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getToken2022() {
        return this.token2022;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.from.hashCode();
        int iHashCode2 = this.value.hashCode();
        int iHashCode3 = this.token.hashCode();
        int iHashCode4 = this.blockHash.hashCode();
        int iHashCode5 = this.decimal.hashCode();
        int iHashCode6 = this.authPubKey.hashCode();
        int iHashCode7 = this.srcPubKey.hashCode();
        String str = this.destPubKey;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        int iHashCode9 = this.mintPubKey.hashCode();
        String str2 = this.toAccountPubKey;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        int iHashCode11 = Boolean.hashCode(this.token2022);
        String str3 = this.computeUnitLimit;
        int iHashCode12 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.computeUnitPrice;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAuthPubKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.authPubKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBlockHash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.blockHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setComputeUnitLimit(String str) {
        this.computeUnitLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setComputeUnitPrice(String str) {
        this.computeUnitPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDecimal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.decimal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDestPubKey(String str) {
        this.destPubKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMintPubKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mintPubKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSrcPubKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.srcPubKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToAccountPubKey(String str) {
        this.toAccountPubKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.token = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToken2022(boolean z) {
        this.token2022 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SolanaTokenTransaction(from=" + this.from + ", value=" + this.value + ", token=" + this.token + ", blockHash=" + this.blockHash + ", decimal=" + this.decimal + ", authPubKey=" + this.authPubKey + ", srcPubKey=" + this.srcPubKey + ", destPubKey=" + this.destPubKey + ", mintPubKey=" + this.mintPubKey + ", toAccountPubKey=" + this.toAccountPubKey + ", token2022=" + this.token2022 + ", computeUnitLimit=" + this.computeUnitLimit + ", computeUnitPrice=" + this.computeUnitPrice + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.solana.SolanaTokenTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SolanaTokenTransaction> serializer() {
            return SolanaTokenTransaction$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SolanaTokenTransaction(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (8191 != (i & 8191)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8191, SolanaTokenTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.from = str;
        this.value = str2;
        this.token = str3;
        this.blockHash = str4;
        this.decimal = str5;
        this.authPubKey = str6;
        this.srcPubKey = str7;
        this.destPubKey = str8;
        this.mintPubKey = str9;
        this.toAccountPubKey = str10;
        this.token2022 = z;
        this.computeUnitLimit = str11;
        this.computeUnitPrice = str12;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.wallet.core.sign.solana.BaseSolanaTransaction.write$Self(com.okinc.wallet.core.sign.solana.BaseSolanaTransaction, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(SolanaTokenTransaction solanaTokenTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BaseSolanaTransaction.write$Self(solanaTokenTransaction, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, solanaTokenTransaction.from);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, solanaTokenTransaction.value);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, solanaTokenTransaction.token);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, solanaTokenTransaction.blockHash);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, solanaTokenTransaction.decimal);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, solanaTokenTransaction.authPubKey);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, solanaTokenTransaction.srcPubKey);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, solanaTokenTransaction.destPubKey);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, solanaTokenTransaction.mintPubKey);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, solanaTokenTransaction.toAccountPubKey);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 10, solanaTokenTransaction.token2022);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, solanaTokenTransaction.computeUnitLimit);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, solanaTokenTransaction.computeUnitPrice);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SolanaTokenTransaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, @NotNull String str9, String str10, boolean z, String str11, String str12) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.from = str;
        this.value = str2;
        this.token = str3;
        this.blockHash = str4;
        this.decimal = str5;
        this.authPubKey = str6;
        this.srcPubKey = str7;
        this.destPubKey = str8;
        this.mintPubKey = str9;
        this.toAccountPubKey = str10;
        this.token2022 = z;
        this.computeUnitLimit = str11;
        this.computeUnitPrice = str12;
    }
}
