package uniffi.retail_trading;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.BjC;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_trading.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeDexChainGroupPo implements FfiConverterRustBuffer<BjC> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDexChainGroupPo INSTANCE = new FfiConverterTypeDexChainGroupPo();

    private FfiConverterTypeDexChainGroupPo() {
    }

    @Override // uniffi.retail_trading.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BjC lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BjC) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BjC liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BjC) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BjC bjC) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bjC);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BjC bjC) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bjC);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BjC read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        boolean zBooleanValue = FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue();
        String str3 = ffiConverterString.read(byteBuffer);
        String str4 = ffiConverterString.read(byteBuffer);
        String str5 = ffiConverterString.read(byteBuffer);
        String str6 = ffiConverterString.read(byteBuffer);
        String str7 = ffiConverterString.read(byteBuffer);
        String str8 = ffiConverterString.read(byteBuffer);
        String str9 = ffiConverterString.read(byteBuffer);
        FfiConverterSequenceString ffiConverterSequenceString = FfiConverterSequenceString.INSTANCE;
        return new BjC(str, str2, zBooleanValue, str3, str4, str5, str6, str7, str8, str9, ffiConverterSequenceString.read(byteBuffer), ffiConverterSequenceString.read(byteBuffer), ffiConverterSequenceString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterSequenceString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterSequenceString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BjC bjC) {
        Intrinsics.checkNotNullParameter(bjC, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(bjC.EZpvd()) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjC.copydefault())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(bjC.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjC.fIwbmz())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjC.fJNWhG())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjC.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjC.ejfBZ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjC.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjC.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjC.valueOf()));
        FfiConverterSequenceString ffiConverterSequenceString = FfiConverterSequenceString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterSequenceString.mo9529allocationSizeI7RO_PI((List) bjC.isConnected())) + ffiConverterSequenceString.mo9529allocationSizeI7RO_PI((List) bjC.DbNXlk())) + ffiConverterSequenceString.mo9529allocationSizeI7RO_PI((List) bjC.AkhnZx())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjC.AhwBna())) + ffiConverterSequenceString.mo9529allocationSizeI7RO_PI((List) bjC.values())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjC.AYXKKw())) + ffiConverterSequenceString.mo9529allocationSizeI7RO_PI((List) bjC.fetchVPNInfo())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bjC.djBIcL()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BjC bjC, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bjC, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(bjC.EZpvd(), byteBuffer);
        ffiConverterString.write(bjC.copydefault(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(bjC.KWHzl(), byteBuffer);
        ffiConverterString.write(bjC.fIwbmz(), byteBuffer);
        ffiConverterString.write(bjC.fJNWhG(), byteBuffer);
        ffiConverterString.write(bjC.gEmmrt(), byteBuffer);
        ffiConverterString.write(bjC.ejfBZ(), byteBuffer);
        ffiConverterString.write(bjC.AEQbTJ(), byteBuffer);
        ffiConverterString.write(bjC.OLrzqt(), byteBuffer);
        ffiConverterString.write(bjC.valueOf(), byteBuffer);
        FfiConverterSequenceString ffiConverterSequenceString = FfiConverterSequenceString.INSTANCE;
        ffiConverterSequenceString.write((List) bjC.isConnected(), byteBuffer);
        ffiConverterSequenceString.write((List) bjC.DbNXlk(), byteBuffer);
        ffiConverterSequenceString.write((List) bjC.AkhnZx(), byteBuffer);
        ffiConverterString.write(bjC.AhwBna(), byteBuffer);
        ffiConverterSequenceString.write((List) bjC.values(), byteBuffer);
        ffiConverterString.write(bjC.AYXKKw(), byteBuffer);
        ffiConverterSequenceString.write((List) bjC.fetchVPNInfo(), byteBuffer);
        ffiConverterString.write(bjC.djBIcL(), byteBuffer);
    }
}
