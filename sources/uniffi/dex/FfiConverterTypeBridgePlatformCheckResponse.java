package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4135AzD;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeBridgePlatformCheckResponse implements FfiConverterRustBuffer<C4135AzD> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBridgePlatformCheckResponse INSTANCE = new FfiConverterTypeBridgePlatformCheckResponse();

    private FfiConverterTypeBridgePlatformCheckResponse() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4135AzD lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4135AzD) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4135AzD liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4135AzD) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4135AzD c4135AzD) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4135AzD);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4135AzD c4135AzD) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4135AzD);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4135AzD read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C4135AzD(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4135AzD c4135AzD) {
        Intrinsics.checkNotNullParameter(c4135AzD, "");
        return FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c4135AzD.KWHzl());
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4135AzD c4135AzD, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4135AzD, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean.INSTANCE.write(c4135AzD.KWHzl(), byteBuffer);
    }
}
