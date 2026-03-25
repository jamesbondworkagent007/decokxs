package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3809Asu;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeQuickConvertOrderItem implements FfiConverterRustBuffer<C3809Asu> {
    public static final int $stable = 0;
    public static final FfiConverterTypeQuickConvertOrderItem INSTANCE = new FfiConverterTypeQuickConvertOrderItem();

    private FfiConverterTypeQuickConvertOrderItem() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3809Asu lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3809Asu) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3809Asu liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3809Asu) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3809Asu c3809Asu) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3809Asu);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3809Asu c3809Asu) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3809Asu);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3809Asu read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        return new C3809Asu(str, ffiConverterDouble.read(byteBuffer).doubleValue(), ffiConverterString.read(byteBuffer), ffiConverterDouble.read(byteBuffer).doubleValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3809Asu c3809Asu) {
        Intrinsics.checkNotNullParameter(c3809Asu, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jMo9529allocationSizeI7RO_PI = ffiConverterString.mo9529allocationSizeI7RO_PI(c3809Asu.copydefault());
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterDouble.m9533allocationSizeI7RO_PI(c3809Asu.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3809Asu.OLrzqt())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c3809Asu.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3809Asu c3809Asu, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3809Asu, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c3809Asu.copydefault(), byteBuffer);
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        ffiConverterDouble.write(c3809Asu.KWHzl(), byteBuffer);
        ffiConverterString.write(c3809Asu.OLrzqt(), byteBuffer);
        ffiConverterDouble.write(c3809Asu.EZpvd(), byteBuffer);
    }
}
