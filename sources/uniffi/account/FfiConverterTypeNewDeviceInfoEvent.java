package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zKU;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceInfoEvent implements FfiConverterRustBuffer<zKU> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceInfoEvent INSTANCE = new FfiConverterTypeNewDeviceInfoEvent();

    private FfiConverterTypeNewDeviceInfoEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zKU lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zKU) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zKU liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zKU) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zKU zku) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zku);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zKU zku) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zku);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zKU read(@NotNull ByteBuffer byteBuffer) {
        zKU stateListAnimator;
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new zKU.ActionBar(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
        }
        if (i == 2) {
            stateListAnimator = new zKU.StateListAnimator(FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), FfiConverterString.INSTANCE.read(byteBuffer));
        } else {
            if (i != 3) {
                if (i == 4) {
                    return zKU.Activity.INSTANCE;
                }
                if (i == 5) {
                    return zKU.TaskDescription.INSTANCE;
                }
                throw new RuntimeException("invalid enum value, something is very wrong!!");
            }
            stateListAnimator = new zKU.Application(FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), FfiConverterString.INSTANCE.read(byteBuffer));
        }
        return stateListAnimator;
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zKU zku) {
        Intrinsics.checkNotNullParameter(zku, "");
        if (zku instanceof zKU.ActionBar) {
            return C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(((zKU.ActionBar) zku).EZpvd()) + 4);
        }
        if (zku instanceof zKU.StateListAnimator) {
            zKU.StateListAnimator stateListAnimator = (zKU.StateListAnimator) zku;
            return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(stateListAnimator.EZpvd()) + 4) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(stateListAnimator.AEQbTJ()));
        }
        if (zku instanceof zKU.Application) {
            zKU.Application application = (zKU.Application) zku;
            return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(application.OLrzqt()) + 4) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(application.KWHzl()));
        }
        if ((zku instanceof zKU.Activity) || (zku instanceof zKU.TaskDescription)) {
            return 4L;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zKU zku, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zku, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (zku instanceof zKU.ActionBar) {
            byteBuffer.putInt(1);
            FfiConverterBoolean.INSTANCE.write(((zKU.ActionBar) zku).EZpvd(), byteBuffer);
        } else if (zku instanceof zKU.StateListAnimator) {
            byteBuffer.putInt(2);
            zKU.StateListAnimator stateListAnimator = (zKU.StateListAnimator) zku;
            FfiConverterInt.INSTANCE.write(stateListAnimator.EZpvd(), byteBuffer);
            FfiConverterString.INSTANCE.write(stateListAnimator.AEQbTJ(), byteBuffer);
        } else if (zku instanceof zKU.Application) {
            byteBuffer.putInt(3);
            zKU.Application application = (zKU.Application) zku;
            FfiConverterInt.INSTANCE.write(application.OLrzqt(), byteBuffer);
            FfiConverterString.INSTANCE.write(application.KWHzl(), byteBuffer);
        } else if (zku instanceof zKU.Activity) {
            byteBuffer.putInt(4);
        } else {
            if (!(zku instanceof zKU.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(5);
        }
        Unit unit = Unit.INSTANCE;
    }
}
