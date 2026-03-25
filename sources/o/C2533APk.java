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
import uniffi.growth.FfiConverterOptionalString;
import uniffi.growth.FfiConverterOptionalTypePopupHost;
import uniffi.growth.FfiConverterString;
import uniffi.growth.UniffiLib;

/* JADX INFO: renamed from: o.APk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C2533APk extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2533APk(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), ANQ.uniffiRustBuffer, new Function2() { // from class: o.APy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2533APk.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.APD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2533APk.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_growth_fn_free_popuptriggercontext(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_clone_popuptriggercontext(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2533APk(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), ANQ.uniffiRustBuffer, new Function2() { // from class: o.APA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2533APk.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.APz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2533APk.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_growth_fn_free_popuptriggercontext(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_clone_popuptriggercontext(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2533APk(@NotNull final java.lang.String str, final InterfaceC2518AOv interfaceC2518AOv) {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(ANQ.uniffiRustBuffer, new Function1() { // from class: o.APr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2533APk._init_$lambda$4(str, interfaceC2518AOv, (UniffiRustCallStatus) obj));
            }
        })).longValue());
        Intrinsics.checkNotNullParameter(str, "");
    }

    public static final long _init_$lambda$4(java.lang.String str, InterfaceC2518AOv interfaceC2518AOv, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_constructor_popuptriggercontext_new(FfiConverterString.INSTANCE.lower2(str), FfiConverterOptionalTypePopupHost.INSTANCE.lower2(interfaceC2518AOv), uniffiRustCallStatus);
    }

    public static final RustBuffer.ByValue host$lambda$6(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ANQ.uniffiRustBuffer, new Function1() { // from class: o.APq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2533APk.host$lambda$6$lambda$5(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue host$lambda$6$lambda$5(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_method_popuptriggercontext_host(j, uniffiRustCallStatus);
    }

    public static final long sharedDataGetString$lambda$7(java.lang.String str, long j) {
        return UniffiLib.INSTANCE.uniffi_growth_fn_method_popuptriggercontext_shared_data_get_string(j, FfiConverterString.INSTANCE.lower2(str));
    }

    public static final Unit sharedDataGetString$lambda$8(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_growth_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue sharedDataGetString$lambda$9(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_growth_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    public static final Unit sharedDataGetString$lambda$10(long j) {
        UniffiLib.INSTANCE.ffi_growth_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    public static final java.lang.String sharedDataGetString$lambda$11(RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        return FfiConverterOptionalString.INSTANCE.lift2(byValue);
    }

    public static /* synthetic */ java.lang.Object sharedDataInvalidate$suspendImpl(C2533APk c2533APk, final java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objUniffiRustCallAsync = C60173zxj.uniffiRustCallAsync(ANQ.uniffiRustBuffer, ((java.lang.Number) c2533APk.callWithHandle$OKCore_deploy(new Function1() { // from class: o.APl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2533APk.sharedDataInvalidate$lambda$12(str, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.APj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C2533APk.sharedDataInvalidate$lambda$13(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.APx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2533APk.sharedDataInvalidate$lambda$14(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.APB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2533APk.sharedDataInvalidate$lambda$15(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.APC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2533APk.sharedDataInvalidate$lambda$16((Unit) obj);
            }
        }, new C60178zxo(ANQ.uniffiRustBuffer), continuation);
        return objUniffiRustCallAsync == C56442yFn.copydefault() ? objUniffiRustCallAsync : Unit.INSTANCE;
    }

    public static final long sharedDataInvalidate$lambda$12(java.lang.String str, long j) {
        return UniffiLib.INSTANCE.uniffi_growth_fn_method_popuptriggercontext_shared_data_invalidate(j, FfiConverterString.INSTANCE.lower2(str));
    }

    public static final Unit sharedDataInvalidate$lambda$13(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_growth_rust_future_poll_void(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final Unit sharedDataInvalidate$lambda$14(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.ffi_growth_rust_future_complete_void(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit sharedDataInvalidate$lambda$15(long j) {
        UniffiLib.INSTANCE.ffi_growth_rust_future_free_void(j);
        return Unit.INSTANCE;
    }

    public static final Unit sharedDataInvalidate$lambda$16(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object sharedDataPutString$suspendImpl(C2533APk c2533APk, final java.lang.String str, final java.lang.String str2, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objUniffiRustCallAsync = C60173zxj.uniffiRustCallAsync(ANQ.uniffiRustBuffer, ((java.lang.Number) c2533APk.callWithHandle$OKCore_deploy(new Function1() { // from class: o.APs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2533APk.sharedDataPutString$lambda$17(str, str2, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.APw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C2533APk.sharedDataPutString$lambda$18(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.APv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2533APk.sharedDataPutString$lambda$19(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.APu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2533APk.sharedDataPutString$lambda$20(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.APt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2533APk.sharedDataPutString$lambda$21((Unit) obj);
            }
        }, new C60178zxo(ANQ.uniffiRustBuffer), continuation);
        return objUniffiRustCallAsync == C56442yFn.copydefault() ? objUniffiRustCallAsync : Unit.INSTANCE;
    }

    public static final long sharedDataPutString$lambda$17(java.lang.String str, java.lang.String str2, long j) {
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_growth_fn_method_popuptriggercontext_shared_data_put_string(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2));
    }

    public static final Unit sharedDataPutString$lambda$18(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_growth_rust_future_poll_void(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final Unit sharedDataPutString$lambda$19(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.ffi_growth_rust_future_complete_void(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit sharedDataPutString$lambda$20(long j) {
        UniffiLib.INSTANCE.ffi_growth_rust_future_free_void(j);
        return Unit.INSTANCE;
    }

    public static final Unit sharedDataPutString$lambda$21(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue triggerKey$lambda$23(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(ANQ.uniffiRustBuffer, new Function1() { // from class: o.APp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2533APk.triggerKey$lambda$23$lambda$22(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue triggerKey$lambda$23$lambda$22(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_method_popuptriggercontext_trigger_key(j, uniffiRustCallStatus);
    }
}
