package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.app_state.AppState;
import uniffi.app_state.FfiConverterTypeAppState;
import uniffi.app_state.FfiConverterTypeAppSupportInterface;
import uniffi.app_state.IntegrityCheckingUniffiLib;
import uniffi.app_state.UniffiLib;

/* JADX INFO: renamed from: o.AoQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C3567AoQ {
    public static final RustBuffer uniffiRustBuffer = new RustBuffer(new TaskDescription());

    /* JADX INFO: renamed from: o.AoQ$TaskDescription */
    public static final class TaskDescription implements InterfaceC60174zxk {
        @Override // o.InterfaceC60174zxk
        public RustBuffer.ByValue alloc(long j, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.ffi_app_state_rustbuffer_alloc(j, uniffiRustCallStatus);
        }

        @Override // o.InterfaceC60174zxk
        public void free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            UniffiLib.INSTANCE.ffi_app_state_rustbuffer_free(byValue, uniffiRustCallStatus);
        }
    }

    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_app_state_uniffi_contract_version()) {
            throw new java.lang.RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = IntegrityCheckingUniffiLib.INSTANCE;
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
    }

    public static final void appSupportNotifyMemoryWarning() {
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AoV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3567AoQ.appSupportNotifyMemoryWarning$lambda$0((UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit appSupportNotifyMemoryWarning$lambda$0(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_app_state_fn_func_app_support_notify_memory_warning(uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void appSupportNotifyStateChange(@NotNull final AppState appState) {
        Intrinsics.checkNotNullParameter(appState, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AoU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3567AoQ.appSupportNotifyStateChange$lambda$1(appState, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit appSupportNotifyStateChange$lambda$1(AppState appState, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_app_state_fn_func_app_support_notify_state_change(FfiConverterTypeAppState.INSTANCE.lower2((java.lang.Object) appState), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void appSupportNotifyWillTerminate() {
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AoX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3567AoQ.appSupportNotifyWillTerminate$lambda$2((UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit appSupportNotifyWillTerminate$lambda$2(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_app_state_fn_func_app_support_notify_will_terminate(uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void registerAppSupport(@NotNull final InterfaceC3563AoM interfaceC3563AoM) {
        Intrinsics.checkNotNullParameter(interfaceC3563AoM, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AoY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3567AoQ.registerAppSupport$lambda$3(interfaceC3563AoM, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerAppSupport$lambda$3(InterfaceC3563AoM interfaceC3563AoM, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_app_state_fn_func_register_app_support(FfiConverterTypeAppSupportInterface.INSTANCE.lower2(interfaceC3563AoM).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
