package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class SlippageConfigVo {
    public static final int $stable = 0;
    public static final String CROSS_CONFIG_ID = "2";
    public static final Companion Companion = new Companion(null);
    public static final String MAX_SLIP = "0.5";
    public static final String SINGLE_CONFIG_ID = "1";
    private final String configId;
    private final String maxValue;
    private final String minValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SlippageConfigVo() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SlippageConfigVo copy$default(SlippageConfigVo slippageConfigVo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slippageConfigVo.configId;
        }
        if ((i & 2) != 0) {
            str2 = slippageConfigVo.minValue;
        }
        if ((i & 4) != 0) {
            str3 = slippageConfigVo.maxValue;
        }
        return slippageConfigVo.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.configId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.minValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.maxValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageConfigVo copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SlippageConfigVo(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlippageConfigVo)) {
            return false;
        }
        SlippageConfigVo slippageConfigVo = (SlippageConfigVo) obj;
        return Intrinsics.EZpvd((Object) this.configId, (Object) slippageConfigVo.configId) && Intrinsics.EZpvd((Object) this.minValue, (Object) slippageConfigVo.minValue) && Intrinsics.EZpvd((Object) this.maxValue, (Object) slippageConfigVo.maxValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConfigId() {
        return this.configId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxValue() {
        return this.maxValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinValue() {
        return this.minValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.configId.hashCode() * 31) + this.minValue.hashCode()) * 31) + this.maxValue.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SlippageConfigVo(configId=" + this.configId + ", minValue=" + this.minValue + ", maxValue=" + this.maxValue + ")";
    }

    public /* synthetic */ SlippageConfigVo(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.configId = "";
        } else {
            this.configId = str;
        }
        if ((i & 2) == 0) {
            this.minValue = "";
        } else {
            this.minValue = str2;
        }
        if ((i & 4) == 0) {
            this.maxValue = "";
        } else {
            this.maxValue = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(SlippageConfigVo slippageConfigVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) slippageConfigVo.configId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, slippageConfigVo.configId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) slippageConfigVo.minValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, slippageConfigVo.minValue);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) slippageConfigVo.maxValue, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, slippageConfigVo.maxValue);
    }

    public SlippageConfigVo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.configId = str;
        this.minValue = str2;
        this.maxValue = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2376) call: com.okinc.business.dexlogic.bean.SlippageConfigVo.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SlippageConfigVo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.SlippageConfigVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SlippageConfigVo> serializer() {
            return SlippageConfigVo$$serializer.INSTANCE;
        }

        public final SlippageConfigVo EZpvd() {
            return new SlippageConfigVo("1", "0.01", SlippageConfigVo.MAX_SLIP);
        }

        public final SlippageConfigVo KWHzl() {
            return new SlippageConfigVo("2", "0.03", SlippageConfigVo.MAX_SLIP);
        }
    }

    public final boolean isSingle() {
        return Intrinsics.EZpvd((Object) this.configId, (Object) "1");
    }

    public final boolean isCross() {
        return Intrinsics.EZpvd((Object) this.configId, (Object) "2");
    }
}
