package uniffi.lifecycle;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.C2692AVo;
import o.C60173zxj;

/* JADX INFO: loaded from: classes17.dex */
public final class IntegrityCheckingUniffiLib {
    public static final int $stable = 0;
    public static final IntegrityCheckingUniffiLib INSTANCE;

    public final native int ffi_lifecycle_uniffi_contract_version();

    public final native short uniffi_lifecycle_checksum_constructor_coredeeplinkservicebridge_new();

    public final native short uniffi_lifecycle_checksum_constructor_corelifecyclelinkservicebridge_new();

    public final native short uniffi_lifecycle_checksum_constructor_corelinkanalyticsbridge_new();

    public final native short uniffi_lifecycle_checksum_constructor_corelinkanalyticsstateholderbridge_new();

    public final native short uniffi_lifecycle_checksum_method_coreapplinkhandler_execute();

    public final native short uniffi_lifecycle_checksum_method_coreapplinkinfofetcher_get_app_link_handler();

    public final native short uniffi_lifecycle_checksum_method_coreapplinkinfofetcher_get_app_link_metadata();

    public final native short uniffi_lifecycle_checksum_method_coreapplinkmetadata_get_link();

    public final native short uniffi_lifecycle_checksum_method_coreapplinkmetadata_get_mode();

    public final native short uniffi_lifecycle_checksum_method_coreapplinkmetadata_get_supported_okx_domains();

    public final native short uniffi_lifecycle_checksum_method_coreapplinkmetadata_opens_in_webview();

    public final native short uniffi_lifecycle_checksum_method_coreapplinkmetadata_require_auth();

    public final native short uniffi_lifecycle_checksum_method_coreapplinkmetadata_support_rbac_account();

    public final native short uniffi_lifecycle_checksum_method_coreapplinkmetadata_support_rm_account();

    public final native short uniffi_lifecycle_checksum_method_coredeeplinkhandler_execute();

    public final native short uniffi_lifecycle_checksum_method_coredeeplinkinfofetcher_get_deeplink_handler();

    public final native short uniffi_lifecycle_checksum_method_coredeeplinkinfofetcher_get_deeplink_metadata();

    public final native short uniffi_lifecycle_checksum_method_coredeeplinkinfofetcher_get_handler_for_scheme();

    public final native short uniffi_lifecycle_checksum_method_coredeeplinkinfofetcher_get_metadata_for_scheme();

    public final native short uniffi_lifecycle_checksum_method_coredeeplinkmetadata_get_mode();

    public final native short uniffi_lifecycle_checksum_method_coredeeplinkmetadata_get_path();

    public final native short uniffi_lifecycle_checksum_method_coredeeplinkmetadata_require_auth();

    public final native short uniffi_lifecycle_checksum_method_coredeeplinkmetadata_support_rbac_account();

    public final native short uniffi_lifecycle_checksum_method_coredeeplinkmetadata_support_rm_account();

    public final native short uniffi_lifecycle_checksum_method_coredeeplinkparsedinfo_can_handle();

    public final native short uniffi_lifecycle_checksum_method_coredeeplinkparsedinfo_get_metadata();

    public final native short uniffi_lifecycle_checksum_method_coredeeplinkparsedinfo_get_params();

    public final native short uniffi_lifecycle_checksum_method_coredeeplinkservicebridge_create_link();

    public final native short uniffi_lifecycle_checksum_method_coredeeplinkservicebridge_get_deeplink_metadata();

    public final native short uniffi_lifecycle_checksum_method_coredeeplinkservicebridge_get_deeplink_registry();

    public final native short uniffi_lifecycle_checksum_method_coredeeplinkservicebridge_get_deeplink_scheme();

    public final native short uniffi_lifecycle_checksum_method_coredeeplinkservicebridge_is_universal_link();

    public final native short uniffi_lifecycle_checksum_method_coredeeplinkservicebridge_is_universal_link_from_webview();

    public final native short uniffi_lifecycle_checksum_method_coredeeplinkservicebridge_navigate_to_native();

    public final native short uniffi_lifecycle_checksum_method_coredeeplinkservicebridge_parse_param();

    public final native short uniffi_lifecycle_checksum_method_coredeeplinkservicebridge_process_deeplink();

    public final native short uniffi_lifecycle_checksum_method_coredeeplinkservicebridge_validate_deeplink();

    public final native short uniffi_lifecycle_checksum_method_coredeeplinkservicebridge_validate_deeplink_scheme();

    public final native short uniffi_lifecycle_checksum_method_corelifecyclelinkservicebridge_get_short_link_info();

    public final native short uniffi_lifecycle_checksum_method_corelifecyclelinkservicebridge_process_external_link();

    public final native short uniffi_lifecycle_checksum_method_corelinkanalyticsbridge_send_all_link_status();

    public final native short uniffi_lifecycle_checksum_method_corelinkanalyticsbridge_send_app_open_success();

    public final native short uniffi_lifecycle_checksum_method_corelinkanalyticsbridge_send_legacy_deeplink_view();

    public final native short uniffi_lifecycle_checksum_method_corelinkanalyticsbridge_send_open_in_app_click();

    public final native short uniffi_lifecycle_checksum_method_corelinkanalyticsbridge_send_redirect_short_code_link_view();

    public final native short uniffi_lifecycle_checksum_method_corelinkanalyticsbridge_send_short_code_status();

    public final native short uniffi_lifecycle_checksum_method_corelinkanalyticsstateholderbridge_get_analytics_params();

    public final native short uniffi_lifecycle_checksum_method_corelinkanalyticsstateholderbridge_has_state();

    public final native short uniffi_lifecycle_checksum_method_corelinkanalyticsstateholderbridge_initialize();

    public final native short uniffi_lifecycle_checksum_method_corelinkanalyticsstateholderbridge_is_external_link_processing();

    public final native short uniffi_lifecycle_checksum_method_corelinkanalyticsstateholderbridge_is_external_source();

    public final native short uniffi_lifecycle_checksum_method_corelinkanalyticsstateholderbridge_is_processing_complete();

    public final native short uniffi_lifecycle_checksum_method_corelinkanalyticsstateholderbridge_reset();

    public final native short uniffi_lifecycle_checksum_method_corelinkanalyticsstateholderbridge_set_deeplink();

    public final native short uniffi_lifecycle_checksum_method_corelinkanalyticsstateholderbridge_set_link_reason();

    public final native short uniffi_lifecycle_checksum_method_corelinkdependencyhelper_invoke_link();

    public final native short uniffi_lifecycle_checksum_method_corelinkdependencyhelper_is_pay_mode_supported();

    public final native short uniffi_lifecycle_checksum_method_corelinkdependencyhelper_is_pro();

    public final native short uniffi_lifecycle_checksum_method_corelinkdependencyhelper_is_valid_language_code();

    public final native short uniffi_lifecycle_checksum_method_corelinkdependencyhelper_perform_auth();

    public final native short uniffi_lifecycle_checksum_method_corelinkdependencyhelper_process_link_params();

    public final native short uniffi_lifecycle_checksum_method_corelinkdependencyhelper_switch_mode_if_required();

    public final native short uniffi_lifecycle_checksum_method_corelinkdependencyhelper_validate_mode();

    public final native short uniffi_lifecycle_checksum_method_corelinkdependencyhelper_wait_for_config_sync();

    public final native short uniffi_lifecycle_checksum_method_corelinkexecutionhelper_clear_context();

    public final native short uniffi_lifecycle_checksum_method_corelinkexecutionhelper_get_context_refer();

    public final native short uniffi_lifecycle_checksum_method_corelinkexecutionhelper_open_link();

    public final native short uniffi_lifecycle_checksum_method_oknativetaskboolwithlifecyclefutureerror_cancel();

    public final native short uniffi_lifecycle_checksum_method_oknativetaskboolwithlifecyclefutureerror_execute();

    public final native short uniffi_lifecycle_checksum_method_okrustfutureboolwithlifecyclefutureerror_cancel();

    public final native short uniffi_lifecycle_checksum_method_okrustfutureboolwithlifecyclefutureerror_get_error();

    public final native short uniffi_lifecycle_checksum_method_okrustfutureboolwithlifecyclefutureerror_get_result_status();

    public final native short uniffi_lifecycle_checksum_method_okrustfutureboolwithlifecyclefutureerror_get_success_result();

    public final native short uniffi_lifecycle_checksum_method_okrustfutureboolwithlifecyclefutureerror_is_finished();

    public final native short uniffi_lifecycle_checksum_method_okrustfutureboolwithlifecyclefutureerror_start_with_callback();

    public final native short uniffi_lifecycle_checksum_method_okrustfuturedeeplinkresultwithlifecyclefutureerror_cancel();

    public final native short uniffi_lifecycle_checksum_method_okrustfuturedeeplinkresultwithlifecyclefutureerror_get_error();

    public final native short uniffi_lifecycle_checksum_method_okrustfuturedeeplinkresultwithlifecyclefutureerror_get_result_status();

    public final native short uniffi_lifecycle_checksum_method_okrustfuturedeeplinkresultwithlifecyclefutureerror_get_success_result();

    public final native short uniffi_lifecycle_checksum_method_okrustfuturedeeplinkresultwithlifecyclefutureerror_is_finished();

    public final native short uniffi_lifecycle_checksum_method_okrustfuturedeeplinkresultwithlifecyclefutureerror_start_with_callback();

    public final native short uniffi_lifecycle_checksum_method_okrustfutureshortlinkinfowithlifecyclefutureerror_cancel();

    public final native short uniffi_lifecycle_checksum_method_okrustfutureshortlinkinfowithlifecyclefutureerror_get_error();

    public final native short uniffi_lifecycle_checksum_method_okrustfutureshortlinkinfowithlifecyclefutureerror_get_result_status();

    public final native short uniffi_lifecycle_checksum_method_okrustfutureshortlinkinfowithlifecyclefutureerror_get_success_result();

    public final native short uniffi_lifecycle_checksum_method_okrustfutureshortlinkinfowithlifecyclefutureerror_is_finished();

    public final native short uniffi_lifecycle_checksum_method_okrustfutureshortlinkinfowithlifecyclefutureerror_start_with_callback();

    private IntegrityCheckingUniffiLib() {
    }

    static {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = new IntegrityCheckingUniffiLib();
        INSTANCE = integrityCheckingUniffiLib;
        String strFindLibraryName = C60173zxj.findLibraryName(RequestParameters.SUBRESOURCE_LIFECYCLE);
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        Native.register((Class<?>) IntegrityCheckingUniffiLib.class, C60173zxj.findLibraryName(RequestParameters.SUBRESOURCE_LIFECYCLE));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        C2692AVo.uniffiCheckContractApiVersion(integrityCheckingUniffiLib);
    }
}
