package uniffi.wallet;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.BCE;
import o.C60173zxj;

/* JADX INFO: loaded from: classes17.dex */
public final class IntegrityCheckingUniffiLib {
    public static final int $stable = 0;
    public static final IntegrityCheckingUniffiLib INSTANCE;

    public final native int ffi_wallet_uniffi_contract_version();

    public final native short uniffi_wallet_checksum_func_get_common_header();

    public final native short uniffi_wallet_checksum_func_get_common_header_map();

    public final native short uniffi_wallet_checksum_func_get_signed_header();

    public final native short uniffi_wallet_checksum_func_get_signed_header_map();

    public final native short uniffi_wallet_checksum_func_register_wallet_header_provider();

    public final native short uniffi_wallet_checksum_func_wallet_ws_on_wallet_changed();

    public final native short uniffi_wallet_checksum_func_wallet_ws_set_addresses();

    public final native short uniffi_wallet_checksum_method_walletheaderprovider_get_common_header();

    public final native short uniffi_wallet_checksum_method_walletheaderprovider_get_signed_header();

    private IntegrityCheckingUniffiLib() {
    }

    static {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = new IntegrityCheckingUniffiLib();
        INSTANCE = integrityCheckingUniffiLib;
        String strFindLibraryName = C60173zxj.findLibraryName("wallet");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        Native.register((Class<?>) IntegrityCheckingUniffiLib.class, C60173zxj.findLibraryName("wallet"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        BCE.uniffiCheckContractApiVersion(integrityCheckingUniffiLib);
    }
}
