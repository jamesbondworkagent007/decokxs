package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.UniffiRustFutureContinuationCallback;
import uniffi.account.FfiConverterBoolean;
import uniffi.account.FfiConverterByteArray;
import uniffi.account.FfiConverterString;
import uniffi.account.OkxPasskeyException;
import uniffi.account.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public class zIV extends AbstractC60182zxs implements zIR {
    public static final int $stable = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.zIR
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super byte[]> continuation) throws OkxPasskeyException {
        return getProtectionPublicKey$suspendImpl(this, str, str2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.zIR
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) throws OkxPasskeyException {
        return verifyUserPresence$suspendImpl(this, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.zIR
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.lang.Boolean> continuation) throws OkxPasskeyException {
        return isProtectionKeyAvailable$suspendImpl(this, str, str2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.zIR
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull byte[] bArr, @NotNull Continuation<? super byte[]> continuation) throws OkxPasskeyException {
        return decryptWithProtectionKey$suspendImpl(this, str, str2, bArr, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zIV(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zJk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return zIV.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zJj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(zIV.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_nativepasskeykeyprovider(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_nativepasskeykeyprovider(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zIV(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zJf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return zIV.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zJe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(zIV.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_nativepasskeykeyprovider(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_nativepasskeykeyprovider(j, uniffiRustCallStatus);
    }

    @Override // o.zIR
    public void OLrzqt() throws OkxPasskeyException {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zJd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zIV.checkDevicePasscode$lambda$5(((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    public static final Unit checkDevicePasscode$lambda$5(final long j) throws E, InternalException {
        C60173zxj.uniffiRustCallWithError(C60230zyn.uniffiRustBuffer, OkxPasskeyException.ErrorHandler, new Function1() { // from class: o.zJm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zIV.checkDevicePasscode$lambda$5$lambda$4(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit checkDevicePasscode$lambda$5$lambda$4(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_nativepasskeykeyprovider_check_device_passcode(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object isProtectionKeyAvailable$suspendImpl(zIV ziv, final java.lang.String str, final java.lang.String str2, Continuation<? super java.lang.Boolean> continuation) throws OkxPasskeyException {
        return C60173zxj.uniffiRustCallAsync(C60230zyn.uniffiRustBuffer, ((java.lang.Number) ziv.callWithHandle$OKCore_deploy(new Function1() { // from class: o.zJh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(zIV.isProtectionKeyAvailable$lambda$6(str, str2, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.zJr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return zIV.isProtectionKeyAvailable$lambda$7(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.zJE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Byte.valueOf(zIV.isProtectionKeyAvailable$lambda$8(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        }, new Function1() { // from class: o.zJG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zIV.isProtectionKeyAvailable$lambda$9(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.zJD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(zIV.isProtectionKeyAvailable$lambda$10(((java.lang.Byte) obj).byteValue()));
            }
        }, OkxPasskeyException.ErrorHandler, continuation);
    }

    public static final long isProtectionKeyAvailable$lambda$6(java.lang.String str, java.lang.String str2, long j) {
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_account_fn_method_nativepasskeykeyprovider_is_protection_key_available(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2));
    }

    public static final Unit isProtectionKeyAvailable$lambda$7(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_account_rust_future_poll_i8(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final byte isProtectionKeyAvailable$lambda$8(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_account_rust_future_complete_i8(j, uniffiRustCallStatus);
    }

    public static final Unit isProtectionKeyAvailable$lambda$9(long j) {
        UniffiLib.INSTANCE.ffi_account_rust_future_free_i8(j);
        return Unit.INSTANCE;
    }

    public static final boolean isProtectionKeyAvailable$lambda$10(byte b) {
        return FfiConverterBoolean.INSTANCE.lift(b).booleanValue();
    }

    @Override // o.zIR
    public void EZpvd() throws OkxPasskeyException {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zJc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zIV.showDevicePasscodeForLockout$lambda$12(((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    public static final Unit showDevicePasscodeForLockout$lambda$12(final long j) throws E, InternalException {
        C60173zxj.uniffiRustCallWithError(C60230zyn.uniffiRustBuffer, OkxPasskeyException.ErrorHandler, new Function1() { // from class: o.zJl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zIV.showDevicePasscodeForLockout$lambda$12$lambda$11(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit showDevicePasscodeForLockout$lambda$12$lambda$11(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_method_nativepasskeykeyprovider_show_device_passcode_for_lockout(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object verifyUserPresence$suspendImpl(zIV ziv, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objUniffiRustCallAsync = C60173zxj.uniffiRustCallAsync(C60230zyn.uniffiRustBuffer, ((java.lang.Number) ziv.callWithHandle$OKCore_deploy(new Function1() { // from class: o.zIU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(zIV.verifyUserPresence$lambda$13(((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.zIX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return zIV.verifyUserPresence$lambda$14(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.zJb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return zIV.verifyUserPresence$lambda$15(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.zIY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zIV.verifyUserPresence$lambda$16(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.zJa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zIV.verifyUserPresence$lambda$17((Unit) obj);
            }
        }, OkxPasskeyException.ErrorHandler, continuation);
        return objUniffiRustCallAsync == C56442yFn.copydefault() ? objUniffiRustCallAsync : Unit.INSTANCE;
    }

    public static final long verifyUserPresence$lambda$13(long j) {
        return UniffiLib.INSTANCE.uniffi_account_fn_method_nativepasskeykeyprovider_verify_user_presence(j);
    }

    public static final Unit verifyUserPresence$lambda$14(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_account_rust_future_poll_void(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final Unit verifyUserPresence$lambda$15(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.ffi_account_rust_future_complete_void(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit verifyUserPresence$lambda$16(long j) {
        UniffiLib.INSTANCE.ffi_account_rust_future_free_void(j);
        return Unit.INSTANCE;
    }

    public static final Unit verifyUserPresence$lambda$17(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object getProtectionPublicKey$suspendImpl(zIV ziv, final java.lang.String str, final java.lang.String str2, Continuation<? super byte[]> continuation) throws OkxPasskeyException {
        return C60173zxj.uniffiRustCallAsync(C60230zyn.uniffiRustBuffer, ((java.lang.Number) ziv.callWithHandle$OKCore_deploy(new Function1() { // from class: o.zJw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(zIV.getProtectionPublicKey$lambda$18(str, str2, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.zJt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return zIV.getProtectionPublicKey$lambda$19(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.zJu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return zIV.getProtectionPublicKey$lambda$20(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.zJB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zIV.getProtectionPublicKey$lambda$21(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.zJz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zIV.getProtectionPublicKey$lambda$22((RustBuffer.ByValue) obj);
            }
        }, OkxPasskeyException.ErrorHandler, continuation);
    }

    public static final long getProtectionPublicKey$lambda$18(java.lang.String str, java.lang.String str2, long j) {
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_account_fn_method_nativepasskeykeyprovider_get_protection_public_key(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2));
    }

    public static final Unit getProtectionPublicKey$lambda$19(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_account_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue getProtectionPublicKey$lambda$20(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_account_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    public static final Unit getProtectionPublicKey$lambda$21(long j) {
        UniffiLib.INSTANCE.ffi_account_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    public static final byte[] getProtectionPublicKey$lambda$22(RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        return (byte[]) FfiConverterByteArray.INSTANCE.lift2(byValue);
    }

    public static /* synthetic */ java.lang.Object decryptWithProtectionKey$suspendImpl(zIV ziv, final java.lang.String str, final java.lang.String str2, final byte[] bArr, Continuation<? super byte[]> continuation) throws OkxPasskeyException {
        return C60173zxj.uniffiRustCallAsync(C60230zyn.uniffiRustBuffer, ((java.lang.Number) ziv.callWithHandle$OKCore_deploy(new Function1() { // from class: o.zJo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(zIV.decryptWithProtectionKey$lambda$23(str, str2, bArr, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.zJn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return zIV.decryptWithProtectionKey$lambda$24(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.zJp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return zIV.decryptWithProtectionKey$lambda$25(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.zJs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zIV.decryptWithProtectionKey$lambda$26(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.zJv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zIV.decryptWithProtectionKey$lambda$27((RustBuffer.ByValue) obj);
            }
        }, OkxPasskeyException.ErrorHandler, continuation);
    }

    public static final long decryptWithProtectionKey$lambda$23(java.lang.String str, java.lang.String str2, byte[] bArr, long j) {
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_account_fn_method_nativepasskeykeyprovider_decrypt_with_protection_key(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), FfiConverterByteArray.INSTANCE.lower2((java.lang.Object) bArr));
    }

    public static final Unit decryptWithProtectionKey$lambda$24(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_account_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue decryptWithProtectionKey$lambda$25(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_account_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    public static final Unit decryptWithProtectionKey$lambda$26(long j) {
        UniffiLib.INSTANCE.ffi_account_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    public static final byte[] decryptWithProtectionKey$lambda$27(RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        return (byte[]) FfiConverterByteArray.INSTANCE.lift2(byValue);
    }

    @Override // o.zIR
    public void djBIcL(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zJg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zIV.removeProtectionKey$lambda$29(str, str2, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit removeProtectionKey$lambda$29(final java.lang.String str, final java.lang.String str2, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zJL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zIV.removeProtectionKey$lambda$29$lambda$28(j, str, str2, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit removeProtectionKey$lambda$29$lambda$28(long j, java.lang.String str, java.lang.String str2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        uniffiLib.uniffi_account_fn_method_nativepasskeykeyprovider_remove_protection_key(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.zIR
    public void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final byte[] bArr) throws OkxPasskeyException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zIW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zIV.storeEncryptedPasskey$lambda$31(str, str2, str3, str4, bArr, ((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    public static final Unit storeEncryptedPasskey$lambda$31(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final byte[] bArr, final long j) throws E, InternalException {
        C60173zxj.uniffiRustCallWithError(C60230zyn.uniffiRustBuffer, OkxPasskeyException.ErrorHandler, new Function1() { // from class: o.zJC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zIV.storeEncryptedPasskey$lambda$31$lambda$30(j, str, str2, str3, str4, bArr, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit storeEncryptedPasskey$lambda$31$lambda$30(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, byte[] bArr, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        uniffiLib.uniffi_account_fn_method_nativepasskeykeyprovider_store_encrypted_passkey(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), ffiConverterString.lower2(str3), ffiConverterString.lower2(str4), FfiConverterByteArray.INSTANCE.lower2((java.lang.Object) bArr), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.zIR
    public byte[] AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) throws OkxPasskeyException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return (byte[]) FfiConverterByteArray.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.zIZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zIV.loadEncryptedPasskey$lambda$33(str, str2, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue loadEncryptedPasskey$lambda$33(final java.lang.String str, final java.lang.String str2, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCallWithError(C60230zyn.uniffiRustBuffer, OkxPasskeyException.ErrorHandler, new Function1() { // from class: o.zJF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zIV.loadEncryptedPasskey$lambda$33$lambda$32(j, str, str2, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue loadEncryptedPasskey$lambda$33$lambda$32(long j, java.lang.String str, java.lang.String str2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_account_fn_method_nativepasskeykeyprovider_load_encrypted_passkey(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), uniffiRustCallStatus);
    }

    @Override // o.zIR
    public byte[] OLrzqt(@NotNull final java.lang.String str) throws OkxPasskeyException {
        Intrinsics.checkNotNullParameter(str, "");
        return (byte[]) FfiConverterByteArray.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.zJx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zIV.loadEncryptedPasskeyByCredentialId$lambda$35(str, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue loadEncryptedPasskeyByCredentialId$lambda$35(final java.lang.String str, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCallWithError(C60230zyn.uniffiRustBuffer, OkxPasskeyException.ErrorHandler, new Function1() { // from class: o.zJy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zIV.loadEncryptedPasskeyByCredentialId$lambda$35$lambda$34(j, str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue loadEncryptedPasskeyByCredentialId$lambda$35$lambda$34(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_nativepasskeykeyprovider_load_encrypted_passkey_by_credential_id(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    @Override // o.zIR
    public void EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.zIT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zIV.removeEncryptedPasskey$lambda$37(str, str2, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit removeEncryptedPasskey$lambda$37(final java.lang.String str, final java.lang.String str2, final long j) {
        C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zJi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return zIV.removeEncryptedPasskey$lambda$37$lambda$36(j, str, str2, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit removeEncryptedPasskey$lambda$37$lambda$36(long j, java.lang.String str, java.lang.String str2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        uniffiLib.uniffi_account_fn_method_nativepasskeykeyprovider_remove_encrypted_passkey(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.zIR
    public boolean KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.zJA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(zIV.hasEncryptedPasskey$lambda$39(str, str2, ((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte hasEncryptedPasskey$lambda$39(final java.lang.String str, final java.lang.String str2, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zJq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(zIV.hasEncryptedPasskey$lambda$39$lambda$38(j, str, str2, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte hasEncryptedPasskey$lambda$39$lambda$38(long j, java.lang.String str, java.lang.String str2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_account_fn_method_nativepasskeykeyprovider_has_encrypted_passkey(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), uniffiRustCallStatus);
    }
}
