package com.okinc.wallet.core.sign.cardano;

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
public final class CardanoTransaction {
    private String amount;
    private String changeAddress;
    private List<CardanoTxIn> inputs;
    private boolean max;
    private List<CardanoMultiAsset> multiAsset;
    private String toAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(CardanoTxIn$$serializer.INSTANCE), null, null, new ArrayListSerializer(CardanoMultiAsset$$serializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.wallet.core.sign.cardano.CardanoTransaction */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardanoTransaction copy$default(CardanoTransaction cardanoTransaction, List list, String str, String str2, List list2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cardanoTransaction.inputs;
        }
        if ((i & 2) != 0) {
            str = cardanoTransaction.toAddress;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = cardanoTransaction.amount;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            list2 = cardanoTransaction.multiAsset;
        }
        List list3 = list2;
        if ((i & 16) != 0) {
            str3 = cardanoTransaction.changeAddress;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            z = cardanoTransaction.max;
        }
        return cardanoTransaction.copy(list, str4, str5, list3, str6, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CardanoTxIn> component1() {
        return this.inputs;
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
    public final List<CardanoMultiAsset> component4() {
        return this.multiAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.changeAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardanoTransaction copy(@NotNull List<CardanoTxIn> list, @NotNull String str, @NotNull String str2, List<CardanoMultiAsset> list2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CardanoTransaction(list, str, str2, list2, str3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardanoTransaction)) {
            return false;
        }
        CardanoTransaction cardanoTransaction = (CardanoTransaction) obj;
        return Intrinsics.EZpvd(this.inputs, cardanoTransaction.inputs) && Intrinsics.EZpvd((Object) this.toAddress, (Object) cardanoTransaction.toAddress) && Intrinsics.EZpvd((Object) this.amount, (Object) cardanoTransaction.amount) && Intrinsics.EZpvd(this.multiAsset, cardanoTransaction.multiAsset) && Intrinsics.EZpvd((Object) this.changeAddress, (Object) cardanoTransaction.changeAddress) && this.max == cardanoTransaction.max;
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
    public final List<CardanoTxIn> getInputs() {
        return this.inputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMax() {
        return this.max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CardanoMultiAsset> getMultiAsset() {
        return this.multiAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAddress() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.inputs.hashCode();
        int iHashCode2 = this.toAddress.hashCode();
        int iHashCode3 = this.amount.hashCode();
        List<CardanoMultiAsset> list = this.multiAsset;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.changeAddress.hashCode()) * 31) + Boolean.hashCode(this.max);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.changeAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputs(@NotNull List<CardanoTxIn> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.inputs = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMax(boolean z) {
        this.max = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMultiAsset(List<CardanoMultiAsset> list) {
        this.multiAsset = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CardanoTransaction(inputs=" + this.inputs + ", toAddress=" + this.toAddress + ", amount=" + this.amount + ", multiAsset=" + this.multiAsset + ", changeAddress=" + this.changeAddress + ", max=" + this.max + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.cardano.CardanoTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CardanoTransaction> serializer() {
            return CardanoTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CardanoTransaction(int i, List list, String str, String str2, List list2, String str3, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (55 != (i & 55)) {
            PluginExceptionsKt.throwMissingFieldException(i, 55, CardanoTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.inputs = list;
        this.toAddress = str;
        this.amount = str2;
        if ((i & 8) == 0) {
            this.multiAsset = null;
        } else {
            this.multiAsset = list2;
        }
        this.changeAddress = str3;
        this.max = z;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(CardanoTransaction cardanoTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], cardanoTransaction.inputs);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, cardanoTransaction.toAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, cardanoTransaction.amount);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || cardanoTransaction.multiAsset != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], cardanoTransaction.multiAsset);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, cardanoTransaction.changeAddress);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 5, cardanoTransaction.max);
    }

    public CardanoTransaction(@NotNull List<CardanoTxIn> list, @NotNull String str, @NotNull String str2, List<CardanoMultiAsset> list2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.inputs = list;
        this.toAddress = str;
        this.amount = str2;
        this.multiAsset = list2;
        this.changeAddress = str3;
        this.max = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r8v0 java.util.List)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r11v0 java.util.List))
  (r12v0 java.lang.String)
  (r13v0 boolean)
 A[MD:(java.util.List<com.okinc.wallet.core.sign.cardano.CardanoTxIn>, java.lang.String, java.lang.String, java.util.List<com.okinc.wallet.core.sign.cardano.CardanoMultiAsset>, java.lang.String, boolean):void (m)] (LINE:11) call: com.okinc.wallet.core.sign.cardano.CardanoTransaction.<init>(java.util.List, java.lang.String, java.lang.String, java.util.List, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ CardanoTransaction(List list, String str, String str2, List list2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, (i & 8) != 0 ? null : list2, str3, z);
    }
}
