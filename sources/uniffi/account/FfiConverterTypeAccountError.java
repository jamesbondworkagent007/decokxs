package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C60231zyo;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeAccountError implements FfiConverterRustBuffer<C60231zyo> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAccountError INSTANCE = new FfiConverterTypeAccountError();

    private FfiConverterTypeAccountError() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C60231zyo lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C60231zyo) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C60231zyo liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C60231zyo) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C60231zyo c60231zyo) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c60231zyo);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C60231zyo c60231zyo) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c60231zyo);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C60231zyo read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return new C60231zyo(ffiConverterInt.read(byteBuffer).intValue(), ffiConverterInt.read(byteBuffer).intValue(), FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterTypeAccountErrorType.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeResponse.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C60231zyo c60231zyo) {
        Intrinsics.checkNotNullParameter(c60231zyo, "");
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterInt.m9536allocationSizeI7RO_PI(c60231zyo.OLrzqt()) + ffiConverterInt.m9536allocationSizeI7RO_PI(c60231zyo.KWHzl())) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c60231zyo.copydefault())) + FfiConverterTypeAccountErrorType.INSTANCE.mo9529allocationSizeI7RO_PI(c60231zyo.AEQbTJ())) + FfiConverterOptionalTypeResponse.INSTANCE.mo9529allocationSizeI7RO_PI(c60231zyo.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C60231zyo c60231zyo, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c60231zyo, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        ffiConverterInt.write(c60231zyo.OLrzqt(), byteBuffer);
        ffiConverterInt.write(c60231zyo.KWHzl(), byteBuffer);
        FfiConverterString.INSTANCE.write(c60231zyo.copydefault(), byteBuffer);
        FfiConverterTypeAccountErrorType.INSTANCE.write(c60231zyo.AEQbTJ(), byteBuffer);
        FfiConverterOptionalTypeResponse.INSTANCE.write(c60231zyo.EZpvd(), byteBuffer);
    }
}
