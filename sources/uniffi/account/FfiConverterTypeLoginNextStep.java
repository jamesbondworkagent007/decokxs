package uniffi.account;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zDI;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeLoginNextStep implements FfiConverterRustBuffer<zDI> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLoginNextStep INSTANCE = new FfiConverterTypeLoginNextStep();

    private FfiConverterTypeLoginNextStep() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zDI lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zDI) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zDI liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zDI) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zDI zdi) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zdi);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zDI zdi) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zdi);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zDI read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return zDI.Activity.INSTANCE;
        }
        if (i == 2) {
            return zDI.StateListAnimator.INSTANCE;
        }
        if (i == 3) {
            return new zDI.TaskDescription(FfiConverterTypeOtpType.INSTANCE.read(byteBuffer), FfiConverterSequenceTypeOtpType.INSTANCE.read(byteBuffer), FfiConverterTypeStep2Type.INSTANCE.read(byteBuffer), FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 4) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            return new zDI.Application(ffiConverterString.read(byteBuffer), FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), FfiConverterSequenceTypeNewDeviceAuthInfo.INSTANCE.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
        }
        if (i == 5) {
            return new zDI.ActionBar(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zDI zdi) {
        Intrinsics.checkNotNullParameter(zdi, "");
        if ((zdi instanceof zDI.Activity) || (zdi instanceof zDI.StateListAnimator)) {
            return 4L;
        }
        if (zdi instanceof zDI.TaskDescription) {
            zDI.TaskDescription taskDescription = (zDI.TaskDescription) zdi;
            return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterTypeOtpType.INSTANCE.mo9529allocationSizeI7RO_PI(taskDescription.KWHzl()) + 4) + FfiConverterSequenceTypeOtpType.INSTANCE.mo9529allocationSizeI7RO_PI((List) taskDescription.EZpvd())) + FfiConverterTypeStep2Type.INSTANCE.mo9529allocationSizeI7RO_PI(taskDescription.AEQbTJ())) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(taskDescription.copydefault()));
        }
        if (zdi instanceof zDI.Application) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            zDI.Application application = (zDI.Application) zdi;
            return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(application.EZpvd()) + 4) + FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(application.OLrzqt())) + FfiConverterSequenceTypeNewDeviceAuthInfo.INSTANCE.mo9529allocationSizeI7RO_PI((List) application.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(application.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(application.AEQbTJ()));
        }
        if (!(zdi instanceof zDI.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zDI.ActionBar) zdi).OLrzqt()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zDI zdi, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zdi, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (zdi instanceof zDI.Activity) {
            byteBuffer.putInt(1);
        } else if (zdi instanceof zDI.StateListAnimator) {
            byteBuffer.putInt(2);
        } else if (zdi instanceof zDI.TaskDescription) {
            byteBuffer.putInt(3);
            zDI.TaskDescription taskDescription = (zDI.TaskDescription) zdi;
            FfiConverterTypeOtpType.INSTANCE.write(taskDescription.KWHzl(), byteBuffer);
            FfiConverterSequenceTypeOtpType.INSTANCE.write((List) taskDescription.EZpvd(), byteBuffer);
            FfiConverterTypeStep2Type.INSTANCE.write(taskDescription.AEQbTJ(), byteBuffer);
            FfiConverterString.INSTANCE.write(taskDescription.copydefault(), byteBuffer);
        } else if (zdi instanceof zDI.Application) {
            byteBuffer.putInt(4);
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            zDI.Application application = (zDI.Application) zdi;
            ffiConverterString.write(application.EZpvd(), byteBuffer);
            FfiConverterInt.INSTANCE.write(application.OLrzqt(), byteBuffer);
            FfiConverterSequenceTypeNewDeviceAuthInfo.INSTANCE.write((List) application.KWHzl(), byteBuffer);
            ffiConverterString.write(application.copydefault(), byteBuffer);
            ffiConverterString.write(application.AEQbTJ(), byteBuffer);
        } else {
            if (!(zdi instanceof zDI.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(5);
            FfiConverterString.INSTANCE.write(((zDI.ActionBar) zdi).OLrzqt(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
