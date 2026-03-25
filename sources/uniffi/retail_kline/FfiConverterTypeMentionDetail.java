package uniffi.retail_kline;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.BhJ;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_kline.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeMentionDetail implements FfiConverterRustBuffer<BhJ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMentionDetail INSTANCE = new FfiConverterTypeMentionDetail();

    private FfiConverterTypeMentionDetail() {
    }

    @Override // uniffi.retail_kline.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BhJ lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BhJ) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BhJ liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BhJ) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BhJ bhJ) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bhJ);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BhJ bhJ) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bhJ);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BhJ read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        List<String> list = FfiConverterSequenceString.INSTANCE.read(byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new BhJ(list, ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BhJ bhJ) {
        Intrinsics.checkNotNullParameter(bhJ, "");
        long jMo9529allocationSizeI7RO_PI = FfiConverterSequenceString.INSTANCE.mo9529allocationSizeI7RO_PI((List) bhJ.EZpvd());
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterString.mo9529allocationSizeI7RO_PI(bhJ.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bhJ.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BhJ bhJ, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bhJ, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterSequenceString.INSTANCE.write((List) bhJ.EZpvd(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(bhJ.OLrzqt(), byteBuffer);
        ffiConverterString.write(bhJ.AEQbTJ(), byteBuffer);
    }
}
