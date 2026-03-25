package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gRy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19858gRy {
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C19858gRy copy$default(C19858gRy c19858gRy, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c19858gRy.copydefault;
        }
        return c19858gRy.EZpvd(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C19858gRy EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C19858gRy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19858gRy) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((C19858gRy) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TradeWithAdvancedOrderItem(chainId=" + this.copydefault + ")";
    }

    public C19858gRy(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }
}
