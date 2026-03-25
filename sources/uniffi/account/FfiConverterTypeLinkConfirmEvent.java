package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58417zBp;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeLinkConfirmEvent implements FfiConverterRustBuffer<AbstractC58417zBp> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLinkConfirmEvent INSTANCE = new FfiConverterTypeLinkConfirmEvent();

    private FfiConverterTypeLinkConfirmEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC58417zBp lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58417zBp) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58417zBp liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58417zBp) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC58417zBp abstractC58417zBp) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC58417zBp);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC58417zBp abstractC58417zBp) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC58417zBp);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58417zBp read(@NotNull ByteBuffer byteBuffer) {
        AbstractC58417zBp fragment;
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        switch (byteBuffer.getInt()) {
            case 1:
                fragment = new AbstractC58417zBp.Fragment(FfiConverterTypeAccountNetworkState.INSTANCE.read(byteBuffer));
                break;
            case 2:
                FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
                fragment = new AbstractC58417zBp.Application(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
                break;
            case 3:
                fragment = new AbstractC58417zBp.StateListAnimator(FfiConverterString.INSTANCE.read(byteBuffer));
                break;
            case 4:
                FfiConverterString ffiConverterString2 = FfiConverterString.INSTANCE;
                fragment = new AbstractC58417zBp.ActionBar(ffiConverterString2.read(byteBuffer), ffiConverterString2.read(byteBuffer));
                break;
            case 5:
                return AbstractC58417zBp.TaskDescription.INSTANCE;
            case 6:
                fragment = new AbstractC58417zBp.Activity(FfiConverterString.INSTANCE.read(byteBuffer));
                break;
            case 7:
                return AbstractC58417zBp.Dialog.INSTANCE;
            case 8:
                return AbstractC58417zBp.PendingIntent.INSTANCE;
            default:
                throw new RuntimeException("invalid enum value, something is very wrong!!");
        }
        return fragment;
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC58417zBp abstractC58417zBp) {
        Intrinsics.checkNotNullParameter(abstractC58417zBp, "");
        if (abstractC58417zBp instanceof AbstractC58417zBp.Fragment) {
            return C56396yDv.copydefault(FfiConverterTypeAccountNetworkState.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58417zBp.Fragment) abstractC58417zBp).KWHzl()) + 4);
        }
        if (abstractC58417zBp instanceof AbstractC58417zBp.Application) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            AbstractC58417zBp.Application application = (AbstractC58417zBp.Application) abstractC58417zBp;
            return C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(application.copydefault()) + 4) + ffiConverterString.mo9529allocationSizeI7RO_PI(application.EZpvd()));
        }
        if (abstractC58417zBp instanceof AbstractC58417zBp.StateListAnimator) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58417zBp.StateListAnimator) abstractC58417zBp).copydefault()) + 4);
        }
        if (abstractC58417zBp instanceof AbstractC58417zBp.ActionBar) {
            FfiConverterString ffiConverterString2 = FfiConverterString.INSTANCE;
            AbstractC58417zBp.ActionBar actionBar = (AbstractC58417zBp.ActionBar) abstractC58417zBp;
            return C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString2.mo9529allocationSizeI7RO_PI(actionBar.AEQbTJ()) + 4) + ffiConverterString2.mo9529allocationSizeI7RO_PI(actionBar.copydefault()));
        }
        if (abstractC58417zBp instanceof AbstractC58417zBp.TaskDescription) {
            return 4L;
        }
        if (abstractC58417zBp instanceof AbstractC58417zBp.Activity) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58417zBp.Activity) abstractC58417zBp).KWHzl()) + 4);
        }
        if ((abstractC58417zBp instanceof AbstractC58417zBp.Dialog) || (abstractC58417zBp instanceof AbstractC58417zBp.PendingIntent)) {
            return 4L;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC58417zBp abstractC58417zBp, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC58417zBp, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC58417zBp instanceof AbstractC58417zBp.Fragment) {
            byteBuffer.putInt(1);
            FfiConverterTypeAccountNetworkState.INSTANCE.write(((AbstractC58417zBp.Fragment) abstractC58417zBp).KWHzl(), byteBuffer);
        } else if (abstractC58417zBp instanceof AbstractC58417zBp.Application) {
            byteBuffer.putInt(2);
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            AbstractC58417zBp.Application application = (AbstractC58417zBp.Application) abstractC58417zBp;
            ffiConverterString.write(application.copydefault(), byteBuffer);
            ffiConverterString.write(application.EZpvd(), byteBuffer);
        } else if (abstractC58417zBp instanceof AbstractC58417zBp.StateListAnimator) {
            byteBuffer.putInt(3);
            FfiConverterString.INSTANCE.write(((AbstractC58417zBp.StateListAnimator) abstractC58417zBp).copydefault(), byteBuffer);
        } else if (abstractC58417zBp instanceof AbstractC58417zBp.ActionBar) {
            byteBuffer.putInt(4);
            FfiConverterString ffiConverterString2 = FfiConverterString.INSTANCE;
            AbstractC58417zBp.ActionBar actionBar = (AbstractC58417zBp.ActionBar) abstractC58417zBp;
            ffiConverterString2.write(actionBar.AEQbTJ(), byteBuffer);
            ffiConverterString2.write(actionBar.copydefault(), byteBuffer);
        } else if (abstractC58417zBp instanceof AbstractC58417zBp.TaskDescription) {
            byteBuffer.putInt(5);
        } else if (abstractC58417zBp instanceof AbstractC58417zBp.Activity) {
            byteBuffer.putInt(6);
            FfiConverterString.INSTANCE.write(((AbstractC58417zBp.Activity) abstractC58417zBp).KWHzl(), byteBuffer);
        } else if (abstractC58417zBp instanceof AbstractC58417zBp.Dialog) {
            byteBuffer.putInt(7);
        } else {
            if (!(abstractC58417zBp instanceof AbstractC58417zBp.PendingIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(8);
        }
        Unit unit = Unit.INSTANCE;
    }
}
