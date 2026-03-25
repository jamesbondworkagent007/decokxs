package com.okinc.okimcore.model.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.okimcore.model.im.RelationSourceType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class RelationInfo implements Parcelable {
    private final Boolean allowAddContact;
    private final Boolean allowBlockUser;
    private final Boolean allowFile;
    private final Boolean allowPlanetProfile;
    private final Boolean allowRemoveGroupMember;
    private final Boolean allowVoice;
    private final String avatar;
    private final String contactsId;
    private final String customNote;
    private String displayAlphabetText;
    private final String enNickName;
    private final String hash;
    private final Boolean isAllowPay;
    private final Boolean isAllowSendMessage;
    private final Boolean isAllowSingleChatInGroup;
    private final boolean isBlackList;
    private final boolean isBothFriend;
    private final boolean isCanChat;
    private final boolean isCurrentUser;
    private final boolean isFriend;
    private final boolean isNoDisturb;
    private final boolean isOpenKOL;
    private final boolean isTop;
    private final String kolUniqueName;
    private final String nickName;
    private OfficialTagInfo officialTags;
    private final String orbitBackgroundImage;
    private final Integer orbitStatus;
    private final String phoneName;
    private final String phoneRawNumber;
    private final RelationSourceType relationSourceType;
    private final String remarkName;
    private final Boolean showKycBanner;
    private final Boolean showUnknownContactBanner;
    private final Boolean showVipPerformanceDetails;
    private final Boolean showVoiceCall;
    private final String sign;
    private final long timestamp;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RelationInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, RelationSourceType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<RelationInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RelationInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            Boolean boolValueOf7;
            Boolean boolValueOf8;
            Boolean boolValueOf9;
            Boolean boolValueOf10;
            Boolean boolValueOf11;
            Boolean boolValueOf12;
            Boolean boolValueOf13;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            boolean z6 = parcel.readInt() != 0;
            boolean z7 = parcel.readInt() != 0;
            String string6 = parcel.readString();
            OfficialTagInfo officialTagInfoCreateFromParcel = parcel.readInt() == 0 ? null : OfficialTagInfo.CREATOR.createFromParcel(parcel);
            long j = parcel.readLong();
            boolean z8 = parcel.readInt() != 0;
            String string7 = parcel.readString();
            String string8 = parcel.readString();
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
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            RelationSourceType relationSourceTypeValueOf = parcel.readInt() == 0 ? null : RelationSourceType.valueOf(parcel.readString());
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf7 = null;
            } else {
                boolValueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf8 = null;
            } else {
                boolValueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf9 = null;
            } else {
                boolValueOf9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string12 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf10 = null;
            } else {
                boolValueOf10 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf11 = null;
            } else {
                boolValueOf11 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf12 = null;
            } else {
                boolValueOf12 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string13 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf13 = null;
            } else {
                boolValueOf13 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RelationInfo(string, string2, string3, string4, string5, z, z2, z3, z4, z5, z6, z7, string6, officialTagInfoCreateFromParcel, j, z8, string7, string8, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, relationSourceTypeValueOf, string9, string10, string11, boolValueOf5, boolValueOf6, boolValueOf7, boolValueOf8, boolValueOf9, string12, numValueOf, boolValueOf10, boolValueOf11, boolValueOf12, string13, boolValueOf13);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RelationInfo[] newArray(int i) {
            return new RelationInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RelationInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, false, false, false, false, false, false, false, (String) null, (OfficialTagInfo) null, 0L, false, (String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (RelationSourceType) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (Boolean) null, -1, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.contactsId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.isBothFriend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.isCanChat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.isCurrentUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.displayAlphabetText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo component14() {
        return this.officialTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component15() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.isOpenKOL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.kolUniqueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.enNickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component19() {
        return this.allowAddContact;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component20() {
        return this.isAllowSendMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component21() {
        return this.showVoiceCall;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component22() {
        return this.showKycBanner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelationSourceType component23() {
        return this.relationSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.hash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.phoneName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.phoneRawNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component27() {
        return this.isAllowSingleChatInGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component28() {
        return this.showUnknownContactBanner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component29() {
        return this.allowVoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component30() {
        return this.allowFile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component31() {
        return this.allowPlanetProfile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.orbitBackgroundImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component33() {
        return this.orbitStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component34() {
        return this.allowBlockUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component35() {
        return this.showVipPerformanceDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component36() {
        return this.allowRemoveGroupMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.customNote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component38() {
        return this.isAllowPay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.remarkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.sign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isBlackList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isNoDisturb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.isFriend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelationInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, @NotNull String str6, OfficialTagInfo officialTagInfo, long j, boolean z8, String str7, String str8, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, RelationSourceType relationSourceType, String str9, String str10, String str11, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, String str12, Integer num, Boolean bool10, Boolean bool11, Boolean bool12, String str13, Boolean bool13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new RelationInfo(str, str2, str3, str4, str5, z, z2, z3, z4, z5, z6, z7, str6, officialTagInfo, j, z8, str7, str8, bool, bool2, bool3, bool4, relationSourceType, str9, str10, str11, bool5, bool6, bool7, bool8, bool9, str12, num, bool10, bool11, bool12, str13, bool13);
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
        if (!(obj instanceof RelationInfo)) {
            return false;
        }
        RelationInfo relationInfo = (RelationInfo) obj;
        return Intrinsics.EZpvd((Object) this.contactsId, (Object) relationInfo.contactsId) && Intrinsics.EZpvd((Object) this.avatar, (Object) relationInfo.avatar) && Intrinsics.EZpvd((Object) this.nickName, (Object) relationInfo.nickName) && Intrinsics.EZpvd((Object) this.remarkName, (Object) relationInfo.remarkName) && Intrinsics.EZpvd((Object) this.sign, (Object) relationInfo.sign) && this.isBlackList == relationInfo.isBlackList && this.isNoDisturb == relationInfo.isNoDisturb && this.isTop == relationInfo.isTop && this.isFriend == relationInfo.isFriend && this.isBothFriend == relationInfo.isBothFriend && this.isCanChat == relationInfo.isCanChat && this.isCurrentUser == relationInfo.isCurrentUser && Intrinsics.EZpvd((Object) this.displayAlphabetText, (Object) relationInfo.displayAlphabetText) && Intrinsics.EZpvd(this.officialTags, relationInfo.officialTags) && this.timestamp == relationInfo.timestamp && this.isOpenKOL == relationInfo.isOpenKOL && Intrinsics.EZpvd((Object) this.kolUniqueName, (Object) relationInfo.kolUniqueName) && Intrinsics.EZpvd((Object) this.enNickName, (Object) relationInfo.enNickName) && Intrinsics.EZpvd(this.allowAddContact, relationInfo.allowAddContact) && Intrinsics.EZpvd(this.isAllowSendMessage, relationInfo.isAllowSendMessage) && Intrinsics.EZpvd(this.showVoiceCall, relationInfo.showVoiceCall) && Intrinsics.EZpvd(this.showKycBanner, relationInfo.showKycBanner) && this.relationSourceType == relationInfo.relationSourceType && Intrinsics.EZpvd((Object) this.hash, (Object) relationInfo.hash) && Intrinsics.EZpvd((Object) this.phoneName, (Object) relationInfo.phoneName) && Intrinsics.EZpvd((Object) this.phoneRawNumber, (Object) relationInfo.phoneRawNumber) && Intrinsics.EZpvd(this.isAllowSingleChatInGroup, relationInfo.isAllowSingleChatInGroup) && Intrinsics.EZpvd(this.showUnknownContactBanner, relationInfo.showUnknownContactBanner) && Intrinsics.EZpvd(this.allowVoice, relationInfo.allowVoice) && Intrinsics.EZpvd(this.allowFile, relationInfo.allowFile) && Intrinsics.EZpvd(this.allowPlanetProfile, relationInfo.allowPlanetProfile) && Intrinsics.EZpvd((Object) this.orbitBackgroundImage, (Object) relationInfo.orbitBackgroundImage) && Intrinsics.EZpvd(this.orbitStatus, relationInfo.orbitStatus) && Intrinsics.EZpvd(this.allowBlockUser, relationInfo.allowBlockUser) && Intrinsics.EZpvd(this.showVipPerformanceDetails, relationInfo.showVipPerformanceDetails) && Intrinsics.EZpvd(this.allowRemoveGroupMember, relationInfo.allowRemoveGroupMember) && Intrinsics.EZpvd((Object) this.customNote, (Object) relationInfo.customNote) && Intrinsics.EZpvd(this.isAllowPay, relationInfo.isAllowPay);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowAddContact() {
        return this.allowAddContact;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowBlockUser() {
        return this.allowBlockUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowFile() {
        return this.allowFile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowPlanetProfile() {
        return this.allowPlanetProfile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowRemoveGroupMember() {
        return this.allowRemoveGroupMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowVoice() {
        return this.allowVoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContactsId() {
        return this.contactsId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomNote() {
        return this.customNote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayAlphabetText() {
        return this.displayAlphabetText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnNickName() {
        return this.enNickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHash() {
        return this.hash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKolUniqueName() {
        return this.kolUniqueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo getOfficialTags() {
        return this.officialTags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrbitBackgroundImage() {
        return this.orbitBackgroundImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOrbitStatus() {
        return this.orbitStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhoneName() {
        return this.phoneName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhoneRawNumber() {
        return this.phoneRawNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelationSourceType getRelationSourceType() {
        return this.relationSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemarkName() {
        return this.remarkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowKycBanner() {
        return this.showKycBanner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowUnknownContactBanner() {
        return this.showUnknownContactBanner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowVipPerformanceDetails() {
        return this.showVipPerformanceDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowVoiceCall() {
        return this.showVoiceCall;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSign() {
        return this.sign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.contactsId.hashCode();
        int iHashCode2 = this.avatar.hashCode();
        int iHashCode3 = this.nickName.hashCode();
        int iHashCode4 = this.remarkName.hashCode();
        int iHashCode5 = this.sign.hashCode();
        int iHashCode6 = Boolean.hashCode(this.isBlackList);
        int iHashCode7 = Boolean.hashCode(this.isNoDisturb);
        int iHashCode8 = Boolean.hashCode(this.isTop);
        int iHashCode9 = Boolean.hashCode(this.isFriend);
        int iHashCode10 = Boolean.hashCode(this.isBothFriend);
        int iHashCode11 = Boolean.hashCode(this.isCanChat);
        int iHashCode12 = Boolean.hashCode(this.isCurrentUser);
        int iHashCode13 = this.displayAlphabetText.hashCode();
        OfficialTagInfo officialTagInfo = this.officialTags;
        int iHashCode14 = officialTagInfo == null ? 0 : officialTagInfo.hashCode();
        int iHashCode15 = Long.hashCode(this.timestamp);
        int iHashCode16 = Boolean.hashCode(this.isOpenKOL);
        String str = this.kolUniqueName;
        int iHashCode17 = str == null ? 0 : str.hashCode();
        String str2 = this.enNickName;
        int iHashCode18 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.allowAddContact;
        int iHashCode19 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.isAllowSendMessage;
        int iHashCode20 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.showVoiceCall;
        int iHashCode21 = bool3 == null ? 0 : bool3.hashCode();
        Boolean bool4 = this.showKycBanner;
        int iHashCode22 = bool4 == null ? 0 : bool4.hashCode();
        RelationSourceType relationSourceType = this.relationSourceType;
        int iHashCode23 = relationSourceType == null ? 0 : relationSourceType.hashCode();
        String str3 = this.hash;
        int iHashCode24 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.phoneName;
        int iHashCode25 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.phoneRawNumber;
        int iHashCode26 = str5 == null ? 0 : str5.hashCode();
        Boolean bool5 = this.isAllowSingleChatInGroup;
        int iHashCode27 = bool5 == null ? 0 : bool5.hashCode();
        Boolean bool6 = this.showUnknownContactBanner;
        int iHashCode28 = bool6 == null ? 0 : bool6.hashCode();
        Boolean bool7 = this.allowVoice;
        int iHashCode29 = bool7 == null ? 0 : bool7.hashCode();
        Boolean bool8 = this.allowFile;
        int iHashCode30 = bool8 == null ? 0 : bool8.hashCode();
        Boolean bool9 = this.allowPlanetProfile;
        int iHashCode31 = bool9 == null ? 0 : bool9.hashCode();
        String str6 = this.orbitBackgroundImage;
        int iHashCode32 = str6 == null ? 0 : str6.hashCode();
        Integer num = this.orbitStatus;
        int iHashCode33 = num == null ? 0 : num.hashCode();
        Boolean bool10 = this.allowBlockUser;
        int iHashCode34 = bool10 == null ? 0 : bool10.hashCode();
        Boolean bool11 = this.showVipPerformanceDetails;
        int iHashCode35 = bool11 == null ? 0 : bool11.hashCode();
        Boolean bool12 = this.allowRemoveGroupMember;
        int iHashCode36 = bool12 == null ? 0 : bool12.hashCode();
        String str7 = this.customNote;
        int iHashCode37 = str7 == null ? 0 : str7.hashCode();
        Boolean bool13 = this.isAllowPay;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + (bool13 == null ? 0 : bool13.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isAllowPay() {
        return this.isAllowPay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isAllowSendMessage() {
        return this.isAllowSendMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isAllowSingleChatInGroup() {
        return this.isAllowSingleChatInGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBlackList() {
        return this.isBlackList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBothFriend() {
        return this.isBothFriend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCanChat() {
        return this.isCanChat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCurrentUser() {
        return this.isCurrentUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFriend() {
        return this.isFriend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNoDisturb() {
        return this.isNoDisturb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isOpenKOL() {
        return this.isOpenKOL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTop() {
        return this.isTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayAlphabetText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.displayAlphabetText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOfficialTags(OfficialTagInfo officialTagInfo) {
        this.officialTags = officialTagInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RelationInfo(contactsId=" + this.contactsId + ", avatar=" + this.avatar + ", nickName=" + this.nickName + ", remarkName=" + this.remarkName + ", sign=" + this.sign + ", isBlackList=" + this.isBlackList + ", isNoDisturb=" + this.isNoDisturb + ", isTop=" + this.isTop + ", isFriend=" + this.isFriend + ", isBothFriend=" + this.isBothFriend + ", isCanChat=" + this.isCanChat + ", isCurrentUser=" + this.isCurrentUser + ", displayAlphabetText=" + this.displayAlphabetText + ", officialTags=" + this.officialTags + ", timestamp=" + this.timestamp + ", isOpenKOL=" + this.isOpenKOL + ", kolUniqueName=" + this.kolUniqueName + ", enNickName=" + this.enNickName + ", allowAddContact=" + this.allowAddContact + ", isAllowSendMessage=" + this.isAllowSendMessage + ", showVoiceCall=" + this.showVoiceCall + ", showKycBanner=" + this.showKycBanner + ", relationSourceType=" + this.relationSourceType + ", hash=" + this.hash + ", phoneName=" + this.phoneName + ", phoneRawNumber=" + this.phoneRawNumber + ", isAllowSingleChatInGroup=" + this.isAllowSingleChatInGroup + ", showUnknownContactBanner=" + this.showUnknownContactBanner + ", allowVoice=" + this.allowVoice + ", allowFile=" + this.allowFile + ", allowPlanetProfile=" + this.allowPlanetProfile + ", orbitBackgroundImage=" + this.orbitBackgroundImage + ", orbitStatus=" + this.orbitStatus + ", allowBlockUser=" + this.allowBlockUser + ", showVipPerformanceDetails=" + this.showVipPerformanceDetails + ", allowRemoveGroupMember=" + this.allowRemoveGroupMember + ", customNote=" + this.customNote + ", isAllowPay=" + this.isAllowPay + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.contactsId);
        parcel.writeString(this.avatar);
        parcel.writeString(this.nickName);
        parcel.writeString(this.remarkName);
        parcel.writeString(this.sign);
        parcel.writeInt(this.isBlackList ? 1 : 0);
        parcel.writeInt(this.isNoDisturb ? 1 : 0);
        parcel.writeInt(this.isTop ? 1 : 0);
        parcel.writeInt(this.isFriend ? 1 : 0);
        parcel.writeInt(this.isBothFriend ? 1 : 0);
        parcel.writeInt(this.isCanChat ? 1 : 0);
        parcel.writeInt(this.isCurrentUser ? 1 : 0);
        parcel.writeString(this.displayAlphabetText);
        OfficialTagInfo officialTagInfo = this.officialTags;
        if (officialTagInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            officialTagInfo.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.timestamp);
        parcel.writeInt(this.isOpenKOL ? 1 : 0);
        parcel.writeString(this.kolUniqueName);
        parcel.writeString(this.enNickName);
        Boolean bool = this.allowAddContact;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isAllowSendMessage;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.showVoiceCall;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.showKycBanner;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        RelationSourceType relationSourceType = this.relationSourceType;
        if (relationSourceType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(relationSourceType.name());
        }
        parcel.writeString(this.hash);
        parcel.writeString(this.phoneName);
        parcel.writeString(this.phoneRawNumber);
        Boolean bool5 = this.isAllowSingleChatInGroup;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Boolean bool6 = this.showUnknownContactBanner;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        Boolean bool7 = this.allowVoice;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool7.booleanValue() ? 1 : 0);
        }
        Boolean bool8 = this.allowFile;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool8.booleanValue() ? 1 : 0);
        }
        Boolean bool9 = this.allowPlanetProfile;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool9.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.orbitBackgroundImage);
        Integer num = this.orbitStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool10 = this.allowBlockUser;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool10.booleanValue() ? 1 : 0);
        }
        Boolean bool11 = this.showVipPerformanceDetails;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool11.booleanValue() ? 1 : 0);
        }
        Boolean bool12 = this.allowRemoveGroupMember;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool12.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.customNote);
        Boolean bool13 = this.isAllowPay;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool13.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.RelationInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RelationInfo> serializer() {
            return RelationInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RelationInfo(int i, int i2, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str6, OfficialTagInfo officialTagInfo, long j, boolean z8, String str7, String str8, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, RelationSourceType relationSourceType, String str9, String str10, String str11, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, String str12, Integer num, Boolean bool10, Boolean bool11, Boolean bool12, String str13, Boolean bool13, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.contactsId = "";
        } else {
            this.contactsId = str;
        }
        if ((i & 2) == 0) {
            this.avatar = "";
        } else {
            this.avatar = str2;
        }
        if ((i & 4) == 0) {
            this.nickName = "";
        } else {
            this.nickName = str3;
        }
        if ((i & 8) == 0) {
            this.remarkName = "";
        } else {
            this.remarkName = str4;
        }
        if ((i & 16) == 0) {
            this.sign = "";
        } else {
            this.sign = str5;
        }
        if ((i & 32) == 0) {
            this.isBlackList = false;
        } else {
            this.isBlackList = z;
        }
        if ((i & 64) == 0) {
            this.isNoDisturb = false;
        } else {
            this.isNoDisturb = z2;
        }
        if ((i & 128) == 0) {
            this.isTop = false;
        } else {
            this.isTop = z3;
        }
        if ((i & 256) == 0) {
            this.isFriend = false;
        } else {
            this.isFriend = z4;
        }
        if ((i & 512) == 0) {
            this.isBothFriend = false;
        } else {
            this.isBothFriend = z5;
        }
        if ((i & 1024) == 0) {
            this.isCanChat = false;
        } else {
            this.isCanChat = z6;
        }
        if ((i & 2048) == 0) {
            this.isCurrentUser = false;
        } else {
            this.isCurrentUser = z7;
        }
        if ((i & 4096) == 0) {
            this.displayAlphabetText = "";
        } else {
            this.displayAlphabetText = str6;
        }
        if ((i & 8192) == 0) {
            this.officialTags = null;
        } else {
            this.officialTags = officialTagInfo;
        }
        this.timestamp = (i & 16384) == 0 ? 0L : j;
        this.isOpenKOL = (32768 & i) != 0 ? z8 : false;
        if ((65536 & i) == 0) {
            this.kolUniqueName = null;
        } else {
            this.kolUniqueName = str7;
        }
        if ((131072 & i) == 0) {
            this.enNickName = null;
        } else {
            this.enNickName = str8;
        }
        if ((262144 & i) == 0) {
            this.allowAddContact = null;
        } else {
            this.allowAddContact = bool;
        }
        if ((524288 & i) == 0) {
            this.isAllowSendMessage = null;
        } else {
            this.isAllowSendMessage = bool2;
        }
        if ((1048576 & i) == 0) {
            this.showVoiceCall = null;
        } else {
            this.showVoiceCall = bool3;
        }
        if ((2097152 & i) == 0) {
            this.showKycBanner = null;
        } else {
            this.showKycBanner = bool4;
        }
        if ((4194304 & i) == 0) {
            this.relationSourceType = null;
        } else {
            this.relationSourceType = relationSourceType;
        }
        if ((8388608 & i) == 0) {
            this.hash = null;
        } else {
            this.hash = str9;
        }
        if ((16777216 & i) == 0) {
            this.phoneName = null;
        } else {
            this.phoneName = str10;
        }
        if ((33554432 & i) == 0) {
            this.phoneRawNumber = null;
        } else {
            this.phoneRawNumber = str11;
        }
        if ((67108864 & i) == 0) {
            this.isAllowSingleChatInGroup = null;
        } else {
            this.isAllowSingleChatInGroup = bool5;
        }
        if ((134217728 & i) == 0) {
            this.showUnknownContactBanner = null;
        } else {
            this.showUnknownContactBanner = bool6;
        }
        if ((268435456 & i) == 0) {
            this.allowVoice = null;
        } else {
            this.allowVoice = bool7;
        }
        if ((536870912 & i) == 0) {
            this.allowFile = null;
        } else {
            this.allowFile = bool8;
        }
        if ((1073741824 & i) == 0) {
            this.allowPlanetProfile = null;
        } else {
            this.allowPlanetProfile = bool9;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.orbitBackgroundImage = null;
        } else {
            this.orbitBackgroundImage = str12;
        }
        if ((i2 & 1) == 0) {
            this.orbitStatus = null;
        } else {
            this.orbitStatus = num;
        }
        if ((i2 & 2) == 0) {
            this.allowBlockUser = null;
        } else {
            this.allowBlockUser = bool10;
        }
        if ((i2 & 4) == 0) {
            this.showVipPerformanceDetails = null;
        } else {
            this.showVipPerformanceDetails = bool11;
        }
        if ((i2 & 8) == 0) {
            this.allowRemoveGroupMember = null;
        } else {
            this.allowRemoveGroupMember = bool12;
        }
        if ((i2 & 16) == 0) {
            this.customNote = null;
        } else {
            this.customNote = str13;
        }
        this.isAllowPay = (i2 & 32) == 0 ? Boolean.FALSE : bool13;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(RelationInfo relationInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) relationInfo.contactsId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, relationInfo.contactsId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) relationInfo.avatar, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, relationInfo.avatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) relationInfo.nickName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, relationInfo.nickName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) relationInfo.remarkName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, relationInfo.remarkName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) relationInfo.sign, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, relationInfo.sign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || relationInfo.isBlackList) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, relationInfo.isBlackList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || relationInfo.isNoDisturb) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, relationInfo.isNoDisturb);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || relationInfo.isTop) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, relationInfo.isTop);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || relationInfo.isFriend) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, relationInfo.isFriend);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || relationInfo.isBothFriend) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, relationInfo.isBothFriend);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || relationInfo.isCanChat) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 10, relationInfo.isCanChat);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || relationInfo.isCurrentUser) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, relationInfo.isCurrentUser);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) relationInfo.displayAlphabetText, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, relationInfo.displayAlphabetText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || relationInfo.officialTags != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, OfficialTagInfo$$serializer.INSTANCE, relationInfo.officialTags);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || relationInfo.timestamp != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 14, relationInfo.timestamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || relationInfo.isOpenKOL) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 15, relationInfo.isOpenKOL);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || relationInfo.kolUniqueName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, relationInfo.kolUniqueName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || relationInfo.enNickName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, relationInfo.enNickName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || relationInfo.allowAddContact != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, BooleanSerializer.INSTANCE, relationInfo.allowAddContact);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || relationInfo.isAllowSendMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, BooleanSerializer.INSTANCE, relationInfo.isAllowSendMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || relationInfo.showVoiceCall != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, BooleanSerializer.INSTANCE, relationInfo.showVoiceCall);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || relationInfo.showKycBanner != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, BooleanSerializer.INSTANCE, relationInfo.showKycBanner);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || relationInfo.relationSourceType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, kSerializerArr[22], relationInfo.relationSourceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || relationInfo.hash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, relationInfo.hash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || relationInfo.phoneName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, relationInfo.phoneName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || relationInfo.phoneRawNumber != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, relationInfo.phoneRawNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || relationInfo.isAllowSingleChatInGroup != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, BooleanSerializer.INSTANCE, relationInfo.isAllowSingleChatInGroup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || relationInfo.showUnknownContactBanner != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, BooleanSerializer.INSTANCE, relationInfo.showUnknownContactBanner);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || relationInfo.allowVoice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, BooleanSerializer.INSTANCE, relationInfo.allowVoice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || relationInfo.allowFile != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, BooleanSerializer.INSTANCE, relationInfo.allowFile);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || relationInfo.allowPlanetProfile != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, BooleanSerializer.INSTANCE, relationInfo.allowPlanetProfile);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || relationInfo.orbitBackgroundImage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, relationInfo.orbitBackgroundImage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || relationInfo.orbitStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, IntSerializer.INSTANCE, relationInfo.orbitStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || relationInfo.allowBlockUser != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, BooleanSerializer.INSTANCE, relationInfo.allowBlockUser);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || relationInfo.showVipPerformanceDetails != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, BooleanSerializer.INSTANCE, relationInfo.showVipPerformanceDetails);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || relationInfo.allowRemoveGroupMember != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, BooleanSerializer.INSTANCE, relationInfo.allowRemoveGroupMember);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || relationInfo.customNote != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, StringSerializer.INSTANCE, relationInfo.customNote);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) && Intrinsics.EZpvd(relationInfo.isAllowPay, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, BooleanSerializer.INSTANCE, relationInfo.isAllowPay);
    }

    public RelationInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, @NotNull String str6, OfficialTagInfo officialTagInfo, long j, boolean z8, String str7, String str8, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, RelationSourceType relationSourceType, String str9, String str10, String str11, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, String str12, Integer num, Boolean bool10, Boolean bool11, Boolean bool12, String str13, Boolean bool13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.contactsId = str;
        this.avatar = str2;
        this.nickName = str3;
        this.remarkName = str4;
        this.sign = str5;
        this.isBlackList = z;
        this.isNoDisturb = z2;
        this.isTop = z3;
        this.isFriend = z4;
        this.isBothFriend = z5;
        this.isCanChat = z6;
        this.isCurrentUser = z7;
        this.displayAlphabetText = str6;
        this.officialTags = officialTagInfo;
        this.timestamp = j;
        this.isOpenKOL = z8;
        this.kolUniqueName = str7;
        this.enNickName = str8;
        this.allowAddContact = bool;
        this.isAllowSendMessage = bool2;
        this.showVoiceCall = bool3;
        this.showKycBanner = bool4;
        this.relationSourceType = relationSourceType;
        this.hash = str9;
        this.phoneName = str10;
        this.phoneRawNumber = str11;
        this.isAllowSingleChatInGroup = bool5;
        this.showUnknownContactBanner = bool6;
        this.allowVoice = bool7;
        this.allowFile = bool8;
        this.allowPlanetProfile = bool9;
        this.orbitBackgroundImage = str12;
        this.orbitStatus = num;
        this.allowBlockUser = bool10;
        this.showVipPerformanceDetails = bool11;
        this.allowRemoveGroupMember = bool12;
        this.customNote = str13;
        this.isAllowPay = bool13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01bb: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r79v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r79v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r79v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r79v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r79v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r79v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r45v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0034: ARITH (r79v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r46v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003c: ARITH (r79v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r47v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0044: ARITH (r79v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r48v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004c: ARITH (r79v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r49v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0054: ARITH (r79v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r50v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005c: ARITH (r79v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r51v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r79v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r52v0 java.lang.String) : (""))
  (wrap:com.okinc.okimcore.model.remote.OfficialTagInfo:?: TERNARY null = ((wrap:int:0x006b: ARITH (r79v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.OfficialTagInfo) : (r53v0 com.okinc.okimcore.model.remote.OfficialTagInfo))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0076: ARITH (r79v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r54v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0082: ARITH (32768 int) & (r79v0 int) A[WRAPPED]) != (0 int)) ? false : (r56v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008b: ARITH (r79v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0096: ARITH (r79v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r58v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00a1: ARITH (r79v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r59v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00ac: ARITH (r79v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r60v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00b7: ARITH (r79v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r61v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00c2: ARITH (r79v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r62v0 java.lang.Boolean))
  (wrap:com.okinc.okimcore.model.im.RelationSourceType:?: TERNARY null = ((wrap:int:0x00cd: ARITH (r79v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.RelationSourceType) : (r63v0 com.okinc.okimcore.model.im.RelationSourceType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d8: ARITH (r79v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e3: ARITH (r79v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ee: ARITH (r79v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r66v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00f9: ARITH (r79v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r67v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0104: ARITH (r79v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r68v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x010f: ARITH (r79v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r69v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x011a: ARITH (r79v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r70v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0125: ARITH (r79v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r71v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0130: ARITH (r79v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r72v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0139: ARITH (r80v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r73v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0142: ARITH (r80v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r74v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x014b: ARITH (r80v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r75v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0154: ARITH (r80v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r76v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015d: ARITH (r80v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r77v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0164: ARITH (r80v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0168: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r78v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, com.okinc.okimcore.model.remote.OfficialTagInfo, long, boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, com.okinc.okimcore.model.im.RelationSourceType, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean):void (m)] (LINE:18) call: com.okinc.okimcore.model.remote.RelationInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, com.okinc.okimcore.model.remote.OfficialTagInfo, long, boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, com.okinc.okimcore.model.im.RelationSourceType, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ RelationInfo(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str6, OfficialTagInfo officialTagInfo, long j, boolean z8, String str7, String str8, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, RelationSourceType relationSourceType, String str9, String str10, String str11, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, String str12, Integer num, Boolean bool10, Boolean bool11, Boolean bool12, String str13, Boolean bool13, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? false : z5, (i & 1024) != 0 ? false : z6, (i & 2048) != 0 ? false : z7, (i & 4096) == 0 ? str6 : "", (i & 8192) != 0 ? null : officialTagInfo, (i & 16384) != 0 ? 0L : j, (32768 & i) != 0 ? false : z8, (i & 65536) != 0 ? null : str7, (i & 131072) != 0 ? null : str8, (i & 262144) != 0 ? null : bool, (i & 524288) != 0 ? null : bool2, (i & 1048576) != 0 ? null : bool3, (i & 2097152) != 0 ? null : bool4, (i & 4194304) != 0 ? null : relationSourceType, (i & 8388608) != 0 ? null : str9, (i & 16777216) != 0 ? null : str10, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str11, (i & 67108864) != 0 ? null : bool5, (i & 134217728) != 0 ? null : bool6, (i & 268435456) != 0 ? null : bool7, (i & 536870912) != 0 ? null : bool8, (i & 1073741824) != 0 ? null : bool9, (i & Integer.MIN_VALUE) != 0 ? null : str12, (i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : bool10, (i2 & 4) != 0 ? null : bool11, (i2 & 8) != 0 ? null : bool12, (i2 & 16) == 0 ? str13 : null, (i2 & 32) != 0 ? Boolean.FALSE : bool13);
    }
}
