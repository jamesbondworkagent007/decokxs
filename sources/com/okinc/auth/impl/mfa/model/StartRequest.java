package com.okinc.auth.impl.mfa.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class StartRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final boolean isPasskeyEnable;
    public final String sessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StartRequest copy$default(StartRequest startRequest, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startRequest.sessionId;
        }
        if ((i & 2) != 0) {
            z = startRequest.isPasskeyEnable;
        }
        return startRequest.AEQbTJ(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StartRequest AEQbTJ(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new StartRequest(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartRequest)) {
            return false;
        }
        StartRequest startRequest = (StartRequest) obj;
        return Intrinsics.EZpvd((Object) this.sessionId, (Object) startRequest.sessionId) && this.isPasskeyEnable == startRequest.isPasskeyEnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.sessionId.hashCode() * 31) + Boolean.hashCode(this.isPasskeyEnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StartRequest(sessionId=" + this.sessionId + ", isPasskeyEnable=" + this.isPasskeyEnable + ")";
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.mfa.model.StartRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StartRequest> serializer() {
            return StartRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StartRequest(int i, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, StartRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionId = str;
        this.isPasskeyEnable = z;
    }

    public static final /* synthetic */ void AEQbTJ(StartRequest startRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, startRequest.sessionId);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, startRequest.isPasskeyEnable);
    }

    public StartRequest(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sessionId = str;
        this.isPasskeyEnable = z;
    }
}
