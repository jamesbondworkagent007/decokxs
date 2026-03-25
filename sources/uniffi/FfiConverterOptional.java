package uniffi;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterRustBuffer;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public abstract class FfiConverterOptional<T> implements BaseFfiConverterRustBuffer<T> {
    public static final int $stable = 8;
    private final FfiConverter<T, ?> t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FfiConverter<T, ?> getT() {
        return this.t;
    }

    public FfiConverterOptional(@NotNull FfiConverter<T, ?> ffiConverter) {
        Intrinsics.checkNotNullParameter(ffiConverter, "");
        this.t = ffiConverter;
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift, reason: avoid collision after fix types in other method */
    public T lift2(@NotNull RustBuffer.ByValue byValue) {
        return (T) BaseFfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    @Override // uniffi.FfiConverter
    public T liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (T) BaseFfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: avoid collision after fix types in other method */
    public RustBuffer.ByValue lower2(T t) {
        return BaseFfiConverterRustBuffer.DefaultImpls.lower(this, t);
    }

    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(T t) {
        return BaseFfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, t);
    }

    @Override // uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return this.t.getRustBuffer();
    }

    @Override // uniffi.FfiConverter
    public T read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (byteBuffer.get() == 0) {
            return null;
        }
        return this.t.read(byteBuffer);
    }

    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI */
    public long mo9529allocationSizeI7RO_PI(T t) {
        if (t == null) {
            return 1L;
        }
        return C56396yDv.copydefault(this.t.mo9529allocationSizeI7RO_PI(t) + 1);
    }

    @Override // uniffi.FfiConverter
    public void write(T t, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (t == null) {
            byteBuffer.put((byte) 0);
        } else {
            byteBuffer.put((byte) 1);
            this.t.write(t, byteBuffer);
        }
    }
}
