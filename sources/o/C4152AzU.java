package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.dex.AlertPromptType;
import uniffi.dex.AlertRepeatType;
import uniffi.dex.AlertType;
import uniffi.dex.FfiConverterInt;
import uniffi.dex.FfiConverterSequenceInt;
import uniffi.dex.FfiConverterString;
import uniffi.dex.FfiConverterTypeAlertPromptType;
import uniffi.dex.FfiConverterTypeAlertRepeatType;
import uniffi.dex.FfiConverterTypeAlertType;
import uniffi.dex.FfiConverterTypeOKRustFutureAddAlertResponseWithOKFFIError;
import uniffi.dex.FfiConverterTypeOKRustFutureAlertListResponseVecWithOKFFIError;
import uniffi.dex.UniffiLib;
import uniffi.ok_future_utils.FfiConverterTypeOKRustFuturei32WithOKFFIError;

/* JADX INFO: renamed from: o.AzU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C4152AzU extends AbstractC60182zxs implements InterfaceC2147AAo {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4152AzU(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.AEQbTJ(), AAL.uniffiRustBuffer, new Function2() { // from class: o.AAm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4152AzU.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AAn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4152AzU.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_dex_fn_free_dexalertusecase(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_clone_dexalertusecase(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4152AzU(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.AEQbTJ(), AAL.uniffiRustBuffer, new Function2() { // from class: o.AAk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4152AzU.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AAl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4152AzU.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_dex_fn_free_dexalertusecase(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_clone_dexalertusecase(j, uniffiRustCallStatus);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.AAL.access$getUniffiRustBuffer$p():uniffi.RustBuffer */
    public C4152AzU() {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(AAL.uniffiRustBuffer, new Function1() { // from class: o.AAg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4152AzU.copydefault((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_dex_fn_constructor_dexalertusecase_new(uniffiRustCallStatus);
    }

    @Override // o.InterfaceC2147AAo
    public ABO AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final AlertType alertType, @NotNull final AlertPromptType alertPromptType, @NotNull final java.lang.String str4, @NotNull final AlertRepeatType alertRepeatType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(alertType, "");
        Intrinsics.checkNotNullParameter(alertPromptType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(alertRepeatType, "");
        return FfiConverterTypeOKRustFutureAddAlertResponseWithOKFFIError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AzX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4152AzU.addAlert$lambda$6(str, str2, str3, alertType, alertPromptType, str4, alertRepeatType, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long addAlert$lambda$6(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final AlertType alertType, final AlertPromptType alertPromptType, final java.lang.String str4, final AlertRepeatType alertRepeatType, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(AAL.uniffiRustBuffer, new Function1() { // from class: o.AAc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4152AzU.addAlert$lambda$6$lambda$5(j, str, str2, str3, alertType, alertPromptType, str4, alertRepeatType, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long addAlert$lambda$6$lambda$5(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, AlertType alertType, AlertPromptType alertPromptType, java.lang.String str4, AlertRepeatType alertRepeatType, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_dex_fn_method_dexalertusecase_add_alert(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), ffiConverterString.lower2(str3), FfiConverterTypeAlertType.INSTANCE.lower2((java.lang.Object) alertType), FfiConverterTypeAlertPromptType.INSTANCE.lower2((java.lang.Object) alertPromptType), ffiConverterString.lower2(str4), FfiConverterTypeAlertRepeatType.INSTANCE.lower2((java.lang.Object) alertRepeatType), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC2147AAo
    public BeZ AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return FfiConverterTypeOKRustFuturei32WithOKFFIError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AzY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4152AzU.checkCoinAlertSubscribeStatus$lambda$8(str, str2, str3, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long checkCoinAlertSubscribeStatus$lambda$8(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(AAL.uniffiRustBuffer, new Function1() { // from class: o.AAd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4152AzU.checkCoinAlertSubscribeStatus$lambda$8$lambda$7(j, str, str2, str3, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long checkCoinAlertSubscribeStatus$lambda$8$lambda$7(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_dex_fn_method_dexalertusecase_check_coin_alert_subscribe_status(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), ffiConverterString.lower2(str3), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC2147AAo
    public BeZ EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return FfiConverterTypeOKRustFuturei32WithOKFFIError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AAi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4152AzU.checkTokenSupportedForAlert$lambda$10(str, str2, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long checkTokenSupportedForAlert$lambda$10(final java.lang.String str, final java.lang.String str2, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(AAL.uniffiRustBuffer, new Function1() { // from class: o.AAh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4152AzU.checkTokenSupportedForAlert$lambda$10$lambda$9(j, str, str2, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long checkTokenSupportedForAlert$lambda$10$lambda$9(long j, java.lang.String str, java.lang.String str2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_dex_fn_method_dexalertusecase_check_token_supported_for_alert(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC2147AAo
    public BeZ OLrzqt(@NotNull final java.util.List<java.lang.Integer> list, @NotNull final java.util.List<java.lang.Integer> list2, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterTypeOKRustFuturei32WithOKFFIError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AAp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4152AzU.deleteAlertRuleByRuleIds$lambda$12(list, list2, str, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long deleteAlertRuleByRuleIds$lambda$12(final java.util.List list, final java.util.List list2, final java.lang.String str, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(AAL.uniffiRustBuffer, new Function1() { // from class: o.AAj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4152AzU.deleteAlertRuleByRuleIds$lambda$12$lambda$11(j, list, list2, str, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long deleteAlertRuleByRuleIds$lambda$12$lambda$11(long j, java.util.List list, java.util.List list2, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterSequenceInt ffiConverterSequenceInt = FfiConverterSequenceInt.INSTANCE;
        return uniffiLib.uniffi_dex_fn_method_dexalertusecase_delete_alert_rule_by_rule_ids(j, ffiConverterSequenceInt.lower2((java.lang.Object) list), ffiConverterSequenceInt.lower2((java.lang.Object) list2), FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC2147AAo
    public BeZ KWHzl(@NotNull final AlertType alertType, final int i, @NotNull final AlertPromptType alertPromptType, @NotNull final java.lang.String str, @NotNull final AlertRepeatType alertRepeatType, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(alertType, "");
        Intrinsics.checkNotNullParameter(alertPromptType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(alertRepeatType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return FfiConverterTypeOKRustFuturei32WithOKFFIError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AAf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4152AzU.editAlert$lambda$14(alertType, i, alertPromptType, str, alertRepeatType, str2, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long editAlert$lambda$14(final AlertType alertType, final int i, final AlertPromptType alertPromptType, final java.lang.String str, final AlertRepeatType alertRepeatType, final java.lang.String str2, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(AAL.uniffiRustBuffer, new Function1() { // from class: o.AAs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4152AzU.editAlert$lambda$14$lambda$13(j, alertType, i, alertPromptType, str, alertRepeatType, str2, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long editAlert$lambda$14$lambda$13(long j, AlertType alertType, int i, AlertPromptType alertPromptType, java.lang.String str, AlertRepeatType alertRepeatType, java.lang.String str2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        RustBuffer.ByValue byValueLower2 = FfiConverterTypeAlertType.INSTANCE.lower2((java.lang.Object) alertType);
        int iIntValue = FfiConverterInt.INSTANCE.lower(i).intValue();
        RustBuffer.ByValue byValueLower22 = FfiConverterTypeAlertPromptType.INSTANCE.lower2((java.lang.Object) alertPromptType);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_dex_fn_method_dexalertusecase_edit_alert(j, byValueLower2, iIntValue, byValueLower22, ffiConverterString.lower2(str), FfiConverterTypeAlertRepeatType.INSTANCE.lower2((java.lang.Object) alertRepeatType), ffiConverterString.lower2(str2), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC2147AAo
    public BeZ OLrzqt(@NotNull final AlertType alertType, @NotNull final java.lang.String str, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(alertType, "");
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterTypeOKRustFuturei32WithOKFFIError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AAe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4152AzU.editAlertActiveStatus$lambda$16(alertType, str, i, i2, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long editAlertActiveStatus$lambda$16(final AlertType alertType, final java.lang.String str, final int i, final int i2, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(AAL.uniffiRustBuffer, new Function1() { // from class: o.AzZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4152AzU.editAlertActiveStatus$lambda$16$lambda$15(j, alertType, str, i, i2, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long editAlertActiveStatus$lambda$16$lambda$15(long j, AlertType alertType, java.lang.String str, int i, int i2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        RustBuffer.ByValue byValueLower2 = FfiConverterTypeAlertType.INSTANCE.lower2((java.lang.Object) alertType);
        RustBuffer.ByValue byValueLower22 = FfiConverterString.INSTANCE.lower2(str);
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return uniffiLib.uniffi_dex_fn_method_dexalertusecase_edit_alert_active_status(j, byValueLower2, byValueLower22, ffiConverterInt.lower(i).intValue(), ffiConverterInt.lower(i2).intValue(), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC2147AAo
    public C2185ACa KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return FfiConverterTypeOKRustFutureAlertListResponseVecWithOKFFIError.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AAa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4152AzU.getAlertList$lambda$18(str, str2, str3, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long getAlertList$lambda$18(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(AAL.uniffiRustBuffer, new Function1() { // from class: o.AAb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C4152AzU.getAlertList$lambda$18$lambda$17(j, str, str2, str3, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long getAlertList$lambda$18$lambda$17(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_dex_fn_method_dexalertusecase_get_alert_list(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), ffiConverterString.lower2(str3), uniffiRustCallStatus);
    }
}
