package uniffi.growth;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.ANW;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.growth.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeImageCustomPreviewConfig implements FfiConverterRustBuffer<ANW> {
    public static final int $stable = 0;
    public static final FfiConverterTypeImageCustomPreviewConfig INSTANCE = new FfiConverterTypeImageCustomPreviewConfig();

    private FfiConverterTypeImageCustomPreviewConfig() {
    }

    @Override // uniffi.growth.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public ANW lift2(@NotNull RustBuffer.ByValue byValue) {
        return (ANW) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public ANW liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (ANW) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull ANW anw) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, anw);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull ANW anw) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, anw);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public ANW read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new ANW(FfiConverterTypeSharePreviewCommon.INSTANCE.read(byteBuffer), FfiConverterTypeShareType.INSTANCE.read(byteBuffer), FfiConverterTypeSharePreviewMode.INSTANCE.read(byteBuffer), FfiConverterString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull ANW anw) {
        Intrinsics.checkNotNullParameter(anw, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterTypeSharePreviewCommon.INSTANCE.mo9529allocationSizeI7RO_PI(anw.EZpvd()) + FfiConverterTypeShareType.INSTANCE.mo9529allocationSizeI7RO_PI(anw.AEQbTJ())) + FfiConverterTypeSharePreviewMode.INSTANCE.mo9529allocationSizeI7RO_PI(anw.copydefault())) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(anw.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull ANW anw, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(anw, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeSharePreviewCommon.INSTANCE.write(anw.EZpvd(), byteBuffer);
        FfiConverterTypeShareType.INSTANCE.write(anw.AEQbTJ(), byteBuffer);
        FfiConverterTypeSharePreviewMode.INSTANCE.write(anw.copydefault(), byteBuffer);
        FfiConverterString.INSTANCE.write(anw.KWHzl(), byteBuffer);
    }
}
