package uniffi.dex;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C4132AzA;
import o.C4136AzE;
import o.C4151AzT;
import o.C4181Azx;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeBridgeChainInfo implements FfiConverterRustBuffer<C4132AzA> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBridgeChainInfo INSTANCE = new FfiConverterTypeBridgeChainInfo();

    private FfiConverterTypeBridgeChainInfo() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4132AzA lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4132AzA) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4132AzA liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4132AzA) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4132AzA c4132AzA) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4132AzA);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4132AzA c4132AzA) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4132AzA);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4132AzA read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        C4181Azx c4181Azx = FfiConverterTypeBaseChainInfo.INSTANCE.read(byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        List<? extends C4136AzE> list = FfiConverterOptionalSequenceTypeBridgeSupportChainInfo.INSTANCE.read(byteBuffer);
        List<? extends Long> list2 = FfiConverterOptionalSequenceLong.INSTANCE.read(byteBuffer);
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        long jLongValue = ffiConverterLong.read(byteBuffer).longValue();
        long jLongValue2 = ffiConverterLong.read(byteBuffer).longValue();
        String str2 = ffiConverterString.read(byteBuffer);
        String str3 = ffiConverterString.read(byteBuffer);
        String str4 = ffiConverterString.read(byteBuffer);
        String str5 = ffiConverterString.read(byteBuffer);
        FfiConverterOptionalTypeChainSlippageModel ffiConverterOptionalTypeChainSlippageModel = FfiConverterOptionalTypeChainSlippageModel.INSTANCE;
        C4151AzT c4151AzT = ffiConverterOptionalTypeChainSlippageModel.read(byteBuffer);
        Long l = FfiConverterOptionalLong.INSTANCE.read(byteBuffer);
        String str6 = ffiConverterString.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new C4132AzA(c4181Azx, str, list, list2, jLongValue, jLongValue2, str2, str3, str4, str5, c4151AzT, l, str6, ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterLong.read(byteBuffer).longValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterOptionalTypeChainSlippageModel.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterOptionalString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4132AzA c4132AzA) {
        Intrinsics.checkNotNullParameter(c4132AzA, "");
        long jM10004allocationSizeI7RO_PI = FfiConverterTypeBaseChainInfo.INSTANCE.mo9529allocationSizeI7RO_PI(c4132AzA.AEQbTJ());
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jM10004allocationSizeI7RO_PI + ffiConverterString.mo9529allocationSizeI7RO_PI(c4132AzA.OLrzqt())) + FfiConverterOptionalSequenceTypeBridgeSupportChainInfo.INSTANCE.mo9529allocationSizeI7RO_PI(c4132AzA.copydefault())) + FfiConverterOptionalSequenceLong.INSTANCE.mo9529allocationSizeI7RO_PI(c4132AzA.KWHzl()));
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterLong.m9537allocationSizeI7RO_PI(c4132AzA.EZpvd())) + ffiConverterLong.m9537allocationSizeI7RO_PI(c4132AzA.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4132AzA.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4132AzA.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4132AzA.DbNXlk())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4132AzA.isConnected()));
        FfiConverterOptionalTypeChainSlippageModel ffiConverterOptionalTypeChainSlippageModel = FfiConverterOptionalTypeChainSlippageModel.INSTANCE;
        long jCopydefault3 = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 + ffiConverterOptionalTypeChainSlippageModel.mo9529allocationSizeI7RO_PI(c4132AzA.djBIcL())) + FfiConverterOptionalLong.INSTANCE.mo9529allocationSizeI7RO_PI(c4132AzA.AhwBna())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4132AzA.fetchVPNInfo()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault3 + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4132AzA.getNewProxyInstance())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4132AzA.values())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4132AzA.fJNWhG())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4132AzA.fARcdN())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4132AzA.iwGUEr())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4132AzA.fIwbmz())) + ffiConverterLong.m9537allocationSizeI7RO_PI(c4132AzA.ejfBZ())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4132AzA.AuCTel())) + ffiConverterOptionalTypeChainSlippageModel.mo9529allocationSizeI7RO_PI(c4132AzA.hDKMBd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4132AzA.getFieldNames())) + FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(c4132AzA.AkhnZx()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4132AzA c4132AzA, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4132AzA, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeBaseChainInfo.INSTANCE.write(c4132AzA.AEQbTJ(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c4132AzA.OLrzqt(), byteBuffer);
        FfiConverterOptionalSequenceTypeBridgeSupportChainInfo.INSTANCE.write(c4132AzA.copydefault(), byteBuffer);
        FfiConverterOptionalSequenceLong.INSTANCE.write(c4132AzA.KWHzl(), byteBuffer);
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        ffiConverterLong.write(c4132AzA.EZpvd(), byteBuffer);
        ffiConverterLong.write(c4132AzA.gEmmrt(), byteBuffer);
        ffiConverterString.write(c4132AzA.AYXKKw(), byteBuffer);
        ffiConverterString.write(c4132AzA.valueOf(), byteBuffer);
        ffiConverterString.write(c4132AzA.DbNXlk(), byteBuffer);
        ffiConverterString.write(c4132AzA.isConnected(), byteBuffer);
        FfiConverterOptionalTypeChainSlippageModel ffiConverterOptionalTypeChainSlippageModel = FfiConverterOptionalTypeChainSlippageModel.INSTANCE;
        ffiConverterOptionalTypeChainSlippageModel.write(c4132AzA.djBIcL(), byteBuffer);
        FfiConverterOptionalLong.INSTANCE.write(c4132AzA.AhwBna(), byteBuffer);
        ffiConverterString.write(c4132AzA.fetchVPNInfo(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c4132AzA.getNewProxyInstance(), byteBuffer);
        ffiConverterString.write(c4132AzA.values(), byteBuffer);
        ffiConverterString.write(c4132AzA.fJNWhG(), byteBuffer);
        ffiConverterString.write(c4132AzA.fARcdN(), byteBuffer);
        ffiConverterString.write(c4132AzA.iwGUEr(), byteBuffer);
        ffiConverterString.write(c4132AzA.fIwbmz(), byteBuffer);
        ffiConverterLong.write(c4132AzA.ejfBZ(), byteBuffer);
        ffiConverterBoolean.write(c4132AzA.AuCTel(), byteBuffer);
        ffiConverterOptionalTypeChainSlippageModel.write(c4132AzA.hDKMBd(), byteBuffer);
        ffiConverterString.write(c4132AzA.getFieldNames(), byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(c4132AzA.AkhnZx(), byteBuffer);
    }
}
