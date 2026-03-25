package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zJI;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeNewDeviceAuthInfo implements FfiConverterRustBuffer<zJI> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceAuthInfo INSTANCE = new FfiConverterTypeNewDeviceAuthInfo();

    private FfiConverterTypeNewDeviceAuthInfo() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zJI lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zJI) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zJI liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zJI) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zJI zji) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zji);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zJI zji) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zji);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zJI read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new zJI(FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterLong.INSTANCE.read(byteBuffer).longValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zJI zji) {
        Intrinsics.checkNotNullParameter(zji, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(zji.KWHzl()) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(zji.EZpvd())) + FfiConverterLong.INSTANCE.m9537allocationSizeI7RO_PI(zji.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zJI zji, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zji, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterInt.INSTANCE.write(zji.KWHzl(), byteBuffer);
        FfiConverterString.INSTANCE.write(zji.EZpvd(), byteBuffer);
        FfiConverterLong.INSTANCE.write(zji.OLrzqt(), byteBuffer);
    }
}
