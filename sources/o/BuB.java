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
import uniffi.ok_future_utils.FfiConverterTypeOKCancellationToken;
import uniffi.ok_future_utils.FfiConverterTypeOKRustFutureStringWithOKFFIError;
import uniffi.ok_future_utils.OkffiException;
import uniffi.upgrade.FfiConverterTypeOKUser;
import uniffi.upgrade.FfiConverterTypeOKUserFactory;
import uniffi.upgrade.FfiConverterTypeUpgradeContextInterface;
import uniffi.upgrade.FfiConverterTypeUpgradeCore;
import uniffi.upgrade.GetUserException;
import uniffi.upgrade.IntegrityCheckingUniffiLib;
import uniffi.upgrade.UniffiLib;
import uniffi.upgrade.UpgradeCore;

/* JADX INFO: loaded from: classes14.dex */
public final class BuB {
    public static final RustBuffer uniffiRustBuffer = new RustBuffer(new StateListAnimator());

    public static final class StateListAnimator implements InterfaceC60174zxk {
        @Override // o.InterfaceC60174zxk
        public RustBuffer.ByValue alloc(long j, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.ffi_upgrade_rustbuffer_alloc(j, uniffiRustCallStatus);
        }

        @Override // o.InterfaceC60174zxk
        public void free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            UniffiLib.INSTANCE.ffi_upgrade_rustbuffer_free(byValue, uniffiRustCallStatus);
        }
    }

    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_upgrade_uniffi_contract_version()) {
            throw new java.lang.RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = IntegrityCheckingUniffiLib.INSTANCE;
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
    }

    public static final java.lang.Object getUserFfiErrorWithCancelToken(@NotNull BdU bdU, @NotNull Continuation<? super BtK> continuation) throws OkffiException {
        return C60173zxj.uniffiRustCallAsync(uniffiRustBuffer, UniffiLib.INSTANCE.uniffi_upgrade_fn_func_get_user_ffi_error_with_cancel_token(FfiConverterTypeOKCancellationToken.INSTANCE.lower2(bdU).longValue()), new yHO() { // from class: o.BuM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return BuB.getUserFfiErrorWithCancelToken$lambda$0(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.BuL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BuB.getUserFfiErrorWithCancelToken$lambda$1(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.BuI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BuB.getUserFfiErrorWithCancelToken$lambda$2(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.BuK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BuB.getUserFfiErrorWithCancelToken$lambda$3((RustBuffer.ByValue) obj);
            }
        }, BtP.INSTANCE, continuation);
    }

    public static final Unit getUserFfiErrorWithCancelToken$lambda$0(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_upgrade_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue getUserFfiErrorWithCancelToken$lambda$1(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_upgrade_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    public static final Unit getUserFfiErrorWithCancelToken$lambda$2(long j) {
        UniffiLib.INSTANCE.ffi_upgrade_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    public static final BtK getUserFfiErrorWithCancelToken$lambda$3(RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        return (BtK) FfiConverterTypeOKUser.INSTANCE.lift2(byValue);
    }

    public static final C4439Bec getUserName() {
        return FfiConverterTypeOKRustFutureStringWithOKFFIError.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BuJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BuB.getUserName$lambda$4((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long getUserName$lambda$4(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_upgrade_fn_func_get_user_name(uniffiRustCallStatus);
    }

    public static final java.lang.Object getUserWithCancelToken(@NotNull BdU bdU, @NotNull Continuation<? super BtK> continuation) throws GetUserException {
        return C60173zxj.uniffiRustCallAsync(uniffiRustBuffer, UniffiLib.INSTANCE.uniffi_upgrade_fn_func_get_user_with_cancel_token(FfiConverterTypeOKCancellationToken.INSTANCE.lower2(bdU).longValue()), new yHO() { // from class: o.BuF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return BuB.getUserWithCancelToken$lambda$5(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.BuG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BuB.getUserWithCancelToken$lambda$6(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.BuH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BuB.getUserWithCancelToken$lambda$7(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.BuD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BuB.getUserWithCancelToken$lambda$8((RustBuffer.ByValue) obj);
            }
        }, GetUserException.ErrorHandler, continuation);
    }

    public static final Unit getUserWithCancelToken$lambda$5(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_upgrade_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue getUserWithCancelToken$lambda$6(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_upgrade_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    public static final Unit getUserWithCancelToken$lambda$7(long j) {
        UniffiLib.INSTANCE.ffi_upgrade_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    public static final BtK getUserWithCancelToken$lambda$8(RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        return (BtK) FfiConverterTypeOKUser.INSTANCE.lift2(byValue);
    }

    public static final UpgradeCore initializeUpgradeCore(@NotNull final BtU btU) {
        Intrinsics.checkNotNullParameter(btU, "");
        return FfiConverterTypeUpgradeCore.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BuN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BuB.initializeUpgradeCore$lambda$9(btU, (UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long initializeUpgradeCore$lambda$9(BtU btU, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_upgrade_fn_func_initialize_upgrade_core(FfiConverterTypeUpgradeContextInterface.INSTANCE.lower2(btU).longValue(), uniffiRustCallStatus);
    }

    public static final void registerOkUserFactory(@NotNull final BtM btM) {
        Intrinsics.checkNotNullParameter(btM, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BuE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BuB.registerOkUserFactory$lambda$10(btM, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerOkUserFactory$lambda$10(BtM btM, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_upgrade_fn_func_register_ok_user_factory(FfiConverterTypeOKUserFactory.INSTANCE.lower2(btM).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
