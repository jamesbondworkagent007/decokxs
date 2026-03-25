package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class LeverIntervalData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int isBeyondMax;
    private final String maxLevel;
    private final String minLevel;
    private final String percents;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LeverIntervalData() {
        this((String) null, (String) null, (String) null, 0, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LeverIntervalData copy$default(LeverIntervalData leverIntervalData, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = leverIntervalData.minLevel;
        }
        if ((i2 & 2) != 0) {
            str2 = leverIntervalData.maxLevel;
        }
        if ((i2 & 4) != 0) {
            str3 = leverIntervalData.percents;
        }
        if ((i2 & 8) != 0) {
            i = leverIntervalData.isBeyondMax;
        }
        return leverIntervalData.copy(str, str2, str3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.minLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.maxLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.percents;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.isBeyondMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LeverIntervalData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new LeverIntervalData(str, str2, str3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeverIntervalData)) {
            return false;
        }
        LeverIntervalData leverIntervalData = (LeverIntervalData) obj;
        return Intrinsics.EZpvd((Object) this.minLevel, (Object) leverIntervalData.minLevel) && Intrinsics.EZpvd((Object) this.maxLevel, (Object) leverIntervalData.maxLevel) && Intrinsics.EZpvd((Object) this.percents, (Object) leverIntervalData.percents) && this.isBeyondMax == leverIntervalData.isBeyondMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxLevel() {
        return this.maxLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinLevel() {
        return this.minLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPercents() {
        return this.percents;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.minLevel.hashCode() * 31) + this.maxLevel.hashCode()) * 31) + this.percents.hashCode()) * 31) + Integer.hashCode(this.isBeyondMax);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isBeyondMax() {
        return this.isBeyondMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LeverIntervalData(minLevel=" + this.minLevel + ", maxLevel=" + this.maxLevel + ", percents=" + this.percents + ", isBeyondMax=" + this.isBeyondMax + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.LeverIntervalData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LeverIntervalData> serializer() {
            return LeverIntervalData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LeverIntervalData(int i, String str, String str2, String str3, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.minLevel = "";
        } else {
            this.minLevel = str;
        }
        if ((i & 2) == 0) {
            this.maxLevel = "";
        } else {
            this.maxLevel = str2;
        }
        if ((i & 4) == 0) {
            this.percents = "";
        } else {
            this.percents = str3;
        }
        if ((i & 8) == 0) {
            this.isBeyondMax = 0;
        } else {
            this.isBeyondMax = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(LeverIntervalData leverIntervalData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) leverIntervalData.minLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, leverIntervalData.minLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) leverIntervalData.maxLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, leverIntervalData.maxLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) leverIntervalData.percents, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, leverIntervalData.percents);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && leverIntervalData.isBeyondMax == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, leverIntervalData.isBeyondMax);
    }

    public LeverIntervalData(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.minLevel = str;
        this.maxLevel = str2;
        this.percents = str3;
        this.isBeyondMax = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:166) call: com.okinc.unify_trade.biz.LeverIntervalData.<init>(java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ LeverIntervalData(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i);
    }
}
