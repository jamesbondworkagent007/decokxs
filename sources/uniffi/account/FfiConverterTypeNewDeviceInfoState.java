package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C58687zLp;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceInfoState implements FfiConverterRustBuffer<C58687zLp> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceInfoState INSTANCE = new FfiConverterTypeNewDeviceInfoState();

    private FfiConverterTypeNewDeviceInfoState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C58687zLp lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C58687zLp) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58687zLp liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C58687zLp) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C58687zLp c58687zLp) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c58687zLp);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C58687zLp c58687zLp) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c58687zLp);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58687zLp read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C58687zLp(FfiConverterTypeDeviceVerifyInfo.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C58687zLp c58687zLp) {
        Intrinsics.checkNotNullParameter(c58687zLp, "");
        return FfiConverterTypeDeviceVerifyInfo.INSTANCE.mo9529allocationSizeI7RO_PI(c58687zLp.KWHzl());
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C58687zLp c58687zLp, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c58687zLp, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeDeviceVerifyInfo.INSTANCE.write(c58687zLp.KWHzl(), byteBuffer);
    }
}
