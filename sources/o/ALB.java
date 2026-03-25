package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.feature_restriction.FfiConverterTypeFeatureRestrictionEvent;
import uniffi.feature_restriction.FfiConverterTypeNativeFeatureRestrictionInterface;
import uniffi.feature_restriction.IntegrityCheckingUniffiLib;
import uniffi.feature_restriction.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public final class ALB {
    public static final RustBuffer uniffiRustBuffer = new RustBuffer(new Application());

    public static final class Application implements InterfaceC60174zxk {
        @Override // o.InterfaceC60174zxk
        public RustBuffer.ByValue alloc(long j, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.ffi_feature_restriction_rustbuffer_alloc(j, uniffiRustCallStatus);
        }

        @Override // o.InterfaceC60174zxk
        public void free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            UniffiLib.INSTANCE.ffi_feature_restriction_rustbuffer_free(byValue, uniffiRustCallStatus);
        }
    }

    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_feature_restriction_uniffi_contract_version()) {
            throw new java.lang.RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = IntegrityCheckingUniffiLib.INSTANCE;
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
    }

    public static final void emitNativeFeatureRestrictionEvent(@NotNull final AbstractC2440ALv abstractC2440ALv) {
        Intrinsics.checkNotNullParameter(abstractC2440ALv, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.ALF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ALB.emitNativeFeatureRestrictionEvent$lambda$0(abstractC2440ALv, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit emitNativeFeatureRestrictionEvent$lambda$0(AbstractC2440ALv abstractC2440ALv, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_feature_restriction_fn_func_emit_native_feature_restriction_event(FfiConverterTypeFeatureRestrictionEvent.INSTANCE.lower2((java.lang.Object) abstractC2440ALv), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final void registerNativeFeatureRestrictionClient(@NotNull final ALH alh) {
        Intrinsics.checkNotNullParameter(alh, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.ALE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ALB.registerNativeFeatureRestrictionClient$lambda$1(alh, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerNativeFeatureRestrictionClient$lambda$1(ALH alh, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_feature_restriction_fn_func_register_native_feature_restriction_client(FfiConverterTypeNativeFeatureRestrictionInterface.INSTANCE.lower2(alh).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
