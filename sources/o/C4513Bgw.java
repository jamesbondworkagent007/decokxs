package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.panic.FfiConverterTypePanicHandlerInterface;
import uniffi.panic.IntegrityCheckingUniffiLib;
import uniffi.panic.UniffiLib;

/* JADX INFO: renamed from: o.Bgw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C4513Bgw {
    public static final RustBuffer uniffiRustBuffer = new RustBuffer(new Application());

    /* JADX INFO: renamed from: o.Bgw$Application */
    public static final class Application implements InterfaceC60174zxk {
        @Override // o.InterfaceC60174zxk
        public RustBuffer.ByValue alloc(long j, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.ffi_panic_rustbuffer_alloc(j, uniffiRustCallStatus);
        }

        @Override // o.InterfaceC60174zxk
        public void free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            UniffiLib.INSTANCE.ffi_panic_rustbuffer_free(byValue, uniffiRustCallStatus);
        }
    }

    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_panic_uniffi_contract_version()) {
            throw new java.lang.RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = IntegrityCheckingUniffiLib.INSTANCE;
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
    }

    public static final void registerPanicHandler(@NotNull final InterfaceC4503Bgm interfaceC4503Bgm) {
        Intrinsics.checkNotNullParameter(interfaceC4503Bgm, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BgA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4513Bgw.registerPanicHandler$lambda$0(interfaceC4503Bgm, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerPanicHandler$lambda$0(InterfaceC4503Bgm interfaceC4503Bgm, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_panic_fn_func_register_panic_handler(FfiConverterTypePanicHandlerInterface.INSTANCE.lower2(interfaceC4503Bgm).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
