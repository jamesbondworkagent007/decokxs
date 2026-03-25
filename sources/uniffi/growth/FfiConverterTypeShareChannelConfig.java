package uniffi.growth;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.APG;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.growth.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeShareChannelConfig implements FfiConverterRustBuffer<APG> {
    public static final int $stable = 0;
    public static final FfiConverterTypeShareChannelConfig INSTANCE = new FfiConverterTypeShareChannelConfig();

    private FfiConverterTypeShareChannelConfig() {
    }

    @Override // uniffi.growth.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public APG lift2(@NotNull RustBuffer.ByValue byValue) {
        return (APG) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public APG liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (APG) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull APG apg) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, apg);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull APG apg) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, apg);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public APG read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        List<Integer> list = FfiConverterSequenceInt.INSTANCE.read(byteBuffer);
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return new APG(list, ffiConverterInt.read(byteBuffer).intValue(), ffiConverterInt.read(byteBuffer).intValue(), ffiConverterInt.read(byteBuffer).intValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull APG apg) {
        Intrinsics.checkNotNullParameter(apg, "");
        long jMo9529allocationSizeI7RO_PI = FfiConverterSequenceInt.INSTANCE.mo9529allocationSizeI7RO_PI((List) apg.copydefault());
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterInt.m9536allocationSizeI7RO_PI(apg.EZpvd())) + ffiConverterInt.m9536allocationSizeI7RO_PI(apg.KWHzl())) + ffiConverterInt.m9536allocationSizeI7RO_PI(apg.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull APG apg, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(apg, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterSequenceInt.INSTANCE.write((List) apg.copydefault(), byteBuffer);
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        ffiConverterInt.write(apg.EZpvd(), byteBuffer);
        ffiConverterInt.write(apg.KWHzl(), byteBuffer);
        ffiConverterInt.write(apg.OLrzqt(), byteBuffer);
    }
}
