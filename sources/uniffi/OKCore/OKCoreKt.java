package uniffi.OKCore;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60174zxk;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes25.dex */
public final class OKCoreKt {
    private static final RustBuffer uniffiRustBuffer = new RustBuffer(new InterfaceC60174zxk() { // from class: uniffi.OKCore.OKCoreKt$uniffiRustBuffer$1
        @Override // o.InterfaceC60174zxk
        public RustBuffer.ByValue alloc(long j, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.ffi_OKCore_rustbuffer_alloc(j, uniffiRustCallStatus);
        }

        @Override // o.InterfaceC60174zxk
        public void free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            UniffiLib.INSTANCE.ffi_OKCore_rustbuffer_free(byValue, uniffiRustCallStatus);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_OKCore_uniffi_contract_version()) {
            throw new RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = IntegrityCheckingUniffiLib.INSTANCE;
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
    }
}
