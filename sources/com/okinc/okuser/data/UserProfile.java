package com.okinc.okuser.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class UserProfile implements Parcelable {
    public static final int ALLOW_EDIT = 0;
    public static final int APPROVED = 2;
    public static final int FREEZE = 4;
    public static final int PENDING = 1;
    public static final int REJECTED = 3;
    private String approvedPetname;
    private String avatar;
    private AvatarInfo avatarInfo;
    private Integer avatarStatus;
    private String backgroundUrl;
    private Integer backgroundUrlStatus;
    private String bio;
    private Integer bioStatus;
    private boolean canSwitchAccount;
    private String enPetname;
    private Integer enPetnameStatus;
    private Integer enSignStatus;
    private String groupStatus;
    private String identifyId;
    public boolean isDefaultGeneratedNickname;
    private Integer maxAvatarUpdateQuota;
    private Integer maxEnPetnameUpdateQuota;
    private Integer maxPetnameUpdateQuota;
    private String originalAvatar;
    private String petname;
    private String petnameSearchStatus;
    private Integer petnameStatus;
    private String phoneSearchStatus;
    private String qrSearchStatus;
    private String rcToken;
    private Integer remainingAvatarUpdateQuota;
    private Integer remainingEnPetnameUpdateQuota;
    private Integer remainingPetnameUpdateQuota;
    private String sign;
    private Integer signStatus;
    private String timestamp;
    private int userLevel;
    private String userLevelName;
    private Boolean vipAvatarFrameToggle;
    public static final ReviewStatus ReviewStatus = new ReviewStatus(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UserProfile> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UserProfile> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserProfile createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string3 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string12 = parcel.readString();
            Integer numValueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf11 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i = parcel.readInt();
            boolean z = parcel.readInt() != 0;
            AvatarInfo avatarInfoCreateFromParcel = AvatarInfo.CREATOR.createFromParcel(parcel);
            boolean z2 = parcel.readInt() != 0;
            String string13 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UserProfile(string, string2, numValueOf, string3, numValueOf2, string4, string5, string6, numValueOf3, numValueOf4, string7, string8, string9, string10, string11, numValueOf5, numValueOf6, numValueOf7, numValueOf8, string12, numValueOf9, numValueOf10, numValueOf11, i, z, avatarInfoCreateFromParcel, z2, string13, boolValueOf, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserProfile[] newArray(int i) {
            return new UserProfile[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UserProfile() {
        this((String) null, (String) null, (Integer) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (Integer) null, (Integer) null, (Integer) null, 0, false, (AvatarInfo) null, false, (String) null, (Boolean) null, (String) null, (String) null, (Integer) null, (String) null, (Integer) null, -1, 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component2() {
        return this.avatar;
    }

    private static /* synthetic */ void getAvatar$annotations() {
    }

    public static /* synthetic */ void getUserLevel$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.identifyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.enSignStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.phoneSearchStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.qrSearchStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.petnameSearchStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.groupStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component16() {
        return this.remainingPetnameUpdateQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component17() {
        return this.remainingAvatarUpdateQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component18() {
        return this.maxAvatarUpdateQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component19() {
        return this.maxPetnameUpdateQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.enPetname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component21() {
        return this.enPetnameStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component22() {
        return this.remainingEnPetnameUpdateQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component23() {
        return this.maxEnPetnameUpdateQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component24() {
        return this.userLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component25() {
        return this.isDefaultGeneratedNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AvatarInfo component26() {
        return this.avatarInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component27() {
        return this.canSwitchAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.userLevelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component29() {
        return this.vipAvatarFrameToggle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.avatarStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.originalAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.bio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component32() {
        return this.bioStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.backgroundUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component34() {
        return this.backgroundUrlStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.petname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.petnameStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.approvedPetname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.rcToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.sign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.signStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserProfile copy(String str, String str2, Integer num, String str3, Integer num2, String str4, String str5, String str6, Integer num3, Integer num4, String str7, String str8, String str9, String str10, String str11, Integer num5, Integer num6, Integer num7, Integer num8, String str12, Integer num9, Integer num10, Integer num11, int i, boolean z, @NotNull AvatarInfo avatarInfo, boolean z2, @NotNull String str13, Boolean bool, @NotNull String str14, String str15, Integer num12, String str16, Integer num13) {
        Intrinsics.checkNotNullParameter(avatarInfo, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        return new UserProfile(str, str2, num, str3, num2, str4, str5, str6, num3, num4, str7, str8, str9, str10, str11, num5, num6, num7, num8, str12, num9, num10, num11, i, z, avatarInfo, z2, str13, bool, str14, str15, num12, str16, num13);
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
        if (!(obj instanceof UserProfile)) {
            return false;
        }
        UserProfile userProfile = (UserProfile) obj;
        return Intrinsics.EZpvd((Object) this.identifyId, (Object) userProfile.identifyId) && Intrinsics.EZpvd((Object) this.avatar, (Object) userProfile.avatar) && Intrinsics.EZpvd(this.avatarStatus, userProfile.avatarStatus) && Intrinsics.EZpvd((Object) this.petname, (Object) userProfile.petname) && Intrinsics.EZpvd(this.petnameStatus, userProfile.petnameStatus) && Intrinsics.EZpvd((Object) this.approvedPetname, (Object) userProfile.approvedPetname) && Intrinsics.EZpvd((Object) this.rcToken, (Object) userProfile.rcToken) && Intrinsics.EZpvd((Object) this.sign, (Object) userProfile.sign) && Intrinsics.EZpvd(this.signStatus, userProfile.signStatus) && Intrinsics.EZpvd(this.enSignStatus, userProfile.enSignStatus) && Intrinsics.EZpvd((Object) this.phoneSearchStatus, (Object) userProfile.phoneSearchStatus) && Intrinsics.EZpvd((Object) this.qrSearchStatus, (Object) userProfile.qrSearchStatus) && Intrinsics.EZpvd((Object) this.petnameSearchStatus, (Object) userProfile.petnameSearchStatus) && Intrinsics.EZpvd((Object) this.groupStatus, (Object) userProfile.groupStatus) && Intrinsics.EZpvd((Object) this.timestamp, (Object) userProfile.timestamp) && Intrinsics.EZpvd(this.remainingPetnameUpdateQuota, userProfile.remainingPetnameUpdateQuota) && Intrinsics.EZpvd(this.remainingAvatarUpdateQuota, userProfile.remainingAvatarUpdateQuota) && Intrinsics.EZpvd(this.maxAvatarUpdateQuota, userProfile.maxAvatarUpdateQuota) && Intrinsics.EZpvd(this.maxPetnameUpdateQuota, userProfile.maxPetnameUpdateQuota) && Intrinsics.EZpvd((Object) this.enPetname, (Object) userProfile.enPetname) && Intrinsics.EZpvd(this.enPetnameStatus, userProfile.enPetnameStatus) && Intrinsics.EZpvd(this.remainingEnPetnameUpdateQuota, userProfile.remainingEnPetnameUpdateQuota) && Intrinsics.EZpvd(this.maxEnPetnameUpdateQuota, userProfile.maxEnPetnameUpdateQuota) && this.userLevel == userProfile.userLevel && this.isDefaultGeneratedNickname == userProfile.isDefaultGeneratedNickname && Intrinsics.EZpvd(this.avatarInfo, userProfile.avatarInfo) && this.canSwitchAccount == userProfile.canSwitchAccount && Intrinsics.EZpvd((Object) this.userLevelName, (Object) userProfile.userLevelName) && Intrinsics.EZpvd(this.vipAvatarFrameToggle, userProfile.vipAvatarFrameToggle) && Intrinsics.EZpvd((Object) this.originalAvatar, (Object) userProfile.originalAvatar) && Intrinsics.EZpvd((Object) this.bio, (Object) userProfile.bio) && Intrinsics.EZpvd(this.bioStatus, userProfile.bioStatus) && Intrinsics.EZpvd((Object) this.backgroundUrl, (Object) userProfile.backgroundUrl) && Intrinsics.EZpvd(this.backgroundUrlStatus, userProfile.backgroundUrlStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApprovedPetname() {
        return this.approvedPetname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AvatarInfo getAvatarInfo() {
        return this.avatarInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAvatarStatus() {
        return this.avatarStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBackgroundUrlStatus() {
        return this.backgroundUrlStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBio() {
        return this.bio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBioStatus() {
        return this.bioStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanSwitchAccount() {
        return this.canSwitchAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnPetname() {
        return this.enPetname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getEnPetnameStatus() {
        return this.enPetnameStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getEnSignStatus() {
        return this.enSignStatus;
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
    public final Integer getMaxAvatarUpdateQuota() {
        return this.maxAvatarUpdateQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMaxEnPetnameUpdateQuota() {
        return this.maxEnPetnameUpdateQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMaxPetnameUpdateQuota() {
        return this.maxPetnameUpdateQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginalAvatar() {
        return this.originalAvatar;
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
    public final Integer getPetnameStatus() {
        return this.petnameStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhoneSearchStatus() {
        return this.phoneSearchStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfilePictureUrl() {
        String str = this.avatar;
        return str == null ? "" : str;
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
    public final Integer getRemainingAvatarUpdateQuota() {
        return this.remainingAvatarUpdateQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRemainingEnPetnameUpdateQuota() {
        return this.remainingEnPetnameUpdateQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRemainingPetnameUpdateQuota() {
        return this.remainingPetnameUpdateQuota;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSign() {
        return this.sign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSignStatus() {
        return this.signStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUserLevel() {
        return this.userLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserLevelName() {
        return this.userLevelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getVipAvatarFrameToggle() {
        return this.vipAvatarFrameToggle;
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
        Integer num2 = this.petnameStatus;
        int iHashCode5 = num2 == null ? 0 : num2.hashCode();
        String str4 = this.approvedPetname;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.rcToken;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.sign;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        Integer num3 = this.signStatus;
        int iHashCode9 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.enSignStatus;
        int iHashCode10 = num4 == null ? 0 : num4.hashCode();
        String str7 = this.phoneSearchStatus;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.qrSearchStatus;
        int iHashCode12 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.petnameSearchStatus;
        int iHashCode13 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.groupStatus;
        int iHashCode14 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.timestamp;
        int iHashCode15 = str11 == null ? 0 : str11.hashCode();
        Integer num5 = this.remainingPetnameUpdateQuota;
        int iHashCode16 = num5 == null ? 0 : num5.hashCode();
        Integer num6 = this.remainingAvatarUpdateQuota;
        int iHashCode17 = num6 == null ? 0 : num6.hashCode();
        Integer num7 = this.maxAvatarUpdateQuota;
        int iHashCode18 = num7 == null ? 0 : num7.hashCode();
        Integer num8 = this.maxPetnameUpdateQuota;
        int iHashCode19 = num8 == null ? 0 : num8.hashCode();
        String str12 = this.enPetname;
        int iHashCode20 = str12 == null ? 0 : str12.hashCode();
        Integer num9 = this.enPetnameStatus;
        int iHashCode21 = num9 == null ? 0 : num9.hashCode();
        Integer num10 = this.remainingEnPetnameUpdateQuota;
        int iHashCode22 = num10 == null ? 0 : num10.hashCode();
        Integer num11 = this.maxEnPetnameUpdateQuota;
        int iHashCode23 = num11 == null ? 0 : num11.hashCode();
        int iHashCode24 = Integer.hashCode(this.userLevel);
        int iHashCode25 = Boolean.hashCode(this.isDefaultGeneratedNickname);
        int iHashCode26 = this.avatarInfo.hashCode();
        int iHashCode27 = Boolean.hashCode(this.canSwitchAccount);
        int iHashCode28 = this.userLevelName.hashCode();
        Boolean bool = this.vipAvatarFrameToggle;
        int iHashCode29 = bool == null ? 0 : bool.hashCode();
        int iHashCode30 = this.originalAvatar.hashCode();
        String str13 = this.bio;
        int iHashCode31 = str13 == null ? 0 : str13.hashCode();
        Integer num12 = this.bioStatus;
        int iHashCode32 = num12 == null ? 0 : num12.hashCode();
        String str14 = this.backgroundUrl;
        int iHashCode33 = str14 == null ? 0 : str14.hashCode();
        Integer num13 = this.backgroundUrlStatus;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + (num13 == null ? 0 : num13.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApprovedPetname(String str) {
        this.approvedPetname = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvatarInfo(@NotNull AvatarInfo avatarInfo) {
        Intrinsics.checkNotNullParameter(avatarInfo, "");
        this.avatarInfo = avatarInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvatarStatus(Integer num) {
        this.avatarStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBackgroundUrl(String str) {
        this.backgroundUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBackgroundUrlStatus(Integer num) {
        this.backgroundUrlStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBio(String str) {
        this.bio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBioStatus(Integer num) {
        this.bioStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanSwitchAccount(boolean z) {
        this.canSwitchAccount = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnPetname(String str) {
        this.enPetname = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnPetnameStatus(Integer num) {
        this.enPetnameStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnSignStatus(Integer num) {
        this.enSignStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGroupStatus(String str) {
        this.groupStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIdentifyId(String str) {
        this.identifyId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxAvatarUpdateQuota(Integer num) {
        this.maxAvatarUpdateQuota = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxEnPetnameUpdateQuota(Integer num) {
        this.maxEnPetnameUpdateQuota = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxPetnameUpdateQuota(Integer num) {
        this.maxPetnameUpdateQuota = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginalAvatar(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.originalAvatar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPetname(String str) {
        this.petname = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPetnameSearchStatus(String str) {
        this.petnameSearchStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPetnameStatus(Integer num) {
        this.petnameStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPhoneSearchStatus(String str) {
        this.phoneSearchStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQrSearchStatus(String str) {
        this.qrSearchStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRcToken(String str) {
        this.rcToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRemainingAvatarUpdateQuota(Integer num) {
        this.remainingAvatarUpdateQuota = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRemainingEnPetnameUpdateQuota(Integer num) {
        this.remainingEnPetnameUpdateQuota = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRemainingPetnameUpdateQuota(Integer num) {
        this.remainingPetnameUpdateQuota = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSign(String str) {
        this.sign = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignStatus(Integer num) {
        this.signStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimestamp(String str) {
        this.timestamp = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserLevel(int i) {
        this.userLevel = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserLevelName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userLevelName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVipAvatarFrameToggle(Boolean bool) {
        this.vipAvatarFrameToggle = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserProfile(identifyId=" + this.identifyId + ", avatar=" + this.avatar + ", avatarStatus=" + this.avatarStatus + ", petname=" + this.petname + ", petnameStatus=" + this.petnameStatus + ", approvedPetname=" + this.approvedPetname + ", rcToken=" + this.rcToken + ", sign=" + this.sign + ", signStatus=" + this.signStatus + ", enSignStatus=" + this.enSignStatus + ", phoneSearchStatus=" + this.phoneSearchStatus + ", qrSearchStatus=" + this.qrSearchStatus + ", petnameSearchStatus=" + this.petnameSearchStatus + ", groupStatus=" + this.groupStatus + ", timestamp=" + this.timestamp + ", remainingPetnameUpdateQuota=" + this.remainingPetnameUpdateQuota + ", remainingAvatarUpdateQuota=" + this.remainingAvatarUpdateQuota + ", maxAvatarUpdateQuota=" + this.maxAvatarUpdateQuota + ", maxPetnameUpdateQuota=" + this.maxPetnameUpdateQuota + ", enPetname=" + this.enPetname + ", enPetnameStatus=" + this.enPetnameStatus + ", remainingEnPetnameUpdateQuota=" + this.remainingEnPetnameUpdateQuota + ", maxEnPetnameUpdateQuota=" + this.maxEnPetnameUpdateQuota + ", userLevel=" + this.userLevel + ", isDefaultGeneratedNickname=" + this.isDefaultGeneratedNickname + ", avatarInfo=" + this.avatarInfo + ", canSwitchAccount=" + this.canSwitchAccount + ", userLevelName=" + this.userLevelName + ", vipAvatarFrameToggle=" + this.vipAvatarFrameToggle + ", originalAvatar=" + this.originalAvatar + ", bio=" + this.bio + ", bioStatus=" + this.bioStatus + ", backgroundUrl=" + this.backgroundUrl + ", backgroundUrlStatus=" + this.backgroundUrlStatus + ")";
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
        Integer num2 = this.petnameStatus;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.approvedPetname);
        parcel.writeString(this.rcToken);
        parcel.writeString(this.sign);
        Integer num3 = this.signStatus;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.enSignStatus;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.phoneSearchStatus);
        parcel.writeString(this.qrSearchStatus);
        parcel.writeString(this.petnameSearchStatus);
        parcel.writeString(this.groupStatus);
        parcel.writeString(this.timestamp);
        Integer num5 = this.remainingPetnameUpdateQuota;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Integer num6 = this.remainingAvatarUpdateQuota;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        Integer num7 = this.maxAvatarUpdateQuota;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num7.intValue());
        }
        Integer num8 = this.maxPetnameUpdateQuota;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num8.intValue());
        }
        parcel.writeString(this.enPetname);
        Integer num9 = this.enPetnameStatus;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num9.intValue());
        }
        Integer num10 = this.remainingEnPetnameUpdateQuota;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num10.intValue());
        }
        Integer num11 = this.maxEnPetnameUpdateQuota;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num11.intValue());
        }
        parcel.writeInt(this.userLevel);
        parcel.writeInt(this.isDefaultGeneratedNickname ? 1 : 0);
        this.avatarInfo.writeToParcel(parcel, i);
        parcel.writeInt(this.canSwitchAccount ? 1 : 0);
        parcel.writeString(this.userLevelName);
        Boolean bool = this.vipAvatarFrameToggle;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.originalAvatar);
        parcel.writeString(this.bio);
        Integer num12 = this.bioStatus;
        if (num12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num12.intValue());
        }
        parcel.writeString(this.backgroundUrl);
        Integer num13 = this.backgroundUrlStatus;
        if (num13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num13.intValue());
        }
    }

    public /* synthetic */ UserProfile(int i, int i2, String str, String str2, Integer num, String str3, Integer num2, String str4, String str5, String str6, Integer num3, Integer num4, String str7, String str8, String str9, String str10, String str11, Integer num5, Integer num6, Integer num7, Integer num8, String str12, Integer num9, Integer num10, Integer num11, int i3, boolean z, AvatarInfo avatarInfo, boolean z2, String str13, Boolean bool, String str14, String str15, Integer num12, String str16, Integer num13, SerializationConstructorMarker serializationConstructorMarker) {
        AvatarInfo avatarInfo2;
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
        String str17 = null;
        byte b = 0;
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
            this.petnameStatus = null;
        } else {
            this.petnameStatus = num2;
        }
        if ((i & 32) == 0) {
            this.approvedPetname = "";
        } else {
            this.approvedPetname = str4;
        }
        if ((i & 64) == 0) {
            this.rcToken = "";
        } else {
            this.rcToken = str5;
        }
        if ((i & 128) == 0) {
            this.sign = "";
        } else {
            this.sign = str6;
        }
        if ((i & 256) == 0) {
            this.signStatus = null;
        } else {
            this.signStatus = num3;
        }
        if ((i & 512) == 0) {
            this.enSignStatus = null;
        } else {
            this.enSignStatus = num4;
        }
        if ((i & 1024) == 0) {
            this.phoneSearchStatus = "";
        } else {
            this.phoneSearchStatus = str7;
        }
        if ((i & 2048) == 0) {
            this.qrSearchStatus = "";
        } else {
            this.qrSearchStatus = str8;
        }
        if ((i & 4096) == 0) {
            this.petnameSearchStatus = "";
        } else {
            this.petnameSearchStatus = str9;
        }
        if ((i & 8192) == 0) {
            this.groupStatus = "";
        } else {
            this.groupStatus = str10;
        }
        if ((i & 16384) == 0) {
            this.timestamp = "";
        } else {
            this.timestamp = str11;
        }
        if ((32768 & i) == 0) {
            this.remainingPetnameUpdateQuota = null;
        } else {
            this.remainingPetnameUpdateQuota = num5;
        }
        if ((65536 & i) == 0) {
            this.remainingAvatarUpdateQuota = null;
        } else {
            this.remainingAvatarUpdateQuota = num6;
        }
        if ((131072 & i) == 0) {
            this.maxAvatarUpdateQuota = null;
        } else {
            this.maxAvatarUpdateQuota = num7;
        }
        if ((262144 & i) == 0) {
            this.maxPetnameUpdateQuota = null;
        } else {
            this.maxPetnameUpdateQuota = num8;
        }
        if ((524288 & i) == 0) {
            this.enPetname = null;
        } else {
            this.enPetname = str12;
        }
        if ((1048576 & i) == 0) {
            this.enPetnameStatus = null;
        } else {
            this.enPetnameStatus = num9;
        }
        if ((2097152 & i) == 0) {
            this.remainingEnPetnameUpdateQuota = null;
        } else {
            this.remainingEnPetnameUpdateQuota = num10;
        }
        if ((4194304 & i) == 0) {
            this.maxEnPetnameUpdateQuota = null;
        } else {
            this.maxEnPetnameUpdateQuota = num11;
        }
        if ((8388608 & i) == 0) {
            this.userLevel = 0;
        } else {
            this.userLevel = i3;
        }
        if ((16777216 & i) == 0) {
            this.isDefaultGeneratedNickname = false;
        } else {
            this.isDefaultGeneratedNickname = z;
        }
        if ((33554432 & i) == 0) {
            avatarInfo2 = new AvatarInfo(str17, z, 3, (DefaultConstructorMarker) (b == true ? 1 : 0));
        } else {
            avatarInfo2 = avatarInfo;
        }
        this.avatarInfo = avatarInfo2;
        this.canSwitchAccount = (67108864 & i) != 0 ? z2 : false;
        if ((134217728 & i) == 0) {
            this.userLevelName = "";
        } else {
            this.userLevelName = str13;
        }
        if ((268435456 & i) == 0) {
            this.vipAvatarFrameToggle = null;
        } else {
            this.vipAvatarFrameToggle = bool;
        }
        if ((536870912 & i) == 0) {
            this.originalAvatar = "";
        } else {
            this.originalAvatar = str14;
        }
        if ((1073741824 & i) == 0) {
            this.bio = null;
        } else {
            this.bio = str15;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.bioStatus = null;
        } else {
            this.bioStatus = num12;
        }
        if ((i2 & 1) == 0) {
            this.backgroundUrl = null;
        } else {
            this.backgroundUrl = str16;
        }
        if ((i2 & 2) == 0) {
            this.backgroundUrlStatus = null;
        } else {
            this.backgroundUrlStatus = num13;
        }
    }

    public static final /* synthetic */ void write$Self$OKUser_okuser(UserProfile userProfile, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        boolean z = false;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) userProfile.identifyId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, userProfile.identifyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) userProfile.avatar, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, userProfile.avatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || userProfile.avatarStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, userProfile.avatarStatus);
        }
        int i = 3;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) userProfile.petname, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, userProfile.petname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || userProfile.petnameStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, userProfile.petnameStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) userProfile.approvedPetname, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, userProfile.approvedPetname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) userProfile.rcToken, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, userProfile.rcToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) userProfile.sign, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, userProfile.sign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || userProfile.signStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, userProfile.signStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || userProfile.enSignStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, userProfile.enSignStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) userProfile.phoneSearchStatus, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, userProfile.phoneSearchStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) userProfile.qrSearchStatus, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, userProfile.qrSearchStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) userProfile.petnameSearchStatus, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, userProfile.petnameSearchStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) userProfile.groupStatus, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, userProfile.groupStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) userProfile.timestamp, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, userProfile.timestamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || userProfile.remainingPetnameUpdateQuota != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, IntSerializer.INSTANCE, userProfile.remainingPetnameUpdateQuota);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || userProfile.remainingAvatarUpdateQuota != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, IntSerializer.INSTANCE, userProfile.remainingAvatarUpdateQuota);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || userProfile.maxAvatarUpdateQuota != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.INSTANCE, userProfile.maxAvatarUpdateQuota);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || userProfile.maxPetnameUpdateQuota != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, IntSerializer.INSTANCE, userProfile.maxPetnameUpdateQuota);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || userProfile.enPetname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, userProfile.enPetname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || userProfile.enPetnameStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, IntSerializer.INSTANCE, userProfile.enPetnameStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || userProfile.remainingEnPetnameUpdateQuota != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, IntSerializer.INSTANCE, userProfile.remainingEnPetnameUpdateQuota);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || userProfile.maxEnPetnameUpdateQuota != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, IntSerializer.INSTANCE, userProfile.maxEnPetnameUpdateQuota);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || userProfile.userLevel != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 23, userProfile.userLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || userProfile.isDefaultGeneratedNickname) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 24, userProfile.isDefaultGeneratedNickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd(userProfile.avatarInfo, new AvatarInfo((String) null, z, i, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 25, UserProfile$AvatarInfo$$serializer.INSTANCE, userProfile.avatarInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || userProfile.canSwitchAccount) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 26, userProfile.canSwitchAccount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) userProfile.userLevelName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, userProfile.userLevelName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || userProfile.vipAvatarFrameToggle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, BooleanSerializer.INSTANCE, userProfile.vipAvatarFrameToggle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) userProfile.originalAvatar, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, userProfile.originalAvatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || userProfile.bio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, userProfile.bio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || userProfile.bioStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, IntSerializer.INSTANCE, userProfile.bioStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || userProfile.backgroundUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, StringSerializer.INSTANCE, userProfile.backgroundUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) && userProfile.backgroundUrlStatus == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, IntSerializer.INSTANCE, userProfile.backgroundUrlStatus);
    }

    public UserProfile(String str, String str2, Integer num, String str3, Integer num2, String str4, String str5, String str6, Integer num3, Integer num4, String str7, String str8, String str9, String str10, String str11, Integer num5, Integer num6, Integer num7, Integer num8, String str12, Integer num9, Integer num10, Integer num11, int i, boolean z, @NotNull AvatarInfo avatarInfo, boolean z2, @NotNull String str13, Boolean bool, @NotNull String str14, String str15, Integer num12, String str16, Integer num13) {
        Intrinsics.checkNotNullParameter(avatarInfo, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        this.identifyId = str;
        this.avatar = str2;
        this.avatarStatus = num;
        this.petname = str3;
        this.petnameStatus = num2;
        this.approvedPetname = str4;
        this.rcToken = str5;
        this.sign = str6;
        this.signStatus = num3;
        this.enSignStatus = num4;
        this.phoneSearchStatus = str7;
        this.qrSearchStatus = str8;
        this.petnameSearchStatus = str9;
        this.groupStatus = str10;
        this.timestamp = str11;
        this.remainingPetnameUpdateQuota = num5;
        this.remainingAvatarUpdateQuota = num6;
        this.maxAvatarUpdateQuota = num7;
        this.maxPetnameUpdateQuota = num8;
        this.enPetname = str12;
        this.enPetnameStatus = num9;
        this.remainingEnPetnameUpdateQuota = num10;
        this.maxEnPetnameUpdateQuota = num11;
        this.userLevel = i;
        this.isDefaultGeneratedNickname = z;
        this.avatarInfo = avatarInfo;
        this.canSwitchAccount = z2;
        this.userLevelName = str13;
        this.vipAvatarFrameToggle = bool;
        this.originalAvatar = str14;
        this.bio = str15;
        this.bioStatus = num12;
        this.backgroundUrl = str16;
        this.backgroundUrlStatus = num13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r30v4 */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r32v4 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v4 */
    /* JADX WARN: Type inference failed for: r65v1, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r67v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r69v1, types: [java.lang.String] */
    public /* synthetic */ UserProfile(String str, String str2, Integer num, String str3, Integer num2, String str4, String str5, String str6, Integer num3, Integer num4, String str7, String str8, String str9, String str10, String str11, Integer num5, Integer num6, Integer num7, Integer num8, String str12, Integer num9, Integer num10, Integer num11, int i, boolean z, AvatarInfo avatarInfo, boolean z2, String str13, Boolean bool, String str14, String str15, Integer num12, String str16, Integer num13, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str17;
        String str18;
        String str19;
        Integer num14;
        AvatarInfo avatarInfo2;
        String str20 = (i2 & 1) != 0 ? "" : str;
        String str21 = (i2 & 2) != 0 ? "" : str2;
        Integer num15 = (i2 & 4) != 0 ? null : num;
        String str22 = (i2 & 8) != 0 ? "" : str3;
        Integer num16 = (i2 & 16) != 0 ? null : num2;
        String str23 = (i2 & 32) != 0 ? "" : str4;
        String str24 = (i2 & 64) != 0 ? "" : str5;
        String str25 = (i2 & 128) != 0 ? "" : str6;
        Integer num17 = (i2 & 256) != 0 ? null : num3;
        Integer num18 = (i2 & 512) != 0 ? null : num4;
        String str26 = (i2 & 1024) != 0 ? "" : str7;
        String str27 = (i2 & 2048) != 0 ? "" : str8;
        String str28 = (i2 & 4096) != 0 ? "" : str9;
        String str29 = (i2 & 8192) != 0 ? "" : str10;
        String str30 = (i2 & 16384) != 0 ? "" : str11;
        Integer num19 = (i2 & 32768) != 0 ? null : num5;
        Integer num20 = (i2 & 65536) != 0 ? null : num6;
        Integer num21 = (i2 & 131072) != 0 ? null : num7;
        Integer num22 = (i2 & 262144) != 0 ? null : num8;
        String str31 = (i2 & 524288) != 0 ? null : str12;
        Integer num23 = (i2 & 1048576) != 0 ? null : num9;
        Integer num24 = (i2 & 2097152) != 0 ? null : num10;
        Integer num25 = (i2 & 4194304) != 0 ? null : num11;
        String str32 = str30;
        int i4 = (i2 & 8388608) != 0 ? 0 : i;
        boolean z3 = (i2 & 16777216) != 0 ? false : z;
        if ((i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0) {
            str17 = str29;
            str19 = str28;
            str18 = str27;
            num14 = null;
            avatarInfo2 = new AvatarInfo((String) (0 == true ? 1 : 0), z, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        } else {
            str17 = str29;
            str18 = str27;
            str19 = str28;
            num14 = null;
            avatarInfo2 = avatarInfo;
        }
        this(str20, str21, num15, str22, num16, str23, str24, str25, num17, num18, str26, str18, str19, str17, str32, num19, num20, num21, num22, str31, num23, num24, num25, i4, z3, avatarInfo2, (67108864 & i2) == 0 ? z2 : false, (134217728 & i2) != 0 ? "" : str13, (i2 & 268435456) != 0 ? num14 : bool, (i2 & 536870912) != 0 ? "" : str14, (i2 & 1073741824) != 0 ? num14 : str15, (i2 & Integer.MIN_VALUE) != 0 ? num14 : num12, (i3 & 1) != 0 ? num14 : str16, (i3 & 2) == 0 ? num13 : num14);
    }

    public final boolean isBioUnderReview() {
        return CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends Integer>) ((Iterable<? extends Object>) yDY.gEmmrt(1, 2)), this.bioStatus);
    }

    @Serializable
    public static final class AvatarInfo implements Parcelable {
        public static final int $stable = 0;
        private final String avatar;
        private final boolean supportUploadedAvatar;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<AvatarInfo> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<AvatarInfo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AvatarInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new AvatarInfo(parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AvatarInfo[] newArray(int i) {
                return new AvatarInfo[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AvatarInfo() {
            this((String) null, false, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AvatarInfo copy$default(AvatarInfo avatarInfo, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = avatarInfo.avatar;
            }
            if ((i & 2) != 0) {
                z = avatarInfo.supportUploadedAvatar;
            }
            return avatarInfo.copy(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.avatar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component2() {
            return this.supportUploadedAvatar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AvatarInfo copy(@NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            return new AvatarInfo(str, z);
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
            if (!(obj instanceof AvatarInfo)) {
                return false;
            }
            AvatarInfo avatarInfo = (AvatarInfo) obj;
            return Intrinsics.EZpvd((Object) this.avatar, (Object) avatarInfo.avatar) && this.supportUploadedAvatar == avatarInfo.supportUploadedAvatar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAvatar() {
            return this.avatar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getSupportUploadedAvatar() {
            return this.supportUploadedAvatar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.avatar.hashCode() * 31) + Boolean.hashCode(this.supportUploadedAvatar);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AvatarInfo(avatar=" + this.avatar + ", supportUploadedAvatar=" + this.supportUploadedAvatar + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.avatar);
            parcel.writeInt(this.supportUploadedAvatar ? 1 : 0);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okuser.data.UserProfile.AvatarInfo.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<AvatarInfo> serializer() {
                return UserProfile$AvatarInfo$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ AvatarInfo(int i, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            this.avatar = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.supportUploadedAvatar = false;
            } else {
                this.supportUploadedAvatar = z;
            }
        }

        public static final /* synthetic */ void write$Self$OKUser_okuser(AvatarInfo avatarInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) avatarInfo.avatar, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, avatarInfo.avatar);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || avatarInfo.supportUploadedAvatar) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 1, avatarInfo.supportUploadedAvatar);
            }
        }

        public AvatarInfo(@NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            this.avatar = str;
            this.supportUploadedAvatar = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:63) call: com.okinc.okuser.data.UserProfile.AvatarInfo.<init>(java.lang.String, boolean):void type: THIS */
        public /* synthetic */ AvatarInfo(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
        }
    }

    public final boolean isBackgroundUnderReview() {
        return CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends Integer>) ((Iterable<? extends Object>) yDY.gEmmrt(1, 2)), this.backgroundUrlStatus);
    }

    @NamedCompanion
    public static final class ReviewStatus {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okuser.data.UserProfile.ReviewStatus.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ReviewStatus(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ReviewStatus() {
        }

        public final KSerializer<UserProfile> serializer() {
            return UserProfile$$serializer.INSTANCE;
        }
    }
}
