package uniffi.retail_kline;

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
import uniffi.retail_kline.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public final class UniffiLib {
    public static final int $stable;
    public static final InterfaceC56387yDm CLEANER$delegate;
    public static final UniffiLib INSTANCE;

    public final native void ffi_retail_kline_rust_future_cancel_f32(long j);

    public final native void ffi_retail_kline_rust_future_cancel_f64(long j);

    public final native void ffi_retail_kline_rust_future_cancel_i16(long j);

    public final native void ffi_retail_kline_rust_future_cancel_i32(long j);

    public final native void ffi_retail_kline_rust_future_cancel_i64(long j);

    public final native void ffi_retail_kline_rust_future_cancel_i8(long j);

    public final native void ffi_retail_kline_rust_future_cancel_rust_buffer(long j);

    public final native void ffi_retail_kline_rust_future_cancel_u16(long j);

    public final native void ffi_retail_kline_rust_future_cancel_u32(long j);

    public final native void ffi_retail_kline_rust_future_cancel_u64(long j);

    public final native void ffi_retail_kline_rust_future_cancel_u8(long j);

    public final native void ffi_retail_kline_rust_future_cancel_void(long j);

    public final native float ffi_retail_kline_rust_future_complete_f32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native double ffi_retail_kline_rust_future_complete_f64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_retail_kline_rust_future_complete_i16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_retail_kline_rust_future_complete_i32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_retail_kline_rust_future_complete_i64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_retail_kline_rust_future_complete_i8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_retail_kline_rust_future_complete_rust_buffer(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_retail_kline_rust_future_complete_u16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_retail_kline_rust_future_complete_u32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_retail_kline_rust_future_complete_u64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_retail_kline_rust_future_complete_u8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_retail_kline_rust_future_complete_void(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_retail_kline_rust_future_free_f32(long j);

    public final native void ffi_retail_kline_rust_future_free_f64(long j);

    public final native void ffi_retail_kline_rust_future_free_i16(long j);

    public final native void ffi_retail_kline_rust_future_free_i32(long j);

    public final native void ffi_retail_kline_rust_future_free_i64(long j);

    public final native void ffi_retail_kline_rust_future_free_i8(long j);

    public final native void ffi_retail_kline_rust_future_free_rust_buffer(long j);

    public final native void ffi_retail_kline_rust_future_free_u16(long j);

    public final native void ffi_retail_kline_rust_future_free_u32(long j);

    public final native void ffi_retail_kline_rust_future_free_u64(long j);

    public final native void ffi_retail_kline_rust_future_free_u8(long j);

    public final native void ffi_retail_kline_rust_future_free_void(long j);

    public final native void ffi_retail_kline_rust_future_poll_f32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_retail_kline_rust_future_poll_f64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_retail_kline_rust_future_poll_i16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_retail_kline_rust_future_poll_i32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_retail_kline_rust_future_poll_i64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_retail_kline_rust_future_poll_i8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_retail_kline_rust_future_poll_rust_buffer(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_retail_kline_rust_future_poll_u16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_retail_kline_rust_future_poll_u32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_retail_kline_rust_future_poll_u64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_retail_kline_rust_future_poll_u8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_retail_kline_rust_future_poll_void(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native RustBuffer.ByValue ffi_retail_kline_rustbuffer_alloc(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_retail_kline_rustbuffer_free(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_retail_kline_rustbuffer_from_bytes(@NotNull ForeignBytes.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_retail_kline_rustbuffer_reserve(@NotNull RustBuffer.ByValue byValue, long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_kline_fn_clone_marketeventspushlistener(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_kline_fn_clone_marketeventswsmanagerwrapper(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_kline_fn_clone_okrustfuturebuysellmarkerresultwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_kline_fn_clone_okrustfuturecoinnewsresultwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_kline_fn_clone_okrustfutureklineeconeventresultwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_kline_fn_clone_okrustfuturemarketcapresultwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_kline_fn_clone_okrustfuturemarketeventsresultwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_kline_fn_clone_okrustfuturenewscarouselresultwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_kline_fn_free_marketeventspushlistener(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_kline_fn_free_marketeventswsmanagerwrapper(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_kline_fn_free_okrustfuturebuysellmarkerresultwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_kline_fn_free_okrustfuturecoinnewsresultwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_kline_fn_free_okrustfutureklineeconeventresultwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_kline_fn_free_okrustfuturemarketcapresultwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_kline_fn_free_okrustfuturemarketeventsresultwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_kline_fn_free_okrustfuturenewscarouselresultwithokffierror(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_kline_fn_func_create_coin_news_req_cedefi(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, @NotNull RustBuffer.ByValue byValue6, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_kline_fn_func_create_coin_news_req_cefi(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, @NotNull RustBuffer.ByValue byValue6, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_kline_fn_func_create_market_events_ws_manager(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_kline_fn_func_create_news_carousel_req_cedefi(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, @NotNull RustBuffer.ByValue byValue6, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_kline_fn_func_create_news_carousel_req_cefi(@NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, @NotNull RustBuffer.ByValue byValue4, @NotNull RustBuffer.ByValue byValue5, @NotNull RustBuffer.ByValue byValue6, @NotNull RustBuffer.ByValue byValue7, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_kline_fn_func_get_buy_sell_marker(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_kline_fn_func_get_coin_news(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_kline_fn_func_get_economic_calendar_events(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_kline_fn_func_get_market_cap_trend(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_kline_fn_func_get_market_events(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_retail_kline_fn_func_get_news_carousel(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_kline_fn_init_callback_vtable_marketeventspushlistener(@NotNull UniffiVTableCallbackInterfaceMarketEventsPushListener uniffiVTableCallbackInterfaceMarketEventsPushListener);

    public final native void uniffi_retail_kline_fn_method_marketeventspushlistener_on_event_push(long j, byte b, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_retail_kline_fn_method_marketeventswsmanagerwrapper_is_subscribed(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_retail_kline_fn_method_marketeventswsmanagerwrapper_subscribe(long j, @NotNull RustBuffer.ByValue byValue, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_kline_fn_method_marketeventswsmanagerwrapper_unsubscribe(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_kline_fn_method_okrustfuturebuysellmarkerresultwithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_kline_fn_method_okrustfuturebuysellmarkerresultwithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_kline_fn_method_okrustfuturebuysellmarkerresultwithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_kline_fn_method_okrustfuturebuysellmarkerresultwithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_retail_kline_fn_method_okrustfuturebuysellmarkerresultwithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_kline_fn_method_okrustfuturebuysellmarkerresultwithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_kline_fn_method_okrustfuturecoinnewsresultwithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_kline_fn_method_okrustfuturecoinnewsresultwithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_kline_fn_method_okrustfuturecoinnewsresultwithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_kline_fn_method_okrustfuturecoinnewsresultwithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_retail_kline_fn_method_okrustfuturecoinnewsresultwithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_kline_fn_method_okrustfuturecoinnewsresultwithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_kline_fn_method_okrustfutureklineeconeventresultwithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_kline_fn_method_okrustfutureklineeconeventresultwithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_kline_fn_method_okrustfutureklineeconeventresultwithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_kline_fn_method_okrustfutureklineeconeventresultwithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_retail_kline_fn_method_okrustfutureklineeconeventresultwithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_kline_fn_method_okrustfutureklineeconeventresultwithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_kline_fn_method_okrustfuturemarketcapresultwithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_kline_fn_method_okrustfuturemarketcapresultwithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_kline_fn_method_okrustfuturemarketcapresultwithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_kline_fn_method_okrustfuturemarketcapresultwithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_retail_kline_fn_method_okrustfuturemarketcapresultwithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_kline_fn_method_okrustfuturemarketcapresultwithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_kline_fn_method_okrustfuturemarketeventsresultwithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_kline_fn_method_okrustfuturemarketeventsresultwithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_kline_fn_method_okrustfuturemarketeventsresultwithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_kline_fn_method_okrustfuturemarketeventsresultwithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_retail_kline_fn_method_okrustfuturemarketeventsresultwithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_kline_fn_method_okrustfuturemarketeventsresultwithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_kline_fn_method_okrustfuturenewscarouselresultwithokffierror_cancel(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_kline_fn_method_okrustfuturenewscarouselresultwithokffierror_get_error(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_kline_fn_method_okrustfuturenewscarouselresultwithokffierror_get_result_status(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue uniffi_retail_kline_fn_method_okrustfuturenewscarouselresultwithokffierror_get_success_result(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte uniffi_retail_kline_fn_method_okrustfuturenewscarouselresultwithokffierror_is_finished(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_retail_kline_fn_method_okrustfuturenewscarouselresultwithokffierror_start_with_callback(long j, long j2, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    private UniffiLib() {
    }

    static {
        UniffiLib uniffiLib = new UniffiLib();
        INSTANCE = uniffiLib;
        CLEANER$delegate = C56392yDr.copydefault(new Function0() { // from class: o.Bjx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UniffiLib.CLEANER_delegate$lambda$0();
            }
        });
        String strFindLibraryName = C60173zxj.findLibraryName("retail_kline");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        Native.register((Class<?>) UniffiLib.class, C60173zxj.findLibraryName("retail_kline"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        uniffiCallbackInterfaceMarketEventsPushListener.INSTANCE.AEQbTJ(uniffiLib);
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
