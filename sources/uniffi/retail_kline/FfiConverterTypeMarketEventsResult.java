package uniffi.retail_kline;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.BhA;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_kline.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeMarketEventsResult implements FfiConverterRustBuffer<BhA> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMarketEventsResult INSTANCE = new FfiConverterTypeMarketEventsResult();

    private FfiConverterTypeMarketEventsResult() {
    }

    @Override // uniffi.retail_kline.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BhA lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BhA) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BhA liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BhA) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BhA bhA) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bhA);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BhA bhA) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bhA);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BhA read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new BhA(FfiConverterOptionalString.INSTANCE.read(byteBuffer), FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), FfiConverterSequenceTypeMarketEventsVo.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BhA bhA) {
        Intrinsics.checkNotNullParameter(bhA, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(bhA.EZpvd()) + FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(bhA.copydefault())) + FfiConverterSequenceTypeMarketEventsVo.INSTANCE.mo9529allocationSizeI7RO_PI((List) bhA.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BhA bhA, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bhA, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString.INSTANCE.write(bhA.EZpvd(), byteBuffer);
        FfiConverterInt.INSTANCE.write(bhA.copydefault(), byteBuffer);
        FfiConverterSequenceTypeMarketEventsVo.INSTANCE.write((List) bhA.AEQbTJ(), byteBuffer);
    }
}
