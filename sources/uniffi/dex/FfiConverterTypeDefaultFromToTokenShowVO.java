package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4154AzW;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeDefaultFromToTokenShowVO implements FfiConverterRustBuffer<C4154AzW> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDefaultFromToTokenShowVO INSTANCE = new FfiConverterTypeDefaultFromToTokenShowVO();

    private FfiConverterTypeDefaultFromToTokenShowVO() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4154AzW lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4154AzW) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4154AzW liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4154AzW) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4154AzW c4154AzW) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4154AzW);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4154AzW c4154AzW) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4154AzW);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4154AzW read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalTypeDexTradeChainsTokenInfo ffiConverterOptionalTypeDexTradeChainsTokenInfo = FfiConverterOptionalTypeDexTradeChainsTokenInfo.INSTANCE;
        return new C4154AzW(ffiConverterOptionalTypeDexTradeChainsTokenInfo.read(byteBuffer), ffiConverterOptionalTypeDexTradeChainsTokenInfo.read(byteBuffer), ffiConverterOptionalTypeDexTradeChainsTokenInfo.read(byteBuffer), ffiConverterOptionalTypeDexTradeChainsTokenInfo.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4154AzW c4154AzW) {
        Intrinsics.checkNotNullParameter(c4154AzW, "");
        FfiConverterOptionalTypeDexTradeChainsTokenInfo ffiConverterOptionalTypeDexTradeChainsTokenInfo = FfiConverterOptionalTypeDexTradeChainsTokenInfo.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterOptionalTypeDexTradeChainsTokenInfo.mo9529allocationSizeI7RO_PI(c4154AzW.OLrzqt()) + ffiConverterOptionalTypeDexTradeChainsTokenInfo.mo9529allocationSizeI7RO_PI(c4154AzW.KWHzl())) + ffiConverterOptionalTypeDexTradeChainsTokenInfo.mo9529allocationSizeI7RO_PI(c4154AzW.copydefault())) + ffiConverterOptionalTypeDexTradeChainsTokenInfo.mo9529allocationSizeI7RO_PI(c4154AzW.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4154AzW c4154AzW, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4154AzW, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalTypeDexTradeChainsTokenInfo ffiConverterOptionalTypeDexTradeChainsTokenInfo = FfiConverterOptionalTypeDexTradeChainsTokenInfo.INSTANCE;
        ffiConverterOptionalTypeDexTradeChainsTokenInfo.write(c4154AzW.OLrzqt(), byteBuffer);
        ffiConverterOptionalTypeDexTradeChainsTokenInfo.write(c4154AzW.KWHzl(), byteBuffer);
        ffiConverterOptionalTypeDexTradeChainsTokenInfo.write(c4154AzW.copydefault(), byteBuffer);
        ffiConverterOptionalTypeDexTradeChainsTokenInfo.write(c4154AzW.EZpvd(), byteBuffer);
    }
}
