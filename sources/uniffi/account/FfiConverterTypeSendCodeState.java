package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC3107Afh;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeSendCodeState implements FfiConverterRustBuffer<AbstractC3107Afh> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSendCodeState INSTANCE = new FfiConverterTypeSendCodeState();

    private FfiConverterTypeSendCodeState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC3107Afh lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC3107Afh) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC3107Afh liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC3107Afh) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC3107Afh abstractC3107Afh) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC3107Afh);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC3107Afh abstractC3107Afh) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC3107Afh);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC3107Afh read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return AbstractC3107Afh.Activity.INSTANCE;
        }
        if (i == 2) {
            return AbstractC3107Afh.Application.INSTANCE;
        }
        if (i == 3) {
            return new AbstractC3107Afh.ActionBar(FfiConverterInt.INSTANCE.read(byteBuffer).intValue());
        }
        if (i == 4) {
            return new AbstractC3107Afh.TaskDescription(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), FfiConverterOptionalTypeSendCodeType.INSTANCE.read(byteBuffer));
        }
        if (i == 5) {
            return new AbstractC3107Afh.StateListAnimator(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), FfiConverterTypeAccountError.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC3107Afh abstractC3107Afh) {
        Intrinsics.checkNotNullParameter(abstractC3107Afh, "");
        if ((abstractC3107Afh instanceof AbstractC3107Afh.Activity) || (abstractC3107Afh instanceof AbstractC3107Afh.Application)) {
            return 4L;
        }
        if (abstractC3107Afh instanceof AbstractC3107Afh.ActionBar) {
            return C56396yDv.copydefault(FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(((AbstractC3107Afh.ActionBar) abstractC3107Afh).OLrzqt()) + 4);
        }
        if (abstractC3107Afh instanceof AbstractC3107Afh.TaskDescription) {
            AbstractC3107Afh.TaskDescription taskDescription = (AbstractC3107Afh.TaskDescription) abstractC3107Afh;
            return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(taskDescription.EZpvd()) + 4) + FfiConverterOptionalTypeSendCodeType.INSTANCE.mo9529allocationSizeI7RO_PI(taskDescription.copydefault()));
        }
        if (!(abstractC3107Afh instanceof AbstractC3107Afh.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC3107Afh.StateListAnimator stateListAnimator = (AbstractC3107Afh.StateListAnimator) abstractC3107Afh;
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(stateListAnimator.AEQbTJ()) + 4) + FfiConverterTypeAccountError.INSTANCE.mo9529allocationSizeI7RO_PI(stateListAnimator.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC3107Afh abstractC3107Afh, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC3107Afh, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC3107Afh instanceof AbstractC3107Afh.Activity) {
            byteBuffer.putInt(1);
        } else if (abstractC3107Afh instanceof AbstractC3107Afh.Application) {
            byteBuffer.putInt(2);
        } else if (abstractC3107Afh instanceof AbstractC3107Afh.ActionBar) {
            byteBuffer.putInt(3);
            FfiConverterInt.INSTANCE.write(((AbstractC3107Afh.ActionBar) abstractC3107Afh).OLrzqt(), byteBuffer);
        } else if (abstractC3107Afh instanceof AbstractC3107Afh.TaskDescription) {
            byteBuffer.putInt(4);
            AbstractC3107Afh.TaskDescription taskDescription = (AbstractC3107Afh.TaskDescription) abstractC3107Afh;
            FfiConverterBoolean.INSTANCE.write(taskDescription.EZpvd(), byteBuffer);
            FfiConverterOptionalTypeSendCodeType.INSTANCE.write(taskDescription.copydefault(), byteBuffer);
        } else {
            if (!(abstractC3107Afh instanceof AbstractC3107Afh.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(5);
            AbstractC3107Afh.StateListAnimator stateListAnimator = (AbstractC3107Afh.StateListAnimator) abstractC3107Afh;
            FfiConverterBoolean.INSTANCE.write(stateListAnimator.AEQbTJ(), byteBuffer);
            FfiConverterTypeAccountError.INSTANCE.write(stateListAnimator.OLrzqt(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
