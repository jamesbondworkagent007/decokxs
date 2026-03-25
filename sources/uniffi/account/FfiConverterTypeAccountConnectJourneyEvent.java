package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC60225zyi;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeAccountConnectJourneyEvent implements FfiConverterRustBuffer<AbstractC60225zyi> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAccountConnectJourneyEvent INSTANCE = new FfiConverterTypeAccountConnectJourneyEvent();

    private FfiConverterTypeAccountConnectJourneyEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC60225zyi lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC60225zyi) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC60225zyi liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC60225zyi) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC60225zyi abstractC60225zyi) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC60225zyi);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC60225zyi abstractC60225zyi) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC60225zyi);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC60225zyi read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new AbstractC60225zyi.StateListAnimator(FfiConverterTypeAccountConnectStep.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return new AbstractC60225zyi.ActionBar(FfiConverterTypeAccountConnectState.INSTANCE.read(byteBuffer));
        }
        if (i == 3) {
            return new AbstractC60225zyi.Application(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC60225zyi abstractC60225zyi) {
        Intrinsics.checkNotNullParameter(abstractC60225zyi, "");
        if (abstractC60225zyi instanceof AbstractC60225zyi.StateListAnimator) {
            return C56396yDv.copydefault(FfiConverterTypeAccountConnectStep.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC60225zyi.StateListAnimator) abstractC60225zyi).copydefault()) + 4);
        }
        if (abstractC60225zyi instanceof AbstractC60225zyi.ActionBar) {
            return C56396yDv.copydefault(FfiConverterTypeAccountConnectState.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC60225zyi.ActionBar) abstractC60225zyi).EZpvd()) + 4);
        }
        if (!(abstractC60225zyi instanceof AbstractC60225zyi.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC60225zyi.Application) abstractC60225zyi).OLrzqt()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC60225zyi abstractC60225zyi, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC60225zyi, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC60225zyi instanceof AbstractC60225zyi.StateListAnimator) {
            byteBuffer.putInt(1);
            FfiConverterTypeAccountConnectStep.INSTANCE.write(((AbstractC60225zyi.StateListAnimator) abstractC60225zyi).copydefault(), byteBuffer);
        } else if (abstractC60225zyi instanceof AbstractC60225zyi.ActionBar) {
            byteBuffer.putInt(2);
            FfiConverterTypeAccountConnectState.INSTANCE.write(((AbstractC60225zyi.ActionBar) abstractC60225zyi).EZpvd(), byteBuffer);
        } else {
            if (!(abstractC60225zyi instanceof AbstractC60225zyi.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(3);
            FfiConverterString.INSTANCE.write(((AbstractC60225zyi.Application) abstractC60225zyi).OLrzqt(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
