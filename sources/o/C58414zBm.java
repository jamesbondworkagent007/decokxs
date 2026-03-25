package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.account.ChangePasswordStepType;

/* JADX INFO: renamed from: o.zBm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C58414zBm {
    public static final int $stable = 8;
    public ChangePasswordStepType KWHzl;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C58414zBm copy$default(C58414zBm c58414zBm, ChangePasswordStepType changePasswordStepType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            changePasswordStepType = c58414zBm.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c58414zBm.OLrzqt;
        }
        return c58414zBm.OLrzqt(changePasswordStepType, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChangePasswordStepType AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58414zBm OLrzqt(@NotNull ChangePasswordStepType changePasswordStepType, java.lang.String str) {
        Intrinsics.checkNotNullParameter(changePasswordStepType, "");
        return new C58414zBm(changePasswordStepType, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58414zBm)) {
            return false;
        }
        C58414zBm c58414zBm = (C58414zBm) obj;
        return this.KWHzl == c58414zBm.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c58414zBm.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        java.lang.String str = this.OLrzqt;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InitiateChangePasswordResult(nextStep=" + this.KWHzl + ", business=" + this.OLrzqt + ")";
    }

    public C58414zBm(@NotNull ChangePasswordStepType changePasswordStepType, java.lang.String str) {
        Intrinsics.checkNotNullParameter(changePasswordStepType, "");
        this.KWHzl = changePasswordStepType;
        this.OLrzqt = str;
    }
}
