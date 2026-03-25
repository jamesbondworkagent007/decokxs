package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3817AtB;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRecurringBuyPlanDetailPaymentMethod implements FfiConverterRustBuffer<C3817AtB> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanDetailPaymentMethod INSTANCE = new FfiConverterTypeRecurringBuyPlanDetailPaymentMethod();

    private FfiConverterTypeRecurringBuyPlanDetailPaymentMethod() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3817AtB lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3817AtB) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3817AtB liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3817AtB) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3817AtB c3817AtB) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3817AtB);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3817AtB c3817AtB) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3817AtB);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3817AtB read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        String str3 = ffiConverterString.read(byteBuffer);
        String str4 = ffiConverterString.read(byteBuffer);
        String str5 = ffiConverterString.read(byteBuffer);
        String str6 = ffiConverterString.read(byteBuffer);
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return new C3817AtB(str, str2, str3, str4, str5, str6, ffiConverterInt.read(byteBuffer).intValue(), ffiConverterInt.read(byteBuffer).intValue(), ffiConverterInt.read(byteBuffer).intValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3817AtB c3817AtB) {
        Intrinsics.checkNotNullParameter(c3817AtB, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c3817AtB.AhwBna()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3817AtB.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3817AtB.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3817AtB.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3817AtB.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3817AtB.gEmmrt()));
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterInt.m9536allocationSizeI7RO_PI(c3817AtB.valueOf())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c3817AtB.OLrzqt())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c3817AtB.copydefault()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3817AtB c3817AtB, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3817AtB, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c3817AtB.AhwBna(), byteBuffer);
        ffiConverterString.write(c3817AtB.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c3817AtB.KWHzl(), byteBuffer);
        ffiConverterString.write(c3817AtB.EZpvd(), byteBuffer);
        ffiConverterString.write(c3817AtB.AYXKKw(), byteBuffer);
        ffiConverterString.write(c3817AtB.gEmmrt(), byteBuffer);
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        ffiConverterInt.write(c3817AtB.valueOf(), byteBuffer);
        ffiConverterInt.write(c3817AtB.OLrzqt(), byteBuffer);
        ffiConverterInt.write(c3817AtB.copydefault(), byteBuffer);
    }
}
