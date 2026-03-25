package uniffi.retail_trading;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BkP;
import o.C4627Blb;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_trading.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeQuotationOptionsItemVo implements FfiConverterRustBuffer<C4627Blb> {
    public static final int $stable = 0;
    public static final FfiConverterTypeQuotationOptionsItemVo INSTANCE = new FfiConverterTypeQuotationOptionsItemVo();

    private FfiConverterTypeQuotationOptionsItemVo() {
    }

    @Override // uniffi.retail_trading.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4627Blb lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4627Blb) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4627Blb liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4627Blb) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4627Blb c4627Blb) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4627Blb);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4627Blb c4627Blb) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4627Blb);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4627Blb read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        BkP bkP = FfiConverterTypeOptionInstrument.INSTANCE.read(byteBuffer);
        FfiConverterOptionalDouble ffiConverterOptionalDouble = FfiConverterOptionalDouble.INSTANCE;
        Double d = ffiConverterOptionalDouble.read(byteBuffer);
        OptionsDirection optionsDirection = FfiConverterTypeOptionsDirection.INSTANCE.read(byteBuffer);
        Double d2 = ffiConverterOptionalDouble.read(byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return new C4627Blb(bkP, d, optionsDirection, d2, ffiConverterOptionalString.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), ffiConverterOptionalString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4627Blb c4627Blb) {
        Intrinsics.checkNotNullParameter(c4627Blb, "");
        long jMo9529allocationSizeI7RO_PI = FfiConverterTypeOptionInstrument.INSTANCE.mo9529allocationSizeI7RO_PI(c4627Blb.copydefault());
        FfiConverterOptionalDouble ffiConverterOptionalDouble = FfiConverterOptionalDouble.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterOptionalDouble.mo9529allocationSizeI7RO_PI(c4627Blb.KWHzl())) + FfiConverterTypeOptionsDirection.INSTANCE.mo9529allocationSizeI7RO_PI(c4627Blb.EZpvd())) + ffiConverterOptionalDouble.mo9529allocationSizeI7RO_PI(c4627Blb.AEQbTJ()));
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4627Blb.gEmmrt())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c4627Blb.AhwBna())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4627Blb.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4627Blb c4627Blb, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4627Blb, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeOptionInstrument.INSTANCE.write(c4627Blb.copydefault(), byteBuffer);
        FfiConverterOptionalDouble ffiConverterOptionalDouble = FfiConverterOptionalDouble.INSTANCE;
        ffiConverterOptionalDouble.write(c4627Blb.KWHzl(), byteBuffer);
        FfiConverterTypeOptionsDirection.INSTANCE.write(c4627Blb.EZpvd(), byteBuffer);
        ffiConverterOptionalDouble.write(c4627Blb.AEQbTJ(), byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c4627Blb.gEmmrt(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(c4627Blb.AhwBna(), byteBuffer);
        ffiConverterOptionalString.write(c4627Blb.OLrzqt(), byteBuffer);
    }
}
