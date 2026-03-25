package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AsA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C3763AsA implements InterfaceC60170zxg {
    public static final int $stable = 8;
    public InterfaceC3849Ath KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3763AsA copy$default(C3763AsA c3763AsA, InterfaceC3849Ath interfaceC3849Ath, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC3849Ath = c3763AsA.KWHzl;
        }
        return c3763AsA.OLrzqt(interfaceC3849Ath);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC3849Ath EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3763AsA OLrzqt(@NotNull InterfaceC3849Ath interfaceC3849Ath) {
        Intrinsics.checkNotNullParameter(interfaceC3849Ath, "");
        return new C3763AsA(interfaceC3849Ath);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3763AsA) && Intrinsics.EZpvd(this.KWHzl, ((C3763AsA) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanDetailDependencies(localization=" + this.KWHzl + ")";
    }

    public C3763AsA(@NotNull InterfaceC3849Ath interfaceC3849Ath) {
        Intrinsics.checkNotNullParameter(interfaceC3849Ath, "");
        this.KWHzl = interfaceC3849Ath;
    }

    @Override // o.InterfaceC60170zxg
    public void destroy() {
        InterfaceC60170zxg.Companion.copydefault(this.KWHzl);
    }
}
