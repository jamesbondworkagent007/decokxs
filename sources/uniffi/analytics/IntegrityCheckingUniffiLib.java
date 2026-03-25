package uniffi.analytics;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.C3599Aow;
import o.C60173zxj;

/* JADX INFO: loaded from: classes13.dex */
public final class IntegrityCheckingUniffiLib {
    public static final int $stable = 0;
    public static final IntegrityCheckingUniffiLib INSTANCE;

    public final native int ffi_analytics_uniffi_contract_version();

    public final native short uniffi_analytics_checksum_func_register_analytics();

    public final native short uniffi_analytics_checksum_method_analyticsinterface_report_exception();

    public final native short uniffi_analytics_checksum_method_analyticsinterface_report_to_grafana();

    public final native short uniffi_analytics_checksum_method_analyticsinterface_track_event();

    private IntegrityCheckingUniffiLib() {
    }

    static {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = new IntegrityCheckingUniffiLib();
        INSTANCE = integrityCheckingUniffiLib;
        String strFindLibraryName = C60173zxj.findLibraryName("analytics");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        Native.register((Class<?>) IntegrityCheckingUniffiLib.class, C60173zxj.findLibraryName("analytics"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        C3599Aow.uniffiCheckContractApiVersion(integrityCheckingUniffiLib);
    }
}
