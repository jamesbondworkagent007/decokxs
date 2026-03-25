package uniffi.ok_future_utils;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.ok_future_utils.FfiConverterRustBuffer;
import uniffi.ok_future_utils.OkCancellationException;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeOKCancellationError implements FfiConverterRustBuffer<OkCancellationException> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKCancellationError INSTANCE = new FfiConverterTypeOKCancellationError();

    private FfiConverterTypeOKCancellationError() {
    }

    @Override // uniffi.ok_future_utils.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public OkCancellationException lift2(@NotNull RustBuffer.ByValue byValue) {
        return (OkCancellationException) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public OkCancellationException liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (OkCancellationException) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull OkCancellationException okCancellationException) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, okCancellationException);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull OkCancellationException okCancellationException) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, okCancellationException);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public OkCancellationException read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (byteBuffer.getInt() == 1) {
            return new OkCancellationException.Cancelled();
        }
        throw new RuntimeException("invalid error enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull OkCancellationException okCancellationException) {
        Intrinsics.checkNotNullParameter(okCancellationException, "");
        if (okCancellationException instanceof OkCancellationException.Cancelled) {
            return 4L;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull OkCancellationException okCancellationException, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(okCancellationException, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (!(okCancellationException instanceof OkCancellationException.Cancelled)) {
            throw new NoWhenBranchMatchedException();
        }
        byteBuffer.putInt(1);
        Unit unit = Unit.INSTANCE;
    }
}
