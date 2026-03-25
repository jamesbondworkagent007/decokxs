package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3812Asx;
import o.C3819AtD;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeRecurringBuyPlanDetailState implements FfiConverterRustBuffer<C3819AtD> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanDetailState INSTANCE = new FfiConverterTypeRecurringBuyPlanDetailState();

    private FfiConverterTypeRecurringBuyPlanDetailState() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3819AtD lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3819AtD) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3819AtD liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3819AtD) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3819AtD c3819AtD) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3819AtD);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3819AtD c3819AtD) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3819AtD);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3819AtD read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        C3812Asx c3812Asx = FfiConverterTypeRecurringBuyPlanDetailContentState.INSTANCE.read(byteBuffer);
        String str = FfiConverterString.INSTANCE.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new C3819AtD(c3812Asx, str, ffiConverterBoolean.read(byteBuffer).booleanValue(), FfiConverterOptionalString.INSTANCE.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue(), FfiConverterOptionalTypeRecurringBuyPlanDetailStatusChangeType.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3819AtD c3819AtD) {
        Intrinsics.checkNotNullParameter(c3819AtD, "");
        long jCopydefault = C56396yDv.copydefault(FfiConverterTypeRecurringBuyPlanDetailContentState.INSTANCE.mo9529allocationSizeI7RO_PI(c3819AtD.EZpvd()) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c3819AtD.OLrzqt()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3819AtD.copydefault())) + FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(c3819AtD.AEQbTJ())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3819AtD.gEmmrt())) + FfiConverterOptionalTypeRecurringBuyPlanDetailStatusChangeType.INSTANCE.mo9529allocationSizeI7RO_PI(c3819AtD.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3819AtD c3819AtD, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3819AtD, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeRecurringBuyPlanDetailContentState.INSTANCE.write(c3819AtD.EZpvd(), byteBuffer);
        FfiConverterString.INSTANCE.write(c3819AtD.OLrzqt(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c3819AtD.copydefault(), byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(c3819AtD.AEQbTJ(), byteBuffer);
        ffiConverterBoolean.write(c3819AtD.gEmmrt(), byteBuffer);
        FfiConverterOptionalTypeRecurringBuyPlanDetailStatusChangeType.INSTANCE.write(c3819AtD.KWHzl(), byteBuffer);
    }
}
