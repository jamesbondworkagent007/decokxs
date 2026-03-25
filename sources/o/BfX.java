package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.oklogging.FfiConverterTypePlatformLogger;
import uniffi.oklogging.IntegrityCheckingUniffiLib;
import uniffi.oklogging.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public final class BfX {
    public static final RustBuffer uniffiRustBuffer = new RustBuffer(new Activity());

    public static final class Activity implements InterfaceC60174zxk {
        @Override // o.InterfaceC60174zxk
        public RustBuffer.ByValue alloc(long j, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.ffi_oklogging_rustbuffer_alloc(j, uniffiRustCallStatus);
        }

        @Override // o.InterfaceC60174zxk
        public void free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            UniffiLib.INSTANCE.ffi_oklogging_rustbuffer_free(byValue, uniffiRustCallStatus);
        }
    }

    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_oklogging_uniffi_contract_version()) {
            throw new java.lang.RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = IntegrityCheckingUniffiLib.INSTANCE;
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
    }

    public static final void registerPlatformLogger(@NotNull final InterfaceC4494Bgd interfaceC4494Bgd) {
        Intrinsics.checkNotNullParameter(interfaceC4494Bgd, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.Bgf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BfX.registerPlatformLogger$lambda$0(interfaceC4494Bgd, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerPlatformLogger$lambda$0(InterfaceC4494Bgd interfaceC4494Bgd, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_oklogging_fn_func_register_platform_logger(FfiConverterTypePlatformLogger.INSTANCE.lower2(interfaceC4494Bgd).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
