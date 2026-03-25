package uniffi.experiment;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2346AIf;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.experiment.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeApiResult implements FfiConverterRustBuffer<C2346AIf> {
    public static final int $stable = 0;
    public static final FfiConverterTypeApiResult INSTANCE = new FfiConverterTypeApiResult();

    private FfiConverterTypeApiResult() {
    }

    @Override // uniffi.experiment.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2346AIf lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2346AIf) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2346AIf liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2346AIf) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2346AIf c2346AIf) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2346AIf);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2346AIf c2346AIf) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2346AIf);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2346AIf read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C2346AIf(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), FfiConverterString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2346AIf c2346AIf) {
        Intrinsics.checkNotNullParameter(c2346AIf, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c2346AIf.copydefault()) + FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(c2346AIf.KWHzl())) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c2346AIf.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2346AIf c2346AIf, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2346AIf, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean.INSTANCE.write(c2346AIf.copydefault(), byteBuffer);
        FfiConverterInt.INSTANCE.write(c2346AIf.KWHzl(), byteBuffer);
        FfiConverterString.INSTANCE.write(c2346AIf.OLrzqt(), byteBuffer);
    }
}
