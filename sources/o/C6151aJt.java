package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aJt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C6151aJt {
    public final androidx.fragment.app.Fragment KWHzl;
    public final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C6151aJt copy$default(C6151aJt c6151aJt, int i, androidx.fragment.app.Fragment fragment, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c6151aJt.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            fragment = c6151aJt.KWHzl;
        }
        return c6151aJt.EZpvd(i, fragment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final androidx.fragment.app.Fragment AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C6151aJt EZpvd(int i, @NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return new C6151aJt(i, fragment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6151aJt)) {
            return false;
        }
        C6151aJt c6151aJt = (C6151aJt) obj;
        return this.OLrzqt == c6151aJt.OLrzqt && Intrinsics.EZpvd(this.KWHzl, c6151aJt.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.OLrzqt) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PasskeyManagementTabData(titleRes=" + this.OLrzqt + ", fragment=" + this.KWHzl + ")";
    }

    public C6151aJt(int i, @NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.OLrzqt = i;
        this.KWHzl = fragment;
    }
}
