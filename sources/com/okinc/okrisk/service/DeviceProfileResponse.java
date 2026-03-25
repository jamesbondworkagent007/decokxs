package com.okinc.okrisk.service;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class DeviceProfileResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String fingerprintId;
    private final String status;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DeviceProfileResponse copy$default(DeviceProfileResponse deviceProfileResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceProfileResponse.status;
        }
        if ((i & 2) != 0) {
            str2 = deviceProfileResponse.fingerprintId;
        }
        return deviceProfileResponse.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fingerprintId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeviceProfileResponse copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DeviceProfileResponse(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceProfileResponse)) {
            return false;
        }
        DeviceProfileResponse deviceProfileResponse = (DeviceProfileResponse) obj;
        return Intrinsics.EZpvd((Object) this.status, (Object) deviceProfileResponse.status) && Intrinsics.EZpvd((Object) this.fingerprintId, (Object) deviceProfileResponse.fingerprintId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFingerprintId() {
        return this.fingerprintId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.status.hashCode() * 31) + this.fingerprintId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeviceProfileResponse(status=" + this.status + ", fingerprintId=" + this.fingerprintId + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okrisk.service.DeviceProfileResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DeviceProfileResponse> serializer() {
            return DeviceProfileResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DeviceProfileResponse(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, DeviceProfileResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.status = str;
        this.fingerprintId = str2;
    }

    public static final /* synthetic */ void write$Self$OKRiskLibrary_okrisk_impl(DeviceProfileResponse deviceProfileResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, deviceProfileResponse.status);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, deviceProfileResponse.fingerprintId);
    }

    public DeviceProfileResponse(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.status = str;
        this.fingerprintId = str2;
    }
}
