package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4179Azv;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeBridgeApproveDataRequest implements FfiConverterRustBuffer<C4179Azv> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBridgeApproveDataRequest INSTANCE = new FfiConverterTypeBridgeApproveDataRequest();

    private FfiConverterTypeBridgeApproveDataRequest() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4179Azv lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4179Azv) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4179Azv liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4179Azv) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4179Azv c4179Azv) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4179Azv);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4179Azv c4179Azv) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4179Azv);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4179Azv read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C4179Azv(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterOptionalString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4179Azv c4179Azv) {
        Intrinsics.checkNotNullParameter(c4179Azv, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c4179Azv.KWHzl()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4179Azv.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4179Azv.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4179Azv.AEQbTJ())) + FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(c4179Azv.copydefault()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4179Azv c4179Azv, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4179Azv, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c4179Azv.KWHzl(), byteBuffer);
        ffiConverterString.write(c4179Azv.EZpvd(), byteBuffer);
        ffiConverterString.write(c4179Azv.OLrzqt(), byteBuffer);
        ffiConverterString.write(c4179Azv.AEQbTJ(), byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(c4179Azv.copydefault(), byteBuffer);
    }
}
