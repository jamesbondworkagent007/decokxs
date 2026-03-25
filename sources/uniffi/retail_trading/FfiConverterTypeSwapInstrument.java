package uniffi.retail_trading;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BlC;
import o.C4596Bjy;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_trading.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeSwapInstrument implements FfiConverterRustBuffer<BlC> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSwapInstrument INSTANCE = new FfiConverterTypeSwapInstrument();

    private FfiConverterTypeSwapInstrument() {
    }

    @Override // uniffi.retail_trading.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BlC lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BlC) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BlC liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BlC) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BlC blC) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, blC);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BlC blC) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, blC);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BlC read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        C4596Bjy c4596Bjy = FfiConverterTypeBaseInstrument.INSTANCE.read(byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new BlC(c4596Bjy, ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BlC blC) {
        Intrinsics.checkNotNullParameter(blC, "");
        long jMo9529allocationSizeI7RO_PI = FfiConverterTypeBaseInstrument.INSTANCE.mo9529allocationSizeI7RO_PI(blC.copydefault());
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.iwGUEr())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.uzCIH())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.AYXKKw())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(blC.AhwBna())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.getFieldNames())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.zLjUOn())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.fIwbmz())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.ejfBZ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.AuCTel())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.fARcdN())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.hDKMBd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.AuCTelauCTel())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.getNewProxyInstance())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.isConnected())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.fetchVPNInfo())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.DbNXlk())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.AkhnZx())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.values())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blC.fJNWhG()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BlC blC, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(blC, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeBaseInstrument.INSTANCE.write(blC.copydefault(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(blC.iwGUEr(), byteBuffer);
        ffiConverterString.write(blC.djBIcL(), byteBuffer);
        ffiConverterString.write(blC.uzCIH(), byteBuffer);
        ffiConverterString.write(blC.EZpvd(), byteBuffer);
        ffiConverterString.write(blC.OLrzqt(), byteBuffer);
        ffiConverterString.write(blC.AEQbTJ(), byteBuffer);
        ffiConverterString.write(blC.AYXKKw(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(blC.AhwBna(), byteBuffer);
        ffiConverterString.write(blC.KWHzl(), byteBuffer);
        ffiConverterString.write(blC.valueOf(), byteBuffer);
        ffiConverterString.write(blC.getFieldNames(), byteBuffer);
        ffiConverterString.write(blC.zLjUOn(), byteBuffer);
        ffiConverterString.write(blC.fIwbmz(), byteBuffer);
        ffiConverterString.write(blC.ejfBZ(), byteBuffer);
        ffiConverterString.write(blC.AuCTel(), byteBuffer);
        ffiConverterString.write(blC.fARcdN(), byteBuffer);
        ffiConverterString.write(blC.gEmmrt(), byteBuffer);
        ffiConverterString.write(blC.hDKMBd(), byteBuffer);
        ffiConverterString.write(blC.AuCTelauCTel(), byteBuffer);
        ffiConverterString.write(blC.getNewProxyInstance(), byteBuffer);
        ffiConverterString.write(blC.isConnected(), byteBuffer);
        ffiConverterString.write(blC.fetchVPNInfo(), byteBuffer);
        ffiConverterString.write(blC.DbNXlk(), byteBuffer);
        ffiConverterString.write(blC.AkhnZx(), byteBuffer);
        ffiConverterString.write(blC.values(), byteBuffer);
        ffiConverterString.write(blC.fJNWhG(), byteBuffer);
    }
}
