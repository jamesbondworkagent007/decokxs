package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C60207zyQ;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeAssertionResult implements FfiConverterRustBuffer<C60207zyQ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAssertionResult INSTANCE = new FfiConverterTypeAssertionResult();

    private FfiConverterTypeAssertionResult() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C60207zyQ lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C60207zyQ) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C60207zyQ liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C60207zyQ) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C60207zyQ c60207zyQ) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c60207zyQ);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C60207zyQ c60207zyQ) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c60207zyQ);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C60207zyQ read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterByteArray ffiConverterByteArray = FfiConverterByteArray.INSTANCE;
        return new C60207zyQ(ffiConverterByteArray.read(byteBuffer), ffiConverterByteArray.read(byteBuffer), ffiConverterByteArray.read(byteBuffer), ffiConverterByteArray.read(byteBuffer), FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterOptionalString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C60207zyQ c60207zyQ) {
        Intrinsics.checkNotNullParameter(c60207zyQ, "");
        FfiConverterByteArray ffiConverterByteArray = FfiConverterByteArray.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterByteArray.mo9529allocationSizeI7RO_PI(c60207zyQ.copydefault()) + ffiConverterByteArray.mo9529allocationSizeI7RO_PI(c60207zyQ.AEQbTJ())) + ffiConverterByteArray.mo9529allocationSizeI7RO_PI(c60207zyQ.KWHzl())) + ffiConverterByteArray.mo9529allocationSizeI7RO_PI(c60207zyQ.EZpvd())) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c60207zyQ.gEmmrt())) + FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(c60207zyQ.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C60207zyQ c60207zyQ, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c60207zyQ, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterByteArray ffiConverterByteArray = FfiConverterByteArray.INSTANCE;
        ffiConverterByteArray.write(c60207zyQ.copydefault(), byteBuffer);
        ffiConverterByteArray.write(c60207zyQ.AEQbTJ(), byteBuffer);
        ffiConverterByteArray.write(c60207zyQ.KWHzl(), byteBuffer);
        ffiConverterByteArray.write(c60207zyQ.EZpvd(), byteBuffer);
        FfiConverterString.INSTANCE.write(c60207zyQ.gEmmrt(), byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(c60207zyQ.OLrzqt(), byteBuffer);
    }
}
