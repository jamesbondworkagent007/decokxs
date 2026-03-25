package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.UniffiRustFutureContinuationCallback;
import uniffi.lifecycle.FfiConverterBoolean;
import uniffi.lifecycle.LifecycleFutureException;
import uniffi.lifecycle.UniffiLib;

/* JADX INFO: renamed from: o.AVw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C2700AVw extends AbstractC60182zxs implements InterfaceC2699AVv {
    public static final int $stable = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC2699AVv
    public java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.Boolean> continuation) throws LifecycleFutureException {
        return execute$suspendImpl(this, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2700AVw(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), C2692AVo.uniffiRustBuffer, new Function2() { // from class: o.AVD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2700AVw.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AVF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2700AVw.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_lifecycle_fn_free_oknativetaskboolwithlifecyclefutureerror(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_clone_oknativetaskboolwithlifecyclefutureerror(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2700AVw(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), C2692AVo.uniffiRustBuffer, new Function2() { // from class: o.AVt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2700AVw.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AVu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2700AVw.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_lifecycle_fn_free_oknativetaskboolwithlifecyclefutureerror(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_clone_oknativetaskboolwithlifecyclefutureerror(j, uniffiRustCallStatus);
    }

    public static /* synthetic */ java.lang.Object execute$suspendImpl(C2700AVw c2700AVw, Continuation<? super java.lang.Boolean> continuation) throws LifecycleFutureException {
        return C60173zxj.uniffiRustCallAsync(C2692AVo.uniffiRustBuffer, ((java.lang.Number) c2700AVw.callWithHandle$OKCore_deploy(new Function1() { // from class: o.AVC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C2700AVw.KWHzl(((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.AVy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C2700AVw.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.AVA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Byte.valueOf(C2700AVw.AYXKKw(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        }, new Function1() { // from class: o.AVz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2700AVw.copydefault(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.AVB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C2700AVw.AEQbTJ(((java.lang.Byte) obj).byteValue()));
            }
        }, LifecycleFutureException.ErrorHandler, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j) {
        return UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_oknativetaskboolwithlifecyclefutureerror_execute(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_lifecycle_rust_future_poll_i8(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte AYXKKw(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_lifecycle_rust_future_complete_i8(j, uniffiRustCallStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j) {
        UniffiLib.INSTANCE.ffi_lifecycle_rust_future_free_i8(j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AEQbTJ(byte b) {
        return FfiConverterBoolean.INSTANCE.lift(b).booleanValue();
    }

    @Override // o.InterfaceC2699AVv
    public void EZpvd() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.AVx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2700AVw.EZpvd(((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(final long j) {
        C60173zxj.uniffiRustCall(C2692AVo.uniffiRustBuffer, new Function1() { // from class: o.AVE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2700AVw.OLrzqt(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_lifecycle_fn_method_oknativetaskboolwithlifecyclefutureerror_cancel(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
