package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zAW;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeDeviceVerifyInfo implements FfiConverterRustBuffer<zAW> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDeviceVerifyInfo INSTANCE = new FfiConverterTypeDeviceVerifyInfo();

    private FfiConverterTypeDeviceVerifyInfo() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zAW lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zAW) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zAW liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zAW) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zAW zaw) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zaw);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zAW zaw) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zaw);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zAW read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new zAW(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zAW zaw) {
        Intrinsics.checkNotNullParameter(zaw, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(zaw.OLrzqt()) + ffiConverterString.mo9529allocationSizeI7RO_PI(zaw.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(zaw.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(zaw.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(zaw.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(zaw.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zAW zaw, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zaw, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(zaw.OLrzqt(), byteBuffer);
        ffiConverterString.write(zaw.copydefault(), byteBuffer);
        ffiConverterString.write(zaw.EZpvd(), byteBuffer);
        ffiConverterString.write(zaw.AEQbTJ(), byteBuffer);
        ffiConverterString.write(zaw.valueOf(), byteBuffer);
        ffiConverterString.write(zaw.KWHzl(), byteBuffer);
    }
}
