package uniffi.path_provider;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.BgU;
import o.C60173zxj;

/* JADX INFO: loaded from: classes17.dex */
public final class IntegrityCheckingUniffiLib {
    public static final int $stable = 0;
    public static final IntegrityCheckingUniffiLib INSTANCE;

    public final native int ffi_path_provider_uniffi_contract_version();

    public final native short uniffi_path_provider_checksum_func_register_path_provider();

    public final native short uniffi_path_provider_checksum_method_pathproviderinterface_get_application_cache_directory();

    public final native short uniffi_path_provider_checksum_method_pathproviderinterface_get_application_documents_directory();

    public final native short uniffi_path_provider_checksum_method_pathproviderinterface_get_application_support_directory();

    public final native short uniffi_path_provider_checksum_method_pathproviderinterface_get_downloads_directory();

    public final native short uniffi_path_provider_checksum_method_pathproviderinterface_get_temporary_directory();

    private IntegrityCheckingUniffiLib() {
    }

    static {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = new IntegrityCheckingUniffiLib();
        INSTANCE = integrityCheckingUniffiLib;
        String strFindLibraryName = C60173zxj.findLibraryName("path_provider");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        Native.register((Class<?>) IntegrityCheckingUniffiLib.class, C60173zxj.findLibraryName("path_provider"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        BgU.uniffiCheckContractApiVersion(integrityCheckingUniffiLib);
    }
}
