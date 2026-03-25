package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zKM;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeNewDeviceConfirmInteractorInput implements FfiConverterRustBuffer<zKM> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceConfirmInteractorInput INSTANCE = new FfiConverterTypeNewDeviceConfirmInteractorInput();

    private FfiConverterTypeNewDeviceConfirmInteractorInput() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zKM lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zKM) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zKM liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zKM) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zKM zkm) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zkm);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zKM zkm) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zkm);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zKM read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new zKM(FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterLong.INSTANCE.read(byteBuffer).longValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zKM zkm) {
        Intrinsics.checkNotNullParameter(zkm, "");
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(zkm.copydefault()) + FfiConverterLong.INSTANCE.m9537allocationSizeI7RO_PI(zkm.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zKM zkm, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zkm, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString.INSTANCE.write(zkm.copydefault(), byteBuffer);
        FfiConverterLong.INSTANCE.write(zkm.OLrzqt(), byteBuffer);
    }
}
