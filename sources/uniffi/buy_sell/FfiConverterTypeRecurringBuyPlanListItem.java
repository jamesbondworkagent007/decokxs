package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3903Auj;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRecurringBuyPlanListItem implements FfiConverterRustBuffer<C3903Auj> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanListItem INSTANCE = new FfiConverterTypeRecurringBuyPlanListItem();

    private FfiConverterTypeRecurringBuyPlanListItem() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3903Auj lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3903Auj) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3903Auj liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3903Auj) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3903Auj c3903Auj) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3903Auj);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3903Auj c3903Auj) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3903Auj);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3903Auj read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        String str3 = ffiConverterString.read(byteBuffer);
        String str4 = ffiConverterString.read(byteBuffer);
        String str5 = ffiConverterString.read(byteBuffer);
        String str6 = ffiConverterString.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new C3903Auj(str, str2, str3, str4, str5, str6, ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3903Auj c3903Auj) {
        Intrinsics.checkNotNullParameter(c3903Auj, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c3903Auj.gEmmrt()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3903Auj.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3903Auj.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3903Auj.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3903Auj.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3903Auj.EZpvd()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3903Auj.AhwBna())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3903Auj.djBIcL()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3903Auj c3903Auj, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3903Auj, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c3903Auj.gEmmrt(), byteBuffer);
        ffiConverterString.write(c3903Auj.KWHzl(), byteBuffer);
        ffiConverterString.write(c3903Auj.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c3903Auj.copydefault(), byteBuffer);
        ffiConverterString.write(c3903Auj.OLrzqt(), byteBuffer);
        ffiConverterString.write(c3903Auj.EZpvd(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c3903Auj.AhwBna(), byteBuffer);
        ffiConverterBoolean.write(c3903Auj.djBIcL(), byteBuffer);
    }
}
