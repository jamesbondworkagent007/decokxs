package uniffi.retail_trading;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BkP;
import o.C4596Bjy;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_trading.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeOptionInstrument implements FfiConverterRustBuffer<BkP> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOptionInstrument INSTANCE = new FfiConverterTypeOptionInstrument();

    private FfiConverterTypeOptionInstrument() {
    }

    @Override // uniffi.retail_trading.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BkP lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BkP) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BkP liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BkP) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BkP bkP) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bkP);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BkP bkP) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bkP);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BkP read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        C4596Bjy c4596Bjy = FfiConverterTypeBaseInstrument.INSTANCE.read(byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new BkP(c4596Bjy, ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BkP bkP) {
        Intrinsics.checkNotNullParameter(bkP, "");
        long jMo9529allocationSizeI7RO_PI = FfiConverterTypeBaseInstrument.INSTANCE.mo9529allocationSizeI7RO_PI(bkP.EZpvd());
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterString.mo9529allocationSizeI7RO_PI(bkP.AubY())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkP.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkP.fJNWhG())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkP.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkP.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkP.AhwBna())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkP.AkhnZx())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkP.uzCIH())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(bkP.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkP.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkP.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkP.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkP.getNewProxyInstance())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkP.ejfBZ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkP.values())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkP.fetchVPNInfo())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkP.hDKMBd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkP.fIwbmz())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkP.AuCTel())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkP.getFieldNames())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkP.fARcdN())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkP.iwGUEr())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkP.isConnected())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkP.DbNXlk())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bkP.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BkP bkP, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bkP, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeBaseInstrument.INSTANCE.write(bkP.EZpvd(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(bkP.AubY(), byteBuffer);
        ffiConverterString.write(bkP.AYXKKw(), byteBuffer);
        ffiConverterString.write(bkP.fJNWhG(), byteBuffer);
        ffiConverterString.write(bkP.copydefault(), byteBuffer);
        ffiConverterString.write(bkP.OLrzqt(), byteBuffer);
        ffiConverterString.write(bkP.AhwBna(), byteBuffer);
        ffiConverterString.write(bkP.AkhnZx(), byteBuffer);
        ffiConverterString.write(bkP.uzCIH(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(bkP.gEmmrt(), byteBuffer);
        ffiConverterString.write(bkP.djBIcL(), byteBuffer);
        ffiConverterString.write(bkP.valueOf(), byteBuffer);
        ffiConverterString.write(bkP.KWHzl(), byteBuffer);
        ffiConverterString.write(bkP.getNewProxyInstance(), byteBuffer);
        ffiConverterString.write(bkP.ejfBZ(), byteBuffer);
        ffiConverterString.write(bkP.values(), byteBuffer);
        ffiConverterString.write(bkP.fetchVPNInfo(), byteBuffer);
        ffiConverterString.write(bkP.hDKMBd(), byteBuffer);
        ffiConverterString.write(bkP.fIwbmz(), byteBuffer);
        ffiConverterString.write(bkP.AuCTel(), byteBuffer);
        ffiConverterString.write(bkP.getFieldNames(), byteBuffer);
        ffiConverterString.write(bkP.fARcdN(), byteBuffer);
        ffiConverterString.write(bkP.iwGUEr(), byteBuffer);
        ffiConverterString.write(bkP.isConnected(), byteBuffer);
        ffiConverterString.write(bkP.DbNXlk(), byteBuffer);
        ffiConverterString.write(bkP.AEQbTJ(), byteBuffer);
    }
}
