package com.okinc.okpaymentapi.data.remote.model.experience;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class GetAuthResp {
    private AuthenticationParams authenticationParams;
    private String authenticationType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GetAuthResp() {
        this((String) null, (AuthenticationParams) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GetAuthResp copy$default(GetAuthResp getAuthResp, String str, AuthenticationParams authenticationParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAuthResp.authenticationType;
        }
        if ((i & 2) != 0) {
            authenticationParams = getAuthResp.authenticationParams;
        }
        return getAuthResp.copy(str, authenticationParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.authenticationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthenticationParams component2() {
        return this.authenticationParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetAuthResp copy(@NotNull String str, @NotNull AuthenticationParams authenticationParams) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(authenticationParams, "");
        return new GetAuthResp(str, authenticationParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAuthResp)) {
            return false;
        }
        GetAuthResp getAuthResp = (GetAuthResp) obj;
        return Intrinsics.EZpvd((Object) this.authenticationType, (Object) getAuthResp.authenticationType) && Intrinsics.EZpvd(this.authenticationParams, getAuthResp.authenticationParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthenticationParams getAuthenticationParams() {
        return this.authenticationParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuthenticationType() {
        return this.authenticationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.authenticationType.hashCode() * 31) + this.authenticationParams.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAuthenticationParams(@NotNull AuthenticationParams authenticationParams) {
        Intrinsics.checkNotNullParameter(authenticationParams, "");
        this.authenticationParams = authenticationParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAuthenticationType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.authenticationType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetAuthResp(authenticationType=" + this.authenticationType + ", authenticationParams=" + this.authenticationParams + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.GetAuthResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetAuthResp> serializer() {
            return GetAuthResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetAuthResp(int i, String str, AuthenticationParams authenticationParams, SerializationConstructorMarker serializationConstructorMarker) {
        this.authenticationType = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.authenticationParams = new AuthenticationParams((String) null, 1, (DefaultConstructorMarker) null);
        } else {
            this.authenticationParams = authenticationParams;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(GetAuthResp getAuthResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) getAuthResp.authenticationType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, getAuthResp.authenticationType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(getAuthResp.authenticationParams, new AuthenticationParams((String) null, 1, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, AuthenticationParams$$serializer.INSTANCE, getAuthResp.authenticationParams);
    }

    public GetAuthResp(@NotNull String str, @NotNull AuthenticationParams authenticationParams) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(authenticationParams, "");
        this.authenticationType = str;
        this.authenticationParams = authenticationParams;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:com.okinc.okpaymentapi.data.remote.model.experience.AuthenticationParams:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.okpaymentapi.data.remote.model.experience.AuthenticationParams:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (1 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:21) call: com.okinc.okpaymentapi.data.remote.model.experience.AuthenticationParams.<init>(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r2v0 com.okinc.okpaymentapi.data.remote.model.experience.AuthenticationParams))
 A[MD:(java.lang.String, com.okinc.okpaymentapi.data.remote.model.experience.AuthenticationParams):void (m)] (LINE:19) call: com.okinc.okpaymentapi.data.remote.model.experience.GetAuthResp.<init>(java.lang.String, com.okinc.okpaymentapi.data.remote.model.experience.AuthenticationParams):void type: THIS */
    public /* synthetic */ GetAuthResp(String str, AuthenticationParams authenticationParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new AuthenticationParams((String) null, 1, (DefaultConstructorMarker) null) : authenticationParams);
    }
}
