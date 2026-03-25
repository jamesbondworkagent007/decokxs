package com.okinc.business.market.features.jwt.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class Proof {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Domain domain;
    private final String payload;
    private final String signature;
    private final int timestamp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Proof() {
        this((Domain) null, (String) null, (String) null, 0, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Proof copy$default(Proof proof, Domain domain, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            domain = proof.domain;
        }
        if ((i2 & 2) != 0) {
            str = proof.payload;
        }
        if ((i2 & 4) != 0) {
            str2 = proof.signature;
        }
        if ((i2 & 8) != 0) {
            i = proof.timestamp;
        }
        return proof.copy(domain, str, str2, i);
    }

    @SerialName("domain")
    public static /* synthetic */ void getDomain$annotations() {
    }

    @SerialName("payload")
    public static /* synthetic */ void getPayload$annotations() {
    }

    @SerialName("signature")
    public static /* synthetic */ void getSignature$annotations() {
    }

    @SerialName("timestamp")
    public static /* synthetic */ void getTimestamp$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Domain component1() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Proof copy(@NotNull Domain domain, @NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(domain, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new Proof(domain, str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Proof)) {
            return false;
        }
        Proof proof = (Proof) obj;
        return Intrinsics.EZpvd(this.domain, proof.domain) && Intrinsics.EZpvd((Object) this.payload, (Object) proof.payload) && Intrinsics.EZpvd((Object) this.signature, (Object) proof.signature) && this.timestamp == proof.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Domain getDomain() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayload() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.domain.hashCode() * 31) + this.payload.hashCode()) * 31) + this.signature.hashCode()) * 31) + Integer.hashCode(this.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Proof(domain=" + this.domain + ", payload=" + this.payload + ", signature=" + this.signature + ", timestamp=" + this.timestamp + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.jwt.domain.model.Proof.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Proof> serializer() {
            return Proof$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Proof(int i, Domain domain, String str, String str2, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        this.domain = (i & 1) == 0 ? new Domain(0, (String) null, 3, (DefaultConstructorMarker) null) : domain;
        if ((i & 2) == 0) {
            this.payload = "";
        } else {
            this.payload = str;
        }
        if ((i & 4) == 0) {
            this.signature = "";
        } else {
            this.signature = str2;
        }
        if ((i & 8) == 0) {
            this.timestamp = 0;
        } else {
            this.timestamp = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(Proof proof, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(proof.domain, new Domain(0, (String) null, 3, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, Domain$$serializer.INSTANCE, proof.domain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) proof.payload, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, proof.payload);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) proof.signature, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, proof.signature);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && proof.timestamp == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, proof.timestamp);
    }

    public Proof(@NotNull Domain domain, @NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(domain, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.domain = domain;
        this.payload = str;
        this.signature = str2;
        this.timestamp = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.jwt.domain.model.Domain:?: TERNARY null = ((wrap:int:0x0000: ARITH (r7v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.jwt.domain.model.Domain:0x0009: CONSTRUCTOR 
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:20) call: com.okinc.business.market.features.jwt.domain.model.Domain.<init>(int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r3v0 com.okinc.business.market.features.jwt.domain.model.Domain))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r7v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r7v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0018: ARITH (r7v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 int))
 A[MD:(com.okinc.business.market.features.jwt.domain.model.Domain, java.lang.String, java.lang.String, int):void (m)] (LINE:18) call: com.okinc.business.market.features.jwt.domain.model.Proof.<init>(com.okinc.business.market.features.jwt.domain.model.Domain, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ Proof(Domain domain, String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new Domain(0, (String) null, 3, (DefaultConstructorMarker) null) : domain, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? 0 : i);
    }
}
