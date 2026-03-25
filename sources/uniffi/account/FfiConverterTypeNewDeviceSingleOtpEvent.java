package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zMP;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceSingleOtpEvent implements FfiConverterRustBuffer<zMP> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceSingleOtpEvent INSTANCE = new FfiConverterTypeNewDeviceSingleOtpEvent();

    private FfiConverterTypeNewDeviceSingleOtpEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zMP lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zMP) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zMP liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zMP) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zMP zmp) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zmp);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zMP zmp) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zmp);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zMP read(@NotNull ByteBuffer byteBuffer) {
        zMP activity;
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        switch (byteBuffer.getInt()) {
            case 1:
                activity = new zMP.Activity(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
                break;
            case 2:
                activity = new zMP.TaskDescription(FfiConverterString.INSTANCE.read(byteBuffer));
                break;
            case 3:
                return zMP.StateListAnimator.INSTANCE;
            case 4:
                activity = new zMP.Application(FfiConverterString.INSTANCE.read(byteBuffer));
                break;
            case 5:
                activity = new zMP.ActionBar(FfiConverterTypeOtpType.INSTANCE.read(byteBuffer));
                break;
            case 6:
                return new zMP.FragmentManager(FfiConverterLong.INSTANCE.read(byteBuffer).longValue());
            default:
                throw new RuntimeException("invalid enum value, something is very wrong!!");
        }
        return activity;
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zMP zmp) {
        Intrinsics.checkNotNullParameter(zmp, "");
        if (zmp instanceof zMP.Activity) {
            return C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(((zMP.Activity) zmp).KWHzl()) + 4);
        }
        if (zmp instanceof zMP.TaskDescription) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zMP.TaskDescription) zmp).OLrzqt()) + 4);
        }
        if (zmp instanceof zMP.StateListAnimator) {
            return 4L;
        }
        if (zmp instanceof zMP.Application) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zMP.Application) zmp).EZpvd()) + 4);
        }
        if (zmp instanceof zMP.ActionBar) {
            return C56396yDv.copydefault(FfiConverterTypeOtpType.INSTANCE.mo9529allocationSizeI7RO_PI(((zMP.ActionBar) zmp).KWHzl()) + 4);
        }
        if (!(zmp instanceof zMP.FragmentManager)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterLong.INSTANCE.m9537allocationSizeI7RO_PI(((zMP.FragmentManager) zmp).copydefault()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zMP zmp, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zmp, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (zmp instanceof zMP.Activity) {
            byteBuffer.putInt(1);
            FfiConverterBoolean.INSTANCE.write(((zMP.Activity) zmp).KWHzl(), byteBuffer);
        } else if (zmp instanceof zMP.TaskDescription) {
            byteBuffer.putInt(2);
            FfiConverterString.INSTANCE.write(((zMP.TaskDescription) zmp).OLrzqt(), byteBuffer);
        } else if (zmp instanceof zMP.StateListAnimator) {
            byteBuffer.putInt(3);
        } else if (zmp instanceof zMP.Application) {
            byteBuffer.putInt(4);
            FfiConverterString.INSTANCE.write(((zMP.Application) zmp).EZpvd(), byteBuffer);
        } else if (zmp instanceof zMP.ActionBar) {
            byteBuffer.putInt(5);
            FfiConverterTypeOtpType.INSTANCE.write(((zMP.ActionBar) zmp).KWHzl(), byteBuffer);
        } else {
            if (!(zmp instanceof zMP.FragmentManager)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(6);
            FfiConverterLong.INSTANCE.write(((zMP.FragmentManager) zmp).copydefault(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
