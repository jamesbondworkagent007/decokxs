package uniffi.retail_kline;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4534Bhq;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_kline.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeMarketEventReq implements FfiConverterRustBuffer<C4534Bhq> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMarketEventReq INSTANCE = new FfiConverterTypeMarketEventReq();

    private FfiConverterTypeMarketEventReq() {
    }

    @Override // uniffi.retail_kline.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4534Bhq lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4534Bhq) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4534Bhq liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4534Bhq) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4534Bhq c4534Bhq) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4534Bhq);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4534Bhq c4534Bhq) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4534Bhq);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4534Bhq read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        String str = FfiConverterString.INSTANCE.read(byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return new C4534Bhq(str, ffiConverterOptionalString.read(byteBuffer), FfiConverterOptionalInt.INSTANCE.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), FfiConverterOptionalSequenceTypeMarketEventsVo.INSTANCE.read(byteBuffer), FfiConverterInt.INSTANCE.read(byteBuffer).intValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4534Bhq c4534Bhq) {
        Intrinsics.checkNotNullParameter(c4534Bhq, "");
        long jMo9529allocationSizeI7RO_PI = FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c4534Bhq.EZpvd());
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4534Bhq.copydefault())) + FfiConverterOptionalInt.INSTANCE.mo9529allocationSizeI7RO_PI(c4534Bhq.OLrzqt())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4534Bhq.valueOf())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4534Bhq.AEQbTJ())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c4534Bhq.AYXKKw())) + FfiConverterOptionalSequenceTypeMarketEventsVo.INSTANCE.mo9529allocationSizeI7RO_PI(c4534Bhq.KWHzl())) + FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(c4534Bhq.AhwBna()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4534Bhq c4534Bhq, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4534Bhq, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString.INSTANCE.write(c4534Bhq.EZpvd(), byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c4534Bhq.copydefault(), byteBuffer);
        FfiConverterOptionalInt.INSTANCE.write(c4534Bhq.OLrzqt(), byteBuffer);
        ffiConverterOptionalString.write(c4534Bhq.valueOf(), byteBuffer);
        ffiConverterOptionalString.write(c4534Bhq.AEQbTJ(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(c4534Bhq.AYXKKw(), byteBuffer);
        FfiConverterOptionalSequenceTypeMarketEventsVo.INSTANCE.write(c4534Bhq.KWHzl(), byteBuffer);
        FfiConverterInt.INSTANCE.write(c4534Bhq.AhwBna(), byteBuffer);
    }
}
