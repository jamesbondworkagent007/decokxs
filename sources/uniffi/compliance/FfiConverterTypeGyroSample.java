package uniffi.compliance;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3995AwW;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.compliance.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeGyroSample implements FfiConverterRustBuffer<C3995AwW> {
    public static final int $stable = 0;
    public static final FfiConverterTypeGyroSample INSTANCE = new FfiConverterTypeGyroSample();

    private FfiConverterTypeGyroSample() {
    }

    @Override // uniffi.compliance.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3995AwW lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3995AwW) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3995AwW liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3995AwW) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3995AwW c3995AwW) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3995AwW);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3995AwW c3995AwW) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3995AwW);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3995AwW read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        return new C3995AwW(ffiConverterDouble.read(byteBuffer).doubleValue(), ffiConverterDouble.read(byteBuffer).doubleValue(), ffiConverterDouble.read(byteBuffer).doubleValue(), FfiConverterLong.INSTANCE.read(byteBuffer).longValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3995AwW c3995AwW) {
        Intrinsics.checkNotNullParameter(c3995AwW, "");
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterDouble.m9533allocationSizeI7RO_PI(c3995AwW.copydefault()) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c3995AwW.KWHzl())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c3995AwW.EZpvd())) + FfiConverterLong.INSTANCE.m9537allocationSizeI7RO_PI(c3995AwW.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3995AwW c3995AwW, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3995AwW, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        ffiConverterDouble.write(c3995AwW.copydefault(), byteBuffer);
        ffiConverterDouble.write(c3995AwW.KWHzl(), byteBuffer);
        ffiConverterDouble.write(c3995AwW.EZpvd(), byteBuffer);
        FfiConverterLong.INSTANCE.write(c3995AwW.AEQbTJ(), byteBuffer);
    }
}
