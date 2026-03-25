package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC3116Afq;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeSubAccountEvent implements FfiConverterRustBuffer<AbstractC3116Afq> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSubAccountEvent INSTANCE = new FfiConverterTypeSubAccountEvent();

    private FfiConverterTypeSubAccountEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC3116Afq lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC3116Afq) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC3116Afq liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC3116Afq) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC3116Afq abstractC3116Afq) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC3116Afq);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC3116Afq abstractC3116Afq) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC3116Afq);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC3116Afq read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new AbstractC3116Afq.ActionBar(FfiConverterTypeAccountNetworkState.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return new AbstractC3116Afq.StateListAnimator(FfiConverterTypeCreateSubAccountStep.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC3116Afq abstractC3116Afq) {
        Intrinsics.checkNotNullParameter(abstractC3116Afq, "");
        if (abstractC3116Afq instanceof AbstractC3116Afq.ActionBar) {
            return C56396yDv.copydefault(FfiConverterTypeAccountNetworkState.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC3116Afq.ActionBar) abstractC3116Afq).KWHzl()) + 4);
        }
        if (!(abstractC3116Afq instanceof AbstractC3116Afq.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterTypeCreateSubAccountStep.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC3116Afq.StateListAnimator) abstractC3116Afq).AEQbTJ()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC3116Afq abstractC3116Afq, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC3116Afq, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC3116Afq instanceof AbstractC3116Afq.ActionBar) {
            byteBuffer.putInt(1);
            FfiConverterTypeAccountNetworkState.INSTANCE.write(((AbstractC3116Afq.ActionBar) abstractC3116Afq).KWHzl(), byteBuffer);
        } else {
            if (!(abstractC3116Afq instanceof AbstractC3116Afq.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(2);
            FfiConverterTypeCreateSubAccountStep.INSTANCE.write(((AbstractC3116Afq.StateListAnimator) abstractC3116Afq).AEQbTJ(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
