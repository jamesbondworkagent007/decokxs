package o;

import o.InterfaceC41644quh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41648qul implements InterfaceC41644quh {
    public final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C41648qul copy$default(C41648qul c41648qul, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c41648qul.OLrzqt;
        }
        return c41648qul.copydefault(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41648qul copydefault(@androidx.annotation.StringRes int i) {
        return new C41648qul(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41648qul) && this.OLrzqt == ((C41648qul) obj).OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Integer.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OptionsChainTitleItemVo(titleResId=" + this.OLrzqt + ")";
    }

    public C41648qul(@androidx.annotation.StringRes int i) {
        this.OLrzqt = i;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        return InterfaceC41644quh.ActionBar.AEQbTJ(this, interfaceC40516qYt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        return InterfaceC41644quh.ActionBar.EZpvd(this, interfaceC40516qYt);
    }
}
