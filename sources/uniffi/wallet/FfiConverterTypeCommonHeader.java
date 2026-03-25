package uniffi.wallet;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BCr;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.wallet.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeCommonHeader implements FfiConverterRustBuffer<BCr> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCommonHeader INSTANCE = new FfiConverterTypeCommonHeader();

    private FfiConverterTypeCommonHeader() {
    }

    @Override // uniffi.wallet.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BCr lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BCr) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BCr liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BCr) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BCr bCr) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bCr);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BCr bCr) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bCr);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BCr read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new BCr(FfiConverterMapStringString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BCr bCr) {
        Intrinsics.checkNotNullParameter(bCr, "");
        return FfiConverterMapStringString.INSTANCE.mo9529allocationSizeI7RO_PI(bCr.AEQbTJ());
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BCr bCr, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bCr, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterMapStringString.INSTANCE.write(bCr.AEQbTJ(), byteBuffer);
    }
}
