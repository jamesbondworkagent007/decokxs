package uniffi.settings;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC4712Bof;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.settings.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeLanguageSelectEvent implements FfiConverterRustBuffer<AbstractC4712Bof> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLanguageSelectEvent INSTANCE = new FfiConverterTypeLanguageSelectEvent();

    private FfiConverterTypeLanguageSelectEvent() {
    }

    @Override // uniffi.settings.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC4712Bof lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC4712Bof) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC4712Bof liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC4712Bof) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC4712Bof abstractC4712Bof) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC4712Bof);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC4712Bof abstractC4712Bof) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC4712Bof);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC4712Bof read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return AbstractC4712Bof.TaskDescription.INSTANCE;
        }
        if (i == 2) {
            return AbstractC4712Bof.Application.INSTANCE;
        }
        if (i == 3) {
            return new AbstractC4712Bof.StateListAnimator(FfiConverterTypePreferenceCDKey.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC4712Bof abstractC4712Bof) {
        Intrinsics.checkNotNullParameter(abstractC4712Bof, "");
        if ((abstractC4712Bof instanceof AbstractC4712Bof.TaskDescription) || (abstractC4712Bof instanceof AbstractC4712Bof.Application)) {
            return 4L;
        }
        if (!(abstractC4712Bof instanceof AbstractC4712Bof.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterTypePreferenceCDKey.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC4712Bof.StateListAnimator) abstractC4712Bof).copydefault()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC4712Bof abstractC4712Bof, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC4712Bof, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC4712Bof instanceof AbstractC4712Bof.TaskDescription) {
            byteBuffer.putInt(1);
        } else if (abstractC4712Bof instanceof AbstractC4712Bof.Application) {
            byteBuffer.putInt(2);
        } else {
            if (!(abstractC4712Bof instanceof AbstractC4712Bof.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(3);
            FfiConverterTypePreferenceCDKey.INSTANCE.write(((AbstractC4712Bof.StateListAnimator) abstractC4712Bof).copydefault(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
