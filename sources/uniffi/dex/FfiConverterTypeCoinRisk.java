package uniffi.dex;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C4147AzP;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeCoinRisk implements FfiConverterRustBuffer<C4147AzP> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoinRisk INSTANCE = new FfiConverterTypeCoinRisk();

    private FfiConverterTypeCoinRisk() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4147AzP lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4147AzP) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4147AzP liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4147AzP) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4147AzP c4147AzP) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4147AzP);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4147AzP c4147AzP) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4147AzP);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4147AzP read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        FfiConverterSequenceTypeRiskDetail ffiConverterSequenceTypeRiskDetail = FfiConverterSequenceTypeRiskDetail.INSTANCE;
        return new C4147AzP(str, ffiConverterSequenceTypeRiskDetail.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterSequenceTypeRiskDetail.read(byteBuffer), FfiConverterOptionalTypeRiskControlBannerUiModel.INSTANCE.read(byteBuffer), FfiConverterTypeRiskControlLevel.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4147AzP c4147AzP) {
        Intrinsics.checkNotNullParameter(c4147AzP, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jMo9529allocationSizeI7RO_PI = ffiConverterString.mo9529allocationSizeI7RO_PI(c4147AzP.KWHzl());
        FfiConverterSequenceTypeRiskDetail ffiConverterSequenceTypeRiskDetail = FfiConverterSequenceTypeRiskDetail.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterSequenceTypeRiskDetail.mo9529allocationSizeI7RO_PI((List) c4147AzP.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4147AzP.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4147AzP.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4147AzP.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4147AzP.djBIcL())) + ffiConverterSequenceTypeRiskDetail.mo9529allocationSizeI7RO_PI((List) c4147AzP.AYXKKw())) + FfiConverterOptionalTypeRiskControlBannerUiModel.INSTANCE.mo9529allocationSizeI7RO_PI(c4147AzP.AhwBna())) + FfiConverterTypeRiskControlLevel.INSTANCE.mo9529allocationSizeI7RO_PI(c4147AzP.gEmmrt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4147AzP c4147AzP, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4147AzP, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c4147AzP.KWHzl(), byteBuffer);
        FfiConverterSequenceTypeRiskDetail ffiConverterSequenceTypeRiskDetail = FfiConverterSequenceTypeRiskDetail.INSTANCE;
        ffiConverterSequenceTypeRiskDetail.write((List) c4147AzP.OLrzqt(), byteBuffer);
        ffiConverterString.write(c4147AzP.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c4147AzP.copydefault(), byteBuffer);
        ffiConverterString.write(c4147AzP.EZpvd(), byteBuffer);
        ffiConverterString.write(c4147AzP.djBIcL(), byteBuffer);
        ffiConverterSequenceTypeRiskDetail.write((List) c4147AzP.AYXKKw(), byteBuffer);
        FfiConverterOptionalTypeRiskControlBannerUiModel.INSTANCE.write(c4147AzP.AhwBna(), byteBuffer);
        FfiConverterTypeRiskControlLevel.INSTANCE.write(c4147AzP.gEmmrt(), byteBuffer);
    }
}
