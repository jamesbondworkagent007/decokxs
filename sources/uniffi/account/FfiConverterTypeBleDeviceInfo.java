package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C60288zzs;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeBleDeviceInfo implements FfiConverterRustBuffer<C60288zzs> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBleDeviceInfo INSTANCE = new FfiConverterTypeBleDeviceInfo();

    private FfiConverterTypeBleDeviceInfo() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C60288zzs lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C60288zzs) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C60288zzs liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C60288zzs) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C60288zzs c60288zzs) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c60288zzs);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C60288zzs c60288zzs) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c60288zzs);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C60288zzs read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C60288zzs(FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterOptionalString.INSTANCE.read(byteBuffer), FfiConverterInt.INSTANCE.read(byteBuffer).intValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C60288zzs c60288zzs) {
        Intrinsics.checkNotNullParameter(c60288zzs, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c60288zzs.copydefault()) + FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(c60288zzs.OLrzqt())) + FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(c60288zzs.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C60288zzs c60288zzs, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c60288zzs, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString.INSTANCE.write(c60288zzs.copydefault(), byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(c60288zzs.OLrzqt(), byteBuffer);
        FfiConverterInt.INSTANCE.write(c60288zzs.AEQbTJ(), byteBuffer);
    }
}
