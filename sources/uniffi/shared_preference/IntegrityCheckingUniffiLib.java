package uniffi.shared_preference;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.C4832Bsr;
import o.C60173zxj;

/* JADX INFO: loaded from: classes17.dex */
public final class IntegrityCheckingUniffiLib {
    public static final int $stable = 0;
    public static final IntegrityCheckingUniffiLib INSTANCE;

    public final native int ffi_shared_preference_uniffi_contract_version();

    public final native short uniffi_shared_preference_checksum_func_register_shared_preferences();

    public final native short uniffi_shared_preference_checksum_method_sharedpreferencesinterface_clear();

    public final native short uniffi_shared_preference_checksum_method_sharedpreferencesinterface_contains();

    public final native short uniffi_shared_preference_checksum_method_sharedpreferencesinterface_get_bool();

    public final native short uniffi_shared_preference_checksum_method_sharedpreferencesinterface_get_f64();

    public final native short uniffi_shared_preference_checksum_method_sharedpreferencesinterface_get_i32();

    public final native short uniffi_shared_preference_checksum_method_sharedpreferencesinterface_get_i64();

    public final native short uniffi_shared_preference_checksum_method_sharedpreferencesinterface_get_json_string();

    public final native short uniffi_shared_preference_checksum_method_sharedpreferencesinterface_get_string();

    public final native short uniffi_shared_preference_checksum_method_sharedpreferencesinterface_get_string_list();

    public final native short uniffi_shared_preference_checksum_method_sharedpreferencesinterface_keys();

    public final native short uniffi_shared_preference_checksum_method_sharedpreferencesinterface_remove();

    public final native short uniffi_shared_preference_checksum_method_sharedpreferencesinterface_set_bool();

    public final native short uniffi_shared_preference_checksum_method_sharedpreferencesinterface_set_f64();

    public final native short uniffi_shared_preference_checksum_method_sharedpreferencesinterface_set_i32();

    public final native short uniffi_shared_preference_checksum_method_sharedpreferencesinterface_set_i64();

    public final native short uniffi_shared_preference_checksum_method_sharedpreferencesinterface_set_json_string();

    public final native short uniffi_shared_preference_checksum_method_sharedpreferencesinterface_set_string();

    public final native short uniffi_shared_preference_checksum_method_sharedpreferencesinterface_set_string_list();

    private IntegrityCheckingUniffiLib() {
    }

    static {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = new IntegrityCheckingUniffiLib();
        INSTANCE = integrityCheckingUniffiLib;
        String strFindLibraryName = C60173zxj.findLibraryName("shared_preference");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        Native.register((Class<?>) IntegrityCheckingUniffiLib.class, C60173zxj.findLibraryName("shared_preference"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        C4832Bsr.uniffiCheckContractApiVersion(integrityCheckingUniffiLib);
    }
}
