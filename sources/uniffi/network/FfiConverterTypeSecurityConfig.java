package uniffi.network;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4393Bck;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.network.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeSecurityConfig implements FfiConverterRustBuffer<C4393Bck> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSecurityConfig INSTANCE = new FfiConverterTypeSecurityConfig();

    private FfiConverterTypeSecurityConfig() {
    }

    @Override // uniffi.network.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4393Bck lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4393Bck) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4393Bck liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4393Bck) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4393Bck c4393Bck) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4393Bck);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4393Bck c4393Bck) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4393Bck);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4393Bck read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C4393Bck(FfiConverterOptionalTypeSignConfig.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeEncryptConfig.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4393Bck c4393Bck) {
        Intrinsics.checkNotNullParameter(c4393Bck, "");
        return C56396yDv.copydefault(FfiConverterOptionalTypeSignConfig.INSTANCE.mo9529allocationSizeI7RO_PI(c4393Bck.EZpvd()) + FfiConverterOptionalTypeEncryptConfig.INSTANCE.mo9529allocationSizeI7RO_PI(c4393Bck.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4393Bck c4393Bck, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4393Bck, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalTypeSignConfig.INSTANCE.write(c4393Bck.EZpvd(), byteBuffer);
        FfiConverterOptionalTypeEncryptConfig.INSTANCE.write(c4393Bck.OLrzqt(), byteBuffer);
    }
}
