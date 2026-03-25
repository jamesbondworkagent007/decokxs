package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Are, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C3740Are implements InterfaceC60170zxg {
    public static final int $stable = 8;
    public InterfaceC3752Arq EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3740Are copy$default(C3740Are c3740Are, InterfaceC3752Arq interfaceC3752Arq, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC3752Arq = c3740Are.EZpvd;
        }
        return c3740Are.OLrzqt(interfaceC3752Arq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC3752Arq KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3740Are OLrzqt(@NotNull InterfaceC3752Arq interfaceC3752Arq) {
        Intrinsics.checkNotNullParameter(interfaceC3752Arq, "");
        return new C3740Are(interfaceC3752Arq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3740Are) && Intrinsics.EZpvd(this.EZpvd, ((C3740Are) obj).EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BuySellOrderDetailDependencies(localization=" + this.EZpvd + ")";
    }

    public C3740Are(@NotNull InterfaceC3752Arq interfaceC3752Arq) {
        Intrinsics.checkNotNullParameter(interfaceC3752Arq, "");
        this.EZpvd = interfaceC3752Arq;
    }

    @Override // o.InterfaceC60170zxg
    public void destroy() {
        InterfaceC60170zxg.Companion.copydefault(this.EZpvd);
    }
}
