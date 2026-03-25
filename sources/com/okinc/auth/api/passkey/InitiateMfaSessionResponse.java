package com.okinc.auth.api.passkey;

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
public final class InitiateMfaSessionResponse implements java.io.Serializable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String business;
    private final String nextStep;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitiateMfaSessionResponse() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InitiateMfaSessionResponse copy$default(InitiateMfaSessionResponse initiateMfaSessionResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initiateMfaSessionResponse.business;
        }
        if ((i & 2) != 0) {
            str2 = initiateMfaSessionResponse.nextStep;
        }
        return initiateMfaSessionResponse.copy(str, str2);
    }

    @SerialName("business")
    public static /* synthetic */ void getBusiness$annotations() {
    }

    @SerialName("nextStep")
    public static /* synthetic */ void getNextStep$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.business;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nextStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InitiateMfaSessionResponse copy(String str, String str2) {
        return new InitiateMfaSessionResponse(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitiateMfaSessionResponse)) {
            return false;
        }
        InitiateMfaSessionResponse initiateMfaSessionResponse = (InitiateMfaSessionResponse) obj;
        return Intrinsics.EZpvd((Object) this.business, (Object) initiateMfaSessionResponse.business) && Intrinsics.EZpvd((Object) this.nextStep, (Object) initiateMfaSessionResponse.nextStep);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBusiness() {
        return this.business;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextStep() {
        return this.nextStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.business;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.nextStep;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InitiateMfaSessionResponse(business=" + this.business + ", nextStep=" + this.nextStep + ")";
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.passkey.InitiateMfaSessionResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InitiateMfaSessionResponse> serializer() {
            return InitiateMfaSessionResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InitiateMfaSessionResponse(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.business = "";
        } else {
            this.business = str;
        }
        if ((i & 2) == 0) {
            this.nextStep = "";
        } else {
            this.nextStep = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKAuth_auth_api(InitiateMfaSessionResponse initiateMfaSessionResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) initiateMfaSessionResponse.business, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, initiateMfaSessionResponse.business);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) initiateMfaSessionResponse.nextStep, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, initiateMfaSessionResponse.nextStep);
    }

    public InitiateMfaSessionResponse(String str, String str2) {
        this.business = str;
        this.nextStep = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.auth.api.passkey.InitiateMfaSessionResponse.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InitiateMfaSessionResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
