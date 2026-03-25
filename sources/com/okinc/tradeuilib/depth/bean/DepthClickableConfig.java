package com.okinc.tradeuilib.depth.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class DepthClickableConfig {
    private Boolean amtClickable;
    private Boolean priceClickable;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DepthClickableConfig() {
        this((Boolean) null, (Boolean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DepthClickableConfig copy$default(DepthClickableConfig depthClickableConfig, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = depthClickableConfig.priceClickable;
        }
        if ((i & 2) != 0) {
            bool2 = depthClickableConfig.amtClickable;
        }
        return depthClickableConfig.copy(bool, bool2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.priceClickable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.amtClickable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DepthClickableConfig copy(Boolean bool, Boolean bool2) {
        return new DepthClickableConfig(bool, bool2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepthClickableConfig)) {
            return false;
        }
        DepthClickableConfig depthClickableConfig = (DepthClickableConfig) obj;
        return Intrinsics.EZpvd(this.priceClickable, depthClickableConfig.priceClickable) && Intrinsics.EZpvd(this.amtClickable, depthClickableConfig.amtClickable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAmtClickable() {
        return this.amtClickable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPriceClickable() {
        return this.priceClickable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.priceClickable;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.amtClickable;
        return (iHashCode * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmtClickable(Boolean bool) {
        this.amtClickable = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceClickable(Boolean bool) {
        this.priceClickable = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DepthClickableConfig(priceClickable=" + this.priceClickable + ", amtClickable=" + this.amtClickable + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeuilib.depth.bean.DepthClickableConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DepthClickableConfig> serializer() {
            return DepthClickableConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DepthClickableConfig(int i, Boolean bool, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        this.priceClickable = (i & 1) == 0 ? Boolean.TRUE : bool;
        if ((i & 2) == 0) {
            this.amtClickable = Boolean.TRUE;
        } else {
            this.amtClickable = bool2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeUILib_trade_ui(DepthClickableConfig depthClickableConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(depthClickableConfig.priceClickable, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, depthClickableConfig.priceClickable);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(depthClickableConfig.amtClickable, Boolean.TRUE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, depthClickableConfig.amtClickable);
    }

    public DepthClickableConfig(Boolean bool, Boolean bool2) {
        this.priceClickable = bool;
        this.amtClickable = bool2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0004: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r1v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x000a: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r2v0 java.lang.Boolean))
 A[MD:(java.lang.Boolean, java.lang.Boolean):void (m)] (LINE:8) call: com.okinc.tradeuilib.depth.bean.DepthClickableConfig.<init>(java.lang.Boolean, java.lang.Boolean):void type: THIS */
    public /* synthetic */ DepthClickableConfig(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.TRUE : bool, (i & 2) != 0 ? Boolean.TRUE : bool2);
    }
}
