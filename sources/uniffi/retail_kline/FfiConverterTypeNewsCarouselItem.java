package uniffi.retail_kline;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BhQ;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_kline.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeNewsCarouselItem implements FfiConverterRustBuffer<BhQ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewsCarouselItem INSTANCE = new FfiConverterTypeNewsCarouselItem();

    private FfiConverterTypeNewsCarouselItem() {
    }

    @Override // uniffi.retail_kline.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BhQ lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BhQ) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BhQ liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BhQ) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BhQ bhQ) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bhQ);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BhQ bhQ) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bhQ);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BhQ read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new BhQ(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BhQ bhQ) {
        Intrinsics.checkNotNullParameter(bhQ, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(bhQ.OLrzqt()) + ffiConverterString.mo9529allocationSizeI7RO_PI(bhQ.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bhQ.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bhQ.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bhQ.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bhQ.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BhQ bhQ, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bhQ, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(bhQ.OLrzqt(), byteBuffer);
        ffiConverterString.write(bhQ.AYXKKw(), byteBuffer);
        ffiConverterString.write(bhQ.copydefault(), byteBuffer);
        ffiConverterString.write(bhQ.KWHzl(), byteBuffer);
        ffiConverterString.write(bhQ.AEQbTJ(), byteBuffer);
        ffiConverterString.write(bhQ.EZpvd(), byteBuffer);
    }
}
