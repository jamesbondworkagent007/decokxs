package uniffi.user;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BuY;
import o.C5007Bzd;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.user.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes14.dex */
public final class FfiConverterTypeCoreUserProfile implements FfiConverterRustBuffer<C5007Bzd> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoreUserProfile INSTANCE = new FfiConverterTypeCoreUserProfile();

    private FfiConverterTypeCoreUserProfile() {
    }

    @Override // uniffi.user.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C5007Bzd lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C5007Bzd) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C5007Bzd liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C5007Bzd) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C5007Bzd c5007Bzd) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c5007Bzd);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C5007Bzd c5007Bzd) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c5007Bzd);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C5007Bzd read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        String str = ffiConverterOptionalString.read(byteBuffer);
        String str2 = ffiConverterOptionalString.read(byteBuffer);
        String str3 = ffiConverterOptionalString.read(byteBuffer);
        String str4 = ffiConverterOptionalString.read(byteBuffer);
        String str5 = ffiConverterOptionalString.read(byteBuffer);
        String str6 = ffiConverterOptionalString.read(byteBuffer);
        Integer num = FfiConverterOptionalInt.INSTANCE.read(byteBuffer);
        String str7 = ffiConverterOptionalString.read(byteBuffer);
        FfiConverterOptionalBoolean ffiConverterOptionalBoolean = FfiConverterOptionalBoolean.INSTANCE;
        Boolean bool = ffiConverterOptionalBoolean.read(byteBuffer);
        Boolean bool2 = ffiConverterOptionalBoolean.read(byteBuffer);
        BuY buY = FfiConverterOptionalTypeAvatarInfo.INSTANCE.read(byteBuffer);
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        int iIntValue = ffiConverterInt.read(byteBuffer).intValue();
        int iIntValue2 = ffiConverterInt.read(byteBuffer).intValue();
        int iIntValue3 = ffiConverterInt.read(byteBuffer).intValue();
        int iIntValue4 = ffiConverterInt.read(byteBuffer).intValue();
        int iIntValue5 = ffiConverterInt.read(byteBuffer).intValue();
        int iIntValue6 = ffiConverterInt.read(byteBuffer).intValue();
        FfiConverterTypeReviewStatus ffiConverterTypeReviewStatus = FfiConverterTypeReviewStatus.INSTANCE;
        ReviewStatus reviewStatus = ffiConverterTypeReviewStatus.read(byteBuffer);
        ReviewStatus reviewStatus2 = ffiConverterTypeReviewStatus.read(byteBuffer);
        ReviewStatus reviewStatus3 = ffiConverterTypeReviewStatus.read(byteBuffer);
        ReviewStatus reviewStatus4 = ffiConverterTypeReviewStatus.read(byteBuffer);
        ReviewStatus reviewStatus5 = ffiConverterTypeReviewStatus.read(byteBuffer);
        String str8 = ffiConverterOptionalString.read(byteBuffer);
        boolean zBooleanValue = FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue();
        String str9 = ffiConverterOptionalString.read(byteBuffer);
        FfiConverterTypeBioBackgroundReviewStatus ffiConverterTypeBioBackgroundReviewStatus = FfiConverterTypeBioBackgroundReviewStatus.INSTANCE;
        return new C5007Bzd(str, str2, str3, str4, str5, str6, num, str7, bool, bool2, buY, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, reviewStatus, reviewStatus2, reviewStatus3, reviewStatus4, reviewStatus5, str8, zBooleanValue, str9, ffiConverterTypeBioBackgroundReviewStatus.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterTypeBioBackgroundReviewStatus.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C5007Bzd c5007Bzd) {
        Intrinsics.checkNotNullParameter(c5007Bzd, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c5007Bzd.OLrzqt()) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c5007Bzd.fIwbmz())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c5007Bzd.fARcdN())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c5007Bzd.gEmmrt())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c5007Bzd.getNewProxyInstance())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c5007Bzd.isConnected())) + FfiConverterOptionalInt.INSTANCE.mo9529allocationSizeI7RO_PI(c5007Bzd.getFieldNames())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c5007Bzd.AuCTelauCTel()));
        FfiConverterOptionalBoolean ffiConverterOptionalBoolean = FfiConverterOptionalBoolean.INSTANCE;
        long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterOptionalBoolean.mo9529allocationSizeI7RO_PI(c5007Bzd.AYXKKw())) + ffiConverterOptionalBoolean.mo9529allocationSizeI7RO_PI(c5007Bzd.zsXlph())) + FfiConverterOptionalTypeAvatarInfo.INSTANCE.mo9529allocationSizeI7RO_PI(c5007Bzd.EZpvd()));
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        long jCopydefault3 = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 + ffiConverterInt.m9536allocationSizeI7RO_PI(c5007Bzd.ejfBZ())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c5007Bzd.values())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c5007Bzd.iwGUEr())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c5007Bzd.fJNWhG())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c5007Bzd.hDKMBd())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c5007Bzd.DbNXlk()));
        FfiConverterTypeReviewStatus ffiConverterTypeReviewStatus = FfiConverterTypeReviewStatus.INSTANCE;
        long jCopydefault4 = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault3 + ffiConverterTypeReviewStatus.mo9529allocationSizeI7RO_PI(c5007Bzd.copydefault())) + ffiConverterTypeReviewStatus.mo9529allocationSizeI7RO_PI(c5007Bzd.AuCTel())) + ffiConverterTypeReviewStatus.mo9529allocationSizeI7RO_PI(c5007Bzd.fetchVPNInfo())) + ffiConverterTypeReviewStatus.mo9529allocationSizeI7RO_PI(c5007Bzd.uzCIH())) + ffiConverterTypeReviewStatus.mo9529allocationSizeI7RO_PI(c5007Bzd.AkhnZx())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c5007Bzd.AEQbTJ())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c5007Bzd.wlaJM())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c5007Bzd.valueOf()));
        FfiConverterTypeBioBackgroundReviewStatus ffiConverterTypeBioBackgroundReviewStatus = FfiConverterTypeBioBackgroundReviewStatus.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault4 + ffiConverterTypeBioBackgroundReviewStatus.mo9529allocationSizeI7RO_PI(c5007Bzd.AhwBna())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c5007Bzd.KWHzl())) + ffiConverterTypeBioBackgroundReviewStatus.mo9529allocationSizeI7RO_PI(c5007Bzd.djBIcL()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C5007Bzd c5007Bzd, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c5007Bzd, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c5007Bzd.OLrzqt(), byteBuffer);
        ffiConverterOptionalString.write(c5007Bzd.fIwbmz(), byteBuffer);
        ffiConverterOptionalString.write(c5007Bzd.fARcdN(), byteBuffer);
        ffiConverterOptionalString.write(c5007Bzd.gEmmrt(), byteBuffer);
        ffiConverterOptionalString.write(c5007Bzd.getNewProxyInstance(), byteBuffer);
        ffiConverterOptionalString.write(c5007Bzd.isConnected(), byteBuffer);
        FfiConverterOptionalInt.INSTANCE.write(c5007Bzd.getFieldNames(), byteBuffer);
        ffiConverterOptionalString.write(c5007Bzd.AuCTelauCTel(), byteBuffer);
        FfiConverterOptionalBoolean ffiConverterOptionalBoolean = FfiConverterOptionalBoolean.INSTANCE;
        ffiConverterOptionalBoolean.write(c5007Bzd.AYXKKw(), byteBuffer);
        ffiConverterOptionalBoolean.write(c5007Bzd.zsXlph(), byteBuffer);
        FfiConverterOptionalTypeAvatarInfo.INSTANCE.write(c5007Bzd.EZpvd(), byteBuffer);
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        ffiConverterInt.write(c5007Bzd.ejfBZ(), byteBuffer);
        ffiConverterInt.write(c5007Bzd.values(), byteBuffer);
        ffiConverterInt.write(c5007Bzd.iwGUEr(), byteBuffer);
        ffiConverterInt.write(c5007Bzd.fJNWhG(), byteBuffer);
        ffiConverterInt.write(c5007Bzd.hDKMBd(), byteBuffer);
        ffiConverterInt.write(c5007Bzd.DbNXlk(), byteBuffer);
        FfiConverterTypeReviewStatus ffiConverterTypeReviewStatus = FfiConverterTypeReviewStatus.INSTANCE;
        ffiConverterTypeReviewStatus.write(c5007Bzd.copydefault(), byteBuffer);
        ffiConverterTypeReviewStatus.write(c5007Bzd.AuCTel(), byteBuffer);
        ffiConverterTypeReviewStatus.write(c5007Bzd.fetchVPNInfo(), byteBuffer);
        ffiConverterTypeReviewStatus.write(c5007Bzd.uzCIH(), byteBuffer);
        ffiConverterTypeReviewStatus.write(c5007Bzd.AkhnZx(), byteBuffer);
        ffiConverterOptionalString.write(c5007Bzd.AEQbTJ(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(c5007Bzd.wlaJM(), byteBuffer);
        ffiConverterOptionalString.write(c5007Bzd.valueOf(), byteBuffer);
        FfiConverterTypeBioBackgroundReviewStatus ffiConverterTypeBioBackgroundReviewStatus = FfiConverterTypeBioBackgroundReviewStatus.INSTANCE;
        ffiConverterTypeBioBackgroundReviewStatus.write(c5007Bzd.AhwBna(), byteBuffer);
        ffiConverterOptionalString.write(c5007Bzd.KWHzl(), byteBuffer);
        ffiConverterTypeBioBackgroundReviewStatus.write(c5007Bzd.djBIcL(), byteBuffer);
    }
}
