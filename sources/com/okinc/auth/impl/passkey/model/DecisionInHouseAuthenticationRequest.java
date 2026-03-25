package com.okinc.auth.impl.passkey.model;

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
public final class DecisionInHouseAuthenticationRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String crossDevicePasskeySessionId;
    public final String selectedOption;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DecisionInHouseAuthenticationRequest copy$default(DecisionInHouseAuthenticationRequest decisionInHouseAuthenticationRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = decisionInHouseAuthenticationRequest.crossDevicePasskeySessionId;
        }
        if ((i & 2) != 0) {
            str2 = decisionInHouseAuthenticationRequest.selectedOption;
        }
        return decisionInHouseAuthenticationRequest.KWHzl(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DecisionInHouseAuthenticationRequest KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DecisionInHouseAuthenticationRequest(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecisionInHouseAuthenticationRequest)) {
            return false;
        }
        DecisionInHouseAuthenticationRequest decisionInHouseAuthenticationRequest = (DecisionInHouseAuthenticationRequest) obj;
        return Intrinsics.EZpvd((Object) this.crossDevicePasskeySessionId, (Object) decisionInHouseAuthenticationRequest.crossDevicePasskeySessionId) && Intrinsics.EZpvd((Object) this.selectedOption, (Object) decisionInHouseAuthenticationRequest.selectedOption);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.crossDevicePasskeySessionId.hashCode() * 31) + this.selectedOption.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DecisionInHouseAuthenticationRequest(crossDevicePasskeySessionId=" + this.crossDevicePasskeySessionId + ", selectedOption=" + this.selectedOption + ")";
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.DecisionInHouseAuthenticationRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DecisionInHouseAuthenticationRequest> serializer() {
            return DecisionInHouseAuthenticationRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DecisionInHouseAuthenticationRequest(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, DecisionInHouseAuthenticationRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.crossDevicePasskeySessionId = str;
        this.selectedOption = str2;
    }

    public static final /* synthetic */ void AEQbTJ(DecisionInHouseAuthenticationRequest decisionInHouseAuthenticationRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, decisionInHouseAuthenticationRequest.crossDevicePasskeySessionId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, decisionInHouseAuthenticationRequest.selectedOption);
    }

    public DecisionInHouseAuthenticationRequest(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.crossDevicePasskeySessionId = str;
        this.selectedOption = str2;
    }
}
