package o;

import com.okinc.im.config.page.IMPageType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nri, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35247nri {
    public final IMPageType AEQbTJ;
    public final InterfaceC35280nsO copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C35247nri copy$default(C35247nri c35247nri, IMPageType iMPageType, InterfaceC35280nsO interfaceC35280nsO, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            iMPageType = c35247nri.AEQbTJ;
        }
        if ((i & 2) != 0) {
            interfaceC35280nsO = c35247nri.copydefault;
        }
        return c35247nri.AEQbTJ(iMPageType, interfaceC35280nsO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35247nri AEQbTJ(@NotNull IMPageType iMPageType, @NotNull InterfaceC35280nsO interfaceC35280nsO) {
        Intrinsics.checkNotNullParameter(iMPageType, "");
        Intrinsics.checkNotNullParameter(interfaceC35280nsO, "");
        return new C35247nri(iMPageType, interfaceC35280nsO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC35280nsO KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IMPageType copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35247nri)) {
            return false;
        }
        C35247nri c35247nri = (C35247nri) obj;
        return this.AEQbTJ == c35247nri.AEQbTJ && Intrinsics.EZpvd(this.copydefault, c35247nri.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PageTypeInterceptorData(pageType=" + this.AEQbTJ + ", interceptor=" + this.copydefault + ")";
    }

    public C35247nri(@NotNull IMPageType iMPageType, @NotNull InterfaceC35280nsO interfaceC35280nsO) {
        Intrinsics.checkNotNullParameter(iMPageType, "");
        Intrinsics.checkNotNullParameter(interfaceC35280nsO, "");
        this.AEQbTJ = iMPageType;
        this.copydefault = interfaceC35280nsO;
    }
}
