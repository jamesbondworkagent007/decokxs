package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.lifecycle.AnalyticsLinkType;
import uniffi.lifecycle.FfiConverterBoolean;
import uniffi.lifecycle.FfiConverterMapStringString;
import uniffi.lifecycle.FfiConverterString;
import uniffi.lifecycle.FfiConverterTypeAnalyticsLinkType;
import uniffi.lifecycle.FfiConverterTypeLinkSource;
import uniffi.lifecycle.FfiConverterTypeLinkState;
import uniffi.lifecycle.LinkSource;
import uniffi.lifecycle.LinkState;
import uniffi.lifecycle.UniffiLib;

/* JADX INFO: renamed from: o.AUh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C2660AUh extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2660AUh(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), C2692AVo.uniffiRustBuffer, new Function2() { // from class: o.AUl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2660AUh.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AUk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2660AUh.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_lifecycle_fn_free_corelinkanalyticsstateholderbridge(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_clone_corelinkanalyticsstateholderbridge(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2660AUh(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), C2692AVo.uniffiRustBuffer, new Function2() { // from class: o.AUy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2660AUh.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AUt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2660AUh.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_lifecycle_fn_free_corelinkanalyticsstateholderbridge(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_clone_corelinkanalyticsstateholderbridge(j, uniffiRustCallStatus);
    }

    public C2660AUh() {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.AUu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2660AUh.OLrzqt((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_constructor_corelinkanalyticsstateholderbridge_new(uniffiRustCallStatus);
    }

    public java.util.Map<java.lang.String, java.lang.String> OLrzqt() {
        return (java.util.Map) FfiConverterMapStringString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AUj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2660AUh.getAnalyticsParams$lambda$6(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getAnalyticsParams$lambda$6(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.AUw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2660AUh.getAnalyticsParams$lambda$6$lambda$5(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getAnalyticsParams$lambda$6$lambda$5(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_corelinkanalyticsstateholderbridge_get_analytics_params(j, uniffiRustCallStatus);
    }

    public boolean copydefault() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AUB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C2660AUh.hasState$lambda$8(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte hasState$lambda$8(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.AUe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C2660AUh.hasState$lambda$8$lambda$7(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte hasState$lambda$8$lambda$7(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_corelinkanalyticsstateholderbridge_has_state(j, uniffiRustCallStatus);
    }

    public void copydefault(@NotNull final java.lang.String str, @NotNull final LinkSource linkSource, @NotNull final AnalyticsLinkType analyticsLinkType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(linkSource, "");
        Intrinsics.checkNotNullParameter(analyticsLinkType, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AUv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2660AUh.initialize$lambda$10(str, linkSource, analyticsLinkType, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit initialize$lambda$10(final java.lang.String str, final LinkSource linkSource, final AnalyticsLinkType analyticsLinkType, final long j) {
        C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.AUs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2660AUh.initialize$lambda$10$lambda$9(j, str, linkSource, analyticsLinkType, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit initialize$lambda$10$lambda$9(long j, java.lang.String str, LinkSource linkSource, AnalyticsLinkType analyticsLinkType, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_corelinkanalyticsstateholderbridge_initialize(j, FfiConverterString.INSTANCE.lower2(str), FfiConverterTypeLinkSource.INSTANCE.lower2((java.lang.Object) linkSource), FfiConverterTypeAnalyticsLinkType.INSTANCE.lower2((java.lang.Object) analyticsLinkType), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public boolean KWHzl() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AUr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C2660AUh.isExternalLinkProcessing$lambda$12(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isExternalLinkProcessing$lambda$12(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.AUz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C2660AUh.isExternalLinkProcessing$lambda$12$lambda$11(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isExternalLinkProcessing$lambda$12$lambda$11(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_corelinkanalyticsstateholderbridge_is_external_link_processing(j, uniffiRustCallStatus);
    }

    public boolean AEQbTJ(@NotNull final LinkSource linkSource) {
        Intrinsics.checkNotNullParameter(linkSource, "");
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AUm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C2660AUh.isExternalSource$lambda$14(linkSource, ((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isExternalSource$lambda$14(final LinkSource linkSource, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.AUq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C2660AUh.isExternalSource$lambda$14$lambda$13(j, linkSource, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isExternalSource$lambda$14$lambda$13(long j, LinkSource linkSource, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_corelinkanalyticsstateholderbridge_is_external_source(j, FfiConverterTypeLinkSource.INSTANCE.lower2((java.lang.Object) linkSource), uniffiRustCallStatus);
    }

    public boolean AEQbTJ() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AUn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C2660AUh.isProcessingComplete$lambda$16(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isProcessingComplete$lambda$16(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.AUA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C2660AUh.isProcessingComplete$lambda$16$lambda$15(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isProcessingComplete$lambda$16$lambda$15(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_corelinkanalyticsstateholderbridge_is_processing_complete(j, uniffiRustCallStatus);
    }

    public void EZpvd() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AUg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2660AUh.reset$lambda$18(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit reset$lambda$18(final long j) {
        C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.AUo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2660AUh.reset$lambda$18$lambda$17(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit reset$lambda$18$lambda$17(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_corelinkanalyticsstateholderbridge_reset(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AUC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2660AUh.setDeeplink$lambda$20(str, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setDeeplink$lambda$20(final java.lang.String str, final long j) {
        C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.AUp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2660AUh.setDeeplink$lambda$20$lambda$19(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setDeeplink$lambda$20$lambda$19(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_corelinkanalyticsstateholderbridge_set_deeplink(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public void copydefault(@NotNull final LinkState linkState) {
        Intrinsics.checkNotNullParameter(linkState, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AUD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2660AUh.setLinkReason$lambda$22(linkState, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setLinkReason$lambda$22(final LinkState linkState, final long j) {
        C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.AUf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2660AUh.setLinkReason$lambda$22$lambda$21(j, linkState, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setLinkReason$lambda$22$lambda$21(long j, LinkState linkState, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_corelinkanalyticsstateholderbridge_set_link_reason(j, FfiConverterTypeLinkState.INSTANCE.lower2((java.lang.Object) linkState), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
