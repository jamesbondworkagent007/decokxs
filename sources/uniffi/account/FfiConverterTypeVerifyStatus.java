package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC3255AiW;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeVerifyStatus implements FfiConverterRustBuffer<AbstractC3255AiW> {
    public static final int $stable = 0;
    public static final FfiConverterTypeVerifyStatus INSTANCE = new FfiConverterTypeVerifyStatus();

    private FfiConverterTypeVerifyStatus() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC3255AiW lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC3255AiW) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC3255AiW liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC3255AiW) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC3255AiW abstractC3255AiW) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC3255AiW);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC3255AiW abstractC3255AiW) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC3255AiW);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC3255AiW read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return AbstractC3255AiW.ActionBar.INSTANCE;
        }
        if (i == 2) {
            return AbstractC3255AiW.StateListAnimator.INSTANCE;
        }
        if (i == 3) {
            return AbstractC3255AiW.TaskDescription.INSTANCE;
        }
        if (i == 4) {
            return AbstractC3255AiW.Application.INSTANCE;
        }
        if (i == 5) {
            return new AbstractC3255AiW.Activity(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC3255AiW abstractC3255AiW) {
        Intrinsics.checkNotNullParameter(abstractC3255AiW, "");
        if ((abstractC3255AiW instanceof AbstractC3255AiW.ActionBar) || (abstractC3255AiW instanceof AbstractC3255AiW.StateListAnimator) || (abstractC3255AiW instanceof AbstractC3255AiW.TaskDescription) || (abstractC3255AiW instanceof AbstractC3255AiW.Application)) {
            return 4L;
        }
        if (!(abstractC3255AiW instanceof AbstractC3255AiW.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC3255AiW.Activity) abstractC3255AiW).AEQbTJ()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC3255AiW abstractC3255AiW, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC3255AiW, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC3255AiW instanceof AbstractC3255AiW.ActionBar) {
            byteBuffer.putInt(1);
        } else if (abstractC3255AiW instanceof AbstractC3255AiW.StateListAnimator) {
            byteBuffer.putInt(2);
        } else if (abstractC3255AiW instanceof AbstractC3255AiW.TaskDescription) {
            byteBuffer.putInt(3);
        } else if (abstractC3255AiW instanceof AbstractC3255AiW.Application) {
            byteBuffer.putInt(4);
        } else {
            if (!(abstractC3255AiW instanceof AbstractC3255AiW.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(5);
            FfiConverterString.INSTANCE.write(((AbstractC3255AiW.Activity) abstractC3255AiW).AEQbTJ(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
