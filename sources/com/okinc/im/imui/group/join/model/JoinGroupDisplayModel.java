package com.okinc.im.imui.group.join.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.group.GroupApplicationStatus;
import com.okinc.okimcore.model.im.group.GroupApplicationType;
import com.okinc.okimcore.model.remote.GroupEntryAssetVerificationInfo;
import com.okinc.okimcore.model.remote.GroupInvitationInfoResponse;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class JoinGroupDisplayModel implements Parcelable {
    public final GroupEntryAssetVerificationInfo AEQbTJ;
    public final String AYXKKw;
    public final GroupInvitationInfoResponse.GroupOwnerInfo AhwBna;
    public final OfficialTagInfo AkhnZx;
    public final GroupTagType DbNXlk;
    public final GroupApplicationStatus EZpvd;
    public final GroupApplicationType KWHzl;
    public final boolean OLrzqt;
    public final String djBIcL;
    public final GroupInvitationInfoResponse.PaidGroupPreview fetchVPNInfo;
    public final String gEmmrt;
    public final int isConnected;
    public final long valueOf;
    public final int values;
    public static final int copydefault = ((GroupInvitationInfoResponse.PaidGroupPreview.$stable | GroupInvitationInfoResponse.GroupOwnerInfo.$stable) | GroupEntryAssetVerificationInfo.$stable) | OfficialTagInfo.$stable;
    public static final Parcelable.Creator<JoinGroupDisplayModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<JoinGroupDisplayModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JoinGroupDisplayModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new JoinGroupDisplayModel(parcel.readLong(), parcel.readString(), parcel.readString(), GroupTagType.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), (OfficialTagInfo) parcel.readParcelable(JoinGroupDisplayModel.class.getClassLoader()), parcel.readInt() != 0, (GroupApplicationType) parcel.readParcelable(JoinGroupDisplayModel.class.getClassLoader()), (GroupApplicationStatus) parcel.readParcelable(JoinGroupDisplayModel.class.getClassLoader()), (GroupEntryAssetVerificationInfo) parcel.readParcelable(JoinGroupDisplayModel.class.getClassLoader()), parcel.readString(), (GroupInvitationInfoResponse.GroupOwnerInfo) parcel.readParcelable(JoinGroupDisplayModel.class.getClassLoader()), (GroupInvitationInfoResponse.PaidGroupPreview) parcel.readParcelable(JoinGroupDisplayModel.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JoinGroupDisplayModel[] newArray(int i) {
            return new JoinGroupDisplayModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupApplicationStatus AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupInvitationInfoResponse.GroupOwnerInfo AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupApplicationType EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryAssetVerificationInfo KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JoinGroupDisplayModel copydefault(long j, @NotNull String str, @NotNull String str2, @NotNull GroupTagType groupTagType, int i, int i2, OfficialTagInfo officialTagInfo, boolean z, @NotNull GroupApplicationType groupApplicationType, @NotNull GroupApplicationStatus groupApplicationStatus, GroupEntryAssetVerificationInfo groupEntryAssetVerificationInfo, String str3, GroupInvitationInfoResponse.GroupOwnerInfo groupOwnerInfo, GroupInvitationInfoResponse.PaidGroupPreview paidGroupPreview) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(groupTagType, "");
        Intrinsics.checkNotNullParameter(groupApplicationType, "");
        Intrinsics.checkNotNullParameter(groupApplicationStatus, "");
        return new JoinGroupDisplayModel(j, str, str2, groupTagType, i, i2, officialTagInfo, z, groupApplicationType, groupApplicationStatus, groupEntryAssetVerificationInfo, str3, groupOwnerInfo, paidGroupPreview);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.OLrzqt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinGroupDisplayModel)) {
            return false;
        }
        JoinGroupDisplayModel joinGroupDisplayModel = (JoinGroupDisplayModel) obj;
        return this.valueOf == joinGroupDisplayModel.valueOf && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) joinGroupDisplayModel.AYXKKw) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) joinGroupDisplayModel.djBIcL) && this.DbNXlk == joinGroupDisplayModel.DbNXlk && this.values == joinGroupDisplayModel.values && this.isConnected == joinGroupDisplayModel.isConnected && Intrinsics.EZpvd(this.AkhnZx, joinGroupDisplayModel.AkhnZx) && this.OLrzqt == joinGroupDisplayModel.OLrzqt && this.KWHzl == joinGroupDisplayModel.KWHzl && this.EZpvd == joinGroupDisplayModel.EZpvd && Intrinsics.EZpvd(this.AEQbTJ, joinGroupDisplayModel.AEQbTJ) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) joinGroupDisplayModel.gEmmrt) && Intrinsics.EZpvd(this.AhwBna, joinGroupDisplayModel.AhwBna) && Intrinsics.EZpvd(this.fetchVPNInfo, joinGroupDisplayModel.fetchVPNInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fetchVPNInfo() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupTagType gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.valueOf);
        int iHashCode2 = this.AYXKKw.hashCode();
        int iHashCode3 = this.djBIcL.hashCode();
        int iHashCode4 = this.DbNXlk.hashCode();
        int iHashCode5 = Integer.hashCode(this.values);
        int iHashCode6 = Integer.hashCode(this.isConnected);
        OfficialTagInfo officialTagInfo = this.AkhnZx;
        int iHashCode7 = officialTagInfo == null ? 0 : officialTagInfo.hashCode();
        int iHashCode8 = Boolean.hashCode(this.OLrzqt);
        int iHashCode9 = this.KWHzl.hashCode();
        int iHashCode10 = this.EZpvd.hashCode();
        GroupEntryAssetVerificationInfo groupEntryAssetVerificationInfo = this.AEQbTJ;
        int iHashCode11 = groupEntryAssetVerificationInfo == null ? 0 : groupEntryAssetVerificationInfo.hashCode();
        String str = this.gEmmrt;
        int iHashCode12 = str == null ? 0 : str.hashCode();
        GroupInvitationInfoResponse.GroupOwnerInfo groupOwnerInfo = this.AhwBna;
        int iHashCode13 = groupOwnerInfo == null ? 0 : groupOwnerInfo.hashCode();
        GroupInvitationInfoResponse.PaidGroupPreview paidGroupPreview = this.fetchVPNInfo;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (paidGroupPreview != null ? paidGroupPreview.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupInvitationInfoResponse.PaidGroupPreview isConnected() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "JoinGroupDisplayModel(groupId=" + this.valueOf + ", groupName=" + this.AYXKKw + ", groupAvatar=" + this.djBIcL + ", groupType=" + this.DbNXlk + ", totalMemberCount=" + this.values + ", mutualRelationCount=" + this.isConnected + ", officialTag=" + this.AkhnZx + ", alreadyInGroup=" + this.OLrzqt + ", groupApplicationType=" + this.KWHzl + ", groupApplicationStatus=" + this.EZpvd + ", assetVerificationInfo=" + this.AEQbTJ + ", groupDescription=" + this.gEmmrt + ", groupOwnerInfo=" + this.AhwBna + ", paidGroupPreview=" + this.fetchVPNInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo values() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.valueOf);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.DbNXlk.name());
        parcel.writeInt(this.values);
        parcel.writeInt(this.isConnected);
        parcel.writeParcelable(this.AkhnZx, i);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        parcel.writeParcelable(this.KWHzl, i);
        parcel.writeParcelable(this.EZpvd, i);
        parcel.writeParcelable(this.AEQbTJ, i);
        parcel.writeString(this.gEmmrt);
        parcel.writeParcelable(this.AhwBna, i);
        parcel.writeParcelable(this.fetchVPNInfo, i);
    }

    public JoinGroupDisplayModel(long j, @NotNull String str, @NotNull String str2, @NotNull GroupTagType groupTagType, int i, int i2, OfficialTagInfo officialTagInfo, boolean z, @NotNull GroupApplicationType groupApplicationType, @NotNull GroupApplicationStatus groupApplicationStatus, GroupEntryAssetVerificationInfo groupEntryAssetVerificationInfo, String str3, GroupInvitationInfoResponse.GroupOwnerInfo groupOwnerInfo, GroupInvitationInfoResponse.PaidGroupPreview paidGroupPreview) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(groupTagType, "");
        Intrinsics.checkNotNullParameter(groupApplicationType, "");
        Intrinsics.checkNotNullParameter(groupApplicationStatus, "");
        this.valueOf = j;
        this.AYXKKw = str;
        this.djBIcL = str2;
        this.DbNXlk = groupTagType;
        this.values = i;
        this.isConnected = i2;
        this.AkhnZx = officialTagInfo;
        this.OLrzqt = z;
        this.KWHzl = groupApplicationType;
        this.EZpvd = groupApplicationStatus;
        this.AEQbTJ = groupEntryAssetVerificationInfo;
        this.gEmmrt = str3;
        this.AhwBna = groupOwnerInfo;
        this.fetchVPNInfo = paidGroupPreview;
    }
}
