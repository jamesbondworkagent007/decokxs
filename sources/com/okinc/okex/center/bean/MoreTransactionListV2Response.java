package com.okinc.okex.center.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class MoreTransactionListV2Response {
    private final boolean hasMore;
    private final List<TransactionBeanV2> list;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(TransactionBeanV2$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MoreTransactionListV2Response() {
        this(false, (List) null, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.center.bean.MoreTransactionListV2Response */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MoreTransactionListV2Response copy$default(MoreTransactionListV2Response moreTransactionListV2Response, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = moreTransactionListV2Response.hasMore;
        }
        if ((i & 2) != 0) {
            list = moreTransactionListV2Response.list;
        }
        return moreTransactionListV2Response.copy(z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.hasMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransactionBeanV2> component2() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MoreTransactionListV2Response copy(boolean z, List<TransactionBeanV2> list) {
        return new MoreTransactionListV2Response(z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoreTransactionListV2Response)) {
            return false;
        }
        MoreTransactionListV2Response moreTransactionListV2Response = (MoreTransactionListV2Response) obj;
        return this.hasMore == moreTransactionListV2Response.hasMore && Intrinsics.EZpvd(this.list, moreTransactionListV2Response.list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransactionBeanV2> getList() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.hasMore);
        List<TransactionBeanV2> list = this.list;
        return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MoreTransactionListV2Response(hasMore=" + this.hasMore + ", list=" + this.list + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.MoreTransactionListV2Response.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MoreTransactionListV2Response> serializer() {
            return MoreTransactionListV2Response$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MoreTransactionListV2Response(int i, boolean z, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.hasMore = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.list = null;
        } else {
            this.list = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(MoreTransactionListV2Response moreTransactionListV2Response, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || moreTransactionListV2Response.hasMore) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, moreTransactionListV2Response.hasMore);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && moreTransactionListV2Response.list == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], moreTransactionListV2Response.list);
    }

    public MoreTransactionListV2Response(boolean z, List<TransactionBeanV2> list) {
        this.hasMore = z;
        this.list = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
 A[MD:(boolean, java.util.List<com.okinc.okex.center.bean.TransactionBeanV2>):void (m)] (LINE:8) call: com.okinc.okex.center.bean.MoreTransactionListV2Response.<init>(boolean, java.util.List):void type: THIS */
    public /* synthetic */ MoreTransactionListV2Response(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : list);
    }
}
