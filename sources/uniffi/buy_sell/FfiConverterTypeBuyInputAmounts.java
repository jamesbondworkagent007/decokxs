package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3611ApH;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeBuyInputAmounts implements FfiConverterRustBuffer<C3611ApH> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBuyInputAmounts INSTANCE = new FfiConverterTypeBuyInputAmounts();

    private FfiConverterTypeBuyInputAmounts() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3611ApH lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3611ApH) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3611ApH liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3611ApH) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3611ApH c3611ApH) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3611ApH);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3611ApH c3611ApH) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3611ApH);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3611ApH read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        return new C3611ApH(ffiConverterDouble.read(byteBuffer).doubleValue(), ffiConverterDouble.read(byteBuffer).doubleValue(), ffiConverterDouble.read(byteBuffer).doubleValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3611ApH c3611ApH) {
        Intrinsics.checkNotNullParameter(c3611ApH, "");
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterDouble.m9533allocationSizeI7RO_PI(c3611ApH.AEQbTJ()) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c3611ApH.copydefault())) + ffiConverterDouble.m9533allocationSizeI7RO_PI(c3611ApH.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3611ApH c3611ApH, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3611ApH, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterDouble ffiConverterDouble = FfiConverterDouble.INSTANCE;
        ffiConverterDouble.write(c3611ApH.AEQbTJ(), byteBuffer);
        ffiConverterDouble.write(c3611ApH.copydefault(), byteBuffer);
        ffiConverterDouble.write(c3611ApH.EZpvd(), byteBuffer);
    }
}
