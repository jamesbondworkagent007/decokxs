package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.owZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37582owZ {
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C37582owZ copy$default(C37582owZ c37582owZ, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c37582owZ.KWHzl;
        }
        return c37582owZ.EZpvd(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37582owZ EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C37582owZ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37582owZ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((C37582owZ) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ShareMessageErrorContentModel(text=" + this.KWHzl + ")";
    }

    public C37582owZ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }
}
