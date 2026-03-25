package uniffi.retail_trading;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BjJ;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_trading.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeDexInstrument implements FfiConverterRustBuffer<BjJ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDexInstrument INSTANCE = new FfiConverterTypeDexInstrument();

    private FfiConverterTypeDexInstrument() {
    }

    @Override // uniffi.retail_trading.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BjJ lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BjJ) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BjJ liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BjJ) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BjJ bjJ) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bjJ);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BjJ bjJ) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bjJ);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BjJ read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new BjJ(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BjJ bjJ) {
        Intrinsics.checkNotNullParameter(bjJ, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(bjJ.KWHzl()) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjJ.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjJ.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjJ.AhwBna())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjJ.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjJ.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjJ.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjJ.copydefault())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(bjJ.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjJ.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BjJ bjJ, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bjJ, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(bjJ.KWHzl(), byteBuffer);
        ffiConverterString.write(bjJ.OLrzqt(), byteBuffer);
        ffiConverterString.write(bjJ.AEQbTJ(), byteBuffer);
        ffiConverterString.write(bjJ.AhwBna(), byteBuffer);
        ffiConverterString.write(bjJ.AYXKKw(), byteBuffer);
        ffiConverterString.write(bjJ.valueOf(), byteBuffer);
        ffiConverterString.write(bjJ.djBIcL(), byteBuffer);
        ffiConverterString.write(bjJ.copydefault(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(bjJ.gEmmrt(), byteBuffer);
        ffiConverterString.write(bjJ.EZpvd(), byteBuffer);
    }
}
