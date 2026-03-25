package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2295AGg;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes20.dex */
public final class FfiConverterTypePresetData implements FfiConverterRustBuffer<C2295AGg> {
    public static final int $stable = 0;
    public static final FfiConverterTypePresetData INSTANCE = new FfiConverterTypePresetData();

    private FfiConverterTypePresetData() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2295AGg lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2295AGg) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2295AGg liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2295AGg) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2295AGg c2295AGg) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2295AGg);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2295AGg c2295AGg) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2295AGg);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2295AGg read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C2295AGg(FfiConverterTypeFeeConfig.INSTANCE.read(byteBuffer), FfiConverterTypeSlippageConfig.INSTANCE.read(byteBuffer), FfiConverterTypeRouteConfig.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2295AGg c2295AGg) {
        Intrinsics.checkNotNullParameter(c2295AGg, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterTypeFeeConfig.INSTANCE.mo9529allocationSizeI7RO_PI(c2295AGg.EZpvd()) + FfiConverterTypeSlippageConfig.INSTANCE.mo9529allocationSizeI7RO_PI(c2295AGg.OLrzqt())) + FfiConverterTypeRouteConfig.INSTANCE.mo9529allocationSizeI7RO_PI(c2295AGg.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2295AGg c2295AGg, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2295AGg, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeFeeConfig.INSTANCE.write(c2295AGg.EZpvd(), byteBuffer);
        FfiConverterTypeSlippageConfig.INSTANCE.write(c2295AGg.OLrzqt(), byteBuffer);
        FfiConverterTypeRouteConfig.INSTANCE.write(c2295AGg.KWHzl(), byteBuffer);
    }
}
