package com.okinc.crcore.coreapi.net.responsebean;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class TxnActivityFilterResponseBean {
    private final List<ActivityStatusVO> activityStatusFilter;
    private final List<ActivityTypeVO> activityTypeFilter;
    private final List<ActivityCurrencyVO> currencyFilter;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(ActivityTypeVO$$serializer.INSTANCE), new ArrayListSerializer(ActivityStatusVO$$serializer.INSTANCE), new ArrayListSerializer(ActivityCurrencyVO$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TxnActivityFilterResponseBean() {
        this((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.TxnActivityFilterResponseBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TxnActivityFilterResponseBean copy$default(TxnActivityFilterResponseBean txnActivityFilterResponseBean, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = txnActivityFilterResponseBean.activityTypeFilter;
        }
        if ((i & 2) != 0) {
            list2 = txnActivityFilterResponseBean.activityStatusFilter;
        }
        if ((i & 4) != 0) {
            list3 = txnActivityFilterResponseBean.currencyFilter;
        }
        return txnActivityFilterResponseBean.copy(list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ActivityTypeVO> component1() {
        return this.activityTypeFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ActivityStatusVO> component2() {
        return this.activityStatusFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ActivityCurrencyVO> component3() {
        return this.currencyFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxnActivityFilterResponseBean copy(@NotNull List<ActivityTypeVO> list, @NotNull List<ActivityStatusVO> list2, @NotNull List<ActivityCurrencyVO> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new TxnActivityFilterResponseBean(list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TxnActivityFilterResponseBean)) {
            return false;
        }
        TxnActivityFilterResponseBean txnActivityFilterResponseBean = (TxnActivityFilterResponseBean) obj;
        return Intrinsics.EZpvd(this.activityTypeFilter, txnActivityFilterResponseBean.activityTypeFilter) && Intrinsics.EZpvd(this.activityStatusFilter, txnActivityFilterResponseBean.activityStatusFilter) && Intrinsics.EZpvd(this.currencyFilter, txnActivityFilterResponseBean.currencyFilter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ActivityStatusVO> getActivityStatusFilter() {
        return this.activityStatusFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ActivityTypeVO> getActivityTypeFilter() {
        return this.activityTypeFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ActivityCurrencyVO> getCurrencyFilter() {
        return this.currencyFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.activityTypeFilter.hashCode() * 31) + this.activityStatusFilter.hashCode()) * 31) + this.currencyFilter.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TxnActivityFilterResponseBean(activityTypeFilter=" + this.activityTypeFilter + ", activityStatusFilter=" + this.activityStatusFilter + ", currencyFilter=" + this.currencyFilter + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.TxnActivityFilterResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TxnActivityFilterResponseBean> serializer() {
            return TxnActivityFilterResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TxnActivityFilterResponseBean(int i, List list, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        this.activityTypeFilter = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.activityStatusFilter = yDY.AhwBna();
        } else {
            this.activityStatusFilter = list2;
        }
        if ((i & 4) == 0) {
            this.currencyFilter = yDY.AhwBna();
        } else {
            this.currencyFilter = list3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [20=4] */
    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(TxnActivityFilterResponseBean txnActivityFilterResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(txnActivityFilterResponseBean.activityTypeFilter, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], txnActivityFilterResponseBean.activityTypeFilter);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(txnActivityFilterResponseBean.activityStatusFilter, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], txnActivityFilterResponseBean.activityStatusFilter);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(txnActivityFilterResponseBean.currencyFilter, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], txnActivityFilterResponseBean.currencyFilter);
    }

    public TxnActivityFilterResponseBean(@NotNull List<ActivityTypeVO> list, @NotNull List<ActivityStatusVO> list2, @NotNull List<ActivityCurrencyVO> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.activityTypeFilter = list;
        this.activityStatusFilter = list2;
        this.currencyFilter = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:31)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:40)) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:49)) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.crcore.coreapi.net.responsebean.ActivityTypeVO>, java.util.List<com.okinc.crcore.coreapi.net.responsebean.ActivityStatusVO>, java.util.List<com.okinc.crcore.coreapi.net.responsebean.ActivityCurrencyVO>):void (m)] (LINE:23) call: com.okinc.crcore.coreapi.net.responsebean.TxnActivityFilterResponseBean.<init>(java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ TxnActivityFilterResponseBean(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? yDY.AhwBna() : list3);
    }
}
