package uniffi.retail_trading;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BjV;
import o.BkW;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_trading.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeQuotationFuturesItemVo implements FfiConverterRustBuffer<BkW> {
    public static final int $stable = 0;
    public static final FfiConverterTypeQuotationFuturesItemVo INSTANCE = new FfiConverterTypeQuotationFuturesItemVo();

    private FfiConverterTypeQuotationFuturesItemVo() {
    }

    @Override // uniffi.retail_trading.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BkW lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BkW) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BkW liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BkW) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BkW bkW) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bkW);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BkW bkW) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bkW);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BkW read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        BjV bjV = FfiConverterTypeInstrument.INSTANCE.read(byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        String str3 = ffiConverterOptionalString.read(byteBuffer);
        FfiConverterOptionalDouble ffiConverterOptionalDouble = FfiConverterOptionalDouble.INSTANCE;
        return new BkW(bjV, str, str2, str3, ffiConverterOptionalDouble.read(byteBuffer), ffiConverterOptionalDouble.read(byteBuffer), ffiConverterOptionalDouble.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BkW bkW) {
        Intrinsics.checkNotNullParameter(bkW, "");
        long jMo9529allocationSizeI7RO_PI = FfiConverterTypeInstrument.INSTANCE.mo9529allocationSizeI7RO_PI(bkW.djBIcL());
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterString.mo9529allocationSizeI7RO_PI(bkW.values())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkW.AhwBna()));
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        long jCopydefault2 = C56396yDv.copydefault(jCopydefault + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bkW.AEQbTJ()));
        FfiConverterOptionalDouble ffiConverterOptionalDouble = FfiConverterOptionalDouble.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 + ffiConverterOptionalDouble.mo9529allocationSizeI7RO_PI(bkW.EZpvd())) + ffiConverterOptionalDouble.mo9529allocationSizeI7RO_PI(bkW.KWHzl())) + ffiConverterOptionalDouble.mo9529allocationSizeI7RO_PI(bkW.AYXKKw())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bkW.DbNXlk())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bkW.fetchVPNInfo())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bkW.valueOf())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(bkW.isConnected())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bkW.gEmmrt())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bkW.copydefault())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bkW.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BkW bkW, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bkW, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeInstrument.INSTANCE.write(bkW.djBIcL(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(bkW.values(), byteBuffer);
        ffiConverterString.write(bkW.AhwBna(), byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(bkW.AEQbTJ(), byteBuffer);
        FfiConverterOptionalDouble ffiConverterOptionalDouble = FfiConverterOptionalDouble.INSTANCE;
        ffiConverterOptionalDouble.write(bkW.EZpvd(), byteBuffer);
        ffiConverterOptionalDouble.write(bkW.KWHzl(), byteBuffer);
        ffiConverterOptionalDouble.write(bkW.AYXKKw(), byteBuffer);
        ffiConverterOptionalString.write(bkW.DbNXlk(), byteBuffer);
        ffiConverterOptionalString.write(bkW.fetchVPNInfo(), byteBuffer);
        ffiConverterOptionalString.write(bkW.valueOf(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(bkW.isConnected(), byteBuffer);
        ffiConverterOptionalString.write(bkW.gEmmrt(), byteBuffer);
        ffiConverterOptionalString.write(bkW.copydefault(), byteBuffer);
        ffiConverterOptionalString.write(bkW.OLrzqt(), byteBuffer);
    }
}
