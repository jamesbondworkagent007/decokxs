package com.okinc.auth.api.reset2fa.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class SendEmailCodeForRebind2faRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Integer behavior;
    private final String email;
    private final String token;
    private final String uuid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SendEmailCodeForRebind2faRequest() {
        this((Integer) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SendEmailCodeForRebind2faRequest copy$default(SendEmailCodeForRebind2faRequest sendEmailCodeForRebind2faRequest, Integer num, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = sendEmailCodeForRebind2faRequest.behavior;
        }
        if ((i & 2) != 0) {
            str = sendEmailCodeForRebind2faRequest.email;
        }
        if ((i & 4) != 0) {
            str2 = sendEmailCodeForRebind2faRequest.token;
        }
        if ((i & 8) != 0) {
            str3 = sendEmailCodeForRebind2faRequest.uuid;
        }
        return sendEmailCodeForRebind2faRequest.copy(num, str, str2, str3);
    }

    @SerialName("behavior")
    public static /* synthetic */ void getBehavior$annotations() {
    }

    @SerialName("email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    @SerialName("token")
    public static /* synthetic */ void getToken$annotations() {
    }

    @SerialName("uuid")
    public static /* synthetic */ void getUuid$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.behavior;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.email;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.uuid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SendEmailCodeForRebind2faRequest copy(Integer num, String str, String str2, String str3) {
        return new SendEmailCodeForRebind2faRequest(num, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendEmailCodeForRebind2faRequest)) {
            return false;
        }
        SendEmailCodeForRebind2faRequest sendEmailCodeForRebind2faRequest = (SendEmailCodeForRebind2faRequest) obj;
        return Intrinsics.EZpvd(this.behavior, sendEmailCodeForRebind2faRequest.behavior) && Intrinsics.EZpvd((Object) this.email, (Object) sendEmailCodeForRebind2faRequest.email) && Intrinsics.EZpvd((Object) this.token, (Object) sendEmailCodeForRebind2faRequest.token) && Intrinsics.EZpvd((Object) this.uuid, (Object) sendEmailCodeForRebind2faRequest.uuid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBehavior() {
        return this.behavior;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEmail() {
        return this.email;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.behavior;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.email;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.token;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.uuid;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SendEmailCodeForRebind2faRequest(behavior=" + this.behavior + ", email=" + this.email + ", token=" + this.token + ", uuid=" + this.uuid + ")";
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.reset2fa.data.model.SendEmailCodeForRebind2faRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SendEmailCodeForRebind2faRequest> serializer() {
            return SendEmailCodeForRebind2faRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SendEmailCodeForRebind2faRequest(int i, Integer num, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.behavior = null;
        } else {
            this.behavior = num;
        }
        if ((i & 2) == 0) {
            this.email = null;
        } else {
            this.email = str;
        }
        if ((i & 4) == 0) {
            this.token = null;
        } else {
            this.token = str2;
        }
        if ((i & 8) == 0) {
            this.uuid = null;
        } else {
            this.uuid = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKAuth_auth_api(SendEmailCodeForRebind2faRequest sendEmailCodeForRebind2faRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || sendEmailCodeForRebind2faRequest.behavior != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, sendEmailCodeForRebind2faRequest.behavior);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || sendEmailCodeForRebind2faRequest.email != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, sendEmailCodeForRebind2faRequest.email);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || sendEmailCodeForRebind2faRequest.token != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, sendEmailCodeForRebind2faRequest.token);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && sendEmailCodeForRebind2faRequest.uuid == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, sendEmailCodeForRebind2faRequest.uuid);
    }

    public SendEmailCodeForRebind2faRequest(Integer num, String str, String str2, String str3) {
        this.behavior = num;
        this.email = str;
        this.token = str2;
        this.uuid = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:108) call: com.okinc.auth.api.reset2fa.data.model.SendEmailCodeForRebind2faRequest.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SendEmailCodeForRebind2faRequest(Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
