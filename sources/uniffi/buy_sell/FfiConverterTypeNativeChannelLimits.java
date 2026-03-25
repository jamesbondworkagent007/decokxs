package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3811Asw;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeNativeChannelLimits implements FfiConverterRustBuffer<C3811Asw> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNativeChannelLimits INSTANCE = new FfiConverterTypeNativeChannelLimits();

    private FfiConverterTypeNativeChannelLimits() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3811Asw lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3811Asw) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3811Asw liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3811Asw) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3811Asw c3811Asw) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3811Asw);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3811Asw c3811Asw) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3811Asw);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3811Asw read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeLimitValue ffiConverterTypeLimitValue = FfiConverterTypeLimitValue.INSTANCE;
        return new C3811Asw(ffiConverterTypeLimitValue.read(byteBuffer), ffiConverterTypeLimitValue.read(byteBuffer), ffiConverterTypeLimitValue.read(byteBuffer), ffiConverterTypeLimitValue.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3811Asw c3811Asw) {
        Intrinsics.checkNotNullParameter(c3811Asw, "");
        FfiConverterTypeLimitValue ffiConverterTypeLimitValue = FfiConverterTypeLimitValue.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterTypeLimitValue.mo9529allocationSizeI7RO_PI(c3811Asw.KWHzl()) + ffiConverterTypeLimitValue.mo9529allocationSizeI7RO_PI(c3811Asw.EZpvd())) + ffiConverterTypeLimitValue.mo9529allocationSizeI7RO_PI(c3811Asw.AEQbTJ())) + ffiConverterTypeLimitValue.mo9529allocationSizeI7RO_PI(c3811Asw.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3811Asw c3811Asw, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3811Asw, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeLimitValue ffiConverterTypeLimitValue = FfiConverterTypeLimitValue.INSTANCE;
        ffiConverterTypeLimitValue.write(c3811Asw.KWHzl(), byteBuffer);
        ffiConverterTypeLimitValue.write(c3811Asw.EZpvd(), byteBuffer);
        ffiConverterTypeLimitValue.write(c3811Asw.AEQbTJ(), byteBuffer);
        ffiConverterTypeLimitValue.write(c3811Asw.OLrzqt(), byteBuffer);
    }
}
