package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.ABP;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeMarketChainBean implements FfiConverterRustBuffer<ABP> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMarketChainBean INSTANCE = new FfiConverterTypeMarketChainBean();

    private FfiConverterTypeMarketChainBean() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public ABP lift2(@NotNull RustBuffer.ByValue byValue) {
        return (ABP) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public ABP liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (ABP) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull ABP abp) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abp);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull ABP abp) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abp);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public ABP read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        String str3 = ffiConverterString.read(byteBuffer);
        String str4 = ffiConverterString.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        boolean zBooleanValue = ffiConverterBoolean.read(byteBuffer).booleanValue();
        String str5 = ffiConverterString.read(byteBuffer);
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return new ABP(str, str2, str3, str4, zBooleanValue, str5, ffiConverterInt.read(byteBuffer).intValue(), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterInt.read(byteBuffer).intValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull ABP abp) {
        Intrinsics.checkNotNullParameter(abp, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(abp.KWHzl()) + ffiConverterString.mo9529allocationSizeI7RO_PI(abp.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abp.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abp.OLrzqt()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterBoolean.m9530allocationSizeI7RO_PI(abp.AhwBna())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abp.djBIcL()));
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 + ffiConverterInt.m9536allocationSizeI7RO_PI(abp.fetchVPNInfo())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abp.DbNXlk())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abp.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abp.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abp.gEmmrt())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(abp.AYXKKw())) + ffiConverterInt.m9536allocationSizeI7RO_PI(abp.isConnected()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull ABP abp, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abp, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(abp.KWHzl(), byteBuffer);
        ffiConverterString.write(abp.copydefault(), byteBuffer);
        ffiConverterString.write(abp.AEQbTJ(), byteBuffer);
        ffiConverterString.write(abp.OLrzqt(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(abp.AhwBna(), byteBuffer);
        ffiConverterString.write(abp.djBIcL(), byteBuffer);
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        ffiConverterInt.write(abp.fetchVPNInfo(), byteBuffer);
        ffiConverterString.write(abp.DbNXlk(), byteBuffer);
        ffiConverterString.write(abp.EZpvd(), byteBuffer);
        ffiConverterString.write(abp.valueOf(), byteBuffer);
        ffiConverterString.write(abp.gEmmrt(), byteBuffer);
        ffiConverterBoolean.write(abp.AYXKKw(), byteBuffer);
        ffiConverterInt.write(abp.isConnected(), byteBuffer);
    }
}
