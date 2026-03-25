package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC3229Ahx;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeUploadIdEvent implements FfiConverterRustBuffer<AbstractC3229Ahx> {
    public static final int $stable = 0;
    public static final FfiConverterTypeUploadIdEvent INSTANCE = new FfiConverterTypeUploadIdEvent();

    private FfiConverterTypeUploadIdEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC3229Ahx lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC3229Ahx) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC3229Ahx liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC3229Ahx) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC3229Ahx abstractC3229Ahx) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC3229Ahx);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC3229Ahx abstractC3229Ahx) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC3229Ahx);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC3229Ahx read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new AbstractC3229Ahx.ActionBar(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
        }
        if (i == 2) {
            return new AbstractC3229Ahx.TaskDescription(FfiConverterOptionalString.INSTANCE.read(byteBuffer));
        }
        if (i == 3) {
            return new AbstractC3229Ahx.Application(FfiConverterOptionalString.INSTANCE.read(byteBuffer));
        }
        if (i == 4) {
            return new AbstractC3229Ahx.Activity(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC3229Ahx abstractC3229Ahx) {
        Intrinsics.checkNotNullParameter(abstractC3229Ahx, "");
        if (abstractC3229Ahx instanceof AbstractC3229Ahx.ActionBar) {
            return C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(((AbstractC3229Ahx.ActionBar) abstractC3229Ahx).copydefault()) + 4);
        }
        if (abstractC3229Ahx instanceof AbstractC3229Ahx.TaskDescription) {
            return C56396yDv.copydefault(FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC3229Ahx.TaskDescription) abstractC3229Ahx).OLrzqt()) + 4);
        }
        if (abstractC3229Ahx instanceof AbstractC3229Ahx.Application) {
            return C56396yDv.copydefault(FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC3229Ahx.Application) abstractC3229Ahx).KWHzl()) + 4);
        }
        if (!(abstractC3229Ahx instanceof AbstractC3229Ahx.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC3229Ahx.Activity) abstractC3229Ahx).EZpvd()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC3229Ahx abstractC3229Ahx, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC3229Ahx, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC3229Ahx instanceof AbstractC3229Ahx.ActionBar) {
            byteBuffer.putInt(1);
            FfiConverterBoolean.INSTANCE.write(((AbstractC3229Ahx.ActionBar) abstractC3229Ahx).copydefault(), byteBuffer);
        } else if (abstractC3229Ahx instanceof AbstractC3229Ahx.TaskDescription) {
            byteBuffer.putInt(2);
            FfiConverterOptionalString.INSTANCE.write(((AbstractC3229Ahx.TaskDescription) abstractC3229Ahx).OLrzqt(), byteBuffer);
        } else if (abstractC3229Ahx instanceof AbstractC3229Ahx.Application) {
            byteBuffer.putInt(3);
            FfiConverterOptionalString.INSTANCE.write(((AbstractC3229Ahx.Application) abstractC3229Ahx).KWHzl(), byteBuffer);
        } else {
            if (!(abstractC3229Ahx instanceof AbstractC3229Ahx.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(4);
            FfiConverterString.INSTANCE.write(((AbstractC3229Ahx.Activity) abstractC3229Ahx).EZpvd(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
