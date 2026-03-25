package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3820AtE;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRecurringBuyPlanDetailPnlBlock implements FfiConverterRustBuffer<C3820AtE> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanDetailPnlBlock INSTANCE = new FfiConverterTypeRecurringBuyPlanDetailPnlBlock();

    private FfiConverterTypeRecurringBuyPlanDetailPnlBlock() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3820AtE lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3820AtE) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3820AtE liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3820AtE) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3820AtE c3820AtE) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3820AtE);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3820AtE c3820AtE) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3820AtE);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3820AtE read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        String str = FfiConverterString.INSTANCE.read(byteBuffer);
        Trend trend = FfiConverterTypeTrend.INSTANCE.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new C3820AtE(str, trend, ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3820AtE c3820AtE) {
        Intrinsics.checkNotNullParameter(c3820AtE, "");
        long jCopydefault = C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c3820AtE.EZpvd()) + FfiConverterTypeTrend.INSTANCE.mo9529allocationSizeI7RO_PI(c3820AtE.AEQbTJ()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3820AtE.KWHzl())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3820AtE.copydefault()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3820AtE c3820AtE, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3820AtE, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString.INSTANCE.write(c3820AtE.EZpvd(), byteBuffer);
        FfiConverterTypeTrend.INSTANCE.write(c3820AtE.AEQbTJ(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c3820AtE.KWHzl(), byteBuffer);
        ffiConverterBoolean.write(c3820AtE.copydefault(), byteBuffer);
    }
}
