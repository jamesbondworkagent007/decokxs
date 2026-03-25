package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.BlePasskeyException;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeBlePasskeyError implements FfiConverterRustBuffer<BlePasskeyException> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBlePasskeyError INSTANCE = new FfiConverterTypeBlePasskeyError();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BlePasskeyException blePasskeyException) {
        Intrinsics.checkNotNullParameter(blePasskeyException, "");
        return 4L;
    }

    private FfiConverterTypeBlePasskeyError() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BlePasskeyException lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BlePasskeyException) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BlePasskeyException liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BlePasskeyException) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BlePasskeyException blePasskeyException) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, blePasskeyException);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BlePasskeyException blePasskeyException) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, blePasskeyException);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BlePasskeyException read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        switch (byteBuffer.getInt()) {
            case 1:
                return new BlePasskeyException.BluetoothNotEnabled(FfiConverterString.INSTANCE.read(byteBuffer));
            case 2:
                return new BlePasskeyException.PermissionsNotGranted(FfiConverterString.INSTANCE.read(byteBuffer));
            case 3:
                return new BlePasskeyException.ServiceUuidNotSet(FfiConverterString.INSTANCE.read(byteBuffer));
            case 4:
                return new BlePasskeyException.AdvertisingNotSupported(FfiConverterString.INSTANCE.read(byteBuffer));
            case 5:
                return new BlePasskeyException.GattServerFailed(FfiConverterString.INSTANCE.read(byteBuffer));
            case 6:
                return new BlePasskeyException.AdvertisingFailed(FfiConverterString.INSTANCE.read(byteBuffer));
            case 7:
                return new BlePasskeyException.ScanningFailed(FfiConverterString.INSTANCE.read(byteBuffer));
            case 8:
                return new BlePasskeyException.ConnectionFailed(FfiConverterString.INSTANCE.read(byteBuffer));
            case 9:
                return new BlePasskeyException.NotConnected(FfiConverterString.INSTANCE.read(byteBuffer));
            case 10:
                return new BlePasskeyException.ServiceNotFound(FfiConverterString.INSTANCE.read(byteBuffer));
            case 11:
                return new BlePasskeyException.CharacteristicNotFound(FfiConverterString.INSTANCE.read(byteBuffer));
            case 12:
                return new BlePasskeyException.SendFailed(FfiConverterString.INSTANCE.read(byteBuffer));
            case 13:
                return new BlePasskeyException.Timeout(FfiConverterString.INSTANCE.read(byteBuffer));
            case 14:
                return new BlePasskeyException.InternalException(FfiConverterString.INSTANCE.read(byteBuffer));
            default:
                throw new RuntimeException("invalid error enum value, something is very wrong!!");
        }
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BlePasskeyException blePasskeyException, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(blePasskeyException, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (blePasskeyException instanceof BlePasskeyException.BluetoothNotEnabled) {
            byteBuffer.putInt(1);
        } else if (blePasskeyException instanceof BlePasskeyException.PermissionsNotGranted) {
            byteBuffer.putInt(2);
        } else if (blePasskeyException instanceof BlePasskeyException.ServiceUuidNotSet) {
            byteBuffer.putInt(3);
        } else if (blePasskeyException instanceof BlePasskeyException.AdvertisingNotSupported) {
            byteBuffer.putInt(4);
        } else if (blePasskeyException instanceof BlePasskeyException.GattServerFailed) {
            byteBuffer.putInt(5);
        } else if (blePasskeyException instanceof BlePasskeyException.AdvertisingFailed) {
            byteBuffer.putInt(6);
        } else if (blePasskeyException instanceof BlePasskeyException.ScanningFailed) {
            byteBuffer.putInt(7);
        } else if (blePasskeyException instanceof BlePasskeyException.ConnectionFailed) {
            byteBuffer.putInt(8);
        } else if (blePasskeyException instanceof BlePasskeyException.NotConnected) {
            byteBuffer.putInt(9);
        } else if (blePasskeyException instanceof BlePasskeyException.ServiceNotFound) {
            byteBuffer.putInt(10);
        } else if (blePasskeyException instanceof BlePasskeyException.CharacteristicNotFound) {
            byteBuffer.putInt(11);
        } else if (blePasskeyException instanceof BlePasskeyException.SendFailed) {
            byteBuffer.putInt(12);
        } else if (blePasskeyException instanceof BlePasskeyException.Timeout) {
            byteBuffer.putInt(13);
        } else {
            if (!(blePasskeyException instanceof BlePasskeyException.InternalException)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(14);
        }
        Unit unit = Unit.INSTANCE;
    }
}
