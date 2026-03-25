package uniffi.retail_trading;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BjJ;
import o.BkU;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_trading.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeQuotationDexItemVo implements FfiConverterRustBuffer<BkU> {
    public static final int $stable = 0;
    public static final FfiConverterTypeQuotationDexItemVo INSTANCE = new FfiConverterTypeQuotationDexItemVo();

    private FfiConverterTypeQuotationDexItemVo() {
    }

    @Override // uniffi.retail_trading.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BkU lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BkU) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BkU liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BkU) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BkU bkU) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bkU);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BkU bkU) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bkU);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BkU read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        BjJ bjJ = FfiConverterTypeDexInstrument.INSTANCE.read(byteBuffer);
        FfiConverterOptionalDouble ffiConverterOptionalDouble = FfiConverterOptionalDouble.INSTANCE;
        Double d = ffiConverterOptionalDouble.read(byteBuffer);
        Double d2 = ffiConverterOptionalDouble.read(byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        String str = ffiConverterOptionalString.read(byteBuffer);
        String str2 = ffiConverterOptionalString.read(byteBuffer);
        String str3 = ffiConverterOptionalString.read(byteBuffer);
        String str4 = ffiConverterOptionalString.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new BkU(bjJ, d, d2, str, str2, str3, str4, ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterOptionalString.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BkU bkU) {
        Intrinsics.checkNotNullParameter(bkU, "");
        long jM10299allocationSizeI7RO_PI = FfiConverterTypeDexInstrument.INSTANCE.mo9529allocationSizeI7RO_PI(bkU.KWHzl());
        FfiConverterOptionalDouble ffiConverterOptionalDouble = FfiConverterOptionalDouble.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(jM10299allocationSizeI7RO_PI + ffiConverterOptionalDouble.mo9529allocationSizeI7RO_PI(bkU.OLrzqt())) + ffiConverterOptionalDouble.mo9529allocationSizeI7RO_PI(bkU.AhwBna()));
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bkU.fetchVPNInfo())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bkU.AYXKKw())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bkU.gEmmrt())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bkU.valueOf()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 + ffiConverterBoolean.m9530allocationSizeI7RO_PI(bkU.values())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bkU.djBIcL())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(bkU.isConnected())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(bkU.AEQbTJ())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bkU.copydefault())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bkU.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BkU bkU, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bkU, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeDexInstrument.INSTANCE.write(bkU.KWHzl(), byteBuffer);
        FfiConverterOptionalDouble ffiConverterOptionalDouble = FfiConverterOptionalDouble.INSTANCE;
        ffiConverterOptionalDouble.write(bkU.OLrzqt(), byteBuffer);
        ffiConverterOptionalDouble.write(bkU.AhwBna(), byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(bkU.fetchVPNInfo(), byteBuffer);
        ffiConverterOptionalString.write(bkU.AYXKKw(), byteBuffer);
        ffiConverterOptionalString.write(bkU.gEmmrt(), byteBuffer);
        ffiConverterOptionalString.write(bkU.valueOf(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(bkU.values(), byteBuffer);
        ffiConverterOptionalString.write(bkU.djBIcL(), byteBuffer);
        ffiConverterBoolean.write(bkU.isConnected(), byteBuffer);
        ffiConverterBoolean.write(bkU.AEQbTJ(), byteBuffer);
        ffiConverterOptionalString.write(bkU.copydefault(), byteBuffer);
        ffiConverterOptionalString.write(bkU.EZpvd(), byteBuffer);
    }
}
