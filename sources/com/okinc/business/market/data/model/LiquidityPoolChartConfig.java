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

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class LiquidityPoolChartConfig {
    private final List<PeriodConfig> periodConfigs;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(PeriodConfig$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LiquidityPoolChartConfig() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.LiquidityPoolChartConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiquidityPoolChartConfig copy$default(LiquidityPoolChartConfig liquidityPoolChartConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = liquidityPoolChartConfig.periodConfigs;
        }
        return liquidityPoolChartConfig.copy(list);
    }

    @SerialName("periodConfigs")
    public static /* synthetic */ void getPeriodConfigs$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PeriodConfig> component1() {
        return this.periodConfigs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiquidityPoolChartConfig copy(List<PeriodConfig> list) {
        return new LiquidityPoolChartConfig(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LiquidityPoolChartConfig) && Intrinsics.EZpvd(this.periodConfigs, ((LiquidityPoolChartConfig) obj).periodConfigs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PeriodConfig> getPeriodConfigs() {
        return this.periodConfigs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<PeriodConfig> list = this.periodConfigs;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiquidityPoolChartConfig(periodConfigs=" + this.periodConfigs + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.LiquidityPoolChartConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LiquidityPoolChartConfig> serializer() {
            return LiquidityPoolChartConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LiquidityPoolChartConfig(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.periodConfigs = null;
        } else {
            this.periodConfigs = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(LiquidityPoolChartConfig liquidityPoolChartConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && liquidityPoolChartConfig.periodConfigs == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], liquidityPoolChartConfig.periodConfigs);
    }

    public LiquidityPoolChartConfig(List<PeriodConfig> list) {
        this.periodConfigs = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.market.data.model.PeriodConfig>):void (m)] (LINE:18) call: com.okinc.business.market.data.model.LiquidityPoolChartConfig.<init>(java.util.List):void type: THIS */
    public /* synthetic */ LiquidityPoolChartConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
