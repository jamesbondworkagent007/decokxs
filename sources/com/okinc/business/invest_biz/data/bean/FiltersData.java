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
public final class FiltersData {
    public static final KSerializer<Object>[] $childSerializers;
    public final List<FilterCondition> investTypeCondition;
    public final List<FilterCondition> networkCondition;
    public final List<FilterCondition> onlyCondition;
    public final List<FilterCondition> riskCondition;
    public final List<SortCondition> sortOrderCondition;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FiltersData() {
        this((List) null, (List) null, (List) null, (List) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.invest_biz.data.bean.FiltersData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FiltersData copy$default(FiltersData filtersData, List list, List list2, List list3, List list4, List list5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = filtersData.networkCondition;
        }
        if ((i & 2) != 0) {
            list2 = filtersData.onlyCondition;
        }
        List list6 = list2;
        if ((i & 4) != 0) {
            list3 = filtersData.sortOrderCondition;
        }
        List list7 = list3;
        if ((i & 8) != 0) {
            list4 = filtersData.riskCondition;
        }
        List list8 = list4;
        if ((i & 16) != 0) {
            list5 = filtersData.investTypeCondition;
        }
        return filtersData.OLrzqt(list, list6, list7, list8, list5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FilterCondition> AEQbTJ() {
        return this.investTypeCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FilterCondition> EZpvd() {
        return this.onlyCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FilterCondition> KWHzl() {
        return this.networkCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FiltersData OLrzqt(@NotNull List<FilterCondition> list, @NotNull List<FilterCondition> list2, @NotNull List<SortCondition> list3, @NotNull List<FilterCondition> list4, @NotNull List<FilterCondition> list5) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        return new FiltersData(list, list2, list3, list4, list5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FilterCondition> OLrzqt() {
        return this.riskCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SortCondition> djBIcL() {
        return this.sortOrderCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FiltersData)) {
            return false;
        }
        FiltersData filtersData = (FiltersData) obj;
        return Intrinsics.EZpvd(this.networkCondition, filtersData.networkCondition) && Intrinsics.EZpvd(this.onlyCondition, filtersData.onlyCondition) && Intrinsics.EZpvd(this.sortOrderCondition, filtersData.sortOrderCondition) && Intrinsics.EZpvd(this.riskCondition, filtersData.riskCondition) && Intrinsics.EZpvd(this.investTypeCondition, filtersData.investTypeCondition);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.networkCondition.hashCode() * 31) + this.onlyCondition.hashCode()) * 31) + this.sortOrderCondition.hashCode()) * 31) + this.riskCondition.hashCode()) * 31) + this.investTypeCondition.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FiltersData(networkCondition=" + this.networkCondition + ", onlyCondition=" + this.onlyCondition + ", sortOrderCondition=" + this.sortOrderCondition + ", riskCondition=" + this.riskCondition + ", investTypeCondition=" + this.investTypeCondition + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.FiltersData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FiltersData> serializer() {
            return FiltersData$$serializer.INSTANCE;
        }
    }

    static {
        FilterCondition$$serializer filterCondition$$serializer = FilterCondition$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(filterCondition$$serializer), new ArrayListSerializer(filterCondition$$serializer), new ArrayListSerializer(SortCondition$$serializer.INSTANCE), new ArrayListSerializer(filterCondition$$serializer), new ArrayListSerializer(filterCondition$$serializer)};
    }

    public /* synthetic */ FiltersData(int i, List list, List list2, List list3, List list4, List list5, SerializationConstructorMarker serializationConstructorMarker) {
        this.networkCondition = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.onlyCondition = yDY.AhwBna();
        } else {
            this.onlyCondition = list2;
        }
        if ((i & 4) == 0) {
            this.sortOrderCondition = yDY.AhwBna();
        } else {
            this.sortOrderCondition = list3;
        }
        if ((i & 8) == 0) {
            this.riskCondition = yDY.AhwBna();
        } else {
            this.riskCondition = list4;
        }
        if ((i & 16) == 0) {
            this.investTypeCondition = yDY.AhwBna();
        } else {
            this.investTypeCondition = list5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [460=6] */
    public static final /* synthetic */ void AEQbTJ(FiltersData filtersData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(filtersData.networkCondition, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], filtersData.networkCondition);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(filtersData.onlyCondition, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], filtersData.onlyCondition);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(filtersData.sortOrderCondition, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], filtersData.sortOrderCondition);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(filtersData.riskCondition, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], filtersData.riskCondition);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd(filtersData.investTypeCondition, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], filtersData.investTypeCondition);
    }

    public FiltersData(@NotNull List<FilterCondition> list, @NotNull List<FilterCondition> list2, @NotNull List<SortCondition> list3, @NotNull List<FilterCondition> list4, @NotNull List<FilterCondition> list5) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        this.networkCondition = list;
        this.onlyCondition = list2;
        this.sortOrderCondition = list3;
        this.riskCondition = list4;
        this.investTypeCondition = list5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:463)) : (r4v0 java.util.List))
  (wrap:java.util.List:0x0010: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:465)) : (r5v0 java.util.List))
  (wrap:java.util.List:0x0019: TERNARY null = ((wrap:int:0x0011: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0015: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:467)) : (r6v0 java.util.List))
  (wrap:java.util.List:0x0022: TERNARY null = ((wrap:int:0x001a: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:469)) : (r7v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0023: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0027: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:471)) : (r8v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.FilterCondition>, java.util.List<com.okinc.business.invest_biz.data.bean.FilterCondition>, java.util.List<com.okinc.business.invest_biz.data.bean.SortCondition>, java.util.List<com.okinc.business.invest_biz.data.bean.FilterCondition>, java.util.List<com.okinc.business.invest_biz.data.bean.FilterCondition>):void (m)] (LINE:461) call: com.okinc.business.invest_biz.data.bean.FiltersData.<init>(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ FiltersData(List list, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? yDY.AhwBna() : list3, (i & 8) != 0 ? yDY.AhwBna() : list4, (i & 16) != 0 ? yDY.AhwBna() : list5);
    }

    public final boolean AYXKKw() {
        return (this.networkCondition.isEmpty() ^ true) || (this.onlyCondition.isEmpty() ^ true) || (this.sortOrderCondition.isEmpty() ^ true) || (this.investTypeCondition.isEmpty() ^ true) || (this.riskCondition.isEmpty() ^ true);
    }
}
