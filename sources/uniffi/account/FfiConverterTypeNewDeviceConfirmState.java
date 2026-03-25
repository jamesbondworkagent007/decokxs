package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zKL;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceConfirmState implements FfiConverterRustBuffer<zKL> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceConfirmState INSTANCE = new FfiConverterTypeNewDeviceConfirmState();

    private FfiConverterTypeNewDeviceConfirmState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zKL lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zKL) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zKL liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zKL) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zKL zkl) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zkl);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zKL zkl) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zkl);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zKL read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new zKL(FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterLong.INSTANCE.read(byteBuffer).longValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zKL zkl) {
        Intrinsics.checkNotNullParameter(zkl, "");
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(zkl.copydefault()) + FfiConverterLong.INSTANCE.m9537allocationSizeI7RO_PI(zkl.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zKL zkl, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zkl, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString.INSTANCE.write(zkl.copydefault(), byteBuffer);
        FfiConverterLong.INSTANCE.write(zkl.EZpvd(), byteBuffer);
    }
}
