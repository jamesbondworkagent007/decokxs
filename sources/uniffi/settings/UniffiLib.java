package uniffi.settings;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.C2775AYt;
import o.C56392yDr;
import o.C60173zxj;
import o.InterfaceC56387yDm;
import o.InterfaceC60177zxn;
import org.jetbrains.annotations.NotNull;
import uniffi.ForeignBytes;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.UniffiRustFutureContinuationCallback;
import uniffi.settings.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public final class UniffiLib {
    public static final int $stable;
    public static final InterfaceC56387yDm CLEANER$delegate;
    public static final UniffiLib INSTANCE;

    public final native void ffi_settings_rust_future_cancel_f32(long j);

    public final native void ffi_settings_rust_future_cancel_f64(long j);

    public final native void ffi_settings_rust_future_cancel_i16(long j);

    public final native void ffi_settings_rust_future_cancel_i32(long j);

    public final native void ffi_settings_rust_future_cancel_i64(long j);

    public final native void ffi_settings_rust_future_cancel_i8(long j);

    public final native void ffi_settings_rust_future_cancel_rust_buffer(long j);

    public final native void ffi_settings_rust_future_cancel_u16(long j);

    public final native void ffi_settings_rust_future_cancel_u32(long j);

    public final native void ffi_settings_rust_future_cancel_u64(long j);

    public final native void ffi_settings_rust_future_cancel_u8(long j);

    public final native void ffi_settings_rust_future_cancel_void(long j);

    public final native float ffi_settings_rust_future_complete_f32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native double ffi_settings_rust_future_complete_f64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_settings_rust_future_complete_i16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_settings_rust_future_complete_i32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_settings_rust_future_complete_i64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_settings_rust_future_complete_i8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_settings_rust_future_complete_rust_buffer(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_settings_rust_future_complete_u16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_settings_rust_future_complete_u32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_settings_rust_future_complete_u64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_settings_rust_future_complete_u8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_settings_rust_future_complete_void(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_settings_rust_future_free_f32(long j);

    public final native void ffi_settings_rust_future_free_f64(long j);

    public final native void ffi_settings_rust_future_free_i16(long j);

    public final native void ffi_settings_rust_future_free_i32(long j);

    public final native void ffi_settings_rust_future_free_i64(long j);

    public final native void ffi_settings_rust_future_free_i8(long j);

    public final native void ffi_settings_rust_future_free_rust_buffer(long j);

    public final native void ffi_settings_rust_future_free_u16(long j);

    public final native void ffi_settings_rust_future_free_u32(long j);

    public final native void ffi_settings_rust_future_free_u64(long j);

    public final native void ffi_settings_rust_future_free_u8(long j);

    public final native void ffi_settings_rust_future_free_void(long j);

    public final native void ffi_settings_rust_future_poll_f32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_settings_rust_future_poll_f64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_settings_rust_future_poll_i16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_settings_rust_future_poll_i32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_settings_rust_future_poll_i64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_settings_rust_future_poll_i8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_settings_rust_future_poll_rust_buffer(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_settings_rust_future_poll_u16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_settings_rust_future_poll_u32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_settings_rust_future_poll_u64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_settings_rust_future_poll_u8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_settings_rust_future_poll_void(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native RustBuffer.ByValue ffi_settings_rustbuffer_alloc(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_settings_rustbuffer_free(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_settings_rustbuffer_from_bytes(@NotNull ForeignBytes.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_settings_rustbuffer_reserve(@NotNull RustBuffer.ByValue byValue, long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_clone_colorcorebinding(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_clone_colorpreferencestatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_clone_colorselectinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_clone_currencyliststatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_clone_currencyselecteventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_clone_currencyselectinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_clone_daynightselectinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_clone_daynightstatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_clone_languagecorebinding(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_clone_languageliststatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_clone_languageselecteventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_clone_languageselectinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_clone_settingsnotificationbridgingcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_clone_settingsservice(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_clone_settingsserviceforeignhandling(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_constructor_colorselectinteractor_new(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_constructor_currencyselectinteractor_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_constructor_daynightselectinteractor_new(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_constructor_languageselectinteractor_new(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_free_colorcorebinding(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_free_colorpreferencestatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_free_colorselectinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_free_currencyliststatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_free_currencyselecteventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_free_currencyselectinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_free_daynightselectinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_free_daynightstatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_free_languagecorebinding(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_free_languageliststatechangecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_free_languageselecteventcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_free_languageselectinteractor(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_free_settingsnotificationbridgingcallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_free_settingsservice(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_free_settingsserviceforeignhandling(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_func_get_settings_service(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_init_callback_vtable_colorcorebinding(@NotNull UniffiVTableCallbackInterfaceColorCoreBinding uniffiVTableCallbackInterfaceColorCoreBinding);

    public final native void uniffi_settings_fn_init_callback_vtable_colorpreferencestatechangecallback(@NotNull UniffiVTableCallbackInterfaceColorPreferenceStateChangeCallback uniffiVTableCallbackInterfaceColorPreferenceStateChangeCallback);

    public final native void uniffi_settings_fn_init_callback_vtable_currencyliststatechangecallback(@NotNull UniffiVTableCallbackInterfaceCurrencyListStateChangeCallback uniffiVTableCallbackInterfaceCurrencyListStateChangeCallback);

    public final native void uniffi_settings_fn_init_callback_vtable_currencyselecteventcallback(@NotNull UniffiVTableCallbackInterfaceCurrencySelectEventCallback uniffiVTableCallbackInterfaceCurrencySelectEventCallback);

    public final native void uniffi_settings_fn_init_callback_vtable_daynightstatechangecallback(@NotNull UniffiVTableCallbackInterfaceDayNightStateChangeCallback uniffiVTableCallbackInterfaceDayNightStateChangeCallback);

    public final native void uniffi_settings_fn_init_callback_vtable_languagecorebinding(@NotNull UniffiVTableCallbackInterfaceLanguageCoreBinding uniffiVTableCallbackInterfaceLanguageCoreBinding);

    public final native void uniffi_settings_fn_init_callback_vtable_languageliststatechangecallback(@NotNull UniffiVTableCallbackInterfaceLanguageListStateChangeCallback uniffiVTableCallbackInterfaceLanguageListStateChangeCallback);

    public final native void uniffi_settings_fn_init_callback_vtable_languageselecteventcallback(@NotNull UniffiVTableCallbackInterfaceLanguageSelectEventCallback uniffiVTableCallbackInterfaceLanguageSelectEventCallback);

    public final native void uniffi_settings_fn_init_callback_vtable_settingsnotificationbridgingcallback(@NotNull UniffiVTableCallbackInterfaceSettingsNotificationBridgingCallback uniffiVTableCallbackInterfaceSettingsNotificationBridgingCallback);

    public final native void uniffi_settings_fn_init_callback_vtable_settingsserviceforeignhandling(@NotNull UniffiVTableCallbackInterfaceSettingsServiceForeignHandling uniffiVTableCallbackInterfaceSettingsServiceForeignHandling);

    public final native void uniffi_settings_fn_method_colorcorebinding_emit_theme_change(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int uniffi_settings_fn_method_colorcorebinding_get_color_theme(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int uniffi_settings_fn_method_colorcorebinding_get_theme_mode(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_settings_fn_method_colorcorebinding_set_color_theme(long j, int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_settings_fn_method_colorcorebinding_set_theme_mode(long j, int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_method_colorpreferencestatechangecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_method_colorselectinteractor_on_green_red_up_clicked(long j, byte b);

    public final native long uniffi_settings_fn_method_colorselectinteractor_on_modern_classic_clicked(long j, byte b);

    public final native void uniffi_settings_fn_method_colorselectinteractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_method_currencyliststatechangecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_method_currencyselecteventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_method_currencyselectinteractor_select_currency(long j, @NotNull RustBuffer.ByValue byValue);

    public final native void uniffi_settings_fn_method_currencyselectinteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_method_currencyselectinteractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_method_currencyselectinteractor_update_search_query(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_settings_fn_method_daynightselectinteractor_get_current_mode(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_method_daynightselectinteractor_on_auto_mode_click(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_method_daynightselectinteractor_on_day_mode_click(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_method_daynightselectinteractor_on_night_mode_click(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_method_daynightselectinteractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_method_daynightstatechangecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_method_languagecorebinding_set_app_language(long j, @NotNull RustBuffer.ByValue byValue);

    public final native void uniffi_settings_fn_method_languageliststatechangecallback_on_changed(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_method_languageselecteventcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_method_languageselectinteractor_change_language(long j, @NotNull RustBuffer.ByValue byValue);

    public final native long uniffi_settings_fn_method_languageselectinteractor_load_languages(long j);

    public final native void uniffi_settings_fn_method_languageselectinteractor_set_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_method_languageselectinteractor_set_state_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_method_settingsnotificationbridgingcallback_on_event(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_settings_fn_method_settingsserviceforeignhandling_get_currency_info_with_iso_code(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_settings_fn_method_settingsserviceforeignhandling_get_currency_list_from_cache(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_method_settingsserviceforeignhandling_get_currency_list_from_remote(long j, byte b);

    public final native RustBuffer.ByValue uniffi_settings_fn_method_settingsserviceforeignhandling_get_currency_pref(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_settings_fn_method_settingsserviceforeignhandling_get_fund_unit(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_settings_fn_method_settingsserviceforeignhandling_get_settings_from_cache(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_method_settingsserviceforeignhandling_get_settings_from_remote(long j);

    public final native void uniffi_settings_fn_method_settingsserviceforeignhandling_register_settings_event_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_settings_fn_method_settingsserviceforeignhandling_set_color_appearance(long j, int i);

    public final native long uniffi_settings_fn_method_settingsserviceforeignhandling_set_color_palette(long j, int i);

    public final native long uniffi_settings_fn_method_settingsserviceforeignhandling_set_currency_pref(long j, int i);

    public final native long uniffi_settings_fn_method_settingsserviceforeignhandling_set_fund_unit(long j, @NotNull RustBuffer.ByValue byValue);

    public final native long uniffi_settings_fn_method_settingsserviceforeignhandling_set_rise_fall_color(long j, int i);

    public final native long uniffi_settings_fn_method_settingsserviceforeignhandling_set_rise_fall_cycle(long j, int i);

    public final native long uniffi_settings_fn_method_settingsserviceforeignhandling_set_user_language(long j, @NotNull RustBuffer.ByValue byValue);

    public final native void uniffi_settings_fn_method_settingsserviceforeignhandling_update_currency_list(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_settings_fn_method_settingsserviceforeignhandling_update_user_settings(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    private UniffiLib() {
    }

    static {
        UniffiLib uniffiLib = new UniffiLib();
        INSTANCE = uniffiLib;
        CLEANER$delegate = C56392yDr.copydefault(new Function0() { // from class: o.Bqp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UniffiLib.CLEANER_delegate$lambda$0();
            }
        });
        String strFindLibraryName = C60173zxj.findLibraryName("settings");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        Native.register((Class<?>) UniffiLib.class, C60173zxj.findLibraryName("settings"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        uniffiCallbackInterfaceColorCoreBinding.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceColorPreferenceStateChangeCallback.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceCurrencyListStateChangeCallback.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceCurrencySelectEventCallback.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceDayNightStateChangeCallback.INSTANCE.copydefault(uniffiLib);
        uniffiCallbackInterfaceLanguageCoreBinding.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceLanguageListStateChangeCallback.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceLanguageSelectEventCallback.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceSettingsNotificationBridgingCallback.INSTANCE.KWHzl(uniffiLib);
        uniffiCallbackInterfaceSettingsServiceForeignHandling.INSTANCE.KWHzl(uniffiLib);
        C2775AYt.uniffiEnsureInitialized();
        $stable = 8;
    }

    public final InterfaceC60177zxn AEQbTJ() {
        return (InterfaceC60177zxn) CLEANER$delegate.getValue();
    }

    public static final InterfaceC60177zxn CLEANER_delegate$lambda$0() {
        return C60173zxj.create(InterfaceC60177zxn.Companion);
    }
}
