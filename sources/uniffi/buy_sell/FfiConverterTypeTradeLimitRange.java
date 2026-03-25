package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3971Avz;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeTradeLimitRange implements FfiConverterRustBuffer<C3971Avz> {
    public static final int $stable = 0;
    public static final FfiConverterTypeTradeLimitRange INSTANCE = new FfiConverterTypeTradeLimitRange();

    private FfiConverterTypeTradeLimitRange() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3971Avz lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3971Avz) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3971Avz liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3971Avz) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3971Avz c3971Avz) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3971Avz);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3971Avz c3971Avz) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3971Avz);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3971Avz read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeTradeLimitInfo ffiConverterTypeTradeLimitInfo = FfiConverterTypeTradeLimitInfo.INSTANCE;
        return new C3971Avz(ffiConverterTypeTradeLimitInfo.read(byteBuffer), ffiConverterTypeTradeLimitInfo.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3971Avz c3971Avz) {
        Intrinsics.checkNotNullParameter(c3971Avz, "");
        FfiConverterTypeTradeLimitInfo ffiConverterTypeTradeLimitInfo = FfiConverterTypeTradeLimitInfo.INSTANCE;
        return C56396yDv.copydefault(ffiConverterTypeTradeLimitInfo.mo9529allocationSizeI7RO_PI(c3971Avz.AEQbTJ()) + ffiConverterTypeTradeLimitInfo.mo9529allocationSizeI7RO_PI(c3971Avz.copydefault()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3971Avz c3971Avz, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3971Avz, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeTradeLimitInfo ffiConverterTypeTradeLimitInfo = FfiConverterTypeTradeLimitInfo.INSTANCE;
        ffiConverterTypeTradeLimitInfo.write(c3971Avz.AEQbTJ(), byteBuffer);
        ffiConverterTypeTradeLimitInfo.write(c3971Avz.copydefault(), byteBuffer);
    }
}
