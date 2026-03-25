package com.okinc.business.market.features.jwt.domain;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class JwtDetails {
    public static final Companion Companion = new Companion(null);
    public final long expiry;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JwtDetails() {
        this(0L, 1, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ JwtDetails copy$default(JwtDetails jwtDetails, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = jwtDetails.expiry;
        }
        return jwtDetails.OLrzqt(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JwtDetails OLrzqt(long j) {
        return new JwtDetails(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JwtDetails) && this.expiry == ((JwtDetails) obj).expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Long.hashCode(this.expiry);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "JwtDetails(expiry=" + this.expiry + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.jwt.domain.JwtDetails.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<JwtDetails> serializer() {
            return JwtDetails$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ JwtDetails(int i, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.expiry = 0L;
        } else {
            this.expiry = j;
        }
    }

    public static final /* synthetic */ void EZpvd(JwtDetails jwtDetails, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && jwtDetails.expiry == 0) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 0, jwtDetails.expiry);
    }

    public JwtDetails(long j) {
        this.expiry = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r1v0 long))
 A[MD:(long):void (m)] (LINE:76) call: com.okinc.business.market.features.jwt.domain.JwtDetails.<init>(long):void type: THIS */
    public /* synthetic */ JwtDetails(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
    }
}
