package uniffi.settings;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.BmI;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.settings.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeCurrencyListState implements FfiConverterRustBuffer<BmI> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCurrencyListState INSTANCE = new FfiConverterTypeCurrencyListState();

    private FfiConverterTypeCurrencyListState() {
    }

    @Override // uniffi.settings.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BmI lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BmI) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BmI liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BmI) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BmI bmI) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bmI);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BmI bmI) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bmI);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BmI read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterSequenceTypeSelectableCurrencyItem ffiConverterSequenceTypeSelectableCurrencyItem = FfiConverterSequenceTypeSelectableCurrencyItem.INSTANCE;
        return new BmI(ffiConverterSequenceTypeSelectableCurrencyItem.read(byteBuffer), FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), ffiConverterSequenceTypeSelectableCurrencyItem.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BmI bmI) {
        Intrinsics.checkNotNullParameter(bmI, "");
        FfiConverterSequenceTypeSelectableCurrencyItem ffiConverterSequenceTypeSelectableCurrencyItem = FfiConverterSequenceTypeSelectableCurrencyItem.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterSequenceTypeSelectableCurrencyItem.mo9529allocationSizeI7RO_PI((List) bmI.KWHzl()) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(bmI.EZpvd())) + FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(bmI.AEQbTJ())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(bmI.copydefault())) + ffiConverterSequenceTypeSelectableCurrencyItem.mo9529allocationSizeI7RO_PI((List) bmI.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BmI bmI, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bmI, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterSequenceTypeSelectableCurrencyItem ffiConverterSequenceTypeSelectableCurrencyItem = FfiConverterSequenceTypeSelectableCurrencyItem.INSTANCE;
        ffiConverterSequenceTypeSelectableCurrencyItem.write((List) bmI.KWHzl(), byteBuffer);
        FfiConverterString.INSTANCE.write(bmI.EZpvd(), byteBuffer);
        FfiConverterInt.INSTANCE.write(bmI.AEQbTJ(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(bmI.copydefault(), byteBuffer);
        ffiConverterSequenceTypeSelectableCurrencyItem.write((List) bmI.OLrzqt(), byteBuffer);
    }
}
