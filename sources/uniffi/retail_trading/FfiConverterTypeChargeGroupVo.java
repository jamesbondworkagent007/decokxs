package uniffi.retail_trading;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BjE;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_trading.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeChargeGroupVo implements FfiConverterRustBuffer<BjE> {
    public static final int $stable = 0;
    public static final FfiConverterTypeChargeGroupVo INSTANCE = new FfiConverterTypeChargeGroupVo();

    private FfiConverterTypeChargeGroupVo() {
    }

    @Override // uniffi.retail_trading.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BjE lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BjE) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BjE liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BjE) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BjE bjE) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bjE);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BjE bjE) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bjE);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BjE read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new BjE(FfiConverterTypeChargeGroupData.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BjE bjE) {
        Intrinsics.checkNotNullParameter(bjE, "");
        return FfiConverterTypeChargeGroupData.INSTANCE.mo9529allocationSizeI7RO_PI(bjE.OLrzqt());
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BjE bjE, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bjE, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeChargeGroupData.INSTANCE.write(bjE.OLrzqt(), byteBuffer);
    }
}
