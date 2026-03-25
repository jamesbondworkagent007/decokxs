package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58948zVk;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypePasskeyActionResult implements FfiConverterRustBuffer<AbstractC58948zVk> {
    public static final int $stable = 0;
    public static final FfiConverterTypePasskeyActionResult INSTANCE = new FfiConverterTypePasskeyActionResult();

    private FfiConverterTypePasskeyActionResult() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC58948zVk lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58948zVk) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58948zVk liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58948zVk) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC58948zVk abstractC58948zVk) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC58948zVk);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC58948zVk abstractC58948zVk) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC58948zVk);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58948zVk read(@NotNull ByteBuffer byteBuffer) {
        AbstractC58948zVk application;
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            application = new AbstractC58948zVk.Application(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
        } else {
            if (i != 2) {
                if (i == 3) {
                    return AbstractC58948zVk.Activity.INSTANCE;
                }
                if (i == 4) {
                    return AbstractC58948zVk.ActionBar.INSTANCE;
                }
                if (i == 5) {
                    return AbstractC58948zVk.TaskDescription.INSTANCE;
                }
                throw new RuntimeException("invalid enum value, something is very wrong!!");
            }
            application = new AbstractC58948zVk.StateListAnimator(FfiConverterTypePasskeyOperationType.INSTANCE.read(byteBuffer));
        }
        return application;
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC58948zVk abstractC58948zVk) {
        Intrinsics.checkNotNullParameter(abstractC58948zVk, "");
        if (abstractC58948zVk instanceof AbstractC58948zVk.Application) {
            return C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(((AbstractC58948zVk.Application) abstractC58948zVk).copydefault()) + 4);
        }
        if (abstractC58948zVk instanceof AbstractC58948zVk.StateListAnimator) {
            return C56396yDv.copydefault(FfiConverterTypePasskeyOperationType.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58948zVk.StateListAnimator) abstractC58948zVk).KWHzl()) + 4);
        }
        if ((abstractC58948zVk instanceof AbstractC58948zVk.Activity) || (abstractC58948zVk instanceof AbstractC58948zVk.ActionBar) || (abstractC58948zVk instanceof AbstractC58948zVk.TaskDescription)) {
            return 4L;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC58948zVk abstractC58948zVk, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC58948zVk, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC58948zVk instanceof AbstractC58948zVk.Application) {
            byteBuffer.putInt(1);
            FfiConverterBoolean.INSTANCE.write(((AbstractC58948zVk.Application) abstractC58948zVk).copydefault(), byteBuffer);
        } else if (abstractC58948zVk instanceof AbstractC58948zVk.StateListAnimator) {
            byteBuffer.putInt(2);
            FfiConverterTypePasskeyOperationType.INSTANCE.write(((AbstractC58948zVk.StateListAnimator) abstractC58948zVk).KWHzl(), byteBuffer);
        } else if (abstractC58948zVk instanceof AbstractC58948zVk.Activity) {
            byteBuffer.putInt(3);
        } else if (abstractC58948zVk instanceof AbstractC58948zVk.ActionBar) {
            byteBuffer.putInt(4);
        } else {
            if (!(abstractC58948zVk instanceof AbstractC58948zVk.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(5);
        }
        Unit unit = Unit.INSTANCE;
    }
}
