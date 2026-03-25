package uniffi.dex;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.AGK;
import o.C4136AzE;
import o.C4151AzT;
import o.C4181Azx;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeSwapChainInfo implements FfiConverterRustBuffer<AGK> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSwapChainInfo INSTANCE = new FfiConverterTypeSwapChainInfo();

    private FfiConverterTypeSwapChainInfo() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AGK lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AGK) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AGK liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AGK) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AGK agk) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, agk);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AGK agk) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, agk);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AGK read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        C4181Azx c4181Azx = FfiConverterTypeBaseChainInfo.INSTANCE.read(byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        String str = ffiConverterOptionalString.read(byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str2 = ffiConverterString.read(byteBuffer);
        String str3 = ffiConverterString.read(byteBuffer);
        FfiConverterOptionalTypeChainSlippageModel ffiConverterOptionalTypeChainSlippageModel = FfiConverterOptionalTypeChainSlippageModel.INSTANCE;
        C4151AzT c4151AzT = ffiConverterOptionalTypeChainSlippageModel.read(byteBuffer);
        C4151AzT c4151AzT2 = ffiConverterOptionalTypeChainSlippageModel.read(byteBuffer);
        String str4 = ffiConverterString.read(byteBuffer);
        String str5 = ffiConverterString.read(byteBuffer);
        String str6 = ffiConverterString.read(byteBuffer);
        List<? extends C4136AzE> list = FfiConverterOptionalSequenceTypeBridgeSupportChainInfo.INSTANCE.read(byteBuffer);
        List<? extends Long> list2 = FfiConverterOptionalSequenceLong.INSTANCE.read(byteBuffer);
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        long jLongValue = ffiConverterLong.read(byteBuffer).longValue();
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new AGK(c4181Azx, str, str2, str3, c4151AzT, c4151AzT2, str4, str5, str6, list, list2, jLongValue, ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterLong.read(byteBuffer).longValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterString.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue(), FfiConverterOptionalLong.INSTANCE.read(byteBuffer), ffiConverterLong.read(byteBuffer).longValue(), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterLong.read(byteBuffer).longValue(), ffiConverterLong.read(byteBuffer).longValue(), ffiConverterLong.read(byteBuffer).longValue(), FfiConverterSequenceString.INSTANCE.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AGK agk) {
        Intrinsics.checkNotNullParameter(agk, "");
        long jM10004allocationSizeI7RO_PI = FfiConverterTypeBaseChainInfo.INSTANCE.mo9529allocationSizeI7RO_PI(agk.KWHzl());
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(jM10004allocationSizeI7RO_PI + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(agk.OLrzqt()));
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterString.mo9529allocationSizeI7RO_PI(agk.AuCTel())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agk.AwvSrB()));
        FfiConverterOptionalTypeChainSlippageModel ffiConverterOptionalTypeChainSlippageModel = FfiConverterOptionalTypeChainSlippageModel.INSTANCE;
        long jCopydefault3 = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 + ffiConverterOptionalTypeChainSlippageModel.mo9529allocationSizeI7RO_PI(agk.zLjUOn())) + ffiConverterOptionalTypeChainSlippageModel.mo9529allocationSizeI7RO_PI(agk.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agk.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agk.DbNXlk())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agk.zsXlph())) + FfiConverterOptionalSequenceTypeBridgeSupportChainInfo.INSTANCE.mo9529allocationSizeI7RO_PI(agk.EZpvd())) + FfiConverterOptionalSequenceLong.INSTANCE.mo9529allocationSizeI7RO_PI(agk.AEQbTJ()));
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        long jCopydefault4 = C56396yDv.copydefault(jCopydefault3 + ffiConverterLong.m9537allocationSizeI7RO_PI(agk.AYXKKw()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault4 + ffiConverterBoolean.m9530allocationSizeI7RO_PI(agk.gHZMYf())) + ffiConverterLong.m9537allocationSizeI7RO_PI(agk.wlaJM())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(agk.getNewProxyInstance())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(agk.iwGUEr())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(agk.hDKMBd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agk.AkhnZx())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(agk.AxsJAY())) + FfiConverterOptionalLong.INSTANCE.mo9529allocationSizeI7RO_PI(agk.gEmmrt())) + ffiConverterLong.m9537allocationSizeI7RO_PI(agk.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agk.AhwBna())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agk.values())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agk.fetchVPNInfo())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agk.fJNWhG())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agk.ejfBZ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agk.fIwbmz())) + ffiConverterLong.m9537allocationSizeI7RO_PI(agk.isConnected())) + ffiConverterLong.m9537allocationSizeI7RO_PI(agk.getFieldNames())) + ffiConverterLong.m9537allocationSizeI7RO_PI(agk.uzCIH())) + FfiConverterSequenceString.INSTANCE.mo9529allocationSizeI7RO_PI((List) agk.AuCTelauCTel())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(agk.AubY())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agk.zuBGHE())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(agk.fARcdN()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AGK agk, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(agk, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeBaseChainInfo.INSTANCE.write(agk.KWHzl(), byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(agk.OLrzqt(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(agk.AuCTel(), byteBuffer);
        ffiConverterString.write(agk.AwvSrB(), byteBuffer);
        FfiConverterOptionalTypeChainSlippageModel ffiConverterOptionalTypeChainSlippageModel = FfiConverterOptionalTypeChainSlippageModel.INSTANCE;
        ffiConverterOptionalTypeChainSlippageModel.write(agk.zLjUOn(), byteBuffer);
        ffiConverterOptionalTypeChainSlippageModel.write(agk.valueOf(), byteBuffer);
        ffiConverterString.write(agk.copydefault(), byteBuffer);
        ffiConverterString.write(agk.DbNXlk(), byteBuffer);
        ffiConverterString.write(agk.zsXlph(), byteBuffer);
        FfiConverterOptionalSequenceTypeBridgeSupportChainInfo.INSTANCE.write(agk.EZpvd(), byteBuffer);
        FfiConverterOptionalSequenceLong.INSTANCE.write(agk.AEQbTJ(), byteBuffer);
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        ffiConverterLong.write(agk.AYXKKw(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(agk.gHZMYf(), byteBuffer);
        ffiConverterLong.write(agk.wlaJM(), byteBuffer);
        ffiConverterBoolean.write(agk.getNewProxyInstance(), byteBuffer);
        ffiConverterBoolean.write(agk.iwGUEr(), byteBuffer);
        ffiConverterBoolean.write(agk.hDKMBd(), byteBuffer);
        ffiConverterString.write(agk.AkhnZx(), byteBuffer);
        ffiConverterBoolean.write(agk.AxsJAY(), byteBuffer);
        FfiConverterOptionalLong.INSTANCE.write(agk.gEmmrt(), byteBuffer);
        ffiConverterLong.write(agk.djBIcL(), byteBuffer);
        ffiConverterString.write(agk.AhwBna(), byteBuffer);
        ffiConverterString.write(agk.values(), byteBuffer);
        ffiConverterString.write(agk.fetchVPNInfo(), byteBuffer);
        ffiConverterString.write(agk.fJNWhG(), byteBuffer);
        ffiConverterString.write(agk.ejfBZ(), byteBuffer);
        ffiConverterString.write(agk.fIwbmz(), byteBuffer);
        ffiConverterLong.write(agk.isConnected(), byteBuffer);
        ffiConverterLong.write(agk.getFieldNames(), byteBuffer);
        ffiConverterLong.write(agk.uzCIH(), byteBuffer);
        FfiConverterSequenceString.INSTANCE.write((List) agk.AuCTelauCTel(), byteBuffer);
        ffiConverterBoolean.write(agk.AubY(), byteBuffer);
        ffiConverterString.write(agk.zuBGHE(), byteBuffer);
        ffiConverterOptionalString.write(agk.fARcdN(), byteBuffer);
    }
}
