package uniffi.retail_kline;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.BhP;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_kline.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeNewsCarouselResult implements FfiConverterRustBuffer<BhP> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewsCarouselResult INSTANCE = new FfiConverterTypeNewsCarouselResult();

    private FfiConverterTypeNewsCarouselResult() {
    }

    @Override // uniffi.retail_kline.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BhP lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BhP) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BhP liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BhP) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BhP bhP) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bhP);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BhP bhP) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bhP);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BhP read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterSequenceTypeNewsCarouselItem ffiConverterSequenceTypeNewsCarouselItem = FfiConverterSequenceTypeNewsCarouselItem.INSTANCE;
        return new BhP(ffiConverterSequenceTypeNewsCarouselItem.read(byteBuffer), ffiConverterSequenceTypeNewsCarouselItem.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BhP bhP) {
        Intrinsics.checkNotNullParameter(bhP, "");
        FfiConverterSequenceTypeNewsCarouselItem ffiConverterSequenceTypeNewsCarouselItem = FfiConverterSequenceTypeNewsCarouselItem.INSTANCE;
        return C56396yDv.copydefault(ffiConverterSequenceTypeNewsCarouselItem.mo9529allocationSizeI7RO_PI((List) bhP.KWHzl()) + ffiConverterSequenceTypeNewsCarouselItem.mo9529allocationSizeI7RO_PI((List) bhP.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BhP bhP, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bhP, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterSequenceTypeNewsCarouselItem ffiConverterSequenceTypeNewsCarouselItem = FfiConverterSequenceTypeNewsCarouselItem.INSTANCE;
        ffiConverterSequenceTypeNewsCarouselItem.write((List) bhP.KWHzl(), byteBuffer);
        ffiConverterSequenceTypeNewsCarouselItem.write((List) bhP.EZpvd(), byteBuffer);
    }
}
