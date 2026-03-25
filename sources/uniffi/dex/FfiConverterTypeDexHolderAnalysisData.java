package uniffi.dex;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.AAI;
import o.AAK;
import o.AAM;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes20.dex */
public final class FfiConverterTypeDexHolderAnalysisData implements FfiConverterRustBuffer<AAI> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDexHolderAnalysisData INSTANCE = new FfiConverterTypeDexHolderAnalysisData();

    private FfiConverterTypeDexHolderAnalysisData() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AAI lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AAI) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AAI liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AAI) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AAI aai) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, aai);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AAI aai) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, aai);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AAI read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterSequenceTypeDexHolderChange ffiConverterSequenceTypeDexHolderChange = FfiConverterSequenceTypeDexHolderChange.INSTANCE;
        List<AAM> list = ffiConverterSequenceTypeDexHolderChange.read(byteBuffer);
        List<AAM> list2 = ffiConverterSequenceTypeDexHolderChange.read(byteBuffer);
        FfiConverterSequenceTypeDexHolderTop ffiConverterSequenceTypeDexHolderTop = FfiConverterSequenceTypeDexHolderTop.INSTANCE;
        List<AAK> list3 = ffiConverterSequenceTypeDexHolderTop.read(byteBuffer);
        List<AAK> list4 = ffiConverterSequenceTypeDexHolderTop.read(byteBuffer);
        List<AAK> list5 = ffiConverterSequenceTypeDexHolderTop.read(byteBuffer);
        FfiConverterSequenceTypeDexHolderData ffiConverterSequenceTypeDexHolderData = FfiConverterSequenceTypeDexHolderData.INSTANCE;
        return new AAI(list, list2, list3, list4, list5, ffiConverterSequenceTypeDexHolderData.read(byteBuffer), ffiConverterSequenceTypeDexHolderData.read(byteBuffer), ffiConverterSequenceTypeDexHolderData.read(byteBuffer), ffiConverterSequenceTypeDexHolderData.read(byteBuffer), ffiConverterSequenceTypeDexHolderData.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AAI aai) {
        Intrinsics.checkNotNullParameter(aai, "");
        FfiConverterSequenceTypeDexHolderChange ffiConverterSequenceTypeDexHolderChange = FfiConverterSequenceTypeDexHolderChange.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(ffiConverterSequenceTypeDexHolderChange.mo9529allocationSizeI7RO_PI((List) aai.AEQbTJ()) + ffiConverterSequenceTypeDexHolderChange.mo9529allocationSizeI7RO_PI((List) aai.OLrzqt()));
        FfiConverterSequenceTypeDexHolderTop ffiConverterSequenceTypeDexHolderTop = FfiConverterSequenceTypeDexHolderTop.INSTANCE;
        long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterSequenceTypeDexHolderTop.mo9529allocationSizeI7RO_PI((List) aai.valueOf())) + ffiConverterSequenceTypeDexHolderTop.mo9529allocationSizeI7RO_PI((List) aai.gEmmrt())) + ffiConverterSequenceTypeDexHolderTop.mo9529allocationSizeI7RO_PI((List) aai.AYXKKw()));
        FfiConverterSequenceTypeDexHolderData ffiConverterSequenceTypeDexHolderData = FfiConverterSequenceTypeDexHolderData.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 + ffiConverterSequenceTypeDexHolderData.mo9529allocationSizeI7RO_PI((List) aai.KWHzl())) + ffiConverterSequenceTypeDexHolderData.mo9529allocationSizeI7RO_PI((List) aai.djBIcL())) + ffiConverterSequenceTypeDexHolderData.mo9529allocationSizeI7RO_PI((List) aai.copydefault())) + ffiConverterSequenceTypeDexHolderData.mo9529allocationSizeI7RO_PI((List) aai.AhwBna())) + ffiConverterSequenceTypeDexHolderData.mo9529allocationSizeI7RO_PI((List) aai.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AAI aai, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(aai, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterSequenceTypeDexHolderChange ffiConverterSequenceTypeDexHolderChange = FfiConverterSequenceTypeDexHolderChange.INSTANCE;
        ffiConverterSequenceTypeDexHolderChange.write((List) aai.AEQbTJ(), byteBuffer);
        ffiConverterSequenceTypeDexHolderChange.write((List) aai.OLrzqt(), byteBuffer);
        FfiConverterSequenceTypeDexHolderTop ffiConverterSequenceTypeDexHolderTop = FfiConverterSequenceTypeDexHolderTop.INSTANCE;
        ffiConverterSequenceTypeDexHolderTop.write((List) aai.valueOf(), byteBuffer);
        ffiConverterSequenceTypeDexHolderTop.write((List) aai.gEmmrt(), byteBuffer);
        ffiConverterSequenceTypeDexHolderTop.write((List) aai.AYXKKw(), byteBuffer);
        FfiConverterSequenceTypeDexHolderData ffiConverterSequenceTypeDexHolderData = FfiConverterSequenceTypeDexHolderData.INSTANCE;
        ffiConverterSequenceTypeDexHolderData.write((List) aai.KWHzl(), byteBuffer);
        ffiConverterSequenceTypeDexHolderData.write((List) aai.djBIcL(), byteBuffer);
        ffiConverterSequenceTypeDexHolderData.write((List) aai.copydefault(), byteBuffer);
        ffiConverterSequenceTypeDexHolderData.write((List) aai.AhwBna(), byteBuffer);
        ffiConverterSequenceTypeDexHolderData.write((List) aai.EZpvd(), byteBuffer);
    }
}
