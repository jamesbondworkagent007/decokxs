package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CheckQuestionResponse implements Parcelable {
    private String action;
    private Boolean canTakeTest;
    private Boolean hasAgreed;
    private Boolean isPassKyc;
    private String link;
    private NotificationModel notification;
    private String playbook;
    private String userType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CheckQuestionResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CheckQuestionResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckQuestionResponse createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
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
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CheckQuestionResponse(string, boolValueOf, boolValueOf2, boolValueOf3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? NotificationModel.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CheckQuestionResponse[] newArray(int i) {
            return new CheckQuestionResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.hasAgreed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.canTakeTest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.isPassKyc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.userType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.playbook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationModel component8() {
        return this.notification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckQuestionResponse copy(String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, String str3, String str4, NotificationModel notificationModel) {
        return new CheckQuestionResponse(str, bool, bool2, bool3, str2, str3, str4, notificationModel);
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
        if (!(obj instanceof CheckQuestionResponse)) {
            return false;
        }
        CheckQuestionResponse checkQuestionResponse = (CheckQuestionResponse) obj;
        return Intrinsics.EZpvd((Object) this.action, (Object) checkQuestionResponse.action) && Intrinsics.EZpvd(this.hasAgreed, checkQuestionResponse.hasAgreed) && Intrinsics.EZpvd(this.canTakeTest, checkQuestionResponse.canTakeTest) && Intrinsics.EZpvd(this.isPassKyc, checkQuestionResponse.isPassKyc) && Intrinsics.EZpvd((Object) this.userType, (Object) checkQuestionResponse.userType) && Intrinsics.EZpvd((Object) this.playbook, (Object) checkQuestionResponse.playbook) && Intrinsics.EZpvd((Object) this.link, (Object) checkQuestionResponse.link) && Intrinsics.EZpvd(this.notification, checkQuestionResponse.notification);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAction() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanTakeTest() {
        return this.canTakeTest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasAgreed() {
        return this.hasAgreed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLink() {
        return this.link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationModel getNotification() {
        return this.notification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlaybook() {
        return this.playbook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserType() {
        return this.userType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.action;
        int iHashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.hasAgreed;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.canTakeTest;
        int iHashCode3 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.isPassKyc;
        int iHashCode4 = bool3 == null ? 0 : bool3.hashCode();
        String str2 = this.userType;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.playbook;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.link;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        NotificationModel notificationModel = this.notification;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (notificationModel != null ? notificationModel.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isPassKyc() {
        return this.isPassKyc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAction(String str) {
        this.action = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanTakeTest(Boolean bool) {
        this.canTakeTest = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasAgreed(Boolean bool) {
        this.hasAgreed = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLink(String str) {
        this.link = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotification(NotificationModel notificationModel) {
        this.notification = notificationModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPassKyc(Boolean bool) {
        this.isPassKyc = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlaybook(String str) {
        this.playbook = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserType(String str) {
        this.userType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckQuestionResponse(action=" + this.action + ", hasAgreed=" + this.hasAgreed + ", canTakeTest=" + this.canTakeTest + ", isPassKyc=" + this.isPassKyc + ", userType=" + this.userType + ", playbook=" + this.playbook + ", link=" + this.link + ", notification=" + this.notification + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.action);
        Boolean bool = this.hasAgreed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.canTakeTest;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isPassKyc;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.userType);
        parcel.writeString(this.playbook);
        parcel.writeString(this.link);
        NotificationModel notificationModel = this.notification;
        if (notificationModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationModel.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CheckQuestionResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CheckQuestionResponse> serializer() {
            return CheckQuestionResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CheckQuestionResponse(int i, String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, String str3, String str4, NotificationModel notificationModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (128 != (i & 128)) {
            PluginExceptionsKt.throwMissingFieldException(i, 128, CheckQuestionResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.action = "";
        } else {
            this.action = str;
        }
        if ((i & 2) == 0) {
            this.hasAgreed = Boolean.FALSE;
        } else {
            this.hasAgreed = bool;
        }
        if ((i & 4) == 0) {
            this.canTakeTest = Boolean.FALSE;
        } else {
            this.canTakeTest = bool2;
        }
        if ((i & 8) == 0) {
            this.isPassKyc = Boolean.FALSE;
        } else {
            this.isPassKyc = bool3;
        }
        if ((i & 16) == 0) {
            this.userType = "";
        } else {
            this.userType = str2;
        }
        if ((i & 32) == 0) {
            this.playbook = "";
        } else {
            this.playbook = str3;
        }
        if ((i & 64) == 0) {
            this.link = "";
        } else {
            this.link = str4;
        }
        this.notification = notificationModel;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CheckQuestionResponse checkQuestionResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) checkQuestionResponse.action, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, checkQuestionResponse.action);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(checkQuestionResponse.hasAgreed, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, checkQuestionResponse.hasAgreed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(checkQuestionResponse.canTakeTest, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, checkQuestionResponse.canTakeTest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(checkQuestionResponse.isPassKyc, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, checkQuestionResponse.isPassKyc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) checkQuestionResponse.userType, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, checkQuestionResponse.userType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) checkQuestionResponse.playbook, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, checkQuestionResponse.playbook);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) checkQuestionResponse.link, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, checkQuestionResponse.link);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, NotificationModel$$serializer.INSTANCE, checkQuestionResponse.notification);
    }

    public CheckQuestionResponse(String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, String str3, String str4, NotificationModel notificationModel) {
        this.action = str;
        this.hasAgreed = bool;
        this.canTakeTest = bool2;
        this.isPassKyc = bool3;
        this.userType = str2;
        this.playbook = str3;
        this.link = str4;
        this.notification = notificationModel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0009: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000f: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r13v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r14v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0021: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r15v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (r19v0 com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationModel)
 A[MD:(java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationModel):void (m)] (LINE:15) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CheckQuestionResponse.<init>(java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationModel):void type: THIS */
    public /* synthetic */ CheckQuestionResponse(String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, String str3, String str4, NotificationModel notificationModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? Boolean.FALSE : bool2, (i & 8) != 0 ? Boolean.FALSE : bool3, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, notificationModel);
    }
}
