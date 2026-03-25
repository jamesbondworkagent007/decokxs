package uniffi;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.FfiConverter;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public class BaseFfiConverterFloat implements FfiConverter<Float, Float> {
    public static final int $stable = 8;
    private final RustBuffer rustBuffer;

    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m9535allocationSizeI7RO_PI(float f) {
        return 4L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return this.rustBuffer;
    }

    public BaseFfiConverterFloat(@NotNull RustBuffer rustBuffer) {
        Intrinsics.checkNotNullParameter(rustBuffer, "");
        this.rustBuffer = rustBuffer;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI */
    public /* synthetic */ long mo9529allocationSizeI7RO_PI(Float f) {
        return m9535allocationSizeI7RO_PI(f.floatValue());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Float lift2(Float f) {
        return lift(f.floatValue());
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // uniffi.FfiConverter
    public Float liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (Float) FfiConverter.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lower */
    public /* synthetic */ Float lower2(Float f) {
        return lower(f.floatValue());
    }

    public RustBuffer.ByValue lowerIntoRustBuffer(float f) {
        return FfiConverter.DefaultImpls.lowerIntoRustBuffer(this, Float.valueOf(f));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    public /* synthetic */ RustBuffer.ByValue lowerIntoRustBuffer(Float f) {
        return lowerIntoRustBuffer(f.floatValue());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.nio.ByteBuffer] */
    @Override // uniffi.FfiConverter
    public /* synthetic */ void write(Float f, ByteBuffer byteBuffer) {
        write(f.floatValue(), byteBuffer);
    }

    public Float lift(float f) {
        return Float.valueOf(f);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // uniffi.FfiConverter
    public Float read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return Float.valueOf(byteBuffer.getFloat());
    }

    public Float lower(float f) {
        return Float.valueOf(f);
    }

    public void write(float f, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        byteBuffer.putFloat(f);
    }
}
