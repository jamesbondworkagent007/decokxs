package o;

import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.nrj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35248nrj {
    public final GroupTagType EZpvd;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C35248nrj copy$default(C35248nrj c35248nrj, GroupTagType groupTagType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            groupTagType = c35248nrj.EZpvd;
        }
        if ((i & 2) != 0) {
            str = c35248nrj.copydefault;
        }
        return c35248nrj.AEQbTJ(groupTagType, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35248nrj AEQbTJ(GroupTagType groupTagType, java.lang.String str) {
        return new C35248nrj(groupTagType, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupTagType copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35248nrj)) {
            return false;
        }
        C35248nrj c35248nrj = (C35248nrj) obj;
        return this.EZpvd == c35248nrj.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c35248nrj.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        GroupTagType groupTagType = this.EZpvd;
        int iHashCode = groupTagType == null ? 0 : groupTagType.hashCode();
        java.lang.String str = this.copydefault;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ShouldInterceptReferenceData(groupType=" + this.EZpvd + ", lastMsgExtra=" + this.copydefault + ")";
    }

    public C35248nrj(GroupTagType groupTagType, java.lang.String str) {
        this.EZpvd = groupTagType;
        this.copydefault = str;
    }
}
