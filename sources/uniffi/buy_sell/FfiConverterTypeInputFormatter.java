package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3795Asg;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeInputFormatter implements FfiConverterRustBuffer<C3795Asg> {
    public static final int $stable = 0;
    public static final FfiConverterTypeInputFormatter INSTANCE = new FfiConverterTypeInputFormatter();

    private FfiConverterTypeInputFormatter() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3795Asg lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3795Asg) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3795Asg liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3795Asg) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3795Asg c3795Asg) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3795Asg);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3795Asg c3795Asg) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3795Asg);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3795Asg read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        InputAmountType inputAmountType = FfiConverterTypeInputAmountType.INSTANCE.read(byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        String str3 = ffiConverterString.read(byteBuffer);
        FfiConverterUInt ffiConverterUInt = FfiConverterUInt.INSTANCE;
        return new C3795Asg(inputAmountType, str, str2, str3, ffiConverterUInt.m9554readOGnWXxg(byteBuffer), ffiConverterUInt.m9554readOGnWXxg(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), null);
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3795Asg c3795Asg) {
        Intrinsics.checkNotNullParameter(c3795Asg, "");
        long jMo9529allocationSizeI7RO_PI = FfiConverterTypeInputAmountType.INSTANCE.mo9529allocationSizeI7RO_PI(c3795Asg.KWHzl());
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterString.mo9529allocationSizeI7RO_PI(c3795Asg.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3795Asg.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3795Asg.AEQbTJ()));
        FfiConverterUInt ffiConverterUInt = FfiConverterUInt.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterUInt.m9549allocationSizej8A87jM(c3795Asg.copydefault())) + ffiConverterUInt.m9549allocationSizej8A87jM(c3795Asg.OLrzqt())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c3795Asg.AhwBna()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3795Asg c3795Asg, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3795Asg, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeInputAmountType.INSTANCE.write(c3795Asg.KWHzl(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c3795Asg.gEmmrt(), byteBuffer);
        ffiConverterString.write(c3795Asg.EZpvd(), byteBuffer);
        ffiConverterString.write(c3795Asg.AEQbTJ(), byteBuffer);
        FfiConverterUInt ffiConverterUInt = FfiConverterUInt.INSTANCE;
        ffiConverterUInt.m9555writeqim9Vi0(c3795Asg.copydefault(), byteBuffer);
        ffiConverterUInt.m9555writeqim9Vi0(c3795Asg.OLrzqt(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(c3795Asg.AhwBna(), byteBuffer);
    }
}
