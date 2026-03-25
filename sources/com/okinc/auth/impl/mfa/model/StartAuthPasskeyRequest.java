package com.okinc.auth.impl.mfa.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class StartAuthPasskeyRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String sessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StartAuthPasskeyRequest copy$default(StartAuthPasskeyRequest startAuthPasskeyRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startAuthPasskeyRequest.sessionId;
        }
        return startAuthPasskeyRequest.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StartAuthPasskeyRequest AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new StartAuthPasskeyRequest(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StartAuthPasskeyRequest) && Intrinsics.EZpvd((Object) this.sessionId, (Object) ((StartAuthPasskeyRequest) obj).sessionId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.sessionId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StartAuthPasskeyRequest(sessionId=" + this.sessionId + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.mfa.model.StartAuthPasskeyRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StartAuthPasskeyRequest> serializer() {
            return StartAuthPasskeyRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StartAuthPasskeyRequest(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, StartAuthPasskeyRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionId = str;
    }

    public StartAuthPasskeyRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sessionId = str;
    }
}
