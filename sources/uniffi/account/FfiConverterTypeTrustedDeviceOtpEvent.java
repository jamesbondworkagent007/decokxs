package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC3161Agi;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeTrustedDeviceOtpEvent implements FfiConverterRustBuffer<AbstractC3161Agi> {
    public static final int $stable = 0;
    public static final FfiConverterTypeTrustedDeviceOtpEvent INSTANCE = new FfiConverterTypeTrustedDeviceOtpEvent();

    private FfiConverterTypeTrustedDeviceOtpEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC3161Agi lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC3161Agi) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC3161Agi liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC3161Agi) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC3161Agi abstractC3161Agi) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC3161Agi);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC3161Agi abstractC3161Agi) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC3161Agi);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC3161Agi read(@NotNull ByteBuffer byteBuffer) {
        AbstractC3161Agi stateListAnimator;
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new AbstractC3161Agi.ActionBar(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
        }
        if (i == 2) {
            stateListAnimator = new AbstractC3161Agi.StateListAnimator(FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), FfiConverterString.INSTANCE.read(byteBuffer));
        } else {
            if (i != 3) {
                if (i == 4) {
                    return AbstractC3161Agi.Activity.INSTANCE;
                }
                throw new RuntimeException("invalid enum value, something is very wrong!!");
            }
            stateListAnimator = new AbstractC3161Agi.TaskDescription(FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), FfiConverterString.INSTANCE.read(byteBuffer));
        }
        return stateListAnimator;
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC3161Agi abstractC3161Agi) {
        Intrinsics.checkNotNullParameter(abstractC3161Agi, "");
        if (abstractC3161Agi instanceof AbstractC3161Agi.ActionBar) {
            return C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(((AbstractC3161Agi.ActionBar) abstractC3161Agi).copydefault()) + 4);
        }
        if (abstractC3161Agi instanceof AbstractC3161Agi.StateListAnimator) {
            AbstractC3161Agi.StateListAnimator stateListAnimator = (AbstractC3161Agi.StateListAnimator) abstractC3161Agi;
            return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(stateListAnimator.copydefault()) + 4) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(stateListAnimator.OLrzqt()));
        }
        if (abstractC3161Agi instanceof AbstractC3161Agi.TaskDescription) {
            AbstractC3161Agi.TaskDescription taskDescription = (AbstractC3161Agi.TaskDescription) abstractC3161Agi;
            return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(taskDescription.OLrzqt()) + 4) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(taskDescription.EZpvd()));
        }
        if (abstractC3161Agi instanceof AbstractC3161Agi.Activity) {
            return 4L;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC3161Agi abstractC3161Agi, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC3161Agi, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC3161Agi instanceof AbstractC3161Agi.ActionBar) {
            byteBuffer.putInt(1);
            FfiConverterBoolean.INSTANCE.write(((AbstractC3161Agi.ActionBar) abstractC3161Agi).copydefault(), byteBuffer);
        } else if (abstractC3161Agi instanceof AbstractC3161Agi.StateListAnimator) {
            byteBuffer.putInt(2);
            AbstractC3161Agi.StateListAnimator stateListAnimator = (AbstractC3161Agi.StateListAnimator) abstractC3161Agi;
            FfiConverterInt.INSTANCE.write(stateListAnimator.copydefault(), byteBuffer);
            FfiConverterString.INSTANCE.write(stateListAnimator.OLrzqt(), byteBuffer);
        } else if (abstractC3161Agi instanceof AbstractC3161Agi.TaskDescription) {
            byteBuffer.putInt(3);
            AbstractC3161Agi.TaskDescription taskDescription = (AbstractC3161Agi.TaskDescription) abstractC3161Agi;
            FfiConverterInt.INSTANCE.write(taskDescription.OLrzqt(), byteBuffer);
            FfiConverterString.INSTANCE.write(taskDescription.EZpvd(), byteBuffer);
        } else {
            if (!(abstractC3161Agi instanceof AbstractC3161Agi.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(4);
        }
        Unit unit = Unit.INSTANCE;
    }
}
