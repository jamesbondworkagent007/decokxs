package com.okinc.auth.impl.passkey.model;

import androidx.autofill.HintConstants;
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
public final class AuthSendSMSRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String areaCode;
    private final Integer behavior;
    private final String captchaOutput;
    private final String deToken;
    private final String genTime;
    private final Boolean googleRecaptchaGroup;
    private final String googleRecaptchaSiteKey;
    private final String googleRecaptchaToken;
    private final String loginName;
    private final String lotNumber;
    private final Integer msgType;
    private final Boolean paramsLegal;
    private final String passToken;
    private final String phone;
    private final Boolean phoneLegal;
    private final String scene;
    private final String subAccountName;
    private final String token;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AuthSendSMSRequest() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, 262143, (DefaultConstructorMarker) null);
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

    @SerialName("deToken")
    public static /* synthetic */ void getDeToken$annotations() {
    }

    @SerialName("genTime")
    public static /* synthetic */ void getGenTime$annotations() {
    }

    @SerialName("googleRecaptchaGroup")
    public static /* synthetic */ void getGoogleRecaptchaGroup$annotations() {
    }

    @SerialName("googleRecaptchaSiteKey")
    public static /* synthetic */ void getGoogleRecaptchaSiteKey$annotations() {
    }

    @SerialName("googleRecaptchaToken")
    public static /* synthetic */ void getGoogleRecaptchaToken$annotations() {
    }

    @SerialName("loginName")
    public static /* synthetic */ void getLoginName$annotations() {
    }

    @SerialName("lotNumber")
    public static /* synthetic */ void getLotNumber$annotations() {
    }

    @SerialName("msgType")
    public static /* synthetic */ void getMsgType$annotations() {
    }

    @SerialName("paramsLegal")
    public static /* synthetic */ void getParamsLegal$annotations() {
    }

    @SerialName("passToken")
    public static /* synthetic */ void getPassToken$annotations() {
    }

    @SerialName(HintConstants.AUTOFILL_HINT_PHONE)
    public static /* synthetic */ void getPhone$annotations() {
    }

    @SerialName("phoneLegal")
    public static /* synthetic */ void getPhoneLegal$annotations() {
    }

    @SerialName("scene")
    public static /* synthetic */ void getScene$annotations() {
    }

    @SerialName("subAccountName")
    public static /* synthetic */ void getSubAccountName$annotations() {
    }

    @SerialName("token")
    public static /* synthetic */ void getToken$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.lotNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.msgType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.subAccountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.deToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.googleRecaptchaSiteKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.googleRecaptchaToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component16() {
        return this.googleRecaptchaGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component17() {
        return this.paramsLegal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component18() {
        return this.phoneLegal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.captchaOutput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.passToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.genTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.scene;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.loginName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.behavior;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.phone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthSendSMSRequest copy(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, Integer num2, String str9, String str10, String str11, String str12, String str13, Boolean bool, Boolean bool2, Boolean bool3) {
        return new AuthSendSMSRequest(str, str2, str3, str4, str5, str6, num, str7, str8, num2, str9, str10, str11, str12, str13, bool, bool2, bool3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthSendSMSRequest)) {
            return false;
        }
        AuthSendSMSRequest authSendSMSRequest = (AuthSendSMSRequest) obj;
        return Intrinsics.EZpvd((Object) this.lotNumber, (Object) authSendSMSRequest.lotNumber) && Intrinsics.EZpvd((Object) this.captchaOutput, (Object) authSendSMSRequest.captchaOutput) && Intrinsics.EZpvd((Object) this.passToken, (Object) authSendSMSRequest.passToken) && Intrinsics.EZpvd((Object) this.genTime, (Object) authSendSMSRequest.genTime) && Intrinsics.EZpvd((Object) this.scene, (Object) authSendSMSRequest.scene) && Intrinsics.EZpvd((Object) this.loginName, (Object) authSendSMSRequest.loginName) && Intrinsics.EZpvd(this.behavior, authSendSMSRequest.behavior) && Intrinsics.EZpvd((Object) this.phone, (Object) authSendSMSRequest.phone) && Intrinsics.EZpvd((Object) this.areaCode, (Object) authSendSMSRequest.areaCode) && Intrinsics.EZpvd(this.msgType, authSendSMSRequest.msgType) && Intrinsics.EZpvd((Object) this.token, (Object) authSendSMSRequest.token) && Intrinsics.EZpvd((Object) this.subAccountName, (Object) authSendSMSRequest.subAccountName) && Intrinsics.EZpvd((Object) this.deToken, (Object) authSendSMSRequest.deToken) && Intrinsics.EZpvd((Object) this.googleRecaptchaSiteKey, (Object) authSendSMSRequest.googleRecaptchaSiteKey) && Intrinsics.EZpvd((Object) this.googleRecaptchaToken, (Object) authSendSMSRequest.googleRecaptchaToken) && Intrinsics.EZpvd(this.googleRecaptchaGroup, authSendSMSRequest.googleRecaptchaGroup) && Intrinsics.EZpvd(this.paramsLegal, authSendSMSRequest.paramsLegal) && Intrinsics.EZpvd(this.phoneLegal, authSendSMSRequest.phoneLegal);
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
    public final String getDeToken() {
        return this.deToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGenTime() {
        return this.genTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getGoogleRecaptchaGroup() {
        return this.googleRecaptchaGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGoogleRecaptchaSiteKey() {
        return this.googleRecaptchaSiteKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGoogleRecaptchaToken() {
        return this.googleRecaptchaToken;
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
    public final Integer getMsgType() {
        return this.msgType;
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
    public final String getPhone() {
        return this.phone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPhoneLegal() {
        return this.phoneLegal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScene() {
        return this.scene;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubAccountName() {
        return this.subAccountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.lotNumber;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.captchaOutput;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.passToken;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.genTime;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.scene;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.loginName;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        Integer num = this.behavior;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        String str7 = this.phone;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.areaCode;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        Integer num2 = this.msgType;
        int iHashCode10 = num2 == null ? 0 : num2.hashCode();
        String str9 = this.token;
        int iHashCode11 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.subAccountName;
        int iHashCode12 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.deToken;
        int iHashCode13 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.googleRecaptchaSiteKey;
        int iHashCode14 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.googleRecaptchaToken;
        int iHashCode15 = str13 == null ? 0 : str13.hashCode();
        Boolean bool = this.googleRecaptchaGroup;
        int iHashCode16 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.paramsLegal;
        int iHashCode17 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.phoneLegal;
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (bool3 == null ? 0 : bool3.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AuthSendSMSRequest(lotNumber=" + this.lotNumber + ", captchaOutput=" + this.captchaOutput + ", passToken=" + this.passToken + ", genTime=" + this.genTime + ", scene=" + this.scene + ", loginName=" + this.loginName + ", behavior=" + this.behavior + ", phone=" + this.phone + ", areaCode=" + this.areaCode + ", msgType=" + this.msgType + ", token=" + this.token + ", subAccountName=" + this.subAccountName + ", deToken=" + this.deToken + ", googleRecaptchaSiteKey=" + this.googleRecaptchaSiteKey + ", googleRecaptchaToken=" + this.googleRecaptchaToken + ", googleRecaptchaGroup=" + this.googleRecaptchaGroup + ", paramsLegal=" + this.paramsLegal + ", phoneLegal=" + this.phoneLegal + ")";
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.AuthSendSMSRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AuthSendSMSRequest> serializer() {
            return AuthSendSMSRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AuthSendSMSRequest(int i, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, Integer num2, String str9, String str10, String str11, String str12, String str13, Boolean bool, Boolean bool2, Boolean bool3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.lotNumber = null;
        } else {
            this.lotNumber = str;
        }
        if ((i & 2) == 0) {
            this.captchaOutput = null;
        } else {
            this.captchaOutput = str2;
        }
        if ((i & 4) == 0) {
            this.passToken = null;
        } else {
            this.passToken = str3;
        }
        if ((i & 8) == 0) {
            this.genTime = null;
        } else {
            this.genTime = str4;
        }
        if ((i & 16) == 0) {
            this.scene = null;
        } else {
            this.scene = str5;
        }
        if ((i & 32) == 0) {
            this.loginName = null;
        } else {
            this.loginName = str6;
        }
        if ((i & 64) == 0) {
            this.behavior = null;
        } else {
            this.behavior = num;
        }
        if ((i & 128) == 0) {
            this.phone = null;
        } else {
            this.phone = str7;
        }
        if ((i & 256) == 0) {
            this.areaCode = null;
        } else {
            this.areaCode = str8;
        }
        if ((i & 512) == 0) {
            this.msgType = null;
        } else {
            this.msgType = num2;
        }
        if ((i & 1024) == 0) {
            this.token = null;
        } else {
            this.token = str9;
        }
        if ((i & 2048) == 0) {
            this.subAccountName = null;
        } else {
            this.subAccountName = str10;
        }
        if ((i & 4096) == 0) {
            this.deToken = null;
        } else {
            this.deToken = str11;
        }
        if ((i & 8192) == 0) {
            this.googleRecaptchaSiteKey = null;
        } else {
            this.googleRecaptchaSiteKey = str12;
        }
        if ((i & 16384) == 0) {
            this.googleRecaptchaToken = null;
        } else {
            this.googleRecaptchaToken = str13;
        }
        if ((32768 & i) == 0) {
            this.googleRecaptchaGroup = null;
        } else {
            this.googleRecaptchaGroup = bool;
        }
        if ((65536 & i) == 0) {
            this.paramsLegal = null;
        } else {
            this.paramsLegal = bool2;
        }
        if ((i & 131072) == 0) {
            this.phoneLegal = null;
        } else {
            this.phoneLegal = bool3;
        }
    }

    public static final /* synthetic */ void write$Self$OKAuth_auth_impl(AuthSendSMSRequest authSendSMSRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || authSendSMSRequest.lotNumber != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, authSendSMSRequest.lotNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || authSendSMSRequest.captchaOutput != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, authSendSMSRequest.captchaOutput);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || authSendSMSRequest.passToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, authSendSMSRequest.passToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || authSendSMSRequest.genTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, authSendSMSRequest.genTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || authSendSMSRequest.scene != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, authSendSMSRequest.scene);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || authSendSMSRequest.loginName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, authSendSMSRequest.loginName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || authSendSMSRequest.behavior != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, authSendSMSRequest.behavior);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || authSendSMSRequest.phone != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, authSendSMSRequest.phone);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || authSendSMSRequest.areaCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, authSendSMSRequest.areaCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || authSendSMSRequest.msgType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, authSendSMSRequest.msgType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || authSendSMSRequest.token != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, authSendSMSRequest.token);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || authSendSMSRequest.subAccountName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, authSendSMSRequest.subAccountName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || authSendSMSRequest.deToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, authSendSMSRequest.deToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || authSendSMSRequest.googleRecaptchaSiteKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, authSendSMSRequest.googleRecaptchaSiteKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || authSendSMSRequest.googleRecaptchaToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, authSendSMSRequest.googleRecaptchaToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || authSendSMSRequest.googleRecaptchaGroup != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, authSendSMSRequest.googleRecaptchaGroup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || authSendSMSRequest.paramsLegal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.INSTANCE, authSendSMSRequest.paramsLegal);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) && authSendSMSRequest.phoneLegal == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, BooleanSerializer.INSTANCE, authSendSMSRequest.phoneLegal);
    }

    public AuthSendSMSRequest(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, Integer num2, String str9, String str10, String str11, String str12, String str13, Boolean bool, Boolean bool2, Boolean bool3) {
        this.lotNumber = str;
        this.captchaOutput = str2;
        this.passToken = str3;
        this.genTime = str4;
        this.scene = str5;
        this.loginName = str6;
        this.behavior = num;
        this.phone = str7;
        this.areaCode = str8;
        this.msgType = num2;
        this.token = str9;
        this.subAccountName = str10;
        this.deToken = str11;
        this.googleRecaptchaSiteKey = str12;
        this.googleRecaptchaToken = str13;
        this.googleRecaptchaGroup = bool;
        this.paramsLegal = bool2;
        this.phoneLegal = bool3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c1: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r38v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r38v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r38v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r38v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r38v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r38v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0032: ARITH (r38v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r26v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r38v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r38v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x004a: ARITH (r38v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r29v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r38v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r38v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r38v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r38v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r38v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x007d: ARITH (r38v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r35v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0088: ARITH (r38v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r36v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0093: ARITH (r38v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r37v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void (m)] (LINE:9) call: com.okinc.auth.impl.passkey.model.AuthSendSMSRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void type: THIS */
    public /* synthetic */ AuthSendSMSRequest(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, Integer num2, String str9, String str10, String str11, String str12, String str13, Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : num2, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : str13, (i & 32768) != 0 ? null : bool, (i & 65536) != 0 ? null : bool2, (i & 131072) != 0 ? null : bool3);
    }
}
