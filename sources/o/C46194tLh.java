package o;

import com.okinc.planet.biz_userprofile.data.PlanetProfileGroupInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tLh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46194tLh {
    public final java.util.List<PlanetProfileGroupInfo> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tLh */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C46194tLh copy$default(C46194tLh c46194tLh, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c46194tLh.OLrzqt;
        }
        return c46194tLh.OLrzqt(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PlanetProfileGroupInfo> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46194tLh OLrzqt(@NotNull java.util.List<PlanetProfileGroupInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C46194tLh(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C46194tLh) && Intrinsics.EZpvd(this.OLrzqt, ((C46194tLh) obj).OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PlanetUserGroupData(groupInfoList=" + this.OLrzqt + ")";
    }

    public C46194tLh(@NotNull java.util.List<PlanetProfileGroupInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
    }
}
