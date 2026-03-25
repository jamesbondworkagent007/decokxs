package com.okinc.business.market.features.floatwindow.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class FloatWindowThemeColors {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final long lastUpdated;
    public final int tradeFallColor;
    public final int tradeRiseColor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FloatWindowThemeColors() {
        this(0, 0, 0L, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FloatWindowThemeColors copy$default(FloatWindowThemeColors floatWindowThemeColors, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = floatWindowThemeColors.tradeRiseColor;
        }
        if ((i3 & 2) != 0) {
            i2 = floatWindowThemeColors.tradeFallColor;
        }
        if ((i3 & 4) != 0) {
            j = floatWindowThemeColors.lastUpdated;
        }
        return floatWindowThemeColors.copydefault(i, i2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FloatWindowThemeColors copydefault(int i, int i2, long j) {
        return new FloatWindowThemeColors(i, i2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FloatWindowThemeColors)) {
            return false;
        }
        FloatWindowThemeColors floatWindowThemeColors = (FloatWindowThemeColors) obj;
        return this.tradeRiseColor == floatWindowThemeColors.tradeRiseColor && this.tradeFallColor == floatWindowThemeColors.tradeFallColor && this.lastUpdated == floatWindowThemeColors.lastUpdated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.tradeRiseColor) * 31) + Integer.hashCode(this.tradeFallColor)) * 31) + Long.hashCode(this.lastUpdated);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FloatWindowThemeColors(tradeRiseColor=" + this.tradeRiseColor + ", tradeFallColor=" + this.tradeFallColor + ", lastUpdated=" + this.lastUpdated + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.floatwindow.data.FloatWindowThemeColors.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FloatWindowThemeColors> serializer() {
            return FloatWindowThemeColors$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FloatWindowThemeColors(int i, int i2, int i3, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tradeRiseColor = 0;
        } else {
            this.tradeRiseColor = i2;
        }
        if ((i & 2) == 0) {
            this.tradeFallColor = 0;
        } else {
            this.tradeFallColor = i3;
        }
        if ((i & 4) == 0) {
            this.lastUpdated = System.currentTimeMillis();
        } else {
            this.lastUpdated = j;
        }
    }

    public static final /* synthetic */ void OLrzqt(FloatWindowThemeColors floatWindowThemeColors, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || floatWindowThemeColors.tradeRiseColor != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, floatWindowThemeColors.tradeRiseColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || floatWindowThemeColors.tradeFallColor != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, floatWindowThemeColors.tradeFallColor);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && floatWindowThemeColors.lastUpdated == System.currentTimeMillis()) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 2, floatWindowThemeColors.lastUpdated);
    }

    public FloatWindowThemeColors(int i, int i2, long j) {
        this.tradeRiseColor = i;
        this.tradeFallColor = i2;
        this.lastUpdated = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x000f: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:23)) : (r4v0 long))
 A[MD:(int, int, long):void (m)] (LINE:20) call: com.okinc.business.market.features.floatwindow.data.FloatWindowThemeColors.<init>(int, int, long):void type: THIS */
    public /* synthetic */ FloatWindowThemeColors(int i, int i2, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? System.currentTimeMillis() : j);
    }
}
