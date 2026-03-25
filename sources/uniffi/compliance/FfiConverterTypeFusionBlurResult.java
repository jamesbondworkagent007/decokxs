package uniffi.compliance;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3982AwJ;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.compliance.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeFusionBlurResult implements FfiConverterRustBuffer<C3982AwJ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeFusionBlurResult INSTANCE = new FfiConverterTypeFusionBlurResult();

    private FfiConverterTypeFusionBlurResult() {
    }

    @Override // uniffi.compliance.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3982AwJ lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3982AwJ) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3982AwJ liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3982AwJ) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3982AwJ c3982AwJ) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3982AwJ);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3982AwJ c3982AwJ) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3982AwJ);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3982AwJ read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        return new C3982AwJ(ffiConverterDouble.read(byteBuffer).doubleValue(), FfiConverterTypeBlurDecision.INSTANCE.read(byteBuffer), FfiConverterTypeBlurType.INSTANCE.read(byteBuffer), ffiConverterDouble.read(byteBuffer).doubleValue(), FfiConverterTypeBlurMethodScores.INSTANCE.read(byteBuffer), FfiConverterString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3982AwJ c3982AwJ) {
        Intrinsics.checkNotNullParameter(c3982AwJ, "");
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterDouble.m9533allocationSizeI7RO_PI(c3982AwJ.AEQbTJ()) + FfiConverterTypeBlurDecision.INSTANCE.mo9529allocationSizeI7RO_PI(c3982AwJ.EZpvd())) + FfiConverterTypeBlurType.INSTANCE.mo9529allocationSizeI7RO_PI(c3982AwJ.copydefault())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c3982AwJ.OLrzqt())) + FfiConverterTypeBlurMethodScores.INSTANCE.mo9529allocationSizeI7RO_PI(c3982AwJ.gEmmrt())) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c3982AwJ.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3982AwJ c3982AwJ, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3982AwJ, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        ffiConverterDouble.write(c3982AwJ.AEQbTJ(), byteBuffer);
        FfiConverterTypeBlurDecision.INSTANCE.write(c3982AwJ.EZpvd(), byteBuffer);
        FfiConverterTypeBlurType.INSTANCE.write(c3982AwJ.copydefault(), byteBuffer);
        ffiConverterDouble.write(c3982AwJ.OLrzqt(), byteBuffer);
        FfiConverterTypeBlurMethodScores.INSTANCE.write(c3982AwJ.gEmmrt(), byteBuffer);
        FfiConverterString.INSTANCE.write(c3982AwJ.KWHzl(), byteBuffer);
    }
}
