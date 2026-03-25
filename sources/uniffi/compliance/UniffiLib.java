package uniffi.compliance;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.C56392yDr;
import o.C60173zxj;
import o.InterfaceC56387yDm;
import o.InterfaceC60177zxn;
import org.jetbrains.annotations.NotNull;
import uniffi.ForeignBytes;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.UniffiRustFutureContinuationCallback;
import uniffi.compliance.UniffiLib;

/* JADX INFO: loaded from: classes25.dex */
public final class UniffiLib {
    public static final int $stable;
    public static final InterfaceC56387yDm CLEANER$delegate;
    public static final UniffiLib INSTANCE;

    public final native void ffi_compliance_rust_future_cancel_f32(long j);

    public final native void ffi_compliance_rust_future_cancel_f64(long j);

    public final native void ffi_compliance_rust_future_cancel_i16(long j);

    public final native void ffi_compliance_rust_future_cancel_i32(long j);

    public final native void ffi_compliance_rust_future_cancel_i64(long j);

    public final native void ffi_compliance_rust_future_cancel_i8(long j);

    public final native void ffi_compliance_rust_future_cancel_rust_buffer(long j);

    public final native void ffi_compliance_rust_future_cancel_u16(long j);

    public final native void ffi_compliance_rust_future_cancel_u32(long j);

    public final native void ffi_compliance_rust_future_cancel_u64(long j);

    public final native void ffi_compliance_rust_future_cancel_u8(long j);

    public final native void ffi_compliance_rust_future_cancel_void(long j);

    public final native float ffi_compliance_rust_future_complete_f32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native double ffi_compliance_rust_future_complete_f64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_compliance_rust_future_complete_i16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_compliance_rust_future_complete_i32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_compliance_rust_future_complete_i64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_compliance_rust_future_complete_i8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_compliance_rust_future_complete_rust_buffer(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_compliance_rust_future_complete_u16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_compliance_rust_future_complete_u32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_compliance_rust_future_complete_u64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_compliance_rust_future_complete_u8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_compliance_rust_future_complete_void(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_compliance_rust_future_free_f32(long j);

    public final native void ffi_compliance_rust_future_free_f64(long j);

    public final native void ffi_compliance_rust_future_free_i16(long j);

    public final native void ffi_compliance_rust_future_free_i32(long j);

    public final native void ffi_compliance_rust_future_free_i64(long j);

    public final native void ffi_compliance_rust_future_free_i8(long j);

    public final native void ffi_compliance_rust_future_free_rust_buffer(long j);

    public final native void ffi_compliance_rust_future_free_u16(long j);

    public final native void ffi_compliance_rust_future_free_u32(long j);

    public final native void ffi_compliance_rust_future_free_u64(long j);

    public final native void ffi_compliance_rust_future_free_u8(long j);

    public final native void ffi_compliance_rust_future_free_void(long j);

    public final native void ffi_compliance_rust_future_poll_f32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_compliance_rust_future_poll_f64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_compliance_rust_future_poll_i16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_compliance_rust_future_poll_i32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_compliance_rust_future_poll_i64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_compliance_rust_future_poll_i8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_compliance_rust_future_poll_rust_buffer(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_compliance_rust_future_poll_u16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_compliance_rust_future_poll_u32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_compliance_rust_future_poll_u64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_compliance_rust_future_poll_u8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_compliance_rust_future_poll_void(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native RustBuffer.ByValue ffi_compliance_rustbuffer_alloc(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_compliance_rustbuffer_free(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_compliance_rustbuffer_from_bytes(@NotNull ForeignBytes.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_compliance_rustbuffer_reserve(@NotNull RustBuffer.ByValue byValue, long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_compliance_fn_clone_gyroblurdetector(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_compliance_fn_clone_idscancallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_compliance_fn_clone_idscandebugbridge(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_compliance_fn_clone_idscanorchestratorbridge(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_compliance_fn_constructor_gyroblurdetector_create(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_compliance_fn_constructor_gyroblurdetector_create_with_config(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_compliance_fn_constructor_idscandebugbridge_create(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_compliance_fn_constructor_idscanorchestratorbridge_new(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_compliance_fn_constructor_idscanorchestratorbridge_new_with_config(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_free_gyroblurdetector(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_free_idscancallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_free_idscandebugbridge(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_free_idscanorchestratorbridge(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_compliance_fn_func_register_opencv_functions(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_compliance_fn_func_register_opencv_jni_functions(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_init_callback_vtable_idscancallback(@NotNull UniffiVTableCallbackInterfaceIdScanCallback uniffiVTableCallbackInterfaceIdScanCallback);

    public final native void uniffi_compliance_fn_method_gyroblurdetector_add_sample(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_compliance_fn_method_gyroblurdetector_estimate_motion_blur(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_compliance_fn_method_gyroblurdetector_get_current_motion_blur(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_method_gyroblurdetector_mark_exposure_start(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_method_gyroblurdetector_reset(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_method_gyroblurdetector_set_config(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_method_idscancallback_on_autofocus(long j, float f, float f2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_method_idscancallback_on_complete(long j, double d, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_method_idscancallback_on_debug_data(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_method_idscancallback_on_frame_response(long j, int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_method_idscancallback_on_frame_selected(long j, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_compliance_fn_method_idscandebugbridge_analyze_blur_fusion_benchmark(long j, long j2, double d, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_compliance_fn_method_idscandebugbridge_analyze_blur_fusion_handle(long j, long j2, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_compliance_fn_method_idscandebugbridge_analyze_blur_fusion_with_gyro(long j, long j2, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_compliance_fn_method_idscandebugbridge_analyze_blur_handle(long j, long j2, double d, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_compliance_fn_method_idscandebugbridge_analyze_brightness_handle(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_compliance_fn_method_idscandebugbridge_analyze_glare_enhanced_handle(long j, long j2, @NotNull RustBuffer.ByValue byValue, double d, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_compliance_fn_method_idscandebugbridge_analyze_glare_legacy_handle(long j, long j2, byte b, double d, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native double uniffi_compliance_fn_method_idscandebugbridge_analyze_smd_handle(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_compliance_fn_method_idscandebugbridge_detect_card_angle_handle(long j, long j2, int i, int i2, float f, float f2, int i3, int i4, int i5, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_compliance_fn_method_idscandebugbridge_detect_edge_handle(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int uniffi_compliance_fn_method_idscandebugbridge_detect_glare_split_handle(long j, long j2, int i, byte b, byte b2, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_method_idscandebugbridge_free_mat_handle(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_compliance_fn_method_idscandebugbridge_get_config_summary(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_compliance_fn_method_idscandebugbridge_get_default_thresholds(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_compliance_fn_method_idscandebugbridge_get_raw_remote_config(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_compliance_fn_method_idscandebugbridge_get_remote_scan_config(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_compliance_fn_method_idscandebugbridge_glare_step1_blur_handle(long j, long j2, int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_compliance_fn_method_idscandebugbridge_glare_step2_resize_handle(long j, long j2, int i, int i2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_compliance_fn_method_idscandebugbridge_glare_step3_brightness_handle(long j, long j2, int i, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_compliance_fn_method_idscandebugbridge_glare_step4_saturation_handle(long j, long j2, int i, int i2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_compliance_fn_method_idscandebugbridge_glare_step5_combined_handle(long j, long j2, long j3, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_compliance_fn_method_idscandebugbridge_glare_step6_morphological_handle(long j, long j2, int i, int i2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_compliance_fn_method_idscandebugbridge_is_remote_config_loaded(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_compliance_fn_method_idscandebugbridge_run_glare_check(long j, long j2, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native float uniffi_compliance_fn_method_idscanorchestratorbridge_get_output_padding_ratio(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int uniffi_compliance_fn_method_idscanorchestratorbridge_get_success_count(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_compliance_fn_method_idscanorchestratorbridge_is_analyzer_enabled(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_method_idscanorchestratorbridge_on_autofocus_completed_with_retry(long j, byte b, long j2, byte b2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_method_idscanorchestratorbridge_on_frame_submitted(long j, byte b, byte b2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_method_idscanorchestratorbridge_on_frame_with_handles(long j, int i, long j2, long j3, byte b, byte b2, byte b3, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_method_idscanorchestratorbridge_on_gyro_sample(long j, double d, double d2, double d3, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_method_idscanorchestratorbridge_on_mlkit_failure(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_method_idscanorchestratorbridge_on_real_shake_detected(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_method_idscanorchestratorbridge_on_refocus_requested(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_method_idscanorchestratorbridge_pause_analyzer(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_compliance_fn_method_idscanorchestratorbridge_pre_check_coordinates(long j, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_method_idscanorchestratorbridge_register_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_method_idscanorchestratorbridge_reset_gyro(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_method_idscanorchestratorbridge_resume_analyzer(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_method_idscanorchestratorbridge_send_platform_event(long j, @NotNull RustBuffer.ByValue byValue, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_method_idscanorchestratorbridge_set_debug_mode(long j, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_method_idscanorchestratorbridge_start(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_compliance_fn_method_idscanorchestratorbridge_stop(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    private UniffiLib() {
    }

    static {
        UniffiLib uniffiLib = new UniffiLib();
        INSTANCE = uniffiLib;
        CLEANER$delegate = C56392yDr.copydefault(new Function0() { // from class: o.Azh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UniffiLib.CLEANER_delegate$lambda$0();
            }
        });
        String strFindLibraryName = C60173zxj.findLibraryName("compliance");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        Native.register((Class<?>) UniffiLib.class, C60173zxj.findLibraryName("compliance"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        uniffiCallbackInterfaceIDScanCallback.INSTANCE.OLrzqt(uniffiLib);
        $stable = 8;
    }

    public final InterfaceC60177zxn AEQbTJ() {
        return (InterfaceC60177zxn) CLEANER$delegate.getValue();
    }

    public static final InterfaceC60177zxn CLEANER_delegate$lambda$0() {
        return C60173zxj.create(InterfaceC60177zxn.Companion);
    }
}
