package com.okinc.tradingbot.impl.dto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class EarnStakingConfig {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String baseCcyId;
    public final String ccy;
    public final String stakingSavingType;
    public final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EarnStakingConfig() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EarnStakingConfig copy$default(EarnStakingConfig earnStakingConfig, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = earnStakingConfig.ccy;
        }
        if ((i & 2) != 0) {
            str2 = earnStakingConfig.baseCcyId;
        }
        if ((i & 4) != 0) {
            str3 = earnStakingConfig.stakingSavingType;
        }
        if ((i & 8) != 0) {
            str4 = earnStakingConfig.type;
        }
        return earnStakingConfig.copydefault(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnStakingConfig copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new EarnStakingConfig(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarnStakingConfig)) {
            return false;
        }
        EarnStakingConfig earnStakingConfig = (EarnStakingConfig) obj;
        return Intrinsics.EZpvd((Object) this.ccy, (Object) earnStakingConfig.ccy) && Intrinsics.EZpvd((Object) this.baseCcyId, (Object) earnStakingConfig.baseCcyId) && Intrinsics.EZpvd((Object) this.stakingSavingType, (Object) earnStakingConfig.stakingSavingType) && Intrinsics.EZpvd((Object) this.type, (Object) earnStakingConfig.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.ccy.hashCode() * 31) + this.baseCcyId.hashCode()) * 31) + this.stakingSavingType.hashCode()) * 31) + this.type.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EarnStakingConfig(ccy=" + this.ccy + ", baseCcyId=" + this.baseCcyId + ", stakingSavingType=" + this.stakingSavingType + ", type=" + this.type + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.EarnStakingConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EarnStakingConfig> serializer() {
            return EarnStakingConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EarnStakingConfig(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str;
        }
        if ((i & 2) == 0) {
            this.baseCcyId = "";
        } else {
            this.baseCcyId = str2;
        }
        if ((i & 4) == 0) {
            this.stakingSavingType = "";
        } else {
            this.stakingSavingType = str3;
        }
        if ((i & 8) == 0) {
            this.type = "";
        } else {
            this.type = str4;
        }
    }

    public static final /* synthetic */ void EZpvd(EarnStakingConfig earnStakingConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) earnStakingConfig.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, earnStakingConfig.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) earnStakingConfig.baseCcyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, earnStakingConfig.baseCcyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) earnStakingConfig.stakingSavingType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, earnStakingConfig.stakingSavingType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) earnStakingConfig.type, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, earnStakingConfig.type);
    }

    public EarnStakingConfig(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.ccy = str;
        this.baseCcyId = str2;
        this.stakingSavingType = str3;
        this.type = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.tradingbot.impl.dto.EarnStakingConfig.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EarnStakingConfig(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
