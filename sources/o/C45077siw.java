package o;

import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.ui.adapter.TroubleshootResultAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.siw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45077siw extends TroubleshootResultAdapter.TaskDescription {
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final SelfServiceToolBean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C45077siw copy$default(C45077siw c45077siw, java.lang.String str, java.lang.String str2, java.lang.String str3, SelfServiceToolBean selfServiceToolBean, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c45077siw.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = c45077siw.EZpvd;
        }
        if ((i & 4) != 0) {
            str3 = c45077siw.KWHzl;
        }
        if ((i & 8) != 0) {
            selfServiceToolBean = c45077siw.copydefault;
        }
        return c45077siw.AEQbTJ(str, str2, str3, selfServiceToolBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C45077siw AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, SelfServiceToolBean selfServiceToolBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C45077siw(str, str2, str3, selfServiceToolBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceToolBean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45077siw)) {
            return false;
        }
        C45077siw c45077siw = (C45077siw) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c45077siw.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c45077siw.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c45077siw.KWHzl) && Intrinsics.EZpvd(this.copydefault, c45077siw.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = this.KWHzl.hashCode();
        SelfServiceToolBean selfServiceToolBean = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (selfServiceToolBean == null ? 0 : selfServiceToolBean.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TxidOnlyDisplayModel(preDescription=" + this.OLrzqt + ", title=" + this.EZpvd + ", description=" + this.KWHzl + ", selfServiceTool=" + this.copydefault + ")";
    }

    public C45077siw(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, SelfServiceToolBean selfServiceToolBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.OLrzqt = str;
        this.EZpvd = str2;
        this.KWHzl = str3;
        this.copydefault = selfServiceToolBean;
    }
}
