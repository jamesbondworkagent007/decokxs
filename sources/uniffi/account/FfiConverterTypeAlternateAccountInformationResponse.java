package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C60209zyS;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeAlternateAccountInformationResponse implements FfiConverterRustBuffer<C60209zyS> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAlternateAccountInformationResponse INSTANCE = new FfiConverterTypeAlternateAccountInformationResponse();

    private FfiConverterTypeAlternateAccountInformationResponse() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C60209zyS lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C60209zyS) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C60209zyS liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C60209zyS) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C60209zyS c60209zyS) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c60209zyS);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C60209zyS c60209zyS) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c60209zyS);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C60209zyS read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        String str = ffiConverterOptionalString.read(byteBuffer);
        String str2 = ffiConverterOptionalString.read(byteBuffer);
        String str3 = ffiConverterOptionalString.read(byteBuffer);
        FfiConverterOptionalInt ffiConverterOptionalInt = FfiConverterOptionalInt.INSTANCE;
        return new C60209zyS(str, str2, str3, ffiConverterOptionalInt.read(byteBuffer), ffiConverterOptionalInt.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C60209zyS c60209zyS) {
        Intrinsics.checkNotNullParameter(c60209zyS, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c60209zyS.EZpvd()) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c60209zyS.OLrzqt())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c60209zyS.copydefault()));
        FfiConverterOptionalInt ffiConverterOptionalInt = FfiConverterOptionalInt.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterOptionalInt.mo9529allocationSizeI7RO_PI(c60209zyS.KWHzl())) + ffiConverterOptionalInt.mo9529allocationSizeI7RO_PI(c60209zyS.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C60209zyS c60209zyS, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c60209zyS, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c60209zyS.EZpvd(), byteBuffer);
        ffiConverterOptionalString.write(c60209zyS.OLrzqt(), byteBuffer);
        ffiConverterOptionalString.write(c60209zyS.copydefault(), byteBuffer);
        FfiConverterOptionalInt ffiConverterOptionalInt = FfiConverterOptionalInt.INSTANCE;
        ffiConverterOptionalInt.write(c60209zyS.KWHzl(), byteBuffer);
        ffiConverterOptionalInt.write(c60209zyS.AEQbTJ(), byteBuffer);
    }
}
