package uniffi.growth;

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
import uniffi.growth.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public final class UniffiLib {
    public static final int $stable;
    public static final InterfaceC56387yDm CLEANER$delegate;
    public static final UniffiLib INSTANCE;

    public final native void ffi_growth_rust_future_cancel_f32(long j);

    public final native void ffi_growth_rust_future_cancel_f64(long j);

    public final native void ffi_growth_rust_future_cancel_i16(long j);

    public final native void ffi_growth_rust_future_cancel_i32(long j);

    public final native void ffi_growth_rust_future_cancel_i64(long j);

    public final native void ffi_growth_rust_future_cancel_i8(long j);

    public final native void ffi_growth_rust_future_cancel_rust_buffer(long j);

    public final native void ffi_growth_rust_future_cancel_u16(long j);

    public final native void ffi_growth_rust_future_cancel_u32(long j);

    public final native void ffi_growth_rust_future_cancel_u64(long j);

    public final native void ffi_growth_rust_future_cancel_u8(long j);

    public final native void ffi_growth_rust_future_cancel_void(long j);

    public final native float ffi_growth_rust_future_complete_f32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native double ffi_growth_rust_future_complete_f64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_growth_rust_future_complete_i16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_growth_rust_future_complete_i32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_growth_rust_future_complete_i64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_growth_rust_future_complete_i8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_growth_rust_future_complete_rust_buffer(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_growth_rust_future_complete_u16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_growth_rust_future_complete_u32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_growth_rust_future_complete_u64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_growth_rust_future_complete_u8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_growth_rust_future_complete_void(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_growth_rust_future_free_f32(long j);

    public final native void ffi_growth_rust_future_free_f64(long j);

    public final native void ffi_growth_rust_future_free_i16(long j);

    public final native void ffi_growth_rust_future_free_i32(long j);

    public final native void ffi_growth_rust_future_free_i64(long j);

    public final native void ffi_growth_rust_future_free_i8(long j);

    public final native void ffi_growth_rust_future_free_rust_buffer(long j);

    public final native void ffi_growth_rust_future_free_u16(long j);

    public final native void ffi_growth_rust_future_free_u32(long j);

    public final native void ffi_growth_rust_future_free_u64(long j);

    public final native void ffi_growth_rust_future_free_u8(long j);

    public final native void ffi_growth_rust_future_free_void(long j);

    public final native void ffi_growth_rust_future_poll_f32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_growth_rust_future_poll_f64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_growth_rust_future_poll_i16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_growth_rust_future_poll_i32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_growth_rust_future_poll_i64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_growth_rust_future_poll_i8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_growth_rust_future_poll_rust_buffer(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_growth_rust_future_poll_u16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_growth_rust_future_poll_u32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_growth_rust_future_poll_u64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_growth_rust_future_poll_u8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_growth_rust_future_poll_void(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native RustBuffer.ByValue ffi_growth_rustbuffer_alloc(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_growth_rustbuffer_free(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_growth_rustbuffer_from_bytes(@NotNull ForeignBytes.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_growth_rustbuffer_reserve(@NotNull RustBuffer.ByValue byValue, long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_growth_fn_clone_coreshareplatformmanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_growth_fn_clone_platformpackagecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_growth_fn_clone_popupcallbacks(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_growth_fn_clone_popuphost(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_growth_fn_clone_popupprioritymanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_growth_fn_clone_popupprovider(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_growth_fn_clone_popuptriggercontext(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_growth_fn_clone_shareplatformmanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_growth_fn_clone_uiexecutor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_growth_fn_constructor_popupprioritymanager_new(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_growth_fn_constructor_popuptriggercontext_new(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_growth_fn_free_coreshareplatformmanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_growth_fn_free_platformpackagecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_growth_fn_free_popupcallbacks(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_growth_fn_free_popuphost(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_growth_fn_free_popupprioritymanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_growth_fn_free_popupprovider(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_growth_fn_free_popuptriggercontext(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_growth_fn_free_shareplatformmanager(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_growth_fn_free_uiexecutor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_growth_fn_func_get_popup_next_action_from_int(int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_growth_fn_func_get_shared_share_platform_manager(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_growth_fn_func_register_platform_package_callback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_growth_fn_func_register_popup_ui_executor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_growth_fn_func_share_platform_category(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_growth_fn_func_share_platform_from_platform_id(int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_growth_fn_func_share_platform_name_string(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_growth_fn_init_callback_vtable_platformpackagecallback(@NotNull UniffiVTableCallbackInterfacePlatformPackageCallback uniffiVTableCallbackInterfacePlatformPackageCallback);

    public final native void uniffi_growth_fn_init_callback_vtable_popuphost(@NotNull UniffiVTableCallbackInterfacePopupHost uniffiVTableCallbackInterfacePopupHost);

    public final native void uniffi_growth_fn_init_callback_vtable_popupprovider(@NotNull UniffiVTableCallbackInterfacePopupProvider uniffiVTableCallbackInterfacePopupProvider);

    public final native void uniffi_growth_fn_init_callback_vtable_shareplatformmanager(@NotNull UniffiVTableCallbackInterfaceSharePlatformManager uniffiVTableCallbackInterfaceSharePlatformManager);

    public final native void uniffi_growth_fn_init_callback_vtable_uiexecutor(@NotNull UniffiVTableCallbackInterfaceUiExecutor uniffiVTableCallbackInterfaceUiExecutor);

    public final native long uniffi_growth_fn_method_coreshareplatformmanager_fetch_display_share_platform_list(long j, @NotNull RustBuffer.ByValue byValue);

    public final native long uniffi_growth_fn_method_coreshareplatformmanager_fetch_share_component_config(long j);

    public final native long uniffi_growth_fn_method_coreshareplatformmanager_generate_universal_link(long j, @NotNull RustBuffer.ByValue byValue);

    public final native long uniffi_growth_fn_method_coreshareplatformmanager_get_cached_share_platform_list(long j, @NotNull RustBuffer.ByValue byValue);

    public final native RustBuffer.ByValue uniffi_growth_fn_method_platformpackagecallback_filter_available_share_platforms(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_growth_fn_method_platformpackagecallback_is_package_installed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_growth_fn_method_popupcallbacks_on_complete(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_growth_fn_method_popupcallbacks_on_show(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_growth_fn_method_popuphost_identifier(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_growth_fn_method_popuphost_kind(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_growth_fn_method_popupprioritymanager_cancel_active_trigger(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_growth_fn_method_popupprioritymanager_clear_providers(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_growth_fn_method_popupprioritymanager_register_provider(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_growth_fn_method_popupprioritymanager_trigger(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_growth_fn_method_popupprioritymanager_unregister_provider(long j, int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_growth_fn_method_popupprioritymanager_update_config(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int uniffi_growth_fn_method_popupprovider_popup_id(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_growth_fn_method_popupprovider_should_show(long j, long j2);

    public final native void uniffi_growth_fn_method_popupprovider_show_popup(long j, long j2, long j3, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_growth_fn_method_popuptriggercontext_host(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_growth_fn_method_popuptriggercontext_shared_data_get_string(long j, @NotNull RustBuffer.ByValue byValue);

    public final native long uniffi_growth_fn_method_popuptriggercontext_shared_data_invalidate(long j, @NotNull RustBuffer.ByValue byValue);

    public final native long uniffi_growth_fn_method_popuptriggercontext_shared_data_put_string(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2);

    public final native RustBuffer.ByValue uniffi_growth_fn_method_popuptriggercontext_trigger_key(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_growth_fn_method_shareplatformmanager_fetch_display_share_platform_list(long j, @NotNull RustBuffer.ByValue byValue);

    public final native long uniffi_growth_fn_method_shareplatformmanager_fetch_share_component_config(long j);

    public final native long uniffi_growth_fn_method_shareplatformmanager_generate_universal_link(long j, @NotNull RustBuffer.ByValue byValue);

    public final native long uniffi_growth_fn_method_shareplatformmanager_get_cached_share_platform_list(long j, @NotNull RustBuffer.ByValue byValue);

    public final native long uniffi_growth_fn_method_uiexecutor_run_on_ui(long j, long j2, long j3, long j4);

    private UniffiLib() {
    }

    static {
        UniffiLib uniffiLib = new UniffiLib();
        INSTANCE = uniffiLib;
        CLEANER$delegate = C56392yDr.copydefault(new Function0() { // from class: o.AQE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UniffiLib.CLEANER_delegate$lambda$0();
            }
        });
        String strFindLibraryName = C60173zxj.findLibraryName("growth");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        Native.register((Class<?>) UniffiLib.class, C60173zxj.findLibraryName("growth"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        uniffiCallbackInterfacePlatformPackageCallback.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfacePopupHost.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfacePopupProvider.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfaceSharePlatformManager.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceUIExecutor.INSTANCE.copydefault(uniffiLib);
        $stable = 8;
    }

    public final InterfaceC60177zxn copydefault() {
        return (InterfaceC60177zxn) CLEANER$delegate.getValue();
    }

    public static final InterfaceC60177zxn CLEANER_delegate$lambda$0() {
        return C60173zxj.create(InterfaceC60177zxn.Companion);
    }
}
