package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58469zDn;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeLoginJourneyEvent implements FfiConverterRustBuffer<AbstractC58469zDn> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLoginJourneyEvent INSTANCE = new FfiConverterTypeLoginJourneyEvent();

    private FfiConverterTypeLoginJourneyEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC58469zDn lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58469zDn) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58469zDn liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58469zDn) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC58469zDn abstractC58469zDn) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC58469zDn);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC58469zDn abstractC58469zDn) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC58469zDn);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58469zDn read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        switch (byteBuffer.getInt()) {
            case 1:
                return new AbstractC58469zDn.Dialog(FfiConverterString.INSTANCE.read(byteBuffer));
            case 2:
                return new AbstractC58469zDn.ActionBar(FfiConverterString.INSTANCE.read(byteBuffer));
            case 3:
                return new AbstractC58469zDn.TaskDescription(FfiConverterString.INSTANCE.read(byteBuffer));
            case 4:
                return new AbstractC58469zDn.Application(FfiConverterString.INSTANCE.read(byteBuffer));
            case 5:
                return new AbstractC58469zDn.StateListAnimator(FfiConverterString.INSTANCE.read(byteBuffer));
            case 6:
                return new AbstractC58469zDn.Activity(FfiConverterString.INSTANCE.read(byteBuffer));
            case 7:
                return new AbstractC58469zDn.PendingIntent(FfiConverterString.INSTANCE.read(byteBuffer));
            case 8:
                return new AbstractC58469zDn.Fragment(FfiConverterString.INSTANCE.read(byteBuffer));
            case 9:
                return AbstractC58469zDn.FragmentManager.INSTANCE;
            case 10:
                return new AbstractC58469zDn.LoaderManager(FfiConverterString.INSTANCE.read(byteBuffer));
            default:
                throw new RuntimeException("invalid enum value, something is very wrong!!");
        }
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC58469zDn abstractC58469zDn) {
        Intrinsics.checkNotNullParameter(abstractC58469zDn, "");
        if (abstractC58469zDn instanceof AbstractC58469zDn.Dialog) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58469zDn.Dialog) abstractC58469zDn).EZpvd()) + 4);
        }
        if (abstractC58469zDn instanceof AbstractC58469zDn.ActionBar) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58469zDn.ActionBar) abstractC58469zDn).AEQbTJ()) + 4);
        }
        if (abstractC58469zDn instanceof AbstractC58469zDn.TaskDescription) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58469zDn.TaskDescription) abstractC58469zDn).KWHzl()) + 4);
        }
        if (abstractC58469zDn instanceof AbstractC58469zDn.Application) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58469zDn.Application) abstractC58469zDn).copydefault()) + 4);
        }
        if (abstractC58469zDn instanceof AbstractC58469zDn.StateListAnimator) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58469zDn.StateListAnimator) abstractC58469zDn).copydefault()) + 4);
        }
        if (abstractC58469zDn instanceof AbstractC58469zDn.Activity) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58469zDn.Activity) abstractC58469zDn).EZpvd()) + 4);
        }
        if (abstractC58469zDn instanceof AbstractC58469zDn.PendingIntent) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58469zDn.PendingIntent) abstractC58469zDn).AEQbTJ()) + 4);
        }
        if (abstractC58469zDn instanceof AbstractC58469zDn.Fragment) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58469zDn.Fragment) abstractC58469zDn).KWHzl()) + 4);
        }
        if (abstractC58469zDn instanceof AbstractC58469zDn.FragmentManager) {
            return 4L;
        }
        if (!(abstractC58469zDn instanceof AbstractC58469zDn.LoaderManager)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58469zDn.LoaderManager) abstractC58469zDn).KWHzl()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC58469zDn abstractC58469zDn, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC58469zDn, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC58469zDn instanceof AbstractC58469zDn.Dialog) {
            byteBuffer.putInt(1);
            FfiConverterString.INSTANCE.write(((AbstractC58469zDn.Dialog) abstractC58469zDn).EZpvd(), byteBuffer);
        } else if (abstractC58469zDn instanceof AbstractC58469zDn.ActionBar) {
            byteBuffer.putInt(2);
            FfiConverterString.INSTANCE.write(((AbstractC58469zDn.ActionBar) abstractC58469zDn).AEQbTJ(), byteBuffer);
        } else if (abstractC58469zDn instanceof AbstractC58469zDn.TaskDescription) {
            byteBuffer.putInt(3);
            FfiConverterString.INSTANCE.write(((AbstractC58469zDn.TaskDescription) abstractC58469zDn).KWHzl(), byteBuffer);
        } else if (abstractC58469zDn instanceof AbstractC58469zDn.Application) {
            byteBuffer.putInt(4);
            FfiConverterString.INSTANCE.write(((AbstractC58469zDn.Application) abstractC58469zDn).copydefault(), byteBuffer);
        } else if (abstractC58469zDn instanceof AbstractC58469zDn.StateListAnimator) {
            byteBuffer.putInt(5);
            FfiConverterString.INSTANCE.write(((AbstractC58469zDn.StateListAnimator) abstractC58469zDn).copydefault(), byteBuffer);
        } else if (abstractC58469zDn instanceof AbstractC58469zDn.Activity) {
            byteBuffer.putInt(6);
            FfiConverterString.INSTANCE.write(((AbstractC58469zDn.Activity) abstractC58469zDn).EZpvd(), byteBuffer);
        } else if (abstractC58469zDn instanceof AbstractC58469zDn.PendingIntent) {
            byteBuffer.putInt(7);
            FfiConverterString.INSTANCE.write(((AbstractC58469zDn.PendingIntent) abstractC58469zDn).AEQbTJ(), byteBuffer);
        } else if (abstractC58469zDn instanceof AbstractC58469zDn.Fragment) {
            byteBuffer.putInt(8);
            FfiConverterString.INSTANCE.write(((AbstractC58469zDn.Fragment) abstractC58469zDn).KWHzl(), byteBuffer);
        } else if (abstractC58469zDn instanceof AbstractC58469zDn.FragmentManager) {
            byteBuffer.putInt(9);
        } else {
            if (!(abstractC58469zDn instanceof AbstractC58469zDn.LoaderManager)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(10);
            FfiConverterString.INSTANCE.write(((AbstractC58469zDn.LoaderManager) abstractC58469zDn).KWHzl(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
