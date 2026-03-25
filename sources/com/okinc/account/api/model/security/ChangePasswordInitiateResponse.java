package com.okinc.account.api.model.security;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class ChangePasswordInitiateResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String business;
    private final String nextStep;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChangePasswordInitiateResponse() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChangePasswordInitiateResponse copy$default(ChangePasswordInitiateResponse changePasswordInitiateResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = changePasswordInitiateResponse.nextStep;
        }
        if ((i & 2) != 0) {
            str2 = changePasswordInitiateResponse.business;
        }
        return changePasswordInitiateResponse.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nextStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.business;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChangePasswordInitiateResponse copy(String str, String str2) {
        return new ChangePasswordInitiateResponse(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangePasswordInitiateResponse)) {
            return false;
        }
        ChangePasswordInitiateResponse changePasswordInitiateResponse = (ChangePasswordInitiateResponse) obj;
        return Intrinsics.EZpvd((Object) this.nextStep, (Object) changePasswordInitiateResponse.nextStep) && Intrinsics.EZpvd((Object) this.business, (Object) changePasswordInitiateResponse.business);
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
        String str = this.nextStep;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.business;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChangePasswordInitiateResponse(nextStep=" + this.nextStep + ", business=" + this.business + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.security.ChangePasswordInitiateResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChangePasswordInitiateResponse> serializer() {
            return ChangePasswordInitiateResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChangePasswordInitiateResponse(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.nextStep = null;
        } else {
            this.nextStep = str;
        }
        if ((i & 2) == 0) {
            this.business = null;
        } else {
            this.business = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKAccount_account_api(ChangePasswordInitiateResponse changePasswordInitiateResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || changePasswordInitiateResponse.nextStep != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, changePasswordInitiateResponse.nextStep);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && changePasswordInitiateResponse.business == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, changePasswordInitiateResponse.business);
    }

    public ChangePasswordInitiateResponse(String str, String str2) {
        this.nextStep = str;
        this.business = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:39) call: com.okinc.account.api.model.security.ChangePasswordInitiateResponse.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ChangePasswordInitiateResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
