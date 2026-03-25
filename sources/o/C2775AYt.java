package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.localization.FfiConverterTypeAppLanguage;
import uniffi.localization.FfiConverterTypeLanguageFactory;
import uniffi.localization.IntegrityCheckingUniffiLib;
import uniffi.localization.UniffiLib;

/* JADX INFO: renamed from: o.AYt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C2775AYt {
    public static final RustBuffer uniffiRustBuffer = new RustBuffer(new StateListAnimator());

    /* JADX INFO: renamed from: o.AYt$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC60174zxk {
        @Override // o.InterfaceC60174zxk
        public RustBuffer.ByValue alloc(long j, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.ffi_localization_rustbuffer_alloc(j, uniffiRustCallStatus);
        }

        @Override // o.InterfaceC60174zxk
        public void free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            UniffiLib.INSTANCE.ffi_localization_rustbuffer_free(byValue, uniffiRustCallStatus);
        }
    }

    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_localization_uniffi_contract_version()) {
            throw new java.lang.RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = IntegrityCheckingUniffiLib.INSTANCE;
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
    }

    public static final void languageDidChanged(@NotNull final AXY axy, @NotNull final AXY axy2) {
        Intrinsics.checkNotNullParameter(axy, "");
        Intrinsics.checkNotNullParameter(axy2, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AYw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2775AYt.languageDidChanged$lambda$0(axy, axy2, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit languageDidChanged$lambda$0(AXY axy, AXY axy2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterTypeAppLanguage ffiConverterTypeAppLanguage = FfiConverterTypeAppLanguage.INSTANCE;
        uniffiLib.uniffi_localization_fn_func_language_did_changed(ffiConverterTypeAppLanguage.lower2((java.lang.Object) axy), ffiConverterTypeAppLanguage.lower2((java.lang.Object) axy2), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void registerLanguageFactory(@NotNull final InterfaceC2760AYe interfaceC2760AYe) {
        Intrinsics.checkNotNullParameter(interfaceC2760AYe, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AYu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2775AYt.registerLanguageFactory$lambda$1(interfaceC2760AYe, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerLanguageFactory$lambda$1(InterfaceC2760AYe interfaceC2760AYe, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_localization_fn_func_register_language_factory(FfiConverterTypeLanguageFactory.INSTANCE.lower2(interfaceC2760AYe).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
