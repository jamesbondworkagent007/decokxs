package uniffi.account;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zWS;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypePasskeyRegistrationParam implements FfiConverterRustBuffer<zWS> {
    public static final int $stable = 0;
    public static final FfiConverterTypePasskeyRegistrationParam INSTANCE = new FfiConverterTypePasskeyRegistrationParam();

    private FfiConverterTypePasskeyRegistrationParam() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zWS lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zWS) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zWS liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zWS) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zWS zws) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zws);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zWS zws) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zws);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zWS read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new zWS(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterSequenceString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zWS zws) {
        Intrinsics.checkNotNullParameter(zws, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(zws.AEQbTJ()) + ffiConverterString.mo9529allocationSizeI7RO_PI(zws.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(zws.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(zws.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(zws.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(zws.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(zws.copydefault())) + FfiConverterSequenceString.INSTANCE.mo9529allocationSizeI7RO_PI((List) zws.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zWS zws, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zws, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(zws.AEQbTJ(), byteBuffer);
        ffiConverterString.write(zws.EZpvd(), byteBuffer);
        ffiConverterString.write(zws.OLrzqt(), byteBuffer);
        ffiConverterString.write(zws.gEmmrt(), byteBuffer);
        ffiConverterString.write(zws.valueOf(), byteBuffer);
        ffiConverterString.write(zws.djBIcL(), byteBuffer);
        ffiConverterString.write(zws.copydefault(), byteBuffer);
        FfiConverterSequenceString.INSTANCE.write((List) zws.KWHzl(), byteBuffer);
    }
}
