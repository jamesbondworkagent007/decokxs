package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3829AtN;
import o.C3871AuC;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeRecurringBuyPlanListState implements FfiConverterRustBuffer<C3871AuC> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanListState INSTANCE = new FfiConverterTypeRecurringBuyPlanListState();

    private FfiConverterTypeRecurringBuyPlanListState() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3871AuC lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3871AuC) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3871AuC liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3871AuC) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3871AuC c3871AuC) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3871AuC);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3871AuC c3871AuC) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3871AuC);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3871AuC read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        C3829AtN c3829AtN = FfiConverterTypeRecurringBuyPlanListContentState.INSTANCE.read(byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        String str = ffiConverterOptionalString.read(byteBuffer);
        String str2 = ffiConverterOptionalString.read(byteBuffer);
        String str3 = ffiConverterOptionalString.read(byteBuffer);
        int iIntValue = FfiConverterInt.INSTANCE.read(byteBuffer).intValue();
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new C3871AuC(c3829AtN, str, str2, str3, iIntValue, ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3871AuC c3871AuC) {
        Intrinsics.checkNotNullParameter(c3871AuC, "");
        long jMo9529allocationSizeI7RO_PI = FfiConverterTypeRecurringBuyPlanListContentState.INSTANCE.mo9529allocationSizeI7RO_PI(c3871AuC.copydefault());
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c3871AuC.AEQbTJ())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c3871AuC.OLrzqt())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c3871AuC.djBIcL())) + FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(c3871AuC.KWHzl()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3871AuC.EZpvd())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3871AuC.AhwBna()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3871AuC c3871AuC, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3871AuC, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeRecurringBuyPlanListContentState.INSTANCE.write(c3871AuC.copydefault(), byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c3871AuC.AEQbTJ(), byteBuffer);
        ffiConverterOptionalString.write(c3871AuC.OLrzqt(), byteBuffer);
        ffiConverterOptionalString.write(c3871AuC.djBIcL(), byteBuffer);
        FfiConverterInt.INSTANCE.write(c3871AuC.KWHzl(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c3871AuC.EZpvd(), byteBuffer);
        ffiConverterBoolean.write(c3871AuC.AhwBna(), byteBuffer);
    }
}
