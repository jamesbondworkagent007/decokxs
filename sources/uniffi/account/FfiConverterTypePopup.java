package uniffi.account;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zZX;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypePopup implements FfiConverterRustBuffer<zZX> {
    public static final int $stable = 0;
    public static final FfiConverterTypePopup INSTANCE = new FfiConverterTypePopup();

    private FfiConverterTypePopup() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zZX lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zZX) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zZX liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zZX) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zZX zzx) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zzx);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zZX zzx) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zzx);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zZX read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new zZX(ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterOptionalString.INSTANCE.read(byteBuffer), FfiConverterSequenceTypeItem.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zZX zzx) {
        Intrinsics.checkNotNullParameter(zzx, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterBoolean.m9530allocationSizeI7RO_PI(zzx.KWHzl()) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(zzx.EZpvd())) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(zzx.AEQbTJ())) + FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(zzx.OLrzqt())) + FfiConverterSequenceTypeItem.INSTANCE.mo9529allocationSizeI7RO_PI((List) zzx.copydefault()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zZX zzx, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zzx, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(zzx.KWHzl(), byteBuffer);
        ffiConverterBoolean.write(zzx.EZpvd(), byteBuffer);
        FfiConverterString.INSTANCE.write(zzx.AEQbTJ(), byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(zzx.OLrzqt(), byteBuffer);
        FfiConverterSequenceTypeItem.INSTANCE.write((List) zzx.copydefault(), byteBuffer);
    }
}
