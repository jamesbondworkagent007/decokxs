package uniffi.retail_kline;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C4530Bhm;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_kline.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeCoinNewsResult implements FfiConverterRustBuffer<C4530Bhm> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoinNewsResult INSTANCE = new FfiConverterTypeCoinNewsResult();

    private FfiConverterTypeCoinNewsResult() {
    }

    @Override // uniffi.retail_kline.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4530Bhm lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4530Bhm) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4530Bhm liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4530Bhm) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4530Bhm c4530Bhm) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4530Bhm);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4530Bhm c4530Bhm) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4530Bhm);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4530Bhm read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C4530Bhm(FfiConverterSequenceTypeCoinNewsDataItem.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4530Bhm c4530Bhm) {
        Intrinsics.checkNotNullParameter(c4530Bhm, "");
        return FfiConverterSequenceTypeCoinNewsDataItem.INSTANCE.mo9529allocationSizeI7RO_PI((List) c4530Bhm.copydefault());
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4530Bhm c4530Bhm, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4530Bhm, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterSequenceTypeCoinNewsDataItem.INSTANCE.write((List) c4530Bhm.copydefault(), byteBuffer);
    }
}
