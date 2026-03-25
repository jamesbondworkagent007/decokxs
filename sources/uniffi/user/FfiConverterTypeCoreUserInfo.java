package uniffi.user;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.BvK;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.user.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes14.dex */
public final class FfiConverterTypeCoreUserInfo implements FfiConverterRustBuffer<BvK> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoreUserInfo INSTANCE = new FfiConverterTypeCoreUserInfo();

    private FfiConverterTypeCoreUserInfo() {
    }

    @Override // uniffi.user.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BvK lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BvK) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BvK liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BvK) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BvK bvK) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bvK);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BvK bvK) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bvK);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BvK read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        String str = ffiConverterOptionalString.read(byteBuffer);
        String str2 = ffiConverterOptionalString.read(byteBuffer);
        String str3 = ffiConverterOptionalString.read(byteBuffer);
        String str4 = ffiConverterOptionalString.read(byteBuffer);
        String str5 = ffiConverterOptionalString.read(byteBuffer);
        String str6 = ffiConverterOptionalString.read(byteBuffer);
        String str7 = ffiConverterOptionalString.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        boolean zBooleanValue = ffiConverterBoolean.read(byteBuffer).booleanValue();
        boolean zBooleanValue2 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        String str8 = ffiConverterOptionalString.read(byteBuffer);
        FfiConverterOptionalLong ffiConverterOptionalLong = FfiConverterOptionalLong.INSTANCE;
        Long l = ffiConverterOptionalLong.read(byteBuffer);
        boolean zBooleanValue3 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        boolean zBooleanValue4 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        boolean zBooleanValue5 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return new BvK(str, str2, str3, str4, str5, str6, str7, zBooleanValue, zBooleanValue2, str8, l, zBooleanValue3, zBooleanValue4, zBooleanValue5, ffiConverterInt.read(byteBuffer).intValue(), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), FfiConverterOptionalTypeSubUserAuthModel.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeSubAccountFunction.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeLocalUserData.INSTANCE.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterInt.read(byteBuffer).intValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), FfiConverterTypeSecondVerifyType.INSTANCE.read(byteBuffer), ffiConverterInt.read(byteBuffer).intValue(), ffiConverterInt.read(byteBuffer).intValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterOptionalLong.read(byteBuffer), FfiConverterOptionalSequenceString.INSTANCE.read(byteBuffer), FfiConverterTypeDualAccountType.INSTANCE.read(byteBuffer), FfiConverterSequenceString.INSTANCE.read(byteBuffer), FfiConverterTypeRbacFeatures.INSTANCE.read(byteBuffer), FfiConverterTypeRmFeatures.INSTANCE.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), FfiConverterOptionalTypeBoundAccount.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BvK bvK) {
        Intrinsics.checkNotNullParameter(bvK, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bvK.zuBGHE()) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bvK.AhwBna())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bvK.iwGUEr())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bvK.AkhnZx())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bvK.KWHzl())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bvK.AuCTelauCTel())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bvK.zsXlph()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterBoolean.m9530allocationSizeI7RO_PI(bvK.QOLQEE())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(bvK.OcIXYQ())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bvK.fARcdN()));
        FfiConverterOptionalLong ffiConverterOptionalLong = FfiConverterOptionalLong.INSTANCE;
        long jCopydefault3 = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 + ffiConverterOptionalLong.mo9529allocationSizeI7RO_PI(bvK.wlaJM())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(bvK.getFieldNames())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(bvK.isConnected())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(bvK.values()));
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault3 + ffiConverterInt.m9536allocationSizeI7RO_PI(bvK.copydefault())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bvK.AEQbTJ())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bvK.EZpvd())) + FfiConverterOptionalTypeSubUserAuthModel.INSTANCE.mo9529allocationSizeI7RO_PI(bvK.AwvSrB())) + FfiConverterOptionalTypeSubAccountFunction.INSTANCE.mo9529allocationSizeI7RO_PI(bvK.AxsJAY())) + FfiConverterOptionalTypeLocalUserData.INSTANCE.mo9529allocationSizeI7RO_PI(bvK.AuCTel())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(bvK.OLrzqt())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(bvK.DTwDnp())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(bvK.QKVWgx())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(bvK.ORxRYg())) + ffiConverterInt.m9536allocationSizeI7RO_PI(bvK.ejfBZ())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(bvK.fIwbmz())) + FfiConverterTypeSecondVerifyType.INSTANCE.mo9529allocationSizeI7RO_PI(bvK.gEmmrt())) + ffiConverterInt.m9536allocationSizeI7RO_PI(bvK.sSMYrx())) + ffiConverterInt.m9536allocationSizeI7RO_PI(bvK.hDKMBd())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(bvK.zLjUOn())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(bvK.getNewProxyInstance())) + ffiConverterOptionalLong.mo9529allocationSizeI7RO_PI(bvK.fJNWhG())) + FfiConverterOptionalSequenceString.INSTANCE.mo9529allocationSizeI7RO_PI(bvK.DbNXlk())) + FfiConverterTypeDualAccountType.INSTANCE.mo9529allocationSizeI7RO_PI(bvK.AYXKKw())) + FfiConverterSequenceString.INSTANCE.mo9529allocationSizeI7RO_PI((List) bvK.fetchVPNInfo())) + FfiConverterTypeRbacFeatures.INSTANCE.mo9529allocationSizeI7RO_PI(bvK.uzCIH())) + FfiConverterTypeRmFeatures.INSTANCE.mo9529allocationSizeI7RO_PI(bvK.AubY())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(bvK.gHZMYf())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(bvK.valueOf())) + FfiConverterOptionalTypeBoundAccount.INSTANCE.mo9529allocationSizeI7RO_PI(bvK.djBIcL()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BvK bvK, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bvK, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(bvK.zuBGHE(), byteBuffer);
        ffiConverterOptionalString.write(bvK.AhwBna(), byteBuffer);
        ffiConverterOptionalString.write(bvK.iwGUEr(), byteBuffer);
        ffiConverterOptionalString.write(bvK.AkhnZx(), byteBuffer);
        ffiConverterOptionalString.write(bvK.KWHzl(), byteBuffer);
        ffiConverterOptionalString.write(bvK.AuCTelauCTel(), byteBuffer);
        ffiConverterOptionalString.write(bvK.zsXlph(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(bvK.QOLQEE(), byteBuffer);
        ffiConverterBoolean.write(bvK.OcIXYQ(), byteBuffer);
        ffiConverterOptionalString.write(bvK.fARcdN(), byteBuffer);
        FfiConverterOptionalLong ffiConverterOptionalLong = FfiConverterOptionalLong.INSTANCE;
        ffiConverterOptionalLong.write(bvK.wlaJM(), byteBuffer);
        ffiConverterBoolean.write(bvK.getFieldNames(), byteBuffer);
        ffiConverterBoolean.write(bvK.isConnected(), byteBuffer);
        ffiConverterBoolean.write(bvK.values(), byteBuffer);
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        ffiConverterInt.write(bvK.copydefault(), byteBuffer);
        ffiConverterOptionalString.write(bvK.AEQbTJ(), byteBuffer);
        ffiConverterOptionalString.write(bvK.EZpvd(), byteBuffer);
        FfiConverterOptionalTypeSubUserAuthModel.INSTANCE.write(bvK.AwvSrB(), byteBuffer);
        FfiConverterOptionalTypeSubAccountFunction.INSTANCE.write(bvK.AxsJAY(), byteBuffer);
        FfiConverterOptionalTypeLocalUserData.INSTANCE.write(bvK.AuCTel(), byteBuffer);
        ffiConverterOptionalString.write(bvK.OLrzqt(), byteBuffer);
        ffiConverterBoolean.write(bvK.DTwDnp(), byteBuffer);
        ffiConverterBoolean.write(bvK.QKVWgx(), byteBuffer);
        ffiConverterBoolean.write(bvK.ORxRYg(), byteBuffer);
        ffiConverterInt.write(bvK.ejfBZ(), byteBuffer);
        ffiConverterBoolean.write(bvK.fIwbmz(), byteBuffer);
        FfiConverterTypeSecondVerifyType.INSTANCE.write(bvK.gEmmrt(), byteBuffer);
        ffiConverterInt.write(bvK.sSMYrx(), byteBuffer);
        ffiConverterInt.write(bvK.hDKMBd(), byteBuffer);
        ffiConverterBoolean.write(bvK.zLjUOn(), byteBuffer);
        ffiConverterBoolean.write(bvK.getNewProxyInstance(), byteBuffer);
        ffiConverterOptionalLong.write(bvK.fJNWhG(), byteBuffer);
        FfiConverterOptionalSequenceString.INSTANCE.write(bvK.DbNXlk(), byteBuffer);
        FfiConverterTypeDualAccountType.INSTANCE.write(bvK.AYXKKw(), byteBuffer);
        FfiConverterSequenceString.INSTANCE.write((List) bvK.fetchVPNInfo(), byteBuffer);
        FfiConverterTypeRbacFeatures.INSTANCE.write(bvK.uzCIH(), byteBuffer);
        FfiConverterTypeRmFeatures.INSTANCE.write(bvK.AubY(), byteBuffer);
        ffiConverterBoolean.write(bvK.gHZMYf(), byteBuffer);
        ffiConverterBoolean.write(bvK.valueOf(), byteBuffer);
        FfiConverterOptionalTypeBoundAccount.INSTANCE.write(bvK.djBIcL(), byteBuffer);
    }
}
