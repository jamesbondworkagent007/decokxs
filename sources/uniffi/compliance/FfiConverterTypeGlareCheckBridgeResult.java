package uniffi.compliance;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3985AwM;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.compliance.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeGlareCheckBridgeResult implements FfiConverterRustBuffer<C3985AwM> {
    public static final int $stable = 0;
    public static final FfiConverterTypeGlareCheckBridgeResult INSTANCE = new FfiConverterTypeGlareCheckBridgeResult();

    private FfiConverterTypeGlareCheckBridgeResult() {
    }

    @Override // uniffi.compliance.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3985AwM lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3985AwM) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3985AwM liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3985AwM) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3985AwM c3985AwM) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3985AwM);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3985AwM c3985AwM) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3985AwM);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3985AwM read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        boolean zBooleanValue = FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue();
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return new C3985AwM(zBooleanValue, ffiConverterInt.read(byteBuffer).intValue(), ffiConverterInt.read(byteBuffer).intValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3985AwM c3985AwM) {
        Intrinsics.checkNotNullParameter(c3985AwM, "");
        long jM9530allocationSizeI7RO_PI = FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c3985AwM.copydefault());
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(jM9530allocationSizeI7RO_PI + ffiConverterInt.m9536allocationSizeI7RO_PI(c3985AwM.EZpvd())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c3985AwM.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3985AwM c3985AwM, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3985AwM, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean.INSTANCE.write(c3985AwM.copydefault(), byteBuffer);
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        ffiConverterInt.write(c3985AwM.EZpvd(), byteBuffer);
        ffiConverterInt.write(c3985AwM.AEQbTJ(), byteBuffer);
    }
}
