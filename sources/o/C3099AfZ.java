package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.account.FfiConverterString;
import uniffi.account.FfiConverterTypeTrustedDeviceJourneyState;
import uniffi.account.UniffiLib;

/* JADX INFO: renamed from: o.AfZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3099AfZ {
    public static final int $stable = 8;
    public zAW AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3099AfZ copy$default(C3099AfZ c3099AfZ, zAW zaw, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            zaw = c3099AfZ.AEQbTJ;
        }
        return c3099AfZ.EZpvd(zaw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3099AfZ EZpvd(@NotNull zAW zaw) {
        Intrinsics.checkNotNullParameter(zaw, "");
        return new C3099AfZ(zaw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zAW copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3099AfZ) && Intrinsics.EZpvd(this.AEQbTJ, ((C3099AfZ) obj).AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.AEQbTJ.hashCode();
    }

    public C3099AfZ(@NotNull zAW zaw) {
        Intrinsics.checkNotNullParameter(zaw, "");
        this.AEQbTJ = zaw;
    }

    public java.lang.String toString() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.Agb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3099AfZ.toString$lambda$0(this.AEQbTJ, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue toString$lambda$0(C3099AfZ c3099AfZ, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_trusteddevicejourneystate_uniffi_trait_debug(FfiConverterTypeTrustedDeviceJourneyState.INSTANCE.lower2((java.lang.Object) c3099AfZ), uniffiRustCallStatus);
    }
}
