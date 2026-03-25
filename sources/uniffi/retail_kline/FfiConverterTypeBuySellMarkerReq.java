package uniffi.retail_kline;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4524Bhg;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_kline.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeBuySellMarkerReq implements FfiConverterRustBuffer<C4524Bhg> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBuySellMarkerReq INSTANCE = new FfiConverterTypeBuySellMarkerReq();

    private FfiConverterTypeBuySellMarkerReq() {
    }

    @Override // uniffi.retail_kline.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4524Bhg lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4524Bhg) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4524Bhg liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4524Bhg) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4524Bhg c4524Bhg) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4524Bhg);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4524Bhg c4524Bhg) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4524Bhg);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4524Bhg read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        String str2 = ffiConverterOptionalString.read(byteBuffer);
        String str3 = ffiConverterOptionalString.read(byteBuffer);
        String str4 = ffiConverterOptionalString.read(byteBuffer);
        String str5 = ffiConverterString.read(byteBuffer);
        String str6 = ffiConverterString.read(byteBuffer);
        String str7 = ffiConverterString.read(byteBuffer);
        String str8 = ffiConverterString.read(byteBuffer);
        String str9 = ffiConverterString.read(byteBuffer);
        FfiConverterULong ffiConverterULong = FfiConverterULong.INSTANCE;
        return new C4524Bhg(str, str2, str3, str4, str5, str6, str7, str8, str9, ffiConverterULong.m9561readI7RO_PI(byteBuffer), ffiConverterULong.m9561readI7RO_PI(byteBuffer), null);
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4524Bhg c4524Bhg) {
        Intrinsics.checkNotNullParameter(c4524Bhg, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jMo9529allocationSizeI7RO_PI = ffiConverterString.mo9529allocationSizeI7RO_PI(c4524Bhg.OLrzqt());
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4524Bhg.copydefault())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4524Bhg.DbNXlk())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4524Bhg.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4524Bhg.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4524Bhg.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4524Bhg.AhwBna())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4524Bhg.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4524Bhg.valueOf()));
        FfiConverterULong ffiConverterULong = FfiConverterULong.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterULong.m9556allocationSizePUiSbYQ(c4524Bhg.djBIcL())) + ffiConverterULong.m9556allocationSizePUiSbYQ(c4524Bhg.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4524Bhg c4524Bhg, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4524Bhg, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c4524Bhg.OLrzqt(), byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c4524Bhg.copydefault(), byteBuffer);
        ffiConverterOptionalString.write(c4524Bhg.DbNXlk(), byteBuffer);
        ffiConverterOptionalString.write(c4524Bhg.EZpvd(), byteBuffer);
        ffiConverterString.write(c4524Bhg.AYXKKw(), byteBuffer);
        ffiConverterString.write(c4524Bhg.gEmmrt(), byteBuffer);
        ffiConverterString.write(c4524Bhg.AhwBna(), byteBuffer);
        ffiConverterString.write(c4524Bhg.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c4524Bhg.valueOf(), byteBuffer);
        FfiConverterULong ffiConverterULong = FfiConverterULong.INSTANCE;
        ffiConverterULong.m9562write4PLdz1A(c4524Bhg.djBIcL(), byteBuffer);
        ffiConverterULong.m9562write4PLdz1A(c4524Bhg.KWHzl(), byteBuffer);
    }
}
