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

/* JADX INFO: loaded from: classes13.dex */
public class APR extends AbstractC60182zxs implements APK {
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
    public APR(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), ANQ.uniffiRustBuffer, new Function2() { // from class: o.AQd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return APR.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AQf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(APR.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_growth_fn_free_shareplatformmanager(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_clone_shareplatformmanager(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public APR(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), ANQ.uniffiRustBuffer, new Function2() { // from class: o.APQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return APR.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.APN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(APR.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_growth_fn_free_shareplatformmanager(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_clone_shareplatformmanager(j, uniffiRustCallStatus);
    }

    public static /* synthetic */ java.lang.Object fetchDisplaySharePlatformList$suspendImpl(APR apr, final APJ apj, Continuation<? super java.util.List<? extends SharePlatform>> continuation) {
        return C60173zxj.uniffiRustCallAsync(ANQ.uniffiRustBuffer, ((java.lang.Number) apr.callWithHandle$OKCore_deploy(new Function1() { // from class: o.APY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(APR.EZpvd(apj, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.APZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return APR.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.AQa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return APR.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.APX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return APR.copydefault(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.AQc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return APR.copydefault((RustBuffer.ByValue) obj);
            }
        }, new C60178zxo(ANQ.uniffiRustBuffer), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(APJ apj, long j) {
        return UniffiLib.INSTANCE.uniffi_growth_fn_method_shareplatformmanager_fetch_display_share_platform_list(j, FfiConverterTypeShareConfig.INSTANCE.lower2((java.lang.Object) apj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_growth_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RustBuffer.ByValue copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_growth_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j) {
        UniffiLib.INSTANCE.ffi_growth_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List copydefault(RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        return (java.util.List) FfiConverterSequenceTypeSharePlatform.INSTANCE.lift2(byValue);
    }

    public static /* synthetic */ java.lang.Object getCachedSharePlatformList$suspendImpl(APR apr, final APJ apj, Continuation<? super java.util.List<? extends SharePlatform>> continuation) {
        return C60173zxj.uniffiRustCallAsync(ANQ.uniffiRustBuffer, ((java.lang.Number) apr.callWithHandle$OKCore_deploy(new Function1() { // from class: o.APO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(APR.getCachedSharePlatformList$lambda$9(apj, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.APP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return APR.getCachedSharePlatformList$lambda$10(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.AQb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return APR.getCachedSharePlatformList$lambda$11(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.AQg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return APR.getCachedSharePlatformList$lambda$12(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.AQe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return APR.getCachedSharePlatformList$lambda$13((RustBuffer.ByValue) obj);
            }
        }, new C60178zxo(ANQ.uniffiRustBuffer), continuation);
    }

    public static final long getCachedSharePlatformList$lambda$9(APJ apj, long j) {
        return UniffiLib.INSTANCE.uniffi_growth_fn_method_shareplatformmanager_get_cached_share_platform_list(j, FfiConverterTypeShareConfig.INSTANCE.lower2((java.lang.Object) apj));
    }

    public static final Unit getCachedSharePlatformList$lambda$10(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_growth_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue getCachedSharePlatformList$lambda$11(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_growth_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    public static final Unit getCachedSharePlatformList$lambda$12(long j) {
        UniffiLib.INSTANCE.ffi_growth_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    public static final java.util.List getCachedSharePlatformList$lambda$13(RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        return (java.util.List) FfiConverterSequenceTypeSharePlatform.INSTANCE.lift2(byValue);
    }

    public static /* synthetic */ java.lang.Object fetchShareComponentConfig$suspendImpl(APR apr, Continuation<? super API> continuation) throws OkShareFfiException {
        return C60173zxj.uniffiRustCallAsync(ANQ.uniffiRustBuffer, ((java.lang.Number) apr.callWithHandle$OKCore_deploy(new Function1() { // from class: o.APS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(APR.fetchShareComponentConfig$lambda$14(((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.APU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return APR.fetchShareComponentConfig$lambda$15(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.APT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return APR.fetchShareComponentConfig$lambda$16(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.APV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return APR.fetchShareComponentConfig$lambda$17(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.APW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return APR.fetchShareComponentConfig$lambda$18((RustBuffer.ByValue) obj);
            }
        }, OkShareFfiException.ErrorHandler, continuation);
    }

    public static final long fetchShareComponentConfig$lambda$14(long j) {
        return UniffiLib.INSTANCE.uniffi_growth_fn_method_shareplatformmanager_fetch_share_component_config(j);
    }

    public static final Unit fetchShareComponentConfig$lambda$15(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_growth_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue fetchShareComponentConfig$lambda$16(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_growth_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    public static final Unit fetchShareComponentConfig$lambda$17(long j) {
        UniffiLib.INSTANCE.ffi_growth_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    public static final API fetchShareComponentConfig$lambda$18(RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        return (API) FfiConverterTypeShareComponentConfig.INSTANCE.lift2(byValue);
    }

    public static /* synthetic */ java.lang.Object generateUniversalLink$suspendImpl(APR apr, final AQB aqb, Continuation<? super AQF> continuation) throws OkShareFfiException {
        return C60173zxj.uniffiRustCallAsync(ANQ.uniffiRustBuffer, ((java.lang.Number) apr.callWithHandle$OKCore_deploy(new Function1() { // from class: o.AQi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(APR.generateUniversalLink$lambda$19(aqb, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.AQj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return APR.generateUniversalLink$lambda$20(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.AQk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return APR.generateUniversalLink$lambda$21(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.AQl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return APR.generateUniversalLink$lambda$22(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.AQh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return APR.generateUniversalLink$lambda$23((RustBuffer.ByValue) obj);
            }
        }, OkShareFfiException.ErrorHandler, continuation);
    }

    public static final long generateUniversalLink$lambda$19(AQB aqb, long j) {
        return UniffiLib.INSTANCE.uniffi_growth_fn_method_shareplatformmanager_generate_universal_link(j, FfiConverterTypeUniversalLinkRequest.INSTANCE.lower2((java.lang.Object) aqb));
    }

    public static final Unit generateUniversalLink$lambda$20(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_growth_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue generateUniversalLink$lambda$21(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_growth_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    public static final Unit generateUniversalLink$lambda$22(long j) {
        UniffiLib.INSTANCE.ffi_growth_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    public static final AQF generateUniversalLink$lambda$23(RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        return (AQF) FfiConverterTypeUniversalLinkResponse.INSTANCE.lift2(byValue);
    }
}
