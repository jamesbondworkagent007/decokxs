package uniffi;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC60182zxs;
import org.jetbrains.annotations.NotNull;
import uniffi.FfiConverterTypeLong;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseFfiConverterTypeLong<T extends AbstractC60182zxs> implements FfiConverterTypeLong<T> {
    public static final int $stable = 8;
    private final RustBuffer rustBuffer;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return this.rustBuffer;
    }

    public BaseFfiConverterTypeLong(@NotNull RustBuffer rustBuffer) {
        Intrinsics.checkNotNullParameter(rustBuffer, "");
        this.rustBuffer = rustBuffer;
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverterTypeLong, uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull T t) {
        return FfiConverterTypeLong.DefaultImpls.m9571allocationSizeI7RO_PI(this, t);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public T liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (T) FfiConverterTypeLong.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull T t) {
        return FfiConverterTypeLong.DefaultImpls.lowerIntoRustBuffer(this, t);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverterTypeLong, uniffi.FfiConverter
    public T read(@NotNull ByteBuffer byteBuffer) {
        return (T) FfiConverterTypeLong.DefaultImpls.read(this, byteBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverterTypeLong, uniffi.FfiConverter
    public void write(@NotNull T t, @NotNull ByteBuffer byteBuffer) {
        FfiConverterTypeLong.DefaultImpls.write(this, t, byteBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public Long lower2(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        return Long.valueOf(t.uniffiCloneHandle());
    }
}
