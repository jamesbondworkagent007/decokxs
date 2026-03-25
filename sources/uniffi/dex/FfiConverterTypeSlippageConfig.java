package uniffi.dex;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.AGC;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes20.dex */
public final class FfiConverterTypeSlippageConfig implements FfiConverterRustBuffer<AGC> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSlippageConfig INSTANCE = new FfiConverterTypeSlippageConfig();

    private FfiConverterTypeSlippageConfig() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AGC lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AGC) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AGC liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AGC) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AGC agc) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, agc);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AGC agc) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, agc);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AGC read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        long jLongValue = FfiConverterLong.INSTANCE.read(byteBuffer).longValue();
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new AGC(jLongValue, ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterSequenceTypeSlippageRange.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AGC agc) {
        Intrinsics.checkNotNullParameter(agc, "");
        long jM9537allocationSizeI7RO_PI = FfiConverterLong.INSTANCE.m9537allocationSizeI7RO_PI(agc.isConnected());
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jM9537allocationSizeI7RO_PI + ffiConverterString.mo9529allocationSizeI7RO_PI(agc.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agc.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agc.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agc.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agc.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agc.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agc.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agc.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(agc.KWHzl())) + FfiConverterSequenceTypeSlippageRange.INSTANCE.mo9529allocationSizeI7RO_PI((List) agc.AhwBna()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AGC agc, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(agc, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterLong.INSTANCE.write(agc.isConnected(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(agc.gEmmrt(), byteBuffer);
        ffiConverterString.write(agc.AYXKKw(), byteBuffer);
        ffiConverterString.write(agc.djBIcL(), byteBuffer);
        ffiConverterString.write(agc.valueOf(), byteBuffer);
        ffiConverterString.write(agc.copydefault(), byteBuffer);
        ffiConverterString.write(agc.AEQbTJ(), byteBuffer);
        ffiConverterString.write(agc.EZpvd(), byteBuffer);
        ffiConverterString.write(agc.OLrzqt(), byteBuffer);
        ffiConverterString.write(agc.KWHzl(), byteBuffer);
        FfiConverterSequenceTypeSlippageRange.INSTANCE.write((List) agc.AhwBna(), byteBuffer);
    }
}
