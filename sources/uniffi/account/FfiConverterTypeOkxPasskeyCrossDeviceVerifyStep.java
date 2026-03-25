package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zRS;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOkxPasskeyCrossDeviceVerifyStep implements FfiConverterRustBuffer<zRS> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyCrossDeviceVerifyStep INSTANCE = new FfiConverterTypeOkxPasskeyCrossDeviceVerifyStep();

    private FfiConverterTypeOkxPasskeyCrossDeviceVerifyStep() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zRS lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zRS) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zRS liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zRS) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zRS zrs) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zrs);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zRS zrs) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zrs);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zRS read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        switch (byteBuffer.getInt()) {
            case 1:
                return zRS.Dialog.INSTANCE;
            case 2:
                return zRS.FragmentManager.INSTANCE;
            case 3:
                return zRS.ActionBar.INSTANCE;
            case 4:
                return zRS.StateListAnimator.INSTANCE;
            case 5:
                return zRS.Fragment.INSTANCE;
            case 6:
                return new zRS.Activity(FfiConverterString.INSTANCE.read(byteBuffer));
            case 7:
                return zRS.Application.INSTANCE;
            case 8:
                return zRS.TaskDescription.INSTANCE;
            case 9:
                return new zRS.LoaderManager(FfiConverterString.INSTANCE.read(byteBuffer));
            default:
                throw new RuntimeException("invalid enum value, something is very wrong!!");
        }
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zRS zrs) {
        Intrinsics.checkNotNullParameter(zrs, "");
        if ((zrs instanceof zRS.Dialog) || (zrs instanceof zRS.FragmentManager) || (zrs instanceof zRS.ActionBar) || (zrs instanceof zRS.StateListAnimator) || (zrs instanceof zRS.Fragment)) {
            return 4L;
        }
        if (zrs instanceof zRS.Activity) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zRS.Activity) zrs).AEQbTJ()) + 4);
        }
        if ((zrs instanceof zRS.Application) || (zrs instanceof zRS.TaskDescription)) {
            return 4L;
        }
        if (!(zrs instanceof zRS.LoaderManager)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zRS.LoaderManager) zrs).OLrzqt()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zRS zrs, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zrs, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (zrs instanceof zRS.Dialog) {
            byteBuffer.putInt(1);
        } else if (zrs instanceof zRS.FragmentManager) {
            byteBuffer.putInt(2);
        } else if (zrs instanceof zRS.ActionBar) {
            byteBuffer.putInt(3);
        } else if (zrs instanceof zRS.StateListAnimator) {
            byteBuffer.putInt(4);
        } else if (zrs instanceof zRS.Fragment) {
            byteBuffer.putInt(5);
        } else if (zrs instanceof zRS.Activity) {
            byteBuffer.putInt(6);
            FfiConverterString.INSTANCE.write(((zRS.Activity) zrs).AEQbTJ(), byteBuffer);
        } else if (zrs instanceof zRS.Application) {
            byteBuffer.putInt(7);
        } else if (zrs instanceof zRS.TaskDescription) {
            byteBuffer.putInt(8);
        } else {
            if (!(zrs instanceof zRS.LoaderManager)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(9);
            FfiConverterString.INSTANCE.write(((zRS.LoaderManager) zrs).OLrzqt(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
