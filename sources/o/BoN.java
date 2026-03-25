package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.settings.FfiConverterTypeSettingsServiceForeignHandling;
import uniffi.settings.IntegrityCheckingUniffiLib;
import uniffi.settings.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public final class BoN {
    public static final RustBuffer uniffiRustBuffer = new RustBuffer(new StateListAnimator());

    public static final class StateListAnimator implements InterfaceC60174zxk {
        @Override // o.InterfaceC60174zxk
        public RustBuffer.ByValue alloc(long j, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.ffi_settings_rustbuffer_alloc(j, uniffiRustCallStatus);
        }

        @Override // o.InterfaceC60174zxk
        public void free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            UniffiLib.INSTANCE.ffi_settings_rustbuffer_free(byValue, uniffiRustCallStatus);
        }
    }

    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_settings_uniffi_contract_version()) {
            throw new java.lang.RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = IntegrityCheckingUniffiLib.INSTANCE;
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
    }

    public static final InterfaceC4736Bpc getSettingsService() {
        return FfiConverterTypeSettingsServiceForeignHandling.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BoK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BoN.getSettingsService$lambda$0((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long getSettingsService$lambda$0(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_settings_fn_func_get_settings_service(uniffiRustCallStatus);
    }
}
