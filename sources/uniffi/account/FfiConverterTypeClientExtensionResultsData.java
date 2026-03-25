package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C58384zAj;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeClientExtensionResultsData implements FfiConverterRustBuffer<C58384zAj> {
    public static final int $stable = 0;
    public static final FfiConverterTypeClientExtensionResultsData INSTANCE = new FfiConverterTypeClientExtensionResultsData();

    private FfiConverterTypeClientExtensionResultsData() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C58384zAj lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C58384zAj) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58384zAj liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C58384zAj) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C58384zAj c58384zAj) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c58384zAj);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C58384zAj c58384zAj) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c58384zAj);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58384zAj read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C58384zAj(FfiConverterOptionalTypeCredPropsData.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C58384zAj c58384zAj) {
        Intrinsics.checkNotNullParameter(c58384zAj, "");
        return FfiConverterOptionalTypeCredPropsData.INSTANCE.mo9529allocationSizeI7RO_PI(c58384zAj.KWHzl());
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C58384zAj c58384zAj, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c58384zAj, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalTypeCredPropsData.INSTANCE.write(c58384zAj.KWHzl(), byteBuffer);
    }
}
