package uniffi.feature_restriction;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C2436ALr;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.feature_restriction.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeFeatureRestrictionEventDiffSet implements FfiConverterRustBuffer<C2436ALr> {
    public static final int $stable = 0;
    public static final FfiConverterTypeFeatureRestrictionEventDiffSet INSTANCE = new FfiConverterTypeFeatureRestrictionEventDiffSet();

    private FfiConverterTypeFeatureRestrictionEventDiffSet() {
    }

    @Override // uniffi.feature_restriction.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2436ALr lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2436ALr) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2436ALr liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2436ALr) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2436ALr c2436ALr) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2436ALr);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2436ALr c2436ALr) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2436ALr);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2436ALr read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterSequenceString ffiConverterSequenceString = FfiConverterSequenceString.INSTANCE;
        List<String> list = ffiConverterSequenceString.read(byteBuffer);
        List<String> list2 = ffiConverterSequenceString.read(byteBuffer);
        List<String> list3 = ffiConverterSequenceString.read(byteBuffer);
        List<String> list4 = ffiConverterSequenceString.read(byteBuffer);
        List<String> list5 = ffiConverterSequenceString.read(byteBuffer);
        List<String> list6 = ffiConverterSequenceString.read(byteBuffer);
        List<String> list7 = ffiConverterSequenceString.read(byteBuffer);
        List<String> list8 = ffiConverterSequenceString.read(byteBuffer);
        List<String> list9 = ffiConverterSequenceString.read(byteBuffer);
        List<String> list10 = ffiConverterSequenceString.read(byteBuffer);
        List<String> list11 = ffiConverterSequenceString.read(byteBuffer);
        List<String> list12 = ffiConverterSequenceString.read(byteBuffer);
        List<String> list13 = ffiConverterSequenceString.read(byteBuffer);
        List<String> list14 = ffiConverterSequenceString.read(byteBuffer);
        List<String> list15 = ffiConverterSequenceString.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new C2436ALr(list, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, list14, list15, ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2436ALr c2436ALr) {
        Intrinsics.checkNotNullParameter(c2436ALr, "");
        FfiConverterSequenceString ffiConverterSequenceString = FfiConverterSequenceString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterSequenceString.mo9529allocationSizeI7RO_PI((List) c2436ALr.AEQbTJ()) + ffiConverterSequenceString.mo9529allocationSizeI7RO_PI((List) c2436ALr.OLrzqt())) + ffiConverterSequenceString.mo9529allocationSizeI7RO_PI((List) c2436ALr.copydefault())) + ffiConverterSequenceString.mo9529allocationSizeI7RO_PI((List) c2436ALr.valueOf())) + ffiConverterSequenceString.mo9529allocationSizeI7RO_PI((List) c2436ALr.DbNXlk())) + ffiConverterSequenceString.mo9529allocationSizeI7RO_PI((List) c2436ALr.gEmmrt())) + ffiConverterSequenceString.mo9529allocationSizeI7RO_PI((List) c2436ALr.fIwbmz())) + ffiConverterSequenceString.mo9529allocationSizeI7RO_PI((List) c2436ALr.isConnected())) + ffiConverterSequenceString.mo9529allocationSizeI7RO_PI((List) c2436ALr.fetchVPNInfo())) + ffiConverterSequenceString.mo9529allocationSizeI7RO_PI((List) c2436ALr.KWHzl())) + ffiConverterSequenceString.mo9529allocationSizeI7RO_PI((List) c2436ALr.AuCTel())) + ffiConverterSequenceString.mo9529allocationSizeI7RO_PI((List) c2436ALr.AYXKKw())) + ffiConverterSequenceString.mo9529allocationSizeI7RO_PI((List) c2436ALr.values())) + ffiConverterSequenceString.mo9529allocationSizeI7RO_PI((List) c2436ALr.EZpvd())) + ffiConverterSequenceString.mo9529allocationSizeI7RO_PI((List) c2436ALr.AhwBna()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c2436ALr.djBIcL())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c2436ALr.AkhnZx()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2436ALr c2436ALr, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2436ALr, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterSequenceString ffiConverterSequenceString = FfiConverterSequenceString.INSTANCE;
        ffiConverterSequenceString.write((List) c2436ALr.AEQbTJ(), byteBuffer);
        ffiConverterSequenceString.write((List) c2436ALr.OLrzqt(), byteBuffer);
        ffiConverterSequenceString.write((List) c2436ALr.copydefault(), byteBuffer);
        ffiConverterSequenceString.write((List) c2436ALr.valueOf(), byteBuffer);
        ffiConverterSequenceString.write((List) c2436ALr.DbNXlk(), byteBuffer);
        ffiConverterSequenceString.write((List) c2436ALr.gEmmrt(), byteBuffer);
        ffiConverterSequenceString.write((List) c2436ALr.fIwbmz(), byteBuffer);
        ffiConverterSequenceString.write((List) c2436ALr.isConnected(), byteBuffer);
        ffiConverterSequenceString.write((List) c2436ALr.fetchVPNInfo(), byteBuffer);
        ffiConverterSequenceString.write((List) c2436ALr.KWHzl(), byteBuffer);
        ffiConverterSequenceString.write((List) c2436ALr.AuCTel(), byteBuffer);
        ffiConverterSequenceString.write((List) c2436ALr.AYXKKw(), byteBuffer);
        ffiConverterSequenceString.write((List) c2436ALr.values(), byteBuffer);
        ffiConverterSequenceString.write((List) c2436ALr.EZpvd(), byteBuffer);
        ffiConverterSequenceString.write((List) c2436ALr.AhwBna(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c2436ALr.djBIcL(), byteBuffer);
        ffiConverterBoolean.write(c2436ALr.AkhnZx(), byteBuffer);
    }
}
