package uniffi.lifecycle;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC2693AVp;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.lifecycle.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeDeeplinkResult implements FfiConverterRustBuffer<AbstractC2693AVp> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDeeplinkResult INSTANCE = new FfiConverterTypeDeeplinkResult();

    private FfiConverterTypeDeeplinkResult() {
    }

    @Override // uniffi.lifecycle.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC2693AVp lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC2693AVp) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC2693AVp liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC2693AVp) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC2693AVp abstractC2693AVp) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC2693AVp);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC2693AVp abstractC2693AVp) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC2693AVp);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC2693AVp read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return AbstractC2693AVp.StateListAnimator.INSTANCE;
        }
        if (i == 2) {
            return AbstractC2693AVp.TaskDescription.INSTANCE;
        }
        if (i == 3) {
            return new AbstractC2693AVp.Application(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC2693AVp abstractC2693AVp) {
        Intrinsics.checkNotNullParameter(abstractC2693AVp, "");
        if ((abstractC2693AVp instanceof AbstractC2693AVp.StateListAnimator) || (abstractC2693AVp instanceof AbstractC2693AVp.TaskDescription)) {
            return 4L;
        }
        if (!(abstractC2693AVp instanceof AbstractC2693AVp.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC2693AVp.Application) abstractC2693AVp).AEQbTJ()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC2693AVp abstractC2693AVp, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC2693AVp, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC2693AVp instanceof AbstractC2693AVp.StateListAnimator) {
            byteBuffer.putInt(1);
        } else if (abstractC2693AVp instanceof AbstractC2693AVp.TaskDescription) {
            byteBuffer.putInt(2);
        } else {
            if (!(abstractC2693AVp instanceof AbstractC2693AVp.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(3);
            FfiConverterString.INSTANCE.write(((AbstractC2693AVp.Application) abstractC2693AVp).AEQbTJ(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
