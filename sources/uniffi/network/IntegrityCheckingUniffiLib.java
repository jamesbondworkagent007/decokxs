package uniffi.network;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.C4298Bav;
import o.C60173zxj;

/* JADX INFO: loaded from: classes13.dex */
public final class IntegrityCheckingUniffiLib {
    public static final int $stable = 0;
    public static final IntegrityCheckingUniffiLib INSTANCE;

    public final native int ffi_network_uniffi_contract_version();

    public final native short uniffi_network_checksum_func_get_http_base_url();

    public final native short uniffi_network_checksum_func_get_web3_http_base_url();

    public final native short uniffi_network_checksum_func_get_ws_cefi_url();

    public final native short uniffi_network_checksum_func_get_ws_defi_url();

    public final native short uniffi_network_checksum_func_init_network_state_change_watcher();

    public final native short uniffi_network_checksum_func_network_did_changed();

    public final native short uniffi_network_checksum_func_register_legacy_download_factory();

    public final native short uniffi_network_checksum_func_register_okx_request_factory();

    public final native short uniffi_network_checksum_func_register_okx_ws_factory();

    public final native short uniffi_network_checksum_func_register_platform_doh_manager();

    public final native short uniffi_network_checksum_func_set_http_base_url();

    public final native short uniffi_network_checksum_func_set_web3_http_base_url();

    public final native short uniffi_network_checksum_func_set_ws_cefi_url();

    public final native short uniffi_network_checksum_func_set_ws_defi_url();

    public final native short uniffi_network_checksum_method_legacydownloadcallback_on_error();

    public final native short uniffi_network_checksum_method_legacydownloadcallback_on_progress();

    public final native short uniffi_network_checksum_method_legacydownloadcallback_on_success();

    public final native short uniffi_network_checksum_method_legacydownloadfactory_create();

    public final native short uniffi_network_checksum_method_legacydownloadtask_cancel();

    public final native short uniffi_network_checksum_method_legacydownloadtask_start();

    public final native short uniffi_network_checksum_method_nativemessagesendable_send_messages();

    public final native short uniffi_network_checksum_method_nativewsconnection_create_listener();

    public final native short uniffi_network_checksum_method_nativewsconnection_kind();

    public final native short uniffi_network_checksum_method_nativewsconnection_reconnect();

    public final native short uniffi_network_checksum_method_nativewslistener_get_sendable();

    public final native short uniffi_network_checksum_method_nativewslistener_kind();

    public final native short uniffi_network_checksum_method_nativewslistener_start();

    public final native short uniffi_network_checksum_method_nativewslistener_stop();

    public final native short uniffi_network_checksum_method_oknativetaskboolwithokdohffierror_cancel();

    public final native short uniffi_network_checksum_method_oknativetaskboolwithokdohffierror_execute();

    public final native short uniffi_network_checksum_method_oknativetaskresponsewithnetworkerror_cancel();

    public final native short uniffi_network_checksum_method_oknativetaskresponsewithnetworkerror_execute();

    public final native short uniffi_network_checksum_method_okxrequestfactory_create();

    public final native short uniffi_network_checksum_method_okxrequestfactory_unified_error_message();

    public final native short uniffi_network_checksum_method_okxwsfactory_create_connection();

    public final native short uniffi_network_checksum_method_okxwsfactory_create_simplified_connection();

    public final native short uniffi_network_checksum_method_platformdohmanager_clear_cor_domain();

    public final native short uniffi_network_checksum_method_platformdohmanager_set_cor_domain();

    public final native short uniffi_network_checksum_method_platformdohmanager_set_h5_cor_domain();

    public final native short uniffi_network_checksum_method_rustwsdatacallback_on_data();

    public final native short uniffi_network_checksum_method_rustwsstatecallback_on_state();

    public final native short uniffi_network_checksum_method_uploadprogresscallback_on_progress();

    public final native short uniffi_network_checksum_method_wsconfigprovider_get_login_state();

    public final native short uniffi_network_checksum_method_wsconfigprovider_get_login_string();

    public final native short uniffi_network_checksum_method_wsconfigprovider_get_url();

    private IntegrityCheckingUniffiLib() {
    }

    static {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = new IntegrityCheckingUniffiLib();
        INSTANCE = integrityCheckingUniffiLib;
        String strFindLibraryName = C60173zxj.findLibraryName("network");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        Native.register((Class<?>) IntegrityCheckingUniffiLib.class, C60173zxj.findLibraryName("network"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        C4298Bav.uniffiCheckContractApiVersion(integrityCheckingUniffiLib);
    }
}
