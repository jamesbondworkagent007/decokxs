package uniffi.retail_trading;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BlE;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_trading.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeTradeGroupData implements FfiConverterRustBuffer<BlE> {
    public static final int $stable = 0;
    public static final FfiConverterTypeTradeGroupData INSTANCE = new FfiConverterTypeTradeGroupData();

    private FfiConverterTypeTradeGroupData() {
    }

    @Override // uniffi.retail_trading.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BlE lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BlE) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BlE liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BlE) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BlE blE) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, blE);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BlE blE) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, blE);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BlE read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return new BlE(ffiConverterOptionalString.read(byteBuffer), FfiConverterString.INSTANCE.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BlE blE) {
        Intrinsics.checkNotNullParameter(blE, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(blE.copydefault()) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(blE.AEQbTJ())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(blE.EZpvd())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(blE.KWHzl())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(blE.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BlE blE, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(blE, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(blE.copydefault(), byteBuffer);
        FfiConverterString.INSTANCE.write(blE.AEQbTJ(), byteBuffer);
        ffiConverterOptionalString.write(blE.EZpvd(), byteBuffer);
        ffiConverterOptionalString.write(blE.KWHzl(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(blE.OLrzqt(), byteBuffer);
    }
}
