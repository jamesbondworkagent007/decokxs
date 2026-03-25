package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC60226zyj;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeAccountConnectStep implements FfiConverterRustBuffer<AbstractC60226zyj> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAccountConnectStep INSTANCE = new FfiConverterTypeAccountConnectStep();

    private FfiConverterTypeAccountConnectStep() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC60226zyj lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC60226zyj) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC60226zyj liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC60226zyj) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC60226zyj abstractC60226zyj) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC60226zyj);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC60226zyj abstractC60226zyj) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC60226zyj);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC60226zyj read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        switch (byteBuffer.getInt()) {
            case 1:
                return AbstractC60226zyj.Application.INSTANCE;
            case 2:
                FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
                return new AbstractC60226zyj.TaskDescription(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
            case 3:
                FfiConverterString ffiConverterString2 = FfiConverterString.INSTANCE;
                return new AbstractC60226zyj.ActionBar(ffiConverterString2.read(byteBuffer), ffiConverterString2.read(byteBuffer), ffiConverterString2.read(byteBuffer));
            case 4:
                return AbstractC60226zyj.Activity.INSTANCE;
            case 5:
                FfiConverterString ffiConverterString3 = FfiConverterString.INSTANCE;
                return new AbstractC60226zyj.StateListAnimator(ffiConverterString3.read(byteBuffer), ffiConverterString3.read(byteBuffer));
            case 6:
                return new AbstractC60226zyj.Dialog(FfiConverterString.INSTANCE.read(byteBuffer));
            case 7:
                return new AbstractC60226zyj.FragmentManager(FfiConverterString.INSTANCE.read(byteBuffer));
            default:
                throw new RuntimeException("invalid enum value, something is very wrong!!");
        }
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC60226zyj abstractC60226zyj) {
        Intrinsics.checkNotNullParameter(abstractC60226zyj, "");
        if (abstractC60226zyj instanceof AbstractC60226zyj.Application) {
            return 4L;
        }
        if (abstractC60226zyj instanceof AbstractC60226zyj.TaskDescription) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            AbstractC60226zyj.TaskDescription taskDescription = (AbstractC60226zyj.TaskDescription) abstractC60226zyj;
            return C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(taskDescription.OLrzqt()) + 4) + ffiConverterString.mo9529allocationSizeI7RO_PI(taskDescription.EZpvd()));
        }
        if (abstractC60226zyj instanceof AbstractC60226zyj.ActionBar) {
            FfiConverterString ffiConverterString2 = FfiConverterString.INSTANCE;
            AbstractC60226zyj.ActionBar actionBar = (AbstractC60226zyj.ActionBar) abstractC60226zyj;
            return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString2.mo9529allocationSizeI7RO_PI(actionBar.OLrzqt()) + 4) + ffiConverterString2.mo9529allocationSizeI7RO_PI(actionBar.copydefault())) + ffiConverterString2.mo9529allocationSizeI7RO_PI(actionBar.AEQbTJ()));
        }
        if (abstractC60226zyj instanceof AbstractC60226zyj.Activity) {
            return 4L;
        }
        if (abstractC60226zyj instanceof AbstractC60226zyj.StateListAnimator) {
            FfiConverterString ffiConverterString3 = FfiConverterString.INSTANCE;
            AbstractC60226zyj.StateListAnimator stateListAnimator = (AbstractC60226zyj.StateListAnimator) abstractC60226zyj;
            return C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString3.mo9529allocationSizeI7RO_PI(stateListAnimator.copydefault()) + 4) + ffiConverterString3.mo9529allocationSizeI7RO_PI(stateListAnimator.AEQbTJ()));
        }
        if (abstractC60226zyj instanceof AbstractC60226zyj.Dialog) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC60226zyj.Dialog) abstractC60226zyj).KWHzl()) + 4);
        }
        if (!(abstractC60226zyj instanceof AbstractC60226zyj.FragmentManager)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC60226zyj.FragmentManager) abstractC60226zyj).OLrzqt()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC60226zyj abstractC60226zyj, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC60226zyj, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC60226zyj instanceof AbstractC60226zyj.Application) {
            byteBuffer.putInt(1);
        } else if (abstractC60226zyj instanceof AbstractC60226zyj.TaskDescription) {
            byteBuffer.putInt(2);
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            AbstractC60226zyj.TaskDescription taskDescription = (AbstractC60226zyj.TaskDescription) abstractC60226zyj;
            ffiConverterString.write(taskDescription.OLrzqt(), byteBuffer);
            ffiConverterString.write(taskDescription.EZpvd(), byteBuffer);
        } else if (abstractC60226zyj instanceof AbstractC60226zyj.ActionBar) {
            byteBuffer.putInt(3);
            FfiConverterString ffiConverterString2 = FfiConverterString.INSTANCE;
            AbstractC60226zyj.ActionBar actionBar = (AbstractC60226zyj.ActionBar) abstractC60226zyj;
            ffiConverterString2.write(actionBar.OLrzqt(), byteBuffer);
            ffiConverterString2.write(actionBar.copydefault(), byteBuffer);
            ffiConverterString2.write(actionBar.AEQbTJ(), byteBuffer);
        } else if (abstractC60226zyj instanceof AbstractC60226zyj.Activity) {
            byteBuffer.putInt(4);
        } else if (abstractC60226zyj instanceof AbstractC60226zyj.StateListAnimator) {
            byteBuffer.putInt(5);
            FfiConverterString ffiConverterString3 = FfiConverterString.INSTANCE;
            AbstractC60226zyj.StateListAnimator stateListAnimator = (AbstractC60226zyj.StateListAnimator) abstractC60226zyj;
            ffiConverterString3.write(stateListAnimator.copydefault(), byteBuffer);
            ffiConverterString3.write(stateListAnimator.AEQbTJ(), byteBuffer);
        } else if (abstractC60226zyj instanceof AbstractC60226zyj.Dialog) {
            byteBuffer.putInt(6);
            FfiConverterString.INSTANCE.write(((AbstractC60226zyj.Dialog) abstractC60226zyj).KWHzl(), byteBuffer);
        } else {
            if (!(abstractC60226zyj instanceof AbstractC60226zyj.FragmentManager)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(7);
            FfiConverterString.INSTANCE.write(((AbstractC60226zyj.FragmentManager) abstractC60226zyj).OLrzqt(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
