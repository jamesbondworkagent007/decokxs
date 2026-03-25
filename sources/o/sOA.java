package o;

import com.okinc.okimcore.model.im.group.GroupApplicationStatus;
import com.okinc.okimcore.model.remote.GroupJoinApplicationResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface sOA {

    public static final class Application implements sOA {
        public static final ActionBar Companion = new ActionBar(null);
        public final java.lang.Long AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.Long AhwBna;
        public final java.lang.String EZpvd;
        public final java.lang.Long KWHzl;
        public final GroupApplicationStatus OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.String djBIcL;
        public final java.lang.Long gEmmrt;
        public final java.lang.Long valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long AEQbTJ() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupApplicationStatus EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(java.lang.String str, java.lang.Long l, java.lang.Long l2, java.lang.String str2, java.lang.String str3, java.lang.Long l3, GroupApplicationStatus groupApplicationStatus, java.lang.String str4, java.lang.Long l4, java.lang.Long l5) {
            return new Application(str, l, l2, str2, str3, l3, groupApplicationStatus, str4, l4, l5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) application.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ) && Intrinsics.EZpvd(this.AhwBna, application.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) application.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd) && Intrinsics.EZpvd(this.gEmmrt, application.gEmmrt) && this.OLrzqt == application.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) application.AYXKKw) && Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && Intrinsics.EZpvd(this.valueOf, application.valueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.copydefault;
            int iHashCode = str == null ? 0 : str.hashCode();
            java.lang.Long l = this.AEQbTJ;
            int iHashCode2 = l == null ? 0 : l.hashCode();
            java.lang.Long l2 = this.AhwBna;
            int iHashCode3 = l2 == null ? 0 : l2.hashCode();
            java.lang.String str2 = this.djBIcL;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.EZpvd;
            int iHashCode5 = str3 == null ? 0 : str3.hashCode();
            java.lang.Long l3 = this.gEmmrt;
            int iHashCode6 = l3 == null ? 0 : l3.hashCode();
            GroupApplicationStatus groupApplicationStatus = this.OLrzqt;
            int iHashCode7 = groupApplicationStatus == null ? 0 : groupApplicationStatus.hashCode();
            java.lang.String str4 = this.AYXKKw;
            int iHashCode8 = str4 == null ? 0 : str4.hashCode();
            java.lang.Long l4 = this.KWHzl;
            int iHashCode9 = l4 == null ? 0 : l4.hashCode();
            java.lang.Long l5 = this.valueOf;
            return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (l5 != null ? l5.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(id=" + this.copydefault + ", groupId=" + this.AEQbTJ + ", memberUid=" + this.AhwBna + ", nickname=" + this.djBIcL + ", avatar=" + this.EZpvd + ", inviterUid=" + this.gEmmrt + ", applicationStatus=" + this.OLrzqt + ", reason=" + this.AYXKKw + ", createTime=" + this.KWHzl + ", updateTime=" + this.valueOf + ")";
        }

        public Application(java.lang.String str, java.lang.Long l, java.lang.Long l2, java.lang.String str2, java.lang.String str3, java.lang.Long l3, GroupApplicationStatus groupApplicationStatus, java.lang.String str4, java.lang.Long l4, java.lang.Long l5) {
            this.copydefault = str;
            this.AEQbTJ = l;
            this.AhwBna = l2;
            this.djBIcL = str2;
            this.EZpvd = str3;
            this.gEmmrt = l3;
            this.OLrzqt = groupApplicationStatus;
            this.AYXKKw = str4;
            this.KWHzl = l4;
            this.valueOf = l5;
        }

        public static final class ActionBar {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sOA.Application.ActionBar.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ActionBar() {
            }

            public final Application AEQbTJ(@NotNull GroupJoinApplicationResponse groupJoinApplicationResponse) {
                Intrinsics.checkNotNullParameter(groupJoinApplicationResponse, "");
                return new Application(groupJoinApplicationResponse.getId(), groupJoinApplicationResponse.getGroupId(), groupJoinApplicationResponse.getMemberUid(), groupJoinApplicationResponse.getNickname(), groupJoinApplicationResponse.getAvatar(), groupJoinApplicationResponse.getInviterUid(), groupJoinApplicationResponse.getApplicationStatus(), groupJoinApplicationResponse.getReason(), groupJoinApplicationResponse.getCreateTime(), groupJoinApplicationResponse.getUpdateTime());
            }
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity implements sOA {
        public final int KWHzl;
        public final java.lang.Throwable OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, int i, java.lang.Throwable th, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = activity.KWHzl;
            }
            if ((i2 & 2) != 0) {
                th = activity.OLrzqt;
            }
            return activity.OLrzqt(i, th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Throwable EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(int i, @NotNull java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            return new Activity(i, th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.KWHzl == activity.KWHzl && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.KWHzl) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Failed(code=" + this.KWHzl + ", error=" + this.OLrzqt + ")";
        }

        public Activity(int i, @NotNull java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            this.KWHzl = i;
            this.OLrzqt = th;
        }
    }
}
