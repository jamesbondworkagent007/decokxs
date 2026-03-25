package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.baW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9698baW {
    public final java.lang.Long AEQbTJ;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C9698baW copy$default(C9698baW c9698baW, java.lang.Long l, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = c9698baW.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = c9698baW.OLrzqt;
        }
        return c9698baW.copydefault(l, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9698baW copydefault(java.lang.Long l, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C9698baW(l, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9698baW)) {
            return false;
        }
        C9698baW c9698baW = (C9698baW) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c9698baW.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c9698baW.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Long l = this.AEQbTJ;
        return ((l == null ? 0 : l.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ChainAddressBean(chainId=" + this.AEQbTJ + ", address=" + this.OLrzqt + ")";
    }

    public C9698baW(java.lang.Long l, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = l;
        this.OLrzqt = str;
    }
}
