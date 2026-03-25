package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4181Azx;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeBaseChainInfo implements FfiConverterRustBuffer<C4181Azx> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBaseChainInfo INSTANCE = new FfiConverterTypeBaseChainInfo();

    private FfiConverterTypeBaseChainInfo() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4181Azx lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4181Azx) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4181Azx liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4181Azx) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4181Azx c4181Azx) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4181Azx);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4181Azx c4181Azx) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4181Azx);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4181Azx read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        String str3 = ffiConverterString.read(byteBuffer);
        String str4 = ffiConverterString.read(byteBuffer);
        String str5 = ffiConverterString.read(byteBuffer);
        String str6 = ffiConverterString.read(byteBuffer);
        String str7 = ffiConverterString.read(byteBuffer);
        String str8 = ffiConverterString.read(byteBuffer);
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        long jLongValue = ffiConverterLong.read(byteBuffer).longValue();
        long jLongValue2 = ffiConverterLong.read(byteBuffer).longValue();
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new C4181Azx(str, str2, str3, str4, str5, str6, str7, str8, jLongValue, jLongValue2, ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), FfiConverterOptionalTypeDefaultFromToTokenShowVO.INSTANCE.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterString.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterLong.read(byteBuffer).longValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4181Azx c4181Azx) {
        Intrinsics.checkNotNullParameter(c4181Azx, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c4181Azx.gEmmrt()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4181Azx.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4181Azx.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4181Azx.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4181Azx.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4181Azx.fIwbmz())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4181Azx.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4181Azx.djBIcL()));
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterLong.m9537allocationSizeI7RO_PI(c4181Azx.getFieldNames())) + ffiConverterLong.m9537allocationSizeI7RO_PI(c4181Azx.hDKMBd()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4181Azx.getNewProxyInstance())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4181Azx.iwGUEr())) + FfiConverterOptionalTypeDefaultFromToTokenShowVO.INSTANCE.mo9529allocationSizeI7RO_PI(c4181Azx.OLrzqt())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4181Azx.isConnected())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4181Azx.DbNXlk())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4181Azx.AuCTel())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4181Azx.fARcdN())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4181Azx.values())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4181Azx.fetchVPNInfo())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4181Azx.AhwBna())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4181Azx.ejfBZ())) + ffiConverterLong.m9537allocationSizeI7RO_PI(c4181Azx.AkhnZx())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4181Azx.fJNWhG())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4181Azx.valueOf()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4181Azx c4181Azx, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4181Azx, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c4181Azx.gEmmrt(), byteBuffer);
        ffiConverterString.write(c4181Azx.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c4181Azx.copydefault(), byteBuffer);
        ffiConverterString.write(c4181Azx.KWHzl(), byteBuffer);
        ffiConverterString.write(c4181Azx.EZpvd(), byteBuffer);
        ffiConverterString.write(c4181Azx.fIwbmz(), byteBuffer);
        ffiConverterString.write(c4181Azx.AYXKKw(), byteBuffer);
        ffiConverterString.write(c4181Azx.djBIcL(), byteBuffer);
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        ffiConverterLong.write(c4181Azx.getFieldNames(), byteBuffer);
        ffiConverterLong.write(c4181Azx.hDKMBd(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c4181Azx.getNewProxyInstance(), byteBuffer);
        ffiConverterBoolean.write(c4181Azx.iwGUEr(), byteBuffer);
        FfiConverterOptionalTypeDefaultFromToTokenShowVO.INSTANCE.write(c4181Azx.OLrzqt(), byteBuffer);
        ffiConverterBoolean.write(c4181Azx.isConnected(), byteBuffer);
        ffiConverterString.write(c4181Azx.DbNXlk(), byteBuffer);
        ffiConverterBoolean.write(c4181Azx.AuCTel(), byteBuffer);
        ffiConverterBoolean.write(c4181Azx.fARcdN(), byteBuffer);
        ffiConverterString.write(c4181Azx.values(), byteBuffer);
        ffiConverterString.write(c4181Azx.fetchVPNInfo(), byteBuffer);
        ffiConverterString.write(c4181Azx.AhwBna(), byteBuffer);
        ffiConverterBoolean.write(c4181Azx.ejfBZ(), byteBuffer);
        ffiConverterLong.write(c4181Azx.AkhnZx(), byteBuffer);
        ffiConverterBoolean.write(c4181Azx.fJNWhG(), byteBuffer);
        ffiConverterBoolean.write(c4181Azx.valueOf(), byteBuffer);
    }
}
