package com.okinc.tradingbot.impl.dto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class LeveragePrincipalConfig {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final int quoteCcyId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LeveragePrincipalConfig() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LeveragePrincipalConfig copy$default(LeveragePrincipalConfig leveragePrincipalConfig, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = leveragePrincipalConfig.quoteCcyId;
        }
        return leveragePrincipalConfig.EZpvd(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LeveragePrincipalConfig EZpvd(int i) {
        return new LeveragePrincipalConfig(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.quoteCcyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LeveragePrincipalConfig) && this.quoteCcyId == ((LeveragePrincipalConfig) obj).quoteCcyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Integer.hashCode(this.quoteCcyId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LeveragePrincipalConfig(quoteCcyId=" + this.quoteCcyId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.LeveragePrincipalConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LeveragePrincipalConfig> serializer() {
            return LeveragePrincipalConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LeveragePrincipalConfig(int i, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.quoteCcyId = 0;
        } else {
            this.quoteCcyId = i2;
        }
    }

    public static final /* synthetic */ void copydefault(LeveragePrincipalConfig leveragePrincipalConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && leveragePrincipalConfig.quoteCcyId == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 0, leveragePrincipalConfig.quoteCcyId);
    }

    public LeveragePrincipalConfig(int i) {
        this.quoteCcyId = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:6) call: com.okinc.tradingbot.impl.dto.LeveragePrincipalConfig.<init>(int):void type: THIS */
    public /* synthetic */ LeveragePrincipalConfig(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
