package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.UniffiRustFutureContinuationCallback;
import uniffi.account.FfiConverterBoolean;
import uniffi.account.UniffiLib;

/* JADX INFO: renamed from: o.zYd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C59019zYd extends AbstractC60182zxs implements InterfaceC59023zYh {
    public static final int $stable = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59023zYh
    public java.lang.Object EZpvd(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return isPasskeySupported$suspendImpl(this, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59023zYh
    public java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return isFido1PasskeySupported$suspendImpl(this, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59023zYh
    public java.lang.Object copydefault(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return isFido2PasskeySupported$suspendImpl(this, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59019zYd(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zYs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C59019zYd.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zYt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C59019zYd.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_passkeysupportcheckertrait(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_passkeysupportcheckertrait(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59019zYd(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zYl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C59019zYd.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zYk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C59019zYd.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_passkeysupportcheckertrait(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_passkeysupportcheckertrait(j, uniffiRustCallStatus);
    }

    public static /* synthetic */ java.lang.Object isPasskeySupported$suspendImpl(C59019zYd c59019zYd, Continuation<? super java.lang.Boolean> continuation) {
        return C60173zxj.uniffiRustCallAsync(C60230zyn.uniffiRustBuffer, ((java.lang.Number) c59019zYd.callWithHandle$OKCore_deploy(new Function1() { // from class: o.zYe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C59019zYd.isPasskeySupported$lambda$4(((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.zYf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C59019zYd.isPasskeySupported$lambda$5(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.zYr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Byte.valueOf(C59019zYd.isPasskeySupported$lambda$6(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        }, new Function1() { // from class: o.zYu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59019zYd.isPasskeySupported$lambda$7(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.zYv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C59019zYd.isPasskeySupported$lambda$8(((java.lang.Byte) obj).byteValue()));
            }
        }, new C60178zxo(C60230zyn.uniffiRustBuffer), continuation);
    }

    public static final long isPasskeySupported$lambda$4(long j) {
        return UniffiLib.INSTANCE.uniffi_account_fn_method_passkeysupportcheckertrait_is_passkey_supported(j);
    }

    public static final Unit isPasskeySupported$lambda$5(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_account_rust_future_poll_i8(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final byte isPasskeySupported$lambda$6(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_account_rust_future_complete_i8(j, uniffiRustCallStatus);
    }

    public static final Unit isPasskeySupported$lambda$7(long j) {
        UniffiLib.INSTANCE.ffi_account_rust_future_free_i8(j);
        return Unit.INSTANCE;
    }

    public static final boolean isPasskeySupported$lambda$8(byte b) {
        return FfiConverterBoolean.INSTANCE.lift(b).booleanValue();
    }

    public static /* synthetic */ java.lang.Object isFido1PasskeySupported$suspendImpl(C59019zYd c59019zYd, Continuation<? super java.lang.Boolean> continuation) {
        return C60173zxj.uniffiRustCallAsync(C60230zyn.uniffiRustBuffer, ((java.lang.Number) c59019zYd.callWithHandle$OKCore_deploy(new Function1() { // from class: o.zYi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C59019zYd.isFido1PasskeySupported$lambda$9(((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.zYp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C59019zYd.isFido1PasskeySupported$lambda$10(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.zYo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Byte.valueOf(C59019zYd.isFido1PasskeySupported$lambda$11(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        }, new Function1() { // from class: o.zYn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59019zYd.isFido1PasskeySupported$lambda$12(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.zYq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C59019zYd.isFido1PasskeySupported$lambda$13(((java.lang.Byte) obj).byteValue()));
            }
        }, new C60178zxo(C60230zyn.uniffiRustBuffer), continuation);
    }

    public static final long isFido1PasskeySupported$lambda$9(long j) {
        return UniffiLib.INSTANCE.uniffi_account_fn_method_passkeysupportcheckertrait_is_fido1_passkey_supported(j);
    }

    public static final Unit isFido1PasskeySupported$lambda$10(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_account_rust_future_poll_i8(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final byte isFido1PasskeySupported$lambda$11(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_account_rust_future_complete_i8(j, uniffiRustCallStatus);
    }

    public static final Unit isFido1PasskeySupported$lambda$12(long j) {
        UniffiLib.INSTANCE.ffi_account_rust_future_free_i8(j);
        return Unit.INSTANCE;
    }

    public static final boolean isFido1PasskeySupported$lambda$13(byte b) {
        return FfiConverterBoolean.INSTANCE.lift(b).booleanValue();
    }

    public static /* synthetic */ java.lang.Object isFido2PasskeySupported$suspendImpl(C59019zYd c59019zYd, Continuation<? super java.lang.Boolean> continuation) {
        return C60173zxj.uniffiRustCallAsync(C60230zyn.uniffiRustBuffer, ((java.lang.Number) c59019zYd.callWithHandle$OKCore_deploy(new Function1() { // from class: o.zYw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C59019zYd.isFido2PasskeySupported$lambda$14(((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.zYA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C59019zYd.isFido2PasskeySupported$lambda$15(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.zYy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Byte.valueOf(C59019zYd.isFido2PasskeySupported$lambda$16(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        }, new Function1() { // from class: o.zYm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59019zYd.isFido2PasskeySupported$lambda$17(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.zYj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C59019zYd.isFido2PasskeySupported$lambda$18(((java.lang.Byte) obj).byteValue()));
            }
        }, new C60178zxo(C60230zyn.uniffiRustBuffer), continuation);
    }

    public static final long isFido2PasskeySupported$lambda$14(long j) {
        return UniffiLib.INSTANCE.uniffi_account_fn_method_passkeysupportcheckertrait_is_fido2_passkey_supported(j);
    }

    public static final Unit isFido2PasskeySupported$lambda$15(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_account_rust_future_poll_i8(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final byte isFido2PasskeySupported$lambda$16(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_account_rust_future_complete_i8(j, uniffiRustCallStatus);
    }

    public static final Unit isFido2PasskeySupported$lambda$17(long j) {
        UniffiLib.INSTANCE.ffi_account_rust_future_free_i8(j);
        return Unit.INSTANCE;
    }

    public static final boolean isFido2PasskeySupported$lambda$18(byte b) {
        return FfiConverterBoolean.INSTANCE.lift(b).booleanValue();
    }
}
