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
public final class TypingSpeedBody {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String flightTime;
    private final String inputName;
    private final String tnxSessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TypingSpeedBody copy$default(TypingSpeedBody typingSpeedBody, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = typingSpeedBody.tnxSessionId;
        }
        if ((i & 2) != 0) {
            str2 = typingSpeedBody.inputName;
        }
        if ((i & 4) != 0) {
            str3 = typingSpeedBody.flightTime;
        }
        return typingSpeedBody.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tnxSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.inputName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.flightTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TypingSpeedBody copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new TypingSpeedBody(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypingSpeedBody)) {
            return false;
        }
        TypingSpeedBody typingSpeedBody = (TypingSpeedBody) obj;
        return Intrinsics.EZpvd((Object) this.tnxSessionId, (Object) typingSpeedBody.tnxSessionId) && Intrinsics.EZpvd((Object) this.inputName, (Object) typingSpeedBody.inputName) && Intrinsics.EZpvd((Object) this.flightTime, (Object) typingSpeedBody.flightTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFlightTime() {
        return this.flightTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInputName() {
        return this.inputName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTnxSessionId() {
        return this.tnxSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.tnxSessionId.hashCode() * 31) + this.inputName.hashCode()) * 31) + this.flightTime.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TypingSpeedBody(tnxSessionId=" + this.tnxSessionId + ", inputName=" + this.inputName + ", flightTime=" + this.flightTime + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okrisk.service.TypingSpeedBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TypingSpeedBody> serializer() {
            return TypingSpeedBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TypingSpeedBody(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, TypingSpeedBody$$serializer.INSTANCE.getDescriptor());
        }
        this.tnxSessionId = str;
        this.inputName = str2;
        this.flightTime = str3;
    }

    public static final /* synthetic */ void write$Self$OKRiskLibrary_okrisk_impl(TypingSpeedBody typingSpeedBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, typingSpeedBody.tnxSessionId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, typingSpeedBody.inputName);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, typingSpeedBody.flightTime);
    }

    public TypingSpeedBody(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.tnxSessionId = str;
        this.inputName = str2;
        this.flightTime = str3;
    }
}
