package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C60244zzA;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeChainInfo implements FfiConverterRustBuffer<C60244zzA> {
    public static final int $stable = 0;
    public static final FfiConverterTypeChainInfo INSTANCE = new FfiConverterTypeChainInfo();

    private FfiConverterTypeChainInfo() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C60244zzA lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C60244zzA) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C60244zzA liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C60244zzA) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C60244zzA c60244zzA) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c60244zzA);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C60244zzA c60244zzA) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c60244zzA);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C60244zzA read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        long jLongValue = ffiConverterLong.read(byteBuffer).longValue();
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C60244zzA(jLongValue, ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterLong.read(byteBuffer).longValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C60244zzA c60244zzA) {
        Intrinsics.checkNotNullParameter(c60244zzA, "");
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        long jM9537allocationSizeI7RO_PI = ffiConverterLong.m9537allocationSizeI7RO_PI(c60244zzA.EZpvd());
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jM9537allocationSizeI7RO_PI + ffiConverterString.mo9529allocationSizeI7RO_PI(c60244zzA.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c60244zzA.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c60244zzA.OLrzqt())) + ffiConverterLong.m9537allocationSizeI7RO_PI(c60244zzA.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C60244zzA c60244zzA, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c60244zzA, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        ffiConverterLong.write(c60244zzA.EZpvd(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c60244zzA.copydefault(), byteBuffer);
        ffiConverterString.write(c60244zzA.KWHzl(), byteBuffer);
        ffiConverterString.write(c60244zzA.OLrzqt(), byteBuffer);
        ffiConverterLong.write(c60244zzA.AEQbTJ(), byteBuffer);
    }
}
