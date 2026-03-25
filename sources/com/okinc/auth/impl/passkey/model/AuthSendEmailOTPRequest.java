package com.okinc.auth.impl.passkey.model;

import com.google.android.gms.fido.u2f.api.common.ClientData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class AuthSendEmailOTPRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String areaCode;
    private final Integer behavior;
    private final String captchaOutput;
    private final String challenge;
    private final String codeType;
    private final Boolean correctEmail;
    private final String email;
    private final String genTime;
    private final String loginName;
    private final String lotNumber;
    private final String msgParams;
    private final Boolean paramsLegal;
    private final String passToken;
    private final String scene;
    private final String token;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AuthSendEmailOTPRequest() {
        this((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
    }

    @SerialName("areaCode")
    public static /* synthetic */ void getAreaCode$annotations() {
    }

    @SerialName("behavior")
    public static /* synthetic */ void getBehavior$annotations() {
    }

    @SerialName("captchaOutput")
    public static /* synthetic */ void getCaptchaOutput$annotations() {
    }

    @SerialName(ClientData.KEY_CHALLENGE)
    public static /* synthetic */ void getChallenge$annotations() {
    }

    @SerialName("codeType")
    public static /* synthetic */ void getCodeType$annotations() {
    }

    @SerialName("correctEmail")
    public static /* synthetic */ void getCorrectEmail$annotations() {
    }

    @SerialName("email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    @SerialName("genTime")
    public static /* synthetic */ void getGenTime$annotations() {
    }

    @SerialName("loginName")
    public static /* synthetic */ void getLoginName$annotations() {
    }

    @SerialName("lotNumber")
    public static /* synthetic */ void getLotNumber$annotations() {
    }

    @SerialName("msgParams")
    public static /* synthetic */ void getMsgParams$annotations() {
    }

    @SerialName("paramsLegal")
    public static /* synthetic */ void getParamsLegal$annotations() {
    }

    @SerialName("passToken")
    public static /* synthetic */ void getPassToken$annotations() {
    }

    @SerialName("scene")
    public static /* synthetic */ void getScene$annotations() {
    }

    @SerialName("token")
    public static /* synthetic */ void getToken$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.behavior;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.scene;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.msgParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component12() {
        return this.paramsLegal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component13() {
        return this.correctEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.loginName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.areaCode;
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
        return this.challenge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.codeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.lotNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.captchaOutput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.passToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.genTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthSendEmailOTPRequest copy(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, Boolean bool2, String str11, String str12) {
        return new AuthSendEmailOTPRequest(num, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, bool, bool2, str11, str12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthSendEmailOTPRequest)) {
            return false;
        }
        AuthSendEmailOTPRequest authSendEmailOTPRequest = (AuthSendEmailOTPRequest) obj;
        return Intrinsics.EZpvd(this.behavior, authSendEmailOTPRequest.behavior) && Intrinsics.EZpvd((Object) this.email, (Object) authSendEmailOTPRequest.email) && Intrinsics.EZpvd((Object) this.token, (Object) authSendEmailOTPRequest.token) && Intrinsics.EZpvd((Object) this.challenge, (Object) authSendEmailOTPRequest.challenge) && Intrinsics.EZpvd((Object) this.codeType, (Object) authSendEmailOTPRequest.codeType) && Intrinsics.EZpvd((Object) this.lotNumber, (Object) authSendEmailOTPRequest.lotNumber) && Intrinsics.EZpvd((Object) this.captchaOutput, (Object) authSendEmailOTPRequest.captchaOutput) && Intrinsics.EZpvd((Object) this.passToken, (Object) authSendEmailOTPRequest.passToken) && Intrinsics.EZpvd((Object) this.genTime, (Object) authSendEmailOTPRequest.genTime) && Intrinsics.EZpvd((Object) this.scene, (Object) authSendEmailOTPRequest.scene) && Intrinsics.EZpvd((Object) this.msgParams, (Object) authSendEmailOTPRequest.msgParams) && Intrinsics.EZpvd(this.paramsLegal, authSendEmailOTPRequest.paramsLegal) && Intrinsics.EZpvd(this.correctEmail, authSendEmailOTPRequest.correctEmail) && Intrinsics.EZpvd((Object) this.loginName, (Object) authSendEmailOTPRequest.loginName) && Intrinsics.EZpvd((Object) this.areaCode, (Object) authSendEmailOTPRequest.areaCode);
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
    public final String getCaptchaOutput() {
        return this.captchaOutput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChallenge() {
        return this.challenge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCodeType() {
        return this.codeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCorrectEmail() {
        return this.correctEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEmail() {
        return this.email;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGenTime() {
        return this.genTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLoginName() {
        return this.loginName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLotNumber() {
        return this.lotNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsgParams() {
        return this.msgParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getParamsLegal() {
        return this.paramsLegal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPassToken() {
        return this.passToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScene() {
        return this.scene;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.behavior;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.email;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.token;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.challenge;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.codeType;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.lotNumber;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.captchaOutput;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.passToken;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.genTime;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.scene;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.msgParams;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        Boolean bool = this.paramsLegal;
        int iHashCode12 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.correctEmail;
        int iHashCode13 = bool2 == null ? 0 : bool2.hashCode();
        String str11 = this.loginName;
        int iHashCode14 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.areaCode;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str12 == null ? 0 : str12.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AuthSendEmailOTPRequest(behavior=" + this.behavior + ", email=" + this.email + ", token=" + this.token + ", challenge=" + this.challenge + ", codeType=" + this.codeType + ", lotNumber=" + this.lotNumber + ", captchaOutput=" + this.captchaOutput + ", passToken=" + this.passToken + ", genTime=" + this.genTime + ", scene=" + this.scene + ", msgParams=" + this.msgParams + ", paramsLegal=" + this.paramsLegal + ", correctEmail=" + this.correctEmail + ", loginName=" + this.loginName + ", areaCode=" + this.areaCode + ")";
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.AuthSendEmailOTPRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AuthSendEmailOTPRequest> serializer() {
            return AuthSendEmailOTPRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AuthSendEmailOTPRequest(int i, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, Boolean bool2, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.challenge = null;
        } else {
            this.challenge = str3;
        }
        if ((i & 16) == 0) {
            this.codeType = null;
        } else {
            this.codeType = str4;
        }
        if ((i & 32) == 0) {
            this.lotNumber = null;
        } else {
            this.lotNumber = str5;
        }
        if ((i & 64) == 0) {
            this.captchaOutput = null;
        } else {
            this.captchaOutput = str6;
        }
        if ((i & 128) == 0) {
            this.passToken = null;
        } else {
            this.passToken = str7;
        }
        if ((i & 256) == 0) {
            this.genTime = null;
        } else {
            this.genTime = str8;
        }
        if ((i & 512) == 0) {
            this.scene = null;
        } else {
            this.scene = str9;
        }
        if ((i & 1024) == 0) {
            this.msgParams = null;
        } else {
            this.msgParams = str10;
        }
        if ((i & 2048) == 0) {
            this.paramsLegal = null;
        } else {
            this.paramsLegal = bool;
        }
        if ((i & 4096) == 0) {
            this.correctEmail = null;
        } else {
            this.correctEmail = bool2;
        }
        if ((i & 8192) == 0) {
            this.loginName = null;
        } else {
            this.loginName = str11;
        }
        if ((i & 16384) == 0) {
            this.areaCode = null;
        } else {
            this.areaCode = str12;
        }
    }

    public static final /* synthetic */ void write$Self$OKAuth_auth_impl(AuthSendEmailOTPRequest authSendEmailOTPRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || authSendEmailOTPRequest.behavior != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, authSendEmailOTPRequest.behavior);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || authSendEmailOTPRequest.email != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, authSendEmailOTPRequest.email);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || authSendEmailOTPRequest.token != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, authSendEmailOTPRequest.token);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || authSendEmailOTPRequest.challenge != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, authSendEmailOTPRequest.challenge);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || authSendEmailOTPRequest.codeType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, authSendEmailOTPRequest.codeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || authSendEmailOTPRequest.lotNumber != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, authSendEmailOTPRequest.lotNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || authSendEmailOTPRequest.captchaOutput != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, authSendEmailOTPRequest.captchaOutput);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || authSendEmailOTPRequest.passToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, authSendEmailOTPRequest.passToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || authSendEmailOTPRequest.genTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, authSendEmailOTPRequest.genTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || authSendEmailOTPRequest.scene != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, authSendEmailOTPRequest.scene);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || authSendEmailOTPRequest.msgParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, authSendEmailOTPRequest.msgParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || authSendEmailOTPRequest.paramsLegal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, authSendEmailOTPRequest.paramsLegal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || authSendEmailOTPRequest.correctEmail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, authSendEmailOTPRequest.correctEmail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || authSendEmailOTPRequest.loginName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, authSendEmailOTPRequest.loginName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && authSendEmailOTPRequest.areaCode == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, authSendEmailOTPRequest.areaCode);
    }

    public AuthSendEmailOTPRequest(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, Boolean bool2, String str11, String str12) {
        this.behavior = num;
        this.email = str;
        this.token = str2;
        this.challenge = str3;
        this.codeType = str4;
        this.lotNumber = str5;
        this.captchaOutput = str6;
        this.passToken = str7;
        this.genTime = str8;
        this.scene = str9;
        this.msgParams = str10;
        this.paramsLegal = bool;
        this.correctEmail = bool2;
        this.loginName = str11;
        this.areaCode = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009a: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r17v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x005b: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r28v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0063: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r29v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006b: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0073: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.auth.impl.passkey.model.AuthSendEmailOTPRequest.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AuthSendEmailOTPRequest(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, Boolean bool2, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : bool2, (i & 8192) != 0 ? null : str11, (i & 16384) == 0 ? str12 : null);
    }
}
