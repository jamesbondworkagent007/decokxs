package uniffi.feature_restriction;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.feature_restriction.FfiConverterRustBuffer;
import uniffi.feature_restriction.NativeFetchFeatureRestrictionException;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeNativeFetchFeatureRestrictionError implements FfiConverterRustBuffer<NativeFetchFeatureRestrictionException> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNativeFetchFeatureRestrictionError INSTANCE = new FfiConverterTypeNativeFetchFeatureRestrictionError();

    private FfiConverterTypeNativeFetchFeatureRestrictionError() {
    }

    @Override // uniffi.feature_restriction.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public NativeFetchFeatureRestrictionException lift2(@NotNull RustBuffer.ByValue byValue) {
        return (NativeFetchFeatureRestrictionException) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public NativeFetchFeatureRestrictionException liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (NativeFetchFeatureRestrictionException) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull NativeFetchFeatureRestrictionException nativeFetchFeatureRestrictionException) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, nativeFetchFeatureRestrictionException);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull NativeFetchFeatureRestrictionException nativeFetchFeatureRestrictionException) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, nativeFetchFeatureRestrictionException);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public NativeFetchFeatureRestrictionException read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (byteBuffer.getInt() == 1) {
            return new NativeFetchFeatureRestrictionException.FetchFailed();
        }
        throw new RuntimeException("invalid error enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull NativeFetchFeatureRestrictionException nativeFetchFeatureRestrictionException) {
        Intrinsics.checkNotNullParameter(nativeFetchFeatureRestrictionException, "");
        if (nativeFetchFeatureRestrictionException instanceof NativeFetchFeatureRestrictionException.FetchFailed) {
            return 4L;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull NativeFetchFeatureRestrictionException nativeFetchFeatureRestrictionException, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(nativeFetchFeatureRestrictionException, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (!(nativeFetchFeatureRestrictionException instanceof NativeFetchFeatureRestrictionException.FetchFailed)) {
            throw new NoWhenBranchMatchedException();
        }
        byteBuffer.putInt(1);
        Unit unit = Unit.INSTANCE;
    }
}
