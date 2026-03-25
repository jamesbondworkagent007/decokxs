package com.okinc.wallet.core.sign.pi;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class PiTokenTransaction extends PiBaseTransaction {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String assetAmount;
    private final String assetName;
    private final String decimals;
    private final String fee;
    private final String issuer;
    private final String memo;
    private final String networkPassphrase;
    private final String sequence;
    private final String timeout;
    private final String toAddress;
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.timeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.sequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.networkPassphrase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.assetName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.issuer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.assetAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PiTokenTransaction copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new PiTokenTransaction(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PiTokenTransaction)) {
            return false;
        }
        PiTokenTransaction piTokenTransaction = (PiTokenTransaction) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) piTokenTransaction.type) && Intrinsics.EZpvd((Object) this.sequence, (Object) piTokenTransaction.sequence) && Intrinsics.EZpvd((Object) this.networkPassphrase, (Object) piTokenTransaction.networkPassphrase) && Intrinsics.EZpvd((Object) this.assetName, (Object) piTokenTransaction.assetName) && Intrinsics.EZpvd((Object) this.issuer, (Object) piTokenTransaction.issuer) && Intrinsics.EZpvd((Object) this.assetAmount, (Object) piTokenTransaction.assetAmount) && Intrinsics.EZpvd((Object) this.decimals, (Object) piTokenTransaction.decimals) && Intrinsics.EZpvd((Object) this.toAddress, (Object) piTokenTransaction.toAddress) && Intrinsics.EZpvd((Object) this.memo, (Object) piTokenTransaction.memo) && Intrinsics.EZpvd((Object) this.fee, (Object) piTokenTransaction.fee) && Intrinsics.EZpvd((Object) this.timeout, (Object) piTokenTransaction.timeout);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAssetAmount() {
        return this.assetAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAssetName() {
        return this.assetName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDecimals() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIssuer() {
        return this.issuer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemo() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkPassphrase() {
        return this.networkPassphrase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSequence() {
        return this.sequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeout() {
        return this.timeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAddress() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.type.hashCode() * 31) + this.sequence.hashCode()) * 31) + this.networkPassphrase.hashCode()) * 31) + this.assetName.hashCode()) * 31) + this.issuer.hashCode()) * 31) + this.assetAmount.hashCode()) * 31) + this.decimals.hashCode()) * 31) + this.toAddress.hashCode()) * 31) + this.memo.hashCode()) * 31) + this.fee.hashCode()) * 31) + this.timeout.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PiTokenTransaction(type=" + this.type + ", sequence=" + this.sequence + ", networkPassphrase=" + this.networkPassphrase + ", assetName=" + this.assetName + ", issuer=" + this.issuer + ", assetAmount=" + this.assetAmount + ", decimals=" + this.decimals + ", toAddress=" + this.toAddress + ", memo=" + this.memo + ", fee=" + this.fee + ", timeout=" + this.timeout + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.pi.PiTokenTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PiTokenTransaction> serializer() {
            return PiTokenTransaction$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PiTokenTransaction(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (2047 != (i & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2047, PiTokenTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.sequence = str2;
        this.networkPassphrase = str3;
        this.assetName = str4;
        this.issuer = str5;
        this.assetAmount = str6;
        this.decimals = str7;
        this.toAddress = str8;
        this.memo = str9;
        this.fee = str10;
        this.timeout = str11;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(PiTokenTransaction piTokenTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        PiBaseTransaction.write$Self(piTokenTransaction, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, piTokenTransaction.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, piTokenTransaction.sequence);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, piTokenTransaction.networkPassphrase);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, piTokenTransaction.assetName);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, piTokenTransaction.issuer);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, piTokenTransaction.assetAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, piTokenTransaction.decimals);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, piTokenTransaction.toAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, piTokenTransaction.memo);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, piTokenTransaction.fee);
        compositeEncoder.encodeStringElement(serialDescriptor, 10, piTokenTransaction.timeout);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PiTokenTransaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
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
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.type = str;
        this.sequence = str2;
        this.networkPassphrase = str3;
        this.assetName = str4;
        this.issuer = str5;
        this.assetAmount = str6;
        this.decimals = str7;
        this.toAddress = str8;
        this.memo = str9;
        this.fee = str10;
        this.timeout = str11;
    }
}
