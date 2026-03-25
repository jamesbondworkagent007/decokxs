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
import uniffi.account.FfiConverterOptionalString;
import uniffi.account.FfiConverterSequenceString;
import uniffi.account.FfiConverterString;
import uniffi.account.FfiConverterTypeAssertionResult;
import uniffi.account.FfiConverterTypeRegistrationResult;
import uniffi.account.OkxPasskeyException;
import uniffi.account.UniffiLib;

/* JADX INFO: renamed from: o.zSd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C58863zSd extends AbstractC60182zxs implements InterfaceC58880zSu {
    public static final int $stable = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC58880zSu
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.List<java.lang.String> list, java.lang.String str5, java.lang.String str6, boolean z, @NotNull Continuation<? super C3066Aet> continuation) throws OkxPasskeyException {
        return createCredential$suspendImpl(this, str, str2, str3, str4, list, str5, str6, z, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC58880zSu
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.String> list, java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull Continuation<? super C60207zyQ> continuation) throws OkxPasskeyException {
        return getAssertion$suspendImpl(this, str, str2, list, str3, str4, str5, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58863zSd(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zSr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C58863zSd.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zSs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C58863zSd.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_okxpasskeymanager(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_okxpasskeymanager(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58863zSd(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zSf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C58863zSd.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zSo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C58863zSd.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_okxpasskeymanager(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_okxpasskeymanager(j, uniffiRustCallStatus);
    }

    public static /* synthetic */ java.lang.Object createCredential$suspendImpl(C58863zSd c58863zSd, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final java.util.List<java.lang.String> list, final java.lang.String str5, final java.lang.String str6, final boolean z, Continuation<? super C3066Aet> continuation) throws OkxPasskeyException {
        return C60173zxj.uniffiRustCallAsync(C60230zyn.uniffiRustBuffer, ((java.lang.Number) c58863zSd.callWithHandle$OKCore_deploy(new Function1() { // from class: o.zSj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C58863zSd.createCredential$lambda$4(str, str2, str3, str4, list, str5, str6, z, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.zSg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C58863zSd.createCredential$lambda$5(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.zSi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C58863zSd.createCredential$lambda$6(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.zSn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58863zSd.createCredential$lambda$7(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.zSl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58863zSd.createCredential$lambda$8((RustBuffer.ByValue) obj);
            }
        }, OkxPasskeyException.ErrorHandler, continuation);
    }

    public static final long createCredential$lambda$4(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, java.lang.String str5, java.lang.String str6, boolean z, long j) {
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        RustBuffer.ByValue byValueLower2 = ffiConverterString.lower2(str);
        RustBuffer.ByValue byValueLower22 = ffiConverterString.lower2(str2);
        RustBuffer.ByValue byValueLower23 = ffiConverterString.lower2(str3);
        RustBuffer.ByValue byValueLower24 = ffiConverterString.lower2(str4);
        RustBuffer.ByValue byValueLower25 = FfiConverterSequenceString.INSTANCE.lower2((java.lang.Object) list);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return uniffiLib.uniffi_account_fn_method_okxpasskeymanager_create_credential(j, byValueLower2, byValueLower22, byValueLower23, byValueLower24, byValueLower25, ffiConverterOptionalString.lower2(str5), ffiConverterOptionalString.lower2(str6), FfiConverterBoolean.INSTANCE.lower(z).byteValue());
    }

    public static final Unit createCredential$lambda$5(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_account_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue createCredential$lambda$6(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_account_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    public static final Unit createCredential$lambda$7(long j) {
        UniffiLib.INSTANCE.ffi_account_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    public static final C3066Aet createCredential$lambda$8(RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        return (C3066Aet) FfiConverterTypeRegistrationResult.INSTANCE.lift2(byValue);
    }

    public static /* synthetic */ java.lang.Object getAssertion$suspendImpl(C58863zSd c58863zSd, final java.lang.String str, final java.lang.String str2, final java.util.List<java.lang.String> list, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5, Continuation<? super C60207zyQ> continuation) throws OkxPasskeyException {
        return C60173zxj.uniffiRustCallAsync(C60230zyn.uniffiRustBuffer, ((java.lang.Number) c58863zSd.callWithHandle$OKCore_deploy(new Function1() { // from class: o.zSm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C58863zSd.getAssertion$lambda$9(str, str2, list, str3, str4, str5, ((java.lang.Long) obj).longValue()));
            }
        })).longValue(), new yHO() { // from class: o.zSk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C58863zSd.getAssertion$lambda$10(((java.lang.Long) obj).longValue(), (UniffiRustFutureContinuationCallback) obj2, ((java.lang.Long) obj3).longValue());
            }
        }, new Function2() { // from class: o.zSp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C58863zSd.getAssertion$lambda$11(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function1() { // from class: o.zSq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58863zSd.getAssertion$lambda$12(((java.lang.Long) obj).longValue());
            }
        }, new Function1() { // from class: o.zSt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58863zSd.getAssertion$lambda$13((RustBuffer.ByValue) obj);
            }
        }, OkxPasskeyException.ErrorHandler, continuation);
    }

    public static final long getAssertion$lambda$9(java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j) {
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        RustBuffer.ByValue byValueLower2 = ffiConverterString.lower2(str);
        RustBuffer.ByValue byValueLower22 = ffiConverterString.lower2(str2);
        RustBuffer.ByValue byValueLower23 = FfiConverterSequenceString.INSTANCE.lower2((java.lang.Object) list);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return uniffiLib.uniffi_account_fn_method_okxpasskeymanager_get_assertion(j, byValueLower2, byValueLower22, byValueLower23, ffiConverterOptionalString.lower2(str3), ffiConverterOptionalString.lower2(str4), ffiConverterOptionalString.lower2(str5));
    }

    public static final Unit getAssertion$lambda$10(long j, UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2) {
        Intrinsics.checkNotNullParameter(uniffiRustFutureContinuationCallback, "");
        UniffiLib.INSTANCE.ffi_account_rust_future_poll_rust_buffer(j, uniffiRustFutureContinuationCallback, j2);
        return Unit.INSTANCE;
    }

    public static final RustBuffer.ByValue getAssertion$lambda$11(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.ffi_account_rust_future_complete_rust_buffer(j, uniffiRustCallStatus);
    }

    public static final Unit getAssertion$lambda$12(long j) {
        UniffiLib.INSTANCE.ffi_account_rust_future_free_rust_buffer(j);
        return Unit.INSTANCE;
    }

    public static final C60207zyQ getAssertion$lambda$13(RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        return (C60207zyQ) FfiConverterTypeAssertionResult.INSTANCE.lift2(byValue);
    }

    @Override // o.InterfaceC58880zSu
    public boolean AEQbTJ() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.zSc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C58863zSd.isDeviceSupportBiometric$lambda$15(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isDeviceSupportBiometric$lambda$15(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zSh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C58863zSd.isDeviceSupportBiometric$lambda$15$lambda$14(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isDeviceSupportBiometric$lambda$15$lambda$14(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_okxpasskeymanager_is_device_support_biometric(j, uniffiRustCallStatus);
    }
}
