package uniffi.growth;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.ANQ;
import o.C60173zxj;

/* JADX INFO: loaded from: classes17.dex */
public final class IntegrityCheckingUniffiLib {
    public static final int $stable = 0;
    public static final IntegrityCheckingUniffiLib INSTANCE;

    public final native int ffi_growth_uniffi_contract_version();

    public final native short uniffi_growth_checksum_constructor_popupprioritymanager_new();

    public final native short uniffi_growth_checksum_constructor_popuptriggercontext_new();

    public final native short uniffi_growth_checksum_func_get_popup_next_action_from_int();

    public final native short uniffi_growth_checksum_func_get_shared_share_platform_manager();

    public final native short uniffi_growth_checksum_func_register_platform_package_callback();

    public final native short uniffi_growth_checksum_func_register_popup_ui_executor();

    public final native short uniffi_growth_checksum_func_share_platform_category();

    public final native short uniffi_growth_checksum_func_share_platform_from_platform_id();

    public final native short uniffi_growth_checksum_func_share_platform_name_string();

    public final native short uniffi_growth_checksum_method_coreshareplatformmanager_fetch_display_share_platform_list();

    public final native short uniffi_growth_checksum_method_coreshareplatformmanager_fetch_share_component_config();

    public final native short uniffi_growth_checksum_method_coreshareplatformmanager_generate_universal_link();

    public final native short uniffi_growth_checksum_method_coreshareplatformmanager_get_cached_share_platform_list();

    public final native short uniffi_growth_checksum_method_platformpackagecallback_filter_available_share_platforms();

    public final native short uniffi_growth_checksum_method_platformpackagecallback_is_package_installed();

    public final native short uniffi_growth_checksum_method_popupcallbacks_on_complete();

    public final native short uniffi_growth_checksum_method_popupcallbacks_on_show();

    public final native short uniffi_growth_checksum_method_popuphost_identifier();

    public final native short uniffi_growth_checksum_method_popuphost_kind();

    public final native short uniffi_growth_checksum_method_popupprioritymanager_cancel_active_trigger();

    public final native short uniffi_growth_checksum_method_popupprioritymanager_clear_providers();

    public final native short uniffi_growth_checksum_method_popupprioritymanager_register_provider();

    public final native short uniffi_growth_checksum_method_popupprioritymanager_trigger();

    public final native short uniffi_growth_checksum_method_popupprioritymanager_unregister_provider();

    public final native short uniffi_growth_checksum_method_popupprioritymanager_update_config();

    public final native short uniffi_growth_checksum_method_popupprovider_popup_id();

    public final native short uniffi_growth_checksum_method_popupprovider_should_show();

    public final native short uniffi_growth_checksum_method_popupprovider_show_popup();

    public final native short uniffi_growth_checksum_method_popuptriggercontext_host();

    public final native short uniffi_growth_checksum_method_popuptriggercontext_shared_data_get_string();

    public final native short uniffi_growth_checksum_method_popuptriggercontext_shared_data_invalidate();

    public final native short uniffi_growth_checksum_method_popuptriggercontext_shared_data_put_string();

    public final native short uniffi_growth_checksum_method_popuptriggercontext_trigger_key();

    public final native short uniffi_growth_checksum_method_shareplatformmanager_fetch_display_share_platform_list();

    public final native short uniffi_growth_checksum_method_shareplatformmanager_fetch_share_component_config();

    public final native short uniffi_growth_checksum_method_shareplatformmanager_generate_universal_link();

    public final native short uniffi_growth_checksum_method_shareplatformmanager_get_cached_share_platform_list();

    public final native short uniffi_growth_checksum_method_uiexecutor_run_on_ui();

    private IntegrityCheckingUniffiLib() {
    }

    static {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = new IntegrityCheckingUniffiLib();
        INSTANCE = integrityCheckingUniffiLib;
        String strFindLibraryName = C60173zxj.findLibraryName("growth");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        Native.register((Class<?>) IntegrityCheckingUniffiLib.class, C60173zxj.findLibraryName("growth"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        ANQ.uniffiCheckContractApiVersion(integrityCheckingUniffiLib);
    }
}
