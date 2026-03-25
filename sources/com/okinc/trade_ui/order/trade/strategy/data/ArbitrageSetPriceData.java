package com.okinc.trade_ui.order.trade.strategy.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class ArbitrageSetPriceData {
    private Integer autoDuration;
    private Boolean autoEnable;
    private Integer overUnit;
    private Boolean pauseEnable;
    private Float pauseThreshold;
    private Integer queueUnit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ArbitrageSetPriceData() {
        this((Integer) null, (Integer) null, (Boolean) null, (Integer) null, (Boolean) null, (Float) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ArbitrageSetPriceData copy$default(ArbitrageSetPriceData arbitrageSetPriceData, Integer num, Integer num2, Boolean bool, Integer num3, Boolean bool2, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            num = arbitrageSetPriceData.overUnit;
        }
        if ((i & 2) != 0) {
            num2 = arbitrageSetPriceData.queueUnit;
        }
        Integer num4 = num2;
        if ((i & 4) != 0) {
            bool = arbitrageSetPriceData.autoEnable;
        }
        Boolean bool3 = bool;
        if ((i & 8) != 0) {
            num3 = arbitrageSetPriceData.autoDuration;
        }
        Integer num5 = num3;
        if ((i & 16) != 0) {
            bool2 = arbitrageSetPriceData.pauseEnable;
        }
        Boolean bool4 = bool2;
        if ((i & 32) != 0) {
            f = arbitrageSetPriceData.pauseThreshold;
        }
        return arbitrageSetPriceData.copy(num, num4, bool3, num5, bool4, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.overUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.queueUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.autoEnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.autoDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.pauseEnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component6() {
        return this.pauseThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageSetPriceData copy(Integer num, Integer num2, Boolean bool, Integer num3, Boolean bool2, Float f) {
        return new ArbitrageSetPriceData(num, num2, bool, num3, bool2, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArbitrageSetPriceData)) {
            return false;
        }
        ArbitrageSetPriceData arbitrageSetPriceData = (ArbitrageSetPriceData) obj;
        return Intrinsics.EZpvd(this.overUnit, arbitrageSetPriceData.overUnit) && Intrinsics.EZpvd(this.queueUnit, arbitrageSetPriceData.queueUnit) && Intrinsics.EZpvd(this.autoEnable, arbitrageSetPriceData.autoEnable) && Intrinsics.EZpvd(this.autoDuration, arbitrageSetPriceData.autoDuration) && Intrinsics.EZpvd(this.pauseEnable, arbitrageSetPriceData.pauseEnable) && Intrinsics.EZpvd(this.pauseThreshold, arbitrageSetPriceData.pauseThreshold);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAutoDuration() {
        return this.autoDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAutoEnable() {
        return this.autoEnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOverUnit() {
        return this.overUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPauseEnable() {
        return this.pauseEnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getPauseThreshold() {
        return this.pauseThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getQueueUnit() {
        return this.queueUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.overUnit;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.queueUnit;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        Boolean bool = this.autoEnable;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        Integer num3 = this.autoDuration;
        int iHashCode4 = num3 == null ? 0 : num3.hashCode();
        Boolean bool2 = this.pauseEnable;
        int iHashCode5 = bool2 == null ? 0 : bool2.hashCode();
        Float f = this.pauseThreshold;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (f != null ? f.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoDuration(Integer num) {
        this.autoDuration = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoEnable(Boolean bool) {
        this.autoEnable = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOverUnit(Integer num) {
        this.overUnit = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPauseEnable(Boolean bool) {
        this.pauseEnable = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPauseThreshold(Float f) {
        this.pauseThreshold = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQueueUnit(Integer num) {
        this.queueUnit = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ArbitrageSetPriceData(overUnit=" + this.overUnit + ", queueUnit=" + this.queueUnit + ", autoEnable=" + this.autoEnable + ", autoDuration=" + this.autoDuration + ", pauseEnable=" + this.pauseEnable + ", pauseThreshold=" + this.pauseThreshold + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.trade_ui.order.trade.strategy.data.ArbitrageSetPriceData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ArbitrageSetPriceData> serializer() {
            return ArbitrageSetPriceData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ArbitrageSetPriceData(int i, Integer num, Integer num2, Boolean bool, Integer num3, Boolean bool2, Float f, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.overUnit = null;
        } else {
            this.overUnit = num;
        }
        if ((i & 2) == 0) {
            this.queueUnit = null;
        } else {
            this.queueUnit = num2;
        }
        if ((i & 4) == 0) {
            this.autoEnable = null;
        } else {
            this.autoEnable = bool;
        }
        if ((i & 8) == 0) {
            this.autoDuration = null;
        } else {
            this.autoDuration = num3;
        }
        if ((i & 16) == 0) {
            this.pauseEnable = null;
        } else {
            this.pauseEnable = bool2;
        }
        if ((i & 32) == 0) {
            this.pauseThreshold = null;
        } else {
            this.pauseThreshold = f;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ArbitrageSetPriceData arbitrageSetPriceData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || arbitrageSetPriceData.overUnit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, arbitrageSetPriceData.overUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || arbitrageSetPriceData.queueUnit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, arbitrageSetPriceData.queueUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || arbitrageSetPriceData.autoEnable != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, arbitrageSetPriceData.autoEnable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || arbitrageSetPriceData.autoDuration != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, arbitrageSetPriceData.autoDuration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || arbitrageSetPriceData.pauseEnable != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, arbitrageSetPriceData.pauseEnable);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && arbitrageSetPriceData.pauseThreshold == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, FloatSerializer.INSTANCE, arbitrageSetPriceData.pauseThreshold);
    }

    public ArbitrageSetPriceData(Integer num, Integer num2, Boolean bool, Integer num3, Boolean bool2, Float f) {
        this.overUnit = num;
        this.queueUnit = num2;
        this.autoEnable = bool;
        this.autoDuration = num3;
        this.pauseEnable = bool2;
        this.pauseThreshold = f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r6v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r7v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r8v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r10v0 java.lang.Boolean))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r11v0 java.lang.Float))
 A[MD:(java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Float):void (m)] (LINE:11) call: com.okinc.trade_ui.order.trade.strategy.data.ArbitrageSetPriceData.<init>(java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Float):void type: THIS */
    public /* synthetic */ ArbitrageSetPriceData(Integer num, Integer num2, Boolean bool, Integer num3, Boolean bool2, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : f);
    }
}
