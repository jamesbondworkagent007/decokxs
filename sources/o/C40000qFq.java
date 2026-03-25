package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qFq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40000qFq implements InterfaceC40516qYt {
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C40000qFq copy$default(C40000qFq c40000qFq, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c40000qFq.EZpvd;
        }
        return c40000qFq.OLrzqt(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40000qFq OLrzqt(java.lang.String str) {
        return new C40000qFq(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C40000qFq) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((C40000qFq) obj).EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.EZpvd;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchResultDefiWeb3InfoVo(baseIconUrl=" + this.EZpvd + ")";
    }

    public C40000qFq(java.lang.String str) {
        this.EZpvd = str;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C40000qFq) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C40000qFq) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }
}
