package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ztE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59976ztE<R> {
    public final AbstractC59982ztK<R> EZpvd;
    public final C59991ztT KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ztE */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C59976ztE copy$default(C59976ztE c59976ztE, C59991ztT c59991ztT, AbstractC59982ztK abstractC59982ztK, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c59991ztT = c59976ztE.KWHzl;
        }
        if ((i & 2) != 0) {
            abstractC59982ztK = c59976ztE.EZpvd;
        }
        return c59976ztE.AEQbTJ(c59991ztT, abstractC59982ztK);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59976ztE<R> AEQbTJ(@NotNull C59991ztT c59991ztT, @NotNull AbstractC59982ztK<R> abstractC59982ztK) {
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(abstractC59982ztK, "");
        return new C59976ztE<>(c59991ztT, abstractC59982ztK);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59991ztT AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC59982ztK<R> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59976ztE)) {
            return false;
        }
        C59976ztE c59976ztE = (C59976ztE) obj;
        return Intrinsics.EZpvd(this.KWHzl, c59976ztE.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c59976ztE.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "KoinDefinition(module=" + this.KWHzl + ", factory=" + this.EZpvd + ')';
    }

    public C59976ztE(@NotNull C59991ztT c59991ztT, @NotNull AbstractC59982ztK<R> abstractC59982ztK) {
        Intrinsics.checkNotNullParameter(c59991ztT, "");
        Intrinsics.checkNotNullParameter(abstractC59982ztK, "");
        this.KWHzl = c59991ztT;
        this.EZpvd = abstractC59982ztK;
    }
}
