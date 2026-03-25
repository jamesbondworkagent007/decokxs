package com.okinc.tradingbot.impl.dto;

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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class HomeArbitrageResponse {
    public static final KSerializer<Object>[] $childSerializers;
    public final boolean leverageEnabled;
    public final Map<String, LeveragePrincipalConfig> leveragePrincipalCoinConfig;
    public final int maxEnlargeLeverage;
    public final RiskInfoVo riskInfo;
    public final Map<String, StakingConfig> stakingCoinConfig;
    public final boolean stakingEnabled;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomeArbitrageResponse() {
        this(false, false, 0, (Map) null, (Map) null, (RiskInfoVo) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.tradingbot.impl.dto.HomeArbitrageResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeArbitrageResponse copy$default(HomeArbitrageResponse homeArbitrageResponse, boolean z, boolean z2, int i, Map map, Map map2, RiskInfoVo riskInfoVo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = homeArbitrageResponse.stakingEnabled;
        }
        if ((i2 & 2) != 0) {
            z2 = homeArbitrageResponse.leverageEnabled;
        }
        boolean z3 = z2;
        if ((i2 & 4) != 0) {
            i = homeArbitrageResponse.maxEnlargeLeverage;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            map = homeArbitrageResponse.stakingCoinConfig;
        }
        Map map3 = map;
        if ((i2 & 16) != 0) {
            map2 = homeArbitrageResponse.leveragePrincipalCoinConfig;
        }
        Map map4 = map2;
        if ((i2 & 32) != 0) {
            riskInfoVo = homeArbitrageResponse.riskInfo;
        }
        return homeArbitrageResponse.EZpvd(z, z3, i3, map3, map4, riskInfoVo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.maxEnlargeLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeArbitrageResponse EZpvd(boolean z, boolean z2, int i, @NotNull Map<String, StakingConfig> map, @NotNull Map<String, LeveragePrincipalConfig> map2, @NotNull RiskInfoVo riskInfoVo) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(riskInfoVo, "");
        return new HomeArbitrageResponse(z, z2, i, map, map2, riskInfoVo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, LeveragePrincipalConfig> EZpvd() {
        return this.leveragePrincipalCoinConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskInfoVo OLrzqt() {
        return this.riskInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.leverageEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeArbitrageResponse)) {
            return false;
        }
        HomeArbitrageResponse homeArbitrageResponse = (HomeArbitrageResponse) obj;
        return this.stakingEnabled == homeArbitrageResponse.stakingEnabled && this.leverageEnabled == homeArbitrageResponse.leverageEnabled && this.maxEnlargeLeverage == homeArbitrageResponse.maxEnlargeLeverage && Intrinsics.EZpvd(this.stakingCoinConfig, homeArbitrageResponse.stakingCoinConfig) && Intrinsics.EZpvd(this.leveragePrincipalCoinConfig, homeArbitrageResponse.leveragePrincipalCoinConfig) && Intrinsics.EZpvd(this.riskInfo, homeArbitrageResponse.riskInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, StakingConfig> gEmmrt() {
        return this.stakingCoinConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((Boolean.hashCode(this.stakingEnabled) * 31) + Boolean.hashCode(this.leverageEnabled)) * 31) + Integer.hashCode(this.maxEnlargeLeverage)) * 31) + this.stakingCoinConfig.hashCode()) * 31) + this.leveragePrincipalCoinConfig.hashCode()) * 31) + this.riskInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeArbitrageResponse(stakingEnabled=" + this.stakingEnabled + ", leverageEnabled=" + this.leverageEnabled + ", maxEnlargeLeverage=" + this.maxEnlargeLeverage + ", stakingCoinConfig=" + this.stakingCoinConfig + ", leveragePrincipalCoinConfig=" + this.leveragePrincipalCoinConfig + ", riskInfo=" + this.riskInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.stakingEnabled;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.HomeArbitrageResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HomeArbitrageResponse> serializer() {
            return HomeArbitrageResponse$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, new LinkedHashMapSerializer(stringSerializer, StakingConfig$$serializer.INSTANCE), new LinkedHashMapSerializer(stringSerializer, LeveragePrincipalConfig$$serializer.INSTANCE), null};
    }

    public /* synthetic */ HomeArbitrageResponse(int i, boolean z, boolean z2, int i2, Map map, Map map2, RiskInfoVo riskInfoVo, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.stakingEnabled = false;
        } else {
            this.stakingEnabled = z;
        }
        if ((i & 2) == 0) {
            this.leverageEnabled = false;
        } else {
            this.leverageEnabled = z2;
        }
        if ((i & 4) == 0) {
            this.maxEnlargeLeverage = 0;
        } else {
            this.maxEnlargeLeverage = i2;
        }
        if ((i & 8) == 0) {
            this.stakingCoinConfig = C56424yEw.KWHzl();
        } else {
            this.stakingCoinConfig = map;
        }
        if ((i & 16) == 0) {
            this.leveragePrincipalCoinConfig = C56424yEw.KWHzl();
        } else {
            this.leveragePrincipalCoinConfig = map2;
        }
        if ((i & 32) == 0) {
            this.riskInfo = new RiskInfoVo((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        } else {
            this.riskInfo = riskInfoVo;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [5=4] */
    public static final /* synthetic */ void copydefault(HomeArbitrageResponse homeArbitrageResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || homeArbitrageResponse.stakingEnabled) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, homeArbitrageResponse.stakingEnabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || homeArbitrageResponse.leverageEnabled) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, homeArbitrageResponse.leverageEnabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || homeArbitrageResponse.maxEnlargeLeverage != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, homeArbitrageResponse.maxEnlargeLeverage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(homeArbitrageResponse.stakingCoinConfig, C56424yEw.KWHzl())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], homeArbitrageResponse.stakingCoinConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(homeArbitrageResponse.leveragePrincipalCoinConfig, C56424yEw.KWHzl())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], homeArbitrageResponse.leveragePrincipalCoinConfig);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd(homeArbitrageResponse.riskInfo, new RiskInfoVo((String) null, (String) null, 3, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, RiskInfoVo$$serializer.INSTANCE, homeArbitrageResponse.riskInfo);
    }

    public HomeArbitrageResponse(boolean z, boolean z2, int i, @NotNull Map<String, StakingConfig> map, @NotNull Map<String, LeveragePrincipalConfig> map2, @NotNull RiskInfoVo riskInfoVo) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(riskInfoVo, "");
        this.stakingEnabled = z;
        this.leverageEnabled = z2;
        this.maxEnlargeLeverage = i;
        this.stakingCoinConfig = map;
        this.leveragePrincipalCoinConfig = map2;
        this.riskInfo = riskInfoVo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r11v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r7v0 int) : (0 int))
  (wrap:java.util.Map:0x001d: TERNARY null = ((wrap:int:0x0015: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0019: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:10)) : (r8v0 java.util.Map))
  (wrap:java.util.Map:0x0026: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0022: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:11)) : (r9v0 java.util.Map))
  (wrap:com.okinc.tradingbot.impl.dto.RiskInfoVo:?: TERNARY null = ((wrap:int:0x0027: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.tradingbot.impl.dto.RiskInfoVo:0x002f: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:12) call: com.okinc.tradingbot.impl.dto.RiskInfoVo.<init>(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r10v0 com.okinc.tradingbot.impl.dto.RiskInfoVo))
 A[MD:(boolean, boolean, int, java.util.Map<java.lang.String, com.okinc.tradingbot.impl.dto.StakingConfig>, java.util.Map<java.lang.String, com.okinc.tradingbot.impl.dto.LeveragePrincipalConfig>, com.okinc.tradingbot.impl.dto.RiskInfoVo):void (m)] (LINE:6) call: com.okinc.tradingbot.impl.dto.HomeArbitrageResponse.<init>(boolean, boolean, int, java.util.Map, java.util.Map, com.okinc.tradingbot.impl.dto.RiskInfoVo):void type: THIS */
    public /* synthetic */ HomeArbitrageResponse(boolean z, boolean z2, int i, Map map, Map map2, RiskInfoVo riskInfoVo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) == 0 ? i : 0, (i2 & 8) != 0 ? C56424yEw.KWHzl() : map, (i2 & 16) != 0 ? C56424yEw.KWHzl() : map2, (i2 & 32) != 0 ? new RiskInfoVo((String) null, (String) null, 3, (DefaultConstructorMarker) null) : riskInfoVo);
    }
}
