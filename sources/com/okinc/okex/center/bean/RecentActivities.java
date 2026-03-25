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
public final class RecentActivities {
    private final Integer hasIssueCount;
    private final List<TransactionBean> list;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(TransactionBean$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecentActivities() {
        this((Integer) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.center.bean.RecentActivities */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecentActivities copy$default(RecentActivities recentActivities, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = recentActivities.hasIssueCount;
        }
        if ((i & 2) != 0) {
            list = recentActivities.list;
        }
        return recentActivities.copy(num, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.hasIssueCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransactionBean> component2() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecentActivities copy(Integer num, List<TransactionBean> list) {
        return new RecentActivities(num, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentActivities)) {
            return false;
        }
        RecentActivities recentActivities = (RecentActivities) obj;
        return Intrinsics.EZpvd(this.hasIssueCount, recentActivities.hasIssueCount) && Intrinsics.EZpvd(this.list, recentActivities.list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getHasIssueCount() {
        return this.hasIssueCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransactionBean> getList() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.hasIssueCount;
        int iHashCode = num == null ? 0 : num.hashCode();
        List<TransactionBean> list = this.list;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecentActivities(hasIssueCount=" + this.hasIssueCount + ", list=" + this.list + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.RecentActivities.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecentActivities> serializer() {
            return RecentActivities$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecentActivities(int i, Integer num, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.hasIssueCount = null;
        } else {
            this.hasIssueCount = num;
        }
        if ((i & 2) == 0) {
            this.list = null;
        } else {
            this.list = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(RecentActivities recentActivities, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || recentActivities.hasIssueCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, recentActivities.hasIssueCount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && recentActivities.list == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], recentActivities.list);
    }

    public RecentActivities(Integer num, List<TransactionBean> list) {
        this.hasIssueCount = num;
        this.list = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.lang.Integer, java.util.List<com.okinc.okex.center.bean.TransactionBean>):void (m)] (LINE:63) call: com.okinc.okex.center.bean.RecentActivities.<init>(java.lang.Integer, java.util.List):void type: THIS */
    public /* synthetic */ RecentActivities(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
