package o;

import com.okinc.market.search.features.main.result.ui.SubPage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qFs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40002qFs implements InterfaceC40516qYt {
    public final boolean AEQbTJ;
    public final SubPage OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C40002qFs copy$default(C40002qFs c40002qFs, SubPage subPage, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            subPage = c40002qFs.OLrzqt;
        }
        if ((i & 2) != 0) {
            z = c40002qFs.AEQbTJ;
        }
        return c40002qFs.KWHzl(subPage, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40002qFs KWHzl(@NotNull SubPage subPage, boolean z) {
        Intrinsics.checkNotNullParameter(subPage, "");
        return new C40002qFs(subPage, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubPage OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40002qFs)) {
            return false;
        }
        C40002qFs c40002qFs = (C40002qFs) obj;
        return this.OLrzqt == c40002qFs.OLrzqt && this.AEQbTJ == c40002qFs.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchResultOverviewMoreVo(subPage=" + this.OLrzqt + ", showMore=" + this.AEQbTJ + ")";
    }

    public C40002qFs(@NotNull SubPage subPage, boolean z) {
        Intrinsics.checkNotNullParameter(subPage, "");
        this.OLrzqt = subPage;
        this.AEQbTJ = z;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C40002qFs) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C40002qFs) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }
}
