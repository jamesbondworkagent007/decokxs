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
import uniffi.account.FfiConverterTypeUserCenterEvent;
import uniffi.account.FfiConverterTypeUserCenterEventCallback;
import uniffi.account.FfiConverterTypeUserCenterStateChangeCallback;
import uniffi.account.UniffiLib;

/* JADX INFO: renamed from: o.Aip, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C3274Aip extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3274Aip(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.Aio
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3274Aip.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Air
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3274Aip.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_usercenterinteractor(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_usercenterinteractor(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3274Aip(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.AiB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3274Aip.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Aiz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3274Aip.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_usercenterinteractor(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_usercenterinteractor(j, uniffiRustCallStatus);
    }

    public C3274Aip() {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.AiG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C3274Aip.OLrzqt((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_constructor_usercenterinteractor_new(uniffiRustCallStatus);
    }

    public static /* synthetic */ java.lang.Object ackAvatarReject$suspendImpl(C3274Aip c3274Aip, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objUniffiRustCallAsync = C60173zxj.uniffiRustCallAsync(C60230zyn.uniffiRustBuffer, ((java.lang.Number) c3274Aip.callWithHandle$OKCore_deploy(new Function1() { // from class: o.Aix
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C3274Aip.ackAvatarReject$lambda$5(((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.AiF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C3274Aip.ackAvatarReject$lambda$6(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.AiE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3274Aip.ackAvatarReject$lambda$7(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.AiD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3274Aip.ackAvatarReject$lambda$8(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.AiC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3274Aip.ackAvatarReject$lambda$9((Unit) obj);
            }
        }, new C60178zxo(C60230zyn.uniffiRustBuffer), continuation);
        return objUniffiRustCallAsync == C56442yFn.copydefault() ? objUniffiRustCallAsync : Unit.INSTANCE;
    }

    public static final long ackAvatarReject$lambda$5(long j) {
        return UniffiLib.INSTANCE.uniffi_account_fn_method_usercenterinteractor_ack_avatar_reject(j);
    }

    public static final Unit ackAvatarReject$lambda$6(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_account_rust_future_poll_void(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final Unit ackAvatarReject$lambda$7(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.ffi_account_rust_future_complete_void(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit ackAvatarReject$lambda$8(long j) {
        UniffiLib.INSTANCE.ffi_account_rust_future_free_void(j);
        return Unit.INSTANCE;
    }

    public static final Unit ackAvatarReject$lambda$9(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return Unit.INSTANCE;
    }

    public static final Unit emitEvent$lambda$11(final AbstractC3265Aig abstractC3265Aig, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.AiA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3274Aip.emitEvent$lambda$11$lambda$10(j, abstractC3265Aig, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit emitEvent$lambda$11$lambda$10(long j, AbstractC3265Aig abstractC3265Aig, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_usercenterinteractor_emit_event(j, FfiConverterTypeUserCenterEvent.INSTANCE.lower2((java.lang.Object) abstractC3265Aig), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit emitState$lambda$13(final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.Aiq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3274Aip.emitState$lambda$13$lambda$12(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit emitState$lambda$13$lambda$12(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_usercenterinteractor_emit_state(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue getCachedState$lambda$15(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.Ain
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3274Aip.getCachedState$lambda$15$lambda$14(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getCachedState$lambda$15$lambda$14(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_usercenterinteractor_get_cached_state(j, uniffiRustCallStatus);
    }

    public static /* synthetic */ java.lang.Object loadAvatarInfo$suspendImpl(C3274Aip c3274Aip, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objUniffiRustCallAsync = C60173zxj.uniffiRustCallAsync(C60230zyn.uniffiRustBuffer, ((java.lang.Number) c3274Aip.callWithHandle$OKCore_deploy(new Function1() { // from class: o.Ais
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C3274Aip.loadAvatarInfo$lambda$16(((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.Aiv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C3274Aip.loadAvatarInfo$lambda$17(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.Aiu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3274Aip.loadAvatarInfo$lambda$18(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.Aiw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3274Aip.loadAvatarInfo$lambda$19(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.Aiy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3274Aip.loadAvatarInfo$lambda$20((Unit) obj);
            }
        }, new C60178zxo(C60230zyn.uniffiRustBuffer), continuation);
        return objUniffiRustCallAsync == C56442yFn.copydefault() ? objUniffiRustCallAsync : Unit.INSTANCE;
    }

    public static final long loadAvatarInfo$lambda$16(long j) {
        return UniffiLib.INSTANCE.uniffi_account_fn_method_usercenterinteractor_load_avatar_info(j);
    }

    public static final Unit loadAvatarInfo$lambda$17(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_account_rust_future_poll_void(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final Unit loadAvatarInfo$lambda$18(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.ffi_account_rust_future_complete_void(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit loadAvatarInfo$lambda$19(long j) {
        UniffiLib.INSTANCE.ffi_account_rust_future_free_void(j);
        return Unit.INSTANCE;
    }

    public static final Unit loadAvatarInfo$lambda$20(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return Unit.INSTANCE;
    }

    public static final Unit setEventCallback$lambda$22(final InterfaceC3262Aid interfaceC3262Aid, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.AiJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3274Aip.setEventCallback$lambda$22$lambda$21(j, interfaceC3262Aid, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setEventCallback$lambda$22$lambda$21(long j, InterfaceC3262Aid interfaceC3262Aid, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_usercenterinteractor_set_event_callback(j, FfiConverterTypeUserCenterEventCallback.INSTANCE.lower2(interfaceC3262Aid).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit setStateCallback$lambda$24(final InterfaceC3240AiH interfaceC3240AiH, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.Ait
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3274Aip.setStateCallback$lambda$24$lambda$23(j, interfaceC3240AiH, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setStateCallback$lambda$24$lambda$23(long j, InterfaceC3240AiH interfaceC3240AiH, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_usercenterinteractor_set_state_callback(j, FfiConverterTypeUserCenterStateChangeCallback.INSTANCE.lower2(interfaceC3240AiH).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
