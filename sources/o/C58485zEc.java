package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.account.FfiConverterString;
import uniffi.account.UniffiLib;

/* JADX INFO: renamed from: o.zEc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C58485zEc extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58485zEc(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zEr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C58485zEc.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zEp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C58485zEc.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_loginstate(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_loginstate(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58485zEc(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), C60230zyn.uniffiRustBuffer, new Function2() { // from class: o.zEm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C58485zEc.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.zEj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C58485zEc.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_account_fn_free_loginstate(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_clone_loginstate(j, uniffiRustCallStatus);
    }

    public static final RustBuffer.ByValue emailSuggestions$lambda$5(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zEh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58485zEc.emailSuggestions$lambda$5$lambda$4(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue emailSuggestions$lambda$5$lambda$4(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_loginstate_email_suggestions(j, uniffiRustCallStatus);
    }

    public static final byte isForgetPasswordButtonVisible$lambda$7(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zEk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C58485zEc.isForgetPasswordButtonVisible$lambda$7$lambda$6(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isForgetPasswordButtonVisible$lambda$7$lambda$6(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_loginstate_is_forget_password_button_visible(j, uniffiRustCallStatus);
    }

    public static final byte isLoginButtonEnabled$lambda$9(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zEe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C58485zEc.isLoginButtonEnabled$lambda$9$lambda$8(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isLoginButtonEnabled$lambda$9$lambda$8(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_loginstate_is_login_button_enabled(j, uniffiRustCallStatus);
    }

    public static final byte isNextButtonEnabled$lambda$11(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zEq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C58485zEc.isNextButtonEnabled$lambda$11$lambda$10(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isNextButtonEnabled$lambda$11$lambda$10(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_loginstate_is_next_button_enabled(j, uniffiRustCallStatus);
    }

    public static final byte isPasswordInputVisible$lambda$13(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zEf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C58485zEc.isPasswordInputVisible$lambda$13$lambda$12(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isPasswordInputVisible$lambda$13$lambda$12(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_loginstate_is_password_input_visible(j, uniffiRustCallStatus);
    }

    public static final byte isSocialAppleAvailable$lambda$15(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zEg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C58485zEc.isSocialAppleAvailable$lambda$15$lambda$14(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isSocialAppleAvailable$lambda$15$lambda$14(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_loginstate_is_social_apple_available(j, uniffiRustCallStatus);
    }

    public static final byte isSocialGoogleAvailable$lambda$17(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zEo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C58485zEc.isSocialGoogleAvailable$lambda$17$lambda$16(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isSocialGoogleAvailable$lambda$17$lambda$16(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_loginstate_is_social_google_available(j, uniffiRustCallStatus);
    }

    public static final byte isSocialTelegramAvailable$lambda$19(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zEa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C58485zEc.isSocialTelegramAvailable$lambda$19$lambda$18(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isSocialTelegramAvailable$lambda$19$lambda$18(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_loginstate_is_social_telegram_available(j, uniffiRustCallStatus);
    }

    public static final byte isUsernameValid$lambda$21(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zEd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C58485zEc.isUsernameValid$lambda$21$lambda$20(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isUsernameValid$lambda$21$lambda$20(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_loginstate_is_username_valid(j, uniffiRustCallStatus);
    }

    public static final RustBuffer.ByValue savedUsernames$lambda$23(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zEi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58485zEc.savedUsernames$lambda$23$lambda$22(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue savedUsernames$lambda$23$lambda$22(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_loginstate_saved_usernames(j, uniffiRustCallStatus);
    }

    public java.lang.String toString() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.zEn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58485zEc.toString$lambda$25(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue toString$lambda$25(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C60230zyn.uniffiRustBuffer, new Function1() { // from class: o.zEl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C58485zEc.toString$lambda$25$lambda$24(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue toString$lambda$25$lambda$24(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_account_fn_method_loginstate_uniffi_trait_debug(j, uniffiRustCallStatus);
    }
}
