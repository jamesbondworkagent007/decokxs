package com.okinc.business.defi.biz.core.transaction.sign.ton.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class TonProofReply {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String name;
    private final Proof proof;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TonProofReply copy$default(TonProofReply tonProofReply, String str, Proof proof, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tonProofReply.name;
        }
        if ((i & 2) != 0) {
            proof = tonProofReply.proof;
        }
        return tonProofReply.copy(str, proof);
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
    public final TonProofReply copy(@NotNull String str, @NotNull Proof proof) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(proof, "");
        return new TonProofReply(str, proof);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TonProofReply)) {
            return false;
        }
        TonProofReply tonProofReply = (TonProofReply) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) tonProofReply.name) && Intrinsics.EZpvd(this.proof, tonProofReply.proof);
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
        return "TonProofReply(name=" + this.name + ", proof=" + this.proof + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonProofReply.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TonProofReply> serializer() {
            return TonProofReply$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TonProofReply(int i, String str, Proof proof, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, TonProofReply$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        this.proof = proof;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TonProofReply tonProofReply, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tonProofReply.name);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, TonProofReply$Proof$$serializer.INSTANCE, tonProofReply.proof);
    }

    public TonProofReply(@NotNull String str, @NotNull Proof proof) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(proof, "");
        this.name = str;
        this.proof = proof;
    }

    @Serializable
    public static final class Proof {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final Domain domain;
        private final String payload;
        private final String signature;
        private final long timestamp;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Proof copy$default(Proof proof, long j, Domain domain, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = proof.timestamp;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                domain = proof.domain;
            }
            Domain domain2 = domain;
            if ((i & 4) != 0) {
                str = proof.signature;
            }
            String str3 = str;
            if ((i & 8) != 0) {
                str2 = proof.payload;
            }
            return proof.copy(j2, domain2, str3, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Domain component2() {
            return this.domain;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.signature;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.payload;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Proof copy(long j, @NotNull Domain domain, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(domain, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Proof(j, domain, str, str2);
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
            return this.timestamp == proof.timestamp && Intrinsics.EZpvd(this.domain, proof.domain) && Intrinsics.EZpvd((Object) this.signature, (Object) proof.signature) && Intrinsics.EZpvd((Object) this.payload, (Object) proof.payload);
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
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((Long.hashCode(this.timestamp) * 31) + this.domain.hashCode()) * 31) + this.signature.hashCode()) * 31) + this.payload.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Proof(timestamp=" + this.timestamp + ", domain=" + this.domain + ", signature=" + this.signature + ", payload=" + this.payload + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonProofReply.Proof.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Proof> serializer() {
                return TonProofReply$Proof$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Proof(int i, long j, Domain domain, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.throwMissingFieldException(i, 15, TonProofReply$Proof$$serializer.INSTANCE.getDescriptor());
            }
            this.timestamp = j;
            this.domain = domain;
            this.signature = str;
            this.payload = str2;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Proof proof, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, proof.timestamp);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, TonProofReply$Domain$$serializer.INSTANCE, proof.domain);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, proof.signature);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, proof.payload);
        }

        public Proof(long j, @NotNull Domain domain, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(domain, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.timestamp = j;
            this.domain = domain;
            this.signature = str;
            this.payload = str2;
        }
    }

    @Serializable
    public static final class Domain {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final int lengthBytes;
        private final String value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Domain copy$default(Domain domain, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = domain.lengthBytes;
            }
            if ((i2 & 2) != 0) {
                str = domain.value;
            }
            return domain.copy(i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.lengthBytes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Domain copy(int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Domain(i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Domain)) {
                return false;
            }
            Domain domain = (Domain) obj;
            return this.lengthBytes == domain.lengthBytes && Intrinsics.EZpvd((Object) this.value, (Object) domain.value);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getLengthBytes() {
            return this.lengthBytes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Integer.hashCode(this.lengthBytes) * 31) + this.value.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Domain(lengthBytes=" + this.lengthBytes + ", value=" + this.value + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonProofReply.Domain.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Domain> serializer() {
                return TonProofReply$Domain$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Domain(int i, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, TonProofReply$Domain$$serializer.INSTANCE.getDescriptor());
            }
            this.lengthBytes = i2;
            this.value = str;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Domain domain, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, domain.lengthBytes);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, domain.value);
        }

        public Domain(int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.lengthBytes = i;
            this.value = str;
        }
    }
}
