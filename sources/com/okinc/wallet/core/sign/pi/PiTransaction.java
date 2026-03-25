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
public final class PiTransaction extends PiBaseTransaction {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String amount;
    private final String decimals;
    private final String fee;
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
    public final String component2() {
        return this.sequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.networkPassphrase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.memo;
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
    public final PiTransaction copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new PiTransaction(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PiTransaction)) {
            return false;
        }
        PiTransaction piTransaction = (PiTransaction) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) piTransaction.type) && Intrinsics.EZpvd((Object) this.sequence, (Object) piTransaction.sequence) && Intrinsics.EZpvd((Object) this.networkPassphrase, (Object) piTransaction.networkPassphrase) && Intrinsics.EZpvd((Object) this.amount, (Object) piTransaction.amount) && Intrinsics.EZpvd((Object) this.decimals, (Object) piTransaction.decimals) && Intrinsics.EZpvd((Object) this.toAddress, (Object) piTransaction.toAddress) && Intrinsics.EZpvd((Object) this.memo, (Object) piTransaction.memo) && Intrinsics.EZpvd((Object) this.fee, (Object) piTransaction.fee) && Intrinsics.EZpvd((Object) this.timeout, (Object) piTransaction.timeout);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
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
        return (((((((((((((((this.type.hashCode() * 31) + this.sequence.hashCode()) * 31) + this.networkPassphrase.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.decimals.hashCode()) * 31) + this.toAddress.hashCode()) * 31) + this.memo.hashCode()) * 31) + this.fee.hashCode()) * 31) + this.timeout.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PiTransaction(type=" + this.type + ", sequence=" + this.sequence + ", networkPassphrase=" + this.networkPassphrase + ", amount=" + this.amount + ", decimals=" + this.decimals + ", toAddress=" + this.toAddress + ", memo=" + this.memo + ", fee=" + this.fee + ", timeout=" + this.timeout + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.pi.PiTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PiTransaction> serializer() {
            return PiTransaction$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PiTransaction(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i, FrameMetricsAggregator.EVERY_DURATION, PiTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.sequence = str2;
        this.networkPassphrase = str3;
        this.amount = str4;
        this.decimals = str5;
        this.toAddress = str6;
        this.memo = str7;
        this.fee = str8;
        this.timeout = str9;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(PiTransaction piTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        PiBaseTransaction.write$Self(piTransaction, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, piTransaction.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, piTransaction.sequence);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, piTransaction.networkPassphrase);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, piTransaction.amount);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, piTransaction.decimals);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, piTransaction.toAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, piTransaction.memo);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, piTransaction.fee);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, piTransaction.timeout);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PiTransaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
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
        this.amount = str4;
        this.decimals = str5;
        this.toAddress = str6;
        this.memo = str7;
        this.fee = str8;
        this.timeout = str9;
    }
}
