package uniffi.compliance;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4071Axt;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.compliance.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeIDScanConfig implements FfiConverterRustBuffer<C4071Axt> {
    public static final int $stable = 0;
    public static final FfiConverterTypeIDScanConfig INSTANCE = new FfiConverterTypeIDScanConfig();

    private FfiConverterTypeIDScanConfig() {
    }

    @Override // uniffi.compliance.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4071Axt lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4071Axt) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4071Axt liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4071Axt) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4071Axt c4071Axt) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4071Axt);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4071Axt c4071Axt) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4071Axt);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4071Axt read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        int iIntValue = ffiConverterInt.read(byteBuffer).intValue();
        FfiConverterFloat ffiConverterFloat = FfiConverterFloat.INSTANCE;
        float fFloatValue = ffiConverterFloat.read(byteBuffer).floatValue();
        float fFloatValue2 = ffiConverterFloat.read(byteBuffer).floatValue();
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        double dDoubleValue = ffiConverterDouble.read(byteBuffer).doubleValue();
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        boolean zBooleanValue = ffiConverterBoolean.read(byteBuffer).booleanValue();
        double dDoubleValue2 = ffiConverterDouble.read(byteBuffer).doubleValue();
        boolean zBooleanValue2 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        int iIntValue2 = ffiConverterInt.read(byteBuffer).intValue();
        int iIntValue3 = ffiConverterInt.read(byteBuffer).intValue();
        int iIntValue4 = ffiConverterInt.read(byteBuffer).intValue();
        boolean zBooleanValue3 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        float fFloatValue3 = ffiConverterFloat.read(byteBuffer).floatValue();
        boolean zBooleanValue4 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        int iIntValue5 = ffiConverterInt.read(byteBuffer).intValue();
        int iIntValue6 = ffiConverterInt.read(byteBuffer).intValue();
        int iIntValue7 = ffiConverterInt.read(byteBuffer).intValue();
        float fFloatValue4 = ffiConverterFloat.read(byteBuffer).floatValue();
        float fFloatValue5 = ffiConverterFloat.read(byteBuffer).floatValue();
        int iIntValue8 = ffiConverterInt.read(byteBuffer).intValue();
        int iIntValue9 = ffiConverterInt.read(byteBuffer).intValue();
        int iIntValue10 = ffiConverterInt.read(byteBuffer).intValue();
        float fFloatValue6 = ffiConverterFloat.read(byteBuffer).floatValue();
        boolean zBooleanValue5 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        double dDoubleValue3 = ffiConverterDouble.read(byteBuffer).doubleValue();
        boolean zBooleanValue6 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        long jLongValue = FfiConverterLong.INSTANCE.read(byteBuffer).longValue();
        boolean zBooleanValue7 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        boolean zBooleanValue8 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        boolean zBooleanValue9 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        float fFloatValue7 = ffiConverterFloat.read(byteBuffer).floatValue();
        float fFloatValue8 = ffiConverterFloat.read(byteBuffer).floatValue();
        float fFloatValue9 = ffiConverterFloat.read(byteBuffer).floatValue();
        boolean zBooleanValue10 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        double dDoubleValue4 = ffiConverterDouble.read(byteBuffer).doubleValue();
        double dDoubleValue5 = ffiConverterDouble.read(byteBuffer).doubleValue();
        boolean zBooleanValue11 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        boolean zBooleanValue12 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        int iIntValue11 = ffiConverterInt.read(byteBuffer).intValue();
        int iIntValue12 = ffiConverterInt.read(byteBuffer).intValue();
        boolean zBooleanValue13 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        int iIntValue13 = ffiConverterInt.read(byteBuffer).intValue();
        boolean zBooleanValue14 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        int iIntValue14 = ffiConverterInt.read(byteBuffer).intValue();
        int iIntValue15 = ffiConverterInt.read(byteBuffer).intValue();
        boolean zBooleanValue15 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        int iIntValue16 = ffiConverterInt.read(byteBuffer).intValue();
        boolean zBooleanValue16 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        double dDoubleValue6 = ffiConverterDouble.read(byteBuffer).doubleValue();
        double dDoubleValue7 = ffiConverterDouble.read(byteBuffer).doubleValue();
        double dDoubleValue8 = ffiConverterDouble.read(byteBuffer).doubleValue();
        double dDoubleValue9 = ffiConverterDouble.read(byteBuffer).doubleValue();
        double dDoubleValue10 = ffiConverterDouble.read(byteBuffer).doubleValue();
        double dDoubleValue11 = ffiConverterDouble.read(byteBuffer).doubleValue();
        double dDoubleValue12 = ffiConverterDouble.read(byteBuffer).doubleValue();
        double dDoubleValue13 = ffiConverterDouble.read(byteBuffer).doubleValue();
        double dDoubleValue14 = ffiConverterDouble.read(byteBuffer).doubleValue();
        double dDoubleValue15 = ffiConverterDouble.read(byteBuffer).doubleValue();
        double dDoubleValue16 = ffiConverterDouble.read(byteBuffer).doubleValue();
        double dDoubleValue17 = ffiConverterDouble.read(byteBuffer).doubleValue();
        float fFloatValue10 = ffiConverterFloat.read(byteBuffer).floatValue();
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C4071Axt(iIntValue, fFloatValue, fFloatValue2, dDoubleValue, zBooleanValue, dDoubleValue2, zBooleanValue2, iIntValue2, iIntValue3, iIntValue4, zBooleanValue3, fFloatValue3, zBooleanValue4, iIntValue5, iIntValue6, iIntValue7, fFloatValue4, fFloatValue5, iIntValue8, iIntValue9, iIntValue10, fFloatValue6, zBooleanValue5, dDoubleValue3, zBooleanValue6, jLongValue, zBooleanValue7, zBooleanValue8, zBooleanValue9, fFloatValue7, fFloatValue8, fFloatValue9, zBooleanValue10, dDoubleValue4, dDoubleValue5, zBooleanValue11, zBooleanValue12, iIntValue11, iIntValue12, zBooleanValue13, iIntValue13, zBooleanValue14, iIntValue14, iIntValue15, zBooleanValue15, iIntValue16, zBooleanValue16, dDoubleValue6, dDoubleValue7, dDoubleValue8, dDoubleValue9, dDoubleValue10, dDoubleValue11, dDoubleValue12, dDoubleValue13, dDoubleValue14, dDoubleValue15, dDoubleValue16, dDoubleValue17, fFloatValue10, ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4071Axt c4071Axt) {
        Intrinsics.checkNotNullParameter(c4071Axt, "");
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        long jM9536allocationSizeI7RO_PI = ffiConverterInt.m9536allocationSizeI7RO_PI(c4071Axt.gGvvIC());
        FfiConverterFloat ffiConverterFloat = FfiConverterFloat.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(jM9536allocationSizeI7RO_PI + ffiConverterFloat.m9535allocationSizeI7RO_PI(c4071Axt.QOLQEE())) + ffiConverterFloat.m9535allocationSizeI7RO_PI(c4071Axt.gHZMYf()));
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        long jCopydefault2 = C56396yDv.copydefault(jCopydefault + ffiConverterDouble.m9533allocationSizeI7RO_PI(c4071Axt.AubY()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        long jCopydefault3 = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4071Axt.iZzfmt())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c4071Axt.AuCTelauCTel())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4071Axt.zsXlph())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c4071Axt.QUSxYX())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c4071Axt.dvKsVJ())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c4071Axt.fFgQHt())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4071Axt.OcIXYQ())) + ffiConverterFloat.m9535allocationSizeI7RO_PI(c4071Axt.AYXKKw())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4071Axt.OLrzqt())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c4071Axt.gEmmrt())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c4071Axt.EZpvd())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c4071Axt.KWHzl())) + ffiConverterFloat.m9535allocationSizeI7RO_PI(c4071Axt.AEQbTJ())) + ffiConverterFloat.m9535allocationSizeI7RO_PI(c4071Axt.valueOf())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c4071Axt.djBIcL())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c4071Axt.AhwBna())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c4071Axt.copydefault())) + ffiConverterFloat.m9535allocationSizeI7RO_PI(c4071Axt.gasjUx())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4071Axt.values())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c4071Axt.AkhnZx())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4071Axt.fetchVPNInfo())) + FfiConverterLong.INSTANCE.m9537allocationSizeI7RO_PI(c4071Axt.ORxRYg())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4071Axt.finit())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4071Axt.flVtFt())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4071Axt.dxcTrN())) + ffiConverterFloat.m9535allocationSizeI7RO_PI(c4071Axt.hUfVAv())) + ffiConverterFloat.m9535allocationSizeI7RO_PI(c4071Axt.wlaJM())) + ffiConverterFloat.m9535allocationSizeI7RO_PI(c4071Axt.zuBGHE())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4071Axt.AxsJAY())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c4071Axt.sSMYrx())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c4071Axt.QbewEr())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4071Axt.fZBcTu())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4071Axt.aKErDB())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c4071Axt.RcXXUw())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c4071Axt.djSkpj())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4071Axt.QKVWgx())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c4071Axt.DTwDnp())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4071Axt.RJOkX())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c4071Axt.QVAiDq())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c4071Axt.QfsBiF())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4071Axt.UeEOUB())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c4071Axt.dNCPSb())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4071Axt.ejfBZ())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c4071Axt.AuCTel())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c4071Axt.fIwbmz())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c4071Axt.fJNWhG())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c4071Axt.fARcdN())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c4071Axt.getFieldNames())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c4071Axt.hDKMBd())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c4071Axt.iwGUEr())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c4071Axt.zLjUOn())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c4071Axt.isConnected())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c4071Axt.getNewProxyInstance())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c4071Axt.DbNXlk())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c4071Axt.uzCIH())) + ffiConverterFloat.m9535allocationSizeI7RO_PI(c4071Axt.giSNqX()));
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault3 + ffiConverterString.mo9529allocationSizeI7RO_PI(c4071Axt.AwvSrB())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4071Axt.fvQaOB()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4071Axt c4071Axt, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4071Axt, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        ffiConverterInt.write(c4071Axt.gGvvIC(), byteBuffer);
        FfiConverterFloat ffiConverterFloat = FfiConverterFloat.INSTANCE;
        ffiConverterFloat.write(c4071Axt.QOLQEE(), byteBuffer);
        ffiConverterFloat.write(c4071Axt.gHZMYf(), byteBuffer);
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        ffiConverterDouble.write(c4071Axt.AubY(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c4071Axt.iZzfmt(), byteBuffer);
        ffiConverterDouble.write(c4071Axt.AuCTelauCTel(), byteBuffer);
        ffiConverterBoolean.write(c4071Axt.zsXlph(), byteBuffer);
        ffiConverterInt.write(c4071Axt.QUSxYX(), byteBuffer);
        ffiConverterInt.write(c4071Axt.dvKsVJ(), byteBuffer);
        ffiConverterInt.write(c4071Axt.fFgQHt(), byteBuffer);
        ffiConverterBoolean.write(c4071Axt.OcIXYQ(), byteBuffer);
        ffiConverterFloat.write(c4071Axt.AYXKKw(), byteBuffer);
        ffiConverterBoolean.write(c4071Axt.OLrzqt(), byteBuffer);
        ffiConverterInt.write(c4071Axt.gEmmrt(), byteBuffer);
        ffiConverterInt.write(c4071Axt.EZpvd(), byteBuffer);
        ffiConverterInt.write(c4071Axt.KWHzl(), byteBuffer);
        ffiConverterFloat.write(c4071Axt.AEQbTJ(), byteBuffer);
        ffiConverterFloat.write(c4071Axt.valueOf(), byteBuffer);
        ffiConverterInt.write(c4071Axt.djBIcL(), byteBuffer);
        ffiConverterInt.write(c4071Axt.AhwBna(), byteBuffer);
        ffiConverterInt.write(c4071Axt.copydefault(), byteBuffer);
        ffiConverterFloat.write(c4071Axt.gasjUx(), byteBuffer);
        ffiConverterBoolean.write(c4071Axt.values(), byteBuffer);
        ffiConverterDouble.write(c4071Axt.AkhnZx(), byteBuffer);
        ffiConverterBoolean.write(c4071Axt.fetchVPNInfo(), byteBuffer);
        FfiConverterLong.INSTANCE.write(c4071Axt.ORxRYg(), byteBuffer);
        ffiConverterBoolean.write(c4071Axt.finit(), byteBuffer);
        ffiConverterBoolean.write(c4071Axt.flVtFt(), byteBuffer);
        ffiConverterBoolean.write(c4071Axt.dxcTrN(), byteBuffer);
        ffiConverterFloat.write(c4071Axt.hUfVAv(), byteBuffer);
        ffiConverterFloat.write(c4071Axt.wlaJM(), byteBuffer);
        ffiConverterFloat.write(c4071Axt.zuBGHE(), byteBuffer);
        ffiConverterBoolean.write(c4071Axt.AxsJAY(), byteBuffer);
        ffiConverterDouble.write(c4071Axt.sSMYrx(), byteBuffer);
        ffiConverterDouble.write(c4071Axt.QbewEr(), byteBuffer);
        ffiConverterBoolean.write(c4071Axt.fZBcTu(), byteBuffer);
        ffiConverterBoolean.write(c4071Axt.aKErDB(), byteBuffer);
        ffiConverterInt.write(c4071Axt.RcXXUw(), byteBuffer);
        ffiConverterInt.write(c4071Axt.djSkpj(), byteBuffer);
        ffiConverterBoolean.write(c4071Axt.QKVWgx(), byteBuffer);
        ffiConverterInt.write(c4071Axt.DTwDnp(), byteBuffer);
        ffiConverterBoolean.write(c4071Axt.RJOkX(), byteBuffer);
        ffiConverterInt.write(c4071Axt.QVAiDq(), byteBuffer);
        ffiConverterInt.write(c4071Axt.QfsBiF(), byteBuffer);
        ffiConverterBoolean.write(c4071Axt.UeEOUB(), byteBuffer);
        ffiConverterInt.write(c4071Axt.dNCPSb(), byteBuffer);
        ffiConverterBoolean.write(c4071Axt.ejfBZ(), byteBuffer);
        ffiConverterDouble.write(c4071Axt.AuCTel(), byteBuffer);
        ffiConverterDouble.write(c4071Axt.fIwbmz(), byteBuffer);
        ffiConverterDouble.write(c4071Axt.fJNWhG(), byteBuffer);
        ffiConverterDouble.write(c4071Axt.fARcdN(), byteBuffer);
        ffiConverterDouble.write(c4071Axt.getFieldNames(), byteBuffer);
        ffiConverterDouble.write(c4071Axt.hDKMBd(), byteBuffer);
        ffiConverterDouble.write(c4071Axt.iwGUEr(), byteBuffer);
        ffiConverterDouble.write(c4071Axt.zLjUOn(), byteBuffer);
        ffiConverterDouble.write(c4071Axt.isConnected(), byteBuffer);
        ffiConverterDouble.write(c4071Axt.getNewProxyInstance(), byteBuffer);
        ffiConverterDouble.write(c4071Axt.DbNXlk(), byteBuffer);
        ffiConverterDouble.write(c4071Axt.uzCIH(), byteBuffer);
        ffiConverterFloat.write(c4071Axt.giSNqX(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c4071Axt.AwvSrB(), byteBuffer);
        ffiConverterString.write(c4071Axt.fvQaOB(), byteBuffer);
    }
}
