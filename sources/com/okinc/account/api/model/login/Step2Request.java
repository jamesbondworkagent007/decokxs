package com.okinc.account.api.model.login;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class Step2Request {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String authenticatorCode;
    private final Integer behavior;
    private final String channelFlag;
    private final String channelId;
    private final String emailCode;
    private final String phoneCode;
    private final Integer step2Type;
    private final String stepCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Step2Request() {
        this((String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.authenticatorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.emailCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.phoneCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.step2Type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.behavior;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.channelFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.stepCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Step2Request copy(String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, String str6) {
        return new Step2Request(str, str2, str3, num, num2, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Step2Request)) {
            return false;
        }
        Step2Request step2Request = (Step2Request) obj;
        return Intrinsics.EZpvd((Object) this.authenticatorCode, (Object) step2Request.authenticatorCode) && Intrinsics.EZpvd((Object) this.emailCode, (Object) step2Request.emailCode) && Intrinsics.EZpvd((Object) this.phoneCode, (Object) step2Request.phoneCode) && Intrinsics.EZpvd(this.step2Type, step2Request.step2Type) && Intrinsics.EZpvd(this.behavior, step2Request.behavior) && Intrinsics.EZpvd((Object) this.channelId, (Object) step2Request.channelId) && Intrinsics.EZpvd((Object) this.channelFlag, (Object) step2Request.channelFlag) && Intrinsics.EZpvd((Object) this.stepCode, (Object) step2Request.stepCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuthenticatorCode() {
        return this.authenticatorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBehavior() {
        return this.behavior;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelFlag() {
        return this.channelFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEmailCode() {
        return this.emailCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhoneCode() {
        return this.phoneCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStep2Type() {
        return this.step2Type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStepCode() {
        return this.stepCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.authenticatorCode;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.emailCode;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.phoneCode;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.step2Type;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        Integer num2 = this.behavior;
        int iHashCode5 = num2 == null ? 0 : num2.hashCode();
        String str4 = this.channelId;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.channelFlag;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.stepCode;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Step2Request(authenticatorCode=" + this.authenticatorCode + ", emailCode=" + this.emailCode + ", phoneCode=" + this.phoneCode + ", step2Type=" + this.step2Type + ", behavior=" + this.behavior + ", channelId=" + this.channelId + ", channelFlag=" + this.channelFlag + ", stepCode=" + this.stepCode + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.login.Step2Request.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Step2Request> serializer() {
            return Step2Request$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Step2Request(int i, String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.authenticatorCode = null;
        } else {
            this.authenticatorCode = str;
        }
        if ((i & 2) == 0) {
            this.emailCode = null;
        } else {
            this.emailCode = str2;
        }
        if ((i & 4) == 0) {
            this.phoneCode = null;
        } else {
            this.phoneCode = str3;
        }
        if ((i & 8) == 0) {
            this.step2Type = null;
        } else {
            this.step2Type = num;
        }
        if ((i & 16) == 0) {
            this.behavior = null;
        } else {
            this.behavior = num2;
        }
        if ((i & 32) == 0) {
            this.channelId = null;
        } else {
            this.channelId = str4;
        }
        if ((i & 64) == 0) {
            this.channelFlag = null;
        } else {
            this.channelFlag = str5;
        }
        if ((i & 128) == 0) {
            this.stepCode = null;
        } else {
            this.stepCode = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKAccount_account_api(Step2Request step2Request, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || step2Request.authenticatorCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, step2Request.authenticatorCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || step2Request.emailCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, step2Request.emailCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || step2Request.phoneCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, step2Request.phoneCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || step2Request.step2Type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, step2Request.step2Type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || step2Request.behavior != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, step2Request.behavior);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || step2Request.channelId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, step2Request.channelId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || step2Request.channelFlag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, step2Request.channelFlag);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && step2Request.stepCode == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, step2Request.stepCode);
    }

    public Step2Request(String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, String str6) {
        this.authenticatorCode = str;
        this.emailCode = str2;
        this.phoneCode = str3;
        this.step2Type = num;
        this.behavior = num2;
        this.channelId = str4;
        this.channelFlag = str5;
        this.stepCode = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r14v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:70) call: com.okinc.account.api.model.login.Step2Request.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ Step2Request(String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) == 0 ? str6 : null);
    }
}
