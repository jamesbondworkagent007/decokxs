package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC41644quh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.quj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41646quj implements InterfaceC41644quh {
    public static final int KWHzl = ActionBar.AEQbTJ;
    public final ActionBar AEQbTJ;
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C41646quj copy$default(C41646quj c41646quj, java.lang.String str, ActionBar actionBar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c41646quj.EZpvd;
        }
        if ((i & 2) != 0) {
            actionBar = c41646quj.AEQbTJ;
        }
        return c41646quj.KWHzl(str, actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41646quj KWHzl(@NotNull java.lang.String str, @NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        return new C41646quj(str, actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActionBar copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41646quj)) {
            return false;
        }
        C41646quj c41646quj = (C41646quj) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c41646quj.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c41646quj.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OptionsChainCoinItemVo(deliverName=" + this.EZpvd + ", rawData=" + this.AEQbTJ + ")";
    }

    public C41646quj(@NotNull java.lang.String str, @NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.EZpvd = str;
        this.AEQbTJ = actionBar;
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
