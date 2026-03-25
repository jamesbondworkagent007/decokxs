package com.okinc.account.api.model.uploadpersonalinfo;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
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
public final class UploadPersonalInfoResponse implements Parcelable {
    private final Boolean allowResetMfa;
    private final Boolean allowResetPasskey;
    private final List<String> alternativeNextSteps;
    private final String business;
    private final Integer currentStepper;
    private final boolean isSuccessUpload;
    private final String maskedEmail;
    private final String maskedPhone;
    private final String nextStep;
    private final String reminderContent;
    private final String scenario;
    private final Integer totalStep;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UploadPersonalInfoResponse> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, null, null, null};

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Creator implements Parcelable.Creator<UploadPersonalInfoResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UploadPersonalInfoResponse createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
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
            return new UploadPersonalInfoResponse(z, string, arrayListCreateStringArrayList, boolValueOf, boolValueOf2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UploadPersonalInfoResponse[] newArray(int i) {
            return new UploadPersonalInfoResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UploadPersonalInfoResponse() {
        this(false, (String) null, (List) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    @SerialName("allowResetMfa")
    public static /* synthetic */ void getAllowResetMfa$annotations() {
    }

    @SerialName("allowResetPasskey")
    public static /* synthetic */ void getAllowResetPasskey$annotations() {
    }

    @SerialName("alternativeNextSteps")
    public static /* synthetic */ void getAlternativeNextSteps$annotations() {
    }

    @SerialName("business")
    public static /* synthetic */ void getBusiness$annotations() {
    }

    @SerialName("currentStepper")
    public static /* synthetic */ void getCurrentStepper$annotations() {
    }

    @SerialName("maskedEmail")
    public static /* synthetic */ void getMaskedEmail$annotations() {
    }

    @SerialName("maskedPhone")
    public static /* synthetic */ void getMaskedPhone$annotations() {
    }

    @SerialName("nextStep")
    public static /* synthetic */ void getNextStep$annotations() {
    }

    @SerialName("reminderContent")
    public static /* synthetic */ void getReminderContent$annotations() {
    }

    @SerialName("scenario")
    public static /* synthetic */ void getScenario$annotations() {
    }

    @SerialName("totalStep")
    public static /* synthetic */ void getTotalStep$annotations() {
    }

    @SerialName("isSuccessUpload")
    public static /* synthetic */ void isSuccessUpload$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isSuccessUpload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.business;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.scenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.reminderContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nextStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.alternativeNextSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.allowResetMfa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.allowResetPasskey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.currentStepper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.totalStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.maskedEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.maskedPhone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UploadPersonalInfoResponse copy(boolean z, String str, List<String> list, Boolean bool, Boolean bool2, Integer num, Integer num2, String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new UploadPersonalInfoResponse(z, str, list, bool, bool2, num, num2, str2, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadPersonalInfoResponse)) {
            return false;
        }
        UploadPersonalInfoResponse uploadPersonalInfoResponse = (UploadPersonalInfoResponse) obj;
        return this.isSuccessUpload == uploadPersonalInfoResponse.isSuccessUpload && Intrinsics.EZpvd((Object) this.nextStep, (Object) uploadPersonalInfoResponse.nextStep) && Intrinsics.EZpvd(this.alternativeNextSteps, uploadPersonalInfoResponse.alternativeNextSteps) && Intrinsics.EZpvd(this.allowResetMfa, uploadPersonalInfoResponse.allowResetMfa) && Intrinsics.EZpvd(this.allowResetPasskey, uploadPersonalInfoResponse.allowResetPasskey) && Intrinsics.EZpvd(this.currentStepper, uploadPersonalInfoResponse.currentStepper) && Intrinsics.EZpvd(this.totalStep, uploadPersonalInfoResponse.totalStep) && Intrinsics.EZpvd((Object) this.maskedEmail, (Object) uploadPersonalInfoResponse.maskedEmail) && Intrinsics.EZpvd((Object) this.maskedPhone, (Object) uploadPersonalInfoResponse.maskedPhone) && Intrinsics.EZpvd((Object) this.business, (Object) uploadPersonalInfoResponse.business) && Intrinsics.EZpvd((Object) this.scenario, (Object) uploadPersonalInfoResponse.scenario) && Intrinsics.EZpvd((Object) this.reminderContent, (Object) uploadPersonalInfoResponse.reminderContent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowResetMfa() {
        return this.allowResetMfa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowResetPasskey() {
        return this.allowResetPasskey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getAlternativeNextSteps() {
        return this.alternativeNextSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBusiness() {
        return this.business;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrentStepper() {
        return this.currentStepper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaskedEmail() {
        return this.maskedEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaskedPhone() {
        return this.maskedPhone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextStep() {
        return this.nextStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReminderContent() {
        return this.reminderContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScenario() {
        return this.scenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTotalStep() {
        return this.totalStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isSuccessUpload);
        String str = this.nextStep;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        List<String> list = this.alternativeNextSteps;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        Boolean bool = this.allowResetMfa;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.allowResetPasskey;
        int iHashCode5 = bool2 == null ? 0 : bool2.hashCode();
        Integer num = this.currentStepper;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        Integer num2 = this.totalStep;
        int iHashCode7 = num2 == null ? 0 : num2.hashCode();
        String str2 = this.maskedEmail;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.maskedPhone;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.business.hashCode()) * 31) + this.scenario.hashCode()) * 31) + this.reminderContent.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSuccessUpload() {
        return this.isSuccessUpload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UploadPersonalInfoResponse(isSuccessUpload=" + this.isSuccessUpload + ", nextStep=" + this.nextStep + ", alternativeNextSteps=" + this.alternativeNextSteps + ", allowResetMfa=" + this.allowResetMfa + ", allowResetPasskey=" + this.allowResetPasskey + ", currentStepper=" + this.currentStepper + ", totalStep=" + this.totalStep + ", maskedEmail=" + this.maskedEmail + ", maskedPhone=" + this.maskedPhone + ", business=" + this.business + ", scenario=" + this.scenario + ", reminderContent=" + this.reminderContent + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isSuccessUpload ? 1 : 0);
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
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UploadPersonalInfoResponse> serializer() {
            return UploadPersonalInfoResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UploadPersonalInfoResponse(int i, boolean z, String str, List list, Boolean bool, Boolean bool2, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        this.isSuccessUpload = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.nextStep = null;
        } else {
            this.nextStep = str;
        }
        if ((i & 4) == 0) {
            this.alternativeNextSteps = null;
        } else {
            this.alternativeNextSteps = list;
        }
        if ((i & 8) == 0) {
            this.allowResetMfa = Boolean.FALSE;
        } else {
            this.allowResetMfa = bool;
        }
        if ((i & 16) == 0) {
            this.allowResetPasskey = Boolean.FALSE;
        } else {
            this.allowResetPasskey = bool2;
        }
        if ((i & 32) == 0) {
            this.currentStepper = null;
        } else {
            this.currentStepper = num;
        }
        if ((i & 64) == 0) {
            this.totalStep = null;
        } else {
            this.totalStep = num2;
        }
        if ((i & 128) == 0) {
            this.maskedEmail = null;
        } else {
            this.maskedEmail = str2;
        }
        if ((i & 256) == 0) {
            this.maskedPhone = null;
        } else {
            this.maskedPhone = str3;
        }
        if ((i & 512) == 0) {
            this.business = "";
        } else {
            this.business = str4;
        }
        if ((i & 1024) == 0) {
            this.scenario = "";
        } else {
            this.scenario = str5;
        }
        if ((i & 2048) == 0) {
            this.reminderContent = "";
        } else {
            this.reminderContent = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKAccount_account_api(UploadPersonalInfoResponse uploadPersonalInfoResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || uploadPersonalInfoResponse.isSuccessUpload) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, uploadPersonalInfoResponse.isSuccessUpload);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || uploadPersonalInfoResponse.nextStep != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, uploadPersonalInfoResponse.nextStep);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || uploadPersonalInfoResponse.alternativeNextSteps != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], uploadPersonalInfoResponse.alternativeNextSteps);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(uploadPersonalInfoResponse.allowResetMfa, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, uploadPersonalInfoResponse.allowResetMfa);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(uploadPersonalInfoResponse.allowResetPasskey, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, uploadPersonalInfoResponse.allowResetPasskey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || uploadPersonalInfoResponse.currentStepper != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, uploadPersonalInfoResponse.currentStepper);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || uploadPersonalInfoResponse.totalStep != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, uploadPersonalInfoResponse.totalStep);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || uploadPersonalInfoResponse.maskedEmail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, uploadPersonalInfoResponse.maskedEmail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || uploadPersonalInfoResponse.maskedPhone != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, uploadPersonalInfoResponse.maskedPhone);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) uploadPersonalInfoResponse.business, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, uploadPersonalInfoResponse.business);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) uploadPersonalInfoResponse.scenario, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, uploadPersonalInfoResponse.scenario);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd((Object) uploadPersonalInfoResponse.reminderContent, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, uploadPersonalInfoResponse.reminderContent);
    }

    public UploadPersonalInfoResponse(boolean z, String str, List<String> list, Boolean bool, Boolean bool2, Integer num, Integer num2, String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.isSuccessUpload = z;
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
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007b: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r16v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0019: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001d: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r17v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0022: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0026: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r18v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002b: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r19v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0033: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r20v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r26v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (""))
 A[MD:(boolean, java.lang.String, java.util.List<java.lang.String>, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:37) call: com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoResponse.<init>(boolean, java.lang.String, java.util.List, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ UploadPersonalInfoResponse(boolean z, String str, List list, Boolean bool, Boolean bool2, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) != 0 ? Boolean.FALSE : bool2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : str2, (i & 256) == 0 ? str3 : null, (i & 512) != 0 ? "" : str4, (i & 1024) != 0 ? "" : str5, (i & 2048) == 0 ? str6 : "");
    }
}
