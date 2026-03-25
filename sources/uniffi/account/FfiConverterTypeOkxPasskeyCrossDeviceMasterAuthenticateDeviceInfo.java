package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zNQ;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeOkxPasskeyCrossDeviceMasterAuthenticateDeviceInfo implements FfiConverterRustBuffer<zNQ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyCrossDeviceMasterAuthenticateDeviceInfo INSTANCE = new FfiConverterTypeOkxPasskeyCrossDeviceMasterAuthenticateDeviceInfo();

    private FfiConverterTypeOkxPasskeyCrossDeviceMasterAuthenticateDeviceInfo() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zNQ lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zNQ) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zNQ liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zNQ) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zNQ znq) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, znq);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zNQ znq) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, znq);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zNQ read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new zNQ(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zNQ znq) {
        Intrinsics.checkNotNullParameter(znq, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(znq.AhwBna()) + ffiConverterString.mo9529allocationSizeI7RO_PI(znq.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(znq.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(znq.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(znq.copydefault())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(znq.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zNQ znq, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(znq, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(znq.AhwBna(), byteBuffer);
        ffiConverterString.write(znq.AEQbTJ(), byteBuffer);
        ffiConverterString.write(znq.KWHzl(), byteBuffer);
        ffiConverterString.write(znq.OLrzqt(), byteBuffer);
        ffiConverterString.write(znq.copydefault(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(znq.EZpvd(), byteBuffer);
    }
}
