package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C60294zzy;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeCaptchaForm implements FfiConverterRustBuffer<C60294zzy> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCaptchaForm INSTANCE = new FfiConverterTypeCaptchaForm();

    private FfiConverterTypeCaptchaForm() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C60294zzy lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C60294zzy) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C60294zzy liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C60294zzy) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C60294zzy c60294zzy) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c60294zzy);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C60294zzy c60294zzy) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c60294zzy);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C60294zzy read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C60294zzy(FfiConverterOptionalTypeGeetestForm.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeTcaptchaForm.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeReCaptchaForm.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C60294zzy c60294zzy) {
        Intrinsics.checkNotNullParameter(c60294zzy, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterOptionalTypeGeetestForm.INSTANCE.mo9529allocationSizeI7RO_PI(c60294zzy.KWHzl()) + FfiConverterOptionalTypeTcaptchaForm.INSTANCE.mo9529allocationSizeI7RO_PI(c60294zzy.AEQbTJ())) + FfiConverterOptionalTypeReCaptchaForm.INSTANCE.mo9529allocationSizeI7RO_PI(c60294zzy.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C60294zzy c60294zzy, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c60294zzy, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalTypeGeetestForm.INSTANCE.write(c60294zzy.KWHzl(), byteBuffer);
        FfiConverterOptionalTypeTcaptchaForm.INSTANCE.write(c60294zzy.AEQbTJ(), byteBuffer);
        FfiConverterOptionalTypeReCaptchaForm.INSTANCE.write(c60294zzy.OLrzqt(), byteBuffer);
    }
}
