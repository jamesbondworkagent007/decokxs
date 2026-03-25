package uniffi.feature_restriction;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.ALB;
import o.C60173zxj;

/* JADX INFO: loaded from: classes17.dex */
public final class IntegrityCheckingUniffiLib {
    public static final int $stable = 0;
    public static final IntegrityCheckingUniffiLib INSTANCE;

    public final native int ffi_feature_restriction_uniffi_contract_version();

    public final native short uniffi_feature_restriction_checksum_constructor_featurerestrictionbridge_new();

    public final native short uniffi_feature_restriction_checksum_constructor_featurerestrictiondebugbridge_new();

    public final native short uniffi_feature_restriction_checksum_func_emit_native_feature_restriction_event();

    public final native short uniffi_feature_restriction_checksum_func_register_native_feature_restriction_client();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictionbridge_app_modes();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictionbridge_cefi_modes();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictionbridge_clear_data();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictionbridge_cr_trading_modes();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictionbridge_cr_trading_page_modes();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictionbridge_current_config_model();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictionbridge_fetch_feature_restrictions();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictionbridge_get_country();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictionbridge_get_current_restriction_data_json();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictionbridge_get_entity_id();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictionbridge_get_feature_code();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictionbridge_get_feature_hidden_list();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictionbridge_get_i18n_dto_json();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictionbridge_has_restriction_data();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictionbridge_is_cr_market();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictionbridge_is_feature_hidden();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictionbridge_is_feature_limit();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictionbridge_is_support_app_mode();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictionbridge_is_support_cefi_mode();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictionbridge_is_support_cr_trading_mode();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictionbridge_register_listener();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictionbridge_set_mode_data_override();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictionbridge_unregister_all_listeners();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictiondebugbridge_clear_debug_all_feature_configs_override();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictiondebugbridge_clear_debug_all_overrides();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictiondebugbridge_clear_debug_feature_config_override();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictiondebugbridge_get_all_feature_keys();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictiondebugbridge_get_debug_app_modes_override();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictiondebugbridge_get_debug_cefi_modes_override();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictiondebugbridge_get_debug_feature_config_override();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictiondebugbridge_get_debug_feature_key_overriden();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictiondebugbridge_get_debug_feature_keys_override();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictiondebugbridge_is_debug_feature_key_overriden();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictiondebugbridge_is_debug_modes_overriden();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictiondebugbridge_set_debug_app_modes_override();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictiondebugbridge_set_debug_cefi_modes_override();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictiondebugbridge_set_debug_feature_config_override();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictiondebugbridge_set_debug_feature_key_overriden();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictiondebugbridge_set_debug_feature_keys_override();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictiondebugbridge_set_debug_modes_overriden();

    public final native short uniffi_feature_restriction_checksum_method_featurerestrictionlistener_on_feature_restriction_event();

    public final native short uniffi_feature_restriction_checksum_method_nativefeaturerestrictioninterface_fetch_feature_restrictions();

    public final native short uniffi_feature_restriction_checksum_method_nativefeaturerestrictioninterface_get_app_modes();

    public final native short uniffi_feature_restriction_checksum_method_nativefeaturerestrictioninterface_get_cefi_modes();

    public final native short uniffi_feature_restriction_checksum_method_nativefeaturerestrictioninterface_get_country();

    public final native short uniffi_feature_restriction_checksum_method_nativefeaturerestrictioninterface_get_cr_trading_modes();

    public final native short uniffi_feature_restriction_checksum_method_nativefeaturerestrictioninterface_get_cr_trading_page_modes();

    public final native short uniffi_feature_restriction_checksum_method_nativefeaturerestrictioninterface_get_entity_id();

    public final native short uniffi_feature_restriction_checksum_method_nativefeaturerestrictioninterface_get_feature_config_model();

    public final native short uniffi_feature_restriction_checksum_method_nativefeaturerestrictioninterface_get_i18n_dto_json();

    public final native short uniffi_feature_restriction_checksum_method_nativefeaturerestrictioninterface_is_cr_market();

    public final native short uniffi_feature_restriction_checksum_method_nativefeaturerestrictioninterface_is_feature_hidden();

    public final native short uniffi_feature_restriction_checksum_method_nativefeaturerestrictioninterface_is_feature_limit();

    public final native short uniffi_feature_restriction_checksum_method_nativefeaturerestrictioninterface_is_support_app_mode();

    public final native short uniffi_feature_restriction_checksum_method_nativefeaturerestrictioninterface_is_support_cefi_mode();

    public final native short uniffi_feature_restriction_checksum_method_nativefeaturerestrictioninterface_is_support_cr_trading_mode();

    public final native short uniffi_feature_restriction_checksum_method_oknativetaskboolwithnativefetchfeaturerestrictionerror_cancel();

    public final native short uniffi_feature_restriction_checksum_method_oknativetaskboolwithnativefetchfeaturerestrictionerror_execute();

    private IntegrityCheckingUniffiLib() {
    }

    static {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = new IntegrityCheckingUniffiLib();
        INSTANCE = integrityCheckingUniffiLib;
        String strFindLibraryName = C60173zxj.findLibraryName("feature_restriction");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        Native.register((Class<?>) IntegrityCheckingUniffiLib.class, C60173zxj.findLibraryName("feature_restriction"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        ALB.uniffiCheckContractApiVersion(integrityCheckingUniffiLib);
    }
}
