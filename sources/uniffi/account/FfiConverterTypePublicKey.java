package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2829AaU;
import o.C56396yDv;
import o.C58404zBc;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypePublicKey implements FfiConverterRustBuffer<C2829AaU> {
    public static final int $stable = 0;
    public static final FfiConverterTypePublicKey INSTANCE = new FfiConverterTypePublicKey();

    private FfiConverterTypePublicKey() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2829AaU lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2829AaU) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2829AaU liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2829AaU) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2829AaU c2829AaU) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2829AaU);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2829AaU c2829AaU) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2829AaU);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2829AaU read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        C58404zBc c58404zBc = FfiConverterOptionalTypeExtensions.INSTANCE.read(byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return new C2829AaU(c58404zBc, ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), FfiConverterOptionalSequenceTypeCredentialDescriptor.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2829AaU c2829AaU) {
        Intrinsics.checkNotNullParameter(c2829AaU, "");
        long jMo9529allocationSizeI7RO_PI = FfiConverterOptionalTypeExtensions.INSTANCE.mo9529allocationSizeI7RO_PI(c2829AaU.copydefault());
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c2829AaU.KWHzl())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c2829AaU.OLrzqt())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c2829AaU.AEQbTJ())) + FfiConverterOptionalSequenceTypeCredentialDescriptor.INSTANCE.mo9529allocationSizeI7RO_PI(c2829AaU.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2829AaU c2829AaU, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2829AaU, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalTypeExtensions.INSTANCE.write(c2829AaU.copydefault(), byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c2829AaU.KWHzl(), byteBuffer);
        ffiConverterOptionalString.write(c2829AaU.OLrzqt(), byteBuffer);
        ffiConverterOptionalString.write(c2829AaU.AEQbTJ(), byteBuffer);
        FfiConverterOptionalSequenceTypeCredentialDescriptor.INSTANCE.write(c2829AaU.EZpvd(), byteBuffer);
    }
}
