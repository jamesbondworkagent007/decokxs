package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jUv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26178jUv implements InterfaceC26171jUo {
    public final boolean AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C26178jUv copy$default(C26178jUv c26178jUv, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c26178jUv.AEQbTJ;
        }
        return c26178jUv.OLrzqt(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26178jUv OLrzqt(boolean z) {
        return new C26178jUv(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC26171jUo
    public boolean OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26178jUv) && this.AEQbTJ == ((C26178jUv) obj).AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarketFavoritesListTitleVo(isSelected=" + this.AEQbTJ + ")";
    }

    public C26178jUv(boolean z) {
        this.AEQbTJ = z;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return interfaceC40516qYt instanceof C26178jUv;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C26178jUv) && OLrzqt() == ((C26178jUv) interfaceC40516qYt).OLrzqt();
    }

    @Override // o.InterfaceC26171jUo
    public InterfaceC26171jUo KWHzl(boolean z) {
        return OLrzqt(z);
    }
}
