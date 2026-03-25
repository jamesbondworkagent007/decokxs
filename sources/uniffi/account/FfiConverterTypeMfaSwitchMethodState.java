package uniffi.account;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zHO;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeMfaSwitchMethodState implements FfiConverterRustBuffer<zHO> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMfaSwitchMethodState INSTANCE = new FfiConverterTypeMfaSwitchMethodState();

    private FfiConverterTypeMfaSwitchMethodState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zHO lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zHO) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zHO liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zHO) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zHO zho) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zho);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zHO zho) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zho);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zHO read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new zHO(FfiConverterSequenceTypeMfaSwitchMethodItem.INSTANCE.read(byteBuffer), FfiConverterOptionalString.INSTANCE.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zHO zho) {
        Intrinsics.checkNotNullParameter(zho, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterSequenceTypeMfaSwitchMethodItem.INSTANCE.mo9529allocationSizeI7RO_PI((List) zho.OLrzqt()) + FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(zho.AEQbTJ())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(zho.copydefault()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zHO zho, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zho, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterSequenceTypeMfaSwitchMethodItem.INSTANCE.write((List) zho.OLrzqt(), byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(zho.AEQbTJ(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(zho.copydefault(), byteBuffer);
    }
}
