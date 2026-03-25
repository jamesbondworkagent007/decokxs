package uniffi.retail_trading;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BkY;
import o.BlF;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_trading.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeQuotationSpotItemVo implements FfiConverterRustBuffer<BkY> {
    public static final int $stable = 0;
    public static final FfiConverterTypeQuotationSpotItemVo INSTANCE = new FfiConverterTypeQuotationSpotItemVo();

    private FfiConverterTypeQuotationSpotItemVo() {
    }

    @Override // uniffi.retail_trading.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BkY lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BkY) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BkY liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BkY) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BkY bkY) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bkY);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BkY bkY) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bkY);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BkY read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        BlF blF = FfiConverterTypeSpotInstrument.INSTANCE.read(byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        String str = ffiConverterOptionalString.read(byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str2 = ffiConverterString.read(byteBuffer);
        String str3 = ffiConverterString.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        boolean zBooleanValue = ffiConverterBoolean.read(byteBuffer).booleanValue();
        String str4 = ffiConverterString.read(byteBuffer);
        FfiConverterOptionalDouble ffiConverterOptionalDouble = FfiConverterOptionalDouble.INSTANCE;
        return new BkY(blF, str, str2, str3, zBooleanValue, str4, ffiConverterOptionalDouble.read(byteBuffer), ffiConverterOptionalDouble.read(byteBuffer), ffiConverterOptionalDouble.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BkY bkY) {
        Intrinsics.checkNotNullParameter(bkY, "");
        long jMo9529allocationSizeI7RO_PI = FfiConverterTypeSpotInstrument.INSTANCE.mo9529allocationSizeI7RO_PI(bkY.gEmmrt());
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bkY.copydefault()));
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterString.mo9529allocationSizeI7RO_PI(bkY.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkY.valueOf()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        long jCopydefault3 = C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 + ffiConverterBoolean.m9530allocationSizeI7RO_PI(bkY.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkY.OLrzqt()));
        FfiConverterOptionalDouble ffiConverterOptionalDouble = FfiConverterOptionalDouble.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault3 + ffiConverterOptionalDouble.mo9529allocationSizeI7RO_PI(bkY.KWHzl())) + ffiConverterOptionalDouble.mo9529allocationSizeI7RO_PI(bkY.AYXKKw())) + ffiConverterOptionalDouble.mo9529allocationSizeI7RO_PI(bkY.values())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bkY.isConnected())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bkY.fetchVPNInfo())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bkY.AkhnZx())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(bkY.DbNXlk())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bkY.AhwBna())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bkY.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BkY bkY, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bkY, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeSpotInstrument.INSTANCE.write(bkY.gEmmrt(), byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(bkY.copydefault(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(bkY.AEQbTJ(), byteBuffer);
        ffiConverterString.write(bkY.valueOf(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(bkY.djBIcL(), byteBuffer);
        ffiConverterString.write(bkY.OLrzqt(), byteBuffer);
        FfiConverterOptionalDouble ffiConverterOptionalDouble = FfiConverterOptionalDouble.INSTANCE;
        ffiConverterOptionalDouble.write(bkY.KWHzl(), byteBuffer);
        ffiConverterOptionalDouble.write(bkY.AYXKKw(), byteBuffer);
        ffiConverterOptionalDouble.write(bkY.values(), byteBuffer);
        ffiConverterOptionalString.write(bkY.isConnected(), byteBuffer);
        ffiConverterOptionalString.write(bkY.fetchVPNInfo(), byteBuffer);
        ffiConverterOptionalString.write(bkY.AkhnZx(), byteBuffer);
        ffiConverterBoolean.write(bkY.DbNXlk(), byteBuffer);
        ffiConverterOptionalString.write(bkY.AhwBna(), byteBuffer);
        ffiConverterOptionalString.write(bkY.EZpvd(), byteBuffer);
    }
}
