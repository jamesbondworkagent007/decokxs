package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zVM;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypePasskeyJourneyEvent implements FfiConverterRustBuffer<zVM> {
    public static final int $stable = 0;
    public static final FfiConverterTypePasskeyJourneyEvent INSTANCE = new FfiConverterTypePasskeyJourneyEvent();

    private FfiConverterTypePasskeyJourneyEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zVM lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zVM) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zVM liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zVM) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zVM zvm) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zvm);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zVM zvm) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zvm);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zVM read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        switch (byteBuffer.getInt()) {
            case 1:
                return new zVM.Activity(FfiConverterTypeAccountNetworkState.INSTANCE.read(byteBuffer));
            case 2:
                return new zVM.Dialog(FfiConverterString.INSTANCE.read(byteBuffer));
            case 3:
                return new zVM.LoaderManager(FfiConverterString.INSTANCE.read(byteBuffer));
            case 4:
                return new zVM.FragmentManager(FfiConverterOptionalString.INSTANCE.read(byteBuffer));
            case 5:
                return zVM.TaskStackBuilder.INSTANCE;
            case 6:
                return zVM.StateListAnimator.INSTANCE;
            case 7:
                return zVM.PendingIntent.INSTANCE;
            case 8:
                return zVM.Application.INSTANCE;
            case 9:
                return zVM.Fragment.INSTANCE;
            case 10:
                return zVM.TaskDescription.INSTANCE;
            case 11:
                return new zVM.ActionBar(FfiConverterString.INSTANCE.read(byteBuffer));
            default:
                throw new RuntimeException("invalid enum value, something is very wrong!!");
        }
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zVM zvm) {
        Intrinsics.checkNotNullParameter(zvm, "");
        if (zvm instanceof zVM.Activity) {
            return C56396yDv.copydefault(FfiConverterTypeAccountNetworkState.INSTANCE.mo9529allocationSizeI7RO_PI(((zVM.Activity) zvm).EZpvd()) + 4);
        }
        if (zvm instanceof zVM.Dialog) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zVM.Dialog) zvm).EZpvd()) + 4);
        }
        if (zvm instanceof zVM.LoaderManager) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zVM.LoaderManager) zvm).AEQbTJ()) + 4);
        }
        if (zvm instanceof zVM.FragmentManager) {
            return C56396yDv.copydefault(FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(((zVM.FragmentManager) zvm).EZpvd()) + 4);
        }
        if ((zvm instanceof zVM.TaskStackBuilder) || (zvm instanceof zVM.StateListAnimator) || (zvm instanceof zVM.PendingIntent) || (zvm instanceof zVM.Application) || (zvm instanceof zVM.Fragment) || (zvm instanceof zVM.TaskDescription)) {
            return 4L;
        }
        if (!(zvm instanceof zVM.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zVM.ActionBar) zvm).KWHzl()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zVM zvm, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zvm, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (zvm instanceof zVM.Activity) {
            byteBuffer.putInt(1);
            FfiConverterTypeAccountNetworkState.INSTANCE.write(((zVM.Activity) zvm).EZpvd(), byteBuffer);
        } else if (zvm instanceof zVM.Dialog) {
            byteBuffer.putInt(2);
            FfiConverterString.INSTANCE.write(((zVM.Dialog) zvm).EZpvd(), byteBuffer);
        } else if (zvm instanceof zVM.LoaderManager) {
            byteBuffer.putInt(3);
            FfiConverterString.INSTANCE.write(((zVM.LoaderManager) zvm).AEQbTJ(), byteBuffer);
        } else if (zvm instanceof zVM.FragmentManager) {
            byteBuffer.putInt(4);
            FfiConverterOptionalString.INSTANCE.write(((zVM.FragmentManager) zvm).EZpvd(), byteBuffer);
        } else if (zvm instanceof zVM.TaskStackBuilder) {
            byteBuffer.putInt(5);
        } else if (zvm instanceof zVM.StateListAnimator) {
            byteBuffer.putInt(6);
        } else if (zvm instanceof zVM.PendingIntent) {
            byteBuffer.putInt(7);
        } else if (zvm instanceof zVM.Application) {
            byteBuffer.putInt(8);
        } else if (zvm instanceof zVM.Fragment) {
            byteBuffer.putInt(9);
        } else if (zvm instanceof zVM.TaskDescription) {
            byteBuffer.putInt(10);
        } else {
            if (!(zvm instanceof zVM.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(11);
            FfiConverterString.INSTANCE.write(((zVM.ActionBar) zvm).KWHzl(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
