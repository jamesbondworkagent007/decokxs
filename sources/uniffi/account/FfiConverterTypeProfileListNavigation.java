package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC2820AaL;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeProfileListNavigation implements FfiConverterRustBuffer<AbstractC2820AaL> {
    public static final int $stable = 0;
    public static final FfiConverterTypeProfileListNavigation INSTANCE = new FfiConverterTypeProfileListNavigation();

    private FfiConverterTypeProfileListNavigation() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC2820AaL lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC2820AaL) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC2820AaL liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC2820AaL) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC2820AaL abstractC2820AaL) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC2820AaL);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC2820AaL abstractC2820AaL) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC2820AaL);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC2820AaL read(@NotNull ByteBuffer byteBuffer) {
        AbstractC2820AaL voiceInteractor;
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        switch (byteBuffer.getInt()) {
            case 1:
                voiceInteractor = new AbstractC2820AaL.VoiceInteractor(FfiConverterTypeLocalString.INSTANCE.read(byteBuffer));
                break;
            case 2:
                voiceInteractor = new AbstractC2820AaL.AssistContent(FfiConverterString.INSTANCE.read(byteBuffer));
                break;
            case 3:
                return new AbstractC2820AaL.Activity(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), FfiConverterTypeAlternateAccountInformationResponse.INSTANCE.read(byteBuffer));
            case 4:
                return new AbstractC2820AaL.Application(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), FfiConverterTypePopup.INSTANCE.read(byteBuffer), FfiConverterTypeAlternateAccountInformationResponse.INSTANCE.read(byteBuffer));
            case 5:
                return AbstractC2820AaL.TaskDescription.INSTANCE;
            case 6:
                return AbstractC2820AaL.StateListAnimator.INSTANCE;
            case 7:
                return AbstractC2820AaL.LoaderManager.INSTANCE;
            case 8:
                return AbstractC2820AaL.ActionBar.INSTANCE;
            case 9:
                return AbstractC2820AaL.Dialog.INSTANCE;
            case 10:
                return AbstractC2820AaL.PictureInPictureParams.INSTANCE;
            case 11:
                return AbstractC2820AaL.PendingIntent.INSTANCE;
            case 12:
                return AbstractC2820AaL.FragmentManager.INSTANCE;
            case 13:
                voiceInteractor = new AbstractC2820AaL.SharedElementCallback(FfiConverterString.INSTANCE.read(byteBuffer));
                break;
            case 14:
                return AbstractC2820AaL.Fragment.INSTANCE;
            default:
                throw new RuntimeException("invalid enum value, something is very wrong!!");
        }
        return voiceInteractor;
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC2820AaL abstractC2820AaL) {
        Intrinsics.checkNotNullParameter(abstractC2820AaL, "");
        if (abstractC2820AaL instanceof AbstractC2820AaL.VoiceInteractor) {
            return C56396yDv.copydefault(FfiConverterTypeLocalString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC2820AaL.VoiceInteractor) abstractC2820AaL).OLrzqt()) + 4);
        }
        if (abstractC2820AaL instanceof AbstractC2820AaL.AssistContent) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC2820AaL.AssistContent) abstractC2820AaL).AEQbTJ()) + 4);
        }
        if (abstractC2820AaL instanceof AbstractC2820AaL.Activity) {
            AbstractC2820AaL.Activity activity = (AbstractC2820AaL.Activity) abstractC2820AaL;
            return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(activity.AEQbTJ()) + 4) + FfiConverterTypeAlternateAccountInformationResponse.INSTANCE.mo9529allocationSizeI7RO_PI(activity.EZpvd()));
        }
        if (abstractC2820AaL instanceof AbstractC2820AaL.Application) {
            AbstractC2820AaL.Application application = (AbstractC2820AaL.Application) abstractC2820AaL;
            return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(application.EZpvd()) + 4) + FfiConverterTypePopup.INSTANCE.mo9529allocationSizeI7RO_PI(application.copydefault())) + FfiConverterTypeAlternateAccountInformationResponse.INSTANCE.mo9529allocationSizeI7RO_PI(application.OLrzqt()));
        }
        if ((abstractC2820AaL instanceof AbstractC2820AaL.TaskDescription) || (abstractC2820AaL instanceof AbstractC2820AaL.StateListAnimator) || (abstractC2820AaL instanceof AbstractC2820AaL.LoaderManager) || (abstractC2820AaL instanceof AbstractC2820AaL.ActionBar) || (abstractC2820AaL instanceof AbstractC2820AaL.Dialog) || (abstractC2820AaL instanceof AbstractC2820AaL.PictureInPictureParams) || (abstractC2820AaL instanceof AbstractC2820AaL.PendingIntent) || (abstractC2820AaL instanceof AbstractC2820AaL.FragmentManager)) {
            return 4L;
        }
        if (abstractC2820AaL instanceof AbstractC2820AaL.SharedElementCallback) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC2820AaL.SharedElementCallback) abstractC2820AaL).copydefault()) + 4);
        }
        if (abstractC2820AaL instanceof AbstractC2820AaL.Fragment) {
            return 4L;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC2820AaL abstractC2820AaL, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC2820AaL, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC2820AaL instanceof AbstractC2820AaL.VoiceInteractor) {
            byteBuffer.putInt(1);
            FfiConverterTypeLocalString.INSTANCE.write(((AbstractC2820AaL.VoiceInteractor) abstractC2820AaL).OLrzqt(), byteBuffer);
        } else if (abstractC2820AaL instanceof AbstractC2820AaL.AssistContent) {
            byteBuffer.putInt(2);
            FfiConverterString.INSTANCE.write(((AbstractC2820AaL.AssistContent) abstractC2820AaL).AEQbTJ(), byteBuffer);
        } else if (abstractC2820AaL instanceof AbstractC2820AaL.Activity) {
            byteBuffer.putInt(3);
            AbstractC2820AaL.Activity activity = (AbstractC2820AaL.Activity) abstractC2820AaL;
            FfiConverterBoolean.INSTANCE.write(activity.AEQbTJ(), byteBuffer);
            FfiConverterTypeAlternateAccountInformationResponse.INSTANCE.write(activity.EZpvd(), byteBuffer);
        } else if (abstractC2820AaL instanceof AbstractC2820AaL.Application) {
            byteBuffer.putInt(4);
            AbstractC2820AaL.Application application = (AbstractC2820AaL.Application) abstractC2820AaL;
            FfiConverterBoolean.INSTANCE.write(application.EZpvd(), byteBuffer);
            FfiConverterTypePopup.INSTANCE.write(application.copydefault(), byteBuffer);
            FfiConverterTypeAlternateAccountInformationResponse.INSTANCE.write(application.OLrzqt(), byteBuffer);
        } else if (abstractC2820AaL instanceof AbstractC2820AaL.TaskDescription) {
            byteBuffer.putInt(5);
        } else if (abstractC2820AaL instanceof AbstractC2820AaL.StateListAnimator) {
            byteBuffer.putInt(6);
        } else if (abstractC2820AaL instanceof AbstractC2820AaL.LoaderManager) {
            byteBuffer.putInt(7);
        } else if (abstractC2820AaL instanceof AbstractC2820AaL.ActionBar) {
            byteBuffer.putInt(8);
        } else if (abstractC2820AaL instanceof AbstractC2820AaL.Dialog) {
            byteBuffer.putInt(9);
        } else if (abstractC2820AaL instanceof AbstractC2820AaL.PictureInPictureParams) {
            byteBuffer.putInt(10);
        } else if (abstractC2820AaL instanceof AbstractC2820AaL.PendingIntent) {
            byteBuffer.putInt(11);
        } else if (abstractC2820AaL instanceof AbstractC2820AaL.FragmentManager) {
            byteBuffer.putInt(12);
        } else if (abstractC2820AaL instanceof AbstractC2820AaL.SharedElementCallback) {
            byteBuffer.putInt(13);
            FfiConverterString.INSTANCE.write(((AbstractC2820AaL.SharedElementCallback) abstractC2820AaL).copydefault(), byteBuffer);
        } else {
            if (!(abstractC2820AaL instanceof AbstractC2820AaL.Fragment)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(14);
        }
        Unit unit = Unit.INSTANCE;
    }
}
