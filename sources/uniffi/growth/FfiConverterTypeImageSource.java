package uniffi.growth;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC2499AOc;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.growth.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeImageSource implements FfiConverterRustBuffer<AbstractC2499AOc> {
    public static final int $stable = 0;
    public static final FfiConverterTypeImageSource INSTANCE = new FfiConverterTypeImageSource();

    private FfiConverterTypeImageSource() {
    }

    @Override // uniffi.growth.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC2499AOc lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC2499AOc) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC2499AOc liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC2499AOc) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC2499AOc abstractC2499AOc) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC2499AOc);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC2499AOc abstractC2499AOc) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC2499AOc);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC2499AOc read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new AbstractC2499AOc.Application(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return new AbstractC2499AOc.Activity(FfiConverterInt.INSTANCE.read(byteBuffer).intValue());
        }
        if (i == 3) {
            return new AbstractC2499AOc.ActionBar(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC2499AOc abstractC2499AOc) {
        Intrinsics.checkNotNullParameter(abstractC2499AOc, "");
        if (abstractC2499AOc instanceof AbstractC2499AOc.Application) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC2499AOc.Application) abstractC2499AOc).OLrzqt()) + 4);
        }
        if (abstractC2499AOc instanceof AbstractC2499AOc.Activity) {
            return C56396yDv.copydefault(FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(((AbstractC2499AOc.Activity) abstractC2499AOc).AEQbTJ()) + 4);
        }
        if (!(abstractC2499AOc instanceof AbstractC2499AOc.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC2499AOc.ActionBar) abstractC2499AOc).OLrzqt()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC2499AOc abstractC2499AOc, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC2499AOc, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC2499AOc instanceof AbstractC2499AOc.Application) {
            byteBuffer.putInt(1);
            FfiConverterString.INSTANCE.write(((AbstractC2499AOc.Application) abstractC2499AOc).OLrzqt(), byteBuffer);
        } else if (abstractC2499AOc instanceof AbstractC2499AOc.Activity) {
            byteBuffer.putInt(2);
            FfiConverterInt.INSTANCE.write(((AbstractC2499AOc.Activity) abstractC2499AOc).AEQbTJ(), byteBuffer);
        } else {
            if (!(abstractC2499AOc instanceof AbstractC2499AOc.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(3);
            FfiConverterString.INSTANCE.write(((AbstractC2499AOc.ActionBar) abstractC2499AOc).OLrzqt(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
