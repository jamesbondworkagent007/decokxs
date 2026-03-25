package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.user.AvatarType;
import uniffi.user.BioBackgroundReviewStatus;
import uniffi.user.DualAccountType;
import uniffi.user.FfiConverterBoolean;
import uniffi.user.FfiConverterInt;
import uniffi.user.FfiConverterOptionalString;
import uniffi.user.FfiConverterString;
import uniffi.user.FfiConverterTypeAvatarType;
import uniffi.user.FfiConverterTypeBioBackgroundReviewStatus;
import uniffi.user.FfiConverterTypeCoreEntityManagerForeignHandling;
import uniffi.user.FfiConverterTypeCoreUser;
import uniffi.user.FfiConverterTypeCoreUserInfo;
import uniffi.user.FfiConverterTypeCoreUserManagerHandling;
import uniffi.user.FfiConverterTypeCoreUserProfile;
import uniffi.user.FfiConverterTypeDualAccountType;
import uniffi.user.FfiConverterTypeLocalUserData;
import uniffi.user.FfiConverterTypeReviewStatus;
import uniffi.user.FfiConverterTypeSecondVerifyType;
import uniffi.user.FfiConverterTypeTokenType;
import uniffi.user.FfiConverterTypeUserDataSource;
import uniffi.user.IntegrityCheckingUniffiLib;
import uniffi.user.ReviewStatus;
import uniffi.user.SecondVerifyType;
import uniffi.user.TokenType;
import uniffi.user.UniffiLib;

/* JADX INFO: loaded from: classes14.dex */
public final class BzK {
    public static final RustBuffer uniffiRustBuffer = new RustBuffer(new Application());

    public static final class Application implements InterfaceC60174zxk {
        @Override // o.InterfaceC60174zxk
        public RustBuffer.ByValue alloc(long j, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.ffi_user_rustbuffer_alloc(j, uniffiRustCallStatus);
        }

        @Override // o.InterfaceC60174zxk
        public void free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            UniffiLib.INSTANCE.ffi_user_rustbuffer_free(byValue, uniffiRustCallStatus);
        }
    }

    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_user_uniffi_contract_version()) {
            throw new java.lang.RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = IntegrityCheckingUniffiLib.INSTANCE;
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
    }

    public static final AvatarType avatarTypeFromString(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (AvatarType) FfiConverterTypeAvatarType.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BzQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BzK.avatarTypeFromString$lambda$0(str, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue avatarTypeFromString$lambda$0(java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_func_avatar_type_from_string(FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    public static final java.lang.String avatarTypeToString(@NotNull final AvatarType avatarType) {
        Intrinsics.checkNotNullParameter(avatarType, "");
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BzP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BzK.avatarTypeToString$lambda$1(avatarType, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue avatarTypeToString$lambda$1(AvatarType avatarType, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_func_avatar_type_to_string(FfiConverterTypeAvatarType.INSTANCE.lower2((java.lang.Object) avatarType), uniffiRustCallStatus);
    }

    public static final BioBackgroundReviewStatus bioBackgroundReviewStatusFromInt(final int i) {
        return (BioBackgroundReviewStatus) FfiConverterTypeBioBackgroundReviewStatus.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BAg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BzK.bioBackgroundReviewStatusFromInt$lambda$2(i, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue bioBackgroundReviewStatusFromInt$lambda$2(int i, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_func_bio_background_review_status_from_int(FfiConverterInt.INSTANCE.lower(i).intValue(), uniffiRustCallStatus);
    }

    public static final int bioBackgroundReviewStatusToInt(@NotNull final BioBackgroundReviewStatus bioBackgroundReviewStatus) {
        Intrinsics.checkNotNullParameter(bioBackgroundReviewStatus, "");
        return FfiConverterInt.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BzO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(BzK.bioBackgroundReviewStatusToInt$lambda$3(bioBackgroundReviewStatus, (UniffiRustCallStatus) obj));
            }
        })).intValue()).intValue();
    }

    public static final int bioBackgroundReviewStatusToInt$lambda$3(BioBackgroundReviewStatus bioBackgroundReviewStatus, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_func_bio_background_review_status_to_int(FfiConverterTypeBioBackgroundReviewStatus.INSTANCE.lower2((java.lang.Object) bioBackgroundReviewStatus), uniffiRustCallStatus);
    }

    public static final java.lang.String coreUserGetAccountName(@NotNull final BvH bvH) {
        Intrinsics.checkNotNullParameter(bvH, "");
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BzS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BzK.coreUserGetAccountName$lambda$4(bvH, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue coreUserGetAccountName$lambda$4(BvH bvH, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_func_core_user_get_account_name(FfiConverterTypeCoreUser.INSTANCE.lower2((java.lang.Object) bvH), uniffiRustCallStatus);
    }

    public static final java.lang.String coreUserGetNickname(@NotNull final BvH bvH) {
        Intrinsics.checkNotNullParameter(bvH, "");
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BzL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BzK.coreUserGetNickname$lambda$5(bvH, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue coreUserGetNickname$lambda$5(BvH bvH, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_func_core_user_get_nickname(FfiConverterTypeCoreUser.INSTANCE.lower2((java.lang.Object) bvH), uniffiRustCallStatus);
    }

    public static final BvH createCoreUser(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final TokenType tokenType, @NotNull final java.lang.String str4, final java.lang.String str5, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tokenType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return (BvH) FfiConverterTypeCoreUser.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BzT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BzK.createCoreUser$lambda$6(str, str2, str3, tokenType, str4, str5, z, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue createCoreUser$lambda$6(java.lang.String str, java.lang.String str2, java.lang.String str3, TokenType tokenType, java.lang.String str4, java.lang.String str5, boolean z, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_user_fn_func_create_core_user(ffiConverterString.lower2(str), ffiConverterString.lower2(str2), ffiConverterString.lower2(str3), FfiConverterTypeTokenType.INSTANCE.lower2((java.lang.Object) tokenType), ffiConverterString.lower2(str4), FfiConverterOptionalString.INSTANCE.lower2(str5), FfiConverterBoolean.INSTANCE.lower(z).byteValue(), uniffiRustCallStatus);
    }

    public static final BvK createCoreUserInfo() {
        return (BvK) FfiConverterTypeCoreUserInfo.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BzN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BzK.createCoreUserInfo$lambda$7((UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue createCoreUserInfo$lambda$7(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_func_create_core_user_info(uniffiRustCallStatus);
    }

    public static final BvK createCoreUserInfoWithAccount(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4) {
        return (BvK) FfiConverterTypeCoreUserInfo.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BzZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BzK.createCoreUserInfoWithAccount$lambda$8(str, str2, str3, str4, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue createCoreUserInfoWithAccount$lambda$8(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return uniffiLib.uniffi_user_fn_func_create_core_user_info_with_account(ffiConverterOptionalString.lower2(str), ffiConverterOptionalString.lower2(str2), ffiConverterOptionalString.lower2(str3), ffiConverterOptionalString.lower2(str4), uniffiRustCallStatus);
    }

    public static final C5007Bzd createCoreUserProfile() {
        return (C5007Bzd) FfiConverterTypeCoreUserProfile.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BzM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BzK.createCoreUserProfile$lambda$9((UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue createCoreUserProfile$lambda$9(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_func_create_core_user_profile(uniffiRustCallStatus);
    }

    public static final C5011Bzh createLocalUserData() {
        return (C5011Bzh) FfiConverterTypeLocalUserData.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BzU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BzK.createLocalUserData$lambda$10((UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue createLocalUserData$lambda$10(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_func_create_local_user_data(uniffiRustCallStatus);
    }

    public static final DualAccountType dualAccountTypeFromInt(final int i) {
        return (DualAccountType) FfiConverterTypeDualAccountType.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BAc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BzK.dualAccountTypeFromInt$lambda$11(i, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue dualAccountTypeFromInt$lambda$11(int i, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_func_dual_account_type_from_int(FfiConverterInt.INSTANCE.lower(i).intValue(), uniffiRustCallStatus);
    }

    public static final int dualAccountTypeToInt(@NotNull final DualAccountType dualAccountType) {
        Intrinsics.checkNotNullParameter(dualAccountType, "");
        return FfiConverterInt.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BzR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(BzK.dualAccountTypeToInt$lambda$12(dualAccountType, (UniffiRustCallStatus) obj));
            }
        })).intValue()).intValue();
    }

    public static final int dualAccountTypeToInt$lambda$12(DualAccountType dualAccountType, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_func_dual_account_type_to_int(FfiConverterTypeDualAccountType.INSTANCE.lower2((java.lang.Object) dualAccountType), uniffiRustCallStatus);
    }

    public static final InterfaceC4968Bxs getMockCoreUserManager() {
        return FfiConverterTypeCoreUserManagerHandling.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BzX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BzK.getMockCoreUserManager$lambda$13((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long getMockCoreUserManager$lambda$13(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_func_get_mock_core_user_manager(uniffiRustCallStatus);
    }

    public static final InterfaceC4907Bvl getSharedCoreEntityManager() {
        return FfiConverterTypeCoreEntityManagerForeignHandling.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BzW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BzK.getSharedCoreEntityManager$lambda$14((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long getSharedCoreEntityManager$lambda$14(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_func_get_shared_core_entity_manager(uniffiRustCallStatus);
    }

    public static final InterfaceC4968Bxs getSharedCoreUserManager() {
        return FfiConverterTypeCoreUserManagerHandling.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BzY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(BzK.getSharedCoreUserManager$lambda$15((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long getSharedCoreUserManager$lambda$15(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_func_get_shared_core_user_manager(uniffiRustCallStatus);
    }

    public static final void registerNativeUserStorage(@NotNull final InterfaceC5017Bzn interfaceC5017Bzn) {
        Intrinsics.checkNotNullParameter(interfaceC5017Bzn, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BAd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BzK.registerNativeUserStorage$lambda$16(interfaceC5017Bzn, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerNativeUserStorage$lambda$16(InterfaceC5017Bzn interfaceC5017Bzn, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_func_register_native_user_storage(FfiConverterTypeUserDataSource.INSTANCE.lower2(interfaceC5017Bzn).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final ReviewStatus reviewStatusFromInt(final int i) {
        return (ReviewStatus) FfiConverterTypeReviewStatus.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BzJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BzK.reviewStatusFromInt$lambda$17(i, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue reviewStatusFromInt$lambda$17(int i, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_func_review_status_from_int(FfiConverterInt.INSTANCE.lower(i).intValue(), uniffiRustCallStatus);
    }

    public static final int reviewStatusToInt(@NotNull final ReviewStatus reviewStatus) {
        Intrinsics.checkNotNullParameter(reviewStatus, "");
        return FfiConverterInt.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BAb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(BzK.reviewStatusToInt$lambda$18(reviewStatus, (UniffiRustCallStatus) obj));
            }
        })).intValue()).intValue();
    }

    public static final int reviewStatusToInt$lambda$18(ReviewStatus reviewStatus, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_func_review_status_to_int(FfiConverterTypeReviewStatus.INSTANCE.lower2((java.lang.Object) reviewStatus), uniffiRustCallStatus);
    }

    public static final SecondVerifyType secondVerifyTypeFromInt(final int i) {
        return (SecondVerifyType) FfiConverterTypeSecondVerifyType.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BAa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BzK.secondVerifyTypeFromInt$lambda$19(i, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue secondVerifyTypeFromInt$lambda$19(int i, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_func_second_verify_type_from_int(FfiConverterInt.INSTANCE.lower(i).intValue(), uniffiRustCallStatus);
    }

    public static final int secondVerifyTypeToInt(@NotNull final SecondVerifyType secondVerifyType) {
        Intrinsics.checkNotNullParameter(secondVerifyType, "");
        return FfiConverterInt.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.BzV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(BzK.secondVerifyTypeToInt$lambda$20(secondVerifyType, (UniffiRustCallStatus) obj));
            }
        })).intValue()).intValue();
    }

    public static final int secondVerifyTypeToInt$lambda$20(SecondVerifyType secondVerifyType, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_func_second_verify_type_to_int(FfiConverterTypeSecondVerifyType.INSTANCE.lower2((java.lang.Object) secondVerifyType), uniffiRustCallStatus);
    }
}
