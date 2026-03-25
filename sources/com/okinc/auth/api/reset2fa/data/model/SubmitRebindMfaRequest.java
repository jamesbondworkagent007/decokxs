package com.okinc.auth.api.reset2fa.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class SubmitRebindMfaRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String areaCode;
    public final String loginName;
    public final String newAreaCode;
    public final String newEmail;
    public final String newEmailCode;
    public final String newPhone;
    public final String newPhoneCode;
    public final String workflowToken;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SubmitRebindMfaRequest() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubmitRebindMfaRequest EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new SubmitRebindMfaRequest(str, str2, str3, str4, str5, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitRebindMfaRequest)) {
            return false;
        }
        SubmitRebindMfaRequest submitRebindMfaRequest = (SubmitRebindMfaRequest) obj;
        return Intrinsics.EZpvd((Object) this.workflowToken, (Object) submitRebindMfaRequest.workflowToken) && Intrinsics.EZpvd((Object) this.newAreaCode, (Object) submitRebindMfaRequest.newAreaCode) && Intrinsics.EZpvd((Object) this.newPhone, (Object) submitRebindMfaRequest.newPhone) && Intrinsics.EZpvd((Object) this.newPhoneCode, (Object) submitRebindMfaRequest.newPhoneCode) && Intrinsics.EZpvd((Object) this.newEmail, (Object) submitRebindMfaRequest.newEmail) && Intrinsics.EZpvd((Object) this.newEmailCode, (Object) submitRebindMfaRequest.newEmailCode) && Intrinsics.EZpvd((Object) this.areaCode, (Object) submitRebindMfaRequest.areaCode) && Intrinsics.EZpvd((Object) this.loginName, (Object) submitRebindMfaRequest.loginName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.workflowToken.hashCode() * 31) + this.newAreaCode.hashCode()) * 31) + this.newPhone.hashCode()) * 31) + this.newPhoneCode.hashCode()) * 31) + this.newEmail.hashCode()) * 31) + this.newEmailCode.hashCode()) * 31) + this.areaCode.hashCode()) * 31) + this.loginName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SubmitRebindMfaRequest(workflowToken=" + this.workflowToken + ", newAreaCode=" + this.newAreaCode + ", newPhone=" + this.newPhone + ", newPhoneCode=" + this.newPhoneCode + ", newEmail=" + this.newEmail + ", newEmailCode=" + this.newEmailCode + ", areaCode=" + this.areaCode + ", loginName=" + this.loginName + ")";
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.reset2fa.data.model.SubmitRebindMfaRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SubmitRebindMfaRequest> serializer() {
            return SubmitRebindMfaRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SubmitRebindMfaRequest(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.workflowToken = "";
        } else {
            this.workflowToken = str;
        }
        if ((i & 2) == 0) {
            this.newAreaCode = "";
        } else {
            this.newAreaCode = str2;
        }
        if ((i & 4) == 0) {
            this.newPhone = "";
        } else {
            this.newPhone = str3;
        }
        if ((i & 8) == 0) {
            this.newPhoneCode = "";
        } else {
            this.newPhoneCode = str4;
        }
        if ((i & 16) == 0) {
            this.newEmail = "";
        } else {
            this.newEmail = str5;
        }
        if ((i & 32) == 0) {
            this.newEmailCode = "";
        } else {
            this.newEmailCode = str6;
        }
        if ((i & 64) == 0) {
            this.areaCode = "";
        } else {
            this.areaCode = str7;
        }
        if ((i & 128) == 0) {
            this.loginName = "";
        } else {
            this.loginName = str8;
        }
    }

    public static final /* synthetic */ void copydefault(SubmitRebindMfaRequest submitRebindMfaRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) submitRebindMfaRequest.workflowToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, submitRebindMfaRequest.workflowToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) submitRebindMfaRequest.newAreaCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, submitRebindMfaRequest.newAreaCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) submitRebindMfaRequest.newPhone, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, submitRebindMfaRequest.newPhone);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) submitRebindMfaRequest.newPhoneCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, submitRebindMfaRequest.newPhoneCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) submitRebindMfaRequest.newEmail, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, submitRebindMfaRequest.newEmail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) submitRebindMfaRequest.newEmailCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, submitRebindMfaRequest.newEmailCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) submitRebindMfaRequest.areaCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, submitRebindMfaRequest.areaCode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) submitRebindMfaRequest.loginName, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, submitRebindMfaRequest.loginName);
    }

    public SubmitRebindMfaRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.workflowToken = str;
        this.newAreaCode = str2;
        this.newPhone = str3;
        this.newPhoneCode = str4;
        this.newEmail = str5;
        this.newEmailCode = str6;
        this.areaCode = str7;
        this.loginName = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:70) call: com.okinc.auth.api.reset2fa.data.model.SubmitRebindMfaRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SubmitRebindMfaRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "");
    }
}
