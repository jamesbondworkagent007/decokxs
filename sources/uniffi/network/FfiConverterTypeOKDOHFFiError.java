package uniffi.network;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.network.FfiConverterRustBuffer;
import uniffi.network.OkdohfFiException;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeOKDOHFFiError implements FfiConverterRustBuffer<OkdohfFiException> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKDOHFFiError INSTANCE = new FfiConverterTypeOKDOHFFiError();

    private FfiConverterTypeOKDOHFFiError() {
    }

    @Override // uniffi.network.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public OkdohfFiException lift2(@NotNull RustBuffer.ByValue byValue) {
        return (OkdohfFiException) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public OkdohfFiException liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (OkdohfFiException) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull OkdohfFiException okdohfFiException) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, okdohfFiException);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull OkdohfFiException okdohfFiException) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, okdohfFiException);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public OkdohfFiException read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (byteBuffer.getInt() == 1) {
            return new OkdohfFiException.Exception(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid error enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull OkdohfFiException okdohfFiException) {
        Intrinsics.checkNotNullParameter(okdohfFiException, "");
        if (!(okdohfFiException instanceof OkdohfFiException.Exception)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((OkdohfFiException.Exception) okdohfFiException).getErrorMessage()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull OkdohfFiException okdohfFiException, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(okdohfFiException, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (!(okdohfFiException instanceof OkdohfFiException.Exception)) {
            throw new NoWhenBranchMatchedException();
        }
        byteBuffer.putInt(1);
        FfiConverterString.INSTANCE.write(((OkdohfFiException.Exception) okdohfFiException).getErrorMessage(), byteBuffer);
        Unit unit = Unit.INSTANCE;
    }
}
