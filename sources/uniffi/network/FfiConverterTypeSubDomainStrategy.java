package uniffi.network;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC4401Bcs;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.network.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeSubDomainStrategy implements FfiConverterRustBuffer<AbstractC4401Bcs> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSubDomainStrategy INSTANCE = new FfiConverterTypeSubDomainStrategy();

    private FfiConverterTypeSubDomainStrategy() {
    }

    @Override // uniffi.network.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC4401Bcs lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC4401Bcs) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC4401Bcs liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC4401Bcs) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC4401Bcs abstractC4401Bcs) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC4401Bcs);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC4401Bcs abstractC4401Bcs) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC4401Bcs);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC4401Bcs read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return AbstractC4401Bcs.ActionBar.INSTANCE;
        }
        if (i == 2) {
            return AbstractC4401Bcs.Activity.INSTANCE;
        }
        if (i == 3) {
            return new AbstractC4401Bcs.StateListAnimator(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC4401Bcs abstractC4401Bcs) {
        Intrinsics.checkNotNullParameter(abstractC4401Bcs, "");
        if ((abstractC4401Bcs instanceof AbstractC4401Bcs.ActionBar) || (abstractC4401Bcs instanceof AbstractC4401Bcs.Activity)) {
            return 4L;
        }
        if (!(abstractC4401Bcs instanceof AbstractC4401Bcs.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC4401Bcs.StateListAnimator) abstractC4401Bcs).EZpvd()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC4401Bcs abstractC4401Bcs, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC4401Bcs, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC4401Bcs instanceof AbstractC4401Bcs.ActionBar) {
            byteBuffer.putInt(1);
        } else if (abstractC4401Bcs instanceof AbstractC4401Bcs.Activity) {
            byteBuffer.putInt(2);
        } else {
            if (!(abstractC4401Bcs instanceof AbstractC4401Bcs.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(3);
            FfiConverterString.INSTANCE.write(((AbstractC4401Bcs.StateListAnimator) abstractC4401Bcs).EZpvd(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
