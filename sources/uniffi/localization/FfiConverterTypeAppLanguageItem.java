package uniffi.localization;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.AXZ;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.localization.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeAppLanguageItem implements FfiConverterRustBuffer<AXZ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAppLanguageItem INSTANCE = new FfiConverterTypeAppLanguageItem();

    private FfiConverterTypeAppLanguageItem() {
    }

    @Override // uniffi.localization.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AXZ lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AXZ) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AXZ liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AXZ) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AXZ axz) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, axz);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AXZ axz) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, axz);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AXZ read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new AXZ(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AXZ axz) {
        Intrinsics.checkNotNullParameter(axz, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(axz.copydefault()) + ffiConverterString.mo9529allocationSizeI7RO_PI(axz.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(axz.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(axz.OLrzqt())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(axz.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AXZ axz, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(axz, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(axz.copydefault(), byteBuffer);
        ffiConverterString.write(axz.EZpvd(), byteBuffer);
        ffiConverterString.write(axz.KWHzl(), byteBuffer);
        ffiConverterString.write(axz.OLrzqt(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(axz.AEQbTJ(), byteBuffer);
    }
}
