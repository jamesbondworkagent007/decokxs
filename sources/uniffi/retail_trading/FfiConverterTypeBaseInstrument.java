package uniffi.retail_trading;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4596Bjy;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_trading.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeBaseInstrument implements FfiConverterRustBuffer<C4596Bjy> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBaseInstrument INSTANCE = new FfiConverterTypeBaseInstrument();

    private FfiConverterTypeBaseInstrument() {
    }

    @Override // uniffi.retail_trading.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4596Bjy lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4596Bjy) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4596Bjy liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4596Bjy) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4596Bjy c4596Bjy) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4596Bjy);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4596Bjy c4596Bjy) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4596Bjy);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4596Bjy read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C4596Bjy(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4596Bjy c4596Bjy) {
        Intrinsics.checkNotNullParameter(c4596Bjy, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c4596Bjy.copydefault()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4596Bjy.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4596Bjy.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4596Bjy.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4596Bjy.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4596Bjy.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4596Bjy.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4596Bjy.AhwBna())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4596Bjy.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4596Bjy.gEmmrt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4596Bjy c4596Bjy, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4596Bjy, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c4596Bjy.copydefault(), byteBuffer);
        ffiConverterString.write(c4596Bjy.OLrzqt(), byteBuffer);
        ffiConverterString.write(c4596Bjy.AYXKKw(), byteBuffer);
        ffiConverterString.write(c4596Bjy.KWHzl(), byteBuffer);
        ffiConverterString.write(c4596Bjy.EZpvd(), byteBuffer);
        ffiConverterString.write(c4596Bjy.valueOf(), byteBuffer);
        ffiConverterString.write(c4596Bjy.djBIcL(), byteBuffer);
        ffiConverterString.write(c4596Bjy.AhwBna(), byteBuffer);
        ffiConverterString.write(c4596Bjy.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c4596Bjy.gEmmrt(), byteBuffer);
    }
}
