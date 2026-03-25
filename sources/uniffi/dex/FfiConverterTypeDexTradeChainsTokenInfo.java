package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.ABI;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeDexTradeChainsTokenInfo implements FfiConverterRustBuffer<ABI> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDexTradeChainsTokenInfo INSTANCE = new FfiConverterTypeDexTradeChainsTokenInfo();

    private FfiConverterTypeDexTradeChainsTokenInfo() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public ABI lift2(@NotNull RustBuffer.ByValue byValue) {
        return (ABI) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public ABI liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (ABI) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull ABI abi) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abi);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull ABI abi) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abi);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public ABI read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        long jLongValue = ffiConverterLong.read(byteBuffer).longValue();
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        String str3 = ffiConverterString.read(byteBuffer);
        String str4 = ffiConverterString.read(byteBuffer);
        String str5 = ffiConverterString.read(byteBuffer);
        long jLongValue2 = ffiConverterLong.read(byteBuffer).longValue();
        String str6 = ffiConverterString.read(byteBuffer);
        long jLongValue3 = ffiConverterLong.read(byteBuffer).longValue();
        String str7 = ffiConverterString.read(byteBuffer);
        String str8 = ffiConverterString.read(byteBuffer);
        long jLongValue4 = ffiConverterLong.read(byteBuffer).longValue();
        long jLongValue5 = ffiConverterLong.read(byteBuffer).longValue();
        long jLongValue6 = ffiConverterLong.read(byteBuffer).longValue();
        long jLongValue7 = ffiConverterLong.read(byteBuffer).longValue();
        long jLongValue8 = ffiConverterLong.read(byteBuffer).longValue();
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        String str9 = ffiConverterOptionalString.read(byteBuffer);
        long jLongValue9 = ffiConverterLong.read(byteBuffer).longValue();
        boolean zBooleanValue = FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue();
        String str10 = ffiConverterOptionalString.read(byteBuffer);
        String str11 = ffiConverterOptionalString.read(byteBuffer);
        String str12 = ffiConverterOptionalString.read(byteBuffer);
        String str13 = ffiConverterOptionalString.read(byteBuffer);
        String str14 = ffiConverterOptionalString.read(byteBuffer);
        String str15 = ffiConverterOptionalString.read(byteBuffer);
        FfiConverterOptionalLong ffiConverterOptionalLong = FfiConverterOptionalLong.INSTANCE;
        return new ABI(jLongValue, str, str2, str3, str4, str5, jLongValue2, str6, jLongValue3, str7, str8, jLongValue4, jLongValue5, jLongValue6, jLongValue7, jLongValue8, str9, jLongValue9, zBooleanValue, str10, str11, str12, str13, str14, str15, ffiConverterOptionalLong.read(byteBuffer), ffiConverterOptionalLong.read(byteBuffer), ffiConverterOptionalLong.read(byteBuffer), ffiConverterOptionalLong.read(byteBuffer), ffiConverterOptionalLong.read(byteBuffer), ffiConverterOptionalLong.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalLong.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), FfiConverterOptionalSequenceSequenceString.INSTANCE.read(byteBuffer), FfiConverterOptionalSequenceTypeTagData.INSTANCE.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), FfiConverterOptionalSequenceLong.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull ABI abi) {
        Intrinsics.checkNotNullParameter(abi, "");
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        long jM9537allocationSizeI7RO_PI = ffiConverterLong.m9537allocationSizeI7RO_PI(abi.AuCTel());
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jM9537allocationSizeI7RO_PI + ffiConverterString.mo9529allocationSizeI7RO_PI(abi.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abi.QOLQEE())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abi.sSMYrx())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abi.zuBGHE())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abi.AxsJAY())) + ffiConverterLong.m9537allocationSizeI7RO_PI(abi.isConnected())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abi.QKVWgx())) + ffiConverterLong.m9537allocationSizeI7RO_PI(abi.aKErDB())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abi.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abi.UeEOUB())) + ffiConverterLong.m9537allocationSizeI7RO_PI(abi.DTwDnp())) + ffiConverterLong.m9537allocationSizeI7RO_PI(abi.QfsBiF())) + ffiConverterLong.m9537allocationSizeI7RO_PI(abi.djSkpj())) + ffiConverterLong.m9537allocationSizeI7RO_PI(abi.dxcTrN())) + ffiConverterLong.m9537allocationSizeI7RO_PI(abi.iwGUEr()));
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abi.gEmmrt())) + ffiConverterLong.m9537allocationSizeI7RO_PI(abi.zsXlph())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(abi.DbNXlk())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abi.fetchVPNInfo())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abi.values())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abi.AkhnZx())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abi.djBIcL())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abi.AhwBna())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abi.AEQbTJ()));
        FfiConverterOptionalLong ffiConverterOptionalLong = FfiConverterOptionalLong.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 + ffiConverterOptionalLong.mo9529allocationSizeI7RO_PI(abi.getNewProxyInstance())) + ffiConverterOptionalLong.mo9529allocationSizeI7RO_PI(abi.OcIXYQ())) + ffiConverterOptionalLong.mo9529allocationSizeI7RO_PI(abi.fFgQHt())) + ffiConverterOptionalLong.mo9529allocationSizeI7RO_PI(abi.dNCPSb())) + ffiConverterOptionalLong.mo9529allocationSizeI7RO_PI(abi.RcXXUw())) + ffiConverterOptionalLong.mo9529allocationSizeI7RO_PI(abi.fIwbmz())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abi.KWHzl())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abi.zLjUOn())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abi.QVAiDq())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abi.ORxRYg())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abi.AYXKKw())) + ffiConverterOptionalLong.mo9529allocationSizeI7RO_PI(abi.AuCTelauCTel())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abi.wlaJM())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abi.hDKMBd())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abi.copydefault())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abi.QUSxYX())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abi.RJOkX())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abi.ejfBZ())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abi.uzCIH())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abi.valueOf())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abi.QbewEr())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abi.fJNWhG())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abi.fARcdN())) + FfiConverterOptionalSequenceSequenceString.INSTANCE.mo9529allocationSizeI7RO_PI(abi.AubY())) + FfiConverterOptionalSequenceTypeTagData.INSTANCE.mo9529allocationSizeI7RO_PI(abi.AwvSrB())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abi.getFieldNames())) + FfiConverterOptionalSequenceLong.INSTANCE.mo9529allocationSizeI7RO_PI(abi.gHZMYf()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull ABI abi, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abi, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        ffiConverterLong.write(abi.AuCTel(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(abi.EZpvd(), byteBuffer);
        ffiConverterString.write(abi.QOLQEE(), byteBuffer);
        ffiConverterString.write(abi.sSMYrx(), byteBuffer);
        ffiConverterString.write(abi.zuBGHE(), byteBuffer);
        ffiConverterString.write(abi.AxsJAY(), byteBuffer);
        ffiConverterLong.write(abi.isConnected(), byteBuffer);
        ffiConverterString.write(abi.QKVWgx(), byteBuffer);
        ffiConverterLong.write(abi.aKErDB(), byteBuffer);
        ffiConverterString.write(abi.OLrzqt(), byteBuffer);
        ffiConverterString.write(abi.UeEOUB(), byteBuffer);
        ffiConverterLong.write(abi.DTwDnp(), byteBuffer);
        ffiConverterLong.write(abi.QfsBiF(), byteBuffer);
        ffiConverterLong.write(abi.djSkpj(), byteBuffer);
        ffiConverterLong.write(abi.dxcTrN(), byteBuffer);
        ffiConverterLong.write(abi.iwGUEr(), byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(abi.gEmmrt(), byteBuffer);
        ffiConverterLong.write(abi.zsXlph(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(abi.DbNXlk(), byteBuffer);
        ffiConverterOptionalString.write(abi.fetchVPNInfo(), byteBuffer);
        ffiConverterOptionalString.write(abi.values(), byteBuffer);
        ffiConverterOptionalString.write(abi.AkhnZx(), byteBuffer);
        ffiConverterOptionalString.write(abi.djBIcL(), byteBuffer);
        ffiConverterOptionalString.write(abi.AhwBna(), byteBuffer);
        ffiConverterOptionalString.write(abi.AEQbTJ(), byteBuffer);
        FfiConverterOptionalLong ffiConverterOptionalLong = FfiConverterOptionalLong.INSTANCE;
        ffiConverterOptionalLong.write(abi.getNewProxyInstance(), byteBuffer);
        ffiConverterOptionalLong.write(abi.OcIXYQ(), byteBuffer);
        ffiConverterOptionalLong.write(abi.fFgQHt(), byteBuffer);
        ffiConverterOptionalLong.write(abi.dNCPSb(), byteBuffer);
        ffiConverterOptionalLong.write(abi.RcXXUw(), byteBuffer);
        ffiConverterOptionalLong.write(abi.fIwbmz(), byteBuffer);
        ffiConverterOptionalString.write(abi.KWHzl(), byteBuffer);
        ffiConverterOptionalString.write(abi.zLjUOn(), byteBuffer);
        ffiConverterOptionalString.write(abi.QVAiDq(), byteBuffer);
        ffiConverterOptionalString.write(abi.ORxRYg(), byteBuffer);
        ffiConverterOptionalString.write(abi.AYXKKw(), byteBuffer);
        ffiConverterOptionalLong.write(abi.AuCTelauCTel(), byteBuffer);
        ffiConverterOptionalString.write(abi.wlaJM(), byteBuffer);
        ffiConverterOptionalString.write(abi.hDKMBd(), byteBuffer);
        ffiConverterOptionalString.write(abi.copydefault(), byteBuffer);
        ffiConverterOptionalString.write(abi.QUSxYX(), byteBuffer);
        ffiConverterOptionalString.write(abi.RJOkX(), byteBuffer);
        ffiConverterOptionalString.write(abi.ejfBZ(), byteBuffer);
        ffiConverterOptionalString.write(abi.uzCIH(), byteBuffer);
        ffiConverterOptionalString.write(abi.valueOf(), byteBuffer);
        ffiConverterOptionalString.write(abi.QbewEr(), byteBuffer);
        ffiConverterOptionalString.write(abi.fJNWhG(), byteBuffer);
        ffiConverterOptionalString.write(abi.fARcdN(), byteBuffer);
        FfiConverterOptionalSequenceSequenceString.INSTANCE.write(abi.AubY(), byteBuffer);
        FfiConverterOptionalSequenceTypeTagData.INSTANCE.write(abi.AwvSrB(), byteBuffer);
        ffiConverterOptionalString.write(abi.getFieldNames(), byteBuffer);
        FfiConverterOptionalSequenceLong.INSTANCE.write(abi.gHZMYf(), byteBuffer);
    }
}
