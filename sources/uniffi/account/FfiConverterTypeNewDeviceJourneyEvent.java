package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zLI;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceJourneyEvent implements FfiConverterRustBuffer<zLI> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceJourneyEvent INSTANCE = new FfiConverterTypeNewDeviceJourneyEvent();

    private FfiConverterTypeNewDeviceJourneyEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zLI lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zLI) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zLI liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zLI) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zLI zli) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zli);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zLI zli) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zli);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zLI read(@NotNull ByteBuffer byteBuffer) {
        zLI actionBar;
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            actionBar = new zLI.ActionBar(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
        } else {
            if (i != 2) {
                if (i == 3) {
                    return zLI.Application.INSTANCE;
                }
                throw new RuntimeException("invalid enum value, something is very wrong!!");
            }
            actionBar = new zLI.Activity(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        return actionBar;
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zLI zli) {
        Intrinsics.checkNotNullParameter(zli, "");
        if (zli instanceof zLI.ActionBar) {
            return C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(((zLI.ActionBar) zli).copydefault()) + 4);
        }
        if (zli instanceof zLI.Activity) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zLI.Activity) zli).OLrzqt()) + 4);
        }
        if (zli instanceof zLI.Application) {
            return 4L;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zLI zli, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zli, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (zli instanceof zLI.ActionBar) {
            byteBuffer.putInt(1);
            FfiConverterBoolean.INSTANCE.write(((zLI.ActionBar) zli).copydefault(), byteBuffer);
        } else if (zli instanceof zLI.Activity) {
            byteBuffer.putInt(2);
            FfiConverterString.INSTANCE.write(((zLI.Activity) zli).OLrzqt(), byteBuffer);
        } else {
            if (!(zli instanceof zLI.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(3);
        }
        Unit unit = Unit.INSTANCE;
    }
}
