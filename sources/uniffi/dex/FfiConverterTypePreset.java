package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2293AGe;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes20.dex */
public final class FfiConverterTypePreset implements FfiConverterRustBuffer<C2293AGe> {
    public static final int $stable = 0;
    public static final FfiConverterTypePreset INSTANCE = new FfiConverterTypePreset();

    private FfiConverterTypePreset() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2293AGe lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2293AGe) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2293AGe liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2293AGe) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2293AGe c2293AGe) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2293AGe);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2293AGe c2293AGe) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2293AGe);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2293AGe read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        long jLongValue = FfiConverterLong.INSTANCE.read(byteBuffer).longValue();
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        FfiConverterTypeBuySellPresetParam ffiConverterTypeBuySellPresetParam = FfiConverterTypeBuySellPresetParam.INSTANCE;
        return new C2293AGe(jLongValue, str, str2, ffiConverterTypeBuySellPresetParam.read(byteBuffer), ffiConverterTypeBuySellPresetParam.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2293AGe c2293AGe) {
        Intrinsics.checkNotNullParameter(c2293AGe, "");
        long jM9537allocationSizeI7RO_PI = FfiConverterLong.INSTANCE.m9537allocationSizeI7RO_PI(c2293AGe.EZpvd());
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(jM9537allocationSizeI7RO_PI + ffiConverterString.mo9529allocationSizeI7RO_PI(c2293AGe.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2293AGe.KWHzl()));
        FfiConverterTypeBuySellPresetParam ffiConverterTypeBuySellPresetParam = FfiConverterTypeBuySellPresetParam.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterTypeBuySellPresetParam.mo9529allocationSizeI7RO_PI(c2293AGe.OLrzqt())) + ffiConverterTypeBuySellPresetParam.mo9529allocationSizeI7RO_PI(c2293AGe.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2293AGe c2293AGe, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2293AGe, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterLong.INSTANCE.write(c2293AGe.EZpvd(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c2293AGe.copydefault(), byteBuffer);
        ffiConverterString.write(c2293AGe.KWHzl(), byteBuffer);
        FfiConverterTypeBuySellPresetParam ffiConverterTypeBuySellPresetParam = FfiConverterTypeBuySellPresetParam.INSTANCE;
        ffiConverterTypeBuySellPresetParam.write(c2293AGe.OLrzqt(), byteBuffer);
        ffiConverterTypeBuySellPresetParam.write(c2293AGe.AEQbTJ(), byteBuffer);
    }
}
