package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C58394zAt;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeConfirmNewPasswordState implements FfiConverterRustBuffer<C58394zAt> {
    public static final int $stable = 0;
    public static final FfiConverterTypeConfirmNewPasswordState INSTANCE = new FfiConverterTypeConfirmNewPasswordState();

    private FfiConverterTypeConfirmNewPasswordState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C58394zAt lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C58394zAt) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58394zAt liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C58394zAt) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C58394zAt c58394zAt) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c58394zAt);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C58394zAt c58394zAt) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c58394zAt);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58394zAt read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C58394zAt(FfiConverterTypeAccountNetworkState.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeChangePasswordResult.INSTANCE.read(byteBuffer), FfiConverterOptionalString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C58394zAt c58394zAt) {
        Intrinsics.checkNotNullParameter(c58394zAt, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterTypeAccountNetworkState.INSTANCE.mo9529allocationSizeI7RO_PI(c58394zAt.KWHzl()) + FfiConverterOptionalTypeChangePasswordResult.INSTANCE.mo9529allocationSizeI7RO_PI(c58394zAt.OLrzqt())) + FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(c58394zAt.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C58394zAt c58394zAt, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c58394zAt, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeAccountNetworkState.INSTANCE.write(c58394zAt.KWHzl(), byteBuffer);
        FfiConverterOptionalTypeChangePasswordResult.INSTANCE.write(c58394zAt.OLrzqt(), byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(c58394zAt.EZpvd(), byteBuffer);
    }
}
