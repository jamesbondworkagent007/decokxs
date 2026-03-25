package com.okinc.auth.impl.passkey.model.passkeytoggle;

import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class SwitchPasskeyToggleRequest implements java.io.Serializable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String sessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SwitchPasskeyToggleRequest() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SwitchPasskeyToggleRequest copy$default(SwitchPasskeyToggleRequest switchPasskeyToggleRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = switchPasskeyToggleRequest.sessionId;
        }
        return switchPasskeyToggleRequest.copy(str);
    }

    @SerialName(OtcExtraKeys.SESSIONID)
    public static /* synthetic */ void getSessionId$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwitchPasskeyToggleRequest copy(String str) {
        return new SwitchPasskeyToggleRequest(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SwitchPasskeyToggleRequest) && Intrinsics.EZpvd((Object) this.sessionId, (Object) ((SwitchPasskeyToggleRequest) obj).sessionId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.sessionId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SwitchPasskeyToggleRequest(sessionId=" + this.sessionId + ")";
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.passkeytoggle.SwitchPasskeyToggleRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SwitchPasskeyToggleRequest> serializer() {
            return SwitchPasskeyToggleRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SwitchPasskeyToggleRequest(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.sessionId = null;
        } else {
            this.sessionId = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKAuth_auth_impl(SwitchPasskeyToggleRequest switchPasskeyToggleRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && switchPasskeyToggleRequest.sessionId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, switchPasskeyToggleRequest.sessionId);
    }

    public SwitchPasskeyToggleRequest(String str) {
        this.sessionId = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:48) call: com.okinc.auth.impl.passkey.model.passkeytoggle.SwitchPasskeyToggleRequest.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ SwitchPasskeyToggleRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
