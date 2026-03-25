package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3630Apa;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeBSCQuickConvertContentState implements FfiConverterRustBuffer<C3630Apa> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBSCQuickConvertContentState INSTANCE = new FfiConverterTypeBSCQuickConvertContentState();

    private FfiConverterTypeBSCQuickConvertContentState() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3630Apa lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3630Apa) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3630Apa liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3630Apa) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3630Apa c3630Apa) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3630Apa);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3630Apa c3630Apa) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3630Apa);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3630Apa read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C3630Apa(FfiConverterTypeBSCQuickConvertStateVariant.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeBSCQuickConvertData.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3630Apa c3630Apa) {
        Intrinsics.checkNotNullParameter(c3630Apa, "");
        return C56396yDv.copydefault(FfiConverterTypeBSCQuickConvertStateVariant.INSTANCE.mo9529allocationSizeI7RO_PI(c3630Apa.KWHzl()) + FfiConverterOptionalTypeBSCQuickConvertData.INSTANCE.mo9529allocationSizeI7RO_PI(c3630Apa.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3630Apa c3630Apa, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3630Apa, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeBSCQuickConvertStateVariant.INSTANCE.write(c3630Apa.KWHzl(), byteBuffer);
        FfiConverterOptionalTypeBSCQuickConvertData.INSTANCE.write(c3630Apa.EZpvd(), byteBuffer);
    }
}
