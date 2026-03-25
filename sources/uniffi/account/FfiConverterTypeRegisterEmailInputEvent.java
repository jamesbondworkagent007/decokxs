package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC2863AbB;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeRegisterEmailInputEvent implements FfiConverterRustBuffer<AbstractC2863AbB> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegisterEmailInputEvent INSTANCE = new FfiConverterTypeRegisterEmailInputEvent();

    private FfiConverterTypeRegisterEmailInputEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC2863AbB lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC2863AbB) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC2863AbB liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC2863AbB) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC2863AbB abstractC2863AbB) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC2863AbB);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC2863AbB abstractC2863AbB) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC2863AbB);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC2863AbB read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new AbstractC2863AbB.StateListAnimator(FfiConverterTypeAccountNetworkState.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return new AbstractC2863AbB.ActionBar(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 3) {
            return new AbstractC2863AbB.Application(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 4) {
            return new AbstractC2863AbB.TaskDescription(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 5) {
            return new AbstractC2863AbB.Activity(FfiConverterTypeLoginNameResult.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC2863AbB abstractC2863AbB) {
        Intrinsics.checkNotNullParameter(abstractC2863AbB, "");
        if (abstractC2863AbB instanceof AbstractC2863AbB.StateListAnimator) {
            return C56396yDv.copydefault(FfiConverterTypeAccountNetworkState.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC2863AbB.StateListAnimator) abstractC2863AbB).AEQbTJ()) + 4);
        }
        if (abstractC2863AbB instanceof AbstractC2863AbB.ActionBar) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC2863AbB.ActionBar) abstractC2863AbB).KWHzl()) + 4);
        }
        if (abstractC2863AbB instanceof AbstractC2863AbB.Application) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC2863AbB.Application) abstractC2863AbB).copydefault()) + 4);
        }
        if (abstractC2863AbB instanceof AbstractC2863AbB.TaskDescription) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC2863AbB.TaskDescription) abstractC2863AbB).KWHzl()) + 4);
        }
        if (!(abstractC2863AbB instanceof AbstractC2863AbB.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterTypeLoginNameResult.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC2863AbB.Activity) abstractC2863AbB).copydefault()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC2863AbB abstractC2863AbB, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC2863AbB, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC2863AbB instanceof AbstractC2863AbB.StateListAnimator) {
            byteBuffer.putInt(1);
            FfiConverterTypeAccountNetworkState.INSTANCE.write(((AbstractC2863AbB.StateListAnimator) abstractC2863AbB).AEQbTJ(), byteBuffer);
        } else if (abstractC2863AbB instanceof AbstractC2863AbB.ActionBar) {
            byteBuffer.putInt(2);
            FfiConverterString.INSTANCE.write(((AbstractC2863AbB.ActionBar) abstractC2863AbB).KWHzl(), byteBuffer);
        } else if (abstractC2863AbB instanceof AbstractC2863AbB.Application) {
            byteBuffer.putInt(3);
            FfiConverterString.INSTANCE.write(((AbstractC2863AbB.Application) abstractC2863AbB).copydefault(), byteBuffer);
        } else if (abstractC2863AbB instanceof AbstractC2863AbB.TaskDescription) {
            byteBuffer.putInt(4);
            FfiConverterString.INSTANCE.write(((AbstractC2863AbB.TaskDescription) abstractC2863AbB).KWHzl(), byteBuffer);
        } else {
            if (!(abstractC2863AbB instanceof AbstractC2863AbB.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(5);
            FfiConverterTypeLoginNameResult.INSTANCE.write(((AbstractC2863AbB.Activity) abstractC2863AbB).copydefault(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
