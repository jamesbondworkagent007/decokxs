package com.okinc.core.ok_app.security;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class SecurityDetection {
    private final String detectionResult;
    private final long detectionTime;
    private final RiskAttributes riskAttributes;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SecurityDetection copy$default(SecurityDetection securityDetection, long j, String str, RiskAttributes riskAttributes, int i, Object obj) {
        if ((i & 1) != 0) {
            j = securityDetection.detectionTime;
        }
        if ((i & 2) != 0) {
            str = securityDetection.detectionResult;
        }
        if ((i & 4) != 0) {
            riskAttributes = securityDetection.riskAttributes;
        }
        return securityDetection.copy(j, str, riskAttributes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.detectionTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.detectionResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskAttributes component3() {
        return this.riskAttributes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SecurityDetection copy(long j, @NotNull String str, @NotNull RiskAttributes riskAttributes) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(riskAttributes, "");
        return new SecurityDetection(j, str, riskAttributes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecurityDetection)) {
            return false;
        }
        SecurityDetection securityDetection = (SecurityDetection) obj;
        return this.detectionTime == securityDetection.detectionTime && Intrinsics.EZpvd((Object) this.detectionResult, (Object) securityDetection.detectionResult) && Intrinsics.EZpvd(this.riskAttributes, securityDetection.riskAttributes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDetectionResult() {
        return this.detectionResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getDetectionTime() {
        return this.detectionTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskAttributes getRiskAttributes() {
        return this.riskAttributes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.detectionTime) * 31) + this.detectionResult.hashCode()) * 31) + this.riskAttributes.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SecurityDetection(detectionTime=" + this.detectionTime + ", detectionResult=" + this.detectionResult + ", riskAttributes=" + this.riskAttributes + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.core.ok_app.security.SecurityDetection.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SecurityDetection> serializer() {
            return SecurityDetection$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SecurityDetection(int i, long j, String str, RiskAttributes riskAttributes, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, SecurityDetection$$serializer.INSTANCE.getDescriptor());
        }
        this.detectionTime = j;
        this.detectionResult = str;
        this.riskAttributes = riskAttributes;
    }

    public static final /* synthetic */ void write$Self$OKApp_ok_app(SecurityDetection securityDetection, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, securityDetection.detectionTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, securityDetection.detectionResult);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, RiskAttributes$$serializer.INSTANCE, securityDetection.riskAttributes);
    }

    public SecurityDetection(long j, @NotNull String str, @NotNull RiskAttributes riskAttributes) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(riskAttributes, "");
        this.detectionTime = j;
        this.detectionResult = str;
        this.riskAttributes = riskAttributes;
    }
}
