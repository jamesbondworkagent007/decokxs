package uniffi.settings;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.BoN;
import o.C60173zxj;

/* JADX INFO: loaded from: classes17.dex */
public final class IntegrityCheckingUniffiLib {
    public static final int $stable = 0;
    public static final IntegrityCheckingUniffiLib INSTANCE;

    public final native int ffi_settings_uniffi_contract_version();

    public final native short uniffi_settings_checksum_constructor_colorselectinteractor_new();

    public final native short uniffi_settings_checksum_constructor_currencyselectinteractor_new();

    public final native short uniffi_settings_checksum_constructor_daynightselectinteractor_new();

    public final native short uniffi_settings_checksum_constructor_languageselectinteractor_new();

    public final native short uniffi_settings_checksum_func_get_settings_service();

    public final native short uniffi_settings_checksum_method_colorcorebinding_emit_theme_change();

    public final native short uniffi_settings_checksum_method_colorcorebinding_get_color_theme();

    public final native short uniffi_settings_checksum_method_colorcorebinding_get_theme_mode();

    public final native short uniffi_settings_checksum_method_colorcorebinding_set_color_theme();

    public final native short uniffi_settings_checksum_method_colorcorebinding_set_theme_mode();

    public final native short uniffi_settings_checksum_method_colorpreferencestatechangecallback_on_changed();

    public final native short uniffi_settings_checksum_method_colorselectinteractor_on_green_red_up_clicked();

    public final native short uniffi_settings_checksum_method_colorselectinteractor_on_modern_classic_clicked();

    public final native short uniffi_settings_checksum_method_colorselectinteractor_set_state_callback();

    public final native short uniffi_settings_checksum_method_currencyliststatechangecallback_on_changed();

    public final native short uniffi_settings_checksum_method_currencyselecteventcallback_on_event();

    public final native short uniffi_settings_checksum_method_currencyselectinteractor_select_currency();

    public final native short uniffi_settings_checksum_method_currencyselectinteractor_set_event_callback();

    public final native short uniffi_settings_checksum_method_currencyselectinteractor_set_state_callback();

    public final native short uniffi_settings_checksum_method_currencyselectinteractor_update_search_query();

    public final native short uniffi_settings_checksum_method_daynightselectinteractor_get_current_mode();

    public final native short uniffi_settings_checksum_method_daynightselectinteractor_on_auto_mode_click();

    public final native short uniffi_settings_checksum_method_daynightselectinteractor_on_day_mode_click();

    public final native short uniffi_settings_checksum_method_daynightselectinteractor_on_night_mode_click();

    public final native short uniffi_settings_checksum_method_daynightselectinteractor_set_state_callback();

    public final native short uniffi_settings_checksum_method_daynightstatechangecallback_on_changed();

    public final native short uniffi_settings_checksum_method_languagecorebinding_set_app_language();

    public final native short uniffi_settings_checksum_method_languageliststatechangecallback_on_changed();

    public final native short uniffi_settings_checksum_method_languageselecteventcallback_on_event();

    public final native short uniffi_settings_checksum_method_languageselectinteractor_change_language();

    public final native short uniffi_settings_checksum_method_languageselectinteractor_load_languages();

    public final native short uniffi_settings_checksum_method_languageselectinteractor_set_event_callback();

    public final native short uniffi_settings_checksum_method_languageselectinteractor_set_state_callback();

    public final native short uniffi_settings_checksum_method_settingsnotificationbridgingcallback_on_event();

    public final native short uniffi_settings_checksum_method_settingsserviceforeignhandling_get_currency_info_with_iso_code();

    public final native short uniffi_settings_checksum_method_settingsserviceforeignhandling_get_currency_list_from_cache();

    public final native short uniffi_settings_checksum_method_settingsserviceforeignhandling_get_currency_list_from_remote();

    public final native short uniffi_settings_checksum_method_settingsserviceforeignhandling_get_currency_pref();

    public final native short uniffi_settings_checksum_method_settingsserviceforeignhandling_get_fund_unit();

    public final native short uniffi_settings_checksum_method_settingsserviceforeignhandling_get_settings_from_cache();

    public final native short uniffi_settings_checksum_method_settingsserviceforeignhandling_get_settings_from_remote();

    public final native short uniffi_settings_checksum_method_settingsserviceforeignhandling_register_settings_event_callback();

    public final native short uniffi_settings_checksum_method_settingsserviceforeignhandling_set_color_appearance();

    public final native short uniffi_settings_checksum_method_settingsserviceforeignhandling_set_color_palette();

    public final native short uniffi_settings_checksum_method_settingsserviceforeignhandling_set_currency_pref();

    public final native short uniffi_settings_checksum_method_settingsserviceforeignhandling_set_fund_unit();

    public final native short uniffi_settings_checksum_method_settingsserviceforeignhandling_set_rise_fall_color();

    public final native short uniffi_settings_checksum_method_settingsserviceforeignhandling_set_rise_fall_cycle();

    public final native short uniffi_settings_checksum_method_settingsserviceforeignhandling_set_user_language();

    public final native short uniffi_settings_checksum_method_settingsserviceforeignhandling_update_currency_list();

    public final native short uniffi_settings_checksum_method_settingsserviceforeignhandling_update_user_settings();

    private IntegrityCheckingUniffiLib() {
    }

    static {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = new IntegrityCheckingUniffiLib();
        INSTANCE = integrityCheckingUniffiLib;
        String strFindLibraryName = C60173zxj.findLibraryName("settings");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        Native.register((Class<?>) IntegrityCheckingUniffiLib.class, C60173zxj.findLibraryName("settings"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        BoN.uniffiCheckContractApiVersion(integrityCheckingUniffiLib);
    }
}
