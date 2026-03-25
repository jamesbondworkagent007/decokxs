package uniffi.account;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C3082AfI;
import o.C56396yDv;
import o.C58831zQz;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOkxPasskeyCrossDeviceSyncState implements FfiConverterRustBuffer<C58831zQz> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyCrossDeviceSyncState INSTANCE = new FfiConverterTypeOkxPasskeyCrossDeviceSyncState();

    private FfiConverterTypeOkxPasskeyCrossDeviceSyncState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C58831zQz lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C58831zQz) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58831zQz liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C58831zQz) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C58831zQz c58831zQz) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c58831zQz);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C58831zQz c58831zQz) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c58831zQz);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58831zQz read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        boolean zBooleanValue = FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue();
        List<C3082AfI> list = FfiConverterSequenceTypeSyncDeviceInfo.INSTANCE.read(byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return new C58831zQz(zBooleanValue, list, ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C58831zQz c58831zQz) {
        Intrinsics.checkNotNullParameter(c58831zQz, "");
        long jCopydefault = C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c58831zQz.copydefault()) + FfiConverterSequenceTypeSyncDeviceInfo.INSTANCE.mo9529allocationSizeI7RO_PI((List) c58831zQz.AEQbTJ()));
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c58831zQz.EZpvd())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c58831zQz.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C58831zQz c58831zQz, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c58831zQz, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean.INSTANCE.write(c58831zQz.copydefault(), byteBuffer);
        FfiConverterSequenceTypeSyncDeviceInfo.INSTANCE.write((List) c58831zQz.AEQbTJ(), byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c58831zQz.EZpvd(), byteBuffer);
        ffiConverterOptionalString.write(c58831zQz.OLrzqt(), byteBuffer);
    }
}
