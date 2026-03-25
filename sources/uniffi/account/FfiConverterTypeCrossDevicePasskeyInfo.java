package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zAX;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeCrossDevicePasskeyInfo implements FfiConverterRustBuffer<zAX> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCrossDevicePasskeyInfo INSTANCE = new FfiConverterTypeCrossDevicePasskeyInfo();

    private FfiConverterTypeCrossDevicePasskeyInfo() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zAX lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zAX) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zAX liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zAX) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zAX zax) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zax);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zAX zax) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zax);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zAX read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new zAX(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterDouble.INSTANCE.read(byteBuffer).doubleValue(), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zAX zax) {
        Intrinsics.checkNotNullParameter(zax, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(zax.OLrzqt()) + ffiConverterString.mo9529allocationSizeI7RO_PI(zax.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(zax.KWHzl())) + FfiConverterDouble.INSTANCE.m9533allocationSizeI7RO_PI(zax.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(zax.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(zax.AhwBna()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zAX zax, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zax, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(zax.OLrzqt(), byteBuffer);
        ffiConverterString.write(zax.EZpvd(), byteBuffer);
        ffiConverterString.write(zax.KWHzl(), byteBuffer);
        FfiConverterDouble.INSTANCE.write(zax.AEQbTJ(), byteBuffer);
        ffiConverterString.write(zax.copydefault(), byteBuffer);
        ffiConverterString.write(zax.AhwBna(), byteBuffer);
    }
}
