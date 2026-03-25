package o;

import com.okinc.business.defi.api.model.tx.SignAuthType;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC9836bdB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bdI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9843bdI<T extends AbstractC9836bdB> {
    public final java.util.List<C9842bdH<T>> EZpvd;
    public final SignAuthType KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.bdI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C9843bdI copy$default(C9843bdI c9843bdI, SignAuthType signAuthType, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            signAuthType = c9843bdI.KWHzl;
        }
        if ((i & 2) != 0) {
            list = c9843bdI.EZpvd;
        }
        return c9843bdI.AEQbTJ(signAuthType, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9843bdI<T> AEQbTJ(SignAuthType signAuthType, @NotNull java.util.List<C9842bdH<T>> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C9843bdI<>(signAuthType, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C9842bdH<T>> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignAuthType copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9843bdI)) {
            return false;
        }
        C9843bdI c9843bdI = (C9843bdI) obj;
        return this.KWHzl == c9843bdI.KWHzl && Intrinsics.EZpvd(this.EZpvd, c9843bdI.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        SignAuthType signAuthType = this.KWHzl;
        return ((signAuthType == null ? 0 : signAuthType.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SignTransactionsResult(signAuthType=" + this.KWHzl + ", signedTxList=" + this.EZpvd + ")";
    }

    public C9843bdI(SignAuthType signAuthType, @NotNull java.util.List<C9842bdH<T>> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = signAuthType;
        this.EZpvd = list;
    }
}
