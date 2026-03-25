package com.okinc.business.market.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class LiquidityChartData {
    private final LiquidityPoolChartConfig liquidityPoolChartConfig;
    private final List<LiquidityData> results;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(LiquidityData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LiquidityChartData() {
        this((LiquidityPoolChartConfig) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.LiquidityChartData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiquidityChartData copy$default(LiquidityChartData liquidityChartData, LiquidityPoolChartConfig liquidityPoolChartConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            liquidityPoolChartConfig = liquidityChartData.liquidityPoolChartConfig;
        }
        if ((i & 2) != 0) {
            list = liquidityChartData.results;
        }
        return liquidityChartData.copy(liquidityPoolChartConfig, list);
    }

    @SerialName("liquidityPoolChartConfig")
    public static /* synthetic */ void getLiquidityPoolChartConfig$annotations() {
    }

    @SerialName("results")
    public static /* synthetic */ void getResults$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiquidityPoolChartConfig component1() {
        return this.liquidityPoolChartConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LiquidityData> component2() {
        return this.results;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiquidityChartData copy(LiquidityPoolChartConfig liquidityPoolChartConfig, List<LiquidityData> list) {
        return new LiquidityChartData(liquidityPoolChartConfig, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiquidityChartData)) {
            return false;
        }
        LiquidityChartData liquidityChartData = (LiquidityChartData) obj;
        return Intrinsics.EZpvd(this.liquidityPoolChartConfig, liquidityChartData.liquidityPoolChartConfig) && Intrinsics.EZpvd(this.results, liquidityChartData.results);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiquidityPoolChartConfig getLiquidityPoolChartConfig() {
        return this.liquidityPoolChartConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LiquidityData> getResults() {
        return this.results;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        LiquidityPoolChartConfig liquidityPoolChartConfig = this.liquidityPoolChartConfig;
        int iHashCode = liquidityPoolChartConfig == null ? 0 : liquidityPoolChartConfig.hashCode();
        List<LiquidityData> list = this.results;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiquidityChartData(liquidityPoolChartConfig=" + this.liquidityPoolChartConfig + ", results=" + this.results + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.LiquidityChartData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LiquidityChartData> serializer() {
            return LiquidityChartData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LiquidityChartData(int i, LiquidityPoolChartConfig liquidityPoolChartConfig, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.liquidityPoolChartConfig = null;
        } else {
            this.liquidityPoolChartConfig = liquidityPoolChartConfig;
        }
        if ((i & 2) == 0) {
            this.results = null;
        } else {
            this.results = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(LiquidityChartData liquidityChartData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || liquidityChartData.liquidityPoolChartConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LiquidityPoolChartConfig$$serializer.INSTANCE, liquidityChartData.liquidityPoolChartConfig);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && liquidityChartData.results == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], liquidityChartData.results);
    }

    public LiquidityChartData(LiquidityPoolChartConfig liquidityPoolChartConfig, List<LiquidityData> list) {
        this.liquidityPoolChartConfig = liquidityPoolChartConfig;
        this.results = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.market.data.model.LiquidityPoolChartConfig:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.data.model.LiquidityPoolChartConfig) : (r2v0 com.okinc.business.market.data.model.LiquidityPoolChartConfig))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(com.okinc.business.market.data.model.LiquidityPoolChartConfig, java.util.List<com.okinc.business.market.data.model.LiquidityData>):void (m)] (LINE:9) call: com.okinc.business.market.data.model.LiquidityChartData.<init>(com.okinc.business.market.data.model.LiquidityPoolChartConfig, java.util.List):void type: THIS */
    public /* synthetic */ LiquidityChartData(LiquidityPoolChartConfig liquidityPoolChartConfig, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : liquidityPoolChartConfig, (i & 2) != 0 ? null : list);
    }
}
