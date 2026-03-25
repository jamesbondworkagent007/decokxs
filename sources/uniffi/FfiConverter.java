package uniffi;

import com.sun.jna.Pointer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public interface FfiConverter<KotlinType, FfiType> {
    /* JADX INFO: renamed from: allocationSize-I7RO_PI */
    long mo9529allocationSizeI7RO_PI(KotlinType kotlintype);

    RustBuffer getRustBuffer();

    /* JADX INFO: renamed from: lift */
    KotlinType lift2(FfiType ffitype);

    KotlinType liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue);

    /* JADX INFO: renamed from: lower */
    FfiType lower2(KotlinType kotlintype);

    RustBuffer.ByValue lowerIntoRustBuffer(KotlinType kotlintype);

    KotlinType read(@NotNull ByteBuffer byteBuffer);

    void write(KotlinType kotlintype, @NotNull ByteBuffer byteBuffer);

    public static final class DefaultImpls {
        public static <KotlinType, FfiType> RustBuffer.ByValue lowerIntoRustBuffer(@NotNull FfiConverter<KotlinType, FfiType> ffiConverter, KotlinType kotlintype) {
            RustBuffer.ByValue byValueM9575allocVKZWuLQ = ffiConverter.getRustBuffer().m9575allocVKZWuLQ(ffiConverter.mo9529allocationSizeI7RO_PI(kotlintype));
            try {
                Pointer pointer = byValueM9575allocVKZWuLQ.data;
                Intrinsics.copydefault(pointer);
                ByteBuffer byteBuffer = pointer.getByteBuffer(0L, byValueM9575allocVKZWuLQ.capacity);
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                Intrinsics.copydefault(byteBuffer);
                ffiConverter.write(kotlintype, byteBuffer);
                byValueM9575allocVKZWuLQ.writeField("len", Long.valueOf(byteBuffer.position()));
                return byValueM9575allocVKZWuLQ;
            } catch (Throwable th) {
                ffiConverter.getRustBuffer().free(byValueM9575allocVKZWuLQ);
                throw th;
            }
        }

        public static <KotlinType, FfiType> KotlinType liftFromRustBuffer(@NotNull FfiConverter<KotlinType, FfiType> ffiConverter, @NotNull RustBuffer.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            ByteBuffer byteBufferAsByteBuffer = byValue.asByteBuffer();
            Intrinsics.copydefault(byteBufferAsByteBuffer);
            try {
                KotlinType kotlintype = ffiConverter.read(byteBufferAsByteBuffer);
                if (byteBufferAsByteBuffer.hasRemaining()) {
                    throw new RuntimeException("junk remaining in buffer after lifting, something is very wrong!!");
                }
                return kotlintype;
            } finally {
                ffiConverter.getRustBuffer().free(byValue);
            }
        }
    }
}
