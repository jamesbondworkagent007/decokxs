package com.okinc.tradingbot.impl.dto;

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
public final class MarginUsage {
    private String estOpenedPositions;
    private String openPositionRatio;
    private String pendingOrderRatio;
    private String reservedMarginRatio;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarginUsage() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MarginUsage copy$default(MarginUsage marginUsage, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marginUsage.openPositionRatio;
        }
        if ((i & 2) != 0) {
            str2 = marginUsage.pendingOrderRatio;
        }
        if ((i & 4) != 0) {
            str3 = marginUsage.reservedMarginRatio;
        }
        if ((i & 8) != 0) {
            str4 = marginUsage.estOpenedPositions;
        }
        return marginUsage.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.openPositionRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pendingOrderRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.reservedMarginRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.estOpenedPositions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarginUsage copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new MarginUsage(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarginUsage)) {
            return false;
        }
        MarginUsage marginUsage = (MarginUsage) obj;
        return Intrinsics.EZpvd((Object) this.openPositionRatio, (Object) marginUsage.openPositionRatio) && Intrinsics.EZpvd((Object) this.pendingOrderRatio, (Object) marginUsage.pendingOrderRatio) && Intrinsics.EZpvd((Object) this.reservedMarginRatio, (Object) marginUsage.reservedMarginRatio) && Intrinsics.EZpvd((Object) this.estOpenedPositions, (Object) marginUsage.estOpenedPositions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstOpenedPositions() {
        return this.estOpenedPositions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenPositionRatio() {
        return this.openPositionRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPendingOrderRatio() {
        return this.pendingOrderRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReservedMarginRatio() {
        return this.reservedMarginRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.openPositionRatio.hashCode() * 31) + this.pendingOrderRatio.hashCode()) * 31) + this.reservedMarginRatio.hashCode()) * 31) + this.estOpenedPositions.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstOpenedPositions(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.estOpenedPositions = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenPositionRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.openPositionRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPendingOrderRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pendingOrderRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReservedMarginRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.reservedMarginRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarginUsage(openPositionRatio=" + this.openPositionRatio + ", pendingOrderRatio=" + this.pendingOrderRatio + ", reservedMarginRatio=" + this.reservedMarginRatio + ", estOpenedPositions=" + this.estOpenedPositions + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.MarginUsage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MarginUsage> serializer() {
            return MarginUsage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MarginUsage(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.openPositionRatio = "";
        } else {
            this.openPositionRatio = str;
        }
        if ((i & 2) == 0) {
            this.pendingOrderRatio = "";
        } else {
            this.pendingOrderRatio = str2;
        }
        if ((i & 4) == 0) {
            this.reservedMarginRatio = "";
        } else {
            this.reservedMarginRatio = str3;
        }
        if ((i & 8) == 0) {
            this.estOpenedPositions = "";
        } else {
            this.estOpenedPositions = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradingBot_trading_bot_impl(MarginUsage marginUsage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) marginUsage.openPositionRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, marginUsage.openPositionRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) marginUsage.pendingOrderRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, marginUsage.pendingOrderRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) marginUsage.reservedMarginRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, marginUsage.reservedMarginRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) marginUsage.estOpenedPositions, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, marginUsage.estOpenedPositions);
    }

    public MarginUsage(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.openPositionRatio = str;
        this.pendingOrderRatio = str2;
        this.reservedMarginRatio = str3;
        this.estOpenedPositions = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.tradingbot.impl.dto.MarginUsage.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MarginUsage(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
