package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.lifecycle.FfiConverterBoolean;
import uniffi.lifecycle.FfiConverterMapStringString;
import uniffi.lifecycle.FfiConverterOptionalString;
import uniffi.lifecycle.FfiConverterString;
import uniffi.lifecycle.FfiConverterTypeCoreAppLinkInfoFetcher;
import uniffi.lifecycle.FfiConverterTypeCoreDeeplinkInfoFetcher;
import uniffi.lifecycle.FfiConverterTypeCoreLinkDependencyHelper;
import uniffi.lifecycle.FfiConverterTypeCoreLinkExecutionHelper;
import uniffi.lifecycle.FfiConverterTypeOKRustFutureDeeplinkResultWithLifecycleFutureError;
import uniffi.lifecycle.UniffiLib;

/* JADX INFO: renamed from: o.ATe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C2631ATe extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2631ATe(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), C2692AVo.uniffiRustBuffer, new Function2() { // from class: o.ATv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2631ATe.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.ATA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2631ATe.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_lifecycle_fn_free_coredeeplinkservicebridge(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_clone_coredeeplinkservicebridge(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2631ATe(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), C2692AVo.uniffiRustBuffer, new Function2() { // from class: o.ATm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2631ATe.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.ATl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2631ATe.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_lifecycle_fn_free_coredeeplinkservicebridge(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_clone_coredeeplinkservicebridge(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2631ATe(@NotNull final AUI aui, @NotNull final InterfaceC2678AVa interfaceC2678AVa, @NotNull final InterfaceC2618ASr interfaceC2618ASr, @NotNull final ARC arc) {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.ATk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2631ATe._init_$lambda$4(aui, interfaceC2678AVa, interfaceC2618ASr, arc, (UniffiRustCallStatus) obj));
            }
        })).longValue());
        Intrinsics.checkNotNullParameter(aui, "");
        Intrinsics.checkNotNullParameter(interfaceC2678AVa, "");
        Intrinsics.checkNotNullParameter(interfaceC2618ASr, "");
        Intrinsics.checkNotNullParameter(arc, "");
    }

    public static final long _init_$lambda$4(AUI aui, InterfaceC2678AVa interfaceC2678AVa, InterfaceC2618ASr interfaceC2618ASr, ARC arc, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_constructor_coredeeplinkservicebridge_new(FfiConverterTypeCoreLinkDependencyHelper.INSTANCE.lower2(aui).longValue(), FfiConverterTypeCoreLinkExecutionHelper.INSTANCE.lower2(interfaceC2678AVa).longValue(), FfiConverterTypeCoreDeeplinkInfoFetcher.INSTANCE.lower2(interfaceC2618ASr).longValue(), FfiConverterTypeCoreAppLinkInfoFetcher.INSTANCE.lower2(arc).longValue(), uniffiRustCallStatus);
    }

    public java.lang.String AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.util.Map<java.lang.String, java.lang.String> map, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ATs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2631ATe.createLink$lambda$6(str, map, z, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue createLink$lambda$6(final java.lang.String str, final java.util.Map map, final boolean z, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.ATB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2631ATe.createLink$lambda$6$lambda$5(j, str, map, z, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue createLink$lambda$6$lambda$5(long j, java.lang.String str, java.util.Map map, boolean z, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_coredeeplinkservicebridge_create_link(j, FfiConverterString.INSTANCE.lower2(str), FfiConverterMapStringString.INSTANCE.lower2((java.lang.Object) map), FfiConverterBoolean.INSTANCE.lower(z).byteValue(), uniffiRustCallStatus);
    }

    public static final RustBuffer.ByValue getDeeplinkMetadata$lambda$8(final java.lang.String str, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.ATn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2631ATe.getDeeplinkMetadata$lambda$8$lambda$7(j, str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getDeeplinkMetadata$lambda$8$lambda$7(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_coredeeplinkservicebridge_get_deeplink_metadata(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public static final RustBuffer.ByValue getDeeplinkRegistry$lambda$10(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.ATh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2631ATe.getDeeplinkRegistry$lambda$10$lambda$9(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getDeeplinkRegistry$lambda$10$lambda$9(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_coredeeplinkservicebridge_get_deeplink_registry(j, uniffiRustCallStatus);
    }

    public java.lang.String OLrzqt() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ATi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2631ATe.getDeeplinkScheme$lambda$12(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getDeeplinkScheme$lambda$12(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.ATt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2631ATe.getDeeplinkScheme$lambda$12$lambda$11(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getDeeplinkScheme$lambda$12$lambda$11(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_coredeeplinkservicebridge_get_deeplink_scheme(j, uniffiRustCallStatus);
    }

    public boolean EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ATc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C2631ATe.isUniversalLink$lambda$14(str, ((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isUniversalLink$lambda$14(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.ATp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C2631ATe.isUniversalLink$lambda$14$lambda$13(j, str, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isUniversalLink$lambda$14$lambda$13(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_coredeeplinkservicebridge_is_universal_link(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public static final byte isUniversalLinkFromWebview$lambda$16(final java.lang.String str, final boolean z, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.ATw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C2631ATe.isUniversalLinkFromWebview$lambda$16$lambda$15(j, str, z, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isUniversalLinkFromWebview$lambda$16$lambda$15(long j, java.lang.String str, boolean z, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_coredeeplinkservicebridge_is_universal_link_from_webview(j, FfiConverterString.INSTANCE.lower2(str), FfiConverterBoolean.INSTANCE.lower(z).byteValue(), uniffiRustCallStatus);
    }

    public AVG KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterTypeOKRustFutureDeeplinkResultWithLifecycleFutureError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ATy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2631ATe.navigateToNative$lambda$18(str, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long navigateToNative$lambda$18(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.ATz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2631ATe.navigateToNative$lambda$18$lambda$17(j, str, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long navigateToNative$lambda$18$lambda$17(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_coredeeplinkservicebridge_navigate_to_native(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public java.util.Map<java.lang.String, java.lang.String> OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (java.util.Map) FfiConverterMapStringString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ATu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2631ATe.parseParam$lambda$20(str, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue parseParam$lambda$20(final java.lang.String str, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.ATx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2631ATe.parseParam$lambda$20$lambda$19(j, str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue parseParam$lambda$20$lambda$19(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_coredeeplinkservicebridge_parse_param(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public AVG AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.util.Map<java.lang.String, java.lang.String> map, final java.lang.String str2, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        return FfiConverterTypeOKRustFutureDeeplinkResultWithLifecycleFutureError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ATg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2631ATe.processDeeplink$lambda$22(str, map, str2, z, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long processDeeplink$lambda$22(final java.lang.String str, final java.util.Map map, final java.lang.String str2, final boolean z, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.ATq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2631ATe.processDeeplink$lambda$22$lambda$21(j, str, map, str2, z, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long processDeeplink$lambda$22$lambda$21(long j, java.lang.String str, java.util.Map map, java.lang.String str2, boolean z, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_coredeeplinkservicebridge_process_deeplink(j, FfiConverterString.INSTANCE.lower2(str), FfiConverterMapStringString.INSTANCE.lower2((java.lang.Object) map), FfiConverterOptionalString.INSTANCE.lower2(str2), FfiConverterBoolean.INSTANCE.lower(z).byteValue(), uniffiRustCallStatus);
    }

    public boolean copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ATr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C2631ATe.validateDeeplink$lambda$24(str, ((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte validateDeeplink$lambda$24(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.ATD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C2631ATe.validateDeeplink$lambda$24$lambda$23(j, str, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte validateDeeplink$lambda$24$lambda$23(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_coredeeplinkservicebridge_validate_deeplink(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public boolean AEQbTJ(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ATo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C2631ATe.validateDeeplinkScheme$lambda$26(str, ((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte validateDeeplinkScheme$lambda$26(final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.ATj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C2631ATe.validateDeeplinkScheme$lambda$26$lambda$25(j, str, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte validateDeeplinkScheme$lambda$26$lambda$25(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_coredeeplinkservicebridge_validate_deeplink_scheme(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }
}
