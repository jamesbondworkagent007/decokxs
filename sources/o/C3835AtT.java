package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AtT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C3835AtT implements InterfaceC60170zxg {
    public static final int $stable = 8;
    public InterfaceC3910Auq copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3835AtT copy$default(C3835AtT c3835AtT, InterfaceC3910Auq interfaceC3910Auq, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC3910Auq = c3835AtT.copydefault;
        }
        return c3835AtT.copydefault(interfaceC3910Auq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC3910Auq KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3835AtT copydefault(@NotNull InterfaceC3910Auq interfaceC3910Auq) {
        Intrinsics.checkNotNullParameter(interfaceC3910Auq, "");
        return new C3835AtT(interfaceC3910Auq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3835AtT) && Intrinsics.EZpvd(this.copydefault, ((C3835AtT) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanListDependencies(localization=" + this.copydefault + ")";
    }

    public C3835AtT(@NotNull InterfaceC3910Auq interfaceC3910Auq) {
        Intrinsics.checkNotNullParameter(interfaceC3910Auq, "");
        this.copydefault = interfaceC3910Auq;
    }

    @Override // o.InterfaceC60170zxg
    public void destroy() {
        InterfaceC60170zxg.Companion.copydefault(this.copydefault);
    }
}
