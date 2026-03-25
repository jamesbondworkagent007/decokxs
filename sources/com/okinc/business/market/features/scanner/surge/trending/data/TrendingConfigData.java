package com.okinc.business.market.features.scanner.surge.trending.data;

import com.okinc.business.market.data.model.common.ChainInfoData;
import com.okinc.business.market.data.model.common.ChainInfoData$$serializer;
import com.okinc.business.market.data.model.common.ProtocolInfoData;
import com.okinc.business.market.data.model.common.ProtocolInfoData$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class TrendingConfigData {
    public final List<ChainInfoData> chainInfos;
    public final List<ProtocolFilterData> protocolFilterInfos;
    public final List<ProtocolInfoData> protocolInfos;
    public final List<RankInfoData> rankInfos;
    public final List<String> tagKeyInfos;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(ChainInfoData$$serializer.INSTANCE), new ArrayListSerializer(ProtocolInfoData$$serializer.INSTANCE), new ArrayListSerializer(ProtocolFilterData$$serializer.INSTANCE), new ArrayListSerializer(RankInfoData$$serializer.INSTANCE), new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrendingConfigData() {
        this((List) null, (List) null, (List) null, (List) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.market.features.scanner.surge.trending.data.TrendingConfigData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrendingConfigData copy$default(TrendingConfigData trendingConfigData, List list, List list2, List list3, List list4, List list5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = trendingConfigData.chainInfos;
        }
        if ((i & 2) != 0) {
            list2 = trendingConfigData.protocolInfos;
        }
        List list6 = list2;
        if ((i & 4) != 0) {
            list3 = trendingConfigData.protocolFilterInfos;
        }
        List list7 = list3;
        if ((i & 8) != 0) {
            list4 = trendingConfigData.rankInfos;
        }
        List list8 = list4;
        if ((i & 16) != 0) {
            list5 = trendingConfigData.tagKeyInfos;
        }
        return trendingConfigData.EZpvd(list, list6, list7, list8, list5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrendingConfigData EZpvd(List<ChainInfoData> list, List<ProtocolInfoData> list2, List<ProtocolFilterData> list3, List<RankInfoData> list4, List<String> list5) {
        return new TrendingConfigData(list, list2, list3, list4, list5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ProtocolInfoData> EZpvd() {
        return this.protocolInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ProtocolFilterData> KWHzl() {
        return this.protocolFilterInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RankInfoData> OLrzqt() {
        return this.rankInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainInfoData> copydefault() {
        return this.chainInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendingConfigData)) {
            return false;
        }
        TrendingConfigData trendingConfigData = (TrendingConfigData) obj;
        return Intrinsics.EZpvd(this.chainInfos, trendingConfigData.chainInfos) && Intrinsics.EZpvd(this.protocolInfos, trendingConfigData.protocolInfos) && Intrinsics.EZpvd(this.protocolFilterInfos, trendingConfigData.protocolFilterInfos) && Intrinsics.EZpvd(this.rankInfos, trendingConfigData.rankInfos) && Intrinsics.EZpvd(this.tagKeyInfos, trendingConfigData.tagKeyInfos);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<ChainInfoData> list = this.chainInfos;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<ProtocolInfoData> list2 = this.protocolInfos;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        List<ProtocolFilterData> list3 = this.protocolFilterInfos;
        int iHashCode3 = list3 == null ? 0 : list3.hashCode();
        List<RankInfoData> list4 = this.rankInfos;
        int iHashCode4 = list4 == null ? 0 : list4.hashCode();
        List<String> list5 = this.tagKeyInfos;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list5 != null ? list5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrendingConfigData(chainInfos=" + this.chainInfos + ", protocolInfos=" + this.protocolInfos + ", protocolFilterInfos=" + this.protocolFilterInfos + ", rankInfos=" + this.rankInfos + ", tagKeyInfos=" + this.tagKeyInfos + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.scanner.surge.trending.data.TrendingConfigData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TrendingConfigData> serializer() {
            return TrendingConfigData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TrendingConfigData(int i, List list, List list2, List list3, List list4, List list5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainInfos = null;
        } else {
            this.chainInfos = list;
        }
        if ((i & 2) == 0) {
            this.protocolInfos = null;
        } else {
            this.protocolInfos = list2;
        }
        if ((i & 4) == 0) {
            this.protocolFilterInfos = null;
        } else {
            this.protocolFilterInfos = list3;
        }
        if ((i & 8) == 0) {
            this.rankInfos = null;
        } else {
            this.rankInfos = list4;
        }
        if ((i & 16) == 0) {
            this.tagKeyInfos = null;
        } else {
            this.tagKeyInfos = list5;
        }
    }

    public static final /* synthetic */ void AEQbTJ(TrendingConfigData trendingConfigData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || trendingConfigData.chainInfos != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], trendingConfigData.chainInfos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || trendingConfigData.protocolInfos != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], trendingConfigData.protocolInfos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || trendingConfigData.protocolFilterInfos != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], trendingConfigData.protocolFilterInfos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || trendingConfigData.rankInfos != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], trendingConfigData.rankInfos);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && trendingConfigData.tagKeyInfos == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], trendingConfigData.tagKeyInfos);
    }

    public TrendingConfigData(List<ChainInfoData> list, List<ProtocolInfoData> list2, List<ProtocolFilterData> list3, List<RankInfoData> list4, List<String> list5) {
        this.chainInfos = list;
        this.protocolInfos = list2;
        this.protocolFilterInfos = list3;
        this.rankInfos = list4;
        this.tagKeyInfos = list5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r6v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r7v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r8v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.market.data.model.common.ChainInfoData>, java.util.List<com.okinc.business.market.data.model.common.ProtocolInfoData>, java.util.List<com.okinc.business.market.features.scanner.surge.trending.data.ProtocolFilterData>, java.util.List<com.okinc.business.market.features.scanner.surge.trending.data.RankInfoData>, java.util.List<java.lang.String>):void (m)] (LINE:10) call: com.okinc.business.market.features.scanner.surge.trending.data.TrendingConfigData.<init>(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ TrendingConfigData(List list, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : list5);
    }
}
