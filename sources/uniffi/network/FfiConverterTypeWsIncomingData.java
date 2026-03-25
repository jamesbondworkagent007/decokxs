package uniffi.network;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4366BcJ;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.network.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeWsIncomingData implements FfiConverterRustBuffer<C4366BcJ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeWsIncomingData INSTANCE = new FfiConverterTypeWsIncomingData();

    private FfiConverterTypeWsIncomingData() {
    }

    @Override // uniffi.network.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4366BcJ lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4366BcJ) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4366BcJ liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4366BcJ) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4366BcJ c4366BcJ) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4366BcJ);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4366BcJ c4366BcJ) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4366BcJ);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4366BcJ read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C4366BcJ(FfiConverterOptionalMapStringString.INSTANCE.read(byteBuffer), FfiConverterString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4366BcJ c4366BcJ) {
        Intrinsics.checkNotNullParameter(c4366BcJ, "");
        return C56396yDv.copydefault(FfiConverterOptionalMapStringString.INSTANCE.mo9529allocationSizeI7RO_PI(c4366BcJ.copydefault()) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c4366BcJ.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4366BcJ c4366BcJ, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4366BcJ, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalMapStringString.INSTANCE.write(c4366BcJ.copydefault(), byteBuffer);
        FfiConverterString.INSTANCE.write(c4366BcJ.EZpvd(), byteBuffer);
    }
}
