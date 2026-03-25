package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3099AfZ;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeTrustedDeviceJourneyState implements FfiConverterRustBuffer<C3099AfZ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeTrustedDeviceJourneyState INSTANCE = new FfiConverterTypeTrustedDeviceJourneyState();

    private FfiConverterTypeTrustedDeviceJourneyState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3099AfZ lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3099AfZ) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3099AfZ liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3099AfZ) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3099AfZ c3099AfZ) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3099AfZ);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3099AfZ c3099AfZ) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3099AfZ);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3099AfZ read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C3099AfZ(FfiConverterTypeDeviceVerifyInfo.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3099AfZ c3099AfZ) {
        Intrinsics.checkNotNullParameter(c3099AfZ, "");
        return FfiConverterTypeDeviceVerifyInfo.INSTANCE.mo9529allocationSizeI7RO_PI(c3099AfZ.copydefault());
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3099AfZ c3099AfZ, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3099AfZ, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeDeviceVerifyInfo.INSTANCE.write(c3099AfZ.copydefault(), byteBuffer);
    }
}
