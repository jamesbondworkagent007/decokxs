package uniffi.lifecycle;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC2726AWw;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.lifecycle.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeShortLinkInfo implements FfiConverterRustBuffer<AbstractC2726AWw> {
    public static final int $stable = 0;
    public static final FfiConverterTypeShortLinkInfo INSTANCE = new FfiConverterTypeShortLinkInfo();

    private FfiConverterTypeShortLinkInfo() {
    }

    @Override // uniffi.lifecycle.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC2726AWw lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC2726AWw) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC2726AWw liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC2726AWw) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC2726AWw abstractC2726AWw) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC2726AWw);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC2726AWw abstractC2726AWw) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC2726AWw);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC2726AWw read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new AbstractC2726AWw.ActionBar(FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterMapStringString.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return new AbstractC2726AWw.TaskDescription(FfiConverterTypeShortLinkFailureReason.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC2726AWw abstractC2726AWw) {
        Intrinsics.checkNotNullParameter(abstractC2726AWw, "");
        if (abstractC2726AWw instanceof AbstractC2726AWw.ActionBar) {
            AbstractC2726AWw.ActionBar actionBar = (AbstractC2726AWw.ActionBar) abstractC2726AWw;
            return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(actionBar.OLrzqt()) + 4) + FfiConverterMapStringString.INSTANCE.mo9529allocationSizeI7RO_PI(actionBar.AEQbTJ()));
        }
        if (!(abstractC2726AWw instanceof AbstractC2726AWw.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterTypeShortLinkFailureReason.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC2726AWw.TaskDescription) abstractC2726AWw).OLrzqt()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC2726AWw abstractC2726AWw, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC2726AWw, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC2726AWw instanceof AbstractC2726AWw.ActionBar) {
            byteBuffer.putInt(1);
            AbstractC2726AWw.ActionBar actionBar = (AbstractC2726AWw.ActionBar) abstractC2726AWw;
            FfiConverterString.INSTANCE.write(actionBar.OLrzqt(), byteBuffer);
            FfiConverterMapStringString.INSTANCE.write(actionBar.AEQbTJ(), byteBuffer);
        } else {
            if (!(abstractC2726AWw instanceof AbstractC2726AWw.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(2);
            FfiConverterTypeShortLinkFailureReason.INSTANCE.write(((AbstractC2726AWw.TaskDescription) abstractC2726AWw).OLrzqt(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
