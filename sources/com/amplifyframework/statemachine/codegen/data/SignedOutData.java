package com.amplifyframework.statemachine.codegen.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class SignedOutData {
    public static final Companion Companion = new Companion(null);
    private final GlobalSignOutErrorData globalSignOutErrorData;
    private final boolean hasError;
    private final HostedUIErrorData hostedUIErrorData;
    private final String lastKnownUsername;
    private final RevokeTokenErrorData revokeTokenErrorData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignedOutData() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignedOutData copy$default(SignedOutData signedOutData, String str, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, RevokeTokenErrorData revokeTokenErrorData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signedOutData.lastKnownUsername;
        }
        if ((i & 2) != 0) {
            hostedUIErrorData = signedOutData.hostedUIErrorData;
        }
        if ((i & 4) != 0) {
            globalSignOutErrorData = signedOutData.globalSignOutErrorData;
        }
        if ((i & 8) != 0) {
            revokeTokenErrorData = signedOutData.revokeTokenErrorData;
        }
        return signedOutData.copy(str, hostedUIErrorData, globalSignOutErrorData, revokeTokenErrorData);
    }

    @Transient
    public static /* synthetic */ void getGlobalSignOutErrorData$annotations() {
    }

    @Transient
    public static /* synthetic */ void getHostedUIErrorData$annotations() {
    }

    @Transient
    public static /* synthetic */ void getRevokeTokenErrorData$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.lastKnownUsername;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HostedUIErrorData component2() {
        return this.hostedUIErrorData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GlobalSignOutErrorData component3() {
        return this.globalSignOutErrorData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RevokeTokenErrorData component4() {
        return this.revokeTokenErrorData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignedOutData copy(String str, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, RevokeTokenErrorData revokeTokenErrorData) {
        return new SignedOutData(str, hostedUIErrorData, globalSignOutErrorData, revokeTokenErrorData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignedOutData)) {
            return false;
        }
        SignedOutData signedOutData = (SignedOutData) obj;
        return Intrinsics.EZpvd((Object) this.lastKnownUsername, (Object) signedOutData.lastKnownUsername) && Intrinsics.EZpvd(this.hostedUIErrorData, signedOutData.hostedUIErrorData) && Intrinsics.EZpvd(this.globalSignOutErrorData, signedOutData.globalSignOutErrorData) && Intrinsics.EZpvd(this.revokeTokenErrorData, signedOutData.revokeTokenErrorData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GlobalSignOutErrorData getGlobalSignOutErrorData() {
        return this.globalSignOutErrorData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasError() {
        return this.hasError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HostedUIErrorData getHostedUIErrorData() {
        return this.hostedUIErrorData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastKnownUsername() {
        return this.lastKnownUsername;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RevokeTokenErrorData getRevokeTokenErrorData() {
        return this.revokeTokenErrorData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.lastKnownUsername;
        int iHashCode = str == null ? 0 : str.hashCode();
        HostedUIErrorData hostedUIErrorData = this.hostedUIErrorData;
        int iHashCode2 = hostedUIErrorData == null ? 0 : hostedUIErrorData.hashCode();
        GlobalSignOutErrorData globalSignOutErrorData = this.globalSignOutErrorData;
        int iHashCode3 = globalSignOutErrorData == null ? 0 : globalSignOutErrorData.hashCode();
        RevokeTokenErrorData revokeTokenErrorData = this.revokeTokenErrorData;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (revokeTokenErrorData != null ? revokeTokenErrorData.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignedOutData(lastKnownUsername=" + this.lastKnownUsername + ", hostedUIErrorData=" + this.hostedUIErrorData + ", globalSignOutErrorData=" + this.globalSignOutErrorData + ", revokeTokenErrorData=" + this.revokeTokenErrorData + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.SignedOutData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SignedOutData> serializer() {
            return SignedOutData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignedOutData(int i, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.lastKnownUsername = null;
        } else {
            this.lastKnownUsername = str;
        }
        this.hostedUIErrorData = null;
        this.globalSignOutErrorData = null;
        this.revokeTokenErrorData = null;
        if ((i & 2) == 0) {
            this.hasError = false;
        } else {
            this.hasError = z;
        }
    }

    public SignedOutData(String str, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, RevokeTokenErrorData revokeTokenErrorData) {
        this.lastKnownUsername = str;
        this.hostedUIErrorData = hostedUIErrorData;
        this.globalSignOutErrorData = globalSignOutErrorData;
        this.revokeTokenErrorData = revokeTokenErrorData;
        this.hasError = (hostedUIErrorData == null && globalSignOutErrorData == null && revokeTokenErrorData == null) ? false : true;
    }

    public static final /* synthetic */ void write$Self(SignedOutData signedOutData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || signedOutData.lastKnownUsername != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, signedOutData.lastKnownUsername);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1)) {
            if (signedOutData.hasError == ((signedOutData.hostedUIErrorData == null && signedOutData.globalSignOutErrorData == null && signedOutData.revokeTokenErrorData == null) ? false : true)) {
                return;
            }
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, signedOutData.hasError);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:com.amplifyframework.statemachine.codegen.data.HostedUIErrorData:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.statemachine.codegen.data.HostedUIErrorData) : (r3v0 com.amplifyframework.statemachine.codegen.data.HostedUIErrorData))
  (wrap:com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData) : (r4v0 com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData))
  (wrap:com.amplifyframework.statemachine.codegen.data.RevokeTokenErrorData:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.statemachine.codegen.data.RevokeTokenErrorData) : (r5v0 com.amplifyframework.statemachine.codegen.data.RevokeTokenErrorData))
 A[MD:(java.lang.String, com.amplifyframework.statemachine.codegen.data.HostedUIErrorData, com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData, com.amplifyframework.statemachine.codegen.data.RevokeTokenErrorData):void (m)] (LINE:22) call: com.amplifyframework.statemachine.codegen.data.SignedOutData.<init>(java.lang.String, com.amplifyframework.statemachine.codegen.data.HostedUIErrorData, com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData, com.amplifyframework.statemachine.codegen.data.RevokeTokenErrorData):void type: THIS */
    public /* synthetic */ SignedOutData(String str, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, RevokeTokenErrorData revokeTokenErrorData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : hostedUIErrorData, (i & 4) != 0 ? null : globalSignOutErrorData, (i & 8) != 0 ? null : revokeTokenErrorData);
    }
}
