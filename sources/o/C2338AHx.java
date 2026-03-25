package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.environment.FfiConverterTypeAppInfoInterface;
import uniffi.environment.FfiConverterTypeDeviceInfoInterface;
import uniffi.environment.IntegrityCheckingUniffiLib;
import uniffi.environment.UniffiLib;

/* JADX INFO: renamed from: o.AHx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C2338AHx {
    public static final RustBuffer uniffiRustBuffer = new RustBuffer(new Application());

    /* JADX INFO: renamed from: o.AHx$Application */
    public static final class Application implements InterfaceC60174zxk {
        @Override // o.InterfaceC60174zxk
        public RustBuffer.ByValue alloc(long j, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.ffi_environment_rustbuffer_alloc(j, uniffiRustCallStatus);
        }

        @Override // o.InterfaceC60174zxk
        public void free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            UniffiLib.INSTANCE.ffi_environment_rustbuffer_free(byValue, uniffiRustCallStatus);
        }
    }

    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_environment_uniffi_contract_version()) {
            throw new java.lang.RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = IntegrityCheckingUniffiLib.INSTANCE;
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
    }

    public static final void registerAppInfo(@NotNull final AGR agr) {
        Intrinsics.checkNotNullParameter(agr, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AHv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2338AHx.registerAppInfo$lambda$0(agr, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerAppInfo$lambda$0(AGR agr, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_environment_fn_func_register_app_info(FfiConverterTypeAppInfoInterface.INSTANCE.lower2(agr).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void registerDeviceInfo(@NotNull final InterfaceC2322AHh interfaceC2322AHh) {
        Intrinsics.checkNotNullParameter(interfaceC2322AHh, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AHy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2338AHx.registerDeviceInfo$lambda$1(interfaceC2322AHh, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerDeviceInfo$lambda$1(InterfaceC2322AHh interfaceC2322AHh, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_environment_fn_func_register_device_info(FfiConverterTypeDeviceInfoInterface.INSTANCE.lower2(interfaceC2322AHh).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
