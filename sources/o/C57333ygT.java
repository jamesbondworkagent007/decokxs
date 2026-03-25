package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ygT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57333ygT {
    public final InterfaceC57336ygW OLrzqt;
    public final com.okinc.jsbridge.Message copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C57333ygT copy$default(C57333ygT c57333ygT, com.okinc.jsbridge.Message message, InterfaceC57336ygW interfaceC57336ygW, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            message = c57333ygT.copydefault;
        }
        if ((i & 2) != 0) {
            interfaceC57336ygW = c57333ygT.OLrzqt;
        }
        return c57333ygT.KWHzl(message, interfaceC57336ygW);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC57336ygW EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57333ygT KWHzl(@NotNull com.okinc.jsbridge.Message message, @NotNull InterfaceC57336ygW interfaceC57336ygW) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(interfaceC57336ygW, "");
        return new C57333ygT(message, interfaceC57336ygW);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final com.okinc.jsbridge.Message OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57333ygT)) {
            return false;
        }
        C57333ygT c57333ygT = (C57333ygT) obj;
        return Intrinsics.EZpvd(this.copydefault, c57333ygT.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c57333ygT.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "JSBridgeData(message=" + this.copydefault + ", callback=" + this.OLrzqt + ")";
    }

    public C57333ygT(@NotNull com.okinc.jsbridge.Message message, @NotNull InterfaceC57336ygW interfaceC57336ygW) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(interfaceC57336ygW, "");
        this.copydefault = message;
        this.OLrzqt = interfaceC57336ygW;
    }
}
