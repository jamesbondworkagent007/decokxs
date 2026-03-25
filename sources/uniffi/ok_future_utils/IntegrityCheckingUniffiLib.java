package uniffi.ok_future_utils;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.BfS;
import o.C60173zxj;

/* JADX INFO: loaded from: classes13.dex */
public final class IntegrityCheckingUniffiLib {
    public static final int $stable = 0;
    public static final IntegrityCheckingUniffiLib INSTANCE;

    public final native int ffi_ok_future_utils_uniffi_contract_version();

    public final native short uniffi_ok_future_utils_checksum_constructor_okcancellationtoken_new();

    public final native short uniffi_ok_future_utils_checksum_method_okcancellationtoken_cancel();

    public final native short uniffi_ok_future_utils_checksum_method_okcancellationtoken_is_cancelled();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfutureboolwithokffierror_cancel();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfutureboolwithokffierror_get_error();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfutureboolwithokffierror_get_result_status();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfutureboolwithokffierror_get_success_result();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfutureboolwithokffierror_is_finished();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfutureboolwithokffierror_start_with_callback();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturecallback_on_finished();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturef32withokffierror_cancel();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturef32withokffierror_get_error();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturef32withokffierror_get_result_status();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturef32withokffierror_get_success_result();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturef32withokffierror_is_finished();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturef32withokffierror_start_with_callback();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturef64withokffierror_cancel();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturef64withokffierror_get_error();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturef64withokffierror_get_result_status();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturef64withokffierror_get_success_result();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturef64withokffierror_is_finished();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturef64withokffierror_start_with_callback();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturei32withokffierror_cancel();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturei32withokffierror_get_error();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturei32withokffierror_get_result_status();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturei32withokffierror_get_success_result();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturei32withokffierror_is_finished();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturei32withokffierror_start_with_callback();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturei64withokffierror_cancel();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturei64withokffierror_get_error();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturei64withokffierror_get_result_status();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturei64withokffierror_get_success_result();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturei64withokffierror_is_finished();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturei64withokffierror_start_with_callback();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturestringwithokffierror_cancel();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturestringwithokffierror_get_error();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturestringwithokffierror_get_result_status();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturestringwithokffierror_get_success_result();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturestringwithokffierror_is_finished();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfuturestringwithokffierror_start_with_callback();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfutureu32withokffierror_cancel();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfutureu32withokffierror_get_error();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfutureu32withokffierror_get_result_status();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfutureu32withokffierror_get_success_result();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfutureu32withokffierror_is_finished();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfutureu32withokffierror_start_with_callback();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfutureu64withokffierror_cancel();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfutureu64withokffierror_get_error();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfutureu64withokffierror_get_result_status();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfutureu64withokffierror_get_success_result();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfutureu64withokffierror_is_finished();

    public final native short uniffi_ok_future_utils_checksum_method_okrustfutureu64withokffierror_start_with_callback();

    private IntegrityCheckingUniffiLib() {
    }

    static {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = new IntegrityCheckingUniffiLib();
        INSTANCE = integrityCheckingUniffiLib;
        String strFindLibraryName = C60173zxj.findLibraryName("ok_future_utils");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        Native.register((Class<?>) IntegrityCheckingUniffiLib.class, C60173zxj.findLibraryName("ok_future_utils"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        BfS.uniffiCheckContractApiVersion(integrityCheckingUniffiLib);
    }
}
