package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58703zMe;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceMultipleOtpEvent implements FfiConverterRustBuffer<AbstractC58703zMe> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceMultipleOtpEvent INSTANCE = new FfiConverterTypeNewDeviceMultipleOtpEvent();

    private FfiConverterTypeNewDeviceMultipleOtpEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC58703zMe lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58703zMe) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58703zMe liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58703zMe) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC58703zMe abstractC58703zMe) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC58703zMe);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC58703zMe abstractC58703zMe) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC58703zMe);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58703zMe read(@NotNull ByteBuffer byteBuffer) {
        AbstractC58703zMe application;
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            application = new AbstractC58703zMe.Application(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
        } else if (i == 2) {
            application = new AbstractC58703zMe.StateListAnimator(FfiConverterString.INSTANCE.read(byteBuffer));
        } else {
            if (i == 3) {
                return AbstractC58703zMe.Activity.INSTANCE;
            }
            if (i != 4) {
                if (i == 5) {
                    return new AbstractC58703zMe.TaskDescription(FfiConverterLong.INSTANCE.read(byteBuffer).longValue());
                }
                throw new RuntimeException("invalid enum value, something is very wrong!!");
            }
            application = new AbstractC58703zMe.ActionBar(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        return application;
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC58703zMe abstractC58703zMe) {
        Intrinsics.checkNotNullParameter(abstractC58703zMe, "");
        if (abstractC58703zMe instanceof AbstractC58703zMe.Application) {
            return C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(((AbstractC58703zMe.Application) abstractC58703zMe).AEQbTJ()) + 4);
        }
        if (abstractC58703zMe instanceof AbstractC58703zMe.StateListAnimator) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58703zMe.StateListAnimator) abstractC58703zMe).AEQbTJ()) + 4);
        }
        if (abstractC58703zMe instanceof AbstractC58703zMe.Activity) {
            return 4L;
        }
        if (abstractC58703zMe instanceof AbstractC58703zMe.ActionBar) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58703zMe.ActionBar) abstractC58703zMe).EZpvd()) + 4);
        }
        if (!(abstractC58703zMe instanceof AbstractC58703zMe.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterLong.INSTANCE.m9537allocationSizeI7RO_PI(((AbstractC58703zMe.TaskDescription) abstractC58703zMe).OLrzqt()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC58703zMe abstractC58703zMe, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC58703zMe, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC58703zMe instanceof AbstractC58703zMe.Application) {
            byteBuffer.putInt(1);
            FfiConverterBoolean.INSTANCE.write(((AbstractC58703zMe.Application) abstractC58703zMe).AEQbTJ(), byteBuffer);
        } else if (abstractC58703zMe instanceof AbstractC58703zMe.StateListAnimator) {
            byteBuffer.putInt(2);
            FfiConverterString.INSTANCE.write(((AbstractC58703zMe.StateListAnimator) abstractC58703zMe).AEQbTJ(), byteBuffer);
        } else if (abstractC58703zMe instanceof AbstractC58703zMe.Activity) {
            byteBuffer.putInt(3);
        } else if (abstractC58703zMe instanceof AbstractC58703zMe.ActionBar) {
            byteBuffer.putInt(4);
            FfiConverterString.INSTANCE.write(((AbstractC58703zMe.ActionBar) abstractC58703zMe).EZpvd(), byteBuffer);
        } else {
            if (!(abstractC58703zMe instanceof AbstractC58703zMe.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(5);
            FfiConverterLong.INSTANCE.write(((AbstractC58703zMe.TaskDescription) abstractC58703zMe).OLrzqt(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
