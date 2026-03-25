package uniffi.feature_restriction;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.AKL;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.feature_restriction.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeFeatureRestrictionConfigModel implements FfiConverterRustBuffer<AKL> {
    public static final int $stable = 0;
    public static final FfiConverterTypeFeatureRestrictionConfigModel INSTANCE = new FfiConverterTypeFeatureRestrictionConfigModel();

    private FfiConverterTypeFeatureRestrictionConfigModel() {
    }

    @Override // uniffi.feature_restriction.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AKL lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AKL) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AKL liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AKL) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AKL akl) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, akl);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AKL akl) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, akl);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AKL read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        boolean zBooleanValue = ffiConverterBoolean.read(byteBuffer).booleanValue();
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        String str = ffiConverterOptionalString.read(byteBuffer);
        String str2 = ffiConverterOptionalString.read(byteBuffer);
        String str3 = ffiConverterOptionalString.read(byteBuffer);
        String str4 = ffiConverterOptionalString.read(byteBuffer);
        FfiConverterOptionalInt ffiConverterOptionalInt = FfiConverterOptionalInt.INSTANCE;
        return new AKL(zBooleanValue, str, str2, str3, str4, ffiConverterOptionalInt.read(byteBuffer), ffiConverterOptionalInt.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalInt.read(byteBuffer), FfiConverterSequenceString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AKL akl) {
        Intrinsics.checkNotNullParameter(akl, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        long jM9530allocationSizeI7RO_PI = ffiConverterBoolean.m9530allocationSizeI7RO_PI(akl.AhwBna());
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jM9530allocationSizeI7RO_PI + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(akl.OLrzqt())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(akl.EZpvd())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(akl.djBIcL())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(akl.AkhnZx()));
        FfiConverterOptionalInt ffiConverterOptionalInt = FfiConverterOptionalInt.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterOptionalInt.mo9529allocationSizeI7RO_PI(akl.gEmmrt())) + ffiConverterOptionalInt.mo9529allocationSizeI7RO_PI(akl.valueOf())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(akl.AEQbTJ())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(akl.values())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(akl.copydefault())) + ffiConverterOptionalInt.mo9529allocationSizeI7RO_PI(akl.KWHzl())) + FfiConverterSequenceString.INSTANCE.mo9529allocationSizeI7RO_PI((List) akl.AYXKKw()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AKL akl, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(akl, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(akl.AhwBna(), byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(akl.OLrzqt(), byteBuffer);
        ffiConverterOptionalString.write(akl.EZpvd(), byteBuffer);
        ffiConverterOptionalString.write(akl.djBIcL(), byteBuffer);
        ffiConverterOptionalString.write(akl.AkhnZx(), byteBuffer);
        FfiConverterOptionalInt ffiConverterOptionalInt = FfiConverterOptionalInt.INSTANCE;
        ffiConverterOptionalInt.write(akl.gEmmrt(), byteBuffer);
        ffiConverterOptionalInt.write(akl.valueOf(), byteBuffer);
        ffiConverterBoolean.write(akl.AEQbTJ(), byteBuffer);
        ffiConverterBoolean.write(akl.values(), byteBuffer);
        ffiConverterOptionalString.write(akl.copydefault(), byteBuffer);
        ffiConverterOptionalInt.write(akl.KWHzl(), byteBuffer);
        FfiConverterSequenceString.INSTANCE.write((List) akl.AYXKKw(), byteBuffer);
    }
}
