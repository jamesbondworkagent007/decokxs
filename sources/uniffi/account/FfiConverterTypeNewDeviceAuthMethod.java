package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zJK;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeNewDeviceAuthMethod implements FfiConverterRustBuffer<zJK> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceAuthMethod INSTANCE = new FfiConverterTypeNewDeviceAuthMethod();

    private FfiConverterTypeNewDeviceAuthMethod() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zJK lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zJK) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zJK liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zJK) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zJK zjk) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zjk);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zJK zjk) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zjk);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zJK read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new zJK(FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), FfiConverterTypeNewDeviceAuthMethodKind.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zJK zjk) {
        Intrinsics.checkNotNullParameter(zjk, "");
        return C56396yDv.copydefault(FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(zjk.KWHzl()) + FfiConverterTypeNewDeviceAuthMethodKind.INSTANCE.mo9529allocationSizeI7RO_PI(zjk.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zJK zjk, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zjk, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterInt.INSTANCE.write(zjk.KWHzl(), byteBuffer);
        FfiConverterTypeNewDeviceAuthMethodKind.INSTANCE.write(zjk.AEQbTJ(), byteBuffer);
    }
}
