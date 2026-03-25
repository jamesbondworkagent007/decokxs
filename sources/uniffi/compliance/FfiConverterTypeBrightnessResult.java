package uniffi.compliance;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3977AwE;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.compliance.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeBrightnessResult implements FfiConverterRustBuffer<C3977AwE> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBrightnessResult INSTANCE = new FfiConverterTypeBrightnessResult();

    private FfiConverterTypeBrightnessResult() {
    }

    @Override // uniffi.compliance.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3977AwE lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3977AwE) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3977AwE liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3977AwE) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3977AwE c3977AwE) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3977AwE);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3977AwE c3977AwE) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3977AwE);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3977AwE read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        return new C3977AwE(ffiConverterDouble.read(byteBuffer).doubleValue(), ffiConverterDouble.read(byteBuffer).doubleValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3977AwE c3977AwE) {
        Intrinsics.checkNotNullParameter(c3977AwE, "");
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        return C56396yDv.copydefault(ffiConverterDouble.m9533allocationSizeI7RO_PI(c3977AwE.AEQbTJ()) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c3977AwE.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3977AwE c3977AwE, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3977AwE, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        ffiConverterDouble.write(c3977AwE.AEQbTJ(), byteBuffer);
        ffiConverterDouble.write(c3977AwE.KWHzl(), byteBuffer);
    }
}
