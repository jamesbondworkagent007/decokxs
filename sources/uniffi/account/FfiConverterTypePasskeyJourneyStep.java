package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zVI;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypePasskeyJourneyStep implements FfiConverterRustBuffer<zVI> {
    public static final int $stable = 0;
    public static final FfiConverterTypePasskeyJourneyStep INSTANCE = new FfiConverterTypePasskeyJourneyStep();

    private FfiConverterTypePasskeyJourneyStep() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zVI lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zVI) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zVI liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zVI) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zVI zvi) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zvi);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zVI zvi) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zvi);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zVI read(@NotNull ByteBuffer byteBuffer) {
        zVI stateListAnimator;
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        switch (byteBuffer.getInt()) {
            case 1:
                return zVI.ActionBar.INSTANCE;
            case 2:
                stateListAnimator = new zVI.StateListAnimator(FfiConverterString.INSTANCE.read(byteBuffer));
                break;
            case 3:
                stateListAnimator = new zVI.Application(FfiConverterString.INSTANCE.read(byteBuffer));
                break;
            case 4:
                stateListAnimator = new zVI.TaskDescription(FfiConverterString.INSTANCE.read(byteBuffer));
                break;
            case 5:
                stateListAnimator = new zVI.Fragment(FfiConverterOptionalString.INSTANCE.read(byteBuffer));
                break;
            case 6:
                return zVI.LoaderManager.INSTANCE;
            case 7:
                return zVI.Activity.INSTANCE;
            case 8:
                return zVI.Dialog.INSTANCE;
            case 9:
                return zVI.PendingIntent.INSTANCE;
            case 10:
                return zVI.FragmentManager.INSTANCE;
            default:
                throw new RuntimeException("invalid enum value, something is very wrong!!");
        }
        return stateListAnimator;
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zVI zvi) {
        Intrinsics.checkNotNullParameter(zvi, "");
        if (zvi instanceof zVI.ActionBar) {
            return 4L;
        }
        if (zvi instanceof zVI.StateListAnimator) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zVI.StateListAnimator) zvi).OLrzqt()) + 4);
        }
        if (zvi instanceof zVI.Application) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zVI.Application) zvi).EZpvd()) + 4);
        }
        if (zvi instanceof zVI.TaskDescription) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zVI.TaskDescription) zvi).copydefault()) + 4);
        }
        if (zvi instanceof zVI.Fragment) {
            return C56396yDv.copydefault(FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(((zVI.Fragment) zvi).copydefault()) + 4);
        }
        if ((zvi instanceof zVI.LoaderManager) || (zvi instanceof zVI.Activity) || (zvi instanceof zVI.Dialog) || (zvi instanceof zVI.PendingIntent) || (zvi instanceof zVI.FragmentManager)) {
            return 4L;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zVI zvi, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zvi, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (zvi instanceof zVI.ActionBar) {
            byteBuffer.putInt(1);
        } else if (zvi instanceof zVI.StateListAnimator) {
            byteBuffer.putInt(2);
            FfiConverterString.INSTANCE.write(((zVI.StateListAnimator) zvi).OLrzqt(), byteBuffer);
        } else if (zvi instanceof zVI.Application) {
            byteBuffer.putInt(3);
            FfiConverterString.INSTANCE.write(((zVI.Application) zvi).EZpvd(), byteBuffer);
        } else if (zvi instanceof zVI.TaskDescription) {
            byteBuffer.putInt(4);
            FfiConverterString.INSTANCE.write(((zVI.TaskDescription) zvi).copydefault(), byteBuffer);
        } else if (zvi instanceof zVI.Fragment) {
            byteBuffer.putInt(5);
            FfiConverterOptionalString.INSTANCE.write(((zVI.Fragment) zvi).copydefault(), byteBuffer);
        } else if (zvi instanceof zVI.LoaderManager) {
            byteBuffer.putInt(6);
        } else if (zvi instanceof zVI.Activity) {
            byteBuffer.putInt(7);
        } else if (zvi instanceof zVI.Dialog) {
            byteBuffer.putInt(8);
        } else if (zvi instanceof zVI.PendingIntent) {
            byteBuffer.putInt(9);
        } else {
            if (!(zvi instanceof zVI.FragmentManager)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(10);
        }
        Unit unit = Unit.INSTANCE;
    }
}
