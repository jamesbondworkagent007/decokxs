package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fFc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17432fFc {
    public final AbstractC12782ctV KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C17432fFc copy$default(C17432fFc c17432fFc, AbstractC12782ctV abstractC12782ctV, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            abstractC12782ctV = c17432fFc.KWHzl;
        }
        return c17432fFc.copydefault(abstractC12782ctV);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C17432fFc copydefault(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return new C17432fFc(abstractC12782ctV);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17432fFc) && Intrinsics.EZpvd(this.KWHzl, ((C17432fFc) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WalletManageSmartAccountTipBean(wallet=" + this.KWHzl + ")";
    }

    public C17432fFc(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        this.KWHzl = abstractC12782ctV;
    }
}
