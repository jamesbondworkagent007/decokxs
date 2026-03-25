package uniffi.compliance;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3974AwB;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.compliance.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeCaptureFrameResult implements FfiConverterRustBuffer<C3974AwB> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCaptureFrameResult INSTANCE = new FfiConverterTypeCaptureFrameResult();

    private FfiConverterTypeCaptureFrameResult() {
    }

    @Override // uniffi.compliance.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3974AwB lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3974AwB) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3974AwB liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3974AwB) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3974AwB c3974AwB) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3974AwB);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3974AwB c3974AwB) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3974AwB);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3974AwB read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new C3974AwB(ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), FfiConverterDouble.INSTANCE.read(byteBuffer).doubleValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3974AwB c3974AwB) {
        Intrinsics.checkNotNullParameter(c3974AwB, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3974AwB.EZpvd()) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3974AwB.AEQbTJ())) + FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(c3974AwB.copydefault())) + FfiConverterDouble.INSTANCE.m9533allocationSizeI7RO_PI(c3974AwB.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3974AwB c3974AwB, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3974AwB, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c3974AwB.EZpvd(), byteBuffer);
        ffiConverterBoolean.write(c3974AwB.AEQbTJ(), byteBuffer);
        FfiConverterInt.INSTANCE.write(c3974AwB.copydefault(), byteBuffer);
        FfiConverterDouble.INSTANCE.write(c3974AwB.OLrzqt(), byteBuffer);
    }
}
