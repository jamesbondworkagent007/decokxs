package com.okinc.business.market.features.scanner.surge.signal.data;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class SurgeSignalGemsData {
    public final List<GemItem> gems;
    public final List<HeatmapItem> heatmap;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(HeatmapItem$$serializer.INSTANCE), new ArrayListSerializer(GemItem$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SurgeSignalGemsData() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.scanner.surge.signal.data.SurgeSignalGemsData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SurgeSignalGemsData copy$default(SurgeSignalGemsData surgeSignalGemsData, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = surgeSignalGemsData.heatmap;
        }
        if ((i & 2) != 0) {
            list2 = surgeSignalGemsData.gems;
        }
        return surgeSignalGemsData.EZpvd(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SurgeSignalGemsData EZpvd(List<HeatmapItem> list, List<GemItem> list2) {
        return new SurgeSignalGemsData(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GemItem> KWHzl() {
        return this.gems;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurgeSignalGemsData)) {
            return false;
        }
        SurgeSignalGemsData surgeSignalGemsData = (SurgeSignalGemsData) obj;
        return Intrinsics.EZpvd(this.heatmap, surgeSignalGemsData.heatmap) && Intrinsics.EZpvd(this.gems, surgeSignalGemsData.gems);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<HeatmapItem> list = this.heatmap;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<GemItem> list2 = this.gems;
        return (iHashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SurgeSignalGemsData(heatmap=" + this.heatmap + ", gems=" + this.gems + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.scanner.surge.signal.data.SurgeSignalGemsData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SurgeSignalGemsData> serializer() {
            return SurgeSignalGemsData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SurgeSignalGemsData(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.heatmap = null;
        } else {
            this.heatmap = list;
        }
        if ((i & 2) == 0) {
            this.gems = null;
        } else {
            this.gems = list2;
        }
    }

    public static final /* synthetic */ void KWHzl(SurgeSignalGemsData surgeSignalGemsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || surgeSignalGemsData.heatmap != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], surgeSignalGemsData.heatmap);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && surgeSignalGemsData.gems == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], surgeSignalGemsData.gems);
    }

    public SurgeSignalGemsData(List<HeatmapItem> list, List<GemItem> list2) {
        this.heatmap = list;
        this.gems = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.market.features.scanner.surge.signal.data.HeatmapItem>, java.util.List<com.okinc.business.market.features.scanner.surge.signal.data.GemItem>):void (m)] (LINE:10) call: com.okinc.business.market.features.scanner.surge.signal.data.SurgeSignalGemsData.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ SurgeSignalGemsData(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
