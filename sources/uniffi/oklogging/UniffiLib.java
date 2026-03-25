package uniffi.oklogging;

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
import uniffi.oklogging.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public final class UniffiLib {
    public static final int $stable;
    public static final InterfaceC56387yDm CLEANER$delegate;
    public static final UniffiLib INSTANCE;

    public final native void ffi_oklogging_rust_future_cancel_f32(long j);

    public final native void ffi_oklogging_rust_future_cancel_f64(long j);

    public final native void ffi_oklogging_rust_future_cancel_i16(long j);

    public final native void ffi_oklogging_rust_future_cancel_i32(long j);

    public final native void ffi_oklogging_rust_future_cancel_i64(long j);

    public final native void ffi_oklogging_rust_future_cancel_i8(long j);

    public final native void ffi_oklogging_rust_future_cancel_rust_buffer(long j);

    public final native void ffi_oklogging_rust_future_cancel_u16(long j);

    public final native void ffi_oklogging_rust_future_cancel_u32(long j);

    public final native void ffi_oklogging_rust_future_cancel_u64(long j);

    public final native void ffi_oklogging_rust_future_cancel_u8(long j);

    public final native void ffi_oklogging_rust_future_cancel_void(long j);

    public final native float ffi_oklogging_rust_future_complete_f32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native double ffi_oklogging_rust_future_complete_f64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_oklogging_rust_future_complete_i16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_oklogging_rust_future_complete_i32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_oklogging_rust_future_complete_i64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_oklogging_rust_future_complete_i8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_oklogging_rust_future_complete_rust_buffer(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_oklogging_rust_future_complete_u16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_oklogging_rust_future_complete_u32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_oklogging_rust_future_complete_u64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_oklogging_rust_future_complete_u8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_oklogging_rust_future_complete_void(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_oklogging_rust_future_free_f32(long j);

    public final native void ffi_oklogging_rust_future_free_f64(long j);

    public final native void ffi_oklogging_rust_future_free_i16(long j);

    public final native void ffi_oklogging_rust_future_free_i32(long j);

    public final native void ffi_oklogging_rust_future_free_i64(long j);

    public final native void ffi_oklogging_rust_future_free_i8(long j);

    public final native void ffi_oklogging_rust_future_free_rust_buffer(long j);

    public final native void ffi_oklogging_rust_future_free_u16(long j);

    public final native void ffi_oklogging_rust_future_free_u32(long j);

    public final native void ffi_oklogging_rust_future_free_u64(long j);

    public final native void ffi_oklogging_rust_future_free_u8(long j);

    public final native void ffi_oklogging_rust_future_free_void(long j);

    public final native void ffi_oklogging_rust_future_poll_f32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_oklogging_rust_future_poll_f64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_oklogging_rust_future_poll_i16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_oklogging_rust_future_poll_i32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_oklogging_rust_future_poll_i64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_oklogging_rust_future_poll_i8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_oklogging_rust_future_poll_rust_buffer(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_oklogging_rust_future_poll_u16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_oklogging_rust_future_poll_u32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_oklogging_rust_future_poll_u64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_oklogging_rust_future_poll_u8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_oklogging_rust_future_poll_void(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native RustBuffer.ByValue ffi_oklogging_rustbuffer_alloc(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_oklogging_rustbuffer_free(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_oklogging_rustbuffer_from_bytes(@NotNull ForeignBytes.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_oklogging_rustbuffer_reserve(@NotNull RustBuffer.ByValue byValue, long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long uniffi_oklogging_fn_clone_platformlogger(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_oklogging_fn_free_platformlogger(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_oklogging_fn_func_register_platform_logger(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_oklogging_fn_init_callback_vtable_platformlogger(@NotNull UniffiVTableCallbackInterfacePlatformLogger uniffiVTableCallbackInterfacePlatformLogger);

    public final native void uniffi_oklogging_fn_method_platformlogger_write_log(long j, int i, @NotNull RustBuffer.ByValue byValue, @NotNull RustBuffer.ByValue byValue2, @NotNull RustBuffer.ByValue byValue3, int i2, @NotNull RustBuffer.ByValue byValue4, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    private UniffiLib() {
    }

    static {
        UniffiLib uniffiLib = new UniffiLib();
        INSTANCE = uniffiLib;
        CLEANER$delegate = C56392yDr.copydefault(new Function0() { // from class: o.Bgh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UniffiLib.CLEANER_delegate$lambda$0();
            }
        });
        String strFindLibraryName = C60173zxj.findLibraryName("oklogging");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        Native.register((Class<?>) UniffiLib.class, C60173zxj.findLibraryName("oklogging"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        uniffiCallbackInterfacePlatformLogger.INSTANCE.KWHzl(uniffiLib);
        $stable = 8;
    }

    public final InterfaceC60177zxn OLrzqt() {
        return (InterfaceC60177zxn) CLEANER$delegate.getValue();
    }

    public static final InterfaceC60177zxn CLEANER_delegate$lambda$0() {
        return C60173zxj.create(InterfaceC60177zxn.Companion);
    }
}
