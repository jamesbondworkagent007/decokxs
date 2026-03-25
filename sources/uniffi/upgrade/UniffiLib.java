package uniffi.upgrade;

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
import uniffi.upgrade.UniffiLib;

/* JADX INFO: loaded from: classes14.dex */
public final class UniffiLib {
    public static final int $stable;
    public static final InterfaceC56387yDm CLEANER$delegate;
    public static final UniffiLib INSTANCE;

    public final native void ffi_upgrade_rust_future_cancel_f32(long j);

    public final native void ffi_upgrade_rust_future_cancel_f64(long j);

    public final native void ffi_upgrade_rust_future_cancel_i16(long j);

    public final native void ffi_upgrade_rust_future_cancel_i32(long j);

    public final native void ffi_upgrade_rust_future_cancel_i64(long j);

    public final native void ffi_upgrade_rust_future_cancel_i8(long j);

    public final native void ffi_upgrade_rust_future_cancel_rust_buffer(long j);

    public final native void ffi_upgrade_rust_future_cancel_u16(long j);

    public final native void ffi_upgrade_rust_future_cancel_u32(long j);

    public final native void ffi_upgrade_rust_future_cancel_u64(long j);

    public final native void ffi_upgrade_rust_future_cancel_u8(long j);

    public final native void ffi_upgrade_rust_future_cancel_void(long j);

    public final native float ffi_upgrade_rust_future_complete_f32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native double ffi_upgrade_rust_future_complete_f64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_upgrade_rust_future_complete_i16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_upgrade_rust_future_complete_i32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_upgrade_rust_future_complete_i64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_upgrade_rust_future_complete_i8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_upgrade_rust_future_complete_rust_buffer(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_upgrade_rust_future_complete_u16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_upgrade_rust_future_complete_u32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_upgrade_rust_future_complete_u64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_upgrade_rust_future_complete_u8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_upgrade_rust_future_complete_void(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_upgrade_rust_future_free_f32(long j);

    public final native void ffi_upgrade_rust_future_free_f64(long j);

    public final native void ffi_upgrade_rust_future_free_i16(long j);

    public final native void ffi_upgrade_rust_future_free_i32(long j);

    public final native void ffi_upgrade_rust_future_free_i64(long j);

    public final native void ffi_upgrade_rust_future_free_i8(long j);

    public final native void ffi_upgrade_rust_future_free_rust_buffer(long j);

    public final native void ffi_upgrade_rust_future_free_u16(long j);

    public final native void ffi_upgrade_rust_future_free_u32(long j);

    public final native void ffi_upgrade_rust_future_free_u64(long j);

    public final native void ffi_upgrade_rust_future_free_u8(long j);

    public final native void ffi_upgrade_rust_future_free_void(long j);

    public final native void ffi_upgrade_rust_future_poll_f32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_upgrade_rust_future_poll_f64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_upgrade_rust_future_poll_i16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_upgrade_rust_future_poll_i32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_upgrade_rust_future_poll_i64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_upgrade_rust_future_poll_i8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_upgrade_rust_future_poll_rust_buffer(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_upgrade_rust_future_poll_u16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_upgrade_rust_future_poll_u32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_upgrade_rust_future_poll_u64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_upgrade_rust_future_poll_u8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_upgrade_rust_future_poll_void(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native RustBuffer.ByValue ffi_upgrade_rustbuffer_alloc(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_upgrade_rustbuffer_free(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_upgrade_rustbuffer_from_bytes(@NotNull ForeignBytes.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_upgrade_rustbuffer_reserve(@NotNull RustBuffer.ByValue byValue, long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_upgrade_fn_clone_oknativetaskokuserwithgetusererror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_upgrade_fn_clone_okrustfutureokuserwithgetusererror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_upgrade_fn_clone_okrustfutureokuserwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_upgrade_fn_clone_okuserfactory(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_upgrade_fn_clone_upgradecontextinterface(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_upgrade_fn_clone_upgradecore(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_upgrade_fn_free_oknativetaskokuserwithgetusererror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_upgrade_fn_free_okrustfutureokuserwithgetusererror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_upgrade_fn_free_okrustfutureokuserwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_upgrade_fn_free_okuserfactory(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_upgrade_fn_free_upgradecontextinterface(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_upgrade_fn_free_upgradecore(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_upgrade_fn_func_get_user_ffi_error_with_cancel_token(long j);

    public final native long uniffi_upgrade_fn_func_get_user_name(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_upgrade_fn_func_get_user_with_cancel_token(long j);

    public final native long uniffi_upgrade_fn_func_initialize_upgrade_core(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_upgrade_fn_func_register_ok_user_factory(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_upgrade_fn_init_callback_vtable_oknativetaskokuserwithgetusererror(@NotNull UniffiVTableCallbackInterfaceOkNativeTaskOkUserWithGetUserError uniffiVTableCallbackInterfaceOkNativeTaskOkUserWithGetUserError);

    public final native void uniffi_upgrade_fn_init_callback_vtable_okuserfactory(@NotNull UniffiVTableCallbackInterfaceOkUserFactory uniffiVTableCallbackInterfaceOkUserFactory);

    public final native void uniffi_upgrade_fn_init_callback_vtable_upgradecontextinterface(@NotNull UniffiVTableCallbackInterfaceUpgradeContextInterface uniffiVTableCallbackInterfaceUpgradeContextInterface);

    public final native void uniffi_upgrade_fn_method_oknativetaskokuserwithgetusererror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_upgrade_fn_method_oknativetaskokuserwithgetusererror_execute(long j);

    public final native void uniffi_upgrade_fn_method_okrustfutureokuserwithgetusererror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_upgrade_fn_method_okrustfutureokuserwithgetusererror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_upgrade_fn_method_okrustfutureokuserwithgetusererror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_upgrade_fn_method_okrustfutureokuserwithgetusererror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_upgrade_fn_method_okrustfutureokuserwithgetusererror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_upgrade_fn_method_okrustfutureokuserwithgetusererror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_upgrade_fn_method_okrustfutureokuserwithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_upgrade_fn_method_okrustfutureokuserwithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_upgrade_fn_method_okrustfutureokuserwithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_upgrade_fn_method_okrustfutureokuserwithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_upgrade_fn_method_okrustfutureokuserwithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_upgrade_fn_method_okrustfutureokuserwithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_upgrade_fn_method_okuserfactory_create_user_task(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_upgrade_fn_method_upgradecontextinterface_get_app_display_mode(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int uniffi_upgrade_fn_method_upgradecontextinterface_get_app_mode(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_upgrade_fn_method_upgradecontextinterface_get_bundle_id(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_upgrade_fn_method_upgradecore_check_upgrade_async(long j, @NotNull RustBuffer.ByValue byValue);

    public final native void uniffi_upgrade_fn_method_upgradecore_clear_cache_response(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_upgrade_fn_method_upgradecore_clear_poped_flag(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_upgrade_fn_method_upgradecore_get_cached_response(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_upgrade_fn_method_upgradecore_set_debug_cached_response(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_upgrade_fn_method_upgradecore_set_poped_flag(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_upgrade_fn_method_upgradecore_set_upgrade_context(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    private UniffiLib() {
    }

    static {
        UniffiLib uniffiLib = new UniffiLib();
        INSTANCE = uniffiLib;
        CLEANER$delegate = C56392yDr.copydefault(new Function0() { // from class: o.BtX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UniffiLib.CLEANER_delegate$lambda$0();
            }
        });
        String strFindLibraryName = C60173zxj.findLibraryName("upgrade");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        Native.register((Class<?>) UniffiLib.class, C60173zxj.findLibraryName("upgrade"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        uniffiCallbackInterfaceOKNativeTaskOKUserWithGetUserError.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceOKUserFactory.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceUpgradeContextInterface.INSTANCE.EZpvd(uniffiLib);
        BfS.uniffiEnsureInitialized();
        $stable = 8;
    }

    public final InterfaceC60177zxn EZpvd() {
        return (InterfaceC60177zxn) CLEANER$delegate.getValue();
    }

    public static final InterfaceC60177zxn CLEANER_delegate$lambda$0() {
        return C60173zxj.create(InterfaceC60177zxn.Companion);
    }
}
