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
public final class SwitchStepRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String sessionId;
    public final String targetStep;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SwitchStepRequest copy$default(SwitchStepRequest switchStepRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = switchStepRequest.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = switchStepRequest.targetStep;
        }
        return switchStepRequest.KWHzl(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwitchStepRequest KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SwitchStepRequest(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwitchStepRequest)) {
            return false;
        }
        SwitchStepRequest switchStepRequest = (SwitchStepRequest) obj;
        return Intrinsics.EZpvd((Object) this.sessionId, (Object) switchStepRequest.sessionId) && Intrinsics.EZpvd((Object) this.targetStep, (Object) switchStepRequest.targetStep);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.sessionId.hashCode() * 31) + this.targetStep.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SwitchStepRequest(sessionId=" + this.sessionId + ", targetStep=" + this.targetStep + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.mfa.model.SwitchStepRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SwitchStepRequest> serializer() {
            return SwitchStepRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SwitchStepRequest(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, SwitchStepRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionId = str;
        this.targetStep = str2;
    }

    public static final /* synthetic */ void copydefault(SwitchStepRequest switchStepRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, switchStepRequest.sessionId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, switchStepRequest.targetStep);
    }

    public SwitchStepRequest(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.sessionId = str;
        this.targetStep = str2;
    }
}
