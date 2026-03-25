package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4148AzQ;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes20.dex */
public final class FfiConverterTypeBuySellPresetParam implements FfiConverterRustBuffer<C4148AzQ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBuySellPresetParam INSTANCE = new FfiConverterTypeBuySellPresetParam();

    private FfiConverterTypeBuySellPresetParam() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4148AzQ lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4148AzQ) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4148AzQ liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4148AzQ) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4148AzQ c4148AzQ) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4148AzQ);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4148AzQ c4148AzQ) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4148AzQ);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4148AzQ read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        long jLongValue = ffiConverterLong.read(byteBuffer).longValue();
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C4148AzQ(jLongValue, ffiConverterString.read(byteBuffer), ffiConverterLong.read(byteBuffer).longValue(), FfiConverterOptionalLong.INSTANCE.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterLong.read(byteBuffer).longValue(), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4148AzQ c4148AzQ) {
        Intrinsics.checkNotNullParameter(c4148AzQ, "");
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        long jM9537allocationSizeI7RO_PI = ffiConverterLong.m9537allocationSizeI7RO_PI(c4148AzQ.EZpvd());
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jM9537allocationSizeI7RO_PI + ffiConverterString.mo9529allocationSizeI7RO_PI(c4148AzQ.AEQbTJ())) + ffiConverterLong.m9537allocationSizeI7RO_PI(c4148AzQ.copydefault())) + FfiConverterOptionalLong.INSTANCE.mo9529allocationSizeI7RO_PI(c4148AzQ.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4148AzQ.AhwBna())) + ffiConverterLong.m9537allocationSizeI7RO_PI(c4148AzQ.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4148AzQ.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4148AzQ c4148AzQ, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4148AzQ, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        ffiConverterLong.write(c4148AzQ.EZpvd(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c4148AzQ.AEQbTJ(), byteBuffer);
        ffiConverterLong.write(c4148AzQ.copydefault(), byteBuffer);
        FfiConverterOptionalLong.INSTANCE.write(c4148AzQ.KWHzl(), byteBuffer);
        ffiConverterString.write(c4148AzQ.AhwBna(), byteBuffer);
        ffiConverterLong.write(c4148AzQ.valueOf(), byteBuffer);
        ffiConverterString.write(c4148AzQ.OLrzqt(), byteBuffer);
    }
}
