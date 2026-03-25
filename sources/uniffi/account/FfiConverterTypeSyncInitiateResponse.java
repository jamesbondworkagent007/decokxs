package uniffi.account;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C3084AfK;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeSyncInitiateResponse implements FfiConverterRustBuffer<C3084AfK> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSyncInitiateResponse INSTANCE = new FfiConverterTypeSyncInitiateResponse();

    private FfiConverterTypeSyncInitiateResponse() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3084AfK lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3084AfK) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3084AfK liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3084AfK) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3084AfK c3084AfK) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3084AfK);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3084AfK c3084AfK) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3084AfK);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3084AfK read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C3084AfK(FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterOptionalString.INSTANCE.read(byteBuffer), FfiConverterSequenceTypeSyncDeviceInfo.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3084AfK c3084AfK) {
        Intrinsics.checkNotNullParameter(c3084AfK, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c3084AfK.AEQbTJ()) + FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(c3084AfK.EZpvd())) + FfiConverterSequenceTypeSyncDeviceInfo.INSTANCE.mo9529allocationSizeI7RO_PI((List) c3084AfK.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3084AfK c3084AfK, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3084AfK, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString.INSTANCE.write(c3084AfK.AEQbTJ(), byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(c3084AfK.EZpvd(), byteBuffer);
        FfiConverterSequenceTypeSyncDeviceInfo.INSTANCE.write((List) c3084AfK.OLrzqt(), byteBuffer);
    }
}
