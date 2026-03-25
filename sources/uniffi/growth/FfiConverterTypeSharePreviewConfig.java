package uniffi.growth;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC2565AQq;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.growth.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeSharePreviewConfig implements FfiConverterRustBuffer<AbstractC2565AQq> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSharePreviewConfig INSTANCE = new FfiConverterTypeSharePreviewConfig();

    private FfiConverterTypeSharePreviewConfig() {
    }

    @Override // uniffi.growth.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC2565AQq lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC2565AQq) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC2565AQq liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC2565AQq) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC2565AQq abstractC2565AQq) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC2565AQq);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC2565AQq abstractC2565AQq) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC2565AQq);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC2565AQq read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new AbstractC2565AQq.ActionBar(FfiConverterTypeTextPreviewConfig.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return new AbstractC2565AQq.Activity(FfiConverterTypeImageDefaultPreviewConfig.INSTANCE.read(byteBuffer));
        }
        if (i == 3) {
            return new AbstractC2565AQq.TaskDescription(FfiConverterTypeImageCustomPreviewConfig.INSTANCE.read(byteBuffer));
        }
        if (i == 4) {
            return new AbstractC2565AQq.StateListAnimator(FfiConverterTypeImageCustomLuaPreviewConfig.INSTANCE.read(byteBuffer));
        }
        if (i == 5) {
            return new AbstractC2565AQq.Application(FfiConverterTypeLinkPreviewConfig.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC2565AQq abstractC2565AQq) {
        Intrinsics.checkNotNullParameter(abstractC2565AQq, "");
        if (abstractC2565AQq instanceof AbstractC2565AQq.ActionBar) {
            return C56396yDv.copydefault(FfiConverterTypeTextPreviewConfig.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC2565AQq.ActionBar) abstractC2565AQq).KWHzl()) + 4);
        }
        if (abstractC2565AQq instanceof AbstractC2565AQq.Activity) {
            return C56396yDv.copydefault(FfiConverterTypeImageDefaultPreviewConfig.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC2565AQq.Activity) abstractC2565AQq).AEQbTJ()) + 4);
        }
        if (abstractC2565AQq instanceof AbstractC2565AQq.TaskDescription) {
            return C56396yDv.copydefault(FfiConverterTypeImageCustomPreviewConfig.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC2565AQq.TaskDescription) abstractC2565AQq).AEQbTJ()) + 4);
        }
        if (abstractC2565AQq instanceof AbstractC2565AQq.StateListAnimator) {
            return C56396yDv.copydefault(FfiConverterTypeImageCustomLuaPreviewConfig.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC2565AQq.StateListAnimator) abstractC2565AQq).AEQbTJ()) + 4);
        }
        if (!(abstractC2565AQq instanceof AbstractC2565AQq.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterTypeLinkPreviewConfig.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC2565AQq.Application) abstractC2565AQq).OLrzqt()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC2565AQq abstractC2565AQq, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC2565AQq, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC2565AQq instanceof AbstractC2565AQq.ActionBar) {
            byteBuffer.putInt(1);
            FfiConverterTypeTextPreviewConfig.INSTANCE.write(((AbstractC2565AQq.ActionBar) abstractC2565AQq).KWHzl(), byteBuffer);
        } else if (abstractC2565AQq instanceof AbstractC2565AQq.Activity) {
            byteBuffer.putInt(2);
            FfiConverterTypeImageDefaultPreviewConfig.INSTANCE.write(((AbstractC2565AQq.Activity) abstractC2565AQq).AEQbTJ(), byteBuffer);
        } else if (abstractC2565AQq instanceof AbstractC2565AQq.TaskDescription) {
            byteBuffer.putInt(3);
            FfiConverterTypeImageCustomPreviewConfig.INSTANCE.write(((AbstractC2565AQq.TaskDescription) abstractC2565AQq).AEQbTJ(), byteBuffer);
        } else if (abstractC2565AQq instanceof AbstractC2565AQq.StateListAnimator) {
            byteBuffer.putInt(4);
            FfiConverterTypeImageCustomLuaPreviewConfig.INSTANCE.write(((AbstractC2565AQq.StateListAnimator) abstractC2565AQq).AEQbTJ(), byteBuffer);
        } else {
            if (!(abstractC2565AQq instanceof AbstractC2565AQq.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(5);
            FfiConverterTypeLinkPreviewConfig.INSTANCE.write(((AbstractC2565AQq.Application) abstractC2565AQq).OLrzqt(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
