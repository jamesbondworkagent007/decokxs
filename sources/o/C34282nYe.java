package o;

import com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.other.GroupRole;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nYe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34282nYe {
    public final java.lang.String AEQbTJ;
    public final boolean AYXKKw;
    public final boolean AhwBna;
    public final java.lang.String AkhnZx;
    public final GroupMemberInfo DbNXlk;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final BillingCyclePaymentStatus OLrzqt;
    public final java.lang.String copydefault;
    public final Date djBIcL;
    public final java.lang.String fIwbmz;
    public final GroupRole fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final OfficialTagInfo isConnected;
    public final boolean valueOf;
    public final Date values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupRole AYXKKw() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34282nYe EZpvd(@NotNull GroupMemberInfo groupMemberInfo, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull GroupRole groupRole, OfficialTagInfo officialTagInfo, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull BillingCyclePaymentStatus billingCyclePaymentStatus, Date date, Date date2, @NotNull java.lang.String str7, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(groupMemberInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(groupRole, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(billingCyclePaymentStatus, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new C34282nYe(groupMemberInfo, str, str2, str3, groupRole, officialTagInfo, str4, str5, str6, billingCyclePaymentStatus, date, date2, str7, z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BillingCyclePaymentStatus KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo djBIcL() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ejfBZ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34282nYe)) {
            return false;
        }
        C34282nYe c34282nYe = (C34282nYe) obj;
        return Intrinsics.EZpvd(this.DbNXlk, c34282nYe.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c34282nYe.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c34282nYe.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c34282nYe.copydefault) && this.fetchVPNInfo == c34282nYe.fetchVPNInfo && Intrinsics.EZpvd(this.isConnected, c34282nYe.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c34282nYe.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.fIwbmz, (java.lang.Object) c34282nYe.fIwbmz) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c34282nYe.KWHzl) && this.OLrzqt == c34282nYe.OLrzqt && Intrinsics.EZpvd(this.values, c34282nYe.values) && Intrinsics.EZpvd(this.djBIcL, c34282nYe.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c34282nYe.AkhnZx) && this.AYXKKw == c34282nYe.AYXKKw && this.valueOf == c34282nYe.valueOf && this.AhwBna == c34282nYe.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date gEmmrt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.DbNXlk.hashCode();
        int iHashCode2 = this.gEmmrt.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        int iHashCode4 = this.copydefault.hashCode();
        int iHashCode5 = this.fetchVPNInfo.hashCode();
        OfficialTagInfo officialTagInfo = this.isConnected;
        int iHashCode6 = officialTagInfo == null ? 0 : officialTagInfo.hashCode();
        int iHashCode7 = this.EZpvd.hashCode();
        int iHashCode8 = this.fIwbmz.hashCode();
        int iHashCode9 = this.KWHzl.hashCode();
        int iHashCode10 = this.OLrzqt.hashCode();
        Date date = this.values;
        int iHashCode11 = date == null ? 0 : date.hashCode();
        Date date2 = this.djBIcL;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (date2 != null ? date2.hashCode() : 0)) * 31) + this.AkhnZx.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AYXKKw)) * 31) + java.lang.Boolean.hashCode(this.valueOf)) * 31) + java.lang.Boolean.hashCode(this.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GroupMemberDisplayModel(source=" + this.DbNXlk + ", memberId=" + this.gEmmrt + ", displayName=" + this.AEQbTJ + ", content=" + this.copydefault + ", role=" + this.fetchVPNInfo + ", officialTags=" + this.isConnected + ", avatar=" + this.EZpvd + ", tag=" + this.fIwbmz + ", identity=" + this.KWHzl + ", billPaymentStatus=" + this.OLrzqt + ", paymentDueDate=" + this.values + ", lastPaymentDate=" + this.djBIcL + ", searchQuery=" + this.AkhnZx + ", isEditMode=" + this.AYXKKw + ", isChecked=" + this.valueOf + ", isCalling=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupMemberInfo values() {
        return this.DbNXlk;
    }

    public C34282nYe(@NotNull GroupMemberInfo groupMemberInfo, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull GroupRole groupRole, OfficialTagInfo officialTagInfo, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull BillingCyclePaymentStatus billingCyclePaymentStatus, Date date, Date date2, @NotNull java.lang.String str7, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(groupMemberInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(groupRole, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(billingCyclePaymentStatus, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.DbNXlk = groupMemberInfo;
        this.gEmmrt = str;
        this.AEQbTJ = str2;
        this.copydefault = str3;
        this.fetchVPNInfo = groupRole;
        this.isConnected = officialTagInfo;
        this.EZpvd = str4;
        this.fIwbmz = str5;
        this.KWHzl = str6;
        this.OLrzqt = billingCyclePaymentStatus;
        this.values = date;
        this.djBIcL = date2;
        this.AkhnZx = str7;
        this.AYXKKw = z;
        this.valueOf = z2;
        this.AhwBna = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0044: CONSTRUCTOR 
  (r20v0 com.okinc.okimcore.model.other.GroupMemberInfo)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 com.okinc.okimcore.model.other.GroupRole)
  (r25v0 com.okinc.okimcore.model.remote.OfficialTagInfo)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus)
  (r30v0 java.util.Date)
  (r31v0 java.util.Date)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r33v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0022: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r35v0 boolean))
 A[MD:(com.okinc.okimcore.model.other.GroupMemberInfo, java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.other.GroupRole, com.okinc.okimcore.model.remote.OfficialTagInfo, java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus, java.util.Date, java.util.Date, java.lang.String, boolean, boolean, boolean):void (m)] (LINE:9) call: o.nYe.<init>(com.okinc.okimcore.model.other.GroupMemberInfo, java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.other.GroupRole, com.okinc.okimcore.model.remote.OfficialTagInfo, java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus, java.util.Date, java.util.Date, java.lang.String, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ C34282nYe(GroupMemberInfo groupMemberInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, GroupRole groupRole, OfficialTagInfo officialTagInfo, java.lang.String str4, java.lang.String str5, java.lang.String str6, BillingCyclePaymentStatus billingCyclePaymentStatus, Date date, Date date2, java.lang.String str7, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(groupMemberInfo, str, str2, str3, groupRole, officialTagInfo, str4, str5, str6, billingCyclePaymentStatus, date, date2, (i & 4096) != 0 ? "" : str7, (i & 8192) != 0 ? false : z, (i & 16384) != 0 ? false : z2, (i & 32768) != 0 ? false : z3);
    }
}
