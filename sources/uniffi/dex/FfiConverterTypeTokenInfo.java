package uniffi.dex;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.AGP;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeTokenInfo implements FfiConverterRustBuffer<AGP> {
    public static final int $stable = 0;
    public static final FfiConverterTypeTokenInfo INSTANCE = new FfiConverterTypeTokenInfo();

    private FfiConverterTypeTokenInfo() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AGP lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AGP) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AGP liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AGP) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AGP agp) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, agp);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AGP agp) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, agp);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AGP read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        String str3 = ffiConverterString.read(byteBuffer);
        String str4 = ffiConverterString.read(byteBuffer);
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        int iIntValue = ffiConverterInt.read(byteBuffer).intValue();
        String str5 = ffiConverterString.read(byteBuffer);
        String str6 = ffiConverterString.read(byteBuffer);
        String str7 = ffiConverterString.read(byteBuffer);
        String str8 = ffiConverterString.read(byteBuffer);
        String str9 = ffiConverterString.read(byteBuffer);
        String str10 = ffiConverterString.read(byteBuffer);
        String str11 = ffiConverterString.read(byteBuffer);
        String str12 = ffiConverterString.read(byteBuffer);
        String str13 = ffiConverterString.read(byteBuffer);
        String str14 = ffiConverterString.read(byteBuffer);
        String str15 = ffiConverterString.read(byteBuffer);
        String str16 = ffiConverterString.read(byteBuffer);
        String str17 = ffiConverterString.read(byteBuffer);
        double dDoubleValue = FfiConverterDouble.INSTANCE.read(byteBuffer).doubleValue();
        String str18 = ffiConverterString.read(byteBuffer);
        String str19 = ffiConverterString.read(byteBuffer);
        String str20 = ffiConverterString.read(byteBuffer);
        int iIntValue2 = ffiConverterInt.read(byteBuffer).intValue();
        int iIntValue3 = ffiConverterInt.read(byteBuffer).intValue();
        int iIntValue4 = ffiConverterInt.read(byteBuffer).intValue();
        int iIntValue5 = ffiConverterInt.read(byteBuffer).intValue();
        int iIntValue6 = ffiConverterInt.read(byteBuffer).intValue();
        int iIntValue7 = ffiConverterInt.read(byteBuffer).intValue();
        int iIntValue8 = ffiConverterInt.read(byteBuffer).intValue();
        int iIntValue9 = ffiConverterInt.read(byteBuffer).intValue();
        int iIntValue10 = ffiConverterInt.read(byteBuffer).intValue();
        int iIntValue11 = ffiConverterInt.read(byteBuffer).intValue();
        boolean zBooleanValue = FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue();
        String str21 = ffiConverterString.read(byteBuffer);
        String str22 = ffiConverterString.read(byteBuffer);
        String str23 = ffiConverterString.read(byteBuffer);
        int iIntValue12 = ffiConverterInt.read(byteBuffer).intValue();
        String str24 = ffiConverterString.read(byteBuffer);
        List<List<? extends String>> list = FfiConverterSequenceSequenceString.INSTANCE.read(byteBuffer);
        String str25 = ffiConverterString.read(byteBuffer);
        int iIntValue13 = ffiConverterInt.read(byteBuffer).intValue();
        int iIntValue14 = ffiConverterInt.read(byteBuffer).intValue();
        String str26 = ffiConverterString.read(byteBuffer);
        String str27 = ffiConverterString.read(byteBuffer);
        String str28 = ffiConverterString.read(byteBuffer);
        int iIntValue15 = ffiConverterInt.read(byteBuffer).intValue();
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        return new AGP(str, str2, str3, str4, iIntValue, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, dDoubleValue, str18, str19, str20, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, iIntValue7, iIntValue8, iIntValue9, iIntValue10, iIntValue11, zBooleanValue, str21, str22, str23, iIntValue12, str24, list, str25, iIntValue13, iIntValue14, str26, str27, str28, iIntValue15, ffiConverterLong.read(byteBuffer).longValue(), ffiConverterLong.read(byteBuffer).longValue(), ffiConverterLong.read(byteBuffer).longValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AGP agp) {
        Intrinsics.checkNotNullParameter(agp, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(agp.AuCTelauCTel()) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.sSMYrx())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.AxsJAY())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.zuBGHE()));
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterInt.m9536allocationSizeI7RO_PI(agp.gHZMYf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.QKVWgx())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.AhwBna())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.AwvSrB())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.fetchVPNInfo())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.ejfBZ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.AuCTel())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.DTwDnp())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.QOLQEE())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.wlaJM())) + FfiConverterDouble.INSTANCE.m9533allocationSizeI7RO_PI(agp.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.zLjUOn())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.AEQbTJ())) + ffiConverterInt.m9536allocationSizeI7RO_PI(agp.RJOkX())) + ffiConverterInt.m9536allocationSizeI7RO_PI(agp.UeEOUB())) + ffiConverterInt.m9536allocationSizeI7RO_PI(agp.QbewEr())) + ffiConverterInt.m9536allocationSizeI7RO_PI(agp.QVAiDq())) + ffiConverterInt.m9536allocationSizeI7RO_PI(agp.QUSxYX())) + ffiConverterInt.m9536allocationSizeI7RO_PI(agp.QfsBiF())) + ffiConverterInt.m9536allocationSizeI7RO_PI(agp.dNCPSb())) + ffiConverterInt.m9536allocationSizeI7RO_PI(agp.OcIXYQ())) + ffiConverterInt.m9536allocationSizeI7RO_PI(agp.RcXXUw())) + ffiConverterInt.m9536allocationSizeI7RO_PI(agp.aKErDB())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(agp.AkhnZx())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.uzCIH())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.getNewProxyInstance())) + ffiConverterInt.m9536allocationSizeI7RO_PI(agp.ORxRYg())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.isConnected())) + FfiConverterSequenceSequenceString.INSTANCE.mo9529allocationSizeI7RO_PI((List) agp.zsXlph())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.DbNXlk())) + ffiConverterInt.m9536allocationSizeI7RO_PI(agp.fJNWhG())) + ffiConverterInt.m9536allocationSizeI7RO_PI(agp.fARcdN())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.AubY())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.getFieldNames())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agp.hDKMBd())) + ffiConverterInt.m9536allocationSizeI7RO_PI(agp.iwGUEr()));
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 + ffiConverterLong.m9537allocationSizeI7RO_PI(agp.values())) + ffiConverterLong.m9537allocationSizeI7RO_PI(agp.KWHzl())) + ffiConverterLong.m9537allocationSizeI7RO_PI(agp.fIwbmz()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AGP agp, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(agp, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(agp.AuCTelauCTel(), byteBuffer);
        ffiConverterString.write(agp.sSMYrx(), byteBuffer);
        ffiConverterString.write(agp.AxsJAY(), byteBuffer);
        ffiConverterString.write(agp.zuBGHE(), byteBuffer);
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        ffiConverterInt.write(agp.gHZMYf(), byteBuffer);
        ffiConverterString.write(agp.QKVWgx(), byteBuffer);
        ffiConverterString.write(agp.djBIcL(), byteBuffer);
        ffiConverterString.write(agp.AhwBna(), byteBuffer);
        ffiConverterString.write(agp.valueOf(), byteBuffer);
        ffiConverterString.write(agp.gEmmrt(), byteBuffer);
        ffiConverterString.write(agp.AwvSrB(), byteBuffer);
        ffiConverterString.write(agp.fetchVPNInfo(), byteBuffer);
        ffiConverterString.write(agp.ejfBZ(), byteBuffer);
        ffiConverterString.write(agp.AuCTel(), byteBuffer);
        ffiConverterString.write(agp.DTwDnp(), byteBuffer);
        ffiConverterString.write(agp.QOLQEE(), byteBuffer);
        ffiConverterString.write(agp.EZpvd(), byteBuffer);
        ffiConverterString.write(agp.wlaJM(), byteBuffer);
        FfiConverterDouble.INSTANCE.write(agp.OLrzqt(), byteBuffer);
        ffiConverterString.write(agp.zLjUOn(), byteBuffer);
        ffiConverterString.write(agp.copydefault(), byteBuffer);
        ffiConverterString.write(agp.AEQbTJ(), byteBuffer);
        ffiConverterInt.write(agp.RJOkX(), byteBuffer);
        ffiConverterInt.write(agp.UeEOUB(), byteBuffer);
        ffiConverterInt.write(agp.QbewEr(), byteBuffer);
        ffiConverterInt.write(agp.QVAiDq(), byteBuffer);
        ffiConverterInt.write(agp.QUSxYX(), byteBuffer);
        ffiConverterInt.write(agp.QfsBiF(), byteBuffer);
        ffiConverterInt.write(agp.dNCPSb(), byteBuffer);
        ffiConverterInt.write(agp.OcIXYQ(), byteBuffer);
        ffiConverterInt.write(agp.RcXXUw(), byteBuffer);
        ffiConverterInt.write(agp.aKErDB(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(agp.AkhnZx(), byteBuffer);
        ffiConverterString.write(agp.uzCIH(), byteBuffer);
        ffiConverterString.write(agp.AYXKKw(), byteBuffer);
        ffiConverterString.write(agp.getNewProxyInstance(), byteBuffer);
        ffiConverterInt.write(agp.ORxRYg(), byteBuffer);
        ffiConverterString.write(agp.isConnected(), byteBuffer);
        FfiConverterSequenceSequenceString.INSTANCE.write((List) agp.zsXlph(), byteBuffer);
        ffiConverterString.write(agp.DbNXlk(), byteBuffer);
        ffiConverterInt.write(agp.fJNWhG(), byteBuffer);
        ffiConverterInt.write(agp.fARcdN(), byteBuffer);
        ffiConverterString.write(agp.AubY(), byteBuffer);
        ffiConverterString.write(agp.getFieldNames(), byteBuffer);
        ffiConverterString.write(agp.hDKMBd(), byteBuffer);
        ffiConverterInt.write(agp.iwGUEr(), byteBuffer);
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        ffiConverterLong.write(agp.values(), byteBuffer);
        ffiConverterLong.write(agp.KWHzl(), byteBuffer);
        ffiConverterLong.write(agp.fIwbmz(), byteBuffer);
    }
}
