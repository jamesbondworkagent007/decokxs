package uniffi.compliance;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.C3981AwI;
import o.C60173zxj;

/* JADX INFO: loaded from: classes25.dex */
public final class IntegrityCheckingUniffiLib {
    public static final int $stable = 0;
    public static final IntegrityCheckingUniffiLib INSTANCE;

    public final native int ffi_compliance_uniffi_contract_version();

    public final native short uniffi_compliance_checksum_constructor_gyroblurdetector_create();

    public final native short uniffi_compliance_checksum_constructor_gyroblurdetector_create_with_config();

    public final native short uniffi_compliance_checksum_constructor_idscandebugbridge_create();

    public final native short uniffi_compliance_checksum_constructor_idscanorchestratorbridge_new();

    public final native short uniffi_compliance_checksum_constructor_idscanorchestratorbridge_new_with_config();

    public final native short uniffi_compliance_checksum_func_register_opencv_functions();

    public final native short uniffi_compliance_checksum_func_register_opencv_jni_functions();

    public final native short uniffi_compliance_checksum_method_gyroblurdetector_add_sample();

    public final native short uniffi_compliance_checksum_method_gyroblurdetector_estimate_motion_blur();

    public final native short uniffi_compliance_checksum_method_gyroblurdetector_get_current_motion_blur();

    public final native short uniffi_compliance_checksum_method_gyroblurdetector_mark_exposure_start();

    public final native short uniffi_compliance_checksum_method_gyroblurdetector_reset();

    public final native short uniffi_compliance_checksum_method_gyroblurdetector_set_config();

    public final native short uniffi_compliance_checksum_method_idscancallback_on_autofocus();

    public final native short uniffi_compliance_checksum_method_idscancallback_on_complete();

    public final native short uniffi_compliance_checksum_method_idscancallback_on_debug_data();

    public final native short uniffi_compliance_checksum_method_idscancallback_on_frame_response();

    public final native short uniffi_compliance_checksum_method_idscancallback_on_frame_selected();

    public final native short uniffi_compliance_checksum_method_idscandebugbridge_analyze_blur_fusion_benchmark();

    public final native short uniffi_compliance_checksum_method_idscandebugbridge_analyze_blur_fusion_handle();

    public final native short uniffi_compliance_checksum_method_idscandebugbridge_analyze_blur_fusion_with_gyro();

    public final native short uniffi_compliance_checksum_method_idscandebugbridge_analyze_blur_handle();

    public final native short uniffi_compliance_checksum_method_idscandebugbridge_analyze_brightness_handle();

    public final native short uniffi_compliance_checksum_method_idscandebugbridge_analyze_glare_enhanced_handle();

    public final native short uniffi_compliance_checksum_method_idscandebugbridge_analyze_glare_legacy_handle();

    public final native short uniffi_compliance_checksum_method_idscandebugbridge_analyze_smd_handle();

    public final native short uniffi_compliance_checksum_method_idscandebugbridge_detect_card_angle_handle();

    public final native short uniffi_compliance_checksum_method_idscandebugbridge_detect_edge_handle();

    public final native short uniffi_compliance_checksum_method_idscandebugbridge_detect_glare_split_handle();

    public final native short uniffi_compliance_checksum_method_idscandebugbridge_free_mat_handle();

    public final native short uniffi_compliance_checksum_method_idscandebugbridge_get_config_summary();

    public final native short uniffi_compliance_checksum_method_idscandebugbridge_get_default_thresholds();

    public final native short uniffi_compliance_checksum_method_idscandebugbridge_get_raw_remote_config();

    public final native short uniffi_compliance_checksum_method_idscandebugbridge_get_remote_scan_config();

    public final native short uniffi_compliance_checksum_method_idscandebugbridge_glare_step1_blur_handle();

    public final native short uniffi_compliance_checksum_method_idscandebugbridge_glare_step2_resize_handle();

    public final native short uniffi_compliance_checksum_method_idscandebugbridge_glare_step3_brightness_handle();

    public final native short uniffi_compliance_checksum_method_idscandebugbridge_glare_step4_saturation_handle();

    public final native short uniffi_compliance_checksum_method_idscandebugbridge_glare_step5_combined_handle();

    public final native short uniffi_compliance_checksum_method_idscandebugbridge_glare_step6_morphological_handle();

    public final native short uniffi_compliance_checksum_method_idscandebugbridge_is_remote_config_loaded();

    public final native short uniffi_compliance_checksum_method_idscandebugbridge_run_glare_check();

    public final native short uniffi_compliance_checksum_method_idscanorchestratorbridge_get_output_padding_ratio();

    public final native short uniffi_compliance_checksum_method_idscanorchestratorbridge_get_success_count();

    public final native short uniffi_compliance_checksum_method_idscanorchestratorbridge_is_analyzer_enabled();

    public final native short uniffi_compliance_checksum_method_idscanorchestratorbridge_on_autofocus_completed_with_retry();

    public final native short uniffi_compliance_checksum_method_idscanorchestratorbridge_on_frame_submitted();

    public final native short uniffi_compliance_checksum_method_idscanorchestratorbridge_on_frame_with_handles();

    public final native short uniffi_compliance_checksum_method_idscanorchestratorbridge_on_gyro_sample();

    public final native short uniffi_compliance_checksum_method_idscanorchestratorbridge_on_mlkit_failure();

    public final native short uniffi_compliance_checksum_method_idscanorchestratorbridge_on_real_shake_detected();

    public final native short uniffi_compliance_checksum_method_idscanorchestratorbridge_on_refocus_requested();

    public final native short uniffi_compliance_checksum_method_idscanorchestratorbridge_pause_analyzer();

    public final native short uniffi_compliance_checksum_method_idscanorchestratorbridge_pre_check_coordinates();

    public final native short uniffi_compliance_checksum_method_idscanorchestratorbridge_register_callback();

    public final native short uniffi_compliance_checksum_method_idscanorchestratorbridge_reset_gyro();

    public final native short uniffi_compliance_checksum_method_idscanorchestratorbridge_resume_analyzer();

    public final native short uniffi_compliance_checksum_method_idscanorchestratorbridge_send_platform_event();

    public final native short uniffi_compliance_checksum_method_idscanorchestratorbridge_set_debug_mode();

    public final native short uniffi_compliance_checksum_method_idscanorchestratorbridge_start();

    public final native short uniffi_compliance_checksum_method_idscanorchestratorbridge_stop();

    private IntegrityCheckingUniffiLib() {
    }

    static {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = new IntegrityCheckingUniffiLib();
        INSTANCE = integrityCheckingUniffiLib;
        String strFindLibraryName = C60173zxj.findLibraryName("compliance");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        Native.register((Class<?>) IntegrityCheckingUniffiLib.class, C60173zxj.findLibraryName("compliance"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, IntegrityCheckingUniffiLib.class);
        }
        C3981AwI.uniffiCheckContractApiVersion(integrityCheckingUniffiLib);
    }
}
