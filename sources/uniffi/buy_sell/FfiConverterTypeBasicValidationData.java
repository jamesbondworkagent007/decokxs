package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3576AoZ;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeBasicValidationData implements FfiConverterRustBuffer<C3576AoZ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBasicValidationData INSTANCE = new FfiConverterTypeBasicValidationData();

    private FfiConverterTypeBasicValidationData() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3576AoZ lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3576AoZ) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3576AoZ liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3576AoZ) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3576AoZ c3576AoZ) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3576AoZ);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3576AoZ c3576AoZ) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3576AoZ);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3576AoZ read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C3576AoZ(FfiConverterTypeBuyInputAmounts.INSTANCE.read(byteBuffer), FfiConverterTypeBuyInputRanges.INSTANCE.read(byteBuffer), FfiConverterTypeDexTradeLimitInfo.INSTANCE.read(byteBuffer), FfiConverterTypeBuySellTokenType.INSTANCE.read(byteBuffer), FfiConverterTypeInputValidationUiState.INSTANCE.read(byteBuffer), FfiConverterTypeInputFormatter.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3576AoZ c3576AoZ) {
        Intrinsics.checkNotNullParameter(c3576AoZ, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterTypeBuyInputAmounts.INSTANCE.mo9529allocationSizeI7RO_PI(c3576AoZ.copydefault()) + FfiConverterTypeBuyInputRanges.INSTANCE.mo9529allocationSizeI7RO_PI(c3576AoZ.KWHzl())) + FfiConverterTypeDexTradeLimitInfo.INSTANCE.mo9529allocationSizeI7RO_PI(c3576AoZ.OLrzqt())) + FfiConverterTypeBuySellTokenType.INSTANCE.mo9529allocationSizeI7RO_PI(c3576AoZ.AEQbTJ())) + FfiConverterTypeInputValidationUiState.INSTANCE.mo9529allocationSizeI7RO_PI(c3576AoZ.djBIcL())) + FfiConverterTypeInputFormatter.INSTANCE.mo9529allocationSizeI7RO_PI(c3576AoZ.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3576AoZ c3576AoZ, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3576AoZ, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeBuyInputAmounts.INSTANCE.write(c3576AoZ.copydefault(), byteBuffer);
        FfiConverterTypeBuyInputRanges.INSTANCE.write(c3576AoZ.KWHzl(), byteBuffer);
        FfiConverterTypeDexTradeLimitInfo.INSTANCE.write(c3576AoZ.OLrzqt(), byteBuffer);
        FfiConverterTypeBuySellTokenType.INSTANCE.write(c3576AoZ.AEQbTJ(), byteBuffer);
        FfiConverterTypeInputValidationUiState.INSTANCE.write(c3576AoZ.djBIcL(), byteBuffer);
        FfiConverterTypeInputFormatter.INSTANCE.write(c3576AoZ.EZpvd(), byteBuffer);
    }
}
