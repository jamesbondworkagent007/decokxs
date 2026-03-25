package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3686Aqd;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeBuySellDexOrderDetail implements FfiConverterRustBuffer<C3686Aqd> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBuySellDexOrderDetail INSTANCE = new FfiConverterTypeBuySellDexOrderDetail();

    private FfiConverterTypeBuySellDexOrderDetail() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3686Aqd lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3686Aqd) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3686Aqd liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3686Aqd) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3686Aqd c3686Aqd) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3686Aqd);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3686Aqd c3686Aqd) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3686Aqd);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3686Aqd read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C3686Aqd(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterOptionalInt.INSTANCE.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3686Aqd c3686Aqd) {
        Intrinsics.checkNotNullParameter(c3686Aqd, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c3686Aqd.djBIcL()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3686Aqd.fetchVPNInfo())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3686Aqd.isConnected())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3686Aqd.DbNXlk())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3686Aqd.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3686Aqd.copydefault())) + FfiConverterOptionalInt.INSTANCE.mo9529allocationSizeI7RO_PI(c3686Aqd.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3686Aqd.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3686Aqd.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3686Aqd.AkhnZx())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3686Aqd.values())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3686Aqd.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3686Aqd.AhwBna())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3686Aqd.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3686Aqd.valueOf()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3686Aqd c3686Aqd, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3686Aqd, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c3686Aqd.djBIcL(), byteBuffer);
        ffiConverterString.write(c3686Aqd.fetchVPNInfo(), byteBuffer);
        ffiConverterString.write(c3686Aqd.isConnected(), byteBuffer);
        ffiConverterString.write(c3686Aqd.DbNXlk(), byteBuffer);
        ffiConverterString.write(c3686Aqd.KWHzl(), byteBuffer);
        ffiConverterString.write(c3686Aqd.copydefault(), byteBuffer);
        FfiConverterOptionalInt.INSTANCE.write(c3686Aqd.OLrzqt(), byteBuffer);
        ffiConverterString.write(c3686Aqd.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c3686Aqd.EZpvd(), byteBuffer);
        ffiConverterString.write(c3686Aqd.AkhnZx(), byteBuffer);
        ffiConverterString.write(c3686Aqd.values(), byteBuffer);
        ffiConverterString.write(c3686Aqd.AYXKKw(), byteBuffer);
        ffiConverterString.write(c3686Aqd.AhwBna(), byteBuffer);
        ffiConverterString.write(c3686Aqd.gEmmrt(), byteBuffer);
        ffiConverterString.write(c3686Aqd.valueOf(), byteBuffer);
    }
}
