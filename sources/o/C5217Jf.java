package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Jf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5217Jf {
    public final C5242Ke copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C5217Jf copy$default(C5217Jf c5217Jf, C5242Ke c5242Ke, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c5242Ke = c5217Jf.copydefault;
        }
        return c5217Jf.OLrzqt(c5242Ke);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5217Jf OLrzqt(@NotNull C5242Ke c5242Ke) {
        Intrinsics.checkNotNullParameter(c5242Ke, "");
        return new C5217Jf(c5242Ke);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5242Ke OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5217Jf) && Intrinsics.EZpvd(this.copydefault, ((C5217Jf) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "EventQueueMessage(event=" + this.copydefault + ')';
    }

    public C5217Jf(@NotNull C5242Ke c5242Ke) {
        Intrinsics.checkNotNullParameter(c5242Ke, "");
        this.copydefault = c5242Ke;
    }
}
