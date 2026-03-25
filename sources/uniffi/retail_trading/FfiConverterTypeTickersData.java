package uniffi.retail_trading;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BlB;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_trading.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeTickersData implements FfiConverterRustBuffer<BlB> {
    public static final int $stable = 0;
    public static final FfiConverterTypeTickersData INSTANCE = new FfiConverterTypeTickersData();

    private FfiConverterTypeTickersData() {
    }

    @Override // uniffi.retail_trading.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BlB lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BlB) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BlB liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BlB) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BlB blB) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, blB);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BlB blB) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, blB);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BlB read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        String str3 = ffiConverterString.read(byteBuffer);
        String str4 = ffiConverterString.read(byteBuffer);
        String str5 = ffiConverterString.read(byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return new BlB(str, str2, str3, str4, str5, ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BlB blB) {
        Intrinsics.checkNotNullParameter(blB, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(blB.AYXKKw()) + ffiConverterString.mo9529allocationSizeI7RO_PI(blB.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blB.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blB.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blB.AhwBna()));
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(blB.EZpvd())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(blB.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blB.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blB.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blB.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blB.AkhnZx())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blB.DbNXlk())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blB.fetchVPNInfo())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blB.isConnected())) + ffiConverterString.mo9529allocationSizeI7RO_PI(blB.values()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BlB blB, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(blB, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(blB.AYXKKw(), byteBuffer);
        ffiConverterString.write(blB.AEQbTJ(), byteBuffer);
        ffiConverterString.write(blB.copydefault(), byteBuffer);
        ffiConverterString.write(blB.valueOf(), byteBuffer);
        ffiConverterString.write(blB.AhwBna(), byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(blB.EZpvd(), byteBuffer);
        ffiConverterOptionalString.write(blB.OLrzqt(), byteBuffer);
        ffiConverterString.write(blB.djBIcL(), byteBuffer);
        ffiConverterString.write(blB.KWHzl(), byteBuffer);
        ffiConverterString.write(blB.gEmmrt(), byteBuffer);
        ffiConverterString.write(blB.AkhnZx(), byteBuffer);
        ffiConverterString.write(blB.DbNXlk(), byteBuffer);
        ffiConverterString.write(blB.fetchVPNInfo(), byteBuffer);
        ffiConverterString.write(blB.isConnected(), byteBuffer);
        ffiConverterString.write(blB.values(), byteBuffer);
    }
}
