package uniffi.upgrade;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.BuB;
import o.C60173zxj;

/* JADX INFO: loaded from: classes17.dex */
public final class IntegrityCheckingUniffiLib {
    public static final int $stable = 0;
    public static final IntegrityCheckingUniffiLib INSTANCE;

    public final native int ffi_upgrade_uniffi_contract_version();

    public final native short uniffi_upgrade_checksum_func_get_user_ffi_error_with_cancel_token();

    public final native short uniffi_upgrade_checksum_func_get_user_name();

    public final native short uniffi_upgrade_checksum_func_get_user_with_cancel_token();

    public final native short uniffi_upgrade_checksum_func_initialize_upgrade_core();

    public final native short uniffi_upgrade_checksum_func_register_ok_user_factory();

    public final native short uniffi_upgrade_checksum_method_oknativetaskokuserwithgetusererror_cancel();

    public final native short uniffi_upgrade_checksum_method_oknativetaskokuserwithgetusererror_execute();

    public final native short uniffi_upgrade_checksum_method_okrustfutureokuserwithgetusererror_cancel();

    public final native short uniffi_upgrade_checksum_method_okrustfutureokuserwithgetusererror_get_error();

    public final native short uniffi_upgrade_checksum_method_okrustfutureokuserwithgetusererror_get_result_status();

    public final native short uniffi_upgrade_checksum_method_okrustfutureokuserwithgetusererror_get_success_result();

    public final native short uniffi_upgrade_checksum_method_okrustfutureokuserwithgetusererror_is_finished();

    public final native short uniffi_upgrade_checksum_method_okrustfutureokuserwithgetusererror_start_with_callback();

    public final native short uniffi_upgrade_checksum_method_okrustfutureokuserwithokffierror_cancel();

    public final native short uniffi_upgrade_checksum_method_okrustfutureokuserwithokffierror_get_error();

    public final native short uniffi_upgrade_checksum_method_okrustfutureokuserwithokffierror_get_result_status();

    public final native short uniffi_upgrade_checksum_method_okrustfutureokuserwithokffierror_get_success_result();

    public final native short uniffi_upgrade_checksum_method_okrustfutureokuserwithokffierror_is_finished();

    public final native short uniffi_upgrade_checksum_method_okrustfutureokuserwithokffierror_start_with_callback();

    public final native short uniffi_upgrade_checksum_method_okuserfactory_create_user_task();

    public final native short uniffi_upgrade_checksum_method_upgradecontextinterface_get_app_display_mode();

    public final native short uniffi_upgrade_checksum_method_upgradecontextinterface_get_app_mode();

    public final native short uniffi_upgrade_checksum_method_upgradecontextinterface_get_bundle_id();

    public final native short uniffi_upgrade_checksum_method_upgradecore_check_upgrade_async();

    public final native short uniffi_upgrade_checksum_method_upgradecore_clear_cache_response();

    public final native short uniffi_upgrade_checksum_method_upgradecore_clear_poped_flag();

    public final native short uniffi_upgrade_checksum_method_upgradecore_get_cached_response();

    public final native short uniffi_upgrade_checksum_method_upgradecore_set_debug_cached_response();

    public final native short uniffi_upgrade_checksum_method_upgradecore_set_poped_flag();

    public final native short uniffi_upgrade_checksum_method_upgradecore_set_upgrade_context();

    private IntegrityCheckingUniffiLib() {
    }

    static {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = new IntegrityCheckingUniffiLib();
        INSTANCE = integrityCheckingUniffiLib;
        String strFindLibraryName = C60173zxj.findLibraryName("upgrade");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        Native.register((Class<?>) IntegrityCheckingUniffiLib.class, C60173zxj.findLibraryName("upgrade"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        BuB.uniffiCheckContractApiVersion(integrityCheckingUniffiLib);
    }
}
