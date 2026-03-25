package uniffi.account;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C3043AeW;
import o.C3068Aev;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeSecurityListState implements FfiConverterRustBuffer<C3043AeW> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSecurityListState INSTANCE = new FfiConverterTypeSecurityListState();

    private FfiConverterTypeSecurityListState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3043AeW lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3043AeW) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3043AeW liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3043AeW) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3043AeW c3043AeW) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3043AeW);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3043AeW c3043AeW) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3043AeW);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3043AeW read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        C3068Aev c3068Aev = FfiConverterOptionalTypeSecurityLevelInfo.INSTANCE.read(byteBuffer);
        FfiConverterSequenceTypeSecurityListItem ffiConverterSequenceTypeSecurityListItem = FfiConverterSequenceTypeSecurityListItem.INSTANCE;
        return new C3043AeW(c3068Aev, ffiConverterSequenceTypeSecurityListItem.read(byteBuffer), ffiConverterSequenceTypeSecurityListItem.read(byteBuffer), ffiConverterSequenceTypeSecurityListItem.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3043AeW c3043AeW) {
        Intrinsics.checkNotNullParameter(c3043AeW, "");
        long jMo9529allocationSizeI7RO_PI = FfiConverterOptionalTypeSecurityLevelInfo.INSTANCE.mo9529allocationSizeI7RO_PI(c3043AeW.copydefault());
        FfiConverterSequenceTypeSecurityListItem ffiConverterSequenceTypeSecurityListItem = FfiConverterSequenceTypeSecurityListItem.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterSequenceTypeSecurityListItem.mo9529allocationSizeI7RO_PI((List) c3043AeW.KWHzl())) + ffiConverterSequenceTypeSecurityListItem.mo9529allocationSizeI7RO_PI((List) c3043AeW.OLrzqt())) + ffiConverterSequenceTypeSecurityListItem.mo9529allocationSizeI7RO_PI((List) c3043AeW.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3043AeW c3043AeW, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3043AeW, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalTypeSecurityLevelInfo.INSTANCE.write(c3043AeW.copydefault(), byteBuffer);
        FfiConverterSequenceTypeSecurityListItem ffiConverterSequenceTypeSecurityListItem = FfiConverterSequenceTypeSecurityListItem.INSTANCE;
        ffiConverterSequenceTypeSecurityListItem.write((List) c3043AeW.KWHzl(), byteBuffer);
        ffiConverterSequenceTypeSecurityListItem.write((List) c3043AeW.OLrzqt(), byteBuffer);
        ffiConverterSequenceTypeSecurityListItem.write((List) c3043AeW.EZpvd(), byteBuffer);
    }
}
