package uniffi.retail_trading;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BjY;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_trading.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeIndexTickersData implements FfiConverterRustBuffer<BjY> {
    public static final int $stable = 0;
    public static final FfiConverterTypeIndexTickersData INSTANCE = new FfiConverterTypeIndexTickersData();

    private FfiConverterTypeIndexTickersData() {
    }

    @Override // uniffi.retail_trading.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BjY lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BjY) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BjY liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BjY) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BjY bjY) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bjY);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BjY bjY) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bjY);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BjY read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new BjY(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BjY bjY) {
        Intrinsics.checkNotNullParameter(bjY, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(bjY.OLrzqt()) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjY.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjY.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjY.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjY.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjY.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjY.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjY.valueOf()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BjY bjY, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bjY, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(bjY.OLrzqt(), byteBuffer);
        ffiConverterString.write(bjY.KWHzl(), byteBuffer);
        ffiConverterString.write(bjY.AEQbTJ(), byteBuffer);
        ffiConverterString.write(bjY.EZpvd(), byteBuffer);
        ffiConverterString.write(bjY.copydefault(), byteBuffer);
        ffiConverterString.write(bjY.AYXKKw(), byteBuffer);
        ffiConverterString.write(bjY.gEmmrt(), byteBuffer);
        ffiConverterString.write(bjY.valueOf(), byteBuffer);
    }
}
