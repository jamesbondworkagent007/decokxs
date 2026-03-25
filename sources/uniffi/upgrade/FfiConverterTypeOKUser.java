package uniffi.upgrade;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BtK;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.upgrade.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOKUser implements FfiConverterRustBuffer<BtK> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKUser INSTANCE = new FfiConverterTypeOKUser();

    private FfiConverterTypeOKUser() {
    }

    @Override // uniffi.upgrade.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BtK lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BtK) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BtK liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BtK) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BtK btK) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, btK);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BtK btK) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, btK);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BtK read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        long jLongValue = FfiConverterLong.INSTANCE.read(byteBuffer).longValue();
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new BtK(jLongValue, ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterUInt.INSTANCE.m9554readOGnWXxg(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), null);
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BtK btK) {
        Intrinsics.checkNotNullParameter(btK, "");
        long jM9537allocationSizeI7RO_PI = FfiConverterLong.INSTANCE.m9537allocationSizeI7RO_PI(btK.EZpvd());
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jM9537allocationSizeI7RO_PI + ffiConverterString.mo9529allocationSizeI7RO_PI(btK.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(btK.AEQbTJ())) + FfiConverterUInt.INSTANCE.m9549allocationSizej8A87jM(btK.copydefault())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(btK.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BtK btK, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(btK, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterLong.INSTANCE.write(btK.EZpvd(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(btK.OLrzqt(), byteBuffer);
        ffiConverterString.write(btK.AEQbTJ(), byteBuffer);
        FfiConverterUInt.INSTANCE.m9555writeqim9Vi0(btK.copydefault(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(btK.KWHzl(), byteBuffer);
    }
}
