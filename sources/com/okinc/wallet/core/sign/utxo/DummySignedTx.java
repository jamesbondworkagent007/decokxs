package com.okinc.wallet.core.sign.utxo;

import java.util.ArrayList;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class DummySignedTx {
    private ArrayList<UTXOTxIn> out;
    private String rawTransaction;
    private List<String> signHashList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(UTXOTxIn$$serializer.INSTANCE), new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DummySignedTx() {
        this((String) null, (ArrayList) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.wallet.core.sign.utxo.DummySignedTx */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DummySignedTx copy$default(DummySignedTx dummySignedTx, String str, ArrayList arrayList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dummySignedTx.rawTransaction;
        }
        if ((i & 2) != 0) {
            arrayList = dummySignedTx.out;
        }
        if ((i & 4) != 0) {
            list = dummySignedTx.signHashList;
        }
        return dummySignedTx.copy(str, arrayList, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.rawTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<UTXOTxIn> component2() {
        return this.out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.signHashList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DummySignedTx copy(@NotNull String str, @NotNull ArrayList<UTXOTxIn> arrayList, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new DummySignedTx(str, arrayList, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DummySignedTx)) {
            return false;
        }
        DummySignedTx dummySignedTx = (DummySignedTx) obj;
        return Intrinsics.EZpvd((Object) this.rawTransaction, (Object) dummySignedTx.rawTransaction) && Intrinsics.EZpvd(this.out, dummySignedTx.out) && Intrinsics.EZpvd(this.signHashList, dummySignedTx.signHashList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<UTXOTxIn> getOut() {
        return this.out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRawTransaction() {
        return this.rawTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSignHashList() {
        return this.signHashList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.rawTransaction.hashCode();
        int iHashCode2 = this.out.hashCode();
        List<String> list = this.signHashList;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOut(@NotNull ArrayList<UTXOTxIn> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.out = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRawTransaction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rawTransaction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignHashList(List<String> list) {
        this.signHashList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DummySignedTx(rawTransaction=" + this.rawTransaction + ", out=" + this.out + ", signHashList=" + this.signHashList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.utxo.DummySignedTx.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DummySignedTx> serializer() {
            return DummySignedTx$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DummySignedTx(int i, String str, ArrayList arrayList, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.rawTransaction = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.out = new ArrayList<>();
        } else {
            this.out = arrayList;
        }
        if ((i & 4) == 0) {
            this.signHashList = null;
        } else {
            this.signHashList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(DummySignedTx dummySignedTx, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dummySignedTx.rawTransaction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dummySignedTx.rawTransaction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(dummySignedTx.out, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], dummySignedTx.out);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && dummySignedTx.signHashList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], dummySignedTx.signHashList);
    }

    public DummySignedTx(@NotNull String str, @NotNull ArrayList<UTXOTxIn> arrayList, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.rawTransaction = str;
        this.out = arrayList;
        this.signHashList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x000c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:61) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.ArrayList))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.lang.String, java.util.ArrayList<com.okinc.wallet.core.sign.utxo.UTXOTxIn>, java.util.List<java.lang.String>):void (m)] (LINE:59) call: com.okinc.wallet.core.sign.utxo.DummySignedTx.<init>(java.lang.String, java.util.ArrayList, java.util.List):void type: THIS */
    public /* synthetic */ DummySignedTx(String str, ArrayList arrayList, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : list);
    }
}
