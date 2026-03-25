package uniffi;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.FfiConverter;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public class BaseFfiConverterShort implements FfiConverter<Short, Short> {
    public static final int $stable = 8;
    private final RustBuffer rustBuffer;

    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m9538allocationSizeI7RO_PI(short s) {
        return 2L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return this.rustBuffer;
    }

    public BaseFfiConverterShort(@NotNull RustBuffer rustBuffer) {
        Intrinsics.checkNotNullParameter(rustBuffer, "");
        this.rustBuffer = rustBuffer;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI */
    public /* synthetic */ long mo9529allocationSizeI7RO_PI(Short sh) {
        return m9538allocationSizeI7RO_PI(sh.shortValue());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Short lift2(Short sh) {
        return lift(sh.shortValue());
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public Short liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (Short) FfiConverter.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lower */
    public /* synthetic */ Short lower2(Short sh) {
        return lower(sh.shortValue());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    public /* synthetic */ RustBuffer.ByValue lowerIntoRustBuffer(Short sh) {
        return lowerIntoRustBuffer(sh.shortValue());
    }

    public RustBuffer.ByValue lowerIntoRustBuffer(short s) {
        return FfiConverter.DefaultImpls.lowerIntoRustBuffer(this, Short.valueOf(s));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.nio.ByteBuffer] */
    @Override // uniffi.FfiConverter
    public /* synthetic */ void write(Short sh, ByteBuffer byteBuffer) {
        write(sh.shortValue(), byteBuffer);
    }

    public Short lift(short s) {
        return Short.valueOf(s);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public Short read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return Short.valueOf(byteBuffer.getShort());
    }

    public Short lower(short s) {
        return Short.valueOf(s);
    }

    public void write(short s, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        byteBuffer.putShort(s);
    }
}
