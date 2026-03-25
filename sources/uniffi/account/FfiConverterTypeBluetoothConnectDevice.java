package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeBluetoothConnectDevice implements FfiConverterRustBuffer<BluetoothConnectDevice> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBluetoothConnectDevice INSTANCE = new FfiConverterTypeBluetoothConnectDevice();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BluetoothConnectDevice bluetoothConnectDevice) {
        Intrinsics.checkNotNullParameter(bluetoothConnectDevice, "");
        return 4L;
    }

    private FfiConverterTypeBluetoothConnectDevice() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BluetoothConnectDevice lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BluetoothConnectDevice) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BluetoothConnectDevice liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BluetoothConnectDevice) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BluetoothConnectDevice bluetoothConnectDevice) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bluetoothConnectDevice);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BluetoothConnectDevice bluetoothConnectDevice) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bluetoothConnectDevice);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BluetoothConnectDevice read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        try {
            return BluetoothConnectDevice.values()[byteBuffer.getInt() - 1];
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("invalid enum value, something is very wrong!!", e);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BluetoothConnectDevice bluetoothConnectDevice, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bluetoothConnectDevice, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        byteBuffer.putInt(bluetoothConnectDevice.ordinal() + 1);
    }
}
