package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C55444xk {
    public final java.lang.String AEQbTJ;
    public final java.lang.String KWHzl;
    public final C5036Cg OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C55444xk copy$default(C55444xk c55444xk, C5036Cg c5036Cg, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c5036Cg = c55444xk.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = c55444xk.AEQbTJ;
        }
        if ((i & 4) != 0) {
            str2 = c55444xk.copydefault;
        }
        if ((i & 8) != 0) {
            str3 = c55444xk.KWHzl;
        }
        return c55444xk.AEQbTJ(c5036Cg, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55444xk AEQbTJ(@NotNull C5036Cg c5036Cg, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(c5036Cg, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C55444xk(c5036Cg, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5036Cg OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55444xk)) {
            return false;
        }
        C55444xk c55444xk = (C55444xk) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c55444xk.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c55444xk.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c55444xk.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c55444xk.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CanonicalRequest(request=" + this.OLrzqt + ", requestString=" + this.AEQbTJ + ", signedHeaders=" + this.copydefault + ", hash=" + this.KWHzl + ')';
    }

    public C55444xk(@NotNull C5036Cg c5036Cg, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(c5036Cg, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.OLrzqt = c5036Cg;
        this.AEQbTJ = str;
        this.copydefault = str2;
        this.KWHzl = str3;
    }
}
