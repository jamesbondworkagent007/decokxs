package uniffi.retail_trading;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BlD;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_trading.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeSortConfig implements FfiConverterRustBuffer<BlD> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSortConfig INSTANCE = new FfiConverterTypeSortConfig();

    private FfiConverterTypeSortConfig() {
    }

    @Override // uniffi.retail_trading.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BlD lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BlD) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BlD liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BlD) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BlD blD) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, blD);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BlD blD) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, blD);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BlD read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new BlD(FfiConverterTypeSortBy.INSTANCE.read(byteBuffer), FfiConverterTypeSortOrder.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BlD blD) {
        Intrinsics.checkNotNullParameter(blD, "");
        return C56396yDv.copydefault(FfiConverterTypeSortBy.INSTANCE.mo9529allocationSizeI7RO_PI(blD.AEQbTJ()) + FfiConverterTypeSortOrder.INSTANCE.mo9529allocationSizeI7RO_PI(blD.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BlD blD, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(blD, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeSortBy.INSTANCE.write(blD.AEQbTJ(), byteBuffer);
        FfiConverterTypeSortOrder.INSTANCE.write(blD.OLrzqt(), byteBuffer);
    }
}
