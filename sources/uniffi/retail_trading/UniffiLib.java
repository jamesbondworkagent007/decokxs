package uniffi.retail_trading;

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
import uniffi.retail_trading.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public final class UniffiLib {
    public static final int $stable;
    public static final InterfaceC56387yDm CLEANER$delegate;
    public static final UniffiLib INSTANCE;

    public final native void ffi_retail_trading_rust_future_cancel_f32(long j);

    public final native void ffi_retail_trading_rust_future_cancel_f64(long j);

    public final native void ffi_retail_trading_rust_future_cancel_i16(long j);

    public final native void ffi_retail_trading_rust_future_cancel_i32(long j);

    public final native void ffi_retail_trading_rust_future_cancel_i64(long j);

    public final native void ffi_retail_trading_rust_future_cancel_i8(long j);

    public final native void ffi_retail_trading_rust_future_cancel_rust_buffer(long j);

    public final native void ffi_retail_trading_rust_future_cancel_u16(long j);

    public final native void ffi_retail_trading_rust_future_cancel_u32(long j);

    public final native void ffi_retail_trading_rust_future_cancel_u64(long j);

    public final native void ffi_retail_trading_rust_future_cancel_u8(long j);

    public final native void ffi_retail_trading_rust_future_cancel_void(long j);

    public final native float ffi_retail_trading_rust_future_complete_f32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native double ffi_retail_trading_rust_future_complete_f64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_retail_trading_rust_future_complete_i16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_retail_trading_rust_future_complete_i32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_retail_trading_rust_future_complete_i64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_retail_trading_rust_future_complete_i8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_retail_trading_rust_future_complete_rust_buffer(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_retail_trading_rust_future_complete_u16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_retail_trading_rust_future_complete_u32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_retail_trading_rust_future_complete_u64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_retail_trading_rust_future_complete_u8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_retail_trading_rust_future_complete_void(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_retail_trading_rust_future_free_f32(long j);

    public final native void ffi_retail_trading_rust_future_free_f64(long j);

    public final native void ffi_retail_trading_rust_future_free_i16(long j);

    public final native void ffi_retail_trading_rust_future_free_i32(long j);

    public final native void ffi_retail_trading_rust_future_free_i64(long j);

    public final native void ffi_retail_trading_rust_future_free_i8(long j);

    public final native void ffi_retail_trading_rust_future_free_rust_buffer(long j);

    public final native void ffi_retail_trading_rust_future_free_u16(long j);

    public final native void ffi_retail_trading_rust_future_free_u32(long j);

    public final native void ffi_retail_trading_rust_future_free_u64(long j);

    public final native void ffi_retail_trading_rust_future_free_u8(long j);

    public final native void ffi_retail_trading_rust_future_free_void(long j);

    public final native void ffi_retail_trading_rust_future_poll_f32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_retail_trading_rust_future_poll_f64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_retail_trading_rust_future_poll_i16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_retail_trading_rust_future_poll_i32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_retail_trading_rust_future_poll_i64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_retail_trading_rust_future_poll_i8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_retail_trading_rust_future_poll_rust_buffer(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_retail_trading_rust_future_poll_u16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_retail_trading_rust_future_poll_u32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_retail_trading_rust_future_poll_u64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_retail_trading_rust_future_poll_u8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_retail_trading_rust_future_poll_void(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native RustBuffer.ByValue ffi_retail_trading_rustbuffer_alloc(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_retail_trading_rustbuffer_free(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_retail_trading_rustbuffer_from_bytes(@NotNull ForeignBytes.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_retail_trading_rustbuffer_reserve(@NotNull RustBuffer.ByValue byValue, long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_trading_fn_clone_dexlistupdatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_trading_fn_clone_okrustfuturedexchaingroupvolistwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_trading_fn_clone_okrustfuturedextokenvolistwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_trading_fn_clone_okrustfuturesearchdexvosresultwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_trading_fn_clone_retaildexbridge(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_trading_fn_clone_retailtradingnativeapi(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_trading_fn_constructor_retaildexbridge_new(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_trading_fn_free_dexlistupdatecallback(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_trading_fn_free_okrustfuturedexchaingroupvolistwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_trading_fn_free_okrustfuturedextokenvolistwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_trading_fn_free_okrustfuturesearchdexvosresultwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_trading_fn_free_retaildexbridge(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_trading_fn_free_retailtradingnativeapi(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_trading_fn_func_register_retail_trading_global_native_api(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_trading_fn_init_callback_vtable_dexlistupdatecallback(@NotNull UniffiVTableCallbackInterfaceDexListUpdateCallback uniffiVTableCallbackInterfaceDexListUpdateCallback);

    public final native void uniffi_retail_trading_fn_init_callback_vtable_retailtradingnativeapi(@NotNull UniffiVTableCallbackInterfaceRetailTradingNativeApi uniffiVTableCallbackInterfaceRetailTradingNativeApi);

    public final native void uniffi_retail_trading_fn_method_dexlistupdatecallback_on_update_dex_list_batched(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_trading_fn_method_dexlistupdatecallback_on_update_dex_list_completed(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_trading_fn_method_dexlistupdatecallback_on_update_dex_list_error(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_trading_fn_method_okrustfuturedexchaingroupvolistwithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_trading_fn_method_okrustfuturedexchaingroupvolistwithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_trading_fn_method_okrustfuturedexchaingroupvolistwithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_trading_fn_method_okrustfuturedexchaingroupvolistwithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_retail_trading_fn_method_okrustfuturedexchaingroupvolistwithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_trading_fn_method_okrustfuturedexchaingroupvolistwithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_trading_fn_method_okrustfuturedextokenvolistwithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_trading_fn_method_okrustfuturedextokenvolistwithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_trading_fn_method_okrustfuturedextokenvolistwithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_trading_fn_method_okrustfuturedextokenvolistwithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_retail_trading_fn_method_okrustfuturedextokenvolistwithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_trading_fn_method_okrustfuturedextokenvolistwithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_trading_fn_method_okrustfuturesearchdexvosresultwithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_trading_fn_method_okrustfuturesearchdexvosresultwithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_trading_fn_method_okrustfuturesearchdexvosresultwithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_trading_fn_method_okrustfuturesearchdexvosresultwithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_retail_trading_fn_method_okrustfuturesearchdexvosresultwithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_trading_fn_method_okrustfuturesearchdexvosresultwithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_trading_fn_method_retaildexbridge_get_and_subscribe_dex_ranking_list(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_trading_fn_method_retaildexbridge_get_dex_chain_group_list(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_trading_fn_method_retaildexbridge_get_dex_ranking_list(long j, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_trading_fn_method_retaildexbridge_get_dex_token_detail(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_trading_fn_method_retaildexbridge_search_dex_ranking_list(long j, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_trading_fn_method_retailtradingnativeapi_get_up_down_time_zone(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    private UniffiLib() {
    }

    static {
        UniffiLib uniffiLib = new UniffiLib();
        INSTANCE = uniffiLib;
        CLEANER$delegate = C56392yDr.copydefault(new Function0() { // from class: o.BlI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UniffiLib.CLEANER_delegate$lambda$0();
            }
        });
        String strFindLibraryName = C60173zxj.findLibraryName("retail_trading");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        Native.register((Class<?>) UniffiLib.class, C60173zxj.findLibraryName("retail_trading"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        uniffiCallbackInterfaceDexListUpdateCallback.INSTANCE.OLrzqt(uniffiLib);
        uniffiCallbackInterfaceRetailTradingNativeApi.INSTANCE.OLrzqt(uniffiLib);
        BfS.uniffiEnsureInitialized();
        $stable = 8;
    }

    public final InterfaceC60177zxn copydefault() {
        return (InterfaceC60177zxn) CLEANER$delegate.getValue();
    }

    public static final InterfaceC60177zxn CLEANER_delegate$lambda$0() {
        return C60173zxj.create(InterfaceC60177zxn.Companion);
    }
}
