package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.buy_sell.ConvertBottomSheetAction;
import uniffi.buy_sell.ConvertModeType;
import uniffi.buy_sell.ConvertOrderStatus;
import uniffi.buy_sell.ConvertResult;
import uniffi.buy_sell.FfiConverterOptionalString;
import uniffi.buy_sell.FfiConverterSequenceTypeTrackEventParam;
import uniffi.buy_sell.FfiConverterString;
import uniffi.buy_sell.FfiConverterTypeConvertBottomSheetAction;
import uniffi.buy_sell.FfiConverterTypeConvertModeType;
import uniffi.buy_sell.FfiConverterTypeConvertOrderStatus;
import uniffi.buy_sell.FfiConverterTypeConvertResult;
import uniffi.buy_sell.UniffiLib;

/* JADX INFO: renamed from: o.ApF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C3609ApF extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3609ApF(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), C3722ArM.uniffiRustBuffer, new Function2() { // from class: o.Aqg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3609ApF.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.ApI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3609ApF.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_free_buysellanalytics(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_clone_buysellanalytics(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3609ApF(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), C3722ArM.uniffiRustBuffer, new Function2() { // from class: o.ApR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3609ApF.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.ApU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3609ApF.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_free_buysellanalytics(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_clone_buysellanalytics(j, uniffiRustCallStatus);
    }

    public C3609ApF() {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.ApN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C3609ApF.KWHzl((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_constructor_buysellanalytics_new(uniffiRustCallStatus);
    }

    public static final RustBuffer.ByValue getAnalytics$lambda$6(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.ApM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3609ApF.getAnalytics$lambda$6$lambda$5(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getAnalytics$lambda$6$lambda$5(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellanalytics_get_analytics(j, uniffiRustCallStatus);
    }

    public static final Unit trackBscQuickConvertBottomsheetView$lambda$8(final ConvertResult convertResult, final ConvertModeType convertModeType, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.ApP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3609ApF.trackBscQuickConvertBottomsheetView$lambda$8$lambda$7(j, convertResult, convertModeType, str, str2, str3, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackBscQuickConvertBottomsheetView$lambda$8$lambda$7(long j, ConvertResult convertResult, ConvertModeType convertModeType, java.lang.String str, java.lang.String str2, java.lang.String str3, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        RustBuffer.ByValue byValueLower2 = FfiConverterTypeConvertResult.INSTANCE.lower2((java.lang.Object) convertResult);
        RustBuffer.ByValue byValueLower22 = FfiConverterTypeConvertModeType.INSTANCE.lower2((java.lang.Object) convertModeType);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        uniffiLib.uniffi_buy_sell_fn_method_buysellanalytics_track_bsc_quick_convert_bottomsheet_view(j, byValueLower2, byValueLower22, ffiConverterOptionalString.lower2(str), ffiConverterOptionalString.lower2(str2), ffiConverterOptionalString.lower2(str3), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit trackBscQuickConvertOrderConfirmBtmPayClick$lambda$10(final java.lang.String str, final java.lang.String str2, final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.ApT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3609ApF.trackBscQuickConvertOrderConfirmBtmPayClick$lambda$10$lambda$9(j, str, str2, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackBscQuickConvertOrderConfirmBtmPayClick$lambda$10$lambda$9(long j, java.lang.String str, java.lang.String str2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        uniffiLib.uniffi_buy_sell_fn_method_buysellanalytics_track_bsc_quick_convert_order_confirm_btm_pay_click(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit trackEventInternal$lambda$12(final java.lang.String str, final java.util.List list, final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.ApJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3609ApF.trackEventInternal$lambda$12$lambda$11(j, str, list, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackEventInternal$lambda$12$lambda$11(long j, java.lang.String str, java.util.List list, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellanalytics_track_event_internal(j, FfiConverterString.INSTANCE.lower2(str), FfiConverterSequenceTypeTrackEventParam.INSTANCE.lower2((java.lang.Object) list), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit trackOrderDetailPageView$lambda$14(final java.lang.String str, final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.ApO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3609ApF.trackOrderDetailPageView$lambda$14$lambda$13(j, str, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackOrderDetailPageView$lambda$14$lambda$13(long j, java.lang.String str, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellanalytics_track_order_detail_page_view(j, FfiConverterString.INSTANCE.lower2(str), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit trackPortfolioConvertBottomsheetClick$lambda$16(final ConvertOrderStatus convertOrderStatus, final ConvertBottomSheetAction convertBottomSheetAction, final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.ApX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3609ApF.trackPortfolioConvertBottomsheetClick$lambda$16$lambda$15(j, convertOrderStatus, convertBottomSheetAction, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackPortfolioConvertBottomsheetClick$lambda$16$lambda$15(long j, ConvertOrderStatus convertOrderStatus, ConvertBottomSheetAction convertBottomSheetAction, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellanalytics_track_portfolio_convert_bottomsheet_click(j, FfiConverterTypeConvertOrderStatus.INSTANCE.lower2((java.lang.Object) convertOrderStatus), FfiConverterTypeConvertBottomSheetAction.INSTANCE.lower2((java.lang.Object) convertBottomSheetAction), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit trackRecurringBuyPlanDetailCancelButtonClick$lambda$18(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.ApV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3609ApF.trackRecurringBuyPlanDetailCancelButtonClick$lambda$18$lambda$17(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackRecurringBuyPlanDetailCancelButtonClick$lambda$18$lambda$17(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellanalytics_track_recurring_buy_plan_detail_cancel_button_click(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit trackRecurringBuyPlanDetailOrderItemClick$lambda$20(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.ApS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3609ApF.trackRecurringBuyPlanDetailOrderItemClick$lambda$20$lambda$19(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackRecurringBuyPlanDetailOrderItemClick$lambda$20$lambda$19(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellanalytics_track_recurring_buy_plan_detail_order_item_click(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit trackRecurringBuyPlanDetailPageView$lambda$22(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.ApQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3609ApF.trackRecurringBuyPlanDetailPageView$lambda$22$lambda$21(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackRecurringBuyPlanDetailPageView$lambda$22$lambda$21(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellanalytics_track_recurring_buy_plan_detail_page_view(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit trackRecurringBuyPlanDetailPauseButtonClick$lambda$24(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.ApK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3609ApF.trackRecurringBuyPlanDetailPauseButtonClick$lambda$24$lambda$23(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackRecurringBuyPlanDetailPauseButtonClick$lambda$24$lambda$23(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellanalytics_track_recurring_buy_plan_detail_pause_button_click(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit trackRecurringBuyPlanDetailResumeButtonClick$lambda$26(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.ApL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3609ApF.trackRecurringBuyPlanDetailResumeButtonClick$lambda$26$lambda$25(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackRecurringBuyPlanDetailResumeButtonClick$lambda$26$lambda$25(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellanalytics_track_recurring_buy_plan_detail_resume_button_click(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit trackRecurringBuyPlanDetailViewAllOrdersClick$lambda$28(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Aqa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3609ApF.trackRecurringBuyPlanDetailViewAllOrdersClick$lambda$28$lambda$27(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackRecurringBuyPlanDetailViewAllOrdersClick$lambda$28$lambda$27(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellanalytics_track_recurring_buy_plan_detail_view_all_orders_click(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit trackRecurringBuyPlanListItemClick$lambda$30(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.ApY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3609ApF.trackRecurringBuyPlanListItemClick$lambda$30$lambda$29(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackRecurringBuyPlanListItemClick$lambda$30$lambda$29(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellanalytics_track_recurring_buy_plan_list_item_click(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit trackRecurringBuyPlanListPageView$lambda$32(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.ApW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3609ApF.trackRecurringBuyPlanListPageView$lambda$32$lambda$31(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackRecurringBuyPlanListPageView$lambda$32$lambda$31(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellanalytics_track_recurring_buy_plan_list_page_view(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit trackRecurringBuyPlanListSetupButtonClick$lambda$34(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Aqb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3609ApF.trackRecurringBuyPlanListSetupButtonClick$lambda$34$lambda$33(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackRecurringBuyPlanListSetupButtonClick$lambda$34$lambda$33(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellanalytics_track_recurring_buy_plan_list_setup_button_click(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit trackRecurringBuyPlanOrderListItemClick$lambda$36(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.ApE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3609ApF.trackRecurringBuyPlanOrderListItemClick$lambda$36$lambda$35(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackRecurringBuyPlanOrderListItemClick$lambda$36$lambda$35(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellanalytics_track_recurring_buy_plan_order_list_item_click(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit trackRecurringBuyPlanOrderListPageView$lambda$38(final long j) {
        C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.ApZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3609ApF.trackRecurringBuyPlanOrderListPageView$lambda$38$lambda$37(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackRecurringBuyPlanOrderListPageView$lambda$38$lambda$37(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellanalytics_track_recurring_buy_plan_order_list_page_view(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
