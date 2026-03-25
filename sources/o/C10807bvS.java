package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bvS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10807bvS {
    public final java.lang.String AEQbTJ;
    public final int KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C10807bvS copy$default(C10807bvS c10807bvS, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c10807bvS.KWHzl;
        }
        if ((i2 & 2) != 0) {
            str = c10807bvS.AEQbTJ;
        }
        return c10807bvS.AEQbTJ(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10807bvS AEQbTJ(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C10807bvS(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10807bvS)) {
            return false;
        }
        C10807bvS c10807bvS = (C10807bvS) obj;
        return this.KWHzl == c10807bvS.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c10807bvS.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.KWHzl) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CheckBtcAssetsForDappResult(txnStatus=" + this.KWHzl + ", privKey=" + this.AEQbTJ + ")";
    }

    public C10807bvS(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = i;
        this.AEQbTJ = str;
    }
}
