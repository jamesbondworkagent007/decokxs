package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.shared_preference.FfiConverterTypeSharedPreferencesInterface;
import uniffi.shared_preference.IntegrityCheckingUniffiLib;
import uniffi.shared_preference.UniffiLib;

/* JADX INFO: renamed from: o.Bsr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C4832Bsr {
    public static final RustBuffer uniffiRustBuffer = new RustBuffer(new StateListAnimator());

    /* JADX INFO: renamed from: o.Bsr$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC60174zxk {
        @Override // o.InterfaceC60174zxk
        public RustBuffer.ByValue alloc(long j, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.ffi_shared_preference_rustbuffer_alloc(j, uniffiRustCallStatus);
        }

        @Override // o.InterfaceC60174zxk
        public void free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            UniffiLib.INSTANCE.ffi_shared_preference_rustbuffer_free(byValue, uniffiRustCallStatus);
        }
    }

    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_shared_preference_uniffi_contract_version()) {
            throw new java.lang.RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = IntegrityCheckingUniffiLib.INSTANCE;
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
    }

    public static final void registerSharedPreferences(@NotNull final InterfaceC4812Bry interfaceC4812Bry) {
        Intrinsics.checkNotNullParameter(interfaceC4812Bry, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.Bsp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4832Bsr.registerSharedPreferences$lambda$0(interfaceC4812Bry, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerSharedPreferences$lambda$0(InterfaceC4812Bry interfaceC4812Bry, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_shared_preference_fn_func_register_shared_preferences(FfiConverterTypeSharedPreferencesInterface.INSTANCE.lower2(interfaceC4812Bry).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
