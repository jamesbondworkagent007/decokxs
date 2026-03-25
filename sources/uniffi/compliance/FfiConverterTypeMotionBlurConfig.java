package uniffi.compliance;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4166Azi;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.compliance.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeMotionBlurConfig implements FfiConverterRustBuffer<C4166Azi> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMotionBlurConfig INSTANCE = new FfiConverterTypeMotionBlurConfig();

    private FfiConverterTypeMotionBlurConfig() {
    }

    @Override // uniffi.compliance.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4166Azi lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4166Azi) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4166Azi liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4166Azi) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4166Azi c4166Azi) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4166Azi);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4166Azi c4166Azi) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4166Azi);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4166Azi read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        double dDoubleValue = FfiConverterDouble.INSTANCE.read(byteBuffer).doubleValue();
        FfiConverterUInt ffiConverterUInt = FfiConverterUInt.INSTANCE;
        return new C4166Azi(dDoubleValue, ffiConverterUInt.m9554readOGnWXxg(byteBuffer), ffiConverterUInt.m9554readOGnWXxg(byteBuffer), null);
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4166Azi c4166Azi) {
        Intrinsics.checkNotNullParameter(c4166Azi, "");
        long jM9533allocationSizeI7RO_PI = FfiConverterDouble.INSTANCE.m9533allocationSizeI7RO_PI(c4166Azi.KWHzl());
        FfiConverterUInt ffiConverterUInt = FfiConverterUInt.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(jM9533allocationSizeI7RO_PI + ffiConverterUInt.m9549allocationSizej8A87jM(c4166Azi.OLrzqt())) + ffiConverterUInt.m9549allocationSizej8A87jM(c4166Azi.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4166Azi c4166Azi, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4166Azi, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterDouble.INSTANCE.write(c4166Azi.KWHzl(), byteBuffer);
        FfiConverterUInt ffiConverterUInt = FfiConverterUInt.INSTANCE;
        ffiConverterUInt.m9555writeqim9Vi0(c4166Azi.OLrzqt(), byteBuffer);
        ffiConverterUInt.m9555writeqim9Vi0(c4166Azi.EZpvd(), byteBuffer);
    }
}
