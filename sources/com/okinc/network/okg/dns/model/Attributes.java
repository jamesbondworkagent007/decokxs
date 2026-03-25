package com.okinc.network.okg.dns.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class Attributes {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean isVpn;
    private final boolean netReachable;
    private final boolean useSocketInsteadPing;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Attributes copy$default(Attributes attributes, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = attributes.isVpn;
        }
        if ((i & 2) != 0) {
            z2 = attributes.netReachable;
        }
        if ((i & 4) != 0) {
            z3 = attributes.useSocketInsteadPing;
        }
        return attributes.copy(z, z2, z3);
    }

    @SerialName("net_reachable")
    public static /* synthetic */ void getNetReachable$annotations() {
    }

    @SerialName("flag_use_socket_opt")
    public static /* synthetic */ void getUseSocketInsteadPing$annotations() {
    }

    @SerialName("is_vpn")
    public static /* synthetic */ void isVpn$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isVpn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.netReachable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.useSocketInsteadPing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Attributes copy(boolean z, boolean z2, boolean z3) {
        return new Attributes(z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Attributes)) {
            return false;
        }
        Attributes attributes = (Attributes) obj;
        return this.isVpn == attributes.isVpn && this.netReachable == attributes.netReachable && this.useSocketInsteadPing == attributes.useSocketInsteadPing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNetReachable() {
        return this.netReachable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUseSocketInsteadPing() {
        return this.useSocketInsteadPing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.isVpn) * 31) + Boolean.hashCode(this.netReachable)) * 31) + Boolean.hashCode(this.useSocketInsteadPing);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isVpn() {
        return this.isVpn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Attributes(isVpn=" + this.isVpn + ", netReachable=" + this.netReachable + ", useSocketInsteadPing=" + this.useSocketInsteadPing + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.dns.model.Attributes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Attributes> serializer() {
            return Attributes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Attributes(int i, boolean z, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, Attributes$$serializer.INSTANCE.getDescriptor());
        }
        this.isVpn = z;
        this.netReachable = z2;
        if ((i & 4) == 0) {
            this.useSocketInsteadPing = true;
        } else {
            this.useSocketInsteadPing = z3;
        }
    }

    public static final /* synthetic */ void write$Self$OKNetwork_network(Attributes attributes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, attributes.isVpn);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, attributes.netReachable);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && attributes.useSocketInsteadPing) {
            return;
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, attributes.useSocketInsteadPing);
    }

    public Attributes(boolean z, boolean z2, boolean z3) {
        this.isVpn = z;
        this.netReachable = z2;
        this.useSocketInsteadPing = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 boolean)
  (r2v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
 A[MD:(boolean, boolean, boolean):void (m)] (LINE:53) call: com.okinc.network.okg.dns.model.Attributes.<init>(boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ Attributes(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, (i & 4) != 0 ? true : z3);
    }
}
