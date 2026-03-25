package uniffi.dex;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C2164ABf;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes20.dex */
public final class FfiConverterTypeDexLiquidityChartData implements FfiConverterRustBuffer<C2164ABf> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDexLiquidityChartData INSTANCE = new FfiConverterTypeDexLiquidityChartData();

    private FfiConverterTypeDexLiquidityChartData() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2164ABf lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2164ABf) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2164ABf liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2164ABf) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2164ABf c2164ABf) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2164ABf);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2164ABf c2164ABf) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2164ABf);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2164ABf read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C2164ABf(FfiConverterSequenceTypeDexLiquidityChartItem.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeDexLiquidityChartConfig.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2164ABf c2164ABf) {
        Intrinsics.checkNotNullParameter(c2164ABf, "");
        return C56396yDv.copydefault(FfiConverterSequenceTypeDexLiquidityChartItem.INSTANCE.mo9529allocationSizeI7RO_PI((List) c2164ABf.KWHzl()) + FfiConverterOptionalTypeDexLiquidityChartConfig.INSTANCE.mo9529allocationSizeI7RO_PI(c2164ABf.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2164ABf c2164ABf, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2164ABf, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterSequenceTypeDexLiquidityChartItem.INSTANCE.write((List) c2164ABf.KWHzl(), byteBuffer);
        FfiConverterOptionalTypeDexLiquidityChartConfig.INSTANCE.write(c2164ABf.OLrzqt(), byteBuffer);
    }
}
