package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3687Aqe;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeBuySellConvertOrderDetail implements FfiConverterRustBuffer<C3687Aqe> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBuySellConvertOrderDetail INSTANCE = new FfiConverterTypeBuySellConvertOrderDetail();

    private FfiConverterTypeBuySellConvertOrderDetail() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3687Aqe lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3687Aqe) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3687Aqe liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3687Aqe) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3687Aqe c3687Aqe) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3687Aqe);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3687Aqe c3687Aqe) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3687Aqe);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3687Aqe read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C3687Aqe(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3687Aqe c3687Aqe) {
        Intrinsics.checkNotNullParameter(c3687Aqe, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c3687Aqe.KWHzl()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3687Aqe.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3687Aqe.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3687Aqe.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3687Aqe.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3687Aqe.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3687Aqe.AYXKKw())) + FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(c3687Aqe.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3687Aqe.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3687Aqe.AkhnZx())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3687Aqe.AhwBna()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3687Aqe c3687Aqe, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3687Aqe, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c3687Aqe.KWHzl(), byteBuffer);
        ffiConverterString.write(c3687Aqe.copydefault(), byteBuffer);
        ffiConverterString.write(c3687Aqe.OLrzqt(), byteBuffer);
        ffiConverterString.write(c3687Aqe.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c3687Aqe.EZpvd(), byteBuffer);
        ffiConverterString.write(c3687Aqe.gEmmrt(), byteBuffer);
        ffiConverterString.write(c3687Aqe.AYXKKw(), byteBuffer);
        FfiConverterInt.INSTANCE.write(c3687Aqe.valueOf(), byteBuffer);
        ffiConverterString.write(c3687Aqe.djBIcL(), byteBuffer);
        ffiConverterString.write(c3687Aqe.AkhnZx(), byteBuffer);
        ffiConverterString.write(c3687Aqe.AhwBna(), byteBuffer);
    }
}
