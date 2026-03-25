package uniffi;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.FfiConverter;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public interface FfiConverterTypeLong<T> extends FfiConverter<T, Long> {
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI */
    long mo9529allocationSizeI7RO_PI(@NotNull T t);

    @Override // uniffi.FfiConverter
    T read(@NotNull ByteBuffer byteBuffer);

    @Override // uniffi.FfiConverter
    void write(@NotNull T t, @NotNull ByteBuffer byteBuffer);

    public static final class DefaultImpls {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name */
        public static <T> long m9571allocationSizeI7RO_PI(@NotNull FfiConverterTypeLong<T> ffiConverterTypeLong, @NotNull T t) {
            Intrinsics.checkNotNullParameter(t, "");
            return 8L;
        }

        public static <T> T liftFromRustBuffer(@NotNull FfiConverterTypeLong<T> ffiConverterTypeLong, @NotNull RustBuffer.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            return (T) FfiConverter.DefaultImpls.liftFromRustBuffer(ffiConverterTypeLong, byValue);
        }

        public static <T> RustBuffer.ByValue lowerIntoRustBuffer(@NotNull FfiConverterTypeLong<T> ffiConverterTypeLong, @NotNull T t) {
            Intrinsics.checkNotNullParameter(t, "");
            return FfiConverter.DefaultImpls.lowerIntoRustBuffer(ffiConverterTypeLong, t);
        }

        public static <T> T read(@NotNull FfiConverterTypeLong<T> ffiConverterTypeLong, @NotNull ByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter(byteBuffer, "");
            return ffiConverterTypeLong.lift2(Long.valueOf(byteBuffer.getLong()));
        }

        public static <T> void write(@NotNull FfiConverterTypeLong<T> ffiConverterTypeLong, @NotNull T t, @NotNull ByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter(t, "");
            Intrinsics.checkNotNullParameter(byteBuffer, "");
            byteBuffer.putLong(ffiConverterTypeLong.lower2(t).longValue());
        }
    }
}
