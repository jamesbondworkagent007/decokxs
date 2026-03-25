package com.okinc.auth.impl.passkey.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class RegistrationInitiateResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    @SerializedName("nextStep")
    private final String nextStep;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RegistrationInitiateResponse() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RegistrationInitiateResponse copy$default(RegistrationInitiateResponse registrationInitiateResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = registrationInitiateResponse.nextStep;
        }
        return registrationInitiateResponse.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nextStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RegistrationInitiateResponse copy(String str) {
        return new RegistrationInitiateResponse(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RegistrationInitiateResponse) && Intrinsics.EZpvd((Object) this.nextStep, (Object) ((RegistrationInitiateResponse) obj).nextStep);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextStep() {
        return this.nextStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.nextStep;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RegistrationInitiateResponse(nextStep=" + this.nextStep + ")";
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.RegistrationInitiateResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RegistrationInitiateResponse> serializer() {
            return RegistrationInitiateResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RegistrationInitiateResponse(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.nextStep = null;
        } else {
            this.nextStep = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKAuth_auth_impl(RegistrationInitiateResponse registrationInitiateResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && registrationInitiateResponse.nextStep == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, registrationInitiateResponse.nextStep);
    }

    public RegistrationInitiateResponse(String str) {
        this.nextStep = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:16) call: com.okinc.auth.impl.passkey.model.RegistrationInitiateResponse.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ RegistrationInitiateResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
