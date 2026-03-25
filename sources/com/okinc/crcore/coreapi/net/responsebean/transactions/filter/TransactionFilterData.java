package com.okinc.crcore.coreapi.net.responsebean.transactions.filter;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class TransactionFilterData {
    public final List<BillTypeFilter> billTypeFilterList;
    public final List<CoinFilter> coinFilterList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(BillTypeFilter$$serializer.INSTANCE), new ArrayListSerializer(CoinFilter$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionFilterData() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.transactions.filter.TransactionFilterData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionFilterData copy$default(TransactionFilterData transactionFilterData, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = transactionFilterData.billTypeFilterList;
        }
        if ((i & 2) != 0) {
            list2 = transactionFilterData.coinFilterList;
        }
        return transactionFilterData.OLrzqt(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionFilterData OLrzqt(@NotNull List<BillTypeFilter> list, @NotNull List<CoinFilter> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new TransactionFilterData(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionFilterData)) {
            return false;
        }
        TransactionFilterData transactionFilterData = (TransactionFilterData) obj;
        return Intrinsics.EZpvd(this.billTypeFilterList, transactionFilterData.billTypeFilterList) && Intrinsics.EZpvd(this.coinFilterList, transactionFilterData.coinFilterList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.billTypeFilterList.hashCode() * 31) + this.coinFilterList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionFilterData(billTypeFilterList=" + this.billTypeFilterList + ", coinFilterList=" + this.coinFilterList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.transactions.filter.TransactionFilterData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransactionFilterData> serializer() {
            return TransactionFilterData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransactionFilterData(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.billTypeFilterList = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.coinFilterList = yDY.AhwBna();
        } else {
            this.coinFilterList = list2;
        }
    }

    public static final /* synthetic */ void AEQbTJ(TransactionFilterData transactionFilterData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(transactionFilterData.billTypeFilterList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], transactionFilterData.billTypeFilterList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(transactionFilterData.coinFilterList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], transactionFilterData.coinFilterList);
    }

    public TransactionFilterData(@NotNull List<BillTypeFilter> list, @NotNull List<CoinFilter> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.billTypeFilterList = list;
        this.coinFilterList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:9)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:10)) : (r2v0 java.util.List))
 A[MD:(java.util.List<com.okinc.crcore.coreapi.net.responsebean.transactions.filter.BillTypeFilter>, java.util.List<com.okinc.crcore.coreapi.net.responsebean.transactions.filter.CoinFilter>):void (m)] (LINE:8) call: com.okinc.crcore.coreapi.net.responsebean.transactions.filter.TransactionFilterData.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ TransactionFilterData(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2);
    }
}
