package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.UniffiRustFutureContinuationCallback;
import uniffi.growth.FfiConverterSequenceTypeSharePlatform;
import uniffi.growth.FfiConverterTypeShareComponentConfig;
import uniffi.growth.FfiConverterTypeShareConfig;
import uniffi.growth.FfiConverterTypeUniversalLinkRequest;
import uniffi.growth.FfiConverterTypeUniversalLinkResponse;
import uniffi.growth.OkShareFfiException;
import uniffi.growth.SharePlatform;
import uniffi.growth.UniffiLib;

/* JADX INFO: renamed from: o.ANp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C2486ANp extends AbstractC60182zxs implements APK {
    public static final int $stable = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.APK
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super API> continuation) throws OkShareFfiException {
        return fetchShareComponentConfig$suspendImpl(this, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.APK
    public java.lang.Object EZpvd(@NotNull APJ apj, @NotNull Continuation<? super java.util.List<? extends SharePlatform>> continuation) {
        return getCachedSharePlatformList$suspendImpl(this, apj, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.APK
    public java.lang.Object KWHzl(@NotNull APJ apj, @NotNull Continuation<? super java.util.List<? extends SharePlatform>> continuation) {
        return fetchDisplaySharePlatformList$suspendImpl(this, apj, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.APK
    public java.lang.Object copydefault(@NotNull AQB aqb, @NotNull Continuation<? super AQF> continuation) throws OkShareFfiException {
        return generateUniversalLink$suspendImpl(this, aqb, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2486ANp(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), ANQ.uniffiRustBuffer, new Function2() { // from class: o.ANA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2486ANp.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.ANy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2486ANp.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_growth_fn_free_coreshareplatformmanager(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_clone_coreshareplatformmanager(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2486ANp(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), ANQ.uniffiRustBuffer, new Function2() { // from class: o.ANq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2486ANp.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.ANr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2486ANp.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_growth_fn_free_coreshareplatformmanager(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_clone_coreshareplatformmanager(j, uniffiRustCallStatus);
    }

    public static /* synthetic */ java.lang.Object fetchDisplaySharePlatformList$suspendImpl(C2486ANp c2486ANp, final APJ apj, Continuation<? super java.util.List<? extends SharePlatform>> continuation) {
        return C60173zxj.uniffiRustCallAsync(ANQ.uniffiRustBuffer, ((java.lang.Number) c2486ANp.callWithHandle$OKCore_deploy(new Function1() { // from class: o.ANH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2486ANp.fetchDisplaySharePlatformList$lambda$4(apj, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.ANP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C2486ANp.fetchDisplaySharePlatformList$lambda$5(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.ANN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2486ANp.fetchDisplaySharePlatformList$lambda$6(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.ANv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2486ANp.fetchDisplaySharePlatformList$lambda$7(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.ANu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2486ANp.fetchDisplaySharePlatformList$lambda$8((RustBuffer.ByValue) obj);
            }
        }, new C60178zxo(ANQ.uniffiRustBuffer), continuation);
    }

    public static final long fetchDisplaySharePlatformList$lambda$4(APJ apj, long j) {
        return UniffiLib.INSTANCE.uniffi_growth_fn_method_coreshareplatformmanager_fetch_display_share_platform_list(j, FfiConverterTypeShareConfig.INSTANCE.lower2((java.lang.Object) apj));
    }

    public static final Unit fetchDisplaySharePlatformList$lambda$5(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_growth_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue fetchDisplaySharePlatformList$lambda$6(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_growth_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    public static final Unit fetchDisplaySharePlatformList$lambda$7(long j) {
        UniffiLib.INSTANCE.ffi_growth_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    public static final java.util.List fetchDisplaySharePlatformList$lambda$8(RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        return (java.util.List) FfiConverterSequenceTypeSharePlatform.INSTANCE.lift2(byValue);
    }

    public static /* synthetic */ java.lang.Object fetchShareComponentConfig$suspendImpl(C2486ANp c2486ANp, Continuation<? super API> continuation) throws OkShareFfiException {
        return C60173zxj.uniffiRustCallAsync(ANQ.uniffiRustBuffer, ((java.lang.Number) c2486ANp.callWithHandle$OKCore_deploy(new Function1() { // from class: o.ANF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2486ANp.fetchShareComponentConfig$lambda$9(((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.ANL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C2486ANp.fetchShareComponentConfig$lambda$10(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.ANI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2486ANp.fetchShareComponentConfig$lambda$11(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.ANK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2486ANp.fetchShareComponentConfig$lambda$12(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.ANJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2486ANp.fetchShareComponentConfig$lambda$13((RustBuffer.ByValue) obj);
            }
        }, OkShareFfiException.ErrorHandler, continuation);
    }

    public static final long fetchShareComponentConfig$lambda$9(long j) {
        return UniffiLib.INSTANCE.uniffi_growth_fn_method_coreshareplatformmanager_fetch_share_component_config(j);
    }

    public static final Unit fetchShareComponentConfig$lambda$10(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_growth_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue fetchShareComponentConfig$lambda$11(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_growth_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    public static final Unit fetchShareComponentConfig$lambda$12(long j) {
        UniffiLib.INSTANCE.ffi_growth_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    public static final API fetchShareComponentConfig$lambda$13(RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        return (API) FfiConverterTypeShareComponentConfig.INSTANCE.lift2(byValue);
    }

    public static /* synthetic */ java.lang.Object generateUniversalLink$suspendImpl(C2486ANp c2486ANp, final AQB aqb, Continuation<? super AQF> continuation) throws OkShareFfiException {
        return C60173zxj.uniffiRustCallAsync(ANQ.uniffiRustBuffer, ((java.lang.Number) c2486ANp.callWithHandle$OKCore_deploy(new Function1() { // from class: o.ANx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2486ANp.generateUniversalLink$lambda$14(aqb, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.ANG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C2486ANp.generateUniversalLink$lambda$15(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.ANE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2486ANp.generateUniversalLink$lambda$16(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.ANC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2486ANp.generateUniversalLink$lambda$17(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.AND
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2486ANp.generateUniversalLink$lambda$18((RustBuffer.ByValue) obj);
            }
        }, OkShareFfiException.ErrorHandler, continuation);
    }

    public static final long generateUniversalLink$lambda$14(AQB aqb, long j) {
        return UniffiLib.INSTANCE.uniffi_growth_fn_method_coreshareplatformmanager_generate_universal_link(j, FfiConverterTypeUniversalLinkRequest.INSTANCE.lower2((java.lang.Object) aqb));
    }

    public static final Unit generateUniversalLink$lambda$15(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_growth_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue generateUniversalLink$lambda$16(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_growth_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    public static final Unit generateUniversalLink$lambda$17(long j) {
        UniffiLib.INSTANCE.ffi_growth_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    public static final AQF generateUniversalLink$lambda$18(RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        return (AQF) FfiConverterTypeUniversalLinkResponse.INSTANCE.lift2(byValue);
    }

    public static /* synthetic */ java.lang.Object getCachedSharePlatformList$suspendImpl(C2486ANp c2486ANp, final APJ apj, Continuation<? super java.util.List<? extends SharePlatform>> continuation) {
        return C60173zxj.uniffiRustCallAsync(ANQ.uniffiRustBuffer, ((java.lang.Number) c2486ANp.callWithHandle$OKCore_deploy(new Function1() { // from class: o.ANt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2486ANp.getCachedSharePlatformList$lambda$19(apj, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.ANw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C2486ANp.getCachedSharePlatformList$lambda$20(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.ANs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2486ANp.getCachedSharePlatformList$lambda$21(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.ANB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2486ANp.getCachedSharePlatformList$lambda$22(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.ANz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2486ANp.getCachedSharePlatformList$lambda$23((RustBuffer.ByValue) obj);
            }
        }, new C60178zxo(ANQ.uniffiRustBuffer), continuation);
    }

    public static final long getCachedSharePlatformList$lambda$19(APJ apj, long j) {
        return UniffiLib.INSTANCE.uniffi_growth_fn_method_coreshareplatformmanager_get_cached_share_platform_list(j, FfiConverterTypeShareConfig.INSTANCE.lower2((java.lang.Object) apj));
    }

    public static final Unit getCachedSharePlatformList$lambda$20(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_growth_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue getCachedSharePlatformList$lambda$21(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_growth_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    public static final Unit getCachedSharePlatformList$lambda$22(long j) {
        UniffiLib.INSTANCE.ffi_growth_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    public static final java.util.List getCachedSharePlatformList$lambda$23(RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        return (java.util.List) FfiConverterSequenceTypeSharePlatform.INSTANCE.lift2(byValue);
    }
}
