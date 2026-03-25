package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.user.FfiConverterBoolean;
import uniffi.user.FfiConverterOptionalString;
import uniffi.user.FfiConverterOptionalTypeBoundAccount;
import uniffi.user.FfiConverterOptionalTypeCoreUser;
import uniffi.user.FfiConverterOptionalTypeCoreUserInfo;
import uniffi.user.FfiConverterOptionalTypeCoreUserProfile;
import uniffi.user.FfiConverterSequenceString;
import uniffi.user.FfiConverterSequenceTypeCoreUser;
import uniffi.user.FfiConverterString;
import uniffi.user.FfiConverterTypeCoreUser;
import uniffi.user.FfiConverterTypeCoreUserInfo;
import uniffi.user.FfiConverterTypeCoreUserProfile;
import uniffi.user.FfiConverterTypeRbacFeatures;
import uniffi.user.FfiConverterTypeRmFeatures;
import uniffi.user.FfiConverterTypeTokenType;
import uniffi.user.FfiConverterTypeUserInfoEventCallback;
import uniffi.user.TokenType;
import uniffi.user.UniffiLib;

/* JADX INFO: renamed from: o.Bxv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C4971Bxv extends AbstractC60182zxs implements InterfaceC4968Bxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4971Bxv(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), BzK.uniffiRustBuffer, new Function2() { // from class: o.BxG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4971Bxv.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.BxF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4971Bxv.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_free_coreusermanagerhandling(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_clone_coreusermanagerhandling(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4971Bxv(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), BzK.uniffiRustBuffer, new Function2() { // from class: o.BxM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4971Bxv.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.BxP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4971Bxv.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_free_coreusermanagerhandling(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_clone_coreusermanagerhandling(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public boolean fJNWhG() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Byw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C4971Bxv.isLogin$lambda$5(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isLogin$lambda$5(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Byu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C4971Bxv.isLogin$lambda$5$lambda$4(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isLogin$lambda$5$lambda$4(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_is_login(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public boolean fARcdN() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Byt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C4971Bxv.isLoginMainAccount$lambda$7(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isLoginMainAccount$lambda$7(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.ByH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C4971Bxv.isLoginMainAccount$lambda$7$lambda$6(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isLoginMainAccount$lambda$7$lambda$6(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_is_login_main_account(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public BvH gEmmrt() {
        return FfiConverterOptionalTypeCoreUser.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bye
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getCurrentUser$lambda$9(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getCurrentUser$lambda$9(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Byb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getCurrentUser$lambda$9$lambda$8(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getCurrentUser$lambda$9$lambda$8(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_get_current_user(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public java.util.List<BvH> KWHzl() {
        return (java.util.List) FfiConverterSequenceTypeCoreUser.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ByN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.AEQbTJ(((java.lang.Long) obj).longValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RustBuffer.ByValue AEQbTJ(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.ByD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.copydefault(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RustBuffer.ByValue copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_get_all_users(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public java.util.List<java.lang.String> AEQbTJ() {
        return (java.util.List) FfiConverterSequenceString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Byn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getAllUsernames$lambda$13(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getAllUsernames$lambda$13(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BxU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getAllUsernames$lambda$13$lambda$12(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getAllUsernames$lambda$13$lambda$12(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_get_all_usernames(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public BvH AEQbTJ(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterOptionalTypeCoreUser.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Byh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getUserById$lambda$15(str, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getUserById$lambda$15(final java.lang.String str, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Byk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getUserById$lambda$15$lambda$14(j, str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getUserById$lambda$15$lambda$14(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_get_user_by_id(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public BvH copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterOptionalTypeCoreUser.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BxJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getUserByLoginName$lambda$17(str, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getUserByLoginName$lambda$17(final java.lang.String str, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.ByW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getUserByLoginName$lambda$17$lambda$16(j, str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getUserByLoginName$lambda$17$lambda$16(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_get_user_by_login_name(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public java.util.List<BvH> djBIcL() {
        return (java.util.List) FfiConverterSequenceTypeCoreUser.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ByC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getAllUsersOfCurrentSite$lambda$19(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getAllUsersOfCurrentSite$lambda$19(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bzc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getAllUsersOfCurrentSite$lambda$19$lambda$18(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getAllUsersOfCurrentSite$lambda$19$lambda$18(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_get_all_users_of_current_site(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public java.util.List<BvH> OLrzqt() {
        return (java.util.List) FfiConverterSequenceTypeCoreUser.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BxB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getAllUsersByLoginTime$lambda$21(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getAllUsersByLoginTime$lambda$21(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BxQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getAllUsersByLoginTime$lambda$21$lambda$20(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getAllUsersByLoginTime$lambda$21$lambda$20(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_get_all_users_by_login_time(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public java.util.List<BvH> fetchVPNInfo() {
        return (java.util.List) FfiConverterSequenceTypeCoreUser.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ByK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getNonCurrentUsersWithToken$lambda$23(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getNonCurrentUsersWithToken$lambda$23(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.ByB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getNonCurrentUsersWithToken$lambda$23$lambda$22(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getNonCurrentUsersWithToken$lambda$23$lambda$22(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_get_non_current_users_with_token(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public void copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final TokenType tokenType, @NotNull final java.lang.String str4, final java.lang.String str5, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tokenType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BxW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.loginUser$lambda$25(str, str2, str3, tokenType, str4, str5, z, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit loginUser$lambda$25(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final TokenType tokenType, final java.lang.String str4, final java.lang.String str5, final boolean z, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Byy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.loginUser$lambda$25$lambda$24(j, str, str2, str3, tokenType, str4, str5, z, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit loginUser$lambda$25$lambda$24(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, TokenType tokenType, java.lang.String str4, java.lang.String str5, boolean z, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        uniffiLib.uniffi_user_fn_method_coreusermanagerhandling_login_user(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), ffiConverterString.lower2(str3), FfiConverterTypeTokenType.INSTANCE.lower2((java.lang.Object) tokenType), ffiConverterString.lower2(str4), FfiConverterOptionalString.INSTANCE.lower2(str5), FfiConverterBoolean.INSTANCE.lower(z).byteValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void uzCIH() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BxO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.logoutCurrentUser$lambda$27(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit logoutCurrentUser$lambda$27(final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.ByP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.logoutCurrentUser$lambda$27$lambda$26(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit logoutCurrentUser$lambda$27$lambda$26(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_logout_current_user(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void gEmmrt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BxZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.switchToUser$lambda$29(str, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit switchToUser$lambda$29(final java.lang.String str, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Byo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.switchToUser$lambda$29$lambda$28(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit switchToUser$lambda$29$lambda$28(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_switch_to_user(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public java.lang.String AYXKKw() {
        return FfiConverterOptionalString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BxK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getAuthorisationToken$lambda$31(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getAuthorisationToken$lambda$31(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Byi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getAuthorisationToken$lambda$31$lambda$30(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getAuthorisationToken$lambda$31$lambda$30(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_get_authorisation_token(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public java.lang.String DbNXlk() {
        return FfiConverterOptionalString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BxY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.copydefault(((java.lang.Long) obj).longValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RustBuffer.ByValue copydefault(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BxX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.valueOf(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RustBuffer.ByValue valueOf(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_get_temp_token(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public void djBIcL(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Byl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.setTempToken$lambda$35(str, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setTempToken$lambda$35(final java.lang.String str, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BxV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.setTempToken$lambda$35$lambda$34(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setTempToken$lambda$35$lambda$34(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_set_temp_token(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void EZpvd() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BxT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.clearTempToken$lambda$37(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit clearTempToken$lambda$37(final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.ByZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.clearTempToken$lambda$37$lambda$36(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit clearTempToken$lambda$37$lambda$36(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_clear_temp_token(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void AhwBna(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BxL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.updateUserToken$lambda$39(str, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit updateUserToken$lambda$39(final java.lang.String str, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Byr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.updateUserToken$lambda$39$lambda$38(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit updateUserToken$lambda$39$lambda$38(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_update_user_token(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Byp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.updateUserTokenWithType$lambda$41(str, str2, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit updateUserTokenWithType$lambda$41(final java.lang.String str, final java.lang.String str2, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BxA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.updateUserTokenWithType$lambda$41$lambda$40(j, str, str2, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit updateUserTokenWithType$lambda$41$lambda$40(long j, java.lang.String str, java.lang.String str2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        uniffiLib.uniffi_user_fn_method_coreusermanagerhandling_update_user_token_with_type(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public BvK valueOf() {
        return FfiConverterOptionalTypeCoreUserInfo.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BxE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getCurrentUserInfo$lambda$43(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getCurrentUserInfo$lambda$43(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bym
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getCurrentUserInfo$lambda$43$lambda$42(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getCurrentUserInfo$lambda$43$lambda$42(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_get_current_user_info(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public BvK OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterOptionalTypeCoreUserInfo.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ByT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getUserInfo$lambda$45(str, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getUserInfo$lambda$45(final java.lang.String str, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Byg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getUserInfo$lambda$45$lambda$44(j, str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getUserInfo$lambda$45$lambda$44(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_get_user_info(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public void AEQbTJ(final BvK bvK) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bxt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.saveCurrentUserInfo$lambda$47(bvK, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit saveCurrentUserInfo$lambda$47(final BvK bvK, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BxC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.saveCurrentUserInfo$lambda$47$lambda$46(j, bvK, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit saveCurrentUserInfo$lambda$47$lambda$46(long j, BvK bvK, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_save_current_user_info(j, FfiConverterOptionalTypeCoreUserInfo.INSTANCE.lower2(bvK), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void EZpvd(@NotNull final java.lang.String str, @NotNull final BvK bvK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bvK, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Byz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.saveUserInfo$lambda$49(str, bvK, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit saveUserInfo$lambda$49(final java.lang.String str, final BvK bvK, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bys
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.saveUserInfo$lambda$49$lambda$48(j, str, bvK, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit saveUserInfo$lambda$49$lambda$48(long j, java.lang.String str, BvK bvK, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_save_user_info(j, FfiConverterString.INSTANCE.lower2(str), FfiConverterTypeCoreUserInfo.INSTANCE.lower2((java.lang.Object) bvK), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public C5007Bzd values() {
        return FfiConverterOptionalTypeCoreUserProfile.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ByA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getCurrentUserProfile$lambda$51(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getCurrentUserProfile$lambda$51(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Byf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getCurrentUserProfile$lambda$51$lambda$50(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getCurrentUserProfile$lambda$51$lambda$50(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_get_current_user_profile(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public C5007Bzd KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterOptionalTypeCoreUserProfile.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ByF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getUserProfile$lambda$53(str, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getUserProfile$lambda$53(final java.lang.String str, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bxx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getUserProfile$lambda$53$lambda$52(j, str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getUserProfile$lambda$53$lambda$52(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_get_user_profile(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public void OLrzqt(final C5007Bzd c5007Bzd) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.ByQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.saveCurrentUserProfile$lambda$55(c5007Bzd, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit saveCurrentUserProfile$lambda$55(final C5007Bzd c5007Bzd, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.ByO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.saveCurrentUserProfile$lambda$55$lambda$54(j, c5007Bzd, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit saveCurrentUserProfile$lambda$55$lambda$54(long j, C5007Bzd c5007Bzd, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_save_current_user_profile(j, FfiConverterOptionalTypeCoreUserProfile.INSTANCE.lower2(c5007Bzd), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void OLrzqt(@NotNull final java.lang.String str, @NotNull final C5007Bzd c5007Bzd) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c5007Bzd, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bxu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.saveUserProfile$lambda$57(str, c5007Bzd, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit saveUserProfile$lambda$57(final java.lang.String str, final C5007Bzd c5007Bzd, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Byv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.saveUserProfile$lambda$57$lambda$56(j, str, c5007Bzd, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit saveUserProfile$lambda$57$lambda$56(long j, java.lang.String str, C5007Bzd c5007Bzd, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_save_user_profile(j, FfiConverterString.INSTANCE.lower2(str), FfiConverterTypeCoreUserProfile.INSTANCE.lower2((java.lang.Object) c5007Bzd), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void EZpvd(@NotNull final BvH bvH) {
        Intrinsics.checkNotNullParameter(bvH, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Byj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.updateUser$lambda$59(bvH, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit updateUser$lambda$59(final BvH bvH, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bya
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.updateUser$lambda$59$lambda$58(j, bvH, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit updateUser$lambda$59$lambda$58(long j, BvH bvH, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_update_user(j, FfiConverterTypeCoreUser.INSTANCE.lower2((java.lang.Object) bvH), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.ByY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.updateUserLoginName$lambda$61(str, str2, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit updateUserLoginName$lambda$61(final java.lang.String str, final java.lang.String str2, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bxy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.updateUserLoginName$lambda$61$lambda$60(j, str, str2, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit updateUserLoginName$lambda$61$lambda$60(long j, java.lang.String str, java.lang.String str2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        uniffiLib.uniffi_user_fn_method_coreusermanagerhandling_update_user_login_name(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BxD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.OLrzqt(str, ((java.lang.Long) obj).longValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(final java.lang.String str, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bxz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.KWHzl(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_remove_user(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void hDKMBd() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BxI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.removeTestUsers$lambda$65(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit removeTestUsers$lambda$65(final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Byd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.removeTestUsers$lambda$65$lambda$64(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit removeTestUsers$lambda$65$lambda$64(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_remove_test_users(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void EZpvd(@NotNull final java.util.List<BvH> list) {
        Intrinsics.checkNotNullParameter(list, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BxH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.setAllUsers$lambda$67(list, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setAllUsers$lambda$67(final java.util.List list, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Byq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.setAllUsers$lambda$67$lambda$66(j, list, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setAllUsers$lambda$67$lambda$66(long j, java.util.List list, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_set_all_users(j, FfiConverterSequenceTypeCoreUser.INSTANCE.lower2((java.lang.Object) list), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void copydefault() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.ByX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.clearAllUsers$lambda$69(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit clearAllUsers$lambda$69(final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BxS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.clearAllUsers$lambda$69$lambda$68(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit clearAllUsers$lambda$69$lambda$68(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_clear_all_users(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public C5010Bzg isConnected() {
        return (C5010Bzg) FfiConverterTypeRbacFeatures.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BxR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getRbacFeatures$lambda$71(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getRbacFeatures$lambda$71(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bza
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getRbacFeatures$lambda$71$lambda$70(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getRbacFeatures$lambda$71$lambda$70(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_get_rbac_features(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public boolean AuCTel() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Byx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C4971Bxv.isMainAccountApprover$lambda$73(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isMainAccountApprover$lambda$73(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Byc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C4971Bxv.isMainAccountApprover$lambda$73$lambda$72(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isMainAccountApprover$lambda$73$lambda$72(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_is_main_account_approver(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public void getNewProxyInstance() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BxN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.reloadData$lambda$75(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit reloadData$lambda$75(final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bzb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.reloadData$lambda$75$lambda$74(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit reloadData$lambda$75$lambda$74(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_reload_data(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public C5008Bze AkhnZx() {
        return (C5008Bze) FfiConverterTypeRmFeatures.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ByJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getRmFeatures$lambda$77(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getRmFeatures$lambda$77(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.ByR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getRmFeatures$lambda$77$lambda$76(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getRmFeatures$lambda$77$lambda$76(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_get_rm_features(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public boolean fIwbmz() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ByI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C4971Bxv.isRmAccount$lambda$79(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isRmAccount$lambda$79(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.ByS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C4971Bxv.isRmAccount$lambda$79$lambda$78(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isRmAccount$lambda$79$lambda$78(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_is_rm_account(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public boolean ejfBZ() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ByV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C4971Bxv.hasSpecialModeDeeplinkRestriction$lambda$81(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte hasSpecialModeDeeplinkRestriction$lambda$81(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.ByE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C4971Bxv.hasSpecialModeDeeplinkRestriction$lambda$81$lambda$80(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte hasSpecialModeDeeplinkRestriction$lambda$81$lambda$80(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_has_special_mode_deeplink_restriction(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public BuX AhwBna() {
        return FfiConverterOptionalTypeBoundAccount.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.ByL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getBoundAccount$lambda$83(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getBoundAccount$lambda$83(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.ByM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.getBoundAccount$lambda$83$lambda$82(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getBoundAccount$lambda$83$lambda$82(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_get_bound_account(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public void EZpvd(@NotNull final BzC bzC) {
        Intrinsics.checkNotNullParameter(bzC, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.ByG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.registerUserInfoEventCallback$lambda$85(bzC, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit registerUserInfoEventCallback$lambda$85(final BzC bzC, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.ByU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4971Bxv.registerUserInfoEventCallback$lambda$85$lambda$84(j, bzC, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit registerUserInfoEventCallback$lambda$85$lambda$84(long j, BzC bzC, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanagerhandling_register_user_info_event_callback(j, FfiConverterTypeUserInfoEventCallback.INSTANCE.lower2(bzC).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
