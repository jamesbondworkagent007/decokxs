package com.okinc.okex.lite.home.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class NUBOnboardingResponseV2 {

    @SerializedName("nubDataV1")
    private final NUBOnboardingResponse nubDataV1;

    @SerializedName("nubDataV2")
    private final NUBOnboardingV2 nubDataV2;

    @SerializedName("nubVersion")
    private final NubVersion nubVersion;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, NubVersion.Companion.serializer()};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NUBOnboardingResponseV2 copy$default(NUBOnboardingResponseV2 nUBOnboardingResponseV2, NUBOnboardingResponse nUBOnboardingResponse, NUBOnboardingV2 nUBOnboardingV2, NubVersion nubVersion, int i, Object obj) {
        if ((i & 1) != 0) {
            nUBOnboardingResponse = nUBOnboardingResponseV2.nubDataV1;
        }
        if ((i & 2) != 0) {
            nUBOnboardingV2 = nUBOnboardingResponseV2.nubDataV2;
        }
        if ((i & 4) != 0) {
            nubVersion = nUBOnboardingResponseV2.nubVersion;
        }
        return nUBOnboardingResponseV2.OLrzqt(nUBOnboardingResponse, nUBOnboardingV2, nubVersion);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NUBOnboardingResponseV2 OLrzqt(NUBOnboardingResponse nUBOnboardingResponse, NUBOnboardingV2 nUBOnboardingV2, @NotNull NubVersion nubVersion) {
        Intrinsics.checkNotNullParameter(nubVersion, "");
        return new NUBOnboardingResponseV2(nUBOnboardingResponse, nUBOnboardingV2, nubVersion);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NUBOnboardingResponseV2)) {
            return false;
        }
        NUBOnboardingResponseV2 nUBOnboardingResponseV2 = (NUBOnboardingResponseV2) obj;
        return Intrinsics.EZpvd(this.nubDataV1, nUBOnboardingResponseV2.nubDataV1) && Intrinsics.EZpvd(this.nubDataV2, nUBOnboardingResponseV2.nubDataV2) && this.nubVersion == nUBOnboardingResponseV2.nubVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        NUBOnboardingResponse nUBOnboardingResponse = this.nubDataV1;
        int iHashCode = nUBOnboardingResponse == null ? 0 : nUBOnboardingResponse.hashCode();
        NUBOnboardingV2 nUBOnboardingV2 = this.nubDataV2;
        return (((iHashCode * 31) + (nUBOnboardingV2 != null ? nUBOnboardingV2.hashCode() : 0)) * 31) + this.nubVersion.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NUBOnboardingResponseV2(nubDataV1=" + this.nubDataV1 + ", nubDataV2=" + this.nubDataV2 + ", nubVersion=" + this.nubVersion + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.NUBOnboardingResponseV2.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NUBOnboardingResponseV2> serializer() {
            return NUBOnboardingResponseV2$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NUBOnboardingResponseV2(int i, NUBOnboardingResponse nUBOnboardingResponse, NUBOnboardingV2 nUBOnboardingV2, NubVersion nubVersion, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, NUBOnboardingResponseV2$$serializer.INSTANCE.getDescriptor());
        }
        this.nubDataV1 = nUBOnboardingResponse;
        this.nubDataV2 = nUBOnboardingV2;
        this.nubVersion = nubVersion;
    }

    public static final /* synthetic */ void AEQbTJ(NUBOnboardingResponseV2 nUBOnboardingResponseV2, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, NUBOnboardingResponse$$serializer.INSTANCE, nUBOnboardingResponseV2.nubDataV1);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, NUBOnboardingV2$$serializer.INSTANCE, nUBOnboardingResponseV2.nubDataV2);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], nUBOnboardingResponseV2.nubVersion);
    }

    public NUBOnboardingResponseV2(NUBOnboardingResponse nUBOnboardingResponse, NUBOnboardingV2 nUBOnboardingV2, @NotNull NubVersion nubVersion) {
        Intrinsics.checkNotNullParameter(nubVersion, "");
        this.nubDataV1 = nUBOnboardingResponse;
        this.nubDataV2 = nUBOnboardingV2;
        this.nubVersion = nubVersion;
    }
}
