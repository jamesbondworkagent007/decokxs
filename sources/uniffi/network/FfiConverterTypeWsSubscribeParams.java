package uniffi.network;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4369BcM;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.network.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeWsSubscribeParams implements FfiConverterRustBuffer<C4369BcM> {
    public static final int $stable = 0;
    public static final FfiConverterTypeWsSubscribeParams INSTANCE = new FfiConverterTypeWsSubscribeParams();

    private FfiConverterTypeWsSubscribeParams() {
    }

    @Override // uniffi.network.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4369BcM lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4369BcM) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4369BcM liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4369BcM) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4369BcM c4369BcM) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4369BcM);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4369BcM c4369BcM) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4369BcM);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4369BcM read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C4369BcM(FfiConverterMapStringString.INSTANCE.read(byteBuffer), FfiConverterOptionalSequenceString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4369BcM c4369BcM) {
        Intrinsics.checkNotNullParameter(c4369BcM, "");
        return C56396yDv.copydefault(FfiConverterMapStringString.INSTANCE.mo9529allocationSizeI7RO_PI(c4369BcM.EZpvd()) + FfiConverterOptionalSequenceString.INSTANCE.mo9529allocationSizeI7RO_PI(c4369BcM.copydefault()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4369BcM c4369BcM, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4369BcM, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterMapStringString.INSTANCE.write(c4369BcM.EZpvd(), byteBuffer);
        FfiConverterOptionalSequenceString.INSTANCE.write(c4369BcM.copydefault(), byteBuffer);
    }
}
