package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C58395zAu;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeConsentResponse implements FfiConverterRustBuffer<C58395zAu> {
    public static final int $stable = 0;
    public static final FfiConverterTypeConsentResponse INSTANCE = new FfiConverterTypeConsentResponse();

    private FfiConverterTypeConsentResponse() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C58395zAu lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C58395zAu) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58395zAu liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C58395zAu) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C58395zAu c58395zAu) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c58395zAu);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C58395zAu c58395zAu) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c58395zAu);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58395zAu read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C58395zAu(FfiConverterOptionalString.INSTANCE.read(byteBuffer), FfiConverterOptionalSequenceTypeConsentItem.INSTANCE.read(byteBuffer), FfiConverterOptionalBoolean.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeSwitchSiteInfo.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C58395zAu c58395zAu) {
        Intrinsics.checkNotNullParameter(c58395zAu, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(c58395zAu.OLrzqt()) + FfiConverterOptionalSequenceTypeConsentItem.INSTANCE.mo9529allocationSizeI7RO_PI(c58395zAu.AEQbTJ())) + FfiConverterOptionalBoolean.INSTANCE.mo9529allocationSizeI7RO_PI(c58395zAu.KWHzl())) + FfiConverterOptionalTypeSwitchSiteInfo.INSTANCE.mo9529allocationSizeI7RO_PI(c58395zAu.copydefault()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C58395zAu c58395zAu, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c58395zAu, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString.INSTANCE.write(c58395zAu.OLrzqt(), byteBuffer);
        FfiConverterOptionalSequenceTypeConsentItem.INSTANCE.write(c58395zAu.AEQbTJ(), byteBuffer);
        FfiConverterOptionalBoolean.INSTANCE.write(c58395zAu.KWHzl(), byteBuffer);
        FfiConverterOptionalTypeSwitchSiteInfo.INSTANCE.write(c58395zAu.copydefault(), byteBuffer);
    }
}
