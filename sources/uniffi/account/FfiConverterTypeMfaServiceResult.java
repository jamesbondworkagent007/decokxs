package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58575zHl;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeMfaServiceResult implements FfiConverterRustBuffer<AbstractC58575zHl> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMfaServiceResult INSTANCE = new FfiConverterTypeMfaServiceResult();

    private FfiConverterTypeMfaServiceResult() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC58575zHl lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58575zHl) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58575zHl liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58575zHl) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC58575zHl abstractC58575zHl) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC58575zHl);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC58575zHl abstractC58575zHl) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC58575zHl);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58575zHl read(@NotNull ByteBuffer byteBuffer) {
        AbstractC58575zHl stateListAnimator;
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            stateListAnimator = new AbstractC58575zHl.StateListAnimator(FfiConverterString.INSTANCE.read(byteBuffer));
        } else {
            if (i != 2) {
                if (i == 3) {
                    return AbstractC58575zHl.ActionBar.INSTANCE;
                }
                if (i == 4) {
                    return AbstractC58575zHl.TaskDescription.INSTANCE;
                }
                throw new RuntimeException("invalid enum value, something is very wrong!!");
            }
            stateListAnimator = new AbstractC58575zHl.Application(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        return stateListAnimator;
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC58575zHl abstractC58575zHl) {
        Intrinsics.checkNotNullParameter(abstractC58575zHl, "");
        if (abstractC58575zHl instanceof AbstractC58575zHl.StateListAnimator) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58575zHl.StateListAnimator) abstractC58575zHl).KWHzl()) + 4);
        }
        if (abstractC58575zHl instanceof AbstractC58575zHl.Application) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58575zHl.Application) abstractC58575zHl).copydefault()) + 4);
        }
        if ((abstractC58575zHl instanceof AbstractC58575zHl.ActionBar) || (abstractC58575zHl instanceof AbstractC58575zHl.TaskDescription)) {
            return 4L;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC58575zHl abstractC58575zHl, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC58575zHl, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC58575zHl instanceof AbstractC58575zHl.StateListAnimator) {
            byteBuffer.putInt(1);
            FfiConverterString.INSTANCE.write(((AbstractC58575zHl.StateListAnimator) abstractC58575zHl).KWHzl(), byteBuffer);
        } else if (abstractC58575zHl instanceof AbstractC58575zHl.Application) {
            byteBuffer.putInt(2);
            FfiConverterString.INSTANCE.write(((AbstractC58575zHl.Application) abstractC58575zHl).copydefault(), byteBuffer);
        } else if (abstractC58575zHl instanceof AbstractC58575zHl.ActionBar) {
            byteBuffer.putInt(3);
        } else {
            if (!(abstractC58575zHl instanceof AbstractC58575zHl.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(4);
        }
        Unit unit = Unit.INSTANCE;
    }
}
