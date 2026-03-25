package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeRiskControlLevel implements FfiConverterRustBuffer<RiskControlLevel> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRiskControlLevel INSTANCE = new FfiConverterTypeRiskControlLevel();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull RiskControlLevel riskControlLevel) {
        Intrinsics.checkNotNullParameter(riskControlLevel, "");
        return 4L;
    }

    private FfiConverterTypeRiskControlLevel() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public RiskControlLevel lift2(@NotNull RustBuffer.ByValue byValue) {
        return (RiskControlLevel) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public RiskControlLevel liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (RiskControlLevel) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull RiskControlLevel riskControlLevel) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, riskControlLevel);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull RiskControlLevel riskControlLevel) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, riskControlLevel);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public RiskControlLevel read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        try {
            return RiskControlLevel.values()[byteBuffer.getInt() - 1];
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("invalid enum value, something is very wrong!!", e);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull RiskControlLevel riskControlLevel, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(riskControlLevel, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        byteBuffer.putInt(riskControlLevel.ordinal() + 1);
    }
}
