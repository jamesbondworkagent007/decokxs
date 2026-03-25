package com.okinc.wallet.core.sign.utxo;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class RuneMainMintTransactionResult {
    public final long cost;
    public final List<Long> fees;
    public final List<RunesTransactionResult> txnList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(RunesTransactionResult$$serializer.INSTANCE), new ArrayListSerializer(LongSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RuneMainMintTransactionResult() {
        this((List) null, (List) null, 0L, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.wallet.core.sign.utxo.RuneMainMintTransactionResult */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RuneMainMintTransactionResult copy$default(RuneMainMintTransactionResult runeMainMintTransactionResult, List list, List list2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            list = runeMainMintTransactionResult.txnList;
        }
        if ((i & 2) != 0) {
            list2 = runeMainMintTransactionResult.fees;
        }
        if ((i & 4) != 0) {
            j = runeMainMintTransactionResult.cost;
        }
        return runeMainMintTransactionResult.copydefault(list, list2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.cost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RuneMainMintTransactionResult copydefault(@NotNull List<RunesTransactionResult> list, @NotNull List<Long> list2, long j) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new RuneMainMintTransactionResult(list, list2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RunesTransactionResult> copydefault() {
        return this.txnList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuneMainMintTransactionResult)) {
            return false;
        }
        RuneMainMintTransactionResult runeMainMintTransactionResult = (RuneMainMintTransactionResult) obj;
        return Intrinsics.EZpvd(this.txnList, runeMainMintTransactionResult.txnList) && Intrinsics.EZpvd(this.fees, runeMainMintTransactionResult.fees) && this.cost == runeMainMintTransactionResult.cost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.txnList.hashCode() * 31) + this.fees.hashCode()) * 31) + Long.hashCode(this.cost);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RuneMainMintTransactionResult(txnList=" + this.txnList + ", fees=" + this.fees + ", cost=" + this.cost + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.utxo.RuneMainMintTransactionResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RuneMainMintTransactionResult> serializer() {
            return RuneMainMintTransactionResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RuneMainMintTransactionResult(int i, List list, List list2, long j, SerializationConstructorMarker serializationConstructorMarker) {
        this.txnList = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.fees = yDY.AhwBna();
        } else {
            this.fees = list2;
        }
        if ((i & 4) == 0) {
            this.cost = 0L;
        } else {
            this.cost = j;
        }
    }

    public static final /* synthetic */ void AEQbTJ(RuneMainMintTransactionResult runeMainMintTransactionResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(runeMainMintTransactionResult.txnList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], runeMainMintTransactionResult.txnList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(runeMainMintTransactionResult.fees, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], runeMainMintTransactionResult.fees);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && runeMainMintTransactionResult.cost == 0) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 2, runeMainMintTransactionResult.cost);
    }

    public RuneMainMintTransactionResult(@NotNull List<RunesTransactionResult> list, @NotNull List<Long> list2, long j) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.txnList = list;
        this.fees = list2;
        this.cost = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:125)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:127)) : (r2v0 java.util.List))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0010: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r3v0 long))
 A[MD:(java.util.List<com.okinc.wallet.core.sign.utxo.RunesTransactionResult>, java.util.List<java.lang.Long>, long):void (m)] (LINE:123) call: com.okinc.wallet.core.sign.utxo.RuneMainMintTransactionResult.<init>(java.util.List, java.util.List, long):void type: THIS */
    public /* synthetic */ RuneMainMintTransactionResult(List list, List list2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? 0L : j);
    }

    public final boolean OLrzqt() {
        return this.txnList.isEmpty() && this.fees.isEmpty();
    }
}
