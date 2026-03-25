package com.okinc.crcore.coreapi.net.responsebean.transactions.buysellothers;

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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class TransactionActivityList {
    private final List<ActivityHistoryVO> activities;
    private final Integer recordNum;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(ActivityHistoryVO$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionActivityList() {
        this((List) null, (Integer) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.transactions.buysellothers.TransactionActivityList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionActivityList copy$default(TransactionActivityList transactionActivityList, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = transactionActivityList.activities;
        }
        if ((i & 2) != 0) {
            num = transactionActivityList.recordNum;
        }
        return transactionActivityList.copy(list, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ActivityHistoryVO> component1() {
        return this.activities;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.recordNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionActivityList copy(@NotNull List<ActivityHistoryVO> list, Integer num) {
        Intrinsics.checkNotNullParameter(list, "");
        return new TransactionActivityList(list, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionActivityList)) {
            return false;
        }
        TransactionActivityList transactionActivityList = (TransactionActivityList) obj;
        return Intrinsics.EZpvd(this.activities, transactionActivityList.activities) && Intrinsics.EZpvd(this.recordNum, transactionActivityList.recordNum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ActivityHistoryVO> getActivities() {
        return this.activities;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRecordNum() {
        return this.recordNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.activities.hashCode();
        Integer num = this.recordNum;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionActivityList(activities=" + this.activities + ", recordNum=" + this.recordNum + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.transactions.buysellothers.TransactionActivityList.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransactionActivityList> serializer() {
            return TransactionActivityList$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransactionActivityList(int i, List list, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        this.activities = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.recordNum = null;
        } else {
            this.recordNum = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(TransactionActivityList transactionActivityList, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(transactionActivityList.activities, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], transactionActivityList.activities);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && transactionActivityList.recordNum == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, transactionActivityList.recordNum);
    }

    public TransactionActivityList(@NotNull List<ActivityHistoryVO> list, Integer num) {
        Intrinsics.checkNotNullParameter(list, "");
        this.activities = list;
        this.recordNum = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:12)) : (r1v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
 A[MD:(java.util.List<com.okinc.crcore.coreapi.net.responsebean.transactions.buysellothers.ActivityHistoryVO>, java.lang.Integer):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.transactions.buysellothers.TransactionActivityList.<init>(java.util.List, java.lang.Integer):void type: THIS */
    public /* synthetic */ TransactionActivityList(List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? null : num);
    }
}
