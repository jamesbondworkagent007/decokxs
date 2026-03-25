package uniffi.network;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2783AZb;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.network.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeEncryptConfig implements FfiConverterRustBuffer<C2783AZb> {
    public static final int $stable = 0;
    public static final FfiConverterTypeEncryptConfig INSTANCE = new FfiConverterTypeEncryptConfig();

    private FfiConverterTypeEncryptConfig() {
    }

    @Override // uniffi.network.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2783AZb lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2783AZb) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2783AZb liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2783AZb) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2783AZb c2783AZb) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2783AZb);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2783AZb c2783AZb) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2783AZb);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2783AZb read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C2783AZb(FfiConverterOptionalString.INSTANCE.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2783AZb c2783AZb) {
        Intrinsics.checkNotNullParameter(c2783AZb, "");
        return C56396yDv.copydefault(FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(c2783AZb.EZpvd()) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c2783AZb.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2783AZb c2783AZb, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2783AZb, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString.INSTANCE.write(c2783AZb.EZpvd(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(c2783AZb.KWHzl(), byteBuffer);
    }
}
