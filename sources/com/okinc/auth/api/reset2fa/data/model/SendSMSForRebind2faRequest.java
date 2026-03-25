package com.okinc.auth.api.reset2fa.data.model;

import androidx.autofill.HintConstants;
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
public final class SendSMSForRebind2faRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String areaCode;
    private final Integer behavior;
    private final Integer msgType;
    private final String phone;
    private final String token;
    private final String uuid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SendSMSForRebind2faRequest() {
        this((Integer) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SendSMSForRebind2faRequest copy$default(SendSMSForRebind2faRequest sendSMSForRebind2faRequest, Integer num, String str, String str2, String str3, Integer num2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = sendSMSForRebind2faRequest.behavior;
        }
        if ((i & 2) != 0) {
            str = sendSMSForRebind2faRequest.areaCode;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = sendSMSForRebind2faRequest.phone;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = sendSMSForRebind2faRequest.token;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            num2 = sendSMSForRebind2faRequest.msgType;
        }
        Integer num3 = num2;
        if ((i & 32) != 0) {
            str4 = sendSMSForRebind2faRequest.uuid;
        }
        return sendSMSForRebind2faRequest.copy(num, str5, str6, str7, num3, str4);
    }

    @SerialName("areaCode")
    public static /* synthetic */ void getAreaCode$annotations() {
    }

    @SerialName("behavior")
    public static /* synthetic */ void getBehavior$annotations() {
    }

    @SerialName("msgType")
    public static /* synthetic */ void getMsgType$annotations() {
    }

    @SerialName(HintConstants.AUTOFILL_HINT_PHONE)
    public static /* synthetic */ void getPhone$annotations() {
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
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.phone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.msgType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.uuid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SendSMSForRebind2faRequest copy(Integer num, String str, String str2, String str3, Integer num2, String str4) {
        return new SendSMSForRebind2faRequest(num, str, str2, str3, num2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendSMSForRebind2faRequest)) {
            return false;
        }
        SendSMSForRebind2faRequest sendSMSForRebind2faRequest = (SendSMSForRebind2faRequest) obj;
        return Intrinsics.EZpvd(this.behavior, sendSMSForRebind2faRequest.behavior) && Intrinsics.EZpvd((Object) this.areaCode, (Object) sendSMSForRebind2faRequest.areaCode) && Intrinsics.EZpvd((Object) this.phone, (Object) sendSMSForRebind2faRequest.phone) && Intrinsics.EZpvd((Object) this.token, (Object) sendSMSForRebind2faRequest.token) && Intrinsics.EZpvd(this.msgType, sendSMSForRebind2faRequest.msgType) && Intrinsics.EZpvd((Object) this.uuid, (Object) sendSMSForRebind2faRequest.uuid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAreaCode() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBehavior() {
        return this.behavior;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMsgType() {
        return this.msgType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhone() {
        return this.phone;
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
        String str = this.areaCode;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.phone;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.token;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Integer num2 = this.msgType;
        int iHashCode5 = num2 == null ? 0 : num2.hashCode();
        String str4 = this.uuid;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SendSMSForRebind2faRequest(behavior=" + this.behavior + ", areaCode=" + this.areaCode + ", phone=" + this.phone + ", token=" + this.token + ", msgType=" + this.msgType + ", uuid=" + this.uuid + ")";
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.reset2fa.data.model.SendSMSForRebind2faRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SendSMSForRebind2faRequest> serializer() {
            return SendSMSForRebind2faRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SendSMSForRebind2faRequest(int i, Integer num, String str, String str2, String str3, Integer num2, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.behavior = null;
        } else {
            this.behavior = num;
        }
        if ((i & 2) == 0) {
            this.areaCode = null;
        } else {
            this.areaCode = str;
        }
        if ((i & 4) == 0) {
            this.phone = null;
        } else {
            this.phone = str2;
        }
        if ((i & 8) == 0) {
            this.token = null;
        } else {
            this.token = str3;
        }
        if ((i & 16) == 0) {
            this.msgType = null;
        } else {
            this.msgType = num2;
        }
        if ((i & 32) == 0) {
            this.uuid = null;
        } else {
            this.uuid = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKAuth_auth_api(SendSMSForRebind2faRequest sendSMSForRebind2faRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || sendSMSForRebind2faRequest.behavior != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, sendSMSForRebind2faRequest.behavior);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || sendSMSForRebind2faRequest.areaCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, sendSMSForRebind2faRequest.areaCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || sendSMSForRebind2faRequest.phone != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, sendSMSForRebind2faRequest.phone);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || sendSMSForRebind2faRequest.token != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, sendSMSForRebind2faRequest.token);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || sendSMSForRebind2faRequest.msgType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, sendSMSForRebind2faRequest.msgType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && sendSMSForRebind2faRequest.uuid == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, sendSMSForRebind2faRequest.uuid);
    }

    public SendSMSForRebind2faRequest(Integer num, String str, String str2, String str3, Integer num2, String str4) {
        this.behavior = num;
        this.areaCode = str;
        this.phone = str2;
        this.token = str3;
        this.msgType = num2;
        this.uuid = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r6v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void (m)] (LINE:91) call: com.okinc.auth.api.reset2fa.data.model.SendSMSForRebind2faRequest.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ SendSMSForRebind2faRequest(Integer num, String str, String str2, String str3, Integer num2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str4);
    }
}
