package uniffi.buy_sell;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.C3722ArM;
import o.C60173zxj;

/* JADX INFO: loaded from: classes17.dex */
public final class IntegrityCheckingUniffiLib {
    public static final int $stable = 0;
    public static final IntegrityCheckingUniffiLib INSTANCE;

    public final native int ffi_buy_sell_uniffi_contract_version();

    public final native short uniffi_buy_sell_checksum_constructor_buysellanalytics_new();

    public final native short uniffi_buy_sell_checksum_constructor_buysellfeaturerestrictionutil_new();

    public final native short uniffi_buy_sell_checksum_constructor_buysellgrafanabuilder_new();

    public final native short uniffi_buy_sell_checksum_constructor_recurringbuyplandetailinteractor_new();

    public final native short uniffi_buy_sell_checksum_func_b_s_c_quick_convert_state_is_equal();

    public final native short uniffi_buy_sell_checksum_func_buy_sell_order_detail_state_is_equal();

    public final native short uniffi_buy_sell_checksum_func_create_bsc_quick_convert_interactor();

    public final native short uniffi_buy_sell_checksum_func_create_buy_sell_order_detail_interactor();

    public final native short uniffi_buy_sell_checksum_func_create_recurring_buy_plan_detail_interactor();

    public final native short uniffi_buy_sell_checksum_func_create_recurring_buy_plan_list_interactor();

    public final native short uniffi_buy_sell_checksum_func_create_recurring_buy_plan_order_list_interactor();

    public final native short uniffi_buy_sell_checksum_func_crypto_formatter_format();

    public final native short uniffi_buy_sell_checksum_func_fiat_formatter_format_exchange_rate();

    public final native short uniffi_buy_sell_checksum_func_fiat_formatter_format_with_code_max();

    public final native short uniffi_buy_sell_checksum_func_fiat_formatter_format_with_code_minmax();

    public final native short uniffi_buy_sell_checksum_func_fiat_formatter_format_with_symbol_max();

    public final native short uniffi_buy_sell_checksum_func_fiat_formatter_format_with_symbol_minmax();

    public final native short uniffi_buy_sell_checksum_func_plain_formatter_format_plain_string();

    public final native short uniffi_buy_sell_checksum_func_plain_formatter_to_plain_string();

    public final native short uniffi_buy_sell_checksum_func_recurring_buy_plan_detail_state_is_equal();

    public final native short uniffi_buy_sell_checksum_func_recurring_buy_plan_list_state_is_equal();

    public final native short uniffi_buy_sell_checksum_func_recurring_buy_plan_order_list_state_is_equal();

    public final native short uniffi_buy_sell_checksum_func_register_formatter();

    public final native short uniffi_buy_sell_checksum_method_bscquickconvertinteractor_observe_state();

    public final native short uniffi_buy_sell_checksum_method_bscquickconvertinteractor_on_appear();

    public final native short uniffi_buy_sell_checksum_method_bscquickconvertinteractor_on_bottom_sheet_dismissed();

    public final native short uniffi_buy_sell_checksum_method_bscquickconvertinteractor_on_disappear();

    public final native short uniffi_buy_sell_checksum_method_bscquickconvertinteractor_show_init_content();

    public final native short uniffi_buy_sell_checksum_method_bscquickconvertinteractor_submit_order();

    public final native short uniffi_buy_sell_checksum_method_bscquickconvertstateobserver_on_state_changed();

    public final native short uniffi_buy_sell_checksum_method_buysellanalytics_get_analytics();

    public final native short uniffi_buy_sell_checksum_method_buysellanalytics_track_bsc_quick_convert_bottomsheet_view();

    public final native short uniffi_buy_sell_checksum_method_buysellanalytics_track_bsc_quick_convert_order_confirm_btm_pay_click();

    public final native short uniffi_buy_sell_checksum_method_buysellanalytics_track_event_internal();

    public final native short uniffi_buy_sell_checksum_method_buysellanalytics_track_order_detail_page_view();

    public final native short uniffi_buy_sell_checksum_method_buysellanalytics_track_portfolio_convert_bottomsheet_click();

    public final native short uniffi_buy_sell_checksum_method_buysellanalytics_track_recurring_buy_plan_detail_cancel_button_click();

    public final native short uniffi_buy_sell_checksum_method_buysellanalytics_track_recurring_buy_plan_detail_order_item_click();

    public final native short uniffi_buy_sell_checksum_method_buysellanalytics_track_recurring_buy_plan_detail_page_view();

    public final native short uniffi_buy_sell_checksum_method_buysellanalytics_track_recurring_buy_plan_detail_pause_button_click();

    public final native short uniffi_buy_sell_checksum_method_buysellanalytics_track_recurring_buy_plan_detail_resume_button_click();

    public final native short uniffi_buy_sell_checksum_method_buysellanalytics_track_recurring_buy_plan_detail_view_all_orders_click();

    public final native short uniffi_buy_sell_checksum_method_buysellanalytics_track_recurring_buy_plan_list_item_click();

    public final native short uniffi_buy_sell_checksum_method_buysellanalytics_track_recurring_buy_plan_list_page_view();

    public final native short uniffi_buy_sell_checksum_method_buysellanalytics_track_recurring_buy_plan_list_setup_button_click();

    public final native short uniffi_buy_sell_checksum_method_buysellanalytics_track_recurring_buy_plan_order_list_item_click();

    public final native short uniffi_buy_sell_checksum_method_buysellanalytics_track_recurring_buy_plan_order_list_page_view();

    public final native short uniffi_buy_sell_checksum_method_buysellfeaturerestrictionutil_is_fiat_restricted();

    public final native short uniffi_buy_sell_checksum_method_buysellfeaturerestrictionutil_is_new_onshore_ia_hidden();

    public final native short uniffi_buy_sell_checksum_method_buysellfeaturerestrictionutil_is_segregated_account();

    public final native short uniffi_buy_sell_checksum_method_buysellformatter_format_crypto();

    public final native short uniffi_buy_sell_checksum_method_buysellformatter_format_exchange_rate();

    public final native short uniffi_buy_sell_checksum_method_buysellformatter_format_fiat_with_code_max();

    public final native short uniffi_buy_sell_checksum_method_buysellformatter_format_fiat_with_code_minmax();

    public final native short uniffi_buy_sell_checksum_method_buysellformatter_format_fiat_with_symbol_max();

    public final native short uniffi_buy_sell_checksum_method_buysellformatter_format_fiat_with_symbol_minmax();

    public final native short uniffi_buy_sell_checksum_method_buysellformatter_format_plain_string();

    public final native short uniffi_buy_sell_checksum_method_buysellformatter_to_plain_string();

    public final native short uniffi_buy_sell_checksum_method_buysellgrafanabuilder_track();

    public final native short uniffi_buy_sell_checksum_method_buysellgrafanabuilder_with_click();

    public final native short uniffi_buy_sell_checksum_method_buysellgrafanabuilder_with_current_page();

    public final native short uniffi_buy_sell_checksum_method_buysellgrafanabuilder_with_error_code();

    public final native short uniffi_buy_sell_checksum_method_buysellgrafanabuilder_with_log();

    public final native short uniffi_buy_sell_checksum_method_buysellgrafanabuilder_with_source();

    public final native short uniffi_buy_sell_checksum_method_buysellgrafanabuilder_with_token();

    public final native short uniffi_buy_sell_checksum_method_buysellorderdetailinteractor_observe_state();

    public final native short uniffi_buy_sell_checksum_method_buysellorderdetailinteractor_on_appear();

    public final native short uniffi_buy_sell_checksum_method_buysellorderdetailinteractor_on_disappear();

    public final native short uniffi_buy_sell_checksum_method_buysellorderdetailinteractor_refresh();

    public final native short uniffi_buy_sell_checksum_method_buysellorderdetailinteractor_set_parameters();

    public final native short uniffi_buy_sell_checksum_method_buysellorderdetaillocalization_format_date();

    public final native short uniffi_buy_sell_checksum_method_buysellorderdetailstateobserver_on_state_changed();

    public final native short uniffi_buy_sell_checksum_method_inputvalidationlocalization_get_buy_localized_error_message();

    public final native short uniffi_buy_sell_checksum_method_inputvalidationlocalization_get_sell_localized_error_message();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplandetailinteractor_load_plan_details();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplandetailinteractor_observe_state();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplandetailinteractor_on_appear();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplandetailinteractor_on_cancel_button_click();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplandetailinteractor_on_disappear();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplandetailinteractor_on_order_item_click();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplandetailinteractor_on_pause_button_click();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplandetailinteractor_on_resume_button_click();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplandetailinteractor_on_view_all_orders_click();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplandetailinteractor_set_parameters();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplandetailinteractor_update_plan();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplandetaillocalization_format_buy_amount();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplandetaillocalization_format_date();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplandetaillocalization_format_frequency();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplandetaillocalization_format_frequency_option_date();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplandetaillocalization_get_banner_message();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplandetaillocalization_get_banner_title();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplandetaillocalization_get_deposit_button_label();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplandetailstateobserver_on_state_changed();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplanlistinteractor_load_initial_page();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplanlistinteractor_load_next_page();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplanlistinteractor_observe_state();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplanlistinteractor_on_appear();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplanlistinteractor_on_disappear();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplanlistinteractor_on_recurring_list_item_click();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplanlistinteractor_on_setup_button_click();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplanlistinteractor_refresh();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplanlistinteractor_set_parameters();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplanlistlocalization_format_date();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplanlistlocalization_format_frequency();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplanliststateobserver_on_state_changed();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplanorderlistinteractor_load_initial_page();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplanorderlistinteractor_load_next_page();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplanorderlistinteractor_observe_state();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplanorderlistinteractor_on_appear();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplanorderlistinteractor_on_disappear();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplanorderlistinteractor_on_order_item_click();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplanorderlistinteractor_refresh();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplanorderlistinteractor_set_plan_id();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplanorderlistlocalization_format_order_date();

    public final native short uniffi_buy_sell_checksum_method_recurringbuyplanorderliststateobserver_on_state_changed();

    private IntegrityCheckingUniffiLib() {
    }

    static {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = new IntegrityCheckingUniffiLib();
        INSTANCE = integrityCheckingUniffiLib;
        String strFindLibraryName = C60173zxj.findLibraryName("buy_sell");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        Native.register((Class<?>) IntegrityCheckingUniffiLib.class, C60173zxj.findLibraryName("buy_sell"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        C3722ArM.uniffiCheckContractApiVersion(integrityCheckingUniffiLib);
    }
}
