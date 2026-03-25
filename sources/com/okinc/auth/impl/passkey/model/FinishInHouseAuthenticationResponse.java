package com.okinc.auth.impl.passkey.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class FinishInHouseAuthenticationResponse {
    public final RegistrationStartResponse passkeyUpgradeOptions;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FinishInHouseAuthenticationResponse() {
        this((RegistrationStartResponse) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FinishInHouseAuthenticationResponse copy$default(FinishInHouseAuthenticationResponse finishInHouseAuthenticationResponse, RegistrationStartResponse registrationStartResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            registrationStartResponse = finishInHouseAuthenticationResponse.passkeyUpgradeOptions;
        }
        return finishInHouseAuthenticationResponse.EZpvd(registrationStartResponse);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FinishInHouseAuthenticationResponse EZpvd(RegistrationStartResponse registrationStartResponse) {
        return new FinishInHouseAuthenticationResponse(registrationStartResponse);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RegistrationStartResponse OLrzqt() {
        return this.passkeyUpgradeOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FinishInHouseAuthenticationResponse) && Intrinsics.EZpvd(this.passkeyUpgradeOptions, ((FinishInHouseAuthenticationResponse) obj).passkeyUpgradeOptions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        RegistrationStartResponse registrationStartResponse = this.passkeyUpgradeOptions;
        if (registrationStartResponse == null) {
            return 0;
        }
        return registrationStartResponse.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FinishInHouseAuthenticationResponse(passkeyUpgradeOptions=" + this.passkeyUpgradeOptions + ")";
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.FinishInHouseAuthenticationResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FinishInHouseAuthenticationResponse> serializer() {
            return FinishInHouseAuthenticationResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FinishInHouseAuthenticationResponse(int i, RegistrationStartResponse registrationStartResponse, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.passkeyUpgradeOptions = null;
        } else {
            this.passkeyUpgradeOptions = registrationStartResponse;
        }
    }

    public static final /* synthetic */ void copydefault(FinishInHouseAuthenticationResponse finishInHouseAuthenticationResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && finishInHouseAuthenticationResponse.passkeyUpgradeOptions == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, RegistrationStartResponse$$serializer.INSTANCE, finishInHouseAuthenticationResponse.passkeyUpgradeOptions);
    }

    public FinishInHouseAuthenticationResponse(RegistrationStartResponse registrationStartResponse) {
        this.passkeyUpgradeOptions = registrationStartResponse;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.auth.impl.passkey.model.RegistrationStartResponse:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.auth.impl.passkey.model.RegistrationStartResponse) : (r1v0 com.okinc.auth.impl.passkey.model.RegistrationStartResponse))
 A[MD:(com.okinc.auth.impl.passkey.model.RegistrationStartResponse):void (m)] (LINE:24) call: com.okinc.auth.impl.passkey.model.FinishInHouseAuthenticationResponse.<init>(com.okinc.auth.impl.passkey.model.RegistrationStartResponse):void type: THIS */
    public /* synthetic */ FinishInHouseAuthenticationResponse(RegistrationStartResponse registrationStartResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : registrationStartResponse);
    }
}
