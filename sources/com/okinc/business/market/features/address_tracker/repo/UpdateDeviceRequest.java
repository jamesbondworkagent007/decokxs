package com.okinc.business.market.features.address_tracker.repo;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class UpdateDeviceRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String walletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UpdateDeviceRequest copy$default(UpdateDeviceRequest updateDeviceRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateDeviceRequest.walletAddress;
        }
        return updateDeviceRequest.copydefault(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpdateDeviceRequest copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new UpdateDeviceRequest(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateDeviceRequest) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) ((UpdateDeviceRequest) obj).walletAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.walletAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UpdateDeviceRequest(walletAddress=" + this.walletAddress + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker.repo.UpdateDeviceRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UpdateDeviceRequest> serializer() {
            return UpdateDeviceRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UpdateDeviceRequest(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, UpdateDeviceRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.walletAddress = str;
    }

    public UpdateDeviceRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletAddress = str;
    }
}
