package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3066Aet;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeRegistrationResult implements FfiConverterRustBuffer<C3066Aet> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegistrationResult INSTANCE = new FfiConverterTypeRegistrationResult();

    private FfiConverterTypeRegistrationResult() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3066Aet lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3066Aet) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3066Aet liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3066Aet) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3066Aet c3066Aet) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3066Aet);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3066Aet c3066Aet) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3066Aet);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3066Aet read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterByteArray ffiConverterByteArray = FfiConverterByteArray.INSTANCE;
        return new C3066Aet(ffiConverterByteArray.read(byteBuffer), ffiConverterByteArray.read(byteBuffer), ffiConverterByteArray.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3066Aet c3066Aet) {
        Intrinsics.checkNotNullParameter(c3066Aet, "");
        FfiConverterByteArray ffiConverterByteArray = FfiConverterByteArray.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterByteArray.mo9529allocationSizeI7RO_PI(c3066Aet.KWHzl()) + ffiConverterByteArray.mo9529allocationSizeI7RO_PI(c3066Aet.EZpvd())) + ffiConverterByteArray.mo9529allocationSizeI7RO_PI(c3066Aet.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3066Aet c3066Aet, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3066Aet, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterByteArray ffiConverterByteArray = FfiConverterByteArray.INSTANCE;
        ffiConverterByteArray.write(c3066Aet.KWHzl(), byteBuffer);
        ffiConverterByteArray.write(c3066Aet.EZpvd(), byteBuffer);
        ffiConverterByteArray.write(c3066Aet.AEQbTJ(), byteBuffer);
    }
}
