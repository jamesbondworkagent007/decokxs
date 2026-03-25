package uniffi.user;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.C56392yDr;
import o.C60173zxj;
import o.InterfaceC56387yDm;
import o.InterfaceC60177zxn;
import org.jetbrains.annotations.NotNull;
import uniffi.ForeignBytes;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.UniffiRustFutureContinuationCallback;
import uniffi.user.UniffiLib;

/* JADX INFO: loaded from: classes14.dex */
public final class UniffiLib {
    public static final int $stable;
    public static final InterfaceC56387yDm CLEANER$delegate;
    public static final UniffiLib INSTANCE;

    public final native void ffi_user_rust_future_cancel_f32(long j);

    public final native void ffi_user_rust_future_cancel_f64(long j);

    public final native void ffi_user_rust_future_cancel_i16(long j);

    public final native void ffi_user_rust_future_cancel_i32(long j);

    public final native void ffi_user_rust_future_cancel_i64(long j);

    public final native void ffi_user_rust_future_cancel_i8(long j);

    public final native void ffi_user_rust_future_cancel_rust_buffer(long j);

    public final native void ffi_user_rust_future_cancel_u16(long j);

    public final native void ffi_user_rust_future_cancel_u32(long j);

    public final native void ffi_user_rust_future_cancel_u64(long j);

    public final native void ffi_user_rust_future_cancel_u8(long j);

    public final native void ffi_user_rust_future_cancel_void(long j);

    public final native float ffi_user_rust_future_complete_f32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native double ffi_user_rust_future_complete_f64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_user_rust_future_complete_i16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_user_rust_future_complete_i32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_user_rust_future_complete_i64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_user_rust_future_complete_i8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_user_rust_future_complete_rust_buffer(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_user_rust_future_complete_u16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_user_rust_future_complete_u32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_user_rust_future_complete_u64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_user_rust_future_complete_u8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_user_rust_future_complete_void(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_user_rust_future_free_f32(long j);

    public final native void ffi_user_rust_future_free_f64(long j);

    public final native void ffi_user_rust_future_free_i16(long j);

    public final native void ffi_user_rust_future_free_i32(long j);

    public final native void ffi_user_rust_future_free_i64(long j);

    public final native void ffi_user_rust_future_free_i8(long j);

    public final native void ffi_user_rust_future_free_rust_buffer(long j);

    public final native void ffi_user_rust_future_free_u16(long j);

    public final native void ffi_user_rust_future_free_u32(long j);

    public final native void ffi_user_rust_future_free_u64(long j);

    public final native void ffi_user_rust_future_free_u8(long j);

    public final native void ffi_user_rust_future_free_void(long j);

    public final native void ffi_user_rust_future_poll_f32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_user_rust_future_poll_f64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_user_rust_future_poll_i16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_user_rust_future_poll_i32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_user_rust_future_poll_i64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_user_rust_future_poll_i8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_user_rust_future_poll_rust_buffer(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_user_rust_future_poll_u16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_user_rust_future_poll_u32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_user_rust_future_poll_u64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_user_rust_future_poll_u8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_user_rust_future_poll_void(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native RustBuffer.ByValue ffi_user_rustbuffer_alloc(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_user_rustbuffer_free(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_user_rustbuffer_from_bytes(@NotNull ForeignBytes.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_user_rustbuffer_reserve(@NotNull RustBuffer.ByValue byValue, long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_user_fn_clone_coreentitymanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_user_fn_clone_coreentitymanagerforeignhandling(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_user_fn_clone_coreusermanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_user_fn_clone_coreusermanagerhandling(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_user_fn_clone_userdatasource(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_user_fn_clone_userinfoeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_free_coreentitymanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_free_coreentitymanagerforeignhandling(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_free_coreusermanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_free_coreusermanagerhandling(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_free_userdatasource(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_free_userinfoeventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_func_avatar_type_from_string(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_func_avatar_type_to_string(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_func_bio_background_review_status_from_int(int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int uniffi_user_fn_func_bio_background_review_status_to_int(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_func_core_user_get_account_name(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_func_core_user_get_nickname(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_func_create_core_user(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, @NotNull RustBuffer.ByValue byValue6, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_func_create_core_user_info(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_func_create_core_user_info_with_account(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_func_create_core_user_profile(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_func_create_local_user_data(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_func_dual_account_type_from_int(int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int uniffi_user_fn_func_dual_account_type_to_int(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_user_fn_func_get_mock_core_user_manager(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_user_fn_func_get_shared_core_entity_manager(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_user_fn_func_get_shared_core_user_manager(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_func_register_native_user_storage(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_func_review_status_from_int(int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int uniffi_user_fn_func_review_status_to_int(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_func_second_verify_type_from_int(int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int uniffi_user_fn_func_second_verify_type_to_int(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_init_callback_vtable_coreentitymanagerforeignhandling(@NotNull UniffiVTableCallbackInterfaceCoreEntityManagerForeignHandling uniffiVTableCallbackInterfaceCoreEntityManagerForeignHandling);

    public final native void uniffi_user_fn_init_callback_vtable_coreusermanagerhandling(@NotNull UniffiVTableCallbackInterfaceCoreUserManagerHandling uniffiVTableCallbackInterfaceCoreUserManagerHandling);

    public final native void uniffi_user_fn_init_callback_vtable_userdatasource(@NotNull UniffiVTableCallbackInterfaceUserDataSource uniffiVTableCallbackInterfaceUserDataSource);

    public final native void uniffi_user_fn_init_callback_vtable_userinfoeventcallback(@NotNull UniffiVTableCallbackInterfaceUserInfoEventCallback uniffiVTableCallbackInterfaceUserInfoEventCallback);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreentitymanagerforeignhandling_get_entity_id(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreentitymanagerforeignhandling_get_json_site_code(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreentitymanagerforeignhandling_get_region(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreentitymanagerforeignhandling_get_simulated_site_code(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreentitymanagerforeignhandling_get_site_code(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_user_fn_method_coreentitymanagerforeignhandling_is_switch_domain_site_code(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreentitymanagerforeignhandling_set_entity_id(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreentitymanagerforeignhandling_set_region(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreentitymanagerforeignhandling_set_simulated_site_code(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreentitymanagerforeignhandling_switch_site_code(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanager_clear_all_users(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanager_clear_temp_token(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanager_get_all_usernames(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanager_get_all_users(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanager_get_all_users_by_login_time(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanager_get_all_users_of_current_site(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanager_get_authorisation_token(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanager_get_bound_account(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanager_get_current_user(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanager_get_current_user_info(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanager_get_current_user_profile(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanager_get_non_current_users_with_token(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanager_get_rbac_features(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanager_get_rm_features(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanager_get_temp_token(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanager_get_user_by_id(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanager_get_user_by_login_name(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanager_get_user_info(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanager_get_user_profile(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_user_fn_method_coreusermanager_has_special_mode_deeplink_restriction(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_user_fn_method_coreusermanager_is_login(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_user_fn_method_coreusermanager_is_login_main_account(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_user_fn_method_coreusermanager_is_main_account_approver(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_user_fn_method_coreusermanager_is_rm_account(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanager_login_user(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, @NotNull RustBuffer.ByValue byValue6, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanager_logout_current_user(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanager_register_user_info_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanager_reload_data(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanager_remove_test_users(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanager_remove_user(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanager_save_current_user_info(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanager_save_current_user_profile(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanager_save_user_info(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanager_save_user_profile(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanager_set_all_users(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanager_set_temp_token(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanager_switch_to_user(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanager_update_user(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanager_update_user_login_name(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanager_update_user_token(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanager_update_user_token_with_type(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanagerhandling_clear_all_users(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanagerhandling_clear_temp_token(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanagerhandling_get_all_usernames(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanagerhandling_get_all_users(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanagerhandling_get_all_users_by_login_time(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanagerhandling_get_all_users_of_current_site(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanagerhandling_get_authorisation_token(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanagerhandling_get_bound_account(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanagerhandling_get_current_user(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanagerhandling_get_current_user_info(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanagerhandling_get_current_user_profile(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanagerhandling_get_non_current_users_with_token(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanagerhandling_get_rbac_features(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanagerhandling_get_rm_features(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanagerhandling_get_temp_token(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanagerhandling_get_user_by_id(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanagerhandling_get_user_by_login_name(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanagerhandling_get_user_info(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_coreusermanagerhandling_get_user_profile(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_user_fn_method_coreusermanagerhandling_has_special_mode_deeplink_restriction(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_user_fn_method_coreusermanagerhandling_is_login(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_user_fn_method_coreusermanagerhandling_is_login_main_account(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_user_fn_method_coreusermanagerhandling_is_main_account_approver(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_user_fn_method_coreusermanagerhandling_is_rm_account(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanagerhandling_login_user(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, @NotNull RustBuffer.ByValue byValue6, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanagerhandling_logout_current_user(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanagerhandling_register_user_info_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanagerhandling_reload_data(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanagerhandling_remove_test_users(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanagerhandling_remove_user(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanagerhandling_save_current_user_info(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanagerhandling_save_current_user_profile(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanagerhandling_save_user_info(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanagerhandling_save_user_profile(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanagerhandling_set_all_users(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanagerhandling_set_temp_token(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanagerhandling_switch_to_user(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanagerhandling_update_user(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanagerhandling_update_user_login_name(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanagerhandling_update_user_token(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_coreusermanagerhandling_update_user_token_with_type(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_userdatasource_clear_all(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_user_fn_method_userdatasource_get_all_users(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_userdatasource_remove_user(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_userdatasource_set_all_users(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_userdatasource_update_user(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_user_fn_method_userinfoeventcallback_on_user_info_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    private UniffiLib() {
    }

    static {
        UniffiLib uniffiLib = new UniffiLib();
        INSTANCE = uniffiLib;
        CLEANER$delegate = C56392yDr.copydefault(new Function0() { // from class: o.Bzk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UniffiLib.CLEANER_delegate$lambda$0();
            }
        });
        String strFindLibraryName = C60173zxj.findLibraryName("user");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        Native.register((Class<?>) UniffiLib.class, C60173zxj.findLibraryName("user"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        uniffiCallbackInterfaceCoreEntityManagerForeignHandling.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceCoreUserManagerHandling.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfaceUserDataSource.INSTANCE.KWHzl(uniffiLib);
        uniffiCallbackInterfaceUserInfoEventCallback.INSTANCE.EZpvd(uniffiLib);
        $stable = 8;
    }

    public final InterfaceC60177zxn OLrzqt() {
        return (InterfaceC60177zxn) CLEANER$delegate.getValue();
    }

    public static final InterfaceC60177zxn CLEANER_delegate$lambda$0() {
        return C60173zxj.create(InterfaceC60177zxn.Companion);
    }
}
