package com.okinc.okex.center.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class TransactionListV2Response {
    private static final KSerializer<Object>[] $childSerializers;
    private final ContextualScenarios contextualScenarios;
    private final List<TransactionBeanV2> deposit;
    private final HasMoreTransactions hasMore;
    private final List<TransactionBeanV2> p2p;
    private final Integer pastNumberOfDays;
    private final List<TransactionBeanV2> withdraw;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionListV2Response() {
        this((ContextualScenarios) null, (List) null, (List) null, (List) null, (Integer) null, (HasMoreTransactions) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.okex.center.bean.TransactionListV2Response */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionListV2Response copy$default(TransactionListV2Response transactionListV2Response, ContextualScenarios contextualScenarios, List list, List list2, List list3, Integer num, HasMoreTransactions hasMoreTransactions, int i, Object obj) {
        if ((i & 1) != 0) {
            contextualScenarios = transactionListV2Response.contextualScenarios;
        }
        if ((i & 2) != 0) {
            list = transactionListV2Response.deposit;
        }
        List list4 = list;
        if ((i & 4) != 0) {
            list2 = transactionListV2Response.withdraw;
        }
        List list5 = list2;
        if ((i & 8) != 0) {
            list3 = transactionListV2Response.p2p;
        }
        List list6 = list3;
        if ((i & 16) != 0) {
            num = transactionListV2Response.pastNumberOfDays;
        }
        Integer num2 = num;
        if ((i & 32) != 0) {
            hasMoreTransactions = transactionListV2Response.hasMore;
        }
        return transactionListV2Response.copy(contextualScenarios, list4, list5, list6, num2, hasMoreTransactions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextualScenarios component1() {
        return this.contextualScenarios;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransactionBeanV2> component2() {
        return this.deposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransactionBeanV2> component3() {
        return this.withdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransactionBeanV2> component4() {
        return this.p2p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.pastNumberOfDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HasMoreTransactions component6() {
        return this.hasMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionListV2Response copy(ContextualScenarios contextualScenarios, List<TransactionBeanV2> list, List<TransactionBeanV2> list2, List<TransactionBeanV2> list3, Integer num, HasMoreTransactions hasMoreTransactions) {
        return new TransactionListV2Response(contextualScenarios, list, list2, list3, num, hasMoreTransactions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionListV2Response)) {
            return false;
        }
        TransactionListV2Response transactionListV2Response = (TransactionListV2Response) obj;
        return Intrinsics.EZpvd(this.contextualScenarios, transactionListV2Response.contextualScenarios) && Intrinsics.EZpvd(this.deposit, transactionListV2Response.deposit) && Intrinsics.EZpvd(this.withdraw, transactionListV2Response.withdraw) && Intrinsics.EZpvd(this.p2p, transactionListV2Response.p2p) && Intrinsics.EZpvd(this.pastNumberOfDays, transactionListV2Response.pastNumberOfDays) && Intrinsics.EZpvd(this.hasMore, transactionListV2Response.hasMore);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextualScenarios getContextualScenarios() {
        return this.contextualScenarios;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransactionBeanV2> getDeposit() {
        return this.deposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HasMoreTransactions getHasMore() {
        return this.hasMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransactionBeanV2> getP2p() {
        return this.p2p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPastNumberOfDays() {
        return this.pastNumberOfDays;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransactionBeanV2> getWithdraw() {
        return this.withdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ContextualScenarios contextualScenarios = this.contextualScenarios;
        int iHashCode = contextualScenarios == null ? 0 : contextualScenarios.hashCode();
        List<TransactionBeanV2> list = this.deposit;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        List<TransactionBeanV2> list2 = this.withdraw;
        int iHashCode3 = list2 == null ? 0 : list2.hashCode();
        List<TransactionBeanV2> list3 = this.p2p;
        int iHashCode4 = list3 == null ? 0 : list3.hashCode();
        Integer num = this.pastNumberOfDays;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        HasMoreTransactions hasMoreTransactions = this.hasMore;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (hasMoreTransactions != null ? hasMoreTransactions.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionListV2Response(contextualScenarios=" + this.contextualScenarios + ", deposit=" + this.deposit + ", withdraw=" + this.withdraw + ", p2p=" + this.p2p + ", pastNumberOfDays=" + this.pastNumberOfDays + ", hasMore=" + this.hasMore + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.TransactionListV2Response.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransactionListV2Response> serializer() {
            return TransactionListV2Response$$serializer.INSTANCE;
        }
    }

    static {
        TransactionBeanV2$$serializer transactionBeanV2$$serializer = TransactionBeanV2$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(transactionBeanV2$$serializer), new ArrayListSerializer(transactionBeanV2$$serializer), new ArrayListSerializer(transactionBeanV2$$serializer), null, null};
    }

    public /* synthetic */ TransactionListV2Response(int i, ContextualScenarios contextualScenarios, List list, List list2, List list3, Integer num, HasMoreTransactions hasMoreTransactions, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.contextualScenarios = null;
        } else {
            this.contextualScenarios = contextualScenarios;
        }
        if ((i & 2) == 0) {
            this.deposit = null;
        } else {
            this.deposit = list;
        }
        if ((i & 4) == 0) {
            this.withdraw = null;
        } else {
            this.withdraw = list2;
        }
        if ((i & 8) == 0) {
            this.p2p = null;
        } else {
            this.p2p = list3;
        }
        if ((i & 16) == 0) {
            this.pastNumberOfDays = null;
        } else {
            this.pastNumberOfDays = num;
        }
        if ((i & 32) == 0) {
            this.hasMore = null;
        } else {
            this.hasMore = hasMoreTransactions;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(TransactionListV2Response transactionListV2Response, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || transactionListV2Response.contextualScenarios != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, ContextualScenarios$$serializer.INSTANCE, transactionListV2Response.contextualScenarios);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || transactionListV2Response.deposit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], transactionListV2Response.deposit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || transactionListV2Response.withdraw != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], transactionListV2Response.withdraw);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || transactionListV2Response.p2p != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], transactionListV2Response.p2p);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || transactionListV2Response.pastNumberOfDays != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, transactionListV2Response.pastNumberOfDays);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && transactionListV2Response.hasMore == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, HasMoreTransactions$$serializer.INSTANCE, transactionListV2Response.hasMore);
    }

    public TransactionListV2Response(ContextualScenarios contextualScenarios, List<TransactionBeanV2> list, List<TransactionBeanV2> list2, List<TransactionBeanV2> list3, Integer num, HasMoreTransactions hasMoreTransactions) {
        this.contextualScenarios = contextualScenarios;
        this.deposit = list;
        this.withdraw = list2;
        this.p2p = list3;
        this.pastNumberOfDays = num;
        this.hasMore = hasMoreTransactions;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:com.okinc.okex.center.bean.ContextualScenarios:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.ContextualScenarios) : (r6v0 com.okinc.okex.center.bean.ContextualScenarios))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r7v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r8v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:com.okinc.okex.center.bean.HasMoreTransactions:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.HasMoreTransactions) : (r11v0 com.okinc.okex.center.bean.HasMoreTransactions))
 A[MD:(com.okinc.okex.center.bean.ContextualScenarios, java.util.List<com.okinc.okex.center.bean.TransactionBeanV2>, java.util.List<com.okinc.okex.center.bean.TransactionBeanV2>, java.util.List<com.okinc.okex.center.bean.TransactionBeanV2>, java.lang.Integer, com.okinc.okex.center.bean.HasMoreTransactions):void (m)] (LINE:24) call: com.okinc.okex.center.bean.TransactionListV2Response.<init>(com.okinc.okex.center.bean.ContextualScenarios, java.util.List, java.util.List, java.util.List, java.lang.Integer, com.okinc.okex.center.bean.HasMoreTransactions):void type: THIS */
    public /* synthetic */ TransactionListV2Response(ContextualScenarios contextualScenarios, List list, List list2, List list3, Integer num, HasMoreTransactions hasMoreTransactions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : contextualScenarios, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : hasMoreTransactions);
    }
}
