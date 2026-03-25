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
import uniffi.account.FfiConverterTypeSecurityListState;
import uniffi.account.FfiConverterTypeSecurityListStateChangeCallback;
import uniffi.account.FfiConverterTypeSecurityNavigation;
import uniffi.account.FfiConverterTypeSecurityType;
import uniffi.account.SecurityType;
import uniffi.account.UniffiLib;

/* JADX INFO: renamed from: o.Aey, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C3071Aey extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3071Aey(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.AeG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3071Aey.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AeK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3071Aey.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_securitylistinteractor(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_securitylistinteractor(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3071Aey(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.AeT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3071Aey.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AeP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3071Aey.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_securitylistinteractor(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_securitylistinteractor(j, uniffiRustCallStatus);
    }

    public C3071Aey() {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.Aex
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C3071Aey.EZpvd((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_constructor_securitylistinteractor_new(uniffiRustCallStatus);
    }

    public static final Unit emitState$lambda$6(final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.AeH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3071Aey.emitState$lambda$6$lambda$5(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit emitState$lambda$6$lambda$5(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_securitylistinteractor_emit_state(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final long getOnClickNavigation$lambda$7(SecurityType securityType, long j) {
        return UniffiLib.INSTANCE.uniffi_account_fn_method_securitylistinteractor_get_on_click_navigation(j, FfiConverterTypeSecurityType.INSTANCE.lower2((java.lang.Object) securityType));
    }

    public static final Unit getOnClickNavigation$lambda$8(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_account_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue getOnClickNavigation$lambda$9(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_account_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    public static final Unit getOnClickNavigation$lambda$10(long j) {
        UniffiLib.INSTANCE.ffi_account_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    public static final AbstractC3100Afa getOnClickNavigation$lambda$11(RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        return (AbstractC3100Afa) FfiConverterTypeSecurityNavigation.INSTANCE.lift2(byValue);
    }

    public static final long getSecurityListState$lambda$12(long j) {
        return UniffiLib.INSTANCE.uniffi_account_fn_method_securitylistinteractor_get_security_list_state(j);
    }

    public static final Unit getSecurityListState$lambda$13(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_account_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue getSecurityListState$lambda$14(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_account_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    public static final Unit getSecurityListState$lambda$15(long j) {
        UniffiLib.INSTANCE.ffi_account_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    public static final C3043AeW getSecurityListState$lambda$16(RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        return (C3043AeW) FfiConverterTypeSecurityListState.INSTANCE.lift2(byValue);
    }

    public static /* synthetic */ java.lang.Object refreshState$suspendImpl(C3071Aey c3071Aey, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objUniffiRustCallAsync = C60173zxj.uniffiRustCallAsync(C60230zyn.uniffiRustBuffer, ((java.lang.Number) c3071Aey.callWithHandle$OKCore_deploy(new Function1() { // from class: o.AeN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C3071Aey.refreshState$lambda$17(((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.AeO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C3071Aey.refreshState$lambda$18(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.AeL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3071Aey.refreshState$lambda$19(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.AeS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3071Aey.refreshState$lambda$20(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.AeQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3071Aey.refreshState$lambda$21((Unit) obj);
            }
        }, new C60178zxo(C60230zyn.uniffiRustBuffer), continuation);
        return objUniffiRustCallAsync == C56442yFn.copydefault() ? objUniffiRustCallAsync : Unit.INSTANCE;
    }

    public static final long refreshState$lambda$17(long j) {
        return UniffiLib.INSTANCE.uniffi_account_fn_method_securitylistinteractor_refresh_state(j);
    }

    public static final Unit refreshState$lambda$18(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_account_rust_future_poll_void(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final Unit refreshState$lambda$19(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.ffi_account_rust_future_complete_void(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit refreshState$lambda$20(long j) {
        UniffiLib.INSTANCE.ffi_account_rust_future_free_void(j);
        return Unit.INSTANCE;
    }

    public static final Unit refreshState$lambda$21(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return Unit.INSTANCE;
    }

    public static final Unit setStateCallback$lambda$23(final InterfaceC3041AeU interfaceC3041AeU, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.AeM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3071Aey.setStateCallback$lambda$23$lambda$22(j, interfaceC3041AeU, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setStateCallback$lambda$23$lambda$22(long j, InterfaceC3041AeU interfaceC3041AeU, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_securitylistinteractor_set_state_callback(j, FfiConverterTypeSecurityListStateChangeCallback.INSTANCE.lower2(interfaceC3041AeU).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
