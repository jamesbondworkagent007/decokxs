package uniffi;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.FfiConverter;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class BaseFfiConverterLong implements FfiConverter<Long, Long> {
    public static final int $stable = 8;
    private final RustBuffer rustBuffer;

    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m9537allocationSizeI7RO_PI(long j) {
        return 8L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return this.rustBuffer;
    }

    public BaseFfiConverterLong(@NotNull RustBuffer rustBuffer) {
        Intrinsics.checkNotNullParameter(rustBuffer, "");
        this.rustBuffer = rustBuffer;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI */
    public /* synthetic */ long mo9529allocationSizeI7RO_PI(Long l) {
        return m9537allocationSizeI7RO_PI(l.longValue());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Long lift2(Long l) {
        return lift(l.longValue());
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // uniffi.FfiConverter
    public Long liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (Long) FfiConverter.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lower */
    public /* synthetic */ Long lower2(Long l) {
        return lower(l.longValue());
    }

    public RustBuffer.ByValue lowerIntoRustBuffer(long j) {
        return FfiConverter.DefaultImpls.lowerIntoRustBuffer(this, Long.valueOf(j));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    public /* synthetic */ RustBuffer.ByValue lowerIntoRustBuffer(Long l) {
        return lowerIntoRustBuffer(l.longValue());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.nio.ByteBuffer] */
    @Override // uniffi.FfiConverter
    public /* synthetic */ void write(Long l, ByteBuffer byteBuffer) {
        write(l.longValue(), byteBuffer);
    }

    public Long lift(long j) {
        return Long.valueOf(j);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // uniffi.FfiConverter
    public Long read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return Long.valueOf(byteBuffer.getLong());
    }

    public Long lower(long j) {
        return Long.valueOf(j);
    }

    public void write(long j, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        byteBuffer.putLong(j);
    }
}
