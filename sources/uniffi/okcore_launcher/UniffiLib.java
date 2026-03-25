package uniffi.okcore_launcher;

import com.sun.jna.Native;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.C60173zxj;
import org.jetbrains.annotations.NotNull;
import uniffi.ForeignBytes;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.UniffiRustFutureContinuationCallback;

/* JADX INFO: loaded from: classes13.dex */
public final class UniffiLib {
    public static final int $stable = 0;
    public static final UniffiLib INSTANCE = new UniffiLib();

    public final native void ffi_okcore_launcher_rust_future_cancel_f32(long j);

    public final native void ffi_okcore_launcher_rust_future_cancel_f64(long j);

    public final native void ffi_okcore_launcher_rust_future_cancel_i16(long j);

    public final native void ffi_okcore_launcher_rust_future_cancel_i32(long j);

    public final native void ffi_okcore_launcher_rust_future_cancel_i64(long j);

    public final native void ffi_okcore_launcher_rust_future_cancel_i8(long j);

    public final native void ffi_okcore_launcher_rust_future_cancel_rust_buffer(long j);

    public final native void ffi_okcore_launcher_rust_future_cancel_u16(long j);

    public final native void ffi_okcore_launcher_rust_future_cancel_u32(long j);

    public final native void ffi_okcore_launcher_rust_future_cancel_u64(long j);

    public final native void ffi_okcore_launcher_rust_future_cancel_u8(long j);

    public final native void ffi_okcore_launcher_rust_future_cancel_void(long j);

    public final native float ffi_okcore_launcher_rust_future_complete_f32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native double ffi_okcore_launcher_rust_future_complete_f64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_okcore_launcher_rust_future_complete_i16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_okcore_launcher_rust_future_complete_i32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_okcore_launcher_rust_future_complete_i64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_okcore_launcher_rust_future_complete_i8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_okcore_launcher_rust_future_complete_rust_buffer(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native short ffi_okcore_launcher_rust_future_complete_u16(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native int ffi_okcore_launcher_rust_future_complete_u32(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native long ffi_okcore_launcher_rust_future_complete_u64(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native byte ffi_okcore_launcher_rust_future_complete_u8(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_okcore_launcher_rust_future_complete_void(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_okcore_launcher_rust_future_free_f32(long j);

    public final native void ffi_okcore_launcher_rust_future_free_f64(long j);

    public final native void ffi_okcore_launcher_rust_future_free_i16(long j);

    public final native void ffi_okcore_launcher_rust_future_free_i32(long j);

    public final native void ffi_okcore_launcher_rust_future_free_i64(long j);

    public final native void ffi_okcore_launcher_rust_future_free_i8(long j);

    public final native void ffi_okcore_launcher_rust_future_free_rust_buffer(long j);

    public final native void ffi_okcore_launcher_rust_future_free_u16(long j);

    public final native void ffi_okcore_launcher_rust_future_free_u32(long j);

    public final native void ffi_okcore_launcher_rust_future_free_u64(long j);

    public final native void ffi_okcore_launcher_rust_future_free_u8(long j);

    public final native void ffi_okcore_launcher_rust_future_free_void(long j);

    public final native void ffi_okcore_launcher_rust_future_poll_f32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_okcore_launcher_rust_future_poll_f64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_okcore_launcher_rust_future_poll_i16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_okcore_launcher_rust_future_poll_i32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_okcore_launcher_rust_future_poll_i64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_okcore_launcher_rust_future_poll_i8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_okcore_launcher_rust_future_poll_rust_buffer(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_okcore_launcher_rust_future_poll_u16(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_okcore_launcher_rust_future_poll_u32(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_okcore_launcher_rust_future_poll_u64(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_okcore_launcher_rust_future_poll_u8(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native void ffi_okcore_launcher_rust_future_poll_void(long j, @NotNull UniffiRustFutureContinuationCallback uniffiRustFutureContinuationCallback, long j2);

    public final native RustBuffer.ByValue ffi_okcore_launcher_rustbuffer_alloc(long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void ffi_okcore_launcher_rustbuffer_free(@NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_okcore_launcher_rustbuffer_from_bytes(@NotNull ForeignBytes.ByValue byValue, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native RustBuffer.ByValue ffi_okcore_launcher_rustbuffer_reserve(@NotNull RustBuffer.ByValue byValue, long j, @NotNull UniffiRustCallStatus uniffiRustCallStatus);

    public final native void uniffi_okcore_launcher_fn_func_okcore_launch_init(@NotNull UniffiRustCallStatus uniffiRustCallStatus);

    private UniffiLib() {
    }

    static {
        String strFindLibraryName = C60173zxj.findLibraryName("okcore_launcher");
        Function2<String, Class<?>, Unit> beforeRegister = C60173zxj.getBeforeRegister();
        if (beforeRegister != null) {
            beforeRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
        Native.register((Class<?>) UniffiLib.class, C60173zxj.findLibraryName("okcore_launcher"));
        Function2<String, Class<?>, Unit> afterRegister = C60173zxj.getAfterRegister();
        if (afterRegister != null) {
            afterRegister.invoke(strFindLibraryName, UniffiLib.class);
        }
    }
}
