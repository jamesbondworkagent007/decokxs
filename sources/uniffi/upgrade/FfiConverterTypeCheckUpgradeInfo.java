package uniffi.upgrade;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.upgrade.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes14.dex */
public final class FfiConverterTypeCheckUpgradeInfo implements FfiConverterRustBuffer<CheckUpgradeInfo> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCheckUpgradeInfo INSTANCE = new FfiConverterTypeCheckUpgradeInfo();

    private FfiConverterTypeCheckUpgradeInfo() {
    }

    @Override // uniffi.upgrade.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public CheckUpgradeInfo lift2(@NotNull RustBuffer.ByValue byValue) {
        return (CheckUpgradeInfo) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public CheckUpgradeInfo liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (CheckUpgradeInfo) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull CheckUpgradeInfo checkUpgradeInfo) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, checkUpgradeInfo);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull CheckUpgradeInfo checkUpgradeInfo) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, checkUpgradeInfo);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public CheckUpgradeInfo read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        boolean zBooleanValue = ffiConverterBoolean.read(byteBuffer).booleanValue();
        boolean zBooleanValue2 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        boolean zBooleanValue3 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new CheckUpgradeInfo(zBooleanValue, zBooleanValue2, zBooleanValue3, ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterMapStringString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull CheckUpgradeInfo checkUpgradeInfo) {
        Intrinsics.checkNotNullParameter(checkUpgradeInfo, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterBoolean.m9530allocationSizeI7RO_PI(checkUpgradeInfo.getUseCache()) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(checkUpgradeInfo.getIgnoreGray())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(checkUpgradeInfo.getIgnoreInterval()));
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterString.mo9529allocationSizeI7RO_PI(checkUpgradeInfo.isHarmony())) + ffiConverterString.mo9529allocationSizeI7RO_PI(checkUpgradeInfo.getAppVersion())) + ffiConverterString.mo9529allocationSizeI7RO_PI(checkUpgradeInfo.getChannel())) + FfiConverterMapStringString.INSTANCE.mo9529allocationSizeI7RO_PI(checkUpgradeInfo.getHeaders()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull CheckUpgradeInfo checkUpgradeInfo, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(checkUpgradeInfo, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(checkUpgradeInfo.getUseCache(), byteBuffer);
        ffiConverterBoolean.write(checkUpgradeInfo.getIgnoreGray(), byteBuffer);
        ffiConverterBoolean.write(checkUpgradeInfo.getIgnoreInterval(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(checkUpgradeInfo.isHarmony(), byteBuffer);
        ffiConverterString.write(checkUpgradeInfo.getAppVersion(), byteBuffer);
        ffiConverterString.write(checkUpgradeInfo.getChannel(), byteBuffer);
        FfiConverterMapStringString.INSTANCE.write(checkUpgradeInfo.getHeaders(), byteBuffer);
    }
}
