package uniffi.settings;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BmO;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.settings.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeCurrencyModel implements FfiConverterRustBuffer<BmO> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCurrencyModel INSTANCE = new FfiConverterTypeCurrencyModel();

    private FfiConverterTypeCurrencyModel() {
    }

    @Override // uniffi.settings.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BmO lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BmO) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BmO liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BmO) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BmO bmO) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bmO);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BmO bmO) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bmO);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BmO read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        int iIntValue = ffiConverterInt.read(byteBuffer).intValue();
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        boolean zBooleanValue = ffiConverterBoolean.read(byteBuffer).booleanValue();
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new BmO(iIntValue, zBooleanValue, ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterInt.read(byteBuffer).intValue(), FfiConverterDouble.INSTANCE.read(byteBuffer).doubleValue(), FfiConverterOptionalDouble.INSTANCE.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BmO bmO) {
        Intrinsics.checkNotNullParameter(bmO, "");
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        long jM9536allocationSizeI7RO_PI = ffiConverterInt.m9536allocationSizeI7RO_PI(bmO.KWHzl());
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(jM9536allocationSizeI7RO_PI + ffiConverterBoolean.m9530allocationSizeI7RO_PI(bmO.valueOf()));
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterString.mo9529allocationSizeI7RO_PI(bmO.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bmO.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bmO.AhwBna())) + ffiConverterInt.m9536allocationSizeI7RO_PI(bmO.AEQbTJ())) + FfiConverterDouble.INSTANCE.m9533allocationSizeI7RO_PI(bmO.OLrzqt())) + FfiConverterOptionalDouble.INSTANCE.mo9529allocationSizeI7RO_PI(bmO.djBIcL())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(bmO.AYXKKw()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BmO bmO, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bmO, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        ffiConverterInt.write(bmO.KWHzl(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(bmO.valueOf(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(bmO.copydefault(), byteBuffer);
        ffiConverterString.write(bmO.EZpvd(), byteBuffer);
        ffiConverterString.write(bmO.AhwBna(), byteBuffer);
        ffiConverterInt.write(bmO.AEQbTJ(), byteBuffer);
        FfiConverterDouble.INSTANCE.write(bmO.OLrzqt(), byteBuffer);
        FfiConverterOptionalDouble.INSTANCE.write(bmO.djBIcL(), byteBuffer);
        ffiConverterBoolean.write(bmO.AYXKKw(), byteBuffer);
    }
}
