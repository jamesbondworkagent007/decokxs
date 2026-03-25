package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58950zVm;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeOtpType implements FfiConverterRustBuffer<AbstractC58950zVm> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOtpType INSTANCE = new FfiConverterTypeOtpType();

    private FfiConverterTypeOtpType() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC58950zVm lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58950zVm) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58950zVm liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58950zVm) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC58950zVm abstractC58950zVm) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC58950zVm);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC58950zVm abstractC58950zVm) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC58950zVm);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58950zVm read(@NotNull ByteBuffer byteBuffer) {
        AbstractC58950zVm activity;
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            activity = new AbstractC58950zVm.Activity(FfiConverterString.INSTANCE.read(byteBuffer));
        } else if (i == 2) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            activity = new AbstractC58950zVm.TaskDescription(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
        } else {
            if (i != 3) {
                if (i == 4) {
                    return AbstractC58950zVm.ActionBar.INSTANCE;
                }
                if (i == 5) {
                    return AbstractC58950zVm.StateListAnimator.INSTANCE;
                }
                throw new RuntimeException("invalid enum value, something is very wrong!!");
            }
            FfiConverterString ffiConverterString2 = FfiConverterString.INSTANCE;
            activity = new AbstractC58950zVm.Application(ffiConverterString2.read(byteBuffer), ffiConverterString2.read(byteBuffer));
        }
        return activity;
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC58950zVm abstractC58950zVm) {
        Intrinsics.checkNotNullParameter(abstractC58950zVm, "");
        if (abstractC58950zVm instanceof AbstractC58950zVm.Activity) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58950zVm.Activity) abstractC58950zVm).EZpvd()) + 4);
        }
        if (abstractC58950zVm instanceof AbstractC58950zVm.TaskDescription) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            AbstractC58950zVm.TaskDescription taskDescription = (AbstractC58950zVm.TaskDescription) abstractC58950zVm;
            return C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(taskDescription.copydefault()) + 4) + ffiConverterString.mo9529allocationSizeI7RO_PI(taskDescription.AEQbTJ()));
        }
        if (abstractC58950zVm instanceof AbstractC58950zVm.Application) {
            FfiConverterString ffiConverterString2 = FfiConverterString.INSTANCE;
            AbstractC58950zVm.Application application = (AbstractC58950zVm.Application) abstractC58950zVm;
            return C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString2.mo9529allocationSizeI7RO_PI(application.KWHzl()) + 4) + ffiConverterString2.mo9529allocationSizeI7RO_PI(application.EZpvd()));
        }
        if ((abstractC58950zVm instanceof AbstractC58950zVm.ActionBar) || (abstractC58950zVm instanceof AbstractC58950zVm.StateListAnimator)) {
            return 4L;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC58950zVm abstractC58950zVm, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC58950zVm, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC58950zVm instanceof AbstractC58950zVm.Activity) {
            byteBuffer.putInt(1);
            FfiConverterString.INSTANCE.write(((AbstractC58950zVm.Activity) abstractC58950zVm).EZpvd(), byteBuffer);
        } else if (abstractC58950zVm instanceof AbstractC58950zVm.TaskDescription) {
            byteBuffer.putInt(2);
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            AbstractC58950zVm.TaskDescription taskDescription = (AbstractC58950zVm.TaskDescription) abstractC58950zVm;
            ffiConverterString.write(taskDescription.copydefault(), byteBuffer);
            ffiConverterString.write(taskDescription.AEQbTJ(), byteBuffer);
        } else if (abstractC58950zVm instanceof AbstractC58950zVm.Application) {
            byteBuffer.putInt(3);
            FfiConverterString ffiConverterString2 = FfiConverterString.INSTANCE;
            AbstractC58950zVm.Application application = (AbstractC58950zVm.Application) abstractC58950zVm;
            ffiConverterString2.write(application.KWHzl(), byteBuffer);
            ffiConverterString2.write(application.EZpvd(), byteBuffer);
        } else if (abstractC58950zVm instanceof AbstractC58950zVm.ActionBar) {
            byteBuffer.putInt(4);
        } else {
            if (!(abstractC58950zVm instanceof AbstractC58950zVm.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(5);
        }
        Unit unit = Unit.INSTANCE;
    }
}
