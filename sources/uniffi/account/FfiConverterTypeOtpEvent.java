package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58930zUs;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOtpEvent implements FfiConverterRustBuffer<AbstractC58930zUs> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOtpEvent INSTANCE = new FfiConverterTypeOtpEvent();

    private FfiConverterTypeOtpEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC58930zUs lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58930zUs) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58930zUs liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58930zUs) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC58930zUs abstractC58930zUs) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC58930zUs);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC58930zUs abstractC58930zUs) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC58930zUs);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58930zUs read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new AbstractC58930zUs.TaskDescription(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
        }
        if (i == 2) {
            return new AbstractC58930zUs.Activity(FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 3) {
            return new AbstractC58930zUs.ActionBar(FfiConverterLong.INSTANCE.read(byteBuffer).longValue());
        }
        if (i == 4) {
            return new AbstractC58930zUs.StateListAnimator(FfiConverterTypeOtpType.INSTANCE.read(byteBuffer));
        }
        if (i == 5) {
            return new AbstractC58930zUs.Application(FfiConverterTypeOtpType.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC58930zUs abstractC58930zUs) {
        Intrinsics.checkNotNullParameter(abstractC58930zUs, "");
        if (abstractC58930zUs instanceof AbstractC58930zUs.TaskDescription) {
            return C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(((AbstractC58930zUs.TaskDescription) abstractC58930zUs).OLrzqt()) + 4);
        }
        if (abstractC58930zUs instanceof AbstractC58930zUs.Activity) {
            AbstractC58930zUs.Activity activity = (AbstractC58930zUs.Activity) abstractC58930zUs;
            return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(activity.EZpvd()) + 4) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(activity.AEQbTJ()));
        }
        if (abstractC58930zUs instanceof AbstractC58930zUs.ActionBar) {
            return C56396yDv.copydefault(FfiConverterLong.INSTANCE.m9537allocationSizeI7RO_PI(((AbstractC58930zUs.ActionBar) abstractC58930zUs).OLrzqt()) + 4);
        }
        if (abstractC58930zUs instanceof AbstractC58930zUs.StateListAnimator) {
            return C56396yDv.copydefault(FfiConverterTypeOtpType.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58930zUs.StateListAnimator) abstractC58930zUs).KWHzl()) + 4);
        }
        if (!(abstractC58930zUs instanceof AbstractC58930zUs.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterTypeOtpType.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58930zUs.Application) abstractC58930zUs).AEQbTJ()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC58930zUs abstractC58930zUs, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC58930zUs, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC58930zUs instanceof AbstractC58930zUs.TaskDescription) {
            byteBuffer.putInt(1);
            FfiConverterBoolean.INSTANCE.write(((AbstractC58930zUs.TaskDescription) abstractC58930zUs).OLrzqt(), byteBuffer);
        } else if (abstractC58930zUs instanceof AbstractC58930zUs.Activity) {
            byteBuffer.putInt(2);
            AbstractC58930zUs.Activity activity = (AbstractC58930zUs.Activity) abstractC58930zUs;
            FfiConverterInt.INSTANCE.write(activity.EZpvd(), byteBuffer);
            FfiConverterString.INSTANCE.write(activity.AEQbTJ(), byteBuffer);
        } else if (abstractC58930zUs instanceof AbstractC58930zUs.ActionBar) {
            byteBuffer.putInt(3);
            FfiConverterLong.INSTANCE.write(((AbstractC58930zUs.ActionBar) abstractC58930zUs).OLrzqt(), byteBuffer);
        } else if (abstractC58930zUs instanceof AbstractC58930zUs.StateListAnimator) {
            byteBuffer.putInt(4);
            FfiConverterTypeOtpType.INSTANCE.write(((AbstractC58930zUs.StateListAnimator) abstractC58930zUs).KWHzl(), byteBuffer);
        } else {
            if (!(abstractC58930zUs instanceof AbstractC58930zUs.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(5);
            FfiConverterTypeOtpType.INSTANCE.write(((AbstractC58930zUs.Application) abstractC58930zUs).AEQbTJ(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
