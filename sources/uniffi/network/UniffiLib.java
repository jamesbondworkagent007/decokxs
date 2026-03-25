package uniffi.network;

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
import uniffi.network.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public final class UniffiLib {
    public static final int $stable;
    public static final InterfaceC56387yDm CLEANER$delegate;
    public static final UniffiLib INSTANCE;

    public final native void ffi_network_rust_future_cancel_f32(long j);

    public final native void ffi_network_rust_future_cancel_f64(long j);

    public final native void ffi_network_rust_future_cancel_i16(long j);

    public final native void ffi_network_rust_future_cancel_i32(long j);

    public final native void ffi_network_rust_future_cancel_i64(long j);

    public final native void ffi_network_rust_future_cancel_i8(long j);

    public final native void ffi_network_rust_future_cancel_rust_buffer(long j);

    public final native void ffi_network_rust_future_cancel_u16(long j);

    public final native void ffi_network_rust_future_cancel_u32(long j);

    public final native void ffi_network_rust_future_cancel_u64(long j);

    public final native void ffi_network_rust_future_cancel_u8(long j);

    public final native void ffi_network_rust_future_cancel_void(long j);

    public final native float ffi_network_rust_future_complete_f32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native double ffi_network_rust_future_complete_f64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_network_rust_future_complete_i16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_network_rust_future_complete_i32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_network_rust_future_complete_i64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_network_rust_future_complete_i8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_network_rust_future_complete_rust_buffer(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_network_rust_future_complete_u16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_network_rust_future_complete_u32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_network_rust_future_complete_u64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_network_rust_future_complete_u8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_network_rust_future_complete_void(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_network_rust_future_free_f32(long j);

    public final native void ffi_network_rust_future_free_f64(long j);

    public final native void ffi_network_rust_future_free_i16(long j);

    public final native void ffi_network_rust_future_free_i32(long j);

    public final native void ffi_network_rust_future_free_i64(long j);

    public final native void ffi_network_rust_future_free_i8(long j);

    public final native void ffi_network_rust_future_free_rust_buffer(long j);

    public final native void ffi_network_rust_future_free_u16(long j);

    public final native void ffi_network_rust_future_free_u32(long j);

    public final native void ffi_network_rust_future_free_u64(long j);

    public final native void ffi_network_rust_future_free_u8(long j);

    public final native void ffi_network_rust_future_free_void(long j);

    public final native void ffi_network_rust_future_poll_f32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_network_rust_future_poll_f64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_network_rust_future_poll_i16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_network_rust_future_poll_i32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_network_rust_future_poll_i64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_network_rust_future_poll_i8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_network_rust_future_poll_rust_buffer(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_network_rust_future_poll_u16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_network_rust_future_poll_u32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_network_rust_future_poll_u64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_network_rust_future_poll_u8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_network_rust_future_poll_void(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native RustBuffer.ByValue ffi_network_rustbuffer_alloc(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_network_rustbuffer_free(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_network_rustbuffer_from_bytes(@NotNull ForeignBytes.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_network_rustbuffer_reserve(@NotNull RustBuffer.ByValue byValue, long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_network_fn_clone_legacydownloadcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_network_fn_clone_legacydownloadfactory(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_network_fn_clone_legacydownloadtask(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_network_fn_clone_nativemessagesendable(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_network_fn_clone_nativewsconnection(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_network_fn_clone_nativewslistener(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_network_fn_clone_oknativetaskboolwithokdohffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_network_fn_clone_oknativetaskresponsewithnetworkerror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_network_fn_clone_okxrequestfactory(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_network_fn_clone_okxwsfactory(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_network_fn_clone_platformdohmanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_network_fn_clone_rustwsdatacallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_network_fn_clone_rustwsstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_network_fn_clone_uploadprogresscallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_network_fn_clone_wsconfigprovider(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_free_legacydownloadcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_free_legacydownloadfactory(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_free_legacydownloadtask(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_free_nativemessagesendable(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_free_nativewsconnection(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_free_nativewslistener(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_free_oknativetaskboolwithokdohffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_free_oknativetaskresponsewithnetworkerror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_free_okxrequestfactory(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_free_okxwsfactory(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_free_platformdohmanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_free_rustwsdatacallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_free_rustwsstatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_free_uploadprogresscallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_free_wsconfigprovider(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_network_fn_func_get_http_base_url(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_network_fn_func_get_web3_http_base_url(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_network_fn_func_get_ws_cefi_url(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_network_fn_func_get_ws_defi_url(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_func_init_network_state_change_watcher(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_func_network_did_changed(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_func_register_legacy_download_factory(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_func_register_okx_request_factory(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_func_register_okx_ws_factory(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_func_register_platform_doh_manager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_func_set_http_base_url(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_func_set_web3_http_base_url(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_func_set_ws_cefi_url(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_func_set_ws_defi_url(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_init_callback_vtable_legacydownloadcallback(@NotNull UniffiVTableCallbackInterfaceLegacyDownloadCallback uniffiVTableCallbackInterfaceLegacyDownloadCallback);

    public final native void uniffi_network_fn_init_callback_vtable_legacydownloadfactory(@NotNull UniffiVTableCallbackInterfaceLegacyDownloadFactory uniffiVTableCallbackInterfaceLegacyDownloadFactory);

    public final native void uniffi_network_fn_init_callback_vtable_legacydownloadtask(@NotNull UniffiVTableCallbackInterfaceLegacyDownloadTask uniffiVTableCallbackInterfaceLegacyDownloadTask);

    public final native void uniffi_network_fn_init_callback_vtable_nativemessagesendable(@NotNull UniffiVTableCallbackInterfaceNativeMessageSendable uniffiVTableCallbackInterfaceNativeMessageSendable);

    public final native void uniffi_network_fn_init_callback_vtable_nativewsconnection(@NotNull UniffiVTableCallbackInterfaceNativeWsConnection uniffiVTableCallbackInterfaceNativeWsConnection);

    public final native void uniffi_network_fn_init_callback_vtable_nativewslistener(@NotNull UniffiVTableCallbackInterfaceNativeWsListener uniffiVTableCallbackInterfaceNativeWsListener);

    public final native void uniffi_network_fn_init_callback_vtable_oknativetaskboolwithokdohffierror(@NotNull UniffiVTableCallbackInterfaceOkNativeTaskboolWithOkdohfFiError uniffiVTableCallbackInterfaceOkNativeTaskboolWithOkdohfFiError);

    public final native void uniffi_network_fn_init_callback_vtable_oknativetaskresponsewithnetworkerror(@NotNull UniffiVTableCallbackInterfaceOkNativeTaskResponseWithNetworkError uniffiVTableCallbackInterfaceOkNativeTaskResponseWithNetworkError);

    public final native void uniffi_network_fn_init_callback_vtable_okxrequestfactory(@NotNull UniffiVTableCallbackInterfaceOkxRequestFactory uniffiVTableCallbackInterfaceOkxRequestFactory);

    public final native void uniffi_network_fn_init_callback_vtable_okxwsfactory(@NotNull UniffiVTableCallbackInterfaceOkxWsFactory uniffiVTableCallbackInterfaceOkxWsFactory);

    public final native void uniffi_network_fn_init_callback_vtable_platformdohmanager(@NotNull UniffiVTableCallbackInterfacePlatformDohManager uniffiVTableCallbackInterfacePlatformDohManager);

    public final native void uniffi_network_fn_init_callback_vtable_rustwsdatacallback(@NotNull UniffiVTableCallbackInterfaceRustWsDataCallback uniffiVTableCallbackInterfaceRustWsDataCallback);

    public final native void uniffi_network_fn_init_callback_vtable_rustwsstatecallback(@NotNull UniffiVTableCallbackInterfaceRustWsStateCallback uniffiVTableCallbackInterfaceRustWsStateCallback);

    public final native void uniffi_network_fn_init_callback_vtable_uploadprogresscallback(@NotNull UniffiVTableCallbackInterfaceUploadProgressCallback uniffiVTableCallbackInterfaceUploadProgressCallback);

    public final native void uniffi_network_fn_method_legacydownloadcallback_on_error(long j, int i, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_method_legacydownloadcallback_on_progress(long j, long j2, long j3, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_method_legacydownloadcallback_on_success(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_network_fn_method_legacydownloadfactory_create(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_method_legacydownloadtask_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_method_legacydownloadtask_start(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_method_nativemessagesendable_send_messages(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_network_fn_method_nativewsconnection_create_listener(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, long j2, long j3, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_network_fn_method_nativewsconnection_kind(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_method_nativewsconnection_reconnect(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_network_fn_method_nativewslistener_get_sendable(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_network_fn_method_nativewslistener_kind(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_method_nativewslistener_start(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_method_nativewslistener_stop(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_method_oknativetaskboolwithokdohffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_network_fn_method_oknativetaskboolwithokdohffierror_execute(long j);

    public final native void uniffi_network_fn_method_oknativetaskresponsewithnetworkerror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_network_fn_method_oknativetaskresponsewithnetworkerror_execute(long j);

    public final native long uniffi_network_fn_method_okxrequestfactory_create(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_network_fn_method_okxrequestfactory_unified_error_message(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_network_fn_method_okxwsfactory_create_connection(long j, @NotNull RustBuffer.ByValue byValue, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_network_fn_method_okxwsfactory_create_simplified_connection(long j, @NotNull RustBuffer.ByValue byValue, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_method_platformdohmanager_clear_cor_domain(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_network_fn_method_platformdohmanager_set_cor_domain(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_network_fn_method_platformdohmanager_set_h5_cor_domain(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_method_rustwsdatacallback_on_data(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_method_rustwsstatecallback_on_state(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_network_fn_method_uploadprogresscallback_on_progress(long j, long j2, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_network_fn_method_wsconfigprovider_get_login_state(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_network_fn_method_wsconfigprovider_get_login_string(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_network_fn_method_wsconfigprovider_get_url(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    private UniffiLib() {
    }

    static {
        UniffiLib uniffiLib = new UniffiLib();
        INSTANCE = uniffiLib;
        CLEANER$delegate = C56392yDr.copydefault(new Function0() { // from class: o.Bct
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UniffiLib.CLEANER_delegate$lambda$0();
            }
        });
        String strFindLibraryName = C60173zxj.findLibraryName("network");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        Native.register((Class<?>) UniffiLib.class, C60173zxj.findLibraryName("network"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        uniffiCallbackInterfaceLegacyDownloadCallback.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfaceLegacyDownloadFactory.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceLegacyDownloadTask.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfaceNativeMessageSendable.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceNativeWsConnection.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceNativeWsListener.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceOKNativeTaskResponseWithNetworkError.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceOKNativeTaskboolWithOKDOHFFiError.INSTANCE.KWHzl(uniffiLib);
        uniffiCallbackInterfaceOKXRequestFactory.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceOKXWsFactory.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfacePlatformDohManager.INSTANCE.KWHzl(uniffiLib);
        uniffiCallbackInterfaceRustWsDataCallback.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceRustWsStateCallback.INSTANCE.KWHzl(uniffiLib);
        uniffiCallbackInterfaceUploadProgressCallback.INSTANCE.OLrzqt(uniffiLib);
        $stable = 8;
    }

    public final InterfaceC60177zxn AEQbTJ() {
        return (InterfaceC60177zxn) CLEANER$delegate.getValue();
    }

    public static final InterfaceC60177zxn CLEANER_delegate$lambda$0() {
        return C60173zxj.create(InterfaceC60177zxn.Companion);
    }
}
