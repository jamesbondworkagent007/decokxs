package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3794Asf;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeDexTradeLimitInfo implements FfiConverterRustBuffer<C3794Asf> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDexTradeLimitInfo INSTANCE = new FfiConverterTypeDexTradeLimitInfo();

    private FfiConverterTypeDexTradeLimitInfo() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3794Asf lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3794Asf) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3794Asf liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3794Asf) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3794Asf c3794Asf) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3794Asf);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3794Asf c3794Asf) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3794Asf);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3794Asf read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeLimitValue ffiConverterTypeLimitValue = FfiConverterTypeLimitValue.INSTANCE;
        return new C3794Asf(ffiConverterTypeLimitValue.read(byteBuffer), ffiConverterTypeLimitValue.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3794Asf c3794Asf) {
        Intrinsics.checkNotNullParameter(c3794Asf, "");
        FfiConverterTypeLimitValue ffiConverterTypeLimitValue = FfiConverterTypeLimitValue.INSTANCE;
        return C56396yDv.copydefault(ffiConverterTypeLimitValue.mo9529allocationSizeI7RO_PI(c3794Asf.copydefault()) + ffiConverterTypeLimitValue.mo9529allocationSizeI7RO_PI(c3794Asf.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3794Asf c3794Asf, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3794Asf, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeLimitValue ffiConverterTypeLimitValue = FfiConverterTypeLimitValue.INSTANCE;
        ffiConverterTypeLimitValue.write(c3794Asf.copydefault(), byteBuffer);
        ffiConverterTypeLimitValue.write(c3794Asf.AEQbTJ(), byteBuffer);
    }
}
