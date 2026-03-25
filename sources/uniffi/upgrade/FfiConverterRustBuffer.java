package uniffi.upgrade;

import kotlin.jvm.internal.Intrinsics;
import o.BuB;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterRustBuffer;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes14.dex */
public interface FfiConverterRustBuffer<T> extends BaseFfiConverterRustBuffer<T> {
    @Override // uniffi.FfiConverter
    RustBuffer getRustBuffer();

    public static final class DefaultImpls {
        public static <T> T lift(@NotNull FfiConverterRustBuffer<T> ffiConverterRustBuffer, @NotNull RustBuffer.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            return (T) BaseFfiConverterRustBuffer.DefaultImpls.lift(ffiConverterRustBuffer, byValue);
        }

        public static <T> T liftFromRustBuffer(@NotNull FfiConverterRustBuffer<T> ffiConverterRustBuffer, @NotNull RustBuffer.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            return (T) BaseFfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(ffiConverterRustBuffer, byValue);
        }

        public static <T> RustBuffer.ByValue lower(@NotNull FfiConverterRustBuffer<T> ffiConverterRustBuffer, T t) {
            return BaseFfiConverterRustBuffer.DefaultImpls.lower(ffiConverterRustBuffer, t);
        }

        public static <T> RustBuffer.ByValue lowerIntoRustBuffer(@NotNull FfiConverterRustBuffer<T> ffiConverterRustBuffer, T t) {
            return BaseFfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(ffiConverterRustBuffer, t);
        }

        public static <T> RustBuffer getRustBuffer(@NotNull FfiConverterRustBuffer<T> ffiConverterRustBuffer) {
            return BuB.uniffiRustBuffer;
        }
    }
}
