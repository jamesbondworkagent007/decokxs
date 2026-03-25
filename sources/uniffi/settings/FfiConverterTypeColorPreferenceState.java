package uniffi.settings;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4661Bmi;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.settings.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeColorPreferenceState implements FfiConverterRustBuffer<C4661Bmi> {
    public static final int $stable = 0;
    public static final FfiConverterTypeColorPreferenceState INSTANCE = new FfiConverterTypeColorPreferenceState();

    private FfiConverterTypeColorPreferenceState() {
    }

    @Override // uniffi.settings.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4661Bmi lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4661Bmi) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4661Bmi liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4661Bmi) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4661Bmi c4661Bmi) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4661Bmi);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4661Bmi c4661Bmi) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4661Bmi);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4661Bmi read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return new C4661Bmi(ffiConverterInt.read(byteBuffer).intValue(), ffiConverterInt.read(byteBuffer).intValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4661Bmi c4661Bmi) {
        Intrinsics.checkNotNullParameter(c4661Bmi, "");
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return C56396yDv.copydefault(ffiConverterInt.m9536allocationSizeI7RO_PI(c4661Bmi.AEQbTJ()) + ffiConverterInt.m9536allocationSizeI7RO_PI(c4661Bmi.copydefault()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4661Bmi c4661Bmi, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4661Bmi, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        ffiConverterInt.write(c4661Bmi.AEQbTJ(), byteBuffer);
        ffiConverterInt.write(c4661Bmi.copydefault(), byteBuffer);
    }
}
