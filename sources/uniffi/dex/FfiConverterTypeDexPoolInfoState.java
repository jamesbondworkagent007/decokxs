package uniffi.dex;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.ABH;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeDexPoolInfoState implements FfiConverterRustBuffer<ABH> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDexPoolInfoState INSTANCE = new FfiConverterTypeDexPoolInfoState();

    private FfiConverterTypeDexPoolInfoState() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public ABH lift2(@NotNull RustBuffer.ByValue byValue) {
        return (ABH) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public ABH liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (ABH) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull ABH abh) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abh);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull ABH abh) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abh);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public ABH read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new ABH(FfiConverterSequenceTypeDexPoolInfo.INSTANCE.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), FfiConverterOptionalString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull ABH abh) {
        Intrinsics.checkNotNullParameter(abh, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterSequenceTypeDexPoolInfo.INSTANCE.mo9529allocationSizeI7RO_PI((List) abh.AEQbTJ()) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(abh.EZpvd())) + FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(abh.copydefault()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull ABH abh, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abh, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterSequenceTypeDexPoolInfo.INSTANCE.write((List) abh.AEQbTJ(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(abh.EZpvd(), byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(abh.copydefault(), byteBuffer);
    }
}
