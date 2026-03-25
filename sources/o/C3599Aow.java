package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.analytics.FfiConverterTypeAnalyticsInterface;
import uniffi.analytics.IntegrityCheckingUniffiLib;
import uniffi.analytics.UniffiLib;

/* JADX INFO: renamed from: o.Aow, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C3599Aow {
    public static final RustBuffer uniffiRustBuffer = new RustBuffer(new StateListAnimator());

    /* JADX INFO: renamed from: o.Aow$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC60174zxk {
        @Override // o.InterfaceC60174zxk
        public RustBuffer.ByValue alloc(long j, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.ffi_analytics_rustbuffer_alloc(j, uniffiRustCallStatus);
        }

        @Override // o.InterfaceC60174zxk
        public void free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            UniffiLib.INSTANCE.ffi_analytics_rustbuffer_free(byValue, uniffiRustCallStatus);
        }
    }

    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_analytics_uniffi_contract_version()) {
            throw new java.lang.RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = IntegrityCheckingUniffiLib.INSTANCE;
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
    }

    public static final void registerAnalytics(@NotNull final InterfaceC3591Aoo interfaceC3591Aoo) {
        Intrinsics.checkNotNullParameter(interfaceC3591Aoo, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AoC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3599Aow.registerAnalytics$lambda$0(interfaceC3591Aoo, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerAnalytics$lambda$0(InterfaceC3591Aoo interfaceC3591Aoo, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_analytics_fn_func_register_analytics(FfiConverterTypeAnalyticsInterface.INSTANCE.lower2(interfaceC3591Aoo).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
