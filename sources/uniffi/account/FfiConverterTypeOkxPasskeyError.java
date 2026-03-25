package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;
import uniffi.account.OkxPasskeyException;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOkxPasskeyError implements FfiConverterRustBuffer<OkxPasskeyException> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyError INSTANCE = new FfiConverterTypeOkxPasskeyError();

    private FfiConverterTypeOkxPasskeyError() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public OkxPasskeyException lift2(@NotNull RustBuffer.ByValue byValue) {
        return (OkxPasskeyException) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public OkxPasskeyException liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (OkxPasskeyException) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull OkxPasskeyException okxPasskeyException) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, okxPasskeyException);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull OkxPasskeyException okxPasskeyException) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, okxPasskeyException);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public OkxPasskeyException read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        switch (byteBuffer.getInt()) {
            case 1:
                return new OkxPasskeyException.KeyAlreadyExists();
            case 2:
                return new OkxPasskeyException.KeyNotFound();
            case 3:
                return new OkxPasskeyException.KeyDataInvalid();
            case 4:
                return new OkxPasskeyException.KeyCreationFailed();
            case 5:
                return new OkxPasskeyException.KeyExportFailed();
            case 6:
                return new OkxPasskeyException.SignatureFailed();
            case 7:
                return new OkxPasskeyException.UserCancelled();
            case 8:
                return new OkxPasskeyException.DeviceLockout();
            case 9:
                return new OkxPasskeyException.NoDevicePasscode();
            case 10:
                return new OkxPasskeyException.KeychainException();
            case 11:
                return new OkxPasskeyException.SerializationFailed();
            case 12:
                return new OkxPasskeyException.InvalidParameters();
            case 13:
                return new OkxPasskeyException.InternalException();
            case 14:
                return new OkxPasskeyException.AccountMismatch();
            case 15:
                return new OkxPasskeyException.NetworkException(FfiConverterString.INSTANCE.read(byteBuffer));
            default:
                throw new RuntimeException("invalid error enum value, something is very wrong!!");
        }
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull OkxPasskeyException okxPasskeyException) {
        Intrinsics.checkNotNullParameter(okxPasskeyException, "");
        if ((okxPasskeyException instanceof OkxPasskeyException.KeyAlreadyExists) || (okxPasskeyException instanceof OkxPasskeyException.KeyNotFound) || (okxPasskeyException instanceof OkxPasskeyException.KeyDataInvalid) || (okxPasskeyException instanceof OkxPasskeyException.KeyCreationFailed) || (okxPasskeyException instanceof OkxPasskeyException.KeyExportFailed) || (okxPasskeyException instanceof OkxPasskeyException.SignatureFailed) || (okxPasskeyException instanceof OkxPasskeyException.UserCancelled) || (okxPasskeyException instanceof OkxPasskeyException.DeviceLockout) || (okxPasskeyException instanceof OkxPasskeyException.NoDevicePasscode) || (okxPasskeyException instanceof OkxPasskeyException.KeychainException) || (okxPasskeyException instanceof OkxPasskeyException.SerializationFailed) || (okxPasskeyException instanceof OkxPasskeyException.InvalidParameters) || (okxPasskeyException instanceof OkxPasskeyException.InternalException) || (okxPasskeyException instanceof OkxPasskeyException.AccountMismatch)) {
            return 4L;
        }
        if (!(okxPasskeyException instanceof OkxPasskeyException.NetworkException)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((OkxPasskeyException.NetworkException) okxPasskeyException).getV1()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull OkxPasskeyException okxPasskeyException, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(okxPasskeyException, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (okxPasskeyException instanceof OkxPasskeyException.KeyAlreadyExists) {
            byteBuffer.putInt(1);
        } else if (okxPasskeyException instanceof OkxPasskeyException.KeyNotFound) {
            byteBuffer.putInt(2);
        } else if (okxPasskeyException instanceof OkxPasskeyException.KeyDataInvalid) {
            byteBuffer.putInt(3);
        } else if (okxPasskeyException instanceof OkxPasskeyException.KeyCreationFailed) {
            byteBuffer.putInt(4);
        } else if (okxPasskeyException instanceof OkxPasskeyException.KeyExportFailed) {
            byteBuffer.putInt(5);
        } else if (okxPasskeyException instanceof OkxPasskeyException.SignatureFailed) {
            byteBuffer.putInt(6);
        } else if (okxPasskeyException instanceof OkxPasskeyException.UserCancelled) {
            byteBuffer.putInt(7);
        } else if (okxPasskeyException instanceof OkxPasskeyException.DeviceLockout) {
            byteBuffer.putInt(8);
        } else if (okxPasskeyException instanceof OkxPasskeyException.NoDevicePasscode) {
            byteBuffer.putInt(9);
        } else if (okxPasskeyException instanceof OkxPasskeyException.KeychainException) {
            byteBuffer.putInt(10);
        } else if (okxPasskeyException instanceof OkxPasskeyException.SerializationFailed) {
            byteBuffer.putInt(11);
        } else if (okxPasskeyException instanceof OkxPasskeyException.InvalidParameters) {
            byteBuffer.putInt(12);
        } else if (okxPasskeyException instanceof OkxPasskeyException.InternalException) {
            byteBuffer.putInt(13);
        } else if (okxPasskeyException instanceof OkxPasskeyException.AccountMismatch) {
            byteBuffer.putInt(14);
        } else {
            if (!(okxPasskeyException instanceof OkxPasskeyException.NetworkException)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(15);
            FfiConverterString.INSTANCE.write(((OkxPasskeyException.NetworkException) okxPasskeyException).getV1(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
