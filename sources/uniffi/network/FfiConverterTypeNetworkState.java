package uniffi.network;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4259BaI;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.network.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeNetworkState implements FfiConverterRustBuffer<C4259BaI> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNetworkState INSTANCE = new FfiConverterTypeNetworkState();

    private FfiConverterTypeNetworkState() {
    }

    @Override // uniffi.network.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4259BaI lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4259BaI) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4259BaI liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4259BaI) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4259BaI c4259BaI) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4259BaI);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4259BaI c4259BaI) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4259BaI);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4259BaI read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C4259BaI(FfiConverterTypeNetworkType.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4259BaI c4259BaI) {
        Intrinsics.checkNotNullParameter(c4259BaI, "");
        return FfiConverterTypeNetworkType.INSTANCE.mo9529allocationSizeI7RO_PI(c4259BaI.AEQbTJ());
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4259BaI c4259BaI, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4259BaI, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeNetworkType.INSTANCE.write(c4259BaI.AEQbTJ(), byteBuffer);
    }
}
