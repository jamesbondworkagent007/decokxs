package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zFW;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeMfaOtpState implements FfiConverterRustBuffer<zFW> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMfaOtpState INSTANCE = new FfiConverterTypeMfaOtpState();

    private FfiConverterTypeMfaOtpState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zFW lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zFW) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zFW liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zFW) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zFW zfw) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zfw);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zFW zfw) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zfw);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zFW read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new zFW(FfiConverterTypeSendCodeState.INSTANCE.read(byteBuffer), FfiConverterOptionalString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zFW zfw) {
        Intrinsics.checkNotNullParameter(zfw, "");
        return C56396yDv.copydefault(FfiConverterTypeSendCodeState.INSTANCE.mo9529allocationSizeI7RO_PI(zfw.KWHzl()) + FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(zfw.copydefault()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zFW zfw, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zfw, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeSendCodeState.INSTANCE.write(zfw.KWHzl(), byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(zfw.copydefault(), byteBuffer);
    }
}
