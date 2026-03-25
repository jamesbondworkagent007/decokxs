package uniffi.experiment;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.C2348AIh;
import o.C60173zxj;

/* JADX INFO: loaded from: classes17.dex */
public final class IntegrityCheckingUniffiLib {
    public static final int $stable = 0;
    public static final IntegrityCheckingUniffiLib INSTANCE;

    public final native int ffi_experiment_uniffi_contract_version();

    public final native short uniffi_experiment_checksum_constructor_feedbackservice_new();

    public final native short uniffi_experiment_checksum_constructor_publicbetaservice_new();

    public final native short uniffi_experiment_checksum_func_notify_abtest_updated();

    public final native short uniffi_experiment_checksum_func_register_abtest_factory();

    public final native short uniffi_experiment_checksum_func_register_feedback_client();

    public final native short uniffi_experiment_checksum_method_abtestfactory_get_payload();

    public final native short uniffi_experiment_checksum_method_abtestfactory_get_payload_with_enterprise_override();

    public final native short uniffi_experiment_checksum_method_featureupdatehandler_on_feature_updated();

    public final native short uniffi_experiment_checksum_method_feedbackinterface_disable_monitor_shaking();

    public final native short uniffi_experiment_checksum_method_feedbackinterface_enable_monitor_shaking();

    public final native short uniffi_experiment_checksum_method_feedbackservice_enable_monitor_shaking_if_needed();

    public final native short uniffi_experiment_checksum_method_feedbackservice_increase_shaking_times();

    public final native short uniffi_experiment_checksum_method_feedbackservice_is_shaking_feedback_available();

    public final native short uniffi_experiment_checksum_method_okrustfutureapiresultwithfetchallfeatureserror_cancel();

    public final native short uniffi_experiment_checksum_method_okrustfutureapiresultwithfetchallfeatureserror_get_error();

    public final native short uniffi_experiment_checksum_method_okrustfutureapiresultwithfetchallfeatureserror_get_result_status();

    public final native short uniffi_experiment_checksum_method_okrustfutureapiresultwithfetchallfeatureserror_get_success_result();

    public final native short uniffi_experiment_checksum_method_okrustfutureapiresultwithfetchallfeatureserror_is_finished();

    public final native short uniffi_experiment_checksum_method_okrustfutureapiresultwithfetchallfeatureserror_start_with_callback();

    public final native short uniffi_experiment_checksum_method_okrustfuturefeatureinfowithqueryfeatureinfoerror_cancel();

    public final native short uniffi_experiment_checksum_method_okrustfuturefeatureinfowithqueryfeatureinfoerror_get_error();

    public final native short uniffi_experiment_checksum_method_okrustfuturefeatureinfowithqueryfeatureinfoerror_get_result_status();

    public final native short uniffi_experiment_checksum_method_okrustfuturefeatureinfowithqueryfeatureinfoerror_get_success_result();

    public final native short uniffi_experiment_checksum_method_okrustfuturefeatureinfowithqueryfeatureinfoerror_is_finished();

    public final native short uniffi_experiment_checksum_method_okrustfuturefeatureinfowithqueryfeatureinfoerror_start_with_callback();

    public final native short uniffi_experiment_checksum_method_publicbetaservice_clear_all_features_cache();

    public final native short uniffi_experiment_checksum_method_publicbetaservice_fetch_all_features();

    public final native short uniffi_experiment_checksum_method_publicbetaservice_get_feature_variant();

    public final native short uniffi_experiment_checksum_method_publicbetaservice_query_feature_info();

    public final native short uniffi_experiment_checksum_method_publicbetaservice_register_feature_updates();

    public final native short uniffi_experiment_checksum_method_publicbetaservice_unregister_feature_updates();

    private IntegrityCheckingUniffiLib() {
    }

    static {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = new IntegrityCheckingUniffiLib();
        INSTANCE = integrityCheckingUniffiLib;
        String strFindLibraryName = C60173zxj.findLibraryName("experiment");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        Native.register((Class<?>) IntegrityCheckingUniffiLib.class, C60173zxj.findLibraryName("experiment"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        C2348AIh.uniffiCheckContractApiVersion(integrityCheckingUniffiLib);
    }
}
