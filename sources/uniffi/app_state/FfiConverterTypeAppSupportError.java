package uniffi.app_state;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.app_state.AppSupportException;
import uniffi.app_state.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeAppSupportError implements FfiConverterRustBuffer<AppSupportException> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAppSupportError INSTANCE = new FfiConverterTypeAppSupportError();

    private FfiConverterTypeAppSupportError() {
    }

    @Override // uniffi.app_state.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AppSupportException lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AppSupportException) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AppSupportException liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AppSupportException) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AppSupportException appSupportException) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, appSupportException);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AppSupportException appSupportException) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, appSupportException);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AppSupportException read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (byteBuffer.getInt() == 1) {
            return new AppSupportException.NotInitialized();
        }
        throw new RuntimeException("invalid error enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AppSupportException appSupportException) {
        Intrinsics.checkNotNullParameter(appSupportException, "");
        if (appSupportException instanceof AppSupportException.NotInitialized) {
            return 4L;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AppSupportException appSupportException, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(appSupportException, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (!(appSupportException instanceof AppSupportException.NotInitialized)) {
            throw new NoWhenBranchMatchedException();
        }
        byteBuffer.putInt(1);
        Unit unit = Unit.INSTANCE;
    }
}
