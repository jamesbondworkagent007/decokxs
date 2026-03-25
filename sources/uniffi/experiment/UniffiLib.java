package uniffi.experiment;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.BfS;
import o.C56392yDr;
import o.C60173zxj;
import o.InterfaceC56387yDm;
import o.InterfaceC60177zxn;
import org.jetbrains.annotations.NotNull;
import uniffi.ForeignBytes;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.UniffiRustFutureContinuationCallback;
import uniffi.experiment.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public final class UniffiLib {
    public static final int $stable;
    public static final InterfaceC56387yDm CLEANER$delegate;
    public static final UniffiLib INSTANCE;

    public final native void ffi_experiment_rust_future_cancel_f32(long j);

    public final native void ffi_experiment_rust_future_cancel_f64(long j);

    public final native void ffi_experiment_rust_future_cancel_i16(long j);

    public final native void ffi_experiment_rust_future_cancel_i32(long j);

    public final native void ffi_experiment_rust_future_cancel_i64(long j);

    public final native void ffi_experiment_rust_future_cancel_i8(long j);

    public final native void ffi_experiment_rust_future_cancel_rust_buffer(long j);

    public final native void ffi_experiment_rust_future_cancel_u16(long j);

    public final native void ffi_experiment_rust_future_cancel_u32(long j);

    public final native void ffi_experiment_rust_future_cancel_u64(long j);

    public final native void ffi_experiment_rust_future_cancel_u8(long j);

    public final native void ffi_experiment_rust_future_cancel_void(long j);

    public final native float ffi_experiment_rust_future_complete_f32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native double ffi_experiment_rust_future_complete_f64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_experiment_rust_future_complete_i16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_experiment_rust_future_complete_i32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_experiment_rust_future_complete_i64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_experiment_rust_future_complete_i8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_experiment_rust_future_complete_rust_buffer(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_experiment_rust_future_complete_u16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_experiment_rust_future_complete_u32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_experiment_rust_future_complete_u64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_experiment_rust_future_complete_u8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_experiment_rust_future_complete_void(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_experiment_rust_future_free_f32(long j);

    public final native void ffi_experiment_rust_future_free_f64(long j);

    public final native void ffi_experiment_rust_future_free_i16(long j);

    public final native void ffi_experiment_rust_future_free_i32(long j);

    public final native void ffi_experiment_rust_future_free_i64(long j);

    public final native void ffi_experiment_rust_future_free_i8(long j);

    public final native void ffi_experiment_rust_future_free_rust_buffer(long j);

    public final native void ffi_experiment_rust_future_free_u16(long j);

    public final native void ffi_experiment_rust_future_free_u32(long j);

    public final native void ffi_experiment_rust_future_free_u64(long j);

    public final native void ffi_experiment_rust_future_free_u8(long j);

    public final native void ffi_experiment_rust_future_free_void(long j);

    public final native void ffi_experiment_rust_future_poll_f32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_experiment_rust_future_poll_f64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_experiment_rust_future_poll_i16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_experiment_rust_future_poll_i32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_experiment_rust_future_poll_i64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_experiment_rust_future_poll_i8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_experiment_rust_future_poll_rust_buffer(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_experiment_rust_future_poll_u16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_experiment_rust_future_poll_u32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_experiment_rust_future_poll_u64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_experiment_rust_future_poll_u8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_experiment_rust_future_poll_void(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native RustBuffer.ByValue ffi_experiment_rustbuffer_alloc(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_experiment_rustbuffer_free(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_experiment_rustbuffer_from_bytes(@NotNull ForeignBytes.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_experiment_rustbuffer_reserve(@NotNull RustBuffer.ByValue byValue, long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_experiment_fn_clone_abtestfactory(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_experiment_fn_clone_featureupdatehandler(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_experiment_fn_clone_feedbackinterface(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_experiment_fn_clone_feedbackservice(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_experiment_fn_clone_okrustfutureapiresultwithfetchallfeatureserror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_experiment_fn_clone_okrustfuturefeatureinfowithqueryfeatureinfoerror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_experiment_fn_clone_publicbetaservice(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_experiment_fn_constructor_feedbackservice_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_experiment_fn_constructor_publicbetaservice_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_experiment_fn_free_abtestfactory(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_experiment_fn_free_featureupdatehandler(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_experiment_fn_free_feedbackinterface(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_experiment_fn_free_feedbackservice(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_experiment_fn_free_okrustfutureapiresultwithfetchallfeatureserror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_experiment_fn_free_okrustfuturefeatureinfowithqueryfeatureinfoerror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_experiment_fn_free_publicbetaservice(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_experiment_fn_func_notify_abtest_updated(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_experiment_fn_func_register_abtest_factory(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_experiment_fn_func_register_feedback_client(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_experiment_fn_init_callback_vtable_abtestfactory(@NotNull UniffiVTableCallbackInterfaceAbTestFactory uniffiVTableCallbackInterfaceAbTestFactory);

    public final native void uniffi_experiment_fn_init_callback_vtable_featureupdatehandler(@NotNull UniffiVTableCallbackInterfaceFeatureUpdateHandler uniffiVTableCallbackInterfaceFeatureUpdateHandler);

    public final native void uniffi_experiment_fn_init_callback_vtable_feedbackinterface(@NotNull UniffiVTableCallbackInterfaceFeedbackInterface uniffiVTableCallbackInterfaceFeedbackInterface);

    public final native RustBuffer.ByValue uniffi_experiment_fn_method_abtestfactory_get_payload(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_experiment_fn_method_abtestfactory_get_payload_with_enterprise_override(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_experiment_fn_method_featureupdatehandler_on_feature_updated(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_experiment_fn_method_feedbackinterface_disable_monitor_shaking(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_experiment_fn_method_feedbackinterface_enable_monitor_shaking(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_experiment_fn_method_feedbackservice_enable_monitor_shaking_if_needed(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_experiment_fn_method_feedbackservice_increase_shaking_times(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_experiment_fn_method_feedbackservice_is_shaking_feedback_available(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_experiment_fn_method_okrustfutureapiresultwithfetchallfeatureserror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_experiment_fn_method_okrustfutureapiresultwithfetchallfeatureserror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_experiment_fn_method_okrustfutureapiresultwithfetchallfeatureserror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_experiment_fn_method_okrustfutureapiresultwithfetchallfeatureserror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_experiment_fn_method_okrustfutureapiresultwithfetchallfeatureserror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_experiment_fn_method_okrustfutureapiresultwithfetchallfeatureserror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_experiment_fn_method_okrustfuturefeatureinfowithqueryfeatureinfoerror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_experiment_fn_method_okrustfuturefeatureinfowithqueryfeatureinfoerror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_experiment_fn_method_okrustfuturefeatureinfowithqueryfeatureinfoerror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_experiment_fn_method_okrustfuturefeatureinfowithqueryfeatureinfoerror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_experiment_fn_method_okrustfuturefeatureinfowithqueryfeatureinfoerror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_experiment_fn_method_okrustfuturefeatureinfowithqueryfeatureinfoerror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_experiment_fn_method_publicbetaservice_clear_all_features_cache(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_experiment_fn_method_publicbetaservice_fetch_all_features(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_experiment_fn_method_publicbetaservice_get_feature_variant(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_experiment_fn_method_publicbetaservice_query_feature_info(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_experiment_fn_method_publicbetaservice_register_feature_updates(long j, long j2, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_experiment_fn_method_publicbetaservice_unregister_feature_updates(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    private UniffiLib() {
    }

    static {
        UniffiLib uniffiLib = new UniffiLib();
        INSTANCE = uniffiLib;
        CLEANER$delegate = C56392yDr.copydefault(new Function0() { // from class: o.AJG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UniffiLib.CLEANER_delegate$lambda$0();
            }
        });
        String strFindLibraryName = C60173zxj.findLibraryName("experiment");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        Native.register((Class<?>) UniffiLib.class, C60173zxj.findLibraryName("experiment"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        uniffiCallbackInterfaceABTestFactory.INSTANCE.AEQbTJ(uniffiLib);
        uniffiCallbackInterfaceFeatureUpdateHandler.INSTANCE.EZpvd(uniffiLib);
        uniffiCallbackInterfaceFeedbackInterface.INSTANCE.copydefault(uniffiLib);
        BfS.uniffiEnsureInitialized();
        $stable = 8;
    }

    public final InterfaceC60177zxn KWHzl() {
        return (InterfaceC60177zxn) CLEANER$delegate.getValue();
    }

    public static final InterfaceC60177zxn CLEANER_delegate$lambda$0() {
        return C60173zxj.create(InterfaceC60177zxn.Companion);
    }
}
