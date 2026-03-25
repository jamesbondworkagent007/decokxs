package com.okinc.wallet.core.sign.kaspa;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class KaspaTransaction {
    private final String amount;
    private final String changeAddress;
    private final String fee;
    private final String minOutput;
    private final String toAddress;
    private final List<KaspaTxIn> txInputs;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(KaspaTxIn$$serializer.INSTANCE), null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.wallet.core.sign.kaspa.KaspaTransaction */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KaspaTransaction copy$default(KaspaTransaction kaspaTransaction, List list, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = kaspaTransaction.txInputs;
        }
        if ((i & 2) != 0) {
            str = kaspaTransaction.toAddress;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = kaspaTransaction.amount;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = kaspaTransaction.fee;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = kaspaTransaction.changeAddress;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = kaspaTransaction.minOutput;
        }
        return kaspaTransaction.copy(list, str6, str7, str8, str9, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<KaspaTxIn> component1() {
        return this.txInputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.changeAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.minOutput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KaspaTransaction copy(@NotNull List<KaspaTxIn> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new KaspaTransaction(list, str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KaspaTransaction)) {
            return false;
        }
        KaspaTransaction kaspaTransaction = (KaspaTransaction) obj;
        return Intrinsics.EZpvd(this.txInputs, kaspaTransaction.txInputs) && Intrinsics.EZpvd((Object) this.toAddress, (Object) kaspaTransaction.toAddress) && Intrinsics.EZpvd((Object) this.amount, (Object) kaspaTransaction.amount) && Intrinsics.EZpvd((Object) this.fee, (Object) kaspaTransaction.fee) && Intrinsics.EZpvd((Object) this.changeAddress, (Object) kaspaTransaction.changeAddress) && Intrinsics.EZpvd((Object) this.minOutput, (Object) kaspaTransaction.minOutput);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeAddress() {
        return this.changeAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinOutput() {
        return this.minOutput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAddress() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<KaspaTxIn> getTxInputs() {
        return this.txInputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.txInputs.hashCode() * 31) + this.toAddress.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.fee.hashCode()) * 31) + this.changeAddress.hashCode()) * 31) + this.minOutput.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KaspaTransaction(txInputs=" + this.txInputs + ", toAddress=" + this.toAddress + ", amount=" + this.amount + ", fee=" + this.fee + ", changeAddress=" + this.changeAddress + ", minOutput=" + this.minOutput + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.kaspa.KaspaTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KaspaTransaction> serializer() {
            return KaspaTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KaspaTransaction(int i, List list, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, KaspaTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.txInputs = list;
        this.toAddress = str;
        this.amount = str2;
        this.fee = str3;
        this.changeAddress = str4;
        this.minOutput = str5;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(KaspaTransaction kaspaTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], kaspaTransaction.txInputs);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, kaspaTransaction.toAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, kaspaTransaction.amount);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, kaspaTransaction.fee);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, kaspaTransaction.changeAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, kaspaTransaction.minOutput);
    }

    public KaspaTransaction(@NotNull List<KaspaTxIn> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.txInputs = list;
        this.toAddress = str;
        this.amount = str2;
        this.fee = str3;
        this.changeAddress = str4;
        this.minOutput = str5;
    }
}
