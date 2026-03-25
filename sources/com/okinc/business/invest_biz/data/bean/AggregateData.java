package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class AggregateData {
    public final List<AggregateItem> aggregateList;
    public final boolean hasViewMore;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(AggregateItem$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AggregateData() {
        this((List) null, false, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.AggregateData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AggregateData copy$default(AggregateData aggregateData, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aggregateData.aggregateList;
        }
        if ((i & 2) != 0) {
            z = aggregateData.hasViewMore;
        }
        return aggregateData.OLrzqt(list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AggregateItem> EZpvd() {
        return this.aggregateList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.hasViewMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AggregateData OLrzqt(@NotNull List<AggregateItem> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        return new AggregateData(list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AggregateData)) {
            return false;
        }
        AggregateData aggregateData = (AggregateData) obj;
        return Intrinsics.EZpvd(this.aggregateList, aggregateData.aggregateList) && this.hasViewMore == aggregateData.hasViewMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.aggregateList.hashCode() * 31) + Boolean.hashCode(this.hasViewMore);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AggregateData(aggregateList=" + this.aggregateList + ", hasViewMore=" + this.hasViewMore + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.AggregateData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AggregateData> serializer() {
            return AggregateData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AggregateData(int i, List list, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.aggregateList = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.hasViewMore = false;
        } else {
            this.hasViewMore = z;
        }
    }

    public static final /* synthetic */ void OLrzqt(AggregateData aggregateData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(aggregateData.aggregateList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], aggregateData.aggregateList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || aggregateData.hasViewMore) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, aggregateData.hasViewMore);
        }
    }

    public AggregateData(@NotNull List<AggregateItem> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.aggregateList = list;
        this.hasViewMore = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:302)) : (r1v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.AggregateItem>, boolean):void (m)] (LINE:300) call: com.okinc.business.invest_biz.data.bean.AggregateData.<init>(java.util.List, boolean):void type: THIS */
    public /* synthetic */ AggregateData(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? false : z);
    }
}
