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
import uniffi.account.FfiConverterBoolean;
import uniffi.account.FfiConverterTypePasskeyAssertionParam;
import uniffi.account.FfiConverterTypePasskeyAssertionResponse;
import uniffi.account.FfiConverterTypePasskeyRegistrationParam;
import uniffi.account.FfiConverterTypePasskeyRegistrationResponse;
import uniffi.account.PasskeySdkException;
import uniffi.account.UniffiLib;

/* JADX INFO: renamed from: o.zXz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C59015zXz extends AbstractC60182zxs implements zXB {
    public static final int $stable = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.zXB
    public java.lang.Object AEQbTJ(@NotNull zWS zws, boolean z, @NotNull Continuation<? super zWT> continuation) throws PasskeySdkException {
        return registerPasskey$suspendImpl(this, zws, z, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.zXB
    public java.lang.Object KWHzl(@NotNull C58954zVq c58954zVq, boolean z, @NotNull Continuation<? super C58953zVp> continuation) throws PasskeySdkException {
        return assertPasskey$suspendImpl(this, c58954zVq, z, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.zXB
    public java.lang.Object copydefault(@NotNull C58954zVq c58954zVq, @NotNull Continuation<? super C58953zVp> continuation) throws PasskeySdkException {
        return assertUsingInHousePasskey$suspendImpl(this, c58954zVq, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59015zXz(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zXQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C59015zXz.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zXO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C59015zXz.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_passkeysdktrait(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_passkeysdktrait(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59015zXz(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zXG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C59015zXz.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zXI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C59015zXz.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_passkeysdktrait(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_passkeysdktrait(j, uniffiRustCallStatus);
    }

    public static /* synthetic */ java.lang.Object assertPasskey$suspendImpl(C59015zXz c59015zXz, final C58954zVq c58954zVq, final boolean z, Continuation<? super C58953zVp> continuation) throws PasskeySdkException {
        return C60173zxj.uniffiRustCallAsync(C60230zyn.uniffiRustBuffer, ((java.lang.Number) c59015zXz.callWithHandle$OKCore_deploy(new Function1() { // from class: o.zXC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C59015zXz.assertPasskey$lambda$4(c58954zVq, z, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.zXH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C59015zXz.assertPasskey$lambda$5(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.zXS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C59015zXz.assertPasskey$lambda$6(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.zXP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59015zXz.assertPasskey$lambda$7(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.zXR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59015zXz.assertPasskey$lambda$8((RustBuffer.ByValue) obj);
            }
        }, PasskeySdkException.ErrorHandler, continuation);
    }

    public static final long assertPasskey$lambda$4(C58954zVq c58954zVq, boolean z, long j) {
        return UniffiLib.INSTANCE.uniffi_account_fn_method_passkeysdktrait_assert_passkey(j, FfiConverterTypePasskeyAssertionParam.INSTANCE.lower2((java.lang.Object) c58954zVq), FfiConverterBoolean.INSTANCE.lower(z).byteValue());
    }

    public static final Unit assertPasskey$lambda$5(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_account_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue assertPasskey$lambda$6(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_account_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    public static final Unit assertPasskey$lambda$7(long j) {
        UniffiLib.INSTANCE.ffi_account_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    public static final C58953zVp assertPasskey$lambda$8(RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        return (C58953zVp) FfiConverterTypePasskeyAssertionResponse.INSTANCE.lift2(byValue);
    }

    public static /* synthetic */ java.lang.Object assertUsingInHousePasskey$suspendImpl(C59015zXz c59015zXz, final C58954zVq c58954zVq, Continuation<? super C58953zVp> continuation) throws PasskeySdkException {
        return C60173zxj.uniffiRustCallAsync(C60230zyn.uniffiRustBuffer, ((java.lang.Number) c59015zXz.callWithHandle$OKCore_deploy(new Function1() { // from class: o.zXT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C59015zXz.assertUsingInHousePasskey$lambda$9(c58954zVq, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.zXX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C59015zXz.assertUsingInHousePasskey$lambda$10(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.zXW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C59015zXz.assertUsingInHousePasskey$lambda$11(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.zXF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59015zXz.assertUsingInHousePasskey$lambda$12(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.zXE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59015zXz.assertUsingInHousePasskey$lambda$13((RustBuffer.ByValue) obj);
            }
        }, PasskeySdkException.ErrorHandler, continuation);
    }

    public static final long assertUsingInHousePasskey$lambda$9(C58954zVq c58954zVq, long j) {
        return UniffiLib.INSTANCE.uniffi_account_fn_method_passkeysdktrait_assert_using_in_house_passkey(j, FfiConverterTypePasskeyAssertionParam.INSTANCE.lower2((java.lang.Object) c58954zVq));
    }

    public static final Unit assertUsingInHousePasskey$lambda$10(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_account_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue assertUsingInHousePasskey$lambda$11(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_account_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    public static final Unit assertUsingInHousePasskey$lambda$12(long j) {
        UniffiLib.INSTANCE.ffi_account_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    public static final C58953zVp assertUsingInHousePasskey$lambda$13(RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        return (C58953zVp) FfiConverterTypePasskeyAssertionResponse.INSTANCE.lift2(byValue);
    }

    public static /* synthetic */ java.lang.Object registerPasskey$suspendImpl(C59015zXz c59015zXz, final zWS zws, final boolean z, Continuation<? super zWT> continuation) throws PasskeySdkException {
        return C60173zxj.uniffiRustCallAsync(C60230zyn.uniffiRustBuffer, ((java.lang.Number) c59015zXz.callWithHandle$OKCore_deploy(new Function1() { // from class: o.zXK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C59015zXz.registerPasskey$lambda$14(zws, z, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.zXL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C59015zXz.registerPasskey$lambda$15(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.zXJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C59015zXz.registerPasskey$lambda$16(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.zXN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59015zXz.registerPasskey$lambda$17(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.zXM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59015zXz.registerPasskey$lambda$18((RustBuffer.ByValue) obj);
            }
        }, PasskeySdkException.ErrorHandler, continuation);
    }

    public static final long registerPasskey$lambda$14(zWS zws, boolean z, long j) {
        return UniffiLib.INSTANCE.uniffi_account_fn_method_passkeysdktrait_register_passkey(j, FfiConverterTypePasskeyRegistrationParam.INSTANCE.lower2((java.lang.Object) zws), FfiConverterBoolean.INSTANCE.lower(z).byteValue());
    }

    public static final Unit registerPasskey$lambda$15(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_account_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue registerPasskey$lambda$16(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_account_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    public static final Unit registerPasskey$lambda$17(long j) {
        UniffiLib.INSTANCE.ffi_account_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    public static final zWT registerPasskey$lambda$18(RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        return (zWT) FfiConverterTypePasskeyRegistrationResponse.INSTANCE.lift2(byValue);
    }
}
