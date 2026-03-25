package com.okinc.auth.impl.mfa.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.auth.impl.passkey.model.RegistrationStartResponse;
import com.okinc.auth.impl.passkey.model.RegistrationStartResponse$$serializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class MfaResponse implements Parcelable {
    public static final int BUSINESS_NOT_SUPPORTED = 5004;
    public static final int CREATE_SESSION_FAILURE = 5001;
    public static final int FACIAL_CAN_RETRY = 5007;
    public static final int FACIAL_MAXIMUM_RETRY = 5008;
    public static final int GENERIC_FAILURE = 5000;
    public static final int MAXIMUM_RETRY = 5006;
    public static final int SESSION_EXPIRED = 5002;
    public static final int SESSION_INVALID = 5003;
    public static final int TOO_MANY_OTP_REQUEST = 3909;
    public static final int VERIFICATION_FAILURE = 5005;
    public final Boolean allowResetMfa;
    public final Boolean allowResetPasskey;
    public final List<String> alternativeNextSteps;
    public final String business;
    public final Integer currentStepper;
    public final String encryptedPasskey;
    public final String maskedEmail;
    public final String maskedPhone;
    public final String nextStep;
    public final RegistrationStartResponse passkeyUpgradeOptions;
    public final String reminderContent;
    public final Boolean requiredCaptcha;
    public final String scenario;
    public final String syncId;
    public final Integer totalStep;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MfaResponse> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Creator implements Parcelable.Creator<MfaResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MfaResponse createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MfaResponse(string, arrayListCreateStringArrayList, boolValueOf, boolValueOf2, numValueOf, numValueOf2, string2, string3, string4, string5, string6, boolValueOf3, parcel.readInt() != 0 ? RegistrationStartResponse.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MfaResponse[] newArray(int i) {
            return new MfaResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MfaResponse() {
        this((String) null, (List) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (RegistrationStartResponse) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer AYXKKw() {
        return this.currentStepper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.encryptedPasskey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RegistrationStartResponse AkhnZx() {
        return this.passkeyUpgradeOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.reminderContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean EZpvd() {
        return this.allowResetPasskey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MfaResponse KWHzl(String str, List<String> list, Boolean bool, Boolean bool2, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, Boolean bool3, RegistrationStartResponse registrationStartResponse, String str7, String str8) {
        return new MfaResponse(str, list, bool, bool2, num, num2, str2, str3, str4, str5, str6, bool3, registrationStartResponse, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.business;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> OLrzqt() {
        return this.alternativeNextSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean copydefault() {
        return this.allowResetMfa;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.nextStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MfaResponse)) {
            return false;
        }
        MfaResponse mfaResponse = (MfaResponse) obj;
        return Intrinsics.EZpvd((Object) this.nextStep, (Object) mfaResponse.nextStep) && Intrinsics.EZpvd(this.alternativeNextSteps, mfaResponse.alternativeNextSteps) && Intrinsics.EZpvd(this.allowResetMfa, mfaResponse.allowResetMfa) && Intrinsics.EZpvd(this.allowResetPasskey, mfaResponse.allowResetPasskey) && Intrinsics.EZpvd(this.currentStepper, mfaResponse.currentStepper) && Intrinsics.EZpvd(this.totalStep, mfaResponse.totalStep) && Intrinsics.EZpvd((Object) this.maskedEmail, (Object) mfaResponse.maskedEmail) && Intrinsics.EZpvd((Object) this.maskedPhone, (Object) mfaResponse.maskedPhone) && Intrinsics.EZpvd((Object) this.business, (Object) mfaResponse.business) && Intrinsics.EZpvd((Object) this.scenario, (Object) mfaResponse.scenario) && Intrinsics.EZpvd((Object) this.reminderContent, (Object) mfaResponse.reminderContent) && Intrinsics.EZpvd(this.requiredCaptcha, mfaResponse.requiredCaptcha) && Intrinsics.EZpvd(this.passkeyUpgradeOptions, mfaResponse.passkeyUpgradeOptions) && Intrinsics.EZpvd((Object) this.encryptedPasskey, (Object) mfaResponse.encryptedPasskey) && Intrinsics.EZpvd((Object) this.syncId, (Object) mfaResponse.syncId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.scenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.maskedEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.nextStep;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<String> list = this.alternativeNextSteps;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        Boolean bool = this.allowResetMfa;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.allowResetPasskey;
        int iHashCode4 = bool2 == null ? 0 : bool2.hashCode();
        Integer num = this.currentStepper;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        Integer num2 = this.totalStep;
        int iHashCode6 = num2 == null ? 0 : num2.hashCode();
        String str2 = this.maskedEmail;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.maskedPhone;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.business;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.scenario;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.reminderContent;
        int iHashCode11 = str6 == null ? 0 : str6.hashCode();
        Boolean bool3 = this.requiredCaptcha;
        int iHashCode12 = bool3 == null ? 0 : bool3.hashCode();
        RegistrationStartResponse registrationStartResponse = this.passkeyUpgradeOptions;
        int iHashCode13 = registrationStartResponse == null ? 0 : registrationStartResponse.hashCode();
        String str7 = this.encryptedPasskey;
        int iHashCode14 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.syncId;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str8 == null ? 0 : str8.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer isConnected() {
        return this.totalStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MfaResponse(nextStep=" + this.nextStep + ", alternativeNextSteps=" + this.alternativeNextSteps + ", allowResetMfa=" + this.allowResetMfa + ", allowResetPasskey=" + this.allowResetPasskey + ", currentStepper=" + this.currentStepper + ", totalStep=" + this.totalStep + ", maskedEmail=" + this.maskedEmail + ", maskedPhone=" + this.maskedPhone + ", business=" + this.business + ", scenario=" + this.scenario + ", reminderContent=" + this.reminderContent + ", requiredCaptcha=" + this.requiredCaptcha + ", passkeyUpgradeOptions=" + this.passkeyUpgradeOptions + ", encryptedPasskey=" + this.encryptedPasskey + ", syncId=" + this.syncId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.maskedPhone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.syncId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.nextStep);
        parcel.writeStringList(this.alternativeNextSteps);
        Boolean bool = this.allowResetMfa;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.allowResetPasskey;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Integer num = this.currentStepper;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.totalStep;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.maskedEmail);
        parcel.writeString(this.maskedPhone);
        parcel.writeString(this.business);
        parcel.writeString(this.scenario);
        parcel.writeString(this.reminderContent);
        Boolean bool3 = this.requiredCaptcha;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        RegistrationStartResponse registrationStartResponse = this.passkeyUpgradeOptions;
        if (registrationStartResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            registrationStartResponse.writeToParcel(parcel, i);
        }
        parcel.writeString(this.encryptedPasskey);
        parcel.writeString(this.syncId);
    }

    public /* synthetic */ MfaResponse(int i, String str, List list, Boolean bool, Boolean bool2, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, Boolean bool3, RegistrationStartResponse registrationStartResponse, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.nextStep = null;
        } else {
            this.nextStep = str;
        }
        if ((i & 2) == 0) {
            this.alternativeNextSteps = null;
        } else {
            this.alternativeNextSteps = list;
        }
        this.allowResetMfa = (i & 4) == 0 ? Boolean.FALSE : bool;
        this.allowResetPasskey = (i & 8) == 0 ? Boolean.FALSE : bool2;
        this.currentStepper = (i & 16) == 0 ? -1 : num;
        this.totalStep = (i & 32) == 0 ? -1 : num2;
        if ((i & 64) == 0) {
            this.maskedEmail = null;
        } else {
            this.maskedEmail = str2;
        }
        if ((i & 128) == 0) {
            this.maskedPhone = null;
        } else {
            this.maskedPhone = str3;
        }
        if ((i & 256) == 0) {
            this.business = null;
        } else {
            this.business = str4;
        }
        if ((i & 512) == 0) {
            this.scenario = null;
        } else {
            this.scenario = str5;
        }
        if ((i & 1024) == 0) {
            this.reminderContent = null;
        } else {
            this.reminderContent = str6;
        }
        this.requiredCaptcha = (i & 2048) == 0 ? Boolean.FALSE : bool3;
        if ((i & 4096) == 0) {
            this.passkeyUpgradeOptions = null;
        } else {
            this.passkeyUpgradeOptions = registrationStartResponse;
        }
        if ((i & 8192) == 0) {
            this.encryptedPasskey = null;
        } else {
            this.encryptedPasskey = str7;
        }
        if ((i & 16384) == 0) {
            this.syncId = null;
        } else {
            this.syncId = str8;
        }
    }

    public static final /* synthetic */ void OLrzqt(MfaResponse mfaResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || mfaResponse.nextStep != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, mfaResponse.nextStep);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || mfaResponse.alternativeNextSteps != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], mfaResponse.alternativeNextSteps);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(mfaResponse.allowResetMfa, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, mfaResponse.allowResetMfa);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(mfaResponse.allowResetPasskey, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, mfaResponse.allowResetPasskey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || (num2 = mfaResponse.currentStepper) == null || num2.intValue() != -1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, mfaResponse.currentStepper);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || (num = mfaResponse.totalStep) == null || num.intValue() != -1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, mfaResponse.totalStep);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || mfaResponse.maskedEmail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, mfaResponse.maskedEmail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || mfaResponse.maskedPhone != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, mfaResponse.maskedPhone);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || mfaResponse.business != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, mfaResponse.business);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || mfaResponse.scenario != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, mfaResponse.scenario);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || mfaResponse.reminderContent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, mfaResponse.reminderContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(mfaResponse.requiredCaptcha, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, mfaResponse.requiredCaptcha);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || mfaResponse.passkeyUpgradeOptions != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, RegistrationStartResponse$$serializer.INSTANCE, mfaResponse.passkeyUpgradeOptions);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || mfaResponse.encryptedPasskey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, mfaResponse.encryptedPasskey);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && mfaResponse.syncId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, mfaResponse.syncId);
    }

    public MfaResponse(String str, List<String> list, Boolean bool, Boolean bool2, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, Boolean bool3, RegistrationStartResponse registrationStartResponse, String str7, String str8) {
        this.nextStep = str;
        this.alternativeNextSteps = list;
        this.allowResetMfa = bool;
        this.allowResetPasskey = bool2;
        this.currentStepper = num;
        this.totalStep = num2;
        this.maskedEmail = str2;
        this.maskedPhone = str3;
        this.business = str4;
        this.scenario = str5;
        this.reminderContent = str6;
        this.requiredCaptcha = bool3;
        this.passkeyUpgradeOptions = registrationStartResponse;
        this.encryptedPasskey = str7;
        this.syncId = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a4: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r18v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0017: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r19v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0020: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0025: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r21v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0031: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r22v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0064: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0068: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r28v0 java.lang.Boolean))
  (wrap:com.okinc.auth.impl.passkey.model.RegistrationStartResponse:?: TERNARY null = ((wrap:int:0x006d: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.auth.impl.passkey.model.RegistrationStartResponse) : (r29v0 com.okinc.auth.impl.passkey.model.RegistrationStartResponse))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0075: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.auth.impl.passkey.model.RegistrationStartResponse, java.lang.String, java.lang.String):void (m)] (LINE:15) call: com.okinc.auth.impl.mfa.model.MfaResponse.<init>(java.lang.String, java.util.List, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.auth.impl.passkey.model.RegistrationStartResponse, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MfaResponse(String str, List list, Boolean bool, Boolean bool2, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, Boolean bool3, RegistrationStartResponse registrationStartResponse, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? Boolean.FALSE : bool2, (i & 16) != 0 ? -1 : num, (i & 32) != 0 ? -1 : num2, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? Boolean.FALSE : bool3, (i & 4096) != 0 ? null : registrationStartResponse, (i & 8192) != 0 ? null : str7, (i & 16384) == 0 ? str8 : null);
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.mfa.model.MfaResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MfaResponse> serializer() {
            return MfaResponse$$serializer.INSTANCE;
        }
    }
}
