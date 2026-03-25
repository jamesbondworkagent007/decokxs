package uniffi;

import j$.time.DateTimeException;
import j$.time.Duration;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterRustBuffer;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public class BaseFfiConverterDuration implements BaseFfiConverterRustBuffer<Duration> {
    public static final int $stable = 8;
    private final RustBuffer rustBuffer;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "");
        return 12L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return this.rustBuffer;
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public Duration lift2(@NotNull RustBuffer.ByValue byValue) {
        return (Duration) BaseFfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public Duration liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (Duration) BaseFfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull Duration duration) {
        return BaseFfiConverterRustBuffer.DefaultImpls.lower(this, duration);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull Duration duration) {
        return BaseFfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, duration);
    }

    public BaseFfiConverterDuration(@NotNull RustBuffer rustBuffer) {
        Intrinsics.checkNotNullParameter(rustBuffer, "");
        this.rustBuffer = rustBuffer;
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public Duration read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getInt();
        if (j < 0) {
            throw new DateTimeException("Duration exceeds minimum or maximum value supported by uniffi");
        }
        if (j2 < 0) {
            throw new DateTimeException("Duration nanoseconds exceed minimum or maximum supported by uniffi");
        }
        Duration durationOfSeconds = Duration.ofSeconds(j, j2);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "");
        return durationOfSeconds;
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull Duration duration, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(duration, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (duration.getSeconds() < 0) {
            throw new IllegalArgumentException("Invalid duration, must be non-negative");
        }
        if (duration.getNano() < 0) {
            throw new IllegalArgumentException("Invalid duration, nano value must be non-negative");
        }
        byteBuffer.putLong(duration.getSeconds());
        byteBuffer.putInt(duration.getNano());
    }
}
