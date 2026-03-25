package uniffi.retail_trading;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BjT;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_trading.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeDexTickerData implements FfiConverterRustBuffer<BjT> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDexTickerData INSTANCE = new FfiConverterTypeDexTickerData();

    private FfiConverterTypeDexTickerData() {
    }

    @Override // uniffi.retail_trading.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BjT lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BjT) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BjT liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BjT) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BjT bjT) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bjT);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BjT bjT) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bjT);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BjT read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new BjT(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BjT bjT) {
        Intrinsics.checkNotNullParameter(bjT, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.zsXlph()) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.AuCTelauCTel())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.getFieldNames())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.ejfBZ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.fARcdN())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.AhwBna())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.fetchVPNInfo())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.OcIXYQ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.QVAiDq())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.QfsBiF())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.QbewEr())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.sSMYrx())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.gHZMYf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.zuBGHE())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.AwvSrB())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.AxsJAY())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.AkhnZx())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.QOLQEE())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.QKVWgx())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.ORxRYg())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.DTwDnp())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.fJNWhG())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.fIwbmz())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.AuCTel())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.uzCIH())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.DbNXlk())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.wlaJM())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.AubY())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.hDKMBd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.iwGUEr())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.getNewProxyInstance())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.zLjUOn())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.values())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjT.isConnected()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BjT bjT, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bjT, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(bjT.zsXlph(), byteBuffer);
        ffiConverterString.write(bjT.AuCTelauCTel(), byteBuffer);
        ffiConverterString.write(bjT.EZpvd(), byteBuffer);
        ffiConverterString.write(bjT.getFieldNames(), byteBuffer);
        ffiConverterString.write(bjT.ejfBZ(), byteBuffer);
        ffiConverterString.write(bjT.fARcdN(), byteBuffer);
        ffiConverterString.write(bjT.valueOf(), byteBuffer);
        ffiConverterString.write(bjT.AYXKKw(), byteBuffer);
        ffiConverterString.write(bjT.AEQbTJ(), byteBuffer);
        ffiConverterString.write(bjT.AhwBna(), byteBuffer);
        ffiConverterString.write(bjT.KWHzl(), byteBuffer);
        ffiConverterString.write(bjT.copydefault(), byteBuffer);
        ffiConverterString.write(bjT.fetchVPNInfo(), byteBuffer);
        ffiConverterString.write(bjT.OcIXYQ(), byteBuffer);
        ffiConverterString.write(bjT.QVAiDq(), byteBuffer);
        ffiConverterString.write(bjT.QfsBiF(), byteBuffer);
        ffiConverterString.write(bjT.QbewEr(), byteBuffer);
        ffiConverterString.write(bjT.sSMYrx(), byteBuffer);
        ffiConverterString.write(bjT.gHZMYf(), byteBuffer);
        ffiConverterString.write(bjT.zuBGHE(), byteBuffer);
        ffiConverterString.write(bjT.AwvSrB(), byteBuffer);
        ffiConverterString.write(bjT.AxsJAY(), byteBuffer);
        ffiConverterString.write(bjT.AkhnZx(), byteBuffer);
        ffiConverterString.write(bjT.QOLQEE(), byteBuffer);
        ffiConverterString.write(bjT.QKVWgx(), byteBuffer);
        ffiConverterString.write(bjT.ORxRYg(), byteBuffer);
        ffiConverterString.write(bjT.DTwDnp(), byteBuffer);
        ffiConverterString.write(bjT.gEmmrt(), byteBuffer);
        ffiConverterString.write(bjT.fJNWhG(), byteBuffer);
        ffiConverterString.write(bjT.fIwbmz(), byteBuffer);
        ffiConverterString.write(bjT.AuCTel(), byteBuffer);
        ffiConverterString.write(bjT.uzCIH(), byteBuffer);
        ffiConverterString.write(bjT.OLrzqt(), byteBuffer);
        ffiConverterString.write(bjT.DbNXlk(), byteBuffer);
        ffiConverterString.write(bjT.wlaJM(), byteBuffer);
        ffiConverterString.write(bjT.AubY(), byteBuffer);
        ffiConverterString.write(bjT.hDKMBd(), byteBuffer);
        ffiConverterString.write(bjT.iwGUEr(), byteBuffer);
        ffiConverterString.write(bjT.getNewProxyInstance(), byteBuffer);
        ffiConverterString.write(bjT.zLjUOn(), byteBuffer);
        ffiConverterString.write(bjT.djBIcL(), byteBuffer);
        ffiConverterString.write(bjT.values(), byteBuffer);
        ffiConverterString.write(bjT.isConnected(), byteBuffer);
    }
}
