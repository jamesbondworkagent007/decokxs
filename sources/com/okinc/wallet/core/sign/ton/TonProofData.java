package com.okinc.wallet.core.sign.ton;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TonProofData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String address;
    private final ProofData proofData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TonProofData copy$default(TonProofData tonProofData, ProofData proofData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            proofData = tonProofData.proofData;
        }
        if ((i & 2) != 0) {
            str = tonProofData.address;
        }
        return tonProofData.copy(proofData, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProofData component1() {
        return this.proofData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TonProofData copy(@NotNull ProofData proofData, @NotNull String str) {
        Intrinsics.checkNotNullParameter(proofData, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new TonProofData(proofData, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TonProofData)) {
            return false;
        }
        TonProofData tonProofData = (TonProofData) obj;
        return Intrinsics.EZpvd(this.proofData, tonProofData.proofData) && Intrinsics.EZpvd((Object) this.address, (Object) tonProofData.address);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProofData getProofData() {
        return this.proofData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.proofData.hashCode() * 31) + this.address.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TonProofData(proofData=" + this.proofData + ", address=" + this.address + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.ton.TonProofData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TonProofData> serializer() {
            return TonProofData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TonProofData(int i, ProofData proofData, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, TonProofData$$serializer.INSTANCE.getDescriptor());
        }
        this.proofData = proofData;
        this.address = str;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(TonProofData tonProofData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, TonProofData$ProofData$$serializer.INSTANCE, tonProofData.proofData);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tonProofData.address);
    }

    public TonProofData(@NotNull ProofData proofData, @NotNull String str) {
        Intrinsics.checkNotNullParameter(proofData, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.proofData = proofData;
        this.address = str;
    }

    @Serializable
    public static final class ProofData {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String domain;
        private final String payload;
        private final long timestamp;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ProofData copy$default(ProofData proofData, long j, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = proofData.timestamp;
            }
            if ((i & 2) != 0) {
                str = proofData.domain;
            }
            if ((i & 4) != 0) {
                str2 = proofData.payload;
            }
            return proofData.copy(j, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.domain;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.payload;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ProofData copy(long j, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new ProofData(j, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProofData)) {
                return false;
            }
            ProofData proofData = (ProofData) obj;
            return this.timestamp == proofData.timestamp && Intrinsics.EZpvd((Object) this.domain, (Object) proofData.domain) && Intrinsics.EZpvd((Object) this.payload, (Object) proofData.payload);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDomain() {
            return this.domain;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPayload() {
            return this.payload;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((Long.hashCode(this.timestamp) * 31) + this.domain.hashCode()) * 31) + this.payload.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ProofData(timestamp=" + this.timestamp + ", domain=" + this.domain + ", payload=" + this.payload + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.ton.TonProofData.ProofData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ProofData> serializer() {
                return TonProofData$ProofData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ProofData(int i, long j, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i, 7, TonProofData$ProofData$$serializer.INSTANCE.getDescriptor());
            }
            this.timestamp = j;
            this.domain = str;
            this.payload = str2;
        }

        public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(ProofData proofData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, proofData.timestamp);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, proofData.domain);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, proofData.payload);
        }

        public ProofData(long j, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.timestamp = j;
            this.domain = str;
            this.payload = str2;
        }
    }
}
