package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC3100Afa;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeSecurityNavigation implements FfiConverterRustBuffer<AbstractC3100Afa> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSecurityNavigation INSTANCE = new FfiConverterTypeSecurityNavigation();

    private FfiConverterTypeSecurityNavigation() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC3100Afa lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC3100Afa) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC3100Afa liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC3100Afa) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC3100Afa abstractC3100Afa) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC3100Afa);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC3100Afa abstractC3100Afa) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC3100Afa);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC3100Afa read(@NotNull ByteBuffer byteBuffer) {
        AbstractC3100Afa broadcastReceiver;
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        switch (byteBuffer.getInt()) {
            case 1:
                return AbstractC3100Afa.StateListAnimator.INSTANCE;
            case 2:
                FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
                broadcastReceiver = new AbstractC3100Afa.BroadcastReceiver(ffiConverterInt.read(byteBuffer).intValue(), ffiConverterInt.read(byteBuffer).intValue());
                break;
            case 3:
                broadcastReceiver = new AbstractC3100Afa.VoiceInteractor(FfiConverterOptionalString.INSTANCE.read(byteBuffer));
                break;
            case 4:
                return AbstractC3100Afa.SharedElementCallback.INSTANCE;
            case 5:
                return AbstractC3100Afa.ComponentCallbacks2.INSTANCE;
            case 6:
                return AbstractC3100Afa.ComponentCallbacks.INSTANCE;
            case 7:
                return AbstractC3100Afa.ClipData.INSTANCE;
            case 8:
                return AbstractC3100Afa.ComponentName.INSTANCE;
            case 9:
                return AbstractC3100Afa.AssistContent.INSTANCE;
            case 10:
                return AbstractC3100Afa.LoaderManager.INSTANCE;
            case 11:
                return AbstractC3100Afa.TaskStackBuilder.INSTANCE;
            case 12:
                return AbstractC3100Afa.Dialog.INSTANCE;
            case 13:
                return AbstractC3100Afa.Activity.INSTANCE;
            case 14:
                return AbstractC3100Afa.ActionBar.INSTANCE;
            case 15:
                return AbstractC3100Afa.Application.INSTANCE;
            case 16:
                return AbstractC3100Afa.FragmentManager.INSTANCE;
            case 17:
                broadcastReceiver = new AbstractC3100Afa.PendingIntent(FfiConverterTypeDexAccountStatus.INSTANCE.read(byteBuffer));
                break;
            case 18:
                return AbstractC3100Afa.PictureInPictureParams.INSTANCE;
            case 19:
                return AbstractC3100Afa.Fragment.INSTANCE;
            case 20:
                return AbstractC3100Afa.TaskDescription.INSTANCE;
            default:
                throw new RuntimeException("invalid enum value, something is very wrong!!");
        }
        return broadcastReceiver;
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC3100Afa abstractC3100Afa) {
        Intrinsics.checkNotNullParameter(abstractC3100Afa, "");
        if (abstractC3100Afa instanceof AbstractC3100Afa.StateListAnimator) {
            return 4L;
        }
        if (abstractC3100Afa instanceof AbstractC3100Afa.BroadcastReceiver) {
            FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
            AbstractC3100Afa.BroadcastReceiver broadcastReceiver = (AbstractC3100Afa.BroadcastReceiver) abstractC3100Afa;
            return C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterInt.m9536allocationSizeI7RO_PI(broadcastReceiver.copydefault()) + 4) + ffiConverterInt.m9536allocationSizeI7RO_PI(broadcastReceiver.OLrzqt()));
        }
        if (abstractC3100Afa instanceof AbstractC3100Afa.VoiceInteractor) {
            return C56396yDv.copydefault(FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC3100Afa.VoiceInteractor) abstractC3100Afa).OLrzqt()) + 4);
        }
        if ((abstractC3100Afa instanceof AbstractC3100Afa.SharedElementCallback) || (abstractC3100Afa instanceof AbstractC3100Afa.ComponentCallbacks2) || (abstractC3100Afa instanceof AbstractC3100Afa.ComponentCallbacks) || (abstractC3100Afa instanceof AbstractC3100Afa.ClipData) || (abstractC3100Afa instanceof AbstractC3100Afa.ComponentName) || (abstractC3100Afa instanceof AbstractC3100Afa.AssistContent) || (abstractC3100Afa instanceof AbstractC3100Afa.LoaderManager) || (abstractC3100Afa instanceof AbstractC3100Afa.TaskStackBuilder) || (abstractC3100Afa instanceof AbstractC3100Afa.Dialog) || (abstractC3100Afa instanceof AbstractC3100Afa.Activity) || (abstractC3100Afa instanceof AbstractC3100Afa.ActionBar) || (abstractC3100Afa instanceof AbstractC3100Afa.Application) || (abstractC3100Afa instanceof AbstractC3100Afa.FragmentManager)) {
            return 4L;
        }
        if (abstractC3100Afa instanceof AbstractC3100Afa.PendingIntent) {
            return C56396yDv.copydefault(FfiConverterTypeDexAccountStatus.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC3100Afa.PendingIntent) abstractC3100Afa).OLrzqt()) + 4);
        }
        if ((abstractC3100Afa instanceof AbstractC3100Afa.PictureInPictureParams) || (abstractC3100Afa instanceof AbstractC3100Afa.Fragment) || (abstractC3100Afa instanceof AbstractC3100Afa.TaskDescription)) {
            return 4L;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC3100Afa abstractC3100Afa, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC3100Afa, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC3100Afa instanceof AbstractC3100Afa.StateListAnimator) {
            byteBuffer.putInt(1);
        } else if (abstractC3100Afa instanceof AbstractC3100Afa.BroadcastReceiver) {
            byteBuffer.putInt(2);
            FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
            AbstractC3100Afa.BroadcastReceiver broadcastReceiver = (AbstractC3100Afa.BroadcastReceiver) abstractC3100Afa;
            ffiConverterInt.write(broadcastReceiver.copydefault(), byteBuffer);
            ffiConverterInt.write(broadcastReceiver.OLrzqt(), byteBuffer);
        } else if (abstractC3100Afa instanceof AbstractC3100Afa.VoiceInteractor) {
            byteBuffer.putInt(3);
            FfiConverterOptionalString.INSTANCE.write(((AbstractC3100Afa.VoiceInteractor) abstractC3100Afa).OLrzqt(), byteBuffer);
        } else if (abstractC3100Afa instanceof AbstractC3100Afa.SharedElementCallback) {
            byteBuffer.putInt(4);
        } else if (abstractC3100Afa instanceof AbstractC3100Afa.ComponentCallbacks2) {
            byteBuffer.putInt(5);
        } else if (abstractC3100Afa instanceof AbstractC3100Afa.ComponentCallbacks) {
            byteBuffer.putInt(6);
        } else if (abstractC3100Afa instanceof AbstractC3100Afa.ClipData) {
            byteBuffer.putInt(7);
        } else if (abstractC3100Afa instanceof AbstractC3100Afa.ComponentName) {
            byteBuffer.putInt(8);
        } else if (abstractC3100Afa instanceof AbstractC3100Afa.AssistContent) {
            byteBuffer.putInt(9);
        } else if (abstractC3100Afa instanceof AbstractC3100Afa.LoaderManager) {
            byteBuffer.putInt(10);
        } else if (abstractC3100Afa instanceof AbstractC3100Afa.TaskStackBuilder) {
            byteBuffer.putInt(11);
        } else if (abstractC3100Afa instanceof AbstractC3100Afa.Dialog) {
            byteBuffer.putInt(12);
        } else if (abstractC3100Afa instanceof AbstractC3100Afa.Activity) {
            byteBuffer.putInt(13);
        } else if (abstractC3100Afa instanceof AbstractC3100Afa.ActionBar) {
            byteBuffer.putInt(14);
        } else if (abstractC3100Afa instanceof AbstractC3100Afa.Application) {
            byteBuffer.putInt(15);
        } else if (abstractC3100Afa instanceof AbstractC3100Afa.FragmentManager) {
            byteBuffer.putInt(16);
        } else if (abstractC3100Afa instanceof AbstractC3100Afa.PendingIntent) {
            byteBuffer.putInt(17);
            FfiConverterTypeDexAccountStatus.INSTANCE.write(((AbstractC3100Afa.PendingIntent) abstractC3100Afa).OLrzqt(), byteBuffer);
        } else if (abstractC3100Afa instanceof AbstractC3100Afa.PictureInPictureParams) {
            byteBuffer.putInt(18);
        } else if (abstractC3100Afa instanceof AbstractC3100Afa.Fragment) {
            byteBuffer.putInt(19);
        } else {
            if (!(abstractC3100Afa instanceof AbstractC3100Afa.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(20);
        }
        Unit unit = Unit.INSTANCE;
    }
}
