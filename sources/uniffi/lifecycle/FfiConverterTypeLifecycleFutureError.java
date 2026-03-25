package uniffi.lifecycle;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.lifecycle.FfiConverterRustBuffer;
import uniffi.lifecycle.LifecycleFutureException;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeLifecycleFutureError implements FfiConverterRustBuffer<LifecycleFutureException> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLifecycleFutureError INSTANCE = new FfiConverterTypeLifecycleFutureError();

    private FfiConverterTypeLifecycleFutureError() {
    }

    @Override // uniffi.lifecycle.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public LifecycleFutureException lift2(@NotNull RustBuffer.ByValue byValue) {
        return (LifecycleFutureException) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public LifecycleFutureException liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (LifecycleFutureException) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull LifecycleFutureException lifecycleFutureException) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, lifecycleFutureException);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull LifecycleFutureException lifecycleFutureException) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, lifecycleFutureException);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public LifecycleFutureException read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (byteBuffer.getInt() == 1) {
            return new LifecycleFutureException.Exception(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid error enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull LifecycleFutureException lifecycleFutureException) {
        Intrinsics.checkNotNullParameter(lifecycleFutureException, "");
        if (!(lifecycleFutureException instanceof LifecycleFutureException.Exception)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((LifecycleFutureException.Exception) lifecycleFutureException).getErrorMessage()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull LifecycleFutureException lifecycleFutureException, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(lifecycleFutureException, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (!(lifecycleFutureException instanceof LifecycleFutureException.Exception)) {
            throw new NoWhenBranchMatchedException();
        }
        byteBuffer.putInt(1);
        FfiConverterString.INSTANCE.write(((LifecycleFutureException.Exception) lifecycleFutureException).getErrorMessage(), byteBuffer);
        Unit unit = Unit.INSTANCE;
    }
}
