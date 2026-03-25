package uniffi.user;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BvH;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.user.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes14.dex */
public final class FfiConverterTypeCoreUser implements FfiConverterRustBuffer<BvH> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoreUser INSTANCE = new FfiConverterTypeCoreUser();

    private FfiConverterTypeCoreUser() {
    }

    @Override // uniffi.user.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BvH lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BvH) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BvH liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BvH) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BvH bvH) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bvH);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BvH bvH) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bvH);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BvH read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new BvH(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterTypeTokenType.INSTANCE.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterOptionalString.INSTANCE.read(byteBuffer), FfiConverterOptionalBoolean.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeCoreUserInfo.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeCoreUserProfile.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeCorePersonalSetting.INSTANCE.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BvH bvH) {
        Intrinsics.checkNotNullParameter(bvH, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(bvH.valueOf()) + ffiConverterString.mo9529allocationSizeI7RO_PI(bvH.AhwBna())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bvH.djBIcL())) + FfiConverterTypeTokenType.INSTANCE.mo9529allocationSizeI7RO_PI(bvH.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bvH.KWHzl())) + FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(bvH.EZpvd())) + FfiConverterOptionalBoolean.INSTANCE.mo9529allocationSizeI7RO_PI(bvH.AkhnZx())) + FfiConverterOptionalTypeCoreUserInfo.INSTANCE.mo9529allocationSizeI7RO_PI(bvH.copydefault())) + FfiConverterOptionalTypeCoreUserProfile.INSTANCE.mo9529allocationSizeI7RO_PI(bvH.AEQbTJ())) + FfiConverterOptionalTypeCorePersonalSetting.INSTANCE.mo9529allocationSizeI7RO_PI(bvH.OLrzqt())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(bvH.gEmmrt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BvH bvH, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bvH, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(bvH.valueOf(), byteBuffer);
        ffiConverterString.write(bvH.AhwBna(), byteBuffer);
        ffiConverterString.write(bvH.djBIcL(), byteBuffer);
        FfiConverterTypeTokenType.INSTANCE.write(bvH.AYXKKw(), byteBuffer);
        ffiConverterString.write(bvH.KWHzl(), byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(bvH.EZpvd(), byteBuffer);
        FfiConverterOptionalBoolean.INSTANCE.write(bvH.AkhnZx(), byteBuffer);
        FfiConverterOptionalTypeCoreUserInfo.INSTANCE.write(bvH.copydefault(), byteBuffer);
        FfiConverterOptionalTypeCoreUserProfile.INSTANCE.write(bvH.AEQbTJ(), byteBuffer);
        FfiConverterOptionalTypeCorePersonalSetting.INSTANCE.write(bvH.OLrzqt(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(bvH.gEmmrt(), byteBuffer);
    }
}
