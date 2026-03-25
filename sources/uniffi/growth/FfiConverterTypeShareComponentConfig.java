package uniffi.growth;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.API;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.growth.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeShareComponentConfig implements FfiConverterRustBuffer<API> {
    public static final int $stable = 0;
    public static final FfiConverterTypeShareComponentConfig INSTANCE = new FfiConverterTypeShareComponentConfig();

    private FfiConverterTypeShareComponentConfig() {
    }

    @Override // uniffi.growth.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public API lift2(@NotNull RustBuffer.ByValue byValue) {
        return (API) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public API liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (API) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull API api2) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, api2);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull API api2) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, api2);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public API read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterMapStringTypeComponentItem ffiConverterMapStringTypeComponentItem = FfiConverterMapStringTypeComponentItem.INSTANCE;
        return new API(ffiConverterMapStringTypeComponentItem.read(byteBuffer), ffiConverterMapStringTypeComponentItem.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull API api2) {
        Intrinsics.checkNotNullParameter(api2, "");
        FfiConverterMapStringTypeComponentItem ffiConverterMapStringTypeComponentItem = FfiConverterMapStringTypeComponentItem.INSTANCE;
        return C56396yDv.copydefault(ffiConverterMapStringTypeComponentItem.mo9529allocationSizeI7RO_PI(api2.OLrzqt()) + ffiConverterMapStringTypeComponentItem.mo9529allocationSizeI7RO_PI(api2.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull API api2, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(api2, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterMapStringTypeComponentItem ffiConverterMapStringTypeComponentItem = FfiConverterMapStringTypeComponentItem.INSTANCE;
        ffiConverterMapStringTypeComponentItem.write(api2.OLrzqt(), byteBuffer);
        ffiConverterMapStringTypeComponentItem.write(api2.AEQbTJ(), byteBuffer);
    }
}
