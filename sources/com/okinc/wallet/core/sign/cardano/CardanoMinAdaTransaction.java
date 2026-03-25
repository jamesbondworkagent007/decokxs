package com.okinc.wallet.core.sign.cardano;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class CardanoMinAdaTransaction {
    private String address;
    private List<CardanoMultiAsset> multiAsset;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(CardanoMultiAsset$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CardanoMinAdaTransaction() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.wallet.core.sign.cardano.CardanoMinAdaTransaction */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardanoMinAdaTransaction copy$default(CardanoMinAdaTransaction cardanoMinAdaTransaction, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardanoMinAdaTransaction.address;
        }
        if ((i & 2) != 0) {
            list = cardanoMinAdaTransaction.multiAsset;
        }
        return cardanoMinAdaTransaction.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CardanoMultiAsset> component2() {
        return this.multiAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardanoMinAdaTransaction copy(String str, List<CardanoMultiAsset> list) {
        return new CardanoMinAdaTransaction(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardanoMinAdaTransaction)) {
            return false;
        }
        CardanoMinAdaTransaction cardanoMinAdaTransaction = (CardanoMinAdaTransaction) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) cardanoMinAdaTransaction.address) && Intrinsics.EZpvd(this.multiAsset, cardanoMinAdaTransaction.multiAsset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CardanoMultiAsset> getMultiAsset() {
        return this.multiAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<CardanoMultiAsset> list = this.multiAsset;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMultiAsset(List<CardanoMultiAsset> list) {
        this.multiAsset = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CardanoMinAdaTransaction(address=" + this.address + ", multiAsset=" + this.multiAsset + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.cardano.CardanoMinAdaTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CardanoMinAdaTransaction> serializer() {
            return CardanoMinAdaTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CardanoMinAdaTransaction(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.address = null;
        } else {
            this.address = str;
        }
        if ((i & 2) == 0) {
            this.multiAsset = null;
        } else {
            this.multiAsset = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(CardanoMinAdaTransaction cardanoMinAdaTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || cardanoMinAdaTransaction.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, cardanoMinAdaTransaction.address);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && cardanoMinAdaTransaction.multiAsset == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], cardanoMinAdaTransaction.multiAsset);
    }

    public CardanoMinAdaTransaction(String str, List<CardanoMultiAsset> list) {
        this.address = str;
        this.multiAsset = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.wallet.core.sign.cardano.CardanoMultiAsset>):void (m)] (LINE:48) call: com.okinc.wallet.core.sign.cardano.CardanoMinAdaTransaction.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ CardanoMinAdaTransaction(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
