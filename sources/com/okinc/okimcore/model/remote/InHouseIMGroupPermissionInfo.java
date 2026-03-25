package com.okinc.okimcore.model.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMGroupPermissionInfo implements Parcelable {
    public static final int $stable = 0;
    private final Boolean addInvitee;
    private final Boolean addMember;
    private final Boolean allowFile;
    private final Boolean allowGeneratingInvitationQrCode;
    private final Boolean allowLeaveGroup;
    private final Boolean allowPay;
    private final Boolean allowPayGifts;
    private final Boolean allowStartGroupVoiceCall;
    private final Boolean allowVoice;
    private final Boolean atAll;
    private final Boolean convertGroupToPublic;
    private final Boolean deleteAnnouncement;
    private final Boolean disbandGroup;
    private final Boolean inviteAnyone;
    private final Boolean isAllowedSendMessageKyc;
    private final Boolean listAnnouncement;
    private final Boolean listMember;
    private final Boolean muteUnmuteMember;
    private final Boolean postAnnouncement;
    private final Boolean removeMember;
    private final Boolean reviewJoinApplications;
    private final Boolean setRole;
    private final Boolean transferOwner;
    private final Boolean updateBizGroupName;
    private final Boolean updateGroupProfile;
    private final Boolean updateGroupSettings;
    private final Boolean viewGroupInfo;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InHouseIMGroupPermissionInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InHouseIMGroupPermissionInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InHouseIMGroupPermissionInfo createFromParcel(Parcel parcel) {
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
            Boolean boolValueOf14;
            Boolean boolValueOf15;
            Boolean boolValueOf16;
            Boolean boolValueOf17;
            Boolean boolValueOf18;
            Boolean boolValueOf19;
            Boolean boolValueOf20;
            Boolean boolValueOf21;
            Boolean boolValueOf22;
            Boolean boolValueOf23;
            Boolean boolValueOf24;
            Boolean boolValueOf25;
            Boolean boolValueOf26;
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean boolValueOf27 = null;
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
            if (parcel.readInt() == 0) {
                boolValueOf13 = null;
            } else {
                boolValueOf13 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf14 = null;
            } else {
                boolValueOf14 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf15 = null;
            } else {
                boolValueOf15 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf16 = null;
            } else {
                boolValueOf16 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf17 = null;
            } else {
                boolValueOf17 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf18 = null;
            } else {
                boolValueOf18 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf19 = null;
            } else {
                boolValueOf19 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf20 = null;
            } else {
                boolValueOf20 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf21 = null;
            } else {
                boolValueOf21 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf22 = null;
            } else {
                boolValueOf22 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf23 = null;
            } else {
                boolValueOf23 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf24 = null;
            } else {
                boolValueOf24 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf25 = null;
            } else {
                boolValueOf25 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf26 = null;
            } else {
                boolValueOf26 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf27 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new InHouseIMGroupPermissionInfo(boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6, boolValueOf7, boolValueOf8, boolValueOf9, boolValueOf10, boolValueOf11, boolValueOf12, boolValueOf13, boolValueOf14, boolValueOf15, boolValueOf16, boolValueOf17, boolValueOf18, boolValueOf19, boolValueOf20, boolValueOf21, boolValueOf22, boolValueOf23, boolValueOf24, boolValueOf25, boolValueOf26, boolValueOf27);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InHouseIMGroupPermissionInfo[] newArray(int i) {
            return new InHouseIMGroupPermissionInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InHouseIMGroupPermissionInfo() {
        this((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, 134217727, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.viewGroupInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.removeMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.inviteAnyone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component12() {
        return this.listAnnouncement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component13() {
        return this.postAnnouncement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component14() {
        return this.deleteAnnouncement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component15() {
        return this.atAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component16() {
        return this.addInvitee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component17() {
        return this.isAllowedSendMessageKyc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component18() {
        return this.allowGeneratingInvitationQrCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component19() {
        return this.reviewJoinApplications;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.setRole;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component20() {
        return this.allowPayGifts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component21() {
        return this.allowPay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component22() {
        return this.allowVoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component23() {
        return this.allowFile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component24() {
        return this.convertGroupToPublic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component25() {
        return this.allowLeaveGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component26() {
        return this.allowStartGroupVoiceCall;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component27() {
        return this.updateBizGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.muteUnmuteMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.updateGroupSettings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.updateGroupProfile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.disbandGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.transferOwner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.listMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.addMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupPermissionInfo copy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27) {
        return new InHouseIMGroupPermissionInfo(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, bool21, bool22, bool23, bool24, bool25, bool26, bool27);
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
        if (!(obj instanceof InHouseIMGroupPermissionInfo)) {
            return false;
        }
        InHouseIMGroupPermissionInfo inHouseIMGroupPermissionInfo = (InHouseIMGroupPermissionInfo) obj;
        return Intrinsics.EZpvd(this.viewGroupInfo, inHouseIMGroupPermissionInfo.viewGroupInfo) && Intrinsics.EZpvd(this.setRole, inHouseIMGroupPermissionInfo.setRole) && Intrinsics.EZpvd(this.muteUnmuteMember, inHouseIMGroupPermissionInfo.muteUnmuteMember) && Intrinsics.EZpvd(this.updateGroupSettings, inHouseIMGroupPermissionInfo.updateGroupSettings) && Intrinsics.EZpvd(this.updateGroupProfile, inHouseIMGroupPermissionInfo.updateGroupProfile) && Intrinsics.EZpvd(this.disbandGroup, inHouseIMGroupPermissionInfo.disbandGroup) && Intrinsics.EZpvd(this.transferOwner, inHouseIMGroupPermissionInfo.transferOwner) && Intrinsics.EZpvd(this.listMember, inHouseIMGroupPermissionInfo.listMember) && Intrinsics.EZpvd(this.addMember, inHouseIMGroupPermissionInfo.addMember) && Intrinsics.EZpvd(this.removeMember, inHouseIMGroupPermissionInfo.removeMember) && Intrinsics.EZpvd(this.inviteAnyone, inHouseIMGroupPermissionInfo.inviteAnyone) && Intrinsics.EZpvd(this.listAnnouncement, inHouseIMGroupPermissionInfo.listAnnouncement) && Intrinsics.EZpvd(this.postAnnouncement, inHouseIMGroupPermissionInfo.postAnnouncement) && Intrinsics.EZpvd(this.deleteAnnouncement, inHouseIMGroupPermissionInfo.deleteAnnouncement) && Intrinsics.EZpvd(this.atAll, inHouseIMGroupPermissionInfo.atAll) && Intrinsics.EZpvd(this.addInvitee, inHouseIMGroupPermissionInfo.addInvitee) && Intrinsics.EZpvd(this.isAllowedSendMessageKyc, inHouseIMGroupPermissionInfo.isAllowedSendMessageKyc) && Intrinsics.EZpvd(this.allowGeneratingInvitationQrCode, inHouseIMGroupPermissionInfo.allowGeneratingInvitationQrCode) && Intrinsics.EZpvd(this.reviewJoinApplications, inHouseIMGroupPermissionInfo.reviewJoinApplications) && Intrinsics.EZpvd(this.allowPayGifts, inHouseIMGroupPermissionInfo.allowPayGifts) && Intrinsics.EZpvd(this.allowPay, inHouseIMGroupPermissionInfo.allowPay) && Intrinsics.EZpvd(this.allowVoice, inHouseIMGroupPermissionInfo.allowVoice) && Intrinsics.EZpvd(this.allowFile, inHouseIMGroupPermissionInfo.allowFile) && Intrinsics.EZpvd(this.convertGroupToPublic, inHouseIMGroupPermissionInfo.convertGroupToPublic) && Intrinsics.EZpvd(this.allowLeaveGroup, inHouseIMGroupPermissionInfo.allowLeaveGroup) && Intrinsics.EZpvd(this.allowStartGroupVoiceCall, inHouseIMGroupPermissionInfo.allowStartGroupVoiceCall) && Intrinsics.EZpvd(this.updateBizGroupName, inHouseIMGroupPermissionInfo.updateBizGroupName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAddInvitee() {
        return this.addInvitee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAddMember() {
        return this.addMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowFile() {
        return this.allowFile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowGeneratingInvitationQrCode() {
        return this.allowGeneratingInvitationQrCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowLeaveGroup() {
        return this.allowLeaveGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowPay() {
        return this.allowPay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowPayGifts() {
        return this.allowPayGifts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowStartGroupVoiceCall() {
        return this.allowStartGroupVoiceCall;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowVoice() {
        return this.allowVoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAtAll() {
        return this.atAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getConvertGroupToPublic() {
        return this.convertGroupToPublic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getDeleteAnnouncement() {
        return this.deleteAnnouncement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getDisbandGroup() {
        return this.disbandGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getInviteAnyone() {
        return this.inviteAnyone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getListAnnouncement() {
        return this.listAnnouncement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getListMember() {
        return this.listMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getMuteUnmuteMember() {
        return this.muteUnmuteMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPostAnnouncement() {
        return this.postAnnouncement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getRemoveMember() {
        return this.removeMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getReviewJoinApplications() {
        return this.reviewJoinApplications;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSetRole() {
        return this.setRole;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getTransferOwner() {
        return this.transferOwner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getUpdateBizGroupName() {
        return this.updateBizGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getUpdateGroupProfile() {
        return this.updateGroupProfile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getUpdateGroupSettings() {
        return this.updateGroupSettings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getViewGroupInfo() {
        return this.viewGroupInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.viewGroupInfo;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.setRole;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.muteUnmuteMember;
        int iHashCode3 = bool3 == null ? 0 : bool3.hashCode();
        Boolean bool4 = this.updateGroupSettings;
        int iHashCode4 = bool4 == null ? 0 : bool4.hashCode();
        Boolean bool5 = this.updateGroupProfile;
        int iHashCode5 = bool5 == null ? 0 : bool5.hashCode();
        Boolean bool6 = this.disbandGroup;
        int iHashCode6 = bool6 == null ? 0 : bool6.hashCode();
        Boolean bool7 = this.transferOwner;
        int iHashCode7 = bool7 == null ? 0 : bool7.hashCode();
        Boolean bool8 = this.listMember;
        int iHashCode8 = bool8 == null ? 0 : bool8.hashCode();
        Boolean bool9 = this.addMember;
        int iHashCode9 = bool9 == null ? 0 : bool9.hashCode();
        Boolean bool10 = this.removeMember;
        int iHashCode10 = bool10 == null ? 0 : bool10.hashCode();
        Boolean bool11 = this.inviteAnyone;
        int iHashCode11 = bool11 == null ? 0 : bool11.hashCode();
        Boolean bool12 = this.listAnnouncement;
        int iHashCode12 = bool12 == null ? 0 : bool12.hashCode();
        Boolean bool13 = this.postAnnouncement;
        int iHashCode13 = bool13 == null ? 0 : bool13.hashCode();
        Boolean bool14 = this.deleteAnnouncement;
        int iHashCode14 = bool14 == null ? 0 : bool14.hashCode();
        Boolean bool15 = this.atAll;
        int iHashCode15 = bool15 == null ? 0 : bool15.hashCode();
        Boolean bool16 = this.addInvitee;
        int iHashCode16 = bool16 == null ? 0 : bool16.hashCode();
        Boolean bool17 = this.isAllowedSendMessageKyc;
        int iHashCode17 = bool17 == null ? 0 : bool17.hashCode();
        Boolean bool18 = this.allowGeneratingInvitationQrCode;
        int iHashCode18 = bool18 == null ? 0 : bool18.hashCode();
        Boolean bool19 = this.reviewJoinApplications;
        int iHashCode19 = bool19 == null ? 0 : bool19.hashCode();
        Boolean bool20 = this.allowPayGifts;
        int iHashCode20 = bool20 == null ? 0 : bool20.hashCode();
        Boolean bool21 = this.allowPay;
        int iHashCode21 = bool21 == null ? 0 : bool21.hashCode();
        Boolean bool22 = this.allowVoice;
        int iHashCode22 = bool22 == null ? 0 : bool22.hashCode();
        Boolean bool23 = this.allowFile;
        int iHashCode23 = bool23 == null ? 0 : bool23.hashCode();
        Boolean bool24 = this.convertGroupToPublic;
        int iHashCode24 = bool24 == null ? 0 : bool24.hashCode();
        Boolean bool25 = this.allowLeaveGroup;
        int iHashCode25 = bool25 == null ? 0 : bool25.hashCode();
        Boolean bool26 = this.allowStartGroupVoiceCall;
        int iHashCode26 = bool26 == null ? 0 : bool26.hashCode();
        Boolean bool27 = this.updateBizGroupName;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + (bool27 == null ? 0 : bool27.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isAllowedSendMessageKyc() {
        return this.isAllowedSendMessageKyc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMGroupPermissionInfo(viewGroupInfo=" + this.viewGroupInfo + ", setRole=" + this.setRole + ", muteUnmuteMember=" + this.muteUnmuteMember + ", updateGroupSettings=" + this.updateGroupSettings + ", updateGroupProfile=" + this.updateGroupProfile + ", disbandGroup=" + this.disbandGroup + ", transferOwner=" + this.transferOwner + ", listMember=" + this.listMember + ", addMember=" + this.addMember + ", removeMember=" + this.removeMember + ", inviteAnyone=" + this.inviteAnyone + ", listAnnouncement=" + this.listAnnouncement + ", postAnnouncement=" + this.postAnnouncement + ", deleteAnnouncement=" + this.deleteAnnouncement + ", atAll=" + this.atAll + ", addInvitee=" + this.addInvitee + ", isAllowedSendMessageKyc=" + this.isAllowedSendMessageKyc + ", allowGeneratingInvitationQrCode=" + this.allowGeneratingInvitationQrCode + ", reviewJoinApplications=" + this.reviewJoinApplications + ", allowPayGifts=" + this.allowPayGifts + ", allowPay=" + this.allowPay + ", allowVoice=" + this.allowVoice + ", allowFile=" + this.allowFile + ", convertGroupToPublic=" + this.convertGroupToPublic + ", allowLeaveGroup=" + this.allowLeaveGroup + ", allowStartGroupVoiceCall=" + this.allowStartGroupVoiceCall + ", updateBizGroupName=" + this.updateBizGroupName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Boolean bool = this.viewGroupInfo;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.setRole;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.muteUnmuteMember;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.updateGroupSettings;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.updateGroupProfile;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Boolean bool6 = this.disbandGroup;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        Boolean bool7 = this.transferOwner;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool7.booleanValue() ? 1 : 0);
        }
        Boolean bool8 = this.listMember;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool8.booleanValue() ? 1 : 0);
        }
        Boolean bool9 = this.addMember;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool9.booleanValue() ? 1 : 0);
        }
        Boolean bool10 = this.removeMember;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool10.booleanValue() ? 1 : 0);
        }
        Boolean bool11 = this.inviteAnyone;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool11.booleanValue() ? 1 : 0);
        }
        Boolean bool12 = this.listAnnouncement;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool12.booleanValue() ? 1 : 0);
        }
        Boolean bool13 = this.postAnnouncement;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool13.booleanValue() ? 1 : 0);
        }
        Boolean bool14 = this.deleteAnnouncement;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool14.booleanValue() ? 1 : 0);
        }
        Boolean bool15 = this.atAll;
        if (bool15 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool15.booleanValue() ? 1 : 0);
        }
        Boolean bool16 = this.addInvitee;
        if (bool16 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool16.booleanValue() ? 1 : 0);
        }
        Boolean bool17 = this.isAllowedSendMessageKyc;
        if (bool17 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool17.booleanValue() ? 1 : 0);
        }
        Boolean bool18 = this.allowGeneratingInvitationQrCode;
        if (bool18 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool18.booleanValue() ? 1 : 0);
        }
        Boolean bool19 = this.reviewJoinApplications;
        if (bool19 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool19.booleanValue() ? 1 : 0);
        }
        Boolean bool20 = this.allowPayGifts;
        if (bool20 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool20.booleanValue() ? 1 : 0);
        }
        Boolean bool21 = this.allowPay;
        if (bool21 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool21.booleanValue() ? 1 : 0);
        }
        Boolean bool22 = this.allowVoice;
        if (bool22 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool22.booleanValue() ? 1 : 0);
        }
        Boolean bool23 = this.allowFile;
        if (bool23 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool23.booleanValue() ? 1 : 0);
        }
        Boolean bool24 = this.convertGroupToPublic;
        if (bool24 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool24.booleanValue() ? 1 : 0);
        }
        Boolean bool25 = this.allowLeaveGroup;
        if (bool25 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool25.booleanValue() ? 1 : 0);
        }
        Boolean bool26 = this.allowStartGroupVoiceCall;
        if (bool26 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool26.booleanValue() ? 1 : 0);
        }
        Boolean bool27 = this.updateBizGroupName;
        if (bool27 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool27.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.InHouseIMGroupPermissionInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMGroupPermissionInfo> serializer() {
            return InHouseIMGroupPermissionInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMGroupPermissionInfo(int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.viewGroupInfo = null;
        } else {
            this.viewGroupInfo = bool;
        }
        if ((i & 2) == 0) {
            this.setRole = null;
        } else {
            this.setRole = bool2;
        }
        if ((i & 4) == 0) {
            this.muteUnmuteMember = null;
        } else {
            this.muteUnmuteMember = bool3;
        }
        if ((i & 8) == 0) {
            this.updateGroupSettings = null;
        } else {
            this.updateGroupSettings = bool4;
        }
        if ((i & 16) == 0) {
            this.updateGroupProfile = null;
        } else {
            this.updateGroupProfile = bool5;
        }
        if ((i & 32) == 0) {
            this.disbandGroup = null;
        } else {
            this.disbandGroup = bool6;
        }
        if ((i & 64) == 0) {
            this.transferOwner = null;
        } else {
            this.transferOwner = bool7;
        }
        if ((i & 128) == 0) {
            this.listMember = null;
        } else {
            this.listMember = bool8;
        }
        if ((i & 256) == 0) {
            this.addMember = null;
        } else {
            this.addMember = bool9;
        }
        if ((i & 512) == 0) {
            this.removeMember = null;
        } else {
            this.removeMember = bool10;
        }
        if ((i & 1024) == 0) {
            this.inviteAnyone = null;
        } else {
            this.inviteAnyone = bool11;
        }
        if ((i & 2048) == 0) {
            this.listAnnouncement = null;
        } else {
            this.listAnnouncement = bool12;
        }
        if ((i & 4096) == 0) {
            this.postAnnouncement = null;
        } else {
            this.postAnnouncement = bool13;
        }
        if ((i & 8192) == 0) {
            this.deleteAnnouncement = null;
        } else {
            this.deleteAnnouncement = bool14;
        }
        if ((i & 16384) == 0) {
            this.atAll = null;
        } else {
            this.atAll = bool15;
        }
        if ((32768 & i) == 0) {
            this.addInvitee = null;
        } else {
            this.addInvitee = bool16;
        }
        if ((65536 & i) == 0) {
            this.isAllowedSendMessageKyc = null;
        } else {
            this.isAllowedSendMessageKyc = bool17;
        }
        if ((131072 & i) == 0) {
            this.allowGeneratingInvitationQrCode = null;
        } else {
            this.allowGeneratingInvitationQrCode = bool18;
        }
        if ((262144 & i) == 0) {
            this.reviewJoinApplications = null;
        } else {
            this.reviewJoinApplications = bool19;
        }
        if ((524288 & i) == 0) {
            this.allowPayGifts = null;
        } else {
            this.allowPayGifts = bool20;
        }
        if ((1048576 & i) == 0) {
            this.allowPay = null;
        } else {
            this.allowPay = bool21;
        }
        if ((2097152 & i) == 0) {
            this.allowVoice = null;
        } else {
            this.allowVoice = bool22;
        }
        if ((4194304 & i) == 0) {
            this.allowFile = null;
        } else {
            this.allowFile = bool23;
        }
        if ((8388608 & i) == 0) {
            this.convertGroupToPublic = null;
        } else {
            this.convertGroupToPublic = bool24;
        }
        if ((16777216 & i) == 0) {
            this.allowLeaveGroup = null;
        } else {
            this.allowLeaveGroup = bool25;
        }
        if ((33554432 & i) == 0) {
            this.allowStartGroupVoiceCall = null;
        } else {
            this.allowStartGroupVoiceCall = bool26;
        }
        if ((i & 67108864) == 0) {
            this.updateBizGroupName = null;
        } else {
            this.updateBizGroupName = bool27;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InHouseIMGroupPermissionInfo inHouseIMGroupPermissionInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || inHouseIMGroupPermissionInfo.viewGroupInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.viewGroupInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inHouseIMGroupPermissionInfo.setRole != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.setRole);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || inHouseIMGroupPermissionInfo.muteUnmuteMember != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.muteUnmuteMember);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || inHouseIMGroupPermissionInfo.updateGroupSettings != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.updateGroupSettings);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || inHouseIMGroupPermissionInfo.updateGroupProfile != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.updateGroupProfile);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || inHouseIMGroupPermissionInfo.disbandGroup != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.disbandGroup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || inHouseIMGroupPermissionInfo.transferOwner != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.transferOwner);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || inHouseIMGroupPermissionInfo.listMember != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.listMember);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || inHouseIMGroupPermissionInfo.addMember != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.addMember);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || inHouseIMGroupPermissionInfo.removeMember != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.removeMember);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || inHouseIMGroupPermissionInfo.inviteAnyone != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.inviteAnyone);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || inHouseIMGroupPermissionInfo.listAnnouncement != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.listAnnouncement);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || inHouseIMGroupPermissionInfo.postAnnouncement != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.postAnnouncement);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || inHouseIMGroupPermissionInfo.deleteAnnouncement != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.deleteAnnouncement);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || inHouseIMGroupPermissionInfo.atAll != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.atAll);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || inHouseIMGroupPermissionInfo.addInvitee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.addInvitee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || inHouseIMGroupPermissionInfo.isAllowedSendMessageKyc != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.isAllowedSendMessageKyc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || inHouseIMGroupPermissionInfo.allowGeneratingInvitationQrCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.allowGeneratingInvitationQrCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || inHouseIMGroupPermissionInfo.reviewJoinApplications != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.reviewJoinApplications);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || inHouseIMGroupPermissionInfo.allowPayGifts != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.allowPayGifts);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || inHouseIMGroupPermissionInfo.allowPay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.allowPay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || inHouseIMGroupPermissionInfo.allowVoice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.allowVoice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || inHouseIMGroupPermissionInfo.allowFile != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.allowFile);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || inHouseIMGroupPermissionInfo.convertGroupToPublic != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.convertGroupToPublic);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || inHouseIMGroupPermissionInfo.allowLeaveGroup != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.allowLeaveGroup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || inHouseIMGroupPermissionInfo.allowStartGroupVoiceCall != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.allowStartGroupVoiceCall);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) && inHouseIMGroupPermissionInfo.updateBizGroupName == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, BooleanSerializer.INSTANCE, inHouseIMGroupPermissionInfo.updateBizGroupName);
    }

    public InHouseIMGroupPermissionInfo(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27) {
        this.viewGroupInfo = bool;
        this.setRole = bool2;
        this.muteUnmuteMember = bool3;
        this.updateGroupSettings = bool4;
        this.updateGroupProfile = bool5;
        this.disbandGroup = bool6;
        this.transferOwner = bool7;
        this.listMember = bool8;
        this.addMember = bool9;
        this.removeMember = bool10;
        this.inviteAnyone = bool11;
        this.listAnnouncement = bool12;
        this.postAnnouncement = bool13;
        this.deleteAnnouncement = bool14;
        this.atAll = bool15;
        this.addInvitee = bool16;
        this.isAllowedSendMessageKyc = bool17;
        this.allowGeneratingInvitationQrCode = bool18;
        this.reviewJoinApplications = bool19;
        this.allowPayGifts = bool20;
        this.allowPay = bool21;
        this.allowVoice = bool22;
        this.allowFile = bool23;
        this.convertGroupToPublic = bool24;
        this.allowLeaveGroup = bool25;
        this.allowStartGroupVoiceCall = bool26;
        this.updateBizGroupName = bool27;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0136: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r56v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r29v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r56v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r30v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r56v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r31v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001a: ARITH (r56v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r32v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0022: ARITH (r56v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r33v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002a: ARITH (r56v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r34v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (r56v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r35v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (r56v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r36v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0042: ARITH (r56v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r37v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004a: ARITH (r56v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r38v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0052: ARITH (r56v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r39v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x005a: ARITH (r56v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r40v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0062: ARITH (r56v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r41v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x006a: ARITH (r56v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r42v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0072: ARITH (r56v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r43v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x007d: ARITH (r56v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r44v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0088: ARITH (r56v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r45v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0093: ARITH (r56v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r46v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x009e: ARITH (r56v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r47v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r56v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r48v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r56v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r49v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r56v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r50v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r56v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r51v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00d5: ARITH (r56v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r52v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00e0: ARITH (r56v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r53v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00eb: ARITH (r56v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r54v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00f6: ARITH (r56v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r55v0 java.lang.Boolean))
 A[MD:(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void (m)] (LINE:11) call: com.okinc.okimcore.model.remote.InHouseIMGroupPermissionInfo.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void type: THIS */
    public /* synthetic */ InHouseIMGroupPermissionInfo(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4, (i & 16) != 0 ? null : bool5, (i & 32) != 0 ? null : bool6, (i & 64) != 0 ? null : bool7, (i & 128) != 0 ? null : bool8, (i & 256) != 0 ? null : bool9, (i & 512) != 0 ? null : bool10, (i & 1024) != 0 ? null : bool11, (i & 2048) != 0 ? null : bool12, (i & 4096) != 0 ? null : bool13, (i & 8192) != 0 ? null : bool14, (i & 16384) != 0 ? null : bool15, (i & 32768) != 0 ? null : bool16, (i & 65536) != 0 ? null : bool17, (i & 131072) != 0 ? null : bool18, (i & 262144) != 0 ? null : bool19, (i & 524288) != 0 ? null : bool20, (i & 1048576) != 0 ? null : bool21, (i & 2097152) != 0 ? null : bool22, (i & 4194304) != 0 ? null : bool23, (i & 8388608) != 0 ? null : bool24, (i & 16777216) != 0 ? null : bool25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : bool26, (i & 67108864) != 0 ? null : bool27);
    }
}
