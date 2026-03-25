package com.okinc.business.market.data.model;

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
public final class QuickFilterConfigData {
    public static final KSerializer<Object>[] $childSerializers;
    public final List<RangeFilterConfigData> liquidityConfig;
    public final List<RangeFilterConfigData> marketCapConfig;
    public final List<RangeFilterConfigData> tokenAgeConfig;
    public final List<RangeFilterConfigData> volumeConfig;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QuickFilterConfigData() {
        this((List) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.QuickFilterConfigData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuickFilterConfigData copy$default(QuickFilterConfigData quickFilterConfigData, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = quickFilterConfigData.liquidityConfig;
        }
        if ((i & 2) != 0) {
            list2 = quickFilterConfigData.volumeConfig;
        }
        if ((i & 4) != 0) {
            list3 = quickFilterConfigData.marketCapConfig;
        }
        if ((i & 8) != 0) {
            list4 = quickFilterConfigData.tokenAgeConfig;
        }
        return quickFilterConfigData.EZpvd(list, list2, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuickFilterConfigData EZpvd(@NotNull List<RangeFilterConfigData> list, @NotNull List<RangeFilterConfigData> list2, @NotNull List<RangeFilterConfigData> list3, @NotNull List<RangeFilterConfigData> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        return new QuickFilterConfigData(list, list2, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RangeFilterConfigData> EZpvd() {
        return this.tokenAgeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RangeFilterConfigData> KWHzl() {
        return this.liquidityConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RangeFilterConfigData> OLrzqt() {
        return this.marketCapConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RangeFilterConfigData> copydefault() {
        return this.volumeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickFilterConfigData)) {
            return false;
        }
        QuickFilterConfigData quickFilterConfigData = (QuickFilterConfigData) obj;
        return Intrinsics.EZpvd(this.liquidityConfig, quickFilterConfigData.liquidityConfig) && Intrinsics.EZpvd(this.volumeConfig, quickFilterConfigData.volumeConfig) && Intrinsics.EZpvd(this.marketCapConfig, quickFilterConfigData.marketCapConfig) && Intrinsics.EZpvd(this.tokenAgeConfig, quickFilterConfigData.tokenAgeConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.liquidityConfig.hashCode() * 31) + this.volumeConfig.hashCode()) * 31) + this.marketCapConfig.hashCode()) * 31) + this.tokenAgeConfig.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QuickFilterConfigData(liquidityConfig=" + this.liquidityConfig + ", volumeConfig=" + this.volumeConfig + ", marketCapConfig=" + this.marketCapConfig + ", tokenAgeConfig=" + this.tokenAgeConfig + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.QuickFilterConfigData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<QuickFilterConfigData> serializer() {
            return QuickFilterConfigData$$serializer.INSTANCE;
        }
    }

    static {
        RangeFilterConfigData$$serializer rangeFilterConfigData$$serializer = RangeFilterConfigData$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(rangeFilterConfigData$$serializer), new ArrayListSerializer(rangeFilterConfigData$$serializer), new ArrayListSerializer(rangeFilterConfigData$$serializer), new ArrayListSerializer(rangeFilterConfigData$$serializer)};
    }

    public /* synthetic */ QuickFilterConfigData(int i, List list, List list2, List list3, List list4, SerializationConstructorMarker serializationConstructorMarker) {
        this.liquidityConfig = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.volumeConfig = yDY.AhwBna();
        } else {
            this.volumeConfig = list2;
        }
        if ((i & 4) == 0) {
            this.marketCapConfig = yDY.AhwBna();
        } else {
            this.marketCapConfig = list3;
        }
        if ((i & 8) == 0) {
            this.tokenAgeConfig = yDY.AhwBna();
        } else {
            this.tokenAgeConfig = list4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [6=5] */
    public static final /* synthetic */ void copydefault(QuickFilterConfigData quickFilterConfigData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(quickFilterConfigData.liquidityConfig, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], quickFilterConfigData.liquidityConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(quickFilterConfigData.volumeConfig, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], quickFilterConfigData.volumeConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(quickFilterConfigData.marketCapConfig, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], quickFilterConfigData.marketCapConfig);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(quickFilterConfigData.tokenAgeConfig, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], quickFilterConfigData.tokenAgeConfig);
    }

    public QuickFilterConfigData(@NotNull List<RangeFilterConfigData> list, @NotNull List<RangeFilterConfigData> list2, @NotNull List<RangeFilterConfigData> list3, @NotNull List<RangeFilterConfigData> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.liquidityConfig = list;
        this.volumeConfig = list2;
        this.marketCapConfig = list3;
        this.tokenAgeConfig = list4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:9)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:11)) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:13)) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0018: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r4v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.market.data.model.RangeFilterConfigData>, java.util.List<com.okinc.business.market.data.model.RangeFilterConfigData>, java.util.List<com.okinc.business.market.data.model.RangeFilterConfigData>, java.util.List<com.okinc.business.market.data.model.RangeFilterConfigData>):void (m)] (LINE:7) call: com.okinc.business.market.data.model.QuickFilterConfigData.<init>(java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ QuickFilterConfigData(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? yDY.AhwBna() : list3, (i & 8) != 0 ? yDY.AhwBna() : list4);
    }
}
