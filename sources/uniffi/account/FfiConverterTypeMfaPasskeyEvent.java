package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58540zGd;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeMfaPasskeyEvent implements FfiConverterRustBuffer<AbstractC58540zGd> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMfaPasskeyEvent INSTANCE = new FfiConverterTypeMfaPasskeyEvent();

    private FfiConverterTypeMfaPasskeyEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC58540zGd lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58540zGd) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58540zGd liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58540zGd) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC58540zGd abstractC58540zGd) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC58540zGd);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC58540zGd abstractC58540zGd) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC58540zGd);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58540zGd read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new AbstractC58540zGd.TaskDescription(FfiConverterTypeAccountNetworkState.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return new AbstractC58540zGd.StateListAnimator(FfiConverterTypePasskeyAssertionParam.INSTANCE.read(byteBuffer));
        }
        if (i == 3) {
            return new AbstractC58540zGd.ActionBar(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 4) {
            return AbstractC58540zGd.Activity.INSTANCE;
        }
        if (i == 5) {
            return new AbstractC58540zGd.Application(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC58540zGd abstractC58540zGd) {
        Intrinsics.checkNotNullParameter(abstractC58540zGd, "");
        if (abstractC58540zGd instanceof AbstractC58540zGd.TaskDescription) {
            return C56396yDv.copydefault(FfiConverterTypeAccountNetworkState.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58540zGd.TaskDescription) abstractC58540zGd).AEQbTJ()) + 4);
        }
        if (abstractC58540zGd instanceof AbstractC58540zGd.StateListAnimator) {
            return C56396yDv.copydefault(FfiConverterTypePasskeyAssertionParam.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58540zGd.StateListAnimator) abstractC58540zGd).OLrzqt()) + 4);
        }
        if (abstractC58540zGd instanceof AbstractC58540zGd.ActionBar) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58540zGd.ActionBar) abstractC58540zGd).copydefault()) + 4);
        }
        if (abstractC58540zGd instanceof AbstractC58540zGd.Activity) {
            return 4L;
        }
        if (!(abstractC58540zGd instanceof AbstractC58540zGd.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58540zGd.Application) abstractC58540zGd).EZpvd()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC58540zGd abstractC58540zGd, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC58540zGd, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC58540zGd instanceof AbstractC58540zGd.TaskDescription) {
            byteBuffer.putInt(1);
            FfiConverterTypeAccountNetworkState.INSTANCE.write(((AbstractC58540zGd.TaskDescription) abstractC58540zGd).AEQbTJ(), byteBuffer);
        } else if (abstractC58540zGd instanceof AbstractC58540zGd.StateListAnimator) {
            byteBuffer.putInt(2);
            FfiConverterTypePasskeyAssertionParam.INSTANCE.write(((AbstractC58540zGd.StateListAnimator) abstractC58540zGd).OLrzqt(), byteBuffer);
        } else if (abstractC58540zGd instanceof AbstractC58540zGd.ActionBar) {
            byteBuffer.putInt(3);
            FfiConverterString.INSTANCE.write(((AbstractC58540zGd.ActionBar) abstractC58540zGd).copydefault(), byteBuffer);
        } else if (abstractC58540zGd instanceof AbstractC58540zGd.Activity) {
            byteBuffer.putInt(4);
        } else {
            if (!(abstractC58540zGd instanceof AbstractC58540zGd.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(5);
            FfiConverterString.INSTANCE.write(((AbstractC58540zGd.Application) abstractC58540zGd).EZpvd(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
