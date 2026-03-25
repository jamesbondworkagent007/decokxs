package uniffi.buy_sell;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC3718ArI;
import o.C3682AqZ;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeBuySellOrderDetailData implements FfiConverterRustBuffer<C3682AqZ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBuySellOrderDetailData INSTANCE = new FfiConverterTypeBuySellOrderDetailData();

    private FfiConverterTypeBuySellOrderDetailData() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3682AqZ lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3682AqZ) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3682AqZ liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3682AqZ) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3682AqZ c3682AqZ) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3682AqZ);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3682AqZ c3682AqZ) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3682AqZ);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3682AqZ read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        BuySellTradeType buySellTradeType = FfiConverterTypeBuySellTradeType.INSTANCE.read(byteBuffer);
        AbstractC3718ArI abstractC3718ArI = FfiConverterTypeBuySellOrderStatus.INSTANCE.read(byteBuffer);
        BuySellOrderType buySellOrderType = FfiConverterTypeBuySellOrderType.INSTANCE.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        String str3 = ffiConverterString.read(byteBuffer);
        String str4 = ffiConverterString.read(byteBuffer);
        String str5 = ffiConverterString.read(byteBuffer);
        String str6 = ffiConverterString.read(byteBuffer);
        String str7 = ffiConverterString.read(byteBuffer);
        String str8 = ffiConverterString.read(byteBuffer);
        String str9 = ffiConverterString.read(byteBuffer);
        String str10 = ffiConverterString.read(byteBuffer);
        long jLongValue = FfiConverterLong.INSTANCE.read(byteBuffer).longValue();
        String str11 = ffiConverterString.read(byteBuffer);
        String str12 = ffiConverterString.read(byteBuffer);
        int iIntValue = FfiConverterInt.INSTANCE.read(byteBuffer).intValue();
        String str13 = ffiConverterString.read(byteBuffer);
        String str14 = ffiConverterString.read(byteBuffer);
        String str15 = ffiConverterString.read(byteBuffer);
        String str16 = ffiConverterString.read(byteBuffer);
        String str17 = ffiConverterString.read(byteBuffer);
        String str18 = ffiConverterString.read(byteBuffer);
        String str19 = ffiConverterString.read(byteBuffer);
        String str20 = ffiConverterString.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new C3682AqZ(str, buySellTradeType, abstractC3718ArI, buySellOrderType, str2, str3, str4, str5, str6, str7, str8, str9, str10, jLongValue, str11, str12, iIntValue, str13, str14, str15, str16, str17, str18, str19, str20, ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterString.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterString.read(byteBuffer), FfiConverterOptionalTypeBuySellDexOrderDetail.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeBuySellConvertOrderDetail.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeBuySellFxRateConversion.INSTANCE.read(byteBuffer), FfiConverterSequenceTypeBuySellSubOrderDetail.INSTANCE.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3682AqZ c3682AqZ) {
        Intrinsics.checkNotNullParameter(c3682AqZ, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.iwGUEr()) + FfiConverterTypeBuySellTradeType.INSTANCE.mo9529allocationSizeI7RO_PI(c3682AqZ.ORxRYg())) + FfiConverterTypeBuySellOrderStatus.INSTANCE.mo9529allocationSizeI7RO_PI(c3682AqZ.zuBGHE())) + FfiConverterTypeBuySellOrderType.INSTANCE.mo9529allocationSizeI7RO_PI(c3682AqZ.getNewProxyInstance())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.wlaJM())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.gHZMYf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.AwvSrB())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.sSMYrx())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.AubY())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.AhwBna())) + FfiConverterLong.INSTANCE.m9537allocationSizeI7RO_PI(c3682AqZ.DbNXlk())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.isConnected())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.fetchVPNInfo())) + FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(c3682AqZ.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.zLjUOn())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.zsXlph())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.AuCTelauCTel())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.uzCIH())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.EZpvd()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3682AqZ.AxsJAY())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.values())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3682AqZ.DTwDnp())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.hDKMBd())) + FfiConverterOptionalTypeBuySellDexOrderDetail.INSTANCE.mo9529allocationSizeI7RO_PI(c3682AqZ.AkhnZx())) + FfiConverterOptionalTypeBuySellConvertOrderDetail.INSTANCE.mo9529allocationSizeI7RO_PI(c3682AqZ.gEmmrt())) + FfiConverterOptionalTypeBuySellFxRateConversion.INSTANCE.mo9529allocationSizeI7RO_PI(c3682AqZ.getFieldNames())) + FfiConverterSequenceTypeBuySellSubOrderDetail.INSTANCE.mo9529allocationSizeI7RO_PI((List) c3682AqZ.QOLQEE())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.fJNWhG())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.fIwbmz())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.AuCTel())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.ejfBZ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3682AqZ.fARcdN()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3682AqZ c3682AqZ, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3682AqZ, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c3682AqZ.iwGUEr(), byteBuffer);
        FfiConverterTypeBuySellTradeType.INSTANCE.write(c3682AqZ.ORxRYg(), byteBuffer);
        FfiConverterTypeBuySellOrderStatus.INSTANCE.write(c3682AqZ.zuBGHE(), byteBuffer);
        FfiConverterTypeBuySellOrderType.INSTANCE.write(c3682AqZ.getNewProxyInstance(), byteBuffer);
        ffiConverterString.write(c3682AqZ.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c3682AqZ.copydefault(), byteBuffer);
        ffiConverterString.write(c3682AqZ.KWHzl(), byteBuffer);
        ffiConverterString.write(c3682AqZ.wlaJM(), byteBuffer);
        ffiConverterString.write(c3682AqZ.gHZMYf(), byteBuffer);
        ffiConverterString.write(c3682AqZ.AwvSrB(), byteBuffer);
        ffiConverterString.write(c3682AqZ.sSMYrx(), byteBuffer);
        ffiConverterString.write(c3682AqZ.AubY(), byteBuffer);
        ffiConverterString.write(c3682AqZ.AhwBna(), byteBuffer);
        FfiConverterLong.INSTANCE.write(c3682AqZ.DbNXlk(), byteBuffer);
        ffiConverterString.write(c3682AqZ.isConnected(), byteBuffer);
        ffiConverterString.write(c3682AqZ.fetchVPNInfo(), byteBuffer);
        FfiConverterInt.INSTANCE.write(c3682AqZ.valueOf(), byteBuffer);
        ffiConverterString.write(c3682AqZ.AYXKKw(), byteBuffer);
        ffiConverterString.write(c3682AqZ.djBIcL(), byteBuffer);
        ffiConverterString.write(c3682AqZ.zLjUOn(), byteBuffer);
        ffiConverterString.write(c3682AqZ.zsXlph(), byteBuffer);
        ffiConverterString.write(c3682AqZ.AuCTelauCTel(), byteBuffer);
        ffiConverterString.write(c3682AqZ.uzCIH(), byteBuffer);
        ffiConverterString.write(c3682AqZ.OLrzqt(), byteBuffer);
        ffiConverterString.write(c3682AqZ.EZpvd(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c3682AqZ.AxsJAY(), byteBuffer);
        ffiConverterString.write(c3682AqZ.values(), byteBuffer);
        ffiConverterBoolean.write(c3682AqZ.DTwDnp(), byteBuffer);
        ffiConverterString.write(c3682AqZ.hDKMBd(), byteBuffer);
        FfiConverterOptionalTypeBuySellDexOrderDetail.INSTANCE.write(c3682AqZ.AkhnZx(), byteBuffer);
        FfiConverterOptionalTypeBuySellConvertOrderDetail.INSTANCE.write(c3682AqZ.gEmmrt(), byteBuffer);
        FfiConverterOptionalTypeBuySellFxRateConversion.INSTANCE.write(c3682AqZ.getFieldNames(), byteBuffer);
        FfiConverterSequenceTypeBuySellSubOrderDetail.INSTANCE.write((List) c3682AqZ.QOLQEE(), byteBuffer);
        ffiConverterString.write(c3682AqZ.fJNWhG(), byteBuffer);
        ffiConverterString.write(c3682AqZ.fIwbmz(), byteBuffer);
        ffiConverterString.write(c3682AqZ.AuCTel(), byteBuffer);
        ffiConverterString.write(c3682AqZ.ejfBZ(), byteBuffer);
        ffiConverterString.write(c3682AqZ.fARcdN(), byteBuffer);
    }
}
