package uniffi.retail_trading;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.BlA;
import o.C60173zxj;

/* JADX INFO: loaded from: classes17.dex */
public final class IntegrityCheckingUniffiLib {
    public static final int $stable = 0;
    public static final IntegrityCheckingUniffiLib INSTANCE;

    public final native int ffi_retail_trading_uniffi_contract_version();

    public final native short uniffi_retail_trading_checksum_constructor_retaildexbridge_new();

    public final native short uniffi_retail_trading_checksum_func_register_retail_trading_global_native_api();

    public final native short uniffi_retail_trading_checksum_method_dexlistupdatecallback_on_update_dex_list_batched();

    public final native short uniffi_retail_trading_checksum_method_dexlistupdatecallback_on_update_dex_list_completed();

    public final native short uniffi_retail_trading_checksum_method_dexlistupdatecallback_on_update_dex_list_error();

    public final native short uniffi_retail_trading_checksum_method_okrustfuturedexchaingroupvolistwithokffierror_cancel();

    public final native short uniffi_retail_trading_checksum_method_okrustfuturedexchaingroupvolistwithokffierror_get_error();

    public final native short uniffi_retail_trading_checksum_method_okrustfuturedexchaingroupvolistwithokffierror_get_result_status();

    public final native short uniffi_retail_trading_checksum_method_okrustfuturedexchaingroupvolistwithokffierror_get_success_result();

    public final native short uniffi_retail_trading_checksum_method_okrustfuturedexchaingroupvolistwithokffierror_is_finished();

    public final native short uniffi_retail_trading_checksum_method_okrustfuturedexchaingroupvolistwithokffierror_start_with_callback();

    public final native short uniffi_retail_trading_checksum_method_okrustfuturedextokenvolistwithokffierror_cancel();

    public final native short uniffi_retail_trading_checksum_method_okrustfuturedextokenvolistwithokffierror_get_error();

    public final native short uniffi_retail_trading_checksum_method_okrustfuturedextokenvolistwithokffierror_get_result_status();

    public final native short uniffi_retail_trading_checksum_method_okrustfuturedextokenvolistwithokffierror_get_success_result();

    public final native short uniffi_retail_trading_checksum_method_okrustfuturedextokenvolistwithokffierror_is_finished();

    public final native short uniffi_retail_trading_checksum_method_okrustfuturedextokenvolistwithokffierror_start_with_callback();

    public final native short uniffi_retail_trading_checksum_method_okrustfuturesearchdexvosresultwithokffierror_cancel();

    public final native short uniffi_retail_trading_checksum_method_okrustfuturesearchdexvosresultwithokffierror_get_error();

    public final native short uniffi_retail_trading_checksum_method_okrustfuturesearchdexvosresultwithokffierror_get_result_status();

    public final native short uniffi_retail_trading_checksum_method_okrustfuturesearchdexvosresultwithokffierror_get_success_result();

    public final native short uniffi_retail_trading_checksum_method_okrustfuturesearchdexvosresultwithokffierror_is_finished();

    public final native short uniffi_retail_trading_checksum_method_okrustfuturesearchdexvosresultwithokffierror_start_with_callback();

    public final native short uniffi_retail_trading_checksum_method_retaildexbridge_get_and_subscribe_dex_ranking_list();

    public final native short uniffi_retail_trading_checksum_method_retaildexbridge_get_dex_chain_group_list();

    public final native short uniffi_retail_trading_checksum_method_retaildexbridge_get_dex_ranking_list();

    public final native short uniffi_retail_trading_checksum_method_retaildexbridge_get_dex_token_detail();

    public final native short uniffi_retail_trading_checksum_method_retaildexbridge_search_dex_ranking_list();

    public final native short uniffi_retail_trading_checksum_method_retailtradingnativeapi_get_up_down_time_zone();

    private IntegrityCheckingUniffiLib() {
    }

    static {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = new IntegrityCheckingUniffiLib();
        INSTANCE = integrityCheckingUniffiLib;
        String strFindLibraryName = C60173zxj.findLibraryName("retail_trading");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        Native.register((Class<?>) IntegrityCheckingUniffiLib.class, C60173zxj.findLibraryName("retail_trading"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        BlA.uniffiCheckContractApiVersion(integrityCheckingUniffiLib);
    }
}
