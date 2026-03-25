package uniffi.network;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4408Bcz;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.network.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeWsArgPayload implements FfiConverterRustBuffer<C4408Bcz> {
    public static final int $stable = 0;
    public static final FfiConverterTypeWsArgPayload INSTANCE = new FfiConverterTypeWsArgPayload();

    private FfiConverterTypeWsArgPayload() {
    }

    @Override // uniffi.network.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4408Bcz lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4408Bcz) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4408Bcz liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4408Bcz) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4408Bcz c4408Bcz) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4408Bcz);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4408Bcz c4408Bcz) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4408Bcz);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4408Bcz read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C4408Bcz(FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterTypeWsSubscribeParams.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4408Bcz c4408Bcz) {
        Intrinsics.checkNotNullParameter(c4408Bcz, "");
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c4408Bcz.AEQbTJ()) + FfiConverterTypeWsSubscribeParams.INSTANCE.mo9529allocationSizeI7RO_PI(c4408Bcz.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4408Bcz c4408Bcz, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4408Bcz, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString.INSTANCE.write(c4408Bcz.AEQbTJ(), byteBuffer);
        FfiConverterTypeWsSubscribeParams.INSTANCE.write(c4408Bcz.EZpvd(), byteBuffer);
    }
}
