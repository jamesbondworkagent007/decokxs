package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC2958Acr;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeRegisterOTPEvent implements FfiConverterRustBuffer<AbstractC2958Acr> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegisterOTPEvent INSTANCE = new FfiConverterTypeRegisterOTPEvent();

    private FfiConverterTypeRegisterOTPEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC2958Acr lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC2958Acr) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC2958Acr liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC2958Acr) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC2958Acr abstractC2958Acr) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC2958Acr);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC2958Acr abstractC2958Acr) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC2958Acr);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC2958Acr read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new AbstractC2958Acr.TaskDescription(FfiConverterTypeVerifyCodeState.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return AbstractC2958Acr.ActionBar.INSTANCE;
        }
        if (i == 3) {
            return new AbstractC2958Acr.Activity(FfiConverterInt.INSTANCE.read(byteBuffer).intValue());
        }
        if (i == 4) {
            return new AbstractC2958Acr.StateListAnimator(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC2958Acr abstractC2958Acr) {
        Intrinsics.checkNotNullParameter(abstractC2958Acr, "");
        if (abstractC2958Acr instanceof AbstractC2958Acr.TaskDescription) {
            return C56396yDv.copydefault(FfiConverterTypeVerifyCodeState.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC2958Acr.TaskDescription) abstractC2958Acr).OLrzqt()) + 4);
        }
        if (abstractC2958Acr instanceof AbstractC2958Acr.ActionBar) {
            return 4L;
        }
        if (abstractC2958Acr instanceof AbstractC2958Acr.Activity) {
            return C56396yDv.copydefault(FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(((AbstractC2958Acr.Activity) abstractC2958Acr).OLrzqt()) + 4);
        }
        if (!(abstractC2958Acr instanceof AbstractC2958Acr.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(((AbstractC2958Acr.StateListAnimator) abstractC2958Acr).AEQbTJ()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC2958Acr abstractC2958Acr, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC2958Acr, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC2958Acr instanceof AbstractC2958Acr.TaskDescription) {
            byteBuffer.putInt(1);
            FfiConverterTypeVerifyCodeState.INSTANCE.write(((AbstractC2958Acr.TaskDescription) abstractC2958Acr).OLrzqt(), byteBuffer);
        } else if (abstractC2958Acr instanceof AbstractC2958Acr.ActionBar) {
            byteBuffer.putInt(2);
        } else if (abstractC2958Acr instanceof AbstractC2958Acr.Activity) {
            byteBuffer.putInt(3);
            FfiConverterInt.INSTANCE.write(((AbstractC2958Acr.Activity) abstractC2958Acr).OLrzqt(), byteBuffer);
        } else {
            if (!(abstractC2958Acr instanceof AbstractC2958Acr.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(4);
            FfiConverterBoolean.INSTANCE.write(((AbstractC2958Acr.StateListAnimator) abstractC2958Acr).AEQbTJ(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
