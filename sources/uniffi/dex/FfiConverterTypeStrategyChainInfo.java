package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.ABI;
import o.AGE;
import o.C4181Azx;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeStrategyChainInfo implements FfiConverterRustBuffer<AGE> {
    public static final int $stable = 0;
    public static final FfiConverterTypeStrategyChainInfo INSTANCE = new FfiConverterTypeStrategyChainInfo();

    private FfiConverterTypeStrategyChainInfo() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AGE lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AGE) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AGE liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AGE) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AGE age) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, age);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AGE age) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, age);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AGE read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        C4181Azx c4181Azx = FfiConverterTypeBaseChainInfo.INSTANCE.read(byteBuffer);
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        long jLongValue = ffiConverterLong.read(byteBuffer).longValue();
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        FfiConverterOptionalTypeDexTradeChainsTokenInfo ffiConverterOptionalTypeDexTradeChainsTokenInfo = FfiConverterOptionalTypeDexTradeChainsTokenInfo.INSTANCE;
        ABI abi = ffiConverterOptionalTypeDexTradeChainsTokenInfo.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new AGE(c4181Azx, jLongValue, str, abi, str2, ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterLong.read(byteBuffer).longValue(), ffiConverterLong.read(byteBuffer).longValue(), ffiConverterLong.read(byteBuffer).longValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterLong.read(byteBuffer).longValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), FfiConverterOptionalSequenceTypeSurplusDetail.INSTANCE.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterOptionalTypeDexTradeChainsTokenInfo.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterOptionalString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AGE age) {
        Intrinsics.checkNotNullParameter(age, "");
        long jM10004allocationSizeI7RO_PI = FfiConverterTypeBaseChainInfo.INSTANCE.mo9529allocationSizeI7RO_PI(age.OLrzqt());
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(jM10004allocationSizeI7RO_PI + ffiConverterLong.m9537allocationSizeI7RO_PI(age.EZpvd()));
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault2 = C56396yDv.copydefault(jCopydefault + ffiConverterString.mo9529allocationSizeI7RO_PI(age.AEQbTJ()));
        FfiConverterOptionalTypeDexTradeChainsTokenInfo ffiConverterOptionalTypeDexTradeChainsTokenInfo = FfiConverterOptionalTypeDexTradeChainsTokenInfo.INSTANCE;
        long jCopydefault3 = C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 + ffiConverterOptionalTypeDexTradeChainsTokenInfo.mo9529allocationSizeI7RO_PI(age.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(age.KWHzl()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault3 + ffiConverterBoolean.m9530allocationSizeI7RO_PI(age.getNewProxyInstance())) + ffiConverterLong.m9537allocationSizeI7RO_PI(age.gEmmrt())) + ffiConverterLong.m9537allocationSizeI7RO_PI(age.AkhnZx())) + ffiConverterLong.m9537allocationSizeI7RO_PI(age.values())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(age.uzCIH())) + ffiConverterLong.m9537allocationSizeI7RO_PI(age.AhwBna())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(age.AYXKKw())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(age.valueOf())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(age.isConnected())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(age.fetchVPNInfo())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(age.DbNXlk())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(age.ejfBZ())) + FfiConverterOptionalSequenceTypeSurplusDetail.INSTANCE.mo9529allocationSizeI7RO_PI(age.fARcdN())) + ffiConverterString.mo9529allocationSizeI7RO_PI(age.fIwbmz())) + ffiConverterOptionalTypeDexTradeChainsTokenInfo.mo9529allocationSizeI7RO_PI(age.fJNWhG())) + ffiConverterString.mo9529allocationSizeI7RO_PI(age.AuCTel())) + FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(age.djBIcL()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AGE age, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(age, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeBaseChainInfo.INSTANCE.write(age.OLrzqt(), byteBuffer);
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        ffiConverterLong.write(age.EZpvd(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(age.AEQbTJ(), byteBuffer);
        FfiConverterOptionalTypeDexTradeChainsTokenInfo ffiConverterOptionalTypeDexTradeChainsTokenInfo = FfiConverterOptionalTypeDexTradeChainsTokenInfo.INSTANCE;
        ffiConverterOptionalTypeDexTradeChainsTokenInfo.write(age.copydefault(), byteBuffer);
        ffiConverterString.write(age.KWHzl(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(age.getNewProxyInstance(), byteBuffer);
        ffiConverterLong.write(age.gEmmrt(), byteBuffer);
        ffiConverterLong.write(age.AkhnZx(), byteBuffer);
        ffiConverterLong.write(age.values(), byteBuffer);
        ffiConverterBoolean.write(age.uzCIH(), byteBuffer);
        ffiConverterLong.write(age.AhwBna(), byteBuffer);
        ffiConverterBoolean.write(age.AYXKKw(), byteBuffer);
        ffiConverterBoolean.write(age.valueOf(), byteBuffer);
        ffiConverterBoolean.write(age.isConnected(), byteBuffer);
        ffiConverterBoolean.write(age.fetchVPNInfo(), byteBuffer);
        ffiConverterBoolean.write(age.DbNXlk(), byteBuffer);
        ffiConverterBoolean.write(age.ejfBZ(), byteBuffer);
        FfiConverterOptionalSequenceTypeSurplusDetail.INSTANCE.write(age.fARcdN(), byteBuffer);
        ffiConverterString.write(age.fIwbmz(), byteBuffer);
        ffiConverterOptionalTypeDexTradeChainsTokenInfo.write(age.fJNWhG(), byteBuffer);
        ffiConverterString.write(age.AuCTel(), byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(age.djBIcL(), byteBuffer);
    }
}
