package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.AGG;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeSummaryData implements FfiConverterRustBuffer<AGG> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSummaryData INSTANCE = new FfiConverterTypeSummaryData();

    private FfiConverterTypeSummaryData() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AGG lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AGG) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AGG liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AGG) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AGG agg) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, agg);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AGG agg) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, agg);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AGG read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return new AGG(ffiConverterOptionalString.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), ffiConverterOptionalString.read(byteBuffer), FfiConverterOptionalTypeSummaryDetail.INSTANCE.read(byteBuffer), FfiConverterString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AGG agg) {
        Intrinsics.checkNotNullParameter(agg, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(agg.copydefault()) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(agg.EZpvd())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(agg.OLrzqt())) + FfiConverterOptionalTypeSummaryDetail.INSTANCE.mo9529allocationSizeI7RO_PI(agg.AEQbTJ())) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(agg.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AGG agg, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(agg, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(agg.copydefault(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(agg.EZpvd(), byteBuffer);
        ffiConverterOptionalString.write(agg.OLrzqt(), byteBuffer);
        FfiConverterOptionalTypeSummaryDetail.INSTANCE.write(agg.AEQbTJ(), byteBuffer);
        FfiConverterString.INSTANCE.write(agg.KWHzl(), byteBuffer);
    }
}
