package uniffi;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.FfiConverter;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class BaseFfiConverterDouble implements FfiConverter<Double, Double> {
    public static final int $stable = 8;
    private final RustBuffer rustBuffer;

    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m9533allocationSizeI7RO_PI(double d) {
        return 8L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return this.rustBuffer;
    }

    public BaseFfiConverterDouble(@NotNull RustBuffer rustBuffer) {
        Intrinsics.checkNotNullParameter(rustBuffer, "");
        this.rustBuffer = rustBuffer;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI */
    public /* synthetic */ long mo9529allocationSizeI7RO_PI(Double d) {
        return m9533allocationSizeI7RO_PI(d.doubleValue());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Double lift2(Double d) {
        return lift(d.doubleValue());
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // uniffi.FfiConverter
    public Double liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (Double) FfiConverter.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lower */
    public /* synthetic */ Double lower2(Double d) {
        return lower(d.doubleValue());
    }

    public RustBuffer.ByValue lowerIntoRustBuffer(double d) {
        return FfiConverter.DefaultImpls.lowerIntoRustBuffer(this, Double.valueOf(d));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    public /* synthetic */ RustBuffer.ByValue lowerIntoRustBuffer(Double d) {
        return lowerIntoRustBuffer(d.doubleValue());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.nio.ByteBuffer] */
    @Override // uniffi.FfiConverter
    public /* synthetic */ void write(Double d, ByteBuffer byteBuffer) {
        write(d.doubleValue(), byteBuffer);
    }

    public Double lift(double d) {
        return Double.valueOf(d);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // uniffi.FfiConverter
    public Double read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return Double.valueOf(byteBuffer.getDouble());
    }

    public Double lower(double d) {
        return Double.valueOf(d);
    }

    public void write(double d, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        byteBuffer.putDouble(d);
    }
}
