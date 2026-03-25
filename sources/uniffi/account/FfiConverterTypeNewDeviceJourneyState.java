package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zLT;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeNewDeviceJourneyState implements FfiConverterRustBuffer<zLT> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceJourneyState INSTANCE = new FfiConverterTypeNewDeviceJourneyState();

    private FfiConverterTypeNewDeviceJourneyState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zLT lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zLT) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zLT liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zLT) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zLT zlt) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zlt);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zLT zlt) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zlt);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zLT read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalTypeNewDeviceAuthMethod ffiConverterOptionalTypeNewDeviceAuthMethod = FfiConverterOptionalTypeNewDeviceAuthMethod.INSTANCE;
        return new zLT(ffiConverterOptionalTypeNewDeviceAuthMethod.read(byteBuffer), ffiConverterOptionalTypeNewDeviceAuthMethod.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zLT zlt) {
        Intrinsics.checkNotNullParameter(zlt, "");
        FfiConverterOptionalTypeNewDeviceAuthMethod ffiConverterOptionalTypeNewDeviceAuthMethod = FfiConverterOptionalTypeNewDeviceAuthMethod.INSTANCE;
        return C56396yDv.copydefault(ffiConverterOptionalTypeNewDeviceAuthMethod.mo9529allocationSizeI7RO_PI(zlt.OLrzqt()) + ffiConverterOptionalTypeNewDeviceAuthMethod.mo9529allocationSizeI7RO_PI(zlt.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zLT zlt, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zlt, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalTypeNewDeviceAuthMethod ffiConverterOptionalTypeNewDeviceAuthMethod = FfiConverterOptionalTypeNewDeviceAuthMethod.INSTANCE;
        ffiConverterOptionalTypeNewDeviceAuthMethod.write(zlt.OLrzqt(), byteBuffer);
        ffiConverterOptionalTypeNewDeviceAuthMethod.write(zlt.EZpvd(), byteBuffer);
    }
}
