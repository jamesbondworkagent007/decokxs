package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3760Ary;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeBuySellOrderDetailState implements FfiConverterRustBuffer<C3760Ary> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBuySellOrderDetailState INSTANCE = new FfiConverterTypeBuySellOrderDetailState();

    private FfiConverterTypeBuySellOrderDetailState() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3760Ary lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3760Ary) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3760Ary liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3760Ary) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3760Ary c3760Ary) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3760Ary);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3760Ary c3760Ary) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3760Ary);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3760Ary read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C3760Ary(FfiConverterTypeBuySellOrderDetailContentState.INSTANCE.read(byteBuffer), FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeBuySellTradeType.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3760Ary c3760Ary) {
        Intrinsics.checkNotNullParameter(c3760Ary, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterTypeBuySellOrderDetailContentState.INSTANCE.mo9529allocationSizeI7RO_PI(c3760Ary.KWHzl()) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c3760Ary.EZpvd())) + FfiConverterOptionalTypeBuySellTradeType.INSTANCE.mo9529allocationSizeI7RO_PI(c3760Ary.copydefault()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3760Ary c3760Ary, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3760Ary, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeBuySellOrderDetailContentState.INSTANCE.write(c3760Ary.KWHzl(), byteBuffer);
        FfiConverterString.INSTANCE.write(c3760Ary.EZpvd(), byteBuffer);
        FfiConverterOptionalTypeBuySellTradeType.INSTANCE.write(c3760Ary.copydefault(), byteBuffer);
    }
}
