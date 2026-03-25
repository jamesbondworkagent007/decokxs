package uniffi.growth;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2497AOa;
import o.C2564AQp;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.growth.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeImageCustomLuaPreviewConfig implements FfiConverterRustBuffer<C2497AOa> {
    public static final int $stable = 0;
    public static final FfiConverterTypeImageCustomLuaPreviewConfig INSTANCE = new FfiConverterTypeImageCustomLuaPreviewConfig();

    private FfiConverterTypeImageCustomLuaPreviewConfig() {
    }

    @Override // uniffi.growth.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2497AOa lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2497AOa) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2497AOa liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2497AOa) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2497AOa c2497AOa) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2497AOa);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2497AOa c2497AOa) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2497AOa);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2497AOa read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        C2564AQp c2564AQp = FfiConverterTypeSharePreviewCommon.INSTANCE.read(byteBuffer);
        ShareType shareType = FfiConverterTypeShareType.INSTANCE.read(byteBuffer);
        SharePreviewMode sharePreviewMode = FfiConverterTypeSharePreviewMode.INSTANCE.read(byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return new C2497AOa(c2564AQp, shareType, sharePreviewMode, ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2497AOa c2497AOa) {
        Intrinsics.checkNotNullParameter(c2497AOa, "");
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterTypeSharePreviewCommon.INSTANCE.mo9529allocationSizeI7RO_PI(c2497AOa.OLrzqt()) + FfiConverterTypeShareType.INSTANCE.mo9529allocationSizeI7RO_PI(c2497AOa.KWHzl())) + FfiConverterTypeSharePreviewMode.INSTANCE.mo9529allocationSizeI7RO_PI(c2497AOa.AEQbTJ()));
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c2497AOa.copydefault())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c2497AOa.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2497AOa c2497AOa, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2497AOa, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeSharePreviewCommon.INSTANCE.write(c2497AOa.OLrzqt(), byteBuffer);
        FfiConverterTypeShareType.INSTANCE.write(c2497AOa.KWHzl(), byteBuffer);
        FfiConverterTypeSharePreviewMode.INSTANCE.write(c2497AOa.AEQbTJ(), byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c2497AOa.copydefault(), byteBuffer);
        ffiConverterOptionalString.write(c2497AOa.EZpvd(), byteBuffer);
    }
}
