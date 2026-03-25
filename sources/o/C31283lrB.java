package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lrB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31283lrB {
    public final boolean AEQbTJ;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C31283lrB copy$default(C31283lrB c31283lrB, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c31283lrB.KWHzl;
        }
        if ((i & 2) != 0) {
            z = c31283lrB.AEQbTJ;
        }
        return c31283lrB.AEQbTJ(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31283lrB AEQbTJ(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C31283lrB(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31283lrB)) {
            return false;
        }
        C31283lrB c31283lrB = (C31283lrB) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c31283lrB.KWHzl) && this.AEQbTJ == c31283lrB.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SubmitTransactionInfo(orderId=" + this.KWHzl + ", needShareLink=" + this.AEQbTJ + ")";
    }

    public C31283lrB(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.AEQbTJ = z;
    }
}
