package uniffi.account;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.C60173zxj;
import o.C60230zyn;

/* JADX INFO: loaded from: classes17.dex */
public final class IntegrityCheckingUniffiLib {
    public static final int $stable = 0;
    public static final IntegrityCheckingUniffiLib INSTANCE;

    public final native int ffi_account_uniffi_contract_version();

    public final native short uniffi_account_checksum_constructor_accountconnectjourney_new();

    public final native short uniffi_account_checksum_constructor_accountsinteractor_new();

    public final native short uniffi_account_checksum_constructor_changepasswordjourney_new();

    public final native short uniffi_account_checksum_constructor_confirmnewpasswordinteractor_create();

    public final native short uniffi_account_checksum_constructor_createsubaccountinteractor_new();

    public final native short uniffi_account_checksum_constructor_linkconfirminteractor_new();

    public final native short uniffi_account_checksum_constructor_linklandinginteractor_new();

    public final native short uniffi_account_checksum_constructor_linkresultinteractor_new();

    public final native short uniffi_account_checksum_constructor_logininteractor_new();

    public final native short uniffi_account_checksum_constructor_loginjourney_new();

    public final native short uniffi_account_checksum_constructor_loginpasskeyinteractor_new();

    public final native short uniffi_account_checksum_constructor_mfajourney_new();

    public final native short uniffi_account_checksum_constructor_mfajourney_new_with_options();

    public final native short uniffi_account_checksum_constructor_mfaotpinteractor_new();

    public final native short uniffi_account_checksum_constructor_mfapasskeyinteractor_new();

    public final native short uniffi_account_checksum_constructor_mfapasswordinteractor_new();

    public final native short uniffi_account_checksum_constructor_mfaswitchmethodinteractor_new();

    public final native short uniffi_account_checksum_constructor_newdevicecodeinteractor_new();

    public final native short uniffi_account_checksum_constructor_newdeviceconfirminteractor_new();

    public final native short uniffi_account_checksum_constructor_newdeviceinfointeractor_new();

    public final native short uniffi_account_checksum_constructor_newdevicejourney_new();

    public final native short uniffi_account_checksum_constructor_newdevicemultipleotpinteractor_new();

    public final native short uniffi_account_checksum_constructor_newdevicesingleotpinteractor_new();

    public final native short uniffi_account_checksum_constructor_newdevicewsmanager_shared();

    public final native short uniffi_account_checksum_constructor_okxpasskeycrossdevicemasterauthenticateinteractor_new();

    public final native short uniffi_account_checksum_constructor_okxpasskeycrossdevicemasterauthenticateinteractor_new_with_data();

    public final native short uniffi_account_checksum_constructor_okxpasskeycrossdevicemasterconnectinginteractor_new();

    public final native short uniffi_account_checksum_constructor_okxpasskeycrossdevicemasterjourney_new();

    public final native short uniffi_account_checksum_constructor_okxpasskeycrossdevicemasterjourney_new_with_scan_source();

    public final native short uniffi_account_checksum_constructor_okxpasskeycrossdevicesyncinteractor_new();

    public final native short uniffi_account_checksum_constructor_okxpasskeycrossdevicesyncjourney_new();

    public final native short uniffi_account_checksum_constructor_okxpasskeycrossdeviceverifyinteractor_new();

    public final native short uniffi_account_checksum_constructor_okxpasskeycrossdeviceverifyjourney_new();

    public final native short uniffi_account_checksum_constructor_okxpasskeysyncinteractor_new();

    public final native short uniffi_account_checksum_constructor_okxpasskeytracker_new();

    public final native short uniffi_account_checksum_constructor_okxpasskeyupgradeinteractor_new();

    public final native short uniffi_account_checksum_constructor_otpinteractor_new();

    public final native short uniffi_account_checksum_constructor_passkeylistinteractor_new();

    public final native short uniffi_account_checksum_constructor_passkeyregisterjourney_new();

    public final native short uniffi_account_checksum_constructor_passkeyremovejourney_new();

    public final native short uniffi_account_checksum_constructor_passkeyresetjourney_new();

    public final native short uniffi_account_checksum_constructor_passkeysyncblemanager_new();

    public final native short uniffi_account_checksum_constructor_paypasskeylistinteractor_new();

    public final native short uniffi_account_checksum_constructor_preferencelistinteractor_new();

    public final native short uniffi_account_checksum_constructor_profilelistinteractor_new();

    public final native short uniffi_account_checksum_constructor_registercorinteractor_new();

    public final native short uniffi_account_checksum_constructor_registeremailinputinteractor_new();

    public final native short uniffi_account_checksum_constructor_registerjourney_new();

    public final native short uniffi_account_checksum_constructor_registerotpinteractor_new();

    public final native short uniffi_account_checksum_constructor_registerpasswordinteractor_new();

    public final native short uniffi_account_checksum_constructor_registerphoneinputinteractor_new();

    public final native short uniffi_account_checksum_constructor_securitylistinteractor_new();

    public final native short uniffi_account_checksum_constructor_setpasswordinteractor_create();

    public final native short uniffi_account_checksum_constructor_setpasswordinteractor_create_with_social_channel();

    public final native short uniffi_account_checksum_constructor_trusteddevicejourney_new();

    public final native short uniffi_account_checksum_constructor_trusteddeviceotpinteractor_new();

    public final native short uniffi_account_checksum_constructor_trusteddeviceriskinteractor_new();

    public final native short uniffi_account_checksum_constructor_trusteddevicewsmanager_shared();

    public final native short uniffi_account_checksum_constructor_unlinkinteractor_new();

    public final native short uniffi_account_checksum_constructor_uploadidjourney_new_for_mfa();

    public final native short uniffi_account_checksum_constructor_usercenterinteractor_new();

    public final native short uniffi_account_checksum_func_ble_passkey_data_characteristic_uuid();

    public final native short uniffi_account_checksum_func_ble_passkey_data_confirm_characteristic_uuid();

    public final native short uniffi_account_checksum_func_ble_passkey_default_mtu();

    public final native short uniffi_account_checksum_func_color_theme_from_string();

    public final native short uniffi_account_checksum_func_get_okx_passkey_manager();

    public final native short uniffi_account_checksum_func_register_mfa_service();

    public final native short uniffi_account_checksum_func_register_native_ble_passkey_provider();

    public final native short uniffi_account_checksum_func_register_native_passkey_key_provider();

    public final native short uniffi_account_checksum_func_register_passkey_core_binding();

    public final native short uniffi_account_checksum_func_register_passkey_sdk();

    public final native short uniffi_account_checksum_func_register_passkey_support_checker();

    public final native short uniffi_account_checksum_method_accountconnectjourney_clear_binding_token();

    public final native short uniffi_account_checksum_method_accountconnectjourney_finish();

    public final native short uniffi_account_checksum_method_accountconnectjourney_get_binding_token();

    public final native short uniffi_account_checksum_method_accountconnectjourney_get_current_step();

    public final native short uniffi_account_checksum_method_accountconnectjourney_get_current_user_login_name();

    public final native short uniffi_account_checksum_method_accountconnectjourney_get_source();

    public final native short uniffi_account_checksum_method_accountconnectjourney_get_state();

    public final native short uniffi_account_checksum_method_accountconnectjourney_has_bound_account();

    public final native short uniffi_account_checksum_method_accountconnectjourney_is_link_flow();

    public final native short uniffi_account_checksum_method_accountconnectjourney_navigate_to_force_bound_confirm();

    public final native short uniffi_account_checksum_method_accountconnectjourney_navigate_to_link_confirm();

    public final native short uniffi_account_checksum_method_accountconnectjourney_navigate_to_link_result_failure();

    public final native short uniffi_account_checksum_method_accountconnectjourney_navigate_to_link_result_success();

    public final native short uniffi_account_checksum_method_accountconnectjourney_navigate_to_unlink_confirm_with_account();

    public final native short uniffi_account_checksum_method_accountconnectjourney_navigate_to_unlink_manage();

    public final native short uniffi_account_checksum_method_accountconnectjourney_open_external_link();

    public final native short uniffi_account_checksum_method_accountconnectjourney_refresh_state();

    public final native short uniffi_account_checksum_method_accountconnectjourney_restart_link_flow();

    public final native short uniffi_account_checksum_method_accountconnectjourney_set_binding_token();

    public final native short uniffi_account_checksum_method_accountconnectjourney_set_callback();

    public final native short uniffi_account_checksum_method_accountconnectjourney_set_source();

    public final native short uniffi_account_checksum_method_accountconnectjourney_start();

    public final native short uniffi_account_checksum_method_accountconnectjourney_supports_cross_site_binding();

    public final native short uniffi_account_checksum_method_accountconnectjourneycallback_on_journey_event();

    public final native short uniffi_account_checksum_method_accountsinteractor_init();

    public final native short uniffi_account_checksum_method_accountsinteractor_set_state_callback();

    public final native short uniffi_account_checksum_method_accountsstatecallback_on_changed();

    public final native short uniffi_account_checksum_method_bleconnectioncallback_on_connection_state_changed();

    public final native short uniffi_account_checksum_method_bledatacallback_on_confirmation_received();

    public final native short uniffi_account_checksum_method_bledatacallback_on_data_received();

    public final native short uniffi_account_checksum_method_bledevicediscoverycallback_on_device_found();

    public final native short uniffi_account_checksum_method_changepasswordjourney_get_session_id();

    public final native short uniffi_account_checksum_method_changepasswordjourney_get_state();

    public final native short uniffi_account_checksum_method_changepasswordjourney_on_confirmation_confirmed();

    public final native short uniffi_account_checksum_method_changepasswordjourney_on_mfa_completed();

    public final native short uniffi_account_checksum_method_changepasswordjourney_set_event_callback();

    public final native short uniffi_account_checksum_method_changepasswordjourney_set_step_callback();

    public final native short uniffi_account_checksum_method_changepasswordjourney_start_journey();

    public final native short uniffi_account_checksum_method_changepasswordjourney_update_session_id();

    public final native short uniffi_account_checksum_method_changepasswordjourneyeventcallback_on_event();

    public final native short uniffi_account_checksum_method_changepasswordjourneystepcallback_on_changed();

    public final native short uniffi_account_checksum_method_confirmnewpasswordinteractor_set_state_observer();

    public final native short uniffi_account_checksum_method_confirmnewpasswordinteractor_start();

    public final native short uniffi_account_checksum_method_confirmnewpasswordinteractor_state();

    public final native short uniffi_account_checksum_method_confirmnewpasswordinteractor_stop();

    public final native short uniffi_account_checksum_method_confirmnewpasswordinteractor_submit_new_password();

    public final native short uniffi_account_checksum_method_createsubaccountinteractor_check_name_existence();

    public final native short uniffi_account_checksum_method_createsubaccountinteractor_create_sub_account();

    public final native short uniffi_account_checksum_method_createsubaccountinteractor_get_business();

    public final native short uniffi_account_checksum_method_createsubaccountinteractor_get_session_id();

    public final native short uniffi_account_checksum_method_createsubaccountinteractor_get_state();

    public final native short uniffi_account_checksum_method_createsubaccountinteractor_initiate();

    public final native short uniffi_account_checksum_method_createsubaccountinteractor_set_event_callback();

    public final native short uniffi_account_checksum_method_createsubaccountinteractor_set_session_id();

    public final native short uniffi_account_checksum_method_createsubaccountinteractor_set_state_callback();

    public final native short uniffi_account_checksum_method_createsubaccountinteractor_update_account_type();

    public final native short uniffi_account_checksum_method_createsubaccountinteractor_update_enable_deposits();

    public final native short uniffi_account_checksum_method_createsubaccountinteractor_update_sub_account_name();

    public final native short uniffi_account_checksum_method_initsessioncallback_on_error();

    public final native short uniffi_account_checksum_method_initsessioncallback_on_success();

    public final native short uniffi_account_checksum_method_linkconfirmeventcallback_on_event();

    public final native short uniffi_account_checksum_method_linkconfirminteractor_cancel_link_confirm();

    public final native short uniffi_account_checksum_method_linkconfirminteractor_confirm_link();

    public final native short uniffi_account_checksum_method_linkconfirminteractor_get_binding_info();

    public final native short uniffi_account_checksum_method_linkconfirminteractor_get_binding_token();

    public final native short uniffi_account_checksum_method_linkconfirminteractor_get_journey();

    public final native short uniffi_account_checksum_method_linkconfirminteractor_set_event_callback();

    public final native short uniffi_account_checksum_method_linkconfirminteractor_set_journey();

    public final native short uniffi_account_checksum_method_linklandingeventcallback_on_event();

    public final native short uniffi_account_checksum_method_linklandinginteractor_get_journey();

    public final native short uniffi_account_checksum_method_linklandinginteractor_get_universal_link();

    public final native short uniffi_account_checksum_method_linklandinginteractor_initiate_binding();

    public final native short uniffi_account_checksum_method_linklandinginteractor_open_link_confirm_in_target_app();

    public final native short uniffi_account_checksum_method_linklandinginteractor_set_event_callback();

    public final native short uniffi_account_checksum_method_linklandinginteractor_set_journey();

    public final native short uniffi_account_checksum_method_linkresulteventcallback_on_event();

    public final native short uniffi_account_checksum_method_linkresultinteractor_complete_binding();

    public final native short uniffi_account_checksum_method_linkresultinteractor_get_journey();

    public final native short uniffi_account_checksum_method_linkresultinteractor_get_okx_account_name();

    public final native short uniffi_account_checksum_method_linkresultinteractor_get_okx_tr_account_name();

    public final native short uniffi_account_checksum_method_linkresultinteractor_set_event_callback();

    public final native short uniffi_account_checksum_method_linkresultinteractor_set_journey();

    public final native short uniffi_account_checksum_method_logineventcallback_on_event();

    public final native short uniffi_account_checksum_method_logininteractor_check_username();

    public final native short uniffi_account_checksum_method_logininteractor_finish_login_with_passkey();

    public final native short uniffi_account_checksum_method_logininteractor_init();

    public final native short uniffi_account_checksum_method_logininteractor_reset_password();

    public final native short uniffi_account_checksum_method_logininteractor_set_event_callback();

    public final native short uniffi_account_checksum_method_logininteractor_set_state_callback();

    public final native short uniffi_account_checksum_method_logininteractor_start_login_with_passkey();

    public final native short uniffi_account_checksum_method_logininteractor_submit();

    public final native short uniffi_account_checksum_method_logininteractor_update_current_username();

    public final native short uniffi_account_checksum_method_logininteractor_update_password();

    public final native short uniffi_account_checksum_method_logininteractor_update_restriction();

    public final native short uniffi_account_checksum_method_loginjourney_set_event_callback();

    public final native short uniffi_account_checksum_method_loginjourney_set_step_callback();

    public final native short uniffi_account_checksum_method_loginjourney_start_journey();

    public final native short uniffi_account_checksum_method_loginjourneyeventcallback_on_event();

    public final native short uniffi_account_checksum_method_loginjourneystepcallback_on_changed();

    public final native short uniffi_account_checksum_method_loginpasskeyeventcallback_on_event();

    public final native short uniffi_account_checksum_method_loginpasskeyinteractor_finish_login_with_passkey();

    public final native short uniffi_account_checksum_method_loginpasskeyinteractor_set_event_callback();

    public final native short uniffi_account_checksum_method_loginpasskeyinteractor_start_login_with_passkey();

    public final native short uniffi_account_checksum_method_loginstate_email_suggestions();

    public final native short uniffi_account_checksum_method_loginstate_is_forget_password_button_visible();

    public final native short uniffi_account_checksum_method_loginstate_is_login_button_enabled();

    public final native short uniffi_account_checksum_method_loginstate_is_next_button_enabled();

    public final native short uniffi_account_checksum_method_loginstate_is_password_input_visible();

    public final native short uniffi_account_checksum_method_loginstate_is_social_apple_available();

    public final native short uniffi_account_checksum_method_loginstate_is_social_google_available();

    public final native short uniffi_account_checksum_method_loginstate_is_social_telegram_available();

    public final native short uniffi_account_checksum_method_loginstate_is_username_valid();

    public final native short uniffi_account_checksum_method_loginstate_saved_usernames();

    public final native short uniffi_account_checksum_method_loginstatecallback_on_changed();

    public final native short uniffi_account_checksum_method_messagecallback_on_received();

    public final native short uniffi_account_checksum_method_mfajourney_cancel();

    public final native short uniffi_account_checksum_method_mfajourney_get_session_id();

    public final native short uniffi_account_checksum_method_mfajourney_get_state();

    public final native short uniffi_account_checksum_method_mfajourney_handle_face_maxout_support();

    public final native short uniffi_account_checksum_method_mfajourney_is_complete();

    public final native short uniffi_account_checksum_method_mfajourney_requires_sub_journey();

    public final native short uniffi_account_checksum_method_mfajourney_set_event_callback();

    public final native short uniffi_account_checksum_method_mfajourney_set_passkey_enabled();

    public final native short uniffi_account_checksum_method_mfajourney_set_state_callback();

    public final native short uniffi_account_checksum_method_mfajourney_set_total_countdown_time();

    public final native short uniffi_account_checksum_method_mfajourney_start_mfa();

    public final native short uniffi_account_checksum_method_mfajourney_start_timer();

    public final native short uniffi_account_checksum_method_mfajourney_switch_step();

    public final native short uniffi_account_checksum_method_mfajourney_switch_to_step();

    public final native short uniffi_account_checksum_method_mfajourney_tick_timer();

    public final native short uniffi_account_checksum_method_mfajourney_update_from_sub_journey();

    public final native short uniffi_account_checksum_method_mfajourneyeventcallback_on_event();

    public final native short uniffi_account_checksum_method_mfajourneystatecallback_on_changed();

    public final native short uniffi_account_checksum_method_mfaotpeventcallback_on_event();

    public final native short uniffi_account_checksum_method_mfaotpinteractor_get_state();

    public final native short uniffi_account_checksum_method_mfaotpinteractor_send_code();

    public final native short uniffi_account_checksum_method_mfaotpinteractor_set_auth_type();

    public final native short uniffi_account_checksum_method_mfaotpinteractor_set_event_callback();

    public final native short uniffi_account_checksum_method_mfaotpinteractor_set_remaining_time();

    public final native short uniffi_account_checksum_method_mfaotpinteractor_set_state_callback();

    public final native short uniffi_account_checksum_method_mfaotpinteractor_verify_otp();

    public final native short uniffi_account_checksum_method_mfaotpstatecallback_on_changed();

    public final native short uniffi_account_checksum_method_mfapasskeyeventcallback_on_event();

    public final native short uniffi_account_checksum_method_mfapasskeyinteractor_finish_passkey();

    public final native short uniffi_account_checksum_method_mfapasskeyinteractor_finish_passkey_cross_device();

    public final native short uniffi_account_checksum_method_mfapasskeyinteractor_get_state();

    public final native short uniffi_account_checksum_method_mfapasskeyinteractor_set_event_callback();

    public final native short uniffi_account_checksum_method_mfapasskeyinteractor_set_state_callback();

    public final native short uniffi_account_checksum_method_mfapasskeyinteractor_start_passkey();

    public final native short uniffi_account_checksum_method_mfapasskeystatecallback_on_changed();

    public final native short uniffi_account_checksum_method_mfapasswordeventcallback_on_event();

    public final native short uniffi_account_checksum_method_mfapasswordinteractor_get_state();

    public final native short uniffi_account_checksum_method_mfapasswordinteractor_register_event_callback();

    public final native short uniffi_account_checksum_method_mfapasswordinteractor_register_state_callback();

    public final native short uniffi_account_checksum_method_mfapasswordinteractor_verify_password();

    public final native short uniffi_account_checksum_method_mfapasswordstatecallback_on_changed();

    public final native short uniffi_account_checksum_method_mfaservicetrait_verify_mfa();

    public final native short uniffi_account_checksum_method_mfaswitchmethodeventcallback_on_event();

    public final native short uniffi_account_checksum_method_mfaswitchmethodinteractor_get_state();

    public final native short uniffi_account_checksum_method_mfaswitchmethodinteractor_refresh_available_methods();

    public final native short uniffi_account_checksum_method_mfaswitchmethodinteractor_set_event_callback();

    public final native short uniffi_account_checksum_method_mfaswitchmethodinteractor_set_state_callback();

    public final native short uniffi_account_checksum_method_mfaswitchmethodinteractor_switch_to_method();

    public final native short uniffi_account_checksum_method_mfaswitchmethodstatecallback_on_changed();

    public final native short uniffi_account_checksum_method_nativeblepasskeyprovider_cleanup();

    public final native short uniffi_account_checksum_method_nativeblepasskeyprovider_connect_to_device();

    public final native short uniffi_account_checksum_method_nativeblepasskeyprovider_disconnect();

    public final native short uniffi_account_checksum_method_nativeblepasskeyprovider_get_current_mtu();

    public final native short uniffi_account_checksum_method_nativeblepasskeyprovider_get_service_uuid();

    public final native short uniffi_account_checksum_method_nativeblepasskeyprovider_is_advertising();

    public final native short uniffi_account_checksum_method_nativeblepasskeyprovider_is_bluetooth_enabled();

    public final native short uniffi_account_checksum_method_nativeblepasskeyprovider_is_connected();

    public final native short uniffi_account_checksum_method_nativeblepasskeyprovider_is_peripheral_supported();

    public final native short uniffi_account_checksum_method_nativeblepasskeyprovider_is_scanning();

    public final native short uniffi_account_checksum_method_nativeblepasskeyprovider_send_confirmation();

    public final native short uniffi_account_checksum_method_nativeblepasskeyprovider_send_data();

    public final native short uniffi_account_checksum_method_nativeblepasskeyprovider_set_connection_callback();

    public final native short uniffi_account_checksum_method_nativeblepasskeyprovider_set_data_callback();

    public final native short uniffi_account_checksum_method_nativeblepasskeyprovider_set_device_discovery_callback();

    public final native short uniffi_account_checksum_method_nativeblepasskeyprovider_set_service_uuid();

    public final native short uniffi_account_checksum_method_nativeblepasskeyprovider_start_advertising();

    public final native short uniffi_account_checksum_method_nativeblepasskeyprovider_start_scanning();

    public final native short uniffi_account_checksum_method_nativeblepasskeyprovider_stop_advertising();

    public final native short uniffi_account_checksum_method_nativeblepasskeyprovider_stop_scanning();

    public final native short uniffi_account_checksum_method_nativepasskeykeyprovider_check_device_passcode();

    public final native short uniffi_account_checksum_method_nativepasskeykeyprovider_decrypt_with_protection_key();

    public final native short uniffi_account_checksum_method_nativepasskeykeyprovider_get_protection_public_key();

    public final native short uniffi_account_checksum_method_nativepasskeykeyprovider_has_encrypted_passkey();

    public final native short uniffi_account_checksum_method_nativepasskeykeyprovider_is_protection_key_available();

    public final native short uniffi_account_checksum_method_nativepasskeykeyprovider_load_encrypted_passkey();

    public final native short uniffi_account_checksum_method_nativepasskeykeyprovider_load_encrypted_passkey_by_credential_id();

    public final native short uniffi_account_checksum_method_nativepasskeykeyprovider_remove_encrypted_passkey();

    public final native short uniffi_account_checksum_method_nativepasskeykeyprovider_remove_protection_key();

    public final native short uniffi_account_checksum_method_nativepasskeykeyprovider_show_device_passcode_for_lockout();

    public final native short uniffi_account_checksum_method_nativepasskeykeyprovider_store_encrypted_passkey();

    public final native short uniffi_account_checksum_method_nativepasskeykeyprovider_verify_user_presence();

    public final native short uniffi_account_checksum_method_newdevicecodeeventcallback_on_event();

    public final native short uniffi_account_checksum_method_newdevicecodeinteractor_done();

    public final native short uniffi_account_checksum_method_newdevicecodeinteractor_init();

    public final native short uniffi_account_checksum_method_newdevicecodeinteractor_resend();

    public final native short uniffi_account_checksum_method_newdevicecodeinteractor_set_event_callback();

    public final native short uniffi_account_checksum_method_newdevicecodeinteractor_set_state_callback();

    public final native short uniffi_account_checksum_method_newdevicecodestatecallback_on_changed();

    public final native short uniffi_account_checksum_method_newdeviceconfirmeventcallback_on_event();

    public final native short uniffi_account_checksum_method_newdeviceconfirminteractor_confirm();

    public final native short uniffi_account_checksum_method_newdeviceconfirminteractor_init();

    public final native short uniffi_account_checksum_method_newdeviceconfirminteractor_set_event_callback();

    public final native short uniffi_account_checksum_method_newdeviceconfirminteractor_set_state_callback();

    public final native short uniffi_account_checksum_method_newdeviceconfirminteractor_switch_to_other_method();

    public final native short uniffi_account_checksum_method_newdeviceconfirmstatecallback_on_changed();

    public final native short uniffi_account_checksum_method_newdeviceinfoeventcallback_on_event();

    public final native short uniffi_account_checksum_method_newdeviceinfointeractor_approve();

    public final native short uniffi_account_checksum_method_newdeviceinfointeractor_back();

    public final native short uniffi_account_checksum_method_newdeviceinfointeractor_dismiss();

    public final native short uniffi_account_checksum_method_newdeviceinfointeractor_init();

    public final native short uniffi_account_checksum_method_newdeviceinfointeractor_reject();

    public final native short uniffi_account_checksum_method_newdeviceinfointeractor_set_event_callback();

    public final native short uniffi_account_checksum_method_newdeviceinfointeractor_set_state_callback();

    public final native short uniffi_account_checksum_method_newdeviceinfostatecallback_on_changed();

    public final native short uniffi_account_checksum_method_newdevicejourney_set_event_callback();

    public final native short uniffi_account_checksum_method_newdevicejourney_set_step_callback();

    public final native short uniffi_account_checksum_method_newdevicejourney_start_journey();

    public final native short uniffi_account_checksum_method_newdevicejourneyeventcallback_on_event();

    public final native short uniffi_account_checksum_method_newdevicejourneystepcallback_on_changed();

    public final native short uniffi_account_checksum_method_newdevicemultipleotpeventcallback_on_event();

    public final native short uniffi_account_checksum_method_newdevicemultipleotpinteractor_init();

    public final native short uniffi_account_checksum_method_newdevicemultipleotpinteractor_send_email_otp();

    public final native short uniffi_account_checksum_method_newdevicemultipleotpinteractor_send_phone_otp();

    public final native short uniffi_account_checksum_method_newdevicemultipleotpinteractor_set_event_callback();

    public final native short uniffi_account_checksum_method_newdevicemultipleotpinteractor_set_state_callback();

    public final native short uniffi_account_checksum_method_newdevicemultipleotpinteractor_submit();

    public final native short uniffi_account_checksum_method_newdevicemultipleotpstatecallback_on_changed();

    public final native short uniffi_account_checksum_method_newdevicesingleotpeventcallback_on_event();

    public final native short uniffi_account_checksum_method_newdevicesingleotpinteractor_init();

    public final native short uniffi_account_checksum_method_newdevicesingleotpinteractor_resend_otp();

    public final native short uniffi_account_checksum_method_newdevicesingleotpinteractor_set_event_callback();

    public final native short uniffi_account_checksum_method_newdevicesingleotpinteractor_set_state_callback();

    public final native short uniffi_account_checksum_method_newdevicesingleotpinteractor_submit();

    public final native short uniffi_account_checksum_method_newdevicesingleotpinteractor_switch_to_email();

    public final native short uniffi_account_checksum_method_newdevicesingleotpinteractor_switch_to_google_authenticator();

    public final native short uniffi_account_checksum_method_newdevicesingleotpinteractor_switch_to_sms();

    public final native short uniffi_account_checksum_method_newdevicesingleotpinteractor_switch_to_voice();

    public final native short uniffi_account_checksum_method_newdevicesingleotpstatecallback_on_changed();

    public final native short uniffi_account_checksum_method_newdeviceverifycallback_on_received();

    public final native short uniffi_account_checksum_method_newdevicewsmanager_connect();

    public final native short uniffi_account_checksum_method_newdevicewsmanager_disconnect();

    public final native short uniffi_account_checksum_method_newdevicewsmanager_is_connected();

    public final native short uniffi_account_checksum_method_newdevicewsmanager_set_device_verify_callback();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterauthenticateinteractor_approve();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterauthenticateinteractor_get_state();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterauthenticateinteractor_reject();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterauthenticateinteractor_set_state_callback();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterauthenticateinteractor_start_ble_advertising();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterauthenticateinteractor_start_countdown();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterauthenticateinteractor_stop_ble();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterauthenticatestatecallback_on_changed();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterconnectingeventcallback_on_event();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterconnectinginteractor_cancel_timeout();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterconnectinginteractor_get_ble_manager();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterconnectinginteractor_get_credential_info();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterconnectinginteractor_get_device_info();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterconnectinginteractor_get_protection_public_key();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterconnectinginteractor_get_session_id();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterconnectinginteractor_get_state();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterconnectinginteractor_set_event_callback();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterconnectinginteractor_set_state_callback();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterconnectinginteractor_start_ble_flow();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterconnectinginteractor_start_connection();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterconnectinginteractor_start_timeout();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterconnectinginteractor_start_web_flow();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterconnectinginteractor_stop_ble();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterconnectingstatecallback_on_changed();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterjourney_dismiss();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterjourney_get_ble_service_uuid();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterjourney_get_current_step();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterjourney_get_scan_source();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterjourney_is_web_scan();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterjourney_navigate_to_step();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterjourney_set_scan_source();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterjourney_set_step_callback();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterjourney_start_journey();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicemasterstepcallback_on_step_changed();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicesynceventcallback_on_event();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicesyncinteractor_complete_sync_with_device();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicesyncinteractor_get_business();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicesyncinteractor_get_state();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicesyncinteractor_initiate();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicesyncinteractor_set_event_callback();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicesyncinteractor_set_state_callback();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicesyncjourney_dismiss();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicesyncjourney_get_current_step();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicesyncjourney_navigate_to_step();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicesyncjourney_set_step_callback();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicesyncstatecallback_on_changed();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdevicesyncstepcallback_on_step_changed();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdeviceverifyeventcallback_on_event();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdeviceverifyinteractor_get_state();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdeviceverifyinteractor_on_ws_approval_received();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdeviceverifyinteractor_send_protection_key();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdeviceverifyinteractor_send_session_id();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdeviceverifyinteractor_set_event_callback();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdeviceverifyinteractor_set_state_callback();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdeviceverifyinteractor_start_auth_flow();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdeviceverifyinteractor_start_qr_code_flow();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdeviceverifyinteractor_start_sync_flow();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdeviceverifyinteractor_stop_ble();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdeviceverifyjourney_build_qr_code_deeplink();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdeviceverifyjourney_dismiss();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdeviceverifyjourney_get_current_step();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdeviceverifyjourney_navigate_to_step();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdeviceverifyjourney_set_step_callback();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdeviceverifystatecallback_on_changed();

    public final native short uniffi_account_checksum_method_okxpasskeycrossdeviceverifystepcallback_on_step_changed();

    public final native short uniffi_account_checksum_method_okxpasskeymanager_create_credential();

    public final native short uniffi_account_checksum_method_okxpasskeymanager_get_assertion();

    public final native short uniffi_account_checksum_method_okxpasskeymanager_is_device_support_biometric();

    public final native short uniffi_account_checksum_method_okxpasskeymanagerhandling_create_credential();

    public final native short uniffi_account_checksum_method_okxpasskeymanagerhandling_get_assertion();

    public final native short uniffi_account_checksum_method_okxpasskeymanagerhandling_is_device_support_biometric();

    public final native short uniffi_account_checksum_method_okxpasskeysynccallback_on_failure();

    public final native short uniffi_account_checksum_method_okxpasskeysynccallback_on_success();

    public final native short uniffi_account_checksum_method_okxpasskeysyncinteractor_confirm_sync();

    public final native short uniffi_account_checksum_method_okxpasskeytracker_track_bluetooth_connect_bottomsheet_view();

    public final native short uniffi_account_checksum_method_okxpasskeytracker_track_cross_authorization_bottomsheet_click();

    public final native short uniffi_account_checksum_method_okxpasskeytracker_track_cross_authorization_bottomsheet_view();

    public final native short uniffi_account_checksum_method_okxpasskeytracker_track_cross_authorization_success_api_view();

    public final native short uniffi_account_checksum_method_okxpasskeytracker_track_lost_reinstall_remind_bottomsheet_click();

    public final native short uniffi_account_checksum_method_okxpasskeytracker_track_lost_reinstall_remind_bottomsheet_view();

    public final native short uniffi_account_checksum_method_okxpasskeytracker_track_never_exist_remind_bottomsheet_view();

    public final native short uniffi_account_checksum_method_okxpasskeytracker_track_on_device_app_start_api_view();

    public final native short uniffi_account_checksum_method_okxpasskeytracker_track_on_device_app_success_api_view();

    public final native short uniffi_account_checksum_method_okxpasskeytracker_track_promotion_fullpage_click();

    public final native short uniffi_account_checksum_method_okxpasskeytracker_track_promotion_fullpage_view();

    public final native short uniffi_account_checksum_method_okxpasskeytracker_track_promotion_security_center_banner_click();

    public final native short uniffi_account_checksum_method_okxpasskeytracker_track_promotion_security_center_banner_view();

    public final native short uniffi_account_checksum_method_okxpasskeytracker_track_qrcode_bottomsheet_view();

    public final native short uniffi_account_checksum_method_okxpasskeytracker_track_step_one_fullpage_click();

    public final native short uniffi_account_checksum_method_okxpasskeytracker_track_step_one_fullpage_view();

    public final native short uniffi_account_checksum_method_okxpasskeytracker_track_upgrade_fido1_success_api_view();

    public final native short uniffi_account_checksum_method_okxpasskeytracker_track_upgrade_multiple_fido1_bottomsheet_view();

    public final native short uniffi_account_checksum_method_okxpasskeytracker_track_wait_approve_app_success_api_view();

    public final native short uniffi_account_checksum_method_okxpasskeytracker_track_wait_approve_bottomsheet_click();

    public final native short uniffi_account_checksum_method_okxpasskeytracker_track_wait_approve_bottomsheet_view();

    public final native short uniffi_account_checksum_method_okxpasskeyupgradecallback_on_failure();

    public final native short uniffi_account_checksum_method_okxpasskeyupgradecallback_on_success();

    public final native short uniffi_account_checksum_method_okxpasskeyupgradeinteractor_finish_upgrade();

    public final native short uniffi_account_checksum_method_otpeventcallback_on_event();

    public final native short uniffi_account_checksum_method_otpinteractor_init();

    public final native short uniffi_account_checksum_method_otpinteractor_resend_otp();

    public final native short uniffi_account_checksum_method_otpinteractor_set_event_callback();

    public final native short uniffi_account_checksum_method_otpinteractor_set_state_callback();

    public final native short uniffi_account_checksum_method_otpinteractor_submit();

    public final native short uniffi_account_checksum_method_otpinteractor_switch_to_email();

    public final native short uniffi_account_checksum_method_otpinteractor_switch_to_google_authenticator();

    public final native short uniffi_account_checksum_method_otpinteractor_switch_to_sms();

    public final native short uniffi_account_checksum_method_otpinteractor_switch_to_voice();

    public final native short uniffi_account_checksum_method_otpstate_is_resend_button_visible();

    public final native short uniffi_account_checksum_method_otpstate_masked_username();

    public final native short uniffi_account_checksum_method_otpstatecallback_on_changed();

    public final native short uniffi_account_checksum_method_passkeycorebinding_is_passkey_entry_enable_in_security_center();

    public final native short uniffi_account_checksum_method_passkeyeventcallback_on_event();

    public final native short uniffi_account_checksum_method_passkeylisteventcallback_on_event();

    public final native short uniffi_account_checksum_method_passkeylistinteractor_can_unlink();

    public final native short uniffi_account_checksum_method_passkeylistinteractor_check_should_show_reset();

    public final native short uniffi_account_checksum_method_passkeylistinteractor_get_count();

    public final native short uniffi_account_checksum_method_passkeylistinteractor_get_item();

    public final native short uniffi_account_checksum_method_passkeylistinteractor_get_state();

    public final native short uniffi_account_checksum_method_passkeylistinteractor_on_add_click();

    public final native short uniffi_account_checksum_method_passkeylistinteractor_on_item_click();

    public final native short uniffi_account_checksum_method_passkeylistinteractor_refresh_data();

    public final native short uniffi_account_checksum_method_passkeylistinteractor_refresh_list();

    public final native short uniffi_account_checksum_method_passkeylistinteractor_rename_passkey();

    public final native short uniffi_account_checksum_method_passkeylistinteractor_set_event_callback();

    public final native short uniffi_account_checksum_method_passkeylistinteractor_set_state_callback();

    public final native short uniffi_account_checksum_method_passkeylistinteractor_should_show_reset();

    public final native short uniffi_account_checksum_method_passkeylistinteractor_toggle_mfa_initiate();

    public final native short uniffi_account_checksum_method_passkeylistinteractor_toggle_switch();

    public final native short uniffi_account_checksum_method_passkeyliststatecallback_on_changed();

    public final native short uniffi_account_checksum_method_passkeyregisterjourney_continue_with_step();

    public final native short uniffi_account_checksum_method_passkeyregisterjourney_get_scenario();

    public final native short uniffi_account_checksum_method_passkeyregisterjourney_get_state();

    public final native short uniffi_account_checksum_method_passkeyregisterjourney_on_mfa_completed();

    public final native short uniffi_account_checksum_method_passkeyregisterjourney_on_sdk_cancelled();

    public final native short uniffi_account_checksum_method_passkeyregisterjourney_on_sdk_register_completed();

    public final native short uniffi_account_checksum_method_passkeyregisterjourney_set_event_callback();

    public final native short uniffi_account_checksum_method_passkeyregisterjourney_set_mfa_session_id();

    public final native short uniffi_account_checksum_method_passkeyregisterjourney_set_state_callback();

    public final native short uniffi_account_checksum_method_passkeyregisterjourney_start_journey();

    public final native short uniffi_account_checksum_method_passkeyregisterjourney_start_registration();

    public final native short uniffi_account_checksum_method_passkeyregisterjourney_start_registration_with_token();

    public final native short uniffi_account_checksum_method_passkeyremovejourney_get_scenario();

    public final native short uniffi_account_checksum_method_passkeyremovejourney_get_state();

    public final native short uniffi_account_checksum_method_passkeyremovejourney_on_mfa_completed();

    public final native short uniffi_account_checksum_method_passkeyremovejourney_set_event_callback();

    public final native short uniffi_account_checksum_method_passkeyremovejourney_set_mfa_session_id();

    public final native short uniffi_account_checksum_method_passkeyremovejourney_set_state_callback();

    public final native short uniffi_account_checksum_method_passkeyremovejourney_start_journey();

    public final native short uniffi_account_checksum_method_passkeyresetjourney_continue_with_step();

    public final native short uniffi_account_checksum_method_passkeyresetjourney_get_operation_type();

    public final native short uniffi_account_checksum_method_passkeyresetjourney_get_scenario();

    public final native short uniffi_account_checksum_method_passkeyresetjourney_get_state();

    public final native short uniffi_account_checksum_method_passkeyresetjourney_on_mfa_completed();

    public final native short uniffi_account_checksum_method_passkeyresetjourney_on_sdk_cancelled();

    public final native short uniffi_account_checksum_method_passkeyresetjourney_on_sdk_rebind_completed();

    public final native short uniffi_account_checksum_method_passkeyresetjourney_on_upload_id_completed();

    public final native short uniffi_account_checksum_method_passkeyresetjourney_set_event_callback();

    public final native short uniffi_account_checksum_method_passkeyresetjourney_set_mfa_session_id();

    public final native short uniffi_account_checksum_method_passkeyresetjourney_set_state_callback();

    public final native short uniffi_account_checksum_method_passkeyresetjourney_start_journey();

    public final native short uniffi_account_checksum_method_passkeyresetjourney_start_rebind();

    public final native short uniffi_account_checksum_method_passkeysdktrait_assert_passkey();

    public final native short uniffi_account_checksum_method_passkeysdktrait_assert_using_in_house_passkey();

    public final native short uniffi_account_checksum_method_passkeysdktrait_register_passkey();

    public final native short uniffi_account_checksum_method_passkeystatecallback_on_changed();

    public final native short uniffi_account_checksum_method_passkeysupportcheckertrait_is_fido1_passkey_supported();

    public final native short uniffi_account_checksum_method_passkeysupportcheckertrait_is_fido2_passkey_supported();

    public final native short uniffi_account_checksum_method_passkeysupportcheckertrait_is_passkey_supported();

    public final native short uniffi_account_checksum_method_passkeysyncblemanager_is_connected();

    public final native short uniffi_account_checksum_method_passkeysyncblemanager_send_credential_info();

    public final native short uniffi_account_checksum_method_passkeysyncblemanager_send_error();

    public final native short uniffi_account_checksum_method_passkeysyncblemanager_send_protection_key();

    public final native short uniffi_account_checksum_method_passkeysyncblemanager_send_session_id();

    public final native short uniffi_account_checksum_method_passkeysyncblemanager_set_callback();

    public final native short uniffi_account_checksum_method_passkeysyncblemanager_start_central_flow();

    public final native short uniffi_account_checksum_method_passkeysyncblemanager_start_peripheral_flow();

    public final native short uniffi_account_checksum_method_passkeysyncblemanager_stop();

    public final native short uniffi_account_checksum_method_passkeysynccallback_on_connection_state_changed();

    public final native short uniffi_account_checksum_method_passkeysynccallback_on_credential_info_received();

    public final native short uniffi_account_checksum_method_passkeysynccallback_on_error();

    public final native short uniffi_account_checksum_method_passkeysynccallback_on_error_received();

    public final native short uniffi_account_checksum_method_passkeysynccallback_on_protection_key_received();

    public final native short uniffi_account_checksum_method_passkeysynccallback_on_session_id_received();

    public final native short uniffi_account_checksum_method_passkeyverifycallback_on_received();

    public final native short uniffi_account_checksum_method_paypasskeylisteventcallback_on_event();

    public final native short uniffi_account_checksum_method_paypasskeylistinteractor_can_unlink();

    public final native short uniffi_account_checksum_method_paypasskeylistinteractor_delete_passkey();

    public final native short uniffi_account_checksum_method_paypasskeylistinteractor_get_count();

    public final native short uniffi_account_checksum_method_paypasskeylistinteractor_get_item();

    public final native short uniffi_account_checksum_method_paypasskeylistinteractor_get_state();

    public final native short uniffi_account_checksum_method_paypasskeylistinteractor_on_item_click();

    public final native short uniffi_account_checksum_method_paypasskeylistinteractor_prepare_delete();

    public final native short uniffi_account_checksum_method_paypasskeylistinteractor_refresh_list();

    public final native short uniffi_account_checksum_method_paypasskeylistinteractor_rename_passkey();

    public final native short uniffi_account_checksum_method_paypasskeylistinteractor_set_event_callback();

    public final native short uniffi_account_checksum_method_paypasskeylistinteractor_set_state_callback();

    public final native short uniffi_account_checksum_method_paypasskeyliststatecallback_on_changed();

    public final native short uniffi_account_checksum_method_preferencelistinteractor_refresh_list();

    public final native short uniffi_account_checksum_method_profilelisteventcallback_on_event();

    public final native short uniffi_account_checksum_method_profilelistinteractor_fetch_data();

    public final native short uniffi_account_checksum_method_profilelistinteractor_get_default_profile_list();

    public final native short uniffi_account_checksum_method_profilelistinteractor_on_item_click();

    public final native short uniffi_account_checksum_method_profilelistinteractor_set_event_callback();

    public final native short uniffi_account_checksum_method_profilelistinteractor_set_state_callback();

    public final native short uniffi_account_checksum_method_profileliststatechangecallback_on_changed();

    public final native short uniffi_account_checksum_method_registercoreventcallback_on_event();

    public final native short uniffi_account_checksum_method_registercorinteractor_fetch_rewards();

    public final native short uniffi_account_checksum_method_registercorinteractor_get_cor_state();

    public final native short uniffi_account_checksum_method_registercorinteractor_select_country();

    public final native short uniffi_account_checksum_method_registercorinteractor_select_province();

    public final native short uniffi_account_checksum_method_registercorinteractor_set_cor_event_callback();

    public final native short uniffi_account_checksum_method_registercorinteractor_set_cor_state_callback();

    public final native short uniffi_account_checksum_method_registercorinteractor_set_forbid_register();

    public final native short uniffi_account_checksum_method_registercorinteractor_submit_cor();

    public final native short uniffi_account_checksum_method_registercorinteractor_update_checkbox();

    public final native short uniffi_account_checksum_method_registercorstatechangecallback_on_changed();

    public final native short uniffi_account_checksum_method_registeremailinputeventcallback_on_event();

    public final native short uniffi_account_checksum_method_registeremailinputinteractor_get_current_state();

    public final native short uniffi_account_checksum_method_registeremailinputinteractor_get_pre_condition();

    public final native short uniffi_account_checksum_method_registeremailinputinteractor_get_register_token();

    public final native short uniffi_account_checksum_method_registeremailinputinteractor_set_email_event_callback();

    public final native short uniffi_account_checksum_method_registeremailinputinteractor_set_email_state_callback();

    public final native short uniffi_account_checksum_method_registeremailinputinteractor_submit_email();

    public final native short uniffi_account_checksum_method_registeremailinputinteractor_update_email();

    public final native short uniffi_account_checksum_method_registeremailinputstatechangecallback_on_changed();

    public final native short uniffi_account_checksum_method_registerjourney_get_current_step();

    public final native short uniffi_account_checksum_method_registerjourney_get_subdomain_strategy();

    public final native short uniffi_account_checksum_method_registerjourney_set_step_change_callback();

    public final native short uniffi_account_checksum_method_registerjourney_set_subdomain_strategy();

    public final native short uniffi_account_checksum_method_registerjourney_start_journey();

    public final native short uniffi_account_checksum_method_registerotpeventcallback_on_event();

    public final native short uniffi_account_checksum_method_registerotpinteractor_get_register_account();

    public final native short uniffi_account_checksum_method_registerotpinteractor_get_send_code_type();

    public final native short uniffi_account_checksum_method_registerotpinteractor_get_show_risk_banner();

    public final native short uniffi_account_checksum_method_registerotpinteractor_send_code();

    public final native short uniffi_account_checksum_method_registerotpinteractor_set_otp_event_callback();

    public final native short uniffi_account_checksum_method_registerotpinteractor_set_otp_state_callback();

    public final native short uniffi_account_checksum_method_registerotpinteractor_set_remaining_time();

    public final native short uniffi_account_checksum_method_registerotpinteractor_set_send_code_type();

    public final native short uniffi_account_checksum_method_registerotpinteractor_verify_code();

    public final native short uniffi_account_checksum_method_registerotpstatechangecallback_on_changed();

    public final native short uniffi_account_checksum_method_registerpasswordeventcallback_on_event();

    public final native short uniffi_account_checksum_method_registerpasswordinteractor_get_login_name();

    public final native short uniffi_account_checksum_method_registerpasswordinteractor_get_password_state();

    public final native short uniffi_account_checksum_method_registerpasswordinteractor_get_register_token();

    public final native short uniffi_account_checksum_method_registerpasswordinteractor_set_password_event_callback();

    public final native short uniffi_account_checksum_method_registerpasswordinteractor_set_password_state_callback();

    public final native short uniffi_account_checksum_method_registerpasswordinteractor_submit_password();

    public final native short uniffi_account_checksum_method_registerpasswordinteractor_update_password();

    public final native short uniffi_account_checksum_method_registerpasswordstatechangecallback_on_changed();

    public final native short uniffi_account_checksum_method_registerphoneinputeventcallback_on_event();

    public final native short uniffi_account_checksum_method_registerphoneinputinteractor_check_and_submit_phone();

    public final native short uniffi_account_checksum_method_registerphoneinputinteractor_get_phone_state();

    public final native short uniffi_account_checksum_method_registerphoneinputinteractor_get_register_token();

    public final native short uniffi_account_checksum_method_registerphoneinputinteractor_set_phone_event_callback();

    public final native short uniffi_account_checksum_method_registerphoneinputinteractor_set_phone_state_callback();

    public final native short uniffi_account_checksum_method_registerphoneinputinteractor_update_phone();

    public final native short uniffi_account_checksum_method_registerphoneinputstatechangecallback_on_changed();

    public final native short uniffi_account_checksum_method_registerstepchangecallback_on_step_changed();

    public final native short uniffi_account_checksum_method_securitylistinteractor_emit_state();

    public final native short uniffi_account_checksum_method_securitylistinteractor_get_on_click_navigation();

    public final native short uniffi_account_checksum_method_securitylistinteractor_get_security_list_state();

    public final native short uniffi_account_checksum_method_securitylistinteractor_refresh_state();

    public final native short uniffi_account_checksum_method_securitylistinteractor_set_state_callback();

    public final native short uniffi_account_checksum_method_securityliststatechangecallback_on_changed();

    public final native short uniffi_account_checksum_method_setpasswordinteractor_get_code_requirement();

    public final native short uniffi_account_checksum_method_setpasswordinteractor_set_state_observer();

    public final native short uniffi_account_checksum_method_setpasswordinteractor_start();

    public final native short uniffi_account_checksum_method_setpasswordinteractor_state();

    public final native short uniffi_account_checksum_method_setpasswordinteractor_stop();

    public final native short uniffi_account_checksum_method_setpasswordinteractor_submit_login_password();

    public final native short uniffi_account_checksum_method_subaccounteventcallback_on_event();

    public final native short uniffi_account_checksum_method_subaccountstatechangecallback_on_changed();

    public final native short uniffi_account_checksum_method_trusteddevicejourney_set_step_callback();

    public final native short uniffi_account_checksum_method_trusteddevicejourney_start_journey();

    public final native short uniffi_account_checksum_method_trusteddevicejourneystepcallback_on_changed();

    public final native short uniffi_account_checksum_method_trusteddeviceotpeventcallback_on_event();

    public final native short uniffi_account_checksum_method_trusteddeviceotpinteractor_set_event_callback();

    public final native short uniffi_account_checksum_method_trusteddeviceotpinteractor_verify();

    public final native short uniffi_account_checksum_method_trusteddeviceriskinteractor_change_password();

    public final native short uniffi_account_checksum_method_trusteddeviceriskinteractor_later();

    public final native short uniffi_account_checksum_method_trusteddeviceverifycallback_on_received();

    public final native short uniffi_account_checksum_method_trusteddevicewsmanager_connect();

    public final native short uniffi_account_checksum_method_trusteddevicewsmanager_disconnect();

    public final native short uniffi_account_checksum_method_trusteddevicewsmanager_is_connected();

    public final native short uniffi_account_checksum_method_trusteddevicewsmanager_set_device_verify_callback();

    public final native short uniffi_account_checksum_method_trusteddevicewsmanager_set_message_callback();

    public final native short uniffi_account_checksum_method_trusteddevicewsmanager_set_passkey_verify_callback();

    public final native short uniffi_account_checksum_method_unlinkeventcallback_on_event();

    public final native short uniffi_account_checksum_method_unlinkinteractor_get_journey();

    public final native short uniffi_account_checksum_method_unlinkinteractor_navigate_to_unlink_confirm();

    public final native short uniffi_account_checksum_method_unlinkinteractor_set_event_callback();

    public final native short uniffi_account_checksum_method_unlinkinteractor_set_journey();

    public final native short uniffi_account_checksum_method_unlinkinteractor_unbind();

    public final native short uniffi_account_checksum_method_uploadideventcallback_on_event();

    public final native short uniffi_account_checksum_method_uploadidjourney_add_file_id();

    public final native short uniffi_account_checksum_method_uploadidjourney_clear_file_ids();

    public final native short uniffi_account_checksum_method_uploadidjourney_get_file_ids();

    public final native short uniffi_account_checksum_method_uploadidjourney_get_reminder_content();

    public final native short uniffi_account_checksum_method_uploadidjourney_get_state();

    public final native short uniffi_account_checksum_method_uploadidjourney_set_event_callback();

    public final native short uniffi_account_checksum_method_uploadidjourney_set_file_ids();

    public final native short uniffi_account_checksum_method_uploadidjourney_set_state_callback();

    public final native short uniffi_account_checksum_method_uploadidjourney_submit_files();

    public final native short uniffi_account_checksum_method_uploadidstatecallback_on_changed();

    public final native short uniffi_account_checksum_method_usercentereventcallback_on_event();

    public final native short uniffi_account_checksum_method_usercenterinteractor_ack_avatar_reject();

    public final native short uniffi_account_checksum_method_usercenterinteractor_emit_event();

    public final native short uniffi_account_checksum_method_usercenterinteractor_emit_state();

    public final native short uniffi_account_checksum_method_usercenterinteractor_get_cached_state();

    public final native short uniffi_account_checksum_method_usercenterinteractor_load_avatar_info();

    public final native short uniffi_account_checksum_method_usercenterinteractor_set_event_callback();

    public final native short uniffi_account_checksum_method_usercenterinteractor_set_state_callback();

    public final native short uniffi_account_checksum_method_usercenterstatechangecallback_on_changed();

    private IntegrityCheckingUniffiLib() {
    }

    static {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = new IntegrityCheckingUniffiLib();
        INSTANCE = integrityCheckingUniffiLib;
        String strFindLibraryName = C60173zxj.findLibraryName(MTAnalysisConstants.Account.KEY_ACCOUNT);
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        Native.register((Class<?>) IntegrityCheckingUniffiLib.class, C60173zxj.findLibraryName(MTAnalysisConstants.Account.KEY_ACCOUNT));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        C60230zyn.uniffiCheckContractApiVersion(integrityCheckingUniffiLib);
    }
}
