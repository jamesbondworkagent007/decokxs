package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3086AfM;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeSwitchSiteInfo implements FfiConverterRustBuffer<C3086AfM> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSwitchSiteInfo INSTANCE = new FfiConverterTypeSwitchSiteInfo();

    private FfiConverterTypeSwitchSiteInfo() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3086AfM lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3086AfM) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3086AfM liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3086AfM) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3086AfM c3086AfM) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3086AfM);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3086AfM c3086AfM) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3086AfM);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3086AfM read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return new C3086AfM(ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3086AfM c3086AfM) {
        Intrinsics.checkNotNullParameter(c3086AfM, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c3086AfM.AEQbTJ()) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c3086AfM.KWHzl())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c3086AfM.EZpvd())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c3086AfM.copydefault()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3086AfM c3086AfM, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3086AfM, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c3086AfM.AEQbTJ(), byteBuffer);
        ffiConverterOptionalString.write(c3086AfM.KWHzl(), byteBuffer);
        ffiConverterOptionalString.write(c3086AfM.EZpvd(), byteBuffer);
        ffiConverterOptionalString.write(c3086AfM.copydefault(), byteBuffer);
    }
}
