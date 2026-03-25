package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC9836bdB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bdH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9842bdH<T extends AbstractC9836bdB> {
    public final T AEQbTJ;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.bdH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C9842bdH copy$default(C9842bdH c9842bdH, java.lang.String str, java.lang.String str2, AbstractC9836bdB abstractC9836bdB, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c9842bdH.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = c9842bdH.KWHzl;
        }
        if ((i & 4) != 0) {
            abstractC9836bdB = c9842bdH.AEQbTJ;
        }
        return c9842bdH.OLrzqt(str, str2, abstractC9836bdB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9842bdH<T> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull T t) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(t, "");
        return new C9842bdH<>(str, str2, t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9842bdH)) {
            return false;
        }
        C9842bdH c9842bdH = (C9842bdH) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c9842bdH.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c9842bdH.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c9842bdH.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OKWalletSignedTxResp(signedTx=" + this.copydefault + ", txHash=" + this.KWHzl + ", reqData=" + this.AEQbTJ + ")";
    }

    public C9842bdH(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull T t) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(t, "");
        this.copydefault = str;
        this.KWHzl = str2;
        this.AEQbTJ = t;
    }
}
