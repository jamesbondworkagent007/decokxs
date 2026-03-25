package uniffi.compliance;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3978AwF;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.compliance.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeBlurMethodScores implements FfiConverterRustBuffer<C3978AwF> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBlurMethodScores INSTANCE = new FfiConverterTypeBlurMethodScores();

    private FfiConverterTypeBlurMethodScores() {
    }

    @Override // uniffi.compliance.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3978AwF lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3978AwF) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3978AwF liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3978AwF) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3978AwF c3978AwF) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3978AwF);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3978AwF c3978AwF) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3978AwF);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3978AwF read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        double dDoubleValue = ffiConverterDouble.read(byteBuffer).doubleValue();
        double dDoubleValue2 = ffiConverterDouble.read(byteBuffer).doubleValue();
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new C3978AwF(dDoubleValue, dDoubleValue2, ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterDouble.read(byteBuffer).doubleValue(), ffiConverterDouble.read(byteBuffer).doubleValue(), ffiConverterDouble.read(byteBuffer).doubleValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterDouble.read(byteBuffer).doubleValue(), ffiConverterDouble.read(byteBuffer).doubleValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3978AwF c3978AwF) {
        Intrinsics.checkNotNullParameter(c3978AwF, "");
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(ffiConverterDouble.m9533allocationSizeI7RO_PI(c3978AwF.djBIcL()) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c3978AwF.DbNXlk()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3978AwF.gEmmrt())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c3978AwF.KWHzl())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c3978AwF.AEQbTJ())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c3978AwF.copydefault())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3978AwF.EZpvd())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c3978AwF.valueOf())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c3978AwF.AYXKKw())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3978AwF.AhwBna())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3978AwF.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3978AwF c3978AwF, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3978AwF, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        ffiConverterDouble.write(c3978AwF.djBIcL(), byteBuffer);
        ffiConverterDouble.write(c3978AwF.DbNXlk(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c3978AwF.gEmmrt(), byteBuffer);
        ffiConverterDouble.write(c3978AwF.KWHzl(), byteBuffer);
        ffiConverterDouble.write(c3978AwF.AEQbTJ(), byteBuffer);
        ffiConverterDouble.write(c3978AwF.copydefault(), byteBuffer);
        ffiConverterBoolean.write(c3978AwF.EZpvd(), byteBuffer);
        ffiConverterDouble.write(c3978AwF.valueOf(), byteBuffer);
        ffiConverterDouble.write(c3978AwF.AYXKKw(), byteBuffer);
        ffiConverterBoolean.write(c3978AwF.AhwBna(), byteBuffer);
        ffiConverterBoolean.write(c3978AwF.OLrzqt(), byteBuffer);
    }
}
