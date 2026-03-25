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
public final class TonProof {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String name;
    private final Proof proof;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TonProof() {
        this((String) null, (Proof) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TonProof copy$default(TonProof tonProof, String str, Proof proof, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tonProof.name;
        }
        if ((i & 2) != 0) {
            proof = tonProof.proof;
        }
        return tonProof.copy(str, proof);
    }

    @SerialName("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @SerialName("proof")
    public static /* synthetic */ void getProof$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Proof component2() {
        return this.proof;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TonProof copy(@NotNull String str, @NotNull Proof proof) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(proof, "");
        return new TonProof(str, proof);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TonProof)) {
            return false;
        }
        TonProof tonProof = (TonProof) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) tonProof.name) && Intrinsics.EZpvd(this.proof, tonProof.proof);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Proof getProof() {
        return this.proof;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.name.hashCode() * 31) + this.proof.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TonProof(name=" + this.name + ", proof=" + this.proof + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.jwt.domain.model.TonProof.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TonProof> serializer() {
            return TonProof$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TonProof(int i, String str, Proof proof, SerializationConstructorMarker serializationConstructorMarker) {
        this.name = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.proof = new Proof((Domain) null, (String) null, (String) null, 0, 15, (DefaultConstructorMarker) null);
        } else {
            this.proof = proof;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TonProof tonProof, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tonProof.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tonProof.name);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(tonProof.proof, new Proof((Domain) null, (String) null, (String) null, 0, 15, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, Proof$$serializer.INSTANCE, tonProof.proof);
    }

    public TonProof(@NotNull String str, @NotNull Proof proof) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(proof, "");
        this.name = str;
        this.proof = proof;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:com.okinc.business.market.features.jwt.domain.model.Proof:?: TERNARY null = ((wrap:int:0x0006: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.jwt.domain.model.Proof:0x0014: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.jwt.domain.model.Domain:?: CAST (com.okinc.business.market.features.jwt.domain.model.Domain) (null com.okinc.business.market.features.jwt.domain.model.Domain))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(com.okinc.business.market.features.jwt.domain.model.Domain, java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:13) call: com.okinc.business.market.features.jwt.domain.model.Proof.<init>(com.okinc.business.market.features.jwt.domain.model.Domain, java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r9v0 com.okinc.business.market.features.jwt.domain.model.Proof))
 A[MD:(java.lang.String, com.okinc.business.market.features.jwt.domain.model.Proof):void (m)] (LINE:9) call: com.okinc.business.market.features.jwt.domain.model.TonProof.<init>(java.lang.String, com.okinc.business.market.features.jwt.domain.model.Proof):void type: THIS */
    public /* synthetic */ TonProof(String str, Proof proof, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new Proof((Domain) null, (String) null, (String) null, 0, 15, (DefaultConstructorMarker) null) : proof);
    }
}
