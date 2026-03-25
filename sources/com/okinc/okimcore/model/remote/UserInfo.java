package com.okinc.okimcore.model.remote;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class UserInfo implements Parcelable {
    private final Integer allowChatViaProfile;
    private final String allowContactDiscovery;
    private final Boolean allowCreateGroup;
    private final Boolean allowGenerateQrCode;
    private final Integer allowInAppNotification;
    private final Boolean allowSearchUuid;
    private final String avatar;
    private final Integer avatarStatus;
    private final String enPetname;
    private final String groupStatus;
    private final String identifyId;
    private final OfficialTagInfo officialTag;
    private final String petname;
    private final String petnameSearchStatus;
    private final String phoneSearchStatus;
    private final Long phoneSyncQuota;
    private final String qrSearchStatus;
    private final String rcToken;
    private final String sign;
    private final Long timestamp;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UserInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UserInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            OfficialTagInfo officialTagInfoCreateFromParcel = parcel.readInt() == 0 ? null : OfficialTagInfo.CREATOR.createFromParcel(parcel);
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
            return new UserInfo(string, string2, numValueOf, string3, string4, string5, string6, string7, string8, string9, string10, string11, lValueOf, officialTagInfoCreateFromParcel, boolValueOf, boolValueOf2, boolValueOf3, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserInfo[] newArray(int i) {
            return new UserInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UserInfo() {
        this((String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (OfficialTagInfo) null, (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, (Integer) null, (Integer) null, 1048575, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.identifyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.petnameSearchStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.groupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.allowContactDiscovery;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component13() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo component14() {
        return this.officialTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component15() {
        return this.allowGenerateQrCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component16() {
        return this.allowCreateGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component17() {
        return this.allowSearchUuid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component18() {
        return this.phoneSyncQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component19() {
        return this.allowInAppNotification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component20() {
        return this.allowChatViaProfile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.avatarStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.petname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.enPetname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.rcToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.phoneSearchStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.qrSearchStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserInfo copy(String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Long l, OfficialTagInfo officialTagInfo, Boolean bool, Boolean bool2, Boolean bool3, Long l2, Integer num2, Integer num3) {
        return new UserInfo(str, str2, num, str3, str4, str5, str6, str7, str8, str9, str10, str11, l, officialTagInfo, bool, bool2, bool3, l2, num2, num3);
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
        if (!(obj instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) obj;
        return Intrinsics.EZpvd((Object) this.identifyId, (Object) userInfo.identifyId) && Intrinsics.EZpvd((Object) this.avatar, (Object) userInfo.avatar) && Intrinsics.EZpvd(this.avatarStatus, userInfo.avatarStatus) && Intrinsics.EZpvd((Object) this.petname, (Object) userInfo.petname) && Intrinsics.EZpvd((Object) this.enPetname, (Object) userInfo.enPetname) && Intrinsics.EZpvd((Object) this.rcToken, (Object) userInfo.rcToken) && Intrinsics.EZpvd((Object) this.sign, (Object) userInfo.sign) && Intrinsics.EZpvd((Object) this.phoneSearchStatus, (Object) userInfo.phoneSearchStatus) && Intrinsics.EZpvd((Object) this.qrSearchStatus, (Object) userInfo.qrSearchStatus) && Intrinsics.EZpvd((Object) this.petnameSearchStatus, (Object) userInfo.petnameSearchStatus) && Intrinsics.EZpvd((Object) this.groupStatus, (Object) userInfo.groupStatus) && Intrinsics.EZpvd((Object) this.allowContactDiscovery, (Object) userInfo.allowContactDiscovery) && Intrinsics.EZpvd(this.timestamp, userInfo.timestamp) && Intrinsics.EZpvd(this.officialTag, userInfo.officialTag) && Intrinsics.EZpvd(this.allowGenerateQrCode, userInfo.allowGenerateQrCode) && Intrinsics.EZpvd(this.allowCreateGroup, userInfo.allowCreateGroup) && Intrinsics.EZpvd(this.allowSearchUuid, userInfo.allowSearchUuid) && Intrinsics.EZpvd(this.phoneSyncQuota, userInfo.phoneSyncQuota) && Intrinsics.EZpvd(this.allowInAppNotification, userInfo.allowInAppNotification) && Intrinsics.EZpvd(this.allowChatViaProfile, userInfo.allowChatViaProfile);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAllowChatViaProfile() {
        return this.allowChatViaProfile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAllowContactDiscovery() {
        return this.allowContactDiscovery;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowCreateGroup() {
        return this.allowCreateGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowGenerateQrCode() {
        return this.allowGenerateQrCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAllowInAppNotification() {
        return this.allowInAppNotification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowSearchUuid() {
        return this.allowSearchUuid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAvatarStatus() {
        return this.avatarStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnPetname() {
        return this.enPetname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupStatus() {
        return this.groupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIdentifyId() {
        return this.identifyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo getOfficialTag() {
        return this.officialTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPetname() {
        return this.petname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPetnameSearchStatus() {
        return this.petnameSearchStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhoneSearchStatus() {
        return this.phoneSearchStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getPhoneSyncQuota() {
        return this.phoneSyncQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQrSearchStatus() {
        return this.qrSearchStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRcToken() {
        return this.rcToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSign() {
        return this.sign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.identifyId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.avatar;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.avatarStatus;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str3 = this.petname;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.enPetname;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.rcToken;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.sign;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.phoneSearchStatus;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.qrSearchStatus;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.petnameSearchStatus;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.groupStatus;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.allowContactDiscovery;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        Long l = this.timestamp;
        int iHashCode13 = l == null ? 0 : l.hashCode();
        OfficialTagInfo officialTagInfo = this.officialTag;
        int iHashCode14 = officialTagInfo == null ? 0 : officialTagInfo.hashCode();
        Boolean bool = this.allowGenerateQrCode;
        int iHashCode15 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.allowCreateGroup;
        int iHashCode16 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.allowSearchUuid;
        int iHashCode17 = bool3 == null ? 0 : bool3.hashCode();
        Long l2 = this.phoneSyncQuota;
        int iHashCode18 = l2 == null ? 0 : l2.hashCode();
        Integer num2 = this.allowInAppNotification;
        int iHashCode19 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.allowChatViaProfile;
        return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (num3 == null ? 0 : num3.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserInfo(identifyId=" + this.identifyId + ", avatar=" + this.avatar + ", avatarStatus=" + this.avatarStatus + ", petname=" + this.petname + ", enPetname=" + this.enPetname + ", rcToken=" + this.rcToken + ", sign=" + this.sign + ", phoneSearchStatus=" + this.phoneSearchStatus + ", qrSearchStatus=" + this.qrSearchStatus + ", petnameSearchStatus=" + this.petnameSearchStatus + ", groupStatus=" + this.groupStatus + ", allowContactDiscovery=" + this.allowContactDiscovery + ", timestamp=" + this.timestamp + ", officialTag=" + this.officialTag + ", allowGenerateQrCode=" + this.allowGenerateQrCode + ", allowCreateGroup=" + this.allowCreateGroup + ", allowSearchUuid=" + this.allowSearchUuid + ", phoneSyncQuota=" + this.phoneSyncQuota + ", allowInAppNotification=" + this.allowInAppNotification + ", allowChatViaProfile=" + this.allowChatViaProfile + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.identifyId);
        parcel.writeString(this.avatar);
        Integer num = this.avatarStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.petname);
        parcel.writeString(this.enPetname);
        parcel.writeString(this.rcToken);
        parcel.writeString(this.sign);
        parcel.writeString(this.phoneSearchStatus);
        parcel.writeString(this.qrSearchStatus);
        parcel.writeString(this.petnameSearchStatus);
        parcel.writeString(this.groupStatus);
        parcel.writeString(this.allowContactDiscovery);
        Long l = this.timestamp;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        OfficialTagInfo officialTagInfo = this.officialTag;
        if (officialTagInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            officialTagInfo.writeToParcel(parcel, i);
        }
        Boolean bool = this.allowGenerateQrCode;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.allowCreateGroup;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.allowSearchUuid;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Long l2 = this.phoneSyncQuota;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Integer num2 = this.allowInAppNotification;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.allowChatViaProfile;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.UserInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserInfo> serializer() {
            return UserInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserInfo(int i, String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Long l, OfficialTagInfo officialTagInfo, Boolean bool, Boolean bool2, Boolean bool3, Long l2, Integer num2, Integer num3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.identifyId = "";
        } else {
            this.identifyId = str;
        }
        if ((i & 2) == 0) {
            this.avatar = "";
        } else {
            this.avatar = str2;
        }
        if ((i & 4) == 0) {
            this.avatarStatus = null;
        } else {
            this.avatarStatus = num;
        }
        if ((i & 8) == 0) {
            this.petname = "";
        } else {
            this.petname = str3;
        }
        if ((i & 16) == 0) {
            this.enPetname = null;
        } else {
            this.enPetname = str4;
        }
        if ((i & 32) == 0) {
            this.rcToken = null;
        } else {
            this.rcToken = str5;
        }
        if ((i & 64) == 0) {
            this.sign = "";
        } else {
            this.sign = str6;
        }
        if ((i & 128) == 0) {
            this.phoneSearchStatus = null;
        } else {
            this.phoneSearchStatus = str7;
        }
        if ((i & 256) == 0) {
            this.qrSearchStatus = null;
        } else {
            this.qrSearchStatus = str8;
        }
        if ((i & 512) == 0) {
            this.petnameSearchStatus = null;
        } else {
            this.petnameSearchStatus = str9;
        }
        if ((i & 1024) == 0) {
            this.groupStatus = null;
        } else {
            this.groupStatus = str10;
        }
        if ((i & 2048) == 0) {
            this.allowContactDiscovery = null;
        } else {
            this.allowContactDiscovery = str11;
        }
        if ((i & 4096) == 0) {
            this.timestamp = null;
        } else {
            this.timestamp = l;
        }
        if ((i & 8192) == 0) {
            this.officialTag = null;
        } else {
            this.officialTag = officialTagInfo;
        }
        if ((i & 16384) == 0) {
            this.allowGenerateQrCode = null;
        } else {
            this.allowGenerateQrCode = bool;
        }
        if ((32768 & i) == 0) {
            this.allowCreateGroup = null;
        } else {
            this.allowCreateGroup = bool2;
        }
        if ((65536 & i) == 0) {
            this.allowSearchUuid = null;
        } else {
            this.allowSearchUuid = bool3;
        }
        if ((131072 & i) == 0) {
            this.phoneSyncQuota = null;
        } else {
            this.phoneSyncQuota = l2;
        }
        if ((262144 & i) == 0) {
            this.allowInAppNotification = null;
        } else {
            this.allowInAppNotification = num2;
        }
        if ((i & 524288) == 0) {
            this.allowChatViaProfile = null;
        } else {
            this.allowChatViaProfile = num3;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(UserInfo userInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) userInfo.identifyId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, userInfo.identifyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) userInfo.avatar, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, userInfo.avatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || userInfo.avatarStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, userInfo.avatarStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) userInfo.petname, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, userInfo.petname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || userInfo.enPetname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, userInfo.enPetname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || userInfo.rcToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, userInfo.rcToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) userInfo.sign, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, userInfo.sign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || userInfo.phoneSearchStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, userInfo.phoneSearchStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || userInfo.qrSearchStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, userInfo.qrSearchStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || userInfo.petnameSearchStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, userInfo.petnameSearchStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || userInfo.groupStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, userInfo.groupStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || userInfo.allowContactDiscovery != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, userInfo.allowContactDiscovery);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || userInfo.timestamp != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, LongSerializer.INSTANCE, userInfo.timestamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || userInfo.officialTag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, OfficialTagInfo$$serializer.INSTANCE, userInfo.officialTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || userInfo.allowGenerateQrCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, BooleanSerializer.INSTANCE, userInfo.allowGenerateQrCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || userInfo.allowCreateGroup != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, userInfo.allowCreateGroup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || userInfo.allowSearchUuid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.INSTANCE, userInfo.allowSearchUuid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || userInfo.phoneSyncQuota != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, LongSerializer.INSTANCE, userInfo.phoneSyncQuota);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || userInfo.allowInAppNotification != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, IntSerializer.INSTANCE, userInfo.allowInAppNotification);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) && userInfo.allowChatViaProfile == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, IntSerializer.INSTANCE, userInfo.allowChatViaProfile);
    }

    public UserInfo(String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Long l, OfficialTagInfo officialTagInfo, Boolean bool, Boolean bool2, Boolean bool3, Long l2, Integer num2, Integer num3) {
        this.identifyId = str;
        this.avatar = str2;
        this.avatarStatus = num;
        this.petname = str3;
        this.enPetname = str4;
        this.rcToken = str5;
        this.sign = str6;
        this.phoneSearchStatus = str7;
        this.qrSearchStatus = str8;
        this.petnameSearchStatus = str9;
        this.groupStatus = str10;
        this.allowContactDiscovery = str11;
        this.timestamp = l;
        this.officialTag = officialTagInfo;
        this.allowGenerateQrCode = bool;
        this.allowCreateGroup = bool2;
        this.allowSearchUuid = bool3;
        this.phoneSyncQuota = l2;
        this.allowInAppNotification = num2;
        this.allowChatViaProfile = num3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00dc: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r42v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r42v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0014: ARITH (r42v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r24v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r42v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r42v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r42v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r42v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r28v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r42v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r42v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r42v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r42v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r42v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0063: ARITH (r42v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r34v0 java.lang.Long))
  (wrap:com.okinc.okimcore.model.remote.OfficialTagInfo:?: TERNARY null = ((wrap:int:0x006b: ARITH (r42v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.OfficialTagInfo) : (r35v0 com.okinc.okimcore.model.remote.OfficialTagInfo))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0073: ARITH (r42v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r36v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x007e: ARITH (r42v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r37v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0089: ARITH (r42v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r38v0 java.lang.Boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0094: ARITH (r42v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r39v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x009f: ARITH (r42v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r40v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00aa: ARITH (r42v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r41v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, com.okinc.okimcore.model.remote.OfficialTagInfo, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Long, java.lang.Integer, java.lang.Integer):void (m)] (LINE:17) call: com.okinc.okimcore.model.remote.UserInfo.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, com.okinc.okimcore.model.remote.OfficialTagInfo, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Long, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ UserInfo(String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Long l, OfficialTagInfo officialTagInfo, Boolean bool, Boolean bool2, Boolean bool3, Long l2, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) == 0 ? str6 : "", (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : l, (i & 8192) != 0 ? null : officialTagInfo, (i & 16384) != 0 ? null : bool, (i & 32768) != 0 ? null : bool2, (i & 65536) != 0 ? null : bool3, (i & 131072) != 0 ? null : l2, (i & 262144) != 0 ? null : num2, (i & 524288) != 0 ? null : num3);
    }
}
