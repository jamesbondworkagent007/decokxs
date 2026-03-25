package uniffi.environment;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.C2338AHx;
import o.C60173zxj;

/* JADX INFO: loaded from: classes17.dex */
public final class IntegrityCheckingUniffiLib {
    public static final int $stable = 0;
    public static final IntegrityCheckingUniffiLib INSTANCE;

    public final native int ffi_environment_uniffi_contract_version();

    public final native short uniffi_environment_checksum_func_register_app_info();

    public final native short uniffi_environment_checksum_func_register_device_info();

    public final native short uniffi_environment_checksum_method_appinfointerface_get_app_name();

    public final native short uniffi_environment_checksum_method_appinfointerface_get_app_type();

    public final native short uniffi_environment_checksum_method_appinfointerface_get_app_version();

    public final native short uniffi_environment_checksum_method_appinfointerface_get_app_version_code();

    public final native short uniffi_environment_checksum_method_appinfointerface_get_bundle_id();

    public final native short uniffi_environment_checksum_method_deviceinfointerface_get_device_id();

    public final native short uniffi_environment_checksum_method_deviceinfointerface_get_device_model();

    public final native short uniffi_environment_checksum_method_deviceinfointerface_get_device_name();

    public final native short uniffi_environment_checksum_method_deviceinfointerface_get_system_name();

    public final native short uniffi_environment_checksum_method_deviceinfointerface_get_system_version();

    private IntegrityCheckingUniffiLib() {
    }

    static {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = new IntegrityCheckingUniffiLib();
        INSTANCE = integrityCheckingUniffiLib;
        String strFindLibraryName = C60173zxj.findLibraryName("environment");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        Native.register((Class<?>) IntegrityCheckingUniffiLib.class, C60173zxj.findLibraryName("environment"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        C2338AHx.uniffiCheckContractApiVersion(integrityCheckingUniffiLib);
    }
}
