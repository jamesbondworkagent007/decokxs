package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.account.FfiConverterString;
import uniffi.account.FfiConverterTypeNewDeviceConfirmState;
import uniffi.account.UniffiLib;

/* JADX INFO: loaded from: classes17.dex */
public final class zKL {
    public static final int $stable = 8;
    public long OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ zKL copy$default(zKL zkl, java.lang.String str, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = zkl.copydefault;
        }
        if ((i & 2) != 0) {
            j = zkl.OLrzqt;
        }
        return zkl.copydefault(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zKL copydefault(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new zKL(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zKL)) {
            return false;
        }
        zKL zkl = (zKL) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) zkl.copydefault) && this.OLrzqt == zkl.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + java.lang.Long.hashCode(this.OLrzqt);
    }

    public zKL(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.OLrzqt = j;
    }

    public java.lang.String toString() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zKO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zKL.toString$lambda$0(this.OLrzqt, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue toString$lambda$0(zKL zkl, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_newdeviceconfirmstate_uniffi_trait_debug(FfiConverterTypeNewDeviceConfirmState.INSTANCE.lower2((java.lang.Object) zkl), uniffiRustCallStatus);
    }
}
