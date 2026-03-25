package uniffi.growth;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2564AQp;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.growth.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeSharePreviewCommon implements FfiConverterRustBuffer<C2564AQp> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSharePreviewCommon INSTANCE = new FfiConverterTypeSharePreviewCommon();

    private FfiConverterTypeSharePreviewCommon() {
    }

    @Override // uniffi.growth.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2564AQp lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2564AQp) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2564AQp liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2564AQp) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2564AQp c2564AQp) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2564AQp);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2564AQp c2564AQp) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2564AQp);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2564AQp read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return new C2564AQp(ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), FfiConverterOptionalTypeImageSource.INSTANCE.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), ffiConverterOptionalString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2564AQp c2564AQp) {
        Intrinsics.checkNotNullParameter(c2564AQp, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c2564AQp.KWHzl()) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c2564AQp.copydefault())) + FfiConverterOptionalTypeImageSource.INSTANCE.mo9529allocationSizeI7RO_PI(c2564AQp.EZpvd())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c2564AQp.OLrzqt())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c2564AQp.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2564AQp c2564AQp, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2564AQp, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c2564AQp.KWHzl(), byteBuffer);
        ffiConverterOptionalString.write(c2564AQp.copydefault(), byteBuffer);
        FfiConverterOptionalTypeImageSource.INSTANCE.write(c2564AQp.EZpvd(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(c2564AQp.OLrzqt(), byteBuffer);
        ffiConverterOptionalString.write(c2564AQp.AEQbTJ(), byteBuffer);
    }
}
