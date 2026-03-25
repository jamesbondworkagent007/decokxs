package com.okinc.auth.impl.passkey.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class StartInHouseAuthenticationRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String crossDevicePasskeySessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StartInHouseAuthenticationRequest copy$default(StartInHouseAuthenticationRequest startInHouseAuthenticationRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startInHouseAuthenticationRequest.crossDevicePasskeySessionId;
        }
        return startInHouseAuthenticationRequest.KWHzl(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StartInHouseAuthenticationRequest KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new StartInHouseAuthenticationRequest(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StartInHouseAuthenticationRequest) && Intrinsics.EZpvd((Object) this.crossDevicePasskeySessionId, (Object) ((StartInHouseAuthenticationRequest) obj).crossDevicePasskeySessionId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.crossDevicePasskeySessionId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StartInHouseAuthenticationRequest(crossDevicePasskeySessionId=" + this.crossDevicePasskeySessionId + ")";
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.StartInHouseAuthenticationRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StartInHouseAuthenticationRequest> serializer() {
            return StartInHouseAuthenticationRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StartInHouseAuthenticationRequest(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, StartInHouseAuthenticationRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.crossDevicePasskeySessionId = str;
    }

    public StartInHouseAuthenticationRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.crossDevicePasskeySessionId = str;
    }
}
