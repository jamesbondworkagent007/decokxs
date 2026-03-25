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
public final class SolanaTransaction extends BaseSolanaTransaction {
    private String blockHash;
    private String computeUnitLimit;
    private String computeUnitPrice;
    private String from;
    private String lamports;
    private String to;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SolanaTransaction copy$default(SolanaTransaction solanaTransaction, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = solanaTransaction.from;
        }
        if ((i & 2) != 0) {
            str2 = solanaTransaction.to;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = solanaTransaction.lamports;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = solanaTransaction.blockHash;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = solanaTransaction.computeUnitLimit;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = solanaTransaction.computeUnitPrice;
        }
        return solanaTransaction.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.lamports;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.blockHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.computeUnitLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.computeUnitPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SolanaTransaction copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new SolanaTransaction(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SolanaTransaction)) {
            return false;
        }
        SolanaTransaction solanaTransaction = (SolanaTransaction) obj;
        return Intrinsics.EZpvd((Object) this.from, (Object) solanaTransaction.from) && Intrinsics.EZpvd((Object) this.to, (Object) solanaTransaction.to) && Intrinsics.EZpvd((Object) this.lamports, (Object) solanaTransaction.lamports) && Intrinsics.EZpvd((Object) this.blockHash, (Object) solanaTransaction.blockHash) && Intrinsics.EZpvd((Object) this.computeUnitLimit, (Object) solanaTransaction.computeUnitLimit) && Intrinsics.EZpvd((Object) this.computeUnitPrice, (Object) solanaTransaction.computeUnitPrice);
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
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLamports() {
        return this.lamports;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.from.hashCode();
        int iHashCode2 = this.to.hashCode();
        int iHashCode3 = this.lamports.hashCode();
        int iHashCode4 = this.blockHash.hashCode();
        String str = this.computeUnitLimit;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.computeUnitPrice;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
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
    public final void setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLamports(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lamports = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.to = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SolanaTransaction(from=" + this.from + ", to=" + this.to + ", lamports=" + this.lamports + ", blockHash=" + this.blockHash + ", computeUnitLimit=" + this.computeUnitLimit + ", computeUnitPrice=" + this.computeUnitPrice + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.solana.SolanaTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SolanaTransaction> serializer() {
            return SolanaTransaction$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SolanaTransaction(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, SolanaTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.from = str;
        this.to = str2;
        this.lamports = str3;
        this.blockHash = str4;
        this.computeUnitLimit = str5;
        this.computeUnitPrice = str6;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(SolanaTransaction solanaTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BaseSolanaTransaction.write$Self(solanaTransaction, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, solanaTransaction.from);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, solanaTransaction.to);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, solanaTransaction.lamports);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, solanaTransaction.blockHash);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, solanaTransaction.computeUnitLimit);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, solanaTransaction.computeUnitPrice);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SolanaTransaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, String str6) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.from = str;
        this.to = str2;
        this.lamports = str3;
        this.blockHash = str4;
        this.computeUnitLimit = str5;
        this.computeUnitPrice = str6;
    }
}
