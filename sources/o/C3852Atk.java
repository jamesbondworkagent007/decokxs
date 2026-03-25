package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.buy_sell.FfiConverterBoolean;
import uniffi.buy_sell.FfiConverterLong;
import uniffi.buy_sell.FfiConverterString;
import uniffi.buy_sell.FfiConverterTypeRecurringBuyPlanDetailErrorCase;
import uniffi.buy_sell.RecurringBuyPlanDetailErrorCase;
import uniffi.buy_sell.UniffiLib;

/* JADX INFO: renamed from: o.Atk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C3852Atk extends AbstractC60182zxs implements InterfaceC3849Ath {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3852Atk(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), C3722ArM.uniffiRustBuffer, new Function2() { // from class: o.Atu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3852Atk.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Atq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3852Atk.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_free_recurringbuyplandetaillocalization(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_clone_recurringbuyplandetaillocalization(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3852Atk(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), C3722ArM.uniffiRustBuffer, new Function2() { // from class: o.Atg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3852Atk.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Atj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3852Atk.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_free_recurringbuyplandetaillocalization(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_clone_recurringbuyplandetaillocalization(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC3849Ath
    public java.lang.String KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Aty
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3852Atk.formatFrequency$lambda$5(str, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue formatFrequency$lambda$5(final java.lang.String str, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Atn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3852Atk.formatFrequency$lambda$5$lambda$4(j, str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue formatFrequency$lambda$5$lambda$4(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_recurringbuyplandetaillocalization_format_frequency(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC3849Ath
    public java.lang.String copydefault(final long j) {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Atm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3852Atk.formatDate$lambda$7(j, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue formatDate$lambda$7(final long j, final long j2) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Atw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3852Atk.formatDate$lambda$7$lambda$6(j2, j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue formatDate$lambda$7$lambda$6(long j, long j2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_recurringbuyplandetaillocalization_format_date(j, FfiConverterLong.INSTANCE.lower(j2).longValue(), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC3849Ath
    public java.lang.String KWHzl(final long j) {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Atz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3852Atk.formatFrequencyOptionDate$lambda$9(j, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue formatFrequencyOptionDate$lambda$9(final long j, final long j2) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Ato
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3852Atk.formatFrequencyOptionDate$lambda$9$lambda$8(j2, j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue formatFrequencyOptionDate$lambda$9$lambda$8(long j, long j2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_recurringbuyplandetaillocalization_format_frequency_option_date(j, FfiConverterLong.INSTANCE.lower(j2).longValue(), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC3849Ath
    public java.lang.String AEQbTJ(@NotNull final RecurringBuyPlanDetailErrorCase recurringBuyPlanDetailErrorCase) {
        Intrinsics.checkNotNullParameter(recurringBuyPlanDetailErrorCase, "");
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Ati
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3852Atk.getBannerTitle$lambda$11(recurringBuyPlanDetailErrorCase, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getBannerTitle$lambda$11(final RecurringBuyPlanDetailErrorCase recurringBuyPlanDetailErrorCase, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Atv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3852Atk.getBannerTitle$lambda$11$lambda$10(j, recurringBuyPlanDetailErrorCase, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getBannerTitle$lambda$11$lambda$10(long j, RecurringBuyPlanDetailErrorCase recurringBuyPlanDetailErrorCase, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_recurringbuyplandetaillocalization_get_banner_title(j, FfiConverterTypeRecurringBuyPlanDetailErrorCase.INSTANCE.lower2((java.lang.Object) recurringBuyPlanDetailErrorCase), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC3849Ath
    public java.lang.String copydefault(@NotNull final RecurringBuyPlanDetailErrorCase recurringBuyPlanDetailErrorCase) {
        Intrinsics.checkNotNullParameter(recurringBuyPlanDetailErrorCase, "");
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Atp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3852Atk.getBannerMessage$lambda$13(recurringBuyPlanDetailErrorCase, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getBannerMessage$lambda$13(final RecurringBuyPlanDetailErrorCase recurringBuyPlanDetailErrorCase, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Att
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3852Atk.getBannerMessage$lambda$13$lambda$12(j, recurringBuyPlanDetailErrorCase, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getBannerMessage$lambda$13$lambda$12(long j, RecurringBuyPlanDetailErrorCase recurringBuyPlanDetailErrorCase, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_recurringbuyplandetaillocalization_get_banner_message(j, FfiConverterTypeRecurringBuyPlanDetailErrorCase.INSTANCE.lower2((java.lang.Object) recurringBuyPlanDetailErrorCase), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC3849Ath
    public java.lang.String EZpvd(final boolean z, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Ats
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3852Atk.getDepositButtonLabel$lambda$15(z, str, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getDepositButtonLabel$lambda$15(final boolean z, final java.lang.String str, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Atl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3852Atk.getDepositButtonLabel$lambda$15$lambda$14(j, z, str, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getDepositButtonLabel$lambda$15$lambda$14(long j, boolean z, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_recurringbuyplandetaillocalization_get_deposit_button_label(j, FfiConverterBoolean.INSTANCE.lower(z).byteValue(), FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
    }

    @Override // o.InterfaceC3849Ath
    public java.lang.String OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Atr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3852Atk.formatBuyAmount$lambda$17(str, str2, ((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue formatBuyAmount$lambda$17(final java.lang.String str, final java.lang.String str2, final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Atx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3852Atk.formatBuyAmount$lambda$17$lambda$16(j, str, str2, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue formatBuyAmount$lambda$17$lambda$16(long j, java.lang.String str, java.lang.String str2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_buy_sell_fn_method_recurringbuyplandetaillocalization_format_buy_amount(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), uniffiRustCallStatus);
    }
}
