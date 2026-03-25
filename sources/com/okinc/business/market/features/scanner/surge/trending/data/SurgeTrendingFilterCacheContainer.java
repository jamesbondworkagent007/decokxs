package com.okinc.business.market.features.scanner.surge.trending.data;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class SurgeTrendingFilterCacheContainer {
    private final Map<String, SurgeTrendingChainFilterData> chainFilters;
    private final String lastSelectedChainId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, SurgeTrendingChainFilterData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SurgeTrendingFilterCacheContainer() {
        this((String) null, (Map) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.scanner.surge.trending.data.SurgeTrendingFilterCacheContainer */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SurgeTrendingFilterCacheContainer copy$default(SurgeTrendingFilterCacheContainer surgeTrendingFilterCacheContainer, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = surgeTrendingFilterCacheContainer.lastSelectedChainId;
        }
        if ((i & 2) != 0) {
            map = surgeTrendingFilterCacheContainer.chainFilters;
        }
        return surgeTrendingFilterCacheContainer.copy(str, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.lastSelectedChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, SurgeTrendingChainFilterData> component2() {
        return this.chainFilters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SurgeTrendingFilterCacheContainer copy(@NotNull String str, @NotNull Map<String, SurgeTrendingChainFilterData> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new SurgeTrendingFilterCacheContainer(str, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurgeTrendingFilterCacheContainer)) {
            return false;
        }
        SurgeTrendingFilterCacheContainer surgeTrendingFilterCacheContainer = (SurgeTrendingFilterCacheContainer) obj;
        return Intrinsics.EZpvd((Object) this.lastSelectedChainId, (Object) surgeTrendingFilterCacheContainer.lastSelectedChainId) && Intrinsics.EZpvd(this.chainFilters, surgeTrendingFilterCacheContainer.chainFilters);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, SurgeTrendingChainFilterData> getChainFilters() {
        return this.chainFilters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastSelectedChainId() {
        return this.lastSelectedChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.lastSelectedChainId.hashCode() * 31) + this.chainFilters.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SurgeTrendingFilterCacheContainer(lastSelectedChainId=" + this.lastSelectedChainId + ", chainFilters=" + this.chainFilters + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.scanner.surge.trending.data.SurgeTrendingFilterCacheContainer.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SurgeTrendingFilterCacheContainer> serializer() {
            return SurgeTrendingFilterCacheContainer$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SurgeTrendingFilterCacheContainer(int i, String str, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        this.lastSelectedChainId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.chainFilters = C56424yEw.KWHzl();
        } else {
            this.chainFilters = map;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(SurgeTrendingFilterCacheContainer surgeTrendingFilterCacheContainer, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) surgeTrendingFilterCacheContainer.lastSelectedChainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, surgeTrendingFilterCacheContainer.lastSelectedChainId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(surgeTrendingFilterCacheContainer.chainFilters, C56424yEw.KWHzl())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], surgeTrendingFilterCacheContainer.chainFilters);
    }

    public SurgeTrendingFilterCacheContainer(@NotNull String str, @NotNull Map<String, SurgeTrendingChainFilterData> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.lastSelectedChainId = str;
        this.chainFilters = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x000a: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:14)) : (r2v0 java.util.Map))
 A[MD:(java.lang.String, java.util.Map<java.lang.String, com.okinc.business.market.features.scanner.surge.trending.data.SurgeTrendingChainFilterData>):void (m)] (LINE:12) call: com.okinc.business.market.features.scanner.surge.trending.data.SurgeTrendingFilterCacheContainer.<init>(java.lang.String, java.util.Map):void type: THIS */
    public /* synthetic */ SurgeTrendingFilterCacheContainer(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C56424yEw.KWHzl() : map);
    }
}
