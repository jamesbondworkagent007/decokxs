package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uxI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49898uxI implements InterfaceC49899uxJ {
    public final Function0<java.lang.Boolean> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uxI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C49898uxI copy$default(C49898uxI c49898uxI, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = c49898uxI.copydefault;
        }
        return c49898uxI.copydefault(function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49899uxJ
    public Function0<java.lang.Boolean> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C49898uxI copydefault(@NotNull Function0<java.lang.Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        return new C49898uxI(function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C49898uxI) && Intrinsics.EZpvd(this.copydefault, ((C49898uxI) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarginSwitchInitParamsMultiPmAccount(isSupportMargin=" + this.copydefault + ")";
    }

    public C49898uxI(@NotNull Function0<java.lang.Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = function0;
    }
}
