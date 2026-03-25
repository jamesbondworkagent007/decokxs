package uniffi.growth;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.ANZ;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.growth.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeImageDefaultPreviewConfig implements FfiConverterRustBuffer<ANZ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeImageDefaultPreviewConfig INSTANCE = new FfiConverterTypeImageDefaultPreviewConfig();

    private FfiConverterTypeImageDefaultPreviewConfig() {
    }

    @Override // uniffi.growth.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public ANZ lift2(@NotNull RustBuffer.ByValue byValue) {
        return (ANZ) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public ANZ liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (ANZ) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull ANZ anz) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, anz);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull ANZ anz) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, anz);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public ANZ read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new ANZ(FfiConverterTypeSharePreviewCommon.INSTANCE.read(byteBuffer), FfiConverterTypeShareType.INSTANCE.read(byteBuffer), FfiConverterTypeSharePreviewMode.INSTANCE.read(byteBuffer), FfiConverterTypeImagePreviewType.INSTANCE.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), FfiConverterOptionalTypeRect.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull ANZ anz) {
        Intrinsics.checkNotNullParameter(anz, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterTypeSharePreviewCommon.INSTANCE.mo9529allocationSizeI7RO_PI(anz.KWHzl()) + FfiConverterTypeShareType.INSTANCE.mo9529allocationSizeI7RO_PI(anz.OLrzqt())) + FfiConverterTypeSharePreviewMode.INSTANCE.mo9529allocationSizeI7RO_PI(anz.copydefault())) + FfiConverterTypeImagePreviewType.INSTANCE.mo9529allocationSizeI7RO_PI(anz.AEQbTJ())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(anz.AYXKKw())) + FfiConverterOptionalTypeRect.INSTANCE.mo9529allocationSizeI7RO_PI(anz.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull ANZ anz, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(anz, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeSharePreviewCommon.INSTANCE.write(anz.KWHzl(), byteBuffer);
        FfiConverterTypeShareType.INSTANCE.write(anz.OLrzqt(), byteBuffer);
        FfiConverterTypeSharePreviewMode.INSTANCE.write(anz.copydefault(), byteBuffer);
        FfiConverterTypeImagePreviewType.INSTANCE.write(anz.AEQbTJ(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(anz.AYXKKw(), byteBuffer);
        FfiConverterOptionalTypeRect.INSTANCE.write(anz.EZpvd(), byteBuffer);
    }
}
