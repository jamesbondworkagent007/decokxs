package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC3057Aek;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeRegisterStep implements FfiConverterRustBuffer<AbstractC3057Aek> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegisterStep INSTANCE = new FfiConverterTypeRegisterStep();

    private FfiConverterTypeRegisterStep() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC3057Aek lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC3057Aek) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC3057Aek liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC3057Aek) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC3057Aek abstractC3057Aek) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC3057Aek);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC3057Aek abstractC3057Aek) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC3057Aek);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC3057Aek read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        switch (byteBuffer.getInt()) {
            case 1:
                return AbstractC3057Aek.Application.INSTANCE;
            case 2:
                return AbstractC3057Aek.ActionBar.INSTANCE;
            case 3:
                return AbstractC3057Aek.TaskDescription.INSTANCE;
            case 4:
                return AbstractC3057Aek.Fragment.INSTANCE;
            case 5:
                return AbstractC3057Aek.PendingIntent.INSTANCE;
            case 6:
                return AbstractC3057Aek.Activity.INSTANCE;
            case 7:
                return new AbstractC3057Aek.StateListAnimator(FfiConverterTypeLoginRegisterResult.INSTANCE.read(byteBuffer));
            default:
                throw new RuntimeException("invalid enum value, something is very wrong!!");
        }
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC3057Aek abstractC3057Aek) {
        Intrinsics.checkNotNullParameter(abstractC3057Aek, "");
        if ((abstractC3057Aek instanceof AbstractC3057Aek.Application) || (abstractC3057Aek instanceof AbstractC3057Aek.ActionBar) || (abstractC3057Aek instanceof AbstractC3057Aek.TaskDescription) || (abstractC3057Aek instanceof AbstractC3057Aek.Fragment) || (abstractC3057Aek instanceof AbstractC3057Aek.PendingIntent) || (abstractC3057Aek instanceof AbstractC3057Aek.Activity)) {
            return 4L;
        }
        if (!(abstractC3057Aek instanceof AbstractC3057Aek.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterTypeLoginRegisterResult.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC3057Aek.StateListAnimator) abstractC3057Aek).OLrzqt()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC3057Aek abstractC3057Aek, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC3057Aek, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC3057Aek instanceof AbstractC3057Aek.Application) {
            byteBuffer.putInt(1);
        } else if (abstractC3057Aek instanceof AbstractC3057Aek.ActionBar) {
            byteBuffer.putInt(2);
        } else if (abstractC3057Aek instanceof AbstractC3057Aek.TaskDescription) {
            byteBuffer.putInt(3);
        } else if (abstractC3057Aek instanceof AbstractC3057Aek.Fragment) {
            byteBuffer.putInt(4);
        } else if (abstractC3057Aek instanceof AbstractC3057Aek.PendingIntent) {
            byteBuffer.putInt(5);
        } else if (abstractC3057Aek instanceof AbstractC3057Aek.Activity) {
            byteBuffer.putInt(6);
        } else {
            if (!(abstractC3057Aek instanceof AbstractC3057Aek.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(7);
            FfiConverterTypeLoginRegisterResult.INSTANCE.write(((AbstractC3057Aek.StateListAnimator) abstractC3057Aek).OLrzqt(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
