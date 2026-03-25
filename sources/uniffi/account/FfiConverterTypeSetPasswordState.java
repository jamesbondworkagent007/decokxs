package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3115Afp;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeSetPasswordState implements FfiConverterRustBuffer<C3115Afp> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSetPasswordState INSTANCE = new FfiConverterTypeSetPasswordState();

    private FfiConverterTypeSetPasswordState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3115Afp lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3115Afp) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3115Afp liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3115Afp) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3115Afp c3115Afp) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3115Afp);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3115Afp c3115Afp) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3115Afp);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3115Afp read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C3115Afp(FfiConverterTypeAccountNetworkState.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeTwoFactorCodeRequirement.INSTANCE.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), FfiConverterOptionalString.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeSocialAccountChannel.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3115Afp c3115Afp) {
        Intrinsics.checkNotNullParameter(c3115Afp, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterTypeAccountNetworkState.INSTANCE.mo9529allocationSizeI7RO_PI(c3115Afp.KWHzl()) + FfiConverterOptionalTypeTwoFactorCodeRequirement.INSTANCE.mo9529allocationSizeI7RO_PI(c3115Afp.OLrzqt())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c3115Afp.copydefault())) + FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(c3115Afp.EZpvd())) + FfiConverterOptionalTypeSocialAccountChannel.INSTANCE.mo9529allocationSizeI7RO_PI(c3115Afp.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3115Afp c3115Afp, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3115Afp, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeAccountNetworkState.INSTANCE.write(c3115Afp.KWHzl(), byteBuffer);
        FfiConverterOptionalTypeTwoFactorCodeRequirement.INSTANCE.write(c3115Afp.OLrzqt(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(c3115Afp.copydefault(), byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(c3115Afp.EZpvd(), byteBuffer);
        FfiConverterOptionalTypeSocialAccountChannel.INSTANCE.write(c3115Afp.AEQbTJ(), byteBuffer);
    }
}
