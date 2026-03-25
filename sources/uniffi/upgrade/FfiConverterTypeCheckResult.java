package uniffi.upgrade;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.upgrade.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes14.dex */
public final class FfiConverterTypeCheckResult implements FfiConverterRustBuffer<CheckResult> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCheckResult INSTANCE = new FfiConverterTypeCheckResult();

    private FfiConverterTypeCheckResult() {
    }

    @Override // uniffi.upgrade.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public CheckResult lift2(@NotNull RustBuffer.ByValue byValue) {
        return (CheckResult) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public CheckResult liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (CheckResult) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull CheckResult checkResult) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, checkResult);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull CheckResult checkResult) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, checkResult);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public CheckResult read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new CheckResult(ffiConverterBoolean.read(byteBuffer).booleanValue(), FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), FfiConverterString.INSTANCE.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull CheckResult checkResult) {
        Intrinsics.checkNotNullParameter(checkResult, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterBoolean.m9530allocationSizeI7RO_PI(checkResult.getCanShow()) + FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(checkResult.getUpgradeType())) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(checkResult.getServerInfo())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(checkResult.getAllForce()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull CheckResult checkResult, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(checkResult, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(checkResult.getCanShow(), byteBuffer);
        FfiConverterInt.INSTANCE.write(checkResult.getUpgradeType(), byteBuffer);
        FfiConverterString.INSTANCE.write(checkResult.getServerInfo(), byteBuffer);
        ffiConverterBoolean.write(checkResult.getAllForce(), byteBuffer);
    }
}
