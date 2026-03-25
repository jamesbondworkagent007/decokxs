package uniffi.account;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zLU;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceJourneyStep implements FfiConverterRustBuffer<zLU> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceJourneyStep INSTANCE = new FfiConverterTypeNewDeviceJourneyStep();

    private FfiConverterTypeNewDeviceJourneyStep() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zLU lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zLU) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zLU liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zLU) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zLU zlu) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zlu);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zLU zlu) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zlu);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zLU read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new zLU.ActionBar(FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterLong.INSTANCE.read(byteBuffer).longValue());
        }
        if (i == 2) {
            return new zLU.TaskDescription(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 3) {
            return new zLU.StateListAnimator(FfiConverterSequenceTypeOtpType.INSTANCE.read(byteBuffer));
        }
        if (i == 4) {
            return new zLU.Activity(FfiConverterTypeOtpType.INSTANCE.read(byteBuffer), FfiConverterSequenceTypeOtpType.INSTANCE.read(byteBuffer));
        }
        if (i == 5) {
            return new zLU.Application(FfiConverterTypeLoginResult.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zLU zlu) {
        Intrinsics.checkNotNullParameter(zlu, "");
        if (zlu instanceof zLU.ActionBar) {
            zLU.ActionBar actionBar = (zLU.ActionBar) zlu;
            return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(actionBar.AEQbTJ()) + 4) + FfiConverterLong.INSTANCE.m9537allocationSizeI7RO_PI(actionBar.EZpvd()));
        }
        if (zlu instanceof zLU.TaskDescription) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zLU.TaskDescription) zlu).AEQbTJ()) + 4);
        }
        if (zlu instanceof zLU.StateListAnimator) {
            return C56396yDv.copydefault(FfiConverterSequenceTypeOtpType.INSTANCE.mo9529allocationSizeI7RO_PI((List) ((zLU.StateListAnimator) zlu).EZpvd()) + 4);
        }
        if (zlu instanceof zLU.Activity) {
            zLU.Activity activity = (zLU.Activity) zlu;
            return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterTypeOtpType.INSTANCE.mo9529allocationSizeI7RO_PI(activity.EZpvd()) + 4) + FfiConverterSequenceTypeOtpType.INSTANCE.mo9529allocationSizeI7RO_PI((List) activity.OLrzqt()));
        }
        if (!(zlu instanceof zLU.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterTypeLoginResult.INSTANCE.mo9529allocationSizeI7RO_PI(((zLU.Application) zlu).EZpvd()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zLU zlu, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zlu, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (zlu instanceof zLU.ActionBar) {
            byteBuffer.putInt(1);
            zLU.ActionBar actionBar = (zLU.ActionBar) zlu;
            FfiConverterString.INSTANCE.write(actionBar.AEQbTJ(), byteBuffer);
            FfiConverterLong.INSTANCE.write(actionBar.EZpvd(), byteBuffer);
        } else if (zlu instanceof zLU.TaskDescription) {
            byteBuffer.putInt(2);
            FfiConverterString.INSTANCE.write(((zLU.TaskDescription) zlu).AEQbTJ(), byteBuffer);
        } else if (zlu instanceof zLU.StateListAnimator) {
            byteBuffer.putInt(3);
            FfiConverterSequenceTypeOtpType.INSTANCE.write((List) ((zLU.StateListAnimator) zlu).EZpvd(), byteBuffer);
        } else if (zlu instanceof zLU.Activity) {
            byteBuffer.putInt(4);
            zLU.Activity activity = (zLU.Activity) zlu;
            FfiConverterTypeOtpType.INSTANCE.write(activity.EZpvd(), byteBuffer);
            FfiConverterSequenceTypeOtpType.INSTANCE.write((List) activity.OLrzqt(), byteBuffer);
        } else {
            if (!(zlu instanceof zLU.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(5);
            FfiConverterTypeLoginResult.INSTANCE.write(((zLU.Application) zlu).EZpvd(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
