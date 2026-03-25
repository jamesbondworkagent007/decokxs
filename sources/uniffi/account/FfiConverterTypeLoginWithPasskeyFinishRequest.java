package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3063Aeq;
import o.C3254AiV;
import o.C56396yDv;
import o.zEA;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeLoginWithPasskeyFinishRequest implements FfiConverterRustBuffer<zEA> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLoginWithPasskeyFinishRequest INSTANCE = new FfiConverterTypeLoginWithPasskeyFinishRequest();

    private FfiConverterTypeLoginWithPasskeyFinishRequest() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zEA lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zEA) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zEA liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zEA) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zEA zea) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zea);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zEA zea) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zea);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zEA read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        C3063Aeq c3063Aeq = FfiConverterTypeResponseJson.INSTANCE.read(byteBuffer);
        C3254AiV c3254AiV = FfiConverterTypeVenus.INSTANCE.read(byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new zEA(c3063Aeq, c3254AiV, ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterOptionalString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zEA zea) {
        Intrinsics.checkNotNullParameter(zea, "");
        long jCopydefault = C56396yDv.copydefault(FfiConverterTypeResponseJson.INSTANCE.mo9529allocationSizeI7RO_PI(zea.EZpvd()) + FfiConverterTypeVenus.INSTANCE.mo9529allocationSizeI7RO_PI(zea.OLrzqt()));
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterString.mo9529allocationSizeI7RO_PI(zea.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(zea.AEQbTJ())) + FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(zea.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zEA zea, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zea, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeResponseJson.INSTANCE.write(zea.EZpvd(), byteBuffer);
        FfiConverterTypeVenus.INSTANCE.write(zea.OLrzqt(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(zea.copydefault(), byteBuffer);
        ffiConverterString.write(zea.AEQbTJ(), byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(zea.KWHzl(), byteBuffer);
    }
}
