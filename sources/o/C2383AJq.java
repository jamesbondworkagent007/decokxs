package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.experiment.FfiConverterOptionalMapStringString;
import uniffi.experiment.FfiConverterString;
import uniffi.experiment.FfiConverterTypeFeatureUpdateHandler;
import uniffi.experiment.FfiConverterTypeOKRustFutureApiResultWithFetchAllFeaturesError;
import uniffi.experiment.FfiConverterTypeOKRustFutureFeatureInfoWithQueryFeatureInfoError;
import uniffi.experiment.UniffiLib;

/* JADX INFO: renamed from: o.AJq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C2383AJq extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2383AJq(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.KWHzl(), C2348AIh.uniffiRustBuffer, new Function2() { // from class: o.AJt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2383AJq.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AJx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2383AJq.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_experiment_fn_free_publicbetaservice(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_experiment_fn_clone_publicbetaservice(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2383AJq(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.KWHzl(), C2348AIh.uniffiRustBuffer, new Function2() { // from class: o.AJA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2383AJq.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AJH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2383AJq.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_experiment_fn_free_publicbetaservice(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_experiment_fn_clone_publicbetaservice(j, uniffiRustCallStatus);
    }

    public C2383AJq() {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(C2348AIh.uniffiRustBuffer, new Function1() { // from class: o.AJD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2383AJq.KWHzl((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_experiment_fn_constructor_publicbetaservice_new(uniffiRustCallStatus);
    }

    public void OLrzqt() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AJs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2383AJq.clearAllFeaturesCache$lambda$6(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit clearAllFeaturesCache$lambda$6(final long j) {
        C60173zxj.uniffiRustCall(C2348AIh.uniffiRustBuffer, new Function1() { // from class: o.AJz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2383AJq.clearAllFeaturesCache$lambda$6$lambda$5(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit clearAllFeaturesCache$lambda$6$lambda$5(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_experiment_fn_method_publicbetaservice_clear_all_features_cache(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public AIP AEQbTJ(final java.util.Map<java.lang.String, java.lang.String> map) {
        return FfiConverterTypeOKRustFutureApiResultWithFetchAllFeaturesError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AJu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2383AJq.fetchAllFeatures$lambda$8(map, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long fetchAllFeatures$lambda$8(final java.util.Map map, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C2348AIh.uniffiRustBuffer, new Function1() { // from class: o.AJE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2383AJq.fetchAllFeatures$lambda$8$lambda$7(j, map, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long fetchAllFeatures$lambda$8$lambda$7(long j, java.util.Map map, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_experiment_fn_method_publicbetaservice_fetch_all_features(j, FfiConverterOptionalMapStringString.INSTANCE.lower2(map), uniffiRustCallStatus);
    }

    public static final RustBuffer.ByValue getFeatureVariant$lambda$10(final java.lang.String str, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C2348AIh.uniffiRustBuffer, new Function1() { // from class: o.AJw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2383AJq.getFeatureVariant$lambda$10$lambda$9(j, str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getFeatureVariant$lambda$10$lambda$9(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_experiment_fn_method_publicbetaservice_get_feature_variant(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public C2368AJb KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return FfiConverterTypeOKRustFutureFeatureInfoWithQueryFeatureInfoError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AJv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2383AJq.queryFeatureInfo$lambda$12(str, str2, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long queryFeatureInfo$lambda$12(final java.lang.String str, final java.lang.String str2, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C2348AIh.uniffiRustBuffer, new Function1() { // from class: o.AJB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2383AJq.queryFeatureInfo$lambda$12$lambda$11(j, str, str2, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long queryFeatureInfo$lambda$12$lambda$11(long j, java.lang.String str, java.lang.String str2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_experiment_fn_method_publicbetaservice_query_feature_info(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), uniffiRustCallStatus);
    }

    public static final byte registerFeatureUpdates$lambda$14(final InterfaceC2350AIj interfaceC2350AIj, final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C2348AIh.uniffiRustBuffer, new Function1() { // from class: o.AJC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C2383AJq.registerFeatureUpdates$lambda$14$lambda$13(j, interfaceC2350AIj, str, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte registerFeatureUpdates$lambda$14$lambda$13(long j, InterfaceC2350AIj interfaceC2350AIj, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_experiment_fn_method_publicbetaservice_register_feature_updates(j, FfiConverterTypeFeatureUpdateHandler.INSTANCE.lower2(interfaceC2350AIj).longValue(), FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public static final byte unregisterFeatureUpdates$lambda$16(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C2348AIh.uniffiRustBuffer, new Function1() { // from class: o.AJy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C2383AJq.unregisterFeatureUpdates$lambda$16$lambda$15(j, str, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte unregisterFeatureUpdates$lambda$16$lambda$15(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_experiment_fn_method_publicbetaservice_unregister_feature_updates(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }
}
