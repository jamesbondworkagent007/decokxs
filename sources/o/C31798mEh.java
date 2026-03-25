package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mEh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31798mEh {
    public final InterfaceC31793mEc EZpvd;
    public final C31800mEj OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C31798mEh copy$default(C31798mEh c31798mEh, C31800mEj c31800mEj, InterfaceC31793mEc interfaceC31793mEc, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c31800mEj = c31798mEh.OLrzqt;
        }
        if ((i & 2) != 0) {
            interfaceC31793mEc = c31798mEh.EZpvd;
        }
        return c31798mEh.copydefault(c31800mEj, interfaceC31793mEc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31798mEh copydefault(@NotNull C31800mEj c31800mEj, @NotNull InterfaceC31793mEc interfaceC31793mEc) {
        Intrinsics.checkNotNullParameter(c31800mEj, "");
        Intrinsics.checkNotNullParameter(interfaceC31793mEc, "");
        return new C31798mEh(c31800mEj, interfaceC31793mEc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31800mEj copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31798mEh)) {
            return false;
        }
        C31798mEh c31798mEh = (C31798mEh) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c31798mEh.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c31798mEh.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CryptoMultiListState(tabState=" + this.OLrzqt + ", contentState=" + this.EZpvd + ")";
    }

    public C31798mEh(@NotNull C31800mEj c31800mEj, @NotNull InterfaceC31793mEc interfaceC31793mEc) {
        Intrinsics.checkNotNullParameter(c31800mEj, "");
        Intrinsics.checkNotNullParameter(interfaceC31793mEc, "");
        this.OLrzqt = c31800mEj;
        this.EZpvd = interfaceC31793mEc;
    }
}
