package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC3252AiT;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeVerifyCodeState implements FfiConverterRustBuffer<AbstractC3252AiT> {
    public static final int $stable = 0;
    public static final FfiConverterTypeVerifyCodeState INSTANCE = new FfiConverterTypeVerifyCodeState();

    private FfiConverterTypeVerifyCodeState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC3252AiT lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC3252AiT) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC3252AiT liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC3252AiT) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC3252AiT abstractC3252AiT) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC3252AiT);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC3252AiT abstractC3252AiT) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC3252AiT);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC3252AiT read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return AbstractC3252AiT.StateListAnimator.INSTANCE;
        }
        if (i == 2) {
            return AbstractC3252AiT.Activity.INSTANCE;
        }
        if (i == 3) {
            return new AbstractC3252AiT.TaskDescription(FfiConverterTypeAccountError.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC3252AiT abstractC3252AiT) {
        Intrinsics.checkNotNullParameter(abstractC3252AiT, "");
        if ((abstractC3252AiT instanceof AbstractC3252AiT.StateListAnimator) || (abstractC3252AiT instanceof AbstractC3252AiT.Activity)) {
            return 4L;
        }
        if (!(abstractC3252AiT instanceof AbstractC3252AiT.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterTypeAccountError.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC3252AiT.TaskDescription) abstractC3252AiT).KWHzl()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC3252AiT abstractC3252AiT, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC3252AiT, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC3252AiT instanceof AbstractC3252AiT.StateListAnimator) {
            byteBuffer.putInt(1);
        } else if (abstractC3252AiT instanceof AbstractC3252AiT.Activity) {
            byteBuffer.putInt(2);
        } else {
            if (!(abstractC3252AiT instanceof AbstractC3252AiT.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(3);
            FfiConverterTypeAccountError.INSTANCE.write(((AbstractC3252AiT.TaskDescription) abstractC3252AiT).KWHzl(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
