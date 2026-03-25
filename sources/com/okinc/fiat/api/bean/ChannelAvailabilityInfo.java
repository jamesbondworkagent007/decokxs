package com.okinc.fiat.api.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class ChannelAvailabilityInfo {
    private boolean canUse;
    private final boolean canUseFoxbitPix;
    private final boolean canUseP2p;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChannelAvailabilityInfo() {
        this(false, false, false, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChannelAvailabilityInfo copy$default(ChannelAvailabilityInfo channelAvailabilityInfo, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = channelAvailabilityInfo.canUse;
        }
        if ((i & 2) != 0) {
            z2 = channelAvailabilityInfo.canUseP2p;
        }
        if ((i & 4) != 0) {
            z3 = channelAvailabilityInfo.canUseFoxbitPix;
        }
        return channelAvailabilityInfo.copy(z, z2, z3);
    }

    @SerialName("canUse")
    public static /* synthetic */ void getCanUse$annotations() {
    }

    @SerialName("canUseFoxbitPix")
    public static /* synthetic */ void getCanUseFoxbitPix$annotations() {
    }

    @SerialName("canUseP2p")
    public static /* synthetic */ void getCanUseP2p$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.canUse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.canUseP2p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.canUseFoxbitPix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChannelAvailabilityInfo copy(boolean z, boolean z2, boolean z3) {
        return new ChannelAvailabilityInfo(z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelAvailabilityInfo)) {
            return false;
        }
        ChannelAvailabilityInfo channelAvailabilityInfo = (ChannelAvailabilityInfo) obj;
        return this.canUse == channelAvailabilityInfo.canUse && this.canUseP2p == channelAvailabilityInfo.canUseP2p && this.canUseFoxbitPix == channelAvailabilityInfo.canUseFoxbitPix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanUse() {
        return this.canUse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanUseFoxbitPix() {
        return this.canUseFoxbitPix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanUseP2p() {
        return this.canUseP2p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.canUse) * 31) + Boolean.hashCode(this.canUseP2p)) * 31) + Boolean.hashCode(this.canUseFoxbitPix);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanUse(boolean z) {
        this.canUse = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChannelAvailabilityInfo(canUse=" + this.canUse + ", canUseP2p=" + this.canUseP2p + ", canUseFoxbitPix=" + this.canUseFoxbitPix + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.fiat.api.bean.ChannelAvailabilityInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChannelAvailabilityInfo> serializer() {
            return ChannelAvailabilityInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChannelAvailabilityInfo(int i, boolean z, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.canUse = false;
        } else {
            this.canUse = z;
        }
        if ((i & 2) == 0) {
            this.canUseP2p = false;
        } else {
            this.canUseP2p = z2;
        }
        if ((i & 4) == 0) {
            this.canUseFoxbitPix = false;
        } else {
            this.canUseFoxbitPix = z3;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(ChannelAvailabilityInfo channelAvailabilityInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || channelAvailabilityInfo.canUse) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, channelAvailabilityInfo.canUse);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || channelAvailabilityInfo.canUseP2p) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, channelAvailabilityInfo.canUseP2p);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || channelAvailabilityInfo.canUseFoxbitPix) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, channelAvailabilityInfo.canUseFoxbitPix);
        }
    }

    public ChannelAvailabilityInfo(boolean z, boolean z2, boolean z3) {
        this.canUse = z;
        this.canUseP2p = z2;
        this.canUseFoxbitPix = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(boolean, boolean, boolean):void (m)] (LINE:9) call: com.okinc.fiat.api.bean.ChannelAvailabilityInfo.<init>(boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ ChannelAvailabilityInfo(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
