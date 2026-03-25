package uniffi.account;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C58738zNm;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceSingleOtpState implements FfiConverterRustBuffer<C58738zNm> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceSingleOtpState INSTANCE = new FfiConverterTypeNewDeviceSingleOtpState();

    private FfiConverterTypeNewDeviceSingleOtpState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C58738zNm lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C58738zNm) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58738zNm liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C58738zNm) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C58738zNm c58738zNm) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c58738zNm);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C58738zNm c58738zNm) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c58738zNm);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58738zNm read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C58738zNm(FfiConverterTypeOtpType.INSTANCE.read(byteBuffer), FfiConverterSequenceTypeOtpType.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C58738zNm c58738zNm) {
        Intrinsics.checkNotNullParameter(c58738zNm, "");
        return C56396yDv.copydefault(FfiConverterTypeOtpType.INSTANCE.mo9529allocationSizeI7RO_PI(c58738zNm.EZpvd()) + FfiConverterSequenceTypeOtpType.INSTANCE.mo9529allocationSizeI7RO_PI((List) c58738zNm.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C58738zNm c58738zNm, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c58738zNm, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeOtpType.INSTANCE.write(c58738zNm.EZpvd(), byteBuffer);
        FfiConverterSequenceTypeOtpType.INSTANCE.write((List) c58738zNm.KWHzl(), byteBuffer);
    }
}
