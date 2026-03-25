package uniffi.buy_sell;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.C3599Aow;
import o.C56392yDr;
import o.C60173zxj;
import o.InterfaceC56387yDm;
import o.InterfaceC60177zxn;
import org.jetbrains.annotations.NotNull;
import uniffi.ForeignBytes;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.UniffiRustFutureContinuationCallback;
import uniffi.buy_sell.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public final class UniffiLib {
    public static final int $stable;
    public static final InterfaceC56387yDm CLEANER$delegate;
    public static final UniffiLib INSTANCE;

    public final native void ffi_buy_sell_rust_future_cancel_f32(long j);

    public final native void ffi_buy_sell_rust_future_cancel_f64(long j);

    public final native void ffi_buy_sell_rust_future_cancel_i16(long j);

    public final native void ffi_buy_sell_rust_future_cancel_i32(long j);

    public final native void ffi_buy_sell_rust_future_cancel_i64(long j);

    public final native void ffi_buy_sell_rust_future_cancel_i8(long j);

    public final native void ffi_buy_sell_rust_future_cancel_rust_buffer(long j);

    public final native void ffi_buy_sell_rust_future_cancel_u16(long j);

    public final native void ffi_buy_sell_rust_future_cancel_u32(long j);

    public final native void ffi_buy_sell_rust_future_cancel_u64(long j);

    public final native void ffi_buy_sell_rust_future_cancel_u8(long j);

    public final native void ffi_buy_sell_rust_future_cancel_void(long j);

    public final native float ffi_buy_sell_rust_future_complete_f32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native double ffi_buy_sell_rust_future_complete_f64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_buy_sell_rust_future_complete_i16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_buy_sell_rust_future_complete_i32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_buy_sell_rust_future_complete_i64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_buy_sell_rust_future_complete_i8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_buy_sell_rust_future_complete_rust_buffer(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_buy_sell_rust_future_complete_u16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_buy_sell_rust_future_complete_u32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_buy_sell_rust_future_complete_u64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_buy_sell_rust_future_complete_u8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_buy_sell_rust_future_complete_void(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_buy_sell_rust_future_free_f32(long j);

    public final native void ffi_buy_sell_rust_future_free_f64(long j);

    public final native void ffi_buy_sell_rust_future_free_i16(long j);

    public final native void ffi_buy_sell_rust_future_free_i32(long j);

    public final native void ffi_buy_sell_rust_future_free_i64(long j);

    public final native void ffi_buy_sell_rust_future_free_i8(long j);

    public final native void ffi_buy_sell_rust_future_free_rust_buffer(long j);

    public final native void ffi_buy_sell_rust_future_free_u16(long j);

    public final native void ffi_buy_sell_rust_future_free_u32(long j);

    public final native void ffi_buy_sell_rust_future_free_u64(long j);

    public final native void ffi_buy_sell_rust_future_free_u8(long j);

    public final native void ffi_buy_sell_rust_future_free_void(long j);

    public final native void ffi_buy_sell_rust_future_poll_f32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_buy_sell_rust_future_poll_f64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_buy_sell_rust_future_poll_i16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_buy_sell_rust_future_poll_i32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_buy_sell_rust_future_poll_i64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_buy_sell_rust_future_poll_i8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_buy_sell_rust_future_poll_rust_buffer(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_buy_sell_rust_future_poll_u16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_buy_sell_rust_future_poll_u32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_buy_sell_rust_future_poll_u64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_buy_sell_rust_future_poll_u8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_buy_sell_rust_future_poll_void(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native RustBuffer.ByValue ffi_buy_sell_rustbuffer_alloc(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_buy_sell_rustbuffer_free(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_buy_sell_rustbuffer_from_bytes(@NotNull ForeignBytes.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_buy_sell_rustbuffer_reserve(@NotNull RustBuffer.ByValue byValue, long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_clone_bscquickconvertinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_clone_bscquickconvertstateobserver(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_clone_buysellanalytics(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_clone_buysellfeaturerestrictionutil(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_clone_buysellformatter(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_clone_buysellgrafanabuilder(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_clone_buysellorderdetailinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_clone_buysellorderdetaillocalization(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_clone_buysellorderdetailstateobserver(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_clone_inputvalidationlocalization(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_clone_recurringbuyplandetailinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_clone_recurringbuyplandetaillocalization(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_clone_recurringbuyplandetailstateobserver(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_clone_recurringbuyplanlistinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_clone_recurringbuyplanlistlocalization(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_clone_recurringbuyplanliststateobserver(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_clone_recurringbuyplanorderlistinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_clone_recurringbuyplanorderlistlocalization(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_clone_recurringbuyplanorderliststateobserver(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_constructor_buysellanalytics_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_constructor_buysellfeaturerestrictionutil_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_constructor_buysellgrafanabuilder_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_constructor_recurringbuyplandetailinteractor_new(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_free_bscquickconvertinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_free_bscquickconvertstateobserver(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_free_buysellanalytics(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_free_buysellfeaturerestrictionutil(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_free_buysellformatter(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_free_buysellgrafanabuilder(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_free_buysellorderdetailinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_free_buysellorderdetaillocalization(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_free_buysellorderdetailstateobserver(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_free_inputvalidationlocalization(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_free_recurringbuyplandetailinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_free_recurringbuyplandetaillocalization(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_free_recurringbuyplandetailstateobserver(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_free_recurringbuyplanlistinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_free_recurringbuyplanlistlocalization(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_free_recurringbuyplanliststateobserver(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_free_recurringbuyplanorderlistinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_free_recurringbuyplanorderlistlocalization(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_free_recurringbuyplanorderliststateobserver(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_buy_sell_fn_func_b_s_c_quick_convert_state_is_equal(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_buy_sell_fn_func_buy_sell_order_detail_state_is_equal(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_func_create_bsc_quick_convert_interactor(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_func_create_buy_sell_order_detail_interactor(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_func_create_recurring_buy_plan_detail_interactor(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_func_create_recurring_buy_plan_list_interactor(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_func_create_recurring_buy_plan_order_list_interactor(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_func_crypto_formatter_format(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_func_fiat_formatter_format_exchange_rate(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_func_fiat_formatter_format_with_code_max(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_func_fiat_formatter_format_with_code_minmax(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, int i, int i2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_func_fiat_formatter_format_with_symbol_max(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_func_fiat_formatter_format_with_symbol_minmax(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, int i, int i2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_func_plain_formatter_format_plain_string(@NotNull RustBuffer.ByValue byValue, int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_func_plain_formatter_to_plain_string(@NotNull RustBuffer.ByValue byValue, int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_buy_sell_fn_func_recurring_buy_plan_detail_state_is_equal(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_buy_sell_fn_func_recurring_buy_plan_list_state_is_equal(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_buy_sell_fn_func_recurring_buy_plan_order_list_state_is_equal(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_func_register_formatter(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_init_callback_vtable_bscquickconvertstateobserver(@NotNull UniffiVTableCallbackInterfaceBscQuickConvertStateObserver uniffiVTableCallbackInterfaceBscQuickConvertStateObserver);

    public final native void uniffi_buy_sell_fn_init_callback_vtable_buysellformatter(@NotNull UniffiVTableCallbackInterfaceBuySellFormatter uniffiVTableCallbackInterfaceBuySellFormatter);

    public final native void uniffi_buy_sell_fn_init_callback_vtable_buysellorderdetaillocalization(@NotNull UniffiVTableCallbackInterfaceBuySellOrderDetailLocalization uniffiVTableCallbackInterfaceBuySellOrderDetailLocalization);

    public final native void uniffi_buy_sell_fn_init_callback_vtable_buysellorderdetailstateobserver(@NotNull UniffiVTableCallbackInterfaceBuySellOrderDetailStateObserver uniffiVTableCallbackInterfaceBuySellOrderDetailStateObserver);

    public final native void uniffi_buy_sell_fn_init_callback_vtable_inputvalidationlocalization(@NotNull UniffiVTableCallbackInterfaceInputValidationLocalization uniffiVTableCallbackInterfaceInputValidationLocalization);

    public final native void uniffi_buy_sell_fn_init_callback_vtable_recurringbuyplandetaillocalization(@NotNull UniffiVTableCallbackInterfaceRecurringBuyPlanDetailLocalization uniffiVTableCallbackInterfaceRecurringBuyPlanDetailLocalization);

    public final native void uniffi_buy_sell_fn_init_callback_vtable_recurringbuyplandetailstateobserver(@NotNull UniffiVTableCallbackInterfaceRecurringBuyPlanDetailStateObserver uniffiVTableCallbackInterfaceRecurringBuyPlanDetailStateObserver);

    public final native void uniffi_buy_sell_fn_init_callback_vtable_recurringbuyplanlistlocalization(@NotNull UniffiVTableCallbackInterfaceRecurringBuyPlanListLocalization uniffiVTableCallbackInterfaceRecurringBuyPlanListLocalization);

    public final native void uniffi_buy_sell_fn_init_callback_vtable_recurringbuyplanliststateobserver(@NotNull UniffiVTableCallbackInterfaceRecurringBuyPlanListStateObserver uniffiVTableCallbackInterfaceRecurringBuyPlanListStateObserver);

    public final native void uniffi_buy_sell_fn_init_callback_vtable_recurringbuyplanorderlistlocalization(@NotNull UniffiVTableCallbackInterfaceRecurringBuyPlanOrderListLocalization uniffiVTableCallbackInterfaceRecurringBuyPlanOrderListLocalization);

    public final native void uniffi_buy_sell_fn_init_callback_vtable_recurringbuyplanorderliststateobserver(@NotNull UniffiVTableCallbackInterfaceRecurringBuyPlanOrderListStateObserver uniffiVTableCallbackInterfaceRecurringBuyPlanOrderListStateObserver);

    public final native void uniffi_buy_sell_fn_method_bscquickconvertinteractor_observe_state(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_bscquickconvertinteractor_on_appear(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_bscquickconvertinteractor_on_bottom_sheet_dismissed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_bscquickconvertinteractor_on_disappear(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_bscquickconvertinteractor_show_init_content(long j, byte b, byte b2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_bscquickconvertinteractor_submit_order(long j, byte b, @NotNull RustBuffer.ByValue byValue, byte b2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_bscquickconvertstateobserver_on_state_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_method_buysellanalytics_get_analytics(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_buysellanalytics_track_bsc_quick_convert_bottomsheet_view(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_buysellanalytics_track_bsc_quick_convert_order_confirm_btm_pay_click(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_buysellanalytics_track_event_internal(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_buysellanalytics_track_order_detail_page_view(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_buysellanalytics_track_portfolio_convert_bottomsheet_click(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_buysellanalytics_track_recurring_buy_plan_detail_cancel_button_click(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_buysellanalytics_track_recurring_buy_plan_detail_order_item_click(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_buysellanalytics_track_recurring_buy_plan_detail_page_view(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_buysellanalytics_track_recurring_buy_plan_detail_pause_button_click(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_buysellanalytics_track_recurring_buy_plan_detail_resume_button_click(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_buysellanalytics_track_recurring_buy_plan_detail_view_all_orders_click(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_buysellanalytics_track_recurring_buy_plan_list_item_click(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_buysellanalytics_track_recurring_buy_plan_list_page_view(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_buysellanalytics_track_recurring_buy_plan_list_setup_button_click(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_buysellanalytics_track_recurring_buy_plan_order_list_item_click(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_buysellanalytics_track_recurring_buy_plan_order_list_page_view(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_buy_sell_fn_method_buysellfeaturerestrictionutil_is_fiat_restricted(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_buy_sell_fn_method_buysellfeaturerestrictionutil_is_new_onshore_ia_hidden(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_buy_sell_fn_method_buysellfeaturerestrictionutil_is_segregated_account(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_method_buysellformatter_format_crypto(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, int i, int i2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_method_buysellformatter_format_exchange_rate(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, int i, int i2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_method_buysellformatter_format_fiat_with_code_max(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, int i, int i2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_method_buysellformatter_format_fiat_with_code_minmax(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, int i, int i2, int i3, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_method_buysellformatter_format_fiat_with_symbol_max(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, int i, int i2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_method_buysellformatter_format_fiat_with_symbol_minmax(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, int i, int i2, int i3, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_method_buysellformatter_format_plain_string(long j, @NotNull RustBuffer.ByValue byValue, int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_method_buysellformatter_to_plain_string(long j, @NotNull RustBuffer.ByValue byValue, int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_buysellgrafanabuilder_track(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_method_buysellgrafanabuilder_with_click(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_method_buysellgrafanabuilder_with_current_page(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_method_buysellgrafanabuilder_with_error_code(long j, int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_method_buysellgrafanabuilder_with_log(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_method_buysellgrafanabuilder_with_source(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_buy_sell_fn_method_buysellgrafanabuilder_with_token(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_buysellorderdetailinteractor_observe_state(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_buysellorderdetailinteractor_on_appear(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_buysellorderdetailinteractor_on_disappear(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_buysellorderdetailinteractor_refresh(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_buysellorderdetailinteractor_set_parameters(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_method_buysellorderdetaillocalization_format_date(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_buysellorderdetailstateobserver_on_state_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_method_inputvalidationlocalization_get_buy_localized_error_message(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_method_inputvalidationlocalization_get_sell_localized_error_message(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplandetailinteractor_load_plan_details(long j, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplandetailinteractor_observe_state(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplandetailinteractor_on_appear(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplandetailinteractor_on_cancel_button_click(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplandetailinteractor_on_disappear(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplandetailinteractor_on_order_item_click(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplandetailinteractor_on_pause_button_click(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplandetailinteractor_on_resume_button_click(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplandetailinteractor_on_view_all_orders_click(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplandetailinteractor_set_parameters(long j, @NotNull RustBuffer.ByValue byValue, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplandetailinteractor_update_plan(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_method_recurringbuyplandetaillocalization_format_buy_amount(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_method_recurringbuyplandetaillocalization_format_date(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_method_recurringbuyplandetaillocalization_format_frequency(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_method_recurringbuyplandetaillocalization_format_frequency_option_date(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_method_recurringbuyplandetaillocalization_get_banner_message(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_method_recurringbuyplandetaillocalization_get_banner_title(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_method_recurringbuyplandetaillocalization_get_deposit_button_label(long j, byte b, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplandetailstateobserver_on_state_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplanlistinteractor_load_initial_page(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplanlistinteractor_load_next_page(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplanlistinteractor_observe_state(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplanlistinteractor_on_appear(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplanlistinteractor_on_disappear(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplanlistinteractor_on_recurring_list_item_click(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplanlistinteractor_on_setup_button_click(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplanlistinteractor_refresh(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplanlistinteractor_set_parameters(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_method_recurringbuyplanlistlocalization_format_date(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_method_recurringbuyplanlistlocalization_format_frequency(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplanliststateobserver_on_state_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplanorderlistinteractor_load_initial_page(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplanorderlistinteractor_load_next_page(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplanorderlistinteractor_observe_state(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplanorderlistinteractor_on_appear(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplanorderlistinteractor_on_disappear(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplanorderlistinteractor_on_order_item_click(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplanorderlistinteractor_refresh(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplanorderlistinteractor_set_plan_id(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_buy_sell_fn_method_recurringbuyplanorderlistlocalization_format_order_date(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_buy_sell_fn_method_recurringbuyplanorderliststateobserver_on_state_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    private UniffiLib() {
    }

    static {
        UniffiLib uniffiLib = new UniffiLib();
        INSTANCE = uniffiLib;
        CLEANER$delegate = C56392yDr.copydefault(new Function0() { // from class: o.Avy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UniffiLib.CLEANER_delegate$lambda$0();
            }
        });
        String strFindLibraryName = C60173zxj.findLibraryName("buy_sell");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        Native.register((Class<?>) UniffiLib.class, C60173zxj.findLibraryName("buy_sell"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        uniffiCallbackInterfaceBSCQuickConvertStateObserver.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceBuySellFormatter.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceBuySellOrderDetailLocalization.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceBuySellOrderDetailStateObserver.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceInputValidationLocalization.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceRecurringBuyPlanDetailLocalization.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceRecurringBuyPlanDetailStateObserver.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfaceRecurringBuyPlanListLocalization.INSTANCE.KWHzl(uniffiLib);
        uniffiCallbackInterfaceRecurringBuyPlanListStateObserver.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceRecurringBuyPlanOrderListLocalization.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceRecurringBuyPlanOrderListStateObserver.INSTANCE.copydefault(uniffiLib);
        C3599Aow.uniffiEnsureInitialized();
        $stable = 8;
    }

    public final InterfaceC60177zxn copydefault() {
        return (InterfaceC60177zxn) CLEANER$delegate.getValue();
    }

    public static final InterfaceC60177zxn CLEANER_delegate$lambda$0() {
        return C60173zxj.create(InterfaceC60177zxn.Companion);
    }
}
