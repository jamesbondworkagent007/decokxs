package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zRL;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOkxPasskeyCrossDeviceVerifyState implements FfiConverterRustBuffer<zRL> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyCrossDeviceVerifyState INSTANCE = new FfiConverterTypeOkxPasskeyCrossDeviceVerifyState();

    private FfiConverterTypeOkxPasskeyCrossDeviceVerifyState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zRL lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zRL) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zRL liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zRL) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zRL zrl) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zrl);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zRL zrl) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zrl);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zRL read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        String str = FfiConverterString.INSTANCE.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new zRL(str, ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zRL zrl) {
        Intrinsics.checkNotNullParameter(zrl, "");
        long jMo9529allocationSizeI7RO_PI = FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(zrl.EZpvd());
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterBoolean.m9530allocationSizeI7RO_PI(zrl.copydefault())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(zrl.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zRL zrl, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zrl, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString.INSTANCE.write(zrl.EZpvd(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(zrl.copydefault(), byteBuffer);
        ffiConverterBoolean.write(zrl.AEQbTJ(), byteBuffer);
    }
}
