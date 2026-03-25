package uniffi.dex;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C2292AGd;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes20.dex */
public final class FfiConverterTypePresetRequestConfig implements FfiConverterRustBuffer<C2292AGd> {
    public static final int $stable = 0;
    public static final FfiConverterTypePresetRequestConfig INSTANCE = new FfiConverterTypePresetRequestConfig();

    private FfiConverterTypePresetRequestConfig() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2292AGd lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2292AGd) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2292AGd liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2292AGd) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2292AGd c2292AGd) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2292AGd);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2292AGd c2292AGd) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2292AGd);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2292AGd read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        String str3 = ffiConverterString.read(byteBuffer);
        double dDoubleValue = FfiConverterDouble.INSTANCE.read(byteBuffer).doubleValue();
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        boolean zBooleanValue = ffiConverterBoolean.read(byteBuffer).booleanValue();
        String str4 = ffiConverterString.read(byteBuffer);
        boolean zBooleanValue2 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        boolean zBooleanValue3 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        return new C2292AGd(str, str2, str3, dDoubleValue, zBooleanValue, str4, zBooleanValue2, zBooleanValue3, ffiConverterLong.read(byteBuffer).longValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterString.read(byteBuffer), FfiConverterSequenceTypeSubscribeProvider.INSTANCE.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue(), FfiConverterTypeNativeTokenInfo.INSTANCE.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterString.read(byteBuffer), FfiConverterSequenceTypePresetModel.INSTANCE.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterLong.read(byteBuffer).longValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2292AGd c2292AGd) {
        Intrinsics.checkNotNullParameter(c2292AGd, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c2292AGd.copydefault()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2292AGd.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2292AGd.fetchVPNInfo())) + FfiConverterDouble.INSTANCE.m9533allocationSizeI7RO_PI(c2292AGd.isConnected()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c2292AGd.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2292AGd.EZpvd())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c2292AGd.AuCTel())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c2292AGd.fJNWhG()));
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 + ffiConverterLong.m9537allocationSizeI7RO_PI(c2292AGd.OLrzqt())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c2292AGd.ejfBZ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2292AGd.AYXKKw())) + FfiConverterSequenceTypeSubscribeProvider.INSTANCE.mo9529allocationSizeI7RO_PI((List) c2292AGd.DbNXlk())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c2292AGd.AkhnZx())) + FfiConverterTypeNativeTokenInfo.INSTANCE.mo9529allocationSizeI7RO_PI(c2292AGd.AhwBna())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c2292AGd.fIwbmz())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2292AGd.valueOf())) + FfiConverterSequenceTypePresetModel.INSTANCE.mo9529allocationSizeI7RO_PI((List) c2292AGd.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2292AGd.djBIcL())) + ffiConverterLong.m9537allocationSizeI7RO_PI(c2292AGd.values()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2292AGd c2292AGd, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2292AGd, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c2292AGd.copydefault(), byteBuffer);
        ffiConverterString.write(c2292AGd.gEmmrt(), byteBuffer);
        ffiConverterString.write(c2292AGd.fetchVPNInfo(), byteBuffer);
        FfiConverterDouble.INSTANCE.write(c2292AGd.isConnected(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c2292AGd.KWHzl(), byteBuffer);
        ffiConverterString.write(c2292AGd.EZpvd(), byteBuffer);
        ffiConverterBoolean.write(c2292AGd.AuCTel(), byteBuffer);
        ffiConverterBoolean.write(c2292AGd.fJNWhG(), byteBuffer);
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        ffiConverterLong.write(c2292AGd.OLrzqt(), byteBuffer);
        ffiConverterBoolean.write(c2292AGd.ejfBZ(), byteBuffer);
        ffiConverterString.write(c2292AGd.AYXKKw(), byteBuffer);
        FfiConverterSequenceTypeSubscribeProvider.INSTANCE.write((List) c2292AGd.DbNXlk(), byteBuffer);
        ffiConverterBoolean.write(c2292AGd.AkhnZx(), byteBuffer);
        FfiConverterTypeNativeTokenInfo.INSTANCE.write(c2292AGd.AhwBna(), byteBuffer);
        ffiConverterBoolean.write(c2292AGd.fIwbmz(), byteBuffer);
        ffiConverterString.write(c2292AGd.valueOf(), byteBuffer);
        FfiConverterSequenceTypePresetModel.INSTANCE.write((List) c2292AGd.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c2292AGd.djBIcL(), byteBuffer);
        ffiConverterLong.write(c2292AGd.values(), byteBuffer);
    }
}
