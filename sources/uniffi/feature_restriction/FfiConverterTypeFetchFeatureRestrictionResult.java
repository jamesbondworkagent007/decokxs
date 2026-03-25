package uniffi.feature_restriction;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.feature_restriction.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeFetchFeatureRestrictionResult implements FfiConverterRustBuffer<FetchFeatureRestrictionResult> {
    public static final int $stable = 0;
    public static final FfiConverterTypeFetchFeatureRestrictionResult INSTANCE = new FfiConverterTypeFetchFeatureRestrictionResult();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull FetchFeatureRestrictionResult fetchFeatureRestrictionResult) {
        Intrinsics.checkNotNullParameter(fetchFeatureRestrictionResult, "");
        return 4L;
    }

    private FfiConverterTypeFetchFeatureRestrictionResult() {
    }

    @Override // uniffi.feature_restriction.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public FetchFeatureRestrictionResult lift2(@NotNull RustBuffer.ByValue byValue) {
        return (FetchFeatureRestrictionResult) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public FetchFeatureRestrictionResult liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (FetchFeatureRestrictionResult) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull FetchFeatureRestrictionResult fetchFeatureRestrictionResult) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, fetchFeatureRestrictionResult);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull FetchFeatureRestrictionResult fetchFeatureRestrictionResult) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, fetchFeatureRestrictionResult);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public FetchFeatureRestrictionResult read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        try {
            return FetchFeatureRestrictionResult.values()[byteBuffer.getInt() - 1];
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("invalid enum value, something is very wrong!!", e);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull FetchFeatureRestrictionResult fetchFeatureRestrictionResult, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(fetchFeatureRestrictionResult, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        byteBuffer.putInt(fetchFeatureRestrictionResult.ordinal() + 1);
    }
}
