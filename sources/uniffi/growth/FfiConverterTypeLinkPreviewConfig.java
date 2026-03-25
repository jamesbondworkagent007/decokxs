package uniffi.growth;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2501AOe;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.growth.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeLinkPreviewConfig implements FfiConverterRustBuffer<C2501AOe> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLinkPreviewConfig INSTANCE = new FfiConverterTypeLinkPreviewConfig();

    private FfiConverterTypeLinkPreviewConfig() {
    }

    @Override // uniffi.growth.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2501AOe lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2501AOe) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2501AOe liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2501AOe) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2501AOe c2501AOe) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2501AOe);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2501AOe c2501AOe) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2501AOe);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2501AOe read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C2501AOe(FfiConverterTypeSharePreviewCommon.INSTANCE.read(byteBuffer), FfiConverterTypeShareType.INSTANCE.read(byteBuffer), FfiConverterTypeSharePreviewMode.INSTANCE.read(byteBuffer), FfiConverterOptionalString.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeImageSource.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2501AOe c2501AOe) {
        Intrinsics.checkNotNullParameter(c2501AOe, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterTypeSharePreviewCommon.INSTANCE.mo9529allocationSizeI7RO_PI(c2501AOe.OLrzqt()) + FfiConverterTypeShareType.INSTANCE.mo9529allocationSizeI7RO_PI(c2501AOe.copydefault())) + FfiConverterTypeSharePreviewMode.INSTANCE.mo9529allocationSizeI7RO_PI(c2501AOe.AEQbTJ())) + FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(c2501AOe.KWHzl())) + FfiConverterOptionalTypeImageSource.INSTANCE.mo9529allocationSizeI7RO_PI(c2501AOe.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2501AOe c2501AOe, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2501AOe, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeSharePreviewCommon.INSTANCE.write(c2501AOe.OLrzqt(), byteBuffer);
        FfiConverterTypeShareType.INSTANCE.write(c2501AOe.copydefault(), byteBuffer);
        FfiConverterTypeSharePreviewMode.INSTANCE.write(c2501AOe.AEQbTJ(), byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(c2501AOe.KWHzl(), byteBuffer);
        FfiConverterOptionalTypeImageSource.INSTANCE.write(c2501AOe.EZpvd(), byteBuffer);
    }
}
