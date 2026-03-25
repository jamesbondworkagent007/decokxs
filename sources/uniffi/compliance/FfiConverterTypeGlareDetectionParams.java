package uniffi.compliance;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3987AwO;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.compliance.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeGlareDetectionParams implements FfiConverterRustBuffer<C3987AwO> {
    public static final int $stable = 0;
    public static final FfiConverterTypeGlareDetectionParams INSTANCE = new FfiConverterTypeGlareDetectionParams();

    private FfiConverterTypeGlareDetectionParams() {
    }

    @Override // uniffi.compliance.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3987AwO lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3987AwO) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3987AwO liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3987AwO) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3987AwO c3987AwO) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3987AwO);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3987AwO c3987AwO) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3987AwO);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3987AwO read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterUByte ffiConverterUByte = FfiConverterUByte.INSTANCE;
        byte bM9547readWa3L5BU = ffiConverterUByte.m9547readWa3L5BU(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        boolean zBooleanValue = ffiConverterBoolean.read(byteBuffer).booleanValue();
        FfiConverterUInt ffiConverterUInt = FfiConverterUInt.INSTANCE;
        int iM9554readOGnWXxg = ffiConverterUInt.m9554readOGnWXxg(byteBuffer);
        boolean zBooleanValue2 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        float fFloatValue = FfiConverterFloat.INSTANCE.read(byteBuffer).floatValue();
        boolean zBooleanValue3 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        byte bM9547readWa3L5BU2 = ffiConverterUByte.m9547readWa3L5BU(byteBuffer);
        byte bM9547readWa3L5BU3 = ffiConverterUByte.m9547readWa3L5BU(byteBuffer);
        boolean zBooleanValue4 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return new C3987AwO(bM9547readWa3L5BU, zBooleanValue, iM9554readOGnWXxg, zBooleanValue2, fFloatValue, zBooleanValue3, bM9547readWa3L5BU2, bM9547readWa3L5BU3, zBooleanValue4, ffiConverterInt.read(byteBuffer).intValue(), ffiConverterInt.read(byteBuffer).intValue(), ffiConverterUInt.m9554readOGnWXxg(byteBuffer), null);
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3987AwO c3987AwO) {
        Intrinsics.checkNotNullParameter(c3987AwO, "");
        FfiConverterUByte ffiConverterUByte = FfiConverterUByte.INSTANCE;
        long jM9542allocationSizeqRK8ubM = ffiConverterUByte.m9542allocationSizeqRK8ubM(c3987AwO.copydefault());
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(jM9542allocationSizeqRK8ubM + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3987AwO.EZpvd()));
        FfiConverterUInt ffiConverterUInt = FfiConverterUInt.INSTANCE;
        long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterUInt.m9549allocationSizej8A87jM(c3987AwO.AEQbTJ())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3987AwO.AYXKKw())) + FfiConverterFloat.INSTANCE.m9535allocationSizeI7RO_PI(c3987AwO.gEmmrt())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3987AwO.valueOf())) + ffiConverterUByte.m9542allocationSizeqRK8ubM(c3987AwO.AkhnZx())) + ffiConverterUByte.m9542allocationSizeqRK8ubM(c3987AwO.DbNXlk())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3987AwO.djBIcL()));
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 + ffiConverterInt.m9536allocationSizeI7RO_PI(c3987AwO.OLrzqt())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c3987AwO.KWHzl())) + ffiConverterUInt.m9549allocationSizej8A87jM(c3987AwO.AhwBna()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3987AwO c3987AwO, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3987AwO, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterUByte ffiConverterUByte = FfiConverterUByte.INSTANCE;
        ffiConverterUByte.m9548write0ky7B_Q(c3987AwO.copydefault(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c3987AwO.EZpvd(), byteBuffer);
        FfiConverterUInt ffiConverterUInt = FfiConverterUInt.INSTANCE;
        ffiConverterUInt.m9555writeqim9Vi0(c3987AwO.AEQbTJ(), byteBuffer);
        ffiConverterBoolean.write(c3987AwO.AYXKKw(), byteBuffer);
        FfiConverterFloat.INSTANCE.write(c3987AwO.gEmmrt(), byteBuffer);
        ffiConverterBoolean.write(c3987AwO.valueOf(), byteBuffer);
        ffiConverterUByte.m9548write0ky7B_Q(c3987AwO.AkhnZx(), byteBuffer);
        ffiConverterUByte.m9548write0ky7B_Q(c3987AwO.DbNXlk(), byteBuffer);
        ffiConverterBoolean.write(c3987AwO.djBIcL(), byteBuffer);
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        ffiConverterInt.write(c3987AwO.OLrzqt(), byteBuffer);
        ffiConverterInt.write(c3987AwO.KWHzl(), byteBuffer);
        ffiConverterUInt.m9555writeqim9Vi0(c3987AwO.AhwBna(), byteBuffer);
    }
}
