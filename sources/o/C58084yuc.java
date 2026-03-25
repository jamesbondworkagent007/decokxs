package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yuc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58084yuc {
    public final InterfaceC58217yxC KWHzl;
    public final InterfaceC58092yuk copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C58084yuc copy$default(C58084yuc c58084yuc, InterfaceC58092yuk interfaceC58092yuk, InterfaceC58217yxC interfaceC58217yxC, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC58092yuk = c58084yuc.copydefault;
        }
        if ((i & 2) != 0) {
            interfaceC58217yxC = c58084yuc.KWHzl;
        }
        return c58084yuc.EZpvd(interfaceC58092yuk, interfaceC58217yxC);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58084yuc EZpvd(@NotNull InterfaceC58092yuk interfaceC58092yuk, @NotNull InterfaceC58217yxC interfaceC58217yxC) {
        Intrinsics.checkNotNullParameter(interfaceC58092yuk, "");
        Intrinsics.checkNotNullParameter(interfaceC58217yxC, "");
        return new C58084yuc(interfaceC58092yuk, interfaceC58217yxC);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC58092yuk copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58084yuc)) {
            return false;
        }
        C58084yuc c58084yuc = (C58084yuc) obj;
        return Intrinsics.EZpvd(this.copydefault, c58084yuc.copydefault) && Intrinsics.EZpvd(this.KWHzl, c58084yuc.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Session(webSocket=" + this.copydefault + ", webSocketDisposable=" + this.KWHzl + ')';
    }

    public C58084yuc(@NotNull InterfaceC58092yuk interfaceC58092yuk, @NotNull InterfaceC58217yxC interfaceC58217yxC) {
        Intrinsics.checkNotNullParameter(interfaceC58092yuk, "");
        Intrinsics.checkNotNullParameter(interfaceC58217yxC, "");
        this.copydefault = interfaceC58092yuk;
        this.KWHzl = interfaceC58217yxC;
    }
}
