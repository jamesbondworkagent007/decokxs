package uniffi.user;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.BzK;
import o.C60173zxj;

/* JADX INFO: loaded from: classes14.dex */
public final class IntegrityCheckingUniffiLib {
    public static final int $stable = 0;
    public static final IntegrityCheckingUniffiLib INSTANCE;

    public final native int ffi_user_uniffi_contract_version();

    public final native short uniffi_user_checksum_func_avatar_type_from_string();

    public final native short uniffi_user_checksum_func_avatar_type_to_string();

    public final native short uniffi_user_checksum_func_bio_background_review_status_from_int();

    public final native short uniffi_user_checksum_func_bio_background_review_status_to_int();

    public final native short uniffi_user_checksum_func_core_user_get_account_name();

    public final native short uniffi_user_checksum_func_core_user_get_nickname();

    public final native short uniffi_user_checksum_func_create_core_user();

    public final native short uniffi_user_checksum_func_create_core_user_info();

    public final native short uniffi_user_checksum_func_create_core_user_info_with_account();

    public final native short uniffi_user_checksum_func_create_core_user_profile();

    public final native short uniffi_user_checksum_func_create_local_user_data();

    public final native short uniffi_user_checksum_func_dual_account_type_from_int();

    public final native short uniffi_user_checksum_func_dual_account_type_to_int();

    public final native short uniffi_user_checksum_func_get_mock_core_user_manager();

    public final native short uniffi_user_checksum_func_get_shared_core_entity_manager();

    public final native short uniffi_user_checksum_func_get_shared_core_user_manager();

    public final native short uniffi_user_checksum_func_register_native_user_storage();

    public final native short uniffi_user_checksum_func_review_status_from_int();

    public final native short uniffi_user_checksum_func_review_status_to_int();

    public final native short uniffi_user_checksum_func_second_verify_type_from_int();

    public final native short uniffi_user_checksum_func_second_verify_type_to_int();

    public final native short uniffi_user_checksum_method_coreentitymanagerforeignhandling_get_entity_id();

    public final native short uniffi_user_checksum_method_coreentitymanagerforeignhandling_get_json_site_code();

    public final native short uniffi_user_checksum_method_coreentitymanagerforeignhandling_get_region();

    public final native short uniffi_user_checksum_method_coreentitymanagerforeignhandling_get_simulated_site_code();

    public final native short uniffi_user_checksum_method_coreentitymanagerforeignhandling_get_site_code();

    public final native short uniffi_user_checksum_method_coreentitymanagerforeignhandling_is_switch_domain_site_code();

    public final native short uniffi_user_checksum_method_coreentitymanagerforeignhandling_set_entity_id();

    public final native short uniffi_user_checksum_method_coreentitymanagerforeignhandling_set_region();

    public final native short uniffi_user_checksum_method_coreentitymanagerforeignhandling_set_simulated_site_code();

    public final native short uniffi_user_checksum_method_coreentitymanagerforeignhandling_switch_site_code();

    public final native short uniffi_user_checksum_method_coreusermanager_clear_all_users();

    public final native short uniffi_user_checksum_method_coreusermanager_clear_temp_token();

    public final native short uniffi_user_checksum_method_coreusermanager_get_all_usernames();

    public final native short uniffi_user_checksum_method_coreusermanager_get_all_users();

    public final native short uniffi_user_checksum_method_coreusermanager_get_all_users_by_login_time();

    public final native short uniffi_user_checksum_method_coreusermanager_get_all_users_of_current_site();

    public final native short uniffi_user_checksum_method_coreusermanager_get_authorisation_token();

    public final native short uniffi_user_checksum_method_coreusermanager_get_bound_account();

    public final native short uniffi_user_checksum_method_coreusermanager_get_current_user();

    public final native short uniffi_user_checksum_method_coreusermanager_get_current_user_info();

    public final native short uniffi_user_checksum_method_coreusermanager_get_current_user_profile();

    public final native short uniffi_user_checksum_method_coreusermanager_get_non_current_users_with_token();

    public final native short uniffi_user_checksum_method_coreusermanager_get_rbac_features();

    public final native short uniffi_user_checksum_method_coreusermanager_get_rm_features();

    public final native short uniffi_user_checksum_method_coreusermanager_get_temp_token();

    public final native short uniffi_user_checksum_method_coreusermanager_get_user_by_id();

    public final native short uniffi_user_checksum_method_coreusermanager_get_user_by_login_name();

    public final native short uniffi_user_checksum_method_coreusermanager_get_user_info();

    public final native short uniffi_user_checksum_method_coreusermanager_get_user_profile();

    public final native short uniffi_user_checksum_method_coreusermanager_has_special_mode_deeplink_restriction();

    public final native short uniffi_user_checksum_method_coreusermanager_is_login();

    public final native short uniffi_user_checksum_method_coreusermanager_is_login_main_account();

    public final native short uniffi_user_checksum_method_coreusermanager_is_main_account_approver();

    public final native short uniffi_user_checksum_method_coreusermanager_is_rm_account();

    public final native short uniffi_user_checksum_method_coreusermanager_login_user();

    public final native short uniffi_user_checksum_method_coreusermanager_logout_current_user();

    public final native short uniffi_user_checksum_method_coreusermanager_register_user_info_event_callback();

    public final native short uniffi_user_checksum_method_coreusermanager_reload_data();

    public final native short uniffi_user_checksum_method_coreusermanager_remove_test_users();

    public final native short uniffi_user_checksum_method_coreusermanager_remove_user();

    public final native short uniffi_user_checksum_method_coreusermanager_save_current_user_info();

    public final native short uniffi_user_checksum_method_coreusermanager_save_current_user_profile();

    public final native short uniffi_user_checksum_method_coreusermanager_save_user_info();

    public final native short uniffi_user_checksum_method_coreusermanager_save_user_profile();

    public final native short uniffi_user_checksum_method_coreusermanager_set_all_users();

    public final native short uniffi_user_checksum_method_coreusermanager_set_temp_token();

    public final native short uniffi_user_checksum_method_coreusermanager_switch_to_user();

    public final native short uniffi_user_checksum_method_coreusermanager_update_user();

    public final native short uniffi_user_checksum_method_coreusermanager_update_user_login_name();

    public final native short uniffi_user_checksum_method_coreusermanager_update_user_token();

    public final native short uniffi_user_checksum_method_coreusermanager_update_user_token_with_type();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_clear_all_users();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_clear_temp_token();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_get_all_usernames();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_get_all_users();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_get_all_users_by_login_time();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_get_all_users_of_current_site();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_get_authorisation_token();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_get_bound_account();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_get_current_user();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_get_current_user_info();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_get_current_user_profile();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_get_non_current_users_with_token();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_get_rbac_features();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_get_rm_features();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_get_temp_token();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_get_user_by_id();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_get_user_by_login_name();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_get_user_info();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_get_user_profile();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_has_special_mode_deeplink_restriction();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_is_login();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_is_login_main_account();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_is_main_account_approver();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_is_rm_account();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_login_user();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_logout_current_user();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_register_user_info_event_callback();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_reload_data();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_remove_test_users();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_remove_user();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_save_current_user_info();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_save_current_user_profile();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_save_user_info();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_save_user_profile();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_set_all_users();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_set_temp_token();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_switch_to_user();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_update_user();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_update_user_login_name();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_update_user_token();

    public final native short uniffi_user_checksum_method_coreusermanagerhandling_update_user_token_with_type();

    public final native short uniffi_user_checksum_method_userdatasource_clear_all();

    public final native short uniffi_user_checksum_method_userdatasource_get_all_users();

    public final native short uniffi_user_checksum_method_userdatasource_remove_user();

    public final native short uniffi_user_checksum_method_userdatasource_set_all_users();

    public final native short uniffi_user_checksum_method_userdatasource_update_user();

    public final native short uniffi_user_checksum_method_userinfoeventcallback_on_user_info_event();

    private IntegrityCheckingUniffiLib() {
    }

    static {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = new IntegrityCheckingUniffiLib();
        INSTANCE = integrityCheckingUniffiLib;
        String strFindLibraryName = C60173zxj.findLibraryName("user");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        Native.register((Class<?>) IntegrityCheckingUniffiLib.class, C60173zxj.findLibraryName("user"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        BzK.uniffiCheckContractApiVersion(integrityCheckingUniffiLib);
    }
}
