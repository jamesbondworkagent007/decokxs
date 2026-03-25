package com.okinc.auth.impl.passkey.model.passkeytoggle;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class PasskeyToggleInfoResponse implements java.io.Serializable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean featureToggleOn;
    private final boolean showFeatureToggle;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Illegal instructions before constructor call */
    public PasskeyToggleInfoResponse() {
        boolean z = false;
        this(z, z, 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyToggleInfoResponse copy$default(PasskeyToggleInfoResponse passkeyToggleInfoResponse, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = passkeyToggleInfoResponse.showFeatureToggle;
        }
        if ((i & 2) != 0) {
            z2 = passkeyToggleInfoResponse.featureToggleOn;
        }
        return passkeyToggleInfoResponse.copy(z, z2);
    }

    @SerialName("featureToggleOn")
    public static /* synthetic */ void getFeatureToggleOn$annotations() {
    }

    @SerialName("showFeatureToggle")
    public static /* synthetic */ void getShowFeatureToggle$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.showFeatureToggle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.featureToggleOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyToggleInfoResponse copy(boolean z, boolean z2) {
        return new PasskeyToggleInfoResponse(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeyToggleInfoResponse)) {
            return false;
        }
        PasskeyToggleInfoResponse passkeyToggleInfoResponse = (PasskeyToggleInfoResponse) obj;
        return this.showFeatureToggle == passkeyToggleInfoResponse.showFeatureToggle && this.featureToggleOn == passkeyToggleInfoResponse.featureToggleOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFeatureToggleOn() {
        return this.featureToggleOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowFeatureToggle() {
        return this.showFeatureToggle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Boolean.hashCode(this.showFeatureToggle) * 31) + Boolean.hashCode(this.featureToggleOn);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyToggleInfoResponse(showFeatureToggle=" + this.showFeatureToggle + ", featureToggleOn=" + this.featureToggleOn + ")";
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.passkeytoggle.PasskeyToggleInfoResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PasskeyToggleInfoResponse> serializer() {
            return PasskeyToggleInfoResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasskeyToggleInfoResponse(int i, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.showFeatureToggle = false;
        } else {
            this.showFeatureToggle = z;
        }
        if ((i & 2) == 0) {
            this.featureToggleOn = false;
        } else {
            this.featureToggleOn = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKAuth_auth_impl(PasskeyToggleInfoResponse passkeyToggleInfoResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || passkeyToggleInfoResponse.showFeatureToggle) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, passkeyToggleInfoResponse.showFeatureToggle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || passkeyToggleInfoResponse.featureToggleOn) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, passkeyToggleInfoResponse.featureToggleOn);
        }
    }

    public PasskeyToggleInfoResponse(boolean z, boolean z2) {
        this.showFeatureToggle = z;
        this.featureToggleOn = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(boolean, boolean):void (m)] (LINE:16) call: com.okinc.auth.impl.passkey.model.passkeytoggle.PasskeyToggleInfoResponse.<init>(boolean, boolean):void type: THIS */
    public /* synthetic */ PasskeyToggleInfoResponse(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
