package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AuN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C3882AuN implements InterfaceC60170zxg {
    public static final int $stable = 8;
    public InterfaceC3950Ave copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3882AuN copy$default(C3882AuN c3882AuN, InterfaceC3950Ave interfaceC3950Ave, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC3950Ave = c3882AuN.copydefault;
        }
        return c3882AuN.EZpvd(interfaceC3950Ave);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3882AuN EZpvd(@NotNull InterfaceC3950Ave interfaceC3950Ave) {
        Intrinsics.checkNotNullParameter(interfaceC3950Ave, "");
        return new C3882AuN(interfaceC3950Ave);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC3950Ave copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3882AuN) && Intrinsics.EZpvd(this.copydefault, ((C3882AuN) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanOrderListDependencies(localization=" + this.copydefault + ")";
    }

    public C3882AuN(@NotNull InterfaceC3950Ave interfaceC3950Ave) {
        Intrinsics.checkNotNullParameter(interfaceC3950Ave, "");
        this.copydefault = interfaceC3950Ave;
    }

    @Override // o.InterfaceC60170zxg
    public void destroy() {
        InterfaceC60170zxg.Companion.copydefault(this.copydefault);
    }
}
