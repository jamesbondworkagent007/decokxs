package uniffi.retail_kline;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C4522Bhe;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_kline.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeAuthorInfo implements FfiConverterRustBuffer<C4522Bhe> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAuthorInfo INSTANCE = new FfiConverterTypeAuthorInfo();

    private FfiConverterTypeAuthorInfo() {
    }

    @Override // uniffi.retail_kline.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4522Bhe lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4522Bhe) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4522Bhe liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4522Bhe) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4522Bhe c4522Bhe) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4522Bhe);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4522Bhe c4522Bhe) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4522Bhe);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4522Bhe read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        String str3 = ffiConverterString.read(byteBuffer);
        String str4 = ffiConverterString.read(byteBuffer);
        FfiConverterSequenceString ffiConverterSequenceString = FfiConverterSequenceString.INSTANCE;
        return new C4522Bhe(str, str2, str3, str4, ffiConverterSequenceString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterSequenceString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4522Bhe c4522Bhe) {
        Intrinsics.checkNotNullParameter(c4522Bhe, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c4522Bhe.KWHzl()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4522Bhe.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4522Bhe.AkhnZx())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4522Bhe.OLrzqt()));
        FfiConverterSequenceString ffiConverterSequenceString = FfiConverterSequenceString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterSequenceString.mo9529allocationSizeI7RO_PI((List) c4522Bhe.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4522Bhe.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4522Bhe.fetchVPNInfo())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4522Bhe.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4522Bhe.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4522Bhe.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4522Bhe.values())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4522Bhe.gEmmrt())) + ffiConverterSequenceString.mo9529allocationSizeI7RO_PI((List) c4522Bhe.AhwBna())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4522Bhe.isConnected()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4522Bhe c4522Bhe, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4522Bhe, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c4522Bhe.KWHzl(), byteBuffer);
        ffiConverterString.write(c4522Bhe.AYXKKw(), byteBuffer);
        ffiConverterString.write(c4522Bhe.AkhnZx(), byteBuffer);
        ffiConverterString.write(c4522Bhe.OLrzqt(), byteBuffer);
        FfiConverterSequenceString ffiConverterSequenceString = FfiConverterSequenceString.INSTANCE;
        ffiConverterSequenceString.write((List) c4522Bhe.copydefault(), byteBuffer);
        ffiConverterString.write(c4522Bhe.valueOf(), byteBuffer);
        ffiConverterString.write(c4522Bhe.fetchVPNInfo(), byteBuffer);
        ffiConverterString.write(c4522Bhe.EZpvd(), byteBuffer);
        ffiConverterString.write(c4522Bhe.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c4522Bhe.djBIcL(), byteBuffer);
        ffiConverterString.write(c4522Bhe.values(), byteBuffer);
        ffiConverterString.write(c4522Bhe.gEmmrt(), byteBuffer);
        ffiConverterSequenceString.write((List) c4522Bhe.AhwBna(), byteBuffer);
        ffiConverterString.write(c4522Bhe.isConnected(), byteBuffer);
    }
}
