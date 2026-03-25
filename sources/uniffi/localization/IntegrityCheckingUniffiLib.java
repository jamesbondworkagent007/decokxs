package uniffi.localization;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.C2775AYt;
import o.C60173zxj;

/* JADX INFO: loaded from: classes13.dex */
public final class IntegrityCheckingUniffiLib {
    public static final int $stable = 0;
    public static final IntegrityCheckingUniffiLib INSTANCE;

    public final native int ffi_localization_uniffi_contract_version();

    public final native short uniffi_localization_checksum_func_language_did_changed();

    public final native short uniffi_localization_checksum_func_register_language_factory();

    public final native short uniffi_localization_checksum_method_languagefactory_create_language_list_from_local_task();

    public final native short uniffi_localization_checksum_method_languagefactory_create_language_list_from_remote_task();

    public final native short uniffi_localization_checksum_method_languagefactory_get_app_language();

    public final native short uniffi_localization_checksum_method_languagefactory_get_system_language_if_necessary_for_fallback();

    public final native short uniffi_localization_checksum_method_localizationstringkey_name();

    public final native short uniffi_localization_checksum_method_oknativetaskapplanguagelistwithokffierror_cancel();

    public final native short uniffi_localization_checksum_method_oknativetaskapplanguagelistwithokffierror_execute();

    private IntegrityCheckingUniffiLib() {
    }

    static {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = new IntegrityCheckingUniffiLib();
        INSTANCE = integrityCheckingUniffiLib;
        String strFindLibraryName = C60173zxj.findLibraryName("localization");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        Native.register((Class<?>) IntegrityCheckingUniffiLib.class, C60173zxj.findLibraryName("localization"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        C2775AYt.uniffiCheckContractApiVersion(integrityCheckingUniffiLib);
    }
}
