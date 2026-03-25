package uniffi.dex;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.AAL;
import o.C60173zxj;

/* JADX INFO: loaded from: classes17.dex */
public final class IntegrityCheckingUniffiLib {
    public static final int $stable = 0;
    public static final IntegrityCheckingUniffiLib INSTANCE;

    public final native int ffi_dex_uniffi_contract_version();

    public final native short uniffi_dex_checksum_constructor_bridgetokenlistmanager_new();

    public final native short uniffi_dex_checksum_constructor_dexalertusecase_new();

    public final native short uniffi_dex_checksum_constructor_dexchainsmanager_new();

    public final native short uniffi_dex_checksum_constructor_dexpoolinfointeractor_new();

    public final native short uniffi_dex_checksum_constructor_singletokenlistmanager_new();

    public final native short uniffi_dex_checksum_func_bridge_approve_data();

    public final native short uniffi_dex_checksum_func_bridge_approve_data_json();

    public final native short uniffi_dex_checksum_func_bridge_platform_check();

    public final native short uniffi_dex_checksum_func_bridge_platform_check_json();

    public final native short uniffi_dex_checksum_func_get_coin_risk();

    public final native short uniffi_dex_checksum_func_get_coin_risk_data();

    public final native short uniffi_dex_checksum_func_get_holder_analysis();

    public final native short uniffi_dex_checksum_func_get_insights_summary();

    public final native short uniffi_dex_checksum_func_get_liquidity_chart();

    public final native short uniffi_dex_checksum_func_get_market_chain_list();

    public final native short uniffi_dex_checksum_func_reset_preset_config();

    public final native short uniffi_dex_checksum_func_reset_preset_config_json();

    public final native short uniffi_dex_checksum_func_save_preset_config();

    public final native short uniffi_dex_checksum_func_save_preset_config_json();

    public final native short uniffi_dex_checksum_method_bridgetokenlistmanager_get_bridge_tokens();

    public final native short uniffi_dex_checksum_method_bridgetokenlistmanager_get_collection_tokens();

    public final native short uniffi_dex_checksum_method_bridgetokenlistmanager_search_tokens();

    public final native short uniffi_dex_checksum_method_dexalertusecase_add_alert();

    public final native short uniffi_dex_checksum_method_dexalertusecase_check_coin_alert_subscribe_status();

    public final native short uniffi_dex_checksum_method_dexalertusecase_check_token_supported_for_alert();

    public final native short uniffi_dex_checksum_method_dexalertusecase_delete_alert_rule_by_rule_ids();

    public final native short uniffi_dex_checksum_method_dexalertusecase_edit_alert();

    public final native short uniffi_dex_checksum_method_dexalertusecase_edit_alert_active_status();

    public final native short uniffi_dex_checksum_method_dexalertusecase_get_alert_list();

    public final native short uniffi_dex_checksum_method_dexchainsmanager_get_bridge_support_chains();

    public final native short uniffi_dex_checksum_method_dexchainsmanager_get_strategy_chains();

    public final native short uniffi_dex_checksum_method_dexchainsmanager_get_swap_chains();

    public final native short uniffi_dex_checksum_method_dexchainsmanager_is_current_chain_inside_limit_chains();

    public final native short uniffi_dex_checksum_method_dexchainsmanager_is_server_support_advance_limit();

    public final native short uniffi_dex_checksum_method_dexchainsmanager_is_server_support_tpsl();

    public final native short uniffi_dex_checksum_method_dexpoolinfointeractor_refresh();

    public final native short uniffi_dex_checksum_method_dexpoolinfointeractor_register_observer();

    public final native short uniffi_dex_checksum_method_dexpoolinfointeractor_start();

    public final native short uniffi_dex_checksum_method_dexpoolinfointeractor_stop();

    public final native short uniffi_dex_checksum_method_dexpoolinfoobserver_on_state_changed();

    public final native short uniffi_dex_checksum_method_okrustfutureaddalertresponsewithokffierror_cancel();

    public final native short uniffi_dex_checksum_method_okrustfutureaddalertresponsewithokffierror_get_error();

    public final native short uniffi_dex_checksum_method_okrustfutureaddalertresponsewithokffierror_get_result_status();

    public final native short uniffi_dex_checksum_method_okrustfutureaddalertresponsewithokffierror_get_success_result();

    public final native short uniffi_dex_checksum_method_okrustfutureaddalertresponsewithokffierror_is_finished();

    public final native short uniffi_dex_checksum_method_okrustfutureaddalertresponsewithokffierror_start_with_callback();

    public final native short uniffi_dex_checksum_method_okrustfuturealertlistresponsevecwithokffierror_cancel();

    public final native short uniffi_dex_checksum_method_okrustfuturealertlistresponsevecwithokffierror_get_error();

    public final native short uniffi_dex_checksum_method_okrustfuturealertlistresponsevecwithokffierror_get_result_status();

    public final native short uniffi_dex_checksum_method_okrustfuturealertlistresponsevecwithokffierror_get_success_result();

    public final native short uniffi_dex_checksum_method_okrustfuturealertlistresponsevecwithokffierror_is_finished();

    public final native short uniffi_dex_checksum_method_okrustfuturealertlistresponsevecwithokffierror_start_with_callback();

    public final native short uniffi_dex_checksum_method_okrustfuturebridgechainlistwithokffierror_cancel();

    public final native short uniffi_dex_checksum_method_okrustfuturebridgechainlistwithokffierror_get_error();

    public final native short uniffi_dex_checksum_method_okrustfuturebridgechainlistwithokffierror_get_result_status();

    public final native short uniffi_dex_checksum_method_okrustfuturebridgechainlistwithokffierror_get_success_result();

    public final native short uniffi_dex_checksum_method_okrustfuturebridgechainlistwithokffierror_is_finished();

    public final native short uniffi_dex_checksum_method_okrustfuturebridgechainlistwithokffierror_start_with_callback();

    public final native short uniffi_dex_checksum_method_okrustfuturebridgeplatformcheckresponsewithokffierror_cancel();

    public final native short uniffi_dex_checksum_method_okrustfuturebridgeplatformcheckresponsewithokffierror_get_error();

    public final native short uniffi_dex_checksum_method_okrustfuturebridgeplatformcheckresponsewithokffierror_get_result_status();

    public final native short uniffi_dex_checksum_method_okrustfuturebridgeplatformcheckresponsewithokffierror_get_success_result();

    public final native short uniffi_dex_checksum_method_okrustfuturebridgeplatformcheckresponsewithokffierror_is_finished();

    public final native short uniffi_dex_checksum_method_okrustfuturebridgeplatformcheckresponsewithokffierror_start_with_callback();

    public final native short uniffi_dex_checksum_method_okrustfuturecoincheckresultwithokffierror_cancel();

    public final native short uniffi_dex_checksum_method_okrustfuturecoincheckresultwithokffierror_get_error();

    public final native short uniffi_dex_checksum_method_okrustfuturecoincheckresultwithokffierror_get_result_status();

    public final native short uniffi_dex_checksum_method_okrustfuturecoincheckresultwithokffierror_get_success_result();

    public final native short uniffi_dex_checksum_method_okrustfuturecoincheckresultwithokffierror_is_finished();

    public final native short uniffi_dex_checksum_method_okrustfuturecoincheckresultwithokffierror_start_with_callback();

    public final native short uniffi_dex_checksum_method_okrustfuturedexholderanalysisdatawithokffierror_cancel();

    public final native short uniffi_dex_checksum_method_okrustfuturedexholderanalysisdatawithokffierror_get_error();

    public final native short uniffi_dex_checksum_method_okrustfuturedexholderanalysisdatawithokffierror_get_result_status();

    public final native short uniffi_dex_checksum_method_okrustfuturedexholderanalysisdatawithokffierror_get_success_result();

    public final native short uniffi_dex_checksum_method_okrustfuturedexholderanalysisdatawithokffierror_is_finished();

    public final native short uniffi_dex_checksum_method_okrustfuturedexholderanalysisdatawithokffierror_start_with_callback();

    public final native short uniffi_dex_checksum_method_okrustfuturedexliquiditychartdatawithokffierror_cancel();

    public final native short uniffi_dex_checksum_method_okrustfuturedexliquiditychartdatawithokffierror_get_error();

    public final native short uniffi_dex_checksum_method_okrustfuturedexliquiditychartdatawithokffierror_get_result_status();

    public final native short uniffi_dex_checksum_method_okrustfuturedexliquiditychartdatawithokffierror_get_success_result();

    public final native short uniffi_dex_checksum_method_okrustfuturedexliquiditychartdatawithokffierror_is_finished();

    public final native short uniffi_dex_checksum_method_okrustfuturedexliquiditychartdatawithokffierror_start_with_callback();

    public final native short uniffi_dex_checksum_method_okrustfuturemarketchainlistwithokffierror_cancel();

    public final native short uniffi_dex_checksum_method_okrustfuturemarketchainlistwithokffierror_get_error();

    public final native short uniffi_dex_checksum_method_okrustfuturemarketchainlistwithokffierror_get_result_status();

    public final native short uniffi_dex_checksum_method_okrustfuturemarketchainlistwithokffierror_get_success_result();

    public final native short uniffi_dex_checksum_method_okrustfuturemarketchainlistwithokffierror_is_finished();

    public final native short uniffi_dex_checksum_method_okrustfuturemarketchainlistwithokffierror_start_with_callback();

    public final native short uniffi_dex_checksum_method_okrustfutureoptionalbridgeapprovedatawithokffierror_cancel();

    public final native short uniffi_dex_checksum_method_okrustfutureoptionalbridgeapprovedatawithokffierror_get_error();

    public final native short uniffi_dex_checksum_method_okrustfutureoptionalbridgeapprovedatawithokffierror_get_result_status();

    public final native short uniffi_dex_checksum_method_okrustfutureoptionalbridgeapprovedatawithokffierror_get_success_result();

    public final native short uniffi_dex_checksum_method_okrustfutureoptionalbridgeapprovedatawithokffierror_is_finished();

    public final native short uniffi_dex_checksum_method_okrustfutureoptionalbridgeapprovedatawithokffierror_start_with_callback();

    public final native short uniffi_dex_checksum_method_okrustfutureoptionalcoinriskdatawithokffierror_cancel();

    public final native short uniffi_dex_checksum_method_okrustfutureoptionalcoinriskdatawithokffierror_get_error();

    public final native short uniffi_dex_checksum_method_okrustfutureoptionalcoinriskdatawithokffierror_get_result_status();

    public final native short uniffi_dex_checksum_method_okrustfutureoptionalcoinriskdatawithokffierror_get_success_result();

    public final native short uniffi_dex_checksum_method_okrustfutureoptionalcoinriskdatawithokffierror_is_finished();

    public final native short uniffi_dex_checksum_method_okrustfutureoptionalcoinriskdatawithokffierror_start_with_callback();

    public final native short uniffi_dex_checksum_method_okrustfuturepresetrequestconfigwithokffierror_cancel();

    public final native short uniffi_dex_checksum_method_okrustfuturepresetrequestconfigwithokffierror_get_error();

    public final native short uniffi_dex_checksum_method_okrustfuturepresetrequestconfigwithokffierror_get_result_status();

    public final native short uniffi_dex_checksum_method_okrustfuturepresetrequestconfigwithokffierror_get_success_result();

    public final native short uniffi_dex_checksum_method_okrustfuturepresetrequestconfigwithokffierror_is_finished();

    public final native short uniffi_dex_checksum_method_okrustfuturepresetrequestconfigwithokffierror_start_with_callback();

    public final native short uniffi_dex_checksum_method_okrustfuturestrategychainlistwithokffierror_cancel();

    public final native short uniffi_dex_checksum_method_okrustfuturestrategychainlistwithokffierror_get_error();

    public final native short uniffi_dex_checksum_method_okrustfuturestrategychainlistwithokffierror_get_result_status();

    public final native short uniffi_dex_checksum_method_okrustfuturestrategychainlistwithokffierror_get_success_result();

    public final native short uniffi_dex_checksum_method_okrustfuturestrategychainlistwithokffierror_is_finished();

    public final native short uniffi_dex_checksum_method_okrustfuturestrategychainlistwithokffierror_start_with_callback();

    public final native short uniffi_dex_checksum_method_okrustfuturesummarydatawithokffierror_cancel();

    public final native short uniffi_dex_checksum_method_okrustfuturesummarydatawithokffierror_get_error();

    public final native short uniffi_dex_checksum_method_okrustfuturesummarydatawithokffierror_get_result_status();

    public final native short uniffi_dex_checksum_method_okrustfuturesummarydatawithokffierror_get_success_result();

    public final native short uniffi_dex_checksum_method_okrustfuturesummarydatawithokffierror_is_finished();

    public final native short uniffi_dex_checksum_method_okrustfuturesummarydatawithokffierror_start_with_callback();

    public final native short uniffi_dex_checksum_method_okrustfutureswapchainlistwithokffierror_cancel();

    public final native short uniffi_dex_checksum_method_okrustfutureswapchainlistwithokffierror_get_error();

    public final native short uniffi_dex_checksum_method_okrustfutureswapchainlistwithokffierror_get_result_status();

    public final native short uniffi_dex_checksum_method_okrustfutureswapchainlistwithokffierror_get_success_result();

    public final native short uniffi_dex_checksum_method_okrustfutureswapchainlistwithokffierror_is_finished();

    public final native short uniffi_dex_checksum_method_okrustfutureswapchainlistwithokffierror_start_with_callback();

    public final native short uniffi_dex_checksum_method_okrustfuturetokenlistresultwithokffierror_cancel();

    public final native short uniffi_dex_checksum_method_okrustfuturetokenlistresultwithokffierror_get_error();

    public final native short uniffi_dex_checksum_method_okrustfuturetokenlistresultwithokffierror_get_result_status();

    public final native short uniffi_dex_checksum_method_okrustfuturetokenlistresultwithokffierror_get_success_result();

    public final native short uniffi_dex_checksum_method_okrustfuturetokenlistresultwithokffierror_is_finished();

    public final native short uniffi_dex_checksum_method_okrustfuturetokenlistresultwithokffierror_start_with_callback();

    public final native short uniffi_dex_checksum_method_singletokenlistmanager_get_all_network_tokens();

    public final native short uniffi_dex_checksum_method_singletokenlistmanager_get_collection_tokens();

    public final native short uniffi_dex_checksum_method_singletokenlistmanager_get_single_chain_tokens();

    public final native short uniffi_dex_checksum_method_singletokenlistmanager_search_tokens();

    private IntegrityCheckingUniffiLib() {
    }

    static {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = new IntegrityCheckingUniffiLib();
        INSTANCE = integrityCheckingUniffiLib;
        String strFindLibraryName = C60173zxj.findLibraryName("dex");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        Native.register((Class<?>) IntegrityCheckingUniffiLib.class, C60173zxj.findLibraryName("dex"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        AAL.uniffiCheckContractApiVersion(integrityCheckingUniffiLib);
    }
}
