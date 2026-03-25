package uniffi.settings;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.settings.FfiConverterRustBuffer;
import uniffi.settings.SettingsException;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeSettingsError implements FfiConverterRustBuffer<SettingsException> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSettingsError INSTANCE = new FfiConverterTypeSettingsError();

    private FfiConverterTypeSettingsError() {
    }

    @Override // uniffi.settings.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public SettingsException lift2(@NotNull RustBuffer.ByValue byValue) {
        return (SettingsException) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public SettingsException liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (SettingsException) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull SettingsException settingsException) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, settingsException);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull SettingsException settingsException) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, settingsException);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public SettingsException read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (byteBuffer.getInt() == 1) {
            FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
            return new SettingsException.Exception(ffiConverterInt.read(byteBuffer).intValue(), ffiConverterInt.read(byteBuffer).intValue(), FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterTypeSettingsErrorType.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid error enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull SettingsException settingsException) {
        Intrinsics.checkNotNullParameter(settingsException, "");
        if (!(settingsException instanceof SettingsException.Exception)) {
            throw new NoWhenBranchMatchedException();
        }
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        SettingsException.Exception exception = (SettingsException.Exception) settingsException;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterInt.m9536allocationSizeI7RO_PI(exception.getHttpStatus()) + 4) + ffiConverterInt.m9536allocationSizeI7RO_PI(exception.getBusinessCode())) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(exception.getErrorMessage())) + FfiConverterTypeSettingsErrorType.INSTANCE.mo9529allocationSizeI7RO_PI(exception.getErrorType()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull SettingsException settingsException, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(settingsException, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (!(settingsException instanceof SettingsException.Exception)) {
            throw new NoWhenBranchMatchedException();
        }
        byteBuffer.putInt(1);
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        SettingsException.Exception exception = (SettingsException.Exception) settingsException;
        ffiConverterInt.write(exception.getHttpStatus(), byteBuffer);
        ffiConverterInt.write(exception.getBusinessCode(), byteBuffer);
        FfiConverterString.INSTANCE.write(exception.getErrorMessage(), byteBuffer);
        FfiConverterTypeSettingsErrorType.INSTANCE.write(exception.getErrorType(), byteBuffer);
        Unit unit = Unit.INSTANCE;
    }
}
