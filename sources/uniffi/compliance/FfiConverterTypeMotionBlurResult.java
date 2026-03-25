package uniffi.compliance;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4167Azj;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.compliance.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeMotionBlurResult implements FfiConverterRustBuffer<C4167Azj> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMotionBlurResult INSTANCE = new FfiConverterTypeMotionBlurResult();

    private FfiConverterTypeMotionBlurResult() {
    }

    @Override // uniffi.compliance.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4167Azj lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4167Azj) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4167Azj liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4167Azj) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4167Azj c4167Azj) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4167Azj);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4167Azj c4167Azj) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4167Azj);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4167Azj read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        return new C4167Azj(ffiConverterDouble.read(byteBuffer).doubleValue(), ffiConverterDouble.read(byteBuffer).doubleValue(), FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4167Azj c4167Azj) {
        Intrinsics.checkNotNullParameter(c4167Azj, "");
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterDouble.m9533allocationSizeI7RO_PI(c4167Azj.copydefault()) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c4167Azj.EZpvd())) + FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(c4167Azj.KWHzl())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c4167Azj.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4167Azj c4167Azj, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4167Azj, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        ffiConverterDouble.write(c4167Azj.copydefault(), byteBuffer);
        ffiConverterDouble.write(c4167Azj.EZpvd(), byteBuffer);
        FfiConverterInt.INSTANCE.write(c4167Azj.KWHzl(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(c4167Azj.AEQbTJ(), byteBuffer);
    }
}
