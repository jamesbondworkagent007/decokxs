package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3810Asv;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeLimitValue implements FfiConverterRustBuffer<C3810Asv> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLimitValue INSTANCE = new FfiConverterTypeLimitValue();

    private FfiConverterTypeLimitValue() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3810Asv lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3810Asv) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3810Asv liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3810Asv) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3810Asv c3810Asv) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3810Asv);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3810Asv c3810Asv) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3810Asv);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3810Asv read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C3810Asv(FfiConverterDouble.INSTANCE.read(byteBuffer).doubleValue(), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3810Asv c3810Asv) {
        Intrinsics.checkNotNullParameter(c3810Asv, "");
        return C56396yDv.copydefault(FfiConverterDouble.INSTANCE.m9533allocationSizeI7RO_PI(c3810Asv.copydefault()) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c3810Asv.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3810Asv c3810Asv, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3810Asv, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterDouble.INSTANCE.write(c3810Asv.copydefault(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(c3810Asv.EZpvd(), byteBuffer);
    }
}
