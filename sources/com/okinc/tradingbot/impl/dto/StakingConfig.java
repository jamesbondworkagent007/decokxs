package com.okinc.tradingbot.impl.dto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class StakingConfig {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final int baseCcyId;
    public final int stakingSavingType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Illegal instructions before constructor call */
    public StakingConfig() {
        int i = 0;
        this(i, i, 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StakingConfig copy$default(StakingConfig stakingConfig, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = stakingConfig.baseCcyId;
        }
        if ((i3 & 2) != 0) {
            i2 = stakingConfig.stakingSavingType;
        }
        return stakingConfig.KWHzl(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.stakingSavingType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StakingConfig KWHzl(int i, int i2) {
        return new StakingConfig(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.baseCcyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StakingConfig)) {
            return false;
        }
        StakingConfig stakingConfig = (StakingConfig) obj;
        return this.baseCcyId == stakingConfig.baseCcyId && this.stakingSavingType == stakingConfig.stakingSavingType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.baseCcyId) * 31) + Integer.hashCode(this.stakingSavingType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StakingConfig(baseCcyId=" + this.baseCcyId + ", stakingSavingType=" + this.stakingSavingType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.StakingConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StakingConfig> serializer() {
            return StakingConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StakingConfig(int i, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.baseCcyId = 0;
        } else {
            this.baseCcyId = i2;
        }
        if ((i & 2) == 0) {
            this.stakingSavingType = 0;
        } else {
            this.stakingSavingType = i3;
        }
    }

    public static final /* synthetic */ void AEQbTJ(StakingConfig stakingConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || stakingConfig.baseCcyId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, stakingConfig.baseCcyId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && stakingConfig.stakingSavingType == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 1, stakingConfig.stakingSavingType);
    }

    public StakingConfig(int i, int i2) {
        this.baseCcyId = i;
        this.stakingSavingType = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(int, int):void (m)] (LINE:7) call: com.okinc.tradingbot.impl.dto.StakingConfig.<init>(int, int):void type: THIS */
    public /* synthetic */ StakingConfig(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
