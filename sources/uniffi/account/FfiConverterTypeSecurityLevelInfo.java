package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3068Aev;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeSecurityLevelInfo implements FfiConverterRustBuffer<C3068Aev> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSecurityLevelInfo INSTANCE = new FfiConverterTypeSecurityLevelInfo();

    private FfiConverterTypeSecurityLevelInfo() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3068Aev lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3068Aev) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3068Aev liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3068Aev) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3068Aev c3068Aev) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3068Aev);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3068Aev c3068Aev) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3068Aev);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3068Aev read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return new C3068Aev(ffiConverterInt.read(byteBuffer).intValue(), ffiConverterInt.read(byteBuffer).intValue(), FfiConverterTypeSecurityLevel.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3068Aev c3068Aev) {
        Intrinsics.checkNotNullParameter(c3068Aev, "");
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterInt.m9536allocationSizeI7RO_PI(c3068Aev.AEQbTJ()) + ffiConverterInt.m9536allocationSizeI7RO_PI(c3068Aev.copydefault())) + FfiConverterTypeSecurityLevel.INSTANCE.mo9529allocationSizeI7RO_PI(c3068Aev.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3068Aev c3068Aev, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3068Aev, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        ffiConverterInt.write(c3068Aev.AEQbTJ(), byteBuffer);
        ffiConverterInt.write(c3068Aev.copydefault(), byteBuffer);
        FfiConverterTypeSecurityLevel.INSTANCE.write(c3068Aev.OLrzqt(), byteBuffer);
    }
}
