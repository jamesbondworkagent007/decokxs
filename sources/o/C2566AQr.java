package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.UniffiRustFutureContinuationCallback;
import uniffi.growth.FfiConverterTypePopupCallbacks;
import uniffi.growth.FfiConverterTypePopupProvider;
import uniffi.growth.FfiConverterTypePopupTriggerContext;
import uniffi.growth.UniffiLib;

/* JADX INFO: renamed from: o.AQr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C2566AQr extends AbstractC60182zxs implements InterfaceC2568AQt {
    public static final int $stable = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC2568AQt
    public java.lang.Object KWHzl(@NotNull AOQ aoq, @NotNull C2533APk c2533APk, @NotNull C2510AOn c2510AOn, @NotNull Continuation<? super Unit> continuation) {
        return runOnUi$suspendImpl(this, aoq, c2533APk, c2510AOn, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2566AQr(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), ANQ.uniffiRustBuffer, new Function2() { // from class: o.AQs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2566AQr.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AQv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2566AQr.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_growth_fn_free_uiexecutor(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_clone_uiexecutor(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2566AQr(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), ANQ.uniffiRustBuffer, new Function2() { // from class: o.AQy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2566AQr.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AQC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2566AQr.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_growth_fn_free_uiexecutor(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_clone_uiexecutor(j, uniffiRustCallStatus);
    }

    public static /* synthetic */ java.lang.Object runOnUi$suspendImpl(C2566AQr c2566AQr, final AOQ aoq, final C2533APk c2533APk, final C2510AOn c2510AOn, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objUniffiRustCallAsync = C60173zxj.uniffiRustCallAsync(ANQ.uniffiRustBuffer, ((java.lang.Number) c2566AQr.callWithHandle$OKCore_deploy(new Function1() { // from class: o.AQu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2566AQr.runOnUi$lambda$4(aoq, c2533APk, c2510AOn, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.AQw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C2566AQr.runOnUi$lambda$5(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.AQA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2566AQr.runOnUi$lambda$6(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.AQz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2566AQr.runOnUi$lambda$7(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.AQx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2566AQr.runOnUi$lambda$8((Unit) obj);
            }
        }, new C60178zxo(ANQ.uniffiRustBuffer), continuation);
        return objUniffiRustCallAsync == C56442yFn.copydefault() ? objUniffiRustCallAsync : Unit.INSTANCE;
    }

    public static final long runOnUi$lambda$4(AOQ aoq, C2533APk c2533APk, C2510AOn c2510AOn, long j) {
        return UniffiLib.INSTANCE.uniffi_growth_fn_method_uiexecutor_run_on_ui(j, FfiConverterTypePopupProvider.INSTANCE.lower2(aoq).longValue(), FfiConverterTypePopupTriggerContext.INSTANCE.lower2(c2533APk).longValue(), FfiConverterTypePopupCallbacks.INSTANCE.lower2(c2510AOn).longValue());
    }

    public static final Unit runOnUi$lambda$5(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_growth_rust_future_poll_void(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final Unit runOnUi$lambda$6(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.ffi_growth_rust_future_complete_void(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit runOnUi$lambda$7(long j) {
        UniffiLib.INSTANCE.ffi_growth_rust_future_free_void(j);
        return Unit.INSTANCE;
    }

    public static final Unit runOnUi$lambda$8(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return Unit.INSTANCE;
    }
}
