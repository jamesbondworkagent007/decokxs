package o;

import com.okinc.im.config.page.IMPageType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nrn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35252nrn {
    public final IMPageType EZpvd;
    public final InterfaceC35277nsL copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C35252nrn copy$default(C35252nrn c35252nrn, IMPageType iMPageType, InterfaceC35277nsL interfaceC35277nsL, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            iMPageType = c35252nrn.EZpvd;
        }
        if ((i & 2) != 0) {
            interfaceC35277nsL = c35252nrn.copydefault;
        }
        return c35252nrn.copydefault(iMPageType, interfaceC35277nsL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IMPageType EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35252nrn copydefault(@NotNull IMPageType iMPageType, @NotNull InterfaceC35277nsL interfaceC35277nsL) {
        Intrinsics.checkNotNullParameter(iMPageType, "");
        Intrinsics.checkNotNullParameter(interfaceC35277nsL, "");
        return new C35252nrn(iMPageType, interfaceC35277nsL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC35277nsL copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35252nrn)) {
            return false;
        }
        C35252nrn c35252nrn = (C35252nrn) obj;
        return this.EZpvd == c35252nrn.EZpvd && Intrinsics.EZpvd(this.copydefault, c35252nrn.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PageTypeSendMessageInterceptorData(pageType=" + this.EZpvd + ", interceptor=" + this.copydefault + ")";
    }

    public C35252nrn(@NotNull IMPageType iMPageType, @NotNull InterfaceC35277nsL interfaceC35277nsL) {
        Intrinsics.checkNotNullParameter(iMPageType, "");
        Intrinsics.checkNotNullParameter(interfaceC35277nsL, "");
        this.EZpvd = iMPageType;
        this.copydefault = interfaceC35277nsL;
    }
}
