package uniffi.lifecycle;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.BfS;
import o.C56392yDr;
import o.C60173zxj;
import o.InterfaceC56387yDm;
import o.InterfaceC60177zxn;
import org.jetbrains.annotations.NotNull;
import uniffi.ForeignBytes;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.UniffiRustFutureContinuationCallback;
import uniffi.lifecycle.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public final class UniffiLib {
    public static final int $stable;
    public static final InterfaceC56387yDm CLEANER$delegate;
    public static final UniffiLib INSTANCE;

    public final native void ffi_lifecycle_rust_future_cancel_f32(long j);

    public final native void ffi_lifecycle_rust_future_cancel_f64(long j);

    public final native void ffi_lifecycle_rust_future_cancel_i16(long j);

    public final native void ffi_lifecycle_rust_future_cancel_i32(long j);

    public final native void ffi_lifecycle_rust_future_cancel_i64(long j);

    public final native void ffi_lifecycle_rust_future_cancel_i8(long j);

    public final native void ffi_lifecycle_rust_future_cancel_rust_buffer(long j);

    public final native void ffi_lifecycle_rust_future_cancel_u16(long j);

    public final native void ffi_lifecycle_rust_future_cancel_u32(long j);

    public final native void ffi_lifecycle_rust_future_cancel_u64(long j);

    public final native void ffi_lifecycle_rust_future_cancel_u8(long j);

    public final native void ffi_lifecycle_rust_future_cancel_void(long j);

    public final native float ffi_lifecycle_rust_future_complete_f32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native double ffi_lifecycle_rust_future_complete_f64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_lifecycle_rust_future_complete_i16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_lifecycle_rust_future_complete_i32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_lifecycle_rust_future_complete_i64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_lifecycle_rust_future_complete_i8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_lifecycle_rust_future_complete_rust_buffer(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_lifecycle_rust_future_complete_u16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_lifecycle_rust_future_complete_u32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_lifecycle_rust_future_complete_u64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_lifecycle_rust_future_complete_u8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_lifecycle_rust_future_complete_void(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_lifecycle_rust_future_free_f32(long j);

    public final native void ffi_lifecycle_rust_future_free_f64(long j);

    public final native void ffi_lifecycle_rust_future_free_i16(long j);

    public final native void ffi_lifecycle_rust_future_free_i32(long j);

    public final native void ffi_lifecycle_rust_future_free_i64(long j);

    public final native void ffi_lifecycle_rust_future_free_i8(long j);

    public final native void ffi_lifecycle_rust_future_free_rust_buffer(long j);

    public final native void ffi_lifecycle_rust_future_free_u16(long j);

    public final native void ffi_lifecycle_rust_future_free_u32(long j);

    public final native void ffi_lifecycle_rust_future_free_u64(long j);

    public final native void ffi_lifecycle_rust_future_free_u8(long j);

    public final native void ffi_lifecycle_rust_future_free_void(long j);

    public final native void ffi_lifecycle_rust_future_poll_f32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_lifecycle_rust_future_poll_f64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_lifecycle_rust_future_poll_i16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_lifecycle_rust_future_poll_i32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_lifecycle_rust_future_poll_i64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_lifecycle_rust_future_poll_i8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_lifecycle_rust_future_poll_rust_buffer(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_lifecycle_rust_future_poll_u16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_lifecycle_rust_future_poll_u32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_lifecycle_rust_future_poll_u64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_lifecycle_rust_future_poll_u8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_lifecycle_rust_future_poll_void(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native RustBuffer.ByValue ffi_lifecycle_rustbuffer_alloc(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_lifecycle_rustbuffer_free(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_lifecycle_rustbuffer_from_bytes(@NotNull ForeignBytes.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_lifecycle_rustbuffer_reserve(@NotNull RustBuffer.ByValue byValue, long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_clone_coreapplinkhandler(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_clone_coreapplinkinfofetcher(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_clone_coreapplinkmetadata(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_clone_coredeeplinkhandler(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_clone_coredeeplinkinfofetcher(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_clone_coredeeplinkmetadata(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_clone_coredeeplinkparsedinfo(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_clone_coredeeplinkservicebridge(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_clone_corelifecyclelinkservicebridge(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_clone_corelinkanalyticsbridge(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_clone_corelinkanalyticsstateholderbridge(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_clone_corelinkdependencyhelper(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_clone_corelinkexecutionhelper(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_clone_oknativetaskboolwithlifecyclefutureerror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_clone_okrustfutureboolwithlifecyclefutureerror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_clone_okrustfuturedeeplinkresultwithlifecyclefutureerror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_clone_okrustfutureshortlinkinfowithlifecyclefutureerror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_constructor_coredeeplinkservicebridge_new(long j, long j2, long j3, long j4, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_constructor_corelifecyclelinkservicebridge_new(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_constructor_corelinkanalyticsbridge_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_constructor_corelinkanalyticsstateholderbridge_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_free_coreapplinkhandler(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_free_coreapplinkinfofetcher(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_free_coreapplinkmetadata(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_free_coredeeplinkhandler(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_free_coredeeplinkinfofetcher(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_free_coredeeplinkmetadata(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_free_coredeeplinkparsedinfo(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_free_coredeeplinkservicebridge(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_free_corelifecyclelinkservicebridge(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_free_corelinkanalyticsbridge(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_free_corelinkanalyticsstateholderbridge(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_free_corelinkdependencyhelper(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_free_corelinkexecutionhelper(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_free_oknativetaskboolwithlifecyclefutureerror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_free_okrustfutureboolwithlifecyclefutureerror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_free_okrustfuturedeeplinkresultwithlifecyclefutureerror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_free_okrustfutureshortlinkinfowithlifecyclefutureerror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_init_callback_vtable_coreapplinkhandler(@NotNull UniffiVTableCallbackInterfaceCoreAppLinkHandler uniffiVTableCallbackInterfaceCoreAppLinkHandler);

    public final native void uniffi_lifecycle_fn_init_callback_vtable_coreapplinkinfofetcher(@NotNull UniffiVTableCallbackInterfaceCoreAppLinkInfoFetcher uniffiVTableCallbackInterfaceCoreAppLinkInfoFetcher);

    public final native void uniffi_lifecycle_fn_init_callback_vtable_coreapplinkmetadata(@NotNull UniffiVTableCallbackInterfaceCoreAppLinkMetadata uniffiVTableCallbackInterfaceCoreAppLinkMetadata);

    public final native void uniffi_lifecycle_fn_init_callback_vtable_coredeeplinkhandler(@NotNull UniffiVTableCallbackInterfaceCoreDeeplinkHandler uniffiVTableCallbackInterfaceCoreDeeplinkHandler);

    public final native void uniffi_lifecycle_fn_init_callback_vtable_coredeeplinkinfofetcher(@NotNull UniffiVTableCallbackInterfaceCoreDeeplinkInfoFetcher uniffiVTableCallbackInterfaceCoreDeeplinkInfoFetcher);

    public final native void uniffi_lifecycle_fn_init_callback_vtable_coredeeplinkmetadata(@NotNull UniffiVTableCallbackInterfaceCoreDeeplinkMetadata uniffiVTableCallbackInterfaceCoreDeeplinkMetadata);

    public final native void uniffi_lifecycle_fn_init_callback_vtable_coredeeplinkparsedinfo(@NotNull UniffiVTableCallbackInterfaceCoreDeeplinkParsedInfo uniffiVTableCallbackInterfaceCoreDeeplinkParsedInfo);

    public final native void uniffi_lifecycle_fn_init_callback_vtable_corelinkdependencyhelper(@NotNull UniffiVTableCallbackInterfaceCoreLinkDependencyHelper uniffiVTableCallbackInterfaceCoreLinkDependencyHelper);

    public final native void uniffi_lifecycle_fn_init_callback_vtable_corelinkexecutionhelper(@NotNull UniffiVTableCallbackInterfaceCoreLinkExecutionHelper uniffiVTableCallbackInterfaceCoreLinkExecutionHelper);

    public final native void uniffi_lifecycle_fn_init_callback_vtable_oknativetaskboolwithlifecyclefutureerror(@NotNull UniffiVTableCallbackInterfaceOkNativeTaskboolWithLifecycleFutureError uniffiVTableCallbackInterfaceOkNativeTaskboolWithLifecycleFutureError);

    public final native void uniffi_lifecycle_fn_method_coreapplinkhandler_execute(long j, long j2, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_coreapplinkinfofetcher_get_app_link_handler(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_coreapplinkinfofetcher_get_app_link_metadata(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_coreapplinkmetadata_get_link(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_coreapplinkmetadata_get_mode(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_coreapplinkmetadata_get_supported_okx_domains(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_lifecycle_fn_method_coreapplinkmetadata_opens_in_webview(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_lifecycle_fn_method_coreapplinkmetadata_require_auth(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_lifecycle_fn_method_coreapplinkmetadata_support_rbac_account(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_lifecycle_fn_method_coreapplinkmetadata_support_rm_account(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_method_coredeeplinkhandler_execute(long j, long j2, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_coredeeplinkinfofetcher_get_deeplink_handler(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_coredeeplinkinfofetcher_get_deeplink_metadata(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_coredeeplinkinfofetcher_get_handler_for_scheme(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_coredeeplinkinfofetcher_get_metadata_for_scheme(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_coredeeplinkmetadata_get_mode(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_coredeeplinkmetadata_get_path(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_lifecycle_fn_method_coredeeplinkmetadata_require_auth(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_lifecycle_fn_method_coredeeplinkmetadata_support_rbac_account(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_lifecycle_fn_method_coredeeplinkmetadata_support_rm_account(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_lifecycle_fn_method_coredeeplinkparsedinfo_can_handle(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_coredeeplinkparsedinfo_get_metadata(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_coredeeplinkparsedinfo_get_params(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_coredeeplinkservicebridge_create_link(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_coredeeplinkservicebridge_get_deeplink_metadata(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_coredeeplinkservicebridge_get_deeplink_registry(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_coredeeplinkservicebridge_get_deeplink_scheme(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_lifecycle_fn_method_coredeeplinkservicebridge_is_universal_link(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_lifecycle_fn_method_coredeeplinkservicebridge_is_universal_link_from_webview(long j, @NotNull RustBuffer.ByValue byValue, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_method_coredeeplinkservicebridge_navigate_to_native(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_coredeeplinkservicebridge_parse_param(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_method_coredeeplinkservicebridge_process_deeplink(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_lifecycle_fn_method_coredeeplinkservicebridge_validate_deeplink(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_lifecycle_fn_method_coredeeplinkservicebridge_validate_deeplink_scheme(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_method_corelifecyclelinkservicebridge_get_short_link_info(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_method_corelifecyclelinkservicebridge_process_external_link(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_method_corelinkanalyticsbridge_send_all_link_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_method_corelinkanalyticsbridge_send_app_open_success(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_method_corelinkanalyticsbridge_send_legacy_deeplink_view(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_method_corelinkanalyticsbridge_send_open_in_app_click(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_method_corelinkanalyticsbridge_send_redirect_short_code_link_view(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_method_corelinkanalyticsbridge_send_short_code_status(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_corelinkanalyticsstateholderbridge_get_analytics_params(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_lifecycle_fn_method_corelinkanalyticsstateholderbridge_has_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_method_corelinkanalyticsstateholderbridge_initialize(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_lifecycle_fn_method_corelinkanalyticsstateholderbridge_is_external_link_processing(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_lifecycle_fn_method_corelinkanalyticsstateholderbridge_is_external_source(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_lifecycle_fn_method_corelinkanalyticsstateholderbridge_is_processing_complete(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_method_corelinkanalyticsstateholderbridge_reset(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_method_corelinkanalyticsstateholderbridge_set_deeplink(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_method_corelinkanalyticsstateholderbridge_set_link_reason(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_method_corelinkdependencyhelper_invoke_link(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_lifecycle_fn_method_corelinkdependencyhelper_is_pay_mode_supported(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_lifecycle_fn_method_corelinkdependencyhelper_is_pro(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_lifecycle_fn_method_corelinkdependencyhelper_is_valid_language_code(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_method_corelinkdependencyhelper_perform_auth(long j, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_method_corelinkdependencyhelper_process_link_params(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_method_corelinkdependencyhelper_switch_mode_if_required(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_corelinkdependencyhelper_validate_mode(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_method_corelinkdependencyhelper_wait_for_config_sync(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_method_corelinkexecutionhelper_clear_context(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_corelinkexecutionhelper_get_context_refer(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_method_corelinkexecutionhelper_open_link(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_method_oknativetaskboolwithlifecyclefutureerror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_lifecycle_fn_method_oknativetaskboolwithlifecyclefutureerror_execute(long j);

    public final native void uniffi_lifecycle_fn_method_okrustfutureboolwithlifecyclefutureerror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_okrustfutureboolwithlifecyclefutureerror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_okrustfutureboolwithlifecyclefutureerror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_okrustfutureboolwithlifecyclefutureerror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_lifecycle_fn_method_okrustfutureboolwithlifecyclefutureerror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_method_okrustfutureboolwithlifecyclefutureerror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_method_okrustfuturedeeplinkresultwithlifecyclefutureerror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_okrustfuturedeeplinkresultwithlifecyclefutureerror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_okrustfuturedeeplinkresultwithlifecyclefutureerror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_okrustfuturedeeplinkresultwithlifecyclefutureerror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_lifecycle_fn_method_okrustfuturedeeplinkresultwithlifecyclefutureerror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_method_okrustfuturedeeplinkresultwithlifecyclefutureerror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_method_okrustfutureshortlinkinfowithlifecyclefutureerror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_okrustfutureshortlinkinfowithlifecyclefutureerror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_okrustfutureshortlinkinfowithlifecyclefutureerror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_lifecycle_fn_method_okrustfutureshortlinkinfowithlifecyclefutureerror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_lifecycle_fn_method_okrustfutureshortlinkinfowithlifecyclefutureerror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_lifecycle_fn_method_okrustfutureshortlinkinfowithlifecyclefutureerror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    private UniffiLib() {
    }

    static {
        UniffiLib uniffiLib = new UniffiLib();
        INSTANCE = uniffiLib;
        CLEANER$delegate = C56392yDr.copydefault(new Function0() { // from class: o.AWF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UniffiLib.CLEANER_delegate$lambda$0();
            }
        });
        String strFindLibraryName = C60173zxj.findLibraryName(RequestParameters.SUBRESOURCE_LIFECYCLE);
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        Native.register((Class<?>) UniffiLib.class, C60173zxj.findLibraryName(RequestParameters.SUBRESOURCE_LIFECYCLE));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        uniffiCallbackInterfaceCoreAppLinkHandler.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfaceCoreAppLinkInfoFetcher.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceCoreAppLinkMetadata.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceCoreDeeplinkHandler.INSTANCE.KWHzl(uniffiLib);
        uniffiCallbackInterfaceCoreDeeplinkInfoFetcher.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceCoreDeeplinkMetadata.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceCoreDeeplinkParsedInfo.INSTANCE.KWHzl(uniffiLib);
        uniffiCallbackInterfaceCoreLinkDependencyHelper.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceCoreLinkExecutionHelper.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfaceOKNativeTaskboolWithLifecycleFutureError.INSTANCE.KWHzl(uniffiLib);
        BfS.uniffiEnsureInitialized();
        $stable = 8;
    }

    public final InterfaceC60177zxn OLrzqt() {
        return (InterfaceC60177zxn) CLEANER$delegate.getValue();
    }

    public static final InterfaceC60177zxn CLEANER_delegate$lambda$0() {
        return C60173zxj.create(InterfaceC60177zxn.Companion);
    }
}
