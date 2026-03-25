package uniffi.upgrade;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.ok_future_utils.FfiConverterTypeOKCancellationError;
import uniffi.upgrade.FfiConverterRustBuffer;
import uniffi.upgrade.GetUserException;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeGetUserError implements FfiConverterRustBuffer<GetUserException> {
    public static final int $stable = 0;
    public static final FfiConverterTypeGetUserError INSTANCE = new FfiConverterTypeGetUserError();

    private FfiConverterTypeGetUserError() {
    }

    @Override // uniffi.upgrade.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public GetUserException lift2(@NotNull RustBuffer.ByValue byValue) {
        return (GetUserException) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public GetUserException liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (GetUserException) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull GetUserException getUserException) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, getUserException);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull GetUserException getUserException) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, getUserException);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public GetUserException read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new GetUserException.RequestFailed(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return new GetUserException.InvalidId(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 3) {
            return new GetUserException.OperationCancelled(FfiConverterTypeOKCancellationError.INSTANCE.read(byteBuffer));
        }
        if (i == 4) {
            return new GetUserException.InternalException(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid error enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull GetUserException getUserException) {
        Intrinsics.checkNotNullParameter(getUserException, "");
        if (getUserException instanceof GetUserException.RequestFailed) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((GetUserException.RequestFailed) getUserException).getErrorMessage()) + 4);
        }
        if (getUserException instanceof GetUserException.InvalidId) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((GetUserException.InvalidId) getUserException).getUserid()) + 4);
        }
        if (getUserException instanceof GetUserException.OperationCancelled) {
            return C56396yDv.copydefault(FfiConverterTypeOKCancellationError.INSTANCE.mo9529allocationSizeI7RO_PI(((GetUserException.OperationCancelled) getUserException).getV1()) + 4);
        }
        if (!(getUserException instanceof GetUserException.InternalException)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((GetUserException.InternalException) getUserException).getErrorMessage()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull GetUserException getUserException, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(getUserException, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (getUserException instanceof GetUserException.RequestFailed) {
            byteBuffer.putInt(1);
            FfiConverterString.INSTANCE.write(((GetUserException.RequestFailed) getUserException).getErrorMessage(), byteBuffer);
        } else if (getUserException instanceof GetUserException.InvalidId) {
            byteBuffer.putInt(2);
            FfiConverterString.INSTANCE.write(((GetUserException.InvalidId) getUserException).getUserid(), byteBuffer);
        } else if (getUserException instanceof GetUserException.OperationCancelled) {
            byteBuffer.putInt(3);
            FfiConverterTypeOKCancellationError.INSTANCE.write(((GetUserException.OperationCancelled) getUserException).getV1(), byteBuffer);
        } else {
            if (!(getUserException instanceof GetUserException.InternalException)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(4);
            FfiConverterString.INSTANCE.write(((GetUserException.InternalException) getUserException).getErrorMessage(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
