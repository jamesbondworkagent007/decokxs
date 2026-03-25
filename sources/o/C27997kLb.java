package o;

import com.okinc.market.watch.data.UserGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kLb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27997kLb {
    public final boolean AEQbTJ;
    public final java.util.List<UserGroup> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kLb */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C27997kLb copy$default(C27997kLb c27997kLb, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c27997kLb.copydefault;
        }
        if ((i & 2) != 0) {
            z = c27997kLb.AEQbTJ;
        }
        return c27997kLb.KWHzl(list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<UserGroup> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27997kLb KWHzl(@NotNull java.util.List<UserGroup> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C27997kLb(list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27997kLb)) {
            return false;
        }
        C27997kLb c27997kLb = (C27997kLb) obj;
        return Intrinsics.EZpvd(this.copydefault, c27997kLb.copydefault) && this.AEQbTJ == c27997kLb.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UserGroupCombineData(userGroups=" + this.copydefault + ", haveAnyWatchListData=" + this.AEQbTJ + ")";
    }

    public C27997kLb(@NotNull java.util.List<UserGroup> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
        this.AEQbTJ = z;
    }
}
