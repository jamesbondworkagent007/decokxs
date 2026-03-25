package uniffi.retail_trading;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BlF;
import o.C4596Bjy;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_trading.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeSpotInstrument implements FfiConverterRustBuffer<BlF> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSpotInstrument INSTANCE = new FfiConverterTypeSpotInstrument();

    private FfiConverterTypeSpotInstrument() {
    }

    @Override // uniffi.retail_trading.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BlF lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BlF) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BlF liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BlF) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BlF blF) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, blF);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BlF blF) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, blF);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BlF read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        C4596Bjy c4596Bjy = FfiConverterTypeBaseInstrument.INSTANCE.read(byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new BlF(c4596Bjy, ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterOptionalSequenceString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BlF blF) {
        Intrinsics.checkNotNullParameter(blF, "");
        long jMo9529allocationSizeI7RO_PI = FfiConverterTypeBaseInstrument.INSTANCE.mo9529allocationSizeI7RO_PI(blF.KWHzl());
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.gHZMYf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.AhwBna())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.hDKMBd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.AuCTel())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.AEQbTJ())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(blF.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.AubY())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.DbNXlk())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.fARcdN())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.ejfBZ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.sSMYrx())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.zsXlph())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.getFieldNames())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.getNewProxyInstance())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.iwGUEr())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.uzCIH())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.zLjUOn())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.AuCTelauCTel())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.values())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.AkhnZx())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.fetchVPNInfo())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.isConnected())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.fJNWhG())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.fIwbmz())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blF.djBIcL())) + FfiConverterOptionalSequenceString.INSTANCE.mo9529allocationSizeI7RO_PI(blF.wlaJM()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BlF blF, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(blF, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeBaseInstrument.INSTANCE.write(blF.KWHzl(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(blF.gHZMYf(), byteBuffer);
        ffiConverterString.write(blF.AhwBna(), byteBuffer);
        ffiConverterString.write(blF.OLrzqt(), byteBuffer);
        ffiConverterString.write(blF.hDKMBd(), byteBuffer);
        ffiConverterString.write(blF.valueOf(), byteBuffer);
        ffiConverterString.write(blF.EZpvd(), byteBuffer);
        ffiConverterString.write(blF.AuCTel(), byteBuffer);
        ffiConverterString.write(blF.AEQbTJ(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(blF.gEmmrt(), byteBuffer);
        ffiConverterString.write(blF.AubY(), byteBuffer);
        ffiConverterString.write(blF.DbNXlk(), byteBuffer);
        ffiConverterString.write(blF.fARcdN(), byteBuffer);
        ffiConverterString.write(blF.ejfBZ(), byteBuffer);
        ffiConverterString.write(blF.sSMYrx(), byteBuffer);
        ffiConverterString.write(blF.zsXlph(), byteBuffer);
        ffiConverterString.write(blF.AYXKKw(), byteBuffer);
        ffiConverterString.write(blF.getFieldNames(), byteBuffer);
        ffiConverterString.write(blF.getNewProxyInstance(), byteBuffer);
        ffiConverterString.write(blF.iwGUEr(), byteBuffer);
        ffiConverterString.write(blF.uzCIH(), byteBuffer);
        ffiConverterString.write(blF.zLjUOn(), byteBuffer);
        ffiConverterString.write(blF.AuCTelauCTel(), byteBuffer);
        ffiConverterString.write(blF.values(), byteBuffer);
        ffiConverterString.write(blF.AkhnZx(), byteBuffer);
        ffiConverterString.write(blF.fetchVPNInfo(), byteBuffer);
        ffiConverterString.write(blF.isConnected(), byteBuffer);
        ffiConverterString.write(blF.fJNWhG(), byteBuffer);
        ffiConverterString.write(blF.fIwbmz(), byteBuffer);
        ffiConverterString.write(blF.copydefault(), byteBuffer);
        ffiConverterString.write(blF.djBIcL(), byteBuffer);
        FfiConverterOptionalSequenceString.INSTANCE.write(blF.wlaJM(), byteBuffer);
    }
}
