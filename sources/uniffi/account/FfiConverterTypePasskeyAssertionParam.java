package uniffi.account;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C58954zVq;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypePasskeyAssertionParam implements FfiConverterRustBuffer<C58954zVq> {
    public static final int $stable = 0;
    public static final FfiConverterTypePasskeyAssertionParam INSTANCE = new FfiConverterTypePasskeyAssertionParam();

    private FfiConverterTypePasskeyAssertionParam() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C58954zVq lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C58954zVq) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58954zVq liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C58954zVq) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C58954zVq c58954zVq) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c58954zVq);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C58954zVq c58954zVq) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c58954zVq);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58954zVq read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C58954zVq(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterSequenceTypePasskeyAllowCredential.INSTANCE.read(byteBuffer), FfiConverterSequenceTypePasskeyAdditionalDataItem.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C58954zVq c58954zVq) {
        Intrinsics.checkNotNullParameter(c58954zVq, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c58954zVq.KWHzl()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c58954zVq.AEQbTJ())) + FfiConverterSequenceTypePasskeyAllowCredential.INSTANCE.mo9529allocationSizeI7RO_PI((List) c58954zVq.OLrzqt())) + FfiConverterSequenceTypePasskeyAdditionalDataItem.INSTANCE.mo9529allocationSizeI7RO_PI((List) c58954zVq.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C58954zVq c58954zVq, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c58954zVq, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c58954zVq.KWHzl(), byteBuffer);
        ffiConverterString.write(c58954zVq.AEQbTJ(), byteBuffer);
        FfiConverterSequenceTypePasskeyAllowCredential.INSTANCE.write((List) c58954zVq.OLrzqt(), byteBuffer);
        FfiConverterSequenceTypePasskeyAdditionalDataItem.INSTANCE.write((List) c58954zVq.EZpvd(), byteBuffer);
    }
}
