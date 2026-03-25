package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zPD;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOkxPasskeyCrossDeviceMasterStep implements FfiConverterRustBuffer<zPD> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyCrossDeviceMasterStep INSTANCE = new FfiConverterTypeOkxPasskeyCrossDeviceMasterStep();

    private FfiConverterTypeOkxPasskeyCrossDeviceMasterStep() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zPD lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zPD) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zPD liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zPD) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zPD zpd) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zpd);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zPD zpd) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zpd);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zPD read(@NotNull ByteBuffer byteBuffer) {
        zPD pictureInPictureParams;
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        switch (byteBuffer.getInt()) {
            case 1:
                return zPD.ActionBar.INSTANCE;
            case 2:
                return zPD.TaskDescription.INSTANCE;
            case 3:
                pictureInPictureParams = new zPD.PictureInPictureParams(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
                break;
            case 4:
                return zPD.TaskStackBuilder.INSTANCE;
            case 5:
                return zPD.LoaderManager.INSTANCE;
            case 6:
                pictureInPictureParams = new zPD.Dialog(FfiConverterString.INSTANCE.read(byteBuffer));
                break;
            case 7:
                pictureInPictureParams = new zPD.PendingIntent(FfiConverterTypeOkxPasskeyError.INSTANCE.read(byteBuffer));
                break;
            case 8:
                pictureInPictureParams = new zPD.StateListAnimator(FfiConverterString.INSTANCE.read(byteBuffer));
                break;
            case 9:
                return zPD.Application.INSTANCE;
            case 10:
                return zPD.FragmentManager.INSTANCE;
            case 11:
                pictureInPictureParams = new zPD.Activity(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
                break;
            case 12:
                return zPD.Fragment.INSTANCE;
            case 13:
                return zPD.AssistContent.INSTANCE;
            default:
                throw new RuntimeException("invalid enum value, something is very wrong!!");
        }
        return pictureInPictureParams;
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zPD zpd) {
        Intrinsics.checkNotNullParameter(zpd, "");
        if ((zpd instanceof zPD.ActionBar) || (zpd instanceof zPD.TaskDescription)) {
            return 4L;
        }
        if (zpd instanceof zPD.PictureInPictureParams) {
            return C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(((zPD.PictureInPictureParams) zpd).EZpvd()) + 4);
        }
        if ((zpd instanceof zPD.TaskStackBuilder) || (zpd instanceof zPD.LoaderManager)) {
            return 4L;
        }
        if (zpd instanceof zPD.Dialog) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zPD.Dialog) zpd).OLrzqt()) + 4);
        }
        if (zpd instanceof zPD.PendingIntent) {
            return C56396yDv.copydefault(FfiConverterTypeOkxPasskeyError.INSTANCE.mo9529allocationSizeI7RO_PI(((zPD.PendingIntent) zpd).EZpvd()) + 4);
        }
        if (zpd instanceof zPD.StateListAnimator) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zPD.StateListAnimator) zpd).copydefault()) + 4);
        }
        if ((zpd instanceof zPD.Application) || (zpd instanceof zPD.FragmentManager)) {
            return 4L;
        }
        if (zpd instanceof zPD.Activity) {
            return C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(((zPD.Activity) zpd).OLrzqt()) + 4);
        }
        if ((zpd instanceof zPD.Fragment) || (zpd instanceof zPD.AssistContent)) {
            return 4L;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zPD zpd, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zpd, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (zpd instanceof zPD.ActionBar) {
            byteBuffer.putInt(1);
        } else if (zpd instanceof zPD.TaskDescription) {
            byteBuffer.putInt(2);
        } else if (zpd instanceof zPD.PictureInPictureParams) {
            byteBuffer.putInt(3);
            FfiConverterBoolean.INSTANCE.write(((zPD.PictureInPictureParams) zpd).EZpvd(), byteBuffer);
        } else if (zpd instanceof zPD.TaskStackBuilder) {
            byteBuffer.putInt(4);
        } else if (zpd instanceof zPD.LoaderManager) {
            byteBuffer.putInt(5);
        } else if (zpd instanceof zPD.Dialog) {
            byteBuffer.putInt(6);
            FfiConverterString.INSTANCE.write(((zPD.Dialog) zpd).OLrzqt(), byteBuffer);
        } else if (zpd instanceof zPD.PendingIntent) {
            byteBuffer.putInt(7);
            FfiConverterTypeOkxPasskeyError.INSTANCE.write(((zPD.PendingIntent) zpd).EZpvd(), byteBuffer);
        } else if (zpd instanceof zPD.StateListAnimator) {
            byteBuffer.putInt(8);
            FfiConverterString.INSTANCE.write(((zPD.StateListAnimator) zpd).copydefault(), byteBuffer);
        } else if (zpd instanceof zPD.Application) {
            byteBuffer.putInt(9);
        } else if (zpd instanceof zPD.FragmentManager) {
            byteBuffer.putInt(10);
        } else if (zpd instanceof zPD.Activity) {
            byteBuffer.putInt(11);
            FfiConverterBoolean.INSTANCE.write(((zPD.Activity) zpd).OLrzqt(), byteBuffer);
        } else if (zpd instanceof zPD.Fragment) {
            byteBuffer.putInt(12);
        } else {
            if (!(zpd instanceof zPD.AssistContent)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(13);
        }
        Unit unit = Unit.INSTANCE;
    }
}
