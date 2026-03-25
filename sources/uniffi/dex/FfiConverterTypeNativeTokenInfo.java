package uniffi.dex;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.ABN;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes20.dex */
public final class FfiConverterTypeNativeTokenInfo implements FfiConverterRustBuffer<ABN> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNativeTokenInfo INSTANCE = new FfiConverterTypeNativeTokenInfo();

    private FfiConverterTypeNativeTokenInfo() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public ABN lift2(@NotNull RustBuffer.ByValue byValue) {
        return (ABN) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public ABN liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (ABN) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull ABN abn) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abn);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull ABN abn) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abn);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public ABN read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        long jLongValue = ffiConverterLong.read(byteBuffer).longValue();
        long jLongValue2 = ffiConverterLong.read(byteBuffer).longValue();
        long jLongValue3 = ffiConverterLong.read(byteBuffer).longValue();
        long jLongValue4 = ffiConverterLong.read(byteBuffer).longValue();
        long jLongValue5 = ffiConverterLong.read(byteBuffer).longValue();
        long jLongValue6 = ffiConverterLong.read(byteBuffer).longValue();
        long jLongValue7 = ffiConverterLong.read(byteBuffer).longValue();
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        String str3 = ffiConverterString.read(byteBuffer);
        long jLongValue8 = ffiConverterLong.read(byteBuffer).longValue();
        String str4 = ffiConverterString.read(byteBuffer);
        String str5 = ffiConverterString.read(byteBuffer);
        String str6 = ffiConverterString.read(byteBuffer);
        String str7 = ffiConverterString.read(byteBuffer);
        long jLongValue9 = ffiConverterLong.read(byteBuffer).longValue();
        String str8 = ffiConverterString.read(byteBuffer);
        String str9 = ffiConverterString.read(byteBuffer);
        String str10 = ffiConverterString.read(byteBuffer);
        String str11 = ffiConverterString.read(byteBuffer);
        long jLongValue10 = ffiConverterLong.read(byteBuffer).longValue();
        boolean zBooleanValue = FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue();
        long jLongValue11 = ffiConverterLong.read(byteBuffer).longValue();
        long jLongValue12 = ffiConverterLong.read(byteBuffer).longValue();
        long jLongValue13 = ffiConverterLong.read(byteBuffer).longValue();
        String str12 = ffiConverterString.read(byteBuffer);
        long jLongValue14 = ffiConverterLong.read(byteBuffer).longValue();
        String str13 = ffiConverterString.read(byteBuffer);
        String str14 = ffiConverterString.read(byteBuffer);
        String str15 = ffiConverterString.read(byteBuffer);
        String str16 = ffiConverterString.read(byteBuffer);
        long jLongValue15 = ffiConverterLong.read(byteBuffer).longValue();
        FfiConverterSequenceString ffiConverterSequenceString = FfiConverterSequenceString.INSTANCE;
        return new ABN(jLongValue, jLongValue2, jLongValue3, jLongValue4, jLongValue5, jLongValue6, jLongValue7, str, str2, str3, jLongValue8, str4, str5, str6, str7, jLongValue9, str8, str9, str10, str11, jLongValue10, zBooleanValue, jLongValue11, jLongValue12, jLongValue13, str12, jLongValue14, str13, str14, str15, str16, jLongValue15, ffiConverterSequenceString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterLong.read(byteBuffer).longValue(), ffiConverterString.read(byteBuffer), ffiConverterSequenceString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterLong.read(byteBuffer).longValue(), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull ABN abn) {
        Intrinsics.checkNotNullParameter(abn, "");
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterLong.m9537allocationSizeI7RO_PI(abn.getNewProxyInstance()) + ffiConverterLong.m9537allocationSizeI7RO_PI(abn.AuCTel())) + ffiConverterLong.m9537allocationSizeI7RO_PI(abn.QKVWgx())) + ffiConverterLong.m9537allocationSizeI7RO_PI(abn.values())) + ffiConverterLong.m9537allocationSizeI7RO_PI(abn.QVAiDq())) + ffiConverterLong.m9537allocationSizeI7RO_PI(abn.djBIcL())) + ffiConverterLong.m9537allocationSizeI7RO_PI(abn.getFieldNames()));
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterString.mo9529allocationSizeI7RO_PI(abn.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abn.gHZMYf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abn.AhwBna())) + ffiConverterLong.m9537allocationSizeI7RO_PI(abn.OcIXYQ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abn.ejfBZ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abn.AubY())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abn.DbNXlk())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abn.AxsJAY())) + ffiConverterLong.m9537allocationSizeI7RO_PI(abn.isConnected())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abn.zLjUOn())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abn.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abn.AkhnZx())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abn.fARcdN())) + ffiConverterLong.m9537allocationSizeI7RO_PI(abn.DTwDnp())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(abn.fJNWhG())) + ffiConverterLong.m9537allocationSizeI7RO_PI(abn.copydefault())) + ffiConverterLong.m9537allocationSizeI7RO_PI(abn.RJOkX())) + ffiConverterLong.m9537allocationSizeI7RO_PI(abn.QbewEr())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abn.fetchVPNInfo())) + ffiConverterLong.m9537allocationSizeI7RO_PI(abn.ORxRYg())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abn.uzCIH())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abn.AuCTelauCTel())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abn.zuBGHE())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abn.AYXKKw())) + ffiConverterLong.m9537allocationSizeI7RO_PI(abn.QOLQEE()));
        FfiConverterSequenceString ffiConverterSequenceString = FfiConverterSequenceString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 + ffiConverterSequenceString.mo9529allocationSizeI7RO_PI((List) abn.wlaJM())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abn.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abn.EZpvd())) + ffiConverterLong.m9537allocationSizeI7RO_PI(abn.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abn.iwGUEr())) + ffiConverterSequenceString.mo9529allocationSizeI7RO_PI((List) abn.zsXlph())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abn.sSMYrx())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abn.fIwbmz())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abn.hDKMBd())) + ffiConverterLong.m9537allocationSizeI7RO_PI(abn.AwvSrB())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abn.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull ABN abn, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abn, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        ffiConverterLong.write(abn.getNewProxyInstance(), byteBuffer);
        ffiConverterLong.write(abn.AuCTel(), byteBuffer);
        ffiConverterLong.write(abn.QKVWgx(), byteBuffer);
        ffiConverterLong.write(abn.values(), byteBuffer);
        ffiConverterLong.write(abn.QVAiDq(), byteBuffer);
        ffiConverterLong.write(abn.djBIcL(), byteBuffer);
        ffiConverterLong.write(abn.getFieldNames(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(abn.AEQbTJ(), byteBuffer);
        ffiConverterString.write(abn.gHZMYf(), byteBuffer);
        ffiConverterString.write(abn.AhwBna(), byteBuffer);
        ffiConverterLong.write(abn.OcIXYQ(), byteBuffer);
        ffiConverterString.write(abn.ejfBZ(), byteBuffer);
        ffiConverterString.write(abn.AubY(), byteBuffer);
        ffiConverterString.write(abn.DbNXlk(), byteBuffer);
        ffiConverterString.write(abn.AxsJAY(), byteBuffer);
        ffiConverterLong.write(abn.isConnected(), byteBuffer);
        ffiConverterString.write(abn.zLjUOn(), byteBuffer);
        ffiConverterString.write(abn.valueOf(), byteBuffer);
        ffiConverterString.write(abn.AkhnZx(), byteBuffer);
        ffiConverterString.write(abn.fARcdN(), byteBuffer);
        ffiConverterLong.write(abn.DTwDnp(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(abn.fJNWhG(), byteBuffer);
        ffiConverterLong.write(abn.copydefault(), byteBuffer);
        ffiConverterLong.write(abn.RJOkX(), byteBuffer);
        ffiConverterLong.write(abn.QbewEr(), byteBuffer);
        ffiConverterString.write(abn.fetchVPNInfo(), byteBuffer);
        ffiConverterLong.write(abn.ORxRYg(), byteBuffer);
        ffiConverterString.write(abn.uzCIH(), byteBuffer);
        ffiConverterString.write(abn.AuCTelauCTel(), byteBuffer);
        ffiConverterString.write(abn.zuBGHE(), byteBuffer);
        ffiConverterString.write(abn.AYXKKw(), byteBuffer);
        ffiConverterLong.write(abn.QOLQEE(), byteBuffer);
        FfiConverterSequenceString ffiConverterSequenceString = FfiConverterSequenceString.INSTANCE;
        ffiConverterSequenceString.write((List) abn.wlaJM(), byteBuffer);
        ffiConverterString.write(abn.KWHzl(), byteBuffer);
        ffiConverterString.write(abn.EZpvd(), byteBuffer);
        ffiConverterLong.write(abn.gEmmrt(), byteBuffer);
        ffiConverterString.write(abn.iwGUEr(), byteBuffer);
        ffiConverterSequenceString.write((List) abn.zsXlph(), byteBuffer);
        ffiConverterString.write(abn.sSMYrx(), byteBuffer);
        ffiConverterString.write(abn.fIwbmz(), byteBuffer);
        ffiConverterString.write(abn.hDKMBd(), byteBuffer);
        ffiConverterLong.write(abn.AwvSrB(), byteBuffer);
        ffiConverterString.write(abn.OLrzqt(), byteBuffer);
    }
}
