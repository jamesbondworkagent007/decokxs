package uniffi.compliance;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3979AwG;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.compliance.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeCardAngleResult implements FfiConverterRustBuffer<C3979AwG> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCardAngleResult INSTANCE = new FfiConverterTypeCardAngleResult();

    private FfiConverterTypeCardAngleResult() {
    }

    @Override // uniffi.compliance.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3979AwG lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3979AwG) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3979AwG liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3979AwG) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3979AwG c3979AwG) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3979AwG);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3979AwG c3979AwG) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3979AwG);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3979AwG read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterFloat ffiConverterFloat = FfiConverterFloat.INSTANCE;
        return new C3979AwG(ffiConverterFloat.read(byteBuffer).floatValue(), ffiConverterFloat.read(byteBuffer).floatValue(), ffiConverterFloat.read(byteBuffer).floatValue(), ffiConverterFloat.read(byteBuffer).floatValue(), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3979AwG c3979AwG) {
        Intrinsics.checkNotNullParameter(c3979AwG, "");
        FfiConverterFloat ffiConverterFloat = FfiConverterFloat.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterFloat.m9535allocationSizeI7RO_PI(c3979AwG.KWHzl()) + ffiConverterFloat.m9535allocationSizeI7RO_PI(c3979AwG.copydefault())) + ffiConverterFloat.m9535allocationSizeI7RO_PI(c3979AwG.OLrzqt())) + ffiConverterFloat.m9535allocationSizeI7RO_PI(c3979AwG.EZpvd())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c3979AwG.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3979AwG c3979AwG, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3979AwG, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterFloat ffiConverterFloat = FfiConverterFloat.INSTANCE;
        ffiConverterFloat.write(c3979AwG.KWHzl(), byteBuffer);
        ffiConverterFloat.write(c3979AwG.copydefault(), byteBuffer);
        ffiConverterFloat.write(c3979AwG.OLrzqt(), byteBuffer);
        ffiConverterFloat.write(c3979AwG.EZpvd(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(c3979AwG.AEQbTJ(), byteBuffer);
    }
}
