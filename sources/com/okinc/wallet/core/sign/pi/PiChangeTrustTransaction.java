package com.okinc.wallet.core.sign.pi;

import androidx.core.app.FrameMetricsAggregator;
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
public final class PiChangeTrustTransaction extends PiBaseTransaction {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String assetName;
    private final String decimals;
    private final String fee;
    private final String issuer;
    private final String networkPassphrase;
    private final String sequence;
    private final String timeout;
    private final String trustLineLimit;
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
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
        return this.trustLineLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.timeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PiChangeTrustTransaction copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new PiChangeTrustTransaction(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PiChangeTrustTransaction)) {
            return false;
        }
        PiChangeTrustTransaction piChangeTrustTransaction = (PiChangeTrustTransaction) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) piChangeTrustTransaction.type) && Intrinsics.EZpvd((Object) this.sequence, (Object) piChangeTrustTransaction.sequence) && Intrinsics.EZpvd((Object) this.networkPassphrase, (Object) piChangeTrustTransaction.networkPassphrase) && Intrinsics.EZpvd((Object) this.assetName, (Object) piChangeTrustTransaction.assetName) && Intrinsics.EZpvd((Object) this.issuer, (Object) piChangeTrustTransaction.issuer) && Intrinsics.EZpvd((Object) this.trustLineLimit, (Object) piChangeTrustTransaction.trustLineLimit) && Intrinsics.EZpvd((Object) this.decimals, (Object) piChangeTrustTransaction.decimals) && Intrinsics.EZpvd((Object) this.fee, (Object) piChangeTrustTransaction.fee) && Intrinsics.EZpvd((Object) this.timeout, (Object) piChangeTrustTransaction.timeout);
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
    public final String getTrustLineLimit() {
        return this.trustLineLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.type.hashCode() * 31) + this.sequence.hashCode()) * 31) + this.networkPassphrase.hashCode()) * 31) + this.assetName.hashCode()) * 31) + this.issuer.hashCode()) * 31) + this.trustLineLimit.hashCode()) * 31) + this.decimals.hashCode()) * 31) + this.fee.hashCode()) * 31) + this.timeout.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PiChangeTrustTransaction(type=" + this.type + ", sequence=" + this.sequence + ", networkPassphrase=" + this.networkPassphrase + ", assetName=" + this.assetName + ", issuer=" + this.issuer + ", trustLineLimit=" + this.trustLineLimit + ", decimals=" + this.decimals + ", fee=" + this.fee + ", timeout=" + this.timeout + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.pi.PiChangeTrustTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PiChangeTrustTransaction> serializer() {
            return PiChangeTrustTransaction$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PiChangeTrustTransaction(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i, FrameMetricsAggregator.EVERY_DURATION, PiChangeTrustTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.sequence = str2;
        this.networkPassphrase = str3;
        this.assetName = str4;
        this.issuer = str5;
        this.trustLineLimit = str6;
        this.decimals = str7;
        this.fee = str8;
        this.timeout = str9;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.wallet.core.sign.pi.PiBaseTransaction.write$Self(com.okinc.wallet.core.sign.pi.PiBaseTransaction, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(PiChangeTrustTransaction piChangeTrustTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        PiBaseTransaction.write$Self(piChangeTrustTransaction, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, piChangeTrustTransaction.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, piChangeTrustTransaction.sequence);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, piChangeTrustTransaction.networkPassphrase);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, piChangeTrustTransaction.assetName);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, piChangeTrustTransaction.issuer);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, piChangeTrustTransaction.trustLineLimit);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, piChangeTrustTransaction.decimals);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, piChangeTrustTransaction.fee);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, piChangeTrustTransaction.timeout);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PiChangeTrustTransaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
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
        this.type = str;
        this.sequence = str2;
        this.networkPassphrase = str3;
        this.assetName = str4;
        this.issuer = str5;
        this.trustLineLimit = str6;
        this.decimals = str7;
        this.fee = str8;
        this.timeout = str9;
    }
}
