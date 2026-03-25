package uniffi.account;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zLS;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;
import uniffi.network.FfiConverterTypeSubDomainStrategy;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeNewDeviceJourneyInput implements FfiConverterRustBuffer<zLS> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceJourneyInput INSTANCE = new FfiConverterTypeNewDeviceJourneyInput();

    private FfiConverterTypeNewDeviceJourneyInput() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zLS lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zLS) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zLS liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zLS) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zLS zls) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zls);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zLS zls) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zls);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zLS read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new zLS(ffiConverterString.read(byteBuffer), FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), FfiConverterSequenceTypeNewDeviceAuthInfo.INSTANCE.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterTypeSubDomainStrategy.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zLS zls) {
        Intrinsics.checkNotNullParameter(zls, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(zls.AEQbTJ()) + FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(zls.KWHzl())) + FfiConverterSequenceTypeNewDeviceAuthInfo.INSTANCE.mo9529allocationSizeI7RO_PI((List) zls.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(zls.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(zls.OLrzqt())) + FfiConverterTypeSubDomainStrategy.INSTANCE.mo9529allocationSizeI7RO_PI(zls.gEmmrt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zLS zls, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zls, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(zls.AEQbTJ(), byteBuffer);
        FfiConverterInt.INSTANCE.write(zls.KWHzl(), byteBuffer);
        FfiConverterSequenceTypeNewDeviceAuthInfo.INSTANCE.write((List) zls.EZpvd(), byteBuffer);
        ffiConverterString.write(zls.copydefault(), byteBuffer);
        ffiConverterString.write(zls.OLrzqt(), byteBuffer);
        FfiConverterTypeSubDomainStrategy.INSTANCE.write(zls.gEmmrt(), byteBuffer);
    }
}
