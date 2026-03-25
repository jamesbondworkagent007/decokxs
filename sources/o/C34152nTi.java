package o;

import com.okinc.okimcore.model.im.group.GroupPublicType;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nTi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34152nTi {
    public static final int EZpvd;
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final boolean AhwBna;
    public final int AkhnZx;
    public final java.lang.String DbNXlk;
    public final java.lang.String KWHzl;
    public final OfficialTagInfo OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final boolean fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final boolean isConnected;
    public final GroupPublicType valueOf;
    public final OfficialTagInfo values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i = OfficialTagInfo.$stable;
        EZpvd = i | i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34152nTi EZpvd(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, OfficialTagInfo officialTagInfo, boolean z, boolean z2, GroupPublicType groupPublicType, @NotNull java.lang.String str5, boolean z3, java.lang.String str6, java.lang.String str7, OfficialTagInfo officialTagInfo2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new C34152nTi(str, str2, str3, str4, i, officialTagInfo, z, z2, groupPublicType, str5, z3, str6, str7, officialTagInfo2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupPublicType djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34152nTi)) {
            return false;
        }
        C34152nTi c34152nTi = (C34152nTi) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c34152nTi.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c34152nTi.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c34152nTi.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c34152nTi.gEmmrt) && this.AkhnZx == c34152nTi.AkhnZx && Intrinsics.EZpvd(this.values, c34152nTi.values) && this.isConnected == c34152nTi.isConnected && this.AhwBna == c34152nTi.AhwBna && this.valueOf == c34152nTi.valueOf && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) c34152nTi.DbNXlk) && this.fetchVPNInfo == c34152nTi.fetchVPNInfo && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c34152nTi.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c34152nTi.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c34152nTi.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AYXKKw.hashCode();
        java.lang.String str = this.AEQbTJ;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.djBIcL.hashCode();
        int iHashCode4 = this.gEmmrt.hashCode();
        int iHashCode5 = java.lang.Integer.hashCode(this.AkhnZx);
        OfficialTagInfo officialTagInfo = this.values;
        int iHashCode6 = officialTagInfo == null ? 0 : officialTagInfo.hashCode();
        int iHashCode7 = java.lang.Boolean.hashCode(this.isConnected);
        int iHashCode8 = java.lang.Boolean.hashCode(this.AhwBna);
        GroupPublicType groupPublicType = this.valueOf;
        int iHashCode9 = groupPublicType == null ? 0 : groupPublicType.hashCode();
        int iHashCode10 = this.DbNXlk.hashCode();
        int iHashCode11 = java.lang.Boolean.hashCode(this.fetchVPNInfo);
        java.lang.String str2 = this.copydefault;
        int iHashCode12 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.KWHzl;
        int iHashCode13 = str3 == null ? 0 : str3.hashCode();
        OfficialTagInfo officialTagInfo2 = this.OLrzqt;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (officialTagInfo2 != null ? officialTagInfo2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GroupProfileHeaderSectionDisplayModel(groupName=" + this.AYXKKw + ", bizGroupName=" + this.AEQbTJ + ", groupAvatarUrl=" + this.djBIcL + ", groupDescription=" + this.gEmmrt + ", memberCount=" + this.AkhnZx + ", officialTags=" + this.values + ", isPaidGroup=" + this.isConnected + ", isAllowUpdateGroupSetting=" + this.AhwBna + ", groupType=" + this.valueOf + ", ownerId=" + this.DbNXlk + ", isVipChat=" + this.fetchVPNInfo + ", currentUserName=" + this.copydefault + ", currentUserAvatarUrl=" + this.KWHzl + ", currentUserOfficialTags=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo valueOf() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.AhwBna;
    }

    public C34152nTi(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, OfficialTagInfo officialTagInfo, boolean z, boolean z2, GroupPublicType groupPublicType, @NotNull java.lang.String str5, boolean z3, java.lang.String str6, java.lang.String str7, OfficialTagInfo officialTagInfo2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.AYXKKw = str;
        this.AEQbTJ = str2;
        this.djBIcL = str3;
        this.gEmmrt = str4;
        this.AkhnZx = i;
        this.values = officialTagInfo;
        this.isConnected = z;
        this.AhwBna = z2;
        this.valueOf = groupPublicType;
        this.DbNXlk = str5;
        this.fetchVPNInfo = z3;
        this.copydefault = str6;
        this.KWHzl = str7;
        this.OLrzqt = officialTagInfo2;
    }
}
