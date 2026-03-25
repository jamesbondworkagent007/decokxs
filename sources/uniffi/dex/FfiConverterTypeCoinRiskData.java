package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2304AGp;
import o.C4153AzV;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeCoinRiskData implements FfiConverterRustBuffer<C4153AzV> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoinRiskData INSTANCE = new FfiConverterTypeCoinRiskData();

    private FfiConverterTypeCoinRiskData() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4153AzV lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4153AzV) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4153AzV liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4153AzV) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4153AzV c4153AzV) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4153AzV);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4153AzV c4153AzV) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4153AzV);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4153AzV read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalTypeRiskLevelData ffiConverterOptionalTypeRiskLevelData = FfiConverterOptionalTypeRiskLevelData.INSTANCE;
        C2304AGp c2304AGp = ffiConverterOptionalTypeRiskLevelData.read(byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C4153AzV(c2304AGp, ffiConverterString.read(byteBuffer), ffiConverterOptionalTypeRiskLevelData.read(byteBuffer), ffiConverterOptionalTypeRiskLevelData.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterOptionalTypeHighRiskBannerData.INSTANCE.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterOptionalTypeRiskLevelData.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4153AzV c4153AzV) {
        Intrinsics.checkNotNullParameter(c4153AzV, "");
        FfiConverterOptionalTypeRiskLevelData ffiConverterOptionalTypeRiskLevelData = FfiConverterOptionalTypeRiskLevelData.INSTANCE;
        long jMo9529allocationSizeI7RO_PI = ffiConverterOptionalTypeRiskLevelData.mo9529allocationSizeI7RO_PI(c4153AzV.AEQbTJ());
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterString.mo9529allocationSizeI7RO_PI(c4153AzV.EZpvd())) + ffiConverterOptionalTypeRiskLevelData.mo9529allocationSizeI7RO_PI(c4153AzV.OLrzqt())) + ffiConverterOptionalTypeRiskLevelData.mo9529allocationSizeI7RO_PI(c4153AzV.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4153AzV.copydefault())) + FfiConverterOptionalTypeHighRiskBannerData.INSTANCE.mo9529allocationSizeI7RO_PI(c4153AzV.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4153AzV.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4153AzV.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4153AzV.AhwBna())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4153AzV.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4153AzV.AkhnZx())) + ffiConverterOptionalTypeRiskLevelData.mo9529allocationSizeI7RO_PI(c4153AzV.fetchVPNInfo()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4153AzV c4153AzV, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4153AzV, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalTypeRiskLevelData ffiConverterOptionalTypeRiskLevelData = FfiConverterOptionalTypeRiskLevelData.INSTANCE;
        ffiConverterOptionalTypeRiskLevelData.write(c4153AzV.AEQbTJ(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c4153AzV.EZpvd(), byteBuffer);
        ffiConverterOptionalTypeRiskLevelData.write(c4153AzV.OLrzqt(), byteBuffer);
        ffiConverterOptionalTypeRiskLevelData.write(c4153AzV.KWHzl(), byteBuffer);
        ffiConverterString.write(c4153AzV.copydefault(), byteBuffer);
        FfiConverterOptionalTypeHighRiskBannerData.INSTANCE.write(c4153AzV.djBIcL(), byteBuffer);
        ffiConverterString.write(c4153AzV.gEmmrt(), byteBuffer);
        ffiConverterString.write(c4153AzV.valueOf(), byteBuffer);
        ffiConverterString.write(c4153AzV.AhwBna(), byteBuffer);
        ffiConverterString.write(c4153AzV.AYXKKw(), byteBuffer);
        ffiConverterString.write(c4153AzV.AkhnZx(), byteBuffer);
        ffiConverterOptionalTypeRiskLevelData.write(c4153AzV.fetchVPNInfo(), byteBuffer);
    }
}
