package uniffi.retail_kline;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4523Bhf;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_kline.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeBuySellMarkerPoint implements FfiConverterRustBuffer<C4523Bhf> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBuySellMarkerPoint INSTANCE = new FfiConverterTypeBuySellMarkerPoint();

    private FfiConverterTypeBuySellMarkerPoint() {
    }

    @Override // uniffi.retail_kline.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4523Bhf lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4523Bhf) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4523Bhf liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4523Bhf) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4523Bhf c4523Bhf) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4523Bhf);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4523Bhf c4523Bhf) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4523Bhf);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4523Bhf read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C4523Bhf(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4523Bhf c4523Bhf) {
        Intrinsics.checkNotNullParameter(c4523Bhf, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c4523Bhf.AEQbTJ()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4523Bhf.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4523Bhf.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4523Bhf.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4523Bhf.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4523Bhf c4523Bhf, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4523Bhf, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c4523Bhf.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c4523Bhf.copydefault(), byteBuffer);
        ffiConverterString.write(c4523Bhf.KWHzl(), byteBuffer);
        ffiConverterString.write(c4523Bhf.EZpvd(), byteBuffer);
        ffiConverterString.write(c4523Bhf.OLrzqt(), byteBuffer);
    }
}
