package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC60205zyO;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeAuthorizeResult implements FfiConverterRustBuffer<AbstractC60205zyO> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAuthorizeResult INSTANCE = new FfiConverterTypeAuthorizeResult();

    private FfiConverterTypeAuthorizeResult() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC60205zyO lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC60205zyO) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC60205zyO liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC60205zyO) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC60205zyO abstractC60205zyO) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC60205zyO);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC60205zyO abstractC60205zyO) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC60205zyO);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC60205zyO read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        switch (byteBuffer.getInt()) {
            case 1:
                return AbstractC60205zyO.Application.INSTANCE;
            case 2:
                return AbstractC60205zyO.Activity.INSTANCE;
            case 3:
                return new AbstractC60205zyO.StateListAnimator(FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), FfiConverterString.INSTANCE.read(byteBuffer));
            case 4:
                return new AbstractC60205zyO.TaskDescription(FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), FfiConverterString.INSTANCE.read(byteBuffer));
            case 5:
                return new AbstractC60205zyO.FragmentManager(FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), FfiConverterString.INSTANCE.read(byteBuffer));
            case 6:
                return new AbstractC60205zyO.ActionBar(FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), FfiConverterString.INSTANCE.read(byteBuffer));
            default:
                throw new RuntimeException("invalid enum value, something is very wrong!!");
        }
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC60205zyO abstractC60205zyO) {
        Intrinsics.checkNotNullParameter(abstractC60205zyO, "");
        if ((abstractC60205zyO instanceof AbstractC60205zyO.Application) || (abstractC60205zyO instanceof AbstractC60205zyO.Activity)) {
            return 4L;
        }
        if (abstractC60205zyO instanceof AbstractC60205zyO.StateListAnimator) {
            AbstractC60205zyO.StateListAnimator stateListAnimator = (AbstractC60205zyO.StateListAnimator) abstractC60205zyO;
            return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(stateListAnimator.KWHzl()) + 4) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(stateListAnimator.OLrzqt()));
        }
        if (abstractC60205zyO instanceof AbstractC60205zyO.TaskDescription) {
            AbstractC60205zyO.TaskDescription taskDescription = (AbstractC60205zyO.TaskDescription) abstractC60205zyO;
            return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(taskDescription.EZpvd()) + 4) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(taskDescription.AEQbTJ()));
        }
        if (abstractC60205zyO instanceof AbstractC60205zyO.FragmentManager) {
            AbstractC60205zyO.FragmentManager fragmentManager = (AbstractC60205zyO.FragmentManager) abstractC60205zyO;
            return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(fragmentManager.EZpvd()) + 4) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(fragmentManager.copydefault()));
        }
        if (!(abstractC60205zyO instanceof AbstractC60205zyO.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC60205zyO.ActionBar actionBar = (AbstractC60205zyO.ActionBar) abstractC60205zyO;
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(actionBar.KWHzl()) + 4) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(actionBar.copydefault()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC60205zyO abstractC60205zyO, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC60205zyO, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC60205zyO instanceof AbstractC60205zyO.Application) {
            byteBuffer.putInt(1);
        } else if (abstractC60205zyO instanceof AbstractC60205zyO.Activity) {
            byteBuffer.putInt(2);
        } else if (abstractC60205zyO instanceof AbstractC60205zyO.StateListAnimator) {
            byteBuffer.putInt(3);
            AbstractC60205zyO.StateListAnimator stateListAnimator = (AbstractC60205zyO.StateListAnimator) abstractC60205zyO;
            FfiConverterInt.INSTANCE.write(stateListAnimator.KWHzl(), byteBuffer);
            FfiConverterString.INSTANCE.write(stateListAnimator.OLrzqt(), byteBuffer);
        } else if (abstractC60205zyO instanceof AbstractC60205zyO.TaskDescription) {
            byteBuffer.putInt(4);
            AbstractC60205zyO.TaskDescription taskDescription = (AbstractC60205zyO.TaskDescription) abstractC60205zyO;
            FfiConverterInt.INSTANCE.write(taskDescription.EZpvd(), byteBuffer);
            FfiConverterString.INSTANCE.write(taskDescription.AEQbTJ(), byteBuffer);
        } else if (abstractC60205zyO instanceof AbstractC60205zyO.FragmentManager) {
            byteBuffer.putInt(5);
            AbstractC60205zyO.FragmentManager fragmentManager = (AbstractC60205zyO.FragmentManager) abstractC60205zyO;
            FfiConverterInt.INSTANCE.write(fragmentManager.EZpvd(), byteBuffer);
            FfiConverterString.INSTANCE.write(fragmentManager.copydefault(), byteBuffer);
        } else {
            if (!(abstractC60205zyO instanceof AbstractC60205zyO.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(6);
            AbstractC60205zyO.ActionBar actionBar = (AbstractC60205zyO.ActionBar) abstractC60205zyO;
            FfiConverterInt.INSTANCE.write(actionBar.KWHzl(), byteBuffer);
            FfiConverterString.INSTANCE.write(actionBar.copydefault(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
