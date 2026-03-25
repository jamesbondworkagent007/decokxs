package uniffi.dex;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C2304AGp;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRiskLevelData implements FfiConverterRustBuffer<C2304AGp> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRiskLevelData INSTANCE = new FfiConverterTypeRiskLevelData();

    private FfiConverterTypeRiskLevelData() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2304AGp lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2304AGp) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2304AGp liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2304AGp) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2304AGp c2304AGp) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2304AGp);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2304AGp c2304AGp) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2304AGp);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2304AGp read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterSequenceTypeRiskDetailData ffiConverterSequenceTypeRiskDetailData = FfiConverterSequenceTypeRiskDetailData.INSTANCE;
        return new C2304AGp(ffiConverterSequenceTypeRiskDetailData.read(byteBuffer), ffiConverterSequenceTypeRiskDetailData.read(byteBuffer), ffiConverterSequenceTypeRiskDetailData.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2304AGp c2304AGp) {
        Intrinsics.checkNotNullParameter(c2304AGp, "");
        FfiConverterSequenceTypeRiskDetailData ffiConverterSequenceTypeRiskDetailData = FfiConverterSequenceTypeRiskDetailData.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterSequenceTypeRiskDetailData.mo9529allocationSizeI7RO_PI((List) c2304AGp.copydefault()) + ffiConverterSequenceTypeRiskDetailData.mo9529allocationSizeI7RO_PI((List) c2304AGp.AEQbTJ())) + ffiConverterSequenceTypeRiskDetailData.mo9529allocationSizeI7RO_PI((List) c2304AGp.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2304AGp c2304AGp, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2304AGp, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterSequenceTypeRiskDetailData ffiConverterSequenceTypeRiskDetailData = FfiConverterSequenceTypeRiskDetailData.INSTANCE;
        ffiConverterSequenceTypeRiskDetailData.write((List) c2304AGp.copydefault(), byteBuffer);
        ffiConverterSequenceTypeRiskDetailData.write((List) c2304AGp.AEQbTJ(), byteBuffer);
        ffiConverterSequenceTypeRiskDetailData.write((List) c2304AGp.OLrzqt(), byteBuffer);
    }
}
