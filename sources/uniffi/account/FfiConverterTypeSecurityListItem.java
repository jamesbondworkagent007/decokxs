package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3038AeR;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeSecurityListItem implements FfiConverterRustBuffer<C3038AeR> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSecurityListItem INSTANCE = new FfiConverterTypeSecurityListItem();

    private FfiConverterTypeSecurityListItem() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3038AeR lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3038AeR) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3038AeR liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3038AeR) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3038AeR c3038AeR) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3038AeR);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3038AeR c3038AeR) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3038AeR);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3038AeR read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        SecurityType securityType = FfiConverterTypeSecurityType.INSTANCE.read(byteBuffer);
        FfiConverterTypeLocalString ffiConverterTypeLocalString = FfiConverterTypeLocalString.INSTANCE;
        return new C3038AeR(securityType, ffiConverterTypeLocalString.read(byteBuffer), ffiConverterTypeLocalString.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3038AeR c3038AeR) {
        Intrinsics.checkNotNullParameter(c3038AeR, "");
        long jMo9529allocationSizeI7RO_PI = FfiConverterTypeSecurityType.INSTANCE.mo9529allocationSizeI7RO_PI(c3038AeR.OLrzqt());
        FfiConverterTypeLocalString ffiConverterTypeLocalString = FfiConverterTypeLocalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterTypeLocalString.mo9529allocationSizeI7RO_PI(c3038AeR.copydefault())) + ffiConverterTypeLocalString.mo9529allocationSizeI7RO_PI(c3038AeR.EZpvd())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c3038AeR.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3038AeR c3038AeR, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3038AeR, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeSecurityType.INSTANCE.write(c3038AeR.OLrzqt(), byteBuffer);
        FfiConverterTypeLocalString ffiConverterTypeLocalString = FfiConverterTypeLocalString.INSTANCE;
        ffiConverterTypeLocalString.write(c3038AeR.copydefault(), byteBuffer);
        ffiConverterTypeLocalString.write(c3038AeR.EZpvd(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(c3038AeR.KWHzl(), byteBuffer);
    }
}
