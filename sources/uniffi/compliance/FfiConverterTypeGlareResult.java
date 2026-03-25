package uniffi.compliance;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3988AwP;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.compliance.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeGlareResult implements FfiConverterRustBuffer<C3988AwP> {
    public static final int $stable = 0;
    public static final FfiConverterTypeGlareResult INSTANCE = new FfiConverterTypeGlareResult();

    private FfiConverterTypeGlareResult() {
    }

    @Override // uniffi.compliance.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3988AwP lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3988AwP) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3988AwP liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3988AwP) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3988AwP c3988AwP) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3988AwP);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3988AwP c3988AwP) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3988AwP);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3988AwP read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return new C3988AwP(ffiConverterInt.read(byteBuffer).intValue(), ffiConverterInt.read(byteBuffer).intValue(), FfiConverterDouble.INSTANCE.read(byteBuffer).doubleValue(), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3988AwP c3988AwP) {
        Intrinsics.checkNotNullParameter(c3988AwP, "");
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterInt.m9536allocationSizeI7RO_PI(c3988AwP.KWHzl()) + ffiConverterInt.m9536allocationSizeI7RO_PI(c3988AwP.copydefault())) + FfiConverterDouble.INSTANCE.m9533allocationSizeI7RO_PI(c3988AwP.OLrzqt())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c3988AwP.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3988AwP c3988AwP, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3988AwP, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        ffiConverterInt.write(c3988AwP.KWHzl(), byteBuffer);
        ffiConverterInt.write(c3988AwP.copydefault(), byteBuffer);
        FfiConverterDouble.INSTANCE.write(c3988AwP.OLrzqt(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(c3988AwP.EZpvd(), byteBuffer);
    }
}
