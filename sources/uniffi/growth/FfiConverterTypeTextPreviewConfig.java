package uniffi.growth;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2562AQn;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.growth.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeTextPreviewConfig implements FfiConverterRustBuffer<C2562AQn> {
    public static final int $stable = 0;
    public static final FfiConverterTypeTextPreviewConfig INSTANCE = new FfiConverterTypeTextPreviewConfig();

    private FfiConverterTypeTextPreviewConfig() {
    }

    @Override // uniffi.growth.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2562AQn lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2562AQn) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2562AQn liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2562AQn) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2562AQn c2562AQn) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2562AQn);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2562AQn c2562AQn) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2562AQn);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2562AQn read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C2562AQn(FfiConverterTypeSharePreviewCommon.INSTANCE.read(byteBuffer), FfiConverterTypeShareType.INSTANCE.read(byteBuffer), FfiConverterTypeSharePreviewMode.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2562AQn c2562AQn) {
        Intrinsics.checkNotNullParameter(c2562AQn, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterTypeSharePreviewCommon.INSTANCE.mo9529allocationSizeI7RO_PI(c2562AQn.KWHzl()) + FfiConverterTypeShareType.INSTANCE.mo9529allocationSizeI7RO_PI(c2562AQn.copydefault())) + FfiConverterTypeSharePreviewMode.INSTANCE.mo9529allocationSizeI7RO_PI(c2562AQn.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2562AQn c2562AQn, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2562AQn, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeSharePreviewCommon.INSTANCE.write(c2562AQn.KWHzl(), byteBuffer);
        FfiConverterTypeShareType.INSTANCE.write(c2562AQn.copydefault(), byteBuffer);
        FfiConverterTypeSharePreviewMode.INSTANCE.write(c2562AQn.OLrzqt(), byteBuffer);
    }
}
