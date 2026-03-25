package o;

import com.okinc.okimcore.model.im.group.GroupApplicationStatus;
import com.okinc.okimcore.model.im.group.GroupApplicationType;
import com.okinc.okimcore.model.remote.GroupEntryAssetVerificationInfo;
import com.okinc.okimcore.model.remote.GroupInvitationInfoResponse;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class sOD {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sOD.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ sOD(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private sOD() {
    }

    public static final class TaskDescription extends sOD {
        public final GroupEntryAssetVerificationInfo AEQbTJ;
        public final GroupInvitationInfoResponse.GroupOwnerInfo AYXKKw;
        public final java.lang.String AhwBna;
        public final int AkhnZx;
        public final GroupInvitationInfoResponse.PaidGroupPreview AuCTel;
        public final java.lang.String DbNXlk;
        public final long EZpvd;
        public final boolean KWHzl;
        public final GroupApplicationType OLrzqt;
        public final GroupApplicationStatus copydefault;
        public final java.lang.String djBIcL;
        public final GroupTagType fetchVPNInfo;
        public final long gEmmrt;
        public final java.lang.String isConnected;
        public final java.lang.String valueOf;
        public final int values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupApplicationType AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupInvitationInfoResponse.GroupOwnerInfo AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupInvitationInfoResponse.PaidGroupPreview AkhnZx() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupEntryAssetVerificationInfo EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull GroupTagType groupTagType, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, int i2, boolean z, long j2, @NotNull GroupApplicationType groupApplicationType, @NotNull GroupApplicationStatus groupApplicationStatus, GroupEntryAssetVerificationInfo groupEntryAssetVerificationInfo, java.lang.String str5, GroupInvitationInfoResponse.GroupOwnerInfo groupOwnerInfo, GroupInvitationInfoResponse.PaidGroupPreview paidGroupPreview) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(groupTagType, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(groupApplicationType, "");
            Intrinsics.checkNotNullParameter(groupApplicationStatus, "");
            return new TaskDescription(j, str, str2, groupTagType, str3, str4, i, i2, z, j2, groupApplicationType, groupApplicationStatus, groupEntryAssetVerificationInfo, str5, groupOwnerInfo, paidGroupPreview);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupApplicationStatus copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupTagType djBIcL() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.gEmmrt == taskDescription.gEmmrt && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) taskDescription.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) taskDescription.djBIcL) && this.fetchVPNInfo == taskDescription.fetchVPNInfo && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) taskDescription.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) taskDescription.isConnected) && this.AkhnZx == taskDescription.AkhnZx && this.values == taskDescription.values && this.KWHzl == taskDescription.KWHzl && this.EZpvd == taskDescription.EZpvd && this.OLrzqt == taskDescription.OLrzqt && this.copydefault == taskDescription.copydefault && Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) taskDescription.valueOf) && Intrinsics.EZpvd(this.AYXKKw, taskDescription.AYXKKw) && Intrinsics.EZpvd(this.AuCTel, taskDescription.AuCTel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int fetchVPNInfo() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Long.hashCode(this.gEmmrt);
            int iHashCode2 = this.AhwBna.hashCode();
            int iHashCode3 = this.djBIcL.hashCode();
            int iHashCode4 = this.fetchVPNInfo.hashCode();
            int iHashCode5 = this.DbNXlk.hashCode();
            int iHashCode6 = this.isConnected.hashCode();
            int iHashCode7 = java.lang.Integer.hashCode(this.AkhnZx);
            int iHashCode8 = java.lang.Integer.hashCode(this.values);
            int iHashCode9 = java.lang.Boolean.hashCode(this.KWHzl);
            int iHashCode10 = java.lang.Long.hashCode(this.EZpvd);
            int iHashCode11 = this.OLrzqt.hashCode();
            int iHashCode12 = this.copydefault.hashCode();
            GroupEntryAssetVerificationInfo groupEntryAssetVerificationInfo = this.AEQbTJ;
            int iHashCode13 = groupEntryAssetVerificationInfo == null ? 0 : groupEntryAssetVerificationInfo.hashCode();
            java.lang.String str = this.valueOf;
            int iHashCode14 = str == null ? 0 : str.hashCode();
            GroupInvitationInfoResponse.GroupOwnerInfo groupOwnerInfo = this.AYXKKw;
            int iHashCode15 = groupOwnerInfo == null ? 0 : groupOwnerInfo.hashCode();
            GroupInvitationInfoResponse.PaidGroupPreview paidGroupPreview = this.AuCTel;
            return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (paidGroupPreview == null ? 0 : paidGroupPreview.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(groupId=" + this.gEmmrt + ", groupName=" + this.AhwBna + ", groupAvatar=" + this.djBIcL + ", groupType=" + this.fetchVPNInfo + ", inviterNickname=" + this.DbNXlk + ", inviterEnNickname=" + this.isConnected + ", memberCount=" + this.AkhnZx + ", mutualRelationCount=" + this.values + ", alreadyInGroup=" + this.KWHzl + ", expireTime=" + this.EZpvd + ", groupApplicationType=" + this.OLrzqt + ", groupApplicationStatus=" + this.copydefault + ", assetVerificationInfo=" + this.AEQbTJ + ", groupDescription=" + this.valueOf + ", groupOwnerInfo=" + this.AYXKKw + ", paidGroupPreview=" + this.AuCTel + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int values() {
            return this.values;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull GroupTagType groupTagType, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, int i2, boolean z, long j2, @NotNull GroupApplicationType groupApplicationType, @NotNull GroupApplicationStatus groupApplicationStatus, GroupEntryAssetVerificationInfo groupEntryAssetVerificationInfo, java.lang.String str5, GroupInvitationInfoResponse.GroupOwnerInfo groupOwnerInfo, GroupInvitationInfoResponse.PaidGroupPreview paidGroupPreview) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(groupTagType, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(groupApplicationType, "");
            Intrinsics.checkNotNullParameter(groupApplicationStatus, "");
            this.gEmmrt = j;
            this.AhwBna = str;
            this.djBIcL = str2;
            this.fetchVPNInfo = groupTagType;
            this.DbNXlk = str3;
            this.isConnected = str4;
            this.AkhnZx = i;
            this.values = i2;
            this.KWHzl = z;
            this.EZpvd = j2;
            this.OLrzqt = groupApplicationType;
            this.copydefault = groupApplicationStatus;
            this.AEQbTJ = groupEntryAssetVerificationInfo;
            this.valueOf = str5;
            this.AYXKKw = groupOwnerInfo;
            this.AuCTel = paidGroupPreview;
        }
    }

    public static final class ActionBar extends sOD {
        public final java.lang.Throwable AEQbTJ;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, int i, java.lang.Throwable th, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = actionBar.copydefault;
            }
            if ((i2 & 2) != 0) {
                th = actionBar.AEQbTJ;
            }
            return actionBar.KWHzl(i, th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(int i, @NotNull java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            return new ActionBar(i, th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Throwable OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return this.copydefault == actionBar.copydefault && Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.copydefault) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed(code=" + this.copydefault + ", error=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(int i, @NotNull java.lang.Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.copydefault = i;
            this.AEQbTJ = th;
        }
    }
}
