package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58476zDu;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;
import uniffi.user.FfiConverterTypeCoreUser;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeLoginJourneyStep implements FfiConverterRustBuffer<AbstractC58476zDu> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLoginJourneyStep INSTANCE = new FfiConverterTypeLoginJourneyStep();

    private FfiConverterTypeLoginJourneyStep() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC58476zDu lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58476zDu) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58476zDu liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58476zDu) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC58476zDu abstractC58476zDu) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC58476zDu);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC58476zDu abstractC58476zDu) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC58476zDu);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58476zDu read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new AbstractC58476zDu.ActionBar(FfiConverterTypeLoginNextStep.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return new AbstractC58476zDu.Application(FfiConverterTypeCoreUser.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC58476zDu abstractC58476zDu) {
        Intrinsics.checkNotNullParameter(abstractC58476zDu, "");
        if (abstractC58476zDu instanceof AbstractC58476zDu.ActionBar) {
            return C56396yDv.copydefault(FfiConverterTypeLoginNextStep.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58476zDu.ActionBar) abstractC58476zDu).KWHzl()) + 4);
        }
        if (!(abstractC58476zDu instanceof AbstractC58476zDu.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterTypeCoreUser.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58476zDu.Application) abstractC58476zDu).KWHzl()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC58476zDu abstractC58476zDu, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC58476zDu, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC58476zDu instanceof AbstractC58476zDu.ActionBar) {
            byteBuffer.putInt(1);
            FfiConverterTypeLoginNextStep.INSTANCE.write(((AbstractC58476zDu.ActionBar) abstractC58476zDu).KWHzl(), byteBuffer);
        } else {
            if (!(abstractC58476zDu instanceof AbstractC58476zDu.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(2);
            FfiConverterTypeCoreUser.INSTANCE.write(((AbstractC58476zDu.Application) abstractC58476zDu).KWHzl(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
