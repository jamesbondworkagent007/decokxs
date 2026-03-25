package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58583zHt;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeMfaSwitchMethodEvent implements FfiConverterRustBuffer<AbstractC58583zHt> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMfaSwitchMethodEvent INSTANCE = new FfiConverterTypeMfaSwitchMethodEvent();

    private FfiConverterTypeMfaSwitchMethodEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC58583zHt lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58583zHt) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58583zHt liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58583zHt) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC58583zHt abstractC58583zHt) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC58583zHt);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC58583zHt abstractC58583zHt) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC58583zHt);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58583zHt read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new AbstractC58583zHt.StateListAnimator(FfiConverterTypeMfaSwitchMethodItem.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return new AbstractC58583zHt.Activity(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC58583zHt abstractC58583zHt) {
        Intrinsics.checkNotNullParameter(abstractC58583zHt, "");
        if (abstractC58583zHt instanceof AbstractC58583zHt.StateListAnimator) {
            return C56396yDv.copydefault(FfiConverterTypeMfaSwitchMethodItem.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58583zHt.StateListAnimator) abstractC58583zHt).OLrzqt()) + 4);
        }
        if (!(abstractC58583zHt instanceof AbstractC58583zHt.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58583zHt.Activity) abstractC58583zHt).EZpvd()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC58583zHt abstractC58583zHt, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC58583zHt, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC58583zHt instanceof AbstractC58583zHt.StateListAnimator) {
            byteBuffer.putInt(1);
            FfiConverterTypeMfaSwitchMethodItem.INSTANCE.write(((AbstractC58583zHt.StateListAnimator) abstractC58583zHt).OLrzqt(), byteBuffer);
        } else {
            if (!(abstractC58583zHt instanceof AbstractC58583zHt.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(2);
            FfiConverterString.INSTANCE.write(((AbstractC58583zHt.Activity) abstractC58583zHt).EZpvd(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
