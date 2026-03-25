package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.account.FfiConverterString;
import uniffi.account.FfiConverterTypeNewDeviceInfoState;
import uniffi.account.UniffiLib;

/* JADX INFO: renamed from: o.zLp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58687zLp {
    public static final int $stable = 8;
    public zAW OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C58687zLp copy$default(C58687zLp c58687zLp, zAW zaw, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            zaw = c58687zLp.OLrzqt;
        }
        return c58687zLp.OLrzqt(zaw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zAW KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58687zLp OLrzqt(@NotNull zAW zaw) {
        Intrinsics.checkNotNullParameter(zaw, "");
        return new C58687zLp(zaw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C58687zLp) && Intrinsics.EZpvd(this.OLrzqt, ((C58687zLp) obj).OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.OLrzqt.hashCode();
    }

    public C58687zLp(@NotNull zAW zaw) {
        Intrinsics.checkNotNullParameter(zaw, "");
        this.OLrzqt = zaw;
    }

    public java.lang.String toString() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zLs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58687zLp.toString$lambda$0(this.OLrzqt, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue toString$lambda$0(C58687zLp c58687zLp, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_newdeviceinfostate_uniffi_trait_debug(FfiConverterTypeNewDeviceInfoState.INSTANCE.lower2((java.lang.Object) c58687zLp), uniffiRustCallStatus);
    }
}
