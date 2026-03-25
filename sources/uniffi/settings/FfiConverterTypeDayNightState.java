package uniffi.settings;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BnD;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.settings.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeDayNightState implements FfiConverterRustBuffer<BnD> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDayNightState INSTANCE = new FfiConverterTypeDayNightState();

    private FfiConverterTypeDayNightState() {
    }

    @Override // uniffi.settings.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BnD lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BnD) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BnD liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BnD) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BnD bnD) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bnD);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BnD bnD) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bnD);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BnD read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new BnD(FfiConverterTypeDayNightMode.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BnD bnD) {
        Intrinsics.checkNotNullParameter(bnD, "");
        return FfiConverterTypeDayNightMode.INSTANCE.mo9529allocationSizeI7RO_PI(bnD.copydefault());
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BnD bnD, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bnD, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeDayNightMode.INSTANCE.write(bnD.copydefault(), byteBuffer);
    }
}
