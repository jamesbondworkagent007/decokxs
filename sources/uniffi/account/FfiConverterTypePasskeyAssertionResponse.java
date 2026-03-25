package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C58953zVp;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypePasskeyAssertionResponse implements FfiConverterRustBuffer<C58953zVp> {
    public static final int $stable = 0;
    public static final FfiConverterTypePasskeyAssertionResponse INSTANCE = new FfiConverterTypePasskeyAssertionResponse();

    private FfiConverterTypePasskeyAssertionResponse() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C58953zVp lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C58953zVp) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58953zVp liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C58953zVp) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C58953zVp c58953zVp) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c58953zVp);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C58953zVp c58953zVp) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c58953zVp);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58953zVp read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C58953zVp(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C58953zVp c58953zVp) {
        Intrinsics.checkNotNullParameter(c58953zVp, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c58953zVp.EZpvd()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c58953zVp.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c58953zVp.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c58953zVp.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c58953zVp.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C58953zVp c58953zVp, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c58953zVp, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c58953zVp.EZpvd(), byteBuffer);
        ffiConverterString.write(c58953zVp.copydefault(), byteBuffer);
        ffiConverterString.write(c58953zVp.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c58953zVp.KWHzl(), byteBuffer);
        ffiConverterString.write(c58953zVp.OLrzqt(), byteBuffer);
    }
}
