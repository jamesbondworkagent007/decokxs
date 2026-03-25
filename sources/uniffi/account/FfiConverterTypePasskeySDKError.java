package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;
import uniffi.account.PasskeySdkException;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypePasskeySDKError implements FfiConverterRustBuffer<PasskeySdkException> {
    public static final int $stable = 0;
    public static final FfiConverterTypePasskeySDKError INSTANCE = new FfiConverterTypePasskeySDKError();

    private FfiConverterTypePasskeySDKError() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public PasskeySdkException lift2(@NotNull RustBuffer.ByValue byValue) {
        return (PasskeySdkException) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public PasskeySdkException liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (PasskeySdkException) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull PasskeySdkException passkeySdkException) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, passkeySdkException);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull PasskeySdkException passkeySdkException) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, passkeySdkException);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public PasskeySdkException read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        switch (byteBuffer.getInt()) {
            case 1:
                return new PasskeySdkException.Cancelled();
            case 2:
                return new PasskeySdkException.NotAvailable(FfiConverterString.INSTANCE.read(byteBuffer));
            case 3:
                return new PasskeySdkException.NoCredentials();
            case 4:
                return new PasskeySdkException.AlreadyRegistered();
            case 5:
                return new PasskeySdkException.AuthenticationFailed(FfiConverterString.INSTANCE.read(byteBuffer));
            case 6:
                return new PasskeySdkException.RegistrationFailed(FfiConverterString.INSTANCE.read(byteBuffer));
            case 7:
                return new PasskeySdkException.BiometricNotAvailable();
            case 8:
                return new PasskeySdkException.BiometricChanged();
            case 9:
                return new PasskeySdkException.Unknown(FfiConverterString.INSTANCE.read(byteBuffer));
            default:
                throw new RuntimeException("invalid error enum value, something is very wrong!!");
        }
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull PasskeySdkException passkeySdkException) {
        Intrinsics.checkNotNullParameter(passkeySdkException, "");
        if (passkeySdkException instanceof PasskeySdkException.Cancelled) {
            return 4L;
        }
        if (passkeySdkException instanceof PasskeySdkException.NotAvailable) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((PasskeySdkException.NotAvailable) passkeySdkException).getReason()) + 4);
        }
        if ((passkeySdkException instanceof PasskeySdkException.NoCredentials) || (passkeySdkException instanceof PasskeySdkException.AlreadyRegistered)) {
            return 4L;
        }
        if (passkeySdkException instanceof PasskeySdkException.AuthenticationFailed) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((PasskeySdkException.AuthenticationFailed) passkeySdkException).getReason()) + 4);
        }
        if (passkeySdkException instanceof PasskeySdkException.RegistrationFailed) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((PasskeySdkException.RegistrationFailed) passkeySdkException).getReason()) + 4);
        }
        if ((passkeySdkException instanceof PasskeySdkException.BiometricNotAvailable) || (passkeySdkException instanceof PasskeySdkException.BiometricChanged)) {
            return 4L;
        }
        if (!(passkeySdkException instanceof PasskeySdkException.Unknown)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((PasskeySdkException.Unknown) passkeySdkException).getReason()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull PasskeySdkException passkeySdkException, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(passkeySdkException, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (passkeySdkException instanceof PasskeySdkException.Cancelled) {
            byteBuffer.putInt(1);
        } else if (passkeySdkException instanceof PasskeySdkException.NotAvailable) {
            byteBuffer.putInt(2);
            FfiConverterString.INSTANCE.write(((PasskeySdkException.NotAvailable) passkeySdkException).getReason(), byteBuffer);
        } else if (passkeySdkException instanceof PasskeySdkException.NoCredentials) {
            byteBuffer.putInt(3);
        } else if (passkeySdkException instanceof PasskeySdkException.AlreadyRegistered) {
            byteBuffer.putInt(4);
        } else if (passkeySdkException instanceof PasskeySdkException.AuthenticationFailed) {
            byteBuffer.putInt(5);
            FfiConverterString.INSTANCE.write(((PasskeySdkException.AuthenticationFailed) passkeySdkException).getReason(), byteBuffer);
        } else if (passkeySdkException instanceof PasskeySdkException.RegistrationFailed) {
            byteBuffer.putInt(6);
            FfiConverterString.INSTANCE.write(((PasskeySdkException.RegistrationFailed) passkeySdkException).getReason(), byteBuffer);
        } else if (passkeySdkException instanceof PasskeySdkException.BiometricNotAvailable) {
            byteBuffer.putInt(7);
        } else if (passkeySdkException instanceof PasskeySdkException.BiometricChanged) {
            byteBuffer.putInt(8);
        } else {
            if (!(passkeySdkException instanceof PasskeySdkException.Unknown)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(9);
            FfiConverterString.INSTANCE.write(((PasskeySdkException.Unknown) passkeySdkException).getReason(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
