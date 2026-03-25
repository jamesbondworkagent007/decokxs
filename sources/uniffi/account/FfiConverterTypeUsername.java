package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC3251AiS;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeUsername implements FfiConverterRustBuffer<AbstractC3251AiS> {
    public static final int $stable = 0;
    public static final FfiConverterTypeUsername INSTANCE = new FfiConverterTypeUsername();

    private FfiConverterTypeUsername() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC3251AiS lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC3251AiS) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC3251AiS liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC3251AiS) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC3251AiS abstractC3251AiS) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC3251AiS);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC3251AiS abstractC3251AiS) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC3251AiS);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC3251AiS read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new AbstractC3251AiS.ActionBar(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            return new AbstractC3251AiS.TaskDescription(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC3251AiS abstractC3251AiS) {
        Intrinsics.checkNotNullParameter(abstractC3251AiS, "");
        if (abstractC3251AiS instanceof AbstractC3251AiS.ActionBar) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC3251AiS.ActionBar) abstractC3251AiS).AEQbTJ()) + 4);
        }
        if (!(abstractC3251AiS instanceof AbstractC3251AiS.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        AbstractC3251AiS.TaskDescription taskDescription = (AbstractC3251AiS.TaskDescription) abstractC3251AiS;
        return C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(taskDescription.EZpvd()) + 4) + ffiConverterString.mo9529allocationSizeI7RO_PI(taskDescription.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC3251AiS abstractC3251AiS, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC3251AiS, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC3251AiS instanceof AbstractC3251AiS.ActionBar) {
            byteBuffer.putInt(1);
            FfiConverterString.INSTANCE.write(((AbstractC3251AiS.ActionBar) abstractC3251AiS).AEQbTJ(), byteBuffer);
        } else {
            if (!(abstractC3251AiS instanceof AbstractC3251AiS.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(2);
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            AbstractC3251AiS.TaskDescription taskDescription = (AbstractC3251AiS.TaskDescription) abstractC3251AiS;
            ffiConverterString.write(taskDescription.EZpvd(), byteBuffer);
            ffiConverterString.write(taskDescription.AEQbTJ(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
