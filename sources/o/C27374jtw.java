package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jtw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27374jtw implements InterfaceC27436jvE {
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C27374jtw copy$default(C27374jtw c27374jtw, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c27374jtw.copydefault;
        }
        return c27374jtw.copydefault(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27374jtw copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C27374jtw(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27374jtw) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((C27374jtw) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UiTokenListTitleItem(title=" + this.copydefault + ")";
    }

    public C27374jtw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    @Override // o.InterfaceC27436jvE
    public boolean EZpvd(@NotNull InterfaceC27436jvE interfaceC27436jvE) {
        Intrinsics.checkNotNullParameter(interfaceC27436jvE, "");
        C27374jtw c27374jtw = interfaceC27436jvE instanceof C27374jtw ? (C27374jtw) interfaceC27436jvE : null;
        if (c27374jtw == null) {
            return false;
        }
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c27374jtw.copydefault);
    }

    @Override // o.InterfaceC27436jvE
    public boolean KWHzl(@NotNull InterfaceC27436jvE interfaceC27436jvE) {
        Intrinsics.checkNotNullParameter(interfaceC27436jvE, "");
        C27374jtw c27374jtw = interfaceC27436jvE instanceof C27374jtw ? (C27374jtw) interfaceC27436jvE : null;
        if (c27374jtw == null) {
            return false;
        }
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c27374jtw.copydefault);
    }
}
