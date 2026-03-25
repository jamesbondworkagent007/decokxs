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

/* JADX INFO: loaded from: classes25.dex */
public class BvG extends AbstractC60182zxs implements InterfaceC4968Bxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BvG(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), BzK.uniffiRustBuffer, new Function2() { // from class: o.BwL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BvG.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.BwN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(BvG.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_free_coreusermanager(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_clone_coreusermanager(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BvG(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), BzK.uniffiRustBuffer, new Function2() { // from class: o.Bwt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BvG.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Bws
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(BvG.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_free_coreusermanager(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_clone_coreusermanager(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public void copydefault() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bxh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.clearAllUsers$lambda$5(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit clearAllUsers$lambda$5(final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bwd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.clearAllUsers$lambda$5$lambda$4(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit clearAllUsers$lambda$5$lambda$4(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_clear_all_users(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void EZpvd() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bwq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.clearTempToken$lambda$7(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit clearTempToken$lambda$7(final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bxd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.clearTempToken$lambda$7$lambda$6(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit clearTempToken$lambda$7$lambda$6(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_clear_temp_token(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public java.util.List<java.lang.String> AEQbTJ() {
        return (java.util.List) FfiConverterSequenceString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bwa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getAllUsernames$lambda$9(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getAllUsernames$lambda$9(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bwo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getAllUsernames$lambda$9$lambda$8(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getAllUsernames$lambda$9$lambda$8(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_get_all_usernames(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public java.util.List<BvH> KWHzl() {
        return (java.util.List) FfiConverterSequenceTypeCoreUser.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BwS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getAllUsers$lambda$11(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getAllUsers$lambda$11(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BwK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getAllUsers$lambda$11$lambda$10(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getAllUsers$lambda$11$lambda$10(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_get_all_users(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public java.util.List<BvH> OLrzqt() {
        return (java.util.List) FfiConverterSequenceTypeCoreUser.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bxf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getAllUsersByLoginTime$lambda$13(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getAllUsersByLoginTime$lambda$13(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BvM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getAllUsersByLoginTime$lambda$13$lambda$12(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getAllUsersByLoginTime$lambda$13$lambda$12(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_get_all_users_by_login_time(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public java.util.List<BvH> djBIcL() {
        return (java.util.List) FfiConverterSequenceTypeCoreUser.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bwi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getAllUsersOfCurrentSite$lambda$15(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getAllUsersOfCurrentSite$lambda$15(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bxw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getAllUsersOfCurrentSite$lambda$15$lambda$14(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getAllUsersOfCurrentSite$lambda$15$lambda$14(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_get_all_users_of_current_site(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public java.lang.String AYXKKw() {
        return FfiConverterOptionalString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bwc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getAuthorisationToken$lambda$17(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getAuthorisationToken$lambda$17(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BwQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getAuthorisationToken$lambda$17$lambda$16(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getAuthorisationToken$lambda$17$lambda$16(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_get_authorisation_token(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public BuX AhwBna() {
        return FfiConverterOptionalTypeBoundAccount.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bwh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getBoundAccount$lambda$19(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getBoundAccount$lambda$19(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BvZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getBoundAccount$lambda$19$lambda$18(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getBoundAccount$lambda$19$lambda$18(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_get_bound_account(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public BvH gEmmrt() {
        return FfiConverterOptionalTypeCoreUser.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bwr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getCurrentUser$lambda$21(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getCurrentUser$lambda$21(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BwP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getCurrentUser$lambda$21$lambda$20(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getCurrentUser$lambda$21$lambda$20(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_get_current_user(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public BvK valueOf() {
        return FfiConverterOptionalTypeCoreUserInfo.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bwx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getCurrentUserInfo$lambda$23(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getCurrentUserInfo$lambda$23(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bxo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getCurrentUserInfo$lambda$23$lambda$22(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getCurrentUserInfo$lambda$23$lambda$22(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_get_current_user_info(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public C5007Bzd values() {
        return FfiConverterOptionalTypeCoreUserProfile.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BwB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getCurrentUserProfile$lambda$25(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getCurrentUserProfile$lambda$25(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bxj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getCurrentUserProfile$lambda$25$lambda$24(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getCurrentUserProfile$lambda$25$lambda$24(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_get_current_user_profile(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public java.util.List<BvH> fetchVPNInfo() {
        return (java.util.List) FfiConverterSequenceTypeCoreUser.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BvS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getNonCurrentUsersWithToken$lambda$27(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getNonCurrentUsersWithToken$lambda$27(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bwe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getNonCurrentUsersWithToken$lambda$27$lambda$26(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getNonCurrentUsersWithToken$lambda$27$lambda$26(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_get_non_current_users_with_token(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public C5010Bzg isConnected() {
        return (C5010Bzg) FfiConverterTypeRbacFeatures.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bxm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getRbacFeatures$lambda$29(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getRbacFeatures$lambda$29(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BwM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getRbacFeatures$lambda$29$lambda$28(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getRbacFeatures$lambda$29$lambda$28(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_get_rbac_features(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public C5008Bze AkhnZx() {
        return (C5008Bze) FfiConverterTypeRmFeatures.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BvT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getRmFeatures$lambda$31(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getRmFeatures$lambda$31(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BwU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getRmFeatures$lambda$31$lambda$30(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getRmFeatures$lambda$31$lambda$30(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_get_rm_features(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public java.lang.String DbNXlk() {
        return FfiConverterOptionalString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bwg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getTempToken$lambda$33(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getTempToken$lambda$33(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bww
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getTempToken$lambda$33$lambda$32(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getTempToken$lambda$33$lambda$32(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_get_temp_token(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public BvH AEQbTJ(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterOptionalTypeCoreUser.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bwv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getUserById$lambda$35(str, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getUserById$lambda$35(final java.lang.String str, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bwm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getUserById$lambda$35$lambda$34(j, str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getUserById$lambda$35$lambda$34(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_get_user_by_id(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public BvH copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterOptionalTypeCoreUser.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BwH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getUserByLoginName$lambda$37(str, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getUserByLoginName$lambda$37(final java.lang.String str, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bwu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getUserByLoginName$lambda$37$lambda$36(j, str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getUserByLoginName$lambda$37$lambda$36(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_get_user_by_login_name(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public BvK OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterOptionalTypeCoreUserInfo.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BwA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getUserInfo$lambda$39(str, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getUserInfo$lambda$39(final java.lang.String str, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BwZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getUserInfo$lambda$39$lambda$38(j, str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getUserInfo$lambda$39$lambda$38(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_get_user_info(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public C5007Bzd KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterOptionalTypeCoreUserProfile.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BwW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getUserProfile$lambda$41(str, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getUserProfile$lambda$41(final java.lang.String str, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BwY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.getUserProfile$lambda$41$lambda$40(j, str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getUserProfile$lambda$41$lambda$40(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_get_user_profile(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public boolean ejfBZ() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BwF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(BvG.hasSpecialModeDeeplinkRestriction$lambda$43(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte hasSpecialModeDeeplinkRestriction$lambda$43(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bwl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(BvG.hasSpecialModeDeeplinkRestriction$lambda$43$lambda$42(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte hasSpecialModeDeeplinkRestriction$lambda$43$lambda$42(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_has_special_mode_deeplink_restriction(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public boolean fJNWhG() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bxl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(BvG.isLogin$lambda$45(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isLogin$lambda$45(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BwT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(BvG.isLogin$lambda$45$lambda$44(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isLogin$lambda$45$lambda$44(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_is_login(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public boolean fARcdN() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bxr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(BvG.isLoginMainAccount$lambda$47(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isLoginMainAccount$lambda$47(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BvN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(BvG.isLoginMainAccount$lambda$47$lambda$46(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isLoginMainAccount$lambda$47$lambda$46(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_is_login_main_account(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public boolean AuCTel() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BwV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(BvG.isMainAccountApprover$lambda$49(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isMainAccountApprover$lambda$49(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BvL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(BvG.isMainAccountApprover$lambda$49$lambda$48(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isMainAccountApprover$lambda$49$lambda$48(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_is_main_account_approver(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public boolean fIwbmz() {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BvO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(BvG.isRmAccount$lambda$51(((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte isRmAccount$lambda$51(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bwf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(BvG.isRmAccount$lambda$51$lambda$50(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isRmAccount$lambda$51$lambda$50(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_is_rm_account(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4968Bxs
    public void copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final TokenType tokenType, @NotNull final java.lang.String str4, final java.lang.String str5, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tokenType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bwj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.loginUser$lambda$53(str, str2, str3, tokenType, str4, str5, z, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit loginUser$lambda$53(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final TokenType tokenType, final java.lang.String str4, final java.lang.String str5, final boolean z, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BvY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.loginUser$lambda$53$lambda$52(j, str, str2, str3, tokenType, str4, str5, z, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit loginUser$lambda$53$lambda$52(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, TokenType tokenType, java.lang.String str4, java.lang.String str5, boolean z, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        uniffiLib.uniffi_user_fn_method_coreusermanager_login_user(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), ffiConverterString.lower2(str3), FfiConverterTypeTokenType.INSTANCE.lower2((java.lang.Object) tokenType), ffiConverterString.lower2(str4), FfiConverterOptionalString.INSTANCE.lower2(str5), FfiConverterBoolean.INSTANCE.lower(z).byteValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void uzCIH() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BvX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.logoutCurrentUser$lambda$55(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit logoutCurrentUser$lambda$55(final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BvU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.logoutCurrentUser$lambda$55$lambda$54(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit logoutCurrentUser$lambda$55$lambda$54(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_logout_current_user(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void EZpvd(@NotNull final BzC bzC) {
        Intrinsics.checkNotNullParameter(bzC, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bxq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.registerUserInfoEventCallback$lambda$57(bzC, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit registerUserInfoEventCallback$lambda$57(final BzC bzC, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bxa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.registerUserInfoEventCallback$lambda$57$lambda$56(j, bzC, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit registerUserInfoEventCallback$lambda$57$lambda$56(long j, BzC bzC, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_register_user_info_event_callback(j, FfiConverterTypeUserInfoEventCallback.INSTANCE.lower2(bzC).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void getNewProxyInstance() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BwE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.reloadData$lambda$59(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit reloadData$lambda$59(final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BvR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.reloadData$lambda$59$lambda$58(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit reloadData$lambda$59$lambda$58(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_reload_data(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void hDKMBd() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BwG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.removeTestUsers$lambda$61(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit removeTestUsers$lambda$61(final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BvW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.removeTestUsers$lambda$61$lambda$60(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit removeTestUsers$lambda$61$lambda$60(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_remove_test_users(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BwX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.removeUser$lambda$63(str, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit removeUser$lambda$63(final java.lang.String str, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bxn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.removeUser$lambda$63$lambda$62(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit removeUser$lambda$63$lambda$62(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_remove_user(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void AEQbTJ(final BvK bvK) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BwO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.saveCurrentUserInfo$lambda$65(bvK, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit saveCurrentUserInfo$lambda$65(final BvK bvK, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bxg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.saveCurrentUserInfo$lambda$65$lambda$64(j, bvK, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit saveCurrentUserInfo$lambda$65$lambda$64(long j, BvK bvK, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_save_current_user_info(j, FfiConverterOptionalTypeCoreUserInfo.INSTANCE.lower2(bvK), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void OLrzqt(final C5007Bzd c5007Bzd) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bwb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.saveCurrentUserProfile$lambda$67(c5007Bzd, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit saveCurrentUserProfile$lambda$67(final C5007Bzd c5007Bzd, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bwk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.saveCurrentUserProfile$lambda$67$lambda$66(j, c5007Bzd, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit saveCurrentUserProfile$lambda$67$lambda$66(long j, C5007Bzd c5007Bzd, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_save_current_user_profile(j, FfiConverterOptionalTypeCoreUserProfile.INSTANCE.lower2(c5007Bzd), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void EZpvd(@NotNull final java.lang.String str, @NotNull final BvK bvK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bvK, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bxb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.saveUserInfo$lambda$69(str, bvK, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit saveUserInfo$lambda$69(final java.lang.String str, final BvK bvK, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bwn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.saveUserInfo$lambda$69$lambda$68(j, str, bvK, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit saveUserInfo$lambda$69$lambda$68(long j, java.lang.String str, BvK bvK, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_save_user_info(j, FfiConverterString.INSTANCE.lower2(str), FfiConverterTypeCoreUserInfo.INSTANCE.lower2((java.lang.Object) bvK), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void OLrzqt(@NotNull final java.lang.String str, @NotNull final C5007Bzd c5007Bzd) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c5007Bzd, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BwJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.saveUserProfile$lambda$71(str, c5007Bzd, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit saveUserProfile$lambda$71(final java.lang.String str, final C5007Bzd c5007Bzd, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BvQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.saveUserProfile$lambda$71$lambda$70(j, str, c5007Bzd, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit saveUserProfile$lambda$71$lambda$70(long j, java.lang.String str, C5007Bzd c5007Bzd, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_save_user_profile(j, FfiConverterString.INSTANCE.lower2(str), FfiConverterTypeCoreUserProfile.INSTANCE.lower2((java.lang.Object) c5007Bzd), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void EZpvd(@NotNull final java.util.List<BvH> list) {
        Intrinsics.checkNotNullParameter(list, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BwR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.setAllUsers$lambda$73(list, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setAllUsers$lambda$73(final java.util.List list, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bwp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.setAllUsers$lambda$73$lambda$72(j, list, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setAllUsers$lambda$73$lambda$72(long j, java.util.List list, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_set_all_users(j, FfiConverterSequenceTypeCoreUser.INSTANCE.lower2((java.lang.Object) list), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void djBIcL(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bxp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.setTempToken$lambda$75(str, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setTempToken$lambda$75(final java.lang.String str, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bxk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.setTempToken$lambda$75$lambda$74(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setTempToken$lambda$75$lambda$74(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_set_temp_token(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void gEmmrt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bxe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.switchToUser$lambda$77(str, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit switchToUser$lambda$77(final java.lang.String str, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bwy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.switchToUser$lambda$77$lambda$76(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit switchToUser$lambda$77$lambda$76(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_switch_to_user(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void EZpvd(@NotNull final BvH bvH) {
        Intrinsics.checkNotNullParameter(bvH, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bxi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.updateUser$lambda$79(bvH, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit updateUser$lambda$79(final BvH bvH, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BvV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.updateUser$lambda$79$lambda$78(j, bvH, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit updateUser$lambda$79$lambda$78(long j, BvH bvH, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_update_user(j, FfiConverterTypeCoreUser.INSTANCE.lower2((java.lang.Object) bvH), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BwC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.updateUserLoginName$lambda$81(str, str2, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit updateUserLoginName$lambda$81(final java.lang.String str, final java.lang.String str2, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BvP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.updateUserLoginName$lambda$81$lambda$80(j, str, str2, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit updateUserLoginName$lambda$81$lambda$80(long j, java.lang.String str, java.lang.String str2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        uniffiLib.uniffi_user_fn_method_coreusermanager_update_user_login_name(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void AhwBna(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bxc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.updateUserToken$lambda$83(str, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit updateUserToken$lambda$83(final java.lang.String str, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bwz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.updateUserToken$lambda$83$lambda$82(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit updateUserToken$lambda$83$lambda$82(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_coreusermanager_update_user_token(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4968Bxs
    public void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.BwI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.updateUserTokenWithType$lambda$85(str, str2, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit updateUserTokenWithType$lambda$85(final java.lang.String str, final java.lang.String str2, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.BwD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BvG.updateUserTokenWithType$lambda$85$lambda$84(j, str, str2, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit updateUserTokenWithType$lambda$85$lambda$84(long j, java.lang.String str, java.lang.String str2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        uniffiLib.uniffi_user_fn_method_coreusermanager_update_user_token_with_type(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
