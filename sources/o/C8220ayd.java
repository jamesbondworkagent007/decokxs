package o;

import com.okinc.okuser.data.User;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ayd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8220ayd {
    public final java.util.List<java.lang.Object> AEQbTJ;
    public final StateListAnimator EZpvd;
    public final User OLrzqt;

    /* JADX INFO: renamed from: o.ayd$StateListAnimator */
    public interface StateListAnimator {
        java.lang.String OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ayd */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C8220ayd copy$default(C8220ayd c8220ayd, User user, StateListAnimator stateListAnimator, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            user = c8220ayd.OLrzqt;
        }
        if ((i & 2) != 0) {
            stateListAnimator = c8220ayd.EZpvd;
        }
        if ((i & 4) != 0) {
            list = c8220ayd.AEQbTJ;
        }
        return c8220ayd.KWHzl(user, stateListAnimator, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateListAnimator AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C8220ayd KWHzl(User user, @NotNull StateListAnimator stateListAnimator, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C8220ayd(user, stateListAnimator, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8220ayd)) {
            return false;
        }
        C8220ayd c8220ayd = (C8220ayd) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c8220ayd.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c8220ayd.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c8220ayd.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        User user = this.OLrzqt;
        return ((((user == null ? 0 : user.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AccountUiState(user=" + this.OLrzqt + ", selected=" + this.EZpvd + ", subAccounts=" + this.AEQbTJ + ")";
    }

    public C8220ayd(User user, @NotNull StateListAnimator stateListAnimator, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = user;
        this.EZpvd = stateListAnimator;
        this.AEQbTJ = list;
    }
}
