package uniffi.retail_trading;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BkZ;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_trading.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeQuotationOptionsSimpleItemVo implements FfiConverterRustBuffer<BkZ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeQuotationOptionsSimpleItemVo INSTANCE = new FfiConverterTypeQuotationOptionsSimpleItemVo();

    private FfiConverterTypeQuotationOptionsSimpleItemVo() {
    }

    @Override // uniffi.retail_trading.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BkZ lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BkZ) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BkZ liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BkZ) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BkZ bkZ) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bkZ);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BkZ bkZ) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bkZ);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BkZ read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new BkZ(ffiConverterString.read(byteBuffer), FfiConverterOptionalString.INSTANCE.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BkZ bkZ) {
        Intrinsics.checkNotNullParameter(bkZ, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(bkZ.AEQbTJ()) + FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(bkZ.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkZ.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkZ.copydefault()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BkZ bkZ, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bkZ, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(bkZ.AEQbTJ(), byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(bkZ.KWHzl(), byteBuffer);
        ffiConverterString.write(bkZ.OLrzqt(), byteBuffer);
        ffiConverterString.write(bkZ.copydefault(), byteBuffer);
    }
}
