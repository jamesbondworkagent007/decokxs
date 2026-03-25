package o;

import com.okinc.planet.biz_search.SearchSubPage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tHn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46092tHn implements InterfaceC47828txV {
    public final SearchSubPage KWHzl;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C46092tHn copy$default(C46092tHn c46092tHn, SearchSubPage searchSubPage, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            searchSubPage = c46092tHn.KWHzl;
        }
        if ((i & 2) != 0) {
            z = c46092tHn.copydefault;
        }
        return c46092tHn.AEQbTJ(searchSubPage, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46092tHn AEQbTJ(@NotNull SearchSubPage searchSubPage, boolean z) {
        Intrinsics.checkNotNullParameter(searchSubPage, "");
        return new C46092tHn(searchSubPage, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchSubPage copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46092tHn)) {
            return false;
        }
        C46092tHn c46092tHn = (C46092tHn) obj;
        return this.KWHzl == c46092tHn.KWHzl && this.copydefault == c46092tHn.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchResultOverviewMoreVo(subPage=" + this.KWHzl + ", showMore=" + this.copydefault + ")";
    }

    public C46092tHn(@NotNull SearchSubPage searchSubPage, boolean z) {
        Intrinsics.checkNotNullParameter(searchSubPage, "");
        this.KWHzl = searchSubPage;
        this.copydefault = z;
    }

    @Override // o.InterfaceC47828txV
    public boolean copydefault(@NotNull InterfaceC47828txV interfaceC47828txV) {
        Intrinsics.checkNotNullParameter(interfaceC47828txV, "");
        return (interfaceC47828txV instanceof C46092tHn) && Intrinsics.EZpvd(this, interfaceC47828txV);
    }

    @Override // o.InterfaceC47828txV
    public boolean KWHzl(@NotNull InterfaceC47828txV interfaceC47828txV) {
        Intrinsics.checkNotNullParameter(interfaceC47828txV, "");
        return (interfaceC47828txV instanceof C46092tHn) && Intrinsics.EZpvd(this, interfaceC47828txV);
    }
}
