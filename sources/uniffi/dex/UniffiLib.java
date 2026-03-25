package uniffi.dex;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.BfS;
import o.C4298Bav;
import o.C56392yDr;
import o.C60173zxj;
import o.InterfaceC56387yDm;
import o.InterfaceC60177zxn;
import org.jetbrains.annotations.NotNull;
import uniffi.ForeignBytes;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.UniffiRustFutureContinuationCallback;
import uniffi.dex.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public final class UniffiLib {
    public static final int $stable;
    public static final InterfaceC56387yDm CLEANER$delegate;
    public static final UniffiLib INSTANCE;

    public final native void ffi_dex_rust_future_cancel_f32(long j);

    public final native void ffi_dex_rust_future_cancel_f64(long j);

    public final native void ffi_dex_rust_future_cancel_i16(long j);

    public final native void ffi_dex_rust_future_cancel_i32(long j);

    public final native void ffi_dex_rust_future_cancel_i64(long j);

    public final native void ffi_dex_rust_future_cancel_i8(long j);

    public final native void ffi_dex_rust_future_cancel_rust_buffer(long j);

    public final native void ffi_dex_rust_future_cancel_u16(long j);

    public final native void ffi_dex_rust_future_cancel_u32(long j);

    public final native void ffi_dex_rust_future_cancel_u64(long j);

    public final native void ffi_dex_rust_future_cancel_u8(long j);

    public final native void ffi_dex_rust_future_cancel_void(long j);

    public final native float ffi_dex_rust_future_complete_f32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native double ffi_dex_rust_future_complete_f64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_dex_rust_future_complete_i16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_dex_rust_future_complete_i32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_dex_rust_future_complete_i64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_dex_rust_future_complete_i8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_dex_rust_future_complete_rust_buffer(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_dex_rust_future_complete_u16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_dex_rust_future_complete_u32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_dex_rust_future_complete_u64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_dex_rust_future_complete_u8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_dex_rust_future_complete_void(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_dex_rust_future_free_f32(long j);

    public final native void ffi_dex_rust_future_free_f64(long j);

    public final native void ffi_dex_rust_future_free_i16(long j);

    public final native void ffi_dex_rust_future_free_i32(long j);

    public final native void ffi_dex_rust_future_free_i64(long j);

    public final native void ffi_dex_rust_future_free_i8(long j);

    public final native void ffi_dex_rust_future_free_rust_buffer(long j);

    public final native void ffi_dex_rust_future_free_u16(long j);

    public final native void ffi_dex_rust_future_free_u32(long j);

    public final native void ffi_dex_rust_future_free_u64(long j);

    public final native void ffi_dex_rust_future_free_u8(long j);

    public final native void ffi_dex_rust_future_free_void(long j);

    public final native void ffi_dex_rust_future_poll_f32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_dex_rust_future_poll_f64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_dex_rust_future_poll_i16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_dex_rust_future_poll_i32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_dex_rust_future_poll_i64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_dex_rust_future_poll_i8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_dex_rust_future_poll_rust_buffer(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_dex_rust_future_poll_u16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_dex_rust_future_poll_u32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_dex_rust_future_poll_u64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_dex_rust_future_poll_u8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_dex_rust_future_poll_void(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native RustBuffer.ByValue ffi_dex_rustbuffer_alloc(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_dex_rustbuffer_free(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_dex_rustbuffer_from_bytes(@NotNull ForeignBytes.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_dex_rustbuffer_reserve(@NotNull RustBuffer.ByValue byValue, long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_clone_bridgetokenlistmanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_clone_dexalertusecase(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_clone_dexchainsmanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_clone_dexpoolinfointeractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_clone_dexpoolinfoobserver(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_clone_dexpoolinfoobserverhandle(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_clone_okrustfutureaddalertresponsewithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_clone_okrustfuturealertlistresponsevecwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_clone_okrustfuturebridgechainlistwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_clone_okrustfuturebridgeplatformcheckresponsewithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_clone_okrustfuturecoincheckresultwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_clone_okrustfuturedexholderanalysisdatawithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_clone_okrustfuturedexliquiditychartdatawithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_clone_okrustfuturemarketchainlistwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_clone_okrustfutureoptionalbridgeapprovedatawithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_clone_okrustfutureoptionalcoinriskdatawithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_clone_okrustfuturepresetrequestconfigwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_clone_okrustfuturestrategychainlistwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_clone_okrustfuturesummarydatawithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_clone_okrustfutureswapchainlistwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_clone_okrustfuturetokenlistresultwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_clone_singletokenlistmanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_constructor_bridgetokenlistmanager_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_constructor_dexalertusecase_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_constructor_dexchainsmanager_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_constructor_dexpoolinfointeractor_new(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_constructor_singletokenlistmanager_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_free_bridgetokenlistmanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_free_dexalertusecase(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_free_dexchainsmanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_free_dexpoolinfointeractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_free_dexpoolinfoobserver(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_free_dexpoolinfoobserverhandle(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_free_okrustfutureaddalertresponsewithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_free_okrustfuturealertlistresponsevecwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_free_okrustfuturebridgechainlistwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_free_okrustfuturebridgeplatformcheckresponsewithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_free_okrustfuturecoincheckresultwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_free_okrustfuturedexholderanalysisdatawithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_free_okrustfuturedexliquiditychartdatawithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_free_okrustfuturemarketchainlistwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_free_okrustfutureoptionalbridgeapprovedatawithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_free_okrustfutureoptionalcoinriskdatawithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_free_okrustfuturepresetrequestconfigwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_free_okrustfuturestrategychainlistwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_free_okrustfuturesummarydatawithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_free_okrustfutureswapchainlistwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_free_okrustfuturetokenlistresultwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_free_singletokenlistmanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_func_bridge_approve_data(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_func_bridge_approve_data_json(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_func_bridge_platform_check(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_func_bridge_platform_check_json(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_func_get_coin_risk(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_func_get_coin_risk_data(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_func_get_holder_analysis(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_func_get_insights_summary(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_func_get_liquidity_chart(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_func_get_market_chain_list(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_func_reset_preset_config(@NotNull RustBuffer.ByValue byValue, long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_func_reset_preset_config_json(@NotNull RustBuffer.ByValue byValue, long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_func_save_preset_config(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_func_save_preset_config_json(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_init_callback_vtable_dexpoolinfoobserver(@NotNull UniffiVTableCallbackInterfaceDexPoolInfoObserver uniffiVTableCallbackInterfaceDexPoolInfoObserver);

    public final native long uniffi_dex_fn_method_bridgetokenlistmanager_get_bridge_tokens(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_method_bridgetokenlistmanager_get_collection_tokens(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_method_bridgetokenlistmanager_search_tokens(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_method_dexalertusecase_add_alert(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, @NotNull RustBuffer.ByValue byValue6, @NotNull RustBuffer.ByValue byValue7, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_method_dexalertusecase_check_coin_alert_subscribe_status(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_method_dexalertusecase_check_token_supported_for_alert(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_method_dexalertusecase_delete_alert_rule_by_rule_ids(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_method_dexalertusecase_edit_alert(long j, @NotNull RustBuffer.ByValue byValue, int i, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_method_dexalertusecase_edit_alert_active_status(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, int i, int i2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_method_dexalertusecase_get_alert_list(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_method_dexchainsmanager_get_bridge_support_chains(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_method_dexchainsmanager_get_strategy_chains(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_method_dexchainsmanager_get_swap_chains(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_dex_fn_method_dexchainsmanager_is_current_chain_inside_limit_chains(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_dex_fn_method_dexchainsmanager_is_server_support_advance_limit(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_dex_fn_method_dexchainsmanager_is_server_support_tpsl(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_dexpoolinfointeractor_refresh(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_method_dexpoolinfointeractor_register_observer(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_dexpoolinfointeractor_start(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_dexpoolinfointeractor_stop(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_dexpoolinfoobserver_on_state_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfutureaddalertresponsewithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfutureaddalertresponsewithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfutureaddalertresponsewithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfutureaddalertresponsewithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_dex_fn_method_okrustfutureaddalertresponsewithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfutureaddalertresponsewithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfuturealertlistresponsevecwithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturealertlistresponsevecwithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturealertlistresponsevecwithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturealertlistresponsevecwithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_dex_fn_method_okrustfuturealertlistresponsevecwithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfuturealertlistresponsevecwithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfuturebridgechainlistwithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturebridgechainlistwithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturebridgechainlistwithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturebridgechainlistwithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_dex_fn_method_okrustfuturebridgechainlistwithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfuturebridgechainlistwithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfuturebridgeplatformcheckresponsewithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturebridgeplatformcheckresponsewithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturebridgeplatformcheckresponsewithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturebridgeplatformcheckresponsewithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_dex_fn_method_okrustfuturebridgeplatformcheckresponsewithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfuturebridgeplatformcheckresponsewithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfuturecoincheckresultwithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturecoincheckresultwithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturecoincheckresultwithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturecoincheckresultwithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_dex_fn_method_okrustfuturecoincheckresultwithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfuturecoincheckresultwithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfuturedexholderanalysisdatawithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturedexholderanalysisdatawithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturedexholderanalysisdatawithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturedexholderanalysisdatawithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_dex_fn_method_okrustfuturedexholderanalysisdatawithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfuturedexholderanalysisdatawithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfuturedexliquiditychartdatawithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturedexliquiditychartdatawithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturedexliquiditychartdatawithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturedexliquiditychartdatawithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_dex_fn_method_okrustfuturedexliquiditychartdatawithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfuturedexliquiditychartdatawithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfuturemarketchainlistwithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturemarketchainlistwithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturemarketchainlistwithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturemarketchainlistwithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_dex_fn_method_okrustfuturemarketchainlistwithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfuturemarketchainlistwithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfutureoptionalbridgeapprovedatawithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfutureoptionalbridgeapprovedatawithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfutureoptionalbridgeapprovedatawithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfutureoptionalbridgeapprovedatawithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_dex_fn_method_okrustfutureoptionalbridgeapprovedatawithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfutureoptionalbridgeapprovedatawithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfutureoptionalcoinriskdatawithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfutureoptionalcoinriskdatawithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfutureoptionalcoinriskdatawithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfutureoptionalcoinriskdatawithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_dex_fn_method_okrustfutureoptionalcoinriskdatawithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfutureoptionalcoinriskdatawithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfuturepresetrequestconfigwithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturepresetrequestconfigwithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturepresetrequestconfigwithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturepresetrequestconfigwithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_dex_fn_method_okrustfuturepresetrequestconfigwithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfuturepresetrequestconfigwithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfuturestrategychainlistwithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturestrategychainlistwithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturestrategychainlistwithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturestrategychainlistwithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_dex_fn_method_okrustfuturestrategychainlistwithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfuturestrategychainlistwithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfuturesummarydatawithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturesummarydatawithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturesummarydatawithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturesummarydatawithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_dex_fn_method_okrustfuturesummarydatawithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfuturesummarydatawithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfutureswapchainlistwithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfutureswapchainlistwithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfutureswapchainlistwithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfutureswapchainlistwithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_dex_fn_method_okrustfutureswapchainlistwithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfutureswapchainlistwithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfuturetokenlistresultwithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturetokenlistresultwithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturetokenlistresultwithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_dex_fn_method_okrustfuturetokenlistresultwithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_dex_fn_method_okrustfuturetokenlistresultwithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_dex_fn_method_okrustfuturetokenlistresultwithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_method_singletokenlistmanager_get_all_network_tokens(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_method_singletokenlistmanager_get_collection_tokens(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_method_singletokenlistmanager_get_single_chain_tokens(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_dex_fn_method_singletokenlistmanager_search_tokens(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    private UniffiLib() {
    }

    static {
        UniffiLib uniffiLib = new UniffiLib();
        INSTANCE = uniffiLib;
        CLEANER$delegate = C56392yDr.copydefault(new Function0() { // from class: o.AGL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UniffiLib.CLEANER_delegate$lambda$0();
            }
        });
        String strFindLibraryName = C60173zxj.findLibraryName("dex");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        Native.register((Class<?>) UniffiLib.class, C60173zxj.findLibraryName("dex"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        uniffiCallbackInterfaceDexPoolInfoObserver.INSTANCE.copydefault(uniffiLib);
        BfS.uniffiEnsureInitialized();
        C4298Bav.uniffiEnsureInitialized();
        $stable = 8;
    }

    public final InterfaceC60177zxn AEQbTJ() {
        return (InterfaceC60177zxn) CLEANER$delegate.getValue();
    }

    public static final InterfaceC60177zxn CLEANER_delegate$lambda$0() {
        return C60173zxj.create(InterfaceC60177zxn.Companion);
    }
}
