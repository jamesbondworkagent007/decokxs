package uniffi.retail_kline;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4533Bhp;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_kline.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeMarketCapReq implements FfiConverterRustBuffer<C4533Bhp> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMarketCapReq INSTANCE = new FfiConverterTypeMarketCapReq();

    private FfiConverterTypeMarketCapReq() {
    }

    @Override // uniffi.retail_kline.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4533Bhp lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4533Bhp) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4533Bhp liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4533Bhp) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4533Bhp c4533Bhp) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4533Bhp);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4533Bhp c4533Bhp) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4533Bhp);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4533Bhp read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C4533Bhp(FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterULong.INSTANCE.m9561readI7RO_PI(byteBuffer), null);
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4533Bhp c4533Bhp) {
        Intrinsics.checkNotNullParameter(c4533Bhp, "");
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c4533Bhp.EZpvd()) + FfiConverterULong.INSTANCE.m9556allocationSizePUiSbYQ(c4533Bhp.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4533Bhp c4533Bhp, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4533Bhp, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString.INSTANCE.write(c4533Bhp.EZpvd(), byteBuffer);
        FfiConverterULong.INSTANCE.m9562write4PLdz1A(c4533Bhp.OLrzqt(), byteBuffer);
    }
}
