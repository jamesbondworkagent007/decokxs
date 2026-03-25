package uniffi.lifecycle;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2696AVs;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.lifecycle.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeDeeplinkRegistry implements FfiConverterRustBuffer<C2696AVs> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDeeplinkRegistry INSTANCE = new FfiConverterTypeDeeplinkRegistry();

    private FfiConverterTypeDeeplinkRegistry() {
    }

    @Override // uniffi.lifecycle.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2696AVs lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2696AVs) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2696AVs liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2696AVs) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2696AVs c2696AVs) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2696AVs);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2696AVs c2696AVs) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2696AVs);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2696AVs read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C2696AVs(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2696AVs c2696AVs) {
        Intrinsics.checkNotNullParameter(c2696AVs, "");
        return FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c2696AVs.copydefault());
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2696AVs c2696AVs, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2696AVs, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean.INSTANCE.write(c2696AVs.copydefault(), byteBuffer);
    }
}
