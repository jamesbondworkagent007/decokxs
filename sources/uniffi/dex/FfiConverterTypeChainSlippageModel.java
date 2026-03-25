package uniffi.dex;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C4151AzT;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeChainSlippageModel implements FfiConverterRustBuffer<C4151AzT> {
    public static final int $stable = 0;
    public static final FfiConverterTypeChainSlippageModel INSTANCE = new FfiConverterTypeChainSlippageModel();

    private FfiConverterTypeChainSlippageModel() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4151AzT lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4151AzT) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4151AzT liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4151AzT) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4151AzT c4151AzT) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4151AzT);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4151AzT c4151AzT) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4151AzT);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4151AzT read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C4151AzT(FfiConverterSequenceString.INSTANCE.read(byteBuffer), FfiConverterString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4151AzT c4151AzT) {
        Intrinsics.checkNotNullParameter(c4151AzT, "");
        return C56396yDv.copydefault(FfiConverterSequenceString.INSTANCE.mo9529allocationSizeI7RO_PI((List) c4151AzT.copydefault()) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c4151AzT.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4151AzT c4151AzT, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4151AzT, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterSequenceString.INSTANCE.write((List) c4151AzT.copydefault(), byteBuffer);
        FfiConverterString.INSTANCE.write(c4151AzT.AEQbTJ(), byteBuffer);
    }
}
