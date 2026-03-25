package uniffi.network;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4396Bcn;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.network.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeSignConfig implements FfiConverterRustBuffer<C4396Bcn> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSignConfig INSTANCE = new FfiConverterTypeSignConfig();

    private FfiConverterTypeSignConfig() {
    }

    @Override // uniffi.network.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4396Bcn lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4396Bcn) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4396Bcn liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4396Bcn) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4396Bcn c4396Bcn) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4396Bcn);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4396Bcn c4396Bcn) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4396Bcn);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4396Bcn read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C4396Bcn(FfiConverterTypeSignAlgoKind.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeSymmetricSignConfig.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeAsymmetricSignConfig.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4396Bcn c4396Bcn) {
        Intrinsics.checkNotNullParameter(c4396Bcn, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterTypeSignAlgoKind.INSTANCE.mo9529allocationSizeI7RO_PI(c4396Bcn.EZpvd()) + FfiConverterOptionalTypeSymmetricSignConfig.INSTANCE.mo9529allocationSizeI7RO_PI(c4396Bcn.OLrzqt())) + FfiConverterOptionalTypeAsymmetricSignConfig.INSTANCE.mo9529allocationSizeI7RO_PI(c4396Bcn.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4396Bcn c4396Bcn, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4396Bcn, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeSignAlgoKind.INSTANCE.write(c4396Bcn.EZpvd(), byteBuffer);
        FfiConverterOptionalTypeSymmetricSignConfig.INSTANCE.write(c4396Bcn.OLrzqt(), byteBuffer);
        FfiConverterOptionalTypeAsymmetricSignConfig.INSTANCE.write(c4396Bcn.KWHzl(), byteBuffer);
    }
}
