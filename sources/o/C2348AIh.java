package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.experiment.AbTestInstance;
import uniffi.experiment.FfiConverterTypeABTestFactory;
import uniffi.experiment.FfiConverterTypeABTestInstance;
import uniffi.experiment.FfiConverterTypeFeedbackInterface;
import uniffi.experiment.IntegrityCheckingUniffiLib;
import uniffi.experiment.UniffiLib;

/* JADX INFO: renamed from: o.AIh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C2348AIh {
    public static final RustBuffer uniffiRustBuffer = new RustBuffer(new Application());

    /* JADX INFO: renamed from: o.AIh$Application */
    public static final class Application implements InterfaceC60174zxk {
        @Override // o.InterfaceC60174zxk
        public RustBuffer.ByValue alloc(long j, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.ffi_experiment_rustbuffer_alloc(j, uniffiRustCallStatus);
        }

        @Override // o.InterfaceC60174zxk
        public void free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            UniffiLib.INSTANCE.ffi_experiment_rustbuffer_free(byValue, uniffiRustCallStatus);
        }
    }

    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_experiment_uniffi_contract_version()) {
            throw new java.lang.RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = IntegrityCheckingUniffiLib.INSTANCE;
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
    }

    public static final void notifyAbtestUpdated(@NotNull final AbTestInstance abTestInstance) {
        Intrinsics.checkNotNullParameter(abTestInstance, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AIl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2348AIh.notifyAbtestUpdated$lambda$0(abTestInstance, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit notifyAbtestUpdated$lambda$0(AbTestInstance abTestInstance, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_experiment_fn_func_notify_abtest_updated(FfiConverterTypeABTestInstance.INSTANCE.lower2((java.lang.Object) abTestInstance), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void registerAbtestFactory(@NotNull final AHX ahx) {
        Intrinsics.checkNotNullParameter(ahx, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AIg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2348AIh.registerAbtestFactory$lambda$1(ahx, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerAbtestFactory$lambda$1(AHX ahx, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_experiment_fn_func_register_abtest_factory(FfiConverterTypeABTestFactory.INSTANCE.lower2(ahx).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void registerFeedbackClient(@NotNull final InterfaceC2361AIu interfaceC2361AIu) {
        Intrinsics.checkNotNullParameter(interfaceC2361AIu, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AIe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2348AIh.registerFeedbackClient$lambda$2(interfaceC2361AIu, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerFeedbackClient$lambda$2(InterfaceC2361AIu interfaceC2361AIu, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_experiment_fn_func_register_feedback_client(FfiConverterTypeFeedbackInterface.INSTANCE.lower2(interfaceC2361AIu).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
