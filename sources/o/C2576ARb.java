package o;

import kotlin.jvm.internal.Intrinsics;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.interactor.IntegrityCheckingUniffiLib;
import uniffi.interactor.UniffiLib;

/* JADX INFO: renamed from: o.ARb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C2576ARb {
    public static final RustBuffer uniffiRustBuffer = new RustBuffer(new Activity());

    /* JADX INFO: renamed from: o.ARb$Activity */
    public static final class Activity implements InterfaceC60174zxk {
        @Override // o.InterfaceC60174zxk
        public RustBuffer.ByValue alloc(long j, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.ffi_interactor_rustbuffer_alloc(j, uniffiRustCallStatus);
        }

        @Override // o.InterfaceC60174zxk
        public void free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            UniffiLib.INSTANCE.ffi_interactor_rustbuffer_free(byValue, uniffiRustCallStatus);
        }
    }

    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_interactor_uniffi_contract_version()) {
            throw new java.lang.RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = IntegrityCheckingUniffiLib.INSTANCE;
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
    }
}
