package com.okinc.okimcore.model.other;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GroupCampaignInfo implements Parcelable {
    public static final int $stable = 0;
    private final Integer activityId;
    private final String campaignEndTime;
    private final String campaignStartTime;
    private final String minAppVersion;
    private final String registrationStartTime;
    private final String urlSlug;
    private final String urlSubPath;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GroupCampaignInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<GroupCampaignInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupCampaignInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GroupCampaignInfo(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupCampaignInfo[] newArray(int i) {
            return new GroupCampaignInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupCampaignInfo() {
        this((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GroupCampaignInfo copy$default(GroupCampaignInfo groupCampaignInfo, Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            num = groupCampaignInfo.activityId;
        }
        if ((i & 2) != 0) {
            str = groupCampaignInfo.urlSlug;
        }
        String str7 = str;
        if ((i & 4) != 0) {
            str2 = groupCampaignInfo.urlSubPath;
        }
        String str8 = str2;
        if ((i & 8) != 0) {
            str3 = groupCampaignInfo.campaignStartTime;
        }
        String str9 = str3;
        if ((i & 16) != 0) {
            str4 = groupCampaignInfo.campaignEndTime;
        }
        String str10 = str4;
        if ((i & 32) != 0) {
            str5 = groupCampaignInfo.registrationStartTime;
        }
        String str11 = str5;
        if ((i & 64) != 0) {
            str6 = groupCampaignInfo.minAppVersion;
        }
        return groupCampaignInfo.copy(num, str7, str8, str9, str10, str11, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.activityId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.urlSlug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.urlSubPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.campaignStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.campaignEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.registrationStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.minAppVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupCampaignInfo copy(Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        return new GroupCampaignInfo(num, str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof GroupCampaignInfo)) {
            return false;
        }
        GroupCampaignInfo groupCampaignInfo = (GroupCampaignInfo) obj;
        return Intrinsics.EZpvd(this.activityId, groupCampaignInfo.activityId) && Intrinsics.EZpvd((Object) this.urlSlug, (Object) groupCampaignInfo.urlSlug) && Intrinsics.EZpvd((Object) this.urlSubPath, (Object) groupCampaignInfo.urlSubPath) && Intrinsics.EZpvd((Object) this.campaignStartTime, (Object) groupCampaignInfo.campaignStartTime) && Intrinsics.EZpvd((Object) this.campaignEndTime, (Object) groupCampaignInfo.campaignEndTime) && Intrinsics.EZpvd((Object) this.registrationStartTime, (Object) groupCampaignInfo.registrationStartTime) && Intrinsics.EZpvd((Object) this.minAppVersion, (Object) groupCampaignInfo.minAppVersion);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getActivityId() {
        return this.activityId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCampaignEndTime() {
        return this.campaignEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCampaignStartTime() {
        return this.campaignStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAppVersion() {
        return this.minAppVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRegistrationStartTime() {
        return this.registrationStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrlSlug() {
        return this.urlSlug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrlSubPath() {
        return this.urlSubPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.activityId;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.urlSlug;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.urlSubPath;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.campaignStartTime;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.campaignEndTime;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.registrationStartTime;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.minAppVersion;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupCampaignInfo(activityId=" + this.activityId + ", urlSlug=" + this.urlSlug + ", urlSubPath=" + this.urlSubPath + ", campaignStartTime=" + this.campaignStartTime + ", campaignEndTime=" + this.campaignEndTime + ", registrationStartTime=" + this.registrationStartTime + ", minAppVersion=" + this.minAppVersion + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.activityId;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.urlSlug);
        parcel.writeString(this.urlSubPath);
        parcel.writeString(this.campaignStartTime);
        parcel.writeString(this.campaignEndTime);
        parcel.writeString(this.registrationStartTime);
        parcel.writeString(this.minAppVersion);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.other.GroupCampaignInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupCampaignInfo> serializer() {
            return GroupCampaignInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupCampaignInfo(int i, Integer num, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.activityId = null;
        } else {
            this.activityId = num;
        }
        if ((i & 2) == 0) {
            this.urlSlug = null;
        } else {
            this.urlSlug = str;
        }
        if ((i & 4) == 0) {
            this.urlSubPath = null;
        } else {
            this.urlSubPath = str2;
        }
        if ((i & 8) == 0) {
            this.campaignStartTime = null;
        } else {
            this.campaignStartTime = str3;
        }
        if ((i & 16) == 0) {
            this.campaignEndTime = null;
        } else {
            this.campaignEndTime = str4;
        }
        if ((i & 32) == 0) {
            this.registrationStartTime = null;
        } else {
            this.registrationStartTime = str5;
        }
        if ((i & 64) == 0) {
            this.minAppVersion = null;
        } else {
            this.minAppVersion = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupCampaignInfo groupCampaignInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || groupCampaignInfo.activityId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, groupCampaignInfo.activityId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || groupCampaignInfo.urlSlug != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, groupCampaignInfo.urlSlug);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || groupCampaignInfo.urlSubPath != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, groupCampaignInfo.urlSubPath);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || groupCampaignInfo.campaignStartTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, groupCampaignInfo.campaignStartTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || groupCampaignInfo.campaignEndTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, groupCampaignInfo.campaignEndTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || groupCampaignInfo.registrationStartTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, groupCampaignInfo.registrationStartTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && groupCampaignInfo.minAppVersion == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, groupCampaignInfo.minAppVersion);
    }

    public GroupCampaignInfo(Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        this.activityId = num;
        this.urlSlug = str;
        this.urlSubPath = str2;
        this.campaignStartTime = str3;
        this.campaignEndTime = str4;
        this.registrationStartTime = str5;
        this.minAppVersion = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r7v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:252) call: com.okinc.okimcore.model.other.GroupCampaignInfo.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ GroupCampaignInfo(Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }
}
