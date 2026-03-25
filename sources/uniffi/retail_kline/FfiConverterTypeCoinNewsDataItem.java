package uniffi.retail_kline;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C4525Bhh;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_kline.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeCoinNewsDataItem implements FfiConverterRustBuffer<C4525Bhh> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoinNewsDataItem INSTANCE = new FfiConverterTypeCoinNewsDataItem();

    private FfiConverterTypeCoinNewsDataItem() {
    }

    @Override // uniffi.retail_kline.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4525Bhh lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4525Bhh) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4525Bhh liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4525Bhh) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4525Bhh c4525Bhh) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4525Bhh);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4525Bhh c4525Bhh) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4525Bhh);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4525Bhh read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C4525Bhh(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterTypeAuthorInfo.INSTANCE.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterTypeMentionDetail.INSTANCE.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterSequenceString.INSTANCE.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4525Bhh c4525Bhh) {
        Intrinsics.checkNotNullParameter(c4525Bhh, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c4525Bhh.ejfBZ()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4525Bhh.isConnected())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4525Bhh.copydefault())) + FfiConverterTypeAuthorInfo.INSTANCE.mo9529allocationSizeI7RO_PI(c4525Bhh.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4525Bhh.AuCTel())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4525Bhh.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4525Bhh.AYXKKw())) + FfiConverterTypeMentionDetail.INSTANCE.mo9529allocationSizeI7RO_PI(c4525Bhh.AhwBna())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4525Bhh.AkhnZx())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4525Bhh.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4525Bhh.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4525Bhh.fIwbmz())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4525Bhh.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4525Bhh.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4525Bhh.values())) + FfiConverterSequenceString.INSTANCE.mo9529allocationSizeI7RO_PI((List) c4525Bhh.fetchVPNInfo())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4525Bhh.DbNXlk())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4525Bhh.fJNWhG())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4525Bhh.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4525Bhh c4525Bhh, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4525Bhh, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c4525Bhh.ejfBZ(), byteBuffer);
        ffiConverterString.write(c4525Bhh.isConnected(), byteBuffer);
        ffiConverterString.write(c4525Bhh.copydefault(), byteBuffer);
        FfiConverterTypeAuthorInfo.INSTANCE.write(c4525Bhh.OLrzqt(), byteBuffer);
        ffiConverterString.write(c4525Bhh.AuCTel(), byteBuffer);
        ffiConverterString.write(c4525Bhh.gEmmrt(), byteBuffer);
        ffiConverterString.write(c4525Bhh.AYXKKw(), byteBuffer);
        FfiConverterTypeMentionDetail.INSTANCE.write(c4525Bhh.AhwBna(), byteBuffer);
        ffiConverterString.write(c4525Bhh.AkhnZx(), byteBuffer);
        ffiConverterString.write(c4525Bhh.KWHzl(), byteBuffer);
        ffiConverterString.write(c4525Bhh.valueOf(), byteBuffer);
        ffiConverterString.write(c4525Bhh.fIwbmz(), byteBuffer);
        ffiConverterString.write(c4525Bhh.EZpvd(), byteBuffer);
        ffiConverterString.write(c4525Bhh.djBIcL(), byteBuffer);
        ffiConverterString.write(c4525Bhh.values(), byteBuffer);
        FfiConverterSequenceString.INSTANCE.write((List) c4525Bhh.fetchVPNInfo(), byteBuffer);
        ffiConverterString.write(c4525Bhh.DbNXlk(), byteBuffer);
        ffiConverterString.write(c4525Bhh.fJNWhG(), byteBuffer);
        ffiConverterString.write(c4525Bhh.AEQbTJ(), byteBuffer);
    }
}
