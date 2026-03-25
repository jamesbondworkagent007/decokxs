package uniffi.retail_trading;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BjP;
import o.C4596Bjy;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_trading.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeFutureInstrument implements FfiConverterRustBuffer<BjP> {
    public static final int $stable = 0;
    public static final FfiConverterTypeFutureInstrument INSTANCE = new FfiConverterTypeFutureInstrument();

    private FfiConverterTypeFutureInstrument() {
    }

    @Override // uniffi.retail_trading.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BjP lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BjP) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BjP liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BjP) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BjP bjP) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bjP);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BjP bjP) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bjP);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BjP read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        C4596Bjy c4596Bjy = FfiConverterTypeBaseInstrument.INSTANCE.read(byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        String str3 = ffiConverterString.read(byteBuffer);
        String str4 = ffiConverterString.read(byteBuffer);
        String str5 = ffiConverterString.read(byteBuffer);
        String str6 = ffiConverterString.read(byteBuffer);
        String str7 = ffiConverterString.read(byteBuffer);
        String str8 = ffiConverterString.read(byteBuffer);
        String str9 = ffiConverterString.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new BjP(c4596Bjy, str, str2, str3, str4, str5, str6, str7, str8, str9, ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BjP bjP) {
        Intrinsics.checkNotNullParameter(bjP, "");
        long jMo9529allocationSizeI7RO_PI = FfiConverterTypeBaseInstrument.INSTANCE.mo9529allocationSizeI7RO_PI(bjP.OLrzqt());
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.gHZMYf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.fetchVPNInfo())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.AubY())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.AhwBna())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.AkhnZx())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.DbNXlk()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterBoolean.m9530allocationSizeI7RO_PI(bjP.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.isConnected())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.AxsJAY())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.AwvSrB())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.uzCIH())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.AuCTelauCTel())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.getFieldNames())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.zsXlph())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.gEmmrt())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(bjP.values())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.wlaJM())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.sSMYrx())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.zuBGHE())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.zLjUOn())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.AuCTel())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.fARcdN())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.fJNWhG())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.iwGUEr())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.getNewProxyInstance())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.hDKMBd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.ejfBZ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjP.fIwbmz()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BjP bjP, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bjP, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeBaseInstrument.INSTANCE.write(bjP.OLrzqt(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(bjP.gHZMYf(), byteBuffer);
        ffiConverterString.write(bjP.fetchVPNInfo(), byteBuffer);
        ffiConverterString.write(bjP.AubY(), byteBuffer);
        ffiConverterString.write(bjP.djBIcL(), byteBuffer);
        ffiConverterString.write(bjP.EZpvd(), byteBuffer);
        ffiConverterString.write(bjP.AhwBna(), byteBuffer);
        ffiConverterString.write(bjP.AkhnZx(), byteBuffer);
        ffiConverterString.write(bjP.AYXKKw(), byteBuffer);
        ffiConverterString.write(bjP.DbNXlk(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(bjP.valueOf(), byteBuffer);
        ffiConverterString.write(bjP.KWHzl(), byteBuffer);
        ffiConverterString.write(bjP.AEQbTJ(), byteBuffer);
        ffiConverterString.write(bjP.copydefault(), byteBuffer);
        ffiConverterString.write(bjP.isConnected(), byteBuffer);
        ffiConverterString.write(bjP.AxsJAY(), byteBuffer);
        ffiConverterString.write(bjP.AwvSrB(), byteBuffer);
        ffiConverterString.write(bjP.uzCIH(), byteBuffer);
        ffiConverterString.write(bjP.AuCTelauCTel(), byteBuffer);
        ffiConverterString.write(bjP.getFieldNames(), byteBuffer);
        ffiConverterString.write(bjP.zsXlph(), byteBuffer);
        ffiConverterString.write(bjP.gEmmrt(), byteBuffer);
        ffiConverterBoolean.write(bjP.values(), byteBuffer);
        ffiConverterString.write(bjP.wlaJM(), byteBuffer);
        ffiConverterString.write(bjP.sSMYrx(), byteBuffer);
        ffiConverterString.write(bjP.zuBGHE(), byteBuffer);
        ffiConverterString.write(bjP.zLjUOn(), byteBuffer);
        ffiConverterString.write(bjP.AuCTel(), byteBuffer);
        ffiConverterString.write(bjP.fARcdN(), byteBuffer);
        ffiConverterString.write(bjP.fJNWhG(), byteBuffer);
        ffiConverterString.write(bjP.iwGUEr(), byteBuffer);
        ffiConverterString.write(bjP.getNewProxyInstance(), byteBuffer);
        ffiConverterString.write(bjP.hDKMBd(), byteBuffer);
        ffiConverterString.write(bjP.ejfBZ(), byteBuffer);
        ffiConverterString.write(bjP.fIwbmz(), byteBuffer);
    }
}
